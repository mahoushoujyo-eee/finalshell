package org.V;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class s_2 extends org.V.U {
   private final Iterable D;

   public s_2(Iterable var1) {
      this.D = var1;
   }

   public s_2(J[] var1) {
      this(Arrays.asList(var1));
   }

   @org.F.c
   @Override
   public final org.V.N J(String var1) {
      int[] var10000 = org.V.f.h();
      Iterator var3 = this.D.iterator();
      int[] var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            J var4 = (J)var3.next();
            org.V.N var5 = var4.J(var1);
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

   @org.F.c
   @Override
   public Iterable E(String var1, boolean var2) throws IOException {
      int[] var10000 = org.V.f.h();
      ArrayList var4 = new ArrayList();
      Iterator var5 = this.D.iterator();
      int[] var3 = var10000;

      label42:
      while (var5.hasNext()) {
         J var6 = (J)var5.next();
         Iterable var7 = ((org.V.U)var6).E(var1, var2);

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

            for (org.V.N var9 : var11) {
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

   private static IOException a(IOException var0) {
      return var0;
   }
}





