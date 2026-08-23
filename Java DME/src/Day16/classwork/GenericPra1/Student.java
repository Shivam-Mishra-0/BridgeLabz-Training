package Day16.classwork.GenericPra1;

public class Student<T> implements DataProcessor<T> {
    private T item;

    @Override
    public void add(T input){
        this.item = input;
    }

    public T process(){
        return this.item = item;
    }
}
