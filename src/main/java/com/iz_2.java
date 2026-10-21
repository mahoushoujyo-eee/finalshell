package com;

import java.util.HashSet;

public class Iz_2 {
   public final Object u;
   public final HashSet f;
   public final HashSet D;

   public Iz_2(Object var1) {
      this.u = var1;
      com.FZ.G();
      this.f = new HashSet();
      this.D = new HashSet();
      if (com.ky_4.F() != null) {
         com.FZ.r(new String[3]);
      }
   }

   public Iz_2 F(Iz_2 var1) {
      String[] var10000 = com.FZ.G();
      com.FZ var3 = new com.FZ(this, var1);
      String[] var2 = var10000;
      this.D.add(var3);
      var1.f.add(var3);
      if (var2 == null) {
         com.ky_4.K(new String[4]);
      }

      return this;
   }

   public Object P() {
      return this.u;
   }

   @Override
   public String toString() {
      String[] var1 = com.FZ.G();
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





