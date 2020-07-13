package person;

/**
 * @author lihaiyu
 */
public interface PersonInterface {
    //设置姓和名
    public void setFirstName(String str);
    public void setLastName(String str);
    //获取姓、名、全名
    public String getFirstName();
    public String getLastName();
    public String getFullName();
}
