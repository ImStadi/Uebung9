package login;

public class Login
{
    String username;
    String password;

    public Login()
    {
        this.username = "test";
        this.password = "test";
    }

    public boolean CorrectLogin (String user, String passwd)
    {
        if (user.equals(username) && passwd.equals(password))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
