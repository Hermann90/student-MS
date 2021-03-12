/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hermann90.studentMS.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Hermann90
 */
@Entity
@Data //generate getter and setter with lombok
@AllArgsConstructor //Generate all arguments constructor
@NoArgsConstructor // Generate no argument contructor withj lombok
public class Training {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   private Long id ;
   
   private String name;
   private int duration;
   
   @OneToMany(mappedBy = "training") // this annotation means that a course contains several students
   private Collection<Student> students;
   
}
