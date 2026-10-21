package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.Random;

public class UZ implements E32, SC, R__2 {
   public static Random q;
   public static int[] U;
   public static float[][] Z;
   public static float[][] m;
   public static float[] u;
   public static boolean D;
   public static String R;
   public static long[] a;
   public static Integer[] b;

   @Override
   public float H(float var1) {
      return x(var1);
   }

   @Override
   public float h(float var1, float var2) {
      return x(var1, var2);
   }

   @Override
   public float K(float var1, float var2, float var3) {
      return G(var1, var2, var3);
   }

   public static float q(float var0, float var1, float var2) {
      String var10000 = h();
      float var4 = 0.0F;
      float var5 = 1.0F;
      String var3 = var10000;

      while (true) {
         if (var5 <= var2) {
            var4 += Math.abs(x(var5 * var0, var5 * var1)) / var5;
            var6 = var5 * 2.0F;
            if (var3 != null) {
               break;
            }

            var5 = var6;
            if (var3 == null) {
      float var6;
      float var6;
               continue;
            }
         }

         var6 = var4;
         break;
      }

      return var6;
   }

   public static float b(float var0, float var1, float var2, float var3) {
      float var5 = 0.0F;
      String var10000 = h();
      float var6 = 1.0F;
      String var4 = var10000;

      while (true) {
         if (var6 <= var3) {
            var5 += Math.abs(G(var6 * var0, var6 * var1, var6 * var2)) / var6;
            var7 = var6 * 2.0F;
            if (var4 != null) {
               break;
            }

            var6 = var7;
            if (var4 == null) {
               continue;
            }
         }

         var7 = var5;
         break;
      }

      return var7;
   }

   public static float X(float var0) {
      return var0 * var0 * (3.0F - 2.0F * var0);
   }

   public static float x(float var0) {
      label13: {
         String var1 = h();
         boolean var10000 = D;
         if (var1 == null) {
            if (!D) {
               break label13;
            }

            var10000 = false;
         }

         D = var10000;
         c();
      }

      float var7 = var0 + 4096.0F;
      int var2 = (int)var7 & a(11238, 5150438208742926474L);
      int var3 = var2 + 1 & a(11238, 5150438208742926474L);
      float var4 = var7 - (float)((int)var7);
      float var5 = var4 - 1.0F;
      float var6 = X(var4);
      float var8 = var4 * u[U[var2]];
      float var9 = var5 * u[U[var3]];
      return 2.3F * h(var6, var8, var9);
   }

   public static float x(float var0, float var1) {
      label13: {
         String var2 = h();
         boolean var10000 = D;
         if (var2 == null) {
            if (!D) {
               break label13;
            }

            var10000 = false;
         }

         D = var10000;
         c();
      }

      float var20 = var0 + 4096.0F;
      int var3 = (int)var20 & a(11588, 6200431532376796714L);
      int var4 = var3 + 1 & a(11238, 5150438208742926474L);
      float var11 = var20 - (float)((int)var20);
      float var12 = var11 - 1.0F;
      var20 = var1 + 4096.0F;
      int var5 = (int)var20 & a(11238, 5150438208742926474L);
      int var6 = var5 + 1 & a(11238, 5150438208742926474L);
      float var13 = var20 - (float)((int)var20);
      float var14 = var13 - 1.0F;
      int var23 = U[var3];
      int var24 = U[var4];
      int var7 = U[var23 + var5];
      int var8 = U[var24 + var5];
      int var9 = U[var23 + var6];
      int var10 = U[var24 + var6];
      float var16 = X(var11);
      float var17 = X(var13);
      float[] var15 = m[var7];
      float var21 = var11 * var15[0] + var13 * var15[1];
      var15 = m[var8];
      float var22 = var12 * var15[0] + var13 * var15[1];
      float var18 = h(var16, var21, var22);
      var15 = m[var9];
      var21 = var11 * var15[0] + var14 * var15[1];
      var15 = m[var10];
      var22 = var12 * var15[0] + var14 * var15[1];
      float var19 = h(var16, var21, var22);
      return 1.5F * h(var17, var18, var19);
   }

   public static float G(float var0, float var1, float var2) {
      label17: {
         String var3 = h();
         boolean var10000 = D;
         if (var3 == null) {
            if (!D) {
               break label17;
            }

            var10000 = false;
         }

         D = var10000;
         c();
      }

      float var27 = var0 + 4096.0F;
      int var4 = (int)var27 & a(11238, 5150438208742926474L);
      int var5 = var4 + 1 & a(11238, 5150438208742926474L);
      float var14 = var27 - (float)((int)var27);
      float var15 = var14 - 1.0F;
      var27 = var1 + 4096.0F;
      int var6 = (int)var27 & a(11238, 5150438208742926474L);
      int var7 = var6 + 1 & a(11238, 5150438208742926474L);
      float var16 = var27 - (float)((int)var27);
      float var17 = var16 - 1.0F;
      var27 = var2 + 4096.0F;
      int var8 = (int)var27 & a(11238, 5150438208742926474L);
      int var9 = var8 + 1 & a(11238, 5150438208742926474L);
      float var18 = var27 - (float)((int)var27);
      float var19 = var18 - 1.0F;
      int var30 = U[var4];
      int var31 = U[var5];
      int var10 = U[var30 + var6];
      int var11 = U[var31 + var6];
      int var12 = U[var30 + var7];
      int var13 = U[var31 + var7];
      var27 = X(var14);
      float var21 = X(var16);
      float var22 = X(var18);
      float[] var20 = Z[var10 + var8];
      float var28 = var14 * var20[0] + var16 * var20[1] + var18 * var20[2];
      var20 = Z[var11 + var8];
      float var29 = var15 * var20[0] + var16 * var20[1] + var18 * var20[2];
      float var23 = h(var27, var28, var29);
      var20 = Z[var12 + var8];
      var28 = var14 * var20[0] + var17 * var20[1] + var18 * var20[2];
      var20 = Z[var13 + var8];
      var29 = var15 * var20[0] + var17 * var20[1] + var18 * var20[2];
      float var24 = h(var27, var28, var29);
      float var25 = h(var21, var23, var24);
      var20 = Z[var10 + var9];
      var28 = var14 * var20[0] + var16 * var20[1] + var19 * var20[2];
      var20 = Z[var11 + var9];
      var29 = var15 * var20[0] + var16 * var20[1] + var19 * var20[2];
      var23 = h(var27, var28, var29);
      var20 = Z[var12 + var9];
      var28 = var14 * var20[0] + var17 * var20[1] + var19 * var20[2];
      var20 = Z[var13 + var9];
      var29 = var15 * var20[0] + var17 * var20[1] + var19 * var20[2];
      var24 = h(var27, var28, var29);
      float var26 = h(var21, var23, var24);
      float var50 = 1.5F * h(var22, var25, var26);
      if (Ky4.F$arrString() != null) {
         C("J8yvCc");
      }

      return var50;
   }

   public static float h(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   public static void L(float[] var0) {
      float var1 = (float)Math.sqrt((double)(var0[0] * var0[0] + var0[1] * var0[1]));
      var0[0] /= var1;
      var0[1] /= var1;
   }

   public static void x(float[] var0) {
      float var1 = (float)Math.sqrt((double)(var0[0] * var0[0] + var0[1] * var0[1] + var0[2] * var0[2]));
      var0[0] /= var1;
      var0[1] /= var1;
      var0[2] /= var1;
   }

   public static int F() {
      return q.nextInt() & a(2595, 1148101393946184012L);
   }

   public static void c() {
      String var10000 = h();
      int var1 = 0;
      String var0 = var10000;

      while (true) {
         if (var1 < a(32717, 6423534006966877349L)) {
            U[var1] = var1;
            u[var1] = (float)(F() % a(3557, 365854411868933767L) - a(22414, 1863777980156761316L)) / 256.0F;
            var8 = 0;
            if (var0 != null) {
               break;
            }

            int var2 = 0;

            label92: {
               while (var2 < 2) {
                  m[var1][var2] = (float)(F() % a(1024, 3183709916096202601L) - a(22414, 1863777980156761316L)) / 256.0F;
                  var2++;
                  if (var0 != null) {
                     break label92;
                  }

                  if (var0 != null) {
                     break;
                  }
               }

               L(m[var1]);
            }

            var2 = 0;

            label81: {
               while (var2 < 3) {
                  Z[var1][var2] = (float)(F() % a(1024, 3183709916096202601L) - a(22414, 1863777980156761316L)) / 256.0F;
                  var2++;
                  if (var0 != null) {
                     break label81;
                  }

                  if (var0 != null) {
                     break;
                  }
               }

               x(Z[var1]);
               var1++;
            }

            if (var0 == null) {
               continue;
            }
         }

         var8 = a(11238, 5150438208742926474L);
         break;
      }

      var1 = var8;

      while (true) {
         if (var1 >= 0) {
            int var3 = U[var1];
            int var6;
            U[var1] = U[var6 = F() % a(22414, 1863777980156761316L)];
            U[var6] = var3;
            var1--;
            if (var0 != null) {
               break;
            }

            if (var0 == null) {
               continue;
            }
         }

         var1 = 0;
         break;
      }

      while (var1 < a(4394, 5000535023714767433L)) {
         U[a(22414, 1863777980156761316L) + var1] = U[var1];
         u[a(22414, 1863777980156761316L) + var1] = u[var1];
         int var7 = 0;

         while (true) {
            if (var7 < 2) {
               m[a(22414, 1863777980156761316L) + var1][var7] = m[var1][var7];
               var7++;
               if (var0 != null) {
                  break;
               }

               if (var0 == null) {
                  continue;
               }
            }

            var7 = 0;
            break;
         }

         while (true) {
            if (var7 < 3) {
               Z[a(22414, 1863777980156761316L) + var1][var7] = Z[var1][var7];
               var7++;
               if (var0 != null) {
                  break;
               }

               if (var0 == null) {
                  continue;
               }
            }

            var1++;
            break;
         }

         if (var0 != null) {
            break;
         }
      }
   }

   public static float[] I(E32 var0, float[] var1) {
      String var2;
      label27: {
         var2 = h();
         float[] var10000 = var1;
         if (var2 == null) {
            if (var1 != null) {
               break label27;
            }

            var10000 = new float[2];
         }

         var1 = var10000;
      }

      float var3 = 0.0F;
      float var4 = 0.0F;
      float var5 = -100.0F;

      while (true) {
         if (var5 < 100.0F) {
            float var6 = var0.H(var5);
            var3 = Math.min(var3, var6);
            var4 = Math.max(var4, var6);
            var5 = (float)((double)var5 + 1.27139);
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         var1[0] = var3;
         var1[1] = var4;
         break;
      }

      return var1;
   }

   public static float[] B(SC var0, float[] var1) {
      String var2;
      label43: {
         var2 = h();
         float[] var10000 = var1;
         if (var2 == null) {
            if (var1 != null) {
               break label43;
            }

            var10000 = new float[2];
         }

         var1 = var10000;
      }

      float var3 = 0.0F;
      float var4 = 0.0F;
      float var5 = -100.0F;

      while (true) {
         if (var5 < 100.0F) {
            if (var2 != null) {
               break;
            }

            float var6 = -100.0F;

            label31: {
               while (var6 < 100.0F) {
                  float var7 = var0.h(var6, var5);
                  var3 = Math.min(var3, var7);
                  var4 = Math.max(var4, var7);
                  var6 = (float)((double)var6 + 10.77139);
                  if (var2 != null) {
                     break label31;
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var5 = (float)((double)var5 + 10.35173);
            }

            if (var2 == null) {
               continue;
            }
         }

         var1[0] = var3;
         var1[1] = var4;
         break;
      }

      return var1;
   }

   static {
      __vfClinit__();
   }

   public static void C(String var0) {
      R = var0;
   }

   public static String h() {
      return R;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 874;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3648071574311890996L;
      long[] var6 = new long[10];
      int var3 = 0;
      C(null);
      String var4 = "öËñr\u0001\u007f%Ð8\u0080,\u001a¶^±»xËj²áé\u008d\u00919/ñ\tFÂõ]\u000f[¸À#|^á\u0099DÍ{I»\u0086\u0087þü<D\u0083·ØA«Ñ\u009e@Þ\r)ñ";
      int var5 = "öËñr\u0001\u007f%Ð8\u0080,\u001a¶^±»xËj²áé\u008d\u00919/ñ\tFÂõ]\u000f[¸À#|^á\u0099DÍ{I»\u0086\u0087þü<D\u0083·ØA«Ñ\u009e@Þ\r)ñ".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[10];
                     q = new Random();
                     U = new int[a(22698, 4396321567949347783L)];
                     Z = new float[a(16614, 5695793909344617357L)][3];
                     m = new float[a(16614, 5695793909344617357L)][2];
                     u = new float[a(16614, 5695793909344617357L)];
                     D = true;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "I\u0080û-\u008cú|³¬{dk\u0091dc\u007f";
                  var5 = "I\u0080û-\u008cú|³¬{dk\u0091dc\u007f".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}






