public class YE {
   public static int e;
   public static int H;
   public static int A;
   int z;
   String n;
   int G;
   int E;
   String g;
   String u;
   int I;
   boolean J;
   private static int[] W;

   public YE() {
      com.c.c(599097404547531905L).setBoolean(this, false);
   }

   public int t() {
      return com.c.c(535903555827317970L).getInt(this);
   }

   public void Q(int var1) {
      com.c.c(535903555827317970L).setInt(this, var1);
   }

   public int O() {
      return com.c.c(229300282789615821L).getInt(this);
   }

   public void t(int var1) {
      com.c.c(229300282789615821L).setInt(this, var1);
   }

   public int r() {
      return com.c.c(530838633911506304L).getInt(this);
   }

   public void F(int var1) {
      com.c.c(530838633911506304L).setInt(this, var1);
   }

   public String b() {
      return (String)com.c.c(203328808028409851L).get(this);
   }

   public void y(String var1) {
      com.c.c(203328808028409851L).set(this, var1);
   }

   @Override
   public String toString() {
      return (String)com.c.c(203328808028409851L).get(this);
   }

   public boolean H() {
      return com.c.c(599097404547531905L).getBoolean(this);
   }

   public void d(boolean var1) {
      com.c.c(599097404547531905L).setBoolean(this, var1);
   }

   public String B() {
      return (String)com.c.c(156169966542756743L).get(this);
   }

   public void V(String var1) {
      com.c.c(156169966542756743L).set(this, var1);
   }

   public String A() {
      return (String)com.c.c(273857012092198885L).get(this);
   }

   public void T(String var1) {
      com.c.c(273857012092198885L).set(this, var1);
   }

   public int D() {
      return com.c.c(357868404620533321L).getInt(this);
   }

   public void C(int var1) {
      com.c.c(357868404620533321L).setInt(this, var1);
   }

   static {
      long var1 = 5864339385746299505L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "K½G>É½\u009a¹\nÁ©0É½\u009a\u0015]×\u0012ÊÉ½\u009b]";
      int var6 = "K½G>É½\u009a¹\nÁ©0É½\u009a\u0015]×\u0012ÊÉ½\u009b]".length();
      byte var3 = 0;
      W(null);

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

      com.c.c(297191265528158022L).setInt(null, (int)var0[2]);
      com.c.c(343042688357189616L).setInt(null, (int)var0[0]);
      com.c.c(314583299194608155L).setInt(null, (int)var0[1]);
   }

   public static void W(int[] var0) {
      W = var0;
   }

   public static int[] n() {
      return W;
   }
}





