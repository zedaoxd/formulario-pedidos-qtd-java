package Exercicio9;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(int quantity, double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal(){
        return quantity * price;
    }

    public Integer getQuantity(){
        return this.quantity; 
    }

    public Double getPrice(){
        return this.price;
    }

    public Product getProduct() {
        return product;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String toString(){
        return product.toString() + ", Quantity: " + quantity + ", Subtotal: " + subTotal(); 
    }
}
