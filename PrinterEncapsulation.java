public class PrinterEncapsulation {
    public static void main(String[] args) {}
        
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public PrinterEncapsulation(int tonerLevel,boolean duplex){
        this.tonerLevel=tonerLevel;
        this.duplex=duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount<0 || tonerAmount>100)
            return -1;
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){
        if(duplex){
            pagesPrinted+=pages/2;
            return pages/2;
        }else{
            pagesPrinted+=pages;
            System.out.println("Duplex Printer");
            return pages;
        }
    }

}
