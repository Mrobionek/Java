public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 2);
        basket.print("Milk");

        Basket breadBasket = new Basket();
        breadBasket.add("Bread", 30, 3, 50);
        breadBasket.print("\n" + "Bread");
        int totalPrice = basket.getTotalPrice();
        double totalWeight = breadBasket.getTotalWeight();
        System.out.println("Общая цена товаров: " + totalPrice);
        System.out.println("Общий вес товаров: " + totalWeight );
    }
}
