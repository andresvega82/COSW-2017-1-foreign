package com.eci.edu.repository;

import com.eci.edu.entities.Student;
import com.eci.edu.entities.User_user_id;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by  on 19/03/17.
 */
public interface StudentRepository extends JpaRepository < Student, User_user_id > {

    /*@Query("from Students s where s.student_id= :userId ")
    public Student getClientePorId(@Param(value = "userId")String userId);
*/
}