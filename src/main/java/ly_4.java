import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

class ly_4 implements ActionListener {
   final Wx_2 E;
   private static final String a;

   ly_4(Wx_2 var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var10000 = a3.I();
      String var3 = JOptionPane.showInputDialog(((a3)com.c.c(305402254993059552L).get(com.c.c(357358512404315725L).get(this))).getParent(), a);
      int[] var2 = var10000;
      String var5 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var5 = var3;
      }

      if (!var5.equals("")) {
         var10000 = (int[])com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new kP_3(this, var3));
         Method var10003 = com.c.d(434592463220957006L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var7 = var10003;

         try {
            var7.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "斸件夣吢秊2\u0004".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 10;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 10;
         var10006 = var0;
      } else {
         var6 = 10;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 10;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 53;
               break;
            case 1:
               var23 = 10;
               break;
            case 2:
               var23 = 16;
               break;
            case 3:
               var23 = 37;
               break;
            case 4:
               var23 = 48;
               break;
            case 5:
               var23 = 2;
               break;
            default:
               var23 = 46;
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





