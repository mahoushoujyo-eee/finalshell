package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class YB3 extends GT3 {
   public float G;
   public float O;
   public float D = 10000.0F;
   public int p = 0;
   public int a = 0;
   public SC I;
   public BufferedImage U;
   public int[] e;
   public int y = 1;
   public int z = 1;
   public Od4 S;
   public Od4 V;
   public Od4 k;
   public O_3 P;
   public O_3 K;
   public O_3 x;
   public Od4 C;
   public Od4 b;
   public static String c;
   public static long[] d;
   public static Integer[] f;

   public YB3() {
      this.G = 1.0F;
      this.O = 5.0F;
      this.S = new Od4();
      this.V = new Od4();
      this.k = new Od4();
      this.P = new O_3();
      this.K = new O_3();
      this.x = new O_3();
      this.C = new Od4();
      this.b = new Od4();
   }

   public void i(SC var1) {
      this.I = var1;
   }

   public SC w() {
      return this.I;
   }

   public void k(float var1) {
      this.G = var1;
   }

   public float e() {
      return this.G;
   }

   public void h(float var1) {
      this.O = var1;
   }

   public float A() {
      return this.O;
   }

   public void T(BufferedImage var1) {
      String[] var10000 = W5.q();
      this.U = var1;
      String[] var2 = var10000;
      if (var2 != null) {
         if (var1 != null) {
            this.y = var1.getWidth();
            this.z = var1.getHeight();
            this.e = this.l(var1, 0, 0, this.y, this.z, null);
            if (var2 != null) {
               return;
            }
         }

         this.y = this.z = 1;
      }

      this.e = null;
   }

   public BufferedImage O() {
      return this.U;
   }

   public void f(int var1) {
      this.a = var1;
   }

   public int L() {
      return this.a;
   }

   public void r(O_3 var1, int var2) {
      var1.X(
         (float)(var2 >> a(30588, 337725760998618555L) & a(8846, 3283555849333203016L)) * 0.003921569F,
         (float)(var2 >> a(17989, 1541906153097856135L) & a(32654, 6934188322788785487L)) * 0.003921569F,
         (float)(var2 & a(32654, 6934188322788785487L)) * 0.003921569F,
         (float)(var2 >> a(19117, 5731629207584933997L) & a(32654, 6934188322788785487L)) * 0.003921569F
      );
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      YB3 var39;
      boolean var41;
      Od4 var45;
      String[] var10000 = W5.q();
      int var6 = 0;
      int[] var7 = new int[var1 * var2];
      String[] var5 = var10000;
      float var8 = Math.abs(6.0F * this.G);
      float var50;
      int var37 = (var50 = this.G - 0.0F) == 0.0F ? 0 : (var50 < 0.0F ? -1 : 1);
      if (var5 != null) {
         var37 = var37 < 0 ? 1 : 0;
      }

      int var9;
      Od4 var10;
      Od4 var11;
      Od4 var12;
      O_3 var13;
      Object var14;
      label252: {
         var9 = var37;
         var10 = new Od4(0.0F, 0.0F, 0.0F);
         var11 = new Od4((float)var1 / 2.0F, (float)var2 / 2.0F, this.D);
         var12 = new Od4();
         var13 = new O_3();
         var14 = this.I;
         var38 = this.a;
         label247:
         if (var5 != null) {
            if (this.a != 0) {
               var38 = this.a;
               if (var5 == null) {
                  break label247;
               }

               if (this.a != 1) {
                  var38 = this.a;
                  if (var5 == null) {
                     break label247;
                  }

                  if (this.a != 2 && var14 != null) {
                     break label252;
                  }
               }
            }

            float var51;
            var38 = (var51 = this.O - 0.0F) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
         }

         label267: {
            if (var5 != null) {
               if (var38 == 0) {
      Od4 var38;
                  break label267;
               }

               var38 = var1;
            }

            int var15;
            int var16;
            int[] var17;
            var15 = (int)(var38);
            var16 = var2;
            var17 = var3;
            var39 = this;
            label227:
            if (var5 != null) {
               if (this.a == 2) {
                  var39 = this;
                  if (var5 == null) {
                     break label227;
                  }

                  if (this.I instanceof Bh2) {
                     Bh2 var18 = (Bh2)this.I;
                     var15 = var18.H();
                     var16 = var18.n();
                     var17 = var18.d();
                  }
               }

               var39 = this;
            }

            Kernel var31 = HX3.n(var39.O);
            int[] var19 = new int[var15 * var16];
            int[] var20 = new int[var15 * var16];
            HX3.V(var31, var17, var19, var15, var16, true, false, false, HG3.Y);
            HX3.V(var31, var19, var20, var16, var15, true, false, false, HG3.Y);
            var14 = new Bh2(var20, var15, var16, 1, this.a == 1);
            if (var5 != null) {
               break label252;
            }
         }

         var14 = new Bh2(var3, var1, var2, 1, this.a == 1);
      }

      Od4 var28 = new Od4();
      Od4 var29 = new Od4();
      Od4 var30 = new Od4();
      int var32 = 0;

      label216:
      while (true) {
         int var40 = var32;
         int var10001 = var2;

         label214:
         while (var40 < var10001) {
            float var33 = (float)var32;
            var10.I = (float)var32;
            int var34 = 0;

            while (var34 < var1) {
               float var21 = (float)var34;
               var40 = this.a;
               if (var5 != null) {
                  var10001 = 3;
                  if (var5 == null) {
                     continue label214;
                  }

                  if (this.a != 3) {
                     int var22;
                     float var24;
                     float var25;
                     float var26;
                     float var27;
                     var22 = 0;
                     var12.e = var12.I = var12.k = 0.0F;
                     float var23 = var8 * ((SC)var14).h(var21, var33);
                     var24 = var34 > 0 ? var8 * ((SC)var14).h(var21 - 1.0F, var33) - var23 : -2.0F;
                     var25 = var32 > 0 ? var8 * ((SC)var14).h(var21, var33 - 1.0F) - var23 : -2.0F;
                     var26 = var34 < var1 - 1 ? var8 * ((SC)var14).h(var21 + 1.0F, var33) - var23 : -2.0F;
                     var27 = var32 < var2 - 1 ? var8 * ((SC)var14).h(var21, var33 + 1.0F) - var23 : -2.0F;
                     float var52;
                     var41 = (((var52 = var24 - -2.0F) == 0.0F ? 0 : (var52 < 0.0F ? -1 : 1)) != 0);
                     label203:
                     if (var5 != null) {
                        if (var41) {
                           float var53;
                           var41 = (((var53 = var27 - -2.0F) == 0.0F ? 0 : (var53 < 0.0F ? -1 : 1)) != 0);
                           if (var5 == null) {
                              break label203;
                           }

                           if (var41) {
                              var28.e = -1.0F;
                              var28.I = 0.0F;
                              var28.k = var24;
                              var29.e = 0.0F;
                              var29.I = 1.0F;
                              var29.k = var27;
                              var30.G(var28, var29);
                              var30.E();
                              Od4 var42 = var30;
                              if (var5 != null) {
                                 if ((double)var30.k < 0.0) {
                                    var30.k = -var30.k;
                                 }

                                 var42 = var12;
                              }

                              var42.t(var30);
                              var22++;
                           }
                        }

                        float var54;
                        var41 = (((var54 = var24 - -2.0F) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1)) != 0);
                     }

                     label196:
                     if (var5 != null) {
                        if (var41) {
                           float var55;
                           var41 = (((var55 = var25 - -2.0F) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1)) != 0);
                           if (var5 == null) {
                              break label196;
                           }

                           if (var41) {
                              var28.e = -1.0F;
                              var28.I = 0.0F;
                              var28.k = var24;
                              var29.e = 0.0F;
                              var29.I = -1.0F;
                              var29.k = var25;
                              var30.G(var28, var29);
                              var30.E();
                              Od4 var43 = var30;
                              if (var5 != null) {
                                 if ((double)var30.k < 0.0) {
                                    var30.k = -var30.k;
                                 }

                                 var43 = var12;
                              }

                              var43.t(var30);
                              var22++;
                           }
                        }

                        float var56;
                        var41 = (((var56 = var25 - -2.0F) == 0.0F ? 0 : (var56 < 0.0F ? -1 : 1)) != 0);
                     }

                     label189:
                     if (var5 != null) {
                        if (var41) {
                           float var57;
                           var41 = (((var57 = var26 - -2.0F) == 0.0F ? 0 : (var57 < 0.0F ? -1 : 1)) != 0);
                           if (var5 == null) {
                              break label189;
                           }

                           if (var41) {
                              var28.e = 0.0F;
                              var28.I = -1.0F;
                              var28.k = var25;
                              var29.e = 1.0F;
                              var29.I = 0.0F;
                              var29.k = var26;
                              var30.G(var28, var29);
                              var30.E();
                              Od4 var44 = var30;
                              if (var5 != null) {
                                 if ((double)var30.k < 0.0) {
                                    var30.k = -var30.k;
                                 }

                                 var44 = var12;
                              }

                              var44.t(var30);
                              var22++;
                           }
                        }

                        float var58;
                        var41 = (((var58 = var26 - -2.0F) == 0.0F ? 0 : (var58 < 0.0F ? -1 : 1)) != 0);
                     }

                     label259: {
                        if (var5 != null) {
                           if (!var41) {
                              break label259;
                           }

                           float var59;
                           var41 = (((var59 = var27 - -2.0F) == 0.0F ? 0 : (var59 < 0.0F ? -1 : 1)) != 0);
                        }

                        label260: {
                           if (var5 != null) {
                              if (!var41) {
                                 break label259;
                              }

                              var28.e = 1.0F;
                              var28.I = 0.0F;
                              var28.k = var26;
                              var29.e = 0.0F;
                              var29.I = 1.0F;
                              var29.k = var27;
                              var30.G(var28, var29);
                              var30.E();
                              var45 = var30;
                              if (var5 == null) {
                                 break label260;
                              }

                              double var60;
                              var41 = (((var60 = (double)var30.k - 0.0) == 0.0 ? 0 : (var60 < 0.0 ? -1 : 1)) != 0);
                           }

                           if (var41 < 0) {
                              var30.k = -var30.k;
                           }

                           var45 = var12;
                        }

                        var45.t(var30);
                        var22++;
                     }

                     var12.e /= (float)var22;
                     var12.I /= (float)var22;
                     var12.k /= (float)var22;
                  }

                  var40 = var9;
               }

               if (var5 != null) {
                  if (var40 != 0) {
                     var12.e = -var12.e;
                     var12.I = -var12.I;
                  }

                  var10.e = (float)var34;
                  float var61;
                  var40 = (var61 = var12.k - 0.0F) == 0.0F ? 0 : (var61 < 0.0F ? -1 : 1);
               }

               label163: {
                  if (var40 >= 0) {
                     label160: {
                        YB3 var46 = this;
                        if (var5 != null) {
                           if (this.U == null) {
                              break label160;
                           }

                           this.b.d(var11);
                           this.b.q(var10);
                           this.b.E();
                           this.C.d(var12);
                           this.C.E();
                           this.C.J(2.0F * this.C.Y(this.b));
                           this.C.q(this.V);
                           this.C.E();
                           var46 = this;
                        }

                        var46.r(var13, this.Z(var12, var3, var1, var2));
                        int var35 = var3[var6] & a(10818, 4912725374053247111L);
                        int var36 = (int)(var13.T * 255.0F) << a(18296, 525076245730690491L)
                           | (int)(var13.o * 255.0F) << a(17880, 3620340349748840220L)
                           | (int)(var13.I * 255.0F);
                        var7[var6++] = var35 | var36;
                        if (var5 != null) {
                           break label163;
                        }
                     }

                     var7[var6++] = 0;
                     if (var5 != null) {
                        break label163;
                     }
                  }

                  var7[var6++] = 0;
               }

               var34++;
               if (var5 == null) {
                  break;
               }
            }

            var32++;
            if (var5 == null) {
               return var7;
            }
            continue label216;
         }

         return var7;
      }
   }

   public int Z(Od4 var1, int[] var2, int var3, int var4) {
      String[] var5 = W5.q();
      if (this.U != null) {
         float var6 = 0.5F * (1.0F + var1.e);
         float var7 = 0.5F * (1.0F + var1.I);
         var6 = NM.X(var6 * (float)this.y, 0.0F, (float)(this.y - 1));
         var7 = NM.X(var7 * (float)this.z, 0.0F, (float)(this.z - 1));
         int var8 = (int)var6;
         int var9 = (int)var7;
         float var10 = var6 - (float)var8;
         float var11 = var7 - (float)var9;
         int var12 = this.y * var9 + var8;
         int var10000 = var8;
         if (var5 != null) {
            var10000 = var8 == this.y - 1 ? 0 : 1;
         }

         int var13 = var10000;
         var10000 = var9;
         if (var5 != null) {
            var10000 = var9 == this.z - 1 ? 0 : this.y;
         }

         int var14 = var10000;
         return NM.O(var10, var11, this.e[var12], this.e[var12 + var13], this.e[var12 + var14], this.e[var12 + var13 + var14]);
      } else {
         return 0;
      }
   }

   @Override
   public String toString() {
      return c;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17088;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var39;
      char[] var10003 = "7i7_n\r_KN&Rc\u0012\u0014J3".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 26;
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
         var10007 = 26;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 126;
               break;
            case 1:
               var50 = 7;
               break;
            case 2:
               var50 = 84;
               break;
            case 3:
               var50 = 41;
               break;
            case 4:
               var50 = 29;
               break;
            case 5:
               var50 = 109;
               break;
            default:
               var50 = 32;
         }
      } else {
         var34 = 26;
         var19 = var10004;
         if (var10004 <= var8) {
            var39 = new String(var10003).intern();
            int var25 = -1;
            c = var39;
            long var9 = 7225103857345815336L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "Õ\u0094q@\u0004<k]Kõ©¯û\u001a^\u0098)±¥6\u0086\u0005ç§\u0096Ù\u008cEÐ æ\u0083u6ö¥r\u00adä<Ú^ó,\u0082\u001b\u000b¯";
            int var13 = "Õ\u0094q@\u0004<k]Kõ©¯û\u001a^\u0098)±¥6\u0086\u0005ç§\u0096Ù\u008cEÐ æ\u0083u6ö¥r\u00adä<Ú^ó,\u0082\u001b\u000b¯".length();
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
                           d = var14;
                           f = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "ë¢\u000b\u008dMÏ\u0083\u009fh¸ë&Ý´Ö\u0083";
                        var13 = "ë¢\u000b\u008dMÏ\u0083\u009fh¸ë&Ý´Ö\u0083".length();
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
         var10007 = 26;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 126;
               break;
            case 1:
               var50 = 7;
               break;
            case 2:
               var50 = 84;
               break;
            case 3:
               var50 = 41;
               break;
            case 4:
               var50 = 29;
               break;
            case 5:
               var50 = 109;
               break;
            default:
               var50 = 32;
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
                  var50 = 126;
                  break;
               case 1:
                  var50 = 7;
                  break;
               case 2:
                  var50 = 84;
                  break;
               case 3:
                  var50 = 41;
                  break;
               case 4:
                  var50 = 29;
                  break;
               case 5:
                  var50 = 109;
                  break;
               default:
                  var50 = 32;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               c = var36;
               long var0 = 7225103857345815336L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "Õ\u0094q@\u0004<k]Kõ©¯û\u001a^\u0098)±¥6\u0086\u0005ç§\u0096Ù\u008cEÐ æ\u0083u6ö¥r\u00adä<Ú^ó,\u0082\u001b\u000b¯";
               int var5 = "Õ\u0094q@\u0004<k]Kõ©¯û\u001a^\u0098)±¥6\u0086\u0005ç§\u0096Ù\u008cEÐ æ\u0083u6ö¥r\u00adä<Ú^ó,\u0082\u001b\u000b¯".length();
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
                              d = var6;
                              f = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "ë¢\u000b\u008dMÏ\u0083\u009fh¸ë&Ý´Ö\u0083";
                           var5 = "ë¢\u000b\u008dMÏ\u0083\u009fh¸ë&Ý´Ö\u0083".length();
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
                  var50 = 126;
                  break;
               case 1:
                  var50 = 7;
                  break;
               case 2:
                  var50 = 84;
                  break;
               case 3:
                  var50 = 41;
                  break;
               case 4:
                  var50 = 29;
                  break;
               case 5:
                  var50 = 109;
                  break;
               default:
                  var50 = 32;
            }
         }
      }
   }
   private static Object var38;
}





