package apiservices.echovibesapp.repository.playlist;

import apiservices.echovibesapp.models.playlist.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
}
