package oop_37;

public class Square extends Rectangle {
    
    private double width;
    private double length;
    private double side;
    private String sColor;
    private boolean sFilled;
    
    private double area;
    private double perimeter;
    
    public Square(){
        super();
        this.width = width;
        this.length = length;
    }
    
    public Square(double side){
        super(side, side);
        this.side = side;
        this.width = side;
        this.length = side;
    }
    
    public Square(double side, String rColor, boolean rFilled){
        super(side, side, rColor, rFilled);
        this.width = side;
        this.length = side;
        this.sColor = rColor;
        this.sFilled = rFilled;
    }
    
    @Override
    public double getSide(){
        return side;
    }
    
    @Override
    public void setSide(double sSide){
        this.side = sSide;
        this.width = sSide;
        this.length = sSide;
    }
    
    @Override
    public String toString(){
        String lol = "A Square with the side = " + side + ", which is a subclass of " +super.toString();
        return lol;
    }
    
    public void showSet(){
        System.out.println("-------------------");
        System.out.println("side: " + side);
        System.out.println("width: " + width);
        System.out.println("length: " + length);
        System.out.println("-------------------");
    }
    
    public void getArea(){
        area = width*length;
        System.out.println("Area is: " + area);
    }
    
    public void getPerimeter(){
        perimeter = 4*side;
        System.out.println("Perimeter is: " + perimeter);
    }
    
    public void lol(){
        System.out.println("LOL");
    }
}

//FOC 35th vidurathegeek