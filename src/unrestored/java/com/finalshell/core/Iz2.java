package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.HashSet;

public class Iz2 {
   public final Object u;
   public final HashSet f;
   public final HashSet D;

   public Iz2(Object var1) {
      this.u = var1;
      FZ.G();
      this.f = new HashSet();
      this.D = new HashSet();
      if (Ky4.F$arrString() != null) {
         FZ.r(new String[3]);
      }
   }

   public Iz2 F(Iz2 var1) {
      String[] var10000 = FZ.G();
      FZ var3 = new FZ(this, var1);
      String[] var2 = var10000;
      this.D.add(var3);
      var1.f.add(var3);
      if (var2 == null) {
         Ky4.K(new String[4]);
      }

      return this;
   }

   public Object P() {
      return this.u;
   }

   @Override
   public String toString() {
      String[] var1 = FZ.G();
      Object var10000 = this.u;
      if (var1 != null) {
         if (this.u == null) {
            return null;
         }

         var10000 = this.u;
      }

      return var10000.toString();
   }
}





