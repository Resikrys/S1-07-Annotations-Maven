package s1_07_annotations_lvl2;

public class TestJson {
    public static void main(String[] args) throws Exception {
        User u = new User("Leona", 7);
        JsonSerializer.serializeMethod(u);
    }
}

