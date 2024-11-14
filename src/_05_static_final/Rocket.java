package _05_static_final;

// //方法1:
// eager: 一上来就要创建这个对象; 没有线程安全问题
//public class Rocket {
//    private static Rocket rocket = new Rocket();
//    private Rocket() {}
//
//    //对外的接口
//    public static Rocket getRocket() {
//        return rocket;
//    }
//}

// 方法2:
// lasier:
public class Rocket {
    private static Rocket rocket = null;

    private Rocket() {

    }

    public static Rocket getInstance() {
        if (rocket == null) {
            rocket = new Rocket();
        }
        return rocket;
    }
}
