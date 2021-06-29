package sr.unasat.algorithms.and.datastructures;

public class Main {

    public static void main(String[] args) {

        KnowledgePassword kpw = new KnowledgePassword("94hrfg57", 1);
        PossessionPassword ppw = new PossessionPassword("457nxx54", 2);
        InherencePassword ipw = new InherencePassword("4hr785fg", 3);

        PasswordVerifier passwordVerifier = new PasswordVerifier();

        passwordVerifier.createMultiFactorAuth(kpw, ppw, ipw);

        passwordVerifier.viewQueue();

        String[] multiFactorPasswords = {"1", "2", "3"};





    }
}
