package com.finalshell.core;

public class HY {
   public float[] I;
   public float[] E;
   public static long[] a;
   public static Integer[] b;

   public HY() {
      this.I = new float[]{0.0F, 1.0F};
      this.E = new float[]{0.0F, 1.0F};
   }

   public HY(HY var1) {
      this.I = (float[])var1.I.clone();
      this.E = (float[])var1.E.clone();
   }

   public int y(float var1, float var2) {
      float[] var11;
      int var4 = -1;
      int var5 = this.I.length;
      float[] var6 = new float[var5 + 1];
      String[] var10000 = W5.q();
      float[] var7 = new float[var5 + 1];
      String[] var3 = var10000;
      int var8 = 0;
      int var9 = 0;

      int var10001;
      while (true) {
         if (var9 < var5) {
      int var10;
            label39: {
               label38: {
                  var10 = var4;
                  if (var3 != null) {
                     var10001 = -1;
                     if (var3 == null) {
                        break;
                     }

                     if (var4 != -1) {
                        break label38;
                     }

                     var11 = this.I;
                     var10001 = var9;
                     if (var3 == null) {
                        break label39;
                     }

                     float var13;
                     var10 = (var13 = this.I[var9] - var1) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
                  }

                  if (var10 > 0) {
                     var4 = var8;
                     var6[var8] = var1;
                     var7[var8] = var2;
                     var8++;
                  }
               }

               var6[var8] = this.I[var9];
               var11 = var7;
               var10001 = var8;
            }

            var11[var10001] = this.E[var9];
            var8++;
            var9++;
            if (var3 != null) {
               continue;
            }
         }

         var10 = var4;
         if (var3 == null) {
            return var4;
         }

         var10001 = -1;
         break;
      }

      if (var10 == var10001) {
         var4 = var8;
         var6[var8] = var1;
         var7[var8] = var2;
      }

      this.I = var6;
      this.E = var7;
      return var4;
   }

   public void i(int var1) {
      String[] var10000 = W5.q();
      int var3 = this.I.length;
      String[] var2 = var10000;
      int var8 = var3;
      byte var10001 = 2;
      if (var2 != null) {
         if (var3 <= 2) {
            return;
         }

         var8 = var3;
         var10001 = 1;
      }

      float[] var4 = new float[var8 - var10001];
      float[] var5 = new float[var3 - 1];
      int var6 = 0;
      int var7 = 0;

      while (true) {
         if (var7 < var3 - 1) {
            if (var2 == null) {
               break;
            }

            if (var7 == var1) {
               var6++;
            }

            var4[var7] = this.I[var6];
            var5[var7] = this.E[var6];
            var6++;
            var7++;
            if (var2 != null) {
               continue;
            }
         }

         this.I = var4;
         this.E = var5;
         break;
      }
   }

   public void W() {
      String[] var10000 = W5.q();
      int var2 = this.I.length;
      String[] var1 = var10000;
      int var3 = 1;

      label39:
      while (true) {
         int var7 = var3;

         label37:
         while (var7 < var2 - 1) {
            int var4 = 1;

            while (var4 < var3) {
               label31: {
                  float var8 = this.I[var3];
                  if (var1 != null) {
                     float var9;
                     var7 = (var9 = var8 - this.I[var4]) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
                     if (var1 == null) {
                        continue label37;
                     }

                     if (var7 >= 0) {
                        break label31;
                     }

                     var8 = this.I[var3];
                  }

                  float var5 = var8;
                  this.I[var3] = this.I[var4];
                  this.I[var4] = var5;
                  var5 = this.E[var3];
                  this.E[var3] = this.E[var4];
                  this.E[var4] = var5;
               }

               var4++;
               if (var1 == null) {
                  break;
               }
            }

            var3++;
            if (var1 == null) {
               return;
            }
            continue label39;
         }

         return;
      }
   }

   public int[] b() {
      int[] var12;
      int var2 = this.I.length;
      float[] var3 = new float[var2 + 2];
      float[] var4 = new float[var2 + 2];
      System.arraycopy(this.I, 0, var3, 1, var2);
      System.arraycopy(this.E, 0, var4, 1, var2);
      String[] var10000 = W5.q();
      var3[0] = var3[1];
      var4[0] = var4[1];
      var3[var2 + 1] = var3[var2];
      var4[var2 + 1] = var4[var2];
      int[] var5 = new int[a(32695, 1370387733027432989L)];
      int var6 = 0;
      String[] var1 = var10000;

      while (true) {
         if (var6 < a(14337, 711105571554651560L)) {
            float var7 = (float)var6 / 1024.0F;
            int var8 = (int)(255.0F * NM.s(var7, var3.length, var3) + 0.5F);
            int var9 = (int)(255.0F * NM.s(var7, var3.length, var4) + 0.5F);
            var8 = NM.L(var8, 0, a(15925, 7243672810898123677L));
            var9 = NM.L(var9, 0, a(24392, 5156954390393916131L));
            var12 = var5;
            if (var1 == null) {
               break;
            }

            var5[var8] = var9;
            var6++;
            if (var1 != null) {
               continue;
            }
         }

         var12 = var5;
         break;
      }

      return var12;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21929;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      byte var10;
      long var0 = 2823338731377797656L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u0089§¼\u0007ú0Ã°\u008c\u0015´ìîÜÁz";
      int var5 = "\u0089§¼\u0007ú0Ã°\u008c\u0015´ìîÜÁz".length();
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
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u001a«jÝ\u00162 \u0004F*N ûÇ\u0001\u0005";
                  var5 = "\u001a«jÝ\u00162 \u0004F*N ûÇ\u0001\u0005".length();
                  var2 = 0;
            }

            var10 = var2;
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





