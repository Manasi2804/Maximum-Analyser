import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest
{
    @Test
    public void givenThreeIntegers_FindMaximum_AtFirstPosition()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximum = maximumAnalyser.findMaximum(98, 66, 46);
        Assert.assertEquals((Integer)98 , maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtSecondPosition()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximum = maximumAnalyser.findMaximum(66, 98, 46);
        Assert.assertEquals((Integer)98 , maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtThirdPosition()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximum = maximumAnalyser.findMaximum(46, 66, 98);
        Assert.assertEquals((Integer)98 , maximum);
    }
}
