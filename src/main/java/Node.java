/**
 * Created by INV-6179 on 03.03.2016.
 */
public class Node<E> {                          //TODO add getters and setters
    E element;
    Node nextNode;
    Node previousNode;
    public Node(E element){
        this.element=element;
        nextNode=null;
        previousNode=null;
    }
    public Node(E element,Node previousNode,Node nextNode){
        this.element=element;
        this.nextNode=nextNode;
        this.previousNode=previousNode;
    }

    public Node() {

    }
}
