public enum Chocolates{
    Cadbury,
    Caramel,
    Gems,
    PopStickle,
    Jelly;

    public double getPrice(){

        return switch(this){
            case Cadbury -> 8.5;
            case Caramel -> 7.0;
            case Gems -> 6.2;
            case PopStickle -> 5.0;
            case Jelly -> 3.5;
            default -> 0.0;
        };
    }
}
