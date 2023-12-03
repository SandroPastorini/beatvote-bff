package com.beatvote.app.model.album;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record Album(

        String name
        , String release_date
        , String href
) {
}
