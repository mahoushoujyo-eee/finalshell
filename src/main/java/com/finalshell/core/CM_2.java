package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class CM_2 {
   public final int X;
   public static boolean t;
   public static long d;

   public CM_2(int var1) {
   super();
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      Ky4[] var2 = var10000;
      if (var2 == null) {
         if (!t) {
            int var3 = var1;
            if (var2 == null) {
               if (var1 < 0) {
                  throw new AssertionError();
               }

               var3 = var1;
            }

            if (var3 > (int)d) {
               throw new AssertionError();
            }
         }

         this.X = var1;
      }
   }

   public abstract Object r(U2_2 var1);

   public abstract void e(DataOutputStream var1) throws IOException;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2196569374868418399L;
      long var10002 = -4135210685799313248L ^ var0;
      byte var10001 = -1;
      d = var10002;
      t = !Cr2_2.class.desiredAssertionStatus();
   }
}





