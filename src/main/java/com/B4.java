package com;

import java.util.Collections;
import java.util.List;
import java.util.Map;

class B4 implements xq_4 {
   final List Q;
   final Map r;
   final com.QR N;

   B4(com.QR var1, List var2, Map var3) {
      this.N = var1;
      this.Q = var2;
      this.r = var3;
   }

   @Override
   public List f() {
      return this.Q;
   }

   public List K(Sg_2 var1) {
      com.ky_4[] var10000 = _m_2.b();
      List var3 = (List)this.r.get(var1.h().B());
      com.ky_4[] var2 = var10000;
      List var4 = var3;
      if (var2 == null) {
         var4 = var3 != null ? var3 : Collections.EMPTY_LIST;
      }

      return var4;
   }

   @Override
   public List i(Object var1) {
      return this.K((Sg_2)var1);
   }
}





