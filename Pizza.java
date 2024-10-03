public class Pizza {
    String size;
    String crust;
    String cheese;
    String topping;
    
    public Pizza(String size, String crust, String cheese, String topping){
        this.size = size;
        this.crust = crust;
        this.cheese = cheese;
        this.topping = topping;
    }
    
    public void displayPizza() {
        String pizza = "a" + this.size + "pizza with " + this.crust + "crust" + this.cheese + "cheese and" + this.topping;
        System.out.println(pizza);
    }
}