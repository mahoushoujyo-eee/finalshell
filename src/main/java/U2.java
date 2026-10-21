import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

class U2 implements ActionListener {
   final nx_2 t;
   private static final String a;

   U2(nx_2 var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var10000 = Km_2.U();
      String var3 = JOptionPane.showInputDialog(((Km_2)com.c.c(166731455568463101L).get(com.c.c(199671164151222333L).get(this))).getParent(), a);
      String var2 = var10000;
      var10000 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var10000 = var3;
      }

      if (!var10000.equals("")) {
         var10000 = (String)com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new YL(this, var3));
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
      char[] var10003 = "斪什夏启秪\u001bP".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 28;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 28;
         var10006 = var0;
      } else {
         var6 = 28;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 28;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 49;
               break;
            case 1:
               var23 = 42;
               break;
            case 2:
               var23 = 42;
               break;
            case 3:
               var23 = 62;
               break;
            case 4:
               var23 = 6;
               break;
            case 5:
               var23 = 61;
               break;
            default:
               var23 = 108;
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





