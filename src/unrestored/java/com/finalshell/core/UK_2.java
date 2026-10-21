package com.finalshell.core;

import com.finalshell.ui.model.Oc2;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class UK_2 extends UT_2 {
   public final int l;
   public final List k;
   public final Yn4 H;
   public final Object F;
   public final Map A;
   public final Collection t;

   public UK_2(Yn4 var1, List var2, int var3) {
      super(null, null);
      this.H = var1;
      this.l = var3;
      this.k = var2;
      this.F = null;
      this.A = null;
      this.t = null;
   }

   public UK_2(Map var1, Object var2) {
      super(null, null);
      this.H = null;
      this.l = -1;
      this.k = null;
      this.F = var2;
      this.A = var1;
      this.t = null;
   }

   public UK_2(Collection var1) {
      super(null, null);
      this.H = null;
      this.l = -1;
      this.k = null;
      this.F = null;
      this.A = null;
      this.t = var1;
   }

   @Override
   public void D(Object var1, Object var2) {
      Ky4[] var3 = ZS.p();
      UK_2 var10000 = this;
      if (var3 == null) {
         if (this.A != null) {
            this.A.put(this.F, var2);
            return;
         }

         var10000 = this;
      }

      if (var3 == null) {
         if (var10000.t != null) {
            this.t.add(var2);
            return;
         }

         this.k.set(this.l, var2);
      }

      List var9 = this.k;
      if (var3 == null) {
         if (!(this.k instanceof Oc2)) {
            return;
         }

         var9 = this.k;
      }

      Oc2 var4 = (Oc2)var9;
      Object var5 = var4.U();
      var10000 = (UK_2)var5;
      if (var3 == null) {
         if (var5 == null) {
            return;
         }

         var10000 = (UK_2)var5;
      }

      int var6 = Array.getLength(var10000);
      if (var6 > this.l) {
         Object var7;
         label36: {
            var10000 = (UK_2)(var4.v());
            if (var3 == null) {
               if (var10000 != null) {
                  var7 = B8_2.I(var2, var4.v(), this.H.L());
                  if (var3 == null) {
                     break label36;
                  }
               }

               var10000 = (UK_2)var2;
            }

            var7 = var10000;
         }

         Array.set(var5, this.l, var7);
      }
   }

   @Override
   public void y(Yn4 var1, Object var2, Type var3, Map var4) {
   }
}





