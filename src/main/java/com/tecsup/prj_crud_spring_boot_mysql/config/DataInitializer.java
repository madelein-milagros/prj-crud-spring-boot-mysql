package com.tecsup.prj_crud_spring_boot_mysql.config;

import com.tecsup.prj_crud_spring_boot_mysql.entities.Rol;
import com.tecsup.prj_crud_spring_boot_mysql.entities.Usuario;
import com.tecsup.prj_crud_spring_boot_mysql.persistence.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        try {
            // Verificar si ya existen usuarios para evitar duplicados
            if (usuarioDao.count() == 0) {
                System.out.println("Inicializando datos de prueba...");

                // Crear roles primero
                Rol rolAdmin = new Rol("ROLE_ADMIN");
                Rol rolUser = new Rol("ROLE_USER");

                // Crear usuario admin
                Usuario admin = new Usuario();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("12345"));
                admin.setEnabled(true);
                admin.setNombre("Administrador");
                admin.setApellido("Sistema");
                admin.setEmail("admin@tecsup.edu.pe");
                admin.setRoles(Arrays.asList(rolAdmin, rolUser));
                usuarioDao.save(admin);
                System.out.println("✅ Usuario admin creado: admin/12345");

                // Crear usuario user
                Usuario user = new Usuario();
                user.setUsername("user");
                user.setPassword(passwordEncoder.encode("12345"));
                user.setEnabled(true);
                user.setNombre("Usuario");
                user.setApellido("Normal");
                user.setEmail("user@tecsup.edu.pe");
                user.setRoles(Arrays.asList(rolUser));
                usuarioDao.save(user);
                System.out.println("✅ Usuario user creado: user/12345");

                System.out.println("✅ Datos de prueba inicializados correctamente");
            } else {
                System.out.println("ℹ️ Los datos ya existen, omitiendo inicialización");
            }
        } catch (Exception e) {
            System.err.println("❌ Error durante la inicialización de datos: " + e.getMessage());
            // Continuar con la aplicación aunque falle la inicialización de datos
        }
    }
}