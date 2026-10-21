import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ui_4 implements Runnable {
   final zD q;

   ui_4(zD var1) {
      this.q = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(232941551205899993L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(221509155912118006L);
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





