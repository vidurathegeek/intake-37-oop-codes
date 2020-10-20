package oop_37;

public class Invoice {
    
    private String partNumber;
    private String partDescription;
    private int quantityItem;
    private double prizeItem;
    
    public Invoice(){
        partNumber = null;
        partDescription = null;
        quantityItem = 0;
        prizeItem = 0.0;
    }
    
    public Invoice(String partNumberPara){
        this.partNumber = partNumberPara;
        partDescription = null;
        quantityItem = 0;
        prizeItem = 0.0;
    }
    
    public Invoice(String partNumberPara, String partDescriptionPara){
        this.partNumber = partNumberPara;
        this.partDescription = partDescriptionPara;
        quantityItem = 0;
        prizeItem = 0.0;
    }
    
    public Invoice(String partNumberPara, String partDescriptionPara, int quantityItemPara, double prizeItemPara){
        this.partNumber = partNumberPara;
        this.partDescription = partDescriptionPara;
        this.quantityItem = quantityItemPara;
        this.prizeItem = prizeItemPara;
    }
    
    public Invoice(Invoice Invoice2){
        partNumber = Invoice2.partNumber;
        partDescription = Invoice2.partDescription;
        quantityItem = Invoice2.quantityItem;
        prizeItem = Invoice2.prizeItem;
    }   
    
}
