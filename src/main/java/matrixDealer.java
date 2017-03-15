public class matrixDealer {

    public int count(int[][] matrix) {
        int amount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > i + j) {
                    amount++;
                }
            }
        }

        return amount;
    }

    public void matrixStringSwap(int[][] matrix, int k1, int k2) throws WrongKException {
        if (k1 >= matrix.length || k2 >= matrix.length || k1 < 0 || k2 < 0)
            throw new WrongKException();


        int[] tmp = matrix[k1];
        matrix[k1] = matrix[k2];
        matrix[k2] = tmp;


    }

}

