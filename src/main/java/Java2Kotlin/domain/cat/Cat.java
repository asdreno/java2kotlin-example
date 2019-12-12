package Java2Kotlin.domain.cat;

import Java2Kotlin.domain.shared.Location;

public class Cat {

    private String id;

    private String name;

    private Integer energy;

    private Location location;

    public void feed(int amount){
        if(energy == null){
            energy = 0;
        }
        energy += amount;
    }

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
