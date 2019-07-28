package collection.section1.lecture67;

import java.util.concurrent.TimeUnit;

public class Song {

    private String title;
    private long duration;

    public Song() {

    }

    public Song(String title, long duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public long getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing the song: " + this.getTitle());
        try {
            TimeUnit.SECONDS.sleep(this.getDuration());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
