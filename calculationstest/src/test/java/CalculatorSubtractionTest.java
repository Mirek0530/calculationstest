import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorSubtractionTest {

    private double xTest;
    private double yTest;
    private double expectedResult;

    private Calculator calculator;

    public CalculatorSubtractionTest(double xTest, double yTest, double expectedResult) {
        this.xTest = xTest;
        this.yTest = yTest;
        this.expectedResult = expectedResult;
    }

    @Test
    public void givenCalculatorWhenSubtractionThenProperResult() {
        //Given
        calculator = new Calculator();
        //When
        calculator.subtraction(xTest, yTest);
        //Then
        Assert.assertEquals(expectedResult, calculator.getResult(),0.0001);
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {9.549845215, 25.23017138, -15.68032616},
                {67.05608089, 49.80260316, 17.25347773},
                {86.66540736, 82.20886631, 4.456541054},
                {44.22316172, 73.52997493, -29.30681321},
                {19.00599831, 9.316908332, 9.689089978},
                {86.07380137, 29.89666713, 56.17713424},
                {70.11523494, 81.61429987, -11.49906493},
                {35.76120761, 8.424058799, 27.33714881},
                {32.65013909, 83.76835397, -51.11821488},
                {89.17977782, 99.31932514, -10.13954732},
                {63.90746623, 67.9825345, -4.075068275},
                {12.04353167, 15.62949955, -3.585967883},
                {82.16465579, 10.0905497, 72.07410609},
                {8.098280407, 1.377797815, 6.720482592},
                {66.1562135, 12.19109241, 53.96512109},
                {63.7805181, 10.8026, 52.9779181},
                {54.09697421, 36.27668059, 17.82029362},
                {17.61597128, 29.01566717, -11.39969589},
                {26.71932373, 17.78949614, 8.929827595},
                {78.32371598, 8.049451043, 70.27426493}
        });
    }


}