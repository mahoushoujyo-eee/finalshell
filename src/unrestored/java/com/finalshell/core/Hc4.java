package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Hc4 extends HN3 {
   public float h;
   public float l = 0.0F;
   public float y = 5.0F;
   public float f;
   public float x;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Hc4() {
      this(3.0F, 0.75F, 0.0F);
   }

   public Hc4(float var1, float var2, float var3) {
      this.y = var1;
      this.h = var2;
      this.l = var3;
   }

   public void E(float var1) {
      this.y = var1;
   }

   public float f() {
      return this.y;
   }

   public void H(float var1) {
      this.h = var1;
   }

   public float i() {
      return this.h;
   }

   public void l(float var1) {
      this.l = var1;
   }

   public float Z() {
      return this.l;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      var2 = new HX3((float)((int)this.y)).filter(var1, null);
      this.f = 255.0F * (this.h - this.l * 0.5F);
      this.x = 255.0F * (this.h + this.l * 0.5F);
      return super.filter(var2, var2);
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var5 = var3 >> a(10860, 3937465560785867191L) & a(258, 8657617997906967259L);
      String[] var10000 = W5.q();
      int var6 = var3 >> a(11253, 2727212887988195373L) & a(4703, 3480584574305102209L);
      String[] var4 = var10000;
      int var7 = var3 >> a(19681, 8203901428195145534L) & a(4703, 3480584574305102209L);
      int var8 = var3 & a(4703, 3480584574305102209L);
      int var11 = var5;
      if (var4 != null) {
         if (var5 != a(4703, 3480584574305102209L)) {
            float var9 = NM.k(this.f, this.x, (float)var5);
            var5 = (int)(var9 * 255.0F);
            int var12 = var5;
            if (var4 != null) {
               if (var5 < 0) {
                  var5 = 0;
                  if (var4 != null) {
                     return var5 << a(28767, 7691874018330348419L) | a(21623, 959257861320912810L);
                  }
               }

               var12 = var5;
            }

            int var10001 = a(4703, 3480584574305102209L);
            if (var4 == null) {
               return var12 | var10001;
            }

            if (var12 > var10001) {
               var5 = a(4703, 3480584574305102209L);
            }

            return var5 << a(28767, 7691874018330348419L) | a(21623, 959257861320912810L);
         }

         var11 = -1;
      }

      return var11;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31709;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u001a\u001c/\u0003c<\t)\u001f;\u000e,=b".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 72;
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
         var10007 = 72;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 19;
               break;
            case 1:
               var50 = 56;
               break;
            case 2:
               var50 = 23;
               break;
            case 3:
               var50 = 35;
               break;
            case 4:
               var50 = 74;
               break;
            case 5:
               var50 = 91;
               break;
            default:
               var50 = 4;
         }
      } else {
         var34 = 72;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 4397043545572781215L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "\u001eþ½Å«=|Êåi\u0005éti'\u0004Å;<\u0017\u001c.\u001b©ã\u0090OÿYâÅáèÊ\u0004ë\u0015\u008fÖ»";
            int var13 = "\u001eþ½Å«=|Êåi\u0005éti'\u0004Å;<\u0017\u001c.\u001b©ã\u0090OÿYâÅáèÊ\u0004ë\u0015\u008fÖ»".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

                        var12 = "-\u008aò\u008eô\u00ad|¢\u009aÒâU\u00023ý0";
                        var13 = "-\u008aò\u008eô\u00ad|¢\u009aÒâU\u00023ý0".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
         var10007 = 72;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 19;
               break;
            case 1:
               var50 = 56;
               break;
            case 2:
               var50 = 23;
               break;
            case 3:
               var50 = 35;
               break;
            case 4:
               var50 = 74;
               break;
            case 5:
               var50 = 91;
               break;
            default:
               var50 = 4;
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
                  var50 = 19;
                  break;
               case 1:
                  var50 = 56;
                  break;
               case 2:
                  var50 = 23;
                  break;
               case 3:
                  var50 = 35;
                  break;
               case 4:
                  var50 = 74;
                  break;
               case 5:
                  var50 = 91;
                  break;
               default:
                  var50 = 4;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 4397043545572781215L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "\u001eþ½Å«=|Êåi\u0005éti'\u0004Å;<\u0017\u001c.\u001b©ã\u0090OÿYâÅáèÊ\u0004ë\u0015\u008fÖ»";
               int var5 = "\u001eþ½Å«=|Êåi\u0005éti'\u0004Å;<\u0017\u001c.\u001b©ã\u0090OÿYâÅáèÊ\u0004ë\u0015\u008fÖ»".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

                           var4 = "-\u008aò\u008eô\u00ad|¢\u009aÒâU\u00023ý0";
                           var5 = "-\u008aò\u008eô\u00ad|¢\u009aÒâU\u00023ý0".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                  var50 = 19;
                  break;
               case 1:
                  var50 = 56;
                  break;
               case 2:
                  var50 = 23;
                  break;
               case 3:
                  var50 = 35;
                  break;
               case 4:
                  var50 = 74;
                  break;
               case 5:
                  var50 = 91;
                  break;
               default:
                  var50 = 4;
            }
         }
      }
   }
}





