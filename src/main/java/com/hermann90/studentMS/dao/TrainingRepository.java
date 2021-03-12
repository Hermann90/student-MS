/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hermann90.studentMS.dao;

import com.hermann90.studentMS.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Hermann90
 */

@RepositoryRestResource // expose toute les mothodes de cette interface dans une api REST
public interface TrainingRepository 
        extends JpaRepository<Training, Long>{
    
}
