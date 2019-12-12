package Java2Kotlin.domain.cat;

import Java2Kotlin.domain.shared.Location;

import java.time.Instant;

public class Cat {

    private String id;

    private String name;

    private Instant lastFeed;

    private Location location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
