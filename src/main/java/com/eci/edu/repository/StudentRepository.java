package com.eci.edu.repository;

import com.eci.edu.entities.Student;
import com.eci.edu.entities.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by  on 19/03/17.
 */
public interface StudentRepository extends JpaRepository < Student, StudentId> {

    /*@Query("from Students s where s.student_id= :userId ")
    public Student getClientePorId(@Param(value = "userId")String userId);
*/
}