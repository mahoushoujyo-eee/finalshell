package com.finalshell.ui.listener;

import com.finalshell.ui.model.L92;
import com.finalshell.ui.panel.Pb4;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

public class Lp4 implements PropertyChangeListener {
   final com.finalshell.core.FJ e;

   Lp4(com.finalshell.core.FJ var1) {
      this.e = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int[] var2 = Pb4.g();
      if (var1.getNewValue() == Boolean.TRUE) {
         label40: {
            Component var3 = com.finalshell.core.FJ.T(this.e).getInvoker();
            Component var10000 = var3;
            if (var2 != null) {
               if (var3 == null) {
                  break label40;
               }

               var10000 = var3;
            }

            boolean var4 = var10000 instanceof JMenu;
            if (var2 != null) {
               if (var4) {
                  if (var3.getParent() instanceof JPopupMenu) {
                     this.e.E.v(L92.menuBarSubMenu);
                     if (var2 != null) {
                        return;
                     }
                  }

                  this.e.E.v(L92.menuBarMenu);
                  if (var2 != null) {
                     return;
                  }
               }

               var4 = var3 instanceof JComboBox;
            }

            if (var4) {
               this.e.E.v(L92.comboBoxMenu);
               if (var2 != null) {
                  return;
               }
            }

            this.e.E.v(L92.customPopupMenu);
            if (var2 != null) {
               return;
            }
         }

         this.e.E.v(L92.customPopupMenu);
      }
   }
}





