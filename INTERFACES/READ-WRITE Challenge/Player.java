import java.util.List;
import java.util.ArrayList;
public class Player implements ISaveable{
    // write code here
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;
    
    public Player(String name,int hitPoints,int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
        this.weapon="Sword";
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setWeapon(String weapon){
        this.weapon=weapon;
    }
    public String getWeapon(){
        return weapon;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints=hitPoints;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public void setStrength(int strength){
        this.strength=strength;
    }
    public int getStrength(){
        return strength;
    }
    public List<String> write() {
        
        List<String> values = new ArrayList<String>();
        values.add(0, name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);
        values.add(3, weapon);
        return values;
    }
 
    public void read(List<String> savedValues) {
        
        if (savedValues == null)
            return;
        if (savedValues.size() <= 0)
            return; 
        name = savedValues.get(0);
        hitPoints = Integer.parseInt(savedValues.get(1));
        strength = Integer.parseInt(savedValues.get(2));
        weapon = savedValues.get(3);
    }
    @Override
    public String toString(){
        return """
                Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}""".formatted(this.name,this.hitPoints,this.strength,this.weapon);
    }
}
