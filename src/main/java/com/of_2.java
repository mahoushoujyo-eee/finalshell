package com;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;

public class Of_2 extends com.Od_2 {
   @Override
   public com.m.G x(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      String[] var8 = GQ.W();
      com.Of_2 var10000 = this;
      if (var8 != null) {
         super.x(var1, var2, var3, var4, var5, var6, var7);
         if (var2 instanceof com.cQ_3) {
            com.cQ_3 var9;
            label52: {
               var9 = (com.cQ_3)var2;
               int var11 = var9.d();
               if (var8 != null) {
                  if (var11 != 0) {
                     break label52;
                  }

                  var11 = com.D_.K[var9.K().ordinal()];
               }

               ImageIcon var10;
               switch (var11) {
                  case 1:
                     var10 = com.m.K.E;
                     if (var8 != null) {
                        break;
                     }
                  case 2:
                     var10 = var4 ? com.m.K.a : com.m.K.w;
                     if (var8 != null) {
                        break;
                     }
                  case 3:
                     var10 = com.m.K.s;
                     if (var8 != null) {
                        break;
                     }
                  default:
                     var10 = null;
               }

               this.setIcon(var9.u() ? p(var10) : var10);
            }

            this.setText(var9.w());
         }

         var10000 = this;
      }

      if (com.ky_4.F() != null) {
         GQ.w(new String[5]);
      }

      return var10000;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      return this.x(var1, var2, var3, var4, var5, var6, var7);
   }
}





