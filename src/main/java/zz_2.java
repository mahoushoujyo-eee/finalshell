import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.Hashtable;

class zz_2 implements Runnable {
   final String A;
   private static final long a;

   zz_2(String var1) {
      this.A = var1;
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
         } catch (Exception var8) {
            throw a(var8);
         }

         try {
            Object[] var9 = com.c.a(InetAddress.getByName((String)com.c.c(247010010226726452L).get(this)).getHostAddress());
            Method var10 = com.c.d(602697815696322216L);
            Object[] var13 = var9;
            Object var12 = null;

            try {
               var11 = (zh_2)var10.invoke(var12, var13);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            zh_2 var3 = var11;
            ((Hashtable)com.c.c(447779733764178905L).get(null)).put((String)com.c.c(247010010226726452L).get(this), var3);
            break;
         } catch (Exception var7) {
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

      ((HashSet)com.c.c(317469799130091897L).get(null)).remove((String)com.c.c(247010010226726452L).get(this));
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      long var0 = 7378301255278588148L;
      long var10002 = 7378301255278588160L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





