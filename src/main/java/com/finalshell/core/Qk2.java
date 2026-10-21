package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;

public class Qk2 extends Qi2 {
   public int M = a(13042, 2469231811144375953L);
   public int o = a(26646, 2466085370004767856L);
   public int C = a(32220, 976909586951770557L);
   public int L = a(8224, 4816381615494908992L);
   public static String a;
   public static long[] d;
   public static Integer[] e;

   public void u(int var1, int var2, int var3, int var4) {
      this.M = var1;
      this.o = var2;
      this.C = var3;
      this.L = var4;
   }

   @Override
   public void Q(ConnectHost var1, Dm4 var2) throws Exception {
      UJ var7;
      boolean var10000 = Dm4.F$boolean();
      super.Q(var1, var2);
      UJ var4 = new UJ();
      YU var5 = new YU(var4);
      var5.M();
      boolean var3 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               var4.V((byte)a(25067, 2589648042755886473L));
               var4.u(var2.J$int());
               var4.q(E8.J(a));
               var7 = (var4) ? 1 : 0;
               var10001 = (this.K()) ? 1 : 0;
               if (!var3) {
                  break label22;
               }

               if (var10001 != 0) {
                  break label21;
               }
            } catch (Exception var6) {
               throw b(var6);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var7.V((byte)var10001);
      var4.u(this.M);
      var4.u(this.o);
      var4.u(this.C);
      var4.u(this.L);
      this.C(var5);
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27746;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "MN J\u001a]}YO/@\u0012O".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 91;
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
         var10007 = 91;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 97;
               break;
            case 1:
               var50 = 124;
               break;
            case 2:
               var50 = 21;
               break;
            case 3:
               var50 = 117;
               break;
            case 4:
               var50 = 46;
               break;
            case 5:
               var50 = 113;
               break;
            default:
               var50 = 11;
         }
      } else {
         var34 = 91;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 2466395029500059177L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "\"OÂ\u0099\u0098ãÓÂNÈ\u00adæÒy\u0000èá\u000fÃ\u0086§h\u0013\u0089";
            int var13 = "\"OÂ\u0099\u0098ãÓÂNÈ\u00adæÒy\u0000èá\u000fÃ\u0086§h\u0013\u0089".length();
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
                           d = var14;
                           e = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0098¬\"\u009dÒÌÍ\u0014-\bFü9ÏÚA";
                        var13 = "\u0098¬\"\u009dÒÌÍ\u0014-\bFü9ÏÚA".length();
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
         var10007 = 91;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 97;
               break;
            case 1:
               var50 = 124;
               break;
            case 2:
               var50 = 21;
               break;
            case 3:
               var50 = 117;
               break;
            case 4:
               var50 = 46;
               break;
            case 5:
               var50 = 113;
               break;
            default:
               var50 = 11;
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
                  var50 = 97;
                  break;
               case 1:
                  var50 = 124;
                  break;
               case 2:
                  var50 = 21;
                  break;
               case 3:
                  var50 = 117;
                  break;
               case 4:
                  var50 = 46;
                  break;
               case 5:
                  var50 = 113;
                  break;
               default:
                  var50 = 11;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 2466395029500059177L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "\"OÂ\u0099\u0098ãÓÂNÈ\u00adæÒy\u0000èá\u000fÃ\u0086§h\u0013\u0089";
               int var5 = "\"OÂ\u0099\u0098ãÓÂNÈ\u00adæÒy\u0000èá\u000fÃ\u0086§h\u0013\u0089".length();
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
                              d = var6;
                              e = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0098¬\"\u009dÒÌÍ\u0014-\bFü9ÏÚA";
                           var5 = "\u0098¬\"\u009dÒÌÍ\u0014-\bFü9ÏÚA".length();
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
                  var50 = 97;
                  break;
               case 1:
                  var50 = 124;
                  break;
               case 2:
                  var50 = 21;
                  break;
               case 3:
                  var50 = 117;
                  break;
               case 4:
                  var50 = 46;
                  break;
               case 5:
                  var50 = 113;
                  break;
               default:
                  var50 = 11;
            }
         }
      }
   }
}





