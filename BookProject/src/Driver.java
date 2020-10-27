
public class Driver {
	
	public static void printBook(Book b) {
		System.out.println("Title: " + b.getTitle() + 
						   "\nISBN: " + b.getIsbn() +
						   "\nAuther Name: " + b.getAuther().getFirstName() + b.getAuther().getLastName() +
						   "\nAuther Birth Year: " + b.getAuther().getBirthYear());
	}

	public static void main(String[] args) {
		
		Auther auther1 = new Auther("John", "Doe", 1985);
		Book book1 = new Book("x", 1987654, auther1);
		printBook(book1);
	}

}
