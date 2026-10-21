package com.finalshell.core;

import com.finalshell.ui.listener.Id2;
import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.Ks4;

public class U6 {
   public static boolean F;

   public static synchronized void J() {
      String var0 = Cl4_2.I();
      boolean var10000 = F;
      if (var0 == null) {
         if (F) {
            return;
         }

         var10000 = true;
      }

      F = var10000;
      Cl4_2.L();
      W92.d(com.finalshell.ui.panel.QL.class, Iy2.class);
      W92.d(com.finalshell.ui.panel.S.class, Id2.class);
      W92.d(Lk4.class, I7.class);
      W92.d(K32.class, I9.class);
      W92.d(Ks4.class, I1.class);
      W92.d(com.finalshell.ui.panel.Ou4.class, IE.class);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      F = false;
   }
}





