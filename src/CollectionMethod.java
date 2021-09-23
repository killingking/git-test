import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("添加单个元素");
        collection.add("test");
        collection.add(3);
        collection.add("三");
        collection.add(3);
        collection.add("shc");
        System.out.println(collection);
        //删除元素 指定元素内容 使用equals方法
        collection.remove("shc");
        //collection.remove(3);
        List list = (List)collection;
        list.remove(3);//删除按index
        System.out.println(collection);
        System.out.println(collection.contains(3));
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

        collection.addAll(list);
        System.out.println(collection);

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
