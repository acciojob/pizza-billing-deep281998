package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extracheese;

    private Boolean extratopping;

    private Boolean takeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        this.extracheese=false;
        this.extratopping=false;
        this.takeaway=false;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extracheese == false){
            this.extracheese = true;
            this.price+=80;
        }


        // your code goes here
    }

    public void addExtraToppings(){
        if(extratopping == false){
            if(isVeg){
                this.price+=70;
            }
            else {
                this.price += 120;
            }
            this.extratopping = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(takeaway == false){
            this.takeaway = true;
            this.price +=20;
        }
        // your code goes here
    }

    public String getBill(){
        String bill ="";
        if(isVeg) {
            bill += "Base Price Of The Pizza: 300\n";
        }
        else {
            bill += "Base Price Of The Pizza: 400\n";
        }

        if(extracheese == true){
            bill += "Extra Cheese Added: 80\n";
        }
        if(extratopping == true && isVeg == true){
            bill += "Extra Toppings Added: 70\n";
        }
        else if(isVeg == false && extratopping == true) {
            bill += "Extra Toppings Added: 120\n";
        }
        if(takeaway)
        {
            bill += "Paperbag Added: 20\n";
        }
        bill += "Total Price: "+getPrice()+"\n";
        return bill;

        // your code goes here
    }
}
