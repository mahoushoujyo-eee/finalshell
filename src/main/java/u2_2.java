import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

class u2_2 extends Authenticator {
   final String j;
   final String z;
   final zU Q;

   u2_2(zU var1, String var2, String var3) {
      this.Q = var1;
      this.j = var2;
      this.z = var3;
   }

   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication((String)com.c.c(522655102270864719L).get(this), (String)com.c.c(423186633558396677L).get(this));
   }
}





