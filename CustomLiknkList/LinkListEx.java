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

    //Displaying Elements at specific index.
    public void get(int index)
    {
        int size1=1;
        Node currNode = head;
        while (currNode!= null) {
            if(size1!=index){
                currNode = currNode.Next;
                size1++;
            }
            else if(size1==index)
            {
                System.out.println("The Element at index "+size1+" is "+currNode.Data);
                return;
            }
                     
        }
        System.out.println("Index does not exist");

    }

    public static void main(String[] args) {
        LinkListEx List = new LinkListEx();
        List.AddFirst(" NAME IS "); 
        List.AddFirst(" My "); 
        List.AddLast(" Shivam ");
        List.PrintList();
        List.Size();
        List.get(2);
         

    }
}
