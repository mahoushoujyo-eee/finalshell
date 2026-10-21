package com.finalshell.core;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class WI extends WC {
   short F = D6.nu;
   int o = 0;
   int i = 0;
   byte[] K;
   byte[] y;
   int Q;
   InetAddress J;
   int p;
   int P;
   static String s;
   static byte[] b;
   int B;
   long h;
   public static long[] a;
   public static Integer[] c;

   static {
      __vfClinit__();
   }

   public WI(int var1, byte[] var2, int var3, short var4, int var5, int var6) {
      this.o = var1;
      this.P = var3;
      this.i = var4;
      this.K = new byte[this.i];
      this.H = var6;
      this.l = var5;
      System.arraycopy(var2, var3, this.K, 0, var4);

      try {
         this.K = To4.R(this.K, b);
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      this.i = this.K.length;
   }

   public void F(int var1) {
      this.Q = var1;
      this.y = new byte[this.i + a(7233, 3990813192303492892L) + a(12838, 15515319057027444L)];
      B8.P(this.W, this.y, 0);
      B8.P(this.F, this.y, 2);
      LH3_2.u(this.l, this.y, 4);
      LH3_2.u(this.H, this.y, a(12838, 15515319057027444L));
      LH3_2.u(this.o, this.y, a(993, 264113324159049917L));
      B8.P((short)this.i, this.y, a(7233, 3990813192303492892L));
      LH3_2.u(this.Q, this.y, a(27050, 4874772128051645169L));
      System.arraycopy(this.K, 0, this.y, a(27588, 2206203659723655323L), this.i);
      this.g = new DatagramPacket(this.y, this.y.length);
      this.g.setAddress(this.J);
      this.g.setPort(this.p);
   }

   public WI(DatagramPacket param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial com/finalshell/core/WC.<init> ()V
      // 04: aload 0
      // 05: getstatic com/finalshell/core/D6.nu S
      // 08: putfield com/finalshell/core/WI.F S
      // 0b: aload 0
      // 0c: bipush 0
      // 0d: putfield com/finalshell/core/WI.o I
      // 10: aload 0
      // 11: bipush 0
      // 12: putfield com/finalshell/core/WI.i I
      // 15: aload 0
      // 16: aload 1
      // 17: putfield com/finalshell/core/WI.g Ljava/net/DatagramPacket;
      // 1a: invokestatic com/finalshell/core/WC.U ()[Lcom/finalshell/ui/panel/Ky4;
      // 1d: aload 0
      // 1e: aload 1
      // 1f: invokevirtual java/net/DatagramPacket.getData ()[B
      // 22: putfield com/finalshell/core/WI.y [B
      // 25: aload 0
      // 26: aload 0
      // 27: getfield com/finalshell/core/WI.y [B
      // 2a: bipush 0
      // 2b: invokestatic com/finalshell/core/B8.M$short ([BI)S
      // 2e: putfield com/finalshell/core/WI.W S
      // 31: aload 0
      // 32: aload 0
      // 33: getfield com/finalshell/core/WI.y [B
      // 36: bipush 2
      // 37: invokestatic com/finalshell/core/B8.M$short ([BI)S
      // 3a: putfield com/finalshell/core/WI.F S
      // 3d: aload 0
      // 3e: aload 0
      // 3f: getfield com/finalshell/core/WI.y [B
      // 42: bipush 4
      // 43: invokestatic com/finalshell/core/LH3_2.z ([BI)I
      // 46: putfield com/finalshell/core/WI.l I
      // 49: aload 0
      // 4a: aload 0
      // 4b: getfield com/finalshell/core/WI.y [B
      // 4e: sipush 31098
      // 51: ldc2_w 7018684942682217001
      // 54: invokestatic com/finalshell/core/WI.a (IJ)I
      // 57: invokestatic com/finalshell/core/LH3_2.z ([BI)I
      // 5a: putfield com/finalshell/core/WI.H I
      // 5d: aload 0
      // 5e: aload 0
      // 5f: getfield com/finalshell/core/WI.y [B
      // 62: sipush 2774
      // 65: ldc2_w 252412390330935692
      // 68: invokestatic com/finalshell/core/WI.a (IJ)I
      // 6b: invokestatic com/finalshell/core/LH3_2.z ([BI)I
      // 6e: putfield com/finalshell/core/WI.o I
      // 71: astore 2
      // 72: aload 0
      // 73: aload 0
      // 74: getfield com/finalshell/core/WI.y [B
      // 77: sipush 4754
      // 7a: ldc2_w 4978641614805217740
      // 7d: invokestatic com/finalshell/core/WI.a (IJ)I
      // 80: invokestatic com/finalshell/core/B8.M$short ([BI)S
      // 83: putfield com/finalshell/core/WI.i I
      // 86: aload 0
      // 87: getfield com/finalshell/core/WI.i I
      // 8a: aload 2
      // 8b: ifnull a3
      // 8e: ifle fc
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/WI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: aload 1
      // 99: invokevirtual java/net/DatagramPacket.getLength ()I
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/WI.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a2: athrow
      // a3: sipush 30165
      // a6: ldc2_w 6461985661042448013
      // a9: invokestatic com/finalshell/core/WI.a (IJ)I
      // ac: if_icmple fc
      // af: aload 0
      // b0: aload 0
      // b1: getfield com/finalshell/core/WI.y [B
      // b4: sipush 11048
      // b7: ldc2_w 4765825183584716913
      // ba: invokestatic com/finalshell/core/WI.a (IJ)I
      // bd: invokestatic com/finalshell/core/LH3_2.z ([BI)I
      // c0: putfield com/finalshell/core/WI.Q I
      // c3: aload 0
      // c4: aload 0
      // c5: getfield com/finalshell/core/WI.i I
      // c8: newarray 8
      // ca: putfield com/finalshell/core/WI.K [B
      // cd: aload 0
      // ce: getfield com/finalshell/core/WI.y [B
      // d1: sipush 27588
      // d4: ldc2_w 2206203659723655323
      // d7: invokestatic com/finalshell/core/WI.a (IJ)I
      // da: aload 0
      // db: getfield com/finalshell/core/WI.K [B
      // de: bipush 0
      // df: aload 0
      // e0: getfield com/finalshell/core/WI.i I
      // e3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // e6: aload 0
      // e7: aload 0
      // e8: getfield com/finalshell/core/WI.K [B
      // eb: getstatic com/finalshell/core/WI.b [B
      // ee: invokestatic com/finalshell/core/To4.b ([B[B)[B
      // f1: putfield com/finalshell/core/WI.K [B
      // f4: goto fc
      // f7: astore 3
      // f8: aload 3
      // f9: invokevirtual java/lang/Exception.printStackTrace ()V
      // fc: return
   }

   public int D() {
      return this.o;
   }

   public byte[] G() {
      return this.K;
   }

   public int k() {
      return this.i;
   }

   public int c() {
      return this.Q;
   }

   public void z(int var1) {
      this.Q = var1;
   }

   public InetAddress F$InetAddress() {
      return this.J;
   }

   @Override
   public void K(InetAddress var1) {
      this.J = var1;
   }

   public int F$int() {
      return this.p;
   }

   @Override
   public void S(int var1) {
      this.p = var1;
   }

   public int K() {
      return this.B;
   }

   public void C(int var1) {
      this.B = var1;
   }

   public long a() {
      return this.h;
   }

   public void s(long var1) {
      this.h = var1;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9051;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[2];
      int var12 = 0;
      String var11 = "\u0004hNw0\"A.m\u001b~:/CnnL\u007f7)D?=\u001a\u0005\".\u001eb;";
      int var13 = "\u0004hNw0\"A.m\u001b~:/CnnL\u007f7)D?=\u001a\u0005\".\u001eb;".length();
      char var10 = 24;
      int var9 = -1;

      while (true) {
         char[] var10002;
         label66: {
            char[] var10003 = var11.substring(++var9, var9 + var10).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var29 = 1;
            var10002 = var10003;
            int var19 = var10004;
            byte var34;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var34 = 1;
               var10006 = var14;
            } else {
               var29 = 1;
               var19 = var10004;
               if (var10004 <= var14) {
                  break label66;
               }

               var10005 = var10003;
               var34 = 1;
               var10006 = var14;
            }

            while (true) {
               char var48 = var10005[var10006];
               byte var49;
               switch (var14 % 7) {
                  case 0:
                     var49 = 86;
                     break;
                  case 1:
                     var49 = 91;
                     break;
                  case 2:
                     var49 = 121;
                     break;
                  case 3:
                     var49 = 78;
                     break;
                  case 4:
                     var49 = 2;
                     break;
                  case 5:
                     var49 = 27;
                     break;
                  default:
                     var49 = 112;
               }

               var10005[var10006] = (char)(var48 ^ var34 ^ var49);
               var14++;
               if (var29 == 0) {
                  var10006 = var29;
                  var10005 = var10002;
                  var34 = var29;
               } else {
                  if (var19 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var34 = var29;
                  var10006 = var14;
               }
            }
         }

         String var31 = new String(var10002).intern();
         int var21 = -1;
         var8[var12++] = var31;
         if ((var9 += var10) >= var13) {
            long var0 = 3138444534506236775L;
            long[] var6 = new long[10];
            int var3 = 0;
            String var4 = "òkVy7üá\u0084¼ö\u0089\u0083D\u0017\u0082ç\u009aÈ^Ö\u0003¯#\u0004;YÙ½´\u0098ýüÀÏ\b\u008e\u0015|cêw\u000br3¸ó\u009a»w\u008e\u0090!N³\u0094k·s\u0093ñHp\u000bÖ";
            int var5 = "òkVy7üá\u0084¼ö\u0089\u0083D\u0017\u0082ç\u009aÈ^Ö\u0003¯#\u0004;YÙ½´\u0098ýüÀÏ\b\u008e\u0015|cêw\u000br3¸ó\u009a»w\u008e\u0090!N³\u0094k·s\u0093ñHp\u000bÖ"
               .length();
            byte var2 = 0;

            label50:
            while (true) {
               var21 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var21 = var3++;
               long var27 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var32 = -1;

               while (true) {
                  long var39 = var27 ^ var0;
                  switch (var32) {
                     case 0:
                        var10000[var21] = var39;
                        if (var2 >= var5) {
                           a = var6;
                           c = new Integer[10];
                           s = var8[0];

                           try {
                              b = s.getBytes(var8[1]);
                           } catch (UnsupportedEncodingException var16) {
                              var16.printStackTrace();
                           }

                           return;
                        }
                        break;
                     default:
                        var10000[var21] = var39;
                        if (var2 < var5) {
                           continue label50;
                        }

                        var4 = "»ÙT\u009bÄvqFòRX×²z:\u001b";
                        var5 = "»ÙT\u009bÄvqFòRX×²z:\u001b".length();
                        var2 = 0;
                  }

                  byte var24 = var2;
                  var2 += 8;
                  var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var21 = var3++;
                  var27 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var32 = 0;
               }
            }
         }

         var10 = var11.charAt(var9);
      }
   }
}





