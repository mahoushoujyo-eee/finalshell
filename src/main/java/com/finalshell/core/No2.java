package com.finalshell.core;

public final class No2 extends N5_2 {
   @C_9
   public final N_ l;
   @C_9
   public HP_2 L;
   public static String a;
   public static long[] d;
   public static Integer[] f;

   public No2(com.finalshell.ui.model.I var1, @C_9 N_ var2, String var3, NV_2[] var4) {
      super(var1, var3, var4);
      this.l = var2;
   }

   @Override
   public String toString() {
      String[] var10000 = RG_2.C();
      StringBuilder var2 = new StringBuilder();
      String[] var1 = var10000;
      if (var1 != null) {
         if (this.l != null) {
            var2.append(this.l.toString()).append((char)a(1607, 9112999455519398289L));
         }

         var2.append(this.i).append((char)a(18117, 3392281145300523281L));
      }

      int var3 = 0;

      while (true) {
         if (var3 < this.w.length) {
            if (var1 == null) {
               break;
            }

            if (var3 > 0) {
               var2.append(a);
            }

            var2.append(this.w[var3].toString());
            var3++;
            if (var1 != null) {
               continue;
            }
         }

         var2.append((char)a(1426, 8093902826367113799L));
         break;
      }

      return var2.toString();
   }

   @C_9
   @Override
   public Object i(C_w_2 var1) throws Throwable {
      return var1.W(this);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24532;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Qv".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 114;
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
         var10007 = 114;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 15;
               break;
            case 1:
               var37 = 36;
               break;
            case 2:
               var37 = 105;
               break;
            case 3:
               var37 = 96;
               break;
            case 4:
               var37 = 94;
               break;
            case 5:
               var37 = 69;
               break;
            default:
               var37 = 81;
         }
      } else {
         var25 = 114;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 6411260078894738663L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "*?|òNÍuÞ+\r\u0084\u009aq\r¶\u0089µÈþ®\u0015¦5X";
            int var13 = "*?|òNÍuÞ+\r\u0084\u009aq\r¶\u0089µÈþ®\u0015¦5X".length();
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

            d = var14;
            f = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 114;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 15;
               break;
            case 1:
               var37 = 36;
               break;
            case 2:
               var37 = 105;
               break;
            case 3:
               var37 = 96;
               break;
            case 4:
               var37 = 94;
               break;
            case 5:
               var37 = 69;
               break;
            default:
               var37 = 81;
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
                  var37 = 15;
                  break;
               case 1:
                  var37 = 36;
                  break;
               case 2:
                  var37 = 105;
                  break;
               case 3:
                  var37 = 96;
                  break;
               case 4:
                  var37 = 94;
                  break;
               case 5:
                  var37 = 69;
                  break;
               default:
                  var37 = 81;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 6411260078894738663L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "*?|òNÍuÞ+\r\u0084\u009aq\r¶\u0089µÈþ®\u0015¦5X";
               int var5 = "*?|òNÍuÞ+\r\u0084\u009aq\r¶\u0089µÈþ®\u0015¦5X".length();
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

               d = var6;
               f = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 15;
                  break;
               case 1:
                  var37 = 36;
                  break;
               case 2:
                  var37 = 105;
                  break;
               case 3:
                  var37 = 96;
                  break;
               case 4:
                  var37 = 94;
                  break;
               case 5:
                  var37 = 69;
                  break;
               default:
                  var37 = 81;
            }
         }
      }
   }
}





