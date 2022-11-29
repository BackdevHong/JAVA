package threeDPrinter.useGeneric;

public class GenericPrinter<T> {
    public T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
}
