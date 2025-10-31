public class Node
{
    private int key;
    private Node next;


    public Node()
    {
        next = null;
    }
    public Node(int a)
    {
        key = a;
        next = null;
    }

    public int getkey()
    {
        return this.key;
    }

    public Node getnext()
    {
        return this.next;
    }

    public void assignnext(Node next)
    {
        this.next = next;
    }
}
