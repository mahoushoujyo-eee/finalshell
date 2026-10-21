import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class QC implements Runnable {
   final dl_4 O;

   QC(dl_4 var1) {
      this.O = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(402713754232817284L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(478221716271290912L);
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





