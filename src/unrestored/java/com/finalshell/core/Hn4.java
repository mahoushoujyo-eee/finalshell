package com.finalshell.core;

import java.awt.image.BufferedImage;

public class Hn4 extends HN3 {
   public float o;
   public float m = 0.0F;
   public float H = 5.0F;
   public float P;
   public float Y;
   public int R = -1;
   public int v = a(22236, 1907896469272345454L);
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Hn4() {
      this(0.5F);
   }

   public Hn4(float var1) {
      this.b(var1);
   }

   public void j(float var1) {
      this.H = var1;
   }

   public float K() {
      return this.H;
   }

   public void b(float var1) {
      this.o = var1;
   }

   public float r() {
      return this.o;
   }

   public void J(float var1) {
      this.m = var1;
   }

   public float o() {
      return this.m;
   }

   public void x(int var1) {
      this.R = var1;
   }

   public int h() {
      return this.R;
   }

   public void Z(int var1) {
      this.v = var1;
   }

   public int s() {
      return this.v;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      var2 = new HX3((float)((int)this.H)).filter(var1, null);
      this.P = 765.0F * (this.o - this.m * 0.5F);
      this.Y = 765.0F * (this.o + this.m * 0.5F);
      return super.filter(var2, var2);
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var4 = var3 & a(16580, 3506859011826462066L);
      int var5 = var3 >> a(24071, 3323699808061928372L) & a(9905, 7308389125468605185L);
      int var6 = var3 >> a(24757, 3374347854465993988L) & a(5952, 149717198413167351L);
      int var7 = var3 & a(5952, 149717198413167351L);
      int var8 = var5 + var6 + var7;
      float var9 = NM.k(this.P, this.Y, (float)var8);
      return NM.n(var9, this.v, this.R);
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28082;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "G\u0006\u000b\r3kx;!\u0006\u00007a3:\\".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 34;
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
         var10007 = 34;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 54;
               break;
            case 1:
               var50 = 80;
               break;
            case 2:
               var50 = 80;
               break;
            case 3:
               var50 = 67;
               break;
            case 4:
               var50 = 120;
               break;
            case 5:
               var50 = 51;
               break;
            default:
               var50 = 63;
         }
      } else {
         var34 = 34;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 484179743335391059L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "\u0095s{k@Á$=N\b\"°×b¬÷ÁÕçio\u0010T\u00adöKö\u0003\u0096þ\u0012_";
            int var13 = "\u0095s{k@Á$=N\b\"°×b¬÷ÁÕçio\u0010T\u00adöKö\u0003\u0096þ\u0012_".length();
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
                           c = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "Àl.íZ¹2!Øª>\näÜå[";
                        var13 = "Àl.íZ¹2!Øª>\näÜå[".length();
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
         var10007 = 34;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 54;
               break;
            case 1:
               var50 = 80;
               break;
            case 2:
               var50 = 80;
               break;
            case 3:
               var50 = 67;
               break;
            case 4:
               var50 = 120;
               break;
            case 5:
               var50 = 51;
               break;
            default:
               var50 = 63;
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
                  var50 = 54;
                  break;
               case 1:
                  var50 = 80;
                  break;
               case 2:
                  var50 = 80;
                  break;
               case 3:
                  var50 = 67;
                  break;
               case 4:
                  var50 = 120;
                  break;
               case 5:
                  var50 = 51;
                  break;
               default:
                  var50 = 63;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 484179743335391059L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "\u0095s{k@Á$=N\b\"°×b¬÷ÁÕçio\u0010T\u00adöKö\u0003\u0096þ\u0012_";
               int var5 = "\u0095s{k@Á$=N\b\"°×b¬÷ÁÕçio\u0010T\u00adöKö\u0003\u0096þ\u0012_".length();
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
                              c = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "Àl.íZ¹2!Øª>\näÜå[";
                           var5 = "Àl.íZ¹2!Øª>\näÜå[".length();
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
                  var50 = 54;
                  break;
               case 1:
                  var50 = 80;
                  break;
               case 2:
                  var50 = 80;
                  break;
               case 3:
                  var50 = 67;
                  break;
               case 4:
                  var50 = 120;
                  break;
               case 5:
                  var50 = 51;
                  break;
               default:
                  var50 = 63;
            }
         }
      }
   }
}





