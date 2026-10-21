import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

class O4 implements MouseListener {
   final JPopupMenu k;
   final CG I;

   O4(CG var1, JPopupMenu var2) {
      this.I = var1;
      this.k = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var11;
      int var10001;
      label47: {
         label50: {
            String[] var10000 = y6_2.Z();
            boolean var3 = true;
            String[] var2 = var10000;
            boolean var4 = true;
            var11 = var1.getButton();
            if (var2 != null) {
               if (var11 != 1) {
                  var11 = var1.getButton();
                  var10001 = 3;
                  if (var2 == null) {
                     break label47;
                  }

                  if (var11 != 3) {
                     break label50;
                  }
               }

               var11 = ((y6_2)com.c.c(406455305964270214L).get(com.c.c(578361061207357044L).get(this))).rowAtPoint(var1.getPoint());
            }

            int var5 = var11;
            int var6 = ((y6_2)com.c.c(406455305964270214L).get(com.c.c(578361061207357044L).get(this))).convertRowIndexToModel(var5);
            ((y6_2)com.c.c(406455305964270214L).get(com.c.c(578361061207357044L).get(this))).getSelectionModel().setSelectionInterval(var5, var5);
            var11 = var5;
            var10001 = -1;
            if (var2 == null) {
               break label47;
            }

            if (var5 > -1) {
               Object var12 = com.c.c(347284645451059683L).get(com.c.c(578361061207357044L).get(this));
               Object[] var16 = com.c.f();
               Method var10003 = com.c.d(530247999995353660L);
               Object[] var10002 = var16;
               Object var17 = var12;
               Method var13 = var10003;

               try {
                  var14 = (ArrayList)var13.invoke(var17, var10002);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               yA_3 var7 = (yA_3)var14.get(var6);
               com.c.c(225800492388928374L).setInt(com.c.c(578361061207357044L).get(this), var6);
               Object var15 = com.c.c(578361061207357044L).get(this);
               var10002 = com.c.f();
               Method var10004 = com.c.d(579395555078289712L);
               Object[] var22 = var10002;
               yA_3 var21 = var7;
               Method var18 = var10004;

               try {
                  var10001 = (Integer)var18.invoke(var21, var22);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }

               com.c.c(562657621005253107L).setInt(var15, var10001);
            }
         }

         var11 = var1.getButton();
         var10001 = 3;
      }

      if (var11 == var10001) {
         ((JPopupMenu)com.c.c(452723558592960960L).get(this))
            .show((y6_2)com.c.c(406455305964270214L).get(com.c.c(578361061207357044L).get(this)), var1.getX(), var1.getY());
      }
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





