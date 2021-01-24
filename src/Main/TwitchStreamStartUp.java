package Main;


public class TwitchStreamStartUp {
    public static void main(String[] args) {

        // Adds Music to the stream
        TwitchStream scene = new Music(new emptyScene());
        scene.transition();

        // Adds Camera feed to the stream
        TwitchStream scene1 = new Camera(new emptyScene());
        scene1.transition();

        // Adds microphone audio to the stream
        TwitchStream scene2 = new micAudio(new emptyScene());
        scene2.transition();




    }

}
