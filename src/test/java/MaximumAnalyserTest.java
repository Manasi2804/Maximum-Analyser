import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest
{
    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();

    @Test
    public void givenThreeIntegers_FindMaximum_AtFirstPosition()
    {
        Integer maximum = maximumAnalyser.findMaximum(98, 66, 46);
        Assert.assertEquals((Integer) 98, maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtSecondPosition()
    {
        Integer maximum = maximumAnalyser.findMaximum(66, 98, 46);
        Assert.assertEquals((Integer) 98, maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtThirdPosition()
    {
        Integer maximum = maximumAnalyser.findMaximum(46, 66, 98);
        Assert.assertEquals((Integer) 98, maximum);
    }

    @Test
    public void givenThreeFloat_FindMaximum_AtFirstPosition()
    {
        Float maximum = maximumAnalyser.findMaximum(6.3f, 5.6f, 2.3f);
        Assert.assertEquals((Float) 6.3f, maximum);
    }
    @Test
    public void givenThreeFloatNumbers_FindMaximum_AtSecondPosition()
    {
        Float maximum = maximumAnalyser.findMaximum(5.6f, 6.3f, 2.3f);
        Assert.assertEquals((Float) 6.3f, maximum);
    }
    @Test
    public void givenThreeFloatNumbers_FindMaximum_AtThirdPosition()
    {
        Float maximum = maximumAnalyser.findMaximum(2.3f, 5.6f, 6.3f);
        Assert.assertEquals((Float) 6.3f, maximum);
    }
}