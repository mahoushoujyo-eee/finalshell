import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class m1 implements Runnable {
   final String F;
   final LG p;

   m1(LG var1, String var2) {
      this.p = var1;
      this.F = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(294487557435087442L).get(com.c.c(414662050894156863L).get(com.c.c(251848875917497846L).get(this)));
      Object[] var10001 = com.c.a(com.c.c(557992366598426798L).get(this), true, true);
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





