package oop_37;

public class Rectangle {
    
    private double width;
    private double length;
    private String color;
    private boolean filled;
    private double side;
    
    public Rectangle(){
        width = 0.0;
        length = 0.0;
    }
    
    public Rectangle(double wSide, double lSide){
        this.width = wSide;
        this.length = lSide;
    }
    
    public Rectangle(double wSide, double lSide, String rColor, boolean rFilled){
        this.width = wSide;
        this.length = lSide;
        this.color = rColor;
        this.filled = rFilled;      
    }
    
    @Override
    public String toString(){
        String lol = "Rectangle";
        return lol;
    }
    
    public double getSide(){
        return side;
    }
    
    public void setSide(double sSide){
        this.side = sSide;
        this.width = sSide;
        this.length = sSide;
    }
    public void lol(){
        System.out.println("LOL");
    }
}

//FOC 35th vidurathegeek