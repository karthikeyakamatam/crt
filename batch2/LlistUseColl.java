import java.util.LinkedList;
public class LlistUseColl {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.addFirst(2);
        list.addLast(3);
        list.remove();
        list.removeFirst();
        list.removeLast();
        list.size();
        list.contains(8);
        list.getFirst();
        list.getLast();
    }
}
