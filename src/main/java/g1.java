import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class g1 implements Runnable {
   final Fm_2 d;

   g1(Fm_2 var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      Dv_2 var10000 = com.c.a(com.c.c(503810328741634318L).get(this));
      Method var2 = com.c.d(229916307541783595L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         var10000 = (Dv_2)var2.invoke(var4, var5);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      var10000.setText("");
   }
}





