public class MoviePolymorphism {
    private String title;
    public MoviePolymorphism(String title){
        this.title=title;
    }
    public void watchMovie(){
        String instanceType=this.getClass().getSimpleName();
        System.out.println(title +" is a "+instanceType+" film");
    }
    public static MoviePolymorphism getMovie(String type,String title){
        return switch(type.toUpperCase().charAt(0)){
            case 'A'-> new Adventure(title);
            case 'C'-> new Comedy(title);
            case 'S'-> new ScienceFiction(title);
            default -> new MoviePolymorphism(title);
        };
    }
}
class Adventure extends MoviePolymorphism{
    public Adventure(String title){
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                            "Pleasant movie",
                            "Scary music",
                            "Something bad happens");
    }
}
class Comedy extends MoviePolymorphism{
    public Comedy(String title){
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                            "Somethong funny",
                            "Gets funnier",
                            "Happy ending");
    }
}
class ScienceFiction extends MoviePolymorphism{
    public ScienceFiction(String title){
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                            "BAd aliens do bad stuff",
                            "Space guys Chase Alines",
                            "Planets Blows up");
    }
}
