package com;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class hL_3 extends com.W5 {
   private float F = 0.0F;
   private float k = 0.0F;
   private float D = 0.0F;
   private int J;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public void z(float var1) {
      this.F = var1;
   }

   public float n() {
      return this.F;
   }

   public void u(float var1) {
      this.k = var1;
   }

   public float e() {
      return this.k;
   }

   public void Y(float var1) {
      this.D = var1;
   }

   public float w() {
      return this.D;
   }

   public void V(int var1) {
      this.J = var1;
   }

   public int c() {
      return this.J;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = com.W5.q();
      int var4 = var1.getWidth();
      int var5 = var1.getHeight();
      String[] var3 = var10000;
      int var6 = var1.getType();
      WritableRaster var7 = var1.getRaster();
      BufferedImage var23 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var23 = var2;
      }

      WritableRaster var8 = var23.getRaster();
      float[] var9 = null;
      Object var10 = null;
      int var11 = this.J;
      int var12 = var11 >> a(30271, 3427552491576289018L) & a(5437, 8474625266174494207L);
      int var13 = var11 >> a(5624, 2459426018438546751L) & a(24318, 6538686542428556863L);
      int var14 = var11 & a(24318, 6538686542428556863L);
      var10 = Color.RGBtoHSB(var12, var14, var13, (float[])var10);
      int[] var15 = null;
      int var16 = 0;

      label61:
      while (true) {
         int var24 = var16;

         label59:
         while (var24 < var5) {
            var15 = this.l(var1, 0, var16, var4, 1, var15);
            int var17 = 0;

            while (var17 < var4) {
               int var18 = var15[var17];
               int var19 = var18 >> a(598, 6246191735092744848L) & a(24318, 6538686542428556863L);
               int var20 = var18 >> a(23309, 8437934781275851725L) & a(24318, 6538686542428556863L);
               int var21 = var18 & a(24318, 6538686542428556863L);
               var9 = Color.RGBtoHSB(var19, var21, var20, var9);
               float var25;
               var24 = (var25 = Math.abs(var9[0] - ((Object[])var10)[0]) - this.F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
               if (var3 == null) {
                  continue label59;
               }

               label53: {
                  label67: {
                     if (var3 != null) {
                        if (var24 >= 0) {
                           break label67;
                        }

                        float var26;
                        var24 = (var26 = Math.abs(var9[1] - ((Object[])var10)[1]) - this.k) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
                     }

                     if (var3 != null) {
                        if (var24 >= 0) {
                           break label67;
                        }

                        float var27;
                        var24 = (var27 = Math.abs(var9[2] - ((Object[])var10)[2]) - this.D) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
                     }

                     if (var24 < 0) {
                        var15[var17] = var18 & a(30098, 2246021578804192593L);
                        if (var3 != null) {
                           break label53;
                        }
                     }
                  }

                  var15[var17] = var18;
               }

               var17++;
               if (var3 == null) {
                  break;
               }
            }

            this.E(var2, 0, var16, var4, 1, var15);
            var16++;
            if (var3 == null) {
               return var2;
            }
            continue label61;
         }

         return var2;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "@tQ%*f\nHyZ#)`\u0005@tQbj/".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 121;
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
         var10007 = 121;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 114;
               break;
            case 1:
               var50 = 104;
               break;
            case 2:
               var50 = 81;
               break;
            case 3:
               var50 = 53;
               break;
            case 4:
               var50 = 61;
               break;
            case 5:
               var50 = 120;
               break;
            default:
               var50 = 92;
         }
      } else {
         var34 = 121;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 4698780237102926517L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "\u000eP/ò$¦Ð\u001b\u0082\u0003Æ\u0099\u008cÄÏµÒBqz\u00ad1\u0084uÎØ©\u001dÅù\u0001pa>Ð9\u001aGO\u0082";
            int var13 = "\u000eP/ò$¦Ð\u001b\u0082\u0003Æ\u0099\u008cÄÏµÒBqz\u00ad1\u0084uÎØ©\u001dÅù\u0001pa>Ð9\u001aGO\u0082".length();
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
                           c = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "÷Ñ *ï\nX5\u000b/è«;M¬_";
                        var13 = "÷Ñ *ï\nX5\u000b/è«;M¬_".length();
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
         var10007 = 121;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 114;
               break;
            case 1:
               var50 = 104;
               break;
            case 2:
               var50 = 81;
               break;
            case 3:
               var50 = 53;
               break;
            case 4:
               var50 = 61;
               break;
            case 5:
               var50 = 120;
               break;
            default:
               var50 = 92;
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
                  var50 = 114;
                  break;
               case 1:
                  var50 = 104;
                  break;
               case 2:
                  var50 = 81;
                  break;
               case 3:
                  var50 = 53;
                  break;
               case 4:
                  var50 = 61;
                  break;
               case 5:
                  var50 = 120;
                  break;
               default:
                  var50 = 92;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 4698780237102926517L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "\u000eP/ò$¦Ð\u001b\u0082\u0003Æ\u0099\u008cÄÏµÒBqz\u00ad1\u0084uÎØ©\u001dÅù\u0001pa>Ð9\u001aGO\u0082";
               int var5 = "\u000eP/ò$¦Ð\u001b\u0082\u0003Æ\u0099\u008cÄÏµÒBqz\u00ad1\u0084uÎØ©\u001dÅù\u0001pa>Ð9\u001aGO\u0082".length();
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
                              c = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "÷Ñ *ï\nX5\u000b/è«;M¬_";
                           var5 = "÷Ñ *ï\nX5\u000b/è«;M¬_".length();
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
                  var50 = 114;
                  break;
               case 1:
                  var50 = 104;
                  break;
               case 2:
                  var50 = 81;
                  break;
               case 3:
                  var50 = 53;
                  break;
               case 4:
                  var50 = 61;
                  break;
               case 5:
                  var50 = 120;
                  break;
               default:
                  var50 = 92;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4291;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





