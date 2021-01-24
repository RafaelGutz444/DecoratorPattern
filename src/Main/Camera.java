package Main;

public class Camera extends InputControl {

    public Camera(TwitchStream tempScene) {
        super(tempScene);
    }

    @Override
    public String transition() {
        System.out.print("Camera feed is being captured.");
        return null;
    }
}
