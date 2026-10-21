package com;

import java.awt.Component;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JTree;

public class Oi_2 extends com.Od_2 {
   @Override
   public com.m.G x(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      super.x(var1, var2, var3, var4, var5, var6, var7);
      String[] var10000 = com.cB_3.C();
      com.cY_3 var9 = (com.cY_3)var2;
      String[] var8 = var10000;
      File var10 = var9.D();
      com.cY_3 var13 = var9;
      if (var8 != null) {
         if (!var9.d()) {
            label73: {
               File var14 = var10;
               if (var8 != null) {
                  if (var10 == null) {
                     var15 = null;
                     break label73;
                  }

                  var14 = var10;
               }

               var15 = com.Cz_2.U(var14, false);
            }

            ImageIcon var11 = var15;
            this.setIcon(var9.u() ? p(var11) : var11);
         }

         var13 = var9;
      }

      if (var13.u() != null) {
         this.setText(var9.u());
         if (var8 != null) {
            return this;
         }
      }

      File var16 = var10;
      if (var8 != null) {
         if (var10 == null) {
            return this;
         }

         var16 = var10;
      }

      String var12;
      label55: {
         var12 = com.Cz_2.X(var16);
         String var17 = var12;
         if (var8 != null) {
            if (var12 != null) {
               var18 = var12.trim().equals("");
               if (var8 == null) {
                  break label55;
               }

               if (!var18) {
                  this.setText(var12);
                  if (var8 != null) {
                     return this;
                  }
               }
            }

            var12 = var10.getName();
            var17 = var12.trim();
         }

         var18 = var17.equals("");
      }

      if (!var18) {
         String var10001 = var12;
         if (var8 != null) {
            var10001 = var12 != null ? var12 : "";
         }

         this.setText(var10001);
         if (var8 != null) {
            return this;
         }
      }

      this.setText(com.Cz_2.t(var10, null).Q());
      return this;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      return this.x(var1, var2, var3, var4, var5, var6, var7);
   }
}





