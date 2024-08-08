public record Person(String name, String dob) {
    
    // public Person(String name,String dob){  //canonical constructor
    //     this.name=name;
    //     this.dob=dob.replace('-','/');
    // }

    public Person(Person p){
        this(p.name,p.dob);
    }

    // you cannot have both canonical and compact construct at same time

    public Person{      //Compact constructor
        if(dob == null) throw new IllegalArgumentException("Bad data");
        dob = dob.replace('-','/');
    }
}

