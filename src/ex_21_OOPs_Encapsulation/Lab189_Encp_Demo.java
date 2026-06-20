package ex_21_OOPs_Encapsulation;

public class Lab189_Encp_Demo {
    static void main(String[] args) {
        VWOLogin vwwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwwoLogin.password);
        vwwoLogin.password = "3455";
        System.out.println(vwwoLogin.password);

        GoodVWOLogin goodVWO = new GoodVWOLogin("admin","hunter");
        System.out.println(goodVWO.getPassword());
        System.out.println(goodVWO.setPassword("hunter12"));
    }

}

class VWOLogin{
    public String userName;
    public String password;

    public VWOLogin(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

}

class GoodVWOLogin{
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public boolean setPassword(String password) {
        this.password = password;
        return false;
    }

    private String userName;
    private String password;

    GoodVWOLogin(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}