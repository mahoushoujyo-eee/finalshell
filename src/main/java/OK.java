import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

class OK implements KeyListener {
   final o2_2 R;

   OK(o2_2 var1) {
      this.R = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      com.c.c(225851015118401415L).set(com.c.c(606863927096470668L).get(this), KeyStroke.getKeyStrokeForEvent(var1));
      JTextField var10000 = (JTextField)com.c.c(429365332657596163L).get(com.c.c(606863927096470668L).get(this));
      Object[] var10001 = com.c.a(com.c.c(225851015118401415L).get(com.c.c(606863927096470668L).get(this)));
      Method var3 = com.c.d(214304962730069281L);
      Object[] var6 = var10001;
      Object var5 = null;

      try {
         var10001 = (String)var3.invoke(var5, var6);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10000.setText(var10001);
   }
}





