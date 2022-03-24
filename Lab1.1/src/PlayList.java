import java.util.ArrayList;

public class PlayList {
	
		private ArrayList<Song> playlist;
		
		//Creates a Playlist object that contains an ArrayList for Songs.
		public void Playlist() {
			playlist = new ArrayList<Song>();
		}
		
		//Adds a Song to a Playlist.
		public void addSong(Song song)
		{
			playlist.add(song);
		}
		
		//Returns the size of a Playlist.
		public int getPlaylistSize()
		{
			return playlist.size();
		}
		//Removes the song located at the specified index from the Playlist.
		public void removeSong(int index) {
				playlist.remove(index);
		}
		
		//Clears the Playlist of all Songs by invoking clear() on a Playlist.
		public void deletePlaylist()
		{
			if(playlist.size() == 0)
			{
				System.out.print("Playlist is empty!\n");
			}
			else
			{
				playlist.clear();
				System.out.print("Playlist has been deleted.\n");
			}}}
		