package com.springcourse.springcor.entity;

import jakarta.persistence.*; // updated from JDK +17 and Spring Boot 3 / Spring Framework 6
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "test_hibernate_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestHibernate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    private Integer testId;
    @Column(name = "my_name")
    private String myName;


}
