package com.finalshell.core;

public class Y92 extends Y12 {
   public final byte[] D = new byte[b(15577, 1517793645032144345L)];
   public static String f;
   public static long[] k;
   public static Integer[] l;

   public Y92() {
      this.N = f;
   }

   @Override
   public int h() {
      return b(7080, 7106674098521397930L);
   }

   @Override
   public void U(byte[] var1, int var2) {
      super.U(this.D, 0);
      System.arraycopy(this.D, 0, var1, var2, b(6771, 7605531016987138930L));
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16640;
      if (l[var3] == null) {
         l[var3] = (int)(k[var3] ^ var1);
      }

      return l[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "z:NaN\u0017Tsf\u0002;U".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 67;
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
         var10007 = 67;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 81;
               break;
            case 1:
               var37 = 20;
               break;
            case 2:
               var37 = 108;
               break;
            case 3:
               var37 = 65;
               break;
            case 4:
               var37 = 32;
               break;
            case 5:
               var37 = 39;
               break;
            default:
               var37 = 127;
         }
      } else {
         var25 = 67;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            f = var29;
            long var9 = 2803924732131640658L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "\u001faÔ&mßø\u009f\u0094S\u009c¢ \u0018^,¾gH÷»ußô";
            int var13 = "\u001faÔ&mßø\u009f\u0094S\u009c¢ \u0018^,¾gH÷»ußô".length();
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

            k = var14;
            l = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 67;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 81;
               break;
            case 1:
               var37 = 20;
               break;
            case 2:
               var37 = 108;
               break;
            case 3:
               var37 = 65;
               break;
            case 4:
               var37 = 32;
               break;
            case 5:
               var37 = 39;
               break;
            default:
               var37 = 127;
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
                  var37 = 81;
                  break;
               case 1:
                  var37 = 20;
                  break;
               case 2:
                  var37 = 108;
                  break;
               case 3:
                  var37 = 65;
                  break;
               case 4:
                  var37 = 32;
                  break;
               case 5:
                  var37 = 39;
                  break;
               default:
                  var37 = 127;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               f = var27;
               long var0 = 2803924732131640658L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "\u001faÔ&mßø\u009f\u0094S\u009c¢ \u0018^,¾gH÷»ußô";
               int var5 = "\u001faÔ&mßø\u009f\u0094S\u009c¢ \u0018^,¾gH÷»ußô".length();
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

               k = var6;
               l = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 81;
                  break;
               case 1:
                  var37 = 20;
                  break;
               case 2:
                  var37 = 108;
                  break;
               case 3:
                  var37 = 65;
                  break;
               case 4:
                  var37 = 32;
                  break;
               case 5:
                  var37 = 39;
                  break;
               default:
                  var37 = 127;
            }
         }
      }
   }
}





