package com.tecsup.prj_crud_spring_boot_mysql.services;

import com.tecsup.prj_crud_spring_boot_mysql.entities.Curso;
import com.tecsup.prj_crud_spring_boot_mysql.persistence.ICursoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private ICursoDao cursoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Curso> findAll() {
        return cursoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Curso findById(Long id) {
        return cursoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Curso save(Curso curso) {
        return cursoDao.save(curso);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        cursoDao.deleteById(id);
    }
}