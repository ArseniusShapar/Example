public class ImmutableMatrix extends Matrix {
    private double[][] secureCopy(double[][] array) {
        int height = super.getHeight();
        int width = super.getWidth();
        double[][] copyArray = new double[height][width];
        for (int i = 0; i < height; i++) {
            System.arraycopy(array[i], 0, copyArray[i], 0, width);
        }
        return copyArray;
    }

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
