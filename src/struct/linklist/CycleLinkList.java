package struct.linklist;

//单向环状链表
public class CycleLinkList {
    //    NormalNode first = new NormalNode(0,"");
    NormalNode first;//链表没有设计空节点作为环状链表的成员

    //链表添加元素,有序(根据no),相等不添加
    public void addNode(NormalNode node) {
        //如果是第一个节点,则自身形成闭状, .next指向自身
        //这样设计的话,遍历的结束条件是cur.next = first
        if (first == null) {
            first = node;
            first.next = first;
        }
        //定义一个辅助遍历的变量,并指向第一个节点
        NormalNode cur = first;
        //循环找到要挂载节点的位置
        while (cur.next != first) {
            //如果当前节点的下一个节点的编号大于加入的节点,说明要加入的节点位于当前节点和下一个节点之间
            //另外如果遍历完所有节点都没有找到位置,那将会挂到最后
            if (cur.next.no > node.no) {
                break;
            } else if (cur.next.no == node.no) {
                //如果相等则不添加
                System.out.println("已存在该元素");
                return;
            }
            cur = cur.next;
        }
        //新增节点挂载
        node.next = cur.next;
        cur.next = node;
    }

    //遍历环状链表
    public void listCycle() {
        NormalNode cur = first;
        if (first == null) {
            return;
        }
        while (true) {
            System.out.println(cur);
            if (cur.next == first) {
                break;
            }
            cur = cur.next;
        }
    }

    //约瑟夫问题:按步长m指定节点出列
    //从第一个节点开始,数m个节点,指向哪个节点就删除(按出列的顺序列出
    public void outCycleNode(int m) {
        NormalNode cur = first;
        //结束条件是只有一个节点的时候,也就是cur.next == cur
        while (cur.next != cur) {
            //按步长找到节点
            //使用一个指针记录找到的节点
            NormalNode temp = cur;
            for (int i = 0; i < m - 1; i++) {
                temp = cur;
                cur = cur.next;
            }
            //删除节点
            System.out.println("删除的节点:" + cur);

            temp.next = cur.next;
            //游标指向删除节点的后一个节点
            cur = temp.next;
        }
        //处理最后一个节点
        System.out.println("删除的节点:" + cur);
        cur = null;
    }
}
