package homework4;

public class MyStack {
	//stackの容量
	private int maxSize;
	//空配列
	private Object[] data;
	//最後に入れた要素のindex
	private int top;


	public MyStack(int maxSize) {
		this.maxSize = maxSize;
		this.data = new Object[maxSize];
		this.top = 0;

	}
	//pushメソッド　後入れ
	public void push(Object item) {
		if (this.top >= this.maxSize) {
			throw new RuntimeException("stack full");
		}
		this.data[this.top] = item;
		top++;
	}
	//popメソッド　先出し
	public Object pop() {
		if (this.top <= 0) {
			throw new RuntimeException("stack empty");
		}
		this.top--;
		return this.data[this.top];
	}
//ObjectをStringに変換 System.out.println時に読めるように
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < top; i++) {
	        sb.append(data[i]);
	        if (i != top - 1) {
	            sb.append(", ");
	        }
	    }
	    return sb.toString();
	}

	public static void main(String[] args) {
	    MyStack stack = new MyStack(10) ;

	    stack.push("abc");
	    System.out.println(stack);
	    stack.push(10);
	    System.out.println(stack);
	    stack.push(30);
	    System.out.println(stack);
	    stack.pop();
	    System.out.println(stack);
	    stack.pop();
	    System.out.println(stack);
	    stack.pop();
	    System.out.println(stack);

	}

}
