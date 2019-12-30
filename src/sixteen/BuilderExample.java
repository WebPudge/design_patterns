package sixteen;

public class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();

        Pizza hPizza = waiter.getPizza();
        System.out.println("hawaiian: " + hPizza);
        waiter.setPizzaBuilder( spicy_pizzabuilder );
        waiter.constructPizza();

        Pizza sPizza = waiter.getPizza();
        System.out.println("spicy: " + sPizza);
    }
}
