import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class K7 implements Runnable {
   final yT_3 p;

   K7(yT_3 var1) {
      this.p = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(224900151959412301L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(398517794264889337L);
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





