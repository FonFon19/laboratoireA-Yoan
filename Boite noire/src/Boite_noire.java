
public class Boite_noire {
    public static void main(String[] args) {

        /* Informations
        Dimension boite = 125m^3
        Poids boite = 375kg
        Masse volumique sphere = 3517kg/m^3
        Rayon sphere = 2,15m
        Masse volumique substance = 13 545.88kg/m^3
         */
        double dimension = 125;

        //Sphere
        //Masse volumique sphere = 3517kg/m^3
        //Rayon sphere = 2,15m

        double volume = 0;
        double massevol = 3517;
        double poids = 0;
        double rayon = 2.15;

        volume = (4.0 / 3) * Math.PI * Math.pow(rayon, 3);
        poids = volume * massevol;

        //Susbtance isolante
        //Masse volumique substance = 13 545.88kg/m^3
        //10^-3 m^3
        double volumesub = 0;
        double massevolsub = 13545.88;
        double poidssub = 0;
        double quantite = 0;

        volumesub = dimension - volume;
        poidssub = massevolsub * volumesub;
        quantite = volumesub / Math.pow(10,-3);

        //Boite noire
        double poidsbn = 375;
        double volumebn = 125;
        double poidstot = 0;

        poidstot = poidsbn+poidssub+poids;

        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("-RAPPORT D'INFORMATIONS");
        System.out.println("  Sphere");
        System.out.println("   * Masse volumique : " + massevol + " kg/m3");
        System.out.println("   * Poids : " + poids + " kg");
        System.out.println("   * Rayon : " + rayon + " m");
        System.out.println("   * Volume : " + volume + " m3");
        System.out.println("  Substance isolante");
        System.out.println("   * Masse volumique : " + massevolsub + " kg/m3");
        System.out.println("   * Poids : " + poidssub + " kg");
        System.out.println("   * Volume : " + volumesub + " m3");
        System.out.println("   * Quantite: " + quantite + " l");
        System.out.println("  Boite noire");
        System.out.println("   * Poids : " + poidsbn+ " kg");
        System.out.println("   * Volume : " + volumebn + " m3");
        System.out.println("   * Poids total : " + poidstot + " kg");
        System.out.println("-------------------------------------------");


    }

}
