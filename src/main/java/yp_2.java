import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Yp_2 implements KeyListener {
   final TM a;
   private static final long b;

   Yp_2(TM var1) {
      this.a = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String var2 = aA.z();
      if (var2 == null && var1.getKeyCode() == (int)b) {
         ((TM)com.c.c(375005397175227093L).get(this)).stopCellEditing();
      }
   }

   static {
      long var0 = 1995765593045538617L;
      long var10002 = 3831334980704606003L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





