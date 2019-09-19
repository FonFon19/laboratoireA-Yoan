
public class Geometrie {
    public static void main (String [] args) {

        double lenght ;
        double volume ;
        double surface ;
        double height ;
        double circleradius ;
        double radius ;
        double apothem ;

        //Cercle
        //Ab = Math.PI * r^2
        radius = 10;
        surface = Math.PI*Math.pow(radius,2);


        System.out.println("The circle");
        System.out.println("- Radius : " + radius );
        System.out.println("- Surface : " + surface );

        //Cube
        lenght = 7;
        surface = (lenght*lenght)*6;
        volume = Math.pow(lenght,3);

        System.out.println("The Cube");
        System.out.println("- Lenght : " + lenght);
        System.out.println("- Surface : " + surface);
        System.out.println("- Volume : " + volume);

        //Cylindre
        radius = 10;
        height = 5;
        surface = (2*Math.PI*Math.pow(radius,2)) + (2*Math.PI*radius*height);
        volume = Math.PI*Math.pow(radius,2)*height;

        System.out.println("The cylinder");
        System.out.println("- Radius : " + radius);
        System.out.println("- Height : " + height);
        System.out.println("- Surface : " + surface);
        System.out.println("- Volume : " + volume);

        //Cone
        radius = 3;
        height = 7;
        apothem = 7.1589108;
        surface = (Math.PI*Math.pow(radius,2) + (Math.PI*radius*apothem));
        volume = 1.0/3*Math.PI*height*Math.pow(radius,2);

        System.out.println("The cone");
        System.out.println("- Radius : " + radius);
        System.out.println("- Height : " + height);
        System.out.println("- Apothem : " + apothem);
        System.out.println("- Surface : " + surface);
        System.out.println("- Volume : " + volume);


    }
}
