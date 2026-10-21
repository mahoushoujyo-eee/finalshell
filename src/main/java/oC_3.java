import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class oC_3 implements ActionListener {
   final z2 Q;

   oC_3(z2 var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.f();
      Method var4 = com.c.d(270389152141252877L);
      Object[] var10 = var10000;
      Object var7 = null;

      try {
         var10000 = (Object[])var4.invoke(var7, var10);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var7 = com.c.f();
      Method var10003 = com.c.d(248890456776257543L);
      var10 = (Object[])var7;
      var7 = var10000;
      Method var6 = var10003;

      try {
         var6.invoke(var7, var10);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





