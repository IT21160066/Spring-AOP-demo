package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeenConfig.class);

        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.checkOut("Canceled");
    }
}
