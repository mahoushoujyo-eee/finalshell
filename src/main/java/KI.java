import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

class KI implements Runnable {
   final uf_4 z;
   final a3 D;

   KI(a3 var1, uf_4 var2) {
      this.D = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      int[] var10000 = a3.I();
      Iterator var2 = ((ArrayList)com.c.c(499316983962981071L).get(com.c.c(180038062700866876L).get(this))).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         td_4 var3 = (td_4)var2.next();
         Object[] var10001 = com.c.a(com.c.c(455667230271654367L).get(this));
         Method var10003 = com.c.d(180521697850994272L);
         Object[] var10002 = var10001;
         td_4 var6 = var3;
         Method var5 = var10003;

         try {
            var5.invoke(var6, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         if (var1 == null) {
            break;
         }
      }
   }
}





