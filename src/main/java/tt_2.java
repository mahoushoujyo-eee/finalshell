import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Tt_2 implements Runnable {
   final s F;

   Tt_2(s var1) {
      this.F = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(434996761704522558L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(380866699589160754L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





