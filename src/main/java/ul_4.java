import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ul_4 implements Runnable {
   final YQ U;

   ul_4(YQ var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(127602324048157648L).get(this);
      Object[] var10001 = com.c.a(com.c.c(396737168650694975L).get(null));
      Method var10003 = com.c.d(283179149030029231L);
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





