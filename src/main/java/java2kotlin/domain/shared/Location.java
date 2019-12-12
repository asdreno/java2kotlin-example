package java2kotlin.domain.shared;

import java.util.Objects;

public class Location {

    private final Long latitude;

    private final Long longitude;

    public Location(Long latitude, Long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public Long getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return Objects.equals(latitude, location.latitude) &&
                Objects.equals(longitude, location.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }
}
