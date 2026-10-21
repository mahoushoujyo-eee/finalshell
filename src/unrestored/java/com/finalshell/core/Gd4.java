package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Gd4 extends Gy4 {
   public float S = 0.0F;
   public float p = 0.0F;
   public float l;
   public float f;
   public float B;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Gd4() {
      this.Y(0);
   }

   public void I(float var1) {
      this.p = var1;
   }

   public float z() {
      return this.p;
   }

   public void M(float var1) {
      this.S = var1;
   }

   public float p() {
      return this.S;
   }

   public void L(float var1) {
      this.B = var1;
   }

   public float E() {
      return this.B;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var37;
      String[] var10000 = W5.q();
      int var4 = var1.getWidth();
      String[] var3 = var10000;
      int var5 = var1.getHeight();
      this.l = (float)var1.getWidth();
      this.f = (float)var1.getHeight();
      int var6 = var1.getType();
      this.U = new Rectangle(0, 0, var4, var5);
      this.r = new Rectangle(0, 0, var4, var5);
      this.T(this.r);
      BufferedImage var41 = var2;
      if (var3 != null) {
         if (var2 == null) {
            ColorModel var7 = var1.getColorModel();
            var2 = new BufferedImage(var7, var7.createCompatibleWritableRaster(this.r.width, this.r.height), var7.isAlphaPremultiplied(), null);
         }

         var41 = var2;
      }

      WritableRaster var35 = var41.getRaster();
      int[] var8 = this.l(var1, 0, 0, var4, var5, null);
      int var42 = this.P;
      if (var3 != null) {
         if (this.P == 0) {
            return this.l(var2, var4, var5, var8, this.r);
         }

         var42 = var4;
      }

      int var9 = var42;
      int var10 = var5;
      int var11 = var4 - 1;
      int var12 = var5 - 1;
      int var13 = this.r.width;
      int var14 = this.r.height;
      boolean var17 = false;
      int[] var18 = new int[var13];
      int var15 = this.r.x;
      int var16 = this.r.y;
      float[] var19 = new float[4];
      int var20 = 0;

      label87:
      while (true) {
         int var43 = var20;

         label85:
         while (var43 < var14) {
            int var21 = 0;

            while (var21 < var13) {
               this.h(var15 + var21, var16 + var20, var19);
               int var22 = (int)Math.floor((double)var19[0]);
               int var23 = (int)Math.floor((double)var19[1]);
               float var24 = var19[0] - (float)var22;
               float var25 = var19[1] - (float)var23;
               var43 = var22;
               if (var3 == null) {
                  continue label85;
               }

               int var26;
               int var27;
               int var28;
               int var29;
               label79: {
                  label78:
                  if (var3 != null) {
                     if (var22 >= 0) {
                        var43 = var22;
                        if (var3 == null) {
                           break label78;
                        }

                        if (var22 < var11) {
                           var43 = var23;
                           if (var3 == null) {
                              break label78;
                           }

                           if (var23 >= 0) {
                              var43 = var23;
                              if (var3 == null) {
                                 break label78;
                              }

                              if (var23 < var12) {
                                 int var30 = var9 * var23 + var22;
                                 var26 = var8[var30];
                                 var27 = var8[var30 + 1];
                                 var28 = var8[var30 + var9];
                                 var29 = var8[var30 + var9 + 1];
                                 if (var3 != null) {
                                    break label79;
                                 }
                              }
                           }
                        }
                     }

                     var43 = this.t(var8, var22, var23, var9, var10);
                  }

                  var26 = var43;
                  var27 = this.t(var8, var22 + 1, var23, var9, var10);
                  var28 = this.t(var8, var22, var23 + 1, var9, var10);
                  var29 = this.t(var8, var22 + 1, var23 + 1, var9, var10);
               }

               label62: {
                  label61: {
                     var37 = NM.O(var24, var25, var26, var27, var28, var29);
                     int var31 = var37 >> b(11332, 3529673341508132254L) & b(3608, 1158789635315351491L);
                     int var32 = var37 >> b(27974, 3520364395024047263L) & b(27559, 1024126469707192955L);
                     int var33 = var37 & b(27559, 1024126469707192955L);
                     float var34 = var19[2];
                     var31 = (int)((float)var31 * var34);
                     var32 = (int)((float)var32 * var34);
                     var33 = (int)((float)var33 * var34);
                     var37 = var37 & b(29278, 2501731748898882433L) | var31 << b(18267, 4779584971666126470L) | var32 << b(17140, 1265389466498396970L) | var33;
                     if (var3 != null) {
                        if (var19[3] == 0.0F) {
                           break label61;
                        }

                        var18[var21] = Iw4.P(var37, var8[var9 * var20 + var21], 1);
                     }

                     if (var3 != null) {
                        break label62;
                     }
                  }

                  var18[var21] = var37;
               }

               var21++;
               if (var3 == null) {
                  break;
               }
            }

            this.E(var2, 0, var20, this.r.width, 1, var18);
            var20++;
            if (var3 == null) {
               return var2;
            }
            continue label87;
         }

         return var2;
      }
   }

   public final int t(int[] var1, int var2, int var3, int var4, int var5) {
      String[] var6;
      int var10000;
      var6 = W5.q();
      var10000 = var2;
      label37:
      if (var6 != null) {
         if (var2 >= 0) {
            var10000 = var2;
            if (var6 == null) {
               break label37;
            }

            if (var2 < var4) {
               var10000 = var3;
               if (var6 == null) {
                  break label37;
               }

               if (var3 >= 0) {
                  if (var6 == null) {
                     return var3;
                  }

                  if (var3 < var5) {
                     return var1[var3 * var4 + var2];
                  }
               }
            }
         }

         var10000 = this.t;
      }

      if (var6 != null) {
         switch (var10000) {
            case 0:
            default:
               return 0;
            case 1:
               var10000 = var1[NM.L(var3, 0, var5 - 1) * var4 + NM.L(var2, 0, var4 - 1)];
               break;
            case 2:
               return var1[NM.r(var3, var5) * var4 + NM.r(var2, var4)];
         }
      }

      return var10000;
   }

   @Override
   public void h(int var1, int var2, float[] var3) {
      int var32;
      float var34;
      int var36;
      float var37;
      String[] var10000 = W5.q();
      float var5 = this.p;
      String[] var4 = var10000;
      float var6 = (float)var1;
      float var7 = (float)var2;
      float var8 = (float)Math.sin((double)this.S);
      float var9 = (float)Math.cos((double)this.S);
      float var10 = var5 * this.l;
      var10 = var5 * (float)Math.sqrt((double)(this.l * this.l + this.f * this.f));
      float var28 = var9;
      if (var4 != null) {
         var28 = var9 < 0.0F ? this.l : 0.0F;
      }

      float var11 = var28;
      float var29 = var8;
      if (var4 != null) {
         var29 = var8 < 0.0F ? this.f : 0.0F;
      }

      float var12 = var29;
      var6 -= var11;
      var7 -= var12;
      float var13 = var6 * var9 + var7 * var8;
      float var14 = -var6 * var8 + var7 * var9;
      float var39;
      int var30 = (var39 = var13 - var10) == 0.0F ? 0 : (var39 < 0.0F ? -1 : 1);
      if (var4 != null) {
         var30 = var30 < 0 ? 1 : 0;
      }

      int var15 = var30;
      float var40;
      int var31 = (var40 = var13 - var10 * 2.0F) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
      if (var4 != null) {
         var31 = var31 > 0 ? 1 : 0;
      }

      label140: {
         label149: {
            int var16 = var31;
            var32 = var15;
            if (var4 != null) {
               if (var15 != 0) {
                  break label149;
               }

               var32 = var16;
            }

            if (var4 == null) {
               break label140;
            }

            if (var32 == 0) {
               var32 = 1;
               break label140;
            }
         }

         var32 = 0;
      }

      int var17;
      label129: {
         var17 = var32;
         float var33 = var13;
         float var10001 = var10 * 2.0F;
         if (var4 != null) {
            if (var13 > var10001) {
               var34 = var13;
               break label129;
            }

            var33 = 2.0F * var10;
            var10001 = var13;
         }

         var34 = var33 - var10001;
      }

      var13 = var34;
      float var21 = var13 * var9 - var14 * var8;
      var7 = var13 * var8 + var14 * var9;
      var6 = var21 + var11;
      var7 += var12;
      float var41;
      var35 = (var41 = var6 - 0.0F) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
      label123:
      if (var4 != null) {
         if (var35 >= 0) {
            float var42;
            var35 = (var42 = var7 - 0.0F) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
            if (var4 == null) {
               break label123;
            }

            if (var35 >= 0) {
               float var43;
               var35 = (var43 = var6 - this.l) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
               if (var4 == null) {
                  break label123;
               }

               if (var35 < 0) {
                  float var44;
                  var35 = (var44 = var7 - this.f) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
                  if (var4 == null) {
                     break label123;
                  }

                  if (var35 < 0) {
                     var35 = 0;
                     break label123;
                  }
               }
            }
         }

         var35 = 1;
      }

      int var18;
      var18 = var35;
      var36 = var18;
      label109:
      if (var4 != null) {
         if (var18 != 0) {
            var36 = var17;
            if (var4 == null) {
               break label109;
            }

            if (var17 != 0) {
               var6 = (float)var1;
               var7 = (float)var2;
            }
         }

         var36 = var18;
      }

      label102: {
         label101: {
            if (var4 != null) {
               if (var36 != 0) {
                  break label101;
               }

               var36 = var17;
            }

            if (var36 != 0) {
               var37 = 1.9F * (1.0F - (float)Math.cos(Math.exp((double)((var13 - var10) / this.B))));
               break label102;
            }
         }

         var37 = 0.0F;
      }

      label93: {
         float var19 = var37;
         var3[2] = 1.0F - var19;
         if (var4 != null) {
            if (var15 != 0) {
               var3[0] = var3[1] = -1.0F;
               if (var4 != null) {
                  break label93;
               }
            }

            var3[0] = var6;
         }

         var3[1] = var7;
      }

      float var38;
      label86: {
         label85: {
            int var10002 = var18;
            if (var4 != null) {
               if (var18 != 0) {
                  break label85;
               }

               var10002 = var17;
            }

            if (var10002 != 0) {
               var38 = 1.0F;
               break label86;
            }
         }

         var38 = 0.0F;
      }

      var3[3] = var38;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12767;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long var32;
      int var34;
      String var36;
      char[] var10003 = "4 \u00183\u0012\u0007-_\n\u001e5\u0011[w^".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      var34 = 120;
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
         var10007 = 120;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 8;
               break;
            case 1:
               var50 = 49;
               break;
            case 2:
               var50 = 19;
               break;
            case 3:
               var50 = 63;
               break;
            case 4:
               var50 = 5;
               break;
            case 5:
               var50 = 13;
               break;
            default:
               var50 = 33;
         }
      } else {
         var34 = 120;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 1260000207302933890L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "ØÙ\u008cýâZþ\u0003×\u0001l\u000f°\u001dÎ »\u001d_ä\u001cÁË\u0014t\u0015\u0018 ZÍg\u0006ô\u009cKùãU\u0082¾";
            int var13 = "ØÙ\u008cýâZþ\u0003×\u0001l\u000f°\u001dÎ »\u001d_ä\u001cÁË\u0014t\u0015\u0018 ZÍg\u0006ô\u009cKùãU\u0082¾".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var18 = var14;
               var25 = var11++;
               var32 = ((long)var16[0] & 255L) << 56
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
                           c = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0016Ã\u0086\u001c¸÷ \fk½ú0¸bá\u0015";
                        var13 = "\u0016Ã\u0086\u001c¸÷ \fk½ú0¸bá\u0015".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
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
         var10007 = 120;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 8;
               break;
            case 1:
               var50 = 49;
               break;
            case 2:
               var50 = 19;
               break;
            case 3:
               var50 = 63;
               break;
            case 4:
               var50 = 5;
               break;
            case 5:
               var50 = 13;
               break;
            default:
               var50 = 33;
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
                  var50 = 8;
                  break;
               case 1:
                  var50 = 49;
                  break;
               case 2:
                  var50 = 19;
                  break;
               case 3:
                  var50 = 63;
                  break;
               case 4:
                  var50 = 5;
                  break;
               case 5:
                  var50 = 13;
                  break;
               default:
                  var50 = 33;
            }
         } else {
            if (var19 <= var8) {
               var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 1260000207302933890L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "ØÙ\u008cýâZþ\u0003×\u0001l\u000f°\u001dÎ »\u001d_ä\u001cÁË\u0014t\u0015\u0018 ZÍg\u0006ô\u009cKùãU\u0082¾";
               int var5 = "ØÙ\u008cýâZþ\u0003×\u0001l\u000f°\u001dÎ »\u001d_ä\u001cÁË\u0014t\u0015\u0018 ZÍg\u0006ô\u009cKùãU\u0082¾".length();
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
                              c = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0016Ã\u0086\u001c¸÷ \fk½ú0¸bá\u0015";
                           var5 = "\u0016Ã\u0086\u001c¸÷ \fk½ú0¸bá\u0015".length();
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
            var10007 = (byte)(var34);
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 8;
                  break;
               case 1:
                  var50 = 49;
                  break;
               case 2:
                  var50 = 19;
                  break;
               case 3:
                  var50 = 63;
                  break;
               case 4:
                  var50 = 5;
                  break;
               case 5:
                  var50 = 13;
                  break;
               default:
                  var50 = 33;
            }
         }
      }
   }
   private static int var35;
}





