import java.util.*;
public class User {

    private String name = "null";
    private int age = 0;
    private String birthday = "null";

    public User(String name, String birthday, int age) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getBirthday() {
        return birthday;
    }
}
