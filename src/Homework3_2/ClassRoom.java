package Homework3_2;

public class ClassRoom {
    Pupil pupil = new Pupil();

    public ClassRoom(Pupil pupil) {
        this.pupil = pupil;
    }

    void show() {
        if (pupil == null) {
            System.out.print("      Ученика нету");
        } else {
            System.out.print("   ");
            pupil.study();
            System.out.print("      ");
            pupil.read();
            System.out.print("       ");
            pupil.write();
            System.out.print("      ");
            pupil.relax();
        }
    }
}