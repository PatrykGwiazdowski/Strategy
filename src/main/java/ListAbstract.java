import Interfaces.ListInterface;

/**
 * Created by INV-6179 on 04.03.2016.
 */
public abstract class ListAbstract<E> implements ListInterface<E> {
    int size;

    /**
     * returns current size of List
     * @return size of List
     */
    @Override
    public int getSize() {
        return size;                        //current size of List
    }

    public abstract void addElement(E o);

    public abstract void removeElement(int index);

    public abstract void removeFirst();

    public abstract void clear();

    public abstract boolean contains(E o);

    public abstract boolean isEmpty();

    public abstract E get(int index);

    public abstract void set(int index, E o);
}
