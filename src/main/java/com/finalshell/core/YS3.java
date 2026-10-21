package com.finalshell.core;

import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class YS3 extends GT3 {
   public Random e;
   public long K;
   public int C;
   public float T;
   public float F;
   public float k;
   public float U;
   public int L;
   public Po2 c;
   public static String a;
   public static long[] b;
   public static Integer[] d;
   public static long f;

   public YS3() {
      this.K = f;
      this.C = a(17332, 1538895026123534988L);
      this.T = -0.59F;
      this.F = 0.2F;
      this.k = 0.1F;
      this.U = 0.0F;
      this.L = 0;
      this.c = new WY3();
      this.e = new Random();
   }

   public void O() {
      this.K = new Date().getTime();
      this.e.setSeed(this.K);
      this.T = this.e.nextFloat();
      this.F = this.e.nextFloat();
      this.k = this.e.nextFloat();
      this.U = this.e.nextFloat();
      this.L = this.e.nextInt() % a(19264, 3875235779454368377L) - a(12597, 990897168677535759L);
   }

   public void g(int var1) {
      this.C = var1;
   }

   public int N() {
      return this.C;
   }

   public void e(float var1) {
      this.T = var1;
   }

   public float X() {
      return this.T;
   }

   public void h(float var1) {
      this.F = var1;
   }

   public float G() {
      return this.F;
   }

   public void U(float var1) {
      this.k = var1;
   }

   public float e() {
      return this.k;
   }

   public void s(float var1) {
      this.U = var1;
   }

   public float L() {
      return this.U;
   }

   public void t(int var1) {
      this.L = var1;
   }

   public int v() {
      return this.L;
   }

   public void W(Po2 var1) {
      this.c = var1;
   }

   public Po2 u() {
      return this.c;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int[] var6 = new int[var1 * var2];
      boolean var7 = false;
      String[] var10000 = W5.q();
      int var8 = 0;
      float var9 = 0.1F;
      float var10 = 0.3F;
      String[] var5 = var10000;
      int var11 = 0;

      while (true) {
         if (var11 < a(29699, 1674709265105208632L)) {
            float var12;
            float var13;
            float var15;
            label139: {
               var12 = (float) Math.PI * var9;
               var13 = (float) Math.PI * var10;
               float var14 = (float)Math.sin((double)(2.0F * var12));
               var15 = (float)Math.sin((double)(2.0F * var13));
               float var16 = (float)(
                  (double)(this.T * var14)
                     + (double)(this.F * var14) * Math.cos((double)(2.0F * var13))
                     + (double)this.k * Math.sin((double)(4.0F * var12))
                     + (double)this.U * Math.sin((double)(6.0F * var12)) * Math.cos((double)(4.0F * var13))
                     + (double)((float)this.L * var9)
               );
               float var33 = var16;
               float var10001 = 0.0F;
               if (var5 != null) {
                  float var47;
                  var34 = (var47 = var16 - 0.0F) == 0.0F ? 0 : (var47 < 0.0F ? -1 : 1);
                  if (var5 == null) {
                     break;
                  }

                  if (var34 >= 0) {
                     var35 = var16 - (float)((int)var16);
                     break label139;
                  }

                  var33 = var16 - (float)((int)var16);
                  var10001 = 1.0F;
               }

               var35 = var33 + var10001;
            }

            float var29;
            label132: {
               var29 = var35;
               float var17 = (float)(
                  (double)(this.T * var15)
                     + (double)(this.F * var15) * Math.cos((double)(2.0F * var12))
                     + (double)this.k * Math.sin((double)(4.0F * var13))
                     + (double)this.U * Math.sin((double)(6.0F * var13)) * Math.cos((double)(4.0F * var12))
                     + (double)((float)this.L * var10)
               );
               float var36 = var17;
               float var44 = 0.0F;
               if (var5 != null) {
                  if (var17 >= 0.0F) {
                     var37 = var17 - (float)((int)var17);
                     break label132;
                  }

                  var36 = var17 - (float)((int)var17);
                  var44 = 1.0F;
               }

               var37 = var36 + var44;
            }

            float var31 = var37;
            var9 = var29;
            var10 = var31;
            var11++;
            if (var5 != null) {
               continue;
            }
         }

         var34 = 0;
         break;
      }

      var11 = var34;

      while (true) {
         if (var11 < this.C) {
            float var23;
            float var24;
            label117: {
               var23 = (float) Math.PI * var9;
               var24 = (float) Math.PI * var10;
               float var25 = (float)(
                  (double)this.T * Math.sin((double)(2.0F * var23))
                     + (double)this.F * Math.sin((double)(2.0F * var23)) * Math.cos((double)(2.0F * var24))
                     + (double)this.k * Math.sin((double)(4.0F * var23))
                     + (double)this.U * Math.sin((double)(6.0F * var23)) * Math.cos((double)(4.0F * var24))
                     + (double)((float)this.L * var9)
               );
               float var38 = var25;
               float var45 = 0.0F;
               if (var5 != null) {
                  float var48;
                  var39 = (var48 = var25 - 0.0F) == 0.0F ? 0 : (var48 < 0.0F ? -1 : 1);
                  if (var5 == null) {
                     break;
                  }

                  if (var39 >= 0) {
                     var40 = var25 - (float)((int)var25);
                     break label117;
                  }

                  var38 = var25 - (float)((int)var25);
                  var45 = 1.0F;
               }

               var40 = var38 + var45;
            }

            float var26;
            label110: {
               var26 = var40;
               float var27 = (float)(
                  (double)this.T * Math.sin((double)(2.0F * var24))
                     + (double)this.F * Math.sin((double)(2.0F * var24)) * Math.cos((double)(2.0F * var23))
                     + (double)this.k * Math.sin((double)(4.0F * var24))
                     + (double)this.U * Math.sin((double)(6.0F * var24)) * Math.cos((double)(4.0F * var23))
                     + (double)((float)this.L * var10)
               );
               float var41 = var27;
               float var46 = 0.0F;
               if (var5 != null) {
                  if (var27 >= 0.0F) {
                     var42 = var27 - (float)((int)var27);
                     break label110;
                  }

                  var41 = var27 - (float)((int)var27);
                  var46 = 1.0F;
               }

               var42 = var41 + var46;
            }

            float var28 = var42;
            var9 = var26;
            var10 = var28;
            int var30 = (int)((float)var1 * var26);
            int var32 = (int)((float)var2 * var28);
            label86:
            if (var5 != null) {
               label102:
               if (var30 >= 0) {
                  int var43 = var30;
                  if (var5 != null) {
                     if (var30 >= var1) {
                        break label102;
                     }

                     var43 = var32;
                  }

                  if (var5 != null) {
                     if (var43 < 0) {
                        break label102;
                     }

                     var43 = var32;
                  }

                  if (var5 != null) {
                     if (var43 >= var2) {
                        break label102;
                     }

                     var43 = var6[var1 * var32 + var30]++;
                  }

                  int var18 = var43;
                  if (var5 == null) {
                     break label86;
                  }

                  if (var18 > var8) {
                     var8 = var18;
                  }
               }

               var11++;
            }

            if (var5 != null) {
               continue;
            }
         }

         if (this.c == null) {
            return var6;
         }

         var39 = 0;
         break;
      }

      var11 = var39;
      var10 = 0.0F;

      while (var10 < (float)var2) {
         var9 = 0.0F;

         label72: {
            while (var9 < (float)var1) {
               var6[var11] = this.c.D((float)var6[var11] / (float)var8);
               var11++;
               var9++;
               if (var5 == null) {
                  break label72;
               }

               if (var5 == null) {
                  break;
               }
            }

            var10++;
         }

         if (var5 == null) {
            break;
         }
      }

      return var6;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12602;
      if (d[var3] == null) {
         d[var3] = (int)(b[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "1/\u00037sZEJ\t\u0013\"i\\I\u0006j*6oDTKdU".toCharArray();
      int var10004 = var10003.length;
      int var10 = 0;
      byte var41 = 121;
      char[] var10002 = var10003;
      int var22 = var10004;
      char[] var49;
      byte var57;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var49 = var10003;
         var10005 = var10;
         char var10008 = var10003[var10];
         var10007 = 121;
         var10006 = var10008;
         switch (var10 % 7) {
            case 0:
               var57 = 28;
               break;
            case 1:
               var57 = 51;
               break;
            case 2:
               var57 = 2;
               break;
            case 3:
               var57 = 58;
               break;
            case 4:
               var57 = 127;
               break;
            case 5:
               var57 = 81;
               break;
            default:
               var57 = 89;
         }
      } else {
         var41 = 121;
         var22 = var10004;
         if (var10004 <= var10) {
            String var46 = new String(var10003).intern();
            int var29 = -1;
            a = var46;
            long var12 = 7049120754019460150L;
            long[] var17 = new long[4];
            int var14 = 0;
            String var15 = "²\u0099ý²ÉÞä3Ü\u0095cäz\u008f!\u001a";
            int var16 = "²\u0099ý²ÉÞä3Ü\u0095cäz\u008f!\u001a".length();
            byte var13 = 0;

            label71:
            while (true) {
               var29 = var13;
               var13 += 8;
               byte[] var19 = var15.substring(var29, var13).getBytes("ISO-8859-1");
               long[] var21 = var17;
               var29 = var14++;
               long var38 = ((long)var19[0] & 255L) << 56
                  | ((long)var19[1] & 255L) << 48
                  | ((long)var19[2] & 255L) << 40
                  | ((long)var19[3] & 255L) << 32
                  | ((long)var19[4] & 255L) << 24
                  | ((long)var19[5] & 255L) << 16
                  | ((long)var19[6] & 255L) << 8
                  | (long)var19[7] & 255L;
               byte var47 = -1;

               while (true) {
                  long var55 = var38 ^ var12;
                  switch (var47) {
                     case 0:
                        var21[var29] = var55;
                        if (var13 >= var16) {
                           b = var17;
                           d = new Integer[4];
                           long var11 = 6032348651970375071L;
                           long var40 = 6032348651970375592L ^ var11;
                           byte var33 = -1;
                           f = var40;
                           return;
                        }
                        break;
                     default:
                        var21[var29] = var55;
                        if (var13 < var16) {
                           continue label71;
                        }

                        var15 = "°;Dî(\u009c÷\u0012ç\u000e\u007f|\u008dk\u001e[";
                        var16 = "°;Dî(\u009c÷\u0012ç\u000e\u007f|\u008dk\u001e[".length();
                        var13 = 0;
                  }

                  byte var32 = var13;
                  var13 += 8;
                  var19 = var15.substring(var32, var13).getBytes("ISO-8859-1");
                  var21 = var17;
                  var29 = var14++;
                  var38 = ((long)var19[0] & 255L) << 56
                     | ((long)var19[1] & 255L) << 48
                     | ((long)var19[2] & 255L) << 40
                     | ((long)var19[3] & 255L) << 32
                     | ((long)var19[4] & 255L) << 24
                     | ((long)var19[5] & 255L) << 16
                     | ((long)var19[6] & 255L) << 8
                     | (long)var19[7] & 255L;
                  var47 = 0;
               }
            }
         }

         var49 = var10003;
         var10005 = var10;
         char var58 = var10003[var10];
         var10007 = 121;
         var10006 = var58;
         switch (var10 % 7) {
            case 0:
               var57 = 28;
               break;
            case 1:
               var57 = 51;
               break;
            case 2:
               var57 = 2;
               break;
            case 3:
               var57 = 58;
               break;
            case 4:
               var57 = 127;
               break;
            case 5:
               var57 = 81;
               break;
            default:
               var57 = 89;
         }
      }

      while (true) {
         var49[var10005] = (char)(var10006 ^ var10007 ^ var57);
         var10++;
         if (var41 == 0) {
            var49 = var10002;
            var10005 = var41;
            char var60 = var10002[var41];
            var10007 = var41;
            var10006 = var60;
            switch (var10 % 7) {
               case 0:
                  var57 = 28;
                  break;
               case 1:
                  var57 = 51;
                  break;
               case 2:
                  var57 = 2;
                  break;
               case 3:
                  var57 = 58;
                  break;
               case 4:
                  var57 = 127;
                  break;
               case 5:
                  var57 = 81;
                  break;
               default:
                  var57 = 89;
            }
         } else {
            if (var22 <= var10) {
               String var43 = new String(var10002).intern();
               int var24 = -1;
               a = var43;
               long var2 = 7049120754019460150L;
               long[] var8 = new long[4];
               int var5 = 0;
               String var6 = "²\u0099ý²ÉÞä3Ü\u0095cäz\u008f!\u001a";
               int var7 = "²\u0099ý²ÉÞä3Ü\u0095cäz\u008f!\u001a".length();
               byte var4 = 0;

               label37:
               while (true) {
                  var24 = var4;
                  var4 += 8;
                  byte[] var9 = var6.substring(var24, var4).getBytes("ISO-8859-1");
                  long[] var10000 = var8;
                  var24 = var5++;
                  long var35 = ((long)var9[0] & 255L) << 56
                     | ((long)var9[1] & 255L) << 48
                     | ((long)var9[2] & 255L) << 40
                     | ((long)var9[3] & 255L) << 32
                     | ((long)var9[4] & 255L) << 24
                     | ((long)var9[5] & 255L) << 16
                     | ((long)var9[6] & 255L) << 8
                     | (long)var9[7] & 255L;
                  byte var44 = -1;

                  while (true) {
                     long var53 = var35 ^ var2;
                     switch (var44) {
                        case 0:
                           var10000[var24] = var53;
                           if (var4 >= var7) {
                              b = var8;
                              d = new Integer[4];
                              long var0 = 6032348651970375071L;
                              long var37 = 6032348651970375592L ^ var0;
                              byte var28 = -1;
                              f = var37;
                              return;
                           }
                           break;
                        default:
                           var10000[var24] = var53;
                           if (var4 < var7) {
                              continue label37;
                           }

                           var6 = "°;Dî(\u009c÷\u0012ç\u000e\u007f|\u008dk\u001e[";
                           var7 = "°;Dî(\u009c÷\u0012ç\u000e\u007f|\u008dk\u001e[".length();
                           var4 = 0;
                     }

                     byte var27 = var4;
                     var4 += 8;
                     var9 = var6.substring(var27, var4).getBytes("ISO-8859-1");
                     var10000 = var8;
                     var24 = var5++;
                     var35 = ((long)var9[0] & 255L) << 56
                        | ((long)var9[1] & 255L) << 48
                        | ((long)var9[2] & 255L) << 40
                        | ((long)var9[3] & 255L) << 32
                        | ((long)var9[4] & 255L) << 24
                        | ((long)var9[5] & 255L) << 16
                        | ((long)var9[6] & 255L) << 8
                        | (long)var9[7] & 255L;
                     var44 = 0;
                  }
               }
            }

            var49 = var10002;
            var10005 = var10;
            char var59 = var10002[var10];
            var10007 = var41;
            var10006 = var59;
            switch (var10 % 7) {
               case 0:
                  var57 = 28;
                  break;
               case 1:
                  var57 = 51;
                  break;
               case 2:
                  var57 = 2;
                  break;
               case 3:
                  var57 = 58;
                  break;
               case 4:
                  var57 = 127;
                  break;
               case 5:
                  var57 = 81;
                  break;
               default:
                  var57 = 89;
            }
         }
      }
   }
}





