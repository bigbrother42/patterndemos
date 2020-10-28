package singlepattern;

public class Test {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.doTest();
    }
}
