public class Main {
    public static void main(String[] args) {
        RealEstate realEstate = new RealEstate();
        User user1 = new User("Иван");
        User user2 = new User("Мария");
        realEstate.addObserver(user1);
        realEstate.addObserver(user2);
        realEstate.setPropertyDetails("Новое предложение: Квартира, 2 комнаты, цена 3,000,000 рублей");
        realEstate.setPropertyDetails("Новое предложение: Квартира, 3 комнаты, цена 4,200,000 рублей");
        realEstate.removeObserver(user1);
        realEstate.setPropertyDetails("Новое предложение: Коттедж, 5 комнат, цена 8,000,000 рублей");
    }
}
