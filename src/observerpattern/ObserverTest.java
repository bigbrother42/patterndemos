package observerpattern;

public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1()); // 订阅这个对象
        sub.add(new Observer2());

        sub.operation(); // 发出改变的一个通知
    }
}
