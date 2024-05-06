import java.lang.reflect.Array;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleLinkedList<T> {

    private static class Node<T> {

        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private int size;

    public SimpleLinkedList() {
    }

    public SimpleLinkedList(T[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            push(values[i]);
        }
    }

    public final void push(T value) {
        Node<T> newNode = new Node<>(value);
        this.size++;
        if (Objects.isNull(head)) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public T pop() {
        if (Objects.isNull(head)) {
            throw new NoSuchElementException();
        }
        T value = head.value;
        head = head.next;
        this.size--;
        return value;
    }

    public void reverse() {
        Node<T> current = head;
        Node<T> next;
        Node<T> previous = null;
        while (Objects.nonNull(current)) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public T[] asArray(Class<T> clazz) {
        T[] result = newArray(clazz, this.size);
        int index = 0;
        Node<T> current = head;
        while (Objects.nonNull(current)) {
            result[index++] = current.value;
            current = current.next;
        }
        return result;
    }

    private <T> T[] newArray(Class<T> clazz, int size) {
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) Array.newInstance(clazz, size);

        return arr;
    }

    public int size() {
        return this.size;
    }
}