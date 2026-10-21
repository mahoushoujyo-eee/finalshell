package com.finalshell.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class S2_3 extends U2_3 {
   public final Iterable D;

   public S2_3(Iterable var1) {
      this.D = var1;
   }

   public S2_3(J_5[] var1) {
      this(Arrays.asList(var1));
   }

   @C_9
   @Override
   public final N_6 J(String var1) {
      int[] var10000 = F_6.h();
      Iterator var3 = this.D.iterator();
      int[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
      N_6 var6;
            J_5 var4 = (J_5)var3.next();
            N_6 var5 = var4.J(var1);
            var6 = var5;
            if (var2 != null) {
               break;
            }

            if (var5 != null) {
               var6 = var5;
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         return null;
      }

      return var6;
   }

   @C_9
   @Override
   public Iterable E(String var1, boolean var2) throws IOException {
      int[] var10000 = F_6.h();
      ArrayList var4 = new ArrayList();
      Iterator var5 = this.D.iterator();
      int[] var3 = var10000;

      label42:
      while (var5.hasNext()) {
      Iterable var11;
         J_5 var6 = (J_5)var5.next();
         Iterable var7 = ((U2_3)var6).E(var1, var2);

         label47: {
            label38: {
               try {
                  var11 = var7;
                  if (var3 != null) {
                     break label38;
                  }

                  if (var7 == null) {
                     break label47;
                  }
               } catch (IOException var10) {
                  throw a(var10);
               }

               var11 = var7;
            }

            for (N_6 var9 : var11) {
               var4.add(var9);
               if (var3 != null) {
                  continue label42;
               }

               if (var3 != null) {
                  break;
               }
            }
         }

         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





