public class ItalianCuisineFactory implements CuisineFactory {
    @Override
    public Appetizer createAppetizer() {
        return new ItalianAppetizer();
    }

    @Override
    public MainCourse createMainCourse() {
        return new ItalianMainCourse();
    }

    @Override
    public Dessert createDessert() {
        return new ItalianDessert();
    }
}