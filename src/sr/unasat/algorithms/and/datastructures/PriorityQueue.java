package sr.unasat.algorithms.and.datastructures;

import java.util.ArrayList;
import java.util.Arrays;

public class PriorityQueue {

    ArrayList<KnowledgePassword> queArray;
    int rear;
    int front;

    public PriorityQueue() {
        queArray = new ArrayList<KnowledgePassword>();
        rear = 0;
        front = 0;
    }

//    public void insert(PasswordType passwordType) {
//        int j;
//        if (rear == 0) {
//            queArray.add(passwordType);
//            rear++;
//        } else {
//            for (j = rear - 1; j >= front; j--) {
//                if (passwordType.getPriorityLvl() < queArray.get(j).getPriorityLvl()) {
//                    queArray.set(j + 1, queArray.get(j));
//                } else
//                    break;
//            }
//            queArray.add(passwordType);
//            rear++;
//        }
//    }

    public void testInsert(KnowledgePassword passwordType) {
        queArray.add(passwordType);
    }

    public void verify() {}

//    public void peek() {
//        for (PasswordType i : queArray) {
//            System.out.println(i.toString());
//        }
//    }
}
