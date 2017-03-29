package com.eci.edu.repository;

import com.eci.edu.entities.Student;
import com.eci.edu.entities.StudentId;
import com.eci.edu.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by  on 19/03/17.
 */
public interface StudentRepository extends JpaRepository < Student, StudentId> {

    @Query("from User as u where u.email = :email")
    User getUsuario(@Param(value="email") String email);

    /*@Query("from Students s where s.student_id= :userId ")
    public Student getClientePorId(@Param(value = "userId")String userId);
*/
}