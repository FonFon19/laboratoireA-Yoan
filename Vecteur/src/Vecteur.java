import java.util.Scanner;

public class Vecteur {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        float xa = 0;
        float ya = 0;
        float za = 0;
        float xb = 0;
        float yb = 0;
        float zb = 0;
        float y = 0;
        float x = 0;
        float z = 0;
        float ab = 0;

        //A point
        System.out.println("What are the A point coordinates?");
        System.out.println("xa : ");
        xa = sc.nextFloat();

        System.out.println("ya : ");
        ya = sc.nextFloat();

        System.out.println("za : ");
        za = sc.nextFloat();

        System.out.println("The A point (" + xa + "," + ya + "," + za + ")");

        //B point
        System.out.println("What are the B point coordinates?");
        System.out.println("xb : ");
        xb = sc.nextFloat();

        System.out.println("yb : ");
        yb = sc.nextFloat();

        System.out.println("zb : ");
        zb = sc.nextFloat();

        System.out.println("The B point (" + xb + "," + yb + "," + zb + ")");

        //Calcul + Final answer
        // d(AB) = sqrt of ( (xb-xa)^2 + (yb-ya)^2 + (zb-za)^2 )      AB = sqrt (X+Y+Z)
        x = (float) Math.pow ((xb-xa), 2);
        y = (float) Math.pow ((yb-ya), 2);
        z = (float) Math.pow ((zb-za), 2);
        ab = (float) Math.sqrt (x+y+z);

        System.out.println("The distance is : " + ab);
        sc.close();

    }
}