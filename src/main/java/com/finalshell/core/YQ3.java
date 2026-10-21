package com.finalshell.core;

import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class YQ3 extends GT3 {
   public Po2 O = new WY3();
   public float t = 0.0F;
   public float i = 0.5F;
   public float M = 0.0F;
   public int x = a(23965, 4805033606505485566L);
   public Random J;
   public long W;
   public int a;
   public float h;
   public int K;
   public boolean r;
   public static String b;
   public static long[] c;
   public static Integer[] d;
   public static long e;

   public YQ3() {
      this.W = e;
      this.a = 1;
      this.h = 0.5F;
      this.K = 0;
      this.r = false;
      this.J = new Random();
   }

   public void W(int var1) {
      this.a = var1;
   }

   public int q() {
      return this.a;
   }

   public void Z(int var1) {
      this.x = var1;
   }

   public int U$int() {
      return this.x;
   }

   public void f(float var1) {
      this.i = var1;
   }

   public float A() {
      return this.i;
   }

   public void t(float var1) {
      this.M = var1;
   }

   public float d() {
      return this.M;
   }

   public void U(float var1) {
      this.t = var1;
   }

   public float U$float() {
      return this.t;
   }

   public void a(float var1) {
      this.h = var1;
   }

   public float Q() {
      return this.h;
   }

   public void o(int var1) {
      this.K = var1;
   }

   public int v() {
      return this.K;
   }

   public void Z(boolean var1) {
      this.r = var1;
   }

   public boolean G() {
      return this.r;
   }

   public void n() {
      this.W = new Date().getTime();
   }

   public float n(float var1, float var2) {
      return var1 + (var2 - var1) * this.J.nextFloat();
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var62;
      int var69;
      String[] var10000 = W5.q();
      int[] var6 = new int[var1 * var2];
      this.J.setSeed(this.W);
      float var7 = (float)Math.sin((double)this.t);
      String[] var5 = var10000;
      float var8 = (float)Math.cos((double)this.t);
      int var9 = 0;
      int var11 = 0;

      while (true) {
         if (var11 < var2) {
            var62 = 0;
            if (var5 == null) {
               break;
            }

            int var12 = 0;

            while (var12 < var1) {
               if (var5 == null) {
                  return var6;
               }

               int var10002 = (this.r) ? 1 : 0;
               if (var5 != null) {
                  var10002 = this.r ? -1 : var3[var9];
               }

               var6[var9] = var10002;
               var9++;
               var12++;
               if (var5 == null) {
                  break;
               }
            }

            var11++;
            if (var5 != null) {
               continue;
            }
         }

         var62 = this.a;
         break;
      }

      label481: {
         label482: {
            if (var5 != null) {
               switch (var62) {
                  case 0:
                     var62 = (int)(2.0F * this.i * (float)var1 * (float)var2 / (float)(this.x + 1));
                     break;
                  case 1:
                     break label482;
                  case 2:
                  case 3:
                     break label481;
                  default:
                     return var6;
               }
            }

            int var10 = var62;
            var9 = 0;

            do {
               int var64 = var9;

               label440:
               while (true) {
                  if (var64 >= var10) {
                     return var6;
                  }

                  var11 = (this.J.nextInt() & a(31625, 6126975531332170473L)) % var1;
                  int var37 = (this.J.nextInt() & a(28444, 4336861264610748030L)) % var2;
                  int var13 = this.J.nextInt() % this.x + 1;
                  if (var5 == null) {
                     return var3;
                  }

                  int var14 = var3[var37 * var1 + var11];
                  int var15 = var11 - var13;

                  label419: {
                     while (var15 < var11 + var13 + 1) {
      int var65;
                        var65 = var15;
                        if (var5 == null) {
                           break label419;
                        }

                        label486: {
                           if (var5 != null) {
                              if (var15 < 0) {
                                 break label486;
                              }

                              var65 = var15;
                           }

                           if (var5 != null) {
                              if (var65 >= var1) {
                                 break label486;
                              }

                              var65 = this.r;
                           }

                           if (var5 != null) {
                              var65 = var65 != 0 ? -1 : var6[var37 * var1 + var15];
                           }

                           int var16 = var65;
                           var6[var37 * var1 + var15] = NM.n(this.h, var16, var14);
                        }

                        var15++;
                        if (var5 == null) {
                           break;
                        }
                     }

                     var65 = var37 - var13;
                  }

                  var15 = var65;

                  while (true) {
                     if (var15 >= var37 + var13 + 1) {
                        break label440;
                     }

                     var64 = var15;
                     if (var5 == null) {
                        break;
                     }

                     label488: {
                        if (var5 != null) {
                           if (var15 < 0) {
                              break label488;
                           }

                           var64 = var15;
                        }

                        if (var5 != null) {
                           if (var64 >= var2) {
                              break label488;
                           }

                           var64 = this.r;
                        }

                        if (var5 != null) {
                           var64 = var64 != 0 ? -1 : var6[var15 * var1 + var11];
                        }

                        int var49 = var64;
                        var6[var15 * var1 + var11] = NM.n(this.h, var49, var14);
                     }

                     var15++;
                     if (var5 == null) {
                        break label440;
                     }
                  }
               }

               var9++;
            } while (var5 != null);
         }

         int var32 = (int)(2.0F * this.i * (float)var1 * (float)var2 / 2.0F);
         var9 = 0;

         do {
            int var66 = var9;

            label389:
            while (true) {
               int var20;
               int var21;
               int var22;
               int var26;
               int var27;
               int var40;
               int var47;
               int var52;
               int var10001;
               label357:
               while (true) {
                  if (var66 >= var32) {
                     return var6;
                  }

                  var11 = (this.J.nextInt() & a(28444, 4336861264610748030L)) % var1;
                  int var38 = (this.J.nextInt() & a(28444, 4336861264610748030L)) % var2;
                  if (var5 == null) {
                     return var3;
                  }

                  int var17;
                  int var18;
                  int var19;
                  label294: {
                     var40 = var3[var38 * var1 + var11];
                     int var42 = (this.J.nextInt() & a(28444, 4336861264610748030L)) % this.x;
                     var47 = (int)((float)var42 * var8);
                     var52 = (int)((float)var42 * var7);
                     var17 = var11 - var47;
                     var18 = var38 - var52;
                     var19 = var11 + var47;
                     var20 = var38 + var52;
                     int var67 = var19;
                     if (var5 != null) {
                        if (var19 < var17) {
                           var26 = -1;
                           if (var5 != null) {
                              break label294;
                           }
                        }

                        var67 = 1;
                     }

                     var26 = var67;
                  }

                  label301: {
                     int var68 = var20;
                     if (var5 != null) {
                        if (var20 < var18) {
                           var27 = -1;
                           if (var5 != null) {
                              break label301;
                           }
                        }

                        var68 = 1;
                     }

                     var27 = var68;
                  }

                  var47 = var19 - var17;
                  var52 = var20 - var18;
                  var47 = Math.abs(var47);
                  var52 = Math.abs(var52);
                  var21 = var17;
                  var22 = var18;
                  var69 = var17;
                  var10001 = var1;
                  label305:
                  if (var5 != null) {
                     label316: {
                        if (var17 < var1) {
                           var69 = var17;
                           if (var5 == null) {
                              break label316;
                           }

                           if (var17 >= 0) {
                              var69 = var18;
                              var10001 = var2;
                              if (var5 == null) {
                                 break label305;
                              }

                              if (var18 < var2) {
                                 var69 = var18;
                                 if (var5 == null) {
                                    break label316;
                                 }

                                 if (var18 >= 0) {
                                    int var70 = this.r;
                                    if (var5 != null) {
                                       var70 = this.r ? -1 : var6[var18 * var1 + var17];
                                    }

                                    int var28 = var70;
                                    var6[var18 * var1 + var17] = NM.n(this.h, var28, var40);
                                 }
                              }
                           }
                        }

                        var69 = Math.abs(var47);
                     }

                     var10001 = Math.abs(var52);
                  }

                  if (var5 == null) {
                     break;
                  }

                  if (var69 > var10001) {
                     int var23 = 2 * var52 - var47;
                     int var24 = 2 * var52;
                     int var25 = 2 * (var52 - var47);

                     while (true) {
                        if (var21 == var19) {
                           break label389;
                        }

                        var66 = var23;
                        if (var5 == null) {
                           continue label357;
                        }

                        label349: {
                           if (var5 != null) {
                              if (var23 <= 0) {
                                 var23 += var24;
                                 if (var5 != null) {
                                    break label349;
                                 }
                              }

                              var23 += var25;
                              var66 = var22 + var27;
                           }

                           var22 = var66;
                        }

                        var21 += var26;
                        int var71 = var21;
                        if (var5 != null) {
                           if (var21 >= var1) {
                              continue;
                           }

                           var71 = var21;
                        }

                        if (var5 != null) {
                           if (var71 < 0) {
                              continue;
                           }

                           var71 = var22;
                        }

                        if (var5 != null) {
                           if (var71 >= var2) {
                              continue;
                           }

                           var71 = var22;
                        }

                        if (var5 != null) {
                           if (var71 < 0) {
                              continue;
                           }

                           var71 = this.r;
                        }

                        if (var5 != null) {
                           var71 = var71 != 0 ? -1 : var6[var22 * var1 + var21];
                        }

                        int var60 = var71;
                        var6[var22 * var1 + var21] = NM.n(this.h, var60, var40);
                        if (var5 == null) {
                           break;
                        }
                     }
                  }

                  var69 = 2 * var47;
                  var10001 = var52;
                  break;
               }

               int var57 = var69 - var10001;
               int var58 = 2 * var47;
               int var59 = 2 * (var47 - var52);

               while (true) {
                  if (var22 == var20) {
                     break label389;
                  }

                  var66 = var57;
                  if (var5 == null) {
                     break;
                  }

                  label384: {
                     if (var5 != null) {
                        if (var57 <= 0) {
                           var57 += var58;
                           if (var5 != null) {
                              break label384;
                           }
                        }

                        var57 += var59;
                        var66 = var21 + var26;
                     }

                     var21 = var66;
                  }

                  var22 += var27;
                  int var72 = var21;
                  if (var5 != null) {
                     if (var21 >= var1) {
                        continue;
                     }

                     var72 = var21;
                  }

                  if (var5 != null) {
                     if (var72 < 0) {
                        continue;
                     }

                     var72 = var22;
                  }

                  if (var5 != null) {
                     if (var72 >= var2) {
                        continue;
                     }

                     var72 = var22;
                  }

                  if (var5 != null) {
                     if (var72 < 0) {
                        continue;
                     }

                     var72 = this.r;
                  }

                  if (var5 != null) {
                     var72 = var72 != 0 ? -1 : var6[var22 * var1 + var21];
                  }

                  int var61 = var72;
                  var6[var22 * var1 + var21] = NM.n(this.h, var61, var40);
                  if (var5 == null) {
                     break label389;
                  }
               }
            }

            var9++;
         } while (var5 != null);
      }

      var11 = this.x + 1;
      int var39 = var11 * var11;
      int var33 = (int)(2.0F * this.i * (float)var1 * (float)var2 / (float)var11);
      var9 = 0;

      do {
         int var73 = var9;

         label272:
         while (true) {
            if (var73 >= var33) {
               return var6;
            }

            int var41 = (this.J.nextInt() & a(28444, 4336861264610748030L)) % var1;
            int var43 = (this.J.nextInt() & a(28444, 4336861264610748030L)) % var2;
            if (var5 == null) {
               return var3;
            }

            int var48 = var3[var43 * var1 + var41];
            int var53 = var41 - var11;

            while (true) {
               int var74 = var53;
               int var76 = var41 + var11 + 1;

               label267:
               while (true) {
                  if (var74 >= var76) {
                     break label272;
                  }

                  var73 = var43 - var11;
                  if (var5 == null) {
                     continue label272;
                  }

                  int var54 = var73;

                  while (true) {
                     if (var54 >= var43 + var11 + 1) {
                        break label267;
                     }

                     int var55;
                     label262: {
                        var74 = this.a;
                        if (var5 != null) {
                           var76 = 2;
                           if (var5 == null) {
                              break;
                           }

                           if (this.a == 2) {
                              var55 = (var53 - var41) * (var53 - var41) + (var54 - var43) * (var54 - var43);
                              if (var5 != null) {
                                 break label262;
                              }
                           }

                           var74 = 0;
                        }

                        var55 = var74;
                     }

                     label501: {
                        int var75 = var53;
                        if (var5 != null) {
                           if (var53 < 0) {
                              break label501;
                           }

                           var75 = var53;
                        }

                        if (var5 != null) {
                           if (var75 >= var1) {
                              break label501;
                           }

                           var75 = var54;
                        }

                        if (var5 != null) {
                           if (var75 < 0) {
                              break label501;
                           }

                           var75 = var54;
                        }

                        label502: {
                           var76 = var2;
                           if (var5 != null) {
                              if (var75 >= var2) {
                                 break label501;
                              }

                              var75 = var55;
                              if (var5 == null) {
                                 break label502;
                              }

                              var76 = var39;
                           }

                           if (var75 > var76) {
                              break label501;
                           }

                           var75 = this.r;
                        }

                        if (var5 != null) {
                           var75 = var75 != 0 ? -1 : var6[var54 * var1 + var53];
                        }

                        int var56 = var75;
                        var6[var54 * var1 + var53] = NM.n(this.h, var56, var48);
                     }

                     var54++;
                     if (var5 == null) {
                        break label267;
                     }
                  }
               }

               var53++;
               if (var5 == null) {
                  break label272;
               }
            }
         }

         var9++;
      } while (var5 != null);

      return var6;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2402;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Fu'\bICJ,@,\bKE\u0017-=".toCharArray();
      int var10004 = var10003.length;
      int var10 = 0;
      byte var32 = 15;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var38;
      byte var44;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var38 = var10003;
         var10005 = var10;
         char var10008 = var10003[var10];
         var10007 = 15;
         var10006 = var10008;
         switch (var10 % 7) {
            case 0:
               var44 = 12;
               break;
            case 1:
               var44 = 28;
               break;
            case 2:
               var44 = 78;
               break;
            case 3:
               var44 = 98;
               break;
            case 4:
               var44 = 37;
               break;
            case 5:
               var44 = 56;
               break;
            default:
               var44 = 54;
         }
      } else {
         var32 = 15;
         var19 = var10004;
         if (var10004 <= var10) {
            String var36 = new String(var10003).intern();
            int var25 = -1;
            b = var36;
            long var12 = 5776289087962842112L;
            long[] var17 = new long[3];
            int var14 = 0;
            String var15 = "é\u009f¾D\u0095D\u001d\u0081ò]ot&oPö|\u009cXÙ¤\u0092\t\u0016";
            int var16 = "é\u009f¾D\u0095D\u001d\u0081ò]ot&oPö|\u009cXÙ¤\u0092\t\u0016".length();
            byte var13 = 0;

            do {
               var25 = var13;
               var13 += 8;
               byte[] var18 = var15.substring(var25, var13).getBytes("ISO-8859-1");
               var25 = var14++;
               long var42 = (
                     ((long)var18[0] & 255L) << 56
                        | ((long)var18[1] & 255L) << 48
                        | ((long)var18[2] & 255L) << 40
                        | ((long)var18[3] & 255L) << 32
                        | ((long)var18[4] & 255L) << 24
                        | ((long)var18[5] & 255L) << 16
                        | ((long)var18[6] & 255L) << 8
                        | (long)var18[7] & 255L
                  )
                  ^ var12;
               byte var37 = -1;
               var17[var25] = var42;
            } while (var13 < var16);

            c = var17;
            d = new Integer[3];
            long var11 = 1965613845076084500L;
            long var31 = 1965613845076084003L ^ var11;
            byte var28 = -1;
            e = var31;
            return;
         }

         var38 = var10003;
         var10005 = var10;
         char var45 = var10003[var10];
         var10007 = 15;
         var10006 = var45;
         switch (var10 % 7) {
            case 0:
               var44 = 12;
               break;
            case 1:
               var44 = 28;
               break;
            case 2:
               var44 = 78;
               break;
            case 3:
               var44 = 98;
               break;
            case 4:
               var44 = 37;
               break;
            case 5:
               var44 = 56;
               break;
            default:
               var44 = 54;
         }
      }

      while (true) {
         var38[var10005] = (char)(var10006 ^ var10007 ^ var44);
         var10++;
         if (var32 == 0) {
            var38 = var10002;
            var10005 = var32;
            char var47 = var10002[var32];
            var10007 = var32;
            var10006 = var47;
            switch (var10 % 7) {
               case 0:
                  var44 = 12;
                  break;
               case 1:
                  var44 = 28;
                  break;
               case 2:
                  var44 = 78;
                  break;
               case 3:
                  var44 = 98;
                  break;
               case 4:
                  var44 = 37;
                  break;
               case 5:
                  var44 = 56;
                  break;
               default:
                  var44 = 54;
            }
         } else {
            if (var19 <= var10) {
               String var34 = new String(var10002).intern();
               int var21 = -1;
               b = var34;
               long var2 = 5776289087962842112L;
               long[] var8 = new long[3];
               int var5 = 0;
               String var6 = "é\u009f¾D\u0095D\u001d\u0081ò]ot&oPö|\u009cXÙ¤\u0092\t\u0016";
               int var7 = "é\u009f¾D\u0095D\u001d\u0081ò]ot&oPö|\u009cXÙ¤\u0092\t\u0016".length();
               byte var4 = 0;

               do {
                  var21 = var4;
                  var4 += 8;
                  byte[] var9 = var6.substring(var21, var4).getBytes("ISO-8859-1");
                  var21 = var5++;
                  long var41 = (
                        ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L
                     )
                     ^ var2;
                  byte var35 = -1;
                  var8[var21] = var41;
               } while (var4 < var7);

               c = var8;
               d = new Integer[3];
               long var0 = 1965613845076084500L;
               long var30 = 1965613845076084003L ^ var0;
               byte var24 = -1;
               e = var30;
               return;
            }

            var38 = var10002;
            var10005 = var10;
            char var46 = var10002[var10];
            var10007 = var32;
            var10006 = var46;
            switch (var10 % 7) {
               case 0:
                  var44 = 12;
                  break;
               case 1:
                  var44 = 28;
                  break;
               case 2:
                  var44 = 78;
                  break;
               case 3:
                  var44 = 98;
                  break;
               case 4:
                  var44 = 37;
                  break;
               case 5:
                  var44 = 56;
                  break;
               default:
                  var44 = 54;
            }
         }
      }
   }
}





