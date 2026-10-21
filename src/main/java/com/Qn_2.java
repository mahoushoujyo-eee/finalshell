package com;

import java.util.Vector;

public class Qn_2 implements com.cd_4 {
   private i3_2 i;

   public Qn_2(com.Db_2 var1) {
      this.i = new i3_2(var1);
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
      boolean var1 = com.dm_4.F();
      byte var10000 = this.i.p().x();
      if (var1) {
         if (var10000 != 0) {
            return 2;
         }

         var10000 = 1;
      }

      return var10000;
   }
}





