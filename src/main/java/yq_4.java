import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class yq_4 implements ActionListener {
   final DU H;

   yq_4(DU var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.f();
      Method var3 = com.c.d(408749724293144730L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         var3.invoke(var4, var5);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





