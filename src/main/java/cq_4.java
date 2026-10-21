import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class cq_4 implements ActionListener {
   final DU v;

   cq_4(DU var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(166071252229081328L).get(this);
      Object[] var10001 = com.c.a(false);
      Method var10003 = com.c.d(428799125269163538L);
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





