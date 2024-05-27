public class Australia {
     private String town;
     private int distanceFromSydney;
     public Australia(){}
     public Australia(String town,int distanceFromSydney){
        this.town=town;
        this.distanceFromSydney=distanceFromSydney;
     }
     public int getDistance(){
      return distanceFromSydney;
     }
     public String getTown(){
      return town;
     }
}
