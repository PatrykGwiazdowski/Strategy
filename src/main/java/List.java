
/**
 * Created by INV-6179 on 03.03.2016.
 */
public class List<E> extends AbstractClasses.List<E> {
    Node<E> head;

<<<<<<< HEAD
    /**
     * Creates new empty List
     */
    public List() {
        head = new Node();
        size = 0;
=======
    public List(){
        head=new Node<>();
        size=0;
>>>>>>> 96296d9a7c8033e2fb47537650556e58d427d96a
    }
    /**
     * Adds element to end of the List
     *
     * @param o Element to be added
     */
    public void addElement(E o) {
<<<<<<< HEAD
        if (size == 0) {
            head.element = o;
        } else {

            Node tmpNode = head;
            while (tmpNode.nextNode != null) {
                tmpNode = tmpNode.nextNode;                //interate to end of the list
            }
            tmpNode.nextNode = new Node(o, tmpNode, null);
=======
        if(size==0){
            head.setData(o);
        }else{

            Node<E> tmpNode=head;
            while (tmpNode.getNextNode()!=null){
                tmpNode=tmpNode.getNextNode();                //interate to end of the list
            }
            tmpNode.setNextNode(new Node(o,null));
>>>>>>> 96296d9a7c8033e2fb47537650556e58d427d96a
        }
        size++;
    }

    /**
     * Removes element at specified index in List
     *
     * @param index Index of element to be Removed
     */
    public void removeElement(int index) {
        if (index == 0) {
            removeFirst();
        }
<<<<<<< HEAD
        if (index > 0) {
            Node tmpNode = getNode(index);
            tmpNode.previousNode.nextNode = tmpNode.nextNode;
=======
        if(index>0){
            Node tmpNode=getNode(index-1);
            tmpNode.setNextNode(tmpNode.getNextNode().getNextNode());
>>>>>>> 96296d9a7c8033e2fb47537650556e58d427d96a
            size--;
        }
    }


    /**
     * Removes firs element of List
     */
<<<<<<< HEAD
    public void removeFirst() {
        Node tmpNode = head;
        head = tmpNode.nextNode;
        head.previousNode = null;
=======
    public void removeFirst(){
        Node tmpNode=head;
        tmpNode.setNextNode(head);
>>>>>>> 96296d9a7c8033e2fb47537650556e58d427d96a
        size--;
    }

    /**
     * Remove all elements from List. After Calling this list size is 0
     */
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

    public boolean contains(E o) {
<<<<<<< HEAD
        Node tmpNode = head;
        for (int i = 0; i < size; i++) {
            if (tmpNode.element.equals(o)) {
                return true;
            }
            tmpNode = tmpNode.nextNode;
=======
        Node tmpNode=head;
        for(int i=0;i<size;i++){
            if(tmpNode.getNextNode().equals(o)){
                return true;
            }
            tmpNode=tmpNode.getNextNode();
>>>>>>> 96296d9a7c8033e2fb47537650556e58d427d96a
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
<<<<<<< HEAD
    public E get(int index) {
        if (index > size - 1 || index < 0) {
            return null;
        } else {
            return (E) getNode(index).element;                      //List element at specified index
        }

=======
    public E get(int index) {                                   //TODO something is wrong here
        return (E) getNode(index).getData();                      //List element at specified index
>>>>>>> 96296d9a7c8033e2fb47537650556e58d427d96a
    }


    /**
     * replaces value at specified index of list
     *
     * @param index index of element to replace
     * @param o     Element that will be added to specified index
     */
    @Override
    public void set(int index, E o) {
<<<<<<< HEAD
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
=======
        Node tmpNode=head;
        for(int i=0;i<index;i++){       //iterate to specified node
            tmpNode=tmpNode.getNextNode();
        }
        tmpNode.setData(o);                  //switch current List Element with given as parameter
    }

>>>>>>> 96296d9a7c8033e2fb47537650556e58d427d96a

    /**
     * Returns node of list at specified index
     *
     * @param index index of node
     * @return node at given index of list
     */
    private Node getNode(int index) {
<<<<<<< HEAD
        Node tmpNode = head;
        for (int i = 0; i < index; i++) {           //iterate through all nodes to specified index
            tmpNode = tmpNode.nextNode;
=======
        Node tmpNode=head;
        for(int i=0;i<index;i++){           //iterate through all nodes to specified index
            tmpNode=tmpNode.getNextNode();
>>>>>>> 96296d9a7c8033e2fb47537650556e58d427d96a
        }
        return tmpNode;             //node at specified index
    }

}
