package struct.linklist;

public class NormalNode {
    public int no;
    public String content;
    NormalNode next;
    NormalNode pre;

    public NormalNode(int no, String content) {
        this.no = no;
        this.content = content;
    }

    public NormalNode(int no, String content, NormalNode next) {
        this.no = no;
        this.content = content;
        this.next = next;
    }

    @Override
    public String toString() {
        return "NormalNode{" +
                "no=" + no +
                ", content='" + content + '\'' +
                '}';
    }
}
