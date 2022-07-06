public class methods {
    static String friends(String input){
        String output = input + " is friends with Albert";
        return ouput;
    }

    static int doubler(int input){
        int output = input * 2;
        return output;
    }
    static boolean invert(boolean input){
    boolean output = !input;
        return(output);
    }

    public static void main(String[] args){
        System.out.println(friends("Krish"));
        System.out.println(doubler(69));
        System.out.println(invert(true));
    }
}
