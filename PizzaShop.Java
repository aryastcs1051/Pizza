import java.util.ArrayList;
import java.util.Scanner;

public class PizzaShop {
    String[] sizes = {"small", "medium", "large"};
    String[] crusts = {"thin", "deep dish", "cheese-stuffed"};
    String[] cheeses = {"regular", "extra"}
    String[] toppings = {"Pepperoni", "bacon", "Pinaples", "meat lovers", "veggies"}

    ArrayList<Pizza> orders;
    
    public PizzaShop(){
        this.orders = new ArrayList<Pizza>();
    }
    public void placeOrder(){
        System.out.println("What size pizza? ");
        
            
        }
        listOptions(this.sizes);
        listOptions(this.crusts);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice_index = scanner.nextInt() - 1;
        String size = this.sizes[choice]
        System.out.println("You chose" + size);
    }
    private voice listOptions(String[] options) {
        for(int i = 0; i < options.length; i++){
            String num = Integer.toString(i+1);
            System.out.println(sizes[i]);
    }
}