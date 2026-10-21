package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.UD3;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.Arrays;

public class Tn2 {
   public static BigInteger d;
   public static long[] a;
   public static Integer[] b;

   public byte[] G(byte[] var1, UD3 var2) {
      Integer var48;
      int[] var3 = new int[a(6832, 5874474620014300320L)];
      Registry.packArgs(var1);
      long var11 = 512736053921422101L;
      Object var10001 = Ref.h2(512736053921422101L, var11);

      try {
         var10001 = (int[])var10001;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      int[] var4 = (int[])var10001;
      Object var10002 = Registry.emptyArgs();
      long var14 = 250599912893926029L;
      Object var13 = var10002;
      var10002 = Ref.h(250599912893926029L, var13, var14);

      try {
         var42 = (Integer)var10002;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      int var5 = var42 / a(11257, 3684156388545805807L);
      int var6 = 0;
      int var7 = 0;

      while (var7 < var4.length) {
         var6 = Math.min(var4.length - var7, var5);

         for (int var8 = 0; var8 < var6; var8++) {
            var3[var8] ^= var4[var8 + var7];
         }

         var7 += var6;
         if (var6 == var5) {
            Object var10003 = Registry.packArgs(var3);
            long var16 = 193381276319214693L;
            Object var15 = var10003;
            Ref.h(193381276319214693L, var15, var16);

            try {
               ;
            } catch (InvocationTargetException var35) {
               throw var35.getTargetException();
            }

            var6 = 0;
         }
      }

      int var10004 = var3[var6];
      Object var10006 = Registry.emptyArgs();
      long var18 = 128251248314931182L;
      Object var17 = var10006;
      var10006 = Ref.h(128251248314931182L, var17, var18);

      try {
         var48 = (Integer)var10006;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      ((Object[])var6)[var10004] = var2 ^ var48;
      Object[] var43 = Registry.emptyArgs();
      long var20 = 128251248314931182L;
      Object[] var19 = var43;
      Object var44 = Ref.h(128251248314931182L, var19, var20);

      try {
         var10004 = (Integer)var44;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      if ((var10004 & a(17755, 7691826784566203214L)) != 0 && var6 == var5 - 1) {
         Object[] var10005 = Registry.packArgs(var3);
         long var22 = 193381276319214693L;
         Object[] var21 = var10005;
         Ref.h(193381276319214693L, var21, var22);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }
      }

      var3[var5 - 1] = var3[var5 - 1] ^ a(25495, 3066096042537645440L);
      Object[] var46 = Registry.packArgs(var3);
      long var24 = 193381276319214693L;
      Object[] var23 = var46;
      Ref.h(193381276319214693L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      ByteArrayOutputStream var39 = new ByteArrayOutputStream();
      var10006 = Registry.emptyArgs();
      long var26 = 191459104244495531L;
      Object var25 = var10006;
      var10006 = Ref.h(191459104244495531L, var25, var26);

      try {
         var51 = (Integer)var10006;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      int var9 = var51 / a(26106, 11780229843055595L);

      while (var9 > 0) {
         var6 = Math.min(var9, var5);

         for (int var10 = 0; var10 < var6; var10++) {
            var39.write((byte)var3[var10]);
         }

         var9 -= var6;
         if (var9 > 0) {
            Object[] var10007 = Registry.packArgs(var3);
            long var28 = 193381276319214693L;
            Object[] var27 = var10007;
            Ref.h(193381276319214693L, var27, var28);

            try {
               ;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }
         }
      }

      return var39.toByteArray();
   }

   public void F(int[] var1) {
      BigInteger[][] var2 = new BigInteger[5][5];

      for (int var3 = 0; var3 < 5; var3++) {
         for (int var4 = 0; var4 < 5; var4++) {
            int[] var5 = new int[a(26106, 11780229843055595L)];
            System.arraycopy(var1, a(26106, 11780229843055595L) * (var3 + 5 * var4), var5, 0, var5.length);
            BigInteger[] var10000 = var2[var3];
            Object[] var10002 = Registry.packArgs(var5);
            long var6 = 612749702439729049L;
            Object var10003 = Ref.h2(612749702439729049L, var6);

            try {
               var10003 = (BigInteger)var10003;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            ((Object[])var4)[var10002] = (int)var10003;
         }
      }

      Object[] var10001 = Registry.packArgs(var2);
      long var9 = 416944330604705078L;
      Object[] var8 = var10001;
      Ref.h(416944330604705078L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Arrays.fill(var1, 0);

      for (int var15 = 0; var15 < 5; var15++) {
         for (int var16 = 0; var16 < 5; var16++) {
            Registry.packArgs(var2[var15][var16]);
            long var10 = 370606906034163703L;
            Object var18 = Ref.h2(370606906034163703L, var10);

            try {
               var18 = (int[])var18;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            int[] var17 = (int[])var18;
            System.arraycopy(var17, 0, var1, a(26106, 11780229843055595L) * (var15 + 5 * var16), var17.length);
         }
      }
   }

   public void Z(BigInteger[][] var1) {
      int var2 = 1;

      for (int var3 = 0; var3 < a(5196, 802608875531928152L); var3++) {
         BigInteger[] var4 = new BigInteger[5];
         BigInteger[] var5 = new BigInteger[5];

         for (int var6 = 0; var6 < 5; var6++) {
            var4[var6] = var1[var6][0].xor(var1[var6][1]).xor(var1[var6][2]).xor(var1[var6][3]).xor(var1[var6][4]);
         }

         for (int var19 = 0; var19 < 5; var19++) {
            BigInteger var10002 = var4[(var19 + 4) % 5];
            Object[] var10003 = Registry.packArgs(var4[(var19 + 1) % 5], 1);
            long var13 = 483855381871234585L;
            Object var10004 = Ref.h2(483855381871234585L, var13);

            try {
               var10004 = (BigInteger)var10004;
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            ((Object[])var19)[var10002] = (int)var10003.xor((BigInteger)var10004);
         }

         for (int var20 = 0; var20 < 5; var20++) {
            for (int var7 = 0; var7 < 5; var7++) {
               var1[var20][var7] = var1[var20][var7].xor(var5[var20]);
            }
         }

         int var21 = 1;
         int var22 = 0;
         BigInteger var8 = var1[var21][var22];

         for (int var9 = 0; var9 < a(14931, 3019638816695888961L); var9++) {
            int var10 = var21;
            var21 = var22;
            var22 = (2 * var10 + 3 * var22) % 5;
            BigInteger var11 = var8;
            var8 = var1[var21][var22];
            BigInteger[] var10000 = var1[var21];
            Object[] var29 = Registry.packArgs(var11, (var9 + 1) * (var9 + 2) / 2);
            long var15 = 483855381871234585L;
            Object var30 = Ref.h2(483855381871234585L, var15);

            try {
               var30 = (BigInteger)var30;
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            ((Object[])var22)[var29] = (int)var30;
         }

         for (int var23 = 0; var23 < 5; var23++) {
            BigInteger[] var25 = new BigInteger[5];

            for (int var27 = 0; var27 < 5; var27++) {
               var25[var27] = var1[var27][var23];
            }

            for (int var28 = 0; var28 < 5; var28++) {
               BigInteger var12 = var25[(var28 + 1) % 5].xor((BigInteger)Registry.lookupField(436369652555286493L).get(null));
               var1[var28][var23] = var25[var28].xor(var12.and(var25[(var28 + 2) % 5]));
            }
         }

         for (int var24 = 0; var24 < a(16821, 8078101440061331375L); var24++) {
            var2 = (var2 << 1 ^ (var2 >> a(2752, 449986380990225619L)) * a(15916, 7409829986467031093L)) % a(5616, 2960860994259321835L);
            int var26 = (1 << var24) - 1;
            if ((var2 & 2) != 0) {
               var1[0][0] = var1[0][0].xor(new BigInteger("1").shiftLeft(var26));
            }
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5651;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long var48;
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
                           Registry.lookupField(436369652555286493L).set(null, new BigInteger(var19));
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
                     var48 = var32 ^ var0;
                     switch (var39) {
                        case 0:
                           var10000[var23] = var48;
                           if (var2 >= var5) {
                              a = var6;
                              b = new Integer[11];
                              Registry.lookupField(436369652555286493L).set(null, new BigInteger(var8));
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
}





