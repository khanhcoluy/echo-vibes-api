package apiservices.echovibesapp.models.playlistSong;

import jakarta.persistence.*;

@Entity
@Table(name = "playlist_songs")
public class PlaylistSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "playlist_id")
    private Integer playlistId;

    @Column(name = "song_id")
    private Integer songId;

    public Integer getId() {
        return id;
    }

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }
}
