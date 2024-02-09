package ie.atu;

public class Pizza implements MenuItem{
    private String name;
    private String ingredients;
    private double price;

    public Pizza(String name, String ingredients, double price){
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
