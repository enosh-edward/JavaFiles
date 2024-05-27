import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListIteration {
    
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){

        LinkedList<Australia> places=new LinkedList<>();
        
        places.add(new Australia("Adelaide",1374));
        places.add(new Australia("Alice Springs",2771));
        places.add(new Australia("Brisbane",917));
        places.add(new Australia("Darwin",3972));
        places.add(new Australia("Melbourne",877));
        places.add(new Australia("Perth",1283));

        boolean flag=true;
        sort(places);
        removeDuplicate(places);
        var iterator= places.listIterator();
        while(flag){
            System.out.println("""
                
                                        Available actions (select word or letter):
                                        (F)orward
                                        (B)ackward
                                        (L)ist Places
                                        (M)enu
                                        (Q)uit  """);
            char inp=sc.nextLine().charAt(0);

            switch (inp) {
                case 'F' : while(iterator.hasNext()){
                                Australia temp=iterator.next();
                                System.out.println(temp.getTown()+" "+temp.getDistance());
                                break;}
                            break;
                case 'B' :         
                                while(iterator.hasPrevious()){
                                Australia temp=iterator.previous();
                                System.out.println(temp.getTown()+" "+temp.getDistance());
                                break;}
                            break;
                case 'M' : printList(places);
                            break;
                case 'Q' : flag=false;
                            break;
            }
        }

    }
    public static void printList(LinkedList<Australia> places){
        var iterator=places.iterator();
        while(iterator.hasNext()){
            Australia temp=iterator.next();
            System.out.println(temp.getTown()+"  "+temp.getDistance());
        }
    }
    public static void removeDuplicate(LinkedList<Australia> places){
        int i=0;
        while(i<places.size()-1){
            if(places.get(i).getDistance()==places.get(i+1).getDistance() && places.get(i).getTown()==places.get(i+1).getTown()){
                places.remove(i+1);
                continue;
            }
            i++;
        }
    }
    public static void sort(LinkedList<Australia> places){
        for(int i=0;i<places.size();i++){
            for(int j=i;j<places.size();j++){
                int leastdist=places.get(i).getDistance();
                    if(places.get(j).getDistance()<leastdist){
                        Australia temp1=places.get(i);
                        Australia temp2=places.get(j);
                        places.set(i,temp2);
                        places.set(j,temp1);
                    }
            }
        }
    }
}
