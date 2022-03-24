
public class Song {

	String title;
	int duration;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Song(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + "]";
	}
}
