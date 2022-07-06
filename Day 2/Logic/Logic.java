public class Logic {
    public static void main(String[] args) {
        int result;
        int tea = 5;
        int candy = 10;
        if(tea >= 5 && candy >= 5){
            if(tea >= 2 * candy || candy >= 2 * tea){
                result = 2;
            } else{
                result = 1;
            }
        } else{
            result = 0;
        }
        System.out.println(result);
    }
}
