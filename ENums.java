import Enums.Pizza;

public class ENums {
    public static void main(String[] args) {
        System.out.println(Pizza.Tikka.getValue().toString() + " -" + Pizza.Tikka.toString());
        System.out.println(Pizza.Vegitable.getValue().toString() + " -" + Pizza.Vegitable.toString());
        System.out.println(Pizza.Cheeze.getValue().toString() + " -" + Pizza.Cheeze.toString());
        System.out.println("Enter Your choice");
        String input = System.console().readLine();
        if (input.equals(Pizza.Tikka.getValue().toString())) {
            System.out.println(Pizza.Tikka.toString());
        } else if (input.equals(Pizza.Vegitable.getValue().toString())) {
            System.out.println(Pizza.Vegitable.toString());
        } else if (input.equals(Pizza.Cheeze.getValue().toString())) {
            System.out.println(Pizza.Cheeze.toString());
        } else {
            System.out.println("Sorry Invalid!");
        }

    }
}
