package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class B4 implements Xq4 {
   final List Q;
   final Map r;
   final QR N;

   B4(QR var1, List var2, Map var3) {
      this.N = var1;
      this.Q = var2;
      this.r = var3;
   }

   @Override
   public List f() {
      return this.Q;
   }

   public List K(Sg2 var1) {
      Ky4[] var10000 = M2_2.b();
      List var3 = (List)this.r.get(var1.h().B());
      Ky4[] var2 = var10000;
      List var4 = var3;
      if (var2 == null) {
         var4 = var3 != null ? var3 : Collections.EMPTY_LIST;
      }

      return var4;
   }

   @Override
   public List i(Object var1) {
      return this.K((Sg2)var1);
   }
}





