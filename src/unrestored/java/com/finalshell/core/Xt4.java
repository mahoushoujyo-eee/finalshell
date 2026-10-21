package com.finalshell.core;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

@Deprecated
public class Xt4 implements Z5 {
   public static String a;
   public static long[] b;
   public static Integer[] c;

   @Override
   public byte[] T(byte[] var1, byte[] var2, int var3, int var4) {
      char[] var6 = new char[var1.length];
      boolean var10000 = Y12.Q();
      int var7 = 0;
      boolean var5 = var10000;

      while (var7 < var1.length) {
         var6[var7] = (char)(var1[var7] & a(615, 8060785003590770234L));
         var7++;
         if (!var5) {
            break;
         }
      }

      try {
         PBEKeySpec var12 = new PBEKeySpec(var6, var2, var3, var4 * a(25371, 6000346522534625095L));
         SecretKeyFactory var8 = SecretKeyFactory.getInstance(a);
         return var8.generateSecret(var12).getEncoded();
      } catch (InvalidKeySpecException var10) {
      } catch (NoSuchAlgorithmException var11) {
      }

      return null;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23644;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\f\\z\"W=95jY.|n\r\u000fVpW".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 10;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 10;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 86;
               break;
            case 1:
               var37 = 20;
               break;
            case 2:
               var37 = 59;
               break;
            case 3:
               var37 = 108;
               break;
            case 4:
               var37 = 27;
               break;
            case 5:
               var37 = 5;
               break;
            default:
               var37 = 100;
         }
      } else {
         var25 = 10;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 529648966096395486L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "\u0088^´WS9#\u0091ïi3O\u0012\u0006Â\u001b";
            int var13 = "\u0088^´WS9#\u0091ïi3O\u0012\u0006Â\u001b".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 10;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 86;
               break;
            case 1:
               var37 = 20;
               break;
            case 2:
               var37 = 59;
               break;
            case 3:
               var37 = 108;
               break;
            case 4:
               var37 = 27;
               break;
            case 5:
               var37 = 5;
               break;
            default:
               var37 = 100;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 86;
                  break;
               case 1:
                  var37 = 20;
                  break;
               case 2:
                  var37 = 59;
                  break;
               case 3:
                  var37 = 108;
                  break;
               case 4:
                  var37 = 27;
                  break;
               case 5:
                  var37 = 5;
                  break;
               default:
                  var37 = 100;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 529648966096395486L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "\u0088^´WS9#\u0091ïi3O\u0012\u0006Â\u001b";
               int var5 = "\u0088^´WS9#\u0091ïi3O\u0012\u0006Â\u001b".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 86;
                  break;
               case 1:
                  var37 = 20;
                  break;
               case 2:
                  var37 = 59;
                  break;
               case 3:
                  var37 = 108;
                  break;
               case 4:
                  var37 = 27;
                  break;
               case 5:
                  var37 = 5;
                  break;
               default:
                  var37 = 100;
            }
         }
      }
   }
}





