import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class T4 implements Runnable {
   final ya_4 G;

   T4(ya_4 var1) {
      this.G = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(com.c.c(355468840123996031L).get(com.c.c(544896587708147604L).get(com.c.c(514798711085199978L).get(this))));
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





