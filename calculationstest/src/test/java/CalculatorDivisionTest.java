import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorDivisionTest {

    private double xTest;
    private double yTest;
    private double expectedResult;

    private Calculator calculator;

    public CalculatorDivisionTest(double xTest, double yTest, double expectedResult) {
        this.xTest = xTest;
        this.yTest = yTest;
        this.expectedResult = expectedResult;
    }

    @Test
    public void givenCalculatorWhenDivisionThenProperResult() {
        //Given
        calculator = new Calculator();
        //When
        calculator.division(xTest, yTest);
        //Then
        Assert.assertEquals(expectedResult, calculator.getResult(), 0.0001);
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {19.00903645, 0, 3.210874676},
                {19.84350231, 7.697260216, 2.577995514},
                {4.086794873, 8.802521674, 0.464275468},
                {11.26655505, 3.242787194, 3.474343018},
                {42.74268685, 1.011054444, 42.27535631},
                {38.61281746, 7.014601589, 5.504634436},
                {46.96651047, 7.264331924, 6.465358543},
                {4.634775788, 2.216873796, 2.090680938},
                {40.38595797, 9.526688758, 4.239243981},
                {23.24400652, 9.60926331, 2.418916598},
                {39.44478868, 4.792124907, 8.231168729},
                {3.759929095, 0, 803.6721797},
                {31.40277853, 2.723433516, 11.53058386},
                {46.92360095, 0.450023591, 104.2692025},
                {0.342369156, 0.434557543, 0.787856895},
                {17.07880818, 6.891458723, 2.478257342},
                {27.77126625, 3.985068397, 6.968830514},
                {21.28996247, 3.547876715, 6.000761633},
                {49.59342899, 0.302307534, 164.0495968},
                {18.50479806, 0.016558052, 1117.570951},
        });
    }

}