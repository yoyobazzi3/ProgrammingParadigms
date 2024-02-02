public class Author {
    private String name;
    private String birthday;

    private String nationality;


    public Author (String name, String birthday, String nationality){
        this.name=name;
        this.birthday= birthday;
        this.nationality=nationality;

    }

    public String getName (){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
