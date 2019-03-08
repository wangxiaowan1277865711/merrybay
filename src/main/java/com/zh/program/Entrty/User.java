package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    @Column(length = 50, nullable = false)
    String name;
    @Column(length = 150, nullable = false)
    String password;
}
