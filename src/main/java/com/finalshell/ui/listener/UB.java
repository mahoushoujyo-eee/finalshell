package com.finalshell.ui.listener;

import com.finalshell.core.Nd2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AccelerateRdpHelpPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class UB implements MouseListener {
   public final Nd2_2 S;

   public UB(Nd2_2 var1) {
      this.S = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var19;
      label37: {
         String[] var2 = AccelerateRdpHelpPanel.w();
         int var10000 = var1.getButton();
         byte var10001 = 3;
         if (var2 == null) {
            if (var10000 != 3) {
               return;
            }

            var10000 = var1.getClickCount();
            var19 = var2;
            if (var2 != null) {
               break label37;
            }

            var10001 = 1;
         }

         if (var10000 != var10001) {
            return;
         }

         Object var6 = 312381051327550610L;
         var19 = (String[])(((Nd2_2)Ref.g(312381051327550610L, var6)).rowAtPoint(var1.getPoint()));
      }

      String[] var3 = var19;
      Object var8 = 312381051327550610L;
      int var4 = ((Nd2_2)Ref.g(312381051327550610L, var8)).convertRowIndexToModel((int)var3);
      Object var10 = 312381051327550610L;
      ((Nd2_2)Ref.g(312381051327550610L, var10)).getSelectionModel().setSelectionInterval(var4, var4);
      Object var12 = 312381051327550610L;
      Ref.g(312381051327550610L, var12);
      Object[] var10005 = Registry.emptyArgs();
      long var15 = 542425596934223077L;
      Object[] var14 = var10005;
      Ref.h(542425596934223077L, var14, var15);
      Object[] var10006 = Registry.packArgs(var4);
      long var17 = 397133340990525366L;
      Object[] var16 = var10006;
      Ref.h(397133340990525366L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
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
      String[] var2 = AccelerateRdpHelpPanel.w();
      int var10000 = var1.getButton();
      byte var10001 = 1;
      if (var2 == null) {
         if (var10000 != 1) {
            return;
         }

         var10000 = var1.getClickCount();
         var10001 = 2;
      }

      if (var10000 == var10001) {
         Object var3 = 312381051327550610L;
         Ref.g(312381051327550610L, var3);
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 621923125197779420L;
         Object[] var5 = var10002;
         Ref.h(621923125197779420L, var5, var6);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }
   }
}





