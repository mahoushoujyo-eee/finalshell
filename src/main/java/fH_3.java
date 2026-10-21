import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;

class fH_3 implements Runnable {
   final dX_3 h;
   private static final long a;

   fH_3(dX_3 var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      try {
         InetAddress var1 = InetAddress.getByName(this.h.B);
         dX_3 var10000 = this.h;
         d8_2 var10001 = xQ.x;
         Object[] var10002 = com.c.a(new Qt_2(this, var1), (int)a);
         Method var10004 = com.c.d(201859364639460244L);
         Object[] var10003 = var10002;
         d8_2 var7 = var10001;
         Method var5 = var10004;

         try {
            var6 = (gH)var5.invoke(var7, var10003);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var10000.G = var6;
      } catch (UnknownHostException var4) {
         var4.printStackTrace();
      }
   }

   static dX_3 P(fH_3 var0) {
      return var0.h;
   }

   static {
      long var0 = 3148035430290545526L;
      long var10002 = 915072209294186654L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





