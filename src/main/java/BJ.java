public class BJ {
   String M;
   public static int f;
   public static int w;
   int W;

   public String B() {
      return (String)com.c.c(244924605468350985L).get(this);
   }

   public void o(String var1) {
      com.c.c(244924605468350985L).set(this, var1);
   }

   public int P() {
      return com.c.c(477447395719945513L).getInt(this);
   }

   public void V(int var1) {
      com.c.c(477447395719945513L).setInt(this, var1);
   }

   static {
      long var1 = 8290374672878413104L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "\u0098Ü\u007fd7Ð&ÙÊ~\u0017\u00077Ð&Ø";
      int var6 = "\u0098Ü\u007fd7Ð&ÙÊ~\u0017\u00077Ð&Ø".length();
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

      com.c.c(153892563842185940L).setInt(null, (int)var0[1]);
      com.c.c(282832775171570604L).setInt(null, (int)var0[0]);
   }
}





