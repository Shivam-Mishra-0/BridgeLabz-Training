package Day16.classwork.GenericInterface;

public class Generic<T> implements GenericInterface<T> {

    private T item;

    @Override
    public void add (T item){
        this.item = item;
    }

    @Override
    public T retreive(){
        return this.item = item;
    }

}
