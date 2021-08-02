package Exercicio9;

public class Product {
    private String name;
    private Double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name; 
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return this.price; 
    }

    public void setPrice(Double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", $" + price;
    }

    
}
