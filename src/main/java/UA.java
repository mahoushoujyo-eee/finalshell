import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class UA implements Runnable {
   @Override
   public void run() {
      Object[] var10000 = com.c.f();
      Method var2 = com.c.d(230725977916703027L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





