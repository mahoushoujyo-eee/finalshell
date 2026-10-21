import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ot_4 implements Runnable {
   final yT_3 I;

   ot_4(yT_3 var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.f();
      Method var2 = com.c.d(429416536723437999L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         var10000 = (Object[])var2.invoke(var4, var5);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      com.c.c(620693334424877816L).set(null, var10000);
   }
}





