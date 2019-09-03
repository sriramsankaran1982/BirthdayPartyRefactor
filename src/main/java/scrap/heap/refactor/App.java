package scrap.heap.refactor;

import scrap.heap.refactor.entity.Balloon;
import scrap.heap.refactor.entity.Cake;
import scrap.heap.refactor.entity.Color;
import scrap.heap.refactor.entity.Flavor;
import scrap.heap.refactor.entity.Material;
import scrap.heap.refactor.entity.Order;
import scrap.heap.refactor.entity.Shape;
import scrap.heap.refactor.entity.Size;
import scrap.heap.refactor.impl.OrderProcessorImpl;

import java.util.Arrays;

public class App {
    private final OrderProcessor orderProcessor;
    App(final OrderProcessor orderProcessor){
        this.orderProcessor = orderProcessor;
    }
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        App app = new App(new OrderProcessorImpl());
        Order order = new Order();
        order.setCake(new Cake.Builder()
                        .cakeColor(Color.BROWN)
                        .flavor(Flavor.CHOCLATE)
                        .frostingFlavor(Flavor.CHOCLATE)
                        .shape(Shape.CIRCLE)
                        .size(Size.LARGE)
                        .build());
        order.setBalloons(Arrays.asList(new Balloon.Builder()
                        .color(Color.RED)
                        .material(Material.MYLAR)
                        .number(4)
                        .build()));
        app.order(order);

         //Place birthday party orders
         //order("red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown" );
         //order("blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown" );
         //order("yellow", "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow" );

    }

    public void order(Order order){
        orderProcessor.process(order);
    }

}
