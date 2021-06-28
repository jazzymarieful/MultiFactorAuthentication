package sr.unasat.algorithms.and.datastructures;

public class PasswordType implements PasswordStructure {

    PriorityQueue priorityQueue = new PriorityQueue();


    @Override
    public void createPassword() {}

    public void createUser(String knowledgePassword, String possessionPassword, String inherencePassword) { // moet objecten opnemen van childclasses
        priorityQueue.insert(knowledgePassword);
        priorityQueue.insert(possessionPassword);
        priorityQueue.insert(inherencePassword);
    }


}
