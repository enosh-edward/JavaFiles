package Interfaces;
import java.util.ArrayList;
import java.util.List;
interface Mappable {
    String JSON_PROPERTY="\"properties\":{%s}";

    default void toJSON(){
        System.out.printf(JSON_PROPERTY,"\"type\": "+getGeometryType()+", \"label\": "+getlabel()+", \"marker\": "+iconType()+"\", ");
    }
    String getlabel();
    String getGeometryType();
    String iconType();
    static void printProperties(Mappable object){
        object.toJSON();
    }
}

public class InterfaceChallenge{
    public static void main(String args[]){
        List<Mappable> buildings = new ArrayList<>();
        buildings.add(new Build());
        Mappable.printProperties(new Build());
    }
}
class Build implements Mappable{

    @Override
    public String getlabel() {
        return "Sydney Town Hall (GOVERNMENT)";
    }

    @Override
    public String getGeometryType() {
        return "POINT";
    }

    @Override
    public String iconType() {
        return "RED STAR";
    }

}
class UtilityLine implements Mappable{

    @Override
    public String getlabel() {
        return "College St (FIBRE_OPTIC)";
    }

    @Override
    public String getGeometryType() {
        return "LINE";
            }

    @Override
    public String iconType() {
        return "GREEN DOTTED";
            }

}
