import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class zy_2 implements Runnable {
   final WT u;

   zy_2(WT var1) {
      this.u = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(381160524526960651L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(180191510188721772L);
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





