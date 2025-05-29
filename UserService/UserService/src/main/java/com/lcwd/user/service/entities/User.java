package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "micro_users")
@Data
public class User {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userID;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "ABOUT")
    private String about;
}
