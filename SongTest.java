package friday13.bullshit;

public class SongTest {
    public static void main(String[] args) {
        Song songList = new Song("Neighborhood Hero","Lil Durk");
        songList.setTitle();
        songList.play();
        songList.favoriteTrack();

        System.out.println(songList);
    }
}
