package com.eci.edu.controller;
import com.eci.edu.modelo.Task;
import com.eci.edu.modelo.TaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by 2099340 on 2/1/17.
 */
@RestController
@RequestMapping("/task")
public class controladorTareas {

    @Autowired
    TaskList tareas;

    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public ResponseEntity<?> taskRegister(@RequestBody  String t){
        t = t.substring(1,t.length()-1);
        //System.out.println(t+" linea despues");
        String[] tmp = t.split(",");
        //System.out.println("Numero es "+tmp[0].split(":")[1].substring(1,tmp[0].split(":")[1].length()-1));
        Task task = new Task(Integer.parseInt(""+tmp[0].split(":")[1].substring(1,tmp[0].split(":")[1].length()-1)),tmp[1].split(":")[1].substring(1,tmp[1].split(":")[1].length()-1));
        tareas.agregarTarea(task);
        return new ResponseEntity<>(0,HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public ResponseEntity<?> taskConsult(){

        return new ResponseEntity<>(tareas.getTareas().toArray(),HttpStatus.ACCEPTED);
    }


}
