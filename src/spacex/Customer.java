package spacex;

import java.util.Objects;

public class Customer {
    private String name;
    private String type;
    private String country;

    public Customer() {
        // Default constructor
    }

    public Customer(String name, String type, String country) {
        this.name = name;
        this.type = type;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
                Objects.equals(type, customer.type) &&
                Objects.equals(country, customer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, country);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\''+
                ", country='" + country + ")";
    }
}
