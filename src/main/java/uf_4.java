public class uf_4 {
   public static int e;
   public static int P;
   int J;
   tf_4 t;
   ck_4 u;

   public uf_4(int var1) {
      com.c.c(159784702252834868L).setInt(this, 0);
      com.c.c(159784702252834868L).setInt(this, var1);
   }

   public int Q() {
      return com.c.c(159784702252834868L).getInt(this);
   }

   public void D(int var1) {
      com.c.c(159784702252834868L).setInt(this, var1);
   }

   public tf_4 n() {
      return (tf_4)com.c.c(611048862107038066L).get(this);
   }

   public void w(tf_4 var1) {
      com.c.c(611048862107038066L).set(this, var1);
   }

   public ck_4 v() {
      return (ck_4)com.c.c(287959232878030326L).get(this);
   }

   public void b(ck_4 var1) {
      com.c.c(287959232878030326L).set(this, var1);
   }

   static {
      long var1 = 5378886281743865981L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "UZÊ\u0089\u001e\u0090\u0098\u0018N\u007fz´\u001e\u0090\u0098\u0019";
      int var6 = "UZÊ\u0089\u001e\u0090\u0098\u0018N\u007fz´\u001e\u0090\u0098\u0019".length();
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

      com.c.c(451440066276164151L).setInt(null, (int)var0[1]);
      com.c.c(532763949550214061L).setInt(null, (int)var0[0]);
   }
}





