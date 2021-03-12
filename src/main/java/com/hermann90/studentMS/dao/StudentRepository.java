/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hermann90.studentMS.dao;

import com.hermann90.studentMS.entities.Student;
import io.swagger.annotations.Api;
import java.util.List;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Hermann90
 */
//@Api(tags = "Tag1")
@RepositoryRestResource // expose toute les mothodes de cette interface dans une api REST
public interface StudentRepository 
        extends JpaRepository<Student, Long>{
    
    public List<Student> findByfirstNameContains(String name);
    
    //this method is same wich findByfirstNameContains. but we are use the convention
//    @Query("select p from Student s where e.firstName like x")
//    public List<Student> chercherFirst(@Param("x")String name);
}
