import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class dV_3 implements Runnable {
   final Cp_2 U;

   dV_3(Cp_2 var1) {
      this.U = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(536100890810317032L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(619034462121735526L);
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





