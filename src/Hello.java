public class Hello {
   String firstname;
   String lastname;
   public Hello() {}
   public Hello(String firstname, String lastname) {
      this.firstname = firstname;
      this.lastname = lastname;}
   public void hello() {
      System.out.println("Hell3o " + firstname + " " + lastname);}
   public static void main(String[] args) {
      Hello hello = new Hello(args[0], args[1]);
      hello.hello();
   }
}