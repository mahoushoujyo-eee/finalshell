import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FU implements Runnable {
   final yT_3 K;

   FU(yT_3 var1) {
      this.K = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.f();
      Method var2 = com.c.d(579488513565403011L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





