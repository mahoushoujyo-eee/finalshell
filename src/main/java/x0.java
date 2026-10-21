import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class x0 implements ActionListener {
   final Ka_2 M;

   x0(Ka_2 var1) {
      this.M = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.a(com.c.c(447445157306867736L).get(com.c.c(516194669640382242L).get(this)));
      Method var3 = com.c.d(264379078899316637L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         var3.invoke(var4, var5);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





