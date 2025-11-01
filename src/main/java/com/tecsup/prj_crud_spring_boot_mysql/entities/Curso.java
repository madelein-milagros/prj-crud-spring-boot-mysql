package com.tecsup.prj_crud_spring_boot_mysql.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String nombre;

    private String descripcion;

    @NotNull
    private Integer creditos;

    @NotEmpty
    private String profesor;

    public Curso() {}

    public Curso(String nombre, String descripcion, Integer creditos, String profesor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Integer getCreditos() { return creditos; }
    public void setCreditos(Integer creditos) { this.creditos = creditos; }
    public String getProfesor() { return profesor; }
    public void setProfesor(String profesor) { this.profesor = profesor; }
}