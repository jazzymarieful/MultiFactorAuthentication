package sr.unasat.algorithms.and.datastructures;

public class InherencePassword implements PasswordStructure {

    private String password;
    private int priorityLvl;

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

    @Override
    public boolean compare(String password) {
        if (password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }
}
