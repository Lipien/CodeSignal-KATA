package pl.pawtel.song;

/*
 This code is a practice Java interview question from testdome.com
 Problem statement:
    A playlist is considered a repeating playlist if any of the songs contain a reference to a previous song in the playlist. Otherwise, the playlist will end with the last song which points to null.
    Implement a function isRepeatingPlaylist that, efficiently with respect to time used, returns true if a playlist is repeating or false if it is not.
 + Passes 4/4 tests
 */

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Song slow = this.nextSong;
        Song fast = slow == null ? null : slow.nextSong;
        while (fast != null) {
            if (slow == this || slow == fast)
                return true;
            slow = slow.nextSong;
            fast = fast.nextSong;
            if (fast != null)
                fast = fast.nextSong;
        }
        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
        Song third = new Song("Eye of the tiger remix");

        first.setNextSong(second);
        second.setNextSong(third);
        third.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
