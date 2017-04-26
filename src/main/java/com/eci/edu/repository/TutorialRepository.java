package com.eci.edu.repository;

import com.eci.edu.entities.Teacher;
import com.eci.edu.entities.Tutorial;
import com.eci.edu.entities.TutorialId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by tata on 19/03/17.
 */


public interface TutorialRepository extends JpaRepository<Tutorial, TutorialId> {




    //@Query("SELECT * FROM Teacher INNER JOIN (SELECT * FROM Tutorial INNER JOIN Languaje ON Tutorial. idTutor	.LenguajeId = Languaje.lenguajeId WHERE Languaje.desciption = 'Español') AS tabla ON Teacher.users_user_id.teacher_id = tabla.idTutor.TeachersId")
    //@Query("from Teacher as tutor inner join tutor.users_user_id.teacher_id as tutorId where tutorId = (select t.idTutor.TeachersId from Tutorial as t inner join t.idTutor.LenguajeId u where u.desciption=:params)")
    //List<Teacher> getTutorialByParams(@Param(value = "params") String params);


    /*@Query("SELECT Nombre_Tutor, Apellido_Tutor, cost, Idioma, Duracion, Fecha FROM (SELECT Nombre_Tutor, Apellido_Tutor, cost, lenguaje_id, duration as Duracion, date as Fecha FROM (SELECT Teachers_teacher_id, date, duration,lenguaje_id, cost, state
    FROM Tutorials_Students AS Ts JOIN Tutorials ON Ts.Tutorials_tutorial_id=Tutorials.tutorial_id WHERE Students_student_id=idss) AS Te JOIN (SELECT teacher_id, user_id, name as Nombre_Tutor, lastName as Apellido_Tutor FROM Teachers JOIN Users ON Teachers.Users_user_id=Users.user_id) AS Tat ON Tat.teacher_id=Te.Teachers_teacher_id WHERE Te.state="agendada")
    AS NIC JOIN (SELECT len.description AS Idioma, student_id, Lenguajes_lenguaje_id AS idio FROM (SELECT * FROM Students_Lenguajes AS SL JOIN Languajes AS la  ON SL.Lenguajes_lenguaje_id=la.lenguaje_id) AS len JOIN Students AS s ON s.student_id=len.Lenguajes_lenguaje_id) AS Dos ON NIC.lenguaje_id=Dos.idio")
    public List<Tutorial> getTutorials(@Param(value ="id") int id);*/

    /*
    public List<Tutorial> getHistoryById(id);*/
}