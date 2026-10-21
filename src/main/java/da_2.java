import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Da_2 implements Runnable {
   final f3_2 y;

   Da_2(f3_2 var1) {
      this.y = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(498715864659540734L).get(com.c.c(594460525817753444L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(442031661173946549L);
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





