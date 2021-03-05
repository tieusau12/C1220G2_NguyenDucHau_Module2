package _12_java_collection_framework.pratices.node;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
