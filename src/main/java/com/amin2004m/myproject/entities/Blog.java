package com.amin2004m.myproject.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "/api")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
