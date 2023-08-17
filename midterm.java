
 class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void Oder() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}

class Electronics extends Product {
    String brand;
    String model;

    public Electronics(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public void Oder() {
        super.Oder();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Phone extends Electronics {
    String operatingSystem;

    public Phone(String name, double price, String brand, String model, String operatingSystem) {
        super(name, price, brand, model);
        this.operatingSystem = operatingSystem;
    }

    public void Oder() {
        super.Oder();
        System.out.println("Operating System: " + operatingSystem);
    }
}

class Book extends Product {
    String author;
    int numberOfPages;

    public Book(String name, double price, String author, int numberOfPages) {
        super(name, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void Oder() {
        super.Oder();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

public class midterm {
    public static void main(String[] args) {
        Product chair = new Product("chair", 500.0);
        chair.Oder();
        System.out.println();

        Electronics television = new Electronics("television", 20000.0, "Samsung", "Neo QLED");
        television.Oder();
        System.out.println();

        Phone iphone = new Phone("Iphon", 4000.0, "Apple", "Iphone 99", "iOS");
        iphone.Oder();
        System.out.println();

        Book dooBook = new Book("OOP Programming", 250.0, "John Doe", 300);
        dooBook.Oder();
    }
}
