package com.finalshell.core;

import com.finalshell.ui.model.DR3;
import com.finalshell.ui.model.Eg4;
import com.finalshell.ui.model.O62;
import com.finalshell.ui.model.OV3;
import com.finalshell.ui.panel.XW;

public final class NG {
   public static DR3 q(DR3 var0) {
      String[] var1 = XW.w();
      boolean var10000 = var0.equals(DR3.random);
      if (var1 == null) {
         if (var10000) {
            DR3[] var2 = DR3.values();
            return var2[Gw2.K(var2.length - 3) + 3];
         }

         var10000 = var0.equals(DR3.horizontal);
      }

      if (var1 == null) {
         if (var10000) {
            return new DR3[]{DR3.left, DR3.right}[Gw2.K(2)];
         }

         if (var1 != null) {
            return var0;
         }

         var10000 = var0.equals(DR3.vertical);
      }

      return var10000 ? new DR3[]{DR3.up, DR3.down}[Gw2.K(2)] : var0;
   }

   public static com.finalshell.ui.model.I3 R(com.finalshell.ui.model.I3 var0) {
      String[] var1 = XW.w();
      com.finalshell.ui.model.I3 var10000 = var0;
      if (var1 == null) {
         if (var0.equals(com.finalshell.ui.model.I3.random)) {
            com.finalshell.ui.model.I3[] var2 = com.finalshell.ui.model.I3.values();
            return var2[Gw2.K(var2.length - 1) + 1];
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static com.finalshell.ui.model.Du2 R(com.finalshell.ui.model.Du2 var0) {
      String[] var1 = XW.w();
      com.finalshell.ui.model.Du2 var10000 = var0;
      if (var1 == null) {
         if (var0.equals(com.finalshell.ui.model.Du2.random)) {
            com.finalshell.ui.model.Du2[] var2 = com.finalshell.ui.model.Du2.values();
            return var2[Gw2.K(var2.length - 1) + 1];
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static O62 F(O62 var0) {
      String[] var1 = XW.w();
      O62 var10000 = var0;
      if (var1 == null) {
         if (var0.equals(O62.random)) {
            O62[] var2 = O62.values();
            return var2[Gw2.K(var2.length - 1) + 1];
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static Eg4 y(Eg4 var0) {
      String[] var1 = XW.w();
      Eg4 var10000 = var0;
      if (var1 == null) {
         if (var0.equals(Eg4.random)) {
            Eg4[] var2 = Eg4.values();
            return var2[Gw2.K(var2.length - 1) + 1];
         }

         var10000 = var0;
      }

      return var10000;
   }

   public static OV3 P(OV3 var0) {
      String[] var1 = XW.w();
      OV3 var10000 = var0;
      if (var1 == null) {
         if (var0.equals(OV3.random)) {
            OV3[] var2 = OV3.values();
            return var2[Gw2.K(var2.length - 1) + 1];
         }

         var10000 = var0;
      }

      return var10000;
   }
}





