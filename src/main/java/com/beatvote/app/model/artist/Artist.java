package com.beatvote.app.model.artist;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record Artist(
        String name
        , String href
) {
}
