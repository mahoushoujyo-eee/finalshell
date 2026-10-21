package com.finalshell.ui.listener;

import com.finalshell.core.Tq4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Uy4 implements MouseListener {
   public final Tq4 k;

   public Uy4(Tq4 var1) {
      this.k = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 148840961226333717L;
      Registry.lookupField(410066848429556838L).setInt(Ref.g(148840961226333717L, var2), -1);
      Object var4 = 148840961226333717L;
      ((Tq4)Ref.g(148840961226333717L, var4)).repaint();
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var3;
      Tq4 var10002;
      label24: {
         ClearListDialog.i$arrString();
         Object var4 = 148840961226333717L;
         var3 = ((Tq4)Ref.g(148840961226333717L, var4)).rowAtPoint(var1.getPoint());
         Uy4 var10001 = var1.getButton();
         if (this == null) {
            if (var10001 != null) {
               return;
            }

            var10001 = this;
            Object var6 = 148840961226333717L;
            var10002 = (Tq4)Ref.g(148840961226333717L, var6);
            if (this != null) {
               break label24;
            }

            var10002.isRowSelected(var3);
         }

         if (var10001 != null) {
            return;
         }

         Object var8 = 148840961226333717L;
         var10002 = (Tq4)Ref.g(148840961226333717L, var8);
      }

      var10002.getSelectionModel().setSelectionInterval(var3, var3);
   }
}





