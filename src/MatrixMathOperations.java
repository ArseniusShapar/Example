public class MatrixMathOperations {
    public Matrix toLowerTriangle(Matrix matrix) {
        int height = matrix.getHeight();
        int width = matrix.getWidth();
        double[][] array = matrix.getArray();
        if (height != width) throw new IllegalArgumentException("Matrix are not square");

        for (int i = height - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                for (int k = 0; k < width; k++) array[j][k] -= array[j][i] / array[i][i] * array[i][k];
            }
        }
        return new Matrix(array);
    }

}
