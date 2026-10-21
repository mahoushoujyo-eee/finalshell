import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Fe_2 implements Runnable {
   final Window A;
   private static final long a;

   Fe_2(Window var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      com.ky_4[] var10000 = yT_3.c();
      int var2 = 0;
      com.ky_4[] var1 = var10000;

      while (var2 < 1) {
         Object[] var6 = com.c.a(com.c.c(195849108616798451L).get(this));
         Method var7 = com.c.d(219945543022327308L);
         Object[] var9 = var6;
         Object var8 = null;

         try {
            var7.invoke(var8, var9);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         try {
            Thread.sleep(a);
         } catch (InterruptedException var4) {
            var4.printStackTrace();
         }

         var2++;
         if (var1 == null) {
            break;
         }
      }
   }

   static {
      long var0 = 3782035904469922761L;
      long var10002 = 3782035904469922811L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





