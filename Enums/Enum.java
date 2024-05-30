import java.util.Random;

public class Enum {
    public static void main(String args[]){
        DayOfTheWeek Day=DayOfTheWeek.FRI;
        System.out.printf(" %d : %s",Day.ordinal(),Day.name());

        for(int i=0;i<10;i++){
            var RandomDay=getRandom();
            switchDayOfTheWeek(RandomDay);
        }

        for(Chocolates item:Chocolates.values())
           System.out.println(item.name()+" : "+item.getPrice());
        Chocolates x=Chocolates.Cadbury;
        System.out.printf("%s : %d : %f ",x.name(),x.ordinal(),x.getPrice());

    }
    public static void switchDayOfTheWeek(DayOfTheWeek day){
        int dayNumber=day.ordinal()+1;
        switch(day){
            case WED -> System.out.println("Wednesday is the day" + " : " +dayNumber);
            case SAT -> System.out.println("Saturday is the day" +" : " +dayNumber);
            default -> System.out.println(day.name().charAt(0)+day.name().substring(1).toLowerCase()+"day is the day : " +dayNumber);
        }
    }
    public static DayOfTheWeek getRandom(){
        int num=new Random().nextInt(7);
        var arr=DayOfTheWeek.values();
        return arr[num];
    }
}

