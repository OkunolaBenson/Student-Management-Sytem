package com.example.student_management_system.entity;

import jakarta.persistence.*;

@Entity
// @Table annotation is used to specify a name for the database. N/B: If you don't add the @Table annotation, the name of the table will be
// the name of the class which is Student in this case.
@Table(name = "students")
public class Student {

    // @id annotation specifies the primary key of the entity
    // @GeneratedValue annotation specifies the generation strategies for the values of the primary key.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // @Column name annotation is used to specify a name for the column in the table. N/B: If you don't add a @Column annotation, the name of the
    // column will be the name of the field which is firstName in this case.
    @Column(name = "first_Name", nullable = false)
    private String firstName;

    @Column(name = "last_Name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    public Student() {

    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
