package com.finalshell.ui.model;

import com.finalshell.core.F_6;
import com.finalshell.core.K2_4;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Y2 extends O_3 {
   Y2(Iterator var1) {
      super(var1);
   }

   protected Iterator W(Object var1) {
      int[] var10000 = F_6.h();
      File var3 = (File)var1;
      int[] var2 = var10000;
      File var5 = var3;
      if (var2 == null) {
         if (!var3.exists()) {
            return Collections.emptyList().iterator();
         }

         var5 = var3;
      }

      File[] var4 = var5.listFiles(new K2_4(this));
      return new N2(this, Arrays.asList(var4).iterator());
   }

   @Override
   protected Object w(Object var1) {
      return this.W(var1);
   }
}





