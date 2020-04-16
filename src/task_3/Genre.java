package task_3;

public enum Genre {
    AMBIENT,
    CLASSIC,
    RAP;

    public static Genre setGenre(String nameOfGenre){
        Genre genre = null;
        switch (nameOfGenre){
            case "AMBIENT": {
                genre = AMBIENT;
                break;
            }
            case "CLASSIC": {
                genre = CLASSIC;
                break;
            }
            case "RAP": {
                genre = RAP;
                break;
            }
            default:{
                //надо сделать экспешн
            }
        }
        return genre;
    }
}
