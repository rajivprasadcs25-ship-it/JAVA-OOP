class Book {
// Data members
int bookId;
String title;
String author;
double price;

// Static member to count total books
static int totalBooks = 0;

// Constructor
Book(int bookId, String title, String author, double price) {
this.bookId = bookId;
this.title = title;
this.author = author;
this.price = price;
totalBooks++;
}

// Method to display book information
void display() {
System.out.println("Book ID : " + bookId);
System.out.println("Title : " + title);
System.out.println("Author : " + author);
System.out.println("Price : ₹" + price);
System.out.println("-------------------------");
}

// Overloaded search() - search by Book ID
boolean search(int id) {
return this.bookId == id;

}

// Overloaded search() - search by Title
boolean search(String title) {
return this.title.equalsIgnoreCase(title);
}

// Returns the costlier book between this book and another book
Book costlierBook(Book other) {
if (this.price >= other.price)
return this;
else
return other;
}

// Static method to get total number of books
static int getTotalBooks() {
return totalBooks;
}
}

public class Books {
public static void main(String[] args) {

// Creating multiple Book objects
Book b1 = new Book(101, "Java Programming",
"James Gosling", 550.00);

Book b2 = new Book(102, "Python Basics",
"Guido van Rossum", 450.00);

Book b3 = new Book(103, "Data Structures",
"Mark Allen", 650.00);

// Display book information
System.out.println("BOOK DETAILS");
System.out.println("=========================");
b1.display();
b2.display();
b3.display();

// Search by Book ID
System.out.println("Searching by Book ID 102:");
if (b2.search(102))
System.out.println("Book found: Python Basics");
else
System.out.println("Book not found.");

// Search by Title
System.out.println("\nSearching by Title 'Data Structures':");
if (b3.search("Data Structures"))
System.out.println("Book found: Data Structures");
else
System.out.println("Book not found.");

// Find the costlier book
Book costlier = b1.costlierBook(b3);

System.out.println("\nCostlier Book:");
costlier.display();

// Display total number of books

System.out.println("Total Books Created: "
+ Book.getTotalBooks());

}
}