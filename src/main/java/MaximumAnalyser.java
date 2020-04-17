public class MaximumAnalyser
{
    public Integer findMaximum(Integer first, Integer second, Integer third)
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
