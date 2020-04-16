package task_4;

import java.util.List;

public class Classic extends Track {

    public  Classic(String name, String author, int lengthOfTrack){
        super(name, author, lengthOfTrack);
        setGenre(Genre.CLASSIC);
    }

    /*
     *@deprecated replaced by {@link #writingNameAndGithub()}
     */
    @Deprecated
    public void writingName(){
        System.out.println("NikKrein");
    }

    public void writingNameAndGithub(){
        System.out.println("NikKrein - https://github.com/NikitaKrein");
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


    // Use SuppressWarnings
    private List versions;
    @SuppressWarnings("unchecked")
    public void addVersion(String version) {
        versions.add(version);
    }
}
