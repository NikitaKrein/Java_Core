package task_5;

public class Ambient extends Track {

    public  Ambient(String name, String author, int lengthOfTrack){
        super(name, author, lengthOfTrack);
        setGenre(Genre.AMBIENT);
    }

    @Override
    public int getLengthOfTrack() {
        return super.getLengthOfTrack();
    }
    @Override
    public void setLengthOfTrack(int lengthOfTrack) {
        super.setLengthOfTrack(lengthOfTrack);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }
    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public Genre getGenre() {
        return super.getGenre();
    }
    @Override
    public void setGenre(Genre genre) {
        super.setGenre(genre);
    }

    @Override
    public int getCostOfSong(int cost) {
        return 0;
    }

    @Override
    public String toString() {
        return (super.toString() + " - cost:" + getCostOfSong(55) + "$");
    }
}