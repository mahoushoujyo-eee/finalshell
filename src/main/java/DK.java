import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DK implements Runnable {
   final aM q;

   DK(aM var1) {
      this.q = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(491215108764495688L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(252467289908772906L);
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





