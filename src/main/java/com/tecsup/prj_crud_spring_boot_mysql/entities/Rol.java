package com.tecsup.prj_crud_spring_boot_mysql.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String authority;

    public Rol() {}

    public Rol(String authority) {
        this.authority = authority;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAuthority() { return authority; }
    public void setAuthority(String authority) { this.authority = authority; }
}