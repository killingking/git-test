package struct.linklist;

import org.junit.jupiter.api.Test;

public class LinkListTest {
    public static void main(String[] args) {
/*
//        SingletonLinkedList singletonLinkedList = new SingletonLinkedList();
//        singletonLinkedList.showLinkNode();
//        NormalNode node1 = new NormalNode(1,"test1");
//        NormalNode node2 = new NormalNode(2, "test2");
//        NormalNode node3 = new NormalNode(3,"test3");
//        NormalNode node4 = new NormalNode(4,"test4");
//        NormalNode node5 = new NormalNode(5,"test5");
//        singletonLinkedList.addNormalNode(node1);
//        singletonLinkedList.addNormalNode(node2);
//        singletonLinkedList.addNormalNode(node3);
//        singletonLinkedList.addNormalNode(node4);
//        singletonLinkedList.addNormalNode(node5);
//        singletonLinkedList.showLinkNode();
//        singletonLinkedList.delNormalNode(node3);
//        singletonLinkedList.showLinkNode();
//        singletonLinkedList.delNormalNode(node2);
//        singletonLinkedList.showLinkNode();
        SingletonLinkedList singletonLinkedList = new SingletonLinkedList();
        singletonLinkedList.showLinkNode();
        NormalNode node1 = new NormalNode(1, "test1");
        NormalNode node2 = new NormalNode(2, "test2");
        NormalNode node3 = new NormalNode(3, "test3");
        NormalNode node4 = new NormalNode(4, "test4");
        NormalNode node5 = new NormalNode(5, "test5");
        NormalNode nodec = new NormalNode(4, "sfawt");
        singletonLinkedList.addNormalNodeBySort(node1);
        singletonLinkedList.addNormalNodeBySort(node3);
        singletonLinkedList.addNormalNodeBySort(node2);
        singletonLinkedList.addNormalNodeBySort(node5);
        singletonLinkedList.addNormalNodeBySort(node4);
        singletonLinkedList.addNormalNodeBySort(nodec);
        System.out.println("----------反转前-------------");
        singletonLinkedList.showLinkNode();
//        singletonLinkedList.revLinkList(singletonLinkedList.first);
        singletonLinkedList.reverseLinkList(singletonLinkedList.getFirst());
        System.out.println("----------反转后-------------");
        int size = singletonLinkedList.showLinkNode();
        int k = 2;
        System.out.println("----------" + size + "-------------");
        NormalNode normalNode = singletonLinkedList.listByCnt(size - k + 1);
        System.out.println(normalNode);
        System.out.println("--------");
        singletonLinkedList.delNormalNode(node3);
        singletonLinkedList.showLinkNode();
        singletonLinkedList.delNormalNode(node2);
        int count = singletonLinkedList.showLinkNode();
        System.out.println(count);
*/


        NormalNode node1 = new NormalNode(1, "test1");
        NormalNode node2 = new NormalNode(2, "test2");
        NormalNode node3 = new NormalNode(3, "test3");
        NormalNode node4 = new NormalNode(4, "test4");
        NormalNode node5 = new NormalNode(5, "test5");
        NormalNode nodec = new NormalNode(4, "sfawt");
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        doubleLinkList.addNode(node1);
        doubleLinkList.addNode(node2);
        doubleLinkList.addNode(node3);
        doubleLinkList.addNode(node4);
        doubleLinkList.addNode(node5);
        doubleLinkList.addNode(nodec);
        doubleLinkList.listnext();
    }

    @Test
    public void testDoubleLinkList() {
        NormalNode node1 = new NormalNode(1, "test1");
        NormalNode node2 = new NormalNode(2, "test2");
        NormalNode node3 = new NormalNode(3, "test3");
        NormalNode node4 = new NormalNode(4, "test4");
        NormalNode node5 = new NormalNode(5, "test5");
        NormalNode nodec = new NormalNode(4, "sfawt");
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        doubleLinkList.addNode(node1);
        doubleLinkList.addNode(node2);
        doubleLinkList.addNode(node3);
        doubleLinkList.addNode(node4);
        doubleLinkList.addNode(node5);
        doubleLinkList.addNode(nodec);
        doubleLinkList.addNode(node1);
        doubleLinkList.listnext();
    }

    @Test
    public void testCycleLinkList() {
        CycleLinkList cycleLinkList = new CycleLinkList();
        NormalNode node1 = new NormalNode(1, "test1");
        NormalNode node2 = new NormalNode(2, "test2");
        NormalNode node3 = new NormalNode(3, "test3");
        NormalNode node4 = new NormalNode(4, "test4");
        NormalNode node5 = new NormalNode(5, "test5");
        NormalNode nodec = new NormalNode(4, "sfawt");
        cycleLinkList.addNode(node1);
        cycleLinkList.addNode(node2);
        cycleLinkList.addNode(node5);
        cycleLinkList.addNode(node3);
        cycleLinkList.addNode(node4);
        cycleLinkList.addNode(nodec);
        System.out.println("=========================");
        cycleLinkList.listCycle();
        System.out.println("=========================");
        cycleLinkList.outCycleNode(3);
    }
}
