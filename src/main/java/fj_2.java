import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Fj_2 implements Runnable {
   final U q;

   Fj_2(U var1) {
      this.q = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(572988005050429118L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(573491141587592431L);
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





