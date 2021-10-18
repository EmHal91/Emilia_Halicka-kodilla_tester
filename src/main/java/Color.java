public class Color {
    public double getFirstLetter() {
        String getColorname = ColorName.getColorname();
        int a = ColorName.getLetter();
        switch (getColorname) {
            case "P": return a;
            case "N": return a;
            case "G": return a;
            case "Z": return a;
            default: return 0;
        }
    }

}
