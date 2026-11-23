import java.time.LocalDateTime;
import java.util.UUID;
import java.util.Objects;
import java.time.format.DateTimeFormatter;

public class Message {
    private String id;
    private String author;
    private String text;
    private boolean edited;
    private boolean deleted;
    private LocalDateTime time;
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    public Message(String author, String text) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("author is required");
        }
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("text is required");
        }
        this.id = UUID.randomUUID().toString();
        this.time = LocalDateTime.now();
        this.author = author;
        this.text = text;
        this.edited = false;
        this.deleted = false;

    }

    public Message(String id, String author, String text, LocalDateTime time, boolean edited, boolean deleted) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.time = time;
        this.edited = edited;
        this.deleted = deleted;

    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public boolean isEdited() {
        return edited;
    }

    public boolean isDeleted() {
        return deleted;
    }
public boolean edit(String newText){
    if (deleted== true){
        return false;
    }
    if (newText==null || newText.isBlank()){
        return false;
    }
    this.text = newText;
    this.edited = true;
    return true;
}
public void markDeleted(){
    this.deleted=true;
    this.text=("");
}
@Override 
public boolean equals(Object o){
    if (this == o){
        return true;
    }
    if(o==null || o.getClass() != getClass()){
        return false;

    }
    Message other = (Message) o ;
    return Objects.equals(id, other.id);

}
@Override 
public int hashCode(){
    return Objects.hash(id);

}
@Override 
public String toString(){
    String t= time.format(TIME_FORMAT);
    if (deleted){
        return "[" + t + "] " + author + ":message supprimé";
    }
    String result  = "[" + t + "] " + author + " : " + text;
    if(edited){
        result = result + "(modifié)";
    }
    return result;

}

}
