package Homework17_2;

import java.io.Serializable;

public class Animal implements Serializable {
    public String name;
    public int age;
    public String habitat;

    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}