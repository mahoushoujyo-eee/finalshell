package com.finalshell.core;

import java.awt.Component;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.plaf.TreeUI;

public class V5_2 extends Rt4 {
   public boolean E = true;

   public V5_2() {
      this(new Ne4());
   }

   public V5_2(Ne4 var1) {
      super(var1);
      var1.addFocusListener(new com.finalshell.ui.listener.C5(this));
   }

   public V5_2(UE var1) {
      super(var1);
      var1.addFocusListener(new com.finalshell.ui.listener.E3(this));
   }

   public V5_2(com.finalshell.ui.panel.X2 var1) {
      super(var1);
      var1.addFocusListener(new com.finalshell.ui.listener.B8(this));
   }

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      Component var8 = super.getTreeCellEditorComponent(var1, var2, var3, var4, var5, var6);
      String var10000 = com.finalshell.ui.panel.S.d();
      Component var9 = var1.getCellRenderer().getTreeCellRendererComponent(var1, var2, var3, var4, var5, var6, true);
      String var7 = var10000;
      var8.setPreferredSize(var9.getPreferredSize());
      Component var16 = var9;
      if (var7 != null) {
         if (var9 instanceof JLabel) {
            JLabel var19 = (JLabel)var9;
            if (var7 == null) {
               return var19;
            }

            if (var19.getIcon() != null) {
               JLabel var10 = (JLabel)var9;
               if (var7 == null) {
                  return var8;
               }

               if (var8 instanceof Ne4) {
                  TreeUI var11 = var1.getUI();
                  int var17 = (var11 instanceof K5_2) ? 1 : 0;
                  if (var7 != null) {
                     var17 = var17 != 0 ? ((K5_2)var11).A() : N2_2.O;
                  }

                  int var12 = var17;
                  Ne4 var13 = (Ne4)var8;
                  var13.c$void(false);
                  var13.F(var12);
                  var13.L(false);
                  int var18 = (this.E) ? 1 : 0;
                  if (var7 != null) {
                     if (this.E) {
                        var13.v(new com.finalshell.ui.panel.Wb2(var10.getIcon()));
                     }

                     var18 = var12 + 1;
                  }

                  int var14 = var18;
                  Insets var15 = var10.getInsets();
                  var13.I(var15.top - var14, var15.left - var14, var15.bottom - var14, var15.right - var14 - 2);
                  var13.d(0, var10.getIconTextGap(), 0, 0);
               }
            }
         }

         var8.applyComponentOrientation(var1.getComponentOrientation());
         var16 = var8;
      }

      return var16;
   }
}





