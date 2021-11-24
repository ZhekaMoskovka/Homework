package Homework3_2;

public class ClassRoom {
    public Pupil []pupil = new Pupil[4];

    public ClassRoom(Pupil pupil[]) {
        for (int i = 0; i < 4; i++) {
            this.pupil[i] = pupil[i];
        }
    }

    void show() {
        System.out.println("Учеба  чтение  письмо  отдых");
        for (int i = 0; i < 4; i++) {
            System.out.print("Ученик №" + (i + 1) + " ");
            if (pupil[i] == null) {
                System.out.print("Ученика нету");
            } else {
                pupil[i].study();
                pupil[i].read();
                pupil[i].write();
                pupil[i].relax();
            }
            System.out.print("\n");
        }
    }
}