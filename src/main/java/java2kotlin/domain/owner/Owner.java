package java2kotlin.domain.owner;

import java2kotlin.domain.shared.Address;
import org.jetbrains.annotations.Nullable;

public class Owner {

    @Nullable
    private String id;

    @Nullable
    private String name;

    @Nullable
    private Address address;

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

    @Nullable
    public Address getAddress() {
        return address;
    }

    public void setAddress(@Nullable Address address) {
        this.address = address;
    }
}
