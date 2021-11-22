package Homework3_2;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClassRoom[] classRoom = new ClassRoom[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Введите успеваемость ученика №" + (i + 1) + "(плохая, хорошая, отличная): ");
            String academicPerformance = input.next();
            if (academicPerformance.equals("плохая")) {
                Pupil pupil = new BadPupil();
                classRoom[i] = new ClassRoom(pupil);
            } else if (academicPerformance.equals("хорошая")) {
                Pupil pupil = new GoodPupil();
                classRoom[i] = new ClassRoom(pupil);
            } else if (academicPerformance.equals("отличная")) {
                Pupil pupil = new ExcelentPupil();
                classRoom[i] = new ClassRoom(pupil);
            } else {
                classRoom[i] = new ClassRoom(null);
            }
        }
        System.out.println("         Учеба  чтение  письмо  отдых");
        for (int i = 0; i < 4; i++) {
            System.out.print("Ученик №" + (i + 1));
            classRoom[i].show();
            System.out.print("\n");
        }
    }
}