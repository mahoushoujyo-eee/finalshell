import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CD implements Runnable {
   final YQ M;

   CD(YQ var1) {
      this.M = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(189300561785992095L).get(this);
      Object[] var10001 = com.c.a(com.c.c(449769185297014212L).get(null));
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





