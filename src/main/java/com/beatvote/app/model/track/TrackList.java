package com.beatvote.app.model.track;

import io.micronaut.serde.annotation.Serdeable;

import java.util.List;

@Serdeable
public record TrackList(
        String href
        , Integer total
        , List<Track> items
) {
}
