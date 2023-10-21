package Java.CustomLiknkList;
class LinkListEx {

    Node head;
    private int size;

    LinkListEx()
    {
        this.size=0;
    }
    class Node
    {
        String Data;
        Node Next;
        Node(String Data)
        {
            this.Data=Data;
            this.Next=null;
        }
    }

    //add at Fist postion 
    public void AddFirst(String Data)
    {
        Node newNode=new Node(Data);
        size++;
        if(head==null)
        {
            head=newNode;
            return;     
        }
        newNode.Next = head;
        head=newNode;
    }

    //Add at last postion 
    public void AddLast(String Data)
    {
        Node newNode = new Node(Data);
        size++;
        if(head == null)
        {
            head=newNode;
            return;

        }
        Node currNode = head;
        while (currNode.Next!= null) {
            currNode = currNode.Next; 

            
        }
        currNode.Next=newNode;
    }

    //Printing the link list
    public void PrintList()
    {
        if(head == null)
        {
            System.out.print(" Null ");
            System.out.println();
            return;
        }
        Node currNode = head;
        while (currNode!= null) {
            System.out.print(currNode.Data+" -> ");
            currNode = currNode.Next;         
        }
        System.out.println("Null");
    }


    //Deleting First
    public void Deletefirst()
    {

        if(head==null)
        {
            System.out.print("List is empty.");
            return;
        }
        size--;
        head=head.Next;
    }


    //Delete Last.
    public void DeleteLast()
    {
        if(head==null)
        {
            System.out.print("List is empty.");
            return; 
        }
        size--;
        if(head.Next==null)
        {
            head=null;return;
        }

        Node secondlast = head;
        Node lastnode = head.Next;
        while(lastnode!=null)
        {
            lastnode=lastnode.Next;
            secondlast=secondlast.Next;  
        }
        secondlast.Next=null;

    }

    //Display size of link list.
    public void Size()
    {
        System.out.println("Size of list is " +size);
    }

    public static void main(String[] args) {
        LinkListEx List = new LinkListEx();
        List.AddFirst(" NAME IS "); 
        List.AddFirst(" My "); 
        List.AddLast(" Shivam ");
        List.Size();
        List.DeleteLast();
        List.Size();
         

    }
}
