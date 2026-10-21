import java.awt.Window;
import javax.swing.JDialog;

public class C5 extends JDialog {
   long F;
   Ka_2 p;
   private static final long[] a;
   private static final Integer[] b;

   public C5(Window var1) {
      super(var1);
      Ka_2.N();
      com.c.c(251556217132141241L).set(this, new Ka_2(this));
      this.setUndecorated(true);
      this.setContentPane((Ka_2)com.c.c(251556217132141241L).get(this));
      this.addWindowFocusListener(new Ly_2(this));
      this.setSize(a(12049, 4413152635144420310L), a(30713, 5238199958991463231L));
      if (com.ky_4.F() != null) {
         Ka_2.U(new com.ky_4[4]);
      }
   }

   public long H() {
      return com.c.c(551384867496479483L).getLong(this);
   }

   public void z(long var1) {
      com.c.c(551384867496479483L).setLong(this, var1);
   }

   public Ka_2 A() {
      return (Ka_2)com.c.c(251556217132141241L).get(this);
   }

   public void T(Ka_2 var1) {
      com.c.c(251556217132141241L).set(this, var1);
   }

   static {
      long var0 = 4838215078567540871L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÎS)µêÒ\u001aø+A]gu¨B\u000f";
      int var5 = "ÎS)µêÒ\u001aø+A]gu¨B\u000f".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5318;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





