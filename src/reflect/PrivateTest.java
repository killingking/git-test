package reflect;

public class PrivateTest {
    private String name = "hellokitty";

    public PrivateTest() {
    }

    public PrivateTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
