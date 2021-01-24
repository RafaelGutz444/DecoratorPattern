package Main;

public class Music extends InputControl {

    public Music(TwitchStream tempScene) {
        super(tempScene);
    }

    @Override
    public String transition() {
        System.out.print("Music is on.");
        return null;
    }
}
