import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Tx_2 implements Runnable {
   final yT_3 V;

   Tx_2(yT_3 var1) {
      this.V = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.f();
      Method var2 = com.c.d(452351916487440010L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





