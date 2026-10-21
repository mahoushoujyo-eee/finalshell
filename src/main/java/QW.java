import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class QW implements Runnable {
   final String I;
   final mL l;

   QW(mL var1, String var2) {
      this.l = var1;
      this.I = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(347805637754599459L).get(com.c.c(339502436883578119L).get(this));
      Object[] var10001 = com.c.a(com.c.c(307059608814817737L).get(this));
      Method var10003 = com.c.d(138118316736819193L);
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





