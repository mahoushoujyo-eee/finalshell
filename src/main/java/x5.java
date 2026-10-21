import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class x5 implements Runnable {
   final U n;

   x5(U var1) {
      this.n = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(265036161987460101L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(536360337896202451L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(false);
      var10003 = com.c.d(634601920284847200L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10000 = (Method)com.c.c(265036161987460101L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(435963413772485648L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





