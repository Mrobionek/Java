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

        System.out.println("Общее количество товаров во всех корзинах: " + Basket.totalCountBacketsProducts);
        System.out.println("Общая стоимость всех товаров во всех корзинах: " + Basket.totalPriceBacketsProducts);

        System.out.println("Средняя цена товара во всех корзинах: " + Basket.getAverageProductPrice());
        System.out.println("Средняя стоимость корзины: " + Basket.getAverageBacketPrice());
    }
}
