package com.finalshell.core;

public class ZI {
   protected int[][] d = null;
   protected int A = 0;
   protected int[] B;
   protected int[] G;
   protected int[] e;
   protected int[] t;
   protected float[] H;
   protected boolean p = true;
   public static long[] a;
   public static Integer[] b;

   public ZI() {
      this.B = null;
      this.G = null;
      this.e = null;
      this.t = null;
      this.H = null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public ZI(int[] var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = W5.q();
      super();
      String[] var6 = var10000;
      this.d = new int[3][a(28816, 629281330306058382L)];
      this.B = new int[4];
      this.G = new int[4];
      this.e = new int[3];
      this.t = new int[3];
      this.H = new float[3];
      this.A = var2 * var3;
      this.p = true;
      int var7 = 0;
      int var8 = 0;

      while (true) {
         if (var8 < var3) {
            var7 = var4 + var8 * var5;
            var19 = 0;
            if (var6 == null) {
               break;
            }

            int var9 = 0;

            label148: {
               while (var9 < var2) {
                  int var10 = var1[var7++];
                  int var11 = var10 >> a(26929, 5752573862038933804L) & a(4903, 4047677630544014140L);
                  int var12 = var10 >> a(7334, 5197173741303751865L) & a(4903, 4047677630544014140L);
                  int var13 = var10 & a(4903, 4047677630544014140L);
                  this.d[0][var11]++;
                  this.d[1][var12]++;
                  this.d[2][var13]++;
                  var9++;
                  if (var6 == null) {
                     break label148;
                  }

                  if (var6 == null) {
                     break;
                  }
               }

               var8++;
            }

            if (var6 != null) {
               continue;
            }
         }

         var19 = 0;
         break;
      }

      var8 = var19;

      int var26;
      while (true) {
         label129:
         if (var8 < a(26680, 1280804433601630242L)) {
            label127: {
               ZI var20 = this;
               if (var6 != null) {
                  var21 = this.d[0][var8];
                  var26 = this.d[1][var8];
                  if (var6 == null) {
                     break;
                  }

                  if (var21 == var26) {
                     var20 = this;
                     if (var6 != null) {
                        if (this.d[1][var8] == this.d[2][var8]) {
                           break label127;
                        }

                        var20 = this;
                     }
                  } else {
                     var20 = this;
                  }
               }

               var20.p = false;
               if (var6 != null) {
                  break label129;
               }
            }

            var8++;
            if (var6 != null) {
      int var21;
      int var21;
      int var21;
      int var21;
               continue;
            }
         }

         var8 = 0;
         var21 = var8;
         var26 = 3;
         break;
      }

      while (var21 < var26) {
         if (var6 == null) {
            return;
         }

         int var16 = 0;

         label162: {
            while (var16 < a(26680, 1280804433601630242L)) {
               label81: {
                  int[] var22 = this.d[var8];
                  var26 = var16;
                  if (var6 != null) {
                     int var23 = var22[var16];
                     if (var6 == null) {
                        var16 = var23;
                        break label162;
                     }

                     if (var23 <= 0) {
                        break label81;
                     }

                     var22 = this.B;
                     var26 = var8;
                  }

                  var22[var26] = var16;
                  if (var6 != null) {
                     break;
                  }
               }

               var16++;
               if (var6 == null) {
                  break;
               }
            }

            var16 = a(4903, 4047677630544014140L);
         }

         label165: {
            while (var16 >= 0) {
               label98: {
                  int[] var24 = this.d[var8];
                  var26 = var16;
                  if (var6 != null) {
                     int var25 = var24[var16];
                     if (var6 == null) {
                        var16 = var25;
                        break label165;
                     }

                     if (var25 <= 0) {
                        break label98;
                     }

                     var24 = this.G;
                     var26 = var8;
                  }

                  var24[var26] = var16;
                  if (var6 != null) {
                     break;
                  }
               }

               var16--;
               if (var6 == null) {
                  break;
               }
            }

            this.e[var8] = a(24744, 2132443970020710580L);
            this.t[var8] = 0;
            var16 = 0;
         }

         label112: {
            while (var16 < a(26680, 1280804433601630242L)) {
               this.e[var8] = Math.min(this.e[var8], this.d[var8][var16]);
               this.t[var8] = Math.max(this.t[var8], this.d[var8][var16]);
               this.H[var8] = this.H[var8] + (float)(var16 * this.d[var8][var16]);
               var16++;
               if (var6 == null) {
                  break label112;
               }

               if (var6 == null) {
                  break;
               }
            }

            this.H[var8] = this.H[var8] / (float)this.A;
            var8++;
         }

         if (var6 == null) {
            break;
         }

         var21 = var8;
         var26 = 3;
      }

      this.B[3] = Math.min(Math.min(this.B[0], this.B[1]), this.B[2]);
      this.G[3] = Math.max(Math.max(this.G[0], this.G[1]), this.G[2]);
   }

   public boolean S() {
      return this.p;
   }

   public int M() {
      return this.A;
   }

   public int F(int var1) {
      String[] var2 = W5.q();
      int var10000 = this.A;
      if (var2 != null) {
         if (this.A > 0) {
            if (var2 == null) {
               return this.p;
            }

            if (this.p) {
               if (var2 == null) {
                  return var1;
               }

               if (var1 >= 0) {
                  if (var2 == null) {
                     return var1;
                  }

                  if (var1 <= a(2317, 4875918305006252308L)) {
                     return this.d[0][var1];
                  }
               }
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   public int G(int var1, int var2) {
      String[] var3 = W5.q();
      int var10000 = this.A;
      if (var3 != null) {
         if (this.A >= 1) {
            if (var3 == null) {
               return var1;
            }

            if (var1 >= 0) {
               if (var3 == null) {
                  return var1;
               }

               if (var1 <= 2) {
                  if (var3 == null) {
                     return var2;
                  }

                  label29:
                  if (var2 >= 0) {
                     var10000 = var2;
                     if (var3 != null) {
                        if (var2 > a(4903, 4047677630544014140L)) {
                           break label29;
                        }

                        var10000 = this.d[var1][var2];
                     }

                     return var10000;
                  }
               }
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   public int C() {
      String[] var1 = W5.q();
      int var10000 = this.A;
      if (var1 != null) {
         if (this.A > 0) {
            if (var1 == null) {
               return this.p;
            }

            if (this.p) {
               return this.e[0];
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   public int W(int var1) {
      String[] var2 = W5.q();
      int var10000 = this.A;
      if (var2 != null) {
         if (this.A >= 1) {
            if (var2 == null) {
               return var1;
            }

            label23:
            if (var1 >= 0) {
               var10000 = var1;
               if (var2 != null) {
                  if (var1 > 2) {
                     break label23;
                  }

                  var10000 = this.e[var1];
               }

               return var10000;
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   public int I() {
      String[] var1 = W5.q();
      int var10000 = this.A;
      if (var1 != null) {
         if (this.A > 0) {
            if (var1 == null) {
               return this.p;
            }

            if (this.p) {
               return this.t[0];
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   public int I(int var1) {
      String[] var2 = W5.q();
      int var10000 = this.A;
      if (var2 != null) {
         if (this.A >= 1) {
            if (var2 == null) {
               return var1;
            }

            label23:
            if (var1 >= 0) {
               var10000 = var1;
               if (var2 != null) {
                  if (var1 > 2) {
                     break label23;
                  }

                  var10000 = this.t[var1];
               }

               return var10000;
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   public int O() {
      String[] var1 = W5.q();
      int var10000 = this.A;
      if (var1 != null) {
         if (this.A > 0) {
            if (var1 == null) {
               return this.p;
            }

            if (this.p) {
               return this.B[0];
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   public int Q(int var1) {
      return this.B[var1];
   }

   public int J() {
      String[] var1 = W5.q();
      int var10000 = this.A;
      if (var1 != null) {
         if (this.A > 0) {
            if (var1 == null) {
               return this.p;
            }

            if (this.p) {
               return this.G[0];
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   public int X(int var1) {
      return this.G[var1];
   }

   public float F() {
      String[] var1 = W5.q();
      int var10000 = this.A;
      if (var1 != null) {
         if (this.A <= 0) {
            return -1.0F;
         }

         if (var1 == null) {
            return this.H[0];
         }

         var10000 = this.p;
      }

      return var10000 != 0 ? this.H[0] : -1.0F;
   }

   public float Y(int var1) {
      String[] var2 = W5.q();
      int var10000 = this.A;
      if (var2 != null) {
         if (this.A <= 0) {
            return -1.0F;
         }

         var10000 = 0;
      }

      int var10001 = var1;
      if (var2 != null) {
         if (var10000 > var1) {
            return -1.0F;
         }

         var10000 = var1;
         var10001 = 2;
      }

      return var10000 <= var10001 ? this.H[var1] : -1.0F;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30751;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4310379434906793348L;
      long[] var6 = new long[7];
      int var3 = 0;
      String var4 = "¡þÑlf¡Q5\u0015QËv\u0014i<\näc¢\u0094ÏÃ¤¸ý]\u0018ö_¹RÏ¹\u0018\b¨=\u001a^G";
      int var5 = "¡þÑlf¡Q5\u0015QËv\u0014i<\näc¢\u0094ÏÃ¤¸ý]\u0018ö_¹RÏ¹\u0018\b¨=\u001a^G".length();
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
                     b = new Integer[7];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "§é¿º\u0093V¤¦Ñúí²c|Do";
                  var5 = "§é¿º\u0093V¤¦Ñúí²c|Do".length();
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





