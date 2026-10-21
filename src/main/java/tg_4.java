import java.util.BitSet;

public class tg_4 {
   BitSet z;
   byte[] L;
   final byte[] q;
   private static final long[] a;
   private static final Integer[] b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public tg_4() {
      String var10000 = D6.k();
      this.z = new BitSet();
      this.q = new byte[a(3802, 6281936704835585668L)];
      int var2 = 0;
      String var1 = var10000;
      if (var1 != null) {
         this.q[var2] = (byte)var2;
         var2++;
      }

      while (true) {
         while (var2 < a(3802, 6281936704835585668L)) {
            this.q[var2] = (byte)var2;
            var2++;
         }

         if (var1 == null) {
            return;
         }

         var2++;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public BitSet L(byte[] var1) {
      String var10000 = D6.k();
      int var3 = var1.length * a(3802, 6281936704835585668L);
      int var4 = 0;
      String var2 = var10000;
      if (var2 != null) {
         if ((var1[var1.length - var4 / a(3802, 6281936704835585668L) - 1] & 1 << var4 % a(3802, 6281936704835585668L)) > 0) {
            this.z.set(var4);
            var4++;
         } else {
            var4++;
         }
      }

      while (true) {
         while (var4 < var3) {
            if ((var1[var1.length - var4 / a(3802, 6281936704835585668L) - 1] & 1 << var4 % a(3802, 6281936704835585668L)) > 0) {
               this.z.set(var4);
               var4++;
            } else {
               var4++;
            }
         }

         if (var2 == null) {
            return this.z;
         }

         this.z.set(var4);
         var4++;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public byte[] W(BitSet var1) {
      String var10000 = D6.k();
      this.L = new byte[(var1.length() - 1) / a(30324, 5771980612310793771L) + 1];
      String var2 = var10000;
      int var3 = 0;
      if (var2 != null) {
         if (var1.get(var3)) {
            byte[] var4 = this.L;
            int var10001 = this.L.length - var3 / a(3802, 6281936704835585668L) - 1;
            var4[var10001] = (byte)(var4[var10001] | 1 << var3 % a(3802, 6281936704835585668L));
            var3++;
         } else {
            var3++;
         }
      }

      while (true) {
         while (var3 <= var1.length()) {
            if (var1.get(var3)) {
               byte[] var5 = this.L;
               int var7 = this.L.length - var3 / a(3802, 6281936704835585668L) - 1;
               var5[var7] = (byte)(var5[var7] | 1 << var3 % a(3802, 6281936704835585668L));
               var3++;
            } else {
               var3++;
            }
         }

         byte[] var6 = this.L;
         if (var2 == null) {
            return this.L;
         }

         int var8 = this.L.length - var3 / a(3802, 6281936704835585668L) - 1;
         var6[var8] = (byte)(var6[var8] | 1 << var3 % a(3802, 6281936704835585668L));
         var3++;
      }
   }

   static {
      long var0 = 8611907180123588934L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Á&ôð´Ñ\u008fÊóüÍ\u009eÊÞ÷e";
      int var5 = "Á&ôð´Ñ\u008fÊóüÍ\u009eÊÞ÷e".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
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
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2142;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





