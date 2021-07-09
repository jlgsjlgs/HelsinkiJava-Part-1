
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared){
        
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Song)){
            return false;
        }
        
        Song comparedsong = (Song) compared;
        
        return (this.name.equals(comparedsong.name) && this.artist.equals(comparedsong.artist) && this.durationInSeconds == comparedsong.durationInSeconds);
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
