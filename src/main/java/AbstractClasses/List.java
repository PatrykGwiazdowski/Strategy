package AbstractClasses;

import Interfaces.Node;

/**
 *
 * Created by INV-6179 on 04.03.2016.
 */
public abstract class List<E> implements Interfaces.List<E> {
    protected int size;

    public int getSize(){
        return size;
    }
}
