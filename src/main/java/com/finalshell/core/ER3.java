package com.finalshell.core;

import java.util.ArrayList;
import java.util.List;

public class ER3 extends ED3 {
   public void R(Object var1) {
      this.T(new Uv2(var1));
   }

   public void J(Object var1, boolean var2) {
      this.T(new Uv2(var1, var2));
   }

   public void O(int var1, Object var2) {
      this.y(var1, new Uv2(var2));
   }

   public void j(int var1, Object var2, boolean var3) {
      this.y(var1, new Uv2(var2, var3));
   }

   public boolean o(int var1) {
      return ((Uv2)this.A(var1)).Z();
   }

   public List a() {
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;
      int var3 = 0;

      while (var3 < this.getSize()) {
         Uv2 var4 = (Uv2)this.A(var3);
         if (var1 != null) {
            if (var4.Z()) {
               var2.add(var4.g());
            }

            var3++;
         }

         if (var1 == null) {
            break;
         }
      }

      return var2;
   }

   public void Y(int var1) {
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      Uv2 var3 = (Uv2)this.A(var1);
      String var2 = var10000;
      boolean var10001 = var3.Z();
      if (var2 != null) {
         var10001 = !var10001;
      }

      var3.i(var10001);
      this.fireContentsChanged(this, var1, var1);
   }

   public boolean Z(int var1, boolean var2) {
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      Uv2 var4 = (Uv2)this.A(var1);
      String var3 = var10000;
      boolean var5 = var4.Z();
      if (var3 != null) {
         if (var5 != var2) {
            var4.i(var2);
            this.fireContentsChanged(this, var1, var1);
            return true;
         }

         var5 = false;
      }

      return var5;
   }
}





