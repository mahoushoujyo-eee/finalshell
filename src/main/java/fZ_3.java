import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class fZ_3 implements Runnable {
   final CL F;

   fZ_3(CL var1) {
      this.F = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(513583176910431633L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(301040545199815839L);
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





