package Java2Kotlin.domain.dog;

import Java2Kotlin.domain.Owner;
import Java2Kotlin.domain.shared.Location;

import java.time.Instant;

public class Dog {

    private String id;

    private String name;

    private Instant lastFeed;

    private Location location;

    private String race;

    private Owner owner;

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

    public Instant getLastFeed() {
        return lastFeed;
    }

    public void setLastFeed(Instant lastFeed) {
        this.lastFeed = lastFeed;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
