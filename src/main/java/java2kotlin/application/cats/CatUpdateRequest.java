package java2kotlin.application.cats;

import java2kotlin.domain.shared.Location;

import java.time.Instant;

public class CatUpdateRequest {

    private String name;

    private Instant lastFeed;

    private Location location;

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
