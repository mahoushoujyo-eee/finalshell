import java.net.SocketException;

public class ti_4 extends SocketException {
   private String H;

   public ti_4(String var1, String var2) {
      super(var1);
      this.H = var2;
   }

   public String a() {
      return this.H;
   }
}





