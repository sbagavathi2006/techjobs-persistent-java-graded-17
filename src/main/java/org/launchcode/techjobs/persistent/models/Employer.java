package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;
@Entity
public class Employer extends AbstractEntity {
    @NotNull(message = "Location is required")
    @Size(min =2, max = 100, message = "Location must be between 2 and 100 characters")
    private String location;

//    public Employer(String location) {
////    super(name);
//    this.location = location;
//    }
    public Employer() {   }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employer employer = (Employer) o;
        return Objects.equals(location, employer.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location);
    }

}
