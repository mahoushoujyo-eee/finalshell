import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TB implements Runnable {
   final JD E;

   TB(JD var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(152815625666990065L).get(com.c.c(586182878466586699L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(219324858743675444L);
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





