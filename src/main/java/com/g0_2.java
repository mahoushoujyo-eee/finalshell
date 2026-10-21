package com;

import java.awt.Point;
import java.awt.Rectangle;

public class g0_2 extends gy_4 {
   private float i;
   private float u;
   private float M;
   private boolean a = true;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;

   public g0_2() {
      this((float) Math.PI);
   }

   public g0_2(float var1) {
      this(var1, true);
   }

   public g0_2(float var1, boolean var2) {
      this.g(var1);
      this.a = var2;
   }

   public void g(float var1) {
      this.i = var1;
      this.u = (float)Math.cos((double)this.i);
      this.M = (float)Math.sin((double)this.i);
   }

   public float y() {
      return this.i;
   }

   @Override
   protected void T(Rectangle var1) {
      String[] var2 = com.W5.q();
      if (this.a) {
         Point var3 = new Point(0, 0);
         int var4 = b(29964, 3010878173793858377L);
         int var5 = b(8067, 3455053117070236101L);
         int var6 = b(6610, 9150658566894935958L);
         int var7 = b(26391, 8344181275128471888L);
         int var8 = var1.width;
         int var9 = var1.height;
         int var10 = var1.x;
         int var11 = var1.y;
         int var12 = 0;

         label36: {
            while (var12 < 4) {
               if (var2 == null) {
                  break label36;
               }

               int var10000 = var12;
               if (var2 != null) {
                  switch (var12) {
                     case 0:
                        this.z(var10, var11, var3);
                        if (var2 != null) {
                           break;
                        }
                     case 1:
                        this.z(var10 + var8, var11, var3);
                        if (var2 != null) {
                           break;
                        }
                     case 2:
                        this.z(var10, var11 + var9, var3);
                        if (var2 != null) {
                           break;
                        }
                     case 3:
                        this.z(var10 + var8, var11 + var9, var3);
                  }

                  var4 = Math.min(var4, var3.x);
                  var5 = Math.min(var5, var3.y);
                  var6 = Math.max(var6, var3.x);
                  var10000 = Math.max(var7, var3.y);
               }

               var7 = var10000;
               var12++;
               if (var2 == null) {
                  break;
               }
            }

            var1.x = var4;
            var1.y = var5;
            var1.width = var6 - var1.x;
         }

         var1.height = var7 - var1.y;
      }
   }

   private void z(int var1, int var2, Point var3) {
      var3.x = (int)((float)var1 * this.u + (float)var2 * this.M);
      var3.y = (int)((float)var2 * this.u - (float)var1 * this.M);
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      var3[0] = (float)var1 * this.u - (float)var2 * this.M;
      var3[1] = (float)var2 * this.u + (float)var1 * this.M;
   }

   @Override
   public String toString() {
      return b + (int)((double)(this.i * 180.0F) / Math.PI);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0012\\ \bW$H".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 120;
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
         var10007 = 120;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 56;
               break;
            case 1:
               var50 = 75;
               break;
            case 2:
               var50 = 44;
               break;
            case 3:
               var50 = 17;
               break;
            case 4:
               var50 = 91;
               break;
            case 5:
               var50 = 57;
               break;
            default:
               var50 = 16;
         }
      } else {
         var34 = 120;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            b = var39;
            long var9 = 8567805805083310118L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12 = "ú\u0017Ç\u009a(i\u001e\u001c^þ\u00190Áú\u0099v";
            int var13 = "ú\u0017Ç\u009a(i\u001e\u001c^þ\u00190Áú\u0099v".length();
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

                        var12 = "\u0005\u0006l\u00960-g°4\u009a ï\u0019\u008ft\u0090";
                        var13 = "\u0005\u0006l\u00960-g°4\u009a ï\u0019\u008ft\u0090".length();
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
         var10007 = 120;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 56;
               break;
            case 1:
               var50 = 75;
               break;
            case 2:
               var50 = 44;
               break;
            case 3:
               var50 = 17;
               break;
            case 4:
               var50 = 91;
               break;
            case 5:
               var50 = 57;
               break;
            default:
               var50 = 16;
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
                  var50 = 56;
                  break;
               case 1:
                  var50 = 75;
                  break;
               case 2:
                  var50 = 44;
                  break;
               case 3:
                  var50 = 17;
                  break;
               case 4:
                  var50 = 91;
                  break;
               case 5:
                  var50 = 57;
                  break;
               default:
                  var50 = 16;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               b = var36;
               long var0 = 8567805805083310118L;
               long[] var6 = new long[4];
               int var3 = 0;
               String var4 = "ú\u0017Ç\u009a(i\u001e\u001c^þ\u00190Áú\u0099v";
               int var5 = "ú\u0017Ç\u009a(i\u001e\u001c^þ\u00190Áú\u0099v".length();
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

                           var4 = "\u0005\u0006l\u00960-g°4\u009a ï\u0019\u008ft\u0090";
                           var5 = "\u0005\u0006l\u00960-g°4\u009a ï\u0019\u008ft\u0090".length();
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
                  var50 = 56;
                  break;
               case 1:
                  var50 = 75;
                  break;
               case 2:
                  var50 = 44;
                  break;
               case 3:
                  var50 = 17;
                  break;
               case 4:
                  var50 = 91;
                  break;
               case 5:
                  var50 = 57;
                  break;
               default:
                  var50 = 16;
            }
         }
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17990;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





