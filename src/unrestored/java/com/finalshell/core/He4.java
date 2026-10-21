package com.finalshell.core;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class He4 extends W5 {
   public float x = 1.0F;
   public float N = 2.0F;
   public boolean c = true;
   public boolean S;
   public static String a;
   public static long[] b;
   public static Integer[] d;

   public void H(float var1) {
      this.x = var1;
   }

   public float M() {
      return this.x;
   }

   public void U(float var1) {
      this.N = var1;
   }

   public float Y() {
      return this.N;
   }

   public void U(boolean var1) {
      this.c = var1;
   }

   public boolean C() {
      return this.c;
   }

   public void c(boolean var1) {
      this.S = var1;
   }

   public boolean t() {
      return this.S;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var28;
      BufferedImage var7;
      int var26;
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      BufferedImage var6 = new Hv4(this.x, this.x, 3).filter(var1, null);
      String[] var10000 = W5.q();
      var7 = new Hv4(this.N, this.N, 3).filter(var1, null);
      String[] var3 = var10000;
      Graphics2D var8 = var7.createGraphics();
      var8.setComposite(new ZZ(1.0F));
      var8.drawImage(var6, 0, 0, null);
      var8.dispose();
      var26 = (this.c) ? 1 : 0;
      label109:
      if (var3 != null) {
         if (this.c) {
            float var29;
            var26 = (var29 = this.x - this.N) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
            if (var3 == null) {
               break label109;
            }

            if (var26 != 0) {
               int[] var9 = null;
               int var10 = 0;
               int var11 = 0;

               label102: {
                  label101:
                  while (true) {
                     var26 = var11;
                     int var10001 = var5;

                     label99:
                     while (true) {
                        if (var26 >= var10001) {
                           break label101;
                        }

                        var9 = this.l(var7, 0, var11, var4, 1, var9);
                        var28 = 0;
                        if (var3 == null) {
                           break label102;
                        }

                        int var12 = 0;

                        while (var12 < var4) {
                           int var13 = var9[var12];
                           int var14 = var13 >> a(25863, 4883882624508762582L) & a(19957, 8833851932250779936L);
                           int var15 = var13 >> a(17226, 6882561002739351452L) & a(26900, 148677007791789508L);
                           int var16 = var13 & a(26900, 148677007791789508L);
                           var26 = var14;
                           var10001 = var10;
                           if (var3 == null) {
                              continue label99;
                           }

                           if (var3 != null) {
                              if (var14 > var10) {
                                 var10 = var14;
                              }

                              var26 = var15;
                              var10001 = var10;
                           }

                           label93: {
                              label115: {
                                 if (var3 != null) {
                                    if (var26 > var10001) {
                                       var10 = var15;
                                    }

                                    var26 = var16;
                                    if (var3 == null) {
                                       break label115;
                                    }

                                    var10001 = var10;
                                 }

                                 if (var26 <= var10001) {
                                    break label93;
                                 }

                                 var26 = var16;
                              }

                              var10 = var26;
                           }

                           var12++;
                           if (var3 == null) {
                              break;
                           }
                        }

                        var11++;
                        if (var3 == null) {
                           break label101;
                        }
                        break;
                     }
                  }

                  var28 = 0;
               }

               var11 = var28;

               while (var11 < var5) {
                  var9 = this.l(var7, 0, var11, var4, 1, var9);
                  var26 = 0;
                  if (var3 == null) {
                     break label109;
                  }

                  int var18 = 0;

                  label65: {
                     while (var18 < var4) {
                        int var19 = var9[var18];
                        int var20 = var19 >> a(29190, 7271435517217607381L) & a(26900, 148677007791789508L);
                        int var22 = var19 >> a(29584, 7649389514892480327L) & a(26900, 148677007791789508L);
                        int var24 = var19 & a(26900, 148677007791789508L);
                        var20 = var20 * a(26900, 148677007791789508L) / var10;
                        var22 = var22 * a(26900, 148677007791789508L) / var10;
                        var24 = var24 * a(26900, 148677007791789508L) / var10;
                        var9[var18] = var19 & a(28078, 5042850219683320186L)
                           | var20 << a(29190, 7271435517217607381L)
                           | var22 << a(29584, 7649389514892480327L)
                           | var24;
                        var18++;
                        if (var3 == null) {
                           break label65;
                        }

                        if (var3 == null) {
                           break;
                        }
                     }

                     this.E(var7, 0, var11, var4, 1, var9);
                     var11++;
                  }

                  if (var3 == null) {
                     break;
                  }
               }
            }
         }

         var26 = (this.S) ? 1 : 0;
      }

      if (var26 != 0) {
         var7 = new Hl4().filter(var7, var7);
      }

      return var7;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31957;
      if (d[var3] == null) {
         d[var3] = (int)(b[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      byte var28;
      char[] var10003 = "+q]\u0018Lvk\u0007s\\\u0018M<A\rp\u001a\u0012Yyh\u000f`I\u000eV8A\u001d;\u0014S".toCharArray();
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
               var50 = 1;
               break;
            case 1:
               var50 = 122;
               break;
            case 2:
               var50 = 85;
               break;
            case 3:
               var50 = 18;
               break;
            case 4:
               var50 = 80;
               break;
            case 5:
               var50 = 54;
               break;
            default:
               var50 = 64;
         }
      } else {
         var34 = 111;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 1059035424258658681L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "ÃÜæ7/J ¦ëÏÔÇûÇ\u0080\u0003Ë5ø#4½\u009e6 a\u0016K:B.í=²ð\n\u0085ò\b¿";
            int var13 = "ÃÜæ7/J ¦ëÏÔÇûÇ\u0080\u0003Ë5ø#4½\u009e6 a\u0016K:B.í=²ð\n\u0085ò\b¿".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                           d = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0019Â\u009fæ\u0010Ì\u0084BhÞC¥¹\u0094\u001f¼";
                        var13 = "\u0019Â\u009fæ\u0010Ì\u0084BhÞC¥¹\u0094\u001f¼".length();
                        var10 = 0;
                  }

                  var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
               var50 = 1;
               break;
            case 1:
               var50 = 122;
               break;
            case 2:
               var50 = 85;
               break;
            case 3:
               var50 = 18;
               break;
            case 4:
               var50 = 80;
               break;
            case 5:
               var50 = 54;
               break;
            default:
               var50 = 64;
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
                  var50 = 1;
                  break;
               case 1:
                  var50 = 122;
                  break;
               case 2:
                  var50 = 85;
                  break;
               case 3:
                  var50 = 18;
                  break;
               case 4:
                  var50 = 80;
                  break;
               case 5:
                  var50 = 54;
                  break;
               default:
                  var50 = 64;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 1059035424258658681L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "ÃÜæ7/J ¦ëÏÔÇûÇ\u0080\u0003Ë5ø#4½\u009e6 a\u0016K:B.í=²ð\n\u0085ò\b¿";
               int var5 = "ÃÜæ7/J ¦ëÏÔÇûÇ\u0080\u0003Ë5ø#4½\u009e6 a\u0016K:B.í=²ð\n\u0085ò\b¿".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                              d = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0019Â\u009fæ\u0010Ì\u0084BhÞC¥¹\u0094\u001f¼";
                           var5 = "\u0019Â\u009fæ\u0010Ì\u0084BhÞC¥¹\u0094\u001f¼".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                  var50 = 1;
                  break;
               case 1:
                  var50 = 122;
                  break;
               case 2:
                  var50 = 85;
                  break;
               case 3:
                  var50 = 18;
                  break;
               case 4:
                  var50 = 80;
                  break;
               case 5:
                  var50 = 54;
                  break;
               default:
                  var50 = 64;
            }
         }
      }
   }
}





