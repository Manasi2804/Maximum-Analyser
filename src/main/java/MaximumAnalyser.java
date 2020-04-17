public class MaximumAnalyser
{
    //Method for finding maximum from three integer numbers
    public Integer findMaximum(Integer first, Integer second, Integer third)
    {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }
    //Method for finding maximum from three float numbers
    public Float findMaximum(Float first, Float second, Float third)
    {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }
    public static void main(String args[])

    {
        System.out.println("Welcome to maximum analyser problems");
    }
}
