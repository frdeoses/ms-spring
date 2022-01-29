package com.curso.spring.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
@ToString
@EqualsAndHashCode
public class Supplier {

    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String phone;

    @Getter @Setter
    private String address;

    @Getter @Setter
    private String web;

    @Getter @Setter
    private String contact;
}
