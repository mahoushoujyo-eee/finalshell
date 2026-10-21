public class ty_4 {
   public static int Y;
   public static int j;
   public static int r;
   public static int N;
   public static int i;
   public static int H;
   public static int K;
   public static int M;
   public static int l;
   public static int X;
   public static int W;
   public static int E;
   public static int s;
   String o;
   int n;
   private static com.ky_4[] k;

   public ty_4() {
   }

   public ty_4(int var1) {
      com.c.c(544141557117350585L).setInt(this, var1);
   }

   public int D() {
      return com.c.c(544141557117350585L).getInt(this);
   }

   public void L(int var1) {
      com.c.c(544141557117350585L).setInt(this, var1);
   }

   public String G() {
      return (String)com.c.c(321274979819017760L).get(this);
   }

   public void o(String var1) {
      com.c.c(321274979819017760L).set(this, var1);
   }

   static {
      long var1 = 4651084756425483495L;
      long[] var0 = new long[13];
      com.ky_4[] var10000 = new com.ky_4[5];
      int var4 = 0;
      String var5 = "]4¤²\u0086ù¤Bý\u00adl\u0083\u0086ù¤\u0081\u0093¡?\u0091\u0086ù¤\u008eý¦\u0084y\u0086ù¤\u0080TùX\u0081\u0086ù¤G°\u0089| \u0086ù¤\u008bnô¿\u0017\u0086ù¤\u0082\u0016Rl6\u0086ù¤|\u0098EB^\u0086ù¤\u0083\u009cÛ4ø\u0086ù¤\u008fp¬\u0098`\u0086ù¤M";
      int var6 = "]4¤²\u0086ù¤Bý\u00adl\u0083\u0086ù¤\u0081\u0093¡?\u0091\u0086ù¤\u008eý¦\u0084y\u0086ù¤\u0080TùX\u0081\u0086ù¤G°\u0089| \u0086ù¤\u008bnô¿\u0017\u0086ù¤\u0082\u0016Rl6\u0086ù¤|\u0098EB^\u0086ù¤\u0083\u009cÛ4ø\u0086ù¤\u008fp¬\u0098`\u0086ù¤M"
         .length();
      c(var10000);
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var9 = var0;
         var10001 = var4++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var14 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var9[var10001] = var14;
                  if (var3 >= var6) {
                     com.c.c(146259046198212012L).setInt(null, (int)var0[8]);
                     com.c.c(412252850898252674L).setInt(null, (int)var0[6]);
                     com.c.c(494664326722011331L).setInt(null, (int)var0[1]);
                     com.c.c(372606448848052772L).setInt(null, (int)var0[3]);
                     com.c.c(213416441008748074L).setInt(null, (int)var0[9]);
                     com.c.c(614101277846852824L).setInt(null, (int)var0[2]);
                     com.c.c(164254360187462884L).setInt(null, (int)var0[11]);
                     com.c.c(456349507517882113L).setInt(null, (int)var0[5]);
                     com.c.c(471348612392797969L).setInt(null, (int)var0[12]);
                     com.c.c(415562533271057788L).setInt(null, (int)var0[7]);
                     com.c.c(462380862468346033L).setInt(null, (int)var0[4]);
                     com.c.c(371285800720733657L).setInt(null, (int)var0[0]);
                     com.c.c(437137128236906821L).setInt(null, (int)var0[10]);
                     return;
                  }
                  break;
               default:
                  var9[var10001] = var14;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "v@«ª\u0086ù¤\u008c\bÊ¼¡\u0086ù¤q";
                  var6 = "v@«ª\u0086ù¤\u008c\bÊ¼¡\u0086ù¤q".length();
                  var3 = 0;
            }

            byte var11 = var3;
            var3 += 8;
            var7 = var5.substring(var11, var3).getBytes("ISO-8859-1");
            var9 = var0;
            var10001 = var4++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }

   public static void c(com.ky_4[] var0) {
      k = var0;
   }

   public static com.ky_4[] Y() {
      return k;
   }
}





