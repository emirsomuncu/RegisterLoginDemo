package com.example.registrationLoginDemo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id ;

    @Size(min = 1 , message = "You need fill this area")
    @Column(name = "name")
    private String name ;

    @Size(min = 1 , message = "You need fill this area")
    @Column(name = "surname")
    private String surname ;

    @Size(min = 1 , message = "You need fill this area")
    @Column(name = "email")
    private String email ;

    @Size(min = 1 , message = "You need fill this area")
    @Column(name = "password")
    private String password ;

}
