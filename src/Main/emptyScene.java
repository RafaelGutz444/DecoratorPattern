package Main;

public class emptyScene implements TwitchStream {

    @Override
    public String transition() {
        System.out.print("Blank screen");

        return null;
    }
}
