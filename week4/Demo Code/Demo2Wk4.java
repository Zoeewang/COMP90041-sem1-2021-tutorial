package wk4;

public class Demo2Wk4 {
    public static void main(String[] args) {
        switch (args[0]){
            case "N":
                System.out.println("0");

            case "S":
                System.out.println("90");
                break;
            case "E":
                System.out.println("180");
                break;
            case "W":
                System.out.println("270");
                break;
            default:
                System.out.println("wrong input");
                break;
        }


    }


}
