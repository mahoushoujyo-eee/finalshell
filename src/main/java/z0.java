import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class z0 implements ActionListener {
   final U Z;

   z0(U var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.f();
      Method var3 = com.c.d(323980464366603614L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         var3.invoke(var4, var5);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





