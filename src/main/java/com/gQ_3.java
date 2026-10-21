package com;

public class gQ_3 extends hN_3 {
   private float u = 16.0F;
   private float F = 16.0F;
   private float V = 6.0F;
   private float R = 6.0F;
   private int L = a(14909, 5502266190869895423L);
   private int X = a(25994, 5452773651149965129L);
   private int i = a(9607, 2208379754439313223L);
   private int p = a(17595, 956458912919250559L);
   private boolean d = true;
   private boolean Q = false;
   private boolean b = true;
   public int[][] S = new int[][]{{0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}};
   private static final String a;
   private static final long[] c;
   private static final Integer[] e;

   public void N(float var1) {
      this.V = var1;
   }

   public void d(float var1) {
      this.u = var1;
   }

   public float q() {
      return this.u;
   }

   public void h(float var1) {
      this.F = var1;
   }

   public float w() {
      return this.F;
   }

   public float l() {
      return this.V;
   }

   public void L(float var1) {
      this.R = var1;
   }

   public float z() {
      return this.R;
   }

   public void L(int[][] var1) {
      this.S = var1;
   }

   public int[][] x() {
      return this.S;
   }

   public void X(boolean var1) {
      this.d = var1;
   }

   public boolean a() {
      return this.d;
   }

   public void x(boolean var1) {
      this.Q = var1;
   }

   public boolean k() {
      return this.Q;
   }

   public void p(boolean var1) {
      this.b = var1;
   }

   public boolean E() {
      return this.b;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      var1 = (int)((float)var1 + this.u + this.V / 2.0F);
      var2 = (int)((float)var2 + this.F + this.R / 2.0F);
      float var5 = NM.i((float)var1, this.u + this.V);
      String[] var10000 = com.W5.q();
      float var6 = NM.i((float)var2, this.F + this.R);
      int var7 = (int)((float)var1 / (this.u + this.V));
      int var8 = (int)((float)var2 / (this.F + this.R));
      String[] var4 = var10000;
      float var37;
      int var26 = (var37 = var5 - this.u) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
      if (var4 != null) {
         var26 = var26 < 0 ? 1 : 0;
      }

      int var9 = var26;
      float var38;
      int var27 = (var38 = var6 - this.F) == 0.0F ? 0 : (var38 < 0.0F ? -1 : 1);
      if (var4 != null) {
         var27 = var27 < 0 ? 1 : 0;
      }

      int var10;
      float var11;
      float var12;
      label168: {
         label167: {
            var10 = var27;
            gQ_3 var28 = this;
            if (var4 != null) {
               if (!this.Q) {
                  break label167;
               }

               var28 = this;
            }

            var11 = Math.abs(var28.u / 2.0F - var5) / this.u / 2.0F;
            var12 = Math.abs(this.F / 2.0F - var6) / this.F / 2.0F;
            if (var4 != null) {
               break label168;
            }
         }

         var12 = 0.0F;
         var11 = 0.0F;
      }

      float var13;
      float var14;
      label159: {
         label158: {
            gQ_3 var29 = this;
            if (var4 != null) {
               if (!this.b) {
                  break label158;
               }

               var29 = this;
            }

            var13 = NM.k(var29.u / 2.0F, this.u / 2.0F + this.V, Math.abs(this.u / 2.0F - var5));
            var14 = NM.k(this.F / 2.0F, this.F / 2.0F + this.R, Math.abs(this.F / 2.0F - var6));
            if (var4 != null) {
               break label159;
            }
         }

         var14 = 0.0F;
         var13 = 0.0F;
      }

      int var15;
      int var16;
      label150: {
         int var30 = this.d;
         if (var4 != null) {
            if (this.d) {
               var16 = var3;
               var15 = var3;
               if (var4 != null) {
                  break label150;
               }
            }

            var30 = this.i;
         }

         var15 = var30;
         var16 = this.p;
      }

      int var18 = var7 % this.X;
      int var19 = var8 % this.L;
      int var20 = this.S[var19][var18];
      int var31 = var9;
      if (var4 != null) {
         if (var9 != 0) {
            int var32 = var10;
            if (var4 != null) {
               if (var10 != 0) {
                  int var33 = var20;
                  if (var4 != null) {
                     var33 = var20 == 1 ? var15 : var16;
                  }

                  int var17 = var33;
                  var17 = NM.n(2.0F * (var20 == 1 ? var11 : var12), var17, a(25166, 5762453176749670539L));
                  if (var4 != null) {
                     return var17;
                  }
               }

               var32 = this.b;
            }

            label138:
            if (var4 != null) {
               label136:
               if (var32 != 0) {
                  var32 = var20;
                  if (var4 != null) {
                     if (var20 != this.S[(var8 + 1) % this.L][var18]) {
                        int var34 = var20;
                        if (var4 != null) {
                           if (var20 == 0) {
                              var14 = 1.0F - var14;
                           }

                           var14 *= 0.5F;
                           var34 = NM.n(var14, var15, a(1266, 4711193332551591475L));
                        }

                        var15 = var34;
                        if (var4 != null) {
                           break label136;
                        }
                     }

                     var32 = var20;
                  }

                  if (var4 == null) {
                     break label138;
                  }

                  if (var32 == 0) {
                     var15 = NM.n(0.5F, var15, a(1266, 4711193332551591475L));
                  }
               }

               var32 = NM.n(2.0F * var11, var15, a(1266, 4711193332551591475L));
            }

            int var39 = var32;
            if (var4 != null) {
               return var39;
            }
         }

         var31 = var10;
      }

      if (var4 != null) {
         if (var31 != 0) {
            var35 = this.b;
            label108:
            if (var4 != null) {
               label106:
               if (this.b) {
                  var35 = var20;
                  int var10001 = this.S[var19][(var7 + 1) % this.X];
                  if (var4 != null) {
                     if (var20 != var10001) {
                        int var36 = var20;
                        if (var4 != null) {
                           if (var20 == 1) {
                              var13 = 1.0F - var13;
                           }

                           var13 *= 0.5F;
                           var36 = NM.n(var13, var16, a(1266, 4711193332551591475L));
                        }

                        var16 = var36;
                        if (var4 != null) {
                           break label106;
                        }
                     }

                     var35 = var20;
                     if (var4 == null) {
                        break label108;
                     }

                     var10001 = 1;
                  }

                  if (var35 == var10001) {
                     var16 = NM.n(0.5F, var16, a(1266, 4711193332551591475L));
                  }
               }

               var35 = NM.n(2.0F * var12, var16, a(1266, 4711193332551591475L));
            }

            int var40 = var35;
            if (var4 != null) {
               return var40;
            }
         }

         var31 = 0;
      }

      return var31;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\nE5FX00qw(S['{p\u000e".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 113;
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
         var10007 = 113;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 47;
               break;
            case 1:
               var50 = 81;
               break;
            case 2:
               var50 = 60;
               break;
            case 3:
               var50 = 67;
               break;
            case 4:
               var50 = 92;
               break;
            case 5:
               var50 = 51;
               break;
            default:
               var50 = 36;
         }
      } else {
         var34 = 113;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 7091953727391567315L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "ìòîÙKÔ\n\u0014\u009b\tiÞ\u001dC«à£«\u008e\u008eÚß\u0095(gµ\fÎùÉÊ\u009e";
            int var13 = "ìòîÙKÔ\n\u0014\u009b\tiÞ\u001dC«à£«\u008e\u008eÚß\u0095(gµ\fÎùÉÊ\u009e".length();
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
                           c = var14;
                           e = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "bÄGh±àëS°&£\u001eÉRÍX";
                        var13 = "bÄGh±àëS°&£\u001eÉRÍX".length();
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
         var10007 = 113;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 47;
               break;
            case 1:
               var50 = 81;
               break;
            case 2:
               var50 = 60;
               break;
            case 3:
               var50 = 67;
               break;
            case 4:
               var50 = 92;
               break;
            case 5:
               var50 = 51;
               break;
            default:
               var50 = 36;
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
                  var50 = 47;
                  break;
               case 1:
                  var50 = 81;
                  break;
               case 2:
                  var50 = 60;
                  break;
               case 3:
                  var50 = 67;
                  break;
               case 4:
                  var50 = 92;
                  break;
               case 5:
                  var50 = 51;
                  break;
               default:
                  var50 = 36;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 7091953727391567315L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "ìòîÙKÔ\n\u0014\u009b\tiÞ\u001dC«à£«\u008e\u008eÚß\u0095(gµ\fÎùÉÊ\u009e";
               int var5 = "ìòîÙKÔ\n\u0014\u009b\tiÞ\u001dC«à£«\u008e\u008eÚß\u0095(gµ\fÎùÉÊ\u009e".length();
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
                              c = var6;
                              e = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "bÄGh±àëS°&£\u001eÉRÍX";
                           var5 = "bÄGh±àëS°&£\u001eÉRÍX".length();
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
                  var50 = 47;
                  break;
               case 1:
                  var50 = 81;
                  break;
               case 2:
                  var50 = 60;
                  break;
               case 3:
                  var50 = 67;
                  break;
               case 4:
                  var50 = 92;
                  break;
               case 5:
                  var50 = 51;
                  break;
               default:
                  var50 = 36;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8896;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }
}





