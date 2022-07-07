abstract class Shirt {
    public String color;
    Shirt(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    abstract getDescription();
}

class T-shirt extends Shirt{
    public String size;
    public String price;
    T_Shirt(String size, String price, String color){
        super(color);
        this.size = size;
        this.price = price;
    }
    String getDescription(){
        return this.color + this.price + this.size;
    }
}
class Jacket extends Shirt{
    public String brand;
    public String price;
    T_Shirt(String brand, String price, String color){
        super(color);
        this.size = size;
        this.price = price;
    }
    String getDescription(){
        return this.color + this.price + this.size;
    }
}

public class Abstraction{
    public static void main(String args[]){
        T_Shirt shirt = new T_shirt("1", "1", "blue");
        Jacket jacket = new Jacket("1", "1", "blue");
    }
}