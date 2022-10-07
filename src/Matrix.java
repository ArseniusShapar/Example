public class Matrix {
    private final int height;
    private final int width;
    private final double[][] array;

    private double[][] secureCopy(double[][] array) {
        double[][] copyArray = new double[height][width];
        for (int i = 0; i < height; i++) {
            System.arraycopy(array[i], 0, copyArray[i], 0, width);
        }
        return copyArray;
    }

    public double[][] getArray() {
        return secureCopy(array);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Matrix() {
        height = 0;
        width = 0;
        array = new double[0][0];
    }

    public Matrix(double[][] array) {
        height = array.length;
        width = array[0].length;
        this.array = secureCopy(array);
    }

    public Matrix toLowerTriangle() {
        MatrixMathOperations matrixMathOperations = new MatrixMathOperations();
        Matrix triangleMatrix = matrixMathOperations.toLowerTriangle(this);
        System.arraycopy(triangleMatrix.array, 0, array, 0, height);
        return this;
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


}
