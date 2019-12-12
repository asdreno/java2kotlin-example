package Java2Kotlin.application;

import Java2Kotlin.domain.shared.Location;

public class CatUpdateRequest {

    private String name;

    private Integer energy;

    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
