import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class YC implements Runnable {
   final zM w;

   YC(zM var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.f();
      Method var2 = com.c.d(168325533756172104L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





