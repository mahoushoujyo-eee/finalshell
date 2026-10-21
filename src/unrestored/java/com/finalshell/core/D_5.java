package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;

public class D_5 extends N2_3 {
   public final long Y;
   public static String b;
   public static long c;

   public D_5(long var1) {
      this.Y = var1;
   }

   @Override
   public Object w(Cr2_2 var1) {
      return this.Y;
   }

   @Override
   public boolean x() {
      return true;
   }

   @Override
   public void R(DataOutputStream var1) throws IOException {
      var1.writeByte(5);
      var1.writeLong(this.Y);
   }

   @Override
   public String toString() {
      return b + this.Y + ")";
   }

   @Override
   public boolean equals(@C_9 Object var1) {
      Ky4[] var2 = Cr2_2.q$arrky_4();
      int var10000 = (var1 instanceof D_5) ? 1 : 0;
      if (var2 == null) {
         if (!var10000) {
            return 0 != 0;
         }

         long var3;
         var10000 = (var3 = ((D_5)var1).Y - this.Y) == 0L ? 0 : (var3 < 0L ? -1 : 1);
      }

      if (var2 != null) {
         return var10000 != 0;
      } else {
         return (boolean)((!var10000 ? 1 : 0) != 0);
      }
   }

   @Override
   public int hashCode() {
      return (int)this.Y ^ (int)(this.Y >> (int)c);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Y`\u0003eD\u0017hNp\u0001Y~1ysA+Y8".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 43;
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
         var10007 = 43;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 49;
               break;
            case 1:
               var21 = 4;
               break;
            case 2:
               var21 = 102;
               break;
            case 3:
               var21 = 29;
               break;
            case 4:
               var21 = 59;
               break;
            case 5:
               var21 = 125;
               break;
            default:
               var21 = 13;
         }
      } else {
         var13 = 43;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            b = var16;
            long var3 = 8189478931869889445L;
            long var12 = -7090479922209721467L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 43;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 49;
               break;
            case 1:
               var21 = 4;
               break;
            case 2:
               var21 = 102;
               break;
            case 3:
               var21 = 29;
               break;
            case 4:
               var21 = 59;
               break;
            case 5:
               var21 = 125;
               break;
            default:
               var21 = 13;
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
                  var21 = 49;
                  break;
               case 1:
                  var21 = 4;
                  break;
               case 2:
                  var21 = 102;
                  break;
               case 3:
                  var21 = 29;
                  break;
               case 4:
                  var21 = 59;
                  break;
               case 5:
                  var21 = 125;
                  break;
               default:
                  var21 = 13;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               b = var15;
               long var0 = 8189478931869889445L;
               long var11 = -7090479922209721467L ^ var0;
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
                  var21 = 49;
                  break;
               case 1:
                  var21 = 4;
                  break;
               case 2:
                  var21 = 102;
                  break;
               case 3:
                  var21 = 29;
                  break;
               case 4:
                  var21 = 59;
                  break;
               case 5:
                  var21 = 125;
                  break;
               default:
                  var21 = 13;
            }
         }
      }
   }
}





