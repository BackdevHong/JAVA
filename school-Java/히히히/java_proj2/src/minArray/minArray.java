package minArray;

public class minArray {

    public static double searchMinArray(double[] list){
        double min = list[0];

        for (double v : list) {
            if (min > v) min = v;
        }
        return min;
    }


    public static void main(String[] args) {
        double[] a = {0.1, 1.0, 20.0, 50.0, 10000.0};
        double[] b = {0.9, 1.0, 20.0, 50.0, 10000.0};

        double min;
        double min2;

        min = searchMinArray(a);
        min2 = searchMinArray(b);

        System.out.println(min);
        System.out.println(min2);
    }
}
