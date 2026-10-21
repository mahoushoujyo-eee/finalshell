import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class zQ implements Runnable {
   final Ul_2 A;

   zQ(Ul_2 var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(393801433552238231L).get(com.c.c(305774498485143426L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(565917871429439956L);
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





