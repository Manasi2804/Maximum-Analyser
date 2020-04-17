import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest
{
    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
    // Test 1
    @Test
    public void givenThreeIntegers_FindMaximum_AtFirstPosition_FromGenericMethod()
    {
        Integer maximum = (Integer) maximumAnalyser.findMaximum(98, 66, 46);
        Assert.assertEquals((Integer)98 , maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtSecondPosition_FromGenericMethod()
    {
        Integer maximum = (Integer) maximumAnalyser.findMaximum(66, 98, 46);
        Assert.assertEquals((Integer)98 , maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtThirdPosition_FromGenericMethod()
    {
        Integer maximum = (Integer) maximumAnalyser.findMaximum(46, 66, 98);
        Assert.assertEquals((Integer)98 , maximum);
    }
    // Test 2
    @Test
    public void givenThreeFloatNumbers_FindMaximum_AtFirstPosition_FromGenericMethod()
    {
        Float maximum = (Float) maximumAnalyser.findMaximum(6.3f,5.6f,2.3f);
        Assert.assertEquals((Float)6.3f , maximum);
    }
    @Test
    public void givenThreeFloatNumbers_FindMaximum_AtSecondPosition_FromGenericMethod()
    {
        Float maximum = (Float) maximumAnalyser.findMaximum(5.6f,6.3f,2.3f);
        Assert.assertEquals((Float)6.3f , maximum);
    }
    @Test
    public void givenThreeFloatNumbers_FindMaximum_AtThirdPosition_FromGenericMethod()
    {
        Float maximum = (Float) maximumAnalyser.findMaximum(2.3f,5.6f,6.3f);
        Assert.assertEquals((Float)6.3f , maximum);
    }
    // Test 3
    @Test
    public void givenThreeStrings_FindMaximum_AtFirstPosition_FromGenericMethod()
    {
        String maximum = (String) maximumAnalyser.findMaximum("Zakir","Abdul","Sandip");
        Assert.assertEquals("Zakir" , maximum);
    }
    @Test
    public void givenThreeStrings_FindMaximum_AtSecondPosition_FromGenericMethod()
    {
        String maximum = (String) maximumAnalyser.findMaximum("Abdul","Zakir","Sandip");
        Assert.assertEquals("Zakir" , maximum);
    }
    @Test
    public void givenThreeStrings_FindMaximum_AtThirdPosition_FromGenericMethod()
    {
        String maximum = (String) maximumAnalyser.findMaximum("Sandip","Abdul","Zakir");
        Assert.assertEquals("Zakir" , maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtFirstPosition_FromGenericClass()
    {
        MaximumAnalyser<Integer> maximumAnalyser = new MaximumAnalyser<>(98, 66, 46);
        Integer maximum = (Integer) maximumAnalyser.findMaximum();
        Assert.assertEquals((Integer) 98 , maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtSecondPosition_FromGenericClass()
    {
        MaximumAnalyser<Integer> maximumAnalyser = new MaximumAnalyser<>(66, 98, 46);
        Integer maximum = (Integer) maximumAnalyser.findMaximum();
        Assert.assertEquals((Integer) 98 , maximum);
    }
    @Test
    public void givenThreeIntegers_FindMaximum_AtThirdPosition_FromGenericClass()
    {
        MaximumAnalyser<Integer> maximumAnalyser = new MaximumAnalyser<>(46, 66, 98);
        Integer maximum = (Integer) maximumAnalyser.findMaximum();
        Assert.assertEquals((Integer) 98 , maximum);
    }
    @Test
    public void givenThreeFloatNumbers_FindMaximum_AtFirstPosition_FromGenericClass()
    {
        MaximumAnalyser<Float> maximumAnalyser = new MaximumAnalyser<>(6.3f,5.6f,2.3f);
        Float maximum = (Float) maximumAnalyser.findMaximum();
        Assert.assertEquals((Float) 6.3f , maximum);
    }
    @Test
    public void givenThreeFloatNumbers_FindMaximum_AtSecondPosition_FromGenericClass()
    {
        MaximumAnalyser<Float> maximumAnalyser = new MaximumAnalyser<>(5.6f,6.3f,2.3f);
        Float maximum = (Float) maximumAnalyser.findMaximum();
        Assert.assertEquals((Float) 6.3f , maximum);
    }
    @Test
    public void givenThreeFloatNumbers_FindMaximum_AtThirdPosition_FromGenericClass()
    {
        MaximumAnalyser<Float> maximumAnalyser = new MaximumAnalyser<>(2.3f,5.6f,6.3f);
        Float maximum = (Float) maximumAnalyser.findMaximum();
        Assert.assertEquals((Float) 6.3f , maximum);
    }
    @Test
    public void givenThreeStrings_FindMaximum_AtFirstPosition_FromGenericClass()
    {
        MaximumAnalyser<String> maximumAnalyser = new MaximumAnalyser<>("Zakir","Abdul","Sandip");
        String maximum = (String) maximumAnalyser.findMaximum();
        Assert.assertEquals("Zakir" , maximum);
    }
    @Test
    public void givenThreeStrings_FindMaximum_AtSecondPosition_FromGenericClass()
    {
        MaximumAnalyser<String> maximumAnalyser = new MaximumAnalyser<>("Abdul","Zakir","Sandip");
        String maximum = (String) maximumAnalyser.findMaximum();
        Assert.assertEquals("Zakir" , maximum);
    }
    @Test
    public void givenThreeStrings_FindMaximum_AtThirdPosition_FromGenericClass()
    {
        MaximumAnalyser<String> maximumAnalyser = new MaximumAnalyser<>("Sandip","Abdul","Zakir");
        String maximum = (String) maximumAnalyser.findMaximum();
        Assert.assertEquals("Zakir" , maximum);
    }
}