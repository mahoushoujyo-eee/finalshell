import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

class nZ implements Runnable {
   final F_ j;

   nZ(F_ var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      Object[] var10000 = com.c.a(com.c.c(268243776161260323L).get(this));
      Method var2 = com.c.d(560527826014327263L);
      Object[] var5 = var10000;
      Object var4 = null;

      try {
         var10000 = (Dv_2)var2.invoke(var4, var5);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      var10000.n().add((JButton)com.c.c(316737507384357237L).get(com.c.c(268243776161260323L).get(this)), 1);
   }
}





