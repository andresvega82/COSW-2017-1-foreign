package com.eci.edu.Repository;

import com.eci.edu.entities.Student;
import org.jboss.logging.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by  on 19/03/17.
 */
//extends JpaRepository<Student, String>
public interface StudentRepository  {

    /*@Query("from Students s where s.student_id= :userId ")
    public Student getClientePorId(@Param(value = "userId")String userId);
*/
}