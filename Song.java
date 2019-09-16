package friday13.bullshit;

public class Song {

    public String title;
    public String artist;

    public Song(String title, String artist){
        this.title=title;
        this.artist=artist;
    }

    public void setTitle(){
        System.out.println(title);
    }

    public void play(){
        System.out.println(artist);
    }

    public void favoriteTrack(){
        String[] xyz = {"track 1", "track 2", "track 3", "track 4", "track 5",
        "track 6", "track 7", "track 8", "track 9"};
        String mostPlayed = xyz[xyz.length-2];
        System.out.println(mostPlayed);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
