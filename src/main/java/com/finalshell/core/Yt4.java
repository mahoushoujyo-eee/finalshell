package com.finalshell.core;

import java.awt.Rectangle;

public class Yt4 extends GT3 {
   public int d = a(11538, 9218321204936118557L);
   public int Z = a(28495, 2759282764091216711L);
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void d(int var1) {
      this.d = var1;
   }

   public int T() {
      return this.d;
   }

   public void j(int var1) {
      this.Z = var1;
   }

   public int w() {
      return this.Z;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var38;
      int var6 = 0;
      String[] var10000 = W5.q();
      int[] var7 = new int[this.Z];
      String[] var5 = var10000;
      int[] var8 = new int[this.Z];
      int[] var9 = new int[this.Z];
      int[] var10 = new int[this.Z];
      int[] var11 = new int[this.Z];
      int[] var12 = new int[this.Z];
      int[] var13 = new int[var1 * var2];
      int var14 = 0;

      label152:
      while (true) {
         int var33 = var14;

         label150:
         while (var33 < var2) {
            int var15 = 0;

            label147:
            do {
               int var34 = var15;
               int var10001 = var1;

               label144:
               while (true) {
                  if (var34 >= var10001) {
                     break label147;
                  }

                  var33 = 0;
                  if (var5 == null) {
                     continue label150;
                  }

                  int var16 = 0;

                  label102: {
                     while (var16 < this.Z) {
                        var7[var16] = var8[var16] = var9[var16] = var10[var16] = var11[var16] = var12[var16] = 0;
                        var16++;
                        if (var5 == null) {
                           break label102;
                        }

                        if (var5 == null) {
                           break;
                        }
                     }

                     var16 = -this.d;
                  }

                  while (true) {
                     int var35 = var16;
                     var10001 = this.d;

                     label139: {
                        label138:
                        while (true) {
                           if (var35 > var10001) {
                              break label144;
                           }

                           int var17 = var14 + var16;
                           if (var5 == null) {
                              break label139;
                           }

                           var34 = 0;
                           var10001 = var17;
                           if (var5 == null) {
                              continue label144;
                           }

                           if (0 > var17) {
                              break;
                           }

                           int var36 = var17;
                           var10001 = var2;
                           if (var5 != null) {
                              if (var17 >= var2) {
                                 break;
                              }

                              var36 = var17;
                              var10001 = var1;
                           }

                           int var18 = var36 * var10001;
                           int var19 = -this.d;

                           while (true) {
                              if (var19 > this.d) {
                                 break label138;
                              }

                              int var20 = var15 + var19;
                              if (var5 != null) {
                                 var35 = 0;
                                 var10001 = var20;
                                 if (var5 == null) {
                                    break;
                                 }

                                 label129:
                                 if (0 <= var20) {
                                    int var37 = var20;
                                    if (var5 != null) {
                                       if (var20 >= var1) {
                                          break label129;
                                       }

                                       var37 = var3[var18 + var20];
                                    }

                                    int var21 = var37;
                                    int var22 = var21 >> a(1839, 5262096649473440553L) & a(22263, 3644729440534391547L);
                                    int var23 = var21 >> a(4644, 6118850585262272042L) & a(13526, 8263535639976446173L);
                                    int var24 = var21 & a(13526, 8263535639976446173L);
                                    int var25 = var22 * this.Z / a(5340, 376458099008776411L);
                                    int var26 = var23 * this.Z / a(28495, 2759282764091216711L);
                                    int var27 = var24 * this.Z / a(28495, 2759282764091216711L);
                                    var10[var25] += var22;
                                    var11[var26] += var23;
                                    var12[var27] += var24;
                                    var7[var25]++;
                                    var8[var26]++;
                                    var9[var27]++;
                                 }

                                 var19++;
                              }

                              if (var5 == null) {
                                 break label138;
                              }
                           }
                        }

                        var16++;
                     }

                     if (var5 == null) {
                        break label144;
                     }
                  }
               }

               int var28 = 0;
               int var29 = 0;
               int var30 = 0;
               int var32 = 1;

               while (true) {
                  if (var32 < this.Z) {
                     var38 = var7[var32];
                     var10001 = var7[var28];
                     if (var5 == null) {
                        break;
                     }

                     if (var5 != null) {
                        if (var38 > var10001) {
                           var28 = var32;
                        }

                        var38 = var8[var32];
                        var10001 = var8[var29];
                     }

                     label86: {
                        label166: {
                           if (var5 != null) {
                              if (var38 > var10001) {
                                 var29 = var32;
                              }

                              var38 = var9[var32];
                              if (var5 == null) {
                                 break label166;
                              }

                              var10001 = var9[var30];
                           }

                           if (var38 <= var10001) {
                              break label86;
                           }

                           var38 = var32;
                        }

                        var30 = var38;
                     }

                     var32++;
                     if (var5 != null) {
                        continue;
                     }
                  }

                  var28 = var10[var28] / var7[var28];
                  var29 = var11[var29] / var8[var29];
                  var38 = var12[var30];
                  var10001 = var9[var30];
                  break;
               }

               var30 = var38 / var10001;
               var13[var6] = var3[var6] & a(4881, 3247092140328595227L)
                  | var28 << a(25071, 4713487202196119014L)
                  | var29 << a(26833, 3411551053453219036L)
                  | var30;
               var6++;
               var15++;
            } while (var5 != null);

            var14++;
            if (var5 == null) {
               return var13;
            }
            continue label152;
         }

         return var13;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15374;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u000fu\u0017\u0014h\u0006\u0011sN\u0007\u0014/RZ".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 83;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 83;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 15;
               break;
            case 1:
               var50 = 82;
               break;
            case 2:
               var50 = 61;
               break;
            case 3:
               var50 = 43;
               break;
            case 4:
               var50 = 82;
               break;
            case 5:
               var50 = 47;
               break;
            default:
               var50 = 39;
         }
      } else {
         var34 = 83;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 5606828744342108893L;
            long[] var14 = new long[10];
            int var11 = 0;
            String var12 = "ùÉ\u0084\u008fVÊTÿ\u0000Ñýêë^ëÃ~®\u000eeó\u0080\u0010Ù\u008b\u0001Ú%ÄÅ®\têè.Ó\u0090ÊUÆ¥æ\u0097Ì\u008ffrÿMöÁÌ\u009av(\u009a\u0084¦GÏBÊ'+";
            int var13 = "ùÉ\u0084\u008fVÊTÿ\u0000Ñýêë^ëÃ~®\u000eeó\u0080\u0010Ù\u008b\u0001Ú%ÄÅ®\têè.Ó\u0090ÊUÆ¥æ\u0097Ì\u008ffrÿMöÁÌ\u009av(\u009a\u0084¦GÏBÊ'+"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[10];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "¢\u001bc¸»VÁä>e'MæÉS\u0006";
                        var13 = "¢\u001bc¸»VÁä>e'MæÉS\u0006".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 83;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 15;
               break;
            case 1:
               var50 = 82;
               break;
            case 2:
               var50 = 61;
               break;
            case 3:
               var50 = 43;
               break;
            case 4:
               var50 = 82;
               break;
            case 5:
               var50 = 47;
               break;
            default:
               var50 = 39;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 15;
                  break;
               case 1:
                  var50 = 82;
                  break;
               case 2:
                  var50 = 61;
                  break;
               case 3:
                  var50 = 43;
                  break;
               case 4:
                  var50 = 82;
                  break;
               case 5:
                  var50 = 47;
                  break;
               default:
                  var50 = 39;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 5606828744342108893L;
               long[] var6 = new long[10];
               int var3 = 0;
               String var4 = "ùÉ\u0084\u008fVÊTÿ\u0000Ñýêë^ëÃ~®\u000eeó\u0080\u0010Ù\u008b\u0001Ú%ÄÅ®\têè.Ó\u0090ÊUÆ¥æ\u0097Ì\u008ffrÿMöÁÌ\u009av(\u009a\u0084¦GÏBÊ'+";
               int var5 = "ùÉ\u0084\u008fVÊTÿ\u0000Ñýêë^ëÃ~®\u000eeó\u0080\u0010Ù\u008b\u0001Ú%ÄÅ®\têè.Ó\u0090ÊUÆ¥æ\u0097Ì\u008ffrÿMöÁÌ\u009av(\u009a\u0084¦GÏBÊ'+"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[10];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "¢\u001bc¸»VÁä>e'MæÉS\u0006";
                           var5 = "¢\u001bc¸»VÁä>e'MæÉS\u0006".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 15;
                  break;
               case 1:
                  var50 = 82;
                  break;
               case 2:
                  var50 = 61;
                  break;
               case 3:
                  var50 = 43;
                  break;
               case 4:
                  var50 = 82;
                  break;
               case 5:
                  var50 = 47;
                  break;
               default:
                  var50 = 39;
            }
         }
      }
   }
}





