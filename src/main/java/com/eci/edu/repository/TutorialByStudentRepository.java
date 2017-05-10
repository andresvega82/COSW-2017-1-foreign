package com.eci.edu.repository;

import com.eci.edu.entities.TutorialByStudent;
import com.eci.edu.entities.TutorialByStudentId;
import com.eci.edu.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by 2099340 on 5/10/17.
 */
public interface TutorialByStudentRepository extends JpaRepository<TutorialByStudent, TutorialByStudentId> {

    @Query("from Tutorials_Students as u where u.Students_student_id = :id")
    List<TutorialByStudent> getTutorialsByStudent(@Param(value="id") Integer id);
}
