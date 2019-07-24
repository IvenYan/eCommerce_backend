package hwj;

public class Demo {

    public static void main(String[] args) throws Exception {
        // 普通方式初始化
        hwj.GoogleApi googleApi = new hwj.GoogleApi();
        // 通过代理
//        GoogleApi googleApi = new GoogleApi("122.224.227.202", 3128);
        String result = googleApi.translate("hello world", "zh");
        System.out.println(result);
    }
}
