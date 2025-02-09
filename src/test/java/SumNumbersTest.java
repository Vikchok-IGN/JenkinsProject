import static org.junit.Assert.assertEquals;

public class SumNumbersTest {

    @org.junit.Test
    public void sumTestToBePassed() {
        SumNumbers sumNumbers = new SumNumbers();
        int actualResult = sumNumbers.sum(5);
        assertEquals(15, actualResult);
    }

}
