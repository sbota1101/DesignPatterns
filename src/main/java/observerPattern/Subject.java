package observerPattern;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyAllObservers(String text);
    public void postText(String text);
}
