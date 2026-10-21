package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

class B implements org.H.y_2 {
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   @Override
   public int u() {
      return 1;
   }

   @Override
   public void H(DataOutputStream var1) throws IOException {
      var1.writeByte(a(26840, 8422470570156507264L));
   }

   @Override
   public String toString() {
      return a;
   }

   @Override
   public int hashCode() {
      return a(29208, 2851213699623606849L);
   }

   @Override
   public boolean equals(@org.F.c Object var1) {
      return var1 == this;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\"Qv\u000b=2?6Sv\u001f1\"\u0002?Vl".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 89;
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
         var10007 = 89;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 14;
               break;
            case 1:
               var37 = 102;
               break;
            case 2:
               var37 = 70;
               break;
            case 3:
               var37 = 60;
               break;
            case 4:
               var37 = 13;
               break;
            case 5:
               var37 = 31;
               break;
            default:
               var37 = 15;
         }
      } else {
         var25 = 89;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 2179042298542423084L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "\u0007Ußâêw¼ª\"8ä\u0098\u000bá&k";
            int var13 = "\u0007Ußâêw¼ª\"8ä\u0098\u000bá&k".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
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
         var10007 = 89;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 14;
               break;
            case 1:
               var37 = 102;
               break;
            case 2:
               var37 = 70;
               break;
            case 3:
               var37 = 60;
               break;
            case 4:
               var37 = 13;
               break;
            case 5:
               var37 = 31;
               break;
            default:
               var37 = 15;
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
                  var37 = 14;
                  break;
               case 1:
                  var37 = 102;
                  break;
               case 2:
                  var37 = 70;
                  break;
               case 3:
                  var37 = 60;
                  break;
               case 4:
                  var37 = 13;
                  break;
               case 5:
                  var37 = 31;
                  break;
               default:
                  var37 = 15;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 2179042298542423084L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "\u0007Ußâêw¼ª\"8ä\u0098\u000bá&k";
               int var5 = "\u0007Ußâêw¼ª\"8ä\u0098\u000bá&k".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
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
                  var37 = 14;
                  break;
               case 1:
                  var37 = 102;
                  break;
               case 2:
                  var37 = 70;
                  break;
               case 3:
                  var37 = 60;
                  break;
               case 4:
                  var37 = 13;
                  break;
               case 5:
                  var37 = 31;
                  break;
               default:
                  var37 = 15;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10328;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





