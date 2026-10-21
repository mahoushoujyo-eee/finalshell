package com.finalshell.core;

import java.util.Vector;

public class Qn2 implements Cd4 {
   public I32 i;

   public Qn2(Db2 var1) {
      this.i = new I32(var1);
   }

   @Override
   public Vector e() {
      return this.i.d();
   }

   @Override
   public boolean D(byte[] var1) {
      return this.i.Z(var1);
   }

   @Override
   public boolean i(byte[] var1) {
      return this.i.R(var1);
   }

   @Override
   public void u() {
      this.i.k();
   }

   @Override
   public String r() {
      return this.i.p().B();
   }

   @Override
   public int p() {
      boolean var1 = Dm4.F$boolean();
      byte var10000 = (byte)((this.i.p().x()) ? 1 : 0);
      if (var1) {
         if (var10000 != 0) {
            return 2;
         }

         var10000 = 1;
      }

      return var10000;
   }
}





