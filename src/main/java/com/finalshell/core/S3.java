package com.finalshell.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class S3 {
   public static Et2[] D;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   @NotNull
   public XF3 Y(@NotNull Et2 var1) {
      String var2 = SelectUploadFile.r$String();
      Et2 var10000 = var1;
      if (var2 == null) {
         if (var1.h()) {
            int var3 = var1.q();
            this.Z(var3);
            return this.S(var3);
         }

         var10000 = var1;
      }

      return var10000.d();
   }

   @NotNull
   public abstract XF3 S(int var1);

   @NotNull
   public XF3 o(@NotNull Et2 var1) {
      String var2 = SelectUploadFile.r$String();
      Et2 var10000 = var1;
      if (var2 == null) {
         if (var1.h()) {
            int var3 = var1.q();
            this.Z(var3);
            return this.L(var3);
         }

         var10000 = var1;
      }

      return var10000.d();
   }

   @NotNull
   protected abstract XF3 L(int var1);

   public void Z(int var1) {
      String var2 = SelectUploadFile.r$String();
      int var10000 = var1;
      if (var2 == null) {
         if (var1 < 0) {
            throw new AssertionError(a + var1);
         }

         var10000 = var1;
      }

      if (var10000 >= a(6425, 8994121948444966418L)) {
         throw new AssertionError(a + var1);
      }
   }

   @Nullable
   public static Et2 M(int var0) {
      String var1 = SelectUploadFile.r$String();
      int var10000 = var0;
      if (var1 == null) {
         if (var0 < a(30551, 2287280385520521310L)) {
            return Et2.W(var0);
         }

         var10000 = var0;
      }

      return l(var10000);
   }

   @Nullable
   public static Et2 l(int var0) {
      return var0 < a(23908, 3995138339151247969L) ? D[var0 - a(30551, 2287280385520521310L)] : null;
   }

   public static int V(int var0) {
      return var0 == 0 ? 0 : a(27261, 8732011136451792247L) * var0 + a(16559, 4317665702556362657L);
   }

   public XF3 Q(Et2 var1) {
      String var2 = SelectUploadFile.r$String();
      Et2 var10000 = var1;
      if (var2 == null) {
         if (var1.h()) {
            return D[var1.q()].d();
         }

         var10000 = var1;
      }

      return var10000.d();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9996;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u000b';_]\u0011b&,2H\u000fXxh'\"D\u000f^mh*8EAUxh\u0013g\u001c\u001e\u0004Vrh".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var44 = 14;
      char[] var10002 = var10003;
      int var29 = var10004;
      char[] var52;
      byte var60;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var52 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 14;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var60 = 70;
               break;
            case 1:
               var60 = 70;
               break;
            case 2:
               var60 = 89;
               break;
            case 3:
               var60 = 62;
               break;
            case 4:
               var60 = 33;
               break;
            case 5:
               var60 = 63;
               break;
            default:
               var60 = 5;
         }
      } else {
         var44 = 14;
         var29 = var10004;
         if (var10004 <= var8) {
            String var49 = new String(var10003).intern();
            int var35 = -1;
            a = var49;
            long var12 = 6314418097515618664L;
            long[] var17 = new long[13];
            int var14 = 0;
            String var15 = "*\u0091Õ\u00122\u001a7ÜÉ¨ô6\u009dF£ûÛx7\rju\u0006þ°·Ð[\u000fY\u00129'.=ñ\u0091¯¬ã£};\u0096\u0091\u001c1&¶` ;»A¬7\u0005Ôáoª,_jü\u0010uGûô\u0000×\u0006m\u0085î\f\u0010\u001a\t\u0016qüÏìá¡$";
            int var16 = "*\u0091Õ\u00122\u001a7ÜÉ¨ô6\u009dF£ûÛx7\rju\u0006þ°·Ð[\u000fY\u00129'.=ñ\u0091¯¬ã£};\u0096\u0091\u001c1&¶` ;»A¬7\u0005Ôáoª,_jü\u0010uGûô\u0000×\u0006m\u0085î\f\u0010\u001a\t\u0016qüÏìá¡$"
               .length();
            byte var13 = 0;

            label106:
            while (true) {
               var35 = var13;
               var13 += 8;
               byte[] var19 = var15.substring(var35, var13).getBytes("ISO-8859-1");
               long[] var28 = var17;
               var35 = var14++;
               long var42 = ((long)var19[0] & 255L) << 56
                  | ((long)var19[1] & 255L) << 48
                  | ((long)var19[2] & 255L) << 40
                  | ((long)var19[3] & 255L) << 32
                  | ((long)var19[4] & 255L) << 24
                  | ((long)var19[5] & 255L) << 16
                  | ((long)var19[6] & 255L) << 8
                  | (long)var19[7] & 255L;
               byte var50 = -1;

               while (true) {
                  long var58 = var42 ^ var12;
                  switch (var50) {
                     case 0:
                        var28[var35] = var58;
                        if (var13 >= var16) {
                           b = var17;
                           c = new Integer[13];
                           D = new Et2[a(9906, 3945939133176545717L)];

                           for (int var22 = 0; var22 < a(21592, 4906348142446670679L); var22++) {
                              for (int var25 = 0; var25 < a(15982, 5993683201326356846L); var25++) {
                                 for (int var27 = 0; var27 < a(15982, 5993683201326356846L); var27++) {
                                    D[a(27303, 1413575684069576111L) * var22 + a(15982, 5993683201326356846L) * var25 + var27] = new Et2(
                                       V(var22), V(var25), V(var27)
                                    );
                                 }
                              }
                           }

                           for (int var23 = 0; var23 < a(18083, 4114580108554232231L); var23++) {
                              int var26 = a(26432, 2777632759011000390L) * var23 + a(26006, 8558524643293643419L);
                              D[a(29024, 6442320397456987756L) + var23] = new Et2(var26, var26, var26);
                           }

                           return;
                        }
                        break;
                     default:
                        var28[var35] = var58;
                        if (var13 < var16) {
                           continue label106;
                        }

                        var15 = "Ð$E^Ãú`-U[ëMnÿø\u0000";
                        var16 = "Ð$E^Ãú`-U[ëMnÿø\u0000".length();
                        var13 = 0;
                  }

                  byte var38 = var13;
                  var13 += 8;
                  var19 = var15.substring(var38, var13).getBytes("ISO-8859-1");
                  var28 = var17;
                  var35 = var14++;
                  var42 = ((long)var19[0] & 255L) << 56
                     | ((long)var19[1] & 255L) << 48
                     | ((long)var19[2] & 255L) << 40
                     | ((long)var19[3] & 255L) << 32
                     | ((long)var19[4] & 255L) << 24
                     | ((long)var19[5] & 255L) << 16
                     | ((long)var19[6] & 255L) << 8
                     | (long)var19[7] & 255L;
                  var50 = 0;
               }
            }
         }

         var52 = var10003;
         var10005 = var8;
         char var61 = var10003[var8];
         var10007 = 14;
         var10006 = var61;
         switch (var8 % 7) {
            case 0:
               var60 = 70;
               break;
            case 1:
               var60 = 70;
               break;
            case 2:
               var60 = 89;
               break;
            case 3:
               var60 = 62;
               break;
            case 4:
               var60 = 33;
               break;
            case 5:
               var60 = 63;
               break;
            default:
               var60 = 5;
         }
      }

      while (true) {
         var52[var10005] = (char)(var10006 ^ var10007 ^ var60);
         var8++;
         if (var44 == 0) {
            var52 = var10002;
            var10005 = var44;
            char var63 = var10002[var44];
            var10007 = var44;
            var10006 = var63;
            switch (var8 % 7) {
               case 0:
                  var60 = 70;
                  break;
               case 1:
                  var60 = 70;
                  break;
               case 2:
                  var60 = 89;
                  break;
               case 3:
                  var60 = 62;
                  break;
               case 4:
                  var60 = 33;
                  break;
               case 5:
                  var60 = 63;
                  break;
               default:
                  var60 = 5;
            }
         } else {
            if (var29 <= var8) {
               String var46 = new String(var10002).intern();
               int var31 = -1;
               a = var46;
               long var0 = 6314418097515618664L;
               long[] var6 = new long[13];
               int var3 = 0;
               String var4 = "*\u0091Õ\u00122\u001a7ÜÉ¨ô6\u009dF£ûÛx7\rju\u0006þ°·Ð[\u000fY\u00129'.=ñ\u0091¯¬ã£};\u0096\u0091\u001c1&¶` ;»A¬7\u0005Ôáoª,_jü\u0010uGûô\u0000×\u0006m\u0085î\f\u0010\u001a\t\u0016qüÏìá¡$";
               int var5 = "*\u0091Õ\u00122\u001a7ÜÉ¨ô6\u009dF£ûÛx7\rju\u0006þ°·Ð[\u000fY\u00129'.=ñ\u0091¯¬ã£};\u0096\u0091\u001c1&¶` ;»A¬7\u0005Ôáoª,_jü\u0010uGûô\u0000×\u0006m\u0085î\f\u0010\u001a\t\u0016qüÏìá¡$"
                  .length();
               byte var2 = 0;

               label72:
               while (true) {
                  var31 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var31 = var3++;
                  long var40 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var47 = -1;

                  while (true) {
                     long var56 = var40 ^ var0;
                     switch (var47) {
                        case 0:
                           var10000[var31] = var56;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[13];
                              D = new Et2[a(9906, 3945939133176545717L)];

                              for (int var9 = 0; var9 < a(21592, 4906348142446670679L); var9++) {
                                 for (int var10 = 0; var10 < a(15982, 5993683201326356846L); var10++) {
                                    for (int var11 = 0; var11 < a(15982, 5993683201326356846L); var11++) {
                                       D[a(27303, 1413575684069576111L) * var9 + a(15982, 5993683201326356846L) * var10 + var11] = new Et2(
                                          V(var9), V(var10), V(var11)
                                       );
                                    }
                                 }
                              }

                              for (int var21 = 0; var21 < a(18083, 4114580108554232231L); var21++) {
                                 int var24 = a(26432, 2777632759011000390L) * var21 + a(26006, 8558524643293643419L);
                                 D[a(29024, 6442320397456987756L) + var21] = new Et2(var24, var24, var24);
                              }

                              return;
                           }
                           break;
                        default:
                           var10000[var31] = var56;
                           if (var2 < var5) {
                              continue label72;
                           }

                           var4 = "Ð$E^Ãú`-U[ëMnÿø\u0000";
                           var5 = "Ð$E^Ãú`-U[ëMnÿø\u0000".length();
                           var2 = 0;
                     }

                     byte var34 = var2;
                     var2 += 8;
                     var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var31 = var3++;
                     var40 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var47 = 0;
                  }
               }
            }

            var52 = var10002;
            var10005 = var8;
            char var62 = var10002[var8];
            var10007 = var44;
            var10006 = var62;
            switch (var8 % 7) {
               case 0:
                  var60 = 70;
                  break;
               case 1:
                  var60 = 70;
                  break;
               case 2:
                  var60 = 89;
                  break;
               case 3:
                  var60 = 62;
                  break;
               case 4:
                  var60 = 33;
                  break;
               case 5:
                  var60 = 63;
                  break;
               default:
                  var60 = 5;
            }
         }
      }
   }
}





