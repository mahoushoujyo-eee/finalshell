import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class xR implements ActionListener {
   final Yj_2 m;

   xR(Yj_2 var1) {
      this.m = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(352347871280815957L).get(com.c.c(398122351850797043L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(506366507584924367L);
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





