package observerPattern;

public class Follower implements Observer {
    private String followerName;

    public Follower(String name) {
        this.followerName = name;
    }

    @Override
    public void update(String name, String text) {
        System.out.println(followerName+"a primit notificare de la "+name+"cu mesajul"+text);
    }
}
