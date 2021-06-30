package sr.unasat.algorithms.and.datastructures;

public class Main {

    public static void main(String[] args) {

        KnowledgePassword kpw = new KnowledgePassword("94hrfg57", 1);
        PossessionPassword ppw = new PossessionPassword("457nxx54", 2);
        InherencePassword ipw = new InherencePassword("4hr785fg", 3);

        PasswordVerifier passwordVerifier = new PasswordVerifier();

        passwordVerifier.createMultiFactorAuth(kpw, ppw, ipw);

//        passwordVerifier.viewQueue();

        String[] multiFactorPasswords = {"94hrfg57", "457nxx54", "4hr785fg"};
        String[] multiFactorPasswordsBad = {"94hrfg57", "0000", "4hr785fg"};
        

        String result = passwordVerifier.verifyMultiFactorAuth(multiFactorPasswordsBad);

        System.out.println(result);

        //queue ipw(455989), ppw(84857), kpw(344848)





    }
}
