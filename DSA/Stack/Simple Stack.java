class Stack{
	int a[]=new int[5];
	int top=-1;
	
	//push()
	public void push(int data) {
		if(top==a.length-1) {
			System.out.print("Stack is Full");
			
		}
		else {
			top++;
			a[top]=data;
		}
	}
	
	//pop()
	public void pop() {
		if(top==-1) {
			System.out.print("Stack is Empty");
		}
		else{
		    top--;// return the popped value
		}
	}
	
	//peek()
	public void peek(){
	    if(top==-1){
	        System.out.print("Stack is Empty");
	    }
	    else{
	        System.out.print("Top element is: "+a[top]);// return the top value
	    }
	}
	
	//display()
	public void display(){
	    for(int i=top;i>=0;i--){
	        System.out.println(a[i]);
	    }
	}
}
public class Main {
    public static void main(String []args){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Original Stack");
        s.display();
        s.pop();
        System.out.println("After popping:");
        s.display();
        s.peek();
    }
}
