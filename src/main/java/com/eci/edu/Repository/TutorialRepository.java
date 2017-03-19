package com.eci.edu.Repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by tata on 19/03/17.
 */
public interface TutorialRepository extends JpaRepository<String, Integer> {

}
