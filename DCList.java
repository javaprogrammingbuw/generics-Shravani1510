
public class DCList<K>{
	private Node<K> head;
	public boolean isEmpty() {
		if(head== null) { 
			return true;
		}
		return false;
	}
	
	public void display() {
		for(Node<K> i=head; i!= null; i=i.getNextNode()) {
			System.out.print("[" +i.getValue() + "]");
		}
		System.out.println();
	}
	
	public void add(int position, Node<K> value) {
		//check if position is 0 to adjust the head
		//check if value is null
		if(value != null && position<size() && position >=0) {
			if(position==0) {
				value.setNextNode(head);
				head.setPrevious(value);
				head = value;
			} 
//       if(value==null) {
//    	   break;
//       }
			Node<K> oldNode = get(position);
			//sets the next node of the previous node
			oldNode.getPreviousNode().setNextNode(value);
			//set previous node of new node
			value.setPrevious(oldNode.getPreviousNode());
			//change the previous node of the old node
			oldNode.setPrevious(value);
			value.setNextNode(oldNode);
			value.position= position;
			for(Node<K> i =value.getNextNode(); i!=null; i=i.getNextNode()) {
				i.position ++;
			}
		}
	}
	
	public void add(Node<K> value) {
		int position = size();
		if(head != null) {
			Node<K> last = get(size()-1);
			last.setNextNode(value);
			value.setPrevious(last);
		}
		else {
			head = value;
		}
		value.position=position;
	}
	
	public void remove(Node<K> value) {
		if(value != null && value.position>=0 && value.position<size()-1  ) {
			value.getNextNode().setPrevious(value.getPreviousNode());
			value.getPreviousNode().setNextNode(value.getNextNode());
		}
	}
	
	public void removeFirst() {
		if(head != null) {
			if(size()>=2) {
				head = head.getNextNode();
				head.setPrevious(null);
			}
			else if(size() == 1) {
				clear();
			}
			else {
				System.out.println("Empty List");
			}
		}
	}
	
	public void removeLast() {
		if(size()>=2) {
			Node<K> c =get(size()-2);
			c.setNextNode(null);
		}
		else if(size()==1) {
			clear();
		}
		else{
			System.out.println("Empty List");
		}
	}
	
	public void clear() {
		head = null;
	}
	
	public Node<K> getFirst(){
		return head;
	}
	
	public Node<K> getLast(){
		return get(size()-1);
	}
	
	public Node<K> get(int position){
		Node<K> i = head;
		for( i=head; i!=null; i=i.getNextNode()) {
			if(i.position==position) {
				break;
			}
		}
		return i;
	}
	
	public int find(K value) {
		
		for( Node<K> i=head; i!=null; i=i.getNextNode()) {
			if(i.getValue()==value) {
				return i.position;
			}
		}
		return -1;
	}
	
	public boolean contains(K value) {
		for(Node<K> i=head; i!=null; i=i.getNextNode()) {
			if(i.getValue()==value) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		int x=0;
		for(Node<K> i=head; i!=null; i=i.getNextNode()) {
			x++;
		}
		return x;		
	}
}
