public class gH {
   boolean V;
   boolean B;
   int U;
   Runnable N;
   public static int m;
   public static int E;
   public static int y;
   Thread K;
   long Q;
   int w;
   boolean k;
   boolean a;
   String C;

   static {
      long var1 = 1430174936627474900L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "Âl\u0099&\bXñ±äÿÉk\bXñ°\u009bK¼ï\bXñ\u008e";
      int var6 = "Âl\u0099&\bXñ±äÿÉk\bXñ°\u009bK¼ï\bXñ\u008e".length();
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

      com.c.c(523223126306371045L).setInt(null, (int)var0[2]);
      com.c.c(171346713126145274L).setInt(null, (int)var0[1]);
      com.c.c(439517225992595079L).setInt(null, (int)var0[0]);
   }

   gH(Runnable var1, int var2) {
      com.c.c(564555266966771525L).setBoolean(this, false);
      com.c.c(257596131995932042L).set(this, var1);
      com.c.c(153556024938273560L).setInt(this, var2);
   }

   public void Z() {
      String var1 = d8_2.Q();
      gH var10000 = this;
      if (var1 == null) {
         if (com.c.c(560010910551261201L).getBoolean(this)) {
            return;
         }

         com.c.c(560010910551261201L).setBoolean(this, true);
         var10000 = this;
      }

      if (var1 == null) {
         if ((Thread)com.c.c(129202526525324511L).get(var10000) != null) {
            ((Thread)com.c.c(129202526525324511L).get(this)).interrupt();
         }

         var10000 = this;
      }

      com.c.c(505602397498011009L).setBoolean(var10000, true);
   }

   public boolean F() {
      return com.c.c(505602397498011009L).getBoolean(this);
   }

   public boolean v() {
      return com.c.c(265865036711565556L).getBoolean(this);
   }

   public long X() {
      return com.c.c(323336845158005131L).getLong(this);
   }

   public void I(long var1) {
      com.c.c(323336845158005131L).setLong(this, var1);
   }

   public int e() {
      return com.c.c(459368670286305418L).getInt(this);
   }

   public void k(int var1) {
      com.c.c(459368670286305418L).setInt(this, var1);
   }

   public Runnable c() {
      return (Runnable)com.c.c(257596131995932042L).get(this);
   }

   public void l(Runnable var1) {
      com.c.c(257596131995932042L).set(this, var1);
   }

   public int X$int() {
      return com.c.c(153556024938273560L).getInt(this);
   }

   public void R(int var1) {
      com.c.c(153556024938273560L).setInt(this, var1);
   }

   public boolean r() {
      return com.c.c(564555266966771525L).getBoolean(this);
   }

   public void j(boolean var1) {
      com.c.c(564555266966771525L).setBoolean(this, var1);
   }

   public boolean R() {
      return com.c.c(560010910551261201L).getBoolean(this);
   }

   public Thread q() {
      return (Thread)com.c.c(129202526525324511L).get(this);
   }

   public void K(Thread var1) {
      com.c.c(129202526525324511L).set(this, var1);
   }

   public String R$String() {
      return (String)com.c.c(405895317232152174L).get(this);
   }

   public void M(String var1) {
      com.c.c(405895317232152174L).set(this, var1);
   }
}





