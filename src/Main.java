public class Main {
    public static void main(String[] args) {
        Landline l1 = new Landline("12345678");
        Landline l2 = new Landline("09876543");
        l1.callNumber("09876542");
        l2.receiveCall("09876542");
        l2.answerCall();
    }
}