
public class Book {
	
	private String title;
	private int isbn;
	private Auther auther;
	

	
	//constructor
	public Book(String title, int isbn, Auther auther){
		setTitle(title);
		setAuther(auther);
		setAuther(auther);
		
		
	}

	
	//getter
	public String getTitle() {
		return title;
	}
	
	
	public int getIsbn() {
		return isbn;
	}
	
	
	public Auther getAuther() {
		return auther;
	}

	
	
	//setter
	public void setTitle(String title) {
		if (!title.isEmpty() && !title.equalsIgnoreCase(null)) {
			this.title = title;
		} else {
			this.title = "Unknown";
		}
		
	}
	
	
	public void setIsbn(int isbn) {
		if (isbn > 1000) {
			this.isbn = isbn;
		} else {
			this.isbn = 1000;
		}
	}
	

	public void setAuther(Auther auther) {
		this.auther = auther;
	}
	
}
