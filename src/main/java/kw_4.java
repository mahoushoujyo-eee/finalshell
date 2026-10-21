import java.util.ArrayList;
import java.util.HashSet;

public class kw_4 {
   float E;
   float o;
   int N;
   int H;
   String a;
   int s;
   String D;
   int h;
   boolean W;
   int K;
   public static int Z;
   public static int q;
   int J;
   public static int r;
   public static int e;
   int V;
   ArrayList M;
   HashSet t;
   u8_2 j;
   String d;
   long S;
   long A;
   String k;

   public kw_4() {
      com.c.c(224082240603469676L).setBoolean(this, false);
      com.c.c(550123474704380660L).setInt(this, com.c.c(267261532379755476L).getInt(null));
      com.c.c(379926072243202394L).set(this, new ArrayList());
      com.c.c(270257358373707507L).set(this, new HashSet());
   }

   public long x() {
      return com.c.c(613599058955977267L).getLong(this);
   }

   public void V(long var1) {
      com.c.c(613599058955977267L).setLong(this, var1);
   }

   public long B() {
      return com.c.c(158410232325797410L).getLong(this);
   }

   public void Y(long var1) {
      com.c.c(158410232325797410L).setLong(this, var1);
   }

   public int S() {
      return com.c.c(180955242831303627L).getInt(this);
   }

   public void D(int var1) {
      com.c.c(180955242831303627L).setInt(this, var1);
   }

   public int f() {
      return com.c.c(240365166958559399L).getInt(this);
   }

   public void m(int var1) {
      com.c.c(240365166958559399L).setInt(this, var1);
   }

   public String R() {
      return (String)com.c.c(577122288920409577L).get(this);
   }

   public void L(String var1) {
      com.c.c(577122288920409577L).set(this, var1);
   }

   public int p() {
      return com.c.c(526263379360586400L).getInt(this);
   }

   public void G(int var1) {
      com.c.c(526263379360586400L).setInt(this, var1);
   }

   public String e() {
      return (String)com.c.c(529513292151715143L).get(this);
   }

   public void R(String var1) {
      com.c.c(529513292151715143L).set(this, var1);
   }

   public int k() {
      return com.c.c(606964588944896922L).getInt(this);
   }

   public void a(int var1) {
      com.c.c(606964588944896922L).setInt(this, var1);
   }

   public boolean b() {
      return com.c.c(224082240603469676L).getBoolean(this);
   }

   public void B(boolean var1) {
      com.c.c(224082240603469676L).setBoolean(this, var1);
   }

   public int t() {
      return com.c.c(160394442375128789L).getInt(this);
   }

   public void d(int var1) {
      com.c.c(160394442375128789L).setInt(this, var1);
   }

   public ArrayList D() {
      return (ArrayList)com.c.c(379926072243202394L).get(this);
   }

   public void S(ArrayList var1) {
      com.c.c(379926072243202394L).set(this, var1);
   }

   public HashSet s() {
      return (HashSet)com.c.c(270257358373707507L).get(this);
   }

   public void K(HashSet var1) {
      com.c.c(270257358373707507L).set(this, var1);
   }

   public float E() {
      return com.c.c(230779432615128839L).getFloat(this);
   }

   public void q(float var1) {
      com.c.c(230779432615128839L).setFloat(this, var1);
   }

   public float v() {
      return com.c.c(512491415436816998L).getFloat(this);
   }

   public void l(float var1) {
      com.c.c(512491415436816998L).setFloat(this, var1);
   }

   public int X() {
      return com.c.c(389275627630597665L).getInt(this);
   }

   public void V(int var1) {
      com.c.c(389275627630597665L).setInt(this, var1);
   }

   public u8_2 u() {
      return (u8_2)com.c.c(295665827918859681L).get(this);
   }

   public void k(u8_2 var1) {
      com.c.c(295665827918859681L).set(this, var1);
   }

   public String Q() {
      return (String)com.c.c(421379994210508393L).get(this);
   }

   public void N(String var1) {
      com.c.c(421379994210508393L).set(this, var1);
   }

   public String C() {
      return (String)com.c.c(482288536613492331L).get(this);
   }

   public void S(String var1) {
      com.c.c(482288536613492331L).set(this, var1);
   }

   static {
      long var1 = 4130256098637713080L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "\u0085mÿ\bæ±\u000e³\u000eäV=æ±\u000e²";
      int var6 = "\u0085mÿ\bæ±\u000e³\u000eäV=æ±\u000e²".length();
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
                     com.c.c(267261532379755476L).setInt(null, (int)var0[2]);
                     com.c.c(619027870117197080L).setInt(null, (int)var0[3]);
                     com.c.c(126529082137801604L).setInt(null, (int)var0[1]);
                     com.c.c(384522389032676406L).setInt(null, (int)var0[0]);
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = ",Á`5æ±\u000e²k»\u0098Tæ±\u000e³";
                  var6 = ",Á`5æ±\u000e²k»\u0098Tæ±\u000e³".length();
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





