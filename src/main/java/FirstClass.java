public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        Notebook notebook = new Notebook("600g", 1200, 1991);
        System.out.println(notebook.weight + notebook.price + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook("2000g", 500, 2005);
        System.out.println(heavyNotebook.weight + heavyNotebook.price + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook("1600g", 750, 2015);
        System.out.println(oldNotebook.weight + oldNotebook.price + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

    }
}