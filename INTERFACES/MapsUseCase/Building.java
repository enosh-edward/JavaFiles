package Interfaces;

enum UsageType{ENTERTAINMENT,GOVERNMENT,RESIDENTIAL,SPORTS}

public class Building implements Mappable{
    
    private String name;
    private UsageType usage;

    public Building (String name,UsageType usage){
        this.name=name;
        this.usage=usage;
    }

    @Override
    public String getLabel() {
        return name+ " ("+usage +")";
            }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
            }

    @Override
    public String getMarker() {
        return switch(usage){
            case ENTERTAINMENT -> color.GREEN+" "+PointMaker.TRIANGLE;
            case GOVERNMENT -> color.RED+" "+PointMaker.STAR;
            case RESIDENTIAL -> color.BLUE+" "+PointMaker.SQUARE;
            case SPORTS -> color.ORANGE+" "+PointMaker.PUSH_PIN;
            default -> color.BLACK+" "+PointMaker.CIRCLE;
        };
            }
        @Override
        public String toJSON(){
            return Mappable.super.toJSON()+"""
                    , "name": "%s", "usage": "%s"
                    """.formatted(name,usage);
        }
}
