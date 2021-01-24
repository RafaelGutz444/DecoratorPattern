package Main;

public abstract class InputControl implements TwitchStream {
    protected TwitchStream tempScene;

    public InputControl(TwitchStream tempScene) {
        this.tempScene = tempScene;
    }

    public String transition() {
        tempScene.transition();
        return null;
    }
}