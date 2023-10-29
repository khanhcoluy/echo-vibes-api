package apiservices.echovibesapp.repository.playlistSong;

import apiservices.echovibesapp.models.playlistSong.PlaylistSong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistSongRepository extends JpaRepository<PlaylistSong, Integer> {
}
