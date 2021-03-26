package com.hermann90.studentMS;

import com.hermann90.studentMS.dao.StudentRepository;
import com.hermann90.studentMS.dao.TrainingRepository;
import com.hermann90.studentMS.entities.Student;
import com.hermann90.studentMS.entities.Training;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class StudentMsApplication implements CommandLineRunner{

    @Autowired
    StudentRepository studentRepository;
    
    @Autowired
    TrainingRepository trainingRepository;
    
    @Autowired
    RepositoryRestConfiguration repositoryRestConfiguration;//To configure exposition of these id
    
	public static void main(String[] args) {
		SpringApplication.run(StudentMsApplication.class, args);
	}

/**
 * @file        exemple.h
 * @brief       Contient la déclaration de la classe Exemple
 * @details     La classe \c Exemple permet de montrer l'utilisation des \em tags \b Doxygen
 * @author      Thierry vaira <thierr.vaira@gmail.com>
 * @version     0.1
 * @date        2020
 * @copyright   GNU Public License.
 */
        
    @Override
    public void run(String... args) throws Exception {
        
        // expose the id of Student and Training when we display objects JSon of these class.
        repositoryRestConfiguration.exposeIdsFor(Training.class, Student.class); 
        
        Training t1 = trainingRepository.save(new Training(null, "PHP", 0, null));
                
        Training t2 = trainingRepository.save(new Training(null, "JAVA", 0, null));

        Training t3 = trainingRepository.save(new Training(null, "ORACLE", 0, null));

        studentRepository.save(new Student(null,"Chefouet","Meka",null,new Date(),t1));
        studentRepository.save(new Student(null,"Menfo","David",null,new Date(),t2));
        studentRepository.save(new Student(null,"Teletsop","Bathelemy",null,new Date(),t3));
        studentRepository.save(new Student(null,"Sosoh","Aurelien",null,new Date(),t1));
        studentRepository.save(new Student(null,"Tiomela","Borel Brice",null,new Date(),t2));
        studentRepository.save(new Student(null,"Noubissi","Nkom",null,new Date(),t3));


    }

}
