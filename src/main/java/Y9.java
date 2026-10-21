import java.awt.event.MouseEvent;

public class Y9 {
   t3_2 K;
   public static int D;
   public static int u;
   public static int C;
   public static int f;
   public static int n;
   boolean i;
   MouseEvent e;
   int V;
   int v;
   int I;
   int Y;
   boolean S;
   boolean L;

   Y9(t3_2 var1, int var2) {
      com.c.c(503850750474376128L).set(this, var1);
      com.c.c(128694443696326857L).setInt(this, var2);
   }

   public t3_2 l() {
      return (t3_2)com.c.c(503850750474376128L).get(this);
   }

   public void r(t3_2 var1) {
      com.c.c(503850750474376128L).set(this, var1);
   }

   public int Z() {
      return com.c.c(128694443696326857L).getInt(this);
   }

   public void L(int var1) {
      com.c.c(128694443696326857L).setInt(this, var1);
   }

   public MouseEvent K() {
      return (MouseEvent)com.c.c(235836144414111419L).get(this);
   }

   public void I(MouseEvent var1) {
      com.c.c(235836144414111419L).set(this, var1);
   }

   public boolean R() {
      return com.c.c(324549244723961442L).getBoolean(this);
   }

   public void a(boolean var1) {
      com.c.c(324549244723961442L).setBoolean(this, var1);
   }

   public boolean g() {
      return com.c.c(524433428041456995L).getBoolean(this);
   }

   public void I(boolean var1) {
      com.c.c(524433428041456995L).setBoolean(this, var1);
   }

   public int L() {
      return com.c.c(566514661120379665L).getInt(this);
   }

   public void j(int var1) {
      com.c.c(566514661120379665L).setInt(this, var1);
   }

   public int b() {
      return com.c.c(442691960412597171L).getInt(this);
   }

   public void m(int var1) {
      com.c.c(442691960412597171L).setInt(this, var1);
   }

   public int d() {
      return com.c.c(301346640398574700L).getInt(this);
   }

   public void P(int var1) {
      com.c.c(301346640398574700L).setInt(this, var1);
   }

   public boolean r() {
      return com.c.c(621682701384588437L).getBoolean(this);
   }

   public void Y(boolean var1) {
      com.c.c(621682701384588437L).setBoolean(this, var1);
   }

   static {
      long var1 = 4881907864969284400L;
      long[] var0 = new long[5];
      int var4 = 0;
      String var5 = "\u008b\u0012g\u008fu®\u000bW6ÜÕ\nu®\u000bTá\u0082>ëu®\u000bV";
      int var6 = "\u008b\u0012g\u008fu®\u000bW6ÜÕ\nu®\u000bTá\u0082>ëu®\u000bV".length();
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
                     com.c.c(307190072297206240L).setInt(null, (int)var0[1]);
                     com.c.c(141500763651848578L).setInt(null, (int)var0[3]);
                     com.c.c(534616084670407665L).setInt(null, (int)var0[2]);
                     com.c.c(454291477903395804L).setInt(null, (int)var0[0]);
                     com.c.c(527075857672909373L).setInt(null, (int)var0[4]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "u$±\u0092u®\u000bU îu\nu®\u000bX";
                  var6 = "u$±\u0092u®\u000bU îu\nu®\u000bX".length();
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





