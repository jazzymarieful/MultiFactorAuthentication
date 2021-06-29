package sr.unasat.algorithms.and.datastructures;

public class PasswordVerifier {

    CircularQueue circularQueue = new CircularQueue(3);

    public void createMultiFactorAuth(PasswordStructure kpw, PasswordStructure ppw, PasswordStructure ipw) {
        circularQueue.insert(kpw);
        circularQueue.insert(ppw);
        circularQueue.insert(ipw);
    }

    public void viewQueue() {
        System.out.println(circularQueue.size());
    }

    public String verifyMultiFactorAuth(String[] passwordsToCheck) {
        int passwordCheckCount = 0;
        for (int i = 0; i <= circularQueue.size(); i++) {
            if (circularQueue.peekFront().compare(passwordsToCheck[i])) {
                circularQueue.remove();
                passwordCheckCount++;
            }
        }
        if (passwordCheckCount == 3) {
            return "MultiFactorAuthentication succesful";
        } else
            return "Something went wrong";
    }

}
