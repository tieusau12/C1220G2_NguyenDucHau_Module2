package _12_java_collection_framework.pratices.node;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST(){
    }

    public BST(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }
}
