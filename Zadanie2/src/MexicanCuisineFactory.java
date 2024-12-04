public class MexicanCuisineFactory implements CuisineFactory {
    @Override
    public Appetizer createAppetizer() {
        return new MexicanAppetizer();
    }

    @Override
    public MainCourse createMainCourse() {
        return new MexicanMainCourse();
    }

    @Override
    public Dessert createDessert() {
        return new MexicanDessert();
    }
}