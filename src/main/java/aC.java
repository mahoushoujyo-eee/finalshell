import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class aC implements Runnable {
   final Km_2 i;

   aC(Km_2 var1) {
      this.i = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(132406367702544046L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(258105725179591793L);
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





