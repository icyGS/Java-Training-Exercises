abstract class Shirt{
    String color;

    abstract String getDescirption();

    public Shirt(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}

class T_Shirt extends Shirt{
    String size;
    int price;

    public T_Shirt(String color, String size, int price){
        super(color);
        this.size = size;
        this.price = price;
    }

    @Override
    public String getDescription(){
        return "T-Shirt with color " + super.getColor() + " and size " + size + " and price " + price;
    }
}

class Jacket extends Shirt{
    String brand;
    int price;
    
    public Jacket(String color, String brand, int price){
        super(color):
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String getDescription(){
        return "Jacket with color " + getColor() + " and brand " + brand + " and price " + price;
    }
}

public class Abstraction{
    public static void main(String[] args){
        T_Shirt favoriteShirt = new T_Shirt("Black", "Medium", 9000);
        Jacket favroiteJacket = new Jacket("White", "Supreme", 0);

        System.out.println(favoriteShirt.getDescription());
        System.out.println(favoriteJacket.getDescription());
    }
}