import java.awt.Frame;
import javax.swing.JDialog;

public class n8 extends JDialog {
   U D;
   zm_2 k;
   private static final String a;

   public n8(U var1) {
      super((Frame)var1);
      com.c.c(459555214947597132L).set(this, var1);
      boolean var10000 = zm_2.e();
      this.setTitle(a);
      boolean var2 = var10000;
      com.c.c(307693539894818069L).set(this, new zm_2());
      this.setContentPane((zm_2)com.c.c(307693539894818069L).get(this));
      this.pack();
      this.setLocationRelativeTo(var1);
      this.setVisible(true);
      if (com.ky_4.F() != null) {
         zm_2.D(!var2);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "齓栍讗罴".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 109;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 109;
         var10006 = var0;
      } else {
         var6 = 109;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 109;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 30;
               break;
            case 1:
               var23 = 103;
               break;
            case 2:
               var23 = 68;
               break;
            case 3:
               var23 = 119;
               break;
            case 4:
               var23 = 40;
               break;
            case 5:
               var23 = 70;
               break;
            default:
               var23 = 9;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





