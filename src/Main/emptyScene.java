package Main; // Unmodified Object

public class emptyScene implements TwitchStream {

    @Override
    public String transition() {
        System.out.print("Blank screen");

        return null;
    }
}
