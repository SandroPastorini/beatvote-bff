package com.beatvote.app.model.track;


import com.beatvote.app.model.album.Album;
import com.beatvote.app.model.artist.Artist;
import io.micronaut.serde.annotation.Serdeable;

import java.util.List;

@Serdeable
public record Track(
    String id
    , String preview_url
    , String name
    , Long duration_ms
    , String href
    , List<Artist> artists
    , Album album
) { }
