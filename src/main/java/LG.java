import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTextField;

class LG implements KeyListener {
   final xl_2 s;
   private static final long a;

   LG(xl_2 var1) {
      this.s = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == (int)a) {
         String var2 = ((JTextField)com.c.c(626158744249045388L).get(com.c.c(414662050894156863L).get(this))).getText().trim();
         ((JTextField)com.c.c(626158744249045388L).get(com.c.c(414662050894156863L).get(this)))
            .setCaretPosition(((JTextField)com.c.c(626158744249045388L).get(com.c.c(414662050894156863L).get(this))).getDocument().getLength());
         Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new m1(this, var2));
         Method var10003 = com.c.d(434592463220957006L);
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
      long var0 = 8164457927423876175L;
      long var10002 = -4441011223634846651L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





