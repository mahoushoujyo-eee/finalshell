import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Dw_2 implements KeyListener {
   final Km_2 d;

   Dw_2(Km_2 var1) {
      this.d = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      Method var10000 = (Method)com.c.c(331468898228971516L).get(com.c.c(615963704623067593L).get(this));
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(161648209246737663L);
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





