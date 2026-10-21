package com.finalshell.core;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;
import java.util.Vector;

public class Yj4 extends GT3 {
   public float Q;
   public float m;
   public int z;
   public float j = 10000.0F;
   public Gy2 e;
   public Vector x;
   public int I = 0;
   public int T = 0;
   public SC t;
   public Image n;
   public int[] G;
   public int Y = 1;
   public int B = 1;
   public Od4 d;
   public Od4 V;
   public Od4 J;
   public O_3 b;
   public O_3 g;
   public O_3 C;
   public Od4 N;
   public Od4 F;
   public static String a;
   public static long[] f;
   public static Integer[] i;

   public Yj4() {
      this.x = new Vector();
      this.d(new GW(this));
      this.Q = 1.0F;
      this.m = 5.0F;
      this.z = 0;
      this.e = new Gy2();
      this.d = new Od4();
      this.V = new Od4();
      this.J = new Od4();
      this.b = new O_3();
      this.g = new O_3();
      this.C = new O_3();
      this.N = new Od4();
      this.F = new Od4();
   }

   public void J(Gy2 var1) {
      this.e = var1;
   }

   public Gy2 F$Gy_2() {
      return this.e;
   }

   public void P(SC var1) {
      this.t = var1;
   }

   public SC V() {
      return this.t;
   }

   public void r(float var1) {
      this.Q = var1;
   }

   public float a() {
      return this.Q;
   }

   public void q(float var1) {
      this.m = var1;
   }

   public float x() {
      return this.m;
   }

   public void t(int var1) {
      this.z = var1;
   }

   public int w() {
      return this.z;
   }

   public void j(float var1) {
      this.j = var1;
   }

   public float F$float() {
      return this.j;
   }

   public void e(BufferedImage var1) {
      String[] var10000 = W5.q();
      this.n = var1;
      String[] var2 = var10000;
      if (var2 != null) {
         if (var1 != null) {
            this.Y = var1.getWidth();
            this.B = var1.getHeight();
            this.G = this.l(var1, 0, 0, this.Y, this.B, null);
            if (var2 != null) {
               return;
            }
         }

         this.Y = this.B = 1;
      }

      this.G = null;
   }

   public Image u() {
      return this.n;
   }

   public void E(int var1) {
      this.I = var1;
   }

   public int Z() {
      return this.I;
   }

   public void q(int var1) {
      this.T = var1;
   }

   public int J() {
      return this.T;
   }

   public void j(int var1) {
      this.e.M = var1;
   }

   public int M() {
      return this.e.M;
   }

   public void d(Go2 var1) {
      this.x.addElement(var1);
   }

   public void f(Go2 var1) {
      this.x.removeElement(var1);
   }

   public Vector W() {
      return this.x;
   }

   public void Q(O_3 var1, int var2) {
      var1.X(
         (float)(var2 >> a(13119, 2581595998403621982L) & a(14544, 4175067001360220083L)) * 0.003921569F,
         (float)(var2 >> a(24962, 6665134605975463653L) & a(18639, 4088369156610592681L)) * 0.003921569F,
         (float)(var2 & a(18639, 4088369156610592681L)) * 0.003921569F,
         (float)(var2 >> a(25883, 56641675469300350L) & a(18639, 4088369156610592681L)) * 0.003921569F
      );
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      Bh2 var20;
      boolean var49;
      int var51;
      Yj4 var52;
      Od4 var62;
      Yj4 var63;
      Yj4 var64;
      String[] var10000 = W5.q();
      int var6 = 0;
      int[] var7 = new int[var1 * var2];
      String[] var5 = var10000;
      float var8 = Math.abs(6.0F * this.Q);
      float var67;
      int var48 = (var67 = this.Q - 0.0F) == 0.0F ? 0 : (var67 < 0.0F ? -1 : 1);
      if (var5 != null) {
         var48 = var48 < 0 ? 1 : 0;
      }

      int var9;
      Od4 var10;
      Od4 var11;
      Od4 var12;
      O_3 var13;
      O_3 var14;
      O_3 var15;
      Object var16;
      label348: {
         label352: {
            var9 = var48;
            var10 = new Od4(0.0F, 0.0F, 0.0F);
            var11 = new Od4((float)var1 / 2.0F, (float)var2 / 2.0F, this.j);
            var12 = new Od4();
            var13 = new O_3();
            var14 = new O_3(new Color(this.e.M));
            var15 = new O_3(new Color(this.e.R));
            var16 = this.t;
            var49 = (this.T) != 0;
            label346:
            if (var5 != null) {
               if (this.T != 0) {
                  var49 = (this.T) != 0;
                  if (var5 == null) {
                     break label346;
                  }

                  if (this.T != 1) {
                     var49 = (this.T) != 0;
                     if (var5 == null) {
                        break label346;
                     }

                     if (this.T != 2 && var16 != null) {
                        break label352;
                     }
                  }
               }

               float var68;
               var49 = ((var68 = this.m - 0.0F) == 0.0F ? 0 : (var68 < 0.0F ? -1 : 1)) != 0;
            }

            if (var5 != null) {
               if (var49) {
                  int var17;
                  int var18;
                  int[] var19;
                  label329: {
                     var17 = var1;
                     var18 = var2;
                     var19 = var3;
                     int var50 = this.T;
                     int var10001 = 2;
                     if (var5 != null) {
                        if (this.T == 2) {
                           var51 = (this.t instanceof Bh2) ? 1 : 0;
                           if (var5 == null) {
                              break label329;
                           }

                           if (var51 != 0) {
                              var20 = (Bh2)this.t;
                              var17 = var20.H();
                              var18 = var20.n();
                              var19 = var20.d();
                           }
                        }

                        var50 = var17;
                        var10001 = var18;
                     }

                     var51 = var50 * var10001;
                  }

                  int[] var39 = new int[var51];
                  int[] var21 = new int[var17 * var18];
                  Kernel var22 = HX3.n(this.m);
                  HX3.V(var22, var19, var39, var17, var18, true, false, false, HX3.M);
                  HX3.V(var22, var39, var21, var18, var17, true, false, false, HX3.M);
                  var16 = new Bh2(var21, var17, var18, 1, this.T == 1);
                  if (this.z != 0) {
                     var16 = new WU3(this, (SC)var16);
                  }

                  if (var5 != null) {
                     break label352;
                  }
               }

               var52 = this;
               if (var5 == null) {
                  break label348;
               }

               var49 = (this.T) != 0;
            }

            if (var49 != 2) {
               var16 = new Bh2(var3, var1, var2, 1, this.T == 1);
            }
         }

         var52 = this;
      }

      float var36 = var52.e.g;
      float var37 = 1.0F - var36;
      Od4 var38 = new Od4();
      Od4 var40 = new Od4();
      Od4 var41 = new Od4();
      Go2[] var42 = new Go2[this.x.size()];
      this.x.copyInto(var42);
      int var23 = 0;

      while (var23 < var42.length) {
         var42[var23].j(var1, var2);
         var23++;
         if (var5 == null) {
            break;
         }
      }

      float[][] var43 = new float[3][var1];
      int var24 = 0;

      while (true) {
         if (var24 < var1) {
            var43[1][var24] = var8 * ((SC)var16).h((float)var24, 0.0F);
            var24++;
            if (var5 == null) {
               break;
            }

            if (var5 != null) {
               continue;
            }
         }

         var24 = 0;
         break;
      }

      label297:
      while (true) {
         int var53 = var24;

         label295:
         while (var53 < var2) {
            int var54 = var24;
            if (var5 != null) {
               var54 = var24 > 0 ? 1 : 0;
            }

            int var25 = var54;
            int var55 = var24;
            if (var5 != null) {
               var55 = var24 < var2 - 1 ? 1 : 0;
            }

            int var26 = var55;
            var10.I = (float)var24;
            int var27 = 0;

            while (true) {
               if (var27 < var1) {
                  var43[2][var27] = var8 * ((SC)var16).h((float)var27, (float)(var24 + 1));
                  var27++;
                  if (var5 == null) {
                     break;
                  }

                  if (var5 != null) {
                     continue;
                  }
               }

               var27 = 0;
               break;
            }

            while (var27 < var1) {
               var53 = var27;
               if (var5 == null) {
                  continue label295;
               }

               if (var5 != null) {
                  var53 = var27 > 0 ? 1 : 0;
               }

               int var28 = var53;
               int var56 = var27;
               if (var5 != null) {
                  var56 = var27 < var1 - 1 ? 1 : 0;
               }

               int var29 = var56;
               int var57 = this.T;
               if (var5 != null) {
                  if (this.T != 3) {
      int var58;
                     int var30;
                     float var32;
                     float var33;
                     float var34;
                     float var35;
                     var30 = 0;
                     var12.e = var12.I = var12.k = 0.0F;
                     float var31 = var43[1][var27];
                     var32 = var28 != 0 ? var43[1][var27 - 1] - var31 : 0.0F;
                     var33 = var25 != 0 ? var43[0][var27] - var31 : 0.0F;
                     var34 = var29 != 0 ? var43[1][var27 + 1] - var31 : 0.0F;
                     var35 = var26 != 0 ? var43[2][var27] - var31 : 0.0F;
                     var58 = var28;
                     label274:
                     if (var5 != null) {
                        if (var28 != 0) {
                           var58 = var26;
                           if (var5 == null) {
                              break label274;
                           }

                           if (var26 != 0) {
                              var38.e = -1.0F;
                              var38.I = 0.0F;
                              var38.k = var32;
                              var40.e = 0.0F;
                              var40.I = 1.0F;
                              var40.k = var35;
                              var41.G(var38, var40);
                              var41.E();
                              Od4 var59 = var41;
                              if (var5 != null) {
                                 if ((double)var41.k < 0.0) {
                                    var41.k = -var41.k;
                                 }

                                 var59 = var12;
                              }

                              var59.t(var41);
                              var30++;
                           }
                        }

                        var58 = var28;
                     }

                     label267:
                     if (var5 != null) {
                        if (var58 != 0) {
                           var58 = var25;
                           if (var5 == null) {
                              break label267;
                           }

                           if (var25 != 0) {
                              var38.e = -1.0F;
                              var38.I = 0.0F;
                              var38.k = var32;
                              var40.e = 0.0F;
                              var40.I = -1.0F;
                              var40.k = var33;
                              var41.G(var38, var40);
                              var41.E();
                              Od4 var60 = var41;
                              if (var5 != null) {
                                 if ((double)var41.k < 0.0) {
                                    var41.k = -var41.k;
                                 }

                                 var60 = var12;
                              }

                              var60.t(var41);
                              var30++;
                           }
                        }

                        var58 = var25;
                     }

                     label260:
                     if (var5 != null) {
                        if (var58 != 0) {
                           var58 = var29;
                           if (var5 == null) {
                              break label260;
                           }

                           if (var29 != 0) {
                              var38.e = 0.0F;
                              var38.I = -1.0F;
                              var38.k = var33;
                              var40.e = 1.0F;
                              var40.I = 0.0F;
                              var40.k = var34;
                              var41.G(var38, var40);
                              var41.E();
                              Od4 var61 = var41;
                              if (var5 != null) {
                                 if ((double)var41.k < 0.0) {
                                    var41.k = -var41.k;
                                 }

                                 var61 = var12;
                              }

                              var61.t(var41);
                              var30++;
                           }
                        }

                        var58 = var29;
                     }

                     label358: {
                        if (var5 != null) {
                           if (var58 == 0) {
                              break label358;
                           }

                           var58 = var26;
                        }

                        label359: {
                           if (var5 != null) {
                              if (var58 == 0) {
                                 break label358;
                              }

                              var38.e = 1.0F;
                              var38.I = 0.0F;
                              var38.k = var34;
                              var40.e = 0.0F;
                              var40.I = 1.0F;
                              var40.k = var35;
                              var41.G(var38, var40);
                              var41.E();
                              var62 = var41;
                              if (var5 == null) {
                                 break label359;
                              }

                              double var69;
                              var58 = (var69 = (double)var41.k - 0.0) == 0.0 ? 0 : (var69 < 0.0 ? -1 : 1);
                           }

                           if (var58 < 0) {
                              var41.k = -var41.k;
                           }

                           var62 = var12;
                        }

                        var62.t(var41);
                        var30++;
                     }

                     var12.e /= (float)var30;
                     var12.I /= (float)var30;
                     var12.k /= (float)var30;
                  }

                  var57 = var9;
               }

               if (var5 != null) {
                  if (var57 != 0) {
                     var12.e = -var12.e;
                     var12.I = -var12.I;
                  }

                  var10.e = (float)var27;
                  float var70;
                  var57 = (var70 = var12.k - 0.0F) == 0.0F ? 0 : (var70 < 0.0F ? -1 : 1);
               }

               label234: {
                  label361: {
                     label232: {
                        label362: {
                           if (var5 != null) {
                              if (var57 < 0) {
                                 break label361;
                              }

                              var63 = this;
                              if (var5 == null) {
                                 break label362;
                              }

                              var57 = this.I;
                           }

                           if (var57 == 0) {
                              this.Q(var14, var3[var6]);
                              if (var5 != null) {
                                 break label232;
                              }
                           }

                           var63 = this;
                        }

                        var63.Q(var14, this.e.M);
                     }

                     label218: {
                        if (var36 != 0.0F) {
                           var64 = this;
                           if (var5 == null) {
                              break label218;
                           }

                           if (this.n != null) {
                              this.F.d(var11);
                              this.F.q(var10);
                              this.F.E();
                              this.N.d(var12);
                              this.N.E();
                              this.N.J(2.0F * this.N.Y(this.F));
                              this.N.q(this.V);
                              this.N.E();
                              this.Q(var13, this.r(this.N, var3, var1, var2));
                              var14.T = var36 * var13.T + var37 * var14.T;
                              var14.o = var36 * var13.o + var37 * var14.o;
                              var14.I = var36 * var13.I + var37 * var14.I;
                           }
                        }

                        var64 = this;
                     }

                     O_3 var45 = var64.U(var10, var11, var12, var14, var15, this.e, var42);
                     int var46 = var3[var6] & a(14627, 8998207183960014403L);
                     int var47 = (int)(var45.T * 255.0F) << a(6106, 9014800911978057912L)
                        | (int)(var45.o * 255.0F) << a(1744, 4619197307833172404L)
                        | (int)(var45.I * 255.0F);
                     var7[var6++] = var46 | var47;
                     if (var5 != null) {
                        break label234;
                     }
                  }

                  var7[var6++] = 0;
               }

               var27++;
               if (var5 == null) {
                  break;
               }
            }

            float[] var44 = var43[0];
            var43[0] = var43[1];
            var43[1] = var43[2];
            var43[2] = var44;
            var24++;
            if (var5 == null) {
               return var7;
            }
            continue label297;
         }

         return var7;
      }
   }

   public O_3 U(Od4 var1, Od4 var2, Od4 var3, O_3 var4, O_3 var5, Gy2 var6, Go2[] var7) {
      float var20;
      this.b.t(var4);
      this.b.K(var6.e);
      String[] var10000 = W5.q();
      int var9 = 0;
      String[] var8 = var10000;

      while (true) {
         if (var9 < var7.length) {
            Go2 var10 = var7[var9];
            this.J.d(var3);
            this.d.d(var10.j);
            if (var8 == null) {
               break;
            }

            if (var8 != null) {
               if (var10.T != 1) {
                  this.d.q(var1);
               }

               this.d.E();
            }

            float var11 = this.J.Y(this.d);
            if (var8 != null) {
               label67:
               if ((double)var11 >= 0.0) {
                  float var12;
                  label65: {
                     var12 = 0.0F;
                     this.V.d(var2);
                     this.V.q(var1);
                     this.V.E();
                     if (var8 != null) {
                        if (var10.T == 3) {
                           var12 = var10.r.Y(this.d);
                           var20 = var12;
                           if (var8 == null) {
                              break label65;
                           }

                           if (var12 < var10.X && var8 != null) {
                              break label67;
                           }
                        }

                        this.J.J(2.0F * var11);
                        this.J.q(this.d);
                     }

                     var20 = this.J.Y(this.V);
                  }

                  float var14;
                  label54: {
                     float var13 = var20;
                     float var21 = var13;
                     if (var8 != null) {
                        if ((double)var13 < 0.0) {
                           var14 = 0.0F;
                           if (var8 != null) {
                              break label54;
                           }
                        }

                        var21 = var13 / (var6.G - var6.G * var13 + var13);
                     }

                     var14 = var21;
                  }

                  label47: {
                     Go2 var22 = var10;
                     if (var8 != null) {
                        if (var10.T != 3) {
                           break label47;
                        }

                        var22 = var10;
                     }

                     var12 = var22.X / var12;
                     float var15 = var12 * var12;
                     var15 *= var15;
                     var15 *= var15;
                     var15 = (float)Math.pow((double)var12, (double)(var10.w * 10.0F)) * (1.0F - var15);
                     var14 *= var15;
                     var11 *= var15;
                  }

                  this.g.t(var4);
                  this.g.K(var6.c);
                  this.g.T = this.g.T * var10.H.T * var11;
                  this.g.o = this.g.o * var10.H.o * var11;
                  this.g.I = this.g.I * var10.H.I * var11;
                  this.C.t(var5);
                  this.C.K(var6.p);
                  this.C.T = this.C.T * var10.H.T * var14;
                  this.C.o = this.C.o * var10.H.o * var14;
                  this.C.I = this.C.I * var10.H.I * var14;
                  this.g.v(this.C);
                  this.g.Z(0.0F, 1.0F);
                  this.b.v(this.g);
               }

               var9++;
            }

            if (var8 != null) {
               continue;
            }
         }

         this.b.Z(0.0F, 1.0F);
         break;
      }

      return this.b;
   }

   public int r(Od4 var1, int[] var2, int var3, int var4) {
      boolean var20;
      String[] var5 = W5.q();
      if (this.n == null) {
         return 0;
      } else {
         float var7;
         float var8;
         label68: {
            float var19;
            float var10001;
            label63: {
               float var6;
               label62: {
                  var6 = (float)Math.acos((double)(-var1.I));
                  var8 = var6 / (float) Math.PI;
                  var19 = var8;
                  if (var5 != null) {
                     if (var8 != 0.0F) {
                        var19 = var8;
                        var10001 = 1.0F;
                        if (var5 == null) {
                           break label63;
                        }

                        if (var8 != 1.0F) {
                           break label62;
                        }
                     }

                     var19 = 0.0F;
                  }

                  var7 = var19;
                  if (var5 != null) {
                     break label68;
                  }
               }

               var19 = var1.e;
               var10001 = (float)Math.sin((double)var6);
            }

            label50: {
               float var9;
               label49: {
                  var9 = var19 / var10001;
                  float var25;
                  var20 = (((var25 = var9 - 1.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1)) != 0);
                  if (var5 != null) {
                     if (var20 > 0) {
                        var9 = 1.0F;
                        if (var5 != null) {
                           break label49;
                        }
                     }

                     var19 = var9;
                     var10001 = -1.0F;
                     if (var5 == null) {
                        break label50;
                     }

                     float var26;
                     var20 = (((var26 = var9 - -1.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1)) != 0);
                  }

                  if (var20 < 0) {
                     var9 = -1.0F;
                  }
               }

               var19 = (float)Math.acos((double)var9);
               var10001 = (float) Math.PI;
            }

            var7 = var19 / var10001;
         }

         var7 = NM.X(var7 * (float)this.Y, 0.0F, (float)(this.Y - 1));
         var8 = NM.X(var8 * (float)this.B, 0.0F, (float)(this.B - 1));
         int var18 = (int)var7;
         int var10 = (int)var8;
         float var11 = var7 - (float)var18;
         float var12 = var8 - (float)var10;
         int var13 = this.Y * var10 + var18;
         int var22 = var18;
         if (var5 != null) {
            var22 = var18 == this.Y - 1 ? 0 : 1;
         }

         int var14 = var22;
         var22 = var10;
         if (var5 != null) {
            var22 = var10 == this.B - 1 ? 0 : this.Y;
         }

         int var15 = var22;
         return NM.O(var11, var12, this.G[var13], this.G[var13 + var14], this.G[var13 + var15], this.G[var13 + var14 + var15]);
      }
   }

   @Override
   public String toString() {
      return a;
   }

   public static int K(Yj4 var0) {
      return var0.z;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18273;
      if (i[var3] == null) {
         i[var3] = (int)(f[var3] ^ var1);
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\t\u0006E{@r\u0015u>UpA|P\u001f\u0014ZrJ|\u0003t\\\u0012".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 30;
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
         var10007 = 30;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 68;
               break;
            case 1:
               var50 = 108;
               break;
            case 2:
               var50 = 34;
               break;
            case 3:
               var50 = 9;
               break;
            case 4:
               var50 = 55;
               break;
            case 5:
               var50 = 22;
               break;
            default:
               var50 = 110;
         }
      } else {
         var34 = 30;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8288026510707747843L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "ñNÜ·í«\u0098MÕPK\u0088»\u008c\u0092@\u009e¿¶Å\"F\u0093O ÓòÂ¤\u0090¼«Ý\u0085%\u001cÚ\u0015Îew\u0090s\u009dC\u0017-¿";
            int var13 = "ñNÜ·í«\u0098MÕPK\u0088»\u008c\u0092@\u009e¿¶Å\"F\u0093O ÓòÂ¤\u0090¼«Ý\u0085%\u001cÚ\u0015Îew\u0090s\u009dC\u0017-¿".length();
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
                           f = var14;
                           i = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0011æ©*B\u0095ÊîËÆy¹!±cU";
                        var13 = "\u0011æ©*B\u0095ÊîËÆy¹!±cU".length();
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
         var10007 = 30;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 68;
               break;
            case 1:
               var50 = 108;
               break;
            case 2:
               var50 = 34;
               break;
            case 3:
               var50 = 9;
               break;
            case 4:
               var50 = 55;
               break;
            case 5:
               var50 = 22;
               break;
            default:
               var50 = 110;
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
                  var50 = 68;
                  break;
               case 1:
                  var50 = 108;
                  break;
               case 2:
                  var50 = 34;
                  break;
               case 3:
                  var50 = 9;
                  break;
               case 4:
                  var50 = 55;
                  break;
               case 5:
                  var50 = 22;
                  break;
               default:
                  var50 = 110;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8288026510707747843L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "ñNÜ·í«\u0098MÕPK\u0088»\u008c\u0092@\u009e¿¶Å\"F\u0093O ÓòÂ¤\u0090¼«Ý\u0085%\u001cÚ\u0015Îew\u0090s\u009dC\u0017-¿";
               int var5 = "ñNÜ·í«\u0098MÕPK\u0088»\u008c\u0092@\u009e¿¶Å\"F\u0093O ÓòÂ¤\u0090¼«Ý\u0085%\u001cÚ\u0015Îew\u0090s\u009dC\u0017-¿".length();
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
                              f = var6;
                              i = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0011æ©*B\u0095ÊîËÆy¹!±cU";
                           var5 = "\u0011æ©*B\u0095ÊîËÆy¹!±cU".length();
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
                  var50 = 68;
                  break;
               case 1:
                  var50 = 108;
                  break;
               case 2:
                  var50 = 34;
                  break;
               case 3:
                  var50 = 9;
                  break;
               case 4:
                  var50 = 55;
                  break;
               case 5:
                  var50 = 22;
                  break;
               default:
                  var50 = 110;
            }
         }
      }
   }
}





