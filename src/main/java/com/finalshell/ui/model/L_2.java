package com.finalshell.ui.model;

import com.finalshell.core.C_9;
import com.finalshell.core.O2_6;
import com.finalshell.core.V_6;
import com.finalshell.ui.panel.Ky4;
import java.util.Comparator;

public class L_2 implements Comparator {
   public static boolean d;

   @Override
   public int compare(@C_9 Object var1, @C_9 Object var2) {
      String var3 = O2_6.f();
      int var10000 = (d) ? 1 : 0;
      if (var3 != null) {
         if (!d && var1 == null) {
            throw new AssertionError();
         }

         var10000 = (d) ? 1 : 0;
      }

      if (var3 != null) {
         label30: {
            if (var10000 == 0) {
               var4 = var2;
               if (var3 == null) {
                  break label30;
               }

               if (var2 == null) {
                  throw new AssertionError();
               }
            }

            var4 = var2;
         }

         var10000 = ((V_6)var4).F - ((V_6)var1).F;
      }

      if (Ky4.F$arrString() != null) {
         O2_6.s("PwyoAb");
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      d = !O2_6.class.desiredAssertionStatus();
   }
}





