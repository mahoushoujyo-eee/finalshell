import java.io.Serializable;
import java.net.ServerSocket;

public class BS implements Serializable {
   public int F;
   public int J;
   public String P;
   public String C;
   boolean Y;
   ServerSocket u;
   private static int l;

   public BS() {
      com.c.c(119164611987165839L).setBoolean(this, false);
   }

   public int n() {
      return com.c.c(152188236116144859L).getInt(this);
   }

   public void j(int var1) {
      com.c.c(152188236116144859L).setInt(this, var1);
   }

   public int b() {
      return com.c.c(624294956745947517L).getInt(this);
   }

   public void W(int var1) {
      com.c.c(624294956745947517L).setInt(this, var1);
   }

   public String c() {
      return (String)com.c.c(611732392331370513L).get(this);
   }

   public void D(String var1) {
      com.c.c(611732392331370513L).set(this, var1);
   }

   public String f() {
      return (String)com.c.c(512189539626964799L).get(this);
   }

   public void m(String var1) {
      com.c.c(512189539626964799L).set(this, var1);
   }

   public static void q(int var0) {
      l = var0;
   }

   public static int s() {
      return l;
   }

   public static int t() {
      int var0 = s();
      return var0 == 0 ? 122 : 0;
   }

   static {
      if (t() != 0) {
         q(121);
      }
   }
}





