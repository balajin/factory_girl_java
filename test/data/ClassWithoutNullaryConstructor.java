package data;

public class ClassWithoutNullaryConstructor {

    private int foo;

    public ClassWithoutNullaryConstructor(int foo) {
        this.foo = foo;
    }

    public int getFoo() {
        return foo;
    }
}
