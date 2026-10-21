import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

class G implements MouseListener {
   final y1_2 c;
   final Tg_2 w;
   final F_ V;

   G(F_ var1, y1_2 var2, Tg_2 var3) {
      this.V = var1;
      this.c = var2;
      this.w = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var10000 = F_.F();
      Object[] var10001 = com.c.f();
      Method var13 = com.c.d(270389152141252877L);
      Object[] var25 = var10001;
      Object var20 = null;

      try {
         var10001 = (Object[])var13.invoke(var20, var25);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var20 = com.c.f();
      Method var10004 = com.c.d(284609497308396758L);
      var25 = (Object[])var20;
      var20 = var10001;
      Method var15 = var10004;

      try {
         var15.invoke(var20, var25);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      label61: {
         String[] var2 = var10000;
         int var7 = var1.getButton();
         if (var2 != null) {
            if (var7 != 1) {
               return;
            }

            var8 = this;
            if (var2 == null) {
               break label61;
            }

            var10000 = (String[])com.c.c(218869713873426275L).get(this);
            var10001 = com.c.f();
            Method var27 = com.c.d(410760064034581011L);
            var20 = var10001;
            var10001 = var10000;
            Method var10 = var27;

            try {
               var7 = (Boolean)var10.invoke(var10001, (Object[])var20);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }
         }

         if (var7 == 0) {
            if (var1.getButton() != 1) {
               return;
            }

            var10000 = (String[])com.c.c(129362754730391727L).get(this);
            var10001 = com.c.f();
            Method var28 = com.c.d(337799717273932072L);
            var20 = var10001;
            var10001 = var10000;
            Method var12 = var28;

            try {
               var12.invoke(var10001, (Object[])var20);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }

            ((Tg_2)com.c.c(129362754730391727L).get(this))
               .show(
                  (JButton)com.c.c(316737507384357237L).get(com.c.c(420140467323718004L).get(this)),
                  0
                     - ((Tg_2)com.c.c(129362754730391727L).get(this)).getPreferredSize().width
                     + ((JButton)com.c.c(316737507384357237L).get(com.c.c(420140467323718004L).get(this))).getWidth()
                     - 2,
                  0 - (((Tg_2)com.c.c(129362754730391727L).get(this)).getPreferredSize().height + 1)
               );
            if (var2 != null) {
               return;
            }
         }

         var8 = this;
      }

      ((Tg_2)com.c.c(129362754730391727L).get(var8)).setVisible(false);
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
}





