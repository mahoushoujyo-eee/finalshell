package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;

public class L_4 extends N2_3 {
   public final double u;
   public static String b;
   public static long[] c;
   public static Integer[] d;

   L_4(double var1) {
      this.u = var1;
   }

   @Override
   public Object w(Cr2_2 var1) {
      return this.u;
   }

   @Override
   public boolean x() {
      return true;
   }

   @Override
   public void R(DataOutputStream var1) throws IOException {
      var1.writeByte(a(6365, 2108958419676507690L));
      var1.writeDouble(this.u);
   }

   @Override
   public String toString() {
      return b + this.u + ")";
   }

   @Override
   public boolean equals(@C_9 Object var1) {
      Ky4[] var2 = Cr2_2.q$arrky_4();
      int var10000 = (var1 instanceof L_4) ? 1 : 0;
      if (var2 == null) {
         if (!var10000) {
            return 0 != 0;
         }

         double var3;
         var10000 = (var3 = ((L_4)var1).u - this.u) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
      }

      if (var2 != null) {
         return var10000 != 0;
      } else {
         return (boolean)(!var10000 ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.u);
      return (int)var1 ^ (int)(var1 >> a(22801, 3468460289844506599L));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14070;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "{to/<7\rlde\u0013\u001d\u0014/]dH\u0012\u000e\u0019k".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 26;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 26;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 34;
               break;
            case 1:
               var37 = 33;
               break;
            case 2:
               var37 = 59;
               break;
            case 3:
               var37 = 102;
               break;
            case 4:
               var37 = 114;
               break;
            case 5:
               var37 = 108;
               break;
            default:
               var37 = 89;
         }
      } else {
         var25 = 26;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            b = var29;
            long var9 = 1667289751014645484L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "×å²Q'Zq+ »\u0090\u0010¨\u0003°À";
            int var13 = "×å²Q'Zq+ »\u0090\u0010¨\u0003°À".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            c = var14;
            d = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 26;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 34;
               break;
            case 1:
               var37 = 33;
               break;
            case 2:
               var37 = 59;
               break;
            case 3:
               var37 = 102;
               break;
            case 4:
               var37 = 114;
               break;
            case 5:
               var37 = 108;
               break;
            default:
               var37 = 89;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 34;
                  break;
               case 1:
                  var37 = 33;
                  break;
               case 2:
                  var37 = 59;
                  break;
               case 3:
                  var37 = 102;
                  break;
               case 4:
                  var37 = 114;
                  break;
               case 5:
                  var37 = 108;
                  break;
               default:
                  var37 = 89;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               b = var27;
               long var0 = 1667289751014645484L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "×å²Q'Zq+ »\u0090\u0010¨\u0003°À";
               int var5 = "×å²Q'Zq+ »\u0090\u0010¨\u0003°À".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               c = var6;
               d = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 34;
                  break;
               case 1:
                  var37 = 33;
                  break;
               case 2:
                  var37 = 59;
                  break;
               case 3:
                  var37 = 102;
                  break;
               case 4:
                  var37 = 114;
                  break;
               case 5:
                  var37 = 108;
                  break;
               default:
                  var37 = 89;
            }
         }
      }
   }
}





