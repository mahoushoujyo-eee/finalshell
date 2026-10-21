package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Hr4 extends W5 {
   private static int[] var37;
   public float j = 1.0F;
   public int s = a(28185, 5819506735466313009L);
   public float g = 0.0F;
   public float A = 0.1F;
   public boolean t = false;
   public Po2 U = new WY3(-1, a(15341, 8213060126446231745L));
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void V(float var1) {
      this.j = var1;
   }

   public float x() {
      return this.j;
   }

   public void E(float var1) {
      this.A = var1;
   }

   public float I$float() {
      return this.A;
   }

   public void E(int var1) {
      this.s = var1;
   }

   public int P() {
      return this.s;
   }

   public void h(float var1) {
      this.g = var1;
   }

   public float t() {
      return this.g;
   }

   public void o(boolean var1) {
      this.t = var1;
   }

   public boolean I$boolean() {
      return this.t;
   }

   public void B(Po2 var1) {
      this.U = var1;
   }

   public Po2 O() {
      return this.U;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var10000 = W5.q();
      int[] var6 = new int[var4];
      String[] var3 = var10000;
      int var7 = (int)((float)this.s / 1.414F);
      int[] var8 = new int[this.s + 1];
      int[] var9 = new int[var7 + 1];
      if (this.U != null) {
         int var10 = 0;

         label258: {
            while (var10 <= this.s) {
               int var11 = this.U.D((float)var10 / (float)this.s);
               int var12 = var11 >> a(5759, 8440283834928762206L) & a(6320, 5988257916955427739L);
               int var13 = var11 >> a(2674, 6111706536463831389L) & a(32393, 7212213558597805475L);
               int var14 = var11 & a(32393, 7212213558597805475L);
               var11 = var11 & a(31493, 4889264004329496620L)
                  | (int)(this.A * (float)var12) << a(12483, 3638172604557569006L)
                  | (int)(this.A * (float)var13) << a(28672, 4145203539559377710L)
                  | (int)(this.A * (float)var14);
               var8[var10] = var11;
               var10++;
               if (var3 == null) {
                  break label258;
               }

               if (var3 == null) {
                  break;
               }
            }

            var10 = 0;
         }

         while (var10 <= var7) {
            int var32 = this.U.D((float)var10 / (float)var7);
            int var35 = var32 >> a(12483, 3638172604557569006L) & a(32393, 7212213558597805475L);
            int var38 = var32 >> a(28672, 4145203539559377710L) & a(32393, 7212213558597805475L);
            int var41 = var32 & a(32393, 7212213558597805475L);
            var32 = var32 & a(31493, 4889264004329496620L)
               | (int)(this.A * (float)var35) << a(12483, 3638172604557569006L)
               | (int)(this.A * (float)var38) << a(28672, 4145203539559377710L)
               | (int)(this.A * (float)var41);
            var9[var10] = var32;
            var10++;
            if (var3 == null) {
               break;
            }
         }
      }

      BufferedImage var30 = new BufferedImage(var4, var5, 2);
      int var34 = (int)(this.j * 3.0F * 255.0F);
      int var36 = 0;

      label247:
      while (true) {
         int var57 = var36;
         int var10001 = var5;

         label244:
         while (var57 < var10001) {
            this.l(var1, 0, var36, var4, 1, var6);
            var58 = 0;
            if (var3 == null) {
               break label247;
            }

            int var39 = 0;

            while (var39 < var4) {
               int var42 = var6[var39];
               int var15 = var42 & a(31493, 4889264004329496620L);
               int var16 = var42 >> a(12483, 3638172604557569006L) & a(32393, 7212213558597805475L);
               int var17 = var42 >> a(28672, 4145203539559377710L) & a(32393, 7212213558597805475L);
               int var18 = var42 & a(32393, 7212213558597805475L);
               int var19 = var16 + var17 + var18;
               var57 = var19;
               var10001 = var34;
               if (var3 == null) {
                  continue label244;
               }

               label238: {
                  if (var3 != null) {
                     if (var19 < var34) {
                        var6[var39] = a(31493, 4889264004329496620L);
                        if (var3 != null) {
                           break label238;
                        }
                     }

                     var57 = var19;
                     var10001 = 3;
                  }

                  var19 = var57 / var10001;
                  var6[var39] = var15 | var19 << a(12483, 3638172604557569006L) | var19 << a(28672, 4145203539559377710L) | var19;
               }

               var39++;
               if (var3 == null) {
                  break;
               }
            }

            this.E(var30, 0, var36, var4, 1, var6);
            var36++;
            if (var3 != null) {
               continue label247;
            }
            break;
         }

         float var62;
         var58 = (var62 = this.g - 0.0F) == 0.0F ? 0 : (var62 < 0.0F ? -1 : 1);
         break;
      }

      if (var58) {
         var30 = new HX3(this.g).filter(var30, null);
      }

      label218: {
         BufferedImage var59 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label218;
            }

            var59 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var59;
      }

      label212: {
         Hr4 var60 = this;
         if (var3 != null) {
            if (this.t) {
               var37 = new int[var4 * var5];
               break label212;
            }

            var60 = this;
         }

         var37 = var60.l(var1, 0, 0, var4, var5, null);
      }

      int var40 = 0;

      label205:
      while (true) {
         int var61 = var40;

         label202:
         while (var61 < var5) {
            int var43 = var40 * var4;
            this.l(var30, 0, var40, var4, 1, var6);
            int var44 = Math.max(var40 - this.s, 0) - var40;
            int var45 = Math.min(var40 + this.s, var5 - 1) - var40;
            int var46 = Math.max(var40 - var7, 0) - var40;
            int var47 = Math.min(var40 + var7, var5 - 1) - var40;
            if (var3 == null) {
               return var2;
            }

            int var49 = 0;

            while (var49 < var4) {
               float var63;
               var61 = (var63 = (float)(var6[var49] & a(32393, 7212213558597805475L)) - this.j * 255.0F) == 0.0F ? 0 : (var63 < 0.0F ? -1 : 1);
               if (var3 == null) {
                  continue label202;
               }

               label196: {
                  label277: {
                     if (var3 != null) {
                        if (var61 <= 0) {
                           break label277;
                        }

                        var61 = Math.max(var49 - this.s, 0) - var49;
                     }

                     int var20 = var61;
                     int var21 = Math.min(var49 + this.s, var4 - 1) - var49;
                     int var22 = Math.max(var49 - var7, 0) - var49;
                     int var23 = Math.min(var49 + var7, var4 - 1) - var49;
                     int var24 = 0;
                     int var25 = 0;

                     label188: {
                        while (var24 <= var21) {
                           var37[var43 + var24] = Iw4.P(var37[var43 + var24], var8[var25], 4);
                           var24++;
                           var25++;
                           if (var3 == null) {
                              break label188;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var24 = -1;
                     }

                     var25 = 1;

                     label177: {
                        while (var24 >= var20) {
                           var37[var43 + var24] = Iw4.P(var37[var43 + var24], var8[var25], 4);
                           var24--;
                           var25++;
                           if (var3 == null) {
                              break label177;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var24 = 1;
                        var25 = var43 + var4;
                     }

                     int var26 = 0;

                     label166: {
                        while (var24 <= var45) {
                           var37[var25] = Iw4.P(var37[var25], var8[var26], 4);
                           var24++;
                           var25 += var4;
                           var26++;
                           if (var3 == null) {
                              break label166;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var24 = -1;
                        var25 = var43 - var4;
                     }

                     var26 = 0;

                     label155: {
                        while (var24 >= var44) {
                           var37[var25] = Iw4.P(var37[var25], var8[var26], 4);
                           var24--;
                           var25 -= var4;
                           var26++;
                           if (var3 == null) {
                              break label155;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var24 = Math.max(var22, var46);
                        var25 = Math.min(var23, var47);
                        var26 = Math.min(var23, var47);
                     }

                     int var27 = 1;
                     int var28 = var43 + var4 + 1;
                     int var29 = 0;

                     label144: {
                        while (var27 <= var26) {
                           var37[var28] = Iw4.P(var37[var28], var9[var29], 4);
                           var27++;
                           var28 += var4 + 1;
                           var29++;
                           if (var3 == null) {
                              break label144;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var26 = Math.min(-var22, -var46);
                        var27 = 1;
                        var28 = var43 - var4 - 1;
                     }

                     var29 = 0;

                     label133: {
                        while (var27 <= var26) {
                           var37[var28] = Iw4.P(var37[var28], var9[var29], 4);
                           var27++;
                           var28 -= var4 + 1;
                           var29++;
                           if (var3 == null) {
                              break label133;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var26 = Math.min(var23, -var46);
                        var27 = 1;
                        var28 = var43 - var4 + 1;
                     }

                     var29 = 0;

                     label122: {
                        while (var27 <= var26) {
                           var37[var28] = Iw4.P(var37[var28], var9[var29], 4);
                           var27++;
                           var28 += -var4 + 1;
                           var29++;
                           if (var3 == null) {
                              break label122;
                           }

                           if (var3 == null) {
                              break;
                           }
                        }

                        var26 = Math.min(-var22, var47);
                        var27 = 1;
                        var28 = var43 + var4 - 1;
                     }

                     var29 = 0;

                     while (var27 <= var26) {
                        var37[var28] = Iw4.P(var37[var28], var9[var29], 4);
                        var27++;
                        var28 += var4 - 1;
                        var29++;
                        if (var3 == null) {
                           break label196;
                        }

                        if (var3 == null) {
                           break;
                        }
                     }
                  }

                  var43++;
                  var49++;
               }

               if (var3 == null) {
                  break;
               }
            }

            var40++;
            if (var3 != null) {
               continue label205;
            }
            break;
         }

         this.E(var2, 0, 0, var4, var5, var37);
         return var2;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6953;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "*9}`!}^@\u0018wl,}\u0003Aq".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 81;
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
         var10007 = 81;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 62;
               break;
            case 1:
               var50 = 14;
               break;
            case 2:
               var50 = 74;
               break;
            case 3:
               var50 = 84;
               break;
            case 4:
               var50 = 19;
               break;
            case 5:
               var50 = 88;
               break;
            default:
               var50 = 124;
         }
      } else {
         var34 = 81;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8894348698004285666L;
            long[] var14 = new long[9];
            int var11 = 0;
            String var12 = "\u0083¨\u000b\u0092Ý)\bÎP\u0099T`Êv\u009dÖøýî\u0098\u0016\u008ck\u0086qâ:¦9z\u008d¾\u0006\u009c\u0007\u0013\u00036Ã\u001c\u008bÃ\u0003ËYÀH#\u0014x\u008bq\u0088\\ù·";
            int var13 = "\u0083¨\u000b\u0092Ý)\bÎP\u0099T`Êv\u009dÖøýî\u0098\u0016\u008ck\u0086qâ:¦9z\u008d¾\u0006\u009c\u0007\u0013\u00036Ã\u001c\u008bÃ\u0003ËYÀH#\u0014x\u008bq\u0088\\ù·"
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
                           c = new Integer[9];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "|ã·¾\f \u0003Ä\u0088±\u0089\u008cÕfe¬";
                        var13 = "|ã·¾\f \u0003Ä\u0088±\u0089\u008cÕfe¬".length();
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
         var10007 = 81;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 62;
               break;
            case 1:
               var50 = 14;
               break;
            case 2:
               var50 = 74;
               break;
            case 3:
               var50 = 84;
               break;
            case 4:
               var50 = 19;
               break;
            case 5:
               var50 = 88;
               break;
            default:
               var50 = 124;
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
                  var50 = 62;
                  break;
               case 1:
                  var50 = 14;
                  break;
               case 2:
                  var50 = 74;
                  break;
               case 3:
                  var50 = 84;
                  break;
               case 4:
                  var50 = 19;
                  break;
               case 5:
                  var50 = 88;
                  break;
               default:
                  var50 = 124;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8894348698004285666L;
               long[] var6 = new long[9];
               int var3 = 0;
               String var4 = "\u0083¨\u000b\u0092Ý)\bÎP\u0099T`Êv\u009dÖøýî\u0098\u0016\u008ck\u0086qâ:¦9z\u008d¾\u0006\u009c\u0007\u0013\u00036Ã\u001c\u008bÃ\u0003ËYÀH#\u0014x\u008bq\u0088\\ù·";
               int var5 = "\u0083¨\u000b\u0092Ý)\bÎP\u0099T`Êv\u009dÖøýî\u0098\u0016\u008ck\u0086qâ:¦9z\u008d¾\u0006\u009c\u0007\u0013\u00036Ã\u001c\u008bÃ\u0003ËYÀH#\u0014x\u008bq\u0088\\ù·"
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
                              c = new Integer[9];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "|ã·¾\f \u0003Ä\u0088±\u0089\u008cÕfe¬";
                           var5 = "|ã·¾\f \u0003Ä\u0088±\u0089\u008cÕfe¬".length();
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
                  var50 = 62;
                  break;
               case 1:
                  var50 = 14;
                  break;
               case 2:
                  var50 = 74;
                  break;
               case 3:
                  var50 = 84;
                  break;
               case 4:
                  var50 = 19;
                  break;
               case 5:
                  var50 = 88;
                  break;
               default:
                  var50 = 124;
            }
         }
      }
   }
}





