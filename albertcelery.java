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

        int preu = 6520;
        int sou = 3000;
        System.out.println("preu = " + preu);
        System.out.println("sou = " + sou);
        int dies = albertcelery.diespagar(preu, sou);
        if (preu == ((diespagar(preu, sou)*(sou*30)*100)/5)){
            System.out.println("funciona");
            System.out.println("dies = " + dies);
        }else{
            System.out.println("no funciona");
        }

    }
    
    
}