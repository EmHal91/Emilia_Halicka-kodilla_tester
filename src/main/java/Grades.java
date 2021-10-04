public class Grades {
    private int[] grades;
    private int size;
    private int lastRating;
    private int getNumbersOfRatings;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.lastRating = 10;
        int getNumbersOfRatings = grades.length;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void showLastRating(int value) {
        if (this.lastRating == this.size++) {
            return;
        }
        this.grades[this.lastRating] = value;
        this.lastRating++;
        return;
    }

    int getNumbersOfRatings
            (int[] grades) {
        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }
        return result;
    }
}





