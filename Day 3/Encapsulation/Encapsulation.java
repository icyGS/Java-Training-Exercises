class Information {
    private String name;
    private String gender;
    private int age;

    public int getAge() {return age;}
    public String getName() {return name;}
    public String getGender() {return gender;}
    public boolean getAbove21() {return age > 21;}

    public void setAge(int newAge) {age = newAge;}
    public void setName(String newName) {name = newName;}
    public void setGender(String newGender) {gender = newGender;}
}

public class Encapsulation{
    public static void main(String[] args){
        Information A = new Information();

        A.setName("Joe");
        A.setAge(19);
        A.setGender("Male");

        System.out.println("A's name: " + A.getName());
        System.out.println("A's age: " + A.getAge());
        System.out.println("A's gender: " + A.getGender());
        System.out.println("A's above 21?: " + A.getAbove21());
    }
}