package data_structure;

public class InsertEnd {
	Node head;

	public Node insertEnd(int new_data)
	{
		/* 1 & 2: Allocate the Node & Put in the data*/
		//System.out.println("head "+head);
		Node new_node = new Node(new_data);
		if(head == null) {
			head=new_node;
		} else {
			/* 3. Make next of new Node as head */
			Node temp = head;
			while(temp.next != null) {
				temp.next = new_node;
				new_node.next = null;
			}
//			new_node.next=null;
//			head = new_node;
//			head.next = new_node;
			/* 4. Move the head to point to new Node */
			//head=new_node;
		}
		System.out.println("inserted "+new_data);
		System.out.println("head "+head.data);
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
		InsertEnd end = new InsertEnd();
		end.insertEnd(5);
		end.insertEnd(4);
		end.insertEnd(3);
		end.display();



	}

}
