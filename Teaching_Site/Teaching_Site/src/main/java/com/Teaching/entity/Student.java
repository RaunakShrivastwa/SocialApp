package com.Teaching.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    private String id;

    private String fName;

    private String lName;

    @Column(unique = true)
    private String email;

    private String password;

    private String dob;

    private String number;

    private String height;

    private String weight;

    private String gender;

    private String role;


}
