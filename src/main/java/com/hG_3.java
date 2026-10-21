package com;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

public class hG_3 extends com.W5 {
   public static int g;
   public static int Y;
   public static int M;
   protected Kernel d = null;
   protected boolean K = true;
   protected boolean J = true;
   private int f;
   private static final String a;
   private static final long[] h;
   private static final Integer[] i;

   public hG_3() {
      this(new float[a(17144, 1471952460650239192L)]);
   }

   public hG_3(float[] var1) {
      this(new Kernel(3, 3, var1));
   }

   public hG_3(int var1, int var2, float[] var3) {
      this(new Kernel(var2, var1, var3));
   }

   public hG_3(Kernel var1) {
      this.f = Y;
      this.d = var1;
   }

   public void M(Kernel var1) {
      this.d = var1;
   }

   public Kernel Y() {
      return this.d;
   }

   public void s(int var1) {
      this.f = var1;
   }

   public int p() {
      return this.f;
   }

   public void i(boolean var1) {
      this.K = var1;
   }

   public boolean v() {
      return this.K;
   }

   public void X(boolean var1) {
      this.J = var1;
   }

   public boolean X() {
      return this.J;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label31: {
         String[] var10000 = com.W5.q();
         var4 = var1.getWidth();
         var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var8 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label31;
            }

            var8 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var8;
      }

      int[] var7;
      hG_3 var10;
      label34: {
         int[] var6 = new int[var4 * var5];
         var7 = new int[var4 * var5];
         this.l(var1, 0, 0, var4, var5, var6);
         boolean var9 = this.J;
         if (var3 != null) {
            if (this.J) {
               NM.g(var6, 0, var6.length);
            }

            Q(this.d, var6, var7, var4, var5, this.K, this.f);
            var10 = this;
            if (var3 == null) {
               break label34;
            }

            var9 = this.J;
         }

         if (var9) {
            NM.L(var7, 0, var7.length);
         }

         var10 = this;
      }

      var10.E(var2, 0, 0, var4, var5, var7);
      return var2;
   }

   @Override
   public BufferedImage createCompatibleDestImage(BufferedImage var1, ColorModel var2) {
      String[] var3 = com.W5.q();
      ColorModel var10000 = var2;
      if (var3 != null) {
         if (var2 != null) {
            return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), null);
         }

         var10000 = var1.getColorModel();
      }

      var2 = var10000;
      return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), null);
   }

   @Override
   public Rectangle2D getBounds2D(BufferedImage var1) {
      return new Rectangle(0, 0, var1.getWidth(), var1.getHeight());
   }

   @Override
   public Point2D getPoint2D(Point2D var1, Point2D var2) {
      String[] var3 = com.W5.q();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = new Double();
         }

         var2.setLocation(var1.getX(), var1.getY());
         var10000 = var2;
      }

      return (Point2D)var10000;
   }

   @Override
   public RenderingHints getRenderingHints() {
      return null;
   }

   public static void m(Kernel var0, int[] var1, int[] var2, int var3, int var4, int var5) {
      Q(var0, var1, var2, var3, var4, true, var5);
   }

   public static void Q(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      Kernel var8;
      label28: {
         String[] var7 = com.W5.q();
         int var10000 = var0.getHeight();
         byte var10001 = 1;
         if (var7 != null) {
            if (var10000 == 1) {
               m(var0, var1, var2, var3, var4, var5, var6);
               if (var7 != null) {
                  return;
               }
            }

            var8 = var0;
            if (var7 == null) {
               break label28;
            }

            var10000 = var0.getWidth();
            var10001 = 1;
         }

         if (var10000 == var10001) {
            t(var0, var1, var2, var3, var4, var5, var6);
            if (var7 != null) {
               return;
            }
         }

         var8 = var0;
      }

      V(var8, var1, var2, var3, var4, var5, var6);
   }

   public static void V(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      int var8 = 0;
      float[] var9 = var0.getKernelData(null);
      String[] var10000 = com.W5.q();
      int var10 = var0.getHeight();
      int var11 = var0.getWidth();
      int var12 = var10 / 2;
      String[] var7 = var10000;
      int var13 = var11 / 2;
      int var14 = 0;

      label150:
      while (true) {
         int var32 = var14;

         label148:
         while (var32 < var4) {
            int var15 = 0;

            label145:
            do {
               int var33 = var15;
               int var10001 = var3;

               float var16;
               float var17;
               float var18;
               float var19;
               label142:
               while (true) {
                  if (var33 >= var10001) {
                     break label145;
                  }

                  var16 = 0.0F;
                  var17 = 0.0F;
                  var18 = 0.0F;
                  var19 = 0.0F;
                  var32 = -var12;
                  if (var7 == null) {
                     continue label148;
                  }

                  int var20 = var32;

                  while (true) {
                     int var34 = var20;

                     label137:
                     while (true) {
                        if (var34 > var12) {
                           break label142;
                        }

                        int var21 = var14 + var20;
                        var33 = 0;
                        var10001 = var21;
                        if (var7 == null) {
                           continue label142;
                        }

                        int var22;
                        label159: {
                           label99:
                           if (var7 != null) {
                              if (0 <= var21) {
                                 var33 = var21;
                                 var10001 = var4;
                                 if (var7 == null) {
                                    break label99;
                                 }

                                 if (var21 < var4) {
                                    var22 = var21 * var3;
                                    if (var7 != null) {
                                       break label159;
                                    }
                                 }
                              }

                              var33 = var6;
                              var10001 = Y;
                           }

                           if (var7 != null) {
                              if (var33 == var10001) {
                                 var22 = var14 * var3;
                                 if (var7 != null) {
                                    break label159;
                                 }
                              }

                              var33 = var6;
                              var10001 = M;
                           }

                           if (var7 != null) {
                              if (var33 != var10001) {
                                 break;
                              }

                              var33 = (var21 + var4) % var4;
                              var10001 = var3;
                           }

                           var22 = var33 * var10001;
                        }

                        int var23 = var11 * (var20 + var12) + var13;
                        int var24 = -var13;

                        while (true) {
                           if (var24 > var13) {
                              break label137;
                           }

                           float var25 = var9[var23 + var24];
                           if (var7 != null) {
                              float var40;
                              var34 = (var40 = var25 - 0.0F) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
                              if (var7 == null) {
                                 break;
                              }

                              label111:
                              if (var34 != 0) {
                                 label127: {
                                    int var26;
                                    label163: {
                                       var26 = var15 + var24;
                                       int var35 = 0;
                                       var10001 = var26;
                                       if (var7 != null) {
                                          if (0 <= var26) {
                                             var36 = var26;
                                             if (var7 == null) {
                                                break label127;
                                             }

                                             if (var26 < var3) {
                                                break label163;
                                             }
                                          }

                                          var35 = var6;
                                          var10001 = Y;
                                       }

                                       if (var7 != null) {
                                          if (var35 == var10001) {
                                             var26 = var15;
                                             if (var7 != null) {
                                                break label163;
                                             }
                                          }

                                          var35 = var6;
                                          var10001 = M;
                                       }

                                       if (var7 != null) {
                                          if (var35 != var10001) {
                                             break label111;
                                          }

                                          var35 = var15 + var3;
                                          var10001 = var3;
                                       }

                                       var26 = var35 % var10001;
                                    }

                                    var36 = var1[var22 + var26];
                                 }

                                 int var27 = var36;
                                 var19 += var25 * (float)(var27 >> a(12636, 157449147678107518L) & a(2220, 3750594293869944452L));
                                 var16 += var25 * (float)(var27 >> a(7628, 8511879902027090922L) & a(2220, 3750594293869944452L));
                                 var17 += var25 * (float)(var27 >> a(775, 1072866591581705508L) & a(2220, 3750594293869944452L));
                                 var18 += var25 * (float)(var27 & a(2220, 3750594293869944452L));
                              }

                              var24++;
                           }

                           if (var7 == null) {
                              break label137;
                           }
                        }
                     }

                     var20++;
                     if (var7 == null) {
                        break label142;
                     }
                  }
               }

               int var37 = var5;
               if (var7 != null) {
                  var37 = var5 != 0 ? iw_4.e((int)((double)var19 + 0.5)) : a(2220, 3750594293869944452L);
               }

               int var28 = var37;
               int var29 = iw_4.e((int)((double)var16 + 0.5));
               int var30 = iw_4.e((int)((double)var17 + 0.5));
               int var31 = iw_4.e((int)((double)var18 + 0.5));
               var2[var8++] = var28 << a(12636, 157449147678107518L) | var29 << a(7628, 8511879902027090922L) | var30 << a(775, 1072866591581705508L) | var31;
               var15++;
            } while (var7 != null);

            var14++;
            if (var7 == null) {
               return;
            }
            continue label150;
         }

         return;
      }
   }

   public static void m(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      String[] var10000 = com.W5.q();
      int var8 = 0;
      float[] var9 = var0.getKernelData(null);
      int var10 = var0.getWidth();
      String[] var7 = var10000;
      int var11 = var10 / 2;
      int var12 = 0;

      label111:
      while (true) {
         int var28 = var12;

         label109:
         while (var28 < var4) {
            int var13 = var12 * var3;
            int var14 = 0;

            while (var14 < var3) {
               float var15 = 0.0F;
               float var16 = 0.0F;
               float var17 = 0.0F;
               float var18 = 0.0F;
               int var19 = var11;
               var28 = -var11;
               if (var7 == null) {
                  continue label109;
               }

               int var20 = var28;

               while (true) {
                  if (var20 <= var11) {
                     float var21 = var9[var19 + var20];
                     if (var7 != null) {
                        float var33;
                        var29 = (var33 = var21 - 0.0F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
                        if (var7 == null) {
                           break;
                        }

                        if (var29 != 0) {
                           label95: {
                              int var22;
                              label118: {
                                 var22 = var14 + var20;
                                 var30 = var22;
                                 if (var7 != null) {
                                    if (var22 < 0) {
                                       var30 = var6;
                                       int var10001 = Y;
                                       if (var7 != null) {
                                          if (var6 == Y) {
                                             var22 = 0;
                                             if (var7 != null) {
                                                break label118;
                                             }
                                          }

                                          var30 = var6;
                                          if (var7 == null) {
                                             break label95;
                                          }

                                          var10001 = M;
                                       }

                                       if (var30 != var10001) {
                                          break label118;
                                       }

                                       var22 = (var14 + var3) % var3;
                                       if (var7 != null) {
                                          break label118;
                                       }
                                    }

                                    var30 = var22;
                                 }

                                 if (var7 == null) {
                                    break label95;
                                 }

                                 label80:
                                 if (var30 >= var3) {
                                    var30 = var6;
                                    int var31 = Y;
                                    if (var7 != null) {
                                       if (var6 == Y) {
                                          var22 = var3 - 1;
                                          if (var7 != null) {
                                             break label80;
                                          }
                                       }

                                       var30 = var6;
                                       if (var7 == null) {
                                          break label95;
                                       }

                                       var31 = M;
                                    }

                                    if (var30 == var31) {
                                       var22 = (var14 + var3) % var3;
                                    }
                                 }
                              }

                              var30 = var1[var13 + var22];
                           }

                           int var23 = var30;
                           var18 += var21 * (float)(var23 >> a(12636, 157449147678107518L) & a(2220, 3750594293869944452L));
                           var15 += var21 * (float)(var23 >> a(7628, 8511879902027090922L) & a(2220, 3750594293869944452L));
                           var16 += var21 * (float)(var23 >> a(775, 1072866591581705508L) & a(2220, 3750594293869944452L));
                           var17 += var21 * (float)(var23 & a(2220, 3750594293869944452L));
                        }

                        var20++;
                     }

                     if (var7 != null) {
                        continue;
                     }
                  }

                  var29 = var5;
                  break;
               }

               if (var7 != null) {
                  var29 = var29 != 0 ? iw_4.e((int)((double)var18 + 0.5)) : a(2220, 3750594293869944452L);
               }

               var20 = var29;
               int var25 = iw_4.e((int)((double)var15 + 0.5));
               int var26 = iw_4.e((int)((double)var16 + 0.5));
               int var27 = iw_4.e((int)((double)var17 + 0.5));
               var2[var8++] = var20 << a(12636, 157449147678107518L) | var25 << a(7628, 8511879902027090922L) | var26 << a(775, 1072866591581705508L) | var27;
               var14++;
               if (var7 == null) {
                  break;
               }
            }

            var12++;
            if (var7 == null) {
               return;
            }
            continue label111;
         }

         return;
      }
   }

   public static void t(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      int var8 = 0;
      float[] var9 = var0.getKernelData(null);
      int var10 = var0.getHeight();
      String[] var10000 = com.W5.q();
      int var11 = var10 / 2;
      int var12 = 0;
      String[] var7 = var10000;

      label116:
      while (true) {
         int var27 = var12;

         label114:
         while (var27 < var4) {
            int var13 = 0;

            while (var13 < var3) {
               float var14 = 0.0F;
               float var15 = 0.0F;
               float var16 = 0.0F;
               float var17 = 0.0F;
               var27 = -var11;
               if (var7 == null) {
                  continue label114;
               }

               int var18 = var27;

               while (true) {
                  if (var18 <= var11) {
                     int var19 = var12 + var18;
                     var28 = var19;
                     if (var7 == null) {
                        break;
                     }

                     int var20;
                     label123: {
                        if (var7 != null) {
                           if (var19 < 0) {
                              int var29 = var6;
                              int var10001 = Y;
                              if (var7 != null) {
                                 if (var6 == Y) {
                                    var20 = 0;
                                    if (var7 != null) {
                                       break label123;
                                    }
                                 }

                                 var29 = var6;
                                 var10001 = M;
                              }

                              if (var7 != null) {
                                 if (var29 == var10001) {
                                    var20 = (var12 + var4) % var4 * var3;
                                    if (var7 != null) {
                                       break label123;
                                    }
                                 }

                                 var29 = var19;
                                 var10001 = var3;
                              }

                              var20 = var29 * var10001;
                              if (var7 != null) {
                                 break label123;
                              }
                           }

                           var28 = var19;
                        }

                        int var31 = var4;
                        if (var7 != null) {
                           if (var28 >= var4) {
                              int var30 = var6;
                              var31 = Y;
                              if (var7 != null) {
                                 if (var6 == Y) {
                                    var20 = (var4 - 1) * var3;
                                    if (var7 != null) {
                                       break label123;
                                    }
                                 }

                                 var30 = var6;
                                 var31 = M;
                              }

                              if (var7 != null) {
                                 if (var30 == var31) {
                                    var20 = (var12 + var4) % var4 * var3;
                                    if (var7 != null) {
                                       break label123;
                                    }
                                 }

                                 var30 = var19;
                                 var31 = var3;
                              }

                              var20 = var30 * var31;
                              if (var7 != null) {
                                 break label123;
                              }
                           }

                           var28 = var19;
                           var31 = var3;
                        }

                        var20 = var28 * var31;
                     }

                     float var21 = var9[var18 + var11];
                     if (var7 != null) {
                        if (var21 != 0.0F) {
                           int var22 = var1[var20 + var13];
                           var17 += var21 * (float)(var22 >> a(5182, 1654599850695066137L) & a(23722, 3970314927646722699L));
                           var14 += var21 * (float)(var22 >> a(16086, 161778083640617215L) & a(2220, 3750594293869944452L));
                           var15 += var21 * (float)(var22 >> a(13293, 257311197017974217L) & a(2220, 3750594293869944452L));
                           var16 += var21 * (float)(var22 & a(2220, 3750594293869944452L));
                        }

                        var18++;
                     }

                     if (var7 != null) {
                        continue;
                     }
                  }

                  var28 = var5;
                  break;
               }

               if (var7 != null) {
                  var28 = var28 != 0 ? iw_4.e((int)((double)var17 + 0.5)) : a(2220, 3750594293869944452L);
               }

               var18 = var28;
               int var24 = iw_4.e((int)((double)var14 + 0.5));
               int var25 = iw_4.e((int)((double)var15 + 0.5));
               int var26 = iw_4.e((int)((double)var16 + 0.5));
               var2[var8++] = var18 << a(12636, 157449147678107518L) | var24 << a(7628, 8511879902027090922L) | var25 << a(775, 1072866591581705508L) | var26;
               var13++;
               if (var7 == null) {
                  break;
               }
            }

            var12++;
            if (var7 == null) {
               return;
            }
            continue label116;
         }

         return;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "C<b\\\\;\u001do&xB\u0005\u001d\\/~".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 97;
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
         var10007 = 97;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 96;
               break;
            case 1:
               var50 = 49;
               break;
            case 2:
               var50 = 118;
               break;
            case 3:
               var50 = 79;
               break;
            case 4:
               var50 = 18;
               break;
            case 5:
               var50 = 25;
               break;
            default:
               var50 = 19;
         }
      } else {
         var34 = 97;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 5850812507718197699L;
            long[] var14 = new long[10];
            int var11 = 0;
            String var12 = "â\u0086Á¡\r$ë·ðÂ\u0082\u0080Æ¥u\u0012þÀ\u0098\u0001\u0003h4ï¸ïÙýt~\u0006¥bØ+\u0000\u00adÊ\u0093ì-Þú\u0007\u008f\b\u0004\u0002`\u0005×\u001e+ì£Â\u0014ä\u0094\bZè*9";
            int var13 = "â\u0086Á¡\r$ë·ðÂ\u0082\u0080Æ¥u\u0012þÀ\u0098\u0001\u0003h4ï¸ïÙýt~\u0006¥bØ+\u0000\u00adÊ\u0093ì-Þú\u0007\u008f\b\u0004\u0002`\u0005×\u001e+ì£Â\u0014ä\u0094\bZè*9"
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
                           h = var14;
                           i = new Integer[10];
                           g = 0;
                           Y = 1;
                           M = a(9224, 8941948126168494637L);
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "uÕtÁF#\t,Çvà¶\u0097M?¸";
                        var13 = "uÕtÁF#\t,Çvà¶\u0097M?¸".length();
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
         var10007 = 97;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 96;
               break;
            case 1:
               var50 = 49;
               break;
            case 2:
               var50 = 118;
               break;
            case 3:
               var50 = 79;
               break;
            case 4:
               var50 = 18;
               break;
            case 5:
               var50 = 25;
               break;
            default:
               var50 = 19;
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
                  var50 = 96;
                  break;
               case 1:
                  var50 = 49;
                  break;
               case 2:
                  var50 = 118;
                  break;
               case 3:
                  var50 = 79;
                  break;
               case 4:
                  var50 = 18;
                  break;
               case 5:
                  var50 = 25;
                  break;
               default:
                  var50 = 19;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 5850812507718197699L;
               long[] var6 = new long[10];
               int var3 = 0;
               String var4 = "â\u0086Á¡\r$ë·ðÂ\u0082\u0080Æ¥u\u0012þÀ\u0098\u0001\u0003h4ï¸ïÙýt~\u0006¥bØ+\u0000\u00adÊ\u0093ì-Þú\u0007\u008f\b\u0004\u0002`\u0005×\u001e+ì£Â\u0014ä\u0094\bZè*9";
               int var5 = "â\u0086Á¡\r$ë·ðÂ\u0082\u0080Æ¥u\u0012þÀ\u0098\u0001\u0003h4ï¸ïÙýt~\u0006¥bØ+\u0000\u00adÊ\u0093ì-Þú\u0007\u008f\b\u0004\u0002`\u0005×\u001e+ì£Â\u0014ä\u0094\bZè*9"
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
                              h = var6;
                              i = new Integer[10];
                              g = 0;
                              Y = 1;
                              M = a(9224, 8941948126168494637L);
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "uÕtÁF#\t,Çvà¶\u0097M?¸";
                           var5 = "uÕtÁF#\t,Çvà¶\u0097M?¸".length();
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
                  var50 = 96;
                  break;
               case 1:
                  var50 = 49;
                  break;
               case 2:
                  var50 = 118;
                  break;
               case 3:
                  var50 = 79;
                  break;
               case 4:
                  var50 = 18;
                  break;
               case 5:
                  var50 = 25;
                  break;
               default:
                  var50 = 19;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5665;
      if (i[var3] == null) {
         i[var3] = (int)(h[var3] ^ var1);
      }

      return i[var3];
   }
}





