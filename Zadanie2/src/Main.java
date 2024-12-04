public class Main {
    public static void main(String[] args) {
        System.out.println("Итальянская кухня:");
        CuisineFactory italianFactory = new ItalianCuisineFactory();
        RestaurantOrderSystem italianOrder = new RestaurantOrderSystem(italianFactory);
        italianOrder.displayOrder();

        System.out.println("\nКитайская кухня:");
        CuisineFactory chineseFactory = new ChineseCuisineFactory();
        RestaurantOrderSystem chineseOrder = new RestaurantOrderSystem(chineseFactory);
        chineseOrder.displayOrder();

        System.out.println("\nМексиканская кухня:");
        CuisineFactory mexicanFactory = new MexicanCuisineFactory();
        RestaurantOrderSystem mexicanOrder = new RestaurantOrderSystem(mexicanFactory);
        mexicanOrder.displayOrder();
    }
}