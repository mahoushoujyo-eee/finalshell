public class B0 {
   public static int t;
   public static int Z;
   public static int m;
   int B;
   org.icmp4j.j f;

   static {
      long var1 = 1211598454893282570L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "\u0098\u0094E\u000b\u001aS\u0085o\u009f(Ý\u008a\u001aS\u0085dä\t½H\u001aS\u0085n";
      int var6 = "\u0098\u0094E\u000b\u001aS\u0085o\u009f(Ý\u008a\u001aS\u0085dä\t½H\u001aS\u0085n".length();
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

      t = (int)var0[2];
      Z = (int)var0[0];
      m = (int)var0[1];
   }

   public B0(int var1) {
      this.B = var1;
   }

   public int p() {
      return this.B;
   }

   public void l(int var1) {
      this.B = var1;
   }

   public org.icmp4j.j w() {
      return this.f;
   }

   public void q(org.icmp4j.j var1) {
      this.f = var1;
   }
}





