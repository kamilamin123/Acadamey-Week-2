
public class Name {
	private String first;
	private String last;
	public Name(String initFirst, String initLast) {
		first = initFirst;
		last = initLast;
	}
	public void print() {
		System.out.println("First name is "+ first);
		System.out.println("Last name is "+ last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 =new Name("kamil","Amin");
		n1.print();
		Name n2 = new Name("Mohamed","Hassan");
		n2.print();

	}

}
