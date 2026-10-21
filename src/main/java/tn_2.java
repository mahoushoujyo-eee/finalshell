import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Arrays;

public class Tn_2 {
   private static BigInteger d;
   private static final long[] a;
   private static final Integer[] b;

   public byte[] G(byte[] var1, uD_3 var2) {
      int[] var3 = new int[a(6832, 5874474620014300320L)];
      Object[] var10000 = com.c.a(var1);
      Method var22 = com.c.d(512736053921422101L);
      Object[] var49 = var10000;
      Object var34 = null;

      try {
         var10000 = (int[])var22.invoke(var34, var49);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      int[] var4 = (int[])var10000;
      var34 = com.c.f();
      Method var10003 = com.c.d(250599912893926029L);
      var49 = (Object[])var34;
      var34 = var2;
      Method var24 = var10003;

      try {
         var25 = (Integer)var24.invoke(var34, var49);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      int var5 = var25 / a(11257, 3684156388545805807L);
      int var6 = 0;
      int var7 = 0;

      while (var7 < var4.length) {
         var6 = Math.min(var4.length - var7, var5);

         for (int var8 = 0; var8 < var6; var8++) {
            var3[var8] ^= var4[var8 + var7];
         }

         var7 += var6;
         if (var6 == var5) {
            var34 = com.c.a(var3);
            var10003 = com.c.d(193381276319214693L);
            var49 = (Object[])var34;
            var34 = this;
            Method var26 = var10003;

            try {
               var26.invoke(var34, var49);
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            var6 = 0;
         }
      }

      int var52 = var3[var6];
      Object[] var10004 = com.c.f();
      Method var10006 = com.c.d(128251248314931182L);
      Object[] var10005 = var10004;
      uD_3 var66 = var2;
      var10003 = var10006;

      try {
         var60 = (Integer)var10003.invoke(var66, var10005);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var3[var6] = var52 ^ var60;
      var34 = com.c.f();
      var10003 = com.c.d(128251248314931182L);
      var49 = (Object[])var34;
      var34 = var2;
      Method var27 = var10003;

      try {
         var28 = (Integer)var27.invoke(var34, var49);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      if ((var28 & a(17755, 7691826784566203214L)) != 0 && var6 == var5 - 1) {
         var34 = com.c.a(var3);
         var10003 = com.c.d(193381276319214693L);
         var49 = (Object[])var34;
         var34 = this;
         Method var29 = var10003;

         try {
            var29.invoke(var34, var49);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }
      }

      var3[var5 - 1] = var3[var5 - 1] ^ a(25495, 3066096042537645440L);
      var34 = com.c.a(var3);
      var10003 = com.c.d(193381276319214693L);
      var49 = (Object[])var34;
      var34 = this;
      Method var30 = var10003;

      try {
         var30.invoke(var34, var49);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      ByteArrayOutputStream var21 = new ByteArrayOutputStream();
      var34 = com.c.f();
      var10003 = com.c.d(191459104244495531L);
      var49 = (Object[])var34;
      var34 = var2;
      Method var31 = var10003;

      try {
         var32 = (Integer)var31.invoke(var34, var49);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      int var9 = var32 / a(26106, 11780229843055595L);

      while (var9 > 0) {
         var6 = Math.min(var9, var5);

         for (int var10 = 0; var10 < var6; var10++) {
            var21.write((byte)var3[var10]);
         }

         var9 -= var6;
         if (var9 > 0) {
            var34 = com.c.a(var3);
            var10003 = com.c.d(193381276319214693L);
            var49 = (Object[])var34;
            var34 = this;
            Method var33 = var10003;

            try {
               var33.invoke(var34, var49);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }
         }
      }

      return var21.toByteArray();
   }

   private void F(int[] var1) {
      BigInteger[][] var2 = new BigInteger[5][5];

      for (int var3 = 0; var3 < 5; var3++) {
         for (int var4 = 0; var4 < 5; var4++) {
            int[] var5 = new int[a(26106, 11780229843055595L)];
            System.arraycopy(var1, a(26106, 11780229843055595L) * (var3 + 5 * var4), var5, 0, var5.length);
            BigInteger[] var10000 = var2[var3];
            Object[] var10002 = com.c.a(var5);
            Method var19 = com.c.d(612749702439729049L);
            Object[] var26 = var10002;
            Object var24 = null;

            try {
               var10002 = (BigInteger)var19.invoke(var24, var26);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var10000[var4] = var10002;
         }
      }

      Object[] var10001 = com.c.a(var2);
      Method var25 = com.c.d(416944330604705078L);
      Object[] var21 = var10001;
      Tn_2 var16 = this;
      Method var12 = var25;

      try {
         var12.invoke(var16, var21);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Arrays.fill(var1, 0);

      for (int var9 = 0; var9 < 5; var9++) {
         for (int var10 = 0; var10 < 5; var10++) {
            Object[] var13 = com.c.a(var2[var9][var10]);
            var12 = com.c.d(370606906034163703L);
            var21 = var13;
            var10001 = null;

            try {
               var15 = (int[])var12.invoke(var10001, var21);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            int[] var11 = var15;
            System.arraycopy(var11, 0, var1, a(26106, 11780229843055595L) * (var9 + 5 * var10), var11.length);
         }
      }
   }

   private void Z(BigInteger[][] var1) {
      int var2 = 1;

      for (int var3 = 0; var3 < a(5196, 802608875531928152L); var3++) {
         BigInteger[] var4 = new BigInteger[5];
         BigInteger[] var5 = new BigInteger[5];

         for (int var6 = 0; var6 < 5; var6++) {
            var4[var6] = var1[var6][0].xor(var1[var6][1]).xor(var1[var6][2]).xor(var1[var6][3]).xor(var1[var6][4]);
         }

         for (int var15 = 0; var15 < 5; var15++) {
            BigInteger var10002 = var4[(var15 + 4) % 5];
            Object[] var10003 = com.c.a(var4[(var15 + 1) % 5], 1);
            Method var28 = com.c.d(483855381871234585L);
            Object[] var35 = var10003;
            Object var32 = null;

            try {
               var10003 = (BigInteger)var28.invoke(var32, var35);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            var5[var15] = var10002.xor(var10003);
         }

         for (int var16 = 0; var16 < 5; var16++) {
            for (int var7 = 0; var7 < 5; var7++) {
               var1[var16][var7] = var1[var16][var7].xor(var5[var16]);
            }
         }

         int var17 = 1;
         int var18 = 0;
         BigInteger var8 = var1[var17][var18];

         for (int var9 = 0; var9 < a(14931, 3019638816695888961L); var9++) {
            int var10 = var17;
            var17 = var18;
            var18 = (2 * var10 + 3 * var18) % 5;
            BigInteger var11 = var8;
            var8 = var1[var17][var18];
            BigInteger[] var10000 = var1[var17];
            Object[] var25 = com.c.a(var11, (var9 + 1) * (var9 + 2) / 2);
            Method var26 = com.c.d(483855381871234585L);
            Object[] var34 = var25;
            Object var31 = null;

            try {
               var25 = (BigInteger)var26.invoke(var31, var34);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            var10000[var18] = var25;
         }

         for (int var19 = 0; var19 < 5; var19++) {
            BigInteger[] var21 = new BigInteger[5];

            for (int var23 = 0; var23 < 5; var23++) {
               var21[var23] = var1[var23][var19];
            }

            for (int var24 = 0; var24 < 5; var24++) {
               BigInteger var12 = var21[(var24 + 1) % 5].xor((BigInteger)com.c.c(436369652555286493L).get(null));
               var1[var24][var19] = var21[var24].xor(var12.and(var21[(var24 + 2) % 5]));
            }
         }

         for (int var20 = 0; var20 < a(16821, 8078101440061331375L); var20++) {
            var2 = (var2 << 1 ^ (var2 >> a(2752, 449986380990225619L)) * a(15916, 7409829986467031093L)) % a(5616, 2960860994259321835L);
            int var22 = (1 << var20) - 1;
            if ((var2 & 2) != 0) {
               var1[0][0] = var1[0][0].xor(new BigInteger("1").shiftLeft(var22));
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ":v\u001e%(\u0000\u001d?~\u001d\")\u0007\u0010>{\u001b'/\u0002".toCharArray();
      int var10004 = var10003.length;
      int var9 = 0;
      byte var36 = 72;
      char[] var10002 = var10003;
      int var21 = var10004;
      char[] var44;
      byte var52;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var44 = var10003;
         var10005 = var9;
         char var10008 = var10003[var9];
         var10007 = 72;
         var10006 = var10008;
         switch (var9 % 7) {
            case 0:
               var52 = 67;
               break;
            case 1:
               var52 = 6;
               break;
            case 2:
               var52 = 98;
               break;
            case 3:
               var52 = 89;
               break;
            case 4:
               var52 = 86;
               break;
            case 5:
               var52 = 127;
               break;
            default:
               var52 = 97;
         }
      } else {
         var36 = 72;
         var21 = var10004;
         if (var10004 <= var9) {
            String var41 = new String(var10003).intern();
            int var27 = -1;
            String var19 = var41;
            long var10 = 8904151357948399024L;
            long[] var15 = new long[11];
            int var12 = 0;
            String var13 = "¬Å\u0091\u0018d|\u0011dÆ*Qð\u0097ð!é2\u009b\u0096¦£ù~Sª°äS4Ó\u0081Ø\u0016L,ÑÊ|x°\u0014\u001f\u0091Ú\u0098\u0091°WÊ\u0018½ùÃ4Þ~\u0094QÇõË{\u008fðbE;ÞÌð\u008f[";
            int var14 = "¬Å\u0091\u0018d|\u0011dÆ*Qð\u0097ð!é2\u009b\u0096¦£ù~Sª°äS4Ó\u0081Ø\u0016L,ÑÊ|x°\u0014\u001f\u0091Ú\u0098\u0091°WÊ\u0018½ùÃ4Þ~\u0094QÇõË{\u008fðbE;ÞÌð\u008f["
               .length();
            byte var11 = 0;

            label71:
            while (true) {
               var27 = var11;
               var11 += 8;
               byte[] var17 = var13.substring(var27, var11).getBytes("ISO-8859-1");
               long[] var20 = var15;
               var27 = var12++;
               long var34 = ((long)var17[0] & 255L) << 56
                  | ((long)var17[1] & 255L) << 48
                  | ((long)var17[2] & 255L) << 40
                  | ((long)var17[3] & 255L) << 32
                  | ((long)var17[4] & 255L) << 24
                  | ((long)var17[5] & 255L) << 16
                  | ((long)var17[6] & 255L) << 8
                  | (long)var17[7] & 255L;
               byte var42 = -1;

               while (true) {
                  long var50 = var34 ^ var10;
                  switch (var42) {
                     case 0:
                        var20[var27] = var50;
                        if (var11 >= var14) {
                           a = var15;
                           b = new Integer[11];
                           com.c.c(436369652555286493L).set(null, new BigInteger(var19));
                           return;
                        }
                        break;
                     default:
                        var20[var27] = var50;
                        if (var11 < var14) {
                           continue label71;
                        }

                        var13 = "ç¶]_\u0016¾Ú\u0018\u007f\\V\u0091Á´%ô";
                        var14 = "ç¶]_\u0016¾Ú\u0018\u007f\\V\u0091Á´%ô".length();
                        var11 = 0;
                  }

                  byte var30 = var11;
                  var11 += 8;
                  var17 = var13.substring(var30, var11).getBytes("ISO-8859-1");
                  var20 = var15;
                  var27 = var12++;
                  var34 = ((long)var17[0] & 255L) << 56
                     | ((long)var17[1] & 255L) << 48
                     | ((long)var17[2] & 255L) << 40
                     | ((long)var17[3] & 255L) << 32
                     | ((long)var17[4] & 255L) << 24
                     | ((long)var17[5] & 255L) << 16
                     | ((long)var17[6] & 255L) << 8
                     | (long)var17[7] & 255L;
                  var42 = 0;
               }
            }
         }

         var44 = var10003;
         var10005 = var9;
         char var53 = var10003[var9];
         var10007 = 72;
         var10006 = var53;
         switch (var9 % 7) {
            case 0:
               var52 = 67;
               break;
            case 1:
               var52 = 6;
               break;
            case 2:
               var52 = 98;
               break;
            case 3:
               var52 = 89;
               break;
            case 4:
               var52 = 86;
               break;
            case 5:
               var52 = 127;
               break;
            default:
               var52 = 97;
         }
      }

      while (true) {
         var44[var10005] = (char)(var10006 ^ var10007 ^ var52);
         var9++;
         if (var36 == 0) {
            var44 = var10002;
            var10005 = var36;
            char var55 = var10002[var36];
            var10007 = var36;
            var10006 = var55;
            switch (var9 % 7) {
               case 0:
                  var52 = 67;
                  break;
               case 1:
                  var52 = 6;
                  break;
               case 2:
                  var52 = 98;
                  break;
               case 3:
                  var52 = 89;
                  break;
               case 4:
                  var52 = 86;
                  break;
               case 5:
                  var52 = 127;
                  break;
               default:
                  var52 = 97;
            }
         } else {
            if (var21 <= var9) {
               String var38 = new String(var10002).intern();
               int var23 = -1;
               String var8 = var38;
               long var0 = 8904151357948399024L;
               long[] var6 = new long[11];
               int var3 = 0;
               String var4 = "¬Å\u0091\u0018d|\u0011dÆ*Qð\u0097ð!é2\u009b\u0096¦£ù~Sª°äS4Ó\u0081Ø\u0016L,ÑÊ|x°\u0014\u001f\u0091Ú\u0098\u0091°WÊ\u0018½ùÃ4Þ~\u0094QÇõË{\u008fðbE;ÞÌð\u008f[";
               int var5 = "¬Å\u0091\u0018d|\u0011dÆ*Qð\u0097ð!é2\u009b\u0096¦£ù~Sª°äS4Ó\u0081Ø\u0016L,ÑÊ|x°\u0014\u001f\u0091Ú\u0098\u0091°WÊ\u0018½ùÃ4Þ~\u0094QÇõË{\u008fðbE;ÞÌð\u008f["
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var23 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var23, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var23 = var3++;
                  long var32 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var39 = -1;

                  while (true) {
                     long var48 = var32 ^ var0;
                     switch (var39) {
                        case 0:
                           var10000[var23] = var48;
                           if (var2 >= var5) {
                              a = var6;
                              b = new Integer[11];
                              com.c.c(436369652555286493L).set(null, new BigInteger(var8));
                              return;
                           }
                           break;
                        default:
                           var10000[var23] = var48;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ç¶]_\u0016¾Ú\u0018\u007f\\V\u0091Á´%ô";
                           var5 = "ç¶]_\u0016¾Ú\u0018\u007f\\V\u0091Á´%ô".length();
                           var2 = 0;
                     }

                     byte var26 = var2;
                     var2 += 8;
                     var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var23 = var3++;
                     var32 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var39 = 0;
                  }
               }
            }

            var44 = var10002;
            var10005 = var9;
            char var54 = var10002[var9];
            var10007 = var36;
            var10006 = var54;
            switch (var9 % 7) {
               case 0:
                  var52 = 67;
                  break;
               case 1:
                  var52 = 6;
                  break;
               case 2:
                  var52 = 98;
                  break;
               case 3:
                  var52 = 89;
                  break;
               case 4:
                  var52 = 86;
                  break;
               case 5:
                  var52 = 127;
                  break;
               default:
                  var52 = 97;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5651;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





