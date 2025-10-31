public class LinkedList
{
    private Node head = null;

    public void Insert(int a)
    {
        Node Newnode = new Node(a);
        if(head == null)
        {
            head = Newnode;
        }
        else
        {
            Node n = head;
            if(n.getkey() > a)
            {
                Newnode.assignnext(n);
                head = Newnode;
            }
            else
            {
                while (n.getnext() != null && n.getnext().getkey() < a) {
                    n = n.getnext();
                }
                if(n.getnext() == null)
                {
                    n.assignnext(Newnode);
                }
                else
                {
                    Newnode.assignnext(n.getnext());
                    n.assignnext(Newnode);
                }
            }
        }
    }

    public void Delete(int a)
    {
        Node n = head;
        if(n.getkey() == a)
        {
            head = n.getnext();
        }
        else
        {
            while(n.getnext().getkey() != a)
            {
                n = n.getnext();
            }
            n.assignnext(n.getnext().getnext());
        }
    }

    public boolean exist(int a)
    {
        Node n = head;
        while(n != null)
        {
            if(n.getkey() == a)
            {
                return true;
            }
            n = n.getnext();
        }
        return false;
    }

    public void Print()
    {
        if(head != null)
        {
            Node n = head;
            while (n != null)
            {
                System.out.print(n.getkey()+" ");
                n = n.getnext();
            }
            System.out.println("");
        }
        else
        {
            System.out.println("List is empty.");
        }
    }
}
