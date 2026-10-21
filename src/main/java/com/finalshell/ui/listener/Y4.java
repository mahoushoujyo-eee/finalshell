package com.finalshell.ui.listener;

import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

public class Y4 implements MouseListener {
   final Y12_2 H;
   final com.finalshell.core.C S;
   final com.finalshell.ui.frame.U Z;

   Y4(com.finalshell.ui.frame.U var1, Y12_2 var2, com.finalshell.core.C var3) {
      this.Z = var1;
      this.H = var2;
      this.S = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      com.finalshell.ui.panel.F8.y();
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Object var10002 = Ref.h2(270389152141252877L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 284609497308396758L;
      Object[] var5 = var10003;
      Ref.h(284609497308396758L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      label51: {
         Object var2 = var10002;
         var10002 = var1.getButton();
         if (var2 == null) {
            if (var10002 != 1) {
               return;
            }

            var10002 = this;
            if (var2 != null) {
               break label51;
            }

            Object var7 = 433474432287499006L;
            Ref.g(433474432287499006L, var7);
            Object[] var10004 = Registry.emptyArgs();
            long var10 = 410760064034581011L;
            Object[] var9 = var10004;
            var10004 = Ref.h(410760064034581011L, var9, var10);

            try {
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }
         }

         if (var10002 == 0) {
            if (var1.getButton() != 1) {
               return;
            }

            Object var11 = 359109830162541260L;
            Ref.g(359109830162541260L, var11);
            Object[] var37 = Registry.emptyArgs();
            long var14 = 440819565065186185L;
            Object[] var13 = var37;
            Ref.h(440819565065186185L, var13, var14);
            Object var15 = 359109830162541260L;
            Ref.g(359109830162541260L, var15);
            Object var17 = 337860688004803931L;
            JPopupMenu var10006 = (JPopupMenu)Ref.g(337860688004803931L, var17);
            Object var19 = 299167437768682002L;
            com.finalshell.core.C var10008 = (com.finalshell.core.C)Ref.g(299167437768682002L, var19);
            boolean var10009 = false;
            Object var21 = 359109830162541260L;
            Object var10011 = Ref.g(359109830162541260L, var21);
            Object var23 = 337860688004803931L;
            int var38 = var10011 - ((JPopupMenu)Ref.g(337860688004803931L, var23)).getPreferredSize().width;
            Object var25 = 299167437768682002L;
            Object var10012 = this + ((com.finalshell.core.C)Ref.g(299167437768682002L, var25)).getWidth() - 2;
            Object var27 = 299167437768682002L;
            var38.show((Component)var10012, (int)this, ((com.finalshell.core.C)Ref.g(299167437768682002L, var27)).getHeight() + 3);
            if (var2 == null) {
               return;
            }
         }
      }

      Object var29 = 359109830162541260L;
      Ref.g(359109830162541260L, var29);
      Object var31 = 337860688004803931L;
      ((JPopupMenu)Ref.g(337860688004803931L, var31)).setVisible(false);
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





