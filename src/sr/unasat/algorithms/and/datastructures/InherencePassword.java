package sr.unasat.algorithms.and.datastructures;

public class InherencePassword implements PasswordStructure {

    String password;
    int priorityLvl;

    public InherencePassword(String password, int priorityLvl) {
        this.password = password;
        this.priorityLvl = priorityLvl;
    }

    public String getPassword() {
        return password;
    }

    public int getPriorityLvl() {
        return priorityLvl;
    }

    public void createKnowledgePassword() {}

    @Override
    public boolean compare(String password) {
        if (password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }
}
