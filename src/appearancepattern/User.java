package appearancepattern;

public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 将计算机的启动过程封装成一个类
        computer.startup();
        computer.shutdown();
    }
}
