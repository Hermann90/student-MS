/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hermann90.studentMS.interfacesUtils;
import com.hermann90.studentMS.entities.Student;
import org.springframework.data.rest.core.config.Projection;

/**
 *
 * @author hermann90
 */
@Projection(name = "p1",types = {Student.class})
public interface StudentsProjection {
    public String getFirstName();
}
