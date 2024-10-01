package com.gestion_financiera.Model;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20)
    private String username;

    @Column(length = 30)
    private String password;

    @Column(length = 30)
    private String correo;

    @Column(length = 30)
    @Enumerated(EnumType.STRING)
    private Roles rol;



}
