/**
 * Created by INV-6179 on 03.03.2016.
 */
public class List<E> implements ListInterface<E> {
    private int size;
    private Node<E> head;

    public List(){
        head=new Node();
        size=0;
    }



    @Override
    public void addElement(E o) {
        if(size==0){
            head.element=o;
        }else{

            Node tmpNode=head;
            while (tmpNode.nextNode!=null){
                tmpNode=tmpNode.nextNode;                //interate to end of the list
            }
            tmpNode.nextNode=new Node(o,tmpNode,null);
        }
        size++;
    }

    @Override
    public void removeElement(int index) {
        if(index==0){
            removeFirst();
        }
        if(index>0){
            Node tmpNode=getNode(index);
            tmpNode.previousNode.nextNode=tmpNode.nextNode;
            size--;
        }
    }



    public void removeFirst(){
        Node tmpNode=head;
        head=tmpNode.nextNode;
        head.previousNode=null;
        size--;
    }

    @Override
    public void clear() {
        /*Node tmpNode=head;
        for(int i=0;i<size;i++){

        }*/
        head=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }

        return false;
    }

    @Override
    public boolean contains(E o) {
        Node tmpNode=head;
        for(int i=0;i<size;i++){
            if(tmpNode.element.equals(o)){
                return true;
            }
            tmpNode=tmpNode.nextNode;
        }
        return false;
    }



    @Override
    public E get(int index) {
        Node tmpNode=head;
        for(int i=0;i<index;i++){
            tmpNode=tmpNode.nextNode;
        }
        return (E) tmpNode.element;                 //TODO something is wrong here
    }

    @Override
    public void set(int index, E o) {
        Node tmpNode=head;
        for(int i=0;i<index;i++){
            tmpNode=tmpNode.nextNode;
        }
        tmpNode.element=o;
    }

    @Override
    public int getSize() {
        return size;
    }

    private Node getNode(int index) {
        Node tmpNode=head;
        for(int i=0;i<index;i++){
            tmpNode=tmpNode.nextNode;
        }
        return tmpNode;
    }
}
