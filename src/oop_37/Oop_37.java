package oop_37;
import java.util.*;

public class Oop_37 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Side: ");
        double side = scan.nextDouble();
        
        Square sqc = new Square(side);
        sqc.showSet();
        sqc.getArea();
        sqc.getPerimeter();
        String lol = sqc.toString();
        System.out.println(lol);
    }
    
}

//FOC 35th vidurathegeek
