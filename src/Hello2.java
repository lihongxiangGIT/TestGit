
public class Hello2 {
	public static void main(String[] args) {

	HelloService helloService=(String firstname, String lastname) -> 
	{ String hello="Hello " + firstname + " " + lastname; return hello; };
	System.out.println(helloService.hello("jack", "Stephon"));
	}
}	
