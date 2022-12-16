package products;

import electronic.Electronic220V;

public class Cleaner implements Electronic220V {

    @Override
    public void connect() {
        System.out.println("청소기 220V ON");
    }
}
