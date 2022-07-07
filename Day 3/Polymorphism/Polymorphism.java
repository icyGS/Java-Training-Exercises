class Calculator{
    public int divide(int a, int b){
        return a/b;
    }

    public double divide(double a, double b){
        return a/b;
    }

    public int multiply(int a, int b){
        return a*b;
    }
}

class SowCalculator extends Calculator{
    @Override
    public int multiply(int a, int b){
        int total = 0;
        for (int i = 0; i < b; i++){
            total +=a;
        }
        return total;
    }
}

public class Polymorphism{
    public static void main(String[] args){
        SlowCalculator slowCalculator = new SlowCalculator();
        System.out.println(slowCalculator.divide(37.0, 49.0));
        System.out.println(slowCalculator.divide(37,49));
        System.out.println(slowCalculator.multiply(37,49));
    }
}