import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Yq_2 implements Runnable {
   final String N;
   final TL E;

   Yq_2(TL var1, String var2) {
      this.E = var1;
      this.N = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(627973027287447539L).get(com.c.c(285052103515156702L).get(com.c.c(500933715607216743L).get(this)));
      Object[] var10001 = com.c.a(com.c.c(610438136343326774L).get(this), true, true);
      Method var10003 = com.c.d(413727787977868950L);
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





