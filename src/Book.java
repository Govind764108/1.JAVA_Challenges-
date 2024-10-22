class Book{
    //static variable
    static int totalBooks;

    //instance variable
    String title;
    String author;
    String isbn;

    //to have entry of books borrowed or returned
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    {
        //object init
        totalBooks++;
    }

static int getTotalNoOfBooks(){
        return totalBooks;
}

    //parametrized Constructor for book
    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    //another class having only one parameter
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }

    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book");
        }else{
            System.out.println("This book is already in library");
        }

    }
    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }


}