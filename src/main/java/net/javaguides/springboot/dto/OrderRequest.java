package net.javaguides.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import net.javaguides.springboot.entity.Order;
import net.javaguides.springboot.entity.Payment;
public class OrderRequest {
    private Order order;
    private Payment payment;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
