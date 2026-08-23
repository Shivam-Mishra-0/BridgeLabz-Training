package Day16.classwork.GenericPra1;

/*Create a generic interface DataProcessor<T> with methods to add and process data.
Implement it using Student and Employee classes so that the same interface can
        process different types of objects.*/

public interface DataProcessor<T> {
    public void add (T input);
    public T process();
}
