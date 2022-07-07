class Parent{
    public String last_name;
    public String eye_color;

    Parent(String lastname, String eyecolor){
        last_name = lastname;
        eye_color = eyecolor;
    }

    public String getLastName(){
        return last_name;
    }
}

class Child extends Parent{
    public String first_name;
    
    Child(String firstname, String lastname, String eyecolor){
        super(lastname, eyecolor);
        first_name = firstname;
    }
    
    public String getFullName(){
        return first_name + " " + last_name;
    }
    public String getEyeColor(){
        return eye_color;
    }
}

public class inheritance{
    public static void main(String args[]){
        Child child = new Child("Joe", "Biden", "Brown");
        System.out.println(child.getFullName());
        System.out.println(child.getEyeColor());
    }
}