import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class D7 implements Runnable {
   final mV B;

   D7(mV var1) {
      this.B = var1;
   }

   @Override
   public void run() {
      boolean var1 = ln_4.i();
      mV var10000 = (mV)com.c.c(232335853224685312L).get(this);
      if (var1) {
         if (!com.c.c(303519943996955852L).getBoolean(var10000)) {
            return;
         }

         var10000 = (mV)com.c.c(232335853224685312L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(619282492819259929L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var4 = var10003;

         try {
            var4.invoke(var10001, var10002);
         } catch (InvocationTargetException var2) {
            throw var2.getTargetException();
         }

         var10000 = (mV)com.c.c(232335853224685312L).get(this);
      }

      com.c.c(303519943996955852L).setBoolean(var10000, false);
   }
}





