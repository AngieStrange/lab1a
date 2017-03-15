import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class TestMatrixDealer {

    @Test
    public void testCount() {
        int[][] test_matrix = {

                {2, 0, 0},
                {0, -1, 0},
                {0, 0, 0}

        };

        matrixDealer md = new matrixDealer();

        int calculated = md.count(test_matrix);

        int expectCount = 1;

        assertEquals(expectCount, calculated);


    }

    @Test
    public void testCountZeroes() {
        int[][] test_matrix = {

                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}

        };

        matrixDealer md = new matrixDealer();

        int calculated = md.count(test_matrix);

        int expectCount = 0;

        assertEquals(expectCount, calculated);
    }

    @Test
    public void testSwapStrings() throws WrongKException {
        int[][] test_matrix = {

                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}

        };

        int[][] result_matrix = {


                {2, 2, 2},
                {1, 1, 1},
                {3, 3, 3}

        };
        matrixDealer md = new matrixDealer();
        md.matrixStringSwap(test_matrix, 0, 1);
        assertArrayEquals(result_matrix, test_matrix);
    }

    @Test(expected = WrongKException.class)
    public void testWrongKException() throws WrongKException {
        int[][] test_matrix = {

                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}

        };
        matrixDealer md = new matrixDealer();
        md.matrixStringSwap(test_matrix, 5, 6);

    }
}



