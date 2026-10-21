import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class tP_3 implements WindowFocusListener {
   final FK u;

   tP_3(FK var1) {
      this.u = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
      com.c.c(351178736107776851L).setLong(com.c.c(121931801821845954L).get(this), System.currentTimeMillis());
      ((Dv_2)com.c.c(265132846717086219L).get(com.c.c(121931801821845954L).get(this))).requestFocus();
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      Method var10000 = (Method)com.c.c(121931801821845954L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(496821856781947383L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      com.c.c(447109474318907086L).setLong(com.c.c(121931801821845954L).get(this), System.currentTimeMillis());
   }
}





