import java.lang.Math.*;
import java.util.Scanner;
public class albertcelery{


public static int diespagar(int preu, int sou){

    preu-=((preu * 5)/100);
    int dies;
    return dies = (preu/(sou/30))

}
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int preu = keyboard.nextInt();
        int sou = keyboard.nextInt();
        int dies = albertcelery.diespagar(preu, sou);

    }
    
}