public class RestaurantOrderSystem {
    private final CuisineFactory factory;

    public RestaurantOrderSystem(CuisineFactory factory) {
        this.factory = factory;
    }

    public void displayOrder() {
        Appetizer appetizer = factory.createAppetizer();
        MainCourse mainCourse = factory.createMainCourse();
        Dessert dessert = factory.createDessert();

        System.out.println("Ваш заказ:");
        System.out.println("- Закуска: " + appetizer.getDescription());
        System.out.println("- Основное блюдо: " + mainCourse.getDescription());
        System.out.println("- Десерт: " + dessert.getDescription());
    }
}