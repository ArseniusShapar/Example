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

    @Override
    public ImmutableMatrix toLowerTriangle() {
        MatrixMathOperations matrixMathOperations = new MatrixMathOperations();
        Matrix triangleMatrix = matrixMathOperations.toLowerTriangle(this);
        return new ImmutableMatrix(triangleMatrix);
    }

}
