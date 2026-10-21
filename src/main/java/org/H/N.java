package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

class N extends org.H.n_2 {
   private final int F;
   private static final String b;

   N(int var1) {
      this.F = var1;
   }

   @Override
   public Object w(org.H.Cr_2 var1) {
      return this.F;
   }

   @Override
   public boolean x() {
      return false;
   }

   @Override
   public void R(DataOutputStream var1) throws IOException {
      var1.writeByte(3);
      var1.writeInt(this.F);
   }

   @Override
   public String toString() {
      return b + this.F + ")";
   }

   @Override
   public boolean equals(@org.F.c Object var1) {
      com.ky_4[] var2 = org.H.Cr_2.q();
      int var10000 = var1 instanceof org.H.N;
      if (var2 == null) {
         if (var10000 == 0) {
            return (boolean)0;
         }

         var10000 = ((org.H.N)var1).F;
      }

      if (var2 != null) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 == this.F ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      return this.F;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u001d[!:%|S\nK&\u0007\u0005Xz;f0\u0000\u001f[rv".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 14;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 14;
         var10006 = var0;
      } else {
         var6 = 14;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 14;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 80;
               break;
            case 1:
               var23 = 26;
               break;
            case 2:
               var23 = 97;
               break;
            case 3:
               var23 = 103;
               break;
            case 4:
               var23 = 127;
               break;
            case 5:
               var23 = 51;
               break;
            default:
               var23 = 19;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





