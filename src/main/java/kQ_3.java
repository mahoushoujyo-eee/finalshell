import com._C;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPopupMenu;

class kQ_3 implements ActionListener {
   final y1_2 y;
   final Jx_2 Y;
   private static final long a;

   kQ_3(Jx_2 var1, y1_2 var2) {
      this.Y = var1;
      this.y = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = Jx_2.O();
      kQ_3 var10000 = this;
      if (var2 == null) {
         var10000 = (kQ_3)com.c.c(468253182890378749L).get(this);
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
            Dimension var3 = ((JPopupMenu)com.c.c(468326905894456044L).get(com.c.c(164442468897949047L).get(this))).getPreferredSize();
            ((JPopupMenu)com.c.c(468326905894456044L).get(com.c.c(164442468897949047L).get(this)))
               .show(
                  (_C)com.c.c(435031631667149019L).get(com.c.c(164442468897949047L).get(this)),
                  (int)a,
                  ((_C)com.c.c(435031631667149019L).get(com.c.c(164442468897949047L).get(this))).getHeight() + 4
               );
            if (var2 == null) {
               return;
            }
         }

         var10000 = this;
      }

      ((JPopupMenu)com.c.c(468326905894456044L).get(com.c.c(164442468897949047L).get(var10000))).setVisible(false);
   }

   static {
      long var0 = 1654064544388987467L;
      long var10002 = 7960623010776368560L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





