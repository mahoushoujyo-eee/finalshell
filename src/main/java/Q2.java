import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Q2 implements ActionListener {
   final nx_2 d;

   Q2(nx_2 var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.a(com.c.c(166731455568463101L).get(com.c.c(636455380658783577L).get(this)));
      Method var3 = com.c.d(211273487601650149L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         var3.invoke(var4, var5);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





