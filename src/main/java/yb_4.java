import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class yb_4 implements ActionListener {
   final U k;

   yb_4(U var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Method var10000 = (Method)com.c.c(225503351965021643L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(361892076397147493L);
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





