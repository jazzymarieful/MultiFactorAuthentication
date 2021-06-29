package sr.unasat.algorithms.and.datastructures;

import java.util.Arrays;

public class CircularQueue {

    private int maxSize;
    private PasswordStructure[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new PasswordStructure[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(PasswordStructure value) {
        if(rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = value;
        nItems++;
//        System.out.println(Arrays.toString(queArray));
    }

    public void remove() {
//        int temp = queArray[front];
        queArray[front] = null;
        if(front + 1 == maxSize) {
            front = 0;
        } else {
            front++;
        }
        nItems--;
//        System.out.println(Arrays.toString(queArray));
//        return temp;
    }

    public PasswordStructure peekFront() {
        System.out.println(queArray[front]);
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems==maxSize);
    }

    public int size() {
        return nItems;
    }

}
