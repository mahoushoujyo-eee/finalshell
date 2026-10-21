import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class fy_4 implements Runnable {
   final b7_2 n;

   fy_4(b7_2 var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(440529940248018366L).get(com.c.c(263718116894060700L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(399329213267848661L);
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





