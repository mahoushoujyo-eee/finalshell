import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class oj_4 implements Runnable {
   final FA Q;

   oj_4(FA var1) {
      this.Q = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(591504459344043173L).get(com.c.c(314187964346221249L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(358704185326413010L);
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





