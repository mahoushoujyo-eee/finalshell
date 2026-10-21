import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

class Y8 implements Runnable {
   final String S;
   final fJ_3 y;
   private static final String a;

   Y8(fJ_3 var1, String var2) {
      this.y = var1;
      this.S = var2;
   }

   @Override
   public void run() {
      try {
         Method var10000 = (Method)com.c.c(476201740043670453L).get(com.c.c(427341422247993135L).get(com.c.c(363274653628888003L).get(this)));
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(346382751221538814L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000 = (Method)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var10001 = (Object[])com.c.c(166731455568463101L).get(com.c.c(427341422247993135L).get(com.c.c(363274653628888003L).get(this)));
         var10002 = com.c.f();
         Method var10004 = com.c.d(565315838989287146L);
         Object[] var28 = var10002;
         var10002 = var10001;
         Method var13 = var10004;

         try {
            var10001 = (Object[])var13.invoke(var10002, var28);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10002 = com.c.f();
         var10004 = com.c.d(152919711700242153L);
         Object[] var29 = var10002;
         var10002 = var10001;
         Method var15 = var10004;

         try {
            var10001 = (Object[])var15.invoke(var10002, var29);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var10002 = com.c.f();
         var10004 = com.c.d(498856411508641826L);
         Object[] var30 = var10002;
         var10002 = var10001;
         Method var17 = var10004;

         try {
            var10001 = (Object[])var17.invoke(var10002, var30);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var10001 = com.c.a(var10001, com.c.c(424479769549909696L).get(this));
         var10003 = com.c.d(502687824919125732L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
         JOptionPane.showMessageDialog(
            SwingUtilities.getWindowAncestor((a3)com.c.c(476201740043670453L).get(com.c.c(427341422247993135L).get(com.c.c(363274653628888003L).get(this)))), a
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "则康斀亯夦贬\u007f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 58;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      } else {
         var6 = 58;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 56;
               break;
            case 1:
               var23 = 119;
               break;
            case 2:
               var23 = 61;
               break;
            case 3:
               var23 = 99;
               break;
            case 4:
               var23 = 45;
               break;
            case 5:
               var23 = 51;
               break;
            default:
               var23 = 100;
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





