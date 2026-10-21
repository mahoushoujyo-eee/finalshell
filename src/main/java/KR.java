import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;

class KR implements ActionListener {
   final DU d;
   private static final String a;

   KR(DU var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.a(a);
      Method var5 = com.c.d(517287540690064504L);
      Object[] var12 = var10000;
      Object var9 = null;

      try {
         var10000 = (String)var5.invoke(var9, var12);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      String var2 = var10000;
      ((JLabel)com.c.c(550961635451839925L).get(com.c.c(477342503026871908L).get(this))).setText(var2);
      var10000 = (Object[])com.c.c(388376917454860932L).get(null);
      var9 = com.c.a(new Yk_2(this));
      Method var10003 = com.c.d(434592463220957006L);
      var12 = (Object[])var9;
      var9 = var10000;
      Method var8 = var10003;

      try {
         var8.invoke(var9, var12);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "1nohn-K,|\f\u001aN\u0015v.\u007f\u00197~vZ\bZ\f\u0012[3z\u0013R\u0011pk\tZWx\u0019\u0010\u007f\u001c2\n~\f\r=#N\u0012@\b4@\u0014$\f\u0001(f"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 24;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 24;
         var10006 = var0;
      } else {
         var6 = 24;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 24;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 123;
               break;
            case 1:
               var23 = 50;
               break;
            case 2:
               var23 = 71;
               break;
            case 3:
               var23 = 67;
               break;
            case 4:
               var23 = 21;
               break;
            case 5:
               var23 = 92;
               break;
            default:
               var23 = 5;
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





