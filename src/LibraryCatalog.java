import java.util.ArrayList;
public class LibraryCatalog {
    private ArrayList<Book> catalog;

    public LibraryCatalog(){
        catalog = new ArrayList<Book>();
    }

    public void add(Book book) {
        catalog.add(book);
    }

    public void remove(String isbn) {
        boolean exists = false;
        for (int i = 0; i < catalog.size(); i++) {
           if( (catalog.get(i)).getIsbn().equals(isbn)){

               if((catalog.get(i)).removeCopies()==0){
                   catalog.remove(i);
               }
               else
                   (catalog.get(i)).removeCopies();
               exists = true;
           }

    }
        if(exists == false){
            System.out.println("The book does not exist");
        }

    }
public void searchByAuthor(String Author){
    boolean exists= false;
    for (int i = 0; i < catalog.size(); i++) {
        if (  (((catalog.get(i))  .getAuthor())  .getName())  .equals(Author)){
            System.out.println((catalog.get(i).toString()));
            exists=true;
        }
    }
    if(exists==false){
        System.out.println(Author +" is not found");
    }
}
    public void test(){

        System.out.println((catalog.get(0).getAuthor()));
    }
    public void searchByGenre(String Genre){
        boolean exists= false;
        for (int i = 0; i < catalog.size(); i++) {
            if (  (((catalog.get(i))  .getGenre())   .equals(Genre))){
                System.out.println((catalog.get(i)).toString());
                exists = true;
            }
        }
        if(exists==false){
            System.out.println(Genre +" is not found");
        }
    }
    public void displayAll(){
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println((catalog.get(i)).toString());
            }
    }
}