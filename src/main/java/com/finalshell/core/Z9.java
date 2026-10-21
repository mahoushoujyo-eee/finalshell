package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;

public class Z9 extends ZH {
   public static int U;
   public static int i;
   public static int G;
   public Kernel V = null;
   public boolean T = true;
   public int y;
   public static long[] a;
   public static Integer[] b;

   public Z9() {
      this(new float[a(4811, 5153385376517548265L)]);
   }

   public Z9(float[] var1) {
      this(new Kernel(3, 3, var1));
   }

   public Z9(int var1, int var2, float[] var3) {
      this(new Kernel(var2, var1, var3));
   }

   public Z9(Kernel var1) {
      this.y = i;
      this.V = var1;
   }

   public void y(Kernel var1) {
      this.V = var1;
   }

   public Kernel Y() {
      return this.V;
   }

   public void C(int var1) {
      this.y = var1;
   }

   public int J() {
      return this.y;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var4;
      int var5;
      label13: {
         String[] var10000 = ZH.U();
         var4 = var1.getWidth();
         String[] var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var8 = var2;
         if (var3 == null) {
            if (var2 != null) {
               break label13;
            }

            var8 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var8;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      this.Q(var1, 0, 0, var4, var5, var6);
      b(this.V, var6, var7, var4, var5, this.T, this.y);
      this.K(var2, 0, 0, var4, var5, var7);
      return var2;
   }

   @Override
   public BufferedImage createCompatibleDestImage(BufferedImage var1, ColorModel var2) {
      String[] var3 = ZH.U();
      ColorModel var10000 = var2;
      if (var3 == null) {
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
      String[] var3 = ZH.U();
      Object var10000 = var2;
      if (var3 == null) {
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

   public static void W(Kernel var0, int[] var1, int[] var2, int var3, int var4, int var5) {
      b(var0, var1, var2, var3, var4, true, var5);
   }

   public static void b(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      Kernel var8;
      label28: {
         String[] var7 = ZH.U();
         int var10000 = var0.getHeight();
         byte var10001 = 1;
         if (var7 == null) {
            if (var10000 == 1) {
               X(var0, var1, var2, var3, var4, var5, var6);
               if (var7 == null) {
                  return;
               }
            }

            var8 = var0;
            if (var7 != null) {
               break label28;
            }

            var10000 = var0.getWidth();
            var10001 = 1;
         }

         if (var10000 == var10001) {
            N(var0, var1, var2, var3, var4, var5, var6);
            if (var7 == null) {
               return;
            }
         }

         var8 = var0;
      }

      h(var8, var1, var2, var3, var4, var5, var6);
   }

   public static void h(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      int var8 = 0;
      String[] var10000 = ZH.U();
      float[] var9 = var0.getKernelData(null);
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
                  if (var7 != null) {
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
                        if (var7 != null) {
                           continue label142;
                        }

                        int var22;
                        label159: {
                           label99:
                           if (var7 == null) {
                              if (0 <= var21) {
                                 var33 = var21;
                                 var10001 = var4;
                                 if (var7 != null) {
                                    break label99;
                                 }

                                 if (var21 < var4) {
                                    var22 = var21 * var3;
                                    if (var7 == null) {
                                       break label159;
                                    }
                                 }
                              }

                              var33 = var6;
                              var10001 = i;
                           }

                           if (var7 == null) {
                              if (var33 == var10001) {
                                 var22 = var14 * var3;
                                 if (var7 == null) {
                                    break label159;
                                 }
                              }

                              var33 = var6;
                              var10001 = G;
                           }

                           if (var7 == null) {
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
                           if (var7 == null) {
                              float var40;
                              var34 = (var40 = var25 - 0.0F) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
                              if (var7 != null) {
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
                                       if (var7 == null) {
                                          if (0 <= var26) {
      int var36;
                                             var36 = var26;
                                             if (var7 != null) {
                                                break label127;
                                             }

                                             if (var26 < var3) {
                                                break label163;
                                             }
                                          }

                                          var35 = var6;
                                          var10001 = i;
                                       }

                                       if (var7 == null) {
                                          if (var35 == var10001) {
                                             var26 = var15;
                                             if (var7 == null) {
                                                break label163;
                                             }
                                          }

                                          var35 = var6;
                                          var10001 = G;
                                       }

                                       if (var7 == null) {
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
                                 var19 += var25 * (float)(var27 >> a(28877, 6660585969314597614L) & a(19522, 7411467199444334181L));
                                 var16 += var25 * (float)(var27 >> a(29082, 6984963813634804659L) & a(19522, 7411467199444334181L));
                                 var17 += var25 * (float)(var27 >> a(8642, 6019011735365147620L) & a(19522, 7411467199444334181L));
                                 var18 += var25 * (float)(var27 & a(19522, 7411467199444334181L));
                              }

                              var24++;
                           }

                           if (var7 != null) {
                              break label137;
                           }
                        }
                     }

                     var20++;
                     if (var7 != null) {
                        break label142;
                     }
                  }
               }

               int var37 = (var5) ? 1 : 0;
               if (var7 == null) {
                  var37 = var5 != 0 ? N6.W((int)((double)var19 + 0.5)) : a(19522, 7411467199444334181L);
               }

               int var28 = var37;
               int var29 = N6.W((int)((double)var16 + 0.5));
               int var30 = N6.W((int)((double)var17 + 0.5));
               int var31 = N6.W((int)((double)var18 + 0.5));
               var2[var8++] = var28 << a(28877, 6660585969314597614L)
                  | var29 << a(29082, 6984963813634804659L)
                  | var30 << a(8642, 6019011735365147620L)
                  | var31;
               var15++;
            } while (var7 == null);

            var14++;
            if (var7 != null) {
               return;
            }
            continue label150;
         }

         return;
      }
   }

   public static void X(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      int var8 = 0;
      String[] var10000 = ZH.U();
      float[] var9 = var0.getKernelData(null);
      int var10 = var0.getWidth();
      String[] var7 = var10000;
      int var11 = var10 / 2;
      int var12 = 0;

      label111:
      while (true) {
         int var27 = var12;

         label109:
         while (var27 < var4) {
            int var13 = var12 * var3;
            int var14 = 0;

            while (var14 < var3) {
               float var15 = 0.0F;
               float var16 = 0.0F;
               float var17 = 0.0F;
               float var18 = 0.0F;
               var27 = -var11;
               if (var7 != null) {
                  continue label109;
               }

               int var19 = var27;

               while (true) {
                  if (var19 <= var11) {
                     float var20 = var9[var11 + var19];
                     if (var7 == null) {
                        float var32;
                        var28 = (var32 = var20 - 0.0F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
                        if (var7 != null) {
                           break;
                        }

                        if (var28 != 0) {
      int var29;
                           label95: {
                              int var21;
                              label118: {
                                 var21 = var14 + var19;
                                 var29 = var21;
                                 if (var7 == null) {
                                    if (var21 < 0) {
                                       var29 = var6;
                                       int var10001 = i;
                                       if (var7 == null) {
                                          if (var6 == i) {
                                             var21 = 0;
                                             if (var7 == null) {
                                                break label118;
                                             }
                                          }

                                          var29 = var6;
                                          if (var7 != null) {
                                             break label95;
                                          }

                                          var10001 = G;
                                       }

                                       if (var29 != var10001) {
                                          break label118;
                                       }

                                       var21 = (var14 + var3) % var3;
                                       if (var7 == null) {
                                          break label118;
                                       }
                                    }

                                    var29 = var21;
                                 }

                                 if (var7 != null) {
                                    break label95;
                                 }

                                 label80:
                                 if (var29 >= var3) {
                                    var29 = var6;
                                    int var30 = i;
                                    if (var7 == null) {
                                       if (var6 == i) {
                                          var21 = var3 - 1;
                                          if (var7 == null) {
                                             break label80;
                                          }
                                       }

                                       var29 = var6;
                                       if (var7 != null) {
                                          break label95;
                                       }

                                       var30 = G;
                                    }

                                    if (var29 == var30) {
                                       var21 = (var14 + var3) % var3;
                                    }
                                 }
                              }

                              var29 = var1[var13 + var21];
                           }

                           int var22 = var29;
                           var18 += var20 * (float)(var22 >> a(13170, 8148950039860726099L) & a(21188, 5323025724233656545L));
                           var15 += var20 * (float)(var22 >> a(29058, 2333827884635065250L) & a(19522, 7411467199444334181L));
                           var16 += var20 * (float)(var22 >> a(27652, 2070484748868097568L) & a(19522, 7411467199444334181L));
                           var17 += var20 * (float)(var22 & a(19522, 7411467199444334181L));
                        }

                        var19++;
                     }

                     if (var7 == null) {
      int var28;
      int var28;
                        continue;
                     }
                  }

                  var28 = var5;
                  break;
               }

               if (var7 == null) {
                  var28 = var28 != 0 ? N6.W((int)((double)var18 + 0.5)) : a(19522, 7411467199444334181L);
               }

               var19 = var28;
               int var24 = N6.W((int)((double)var15 + 0.5));
               int var25 = N6.W((int)((double)var16 + 0.5));
               int var26 = N6.W((int)((double)var17 + 0.5));
               var2[var8++] = var19 << a(28877, 6660585969314597614L)
                  | var24 << a(29082, 6984963813634804659L)
                  | var25 << a(8642, 6019011735365147620L)
                  | var26;
               var14++;
               if (var7 != null) {
                  break;
               }
            }

            var12++;
            if (var7 != null) {
               return;
            }
            continue label111;
         }

         return;
      }
   }

   public static void N(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, int var6) {
      String[] var10000 = ZH.U();
      int var8 = 0;
      String[] var7 = var10000;
      float[] var9 = var0.getKernelData(null);
      int var10 = var0.getHeight();
      int var11 = var10 / 2;
      int var12 = 0;

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
               if (var7 != null) {
                  continue label114;
               }

               int var18 = var27;

               while (true) {
                  if (var18 <= var11) {
                     int var19 = var12 + var18;
                     var28 = var19;
                     if (var7 != null) {
                        break;
                     }

                     int var20;
                     label123: {
                        if (var7 == null) {
                           if (var19 < 0) {
                              int var29 = var6;
                              int var10001 = i;
                              if (var7 == null) {
                                 if (var6 == i) {
                                    var20 = 0;
                                    if (var7 == null) {
                                       break label123;
                                    }
                                 }

                                 var29 = var6;
                                 var10001 = G;
                              }

                              if (var7 == null) {
                                 if (var29 == var10001) {
                                    var20 = (var12 + var4) % var4 * var3;
                                    if (var7 == null) {
                                       break label123;
                                    }
                                 }

                                 var29 = var19;
                                 var10001 = var3;
                              }

                              var20 = var29 * var10001;
                              if (var7 == null) {
                                 break label123;
                              }
                           }

                           var28 = var19;
                        }

                        int var31 = var4;
                        if (var7 == null) {
                           if (var28 >= var4) {
                              int var30 = var6;
                              var31 = i;
                              if (var7 == null) {
                                 if (var6 == i) {
                                    var20 = (var4 - 1) * var3;
                                    if (var7 == null) {
                                       break label123;
                                    }
                                 }

                                 var30 = var6;
                                 var31 = G;
                              }

                              if (var7 == null) {
                                 if (var30 == var31) {
                                    var20 = (var12 + var4) % var4 * var3;
                                    if (var7 == null) {
                                       break label123;
                                    }
                                 }

                                 var30 = var19;
                                 var31 = var3;
                              }

                              var20 = var30 * var31;
                              if (var7 == null) {
                                 break label123;
                              }
                           }

                           var28 = var19;
                           var31 = var3;
                        }

                        var20 = var28 * var31;
                     }

                     float var21 = var9[var18 + var11];
                     if (var7 == null) {
                        if (var21 != 0.0F) {
                           int var22 = var1[var20 + var13];
                           var17 += var21 * (float)(var22 >> a(28877, 6660585969314597614L) & a(19522, 7411467199444334181L));
                           var14 += var21 * (float)(var22 >> a(29082, 6984963813634804659L) & a(19522, 7411467199444334181L));
                           var15 += var21 * (float)(var22 >> a(8642, 6019011735365147620L) & a(19522, 7411467199444334181L));
                           var16 += var21 * (float)(var22 & a(19522, 7411467199444334181L));
                        }

                        var18++;
                     }

                     if (var7 == null) {
                        continue;
                     }
                  }

                  var28 = var5;
                  break;
               }

               if (var7 == null) {
                  var28 = var28 != 0 ? N6.W((int)((double)var17 + 0.5)) : a(19522, 7411467199444334181L);
               }

               var18 = var28;
               int var24 = N6.W((int)((double)var14 + 0.5));
               int var25 = N6.W((int)((double)var15 + 0.5));
               int var26 = N6.W((int)((double)var16 + 0.5));
               var2[var8++] = var18 << a(28877, 6660585969314597614L)
                  | var24 << a(29082, 6984963813634804659L)
                  | var25 << a(8642, 6019011735365147620L)
                  | var26;
               var13++;
               if (var7 != null) {
                  break;
               }
            }

            var12++;
            if (var7 != null) {
               return;
            }
            continue label116;
         }

         return;
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31264;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7680959638925584282L;
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "ÅÛ\u0088;\u0012Ö¬(\u0005v^Ì~\bnÑ< â\u0010ª@ÏzZ:Q\tÄ·-loÈMF]`1²\u0083ÕX®\u0013s\u000f\u0084ã\u000eÃ\u008e\u001d\u001d|vJ§UÈë\u0013\u0011\u0000";
      int var5 = "ÅÛ\u0088;\u0012Ö¬(\u0005v^Ì~\bnÑ< â\u0010ª@ÏzZ:Q\tÄ·-loÈMF]`1²\u0083ÕX®\u0013s\u000f\u0084ã\u000eÃ\u008e\u001d\u001d|vJ§UÈë\u0013\u0011\u0000"
         .length();
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
                     U = 0;
                     i = 1;
                     G = a(2924, 8541464569407566148L);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "w\u0099ÁííZÖÜÝ\u001d\u0005^<ì¬9";
                  var5 = "w\u0099ÁííZÖÜÝ\u001d\u0005^<ì¬9".length();
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





