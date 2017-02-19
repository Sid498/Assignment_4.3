class C {
	void Test() {
		System.out.println("This is class C");
	}
}

class B extends C {
	void Test() {
		System.out.println("This is class B");
	}
}

class A extends B {
	void Test() {

		System.out.println("This is class A");
	}

	public static void main(String[] args) {
		A a = new A();
		a.Test();
	}
}
// correct answer is F.
// It is not possible to invoke Test() method defined in C from a method in A
//Bcz A is inherited from B not from C