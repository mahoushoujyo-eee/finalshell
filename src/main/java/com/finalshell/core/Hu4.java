package com.finalshell.core;

public class Hu4 extends HN3 {
   public int a;
   public int B;
   public int E;
   public int Z;
   public int e;
   public int T;
   public static String b;
   public static long[] c;
   public static Integer[] d;

   public Hu4() {
      this.O = true;
   }

   public void G(int var1) {
      this.a = var1;
   }

   public int N() {
      return this.a;
   }

   public void A(int var1) {
      this.B = var1;
   }

   public int Y() {
      return this.B;
   }

   public void b(int var1) {
      this.E = var1;
   }

   public int e() {
      return this.E;
   }

   public void d(int var1) {
      this.Z = var1;
   }

   public int L() {
      return this.Z;
   }

   public void T(int var1) {
      this.e = var1;
   }

   public int u() {
      return this.e;
   }

   public void a(int var1) {
      this.T = var1;
   }

   public int w() {
      return this.T;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var4 = var3 & a(22749, 2872125074394513983L);
      int var5 = var3 >> a(8918, 6802955287001790515L) & a(10167, 8873600866088484177L);
      int var6 = var3 >> a(13779, 7262283193810218800L) & a(9501, 2844914205687480313L);
      int var7 = var3 & a(9501, 2844914205687480313L);
      int var8 = Iw4.e(
         (
               this.Z * (this.a * var6 + (a(9501, 2844914205687480313L) - this.a) * var7) / a(9501, 2844914205687480313L)
                  + (a(9501, 2844914205687480313L) - this.Z) * var5
            )
            / a(9501, 2844914205687480313L)
      );
      int var9 = Iw4.e(
         (
               this.e * (this.B * var7 + (a(9501, 2844914205687480313L) - this.B) * var5) / a(9501, 2844914205687480313L)
                  + (a(9501, 2844914205687480313L) - this.e) * var6
            )
            / a(9501, 2844914205687480313L)
      );
      int var10 = Iw4.e(
         (
               this.T * (this.E * var5 + (a(9501, 2844914205687480313L) - this.E) * var6) / a(9501, 2844914205687480313L)
                  + (a(9501, 2844914205687480313L) - this.T) * var7
            )
            / a(9501, 2844914205687480313L)
      );
      return var4 | var8 << a(29276, 7851669298017249468L) | var9 << a(3202, 2575459298467108453L) | var10;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23270;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "J\u000f\u0016U 6rD\t\u0002\u001a\u0011-<g\u000e\u001fV!ks'".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 80;
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
         var10007 = 80;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 89;
               break;
            case 1:
               var50 = 48;
               break;
            case 2:
               var50 = 42;
               break;
            case 3:
               var50 = 106;
               break;
            case 4:
               var50 = 2;
               break;
            case 5:
               var50 = 21;
               break;
            default:
               var50 = 13;
         }
      } else {
         var34 = 80;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            b = var39;
            long var9 = 1540324260034908266L;
            long[] var14 = new long[7];
            int var11 = 0;
            String var12 = "Öª\u0002ÚË\u0081mÄÍå(ÄÌ×Æ\u0007Bé7\u0092@:ïlFM;.Þ×hIÌ¤\u0001Ò \u008b\u0012U";
            int var13 = "Öª\u0002ÚË\u0081mÄÍå(ÄÌ×Æ\u0007Bé7\u0092@:ïlFM;.Þ×hIÌ¤\u0001Ò \u008b\u0012U".length();
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
                           d = new Integer[7];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = ";áûh\u008f\u0014ÿRZ?L®\u008cd¸Æ";
                        var13 = ";áûh\u008f\u0014ÿRZ?L®\u008cd¸Æ".length();
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
         var10007 = 80;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 89;
               break;
            case 1:
               var50 = 48;
               break;
            case 2:
               var50 = 42;
               break;
            case 3:
               var50 = 106;
               break;
            case 4:
               var50 = 2;
               break;
            case 5:
               var50 = 21;
               break;
            default:
               var50 = 13;
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
                  var50 = 89;
                  break;
               case 1:
                  var50 = 48;
                  break;
               case 2:
                  var50 = 42;
                  break;
               case 3:
                  var50 = 106;
                  break;
               case 4:
                  var50 = 2;
                  break;
               case 5:
                  var50 = 21;
                  break;
               default:
                  var50 = 13;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               b = var36;
               long var0 = 1540324260034908266L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "Öª\u0002ÚË\u0081mÄÍå(ÄÌ×Æ\u0007Bé7\u0092@:ïlFM;.Þ×hIÌ¤\u0001Ò \u008b\u0012U";
               int var5 = "Öª\u0002ÚË\u0081mÄÍå(ÄÌ×Æ\u0007Bé7\u0092@:ïlFM;.Þ×hIÌ¤\u0001Ò \u008b\u0012U".length();
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
                              d = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = ";áûh\u008f\u0014ÿRZ?L®\u008cd¸Æ";
                           var5 = ";áûh\u008f\u0014ÿRZ?L®\u008cd¸Æ".length();
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
                  var50 = 89;
                  break;
               case 1:
                  var50 = 48;
                  break;
               case 2:
                  var50 = 42;
                  break;
               case 3:
                  var50 = 106;
                  break;
               case 4:
                  var50 = 2;
                  break;
               case 5:
                  var50 = 21;
                  break;
               default:
                  var50 = 13;
            }
         }
      }
   }
}





