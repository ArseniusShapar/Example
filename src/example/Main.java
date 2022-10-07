package example;

public class Main {
    public static void main(String[] args) {
        double[][] array = new double[][] {
                {1.2, 2.7},
                {-2.0, 1.3}};
        Matrix matrix = new Matrix(array);
        ImmutableMatrix immutableMatrix = new ImmutableMatrix(array);
        matrix.toLowerTriangle().print();
        immutableMatrix.toLowerTriangle().print();
        immutableMatrix.print();

    }
}