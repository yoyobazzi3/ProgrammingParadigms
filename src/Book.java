public class Book {
    private String title;
    private Author auth;
    private String isbn;
    private String genre;
    private int copies;


   public  Book (String title , Author auth, String isbn, String genre, int copies){
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
        this.copies = copies;
        this.auth=auth;
    }

    public String getIsbn(){
    return isbn;
    }

    public String getGenre(){
       return genre;
    }
    public Author getAuthor(){
       return auth;
    }


    public int removeCopies() {
        if (copies <= 1) {
            return 0;
        } else
           return copies -= 1;

    }

  public int getCopies(){
       return copies;
  }
@Override
  public String toString(){
       return "Title: "+ title +"  ISBN: "+isbn+"  Genre: "+genre+"";
  }

}
