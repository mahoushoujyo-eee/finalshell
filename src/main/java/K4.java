import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class K4 implements Runnable {
   final WT v;

   K4(WT var1) {
      this.v = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(392747189541455450L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(448870905616495851L);
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





