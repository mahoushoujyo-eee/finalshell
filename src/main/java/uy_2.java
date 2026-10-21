public class Uy_2 {
   long o;
   int x;
   public static int f;
   public static int T;
   int G;
   String l;

   static {
      long var1 = 1724950434230890127L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "\n\u0019ã{ß|î\u0084îÜ\u008eÜß|î\u0085";
      int var6 = "\n\u0019ã{ß|î\u0084îÜ\u008eÜß|î\u0085".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      f = (int)var0[1];
      T = (int)var0[0];
   }

   Uy_2(long var1, int var3, int var4) {
      this(null, var1, var3, var4);
   }

   public Uy_2(String var1, long var2, int var4, int var5) {
      this.G = f;
      this.l = var1;
      this.o = var2;
      this.x = var4;
      this.G = var5;
   }

   public String K() {
      return this.l;
   }

   public void g(String var1) {
      this.l = var1;
   }

   public int v() {
      return this.G;
   }

   public long o() {
      return this.o;
   }

   public void o(long var1) {
      this.o = var1;
   }

   public int t() {
      return this.x;
   }

   public void t(int var1) {
      this.x = var1;
   }
}





