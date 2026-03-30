package Default;
//The Independent Class (Song)
class Song {
    String title;
    String artist;
}
//The Container Class Play list
class Playlist {
    Song track;

    void playSong(Song banger) {
        track = banger;
        System.out.println("Now Playing: " + track.title);
        System.out.println("Artist: " + track.artist);
    }
}

//This is where the objects are instantiated and the HAS-A relationship is established.
public class MusicApp {
    public static void main(String[] args) {
        // Create the Song object independently
        Song hitSong = new Song();
        hitSong.title = "Kolaveri Di";
        hitSong.artist = "Dhanush";

        // Create the Play list and link the song to it
        Playlist myPlaylist = new Playlist();
        myPlaylist.track = hitSong;

        // Play the song through the play list
        myPlaylist.playSong(hitSong);

        // Prove the song still exists independently
        System.out.println("This song is fire! It’s also on my friend’s playlist!");
        System.out.println("Song: " + hitSong.title + " by " + hitSong.artist);
    }
}