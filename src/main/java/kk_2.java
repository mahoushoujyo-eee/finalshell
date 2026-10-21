import java.nio.ByteBuffer;

public class Kk_2 implements Ky_2 {
   private ByteBuffer V;
   private static final long[] a;
   private static final Integer[] b;

   protected Kk_2(ByteBuffer var1) {
      this.V = var1;
   }

   public static Kk_2 S(int var0) {
      return new Kk_2(ByteBuffer.allocate(var0));
   }

   public static Kk_2 v(int var0) {
      return new Kk_2(ByteBuffer.allocateDirect(var0));
   }

   public Ky_2 M() {
      return new Kk_2(this.V.slice());
   }

   public Ky_2 o() {
      return new Kk_2(this.V.duplicate());
   }

   public Ky_2 Y() {
      return new Kk_2(this.V.asReadOnlyBuffer());
   }

   @Override
   public byte c() {
      return this.V.get();
   }

   @Override
   public Ky_2 X(byte[] var1, int var2, int var3) {
      boolean var4 = DF.M();

      while (var2 < var3) {
         var1[var2] = this.c();
         var2++;
         if (!var4) {
            break;
         }
      }

      return this;
   }

   @Override
   public Ky_2 A(byte[] var1) {
      return this.X(var1, 0, var1.length);
   }

   @Override
   public Ky_2 c(byte var1) {
      this.V.put(var1);
      return this;
   }

   @Override
   public Ky_2 A(byte[] var1, int var2, int var3) {
      boolean var4 = DF.c();

      Kk_2 var10000;
      while (true) {
         if (var2 < var3) {
            var10000 = this;
            if (var4) {
               break;
            }

            this.c(var1[var2]);
            var2++;
            if (!var4) {
               continue;
            }
         }

         var10000 = this;
         break;
      }

      return var10000;
   }

   @Override
   public Ky_2 G(byte[] var1) {
      return this.A(var1, 0, var1.length);
   }

   @Override
   public byte z(int var1) {
      return this.V.get(var1);
   }

   @Override
   public Ky_2 I(int var1, byte[] var2, int var3, int var4) {
      boolean var5 = DF.c();

      while (var3 < var4) {
         var2[var3] = this.z(var1++);
         var3++;
         if (var5) {
            break;
         }
      }

      return this;
   }

   @Override
   public Ky_2 v(int var1, byte[] var2) {
      return this.I(var1, var2, 0, var2.length);
   }

   @Override
   public Ky_2 m(int var1, byte var2) {
      this.V.put(var1, var2);
      return this;
   }

   @Override
   public Ky_2 T(int var1, byte[] var2, int var3, int var4) {
      boolean var5 = DF.c();

      Kk_2 var10000;
      while (true) {
         if (var3 < var4) {
            var10000 = this;
            if (var5) {
               break;
            }

            this.m(var1++, var2[var3]);
            var3++;
            if (!var5) {
               continue;
            }
         }

         var10000 = this;
         break;
      }

      return var10000;
   }

   @Override
   public Ky_2 z(int var1, byte[] var2) {
      return this.T(var1, var2, 0, var2.length);
   }

   public Ky_2 I() {
      this.V.compact();
      return this;
   }

   public boolean H() {
      return this.V.isDirect();
   }

   public char I$char() {
      return (char)this.c();
   }

   public Ky_2 G(char var1) {
      return this.c((byte)var1);
   }

   public char e(int var1) {
      return (char)this.z(var1);
   }

   public Ky_2 q(int var1, char var2) {
      return this.m(var1, (byte)var2);
   }

   @Override
   public fu_4 A() {
      return new fu_4(this.V);
   }

   public short l() {
      return DF.I(new byte[]{this.c(), this.c()}, Ks_2.Little);
   }

   public Ky_2 h(short var1) {
      return this.G(DF.C(var1, Ks_2.Little));
   }

   public short U(int var1) {
      return DF.I(new byte[]{this.z(var1), this.z(var1 + 1)}, Ks_2.Little);
   }

   public Ky_2 Q(int var1, short var2) {
      return this.z(var1, DF.C(var2, Ks_2.Little));
   }

   public int F() {
      return DF.a(new byte[]{this.c(), this.c(), this.c(), this.c()}, Ks_2.Little);
   }

   public Ky_2 x(int var1) {
      return this.G(DF.U(var1, Ks_2.Little));
   }

   public int O(int var1) {
      return DF.a(new byte[]{this.z(var1), this.z(var1 + 1), this.z(var1 + 2), this.z(var1 + 3)}, Ks_2.Little);
   }

   public Ky_2 z(int var1, int var2) {
      return this.z(var1, DF.U(var2, Ks_2.Little));
   }

   public long t() {
      byte[] var10000 = new byte[a(10403, 1899986921767400761L)];
      var10000[0] = this.c();
      var10000[1] = this.c();
      var10000[2] = this.c();
      var10000[3] = this.c();
      var10000[4] = this.c();
      var10000[5] = this.c();
      var10000[a(21128, 2411241309327822613L)] = this.c();
      var10000[a(18897, 988527996455654477L)] = this.c();
      return DF.J(var10000, Ks_2.Little);
   }

   public Ky_2 o(long var1) {
      return this.G(DF.h(var1, Ks_2.Little));
   }

   public long Z(int var1) {
      boolean var2 = DF.c();
      byte[] var10000 = new byte[a(32434, 8345057160215044907L)];
      var10000[0] = this.z(var1);
      var10000[1] = this.z(var1 + 1);
      var10000[2] = this.z(var1 + 2);
      var10000[3] = this.z(var1 + 3);
      var10000[4] = this.z(var1 + 4);
      var10000[5] = this.z(var1 + 5);
      var10000[a(9837, 6489608780255198197L)] = this.z(var1 + a(21128, 2411241309327822613L));
      var10000[a(28983, 7186235527141600428L)] = this.z(var1 + a(18897, 988527996455654477L));
      long var3 = DF.J(var10000, Ks_2.Little);
      if (var2) {
         com.ky_4.K(new String[4]);
      }

      return var3;
   }

   public Ky_2 n(int var1, long var2) {
      return this.z(var1, DF.h(var2, Ks_2.Little));
   }

   public boolean Y$boolean() {
      return this.V.isReadOnly();
   }

   @Override
   public void a() {
      this.V.flip();
   }

   @Override
   public int l$int() {
      return this.V.remaining();
   }

   @Override
   public boolean K() {
      boolean var1 = DF.M();
      int var10000 = this.l();
      if (var1) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   @Override
   public Kk_2 z() {
      return this;
   }

   static {
      long var0 = 7682121485210232262L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "jH\u008dr÷¨\u0086år\u0019ÇnY\u0007Þ5\u0093->\u0083<Ë\tmU\u0089g\u00adê\u008fP÷";
      int var5 = "jH\u008dr÷¨\u0086år\u0019ÇnY\u0007Þ5\u0093->\u0083<Ë\tmU\u0089g\u00adê\u008fP÷".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
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
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "TüóÈ\taªÕ;\u0090òÿ¨\u001e±\u008c";
                  var5 = "TüóÈ\taªÕ;\u0090òÿ¨\u001e±\u008c".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23961;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





