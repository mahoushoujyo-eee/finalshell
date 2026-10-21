package com.finalshell.core;

import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class G92 extends W5 {
   public int U = a(24448, 2388445989474267479L);
   public int G = a(15327, 4336918093062542595L);
   public int M = a(13037, 876893889398185014L);
   public static String a;
   public static long[] b;
   public static Integer[] c;

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4;
      int var5;
      label13: {
         String[] var10000 = W5.q();
         var4 = var1.getWidth();
         String[] var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var9 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label13;
            }

            var9 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var9;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      this.l(var1, 0, 0, var4, var5, var6);
      Kernel var8 = HX3.n((float)this.U);
      this.G(var8, var6, var7, var4, var5, true);
      this.G(var8, var7, var6, var5, var4, true);
      this.E(var2, 0, 0, var4, var5, var6);
      return var2;
   }

   public void G(Kernel var1, int[] var2, int[] var3, int var4, int var5, boolean var6) {
      boolean var8 = false;
      float[] var9 = var1.getKernelData(null);
      int var10 = var1.getWidth();
      int var11 = var10 / 2;
      String[] var10000 = W5.q();
      int var12 = 0;
      String[] var7 = var10000;

      label177:
      while (true) {
         int var47 = var12;

         label175:
         while (var47 < var5) {
            int var13 = var12 * var4;
            int var14 = var12;
            int var15 = 0;

            while (var15 < var4) {
               float var16 = 0.0F;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;
               int var20 = var11;
               int var21 = var2[var13 + var15];
               int var22 = var21 >> a(32496, 4715036468167790634L) & a(18815, 3460302960543066023L);
               int var23 = var21 >> a(7624, 8204524946981565207L) & a(9097, 1909565566546709844L);
               int var24 = var21 >> a(23209, 817311701487350896L) & a(9097, 1909565566546709844L);
               int var25 = var21 & a(9097, 1909565566546709844L);
               float var26 = 0.0F;
               float var27 = 0.0F;
               float var28 = 0.0F;
               float var29 = 0.0F;
               var47 = -var11;
               if (var7 == null) {
                  continue label175;
               }

               int var30 = var47;

               label169: {
                  float var61;
                  label183: {
                     while (true) {
                        if (var30 <= var11) {
                           float var31 = var9[var20 + var30];
                           label124:
                           if (var7 != null) {
                              float var65;
                              var48 = (var65 = var31 - 0.0F) == 0.0F ? 0 : (var65 < 0.0F ? -1 : 1);
                              if (var7 == null) {
                                 break;
                              }

                              if (var48) {
                                 label159: {
                                    int var32;
                                    label158: {
                                       var32 = var15 + var30;
                                       int var49 = 0;
                                       if (var7 != null) {
                                          if (0 <= var32) {
      int var50;
                                             var50 = var32;
                                             if (var7 == null) {
                                                break label159;
                                             }

                                             if (var32 < var4) {
      int var51;
                                                break label158;
                                             }
                                          }

                                          var49 = var15;
                                       }

                                       var32 = var49;
                                    }

                                    var50 = var2[var13 + var32];
                                 }

                                 int var35;
                                 int var36;
                                 int var37;
                                 int var38;
                                 int var33 = var50;
                                 int var34 = var33 >> a(11553, 5805021254738871284L) & a(9097, 1909565566546709844L);
                                 var35 = var33 >> a(5282, 8287148059014707836L) & a(9097, 1909565566546709844L);
                                 var36 = var33 >> a(15946, 1653621194678440092L) & a(9097, 1909565566546709844L);
                                 var37 = var33 & a(9097, 1909565566546709844L);
                                 var38 = var22 - var34;
                                 var51 = var38;
                                 var10001 = -this.M;
                                 label147:
                                 if (var7 != null) {
                                    if (var38 >= var10001) {
                                       var51 = var38;
                                       var10001 = this.M;
                                       if (var7 == null) {
                                          break label147;
                                       }

                                       if (var38 <= this.M) {
                                          var19 += var31 * (float)var34;
                                          var26 += var31;
                                       }
                                    }

                                    var38 = var23 - var35;
                                    var51 = var38;
                                    var10001 = -this.M;
                                 }

                                 label139:
                                 if (var7 != null) {
                                    if (var51 >= var10001) {
      int var51;
      int var51;
                                       var51 = var38;
                                       var10001 = this.M;
                                       if (var7 == null) {
                                          break label139;
                                       }

                                       if (var38 <= this.M) {
                                          var16 += var31 * (float)var35;
                                          var27 += var31;
                                       }
                                    }

                                    var38 = var24 - var36;
                                    var51 = var38;
                                    var10001 = -this.M;
                                 }

                                 label131:
                                 if (var7 != null) {
                                    if (var51 >= var10001) {
                                       var51 = var38;
                                       var10001 = this.M;
                                       if (var7 == null) {
                                          break label131;
                                       }

                                       if (var38 <= this.M) {
                                          var17 += var31 * (float)var36;
                                          var28 += var31;
                                       }
                                    }

                                    var38 = var25 - var37;
                                    if (var7 == null) {
                                       break label124;
                                    }

                                    var51 = var38;
                                    var10001 = -this.M;
                                 }

                                 if (var51 >= var10001 && var38 <= this.M) {
                                    var18 += var31 * (float)var37;
                                    var29 += var31;
                                 }
                              }

                              var30++;
                           }

                           if (var7 != null) {
                              continue;
                           }
                        }

                        var52 = var26;
                        var61 = 0.0F;
                        if (var7 == null) {
                           break label183;
                        }

                        float var66;
                        var48 = (var66 = var26 - 0.0F) == 0.0F ? 0 : (var66 < 0.0F ? -1 : 1);
                        break;
                     }

                     if (!var48) {
                        var53 = (float)var22;
                        break label169;
                     }

                     var52 = var19;
                     var61 = var26;
                  }

                  var53 = var52 / var61;
               }

               label110: {
                  var19 = var53;
                  float var54 = var27;
                  float var62 = 0.0F;
                  if (var7 != null) {
                     if (var27 == 0.0F) {
                        var55 = (float)var23;
                        break label110;
                     }

                     var54 = var16;
                     var62 = var27;
                  }

                  var55 = var54 / var62;
               }

               label104: {
                  var16 = var55;
                  float var56 = var28;
                  float var63 = 0.0F;
                  if (var7 != null) {
                     if (var28 == 0.0F) {
                        var57 = (float)var24;
                        break label104;
                     }

                     var56 = var17;
                     var63 = var28;
                  }

                  var57 = var56 / var63;
               }

               label98: {
                  var17 = var57;
                  float var58 = var29;
                  float var64 = 0.0F;
                  if (var7 != null) {
                     if (var29 == 0.0F) {
                        var59 = (float)var25;
                        break label98;
                     }

                     var58 = var18;
                     var64 = var29;
                  }

                  var59 = var58 / var64;
               }

               var18 = ((((var59) ? 1 : 0) ? 1 : 0) ? 1 : 0) ? 1 : 0;
               int var60 = var6;
               if (var7 != null) {
                  var60 = var6 != 0 ? Iw4.e((int)((double)var19 + 0.5)) : a(9097, 1909565566546709844L);
               }

               var30 = var60;
               int var44 = Iw4.e((int)((double)var16 + 0.5));
               int var45 = Iw4.e((int)((double)var17 + 0.5));
               int var46 = Iw4.e((int)((double)var18 + 0.5));
               var3[var14] = var30 << a(11553, 5805021254738871284L) | var44 << a(5282, 8287148059014707836L) | var45 << a(15946, 1653621194678440092L) | var46;
               var14 += var5;
               var15++;
               if (var7 == null) {
                  break;
               }
            }

            var12++;
            if (var7 == null) {
               return;
            }
            continue label177;
         }

         return;
      }
   }

   public void G(int var1) {
      this.U = var1;
   }

   public int D() {
      return this.U;
   }

   public void W(int var1) {
      this.G = var1;
   }

   public int k() {
      return this.G;
   }

   public void k(int var1) {
      this.U = this.G = var1;
   }

   public int j() {
      return this.U;
   }

   public void p(int var1) {
      this.M = var1;
   }

   public int g() {
      return this.M;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11999;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "o3\u0005z2,,L-\u0004(_\u00134_q^&".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 111;
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
         var10007 = 111;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 66;
               break;
            case 1:
               var50 = 48;
               break;
            case 2:
               var50 = 31;
               break;
            case 3:
               var50 = 103;
               break;
            case 4:
               var50 = 114;
               break;
            case 5:
               var50 = 16;
               break;
            default:
               var50 = 46;
         }
      } else {
         var34 = 111;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 464107852149898995L;
            long[] var14 = new long[11];
            int var11 = 0;
            String var12 = "\u00ad·\u008d´·w\u008dô\u0096\u0006»¾R~\u0084\u009f*ÅæO\u0005\u0088³Xj\u009b36ä(+õt\u000e¬©_\u0097\"Ïz¥¨uLúnÁ\u0016Î\u008e©u1J\u008b¼\u009dx\tz»Ù«\u001a\u0080yíÿ\fÏ¡";
            int var13 = "\u00ad·\u008d´·w\u008dô\u0096\u0006»¾R~\u0084\u009f*ÅæO\u0005\u0088³Xj\u009b36ä(+õt\u000e¬©_\u0097\"Ïz¥¨uLúnÁ\u0016Î\u008e©u1J\u008b¼\u009dx\tz»Ù«\u001a\u0080yíÿ\fÏ¡"
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
                           c = new Integer[11];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0083\u0000':í\u0000®g§\u001fÕ#Ú\u0090½\u001f";
                        var13 = "\u0083\u0000':í\u0000®g§\u001fÕ#Ú\u0090½\u001f".length();
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
         var10007 = 111;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 66;
               break;
            case 1:
               var50 = 48;
               break;
            case 2:
               var50 = 31;
               break;
            case 3:
               var50 = 103;
               break;
            case 4:
               var50 = 114;
               break;
            case 5:
               var50 = 16;
               break;
            default:
               var50 = 46;
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
                  var50 = 66;
                  break;
               case 1:
                  var50 = 48;
                  break;
               case 2:
                  var50 = 31;
                  break;
               case 3:
                  var50 = 103;
                  break;
               case 4:
                  var50 = 114;
                  break;
               case 5:
                  var50 = 16;
                  break;
               default:
                  var50 = 46;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 464107852149898995L;
               long[] var6 = new long[11];
               int var3 = 0;
               String var4 = "\u00ad·\u008d´·w\u008dô\u0096\u0006»¾R~\u0084\u009f*ÅæO\u0005\u0088³Xj\u009b36ä(+õt\u000e¬©_\u0097\"Ïz¥¨uLúnÁ\u0016Î\u008e©u1J\u008b¼\u009dx\tz»Ù«\u001a\u0080yíÿ\fÏ¡";
               int var5 = "\u00ad·\u008d´·w\u008dô\u0096\u0006»¾R~\u0084\u009f*ÅæO\u0005\u0088³Xj\u009b36ä(+õt\u000e¬©_\u0097\"Ïz¥¨uLúnÁ\u0016Î\u008e©u1J\u008b¼\u009dx\tz»Ù«\u001a\u0080yíÿ\fÏ¡"
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
                              c = new Integer[11];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0083\u0000':í\u0000®g§\u001fÕ#Ú\u0090½\u001f";
                           var5 = "\u0083\u0000':í\u0000®g§\u001fÕ#Ú\u0090½\u001f".length();
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
                  var50 = 66;
                  break;
               case 1:
                  var50 = 48;
                  break;
               case 2:
                  var50 = 31;
                  break;
               case 3:
                  var50 = 103;
                  break;
               case 4:
                  var50 = 114;
                  break;
               case 5:
                  var50 = 16;
                  break;
               default:
                  var50 = 46;
            }
         }
      }
   }
}






