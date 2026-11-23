import java.time.LocalDateTime;

public class TestMessage {
    public static void main(String[] args) {
        Message m1 = new Message("id1", "Nova", "salut orion", LocalDateTime.of(2026, 11, 23, 14, 2), false, false);
        System.out.println(m1);
        System.out.println("edit(\"\"): " + m1.edit(""));
        System.out.println("edit(\"salut orion!\"): " + m1.edit("salut orion!"));
        m1.markDeleted();
        System.out.println(m1);
        System.out.println("edit(\"coucou\"): " + m1.edit("coucou"));
         Message m2 = new Message("id1", "Nova", "salut yahya", LocalDateTime.of(2026, 11, 23, 14, 2), false, false);
         System.out.println("Meme id:" + m1.equals(m2));
        Message m3 = new Message("Nova","salut");
        Message m4 = new Message("Nova","salut");
        System.out.println("ids different:" + m3.equals(m4));

    }

}