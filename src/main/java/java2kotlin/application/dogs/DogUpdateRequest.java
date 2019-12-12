package java2kotlin.application.dogs;

import java2kotlin.domain.shared.Location;

import java.time.Instant;

public class DogUpdateRequest {

    private String name;

    private Instant lastFeed;

    private Location location;

    private String ownerId;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Instant getLastFeed() {
        return lastFeed;
    }

    public void setLastFeed(Instant lastFeed) {
        this.lastFeed = lastFeed;
    }
}
