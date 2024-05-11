package com.example.hotel.Person;
import jakarta.persistence.*;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;

    @Basic
    private String name;
    private String lastname;
    @Column(name = "correo",unique = true,nullable = false)
    private String correo;
    private Date fechadecreacion;
   
}
