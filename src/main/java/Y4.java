import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPopupMenu;

class Y4 implements MouseListener {
   final y1_2 H;
   final C_ S;
   final U Z;

   Y4(U var1, y1_2 var2, C_ var3) {
      this.Z = var1;
      this.H = var2;
      this.S = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var10000 = F8.y();
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
         if (var2 == null) {
            if (var7 != 1) {
               return;
            }

            var8 = this;
            if (var2 != null) {
               break label61;
            }

            var10000 = (String[])com.c.c(433474432287499006L).get(this);
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

            var10000 = (String[])com.c.c(359109830162541260L).get(this);
            var10001 = com.c.f();
            Method var28 = com.c.d(440819565065186185L);
            var20 = var10001;
            var10001 = var10000;
            Method var12 = var28;

            try {
               var12.invoke(var10001, (Object[])var20);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }

            ((JPopupMenu)com.c.c(337860688004803931L).get(com.c.c(359109830162541260L).get(this)))
               .show(
                  (C_)com.c.c(299167437768682002L).get(this),
                  0
                     - ((JPopupMenu)com.c.c(337860688004803931L).get(com.c.c(359109830162541260L).get(this))).getPreferredSize().width
                     + ((C_)com.c.c(299167437768682002L).get(this)).getWidth()
                     - 2,
                  ((C_)com.c.c(299167437768682002L).get(this)).getHeight() + 3
               );
            if (var2 == null) {
               return;
            }
         }

         var8 = this;
      }

      ((JPopupMenu)com.c.c(337860688004803931L).get(com.c.c(359109830162541260L).get(var8))).setVisible(false);
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





