import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bm_4 implements ActionListener {
   final yB_3 R;

   bm_4(yB_3 var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(499934073596807594L).get(com.c.c(252794237954343423L).get(this));
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(469112436702288424L);
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





