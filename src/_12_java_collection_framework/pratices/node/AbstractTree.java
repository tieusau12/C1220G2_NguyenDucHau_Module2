package _12_java_collection_framework.pratices.node;

public class AbstractTree <E> implements Tree<E> {

    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public void inorder() {

    }

    @Override
    public int getSize() {
        return 0;
    }
}
