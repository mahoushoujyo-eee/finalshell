package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Hi4 extends W5 {
   public float f = 10.0F;
   public float l = 2.0F;
   public float k = 255.0F;
   public float F = 0.0F;
   public int W = a(10209, 3470075007003201056L);
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public void d(float var1) {
      this.f = var1;
   }

   public float Y() {
      return this.f;
   }

   public void k(int var1) {
      this.W = var1;
   }

   public int K() {
      return this.W;
   }

   public void A(float var1) {
      this.l = var1;
   }

   public float P() {
      return this.l;
   }

   public void x(float var1) {
      this.k = var1;
   }

   public float x() {
      return this.k;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      float var101;
      int var92;
      String[] var3;
      int var4;
      int var5;
      byte var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var86;
      label426: {
         var4 = var1.getWidth();
         var5 = var1.getHeight();
         String[] var10002 = W5.q();
         var6 = 1;
         var7 = 1;
         var8 = 0;
         var9 = 0;
         var10 = (int)Math.ceil((double)this.f);
         var3 = var10002;
         int var11 = a(2970, 9106629594823828057L);
         int var13 = var4 + var10 * 2;
         int var14 = var5 + var10 * 2;
         var86 = var10;
         int var10001 = a(9492, 6190982583653993681L);
         if (var3 != null) {
            if (var10 < var10001) {
               var86 = Math.min(a(25604, 3402116962983169472L), var4 + 2 * var10);
               break label426;
            }

            var86 = a(7380, 1665985206938088729L);
            var10001 = var4 + 2 * var10;
         }

         var86 = Math.min(var86, var10001);
      }

      int var53;
      label420: {
         var53 = var86;
         var86 = var10;
         int var105 = a(7190, 1317456372061550044L);
         if (var3 != null) {
            if (var10 < var105) {
               var86 = Math.min(a(25604, 3402116962983169472L), var5 + 2 * var10);
               break label420;
            }

            var86 = a(18018, 6060560817130401701L);
            var105 = var5 + 2 * var10;
         }

         var86 = Math.min(var86, var105);
      }

      int var12;
      label414: {
         var12 = var86;
         BufferedImage var89 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label414;
            }

            var89 = new BufferedImage(var4, var5, 2);
         }

         var2 = var89;
      }

      label408: {
         label407:
         while (true) {
            if (var6 < var12) {
               var6 *= 2;
               var8++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            while (true) {
               if (var7 >= var53) {
                  break label407;
               }

               var86 = var7 * 2;
               if (var3 == null) {
                  break label408;
               }

               var7 = var86;
               var9++;
               if (var3 == null) {
                  break label407;
               }
            }
         }

         var86 = var7;
      }

      int var15 = var86;
      byte var16 = var6;
      var53 = var15;
      byte var55 = var6;
      A1_2 var17 = new A1_2(Math.max(var8, var9));
      int[] var18 = new int[var15 * var6];
      float[][] var19 = new float[2][var15 * var6];
      float[][] var20 = new float[2][var15 * var6];
      float[][] var21 = new float[2][var15 * var6];
      double var22 = Math.PI / (double)this.W;
      double var24 = 1.0 / Math.cos(var22);
      double var26 = (double)(this.f * this.f);
      double var28 = Math.toRadians((double)this.F);
      float var30 = 0.0F;
      int var31 = 0;
      int var32 = 0;

      label391:
      while (true) {
         var86 = var32;

         label388:
         while (var86 < var16) {
            var92 = 0;
            if (var3 == null) {
               break label391;
            }

            int var33 = 0;

            while (var33 < var15) {
               double var34 = (double)((float)var33 - (float)var15 / 2.0F);
               double var36 = (double)((float)var32 - (float)var16 / 2.0F);
               double var38 = var34 * var34 + var36 * var36;
               double var93 = var38;
               if (var3 != null) {
                  double var111;
                  var86 = (var111 = var38 - var26) == 0.0 ? 0 : (var111 < 0.0 ? -1 : 1);
                  if (var3 == null) {
                     continue label388;
                  }

                  var93 = var86 < 0 ? 1.0 : 0.0;
               }

               double var40 = var93;
               if (var3 != null) {
                  if (var40 != 0.0) {
                     label378: {
                        double var94 = Math.sqrt(var38);
                        if (var3 != null) {
                           var38 = var94;
                           if (this.W != 0) {
                              double var42 = Math.atan2(var36, var34) + var28;
                              var42 = NM.g(var42, var22 * 2.0) - var22;
                              var40 = Math.cos(var42) * var24;
                              if (var3 != null) {
                                 break label378;
                              }
                           }

                           var94 = 1.0;
                        }

                        var40 = var94;
                     }

                     double var95 = var40 * var38;
                     if (var3 != null) {
                        var95 = var95 < (double)this.f ? 1.0 : 0.0;
                     }

                     var40 = var95;
                  }

                  var30 += (float)var40;
                  var19[0][var31] = (float)var40;
                  var19[1][var31] = 0.0F;
                  var31++;
                  var33++;
               }

               if (var3 == null) {
                  break;
               }
            }

            var32++;
            if (var3 != null) {
               continue label391;
            }
            break;
         }

         var31 = 0;
         var92 = 0;
         break;
      }

      var32 = var92;

      while (true) {
         if (var32 < var16) {
            var86 = 0;
            if (var3 == null) {
               break;
            }

            int var58 = 0;

            label349: {
               while (var58 < var15) {
                  var19[0][var31] = var19[0][var31] / var30;
                  var31++;
                  var58++;
                  if (var3 == null) {
                     break label349;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               var32++;
            }

            if (var3 != null) {
               continue;
            }
         }

         var17.f(var19[0], var19[1], var15, var16, true);
         var86 = -var10;
         break;
      }

      var32 = var86;

      while (var32 < var5) {
         int var59 = -var10;

         while (true) {
            if (var59 < var4) {
               int var60 = var59;
               int var35 = var32;
               int var61 = var53;
               int var37 = var55;
               int var62 = 0;
               int var39 = 0;
               var86 = var59;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  if (var59 < 0) {
                     var61 = var53 + var59;
                     var62 -= var59;
                     var60 = 0;
                  }

                  var86 = var32;
               }

               if (var3 != null) {
                  if (var86 < 0) {
                     var37 = var55 + var32;
                     var39 -= var32;
                     var35 = 0;
                  }

                  var86 = var60 + var61;
               }

               label438: {
                  int var106 = var4;
                  if (var3 != null) {
                     if (var86 > var4) {
                        var61 = var4 - var60;
                     }

                     var86 = var35 + var37;
                     if (var3 == null) {
                        break label438;
                     }

                     var106 = var5;
                  }

                  if (var86 > var106) {
                     var37 = var5 - var35;
                  }

                  var1.getRGB(var60, var35, var61, var37, var18, var39 * var15 + var62, var15);
                  var31 = 0;
                  var86 = 0;
               }

               int var64 = var86;

               label315: {
                  label314:
                  while (true) {
                     var86 = var64;

                     label312:
                     while (true) {
                        if (var86 >= var16) {
                           break label314;
                        }

                        int var41 = var64 + var32;
                        var86 = var41;
                        if (var3 == null) {
                           break label315;
                        }

                        int var69;
                        label441: {
                           if (var3 != null) {
                              if (var41 < 0) {
                                 var69 = var39;
                                 if (var3 != null) {
                                    break label441;
                                 }
                              }

                              var86 = var41;
                           }

                           if (var3 != null) {
                              if (var86 > var5) {
                                 var69 = var39 + var37 - 1;
                                 if (var3 != null) {
                                    break label441;
                                 }
                              }

                              var86 = var64;
                           }

                           var69 = var86;
                        }

                        var69 *= var15;
                        int var43 = 0;

                        while (var43 < var15) {
                           int var44 = var43 + var59;
                           var86 = var44;
                           if (var3 == null) {
                              continue label312;
                           }

                           int var45;
                           label443: {
                              if (var3 != null) {
                                 if (var44 < 0) {
                                    var45 = var62;
                                    if (var3 != null) {
                                       break label443;
                                    }
                                 }

                                 var86 = var44;
                              }

                              if (var3 != null) {
                                 if (var86 > var4) {
                                    var45 = var62 + var61 - 1;
                                    if (var3 != null) {
                                       break label443;
                                    }
                                 }

                                 var86 = var43;
                              }

                              var45 = var86;
                           }

                           var45 += var69;
                           var21[0][var31] = (float)(var18[var45] >> a(4538, 5806355208998140017L) & a(15484, 3131858357976012210L));
                           float var46 = (float)(var18[var45] >> a(12488, 708924380188481793L) & a(17405, 6625013948377098802L));
                           float var47 = (float)(var18[var45] >> a(16489, 4426838045968886187L) & a(17405, 6625013948377098802L));
                           float var48 = (float)(var18[var45] & a(17405, 6625013948377098802L));
                           float var112;
                           var86 = (var112 = var46 - this.k) == 0.0F ? 0 : (var112 < 0.0F ? -1 : 1);
                           if (var3 != null) {
                              if (var86 > 0) {
                                 var46 *= this.l;
                              }

                              float var113;
                              var86 = (var113 = var47 - this.k) == 0.0F ? 0 : (var113 < 0.0F ? -1 : 1);
                           }

                           label278: {
                              float var107;
                              label444: {
                                 if (var3 != null) {
                                    if (var86 > 0) {
                                       var47 *= this.l;
                                    }

                                    var101 = var48;
                                    var107 = this.k;
                                    if (var3 == null) {
                                       break label444;
                                    }

                                    float var114;
                                    var86 = (var114 = var48 - this.k) == 0.0F ? 0 : (var114 < 0.0F ? -1 : 1);
                                 }

                                 if (var86 <= 0) {
                                    break label278;
                                 }

                                 var101 = var48;
                                 var107 = this.l;
                              }

                              var48 = var101 * var107;
                           }

                           var21[1][var31] = var46;
                           var20[0][var31] = var47;
                           var20[1][var31] = var48;
                           var31++;
                           var45++;
                           var43++;
                           if (var3 == null) {
                              break;
                           }
                        }

                        var64++;
                        if (var3 == null) {
                           break label314;
                        }
                        break;
                     }
                  }

                  var17.f(var21[0], var21[1], var7, var6, true);
                  var17.f(var20[0], var20[1], var7, var6, true);
                  var31 = 0;
                  var86 = 0;
               }

               var64 = var86;

               label254: {
                  while (var64 < var16) {
                     var86 = 0;
                     if (var3 == null) {
                        break label254;
                     }

                     int var66 = 0;

                     while (true) {
                        if (var66 < var15) {
                           float var71 = var21[0][var31];
                           float var74 = var21[1][var31];
                           float var77 = var19[0][var31];
                           float var81 = var19[1][var31];
                           var21[0][var31] = var71 * var77 - var74 * var81;
                           var21[1][var31] = var71 * var81 + var74 * var77;
                           var71 = var20[0][var31];
                           var74 = var20[1][var31];
                           var20[0][var31] = var71 * var77 - var74 * var81;
                           var20[1][var31] = var71 * var81 + var74 * var77;
                           var31++;
                           var66++;
                           if (var3 == null) {
                              break;
                           }

                           if (var3 != null) {
                              continue;
                           }
                        }

                        var64++;
                        break;
                     }

                     if (var3 == null) {
                        break;
                     }
                  }

                  var17.f(var21[0], var21[1], var7, var6, false);
                  var17.f(var20[0], var20[1], var7, var6, false);
                  var64 = var15 >> 1;
                  var86 = var16 >> 1;
               }

               int var67 = var86;
               int var73 = 0;
               int var76 = 0;

               label233: {
                  label232:
                  while (true) {
                     var86 = var76;
                     int var108 = var15;

                     label230:
                     while (true) {
                        if (var86 >= var108) {
                           break label232;
                        }

                        int var78 = var76 ^ var64;
                        int var82 = var78 * var7;
                        var86 = 0;
                        if (var3 == null) {
                           break label233;
                        }

                        int var83 = 0;

                        while (var83 < var15) {
                           int var84 = var82 + (var83 ^ var67);
                           int var85 = (int)var21[0][var84];
                           int var49 = (int)var21[1][var84];
                           int var50 = (int)var20[0][var84];
                           int var51 = (int)var20[1][var84];
                           var86 = var49;
                           var108 = a(17405, 6625013948377098802L);
                           if (var3 == null) {
                              continue label230;
                           }

                           if (var3 != null) {
                              if (var49 > var108) {
                                 var49 = a(17405, 6625013948377098802L);
                              }

                              var86 = var50;
                              var108 = a(17405, 6625013948377098802L);
                           }

                           if (var3 != null) {
                              if (var86 > var108) {
                                 var50 = a(17405, 6625013948377098802L);
                              }

                              var86 = var51;
                              var108 = a(17405, 6625013948377098802L);
                           }

                           if (var3 != null) {
                              if (var86 > var108) {
                                 var51 = a(17405, 6625013948377098802L);
                              }

                              var86 = var85 << a(23565, 8490337640173565377L)
                                 | var49 << a(8685, 2087844581152131117L)
                                 | var50 << a(14928, 2858440818944906134L);
                              var108 = var51;
                           }

                           int var52 = var86 | var108;
                           var18[var73++] = var52;
                           var83++;
                           if (var3 == null) {
                              break;
                           }
                        }

                        var76++;
                        if (var3 == null) {
                           break label232;
                        }
                        break;
                     }
                  }

                  var60 = var59 + var10;
                  var35 = var32 + var10;
                  var61 = var53 - 2 * var10;
                  var37 = var55 - 2 * var10;
                  var86 = var60 + var61;
               }

               int var110 = var4;
               if (var3 != null) {
                  if (var86 > var4) {
                     var61 = var4 - var60;
                  }

                  var86 = var35 + var37;
                  var110 = var5;
               }

               if (var3 != null) {
                  if (var86 > var110) {
                     var37 = var5 - var35;
                  }

                  var2.setRGB(var60, var35, var61, var37, var18, var10 * var15 + var10, var15);
                  var86 = var59;
                  var110 = var53 - 2 * var10;
               }

               var59 = var86 + var110;
               if (var3 != null) {
                  continue;
               }
            }

            var86 = var32 + (var55 - 2 * var10);
            break;
         }

         var32 = var86;
         if (var3 == null) {
            break;
         }
      }

      return var2;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10695;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0017=(uJT\u001e;\"}E\tm\t{\u007fs".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 35;
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
         var10007 = 35;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 118;
               break;
            case 1:
               var50 = 114;
               break;
            case 2:
               var50 = 126;
               break;
            case 3:
               var50 = 36;
               break;
            case 4:
               var50 = 70;
               break;
            case 5:
               var50 = 59;
               break;
            default:
               var50 = 88;
         }
      } else {
         var34 = 35;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3308680173319802439L;
            long[] var14 = new long[15];
            int var11 = 0;
            String var12 = "\u0006KKZ\u0092¯ â\u008eÊ\u00824ÞªÝÙ\u0096\u0013$\u0091«IB¶¥£§¾ ë\u0083\u0007\u0092\u007f8ör\u0092l\u009ep\u0082^çþ2'ä4\u0014k{\u000eyÀbÊJZ¥ËÖÆzÔÈã÷·\u001c¤\u008a\u0007yÇ,7å[\nã%³¢j\u0083z^zZøÃÿ¶»\u009e:¥±øþ\bv.";
            int var13 = "\u0006KKZ\u0092¯ â\u008eÊ\u00824ÞªÝÙ\u0096\u0013$\u0091«IB¶¥£§¾ ë\u0083\u0007\u0092\u007f8ör\u0092l\u009ep\u0082^çþ2'ä4\u0014k{\u000eyÀbÊJZ¥ËÖÆzÔÈã÷·\u001c¤\u008a\u0007yÇ,7å[\nã%³¢j\u0083z^zZøÃÿ¶»\u009e:¥±øþ\bv."
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
                           b = var14;
                           c = new Integer[15];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "L\u009bÂ\u0004q×{»Ô4t\u0092Û¥WV";
                        var13 = "L\u009bÂ\u0004q×{»Ô4t\u0092Û¥WV".length();
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
         var10007 = 35;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 118;
               break;
            case 1:
               var50 = 114;
               break;
            case 2:
               var50 = 126;
               break;
            case 3:
               var50 = 36;
               break;
            case 4:
               var50 = 70;
               break;
            case 5:
               var50 = 59;
               break;
            default:
               var50 = 88;
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
                  var50 = 118;
                  break;
               case 1:
                  var50 = 114;
                  break;
               case 2:
                  var50 = 126;
                  break;
               case 3:
                  var50 = 36;
                  break;
               case 4:
                  var50 = 70;
                  break;
               case 5:
                  var50 = 59;
                  break;
               default:
                  var50 = 88;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3308680173319802439L;
               long[] var6 = new long[15];
               int var3 = 0;
               String var4 = "\u0006KKZ\u0092¯ â\u008eÊ\u00824ÞªÝÙ\u0096\u0013$\u0091«IB¶¥£§¾ ë\u0083\u0007\u0092\u007f8ör\u0092l\u009ep\u0082^çþ2'ä4\u0014k{\u000eyÀbÊJZ¥ËÖÆzÔÈã÷·\u001c¤\u008a\u0007yÇ,7å[\nã%³¢j\u0083z^zZøÃÿ¶»\u009e:¥±øþ\bv.";
               int var5 = "\u0006KKZ\u0092¯ â\u008eÊ\u00824ÞªÝÙ\u0096\u0013$\u0091«IB¶¥£§¾ ë\u0083\u0007\u0092\u007f8ör\u0092l\u009ep\u0082^çþ2'ä4\u0014k{\u000eyÀbÊJZ¥ËÖÆzÔÈã÷·\u001c¤\u008a\u0007yÇ,7å[\nã%³¢j\u0083z^zZøÃÿ¶»\u009e:¥±øþ\bv."
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
                              b = var6;
                              c = new Integer[15];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "L\u009bÂ\u0004q×{»Ô4t\u0092Û¥WV";
                           var5 = "L\u009bÂ\u0004q×{»Ô4t\u0092Û¥WV".length();
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
                  var50 = 118;
                  break;
               case 1:
                  var50 = 114;
                  break;
               case 2:
                  var50 = 126;
                  break;
               case 3:
                  var50 = 36;
                  break;
               case 4:
                  var50 = 70;
                  break;
               case 5:
                  var50 = 59;
                  break;
               default:
                  var50 = 88;
            }
         }
      }
   }
}





