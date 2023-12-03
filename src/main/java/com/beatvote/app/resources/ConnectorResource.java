package com.beatvote.app.resources;

import com.beatvote.app.clients.ConnectorClient;
import com.beatvote.app.model.TrackResultList;
import com.beatvote.app.model.track.TrackList;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import org.reactivestreams.Publisher;

@Controller("/track")
public class ConnectorResource {
    private final ConnectorClient connectorClient;

    public ConnectorResource(ConnectorClient connectorClient) {
        this.connectorClient = connectorClient;
    }

    @Get("/{q}")
    Publisher<TrackResultList> searchTracks(@PathVariable("q") String q) {
        return connectorClient.searchTracks(q);
    }
}
