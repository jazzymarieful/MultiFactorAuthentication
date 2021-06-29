package sr.unasat.algorithms.and.datastructures;

public class PossessionPassword implements PasswordStructure{

    String password;
    int priorityLvl;

    public PossessionPassword(String password, int priorityLvl) {
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
