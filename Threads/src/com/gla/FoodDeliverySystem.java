package com.gla;

class Order {
    private String orderId;
    private String restaurantName;
    private int deliveryTimeSeconds;

    public Order(String id, String restaurant, int timeSeconds) {
        this.orderId = id;
        this.restaurantName = restaurant;
        this.deliveryTimeSeconds = timeSeconds;
    }

    public String getOrderId() { return orderId; }
    public String getRestaurantName() { return restaurantName; }
    public int getDeliveryTimeSeconds() { return deliveryTimeSeconds; }
}

class DeliveryAgent implements Runnable {
    private Order order;
    private String type;

    public DeliveryAgent(Order order, String type) {
        this.order = order;
        this.type = type;
    }

    @Override
    public void run() {
        String agentName = Thread.currentThread().getName();
        long startTime = System.currentTimeMillis();
        System.out.println(agentName + " (" + type + " priority " + Thread.currentThread().getPriority() + ") picked up order " + order.getOrderId() + " from " + order.getRestaurantName());
        
        System.out.println(agentName + " handling order " + order.getOrderId() + " -> In Transit");
        try {
            Thread.sleep(order.getDeliveryTimeSeconds() * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println(agentName + " handling order " + order.getOrderId() + " -> Delivered. Total time: " + (endTime - startTime) + "ms");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Thread agent1 = new Thread(new DeliveryAgent(new Order("ORD001", "Pizza Hut", 2), "Express"), "Agent-Alice");
        agent1.setPriority(10);
        
        Thread agent2 = new Thread(new DeliveryAgent(new Order("ORD002", "Burger King", 3), "Express"), "Agent-Bob");
        agent2.setPriority(10);
        
        Thread agent3 = new Thread(new DeliveryAgent(new Order("ORD003", "Subway", 4), "Standard"), "Agent-Charlie");
        agent3.setPriority(5);
        
        Thread agent4 = new Thread(new DeliveryAgent(new Order("ORD004", "KFC", 5), "Standard"), "Agent-Dave");
        agent4.setPriority(5);
        
        Thread agent5 = new Thread(new DeliveryAgent(new Order("ORD005", "Taco Bell", 6), "Economy"), "Agent-Eve");
        agent5.setPriority(3);

        agent1.start();
        agent2.start();
        agent3.start();
        agent4.start();
        agent5.start();
    }
}
