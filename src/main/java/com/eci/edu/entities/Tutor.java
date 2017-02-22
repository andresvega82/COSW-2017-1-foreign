package com.eci.edu.entities;

/**
 * Created on 2/16/17.
 */
public class Tutor {
    private String name;
    private int age;
    private String description;
    private String idioma;

    public Tutor(){

    }

    public Tutor(String name, int age, String description, String idioma){
        this.name = name;
        this.age = age;
        this.description = description;
        this.idioma = idioma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
