public class Singleton {
    private static Singleton _instance=null;
    private String data;
    protected Singleton() {
        data = null;
    }
    public static Singleton Instance() {
        if (_instance==null) {
            _instance = new Singleton();
            return _instance;
        }
        else
            return null;
    }
    public void Set(String d) {
        data = d;
    }

    public String Get() { return data; }

    public void IsData() {
        if(data.matches("^(?:(?:(?:0[1-9]|[12]\\d|3[01])/(?:0[13578]|1[02])|(?:0[1-9]|[12]\\d|30)/(?:0[469]|11)|(?:0[1-9]|1\\d|2[0-8])/02)/(?!0000)\\d{4}|(?:(?:0[1-9]|[12]\\d)/02/(?:(?!0000)(?:[02468][048]|[13579][26])00|(?!..00)\\d{2}(?:[02468][048]|[13579][26]))))$"))
            System.out.println("Data - " + data);
        else
            System.out.println(data + " is not a correct data");
    }
}

