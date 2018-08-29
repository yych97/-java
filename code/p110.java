import java.util.*;
public class p110
{
public static void main(String args[])
{
	LinkedListQueue llq=new LinkedListQueue();
	System.out.println(llq.isEmpty());
	llq.enqueue("Mike");
	llq.enqueue("Mary");
	llq.enqueue("Lily");
	System.out.println(llq.size());
	System.out.println("移除队首元素: "+llq.dequeue());
	System.out.println(llq.size());
	llq.enqueue("Tom");
	llq.enqueue("Jack");
	llq.enqueue("Alice");
	System.out.println(llq.size());
	System.out.println("查看队首元素: "+llq.front());
	System.out.println(llq.size());
	System.out.println(llq.isEmpty());
}
}
class LinkedListQueue
{
	private LinkedList list;
	public LinkedListQueue()
	{
		list=new LinkedList();
	}
	public int size()
	{
		return list.size();
	}
	public void enqueue(Object obj)
	{
		list.addLast(obj);
	}
	public Object dequeue()
	{
		return list.getFirst();
	}
	public Object front()
	{
		return list.getFirst();
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
}