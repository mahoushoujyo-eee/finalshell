import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Ju_2 implements ActionListener {
   final F7 e;

   Ju_2(F7 var1) {
      this.e = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(261859577846792101L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(409215763224146997L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      ((F7)com.c.c(261859577846792101L).get(this)).setVisible(false);
   }
}





