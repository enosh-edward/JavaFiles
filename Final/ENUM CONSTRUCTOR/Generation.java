import java.time.LocalDate;

public enum Generation {
    GEN_Z{
        {
            System.out.println("-- SPECIAL FOR " + this + " --");
        }
    },
    MILLENIAL(1891,2000),
    GEN_X(1965,1980),
    BABY_BOOMER(1946,1964),
    SILENT_GENERATION(1927,1945),
    GREATEST_GENERATION(1901,1926);

    private final int startYear;
    private final int endYear;

    Generation(){
        this(2001, LocalDate.now().getYear());
    }

    Generation(int startYear, int endYear){ //enum constructors are private by default
        this.startYear=startYear;
        this.endYear=endYear;
        System.out.println(this);
    }

    @Override
    public String toString(){
        return this.name() + " " + startYear + " - " + endYear;
    }

}


/* 
        in main method

        public static void main(){

            Generation g = Generation.BABY_BOOMER;
            //Generation h = new Generation.BABY_BOOMER(1900,2000);
        }
        
*/
