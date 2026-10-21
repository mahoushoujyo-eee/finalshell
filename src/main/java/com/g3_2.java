package com;

import java.awt.Rectangle;
import java.util.Random;

public class g3_2 extends gT_3 implements SC, Cloneable {
   protected float E = 32.0F;
   protected float N = 1.0F;
   protected float C = 0.0F;
   public float S = 1.0F;
   public float Y = 1.0F;
   public float J = 0.5F;
   public float y = 0.5F;
   public float r = 2.0F;
   public boolean W = false;
   protected Po_2 I = new com.C4();
   protected float[] D = new float[]{1.0F, 0.0F, 0.0F, 0.0F};
   protected float P;
   protected Random a = new Random();
   protected float i;
   protected float x;
   protected float O;
   protected float h;
   protected pR_3[] n;
   protected float Z;
   protected int X;
   private static byte[] z;
   private float b;
   private static final String c;
   private static final long[] e;
   private static final Integer[] g;

   public g3_2() {
      String[] var10000 = com.W5.q();
      this.i = 1.0F;
      this.x = 0.0F;
      this.O = 0.0F;
      this.h = 1.0F;
      this.n = null;
      String[] var1 = var10000;
      this.Z = 0.0F;
      this.X = a(29060, 2141948544128246428L);
      this.n = new pR_3[3];
      int var2 = 0;

      while (true) {
         if (var2 < this.n.length) {
            this.n[var2] = new pR_3(this);
            var2++;
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         byte[] var11 = z;
         if (var1 != null) {
            if (z != null) {
               break;
            }

            var11 = new byte[a(32426, 3706760276724641204L)];
         }

         z = var11;
         float var10 = 1.0F;
         float var3 = 0.0F;
         float var4 = 2.5F;
         int var5 = 0;

         while (var5 < a(9859, 8218065916300277138L)) {
            if (var5 > 1) {
               var10 *= (float)var5;
            }

            float var6 = (float)Math.pow((double)var4, (double)var5) * (float)Math.exp((double)(-var4)) / var10;
            int var7 = (int)(var3 * 8192.0F);
            var3 += var6;
            int var8 = (int)(var3 * 8192.0F);
            int var9 = var7;

            label36: {
               while (var9 < var8) {
                  z[var9] = (byte)var5;
                  var9++;
                  if (var1 == null) {
                     break label36;
                  }

                  if (var1 == null) {
                     break;
                  }
               }

               var5++;
            }

            if (var1 == null) {
               return;
            }
         }

         return;
      }
   }

   public void u(float var1) {
      this.E = var1;
   }

   public float K() {
      return this.E;
   }

   public void l(float var1) {
      this.N = var1;
   }

   public float D() {
      return this.N;
   }

   public void f(float var1) {
      this.C = var1;
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      this.i = var2;
      this.x = var3;
      this.O = -var3;
      this.h = var2;
   }

   public float C() {
      return this.C;
   }

   public void V(int var1, float var2) {
      this.D[var1] = var2;
   }

   public float m(int var1) {
      return this.D[var1];
   }

   public void c(float var1) {
      this.P = var1;
   }

   public float l() {
      return this.P;
   }

   public void P(float var1) {
      this.b = var1;
   }

   public float E() {
      return this.b;
   }

   public void G(float var1) {
      this.D[0] = var1;
   }

   public float R() {
      return this.D[0];
   }

   public void p(float var1) {
      this.D[1] = var1;
   }

   public float T() {
      return this.D[1];
   }

   public void W(float var1) {
      this.D[2] = var1;
   }

   public float k() {
      return this.D[2];
   }

   public void X(float var1) {
      this.D[3] = var1;
   }

   public float c() {
      return this.D[3];
   }

   public void Q(Po_2 var1) {
      this.I = var1;
   }

   public Po_2 U() {
      return this.I;
   }

   public void U(float var1) {
      this.Z = var1;
   }

   public float F() {
      return this.Z;
   }

   public void W(int var1) {
      this.X = var1;
   }

   public int z() {
      return this.X;
   }

   public void a(float var1) {
      this.r = var1;
   }

   public float M() {
      return this.r;
   }

   public void j(float var1) {
      this.Y = var1;
   }

   public float W() {
      return this.Y;
   }

   public void y(float var1) {
      this.S = var1;
   }

   public float u() {
      return this.S;
   }

   private float G(float var1, float var2, int var3, int var4, pR_3[] var5) {
      String[] var6;
      int var7;
      label180: {
         String[] var10000 = com.W5.q();
         this.a.setSeed((long)(a(9331, 3862882010113816425L) * var3 + a(1115, 6335404623646758722L) * var4));
         var6 = var10000;
         int var20 = this.X;
         if (var6 != null) {
            switch (this.X) {
               case 0:
               default:
                  var7 = z[this.a.nextInt() & a(4989, 4274391125583167590L)];
                  if (var6 != null) {
                     break label180;
                  }
               case 1:
                  var7 = 1;
                  if (var6 != null) {
                     break label180;
                  }
               case 2:
                  var7 = 1;
                  if (var6 != null) {
                     break label180;
                  }
               case 3:
                  var7 = 2;
                  if (var6 != null) {
                     break label180;
                  }
               case 4:
                  var20 = 2;
            }
         }

         var7 = var20;
      }

      int var8 = 0;

      float var21;
      while (true) {
         if (var8 < var7) {
            float var9 = 0.0F;
            float var10 = 0.0F;
            var21 = 1.0F;
            if (var6 == null) {
               break;
            }

            float var11;
            float var10001;
            label165: {
               label184: {
                  label194: {
                     label186: {
                        label187: {
                           label160: {
                              var11 = 1.0F;
                              g3_2 var22 = this;
                              if (var6 != null) {
                                 switch (this.X) {
                                    case 0:
                                       var9 = this.a.nextFloat();
                                       var22 = this;
                                       break;
                                    case 1:
                                       break label160;
                                    case 2:
                                       break label187;
                                    case 3:
                                       break label186;
                                    case 4:
                                       break label194;
                                    default:
                                       break label184;
                                 }
                              }

                              var10 = var22.a.nextFloat();
                              if (var6 != null) {
                                 break label184;
                              }
                           }

                           var10 = 0.5F;
                           var9 = 0.5F;
                           var21 = this.Z;
                           var10001 = 0.0F;
                           if (var6 == null) {
                              break label165;
                           }

                           if (this.Z == 0.0F) {
                              break label184;
                           }

                           var9 = (float)((double)var9 + (double)this.Z * ((double)this.a.nextFloat() - 0.5));
                           var10 = (float)((double)var10 + (double)this.Z * ((double)this.a.nextFloat() - 0.5));
                           if (var6 != null) {
                              break label184;
                           }
                        }

                        label148: {
                           if ((var3 & 1) == 0) {
                              var9 = 0.75F;
                              var10 = 0.0F;
                              if (var6 != null) {
                                 break label148;
                              }
                           }

                           var9 = 0.75F;
                           var10 = 0.5F;
                        }

                        var21 = this.Z;
                        var10001 = 0.0F;
                        if (var6 == null) {
                           break label165;
                        }

                        if (this.Z == 0.0F) {
                           break label184;
                        }

                        var9 += this.Z * uZ.x(271.0F * ((float)var3 + var9), 271.0F * ((float)var4 + var10));
                        var10 += this.Z * uZ.x(271.0F * ((float)var3 + var9) + 89.0F, 271.0F * ((float)var4 + var10) + 137.0F);
                        if (var6 != null) {
                           break label184;
                        }
                     }

                     int var24 = var8;
                     if (var6 != null) {
                        switch (var8) {
                           case 0:
                              var9 = 0.207F;
                              var10 = 0.207F;
                              if (var6 != null) {
                                 break;
                              }
                           case 1:
                              var9 = 0.707F;
                              var10 = 0.707F;
                              var11 = 1.6F;
                        }

                        var21 = this.Z;
                        var10001 = 0.0F;
                        if (var6 == null) {
                           break label165;
                        }

                        float var30;
                        var24 = (var30 = this.Z - 0.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                     }

                     if (var24 == 0) {
                        break label184;
                     }

                     var9 += this.Z * uZ.x(271.0F * ((float)var3 + var9), 271.0F * ((float)var4 + var10));
                     var10 += this.Z * uZ.x(271.0F * ((float)var3 + var9) + 89.0F, 271.0F * ((float)var4 + var10) + 137.0F);
                     if (var6 != null) {
                        break label184;
                     }
                  }

                  label189: {
                     int var25 = var4 & 1;
                     if (var6 != null) {
                        if (var25 == 0) {
                           if (var8 == 0) {
                              var9 = 0.25F;
                              var10 = 0.35F;
                              if (var6 != null) {
                                 break label189;
                              }
                           }

                           var9 = 0.75F;
                           var10 = 0.65F;
                           if (var6 != null) {
                              break label189;
                           }
                        }

                        var25 = var8;
                     }

                     if (var25 == 0) {
                        var9 = 0.75F;
                        var10 = 0.35F;
                        if (var6 != null) {
                           break label189;
                        }
                     }

                     var9 = 0.25F;
                     var10 = 0.65F;
                  }

                  var21 = this.Z;
                  var10001 = 0.0F;
                  if (var6 == null) {
                     break label165;
                  }

                  if (this.Z != 0.0F) {
                     var9 += this.Z * uZ.x(271.0F * ((float)var3 + var9), 271.0F * ((float)var4 + var10));
                     var10 += this.Z * uZ.x(271.0F * ((float)var3 + var9) + 89.0F, 271.0F * ((float)var4 + var10) + 137.0F);
                  }
               }

               var21 = var1;
               var10001 = var9;
            }

            float var14;
            float var16;
            float var17;
            label100: {
               label190: {
                  var16 = Math.abs(var21 - var10001);
                  var17 = Math.abs(var2 - var10);
                  var16 *= var11;
                  var17 *= var11;
                  float var31;
                  int var26 = (var31 = this.r - 1.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                  if (var6 != null) {
                     if (!var26) {
                        var14 = var16 + var17;
                        if (var6 != null) {
                           break label100;
                        }
                     }

                     var21 = this.r;
                     var10001 = 2.0F;
                     if (var6 == null) {
                        break label190;
                     }

                     float var32;
                     var26 = (var32 = this.r - 2.0F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
                  }

                  if (!var26) {
                     var14 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17));
                     if (var6 != null) {
                        break label100;
                     }
                  }

                  var21 = (float)Math.pow((double)var16, (double)this.r);
                  var10001 = (float)Math.pow((double)var17, (double)this.r);
               }

               var14 = (float)Math.pow((double)(var21 + var10001), (double)(1.0F / this.r));
            }

            label192: {
               float var33;
               int var28 = (var33 = var14 - var5[0].S) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
               if (var6 != null) {
                  if (var28 < 0) {
                     pR_3 var15 = var5[2];
                     var5[2] = var5[1];
                     var5[1] = var5[0];
                     var5[0] = var15;
                     var15.S = var14;
                     var15.L = var16;
                     var15.T = var17;
                     var15.E = (float)var3 + var9;
                     var15.k = (float)var4 + var10;
                     if (var6 != null) {
                        break label192;
                     }
                  }

                  float var34;
                  var28 = (var34 = var14 - var5[1].S) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
               }

               if (var6 != null) {
                  if (var28 < 0) {
                     pR_3 var18 = var5[2];
                     var5[2] = var5[1];
                     var5[1] = var18;
                     var18.S = var14;
                     var18.L = var16;
                     var18.T = var17;
                     var18.E = (float)var3 + var9;
                     var18.k = (float)var4 + var10;
                     if (var6 != null) {
                        break label192;
                     }
                  }

                  float var35;
                  var28 = (var35 = var14 - var5[2].S) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
               }

               if (var28 < 0) {
                  pR_3 var19 = var5[2];
                  var19.S = var14;
                  var19.L = var16;
                  var19.T = var17;
                  var19.E = (float)var3 + var9;
                  var19.k = (float)var4 + var10;
               }
            }

            var8++;
            if (var6 != null) {
               continue;
            }
         }

         var21 = var5[2].S;
         break;
      }

      return var21;
   }

   @Override
   public float h(float var1, float var2) {
      String[] var10000 = com.W5.q();
      int var4 = 0;
      String[] var3 = var10000;

      while (true) {
         if (var4 < this.n.length) {
            this.n[var4].S = Float.POSITIVE_INFINITY;
            var4++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         var4 = (int)var1;
         break;
      }

      int var5 = (int)var2;
      float var6 = var1 - (float)var4;
      float var7 = var2 - (float)var5;
      float var8 = this.G(var6, var7, var4, var5, this.n);
      float var22;
      int var16 = (var22 = var8 - var7) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
      if (var3 != null) {
         if (var16 > 0) {
            var8 = this.G(var6, var7 + 1.0F, var4, var5 - 1, this.n);
         }

         float var23;
         var16 = (var23 = var8 - (1.0F - var7)) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
      }

      if (var3 != null) {
         if (var16 > 0) {
            var8 = this.G(var6, var7 - 1.0F, var4, var5 + 1, this.n);
         }

         float var24;
         var16 = (var24 = var8 - var6) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
      }

      label122: {
         label106:
         if (var3 != null) {
            if (var16 > 0) {
               this.G(var6 + 1.0F, var7, var4 - 1, var5, this.n);
               float var25;
               var16 = (var25 = var8 - var7) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
               if (var3 != null) {
                  if (var16 > 0) {
                     var8 = this.G(var6 + 1.0F, var7 + 1.0F, var4 - 1, var5 - 1, this.n);
                  }

                  float var26;
                  var16 = (var26 = var8 - (1.0F - var7)) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
               }

               if (var3 == null) {
                  break label106;
               }

               if (var16 > 0) {
                  var8 = this.G(var6 + 1.0F, var7 - 1.0F, var4 - 1, var5 + 1, this.n);
               }
            }

            var17 = var8;
            if (var3 == null) {
               break label122;
            }

            float var27;
            var16 = (var27 = var8 - (1.0F - var6)) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
         }

         if (var16 > 0) {
            var8 = this.G(var6 - 1.0F, var7, var4 + 1, var5, this.n);
            float var28;
            int var18 = (var28 = var8 - var7) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
            if (var3 != null) {
               if (var18 > 0) {
                  var8 = this.G(var6 - 1.0F, var7 + 1.0F, var4 + 1, var5 - 1, this.n);
               }

               var17 = var8;
               if (var3 == null) {
                  break label122;
               }

               float var29;
               var18 = (var29 = var8 - (1.0F - var7)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
            }

            if (var18 > 0) {
               var8 = this.G(var6 - 1.0F, var7 - 1.0F, var4 + 1, var5 + 1, this.n);
            }
         }

         var17 = 0.0F;
      }

      float var9 = var17;
      int var10 = 0;

      label127: {
         while (true) {
            if (var10 < 3) {
               var9 += this.D[var10] * this.n[var10].S;
               var10++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            float var30;
            var19 = (var30 = this.P - 0.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
            if (var3 == null) {
               break label127;
            }

            if (var19) {
               float var13 = (float)Math.atan2((double)(var2 - this.n[0].k), (double)(var1 - this.n[0].E));
               float var20 = var13;
               float var10001 = 0.0F;
               if (var3 != null) {
                  if (var13 < 0.0F) {
                     var13 += (float) (Math.PI * 2);
                  }

                  float var14 = var13 / (float) (Math.PI * 4);
                  var20 = var9;
                  var10001 = this.P * var14;
               }

               var9 = var20 + var10001;
            }
            break;
         }

         if (var3 == null) {
            return this.b;
         }

         float var31;
         var19 = (var31 = this.b - 0.0F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
      }

      if (var19) {
         float var15 = 1.0F / (this.n[0].T + this.n[0].L);
         var9 += this.b * var15;
      }

      return var9;
   }

   public float m(float var1, float var2, float var3) {
      String[] var10000 = com.W5.q();
      float var5 = 0.0F;
      String[] var4 = var10000;
      float var6 = 1.0F;

      while (true) {
         if (var6 <= var3) {
            var5 += this.h(var6 * var1, var6 * var2) / var6;
            var7 = var6 * 2.0F;
            if (var4 == null) {
               break;
            }

            var6 = var7;
            if (var4 != null) {
               continue;
            }
         }

         var7 = var5;
         break;
      }

      return var7;
   }

   public int J(int var1, int var2, int[] var3, int var4, int var5) {
      String[] var6;
      float var28;
      label30: {
         String[] var10000 = com.W5.q();
         float var7 = this.i * (float)var1 + this.x * (float)var2;
         var6 = var10000;
         float var8 = this.O * (float)var1 + this.h * (float)var2;
         var7 /= this.E;
         var8 /= this.E * this.N;
         var7 += 1000.0F;
         var8 += 1000.0F;
         g3_2 var27 = this;
         if (var6 != null) {
            if (this.Y == 1.0F) {
               var28 = this.h(var7, var8);
               break label30;
            }

            var27 = this;
         }

         var28 = var27.m(var7, var8, this.Y);
      }

      float var9 = var28;
      var9 *= 2.0F;
      var9 *= this.S;
      int var10 = a(6655, 5113470817203358435L);
      Po_2 var29 = this.I;
      if (var6 != null) {
         if (this.I == null) {
            int var24 = iw_4.e((int)(var9 * 255.0F));
            int var25 = var24 << a(5134, 2490397653010089745L);
            int var26 = var24 << a(3534, 799104251934383827L);
            return var10 | var25 | var26 | var24;
         }

         var29 = this.I;
      }

      int var11 = var29.D(var9);
      int var30 = this.W;
      if (var6 != null) {
         if (this.W) {
            int var12 = NM.L((int)((this.n[0].E - 1000.0F) * this.E), 0, var4 - 1);
            int var13 = NM.L((int)((this.n[0].k - 1000.0F) * this.E), 0, var5 - 1);
            var11 = var3[var13 * var4 + var12];
            var9 = (this.n[1].S - this.n[0].S) / (this.n[1].S + this.n[0].S);
            var9 = NM.k(this.D[1], this.D[0], var9);
            var11 = NM.n(var9, a(23767, 9141639842731118535L), var11);
         }

         var30 = var11;
      }

      return var30;
   }

   @Override
   protected int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int var6 = 0;
      String[] var10000 = com.W5.q();
      int[] var7 = new int[var1 * var2];
      int var8 = 0;
      String[] var5 = var10000;

      while (var8 < var2) {
         int var9 = 0;

         while (true) {
            if (var9 < var1) {
               var7[var6++] = this.J(var9, var8, var3, var1, var2);
               var9++;
               if (var5 == null) {
                  break;
               }

               if (var5 != null) {
                  continue;
               }
            }

            var8++;
            break;
         }

         if (var5 == null) {
            break;
         }
      }

      return var7;
   }

   @Override
   public Object clone() {
      g3_2 var1 = (g3_2)super.clone();
      var1.D = (float[])this.D.clone();
      var1.n = (pR_3[])this.n.clone();
      var1.a = new Random();
      return var1;
   }

   @Override
   public String toString() {
      return c;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "2gd*RR>IAy2KU7\u0007p2p\t".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 34;
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
         var10007 = 34;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 68;
               break;
            case 1:
               var50 = 32;
               break;
            case 2:
               var50 = 62;
               break;
            case 3:
               var50 = 124;
               break;
            case 4:
               var50 = 5;
               break;
            case 5:
               var50 = 2;
               break;
            default:
               var50 = 121;
         }
      } else {
         var34 = 34;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            c = var39;
            long var9 = 5898790930797022666L;
            long[] var14 = new long[10];
            int var11 = 0;
            String var12 = "À\u0093n<\u0001\u009e/T\u0093\u000b\u0015]f¦Ú\u009fa\u00896Îôgx\u0098PåSÂÍ\u0004RSÌá\u009cÆaÈG)ÜÚq³a~S\u0011ZÅÐb+À\u0080~À]Ì\u008b³QÊË";
            int var13 = "À\u0093n<\u0001\u009e/T\u0093\u000b\u0015]f¦Ú\u009fa\u00896Îôgx\u0098PåSÂÍ\u0004RSÌá\u009cÆaÈG)ÜÚq³a~S\u0011ZÅÐb+À\u0080~À]Ì\u008b³QÊË"
               .length();
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
                           e = var14;
                           g = new Integer[10];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "yæ-Úoø\u0002\rd¾9ÚÓ¡xR";
                        var13 = "yæ-Úoø\u0002\rd¾9ÚÓ¡xR".length();
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
         var10007 = 34;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 68;
               break;
            case 1:
               var50 = 32;
               break;
            case 2:
               var50 = 62;
               break;
            case 3:
               var50 = 124;
               break;
            case 4:
               var50 = 5;
               break;
            case 5:
               var50 = 2;
               break;
            default:
               var50 = 121;
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
                  var50 = 32;
                  break;
               case 2:
                  var50 = 62;
                  break;
               case 3:
                  var50 = 124;
                  break;
               case 4:
                  var50 = 5;
                  break;
               case 5:
                  var50 = 2;
                  break;
               default:
                  var50 = 121;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               c = var36;
               long var0 = 5898790930797022666L;
               long[] var6 = new long[10];
               int var3 = 0;
               String var4 = "À\u0093n<\u0001\u009e/T\u0093\u000b\u0015]f¦Ú\u009fa\u00896Îôgx\u0098PåSÂÍ\u0004RSÌá\u009cÆaÈG)ÜÚq³a~S\u0011ZÅÐb+À\u0080~À]Ì\u008b³QÊË";
               int var5 = "À\u0093n<\u0001\u009e/T\u0093\u000b\u0015]f¦Ú\u009fa\u00896Îôgx\u0098PåSÂÍ\u0004RSÌá\u009cÆaÈG)ÜÚq³a~S\u0011ZÅÐb+À\u0080~À]Ì\u008b³QÊË"
                  .length();
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
                              e = var6;
                              g = new Integer[10];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "yæ-Úoø\u0002\rd¾9ÚÓ¡xR";
                           var5 = "yæ-Úoø\u0002\rd¾9ÚÓ¡xR".length();
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
                  var50 = 32;
                  break;
               case 2:
                  var50 = 62;
                  break;
               case 3:
                  var50 = 124;
                  break;
               case 4:
                  var50 = 5;
                  break;
               case 5:
                  var50 = 2;
                  break;
               default:
                  var50 = 121;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4888;
      if (g[var3] == null) {
         g[var3] = (int)(e[var3] ^ var1);
      }

      return g[var3];
   }
}





