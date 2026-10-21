import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class mr_2 implements ActionListener {
   final mi_2 H;

   mr_2(mi_2 var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(289029244182343081L).get(this);
      Object[] var10001 = com.c.a(null);
      Method var10003 = com.c.d(519002930381305189L);
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





