import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DM implements Runnable {
   final lm_4 F;

   DM(lm_4 var1) {
      this.F = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(com.c.c(636752062782772004L).get(com.c.c(275628384420924903L).get(com.c.c(283419271612920079L).get(this))));
      Method var2 = com.c.d(264379078899316637L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }
}





