import com._C;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPopupMenu;

class OS implements MouseListener {
   final y1_2 N;
   final Jx_2 A;
   private static final long a;

   OS(Jx_2 var1, y1_2 var2) {
      this.A = var1;
      this.N = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int[] var2 = Jx_2.O();
      OS var10000 = this;
      if (var2 == null) {
         var10000 = (OS)com.c.c(422578176725739604L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(410760064034581011L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var6 = var10003;

         try {
            var7 = (Boolean)var6.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         if (!var7) {
            if (var1.getButton() != 1) {
               return;
            }

            Dimension var3 = ((JPopupMenu)com.c.c(468326905894456044L).get(com.c.c(573812598832870222L).get(this))).getPreferredSize();
            ((JPopupMenu)com.c.c(468326905894456044L).get(com.c.c(573812598832870222L).get(this)))
               .show(
                  (_C)com.c.c(435031631667149019L).get(com.c.c(573812598832870222L).get(this)),
                  (int)a,
                  ((_C)com.c.c(435031631667149019L).get(com.c.c(573812598832870222L).get(this))).getHeight() + 4
               );
            if (var2 == null) {
               return;
            }
         }

         var10000 = this;
      }

      ((JPopupMenu)com.c.c(468326905894456044L).get(com.c.c(573812598832870222L).get(var10000))).setVisible(false);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   static {
      long var0 = 4601005144823139877L;
      long var10002 = 3274493458899956190L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





