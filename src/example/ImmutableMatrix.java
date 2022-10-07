package example;

public class ImmutableMatrix extends Matrix {
    public ImmutableMatrix() {
        super();
    }

    public ImmutableMatrix(double[][] array) {
        super(array);
    }

    public ImmutableMatrix(Matrix matrix) {
        super(matrix.getArray());
    }

    public ImmutableMatrix toLowerTriangle() {
        MatrixMathOperations matrixMathOperations = new MatrixMathOperations();
        Matrix triangleMatrix = matrixMathOperations.toLowerTriangle(this);
        return new ImmutableMatrix(triangleMatrix);
    }

    public void print() {
        int height = super.getHeight();
        int width = super.getWidth();
        double[][] array = super.getArray();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
