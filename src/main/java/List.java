/**
 * Created by INV-6179 on 03.03.2016.
 */
public class List<E> implements ListInterface<E> {
    private int size;
    private Node<E> head;

    /**
     * Creates new empty List
     */
    public List() {
        head = new Node();
        size = 0;
    }

    /**
     * Adds element to end of the List
     *
     * @param o Element to be added
     */

    @Override
    public void addElement(E o) {
        if (size == 0) {
            head.element = o;
        } else {

            Node tmpNode = head;
            while (tmpNode.nextNode != null) {
                tmpNode = tmpNode.nextNode;                //interate to end of the list
            }
            tmpNode.nextNode = new Node(o, tmpNode, null);
        }
        size++;
    }

    /**
     * Removes element at specified index in List
     *
     * @param index Index of element to be Removed
     */
    @Override
    public void removeElement(int index) {
        if (index == 0) {
            removeFirst();
        }
        if (index > 0) {
            Node tmpNode = getNode(index);
            tmpNode.previousNode.nextNode = tmpNode.nextNode;
            size--;
        }
    }


    /**
     * Removes firs element of List
     */
    public void removeFirst() {
        Node tmpNode = head;
        head = tmpNode.nextNode;
        head.previousNode = null;
        size--;
    }

    /**
     * Remove all elements from List. After Calling this list size is 0
     */
    @Override
    public void clear() {
        /*Node tmpNode=head;
        for(int i=0;i<size;i++){

        }*/
        head = null;
        size = 0;
    }

    /**
     * return true if list is empty
     *
     * @return true  if list is empty
     */
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }

    /**
     * checks if List contains specified elements
     *
     * @param o List element to check
     * @return true if list contains specified element
     */
    @Override
    public boolean contains(E o) {
        Node tmpNode = head;
        for (int i = 0; i < size; i++) {
            if (tmpNode.element.equals(o)) {
                return true;
            }
            tmpNode = tmpNode.nextNode;
        }
        return false;
    }


    /**
     * returns List Item at specified index
     *
     * @param index index of element to return
     * @return List item at specified index
     */
    @Override
    public E get(int index) {
        if (index > size - 1 || index < 0) {
            return null;
        } else {
            return (E) getNode(index).element;                      //List element at specified index
        }

    }

    /**
     * replaces value at specified index of list
     *
     * @param index index of element to replace
     * @param o     Element that will be added to specified index
     */
    @Override
    public void set(int index, E o) {
        if (index <= size - 1 || index >= 0) {
            Node tmpNode = head;
            for (int i = 0; i < index; i++) {       //iterate to specified node
                tmpNode = tmpNode.nextNode;
            }
            tmpNode.element = o;                  //switch current List Element with given as parameter
        }

    }

    /**
     * returns current size of List
     *
     * @return size of List
     */
    @Override
    public int getSize() {
        return size;                        //current size of List
    }

    /**
     * Returns node of list at specified index
     *
     * @param index index of node
     * @return node at given index of list
     */
    private Node getNode(int index) {
        Node tmpNode = head;
        for (int i = 0; i < index; i++) {           //iterate through all nodes to specified index
            tmpNode = tmpNode.nextNode;
        }
        return tmpNode;             //node at specified index
    }
}
