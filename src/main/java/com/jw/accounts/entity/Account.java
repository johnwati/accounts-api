package com.jw.accounts.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = true)
    private String accountNumber;

    // Getters and setters
}
