package com;

public class ya_4 extends com.yx_4 {
   private final byte[] b = new byte[b(14356, 739317319887751021L)];
   private static final String f;
   private static final long[] k;
   private static final Integer[] l;

   public ya_4() {
      this.N = f;
   }

   @Override
   public int h() {
      return b(26564, 4353087614314076348L);
   }

   @Override
   public void U(byte[] var1, int var2) {
      super.U(this.b, 0);
      System.arraycopy(this.b, 0, var1, var2, b(16139, 3268082584422678640L));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "pE\u001d@VY%-\u0005E\u0015".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 62;
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
         var10007 = 62;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 38;
               break;
            case 1:
               var37 = 22;
               break;
            case 2:
               var37 = 66;
               break;
            case 3:
               var37 = 29;
               break;
            case 4:
               var37 = 69;
               break;
            case 5:
               var37 = 10;
               break;
            default:
               var37 = 127;
         }
      } else {
         var25 = 62;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            f = var29;
            long var9 = 3871706730480718190L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "\"|~`lþÖ\u0013_V\u0004Ç\u0007\u009d\tÞ\u0093^$#½íQ\u0012";
            int var13 = "\"|~`lþÖ\u0013_V\u0004Ç\u0007\u009d\tÞ\u0093^$#½íQ\u0012".length();
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
         var10007 = 62;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 38;
               break;
            case 1:
               var37 = 22;
               break;
            case 2:
               var37 = 66;
               break;
            case 3:
               var37 = 29;
               break;
            case 4:
               var37 = 69;
               break;
            case 5:
               var37 = 10;
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
                  var37 = 38;
                  break;
               case 1:
                  var37 = 22;
                  break;
               case 2:
                  var37 = 66;
                  break;
               case 3:
                  var37 = 29;
                  break;
               case 4:
                  var37 = 69;
                  break;
               case 5:
                  var37 = 10;
                  break;
               default:
                  var37 = 127;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               f = var27;
               long var0 = 3871706730480718190L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "\"|~`lþÖ\u0013_V\u0004Ç\u0007\u009d\tÞ\u0093^$#½íQ\u0012";
               int var5 = "\"|~`lþÖ\u0013_V\u0004Ç\u0007\u009d\tÞ\u0093^$#½íQ\u0012".length();
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
                  var37 = 38;
                  break;
               case 1:
                  var37 = 22;
                  break;
               case 2:
                  var37 = 66;
                  break;
               case 3:
                  var37 = 29;
                  break;
               case 4:
                  var37 = 69;
                  break;
               case 5:
                  var37 = 10;
                  break;
               default:
                  var37 = 127;
            }
         }
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16249;
      if (l[var3] == null) {
         l[var3] = (int)(k[var3] ^ var1);
      }

      return l[var3];
   }
}





