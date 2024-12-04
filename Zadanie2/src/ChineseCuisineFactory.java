public class ChineseCuisineFactory implements CuisineFactory {
    @Override
    public Appetizer createAppetizer() {
        return new ChineseAppetizer();
    }

    @Override
    public MainCourse createMainCourse() {
        return new ChineseMainCourse();
    }

    @Override
    public Dessert createDessert() {
        return new ChineseDessert();
    }
}