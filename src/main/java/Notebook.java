public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice () {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price > 600 && this.price < 100) {
            System.out.println("The price is good.");
        }
        if (this.price > 100) {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight () {
        if (this.weight < "1000g") {
            System.out.println("This notebook is light.");
        }
        if (this.weight > "1000g" && this.weight < "1700g") {
            System.out.println("This notebook is not very heavy.");
        }
        if (this.weight > "1700g") {
            System.out.println("This notebook is too heavy.");
        }
    }
    public void checkYear () {
        if (this.year > 1991 && this.price < 750) {
            System.out.println("This notebook is jus right.");
        } else {
            System.out.println("This notebook is a bad choise.");
        }
        if (this.year < 2015 || this.weight > 1500) {
            System.out.println("This notebook is not too old.")
        }
    }
}
