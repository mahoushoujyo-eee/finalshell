import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Kx_2 implements Runnable {
   final dA_3 E;

   Kx_2(dA_3 var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(215526989813745242L).get(com.c.c(576526388784622692L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(373868045552747003L);
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





