package com;

public class hO_3 extends hN_3 {
   private float W = 32.0F;
   private float N = 1.0F;
   private float R = 0.0F;
   private float J = 1.0F;
   private float B = 0.5F;
   private Po_2 l;
   private float z = 1.0F;
   private float C = 0.0F;
   private float e = 0.0F;
   private float Z = 1.0F;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public void W(float var1) {
      this.W = var1;
   }

   public float z() {
      return this.W;
   }

   public void w(float var1) {
      this.N = var1;
   }

   public float A() {
      return this.N;
   }

   public void p(float var1) {
      this.R = var1;
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      this.z = var2;
      this.C = var3;
      this.e = -var3;
      this.Z = var2;
   }

   public float n() {
      return this.R;
   }

   public void Y(float var1) {
      this.J = var1;
   }

   public float S() {
      return this.J;
   }

   public void d(float var1) {
      this.B = var1;
   }

   public float Q() {
      return this.B;
   }

   public void h(Po_2 var1) {
      this.l = var1;
   }

   public Po_2 s() {
      return this.l;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      float var5 = this.z * (float)var1 + this.C * (float)var2;
      float var6 = this.e * (float)var1 + this.Z * (float)var2;
      String[] var10000 = com.W5.q();
      var5 /= this.W * this.N;
      String[] var4 = var10000;
      var6 /= this.W;
      int var7 = var3 & a(25334, 1028721984713644582L);
      hO_3 var36 = this;
      if (var4 != null) {
         if (this.l != null) {
            float var24 = this.B * uZ.q(var5, var6, this.J);
            float var26 = 3.0F * this.B * var24 + var6;
            var26 = (float)Math.sin((double)var26 * Math.PI);
            float var29 = (float)Math.sin(40.0 * (double)var24);
            var26 = (float)((double)var26 + 0.2 * (double)var29);
            return this.l.D(var26);
         }

         var36 = this;
      }

      float var11 = var36.B * uZ.q(var5, var6, this.J);
      float var18 = (float)Math.sin(Math.sin(8.0 * (double)var11 + (double)(7.0F * var5) + 3.0 * (double)var6));
      float var12;
      float var13 = var12 = Math.abs(var18);
      float var14 = (float)Math.sin(40.0 * (double)var11);
      var14 = Math.abs(var14);
      float var15 = 0.6F * var14 + 0.3F;
      float var16 = 0.2F * var14 + 0.8F;
      float var17 = 0.15F * var14 + 0.85F;
      float var9 = 0.5F * (float)Math.pow((double)Math.abs(var12), 0.3);
      var12 = (float)Math.pow(0.5 * ((double)var12 + 1.0), 0.6) * var15;
      var13 = (float)Math.pow(0.5 * ((double)var13 + 1.0), 0.6) * var16;
      float var8 = (0.5F * var12 + 0.35F * var13) * 2.0F * var9;
      float var10 = (0.25F * var12 + 0.35F * var13) * 2.0F * var9;
      var9 *= Math.max(var12, var13) * var17;
      int var19 = var3 >> a(18881, 2168288983485346068L) & a(29119, 7212710557863987561L);
      int var20 = var3 >> a(6391, 4947641888189161510L) & a(11718, 3551606079213770004L);
      int var21 = var3 & a(11718, 3551606079213770004L);
      var19 = iw_4.e((int)((float)var19 * var8));
      var20 = iw_4.e((int)((float)var20 * var9));
      var21 = iw_4.e((int)((float)var21 * var10));
      return var3 & a(4380, 7349978572798306763L) | var19 << a(25177, 7250189380911749770L) | var20 << a(26163, 7325551678194638567L) | var21;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0003:h\u0019^\u001fkx\u0012q\u001fI\u0001kw\u000bu\u0015_\u0018|2q>C".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 116;
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
         var10007 = 116;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 35;
               break;
            case 1:
               var50 = 43;
               break;
            case 2:
               var50 = 100;
               break;
            case 3:
               var50 = 25;
               break;
            case 4:
               var50 = 95;
               break;
            case 5:
               var50 = 25;
               break;
            default:
               var50 = 122;
         }
      } else {
         var34 = 116;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3855528974893136699L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "=¡`&´\u001c®Ð\"Èíxò6á¡h,npñÆá\u001d\u001d²\u0003Ð¼à\u009b\u0015|³\u0089Ðt\u008ar\u00ad\u0097IÒMÔÛ\u0012ð";
            int var13 = "=¡`&´\u001c®Ð\"Èíxò6á¡h,npñÆá\u001d\u001d²\u0003Ð¼à\u009b\u0015|³\u0089Ðt\u008ar\u00ad\u0097IÒMÔÛ\u0012ð".length();
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
                           c = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0016\u008b\u0080\u001b\u00835åÔ\u009bè\u0089w~²J?";
                        var13 = "\u0016\u008b\u0080\u001b\u00835åÔ\u009bè\u0089w~²J?".length();
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
         var10007 = 116;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 35;
               break;
            case 1:
               var50 = 43;
               break;
            case 2:
               var50 = 100;
               break;
            case 3:
               var50 = 25;
               break;
            case 4:
               var50 = 95;
               break;
            case 5:
               var50 = 25;
               break;
            default:
               var50 = 122;
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
                  var50 = 35;
                  break;
               case 1:
                  var50 = 43;
                  break;
               case 2:
                  var50 = 100;
                  break;
               case 3:
                  var50 = 25;
                  break;
               case 4:
                  var50 = 95;
                  break;
               case 5:
                  var50 = 25;
                  break;
               default:
                  var50 = 122;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3855528974893136699L;
               long[] var6 = new long[8];
               int var3 = 0;
               String var4 = "=¡`&´\u001c®Ð\"Èíxò6á¡h,npñÆá\u001d\u001d²\u0003Ð¼à\u009b\u0015|³\u0089Ðt\u008ar\u00ad\u0097IÒMÔÛ\u0012ð";
               int var5 = "=¡`&´\u001c®Ð\"Èíxò6á¡h,npñÆá\u001d\u001d²\u0003Ð¼à\u009b\u0015|³\u0089Ðt\u008ar\u00ad\u0097IÒMÔÛ\u0012ð".length();
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
                              c = new Integer[8];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0016\u008b\u0080\u001b\u00835åÔ\u009bè\u0089w~²J?";
                           var5 = "\u0016\u008b\u0080\u001b\u00835åÔ\u009bè\u0089w~²J?".length();
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
                  var50 = 35;
                  break;
               case 1:
                  var50 = 43;
                  break;
               case 2:
                  var50 = 100;
                  break;
               case 3:
                  var50 = 25;
                  break;
               case 4:
                  var50 = 95;
                  break;
               case 5:
                  var50 = 25;
                  break;
               default:
                  var50 = 122;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14546;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





