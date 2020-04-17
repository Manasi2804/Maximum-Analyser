public class MaximumAnalyser < T extends Comparable <T>>
{
    //Fields
    private T first;
    private T second;
    private T third;
    //Default constructor
    public MaximumAnalyser()
    {

    }
    //Parametrized constructor
    public MaximumAnalyser(T first, T second, T third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    //Generic Method for finding maximum from three elements
    public T findMaximum(T first, T second, T third)
    {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }
    //Internal method to call findMaximum method
    public <T extends Comparable<T>> T findMaximum()
    {
        printMax(findMaximum(first,second,third));
        return (T) findMaximum(first,second,third);
    }
    public void printMax(T maximum)
    {
        System.out.println("Maximum is :"+maximum);
    }
}
