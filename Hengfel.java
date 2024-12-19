/*
* File: hengfel.java
* Author: Kovács F Richárd
* Copyright: 2024, Kovács F Richárd
* Group: II-2-N
* Date: 2024-12-19
* Github: https://github.com/janos12345/
* Licenc: MIT
*/
import java.util.Scanner;

public class Hengfel {
    public void doit(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sugár: ");
        double radius = scanner.nextdouble();

        System.out.print("Magasság: ");
        double height = scanner.nextdouble();

        double surfaceArea = 2 * Math.PI * radius * (radius+height);
        System.out.println("Felszín: " + surfaceArea);


    }
}