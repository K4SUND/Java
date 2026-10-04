package Unknown.linkedlist.playlistChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;

        songs = new ArrayList<>();
    }

    public boolean addSong(String title,double duration)
    {
        // findSong -- check exist

        if(findSong(title) != null)
        {
            return false;
        }
        Song song = new Song(title,duration);
        return songs.add(song);

    }

    private Song findSong(String title)
    {
        for(Song song:songs)
        {
            if(song.getTitle().equalsIgnoreCase(title))
            {
                return song;
            }
        }

        return null;

    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList)
    {
        try{
            Song song = songs.get(trackNumber);
            return true;

        }catch (Exception e)
        {
            return false;
        }

    }

    public boolean addToPlayList(String  title, LinkedList<Song> playList)
    {

        Song song = findSong(title);
        // findSong -- check exist
        if(song != null)
        {
            return playList.add(song);
        }

        return false;
    }
}
