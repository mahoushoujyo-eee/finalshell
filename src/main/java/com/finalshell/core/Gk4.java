package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Gk4 extends Gy4 {
   public int K;
   public float C;
   public float G;
   public float j;
   public float s;
   public float a;
   public static String b;

   public Gk4() {
      this(0);
   }

   public Gk4(int var1) {
      this.K = var1;
      this.Y(1);
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      this.C = (float)var1.getWidth();
      this.G = (float)var1.getHeight();
      this.j = this.C / 2.0F;
      this.s = this.G / 2.0F;
      this.a = Math.max(this.s, this.j);
      return super.filter(var1, var2);
   }

   public void X(int var1) {
      this.K = var1;
   }

   public int T() {
      return this.K;
   }

   public float i(float var1) {
      return var1 * var1;
   }

   @Override
   public void h(int var1, int var2, float[] var3) {
      String[] var10000 = W5.q();
      float var10 = 0.0F;
      String[] var4 = var10000;
      switch (this.K) {
         case 0:
            float var5;
            float var7;
            label193: {
               label205: {
                  label206: {
                     label207: {
                        var5 = 0.0F;
                        float var49;
                        var30 = (var49 = (float)var1 - this.j) == 0.0F ? 0 : (var49 < 0.0F ? -1 : 1);
                        if (var4 != null) {
                           if (var30 >= 0) {
                              float var50;
                              int var31 = (var50 = (float)var2 - this.s) == 0.0F ? 0 : (var50 < 0.0F ? -1 : 1);
                              if (var4 != null) {
                                 if (var31 > 0) {
                                    var5 = (float) Math.PI - (float)Math.atan((double)(((float)var1 - this.j) / ((float)var2 - this.s)));
                                    var10 = (float)Math.sqrt((double)(this.i((float)var1 - this.j) + this.i((float)var2 - this.s)));
                                    if (var4 != null) {
                                       break label207;
                                    }
                                 }

                                 float var51;
                                 var31 = (var51 = (float)var2 - this.s) == 0.0F ? 0 : (var51 < 0.0F ? -1 : 1);
                              }

                              if (var4 != null) {
                                 if (var31 < 0) {
                                    var5 = (float)Math.atan((double)(((float)var1 - this.j) / (this.s - (float)var2)));
                                    var10 = (float)Math.sqrt((double)(this.i((float)var1 - this.j) + this.i(this.s - (float)var2)));
                                    if (var4 != null) {
                                       break label207;
                                    }
                                 }

                                 var5 = (float) (Math.PI / 2);
                                 var31 = var1;
                              }

                              var10 = (float)var31 - this.j;
                              if (var4 != null) {
                                 break label207;
                              }
                           }

                           float var52;
                           var30 = (var52 = (float)var1 - this.j) == 0.0F ? 0 : (var52 < 0.0F ? -1 : 1);
                        }

                        if (var4 == null) {
                           break label206;
                        }

                        label173:
                        if (var30 < 0) {
                           float var10001;
                           label209: {
                              float var53;
                              int var32 = (var53 = (float)var2 - this.s) == 0.0F ? 0 : (var53 < 0.0F ? -1 : 1);
                              if (var4 != null) {
                                 if (var32 < 0) {
                                    var5 = (float) (Math.PI * 2) - (float)Math.atan((double)((this.j - (float)var1) / (this.s - (float)var2)));
                                    var10 = (float)Math.sqrt((double)(this.i(this.j - (float)var1) + this.i(this.s - (float)var2)));
                                    if (var4 != null) {
                                       break label173;
                                    }
                                 }

                                 var33 = (float)var2;
                                 var10001 = this.s;
                                 if (var4 == null) {
                                    break label209;
                                 }

                                 float var54;
                                 var32 = (var54 = var33 - this.s) == 0.0F ? 0 : (var54 < 0.0F ? -1 : 1);
                              }

                              if (var32 > 0) {
                                 var5 = (float) Math.PI + (float)Math.atan((double)((this.j - (float)var1) / ((float)var2 - this.s)));
                                 var10 = (float)Math.sqrt((double)(this.i(this.j - (float)var1) + this.i((float)var2 - this.s)));
                                 if (var4 != null) {
                                    break label173;
                                 }
                              }

                              var5 = (float) (Math.PI * 3.0 / 2.0);
                              var33 = this.j;
                              var10001 = (float)var1;
                           }

                           var10 = var33 - var10001;
                        }
                     }

                     var34 = (float)var1;
                     if (var4 == null) {
                        break label205;
                     }

                     float var55;
                     var30 = (var55 = var34 - this.j) == 0.0F ? 0 : (var55 < 0.0F ? -1 : 1);
                  }

                  if (var30 != 0) {
                     var7 = Math.abs(((float)var2 - this.s) / ((float)var1 - this.j));
                     if (var4 != null) {
                        break label193;
                     }
                  }

                  var34 = 0.0F;
               }

               var7 = var34;
            }

            label149: {
               float var35 = var7;
               if (var4 != null) {
                  if (var7 <= this.G / this.C) {
                     float var36 = (float)var1;
                     if (var4 != null) {
                        if (var36 == this.j) {
                           float var8 = 0.0F;
                           float var9 = this.s;
                           if (var4 != null) {
                              break label149;
                           }
                        }

                        var36 = this.j;
                     }

                     float var19 = var36;
                     float var24 = var7 * var19;
                     if (var4 != null) {
                        break label149;
                     }
                  }

                  var35 = this.s;
               }

               float var25 = var35;
               float var20 = var25 / var7;
            }

            var3[0] = this.C - 1.0F - (this.C - 1.0F) / (float) (Math.PI * 2) * var5;
            var3[1] = this.G * var10 / this.a;
            if (var4 != null) {
               return;
            }
         case 1:
            float var11;
            float var17;
            label201: {
               var17 = (float)var1 / this.C * (float) (Math.PI * 2);
               float var43;
               int var37 = (var43 = var17 - (float) (Math.PI * 3.0 / 2.0)) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
               if (var4 != null) {
                  if (var37 >= 0) {
                     var11 = (float) (Math.PI * 2) - var17;
                     if (var4 != null) {
                        break label201;
                     }
                  }

                  float var44;
                  var37 = (var44 = var17 - (float) Math.PI) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
               }

               label202: {
                  if (var4 != null) {
                     if (var37 >= 0) {
                        var11 = var17 - (float) Math.PI;
                        if (var4 != null) {
      float var38;
      float var38;
                           break label201;
                        }
                     }

                     var38 = var17;
                     if (var4 == null) {
                        break label202;
                     }

                     float var45;
                     var37 = (var45 = var17 - (float) (Math.PI / 2)) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
                  }

                  if (var37 >= 0) {
                     var11 = (float) Math.PI - var17;
                     if (var4 != null) {
                        break label201;
                     }
                  }

                  var38 = var17;
               }

               var11 = var38;
            }

            float var18;
            label117: {
               float var6 = (float)Math.tan((double)var11);
               float var39 = var6;
               if (var4 != null) {
                  if (var6 != 0.0F) {
                     var18 = 1.0F / var6;
                     if (var4 != null) {
                        break label117;
                     }
                  }

                  var39 = 0.0F;
               }

               var18 = var39;
            }

            label110: {
               float var40 = var18;
               if (var4 != null) {
                  if (var18 <= this.G / this.C) {
                     float var41 = var11;
                     if (var4 != null) {
                        if (var11 == 0.0F) {
                           float var21 = 0.0F;
                           float var26 = this.s;
                           if (var4 != null) {
                              break label110;
                           }
                        }

                        var41 = this.j;
                     }

                     float var22 = var41;
                     float var27 = var18 * var22;
                     if (var4 != null) {
                        break label110;
                     }
                  }

                  var40 = this.s;
               }

               float var28 = var40;
               float var23 = var28 / var18;
            }

            var10 = this.a * ((float)var2 / this.G);
            float var12 = -var10 * (float)Math.sin((double)var11);
            float var13 = var10 * (float)Math.cos((double)var11);
            float var46;
            int var42 = (var46 = var17 - (float) (Math.PI * 3.0 / 2.0)) == 0.0F ? 0 : (var46 < 0.0F ? -1 : 1);
            if (var4 != null) {
               if (var42 >= 0) {
                  var3[0] = this.j - var12;
                  var3[1] = this.s - var13;
                  if (var4 != null) {
                     return;
                  }
               }

               double var47;
               var42 = (var47 = (double)var17 - Math.PI) == 0.0 ? 0 : (var47 < 0.0 ? -1 : 1);
            }

            if (var4 != null) {
               if (var42 >= 0) {
                  var3[0] = this.j - var12;
                  var3[1] = this.s + var13;
                  if (var4 != null) {
                     return;
                  }
               }

               double var48;
               var42 = (var48 = (double)var17 - (Math.PI / 2)) == 0.0 ? 0 : (var48 < 0.0 ? -1 : 1);
            }

            if (var42 >= 0) {
               var3[0] = this.j + var12;
               var3[1] = this.s + var13;
               if (var4 != null) {
                  return;
               }
            }

            var3[0] = this.j + var12;
            var3[1] = this.s - var13;
            if (var4 != null) {
               return;
            }
         case 2:
            break;
         default:
            return;
      }

      float var14 = (float)var1 - this.j;
      float var15 = (float)var2 - this.s;
      float var16 = var14 * var14 + var15 * var15;
      var3[0] = this.j + this.j * this.j * var14 / var16;
      var3[1] = this.s + this.s * this.s * var15 / var16;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u000e bRN:5e\u0019~J@:a\t&~TE!/+=tU\u000ffo".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 76;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 76;
         var10006 = var0;
      } else {
         var6 = 76;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 76;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 6;
               break;
            case 1:
               var23 = 5;
               break;
            case 2:
               var23 = 93;
               break;
            case 3:
               var23 = 106;
               break;
            case 4:
               var23 = 109;
               break;
            case 5:
               var23 = 4;
               break;
            default:
               var23 = 13;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}






