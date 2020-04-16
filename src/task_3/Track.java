package task_3;

public class Track {
    private int lengthOfTrack;
    private String name, author;
    private Genre genre;

    public Track(String name, String author, int lengthOfTrack){
        this.name = name;
        this.author = author;
        this.lengthOfTrack = lengthOfTrack;
    }

    public int getLengthOfTrack() {
        return this.lengthOfTrack;
    }
    public void setLengthOfTrack(int lengthOfTrack){
        this.lengthOfTrack = lengthOfTrack;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public Genre getGenre() {
        return this.genre;
    }
    public void setGenre(Genre genre){
        this.genre = genre;
    }

    public int getCostOfSong(){
        return 11;
    }

    @Override
    public String toString(){
        String s = name + "(" + author + ") - " + genre + " - " + (lengthOfTrack / 60) + ":" + (lengthOfTrack % 60);
        return s;
    }
}