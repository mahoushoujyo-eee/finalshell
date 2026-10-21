package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

public abstract class CM {
   final int X;
   static final boolean t = !org.H.Cr_2.class.desiredAssertionStatus();
   private static final long d;

   public CM(int var1) {
      com.ky_4[] var10000 = org.H.Cr_2.q();
      super();
      com.ky_4[] var2 = var10000;
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

   public abstract Object r(org.H.u_2 var1);

   public abstract void e(DataOutputStream var1) throws IOException;

   static {
      long var0 = 2196569374868418399L;
      long var10002 = -4135210685799313248L ^ var0;
      byte var10001 = -1;
      d = var10002;
   }
}





