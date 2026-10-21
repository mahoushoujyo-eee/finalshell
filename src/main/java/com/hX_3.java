package com;

import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

public class hX_3 extends hG_3 {
   protected float e;
   protected Kernel V;
   private static final String b;
   private static final long[] j;
   private static final Integer[] k;

   public hX_3() {
      this(2.0F);
   }

   public hX_3(float var1) {
      this.t(var1);
   }

   public void t(float var1) {
      this.e = var1;
      this.V = n(var1);
   }

   public float C() {
      return this.e;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3;
      int var4;
      int var5;
      label61: {
         String[] var10000 = com.W5.q();
         var4 = var1.getWidth();
         var3 = var10000;
         var5 = var1.getHeight();
         BufferedImage var8 = var2;
         if (var3 != null) {
            if (var2 != null) {
               break label61;
            }

            var8 = this.createCompatibleDestImage(var1, null);
         }

         var2 = var8;
      }

      int[] var6 = new int[var4 * var5];
      int[] var7 = new int[var4 * var5];
      var1.getRGB(0, 0, var4, var5, var6, 0, var4);
      if (var3 != null) {
         if (this.e > 0.0F) {
            boolean var10006;
            label51: {
               label65: {
                  var10006 = this.K;
                  if (var3 != null) {
                     if (!this.K) {
                        break label65;
                     }

                     var10006 = this.J;
                  }

                  if (var3 == null) {
                     break label51;
                  }

                  if (var10006) {
                     var10006 = true;
                     break label51;
                  }
               }

               var10006 = false;
            }

            boolean var10007;
            label40: {
               label66: {
                  V(this.V, var6, var7, var4, var5, this.K, var10006, false, Y);
                  var10007 = this.K;
                  if (var3 != null) {
                     if (!this.K) {
                        break label66;
                     }

                     var10007 = this.J;
                  }

                  if (var3 == null) {
                     break label40;
                  }

                  if (var10007) {
                     var10007 = true;
                     break label40;
                  }
               }

               var10007 = false;
            }

            V(this.V, var7, var6, var5, var4, this.K, false, var10007, Y);
         }

         var2.setRGB(0, 0, var4, var5, var6, 0, var4);
      }

      return var2;
   }

   public static void V(Kernel var0, int[] var1, int[] var2, int var3, int var4, boolean var5, boolean var6, boolean var7, int var8) {
      float[] var10 = var0.getKernelData(null);
      String[] var10000 = com.W5.q();
      int var11 = var0.getWidth();
      String[] var9 = var10000;
      int var12 = var11 / 2;
      int var13 = 0;

      label138:
      while (true) {
         int var36 = var13;

         label136:
         while (var36 < var4) {
            int var14 = var13;
            int var15 = var13 * var3;
            int var16 = 0;

            while (var16 < var3) {
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;
               float var20 = 0.0F;
               int var21 = var12;
               var36 = -var12;
               if (var9 == null) {
                  continue label136;
               }

               int var22 = var36;

               while (true) {
                  if (var22 <= var12) {
                     float var23 = var10[var21 + var22];
                     if (var9 != null) {
                        float var40;
                        var37 = (var40 = var23 - 0.0F) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
                        if (var9 == null) {
                           break;
                        }

                        if (var37 != 0) {
                           label122: {
                              int var24;
                              label146: {
                                 var24 = var16 + var22;
                                 var38 = var24;
                                 if (var9 != null) {
                                    if (var24 < 0) {
                                       var38 = var8;
                                       int var10001 = Y;
                                       if (var9 != null) {
                                          if (var8 == Y) {
                                             var24 = 0;
                                             if (var9 != null) {
                                                break label146;
                                             }
                                          }

                                          var38 = var8;
                                          if (var9 == null) {
                                             break label122;
                                          }

                                          var10001 = M;
                                       }

                                       if (var38 != var10001) {
                                          break label146;
                                       }

                                       var24 = (var16 + var3) % var3;
                                       if (var9 != null) {
                                          break label146;
                                       }
                                    }

                                    var38 = var24;
                                 }

                                 if (var9 == null) {
                                    break label122;
                                 }

                                 label107:
                                 if (var38 >= var3) {
                                    var38 = var8;
                                    int var39 = Y;
                                    if (var9 != null) {
                                       if (var8 == Y) {
                                          var24 = var3 - 1;
                                          if (var9 != null) {
                                             break label107;
                                          }
                                       }

                                       var38 = var8;
                                       if (var9 == null) {
                                          break label122;
                                       }

                                       var39 = M;
                                    }

                                    if (var38 == var39) {
                                       var24 = (var16 + var3) % var3;
                                    }
                                 }
                              }

                              var38 = var1[var15 + var24];
                           }

                           int var25 = var38;
                           int var26 = var25 >> b(32765, 1288259949857954669L) & b(11983, 1525439035383056987L);
                           int var27 = var25 >> b(14682, 6214351987622452687L) & b(29701, 417891550093791380L);
                           int var28 = var25 >> b(19886, 5877941911581387069L) & b(29701, 417891550093791380L);
                           int var29 = var25 & b(29701, 417891550093791380L);
                           if (var9 != null) {
                              if (var6) {
                                 float var30 = (float)var26 * 0.003921569F;
                                 var27 = (int)((float)var27 * var30);
                                 var28 = (int)((float)var28 * var30);
                                 var29 = (int)((float)var29 * var30);
                              }

                              var20 += var23 * (float)var26;
                              var17 += var23 * (float)var27;
                              var18 += var23 * (float)var28;
                           }

                           var19 += var23 * (float)var29;
                        }

                        var22++;
                     }

                     if (var9 != null) {
                        continue;
                     }
                  }

                  var37 = var7;
                  break;
               }

               label87:
               if (var9 != null) {
                  if (var37 != 0) {
                     float var41;
                     var37 = (var41 = var20 - 0.0F) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
                     if (var9 == null) {
                        break label87;
                     }

                     if (var37 != 0) {
                        float var42;
                        var37 = (var42 = var20 - 255.0F) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
                        if (var9 == null) {
                           break label87;
                        }

                        if (var37 != 0) {
                           float var31 = 255.0F / var20;
                           var17 *= var31;
                           var18 *= var31;
                           var19 *= var31;
                        }
                     }
                  }

                  var37 = var5;
               }

               if (var9 != null) {
                  var37 = var37 != 0 ? iw_4.e((int)((double)var20 + 0.5)) : b(29701, 417891550093791380L);
               }

               var22 = var37;
               int var33 = iw_4.e((int)((double)var17 + 0.5));
               int var34 = iw_4.e((int)((double)var18 + 0.5));
               int var35 = iw_4.e((int)((double)var19 + 0.5));
               var2[var14] = var22 << b(16216, 8868121051998493642L)
                  | var33 << b(26936, 3282374628055731631L)
                  | var34 << b(16624, 1505148010116375654L)
                  | var35;
               var14 += var4;
               var16++;
               if (var9 == null) {
                  break;
               }
            }

            var13++;
            if (var9 == null) {
               return;
            }
            continue label138;
         }

         return;
      }
   }

   public static Kernel n(float var0) {
      String[] var10000 = com.W5.q();
      int var2 = (int)Math.ceil((double)var0);
      int var3 = var2 * 2 + 1;
      float[] var4 = new float[var3];
      float var5 = var0 / 3.0F;
      float var6 = 2.0F * var5 * var5;
      float var7 = (float) (Math.PI * 2) * var5;
      String[] var1 = var10000;
      float var8 = (float)Math.sqrt((double)var7);
      float var9 = var0 * var0;
      float var10 = 0.0F;
      int var11 = 0;
      int var12 = -var2;

      while (true) {
         if (var12 <= var2) {
            label36: {
               float var13;
               label35: {
                  var13 = (float)(var12 * var12);
                  if (var1 != null) {
                     float var16;
                     var15 = (var16 = var13 - var9) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
                     if (var1 == null) {
                        break;
                     }

                     if (var15 <= 0) {
                        break label35;
                     }

                     var4[var11] = 0.0F;
                  }

                  if (var1 != null) {
                     break label36;
                  }
               }

               var4[var11] = (float)Math.exp((double)(-var13 / var6)) / var8;
            }

            var10 += var4[var11];
            var11++;
            var12++;
            if (var1 != null) {
               continue;
            }
         }

         var15 = 0;
         break;
      }

      var12 = var15;

      while (var12 < var3) {
         var4[var12] /= var10;
         var12++;
         if (var1 == null) {
            break;
         }
      }

      return new Kernel(var3, 1, var4);
   }

   @Override
   public String toString() {
      return b;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Q1S\n.x:f.U\u0011`Q{Q1S\n/\u0011u".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 6;
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
         var10007 = 6;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 21;
               break;
            case 1:
               var50 = 91;
               break;
            case 2:
               var50 = 32;
               break;
            case 3:
               var50 = 126;
               break;
            case 4:
               var50 = 7;
               break;
            case 5:
               var50 = 57;
               break;
            default:
               var50 = 93;
         }
      } else {
         var34 = 6;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            b = var39;
            long var9 = 4322380899049913772L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "'\u008e\u0013¼ü· s:UA\u000f¡H7\b£B¥{\u008aÉð\u0013A!â\u0091*\u0092ÙÂZ\u009a°<B7íÇ\u0080\u0095ø©\u0086hæÙ";
            int var13 = "'\u008e\u0013¼ü· s:UA\u000f¡H7\b£B¥{\u008aÉð\u0013A!â\u0091*\u0092ÙÂZ\u009a°<B7íÇ\u0080\u0095ø©\u0086hæÙ".length();
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
                           j = var14;
                           k = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "Jþ\u007f)uýÔ\u0099';Dh^E&~";
                        var13 = "Jþ\u007f)uýÔ\u0099';Dh^E&~".length();
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
         var10007 = 6;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 21;
               break;
            case 1:
               var50 = 91;
               break;
            case 2:
               var50 = 32;
               break;
            case 3:
               var50 = 126;
               break;
            case 4:
               var50 = 7;
               break;
            case 5:
               var50 = 57;
               break;
            default:
               var50 = 93;
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
                  var50 = 21;
                  break;
               case 1:
                  var50 = 91;
                  break;
               case 2:
                  var50 = 32;
                  break;
               case 3:
                  var50 = 126;
                  break;
               case 4:
                  var50 = 7;
                  break;
               case 5:
                  var50 = 57;
                  break;
               default:
                  var50 = 93;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               b = var36;
               long var0 = 4322380899049913772L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "'\u008e\u0013¼ü· s:UA\u000f¡H7\b£B¥{\u008aÉð\u0013A!â\u0091*\u0092ÙÂZ\u009a°<B7íÇ\u0080\u0095ø©\u0086hæÙ";
               int var5 = "'\u008e\u0013¼ü· s:UA\u000f¡H7\b£B¥{\u008aÉð\u0013A!â\u0091*\u0092ÙÂZ\u009a°<B7íÇ\u0080\u0095ø©\u0086hæÙ".length();
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
                              j = var6;
                              k = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "Jþ\u007f)uýÔ\u0099';Dh^E&~";
                           var5 = "Jþ\u007f)uýÔ\u0099';Dh^E&~".length();
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
                  var50 = 21;
                  break;
               case 1:
                  var50 = 91;
                  break;
               case 2:
                  var50 = 32;
                  break;
               case 3:
                  var50 = 126;
                  break;
               case 4:
                  var50 = 7;
                  break;
               case 5:
                  var50 = 57;
                  break;
               default:
                  var50 = 93;
            }
         }
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9365;
      if (k[var3] == null) {
         k[var3] = (int)(j[var3] ^ var1);
      }

      return k[var3];
   }
}





