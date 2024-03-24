import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange vad 10 ska delas med");
        int var1 = 10;
        
        try {
            int var2 = scan.nextInt();
        } 
        catch (Exception e) {
            System.out.println("Du skrev fel, du ska skriva med siffror");
            scan.nextLine();
        }
    }
}
