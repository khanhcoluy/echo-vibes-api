package apiservices.echovibesapp.services;

import apiservices.echovibesapp.models.song.Song;
import apiservices.echovibesapp.repository.SongRepository;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    @Override
    public void save(Song song) {
        songRepository.save(song);
    }
}
