public class Grades {
    private int[] grades;
    private int size;
    private int lastRating;
    private int advertage;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.lastRating = 10;
        this.advertage = int value
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void returnLastRating(int value) {
        if (this.lastRating == this.size) {
            return;
        }
        this.grades[this.lastRating] = value;
        this.lastRating++;
        return;
        System.out.println(this.lastRating++);
    }
}
}







