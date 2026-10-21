import java.awt.Window;

public class Jc_2 {
   aM f;
   aM o;
   Bq_2 I;
   Bq_2 F;
   Window h;
   Window s;
   boolean m;
   boolean n;
   int Y;
   static int g;
   static int S;
   static int w;
   static int p;
   static int e;

   Jc_2() {
      com.c.c(148152484588410919L).setInt(this, com.c.c(299739253213373636L).getInt(null));
   }

   public aM X() {
      return (aM)com.c.c(264585922666744083L).get(this);
   }

   public void V(aM var1) {
      com.c.c(264585922666744083L).set(this, var1);
   }

   public aM c() {
      return (aM)com.c.c(252180046907826841L).get(this);
   }

   public void Q(aM var1) {
      com.c.c(252180046907826841L).set(this, var1);
   }

   public Bq_2 I() {
      return (Bq_2)com.c.c(394102060859089866L).get(this);
   }

   public void k(Bq_2 var1) {
      com.c.c(394102060859089866L).set(this, var1);
   }

   public Bq_2 e() {
      return (Bq_2)com.c.c(161960474906314787L).get(this);
   }

   public void m(Bq_2 var1) {
      com.c.c(161960474906314787L).set(this, var1);
   }

   public boolean s() {
      return com.c.c(287677674021479590L).getBoolean(this);
   }

   public void c(boolean var1) {
      com.c.c(287677674021479590L).setBoolean(this, var1);
   }

   public boolean x() {
      return com.c.c(473767691927863239L).getBoolean(this);
   }

   public void M(boolean var1) {
      com.c.c(473767691927863239L).setBoolean(this, var1);
   }

   public Window o() {
      return (Window)com.c.c(617836175434715301L).get(this);
   }

   public void v(Window var1) {
      com.c.c(617836175434715301L).set(this, var1);
   }

   public Window k() {
      return (Window)com.c.c(244283170258878415L).get(this);
   }

   public void G(Window var1) {
      com.c.c(244283170258878415L).set(this, var1);
   }

   public int V() {
      return com.c.c(148152484588410919L).getInt(this);
   }

   public void u(int var1) {
      com.c.c(148152484588410919L).setInt(this, var1);
   }

   static {
      long var1 = 2241013989760599604L;
      long[] var0 = new long[5];
      int var4 = 0;
      String var5 = "Ë@Æ?¬\\\u0086\\\u0097¥>\u0097¬\\\u0086R\u008b9\u0099W¬\\\u0086Q";
      int var6 = "Ë@Æ?¬\\\u0086\\\u0097¥>\u0097¬\\\u0086R\u008b9\u0099W¬\\\u0086Q".length();
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
                     com.c.c(299739253213373636L).setInt(null, (int)var0[3]);
                     com.c.c(581124220784366544L).setInt(null, (int)var0[2]);
                     com.c.c(489009438537732568L).setInt(null, (int)var0[1]);
                     com.c.c(617945104086657545L).setInt(null, (int)var0[4]);
                     com.c.c(470891030811937041L).setInt(null, (int)var0[0]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "Ó\u0002«Ü¬\\\u0086Pà\"Á5¬\\\u0086S";
                  var6 = "Ó\u0002«Ü¬\\\u0086Pà\"Á5¬\\\u0086S".length();
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





