package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class L6 {
   public String W;
   public long N;
   public long F;
   public long U;
   public long l;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public L6(String var1) {
      long var3 = 570199553933363696L;
      Ref.s(570199553933363696L, var1, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 360836992727102105L;
      Object[] var4 = var10002;
      Ref.h(360836992727102105L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }

   public void n() {
      String var1 = W2.F();
      Object var5 = 570199553933363696L;
      Object var10001 = (String)Ref.g(570199553933363696L, var5);
      if (var1 != null) {
         if (var10001.equals("")) {
            return;
         }

         var10001 = this;
         Object var7 = 570199553933363696L;
         String var10002 = (String)Ref.g(570199553933363696L, var7);
      }

      Registry.packArgs(var10001);
      long var9 = 492930666611970668L;
      Object var12 = Ref.h2(492930666611970668L, var9);

      try {
         var12 = (String[])var12;
      } catch (InvocationTargetException var11) {
         throw new RuntimeException(var11.getTargetException());
      }

      String[] var2 = (String[])var12;
      String var3 = var2[0];
      String[] var4 = var3.split(a);
      Ref.setLong(623158770495331009L, this, Long.parseLong(var4[1]));
      Ref.setLong(573104677332889034L, this, Long.parseLong(var4[3]));
      Ref.setLong(178448268821873535L, this, Long.parseLong(var4[4]));
      Ref.setLong(175743727363369856L, 
            this,
            Long.parseLong(var4[2])
               + Long.parseLong(var4[3])
               + Long.parseLong(var4[4])
               + Long.parseLong(var4[a(10588, 8385445159910840421L)])
               + Long.parseLong(var4[5])
               + Long.parseLong(var4[a(10597, 237713707668478045L)])
               + Long.parseLong(var4[a(24315, 5678749286017462208L)])
         );
   }

   public long x() {
      return ((Long)Ref.g(178448268821873535L, this)).longValue();
   }

   public void w(long var1) {
      Ref.s(178448268821873535L, this, var1);
   }

   public long M() {
      return ((Long)Ref.g(175743727363369856L, this)).longValue();
   }

   public void U(long var1) {
      Ref.s(175743727363369856L, this, var1);
   }

   public long Q() {
      return ((Long)Ref.g(623158770495331009L, this)).longValue();
   }

   public void c(long var1) {
      Ref.s(623158770495331009L, this, var1);
   }

   public long Y() {
      return ((Long)Ref.g(573104677332889034L, this)).longValue();
   }

   public void p(long var1) {
      Ref.s(573104677332889034L, this, var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12601;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "%\u0004\u001b".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 72;
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
         var10007 = 72;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 49;
               break;
            case 1:
               var37 = 63;
               break;
            case 2:
               var37 = 120;
               break;
            case 3:
               var37 = 125;
               break;
            case 4:
               var37 = 27;
               break;
            case 5:
               var37 = 27;
               break;
            default:
               var37 = 45;
         }
      } else {
         var25 = 72;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 6218767433551814329L;
            long[] var14 = new long[3];
            int var11 = 0;
            String var12 = "þ\bµ¶¡\u009e\u0086ÚHÐ¬jÆM\u0086ãÎ#L\u009d \rqq";
            int var13 = "þ\bµ¶¡\u009e\u0086ÚHÐ¬jÆM\u0086ãÎ#L\u009d \rqq".length();
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
            c = new Integer[3];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 72;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 49;
               break;
            case 1:
               var37 = 63;
               break;
            case 2:
               var37 = 120;
               break;
            case 3:
               var37 = 125;
               break;
            case 4:
               var37 = 27;
               break;
            case 5:
               var37 = 27;
               break;
            default:
               var37 = 45;
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
                  var37 = 49;
                  break;
               case 1:
                  var37 = 63;
                  break;
               case 2:
                  var37 = 120;
                  break;
               case 3:
                  var37 = 125;
                  break;
               case 4:
                  var37 = 27;
                  break;
               case 5:
                  var37 = 27;
                  break;
               default:
                  var37 = 45;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 6218767433551814329L;
               long[] var6 = new long[3];
               int var3 = 0;
               String var4 = "þ\bµ¶¡\u009e\u0086ÚHÐ¬jÆM\u0086ãÎ#L\u009d \rqq";
               int var5 = "þ\bµ¶¡\u009e\u0086ÚHÐ¬jÆM\u0086ãÎ#L\u009d \rqq".length();
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
               c = new Integer[3];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 49;
                  break;
               case 1:
                  var37 = 63;
                  break;
               case 2:
                  var37 = 120;
                  break;
               case 3:
                  var37 = 125;
                  break;
               case 4:
                  var37 = 27;
                  break;
               case 5:
                  var37 = 27;
                  break;
               default:
                  var37 = 45;
            }
         }
      }
   }
}





