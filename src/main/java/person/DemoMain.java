package person;

/**
 * @author lihaiyu
 */

public class DemoMain {

    public static void showName(PersonInterfaceImpl impl){
        System.out.println("姓："+impl.getFirstName());
        System.out.println("名："+impl.getLastName());
        System.out.println("全名："+impl.getFullName());
    }
    public static void main(String[] args) {

        /**************************使用接口类*************/
        PersonInterfaceImpl impl = new PersonInterfaceImpl();
        System.out.println("*****默认姓名*****");
        showName(impl);
        impl.setFirstName("李");
        impl.setLastName("四");
        System.out.println("*****修改姓名*****");
        showName(impl);
    }
}
