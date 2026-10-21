package com.finalshell.util;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.AA;
import java.util.Vector;

public class Uc4 extends Vector {
   String B;

   Uc4(String var1) {
      long var3 = 532695623178604839L;
      Ref.s(532695623178604839L, var1, var3);
   }

   Uc4(String var1, Object[] var2) {
      AA.z();
      long var7 = 532695623178604839L;
      Ref.s(532695623178604839L, var1, var7);
      int var4 = 0;
      Uc4 var3 = this;
      int var5 = var2.length;

      while (var4 < var5) {
         this.add(var2[var4]);
         var4++;
         if (var3 != null) {
            break;
         }
      }
   }

   @Override
   public String toString() {
      new StringBuilder().append("[");
      Object var1 = 532695623178604839L;
      return this.append((String)Ref.g(532695623178604839L, var1)).append("]").toString();
   }
}





