package Homework15_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Homework15_3 {
    public class Dog {
        public String name = "Mia";
        public int age = 2;
        public String sex = "female";

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSex() {
            return sex;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Dog(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Dog(String name) {
            this.name = name;
        }

        public Dog() {
        }
    }

    public static void main(String[] args) {
        Class dog = Dog.class;
        Field []fields = dog.getFields();
        Method []methods = dog.getMethods();
        Constructor []constructors = dog.getConstructors();
        int mods = dog.getModifiers();
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
        System.out.println("\nКонструкторы класса: ");
        for (Constructor ctr : constructors) {
            Class[] paramTypes = ctr.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
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