package data_structure;

public class InsertBeginning {

	Node head;

	public Node insertBeginning(int new_data)
	{
		/* 1 & 2: Allocate the Node & Put in the data*/
		//System.out.println("head "+head);
		Node new_node = new Node(new_data);
		if(head == null) {
			head=new_node;
		} else {
			/* 3. Make next of new Node as head */
			new_node.next=head;
			/* 4. Move the head to point to new Node */
			head=new_node;
		}
		System.out.println("inserted "+new_data);
		return head;
	}

	void display()
	{
		Node ttmp=head;
		while(ttmp!=null)
		{System.out.print(ttmp.data+" ");
		ttmp=ttmp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertBeginning l=new InsertBeginning();
		l.insertBeginning(5);
		l.insertBeginning(4);
		l.insertBeginning(3);
		l.insertBeginning(2);
		l.insertBeginning(1);

		l.display();

	}

}
