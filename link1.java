import java.util.LinkedList;
import java.util.List;

public  class link1 {
    public static void main(String[] args) {
        LinkedList<Character> ll=new LinkedList<Character>();
        ll.add('B');
        ll.add('E');
        ll.add('F');
        System.out.println("Original Contents are"+ll);
        ll.addLast('G');
        ll.addFirst('A');
        System.out.println("After calls to addFirst() and addLast().");
        System.out.println("contents are:"+ll);
        ll.add(2,'D');
        ll.add(2,'C');
        System.out.println("After insertion.");
        System.out.println("Contents:"+ll);
        System.out.println("\nHere are the fist and last elements:"+ll.getFirst() +""+ ll.getLast());
        List<Character>sub=ll.subList(2,5);
        System.out.println("\n Contents of thr sublist view"+sub);
        LinkedList<Character> ll2=new LinkedList<Character>(sub);
        ll.removeAll(ll2);
        System.out.println("\nAfter removing ll2 from ll");
        System.out.println("Contetns:"+ll);
        ll.removeFirst();
        ll.removeLast();


        System.out.println("\n After deleting first and last elemtes");
        System.out.println("Contents:"+ll);
        ll.set(0,Character.toLowerCase(ll.get(0)));
        System.out.println("\n After change:"+ll);
        System.out.println("the peek first elemnt is"+ll.peekFirst());
        
    }
}
