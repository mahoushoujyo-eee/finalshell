package com.finalshell.core;

import com.finalshell.ui.model.Ks2;
import com.finalshell.ui.panel.Ky4;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Fu4 implements Ky2 {
   public static byte[] u;
   public ByteBuffer U;
   public static long[] a;
   public static Integer[] b;

   public static byte[] J(byte[] var0) {
      boolean var10000 = DF.c();
      byte[] var2 = new byte[var0.length * 2];
      boolean var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < var0.length) {
            var4 = b(var0[var3]);
            if (var1) {
               break;
            }

            System.arraycopy(var4, 0, var2, var3 * 2, 2);
            var3++;
            if (!var1) {
      byte[] var4;
      byte[] var4;
               continue;
            }
         }

         var4 = var2;
         break;
      }

      return var4;
   }

   public static byte[] i(byte[] var0) {
      boolean var10000 = DF.M();
      byte[] var2 = new byte[var0.length / 2];
      boolean var1 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < var2.length) {
            byte[] var4 = new byte[2];
            System.arraycopy(var0, var3 * 2, var4, 0, 2);
            var5 = var2;
            if (!var1) {
               break;
            }

            var2[var3] = H(var4);
            var3++;
            if (var1) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public static byte H(byte[] var0) {
      int var1 = Arrays.binarySearch(u, var0[0]) * a(22523, 2603451377351864266L);
      var1 += Arrays.binarySearch(u, var0[1]);
      return (byte)var1;
   }

   public static byte[] b(byte var0) {
      return new byte[]{u[var0 >> 4 & a(7873, 6849712489932089084L)], u[var0 & a(1012, 8315339687666809812L)]};
   }

   public Fu4(ByteBuffer var1) {
      this.U = var1;
   }

   public static Fu4 y(int var0) {
      return new Fu4(ByteBuffer.allocate(var0 * 2));
   }

   public static Fu4 L(int var0) {
      return new Fu4(ByteBuffer.allocateDirect(var0 * 2));
   }

   public Ky2 m() {
      return new Fu4(this.U.slice());
   }

   public Ky2 R$Ky_2() {
      return new Fu4(this.U.duplicate());
   }

   public Ky2 Z() {
      return new Fu4(this.U.asReadOnlyBuffer());
   }

   @Override
   public byte c() {
      return H(new byte[]{this.U.get(), this.U.get()});
   }

   @Override
   public Ky2 X(byte[] var1, int var2, int var3) {
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
   public Ky2 A(byte[] var1) {
      return this.X(var1, 0, var1.length);
   }

   @Override
   public Ky2 c(byte var1) {
      this.U.put(b(var1));
      return this;
   }

   @Override
   public Ky2 A(byte[] var1, int var2, int var3) {
      boolean var4 = DF.M();

      Fu4 var10000;
      while (true) {
         if (var2 < var3) {
            var10000 = this;
            if (!var4) {
               break;
            }

            this.c(var1[var2]);
            var2++;
            if (var4) {
               continue;
            }
         }

         var10000 = this;
         break;
      }

      return var10000;
   }

   @Override
   public Ky2 G(byte[] var1) {
      return this.A(var1, 0, var1.length);
   }

   @Override
   public byte z(int var1) {
      return H(new byte[]{this.U.get(var1 * 2), this.U.get(var1 * 2 + 1)});
   }

   @Override
   public Ky2 I(int var1, byte[] var2, int var3, int var4) {
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
   public Ky2 v(int var1, byte[] var2) {
      return this.I(var1, var2, 0, var2.length);
   }

   @Override
   public Ky2 m(int var1, byte var2) {
      byte[] var3 = b(var2);
      this.U.put(var1 * 2, var3[0]);
      this.U.put(var1 * 2 + 1, var3[1]);
      return this;
   }

   @Override
   public Ky2 T(int var1, byte[] var2, int var3, int var4) {
      boolean var5 = DF.M();

      Fu4 var10000;
      while (true) {
         if (var3 < var4) {
            var10000 = this;
            if (!var5) {
               break;
            }

            this.m(var1++, var2[var3]);
            var3++;
            if (var5) {
               continue;
            }
         }

         var10000 = this;
         break;
      }

      return var10000;
   }

   @Override
   public Ky2 z(int var1, byte[] var2) {
      return this.T(var1, var2, 0, var2.length);
   }

   public Ky2 P() {
      this.U.compact();
      return this;
   }

   public boolean E() {
      return this.U.isDirect();
   }

   public char R$char() {
      return (char)this.c();
   }

   public Ky2 B(char var1) {
      return this.c((byte)var1);
   }

   public char F(int var1) {
      return (char)this.z(var1);
   }

   public Ky2 P(int var1, char var2) {
      return this.m(var1, (byte)var2);
   }

   public Kk2 z$Kk_2() {
      return new Kk2(this.U);
   }

   public short K$short() {
      return DF.I(new byte[]{this.c(), this.c()}, Ks2.Little);
   }

   public Ky2 P(short var1) {
      return this.G(DF.C(var1, Ks2.Little));
   }

   public short H(int var1) {
      return DF.I(new byte[]{this.z(var1), this.z(var1 + 1)}, Ks2.Little);
   }

   public Ky2 g(int var1, short var2) {
      return this.z(var1, DF.C(var2, Ks2.Little));
   }

   public int z$int() {
      return DF.a(new byte[]{this.c(), this.c(), this.c(), this.c()}, Ks2.Little);
   }

   public Ky2 P(int var1) {
      return this.G(DF.U(var1, Ks2.Little));
   }

   public int B(int var1) {
      return DF.a(new byte[]{this.z(var1), this.z(var1 + 1), this.z(var1 + 2), this.z(var1 + 3)}, Ks2.Little);
   }

   public Ky2 G(int var1, int var2) {
      return this.z(var1, DF.U(var2, Ks2.Little));
   }

   public long q() {
      byte[] var10000 = new byte[a(26838, 1235999945135886577L)];
      var10000[0] = this.c();
      var10000[1] = this.c();
      var10000[2] = this.c();
      var10000[3] = this.c();
      var10000[4] = this.c();
      var10000[5] = this.c();
      var10000[a(22574, 2472483700774051857L)] = this.c();
      var10000[a(6216, 9211536570294984820L)] = this.c();
      return DF.J(var10000, Ks2.Little);
   }

   public Ky2 v(long var1) {
      return this.G(DF.h(var1, Ks2.Little));
   }

   public long h(int var1) {
      boolean var2 = DF.M();
      byte[] var10000 = new byte[a(5043, 375197524539534216L)];
      var10000[0] = this.z(var1);
      var10000[1] = this.z(var1 + 1);
      var10000[2] = this.z(var1 + 2);
      var10000[3] = this.z(var1 + 3);
      var10000[4] = this.z(var1 + 4);
      var10000[5] = this.z(var1 + 5);
      var10000[a(21385, 8014350891915258800L)] = this.z(var1 + a(21385, 8014350891915258800L));
      var10000[a(11091, 6332614515620729697L)] = this.z(var1 + a(11091, 6332614515620729697L));
      long var3 = DF.J(var10000, Ks2.Little);
      if (Ky4.F$arrString() != null) {
         DF.N(!var2);
      }

      return var3;
   }

   public Ky2 y(int var1, long var2) {
      return this.z(var1, DF.h(var2, Ks2.Little));
   }

   public boolean L() {
      return this.U.isReadOnly();
   }

   @Override
   public void a() {
      this.U.flip();
   }

   @Override
   public int l() {
      double var1 = (double)this.U.remaining() / 2.0;
      return (int)Math.floor(var1);
   }

   public boolean K$boolean() {
      boolean var1 = DF.c();
      int var10000 = this.U.remaining();
      if (!var1) {
         var10000 = var10000 > 1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   @Override
   public Fu4 A() {
      return this;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30764;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 369021262838467090L;
      long[] var6 = new long[32];
      int var3 = 0;
      String var4 = "\u00ad \u0098ì´\"\u0088f]q)\u0083_#¸`ºK\u0094½\u0093Õ\u009eÙ\u0088Q\u0011\u009d\u000f¶Ðçm½,\u008eéf\u0019Î)DÝÔØ°FöVÅ^7Ö\nem\u0005Ó¡n\u0093ô\u008ab\u0004ý\u00138\fht\u0083\r¡\u001dDôs\u0087þ\u000f\u0092\u008b¾ú¤\u0090ò$º{®î7\u009aëþÄÔ\u0019\u0088\u001bñÉ\u0010Ëd\u001d.öA\u008cÀ\u0080àµK-¤~Ñå)\u0001 v\u0092þSÜ_F\u0095þjaÂÿ0\u0004ùøìá©ÍG~´G2Ù0æçþ_\u0099*\u0005×?\n¡¯r\u009a\f\u0098¡´4\u0087ü!¤aÜ\u0089{\u00ad\"ÿÅm8¬¸\u0004Åa\u0092}\u000eH\u008aê$p\bX2\u001c\u0083[ÛÙõ\u0002\u0098ëØaÞ\u008f\u0019TI%ê$¢o%:O\u0016ÿl½ªÔ\u001c` àÏ\u0002¥È";
      int var5 = "\u00ad \u0098ì´\"\u0088f]q)\u0083_#¸`ºK\u0094½\u0093Õ\u009eÙ\u0088Q\u0011\u009d\u000f¶Ðçm½,\u008eéf\u0019Î)DÝÔØ°FöVÅ^7Ö\nem\u0005Ó¡n\u0093ô\u008ab\u0004ý\u00138\fht\u0083\r¡\u001dDôs\u0087þ\u000f\u0092\u008b¾ú¤\u0090ò$º{®î7\u009aëþÄÔ\u0019\u0088\u001bñÉ\u0010Ëd\u001d.öA\u008cÀ\u0080àµK-¤~Ñå)\u0001 v\u0092þSÜ_F\u0095þjaÂÿ0\u0004ùøìá©ÍG~´G2Ù0æçþ_\u0099*\u0005×?\n¡¯r\u009a\f\u0098¡´4\u0087ü!¤aÜ\u0089{\u00ad\"ÿÅm8¬¸\u0004Åa\u0092}\u000eH\u008aê$p\bX2\u001c\u0083[ÛÙõ\u0002\u0098ëØaÞ\u008f\u0019TI%ê$¢o%:O\u0016ÿl½ªÔ\u001c` àÏ\u0002¥È"
         .length();
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
            long var14 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var14;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[32];
                     byte[] var9 = new byte[a(10915, 351504462747226768L)];
                     var9[0] = (byte)a(8938, 463998017905318597L);
                     var9[1] = (byte)a(22143, 6532891781579681373L);
                     var9[2] = (byte)a(13567, 647814598748916950L);
                     var9[3] = (byte)a(30202, 1054889283334049247L);
                     var9[4] = (byte)a(27584, 5953834821979182056L);
                     var9[5] = (byte)a(1664, 3786862181579357860L);
                     var9[a(21385, 8014350891915258800L)] = (byte)a(24825, 5862702349243062490L);
                     var9[a(11091, 6332614515620729697L)] = (byte)a(25329, 2101708302578162391L);
                     var9[a(5043, 375197524539534216L)] = (byte)a(32005, 5410834078839801139L);
                     var9[a(13238, 4754289515604724631L)] = (byte)a(3540, 1071202036079359470L);
                     var9[a(22780, 2016264834922848460L)] = (byte)a(19006, 6758586540750680595L);
                     var9[a(11225, 3154431182105891820L)] = (byte)a(7522, 4549977994242811221L);
                     var9[a(26666, 9128184525816270866L)] = (byte)a(589, 4964320368910793337L);
                     var9[a(31317, 7515365113074745977L)] = (byte)a(16529, 4833187766488185007L);
                     var9[a(5979, 109090150415855473L)] = (byte)a(27776, 2610540327388845230L);
                     var9[a(1012, 8315339687666809812L)] = (byte)a(30781, 3766344850270126102L);
                     u = var9;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var14;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0003|yx\u0089\u0003Ùt\u0018¿<^i\u000eØ\u0092";
                  var5 = "\u0003|yx\u0089\u0003Ùt\u0018¿<^i\u000eØ\u0092".length();
                  var2 = 0;
            }

            byte var11 = var2;
            var2 += 8;
            var7 = var4.substring(var11, var2).getBytes("ISO-8859-1");
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
}






