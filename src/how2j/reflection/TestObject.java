package how2j.reflection;

public class TestObject {
    String name = "1";

    public TestObject() {
        name = "2";
    }

    public TestObject(String name) {
        this.name = name;
    }

    {
        name = "3";
    }
}
