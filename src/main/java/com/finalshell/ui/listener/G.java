package com.finalshell.ui.listener;

import com.finalshell.core.Y12_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Backspace;
import com.finalshell.ui.panel.CompleteFullPathPanel;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

public class G implements MouseListener {
   public final Y12_2 c;
   public final CompleteFullPathPanel w;
   public final Backspace V;

   public G(Backspace var1, Y12_2 var2, CompleteFullPathPanel var3) {
      this.V = var1;
      this.c = var2;
      this.w = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Backspace.F();
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Object var10002 = Ref.h2(270389152141252877L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 284609497308396758L;
      Object[] var5 = var10003;
      Ref.h(284609497308396758L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      label56: {
         Object var2 = var10002;
         var10002 = var1.getButton();
         if (var2 != null) {
            if (var10002 != null) {
               return;
            }

            var10002 = this;
            if (var2 == null) {
               break label56;
            }

            Object var7 = 218869713873426275L;
            Ref.g(218869713873426275L, var7);
            Object[] var10004 = Registry.emptyArgs();
            long var10 = 410760064034581011L;
            Object[] var9 = var10004;
            var10004 = Ref.h(410760064034581011L, var9, var10);

            try {
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }
         }

         if (var10002 == null) {
            if (var1.getButton() != 1) {
               return;
            }

            Object var11 = 129362754730391727L;
            Ref.g(129362754730391727L, var11);
            Object[] var36 = Registry.emptyArgs();
            long var14 = 337799717273932072L;
            Object[] var13 = var36;
            Ref.h(337799717273932072L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            Object var15 = 129362754730391727L;
            CompleteFullPathPanel var10005 = (CompleteFullPathPanel)Ref.g(129362754730391727L, var15);
            Object var17 = 420140467323718004L;
            Ref.g(420140467323718004L, var17);
            Object var19 = 316737507384357237L;
            JButton var10008 = (JButton)Ref.g(316737507384357237L, var19);
            boolean var10009 = false;
            Object var21 = 129362754730391727L;
            int var10010 = this - ((CompleteFullPathPanel)Ref.g(129362754730391727L, var21)).getPreferredSize().width;
            Object var23 = 420140467323718004L;
            Object var10012 = Ref.g(420140467323718004L, var23);
            Object var25 = 316737507384357237L;
            var10012 = var10012 + ((JButton)Ref.g(316737507384357237L, var25)).getWidth() - 2;
            Object var27 = 129362754730391727L;
            this.show((Component)var10012, 0, this - (((CompleteFullPathPanel)Ref.g(129362754730391727L, var27)).getPreferredSize().height + 1));
            if (var2 != null) {
               return;
            }
         }
      }

      Object var29 = 129362754730391727L;
      ((CompleteFullPathPanel)Ref.g(129362754730391727L, var29)).setVisible(false);
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





