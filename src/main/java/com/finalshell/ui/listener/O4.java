package com.finalshell.ui.listener;

import com.finalshell.connection.Copy;
import com.finalshell.core.Y62_2;
import com.finalshell.core.YA3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

public class O4 implements MouseListener {
   public final JPopupMenu k;
   public final Copy I;

   public O4(Copy var1, JPopupMenu var2) {
      this.I = var1;
      this.k = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      O4 var10004;
      byte var10005;
      label47: {
         label50: {
            String[] var10000 = Y62_2.Z();
            boolean var3 = true;
            String[] var2 = var10000;
            boolean var4 = true;
            O4 var40 = var1.getButton();
            if (var2 != null) {
               if (var40 != null) {
                  int var41 = var1.getButton();
                  if (var2 == null) {
                     break label47;
                  }

                  if (var41 != 3) {
                     break label50;
                  }
               }

               var40 = this;
               Object var8 = 578361061207357044L;
               Ref.g(578361061207357044L, var8);
               Object var10 = 406455305964270214L;
               ((Y62_2)Ref.g(406455305964270214L, var10)).rowAtPoint(var1.getPoint());
            }

            O4 var5 = var40;
            Object var12 = 578361061207357044L;
            Ref.g(578361061207357044L, var12);
            Object var14 = 406455305964270214L;
            int var6 = ((Y62_2)Ref.g(406455305964270214L, var14)).convertRowIndexToModel((int)var5);
            Object var16 = 578361061207357044L;
            Ref.g(578361061207357044L, var16);
            Object var18 = 406455305964270214L;
            ((Y62_2)Ref.g(406455305964270214L, var18)).getSelectionModel().setSelectionInterval((int)var5, (int)var5);
            var10004 = var5;
            var10005 = -1;
            if (var2 == null) {
               break label47;
            }

            if (var5 > -1) {
               Object var20 = 578361061207357044L;
               Ref.g(578361061207357044L, var20);
               Object var22 = 347284645451059683L;
               Ref.g(347284645451059683L, var22);
               ArrayList var10007 = Registry.emptyArgs();
               long var25 = 530247999995353660L;
               Object[] var24 = var10007;
               var10007 = Ref.h(530247999995353660L, var24, var25);

               try {
                  var10007 = (ArrayList)var10007;
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }

               YA3_2 var7 = (YA3_2)var10007.get(var6);
               Object var26 = 578361061207357044L;
               Registry.lookupField(225800492388928374L).setInt(Ref.g(578361061207357044L, var26), var6);
               Object var28 = 578361061207357044L;
               Ref.g(578361061207357044L, var28);
               Object[] var10011 = Registry.emptyArgs();
               long var31 = 579395555078289712L;
               Object[] var30 = var10011;
               var10011 = Ref.h(579395555078289712L, var30, var31);

               try {
                  var47 = (Integer)var10011;
               } catch (InvocationTargetException var38) {
                  throw var38.getTargetException();
               }

               Registry.lookupField(562657621005253107L).setInt(var7, var47);
            }
         }

         var10004 = var1.getButton();
         var10005 = 3;
      }

      if (var10004 == var10005) {
         Object var32 = 452723558592960960L;
         JPopupMenu var42 = (JPopupMenu)Ref.g(452723558592960960L, var32);
         Object var34 = 578361061207357044L;
         Object var45 = Ref.g(578361061207357044L, var34);
         Object var36 = 406455305964270214L;
         var45.show((Y62_2)Ref.g(406455305964270214L, var36), var1.getX(), var1.getY());
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





