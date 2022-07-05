package Doit_JAVA.chapter4;

public class SwitchCase_upgrade {
    public static void main(String[] args){
        String medalColor = "Silver";

        switch (medalColor) {
            // 자바 7버전부터는 case 문에서 char 말고 String 도 가능.
            case "Gold":
                System.out.println("You are GOLD medal.");
                break;
            case "Silver":
                System.out.println("You are SILVER medal.");
                break;
            case "Bronze":
                System.out.println("You are BRONZE medal.");
                break;
            default:
                System.out.println("Sorry.");
        }
    }
}
