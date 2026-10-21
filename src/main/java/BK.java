import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class BK extends WindowAdapter {
   final U h;

   BK(U var1) {
      this.h = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(264195371654050931L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(445366294732630642L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





