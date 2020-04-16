package task_3;

public class Runner {
    public static void main(String[] args) {
        Track track = new Classic("name", "author", 222);
        System.out.println(track);
        ((Classic) track).writingName();
        ((Classic) track).writingNameAndGithub();
        Play<String> play = () -> "Example Functional Interface";
        System.out.println(play.playing());
    }
}
