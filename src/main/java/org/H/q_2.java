package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

class q_2 extends org.H.n_2 {
   private final short Z;
   private static final String b;
   private static final long c;

   q_2(short var1) {
      this.Z = var1;
   }

   @Override
   public Object w(org.H.Cr_2 var1) {
      return var1.S(this.Z);
   }

   @Override
   public boolean x() {
      return false;
   }

   @Override
   public void R(DataOutputStream var1) throws IOException {
      var1.writeByte((int)c);
      var1.writeShort(this.Z);
   }

   @Override
   public String toString() {
      return b + this.Z + ")";
   }

   @Override
   public boolean equals(@org.F.c Object var1) {
      com.ky_4[] var2 = org.H.Cr_2.q();
      short var10000 = var1 instanceof org.H.q_2;
      if (var2 == null) {
         if (var10000 == 0) {
            return (boolean)0;
         }

         var10000 = ((org.H.q_2)var1).Z;
      }

      if (var2 != null) {
         return (boolean)var10000;
      } else {
         return (boolean)(var10000 == this.Z ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      return this.Z;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "e\be\\\u0015\u0017Xr\u0018x{3?xA\u0018Ba'9>".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 102;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 102;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 64;
               break;
            case 1:
               var21 = 33;
               break;
            case 2:
               var21 = 77;
               break;
            case 3:
               var21 = 105;
               break;
            case 4:
               var21 = 39;
               break;
            case 5:
               var21 = 48;
               break;
            default:
               var21 = 112;
         }
      } else {
         var13 = 102;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            b = var16;
            long var3 = 4245736875692699010L;
            long var12 = -5002113399552692854L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 102;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 64;
               break;
            case 1:
               var21 = 33;
               break;
            case 2:
               var21 = 77;
               break;
            case 3:
               var21 = 105;
               break;
            case 4:
               var21 = 39;
               break;
            case 5:
               var21 = 48;
               break;
            default:
               var21 = 112;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 64;
                  break;
               case 1:
                  var21 = 33;
                  break;
               case 2:
                  var21 = 77;
                  break;
               case 3:
                  var21 = 105;
                  break;
               case 4:
                  var21 = 39;
                  break;
               case 5:
                  var21 = 48;
                  break;
               default:
                  var21 = 112;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               b = var15;
               long var0 = 4245736875692699010L;
               long var11 = -5002113399552692854L ^ var0;
               var6 = -1;
               c = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 64;
                  break;
               case 1:
                  var21 = 33;
                  break;
               case 2:
                  var21 = 77;
                  break;
               case 3:
                  var21 = 105;
                  break;
               case 4:
                  var21 = 39;
                  break;
               case 5:
                  var21 = 48;
                  break;
               default:
                  var21 = 112;
            }
         }
      }
   }
}





