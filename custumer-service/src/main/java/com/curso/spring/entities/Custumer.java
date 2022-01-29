package com.curso.spring.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "custumers")
@ToString
@EqualsAndHashCode
public class Custumer {
    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    private String firstname;

    @Getter @Setter
    private String lastname;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String phone;

    @Getter @Setter
    private String address;


}
