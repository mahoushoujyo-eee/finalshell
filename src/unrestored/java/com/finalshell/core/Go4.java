package com.finalshell.core;

import java.awt.Rectangle;

public class Go4 extends GT3 {
   public float Y = 5.0F;
   public float M = 1.0F;
   public float K = 0.0F;
   public int W = a(26798, 620179751183434260L);
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void F(float var1) {
      this.Y = var1;
   }

   public float y() {
      return this.Y;
   }

   public void o(float var1) {
      this.M = var1;
   }

   public float U() {
      return this.M;
   }

   public void C(float var1) {
      this.K = var1;
   }

   public float x() {
      return this.K;
   }

   public void V(int var1) {
      this.W = var1;
   }

   public int h() {
      return this.W;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      String[] var10001 = W5.q();
      int var6 = 0;
      short[][] var7 = new short[3][var1];
      String[] var5 = var10001;
      int[] var8 = new int[var1 * var2];
      short[] var9 = new short[a(9189, 3424596279526132062L)];
      int var10 = (int)(this.K * 256.0F / this.Y);
      int var11 = 0;

      while (true) {
         if (var11 < a(1734, 8546714437266156670L)) {
            var9[var11] = (short)Iw4.e((int)(255.0 * Math.floor((double)(this.Y * (float)(var11 + var10) / 256.0F)) / (double)(this.Y - 1.0F) - (double)var10));
            var11++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var11 = 0;
         break;
      }

      while (true) {
         if (var11 < var1) {
            int var12 = var3[var11];
            var7[1][var11] = (short)Iw4.g(var12);
            var11++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var11 = 0;
         break;
      }

      label147:
      while (true) {
         int var10000 = var11;

         label145:
         while (var10000 < var2) {
            label142: {
               label168: {
                  var10000 = var11;
                  if (var5 != null) {
                     if (var11 <= 0) {
                        break label168;
                     }

                     var10000 = var11;
                  }

                  if (var5 == null) {
                     break label142;
                  }

                  if (var10000 < var2 - 1) {
                     var10000 = 1;
                     break label142;
                  }
               }

               var10000 = 0;
            }

            int var14;
            int var27;
            label131: {
               var27 = var10000;
               int var13 = var6 + var1;
               var10000 = var11;
               if (var5 != null) {
                  if (var11 < var2 - 1) {
                     var14 = 0;

                     while (var14 < var1) {
                        int var15 = var3[var13++];
                        var7[2][var14] = (short)Iw4.g(var15);
                        var14++;
                        if (var5 == null) {
                           break label131;
                        }

                        if (var5 == null) {
                           break;
                        }
                     }
                  }

                  var10000 = 0;
               }

               var14 = var10000;
            }

            while (var14 < var1) {
               var10000 = var14;
               if (var5 == null) {
                  continue label145;
               }

               label113: {
                  label172: {
                     if (var5 != null) {
                        if (var14 <= 0) {
                           break label172;
                        }

                        var10000 = var14;
                     }

                     if (var5 == null) {
                        break label113;
                     }

                     if (var10000 < var1 - 1) {
                        var10000 = 1;
                        break label113;
                     }
                  }

                  var10000 = 0;
               }

               int var18;
               int var29 = var10000;
               int var16 = var14 - 1;
               int var17 = var14 + 1;
               var18 = 0;
               var10000 = var27;
               label102:
               if (var5 != null) {
                  if (var27 != 0) {
                     var10000 = var29;
                     if (var5 == null) {
                        break label102;
                     }

                     label98:
                     if (var29 != 0) {
      short var34;
                        short var19 = var7[0][var16];
                        short var20 = var7[0][var14];
                        short var21 = var7[1][var16];
                        short var22 = var7[1][var14];
                        short var23 = var9[var19];
                        short var24 = var9[var20];
                        short var25 = var9[var21];
                        short var26 = var9[var22];
                        var10000 = var23;
                        var34 = var24;
                        label96:
                        if (var5 != null) {
                           if (var23 == var24) {
                              var10000 = var23;
                              var34 = var25;
                              if (var5 == null) {
                                 break label96;
                              }

                              if (var23 == var25) {
                                 var10000 = var24;
                                 var34 = var26;
                                 if (var5 == null) {
                                    break label96;
                                 }

                                 if (var24 == var26) {
                                    var10000 = var25;
                                    if (var5 == null) {
                                       break label102;
                                    }

                                    if (var25 == var26) {
                                       break label98;
                                    }
                                 }
                              }
                           }

                           var18 = (int)(
                              this.M * (float)(Math.abs(var19 - var20) + Math.abs(var19 - var21) + Math.abs(var20 - var22) + Math.abs(var21 - var22))
                           );
                           var10000 = var18;
                           if (var5 == null) {
                              break label102;
                           }

                           var34 = a(14058, 4037834293423512659L);
                        }

                        if (var10000 > var34) {
                           var18 = a(11724, 2101211989127989106L);
                        }
                     }
                  }

                  var10000 = var18;
               }

               label77: {
                  if (var10000 != 0) {
                     var8[var6] = Iw4.k(var3[var6], this.W, 1, var18);
                     if (var5 != null) {
                        break label77;
                     }
                  }

                  var8[var6] = var3[var6];
               }

               var6++;
               var14++;
               if (var5 == null) {
                  break;
               }
            }

            short[] var28 = var7[0];
            var7[0] = var7[1];
            var7[1] = var7[2];
            var7[2] = var28;
            var11++;
            if (var5 == null) {
               return var8;
            }
            continue label147;
         }

         return var8;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10938;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var34;
      char[] var10003 = "|L:+:/O\u0000{,)':_]\u0016mi".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      var34 = 6;
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
         var10007 = 6;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 41;
               break;
            case 1:
               var50 = 62;
               break;
            case 2:
               var50 = 69;
               break;
            case 3:
               var50 = 65;
               break;
            case 4:
               var50 = 85;
               break;
            case 5:
               var50 = 83;
               break;
            default:
               var50 = 44;
         }
      } else {
         var34 = 6;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8833043335492498411L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "Â¶i£`\u0084±ÿ2x\u008d\u0018=îûµè5áÚ´ZÞ\u0095";
            int var13 = "Â¶i£`\u0084±ÿ2x\u008d\u0018=îûµè5áÚ´ZÞ\u0095".length();
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
                           c = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "·µZð¸ÏoGÄÁò\u0085Ømtf";
                        var13 = "·µZð¸ÏoGÄÁò\u0085Ømtf".length();
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
         var10007 = 6;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 41;
               break;
            case 1:
               var50 = 62;
               break;
            case 2:
               var50 = 69;
               break;
            case 3:
               var50 = 65;
               break;
            case 4:
               var50 = 85;
               break;
            case 5:
               var50 = 83;
               break;
            default:
               var50 = 44;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = (byte)(var34);
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 41;
                  break;
               case 1:
                  var50 = 62;
                  break;
               case 2:
                  var50 = 69;
                  break;
               case 3:
                  var50 = 65;
                  break;
               case 4:
                  var50 = 85;
                  break;
               case 5:
                  var50 = 83;
                  break;
               default:
                  var50 = 44;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8833043335492498411L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "Â¶i£`\u0084±ÿ2x\u008d\u0018=îûµè5áÚ´ZÞ\u0095";
               int var5 = "Â¶i£`\u0084±ÿ2x\u008d\u0018=îûµè5áÚ´ZÞ\u0095".length();
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
                              c = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "·µZð¸ÏoGÄÁò\u0085Ømtf";
                           var5 = "·µZð¸ÏoGÄÁò\u0085Ømtf".length();
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
            var10007 = (byte)(var34);
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 41;
                  break;
               case 1:
                  var50 = 62;
                  break;
               case 2:
                  var50 = 69;
                  break;
               case 3:
                  var50 = 65;
                  break;
               case 4:
                  var50 = 85;
                  break;
               case 5:
                  var50 = 83;
                  break;
               default:
                  var50 = 44;
            }
         }
      }
   }
}





