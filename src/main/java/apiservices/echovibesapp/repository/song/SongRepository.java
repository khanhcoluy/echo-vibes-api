package apiservices.echovibesapp.repository.song;

import apiservices.echovibesapp.models.song.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {
}
