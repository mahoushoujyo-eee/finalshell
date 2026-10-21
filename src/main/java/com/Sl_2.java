package com;

import java.util.List;

class Sl_2 extends ST {
   final com.cB_3 O;
   final List s;
   final us_2 e;
   final com.zn_2 W;
   final com.Yz_2 x;

   Sl_2(com.Yz_2 var1, com.cB_3 var2, List var3, us_2 var4, com.zn_2 var5) {
      this.x = var1;
      this.O = var2;
      this.s = var3;
      this.e = var4;
      this.W = var5;
   }

   @Override
   public void y(com.cB_3 var1, List var2) {
      String[] var3 = com.cB_3.C();
      if (var3 != null) {
         if (var1 != this.O) {
            return;
         }

         this.x.b(this.s, this.O, this.e, this.W, this.O.getChildCount());
      }

      this.e.C(this);
   }

   @Override
   public void X(com.cB_3 var1, Throwable var2) {
      if (var1 == this.O) {
         this.e.C(this);
      }
   }
}





