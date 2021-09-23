package struct.linklist;

public class DoubleLinkList {
    public NormalNode head = new NormalNode(0, "");

    public NormalNode getHead() {
        return head;
    }

    public void addNode(NormalNode normalNode) {
        NormalNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = normalNode;
        normalNode.pre = temp;
        System.out.println("结点添加成功");
    }

    public void listnext() {
        if (head == null) {
            return;
        }
        NormalNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
            System.out.println(temp);
        }
    }

    public void delNode(NormalNode normalNode) {//根据结点编号删除一个结点

    }
}
