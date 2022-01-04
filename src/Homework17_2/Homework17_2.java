package Homework17_2;

import java.io.*;

public class Homework17_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fileAnimal = new File("src/Homework17_2/FileAnimal");
        Animal dog = new Animal("Пёс", 2, "home");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileAnimal));
        outputStream.writeObject(dog);
        outputStream.flush();
        outputStream.close();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileAnimal));
        Animal readAnimal = (Animal) inputStream.readObject();
        inputStream.close();
        System.out.printf("Name: %s; Age: %d; Habitat: %s;", readAnimal.name, readAnimal.age, readAnimal.habitat);
    }
}