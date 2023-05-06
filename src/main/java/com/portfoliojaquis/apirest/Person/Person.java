package com.portfoliojaquis.apirest.Person;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @Basic
    private String school;
    private String title;
    private String img;
    private String career;
    private String start;
    private String end;
}
