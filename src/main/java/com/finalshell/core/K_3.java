package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;

public class K_3 extends X2_3 {
   public final short T;
   public static String b;
   public static long c;

   public K_3(short var1) {
      this.T = var1;
   }

   public short I() {
      return this.T;
   }

   @Override
   public boolean x() {
      return false;
   }

   @Override
   public void R(DataOutputStream var1) throws IOException {
      var1.writeByte((int)c);
      var1.writeShort(this.T);
   }

   @Override
   public String toString() {
      return b + this.T + ")";
   }

   @Override
   public boolean equals(@C_9 Object var1) {
      Ky4[] var2 = Cr2_2.q$arrky_4();
      short var10000 = (var1 instanceof K_3) ? 1 : 0;
      if (var2 == null) {
         if (var10000 == 0) {
            return 0 != 0;
         }

         var10000 = ((K_3)var1).T;
      }

      if (var2 != null) {
         return var10000 != 0;
      } else {
         return (boolean)(var10000 == this.T ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      return this.T;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "y\u0015 xU1Bn\u0005#Nu\u0018c^\u000e\u0017[d/eT<\u0001\u0003".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 92;
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
         var10007 = 92;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 102;
               break;
            case 1:
               var21 = 6;
               break;
            case 2:
               var21 = 50;
               break;
            case 3:
               var21 = 119;
               break;
            case 4:
               var21 = 93;
               break;
            case 5:
               var21 = 44;
               break;
            default:
               var21 = 80;
         }
      } else {
         var13 = 92;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            b = var16;
            long var3 = 5379945406433504266L;
            long var12 = 7342011764327230490L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 92;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 102;
               break;
            case 1:
               var21 = 6;
               break;
            case 2:
               var21 = 50;
               break;
            case 3:
               var21 = 119;
               break;
            case 4:
               var21 = 93;
               break;
            case 5:
               var21 = 44;
               break;
            default:
               var21 = 80;
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
                  var21 = 102;
                  break;
               case 1:
                  var21 = 6;
                  break;
               case 2:
                  var21 = 50;
                  break;
               case 3:
                  var21 = 119;
                  break;
               case 4:
                  var21 = 93;
                  break;
               case 5:
                  var21 = 44;
                  break;
               default:
                  var21 = 80;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               b = var15;
               long var0 = 5379945406433504266L;
               long var11 = 7342011764327230490L ^ var0;
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
                  var21 = 102;
                  break;
               case 1:
                  var21 = 6;
                  break;
               case 2:
                  var21 = 50;
                  break;
               case 3:
                  var21 = 119;
                  break;
               case 4:
                  var21 = 93;
                  break;
               case 5:
                  var21 = 44;
                  break;
               default:
                  var21 = 80;
            }
         }
      }
   }
}





