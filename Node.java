
public class Node<S>{
	private Node<S> PreviousNode, NextNode;
	public int  position;
	private S value;
	
	public Node(S value) {
		this.value= value;
	}
	
	public String toString(S value) {
		return this.value.toString();
	}
	
	public void setNextNode(Node<S> NextNode) {
		this.NextNode= NextNode;
	}
	
	public void setPrevious(Node<S> PreviousNode) {
		this.PreviousNode=PreviousNode;
	}
	
	public Node<S> getNextNode(){
		return NextNode;
	}
	
	public Node<S> getPreviousNode(){
		return PreviousNode;
	}
	
	public S getValue() {
		return value;
	}
}
