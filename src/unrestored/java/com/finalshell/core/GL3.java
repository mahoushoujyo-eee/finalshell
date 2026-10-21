package com.finalshell.core;

public class GL3 extends HN3 {
   public int z;
   public int D;
   public int g = a(19816, 5515047572618358918L);
   public int M = 0;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public GL3() {
      this(a(25898, 4003150295359723718L));
   }

   public GL3(int var1) {
      this.P(var1);
      this.C(var1);
   }

   public void P(int var1) {
      this.z = var1;
   }

   public int C() {
      return this.z;
   }

   public void C(int var1) {
      this.D = var1;
   }

   public int J() {
      return this.D;
   }

   public void I(int var1) {
      this.g = var1;
   }

   public int c() {
      return this.g;
   }

   public void T(int var1) {
      this.M = var1;
   }

   public int B() {
      return this.M;
   }

   @Override
   public int C(int var1, int var2, int var3) {
      int var4 = Iw4.g(var3);
      float var5 = NM.k((float)this.z, (float)this.D, (float)var4);
      return var3 & a(11191, 540748518726391384L) | NM.n(var5, this.M, this.g) & a(22444, 4022216687867144769L);
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32236;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "z$2~\r\u0010g\u0006\u0004#`\u0001\u0019jF</<JD".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 51;
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
         var10007 = 51;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 26;
               break;
            case 1:
               var50 = 99;
               break;
            case 2:
               var50 = 120;
               break;
            case 3:
               var50 = 33;
               break;
            case 4:
               var50 = 87;
               break;
            case 5:
               var50 = 89;
               break;
            default:
               var50 = 49;
         }
      } else {
         var34 = 51;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3664537925561837726L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12 = "B½8ï\u000eeð'MQ¯õ¾\b½ ";
            int var13 = "B½8ï\u000eeð'MQ¯õ¾\b½ ".length();
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
                           c = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "E:\u008fLú¼§ç\u0085\u0094T:³\u008e>Æ";
                        var13 = "E:\u008fLú¼§ç\u0085\u0094T:³\u008e>Æ".length();
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
         var10007 = 51;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 26;
               break;
            case 1:
               var50 = 99;
               break;
            case 2:
               var50 = 120;
               break;
            case 3:
               var50 = 33;
               break;
            case 4:
               var50 = 87;
               break;
            case 5:
               var50 = 89;
               break;
            default:
               var50 = 49;
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
                  var50 = 26;
                  break;
               case 1:
                  var50 = 99;
                  break;
               case 2:
                  var50 = 120;
                  break;
               case 3:
                  var50 = 33;
                  break;
               case 4:
                  var50 = 87;
                  break;
               case 5:
                  var50 = 89;
                  break;
               default:
                  var50 = 49;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3664537925561837726L;
               long[] var6 = new long[4];
               int var3 = 0;
               String var4 = "B½8ï\u000eeð'MQ¯õ¾\b½ ";
               int var5 = "B½8ï\u000eeð'MQ¯õ¾\b½ ".length();
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
                              c = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "E:\u008fLú¼§ç\u0085\u0094T:³\u008e>Æ";
                           var5 = "E:\u008fLú¼§ç\u0085\u0094T:³\u008e>Æ".length();
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
                  var50 = 26;
                  break;
               case 1:
                  var50 = 99;
                  break;
               case 2:
                  var50 = 120;
                  break;
               case 3:
                  var50 = 33;
                  break;
               case 4:
                  var50 = 87;
                  break;
               case 5:
                  var50 = 89;
                  break;
               default:
                  var50 = 49;
            }
         }
      }
   }
}





