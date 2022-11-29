package threeDPrinterWithTextend;

public class GenericPrinter<T extends Material> {
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
