package com;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class hH_3 extends com.W5 {
   private float A = 0.0F;
   private int l;
   private int C;
   private Point j;
   private Point u;
   private boolean V;
   private float X;
   private float N;
   private float P;
   private float T;
   private Po_2 S;
   private int w;
   private int b;
   private int v;
   private static final String a;
   private static final long[] c;
   private static final Integer[] d;

   public hH_3() {
      this.l = a(6762, 8470716206035906385L);
      this.C = -1;
      this.j = new Point(0, 0);
      this.u = new Point(a(27384, 6998446904661794753L), a(8019, 5472921053428853355L));
      this.V = false;
      this.S = null;
      this.b = 0;
      this.v = 1;
   }

   public hH_3(Point var1, Point var2, int var3, int var4, boolean var5, int var6, int var7) {
      this.l = a(29941, 1210445150781686223L);
      this.C = -1;
      this.j = new Point(0, 0);
      this.u = new Point(a(8019, 5472921053428853355L), a(8019, 5472921053428853355L));
      this.V = false;
      this.S = null;
      this.b = 0;
      this.v = 1;
      this.j = var1;
      this.u = var2;
      this.l = var3;
      this.C = var4;
      this.V = var5;
      this.w = var6;
      this.b = var7;
      this.S = new wY_3(var3, var4);
   }

   public void j(Point var1) {
      this.j = var1;
   }

   public Point W() {
      return this.j;
   }

   public void W(Point var1) {
      this.u = var1;
   }

   public Point D() {
      return this.u;
   }

   public void r(int var1) {
      this.w = var1;
   }

   public int A() {
      return this.w;
   }

   public void A(int var1) {
      this.b = var1;
   }

   public int G() {
      return this.b;
   }

   public void W(float var1) {
      this.A = var1;
      this.u = new Point((int)(64.0 * Math.cos((double)var1)), (int)(64.0 * Math.sin((double)var1)));
   }

   public float g() {
      return this.A;
   }

   public void r(Po_2 var1) {
      this.S = var1;
   }

   public Po_2 C() {
      return this.S;
   }

   public void U(int var1) {
      this.v = var1;
   }

   public int e() {
      return this.v;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label71: {
         String[] var10000 = com.W5.q();
         var4 = var1.getWidth();
         var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var20 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label71;
            }

            var20 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var20;
      }

      float var8;
      float var10;
      float var11;
      float var19;
      label65: {
         int var21;
         var8 = (float)this.j.x;
         var10 = (float)this.u.x;
         float var24;
         var21 = (var24 = var8 - var10) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
         label64:
         if (var3 != null) {
            if (var21 > 0) {
               var21 = this.w;
               if (var3 == null) {
                  break label64;
               }

               if (this.w != 2) {
                  var19 = var8;
                  var8 = var10;
                  var10 = var19;
                  var19 = (float)this.u.y;
                  var11 = (float)this.j.y;
                  int var6 = this.C;
                  int var7 = this.l;
                  if (var3 != null) {
                     break label65;
                  }
               }
            }

            var21 = this.j.y;
         }

         var19 = (float)var21;
         var11 = (float)this.u.y;
         int var17 = this.l;
         int var18 = this.C;
      }

      int var22;
      float var12 = var10 - var8;
      float var13 = var11 - var19;
      float var14 = var12 * var12 + var13 * var13;
      this.X = var8;
      this.N = var19;
      float var25;
      var22 = (var25 = var14 - (Float.MIN_VALUE)) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
      label54:
      if (var3 != null) {
         if (var22 >= 0) {
            var12 /= var14;
            var13 /= var14;
            var22 = this.V;
            if (var3 == null) {
               break label54;
            }

            if (this.V) {
               var12 %= 1.0F;
               var13 %= 1.0F;
            }
         }

         this.P = var12;
         this.T = var13;
         var22 = var4;
      }

      int[] var15 = new int[var22];
      int var16 = 0;

      while (var16 < var5) {
         this.l(var1, 0, var16, var4, 1, var15);
         hH_3 var23 = this;
         if (var3 != null) {
            switch (this.w) {
               case 0:
               case 1:
                  this.N(var15, var16, var4, 1);
                  if (var3 != null) {
                     break;
                  }
               case 2:
                  this.d(var15, var16, var4, 1);
                  if (var3 != null) {
                     break;
                  }
               case 3:
               case 4:
                  this.e(var15, var16, var4, 1);
                  if (var3 != null) {
                     break;
                  }
               case 5:
                  this.O(var15, var16, var4, 1);
            }

            var23 = this;
         }

         var23.E(var2, 0, var16, var4, 1, var15);
         var16++;
         if (var3 == null) {
            break;
         }
      }

      return var2;
   }

   private void x(int[] var1, int var2, int var3, float var4, float var5, float var6) {
      String[] var10000 = com.W5.q();
      int var8 = 0;
      String[] var7 = var10000;
      int var9 = 0;

      label41:
      while (true) {
         int var13 = var9;
         int var10001 = var3;

         label39:
         while (var13 < var10001) {
            float var10 = var4;
            int var11 = var2;

            while (--var11 >= 0) {
               int var12;
               label33: {
                  var13 = this.w;
                  if (var7 != null) {
                     var10001 = 1;
                     if (var7 == null) {
                        continue label39;
                     }

                     if (this.w == 1) {
                        var12 = this.S.D(this.V(NM.l(var10)));
                        if (var7 != null) {
                           break label33;
                        }
                     }

                     var13 = this.S.D(this.V(NM.i(var10, 1.0F)));
                  }

                  var12 = var13;
               }

               var1[var8] = iw_4.P(var12, var1[var8], this.v);
               var8++;
               var10 += var5;
               if (var7 == null) {
                  break;
               }
            }

            var4 += var6;
            var9++;
            if (var7 == null) {
               return;
            }
            continue label41;
         }

         return;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private void I(int[] var1, int var2, int var3, float var4, float var5, float var6) {
      String[] var10000 = com.W5.q();
      int var8 = 0;
      String[] var7 = var10000;
      int var9 = 0;

      while (var9 < var3) {
         int var11;
         label94: {
            float var10 = var4;
            var11 = var2;
            double var17;
            int var15 = (var17 = (double)var4 - 0.0) == 0.0 ? 0 : (var17 < 0.0 ? -1 : 1);
            if (var7 != null) {
               if (var15 <= 0) {
                  int var12 = this.S.D(0.0F);

                  do {
                     var1[var8] = iw_4.P(var12, var1[var8], this.v);
                     var8++;
                     var10 += var5;
                  } while (--var11 > 0 && (double)var10 <= 0.0);
               }

               double var18;
               var15 = (var18 = (double)var10 - 1.0) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
            }

            while (var15 < 0) {
               var16 = --var11;
               if (var7 == null || var7 == null) {
                  break label94;
               }

               if (var11 < 0) {
                  break;
               }

               int var13;
               label81:
               if (var7 != null) {
                  if (this.w == 1) {
                     var13 = this.S.D(this.V(NM.l(var10)));
                     if (var7 != null) {
                        break label81;
                     }
                  }

                  var13 = this.S.D(this.V(var10));
               } else {
                  var13 = this.w;
               }

               var1[var8] = iw_4.P(var13, var1[var8], this.v);
               var8++;
               var10 += var5;
               if (var7 == null) {
                  break;
               }

               double var19;
               var15 = (var19 = (double)var10 - 1.0) == 0.0 ? 0 : (var19 < 0.0 ? -1 : 1);
            }

            var16 = var11;
         }

         label97: {
            if (var7 != null) {
               if (var16 <= 0) {
                  break label97;
               }

               var16 = this.w;
            }

            int var14;
            label45: {
               if (var7 != null) {
                  if (var16 == 1) {
                     var14 = this.S.D(0.0F);
                     if (var7 != null) {
                        break label45;
                     }
                  }

                  var16 = this.S.D(1.0F);
               }

               var14 = var16;
            }

            do {
               var1[var8] = iw_4.P(var14, var1[var8], this.v);
               var8++;
            } while (--var11 > 0);
         }

         var4 += var6;
         var9++;
         if (var7 == null) {
            break;
         }
      }
   }

   private void N(int[] var1, int var2, int var3, int var4) {
      String[] var10000 = com.W5.q();
      byte var6 = 0;
      String[] var5 = var10000;
      float var7 = ((float)var6 - this.X) * this.P + ((float)var2 - this.N) * this.T;
      hH_3 var8 = this;
      if (var5 != null) {
         if (this.V) {
            this.x(var1, var3, var4, var7, this.P, this.T);
            if (var5 != null) {
               return;
            }
         }

         var8 = this;
      }

      var8.I(var1, var3, var4, var7, this.P, this.T);
   }

   private void d(int[] var1, int var2, int var3, int var4) {
      String[] var10000 = com.W5.q();
      int var6 = 0;
      float var7 = this.x((float)(this.u.x - this.j.x), (float)(this.u.y - this.j.y));
      String[] var5 = var10000;
      int var8 = 0;

      while (var8 < var3) {
         label29: {
            float var10;
            label37: {
               float var9 = this.x((float)(var8 - this.j.x), (float)(var2 - this.j.y));
               var10 = var9 / var7;
               var12 = this.V;
               if (var5 != null) {
                  if (this.V) {
                     var10 %= 2.0F;
                     if (var5 != null) {
                        break label37;
                     }
                  }

                  double var13;
                  var12 = (var13 = (double)var10 - 1.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
               }

               if (var5 == null) {
                  break label29;
               }

               if (var12 > 0) {
                  var10 = 1.0F;
               }
            }

            var12 = this.S.D(this.V(var10));
         }

         int var11 = var12;
         var1[var6] = iw_4.P(var11, var1[var6], this.v);
         var6++;
         var8++;
         if (var5 == null) {
            break;
         }
      }
   }

   private void O(int[] var1, int var2, int var3, int var4) {
      String[] var10000 = com.W5.q();
      int var6 = 0;
      String[] var5 = var10000;
      float var7 = (float)Math.max(Math.abs(this.u.x - this.j.x), Math.abs(this.u.y - this.j.y));
      int var8 = 0;

      while (var8 < var3) {
         label29: {
            float var10;
            label37: {
               float var9 = (float)Math.max(Math.abs(var8 - this.j.x), Math.abs(var2 - this.j.y));
               var10 = var9 / var7;
               var12 = this.V;
               if (var5 != null) {
                  if (this.V) {
                     var10 %= 2.0F;
                     if (var5 != null) {
                        break label37;
                     }
                  }

                  double var13;
                  var12 = (var13 = (double)var10 - 1.0) == 0.0 ? 0 : (var13 < 0.0 ? -1 : 1);
               }

               if (var5 == null) {
                  break label29;
               }

               if (var12 > 0) {
                  var10 = 1.0F;
               }
            }

            var12 = this.S.D(this.V(var10));
         }

         int var11 = var12;
         var1[var6] = iw_4.P(var11, var1[var6], this.v);
         var6++;
         var8++;
         if (var5 == null) {
            break;
         }
      }
   }

   private void e(int[] var1, int var2, int var3, int var4) {
      String[] var10000 = com.W5.q();
      int var6 = 0;
      String[] var5 = var10000;
      float var7 = (float)Math.atan2((double)(this.u.x - this.j.x), (double)(this.u.y - this.j.y));
      int var8 = 0;

      while (var8 < var3) {
         float var9 = (float)(Math.atan2((double)(var8 - this.j.x), (double)(var2 - this.j.y)) - (double)var7) / (float) (Math.PI * 2);
         var9 = ++var9 % 1.0F;
         int var13 = this.w;
         if (var5 != null) {
            if (this.w == 4) {
               var9 = NM.l(var9);
            }

            var13 = this.S.D(this.V(var9));
         }

         int var10 = var13;
         var1[var6] = iw_4.P(var10, var1[var6], this.v);
         var6++;
         var8++;
         if (var5 == null) {
            break;
         }
      }
   }

   private float V(float var1) {
      String[] var2 = com.W5.q();
      int var10000 = this.V;
      if (var2 != null) {
         if (this.V) {
            float var3 = var1;
            if (var2 != null) {
               var3 = (double)var1 > 1.0 ? 2.0F - var1 : var1;
            }

            var1 = var3;
         }

         var10000 = this.b;
      }

      switch (var10000) {
         case 1:
            var1 = NM.P(NM.X(var1, 0.0F, 1.0F));
            if (var2 != null) {
               break;
            }
         case 2:
            var1 = NM.q(NM.X(var1, 0.0F, 1.0F));
            if (var2 != null) {
               break;
            }
         case 3:
            var1 = NM.k(0.0F, 1.0F, var1);
      }

      return var1;
   }

   private float x(float var1, float var2) {
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2));
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "_iX(\\PXb|T$K\u0011k0[Y!BQ1>".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 104;
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
         var10007 = 104;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 120;
               break;
            case 1:
               var50 = 117;
               break;
            case 2:
               var50 = 88;
               break;
            case 3:
               var50 = 37;
               break;
            case 4:
               var50 = 70;
               break;
            case 5:
               var50 = 23;
               break;
            default:
               var50 = 119;
         }
      } else {
         var34 = 104;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 9070750587747201989L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12 = "·«\u0096\fM´Yî\u00adîÅr§\u001a,D";
            int var13 = "·«\u0096\fM´Yî\u00adîÅr§\u001a,D".length();
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
                           d = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "6µ\rû«¹²\nOü<`N<\\\u0094";
                        var13 = "6µ\rû«¹²\nOü<`N<\\\u0094".length();
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
         var10007 = 104;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 120;
               break;
            case 1:
               var50 = 117;
               break;
            case 2:
               var50 = 88;
               break;
            case 3:
               var50 = 37;
               break;
            case 4:
               var50 = 70;
               break;
            case 5:
               var50 = 23;
               break;
            default:
               var50 = 119;
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
                  var50 = 120;
                  break;
               case 1:
                  var50 = 117;
                  break;
               case 2:
                  var50 = 88;
                  break;
               case 3:
                  var50 = 37;
                  break;
               case 4:
                  var50 = 70;
                  break;
               case 5:
                  var50 = 23;
                  break;
               default:
                  var50 = 119;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 9070750587747201989L;
               long[] var6 = new long[4];
               int var3 = 0;
               String var4 = "·«\u0096\fM´Yî\u00adîÅr§\u001a,D";
               int var5 = "·«\u0096\fM´Yî\u00adîÅr§\u001a,D".length();
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
                              d = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "6µ\rû«¹²\nOü<`N<\\\u0094";
                           var5 = "6µ\rû«¹²\nOü<`N<\\\u0094".length();
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
                  var50 = 120;
                  break;
               case 1:
                  var50 = 117;
                  break;
               case 2:
                  var50 = 88;
                  break;
               case 3:
                  var50 = 37;
                  break;
               case 4:
                  var50 = 70;
                  break;
               case 5:
                  var50 = 23;
                  break;
               default:
                  var50 = 119;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13624;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





