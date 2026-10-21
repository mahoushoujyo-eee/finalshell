import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class aF implements ChangeListener {
   final Qg_2 d;

   aF(Qg_2 var1) {
      this.d = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      Method var10000 = (Method)com.c.c(368966479006037777L).get(com.c.c(468394628993116963L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(168252186092657055L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      ((Vn_2)com.c.c(368966479006037777L).get(com.c.c(468394628993116963L).get(this))).repaint();
   }
}





