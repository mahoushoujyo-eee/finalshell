import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class xp_2 implements KeyListener {
   final KC E;
   private static final long a;

   xp_2(KC var1) {
      this.E = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int[] var2 = a3.I();
      if (var2 != null && var1.getKeyCode() == (int)a) {
         ((KC)com.c.c(180777725202577610L).get(this)).stopCellEditing();
      }
   }

   static {
      long var0 = 4943179860027291373L;
      long var10002 = -2768618212692412697L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





