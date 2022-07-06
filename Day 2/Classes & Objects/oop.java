class Me {
    String name;
    int age;

    public Me(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class oop {
    public static void main(String[] args){
        Me krish = new Me("Krish", 15);

        System.out.println(krish.getName() + " " + krish.getAge());
    }
}