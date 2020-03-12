class A {
    public void test() { System.out.println("test1"); }
}

class B extends A {
    @Override
    public void test() { System.out.println("test2"); }

    public static void main(String[] args) {
        B b = new B();
        b.test(); // test2
        A a = new A();
        a.test(); // test1
    }
}
