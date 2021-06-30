package sr.unasat.algorithms.and.datastructures;

public class PasswordVerifier {

    CircularQueue circularQueue = new CircularQueue(3);

    public void createMultiFactorAuth(PasswordStructure kpw, PasswordStructure ppw, PasswordStructure ipw) { // nog testen als subclasses werken
        circularQueue.insert(kpw);
        circularQueue.insert(ppw);
        circularQueue.insert(ipw);
    }

    public void viewQueue() {
        System.out.println(circularQueue.size());
    }

    public String verifyMultiFactorAuth(String[] passwordsToCheck) {
        int passwordCheckCount = 0;
        for (int count = 0; count < circularQueue.getQueArray().length; count++) {
            if (circularQueue.peekFront().compare(passwordsToCheck[count])) {
                circularQueue.remove();
                passwordCheckCount++;
            }
        }
        if (passwordCheckCount == 3) {
            return "Multi factor authentication successful";
        } else
            return "Not all passwords correct";
    }

}
