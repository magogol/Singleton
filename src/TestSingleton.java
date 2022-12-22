public class TestSingleton {

    public static void main(String[] args) {
        Singleton elem = Singleton.Instance();
        if (elem != null) {
            elem.Set("21/13/2022");
            elem.IsData();
        } else
            System.out.println("elem == null");
        Singleton el = Singleton.Instance();
        if (el != null) {
            el.Set("21/11/2022");
            el.IsData();
        } else
            System.out.println("el == null");
    }
}
