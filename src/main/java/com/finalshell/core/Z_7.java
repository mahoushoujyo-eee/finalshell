package com.finalshell.core;

import java.util.Iterator;
import java.util.List;

public class Z_7 {
   public final String E;
   public final List C;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Z_7(String var1, List var2) {
      this.E = var1;
      this.C = var2;
   }

   @Override
   public String toString() {
      String var10000 = M_8.w();
      StringBuilder var2 = new StringBuilder(this.E);
      String var1 = var10000;
      List var4 = this.C;
      if (var1 != null) {
         if (this.C.isEmpty()) {
            return var2.toString();
         }

         var4 = this.C;
      }

      Iterator var3 = var4.iterator();
      var2.append((char)a(27425, 5233722792579288972L)).append(((L_8)var3.next()).toString());

      while (var3.hasNext()) {
         var2.append(a).append(((L_8)var3.next()).toString());
         if (var1 == null) {
            return var2.toString();
         }

         if (var1 == null) {
            break;
         }
      }

      var2.append((char)a(15092, 7597099401763561048L));
      return var2.toString();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9389;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Y\u0006".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 40;
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
         var10007 = 40;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 93;
               break;
            case 1:
               var37 = 14;
               break;
            case 2:
               var37 = 71;
               break;
            case 3:
               var37 = 8;
               break;
            case 4:
               var37 = 25;
               break;
            case 5:
               var37 = 98;
               break;
            default:
               var37 = 68;
         }
      } else {
         var25 = 40;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 5690185576154854112L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "M¹\u0014á´O=P\u008d«¿\u0001©±ì\u0086";
            int var13 = "M¹\u0014á´O=P\u008d«¿\u0001©±ì\u0086".length();
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

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 40;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 93;
               break;
            case 1:
               var37 = 14;
               break;
            case 2:
               var37 = 71;
               break;
            case 3:
               var37 = 8;
               break;
            case 4:
               var37 = 25;
               break;
            case 5:
               var37 = 98;
               break;
            default:
               var37 = 68;
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
                  var37 = 93;
                  break;
               case 1:
                  var37 = 14;
                  break;
               case 2:
                  var37 = 71;
                  break;
               case 3:
                  var37 = 8;
                  break;
               case 4:
                  var37 = 25;
                  break;
               case 5:
                  var37 = 98;
                  break;
               default:
                  var37 = 68;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 5690185576154854112L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "M¹\u0014á´O=P\u008d«¿\u0001©±ì\u0086";
               int var5 = "M¹\u0014á´O=P\u008d«¿\u0001©±ì\u0086".length();
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

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 93;
                  break;
               case 1:
                  var37 = 14;
                  break;
               case 2:
                  var37 = 71;
                  break;
               case 3:
                  var37 = 8;
                  break;
               case 4:
                  var37 = 25;
                  break;
               case 5:
                  var37 = 98;
                  break;
               default:
                  var37 = 68;
            }
         }
      }
   }
}





