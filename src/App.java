import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.println("Ange vad 10 ska delas med");
            int var1 = 10;
            int var2 = scan.nextInt();
        if (var2 == 0) {
            throw new ArithmeticException("Du kan inte dela på 0");
        }
        double svar = ((double)var1) / var2;
        System.out.println("10 delat med " + var2 +" är "+ svar);

        } 
        catch (ArithmeticException e) {
            System.out.println("Fel: "+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Du skrev fel, du ska skriva med siffror");
        }
    }
}
