import java.util.ArrayList;
public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts= new ArrayList<>();

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
    }
    public boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
            return false;
        }
        else
            return true;
    }
    public boolean updateContact(Contact old,Contact newcontact){
        if(myContacts.contains(old)){
         for(Contact x: myContacts){
             if(x==old){
                 myContacts.set(myContacts.indexOf(x),newcontact);
             }
             return true;
         }   
        }
        return false;
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String name){
        int n=0;
        for(Contact x: myContacts){
            if(x.getName().equals(name))
                 n=myContacts.indexOf(x);
        }
        return n;
    }
    public Contact queryContact(String name){
        for(Contact x: myContacts){
            if(x.getName().equals(name))
                return x;
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for(Contact x : myContacts){
            System.out.println(myContacts.indexOf(x)+1+". "+x.getName()+" -> "+x.getPhoneNumber());
        }
    }
    
}
