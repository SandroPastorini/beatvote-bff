package com.beatvote.app.clients;

import com.beatvote.app.model.TrackResultList;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;

import static io.micronaut.http.HttpHeaders.ACCEPT;
import static io.micronaut.http.HttpHeaders.USER_AGENT;

@Client("connector")
@Header(name = USER_AGENT, value = "Micronaut HTTP Client")
@Header(name = ACCEPT, value = "application/json")
public interface ConnectorClient {
    @Get("/search/track/{s}")
    public Publisher<TrackResultList> searchTracks(@PathVariable("s") String s);
}
