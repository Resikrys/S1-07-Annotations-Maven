package s1_07_annotations_lvl2;

@JsonSerializable(path = "sortida/usuari.json")
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
}
