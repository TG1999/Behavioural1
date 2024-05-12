package Stratergy;

public class Main {
    public static void main(String[] args) {
        // Create video player
        VideoPlayer player = new VideoPlayer();

        // Free user scenario
        player.setPlayStrategy(new FreeUserPlayStrategy());
        player.playVideo("Avengers");

        // Premium user scenario
        player.setPlayStrategy(new PremiumUserPlayStrategy());
        player.playVideo("The Godfather");
    }
}
