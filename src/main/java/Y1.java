import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Y1 implements KeyListener {
   final p4 Q;
   private static final long a;

   Y1(p4 var1) {
      this.Q = var1;
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
         Method var10000 = (Method)com.c.c(383322541628621626L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(335130564152588696L);
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
      long var0 = 4344079865247896734L;
      long var10002 = 4969939445899269268L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





