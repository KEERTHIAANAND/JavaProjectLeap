package com.projectleap.javaproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor; //constructor with all arguments
import lombok.NoArgsConstructor; //constructor without arguments

@Entity
@Data
@AllArgsConstructor 
@NoArgsConstructor

public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //auto id generation
    private Long id;
    
    private String name;
    private String email;
    private String role; //staffs, supervisors, admins
    private String password;
}