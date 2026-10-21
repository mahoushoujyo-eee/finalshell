import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class yL_3 implements Runnable {
   final yT_3 l;

   yL_3(yT_3 var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(0);
      Method var2 = com.c.d(456004516276525137L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





