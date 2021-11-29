package Homework3_2;

public class ClassRoom {
    public Pupil []pupils = new Pupil[4];

    public ClassRoom(Pupil pupils[]) {
            this.pupils = pupils;
    }

    void show() {
        System.out.println("Учеба  чтение  письмо  отдых");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Ученик №%d ", i+1);
            if (pupils[i] == null) {
                System.out.print("Ученика нету");
            } else {
                pupils[i].study();
                pupils[i].read();
                pupils[i].write();
                pupils[i].relax();
            }
            System.out.print("\n");
        }
    }
}