package Homework3_2;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pupil []pupils = new Pupil[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Введите успеваемость ученика №" + (i + 1) + "(плохая, хорошая, отличная): ");
            String academicPerformance = input.next();
            if (academicPerformance.equals("плохая")) {
                pupils[i] = new BadPupil();
            } else if (academicPerformance.equals("хорошая")) {
                pupils[i] = new GoodPupil();

            } else if (academicPerformance.equals("отличная")) {
                pupils[i] = new ExcelentPupil();

            } else {
                pupils[i] = null;
            }
        }
        ClassRoom classRoom = new ClassRoom(pupils);
        classRoom.show();
    }
}