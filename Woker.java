public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){
        System.out.println(" Parent class");
    }
    public Worker(String name,String birthDate,String endDate){
        this.name=name;
        this.birthDate=birthDate;
        this.endDate=endDate;
    }

    public String getAge(){
        return birthDate;
    }
    public Double collectPay(){
        return 200000.0;
    }
    public String terminate(){
        return endDate;
    }
}
