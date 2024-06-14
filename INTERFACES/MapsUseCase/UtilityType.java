package Interfaces;
enum UtilityType{ELECTRICAL,FIBRE_OPTIC,GAS,WATER}
public class UtilityLine implements Mappable{
    private String name;
    private UtilityType type;
    public UtilityLine(String name,UtilityType type){
        this.name=name;
        this.type=type;
    }
    @Override
    public String getLabel() {
        return name+" ("+type+")";
    }
    @Override
    public Geometry getShape() {
        return Geometry.LINE;
            }
    @Override
    public String getMarker() {
        return switch(type){
            case ELECTRICAL->color.RED+" "+LineMaker.DASHED;
            case FIBRE_OPTIC->color.GREEN+" "+LineMaker.DOTTED;
            case GAS->color.ORANGE+" "+LineMaker.SOLID;
            case WATER->color.BLUE+" "+LineMaker.SOLID;
            default -> color.BLACK+" "+LineMaker.SOLID;
        };
            }
    @Override
    public String toJSON(){
        return Mappable.super.toJSON()+"""
                ,"name": "%s", "utility": "%s" """.formatted(name,type);
    }

}
