public class VO {
   public static int p;
   public static int W;
   public static int M;
   public static int w;
   public static int Y;
   public static int T;
   public static int h;
   int u;
   YI o;
   boolean a;

   public VO(YI var1, int var2) {
      com.c.c(617652087972751592L).set(this, var1);
      com.c.c(261995540413557922L).setInt(this, var2);
   }

   public YI d() {
      return (YI)com.c.c(617652087972751592L).get(this);
   }

   public void Q(YI var1) {
      com.c.c(617652087972751592L).set(this, var1);
   }

   public int k() {
      return com.c.c(261995540413557922L).getInt(this);
   }

   public void H(int var1) {
      com.c.c(261995540413557922L).setInt(this, var1);
   }

   public boolean Z() {
      return com.c.c(209262969121480945L).getBoolean(this);
   }

   public void Y(boolean var1) {
      com.c.c(209262969121480945L).setBoolean(this, var1);
   }

   static {
      long var1 = 5563211259712631272L;
      long[] var0 = new long[7];
      int var4 = 0;
      String var5 = "é[\u001aza\u009fñ\u008dF\u00015\u009da\u009fñ!\u0003Ý#va\u009fñ\u008fM\u009býßa\u009fñj:4¼Äa\u009fñ\u0092";
      int var6 = "é[\u001aza\u009fñ\u008dF\u00015\u009da\u009fñ!\u0003Ý#va\u009fñ\u008fM\u009býßa\u009fñj:4¼Äa\u009fñ\u0092".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var10000 = var0;
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
            long var13 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var3 >= var6) {
                     com.c.c(355995585155017665L).setInt(null, (int)var0[5]);
                     com.c.c(372857647671097670L).setInt(null, (int)var0[0]);
                     com.c.c(396404222353826257L).setInt(null, (int)var0[6]);
                     com.c.c(503069149042327914L).setInt(null, (int)var0[2]);
                     com.c.c(242649790291880610L).setInt(null, (int)var0[4]);
                     com.c.c(352927757876034743L).setInt(null, (int)var0[3]);
                     com.c.c(129638889012486075L).setInt(null, (int)var0[1]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "ì\u0080<³a\u009fñ\u008cå\u0019ÜGa\u009fñ\u008e";
                  var6 = "ì\u0080<³a\u009fñ\u008cå\u0019ÜGa\u009fñ\u008e".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes("ISO-8859-1");
            var10000 = var0;
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
}





