package org.V;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class y_2 extends org.l.O {
   y_2(Iterator var1) {
      super(var1);
   }

   protected Iterator W(Object var1) {
      int[] var10000 = org.V.f.h();
      File var3 = (File)var1;
      int[] var2 = var10000;
      File var5 = var3;
      if (var2 == null) {
         if (!var3.exists()) {
            return Collections.emptyList().iterator();
         }

         var5 = var3;
      }

      File[] var4 = var5.listFiles(new org.V.K(this));
      return new org.V.n_2(this, Arrays.asList(var4).iterator());
   }

   @Override
   protected Object w(Object var1) {
      return this.W(var1);
   }
}





