import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class oF_3 implements Runnable {
   final yT_3 E;

   oF_3(yT_3 var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(422887422003221225L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(413194456365551229L);
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





