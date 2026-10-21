import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class aw_2 implements Runnable {
   final YI R;

   aw_2(YI var1) {
      this.R = var1;
   }

   @Override
   public void run() {
      try {
         Method var10000 = (Method)com.c.c(275061180115109797L).get(com.c.c(454074474896944253L).get(this));
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(554677732047204965L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}





