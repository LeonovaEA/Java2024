import java.util.ArrayList;
import java.util.List;

public class RealEstate implements Subject {
    private List<Observer> observers;
    private String propertyDetails;

    public RealEstate() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(propertyDetails);
        }
    }

    public void setPropertyDetails(String propertyDetails) {
        this.propertyDetails = propertyDetails;
        notifyObservers();
    }
}
