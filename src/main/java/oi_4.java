import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class oi_4 implements Runnable {
   final CB X;

   oi_4(CB var1) {
      this.X = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(255294524467463739L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(619546342381877635L);
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





