package scrap.heap.refactor.impl;

import scrap.heap.refactor.OrderProcessor;
import scrap.heap.refactor.entity.Balloon;
import scrap.heap.refactor.entity.Cake;
import scrap.heap.refactor.entity.Order;

public class OrderProcessorImpl implements OrderProcessor {
    @Override
    public void process(Order order) {
        if (order != null) {
            if (order.getCake() != null) {
                process(order.getCake());
            }
            if (order.getBalloons() != null && !order.getBalloons().isEmpty()) {
                order.getBalloons()
                        .forEach(this::process);
            }

        }


    }

    public void process(Balloon balloon) {
        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloon.getColor().name() + ", " + balloon.getMaterial().name() + ", " + balloon.getNumber());

    }

    public void process(Cake cake) {
        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + cake.getFlavor().name() + ", " + cake.getFrostingFlavor().name() + ", " + cake.getShape().name() + ", " + cake.getSize() + ", " + cake.getCakeColor().name());
    }
}
