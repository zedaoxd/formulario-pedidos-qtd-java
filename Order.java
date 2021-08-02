package Exercicio9;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> orderItens = new ArrayList<>();
    
    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getOrderItens() {
        return orderItens;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        orderItens.add(item);
    }

    public void removeItem(OrderItem item){
        orderItens.remove(item);
    }
    
    public Double total(){
        double sum = 0.0;
        for (OrderItem product : orderItens){
            sum += product.subTotal();
        }
        return sum;
    }
}
