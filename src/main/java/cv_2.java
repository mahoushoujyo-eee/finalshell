import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Cv_2 implements Runnable {
   final Og_2 s;

   Cv_2(Og_2 var1) {
      this.s = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(131037384951395357L).get(com.c.c(458734249689079588L).get(com.c.c(298409598470946298L).get(this)));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(165299079289979588L);
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





