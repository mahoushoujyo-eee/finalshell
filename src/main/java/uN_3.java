import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class uN_3 implements Runnable {
   final com.DI k;
   final F6 n;

   uN_3(F6 var1, com.DI var2) {
      this.n = var1;
      this.k = var2;
   }

   @Override
   public void run() {
      try {
         Object[] var10000 = com.c.a(com.c.c(308169149668482324L).get(this), com.c.c(155399014126418660L).get(this));
         Method var4 = com.c.d(393095262109418205L);
         Object[] var6 = var10000;
         Object var5 = null;

         try {
            var4.invoke(var5, var6);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}





