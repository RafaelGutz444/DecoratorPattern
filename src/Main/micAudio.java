package Main;

public class micAudio extends InputControl {

    public micAudio(TwitchStream tempScene) {
        super(tempScene);
    }

    @Override
    public String transition() {
        System.out.print("Mic audio being captured.");
        return null;
    }
}
