package example;

public class Main {
    public static void main(String[] args) {
        double[][] array = new double[][] {
                {1, 2},
                {4, 2}};
        Matrix matrix = new Matrix(array);
        ImmutableMatrix immutableMatrix = new ImmutableMatrix(array);

        matrix.toLowerTriangle().print();
        System.out.println();

        immutableMatrix.toLowerTriangle().print();
        System.out.println();

        immutableMatrix.print();

    }
}