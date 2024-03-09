package main;

import delivery.DeliveryService;
import invoicing.model.Invoice;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
//        deliveryService.deliver();
        List<Invoice> deliver = deliveryService.deliver();
    }

}
