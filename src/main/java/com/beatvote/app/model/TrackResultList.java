package com.beatvote.app.model;

import com.beatvote.app.model.track.TrackList;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record TrackResultList(
        TrackList tracks
) { }
