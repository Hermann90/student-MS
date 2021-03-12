/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hermann90.studentMS.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Hermann90
 */

@Entity // JPA annotation which allows this class to be represented by a database table
@Data
@AllArgsConstructor @NoArgsConstructor //generating constructors with lombock
public class Student implements Serializable{
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id is generated with auto increment strategy
    private Long  id ;
    
    private String firstName;
    private String lastName;
    private String phone;
    private Date dateOfBirth;
    
    @ManyToOne()
    @JoinColumn(name = "ID_TRAINING")//colum name of foreing key
    private Training training;
    
}
