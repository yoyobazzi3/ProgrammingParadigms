public class Main{
    public static void main(String [] args){
LibraryCatalog library = new LibraryCatalog();


        library.add(new Book("Introduction to Python", new Author("John Smith", "1980-01-15", "USA"), "978-0-13-467094-2", "Programming", 5));
        library.add(new Book("The Art of Fiction", new Author("Jane Doe", "1975-06-22", "UK"), "978-0-14-144160-4", "Fiction", 3));
        library.add(new Book("Science and Nature", new Author("David Brown", "1990-03-10", "Canada"), "978-1-23-456789-0", "Science", 1));

       library.displayAll();
       library.searchByAuthor("John Smit");
       library.searchByAuthor("John Smith");
       library.searchByGenre("Fiction");

       library.remove("978-1-23-456789-0");
        library.remove("978-1-23-456789-0");
        System.out.println();
        library.displayAll();
    }
}