import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class nS implements Runnable {
   final Ty_2 m;

   nS(Ty_2 var1) {
      this.m = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(270290619286314259L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(516570048275578990L);
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





