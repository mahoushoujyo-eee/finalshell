package com;

import java.awt.Color;

public class hU_3 extends hN_3 {
   public float k;
   public float f;
   public float J;
   private float[] d = new float[3];
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public hU_3() {
      this(0.0F, 0.0F, 0.0F);
   }

   public hU_3(float var1, float var2, float var3) {
      this.k = var1;
      this.f = var2;
      this.J = var3;
      this.O = true;
   }

   public void b(float var1) {
      this.k = var1;
   }

   public float y() {
      return this.k;
   }

   public void Y(float var1) {
      this.f = var1;
   }

   public float Y() {
      return this.f;
   }

   public void g(float var1) {
      this.J = var1;
   }

   public float z() {
      return this.J;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var5 = var3 & a(21969, 7741928864024405905L);
      String[] var10000 = com.W5.q();
      int var6 = var3 >> a(17284, 6065292591335158210L) & a(12472, 1395244019735053050L);
      int var7 = var3 >> a(4651, 7630761906355953772L) & a(20486, 6276318792133026375L);
      String[] var4 = var10000;
      int var8 = var3 & a(20486, 6276318792133026375L);
      Color.RGBtoHSB(var6, var7, var8, this.d);
      this.d[0] = this.d[0] + this.k;

      while (true) {
         if (this.d[0] < 0.0F) {
            this.d[0] = (float)((double)this.d[0] + (Math.PI * 2));
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               continue;
            }
         }

         this.d[1] = this.d[1] + this.f;
         break;
      }

      label48: {
         label60: {
            float var11;
            var10 = (var11 = this.d[1] - 0.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
            if (var4 != null) {
               if (var10 < 0) {
                  this.d[1] = 0.0F;
                  if (var4 != null) {
                     break label60;
                  }
               }

               double var12;
               var10 = (var12 = (double)this.d[1] - 1.0) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
            }

            if (var4 == null) {
               break label48;
            }

            if (var10 > 0) {
               this.d[1] = 1.0F;
            }
         }

         this.d[2] = this.d[2] + this.J;
         float var13;
         var10 = (var13 = this.d[2] - 0.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
      }

      label61: {
         if (var4 != null) {
            if (var10 < 0) {
               this.d[2] = 0.0F;
               if (var4 != null) {
                  break label61;
               }
            }

            double var14;
            var10 = (var14 = (double)this.d[2] - 1.0) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
         }

         if (var4 == null) {
            return var10;
         }

         if (var10 > 0) {
            this.d[2] = 1.0F;
         }
      }

      var3 = Color.HSBtoRGB(this.d[0], this.d[1], this.d[2]);
      return var5 | var3 & a(12757, 1734891602475139990L);
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "b$\u001b\u001eN?-`/\u001d\u0004O8\"i\u00185_\u0012b".toCharArray();
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
               var50 = 64;
               break;
            case 1:
               var50 = 42;
               break;
            case 2:
               var50 = 22;
               break;
            case 3:
               var50 = 16;
               break;
            case 4:
               var50 = 93;
               break;
            case 5:
               var50 = 45;
               break;
            default:
               var50 = 99;
         }
      } else {
         var34 = 97;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 4337524088303750666L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "Ýï9p!¢²cº)]\u008as@L\u000f\u0012Ù+\u008c~9,²hd\u001b\\/\u008f)\u009b";
            int var13 = "Ýï9p!¢²cº)]\u008as@L\u000f\u0012Ù+\u008c~9,²hd\u001b\\/\u008f)\u009b".length();
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
                           c = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "i\f\u000b¯aænn\u008f\u000fuè¥\\¿Ø";
                        var13 = "i\f\u000b¯aænn\u008f\u000fuè¥\\¿Ø".length();
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
               var50 = 64;
               break;
            case 1:
               var50 = 42;
               break;
            case 2:
               var50 = 22;
               break;
            case 3:
               var50 = 16;
               break;
            case 4:
               var50 = 93;
               break;
            case 5:
               var50 = 45;
               break;
            default:
               var50 = 99;
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
                  var50 = 64;
                  break;
               case 1:
                  var50 = 42;
                  break;
               case 2:
                  var50 = 22;
                  break;
               case 3:
                  var50 = 16;
                  break;
               case 4:
                  var50 = 93;
                  break;
               case 5:
                  var50 = 45;
                  break;
               default:
                  var50 = 99;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 4337524088303750666L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "Ýï9p!¢²cº)]\u008as@L\u000f\u0012Ù+\u008c~9,²hd\u001b\\/\u008f)\u009b";
               int var5 = "Ýï9p!¢²cº)]\u008as@L\u000f\u0012Ù+\u008c~9,²hd\u001b\\/\u008f)\u009b".length();
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
                              c = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "i\f\u000b¯aænn\u008f\u000fuè¥\\¿Ø";
                           var5 = "i\f\u000b¯aænn\u008f\u000fuè¥\\¿Ø".length();
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
                  var50 = 64;
                  break;
               case 1:
                  var50 = 42;
                  break;
               case 2:
                  var50 = 22;
                  break;
               case 3:
                  var50 = 16;
                  break;
               case 4:
                  var50 = 93;
                  break;
               case 5:
                  var50 = 45;
                  break;
               default:
                  var50 = 99;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29251;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





