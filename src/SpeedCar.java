import java.util.Objects;

public class SpeedCar<T> implements Movement{

    private String name;
    private T id;

    public SpeedCar(String name, T id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public void GoTo() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeedCar<?> speedCar = (SpeedCar<?>) o;
        System.out.println("Work my equals");
        return getName().equals(speedCar.getName()) && getId().equals(speedCar.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "My to String. Name = " + getName() + " id = " + getId() + " class - " + getClass();
    }
}
