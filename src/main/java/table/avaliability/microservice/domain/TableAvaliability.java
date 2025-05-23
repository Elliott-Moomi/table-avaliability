package table.avaliability.microservice.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "table-avaliablity")
public class TableAvaliability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @Column(name = "location")
    private String location;

    @Column(name = "avaliable")
    private boolean avaliable;

    public TableAvaliability() {}

    public TableAvaliability(long id, int capacity, String location, boolean avaliable) {
        this.id = id;
        this.capacity = capacity;
        this.location = location;
        this.avaliable = avaliable;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

}
