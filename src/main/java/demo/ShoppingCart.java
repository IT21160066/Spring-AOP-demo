package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String status){
        System.out.println("checkOut method from ShoppingCart");
    }
    public int quantity(){return 2;}
}
