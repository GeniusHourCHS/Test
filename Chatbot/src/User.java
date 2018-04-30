import java.util.*;
public class User {

    private String name;
    private int age = 0;
    private String birthday;
    private Emotion emotion;

    public User(String name) {
        this.name = name;
        emotion = new Emotion();
    }
   
    //modifiers, they allow you to change the variables in this class from elsewhere in the program
    
    public void setName(String name) {
    	this.name = name;
    }
    public void setage(int age) {
    	this.age = age;
    }
    public void setBirthday(String birthday) {
    	this.birthday = birthday;
    }
   
    //accessors, they allow you to call and utilize the variables in this class elsewhere in the program
    
    public String getName() {
        if(name.indexOf(' ') == -1) {
            return name;
        }
        return name.substring(0,name.indexOf(' '));
    }
    public String getFullName() {return name;}
    public int getAge() {
        return age;
    }
    public String getBirthday() {
        return birthday;
    }
    public String toString() {
    	return name + "\n" + emotion; 
    }
  

}

/**
 * class Emotion stores the emotions of the user as ints
 */
class Emotion {
    int anger, joy, love, sorrow;

    //modifiers
    public void setAnger(int anger) {
        this.anger = anger;
    }

    public void setJoy(int joy) {
        this.joy = joy;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void setSorrow(int sorrow) {
        this.sorrow = sorrow;
    }

    //accessors
    public int getAnger() {
        return anger;
    }

    public int getJoy() {
        return joy;
    }

    public int getLove() {
        return love;
    }

    public int getSorrow() {
        return sorrow;
    }

    public String toString() {
        return "anger = " + anger + "\n"
                + "joy = " + joy + "\n"
                + "love = " + love + "\n"
                + "sorrow = " + sorrow + "\n";
    }
}