package ie.atu;

import java.util.ArrayList;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        System.out.println("Online Ordering System.");
                ArrayList <MenuItem> menuItems = new ArrayList<MenuItem>() ;
                menuItems.add(new Burger ("Classic Burger", "Beef Patty, Lettuce, Tomato, Cheese", 8.99));
                menuItems.add(new Pizza ("Margherita Pizza", "Tomato Sauce, Mozzarella, Basil", 12.99));
                menuItems.add(new Salad ("Caesar Salad", "Romaine Lettuce, Croutons, Caesar Dressing", 6.99));
                menuItems.add(new Dessert ("Vanilla Ice Cream", "Vanilla, Ice Cream", 4.99));


        for (MenuItem menuItem : menuItems){
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Description: " + menuItem.getDescription());
            System.out.println("Price: $" + menuItem.getPrice() + "\n");
        }

        double totalCost = 0;
        for (MenuItem menuItem : menuItems){
            totalCost = totalCost + menuItem.getPrice();
        }
        System.out.println("Total Cost: $" + totalCost);

    }
}