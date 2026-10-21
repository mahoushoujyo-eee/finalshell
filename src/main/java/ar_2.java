import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ar_2 extends WindowAdapter {
   final ta_4 M;

   ar_2(ta_4 var1) {
      this.M = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(455891641469735311L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(262207364175608475L);
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





