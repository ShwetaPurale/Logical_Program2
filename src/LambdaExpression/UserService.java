package LambdaExpression;

public interface UserService {
    String getLogin(User user);
    default public void showMsg()
    {
    	System.out.println("Validated User");
    }
}
