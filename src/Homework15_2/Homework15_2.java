package Homework15_2;

import java.lang.reflect.*;
import java.util.Scanner;

public class Homework15_2 {
    public class Dog {
        public String name = "Mia";
        public int age = 2;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public class Cat {
        String name = "Boris";
        int age = 2;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public class Parrot {
        String name = "Lola";
        int age = 2;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Class dog = Dog.class;
        Class cat = Cat.class;
        Class parrot = Parrot.class;
        Field []fields;
        Method []methods;
        int mods;
        Scanner input = new Scanner(System.in);
        System.out.print("Выберете класс(Dog, Cat, Parrot): ");
        String choice = input.next();
        switch (choice) {
            case "Dog":
                fields = dog.getFields();
                methods = dog.getMethods();
                mods = dog.getModifiers();
                break;
            case "Cat":
                fields = cat.getFields();
                methods = cat.getMethods();
                mods = cat.getModifiers();
                break;
            case "Parrot":
                fields = parrot.getFields();
                methods = parrot.getMethods();
                mods = parrot.getModifiers();
                break;
            default:
                System.out.println("Вы ввели неверное название класса");
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        System.out.println("Поля класса:");
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + fieldType.getName());
        }
        System.out.println("\nМетоды класса: ");
        for (Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());
        }
        System.out.print("\nМодификаторы класса: ");
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final ");
        }
        if (Modifier.isProtected(mods)) {
            System.out.print("protected ");
        }
        if (Modifier.isPublic(mods)) {
            System.out.print("public ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static ");
        }
    }
}