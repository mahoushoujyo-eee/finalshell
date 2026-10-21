import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class a5 implements Runnable {
   final FK j;

   a5(FK var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(202500284452452570L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(527909282492888538L);
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





