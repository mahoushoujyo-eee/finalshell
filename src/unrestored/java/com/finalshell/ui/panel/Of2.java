package com.finalshell.ui.panel;

import com.finalshell.core.D_2;
import com.finalshell.core.K5_2;
import com.finalshell.ui.model.CQ3;
import com.finalshell.ui.model.GQ;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;

public class Of2 extends Od2 {
   @Override
   public G x(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      String[] var8 = GQ.W();
      Of2 var10000 = this;
      if (var8 != null) {
         super.x(var1, var2, var3, var4, var5, var6, var7);
         if (var2 instanceof CQ3) {
            CQ3 var9;
            label52: {
               var9 = (CQ3)var2;
               int var11 = (var9.d()) ? 1 : 0;
               if (var8 != null) {
                  if (var11 != 0) {
                     break label52;
                  }

                  var11 = D_2.K[var9.K().ordinal()];
               }

               ImageIcon var10;
               switch (var11) {
                  case 1:
                     var10 = K5_2.E;
                     if (var8 != null) {
                        break;
                     }
                  case 2:
                     var10 = var4 ? K5_2.a : K5_2.w;
                     if (var8 != null) {
                        break;
                     }
                  case 3:
                     var10 = K5_2.s;
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

      if (Ky4.F$arrString() != null) {
         GQ.w(new String[5]);
      }

      return var10000;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      return this.x(var1, var2, var3, var4, var5, var6, var7);
   }
}





