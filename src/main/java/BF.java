import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class BF implements Runnable {
   final ArrayList h;
   final CB R;

   BF(CB var1, ArrayList var2) {
      this.R = var1;
      this.h = var2;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(414347828709011535L).get(com.c.c(450927814935428182L).get(this));
      Object[] var10001 = com.c.a(com.c.c(472421458783157056L).get(this));
      Method var10003 = com.c.d(631850759663681853L);
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





