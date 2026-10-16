interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printer is printing a document.");
    }

    public void scan() {
        System.out.println("Printer is scanning a document.");
    }
}

public class Main {
    public static void main(String[] args) {

        AllInOnePrinter p = new AllInOnePrinter();

        p.print();
        p.scan();
    }
}
