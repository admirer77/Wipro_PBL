/*Create a class Author with the following information.
Member variables name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables */


public class AuthorMain {
    public static void main(String[] args) {
        Author a = new Author("Parmesh", "parmesh@onaofn.aosnfina", 'F');
        a.details();
    }
}

class Author{
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    void details(){
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(this.gender);
    }
}

/*Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)
 */


class Book{
    private String name1;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name1,Author author,double price,int qtyInStock){
        this.name1 = name1;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name1;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book{name='" + name1 + "', author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "}";
    }
}







