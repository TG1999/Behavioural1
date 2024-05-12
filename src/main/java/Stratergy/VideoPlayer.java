package Stratergy;

// Define the strategy interface
interface VideoPlayStrategy {
    void play(String video);
}

// Concrete strategy for free users
class FreeUserPlayStrategy implements VideoPlayStrategy {
    @Override
    public void play(String video) {
        System.out.println("Playing video '" + video + "' for free users...");
    }
}

// Concrete strategy for premium users
class PremiumUserPlayStrategy implements VideoPlayStrategy {
    @Override
    public void play(String video) {
        System.out.println("Playing video '" + video + "' for premium users...");
    }
}

// Context class
class VideoPlayer {
    private VideoPlayStrategy playStrategy;

    // Set the strategy dynamically
    public void setPlayStrategy(VideoPlayStrategy playStrategy) {
        this.playStrategy = playStrategy;
    }

    // Play video using the selected strategy
    public void playVideo(String video) {
        if (playStrategy != null) {
            playStrategy.play(video);
        } else {
            System.out.println("No play strategy set.");
        }
    }
}

