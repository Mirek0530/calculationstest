import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorMultiplicationTest {

    private double xTest;
    private double yTest;
    private double expectedResult;

    private Calculator calculator;

    public CalculatorMultiplicationTest(double xTest, double yTest, double expectedResult) {
        this.xTest = xTest;
        this.yTest = yTest;
        this.expectedResult = expectedResult;
    }

    @Test
    public void givenCalculatorWhenMultiplicationThenProperResult() {
        //Given
        calculator = new Calculator();
        //When
        calculator.multiplication(xTest, yTest);
        //Then
        Assert.assertEquals(expectedResult, calculator.getResult(), 0.0001);
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {1.379868217, 0.400438244, 0.552552005},
                {1.256608842, 2.477687769, 3.113484359},
                {1.187117538, 4.988146174, 5.921515804},
                {1.115039321, 1.0600714, 1.182021294},
                {4.932638271, 3.442407734, 16.98015213},
                {0.526415056, 3.957353875, 2.08321066},
                {2.304001836, 0.954881018, 2.200047618},
                {0.27429851, 2.754218105, 0.755477923},
                {4.098119204, 4.160007955, 17.04820849},
                {3.774621987, 4.878738902, 18.41539513},
                {0.144648463, 0.983400272, 0.142247338},
                {0.899313984, 4.205891061, 3.782416646},
                {1.317316892, 0.591955473, 0.779792944},
                {1.049850688, 2.59703305, 2.726496935},
                {1.995253817, 0.753024008, 1.502474027},
                {4.592503457, 4.376555872, 20.09934797},
                {0.217452662, 1.198409559, 0.260597349},
                {2.030993842, 3.253665335, 6.608174259},
                {3.722309824, 0.495229476, 1.843397544},
                {2.274556694, 1.274628026, 2.899213708},
        });
    }
}