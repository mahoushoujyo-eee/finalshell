import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.Hashtable;

class Fk_2 implements Runnable {
   final L9 U;
   final f3_2 d;
   final String Q;
   private static final long a;

   Fk_2(L9 var1, f3_2 var2, String var3) {
      this.U = var1;
      this.d = var2;
      this.Q = var3;
   }

   @Override
   public void run() {
      com.ky_4[] var10000 = yT_3.c();
      int var2 = 0;
      com.ky_4[] var1 = var10000;

      while (true) {
         try {
            if (var1 == null) {
               return;
            }

            if (var2 >= 1) {
               break;
            }
         } catch (Exception var11) {
            throw a(var11);
         }

         try {
            var10000 = (com.ky_4[])com.c.c(508038361377045891L).get(this);
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(564648154927582737L);
            Object[] var10002 = var10001;
            var10001 = var10000;
            Method var13 = var10003;

            try {
               var14 = (String)var13.invoke(var10001, var10002);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            Object[] var15 = com.c.a(InetAddress.getByName(var14).getHostAddress());
            Method var16 = com.c.d(602697815696322216L);
            var10002 = var15;
            var10001 = null;

            try {
               var17 = (zh_2)var16.invoke(var10001, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            zh_2 var3 = var17;
            var10000 = (com.ky_4[])com.c.c(508038361377045891L).get(this);
            var10001 = com.c.a(var3);
            var10003 = com.c.d(432746213469381812L);
            var10002 = var10001;
            var10001 = var10000;
            Method var19 = var10003;

            try {
               var19.invoke(var10001, var10002);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            var10000 = (com.ky_4[])com.c.c(394503099456042459L).get(this);
            var10001 = com.c.a(com.c.c(508038361377045891L).get(this));
            var10003 = com.c.d(137222181119797019L);
            var10002 = var10001;
            var10001 = var10000;
            Method var21 = var10003;

            try {
               var21.invoke(var10001, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            ((Hashtable)com.c.c(447779733764178905L).get(null)).put((String)com.c.c(350883208365418364L).get(this), var3);
            break;
         } catch (Exception var10) {
            try {
               Thread.sleep(a);
            } catch (InterruptedException var5) {
               var5.printStackTrace();
            }

            var2++;
            if (var1 == null) {
               break;
            }
         }
      }

      ((HashSet)com.c.c(317469799130091897L).get(null)).remove((String)com.c.c(350883208365418364L).get(this));
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      long var0 = 2269056343135973305L;
      long var10002 = 2269056343135972941L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





