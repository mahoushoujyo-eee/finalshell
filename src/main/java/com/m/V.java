package com.m;

import com.ne_4;
import com.rt_4;
import com.uE;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.plaf.TreeUI;

public class V extends rt_4 {
   protected boolean E = true;

   public V() {
      this(new ne_4());
   }

   public V(ne_4 var1) {
      super(var1);
      var1.addFocusListener(new com.m.c(this));
   }

   public V(uE var1) {
      super(var1);
      var1.addFocusListener(new com.m.E(this));
   }

   public V(com.L.X var1) {
      super(var1);
      var1.addFocusListener(new B(this));
   }

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      Component var8 = super.getTreeCellEditorComponent(var1, var2, var3, var4, var5, var6);
      String var10000 = com.m.s.d();
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

               if (var8 instanceof ne_4) {
                  TreeUI var11 = var1.getUI();
                  int var17 = var11 instanceof com.m.K;
                  if (var7 != null) {
                     var17 = var17 != 0 ? ((com.m.K)var11).A() : n.O;
                  }

                  int var12 = var17;
                  ne_4 var13 = (ne_4)var8;
                  var13.c(false);
                  var13.F(var12);
                  var13.L(false);
                  int var18 = this.E;
                  if (var7 != null) {
                     if (this.E) {
                        var13.v(new com.Wb_2(var10.getIcon()));
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





