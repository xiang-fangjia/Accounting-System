package AccountSystem.bean;
/*会话实体类*/
public class Session {
    // Users对象属性
    private static User user;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        Session.user = user;
    }
}
