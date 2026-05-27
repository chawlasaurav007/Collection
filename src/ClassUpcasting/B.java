package ClassUpcasting;

public class B extends A {
    @Override
    public void m1(){
        System.out.println("B class m1 method");
    }

    public void m2(){
        System.out.println("B class m2 method");
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();//A class m1 method
        a.m3();//A class m3 method
        //a.m2();// here u will get compilation error because class A does not have m2 method

        B b = new B();
        b.m1();//B class m1 method
        b.m3();//A class m3 method(so it will first check in B class if its present then it will print otherwise it will go to parent class)
        b.m2();//B class m2 method

        A a1 = new B();
        a1.m1();//A class m1 method(B class overrides the m1 method of class A so it will call m1 method of B class )
        a1.m3();//A class m3 method (m3() method is not present in the child class B so it will go and check in class A)
        //a1.m2;// here u will get compilation error because m2() method is not present in parent class
    }
}
