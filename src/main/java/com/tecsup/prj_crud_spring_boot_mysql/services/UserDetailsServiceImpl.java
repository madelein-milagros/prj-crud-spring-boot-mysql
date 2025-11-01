package com.tecsup.prj_crud_spring_boot_mysql.services;

import com.tecsup.prj_crud_spring_boot_mysql.entities.Rol;
import com.tecsup.prj_crud_spring_boot_mysql.entities.Usuario;
import com.tecsup.prj_crud_spring_boot_mysql.persistence.IUsuarioDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuario = usuarioDao.findByUsername(username);

        if (usuario == null) {
            logger.error("Error en el login: no existe el usuario '" + username + "' en el sistema!");
            throw new UsernameNotFoundException("Username: " + username + " no existe en el sistema!");
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (Rol rol : usuario.getRoles()) {
            logger.info("Rol: ".concat(rol.getAuthority()));
            authorities.add(new SimpleGrantedAuthority(rol.getAuthority()));
        }

        if (authorities.isEmpty()) {
            logger.error("Error en el login: Usuario '" + username + "' no tiene roles asignados!");
            throw new UsernameNotFoundException("Error en el login: usuario '" + username + "' no tiene roles asignados!");
        }

        return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities);
    }
}