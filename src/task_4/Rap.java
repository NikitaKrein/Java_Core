package task_4;

public class Rap extends Track {

    public  Rap(String name, String author, int lengthOfTrack){
        super(name, author, lengthOfTrack);
        setGenre(Genre.RAP);
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
    public int getCostOfSong(int cost){
        cost += this.hashCode() - 125;
        return cost;
    }
}