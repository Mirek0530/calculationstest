import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorAdditionTest {

    private double xTest;
    private double yTest;
    private double expectedResult;

    private Calculator calculator;

    public CalculatorAdditionTest(double xTest, double yTest, double expectedResult) {
        this.xTest = xTest;
        this.yTest = yTest;
        this.expectedResult = expectedResult;
    }

    @Test
    public void givenCalculatorWhenAdditionThenProperResult() {
        //Given
        calculator = new Calculator();
        //When
        calculator.addition(xTest, yTest);
        //Then
        Assert.assertEquals(expectedResult, calculator.getResult(), 0.0001);
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {83.64975091, 9.729855249, 93.37960616},
                {35.71603969, 69.34549088, 105.0615306},
                {40.39001806, 4.118343844, 44.50836191},
                {68.15671175, 77.56465609, 145.7213678},
                {57.82969441, 19.16191164, 76.99160605},
                {45.13571506, 6.920012838, 52.0557279},
                {97.73536917, 25.21174863, 122.9471178},
                {55.766152, 63.41594954, 119.1821015},
                {73.16013889, 57.17825332, 130.3383922},
                {15.4724703, 38.69813663, 54.17060693},
                {13.38729308, 81.03552389, 94.42281697},
                {65.54064324, 88.99012401, 154.5307673},
                {23.73366377, 24.60190398, 48.33556775},
                {32.95268631, 29.69440211, 62.64708842},
                {11.60516766, 79.02342784, 90.6285955},
                {3.633404511, 49.39930699, 53.0327115},
                {15.45887162, 8.230058954, 23.68893058},
                {97.93212841, 6.966036528, 104.8981649},
                {67.50472992, 90.34304337, 157.8477733},
                {8.047986904, 12.53496021, 20.58294712},
        });
    }
}