import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ff_4 implements Runnable {
   final Bq_2 h;

   ff_4(Bq_2 var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(com.c.c(472901249679020151L).get(this));
      Method var2 = com.c.d(217599039783512051L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





