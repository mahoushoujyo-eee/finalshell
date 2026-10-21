import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class VA implements KeyListener {
   final gS z;
   private static final long a;

   VA(gS var1) {
      this.z = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 == (int)a) {
         Method var10000 = (Method)com.c.c(406797138190014770L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(506035368637771784L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   static {
      long var0 = 817576603889992812L;
      long var10002 = 5874228539922351206L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





