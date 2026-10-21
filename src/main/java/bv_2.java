import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Bv_2 implements Runnable {
   final Ty_2 V;

   Bv_2(Ty_2 var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(com.c.c(359898254707283044L).get(this));
      Method var2 = com.c.d(395648233250236832L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





