package struct.linklist;

//单向链表的头结点
//初始为null
public class SingletonLinkedList {
    //    private NormalNode normalNode;
    public NormalNode first = new NormalNode(0, "");

    public SingletonLinkedList(NormalNode first) {
        this.first = first;
    }

    public NormalNode getFirst() {
        return first;
    }

    public void setFirst(NormalNode first) {
        this.first = first;
    }

    public SingletonLinkedList() {
    }

    //    SingletonLinkedList(NormalNode node) {
//        this.normalNode = node;
//        this.next = node;
//    }
    public boolean addNormalNodeBySort(NormalNode normalNode) {//根据结点编号去添加
        NormalNode temp = first;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                flag = true;
                break;
            }
            if (temp.next.no > normalNode.no) {
//                temp.next = normalNode;
//                return true;
                flag = true;
                break;
            }
            if (temp.next.no == normalNode.no) {
                System.out.println("已存在相同的结点");
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            normalNode.next = temp.next;
            temp.next = normalNode;
        }
        return flag;
    }

    public boolean delNormalNode(NormalNode normalNode) {//通过结点编号删除一个结点
        NormalNode temp = first;
        while (true) {
            if (temp.next == null) {
                System.out.println("没有这个结点,删除失败");
                return false;
            }
            if (temp.next.no == normalNode.no) {
                temp.next = temp.next.next;
                System.out.println("结点删除成功");
                return true;
            }
            temp = temp.next;
        }
    }

    public boolean addNormalNode(NormalNode normalNode) {
        if (first == null) {
            first = normalNode;
            return true;
        }
        NormalNode temp = first;
        while (true) {
            if (temp.next == null) {
                temp.next = normalNode;
                break;
            }
            temp = temp.next;
        }
        return true;
    }

    public int showLinkNode() {
        if (first.next == null) {
            System.out.println("链表为空");
            return 0;
        }
        NormalNode temp = first;
        int count = 0;
        while (true) {
            if (temp.next == null) {
                break;
            }
            System.out.println(temp.next);
            count++;
            temp = temp.next;
        }
        return count;
    }

    public NormalNode listByCnt(int n) {
        if (first.next == null) {
            return null;
        }
        NormalNode temp = first;
        int count = 0;
        while (count < n) {
            if (temp.next == null) {
                break;
            }
            count++;
            temp = temp.next;
        }
        return temp;
    }

    public void reverseLinkList(NormalNode head) {
        //思路,创建一个新的头结点,从原链表遍历,每遍历一个将其挂到新的结点的头结点的下一个结点,取出的结点的下一个结点指向新链表的元素
        if (head.next == null || head.next.next == null) {
            return;
        }
        NormalNode newHead = new NormalNode(0, "");
        //定义遍历使用的游标
        NormalNode cur = head.next;
        //记录转放到新链表的变量
        NormalNode temp = head;
        while (cur != null) {
            temp = cur;
            cur = cur.next;
            temp.next = newHead.next;
            newHead.next = temp;
        }
        this.first  = newHead;
    }

    public void revLinkList(NormalNode head) {
        NormalNode temp = head;
        NormalNode mark = null;
        NormalNode keep = null;
        if (temp.next == null) {
            return;
        }
        //先把第一个结点记录
        keep = temp.next;
        //记录第二个结点
        mark = temp.next.next;//keep.next
        //第一个结点作为新链表的尾部,next为null,第一个结点断开连接
        keep.next = null;
//        mark = temp;
//        keep = temp.next;
//        temp = temp.next;
        //temp作为移动的游标,从第二个结点开始
        temp = mark;
        while (true) {
            //当指针移动到旧结点的尾部时,将旧的头部连接到结点上,完成反转
            if (temp.next == null) {
                mark.next = keep;
                head.next = temp;
                break;
            }
            //此时t->2 m->2 k->1
            temp = temp.next;//往下走3
//            keep.next = mark;
            mark.next = keep;
            keep = mark;
            mark = temp;
        }
    }
}

