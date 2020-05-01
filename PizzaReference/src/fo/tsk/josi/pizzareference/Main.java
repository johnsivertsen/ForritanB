package fo.tsk.josi.pizzareference;

public class Main {

    public static void main(String[] args) {
        Grill grill = new Grill();
        Pizza pizza = new Pizza();
        grill.pizzaReference = pizza;
        grill.GetPizzaKind();
    }
}
