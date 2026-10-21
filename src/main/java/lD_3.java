public class lD_3 extends ln_4 {
   public static int v;
   public static int i;
   public static int X;
   int t;
   String E;
   int B;
   String z;
   String K;
   boolean F;
   private static int n;

   public lD_3() {
      com.c.c(350806123988960857L).set(this, "");
   }

   @Override
   public void p(String var1) {
      super.p(var1);
   }

   public int H() {
      return com.c.c(246233731721734998L).getInt(this);
   }

   public void u(int var1) {
      com.c.c(246233731721734998L).setInt(this, var1);
   }

   public String B() {
      return (String)com.c.c(131343769847123808L).get(this);
   }

   public void w(String var1) {
      com.c.c(131343769847123808L).set(this, var1);
   }

   public int p() {
      return com.c.c(631564034273974753L).getInt(this);
   }

   public void d(int var1) {
      com.c.c(631564034273974753L).setInt(this, var1);
   }

   public String f() {
      return (String)com.c.c(271928114840425242L).get(this);
   }

   public void S(String var1) {
      com.c.c(271928114840425242L).set(this, var1);
   }

   public String c() {
      return (String)com.c.c(537038495471492692L).get(this);
   }

   public void c(String var1) {
      com.c.c(537038495471492692L).set(this, var1);
   }

   public boolean o() {
      return com.c.c(305722795594497236L).getBoolean(this);
   }

   public void s(boolean var1) {
      com.c.c(305722795594497236L).setBoolean(this, var1);
   }

   @Override
   public ln_4 B$ln_4() {
      return new lD_3();
   }

   static {
      long var1 = 4098829763164179555L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "L(§'ü3\f\u0007\u0007\u009b\u008b\u0095ü3\f«";
      int var6 = "L(§'ü3\f\u0007\u0007\u009b\u008b\u0095ü3\f«".length();
      byte var3 = 0;
      b(0);

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

      com.c.c(392143205024518869L).setInt(null, (int)var0[0]);
      com.c.c(319971801115033366L).setInt(null, (int)var0[1]);
      com.c.c(339184634502945253L).setInt(null, 0);
   }

   public static void b(int var0) {
      n = var0;
   }

   public static int e() {
      return n;
   }

   public static int v() {
      int var0 = e();
      return var0 == 0 ? 107 : 0;
   }
}





