class Calculator{
    int x;
    int y;

    Calculator(int num1, int num2){
        x = num1;
        y = num2;
    }

    int multiply(){
        return x*y;
    }

    int divide(){
        return x/y;
    }
}