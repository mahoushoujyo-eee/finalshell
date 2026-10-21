import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class L6 {
   public String W;
   long N;
   long F;
   long U;
   long l;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public L6(String var1) {
      com.c.c(570199553933363696L).set(this, var1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(360836992727102105L);
      Object[] var10002 = var10001;
      L6 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void n() {
      String var1 = W2.F();
      String var10000 = (String)com.c.c(570199553933363696L).get(this);
      if (var1 != null) {
         if (var10000.equals("")) {
            return;
         }

         var10000 = (String)com.c.c(570199553933363696L).get(this);
      }

      Object[] var6 = com.c.a(var10000);
      Method var7 = com.c.d(492930666611970668L);
      Object[] var10 = var6;
      Object var9 = null;

      try {
         var10000 = (String[])var7.invoke(var9, var10);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      String[] var2 = var10000;
      String var3 = var2[0];
      String[] var4 = var3.split(a);
      com.c.c(623158770495331009L).setLong(this, Long.parseLong(var4[1]));
      com.c.c(573104677332889034L).setLong(this, Long.parseLong(var4[3]));
      com.c.c(178448268821873535L).setLong(this, Long.parseLong(var4[4]));
      com.c.c(175743727363369856L)
         .setLong(
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
      return com.c.c(178448268821873535L).getLong(this);
   }

   public void w(long var1) {
      com.c.c(178448268821873535L).setLong(this, var1);
   }

   public long M() {
      return com.c.c(175743727363369856L).getLong(this);
   }

   public void U(long var1) {
      com.c.c(175743727363369856L).setLong(this, var1);
   }

   public long Q() {
      return com.c.c(623158770495331009L).getLong(this);
   }

   public void c(long var1) {
      com.c.c(623158770495331009L).setLong(this, var1);
   }

   public long Y() {
      return com.c.c(573104677332889034L).getLong(this);
   }

   public void p(long var1) {
      com.c.c(573104677332889034L).setLong(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12601;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





