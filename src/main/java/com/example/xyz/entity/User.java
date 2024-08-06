package com.example.xyz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name="email")
    private String email;
    @Column(name = "photo")
    private String photo;
    @Column(name="activated")
    private int activated;
    @Column(name = "admin")
    private int admin;
    // mối quan hệ giữa user và order 1 user => nhiều order nên sẽ lưu là list
    @OneToMany(mappedBy = "user")
    private List<Order>  orders;
}
