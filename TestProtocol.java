public class TestProtocol {
    public static void main(String[] args) {
        System.out.println(Protocol.encode(MessageType.HELLO, "nova"));
        System.out.println(Protocol.encode(MessageType.SEND, "id1", "nova", "14:02", "Salut"));
        System.out.println(Protocol.encode(MessageType.BYE));
    }
}