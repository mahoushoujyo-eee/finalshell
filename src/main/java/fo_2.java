import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Fo_2 implements Runnable {
   final mx_2 S;

   Fo_2(mx_2 var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.f();
      Method var2 = com.c.d(144914432566992060L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





