import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Uq_2 implements ActionListener {
   final nj_2 E;

   Uq_2(nj_2 var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(301903381895589877L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(378734658016285263L);
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





