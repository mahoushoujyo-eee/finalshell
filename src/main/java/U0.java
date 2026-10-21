import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class U0 implements Runnable {
   final TF L;

   U0(TF var1) {
      this.L = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(152418249076262564L).get(com.c.c(206736569318369403L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(562927769813494074L);
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





