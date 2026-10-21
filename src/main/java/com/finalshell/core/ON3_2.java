package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.net.InetAddress;

public class ON3_2 {
   public InetAddress l;
   public int W;
   public int n;

   public ON3_2(InetAddress var1, int var2) {
      int[] var10000 = Cy2.u();
      this.l = var1;
      int[] var3 = var10000;
      this.W = var2;
      this.n = (var1.toString() + var1).hashCode();
      if (var3 == null) {
         Ky4.K(new String[4]);
      }
   }

   @Override
   public int hashCode() {
      return this.n;
   }

   @Override
   public boolean equals(Object var1) {
      int[] var10000 = Cy2.u();
      ON3_2 var3 = (ON3_2)var1;
      int[] var2 = var10000;
      if (var1 == null) {
         return false;
      } else {
         byte var4 = (this.l.equals(var3.l)) ? 1 : 0;
         int var10001 = this.W;
         if (var2 != null) {
            var10001 = this.W == var3.W ? 1 : 0;
         }

         int var5 = var4 & var10001;
         if (Ky4.F$arrString() != null) {
            Cy2.c(new int[3]);
         }

         return var5 != 0;
      }
   }
}





