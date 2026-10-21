package com.finalshell.ui.model;

import com.finalshell.core.Dx4;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

public final class SY {
   @Override public int compareTo(Enum o) {
      throw new UnsupportedOperationException("compareTo not implemented");
   }

   public static SY BOLD;
   public static SY ITALIC;
   public static SY BLINK;
   public static SY DIM;
   public static SY INVERSE;
   public static SY UNDERLINED;
   public static SY HIDDEN;
   public static SY[] v;
   public static long[] a;
   public static Integer[] b;

   public static SY[] values() {
      return (SY[])v.clone();
   }

   public static SY valueOf(String var0) {
      throw new UnsupportedOperationException("valueOf not implemented");
   }

   public SY(String var1, int var2) {
   }

   public void d(@NotNull EnumSet var1, boolean var2) {
      String var3 = Dx4.g();
      if (var3 == null) {
         if (var2) {
            var1.add(this);
            if (var3 == null) {
               return;
            }
         }

         var1.remove(this);
      }
   }

   public static SY[] D() {
      SY[] var10000 = new SY[a(11919, 1747797122468568807L)];
      var10000[0] = BOLD;
      var10000[1] = ITALIC;
      var10000[2] = BLINK;
      var10000[3] = DIM;
      var10000[4] = INVERSE;
      var10000[5] = UNDERLINED;
      var10000[a(14686, 9178156540940437812L)] = HIDDEN;
      return var10000;
   }

   public static void L(SY var0, EnumSet var1, boolean var2) {
      var0.d(var1, var2);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28778;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[7];
      int var12 = 0;
      String var11 = "FT\u000b\u001a\u0005FW\u000e\u0010/\u0007MU\u0011\u001b6QE\u0006MO\u0006\u0012-A\nQU\u0003\u001b6NIJ^\u0003";
      int var13 = "FT\u000b\u001a\u0005FW\u000e\u0010/\u0007MU\u0011\u001b6QE\u0006MO\u0006\u0012-A\nQU\u0003\u001b6NIJ^\u0003".length();
      char var10 = 4;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 83;
         String var10001 = var11.substring(++var16, var16 + var10);
         byte var10002 = -1;

         while (true) {
      char[] var30;
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 87;
                        break;
                     case 1:
                        var58 = 72;
                        break;
                     case 2:
                        var58 = 20;
                        break;
                     case 3:
                        var58 = 13;
                        break;
                     case 4:
                        var58 = 55;
                        break;
                     case 5:
                        var58 = 81;
                        break;
                     default:
                        var58 = 83;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var39;
                  if ((var16 += var10) >= var13) {
                     long var0 = 4201249351936074130L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "Ý;ç'9S¨ ð1ÛôbÍ5V\u0087ç»\u0099ÂÍ?r";
                     int var5 = "Ý;ç'9S¨ ð1ÛôbÍ5V\u0087ç»\u0099ÂÍ?r".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     a = var6;
                     b = new Integer[3];
                     BOLD = new SY(var8[0], 0);
                     ITALIC = new SY(var8[3], 1);
                     BLINK = new SY(var8[1], 2);
                     DIM = new SY(var8[6], 3);
                     INVERSE = new SY(var8[2], 4);
                     UNDERLINED = new SY(var8[4], 5);
                     HIDDEN = new SY(var8[5], a(9385, 7666291256228598978L));
                     v = D();
                     return;
                  }

                  var10 = var11.charAt(var16);
                  break;
               default:
                  var8[var12++] = var39;
                  if ((var16 += var10) < var13) {
                     var10 = var11.charAt(var16);
                     continue label61;
                  }

                  var11 = "SM\u001c\u0005>S\u0003_M\u0015";
                  var13 = "SM\u001c\u0005>S\u0003_M\u0015".length();
                  var10 = 6;
                  var16 = -1;
            }

            var10000 = 76;
            var10001 = var11.substring(++var16, var16 + var10);
            var10002 = 0;
         }
      }
   }
}







