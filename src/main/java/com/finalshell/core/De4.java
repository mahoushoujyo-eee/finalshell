package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import java.io.IOException;
import java.net.Socket;
import java.util.Hashtable;

public class De4 extends Dm4 {
   public static String T;
   public static int R;
   public boolean g = true;
   public static byte[] a;
   public static byte[] N;
   public static Hashtable i;
   public static Hashtable q;
   public static byte[] D;
   public Socket s = null;
   public byte[] v = new byte[0];
   public static String[] f;
   public static String[] h;
   public static long[] l;
   public static Integer[] n;

   public static int Z(byte var0) {
      byte var10000 = (Dm4.F$boolean()) ? 1 : 0;
      int var2 = 0;
      boolean var1 = (((((boolean)var10000) != 0) != 0) != 0) != 0;

      while (true) {
         if (var2 < D.length) {
            var10000 = D[var2];
            if (!var1) {
               break;
            }

            if (!var1) {
               return var10000;
            }

            if (var10000 == var0) {
               return var2;
            }

            var2++;
            if (var1) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      return var10000;
   }

   public static void n(String var0) {
      N = E8.J(var0);
      boolean var10000 = Dm4.J$boolean();
      a = new byte[b(15479, 3892102147387622338L)];
      boolean var1 = var10000;
      int var2 = 0;

      while (var2 < b(5018, 3043138607408491561L)) {
         a[var2] = (byte)(Z(N[var2 * 2]) << 4 & b(26101, 2242645871466076790L) | Z(N[var2 * 2 + 1]) & b(23365, 5238429322795902175L));
         var2++;
         if (var1) {
            break;
         }
      }
   }

   public static void N(String var0) {
      T = var0;
   }

   public static void o(int var0) {
      R = var0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static byte[] N(ConnectHost var0) {
      boolean var10000 = Dm4.F$boolean();
      Hashtable var2 = q;
      synchronized (q){} // $VF: monitorenter 
      boolean var1 = var10000;

      try {
         byte[] var3 = (byte[])q.get(var0);
         byte[] var13 = var3;
         if (var1) {
            if (var3 == null) {
               I82 var4 = ConnectHost.p;
               var3 = new byte[b(5018, 3043138607408491561L)];
               synchronized (var4) {
                  var4.Y(var3, 0, b(5018, 3043138607408491561L));
               }

               i.put(var0, var3);
               byte[] var5 = new byte[b(2400, 7589435299227449079L)];
               int var6 = 0;

               while (true) {
                  if (var6 < b(5018, 3043138607408491561L)) {
                     var5[2 * var6] = D[var3[var6] >>> 4 & b(17237, 2906693066227252457L)];
                     var5[2 * var6 + 1] = D[var3[var6] & b(17237, 2906693066227252457L)];
                     var6++;
                     if (!var1) {
                        break;
                     }

                     if (var1) {
                        continue;
                     }
                  }

                  q.put(var0, var5);
                  break;
               }

               var3 = var5;
            }

            var13 = var3;
            // $VF: monitorexit
         }

         return var13;
      } finally {
         // $VF: monitorexit
      }
   }

   public static void k(ConnectHost var0) {
      synchronized (q) {
         q.remove(var0);
         i.remove(var0);
      }
   }

   public De4() {
      this.M(b(9065, 1550131024430537963L));
      this.Q(b(4349, 5341490096153210712L));
      this.f(b(1200, 8703884275044891402L));
      this.Y = E8.J(b(22203, 29240));
      this.X = true;
   }

   @Override
   public void S() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 1
      // 004: aload 0
      // 005: getstatic com/finalshell/core/De4.T Ljava/lang/String;
      // 008: getstatic com/finalshell/core/De4.R I
      // 00b: sipush 32525
      // 00e: ldc2_w 7568760149801975945
      // 011: invokestatic com/finalshell/core/De4.b (IJ)I
      // 014: invokestatic com/finalshell/core/E8.k (Ljava/lang/String;II)Ljava/net/Socket;
      // 017: putfield com/finalshell/core/De4.s Ljava/net/Socket;
      // 01a: aload 0
      // 01b: getfield com/finalshell/core/De4.s Ljava/net/Socket;
      // 01e: bipush 1
      // 01f: invokevirtual java/net/Socket.setTcpNoDelay (Z)V
      // 022: aload 0
      // 023: new com/finalshell/core/Cs4
      // 026: dup
      // 027: invokespecial com/finalshell/core/Cs4.<init> ()V
      // 02a: putfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 02d: aload 0
      // 02e: getfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 031: aload 0
      // 032: getfield com/finalshell/core/De4.s Ljava/net/Socket;
      // 035: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 038: invokevirtual com/finalshell/core/Cs4.U (Ljava/io/InputStream;)V
      // 03b: aload 0
      // 03c: getfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 03f: aload 0
      // 040: getfield com/finalshell/core/De4.s Ljava/net/Socket;
      // 043: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 046: invokevirtual com/finalshell/core/Cs4.H (Ljava/io/OutputStream;)V
      // 049: aload 0
      // 04a: invokevirtual com/finalshell/core/De4.l ()V
      // 04d: goto 060
      // 050: astore 2
      // 051: aload 0
      // 052: bipush 1
      // 053: invokevirtual com/finalshell/core/De4.d (I)V
      // 056: aload 0
      // 057: bipush 1
      // 058: putfield com/finalshell/core/De4.S Z
      // 05b: aload 0
      // 05c: invokevirtual com/finalshell/core/De4.r ()V
      // 05f: return
      // 060: aload 0
      // 061: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 064: putfield com/finalshell/core/De4.Z Ljava/lang/Thread;
      // 067: new com/finalshell/core/UJ
      // 06a: dup
      // 06b: aload 0
      // 06c: getfield com/finalshell/core/De4.c I
      // 06f: invokespecial com/finalshell/core/UJ.<init> (I)V
      // 072: astore 2
      // 073: new com/finalshell/core/YU
      // 076: dup
      // 077: aload 2
      // 078: invokespecial com/finalshell/core/YU.<init> (Lcom/finalshell/core/UJ;)V
      // 07b: astore 3
      // 07c: bipush 0
      // 07d: istore 4
      // 07f: aload 0
      // 080: invokevirtual com/finalshell/core/De4.T ()Lcom/finalshell/crypto/ConnectHost;
      // 083: astore 5
      // 085: aload 0
      // 086: getfield com/finalshell/core/De4.Z Ljava/lang/Thread;
      // 089: ifnull 16b
      // 08c: aload 0
      // 08d: iload 1
      // 08e: ifne 171
      // 091: getfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 094: iload 1
      // 095: ifne 0b4
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: ifnull 16b
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 0b7: iload 1
      // 0b8: ifne 0d3
      // 0bb: ifnull 16b
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 0c9: getfield com/finalshell/core/Cs4.I Ljava/io/InputStream;
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: aload 2
      // 0d4: getfield com/finalshell/core/UJ.g [B
      // 0d7: sipush 31490
      // 0da: ldc2_w 1780719780754343050
      // 0dd: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0e0: aload 2
      // 0e1: getfield com/finalshell/core/UJ.g [B
      // 0e4: arraylength
      // 0e5: sipush 31490
      // 0e8: ldc2_w 1780719780754343050
      // 0eb: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0ee: isub
      // 0ef: aload 5
      // 0f1: invokevirtual com/finalshell/crypto/ConnectHost.D ()I
      // 0f4: isub
      // 0f5: invokevirtual java/io/InputStream.read ([BII)I
      // 0f8: istore 4
      // 0fa: iload 4
      // 0fc: iload 1
      // 0fd: ifne 124
      // 100: ifgt 119
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: aload 0
      // 10b: invokevirtual com/finalshell/core/De4.F ()V
      // 10e: iload 1
      // 10f: ifeq 16b
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: aload 0
      // 11a: getfield com/finalshell/core/De4.S Z
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: ifeq 132
      // 127: iload 1
      // 128: ifeq 16b
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: aload 3
      // 133: invokevirtual com/finalshell/core/YU.M ()V
      // 136: aload 2
      // 137: sipush 7502
      // 13a: ldc2_w 5902723997094650576
      // 13d: invokestatic com/finalshell/core/De4.b (IJ)I
      // 140: invokevirtual com/finalshell/core/UJ.V (B)V
      // 143: aload 2
      // 144: aload 0
      // 145: getfield com/finalshell/core/De4.V I
      // 148: invokevirtual com/finalshell/core/UJ.u (I)V
      // 14b: aload 2
      // 14c: iload 4
      // 14e: invokevirtual com/finalshell/core/UJ.u (I)V
      // 151: aload 2
      // 152: iload 4
      // 154: invokevirtual com/finalshell/core/UJ.S (I)V
      // 157: aload 5
      // 159: aload 3
      // 15a: aload 0
      // 15b: iload 4
      // 15d: invokevirtual com/finalshell/crypto/ConnectHost.O (Lcom/finalshell/core/YU;Lcom/finalshell/core/Dm4;I)V
      // 160: iload 1
      // 161: ifeq 085
      // 164: goto 16b
      // 167: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16a: athrow
      // 16b: goto 170
      // 16e: astore 5
      // 170: aload 0
      // 171: invokevirtual com/finalshell/core/De4.r ()V
      // 174: return
   }

   public byte[] n(byte[] var1, int var2, int var3) {
      byte[] var5 = new byte[this.v.length + var3];
      boolean var10000 = Dm4.F$boolean();
      System.arraycopy(var1, var2, var5, this.v.length, var3);
      boolean var4 = var10000;
      byte[] var6 = this.v;
      if (var4) {
         if (this.v.length > 0) {
            System.arraycopy(this.v, 0, var5, 0, this.v.length);
         }

         this.v = var5;
         var6 = this.v;
      }

      return var6;
   }

   @Override
   public void Y(byte[] param1, int param2, int param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifeq 26e
      // 00b: getfield com/finalshell/core/De4.g Z
      // 00e: ifeq 26d
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aconst_null
      // 019: astore 5
      // 01b: aload 0
      // 01c: invokevirtual com/finalshell/core/De4.T ()Lcom/finalshell/crypto/ConnectHost;
      // 01f: astore 5
      // 021: goto 035
      // 024: astore 6
      // 026: new java/io/IOException
      // 029: dup
      // 02a: aload 6
      // 02c: invokevirtual com/finalshell/core/Pc2.toString ()Ljava/lang/String;
      // 02f: aload 6
      // 031: invokespecial java/io/IOException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 034: athrow
      // 035: aload 0
      // 036: aload 1
      // 037: iload 2
      // 038: iload 3
      // 039: invokespecial com/finalshell/core/De4.n ([BII)[B
      // 03c: astore 1
      // 03d: bipush 0
      // 03e: istore 2
      // 03f: aload 1
      // 040: arraylength
      // 041: istore 3
      // 042: iload 3
      // 043: sipush 1905
      // 046: ldc2_w 215624192667662533
      // 049: invokestatic com/finalshell/core/De4.b (IJ)I
      // 04c: iload 4
      // 04e: ifeq 094
      // 051: if_icmpge 05c
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: return
      // 05c: aload 1
      // 05d: iload 2
      // 05e: sipush 8061
      // 061: ldc2_w 4668245192539054322
      // 064: invokestatic com/finalshell/core/De4.b (IJ)I
      // 067: iadd
      // 068: baload
      // 069: sipush 8622
      // 06c: ldc2_w 7870557331696393771
      // 06f: invokestatic com/finalshell/core/De4.b (IJ)I
      // 072: iand
      // 073: sipush 26215
      // 076: ldc2_w 6777984795340331510
      // 079: invokestatic com/finalshell/core/De4.b (IJ)I
      // 07c: imul
      // 07d: aload 1
      // 07e: iload 2
      // 07f: sipush 19634
      // 082: ldc2_w 15136764019503875
      // 085: invokestatic com/finalshell/core/De4.b (IJ)I
      // 088: iadd
      // 089: baload
      // 08a: sipush 32668
      // 08d: ldc2_w 5349928785747918875
      // 090: invokestatic com/finalshell/core/De4.b (IJ)I
      // 093: iand
      // 094: iadd
      // 095: istore 6
      // 097: aload 1
      // 098: iload 2
      // 099: sipush 26918
      // 09c: ldc2_w 8935925369140631211
      // 09f: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0a2: iadd
      // 0a3: baload
      // 0a4: sipush 32668
      // 0a7: ldc2_w 5349928785747918875
      // 0aa: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0ad: iand
      // 0ae: sipush 21037
      // 0b1: ldc2_w 4443307185599278483
      // 0b4: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0b7: imul
      // 0b8: aload 1
      // 0b9: iload 2
      // 0ba: sipush 1905
      // 0bd: ldc2_w 215624192667662533
      // 0c0: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0c3: iadd
      // 0c4: baload
      // 0c5: sipush 32668
      // 0c8: ldc2_w 5349928785747918875
      // 0cb: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0ce: iand
      // 0cf: iadd
      // 0d0: istore 7
      // 0d2: aload 1
      // 0d3: iload 2
      // 0d4: baload
      // 0d5: sipush 32668
      // 0d8: ldc2_w 5349928785747918875
      // 0db: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0de: iand
      // 0df: sipush 7129
      // 0e2: ldc2_w 3696925017577333836
      // 0e5: invokestatic com/finalshell/core/De4.b (IJ)I
      // 0e8: iload 4
      // 0ea: ifeq 110
      // 0ed: if_icmpne 0fa
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: goto 17d
      // 0fa: aload 1
      // 0fb: iload 2
      // 0fc: baload
      // 0fd: sipush 32668
      // 100: ldc2_w 5349928785747918875
      // 103: invokestatic com/finalshell/core/De4.b (IJ)I
      // 106: iand
      // 107: sipush 21151
      // 10a: ldc2_w 1387367090897579303
      // 10d: invokestatic com/finalshell/core/De4.b (IJ)I
      // 110: iload 4
      // 112: ifeq 19f
      // 115: if_icmpne 17d
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e: athrow
      // 11f: iload 6
      // 121: sipush 26918
      // 124: ldc2_w 8935925369140631211
      // 127: invokestatic com/finalshell/core/De4.b (IJ)I
      // 12a: iushr
      // 12b: sipush 32668
      // 12e: ldc2_w 5349928785747918875
      // 131: invokestatic com/finalshell/core/De4.b (IJ)I
      // 134: iand
      // 135: iload 6
      // 137: sipush 26918
      // 13a: ldc2_w 8935925369140631211
      // 13d: invokestatic com/finalshell/core/De4.b (IJ)I
      // 140: ishl
      // 141: sipush 23224
      // 144: ldc2_w 7169757534720353578
      // 147: invokestatic com/finalshell/core/De4.b (IJ)I
      // 14a: iand
      // 14b: ior
      // 14c: istore 6
      // 14e: iload 7
      // 150: sipush 26918
      // 153: ldc2_w 8935925369140631211
      // 156: invokestatic com/finalshell/core/De4.b (IJ)I
      // 159: iushr
      // 15a: sipush 32668
      // 15d: ldc2_w 5349928785747918875
      // 160: invokestatic com/finalshell/core/De4.b (IJ)I
      // 163: iand
      // 164: iload 7
      // 166: sipush 26918
      // 169: ldc2_w 8935925369140631211
      // 16c: invokestatic com/finalshell/core/De4.b (IJ)I
      // 16f: ishl
      // 170: sipush 7432
      // 173: ldc2_w 4517758544310772353
      // 176: invokestatic com/finalshell/core/De4.b (IJ)I
      // 179: iand
      // 17a: ior
      // 17b: istore 7
      // 17d: iload 3
      // 17e: iload 4
      // 180: ifeq 1a5
      // 183: sipush 1350
      // 186: ldc2_w 4688771383502879450
      // 189: invokestatic com/finalshell/core/De4.b (IJ)I
      // 18c: iload 6
      // 18e: iadd
      // 18f: iload 6
      // 191: ineg
      // 192: bipush 3
      // 193: iand
      // 194: iadd
      // 195: iload 7
      // 197: iadd
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: if_icmpge 1a3
      // 1a2: return
      // 1a3: iload 7
      // 1a5: newarray 8
      // 1a7: astore 8
      // 1a9: aload 1
      // 1aa: iload 2
      // 1ab: sipush 1350
      // 1ae: ldc2_w 4688771383502879450
      // 1b1: invokestatic com/finalshell/core/De4.b (IJ)I
      // 1b4: iadd
      // 1b5: iload 6
      // 1b7: iadd
      // 1b8: iload 6
      // 1ba: ineg
      // 1bb: bipush 3
      // 1bc: iand
      // 1bd: iadd
      // 1be: aload 8
      // 1c0: bipush 0
      // 1c1: iload 7
      // 1c3: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 1c6: aconst_null
      // 1c7: astore 9
      // 1c9: getstatic com/finalshell/core/De4.i Ljava/util/Hashtable;
      // 1cc: dup
      // 1cd: astore 10
      // 1cf: monitorenter
      // 1d0: getstatic com/finalshell/core/De4.i Ljava/util/Hashtable;
      // 1d3: aload 5
      // 1d5: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1d8: checkcast [B
      // 1db: astore 9
      // 1dd: aload 10
      // 1df: monitorexit
      // 1e0: goto 1eb
      // 1e3: astore 11
      // 1e5: aload 10
      // 1e7: monitorexit
      // 1e8: aload 11
      // 1ea: athrow
      // 1eb: aload 8
      // 1ed: iload 4
      // 1ef: ifeq 20b
      // 1f2: aload 9
      // 1f4: invokestatic com/finalshell/core/De4.e ([B[B)Z
      // 1f7: ifeq 23d
      // 1fa: goto 201
      // 1fd: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 200: athrow
      // 201: getstatic com/finalshell/core/De4.a [B
      // 204: goto 20b
      // 207: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20a: athrow
      // 20b: iload 4
      // 20d: ifeq 21d
      // 210: ifnull 258
      // 213: goto 21a
      // 216: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 219: athrow
      // 21a: getstatic com/finalshell/core/De4.a [B
      // 21d: bipush 0
      // 21e: aload 1
      // 21f: iload 2
      // 220: sipush 1350
      // 223: ldc2_w 4688771383502879450
      // 226: invokestatic com/finalshell/core/De4.b (IJ)I
      // 229: iadd
      // 22a: iload 6
      // 22c: iadd
      // 22d: iload 6
      // 22f: ineg
      // 230: bipush 3
      // 231: iand
      // 232: iadd
      // 233: iload 7
      // 235: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 238: iload 4
      // 23a: ifne 258
      // 23d: aload 0
      // 23e: aconst_null
      // 23f: putfield com/finalshell/core/De4.Z Ljava/lang/Thread;
      // 242: aload 0
      // 243: invokevirtual com/finalshell/core/De4.F ()V
      // 246: aload 0
      // 247: getfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 24a: invokevirtual com/finalshell/core/Cs4.Z ()V
      // 24d: aload 0
      // 24e: invokevirtual com/finalshell/core/De4.r ()V
      // 251: goto 258
      // 254: invokestatic com/finalshell/core/De4.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 257: athrow
      // 258: aload 0
      // 259: bipush 0
      // 25a: putfield com/finalshell/core/De4.g Z
      // 25d: aload 0
      // 25e: getfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 261: aload 1
      // 262: iload 2
      // 263: iload 3
      // 264: invokevirtual com/finalshell/core/Cs4.z ([BII)V
      // 267: aload 0
      // 268: aconst_null
      // 269: putfield com/finalshell/core/De4.v [B
      // 26c: return
      // 26d: aload 0
      // 26e: getfield com/finalshell/core/De4.o Lcom/finalshell/core/Cs4;
      // 271: aload 1
      // 272: iload 2
      // 273: iload 3
      // 274: invokevirtual com/finalshell/core/Cs4.z ([BII)V
      // 277: return
   }

   public static boolean e(byte[] var0, byte[] var1) {
      boolean var2 = Dm4.J$boolean();
      int var10000 = var0.length;
      if (!var2) {
         if (var10000 != var1.length) {
            return false;
         }

         var10000 = 0;
      }

      int var3 = var10000;

      while (true) {
         if (var3 < var0.length) {
            var4 = var0[var3];
            if (var2) {
               break;
            }

            if (var2) {
               return (boolean)var4;
            }

            if (var4 != var1[var3]) {
               return 0 != 0;
            }

            var3++;
            if (!var2) {
               continue;
            }
         }

         var4 = 1;
         break;
      }

      return (boolean)var4;
   }

   static {
      __vfClinit__();
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ 22203) & 65535;
      if (h[var2] == null) {
         char[] var3 = f[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 188;
               break;
            case 1:
               var10000 = 227;
               break;
            case 2:
               var10000 = 214;
               break;
            case 3:
               var10000 = 48;
               break;
            case 4:
               var10000 = 199;
               break;
            case 5:
               var10000 = 79;
               break;
            case 6:
               var10000 = 9;
               break;
            case 7:
               var10000 = 160;
               break;
            case 8:
               var10000 = 118;
               break;
            case 9:
               var10000 = 180;
               break;
            case 10:
               var10000 = 212;
               break;
            case 11:
               var10000 = 123;
               break;
            case 12:
               var10000 = 136;
               break;
            case 13:
               var10000 = 236;
               break;
            case 14:
               var10000 = 133;
               break;
            case 15:
               var10000 = 208;
               break;
            case 16:
               var10000 = 168;
               break;
            case 17:
               var10000 = 169;
               break;
            case 18:
               var10000 = 93;
               break;
            case 19:
               var10000 = 36;
               break;
            case 20:
               var10000 = 54;
               break;
            case 21:
               var10000 = 51;
               break;
            case 22:
               var10000 = 119;
               break;
            case 23:
               var10000 = 182;
               break;
            case 24:
               var10000 = 39;
               break;
            case 25:
               var10000 = 164;
               break;
            case 26:
               var10000 = 213;
               break;
            case 27:
               var10000 = 106;
               break;
            case 28:
               var10000 = 63;
               break;
            case 29:
               var10000 = 210;
               break;
            case 30:
               var10000 = 241;
               break;
            case 31:
               var10000 = 60;
               break;
            case 32:
               var10000 = 157;
               break;
            case 33:
               var10000 = 203;
               break;
            case 34:
               var10000 = 70;
               break;
            case 35:
               var10000 = 155;
               break;
            case 36:
               var10000 = 146;
               break;
            case 37:
               var10000 = 184;
               break;
            case 38:
               var10000 = 170;
               break;
            case 39:
               var10000 = 116;
               break;
            case 40:
               var10000 = 96;
               break;
            case 41:
               var10000 = 31;
               break;
            case 42:
               var10000 = 33;
               break;
            case 43:
               var10000 = 141;
               break;
            case 44:
               var10000 = 174;
               break;
            case 45:
               var10000 = 192;
               break;
            case 46:
               var10000 = 200;
               break;
            case 47:
               var10000 = 151;
               break;
            case 48:
               var10000 = 254;
               break;
            case 49:
               var10000 = 150;
               break;
            case 50:
               var10000 = 175;
               break;
            case 51:
               var10000 = 201;
               break;
            case 52:
               var10000 = 91;
               break;
            case 53:
               var10000 = 41;
               break;
            case 54:
               var10000 = 103;
               break;
            case 55:
               var10000 = 255;
               break;
            case 56:
               var10000 = 73;
               break;
            case 57:
               var10000 = 23;
               break;
            case 58:
               var10000 = 100;
               break;
            case 59:
               var10000 = 17;
               break;
            case 60:
               var10000 = 181;
               break;
            case 61:
               var10000 = 129;
               break;
            case 62:
               var10000 = 92;
               break;
            case 63:
               var10000 = 64;
               break;
            case 64:
               var10000 = 18;
               break;
            case 65:
               var10000 = 14;
               break;
            case 66:
               var10000 = 189;
               break;
            case 67:
               var10000 = 250;
               break;
            case 68:
               var10000 = 197;
               break;
            case 69:
               var10000 = 30;
               break;
            case 70:
               var10000 = 223;
               break;
            case 71:
               var10000 = 225;
               break;
            case 72:
               var10000 = 68;
               break;
            case 73:
               var10000 = 186;
               break;
            case 74:
               var10000 = 251;
               break;
            case 75:
               var10000 = 55;
               break;
            case 76:
               var10000 = 216;
               break;
            case 77:
               var10000 = 108;
               break;
            case 78:
               var10000 = 112;
               break;
            case 79:
               var10000 = 179;
               break;
            case 80:
               var10000 = 215;
               break;
            case 81:
               var10000 = 156;
               break;
            case 82:
               var10000 = 102;
               break;
            case 83:
               var10000 = 245;
               break;
            case 84:
               var10000 = 98;
               break;
            case 85:
               var10000 = 205;
               break;
            case 86:
               var10000 = 95;
               break;
            case 87:
               var10000 = 7;
               break;
            case 88:
               var10000 = 29;
               break;
            case 89:
               var10000 = 187;
               break;
            case 90:
               var10000 = 83;
               break;
            case 91:
               var10000 = 37;
               break;
            case 92:
               var10000 = 19;
               break;
            case 93:
               var10000 = 16;
               break;
            case 94:
               var10000 = 82;
               break;
            case 95:
               var10000 = 253;
               break;
            case 96:
               var10000 = 77;
               break;
            case 97:
               var10000 = 232;
               break;
            case 98:
               var10000 = 142;
               break;
            case 99:
               var10000 = 176;
               break;
            case 100:
               var10000 = 109;
               break;
            case 101:
               var10000 = 94;
               break;
            case 102:
               var10000 = 132;
               break;
            case 103:
               var10000 = 163;
               break;
            case 104:
               var10000 = 218;
               break;
            case 105:
               var10000 = 50;
               break;
            case 106:
               var10000 = 193;
               break;
            case 107:
               var10000 = 45;
               break;
            case 108:
               var10000 = 125;
               break;
            case 109:
               var10000 = 247;
               break;
            case 110:
               var10000 = 138;
               break;
            case 111:
               var10000 = 46;
               break;
            case 112:
               var10000 = 154;
               break;
            case 113:
               var10000 = 69;
               break;
            case 114:
               var10000 = 134;
               break;
            case 115:
               var10000 = 67;
               break;
            case 116:
               var10000 = 43;
               break;
            case 117:
               var10000 = 107;
               break;
            case 118:
               var10000 = 57;
               break;
            case 119:
               var10000 = 131;
               break;
            case 120:
               var10000 = 152;
               break;
            case 121:
               var10000 = 198;
               break;
            case 122:
               var10000 = 191;
               break;
            case 123:
               var10000 = 202;
               break;
            case 124:
               var10000 = 166;
               break;
            case 125:
               var10000 = 62;
               break;
            case 126:
               var10000 = 147;
               break;
            case 127:
               var10000 = 122;
               break;
            case 128:
               var10000 = 56;
               break;
            case 129:
               var10000 = 42;
               break;
            case 130:
               var10000 = 229;
               break;
            case 131:
               var10000 = 135;
               break;
            case 132:
               var10000 = 144;
               break;
            case 133:
               var10000 = 140;
               break;
            case 134:
               var10000 = 224;
               break;
            case 135:
               var10000 = 183;
               break;
            case 136:
               var10000 = 49;
               break;
            case 137:
               var10000 = 53;
               break;
            case 138:
               var10000 = 120;
               break;
            case 139:
               var10000 = 217;
               break;
            case 140:
               var10000 = 99;
               break;
            case 141:
               var10000 = 231;
               break;
            case 142:
               var10000 = 246;
               break;
            case 143:
               var10000 = 211;
               break;
            case 144:
               var10000 = 89;
               break;
            case 145:
               var10000 = 75;
               break;
            case 146:
               var10000 = 185;
               break;
            case 147:
               var10000 = 226;
               break;
            case 148:
               var10000 = 85;
               break;
            case 149:
               var10000 = 11;
               break;
            case 150:
               var10000 = 222;
               break;
            case 151:
               var10000 = 38;
               break;
            case 152:
               var10000 = 228;
               break;
            case 153:
               var10000 = 66;
               break;
            case 154:
               var10000 = 32;
               break;
            case 155:
               var10000 = 104;
               break;
            case 156:
               var10000 = 167;
               break;
            case 157:
               var10000 = 80;
               break;
            case 158:
               var10000 = 165;
               break;
            case 159:
               var10000 = 137;
               break;
            case 160:
               var10000 = 240;
               break;
            case 161:
               var10000 = 47;
               break;
            case 162:
               var10000 = 230;
               break;
            case 163:
               var10000 = 5;
               break;
            case 164:
               var10000 = 162;
               break;
            case 165:
               var10000 = 114;
               break;
            case 166:
               var10000 = 219;
               break;
            case 167:
               var10000 = 234;
               break;
            case 168:
               var10000 = 40;
               break;
            case 169:
               var10000 = 12;
               break;
            case 170:
               var10000 = 4;
               break;
            case 171:
               var10000 = 249;
               break;
            case 172:
               var10000 = 26;
               break;
            case 173:
               var10000 = 65;
               break;
            case 174:
               var10000 = 248;
               break;
            case 175:
               var10000 = 128;
               break;
            case 176:
               var10000 = 84;
               break;
            case 177:
               var10000 = 111;
               break;
            case 178:
               var10000 = 239;
               break;
            case 179:
               var10000 = 233;
               break;
            case 180:
               var10000 = 117;
               break;
            case 181:
               var10000 = 173;
               break;
            case 182:
               var10000 = 88;
               break;
            case 183:
               var10000 = 58;
               break;
            case 184:
               var10000 = 171;
               break;
            case 185:
               var10000 = 161;
               break;
            case 186:
               var10000 = 115;
               break;
            case 187:
               var10000 = 21;
               break;
            case 188:
               var10000 = 61;
               break;
            case 189:
               var10000 = 242;
               break;
            case 190:
               var10000 = 3;
               break;
            case 191:
               var10000 = 87;
               break;
            case 192:
               var10000 = 126;
               break;
            case 193:
               var10000 = 6;
               break;
            case 194:
               var10000 = 52;
               break;
            case 195:
               var10000 = 28;
               break;
            case 196:
               var10000 = 139;
               break;
            case 197:
               var10000 = 15;
               break;
            case 198:
               var10000 = 44;
               break;
            case 199:
               var10000 = 13;
               break;
            case 200:
               var10000 = 81;
               break;
            case 201:
               var10000 = 74;
               break;
            case 202:
               var10000 = 145;
               break;
            case 203:
               var10000 = 34;
               break;
            case 204:
               var10000 = 143;
               break;
            case 205:
               var10000 = 2;
               break;
            case 206:
               var10000 = 220;
               break;
            case 207:
               var10000 = 110;
               break;
            case 208:
               var10000 = 127;
               break;
            case 209:
               var10000 = 71;
               break;
            case 210:
               var10000 = 0;
               break;
            case 211:
               var10000 = 121;
               break;
            case 212:
               var10000 = 194;
               break;
            case 213:
               var10000 = 207;
               break;
            case 214:
               var10000 = 101;
               break;
            case 215:
               var10000 = 221;
               break;
            case 216:
               var10000 = 244;
               break;
            case 217:
               var10000 = 20;
               break;
            case 218:
               var10000 = 124;
               break;
            case 219:
               var10000 = 78;
               break;
            case 220:
               var10000 = 59;
               break;
            case 221:
               var10000 = 172;
               break;
            case 222:
               var10000 = 204;
               break;
            case 223:
               var10000 = 25;
               break;
            case 224:
               var10000 = 178;
               break;
            case 225:
               var10000 = 195;
               break;
            case 226:
               var10000 = 235;
               break;
            case 227:
               var10000 = 196;
               break;
            case 228:
               var10000 = 177;
               break;
            case 229:
               var10000 = 113;
               break;
            case 230:
               var10000 = 72;
               break;
            case 231:
               var10000 = 238;
               break;
            case 232:
               var10000 = 97;
               break;
            case 233:
               var10000 = 22;
               break;
            case 234:
               var10000 = 10;
               break;
            case 235:
               var10000 = 159;
               break;
            case 236:
               var10000 = 8;
               break;
            case 237:
               var10000 = 27;
               break;
            case 238:
               var10000 = 90;
               break;
            case 239:
               var10000 = 252;
               break;
            case 240:
               var10000 = 86;
               break;
            case 241:
               var10000 = 35;
               break;
            case 242:
               var10000 = 243;
               break;
            case 243:
               var10000 = 76;
               break;
            case 244:
               var10000 = 190;
               break;
            case 245:
               var10000 = 158;
               break;
            case 246:
               var10000 = 1;
               break;
            case 247:
               var10000 = 149;
               break;
            case 248:
               var10000 = 206;
               break;
            case 249:
               var10000 = 148;
               break;
            case 250:
               var10000 = 209;
               break;
            case 251:
               var10000 = 153;
               break;
            case 252:
               var10000 = 237;
               break;
            case 253:
               var10000 = 105;
               break;
            case 254:
               var10000 = 24;
               break;
            default:
               var10000 = 130;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         h[var2] = new String(var3).intern();
      }

      return h[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16279;
      if (n[var3] == null) {
         n[var3] = (int)(l[var3] ^ var1);
      }

      return n[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "ús7\t\u0017-ì¼©5©iÔ";
      int var12 = "ús7\t\u0017-ì¼©5©iÔ".length();
      char var9 = 3;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var28 = 110;
            var10002 = var10003;
            int var18 = var10004;
            byte var33;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var33 = 110;
               var10006 = var14;
            } else {
               var28 = 110;
               var18 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var33 = 110;
               var10006 = var14;
            }

            while (true) {
               char var47 = var10005[var10006];
               byte var48;
               switch (var14 % 7) {
                  case 0:
                     var48 = 37;
                     break;
                  case 1:
                     var48 = 47;
                     break;
                  case 2:
                     var48 = 41;
                     break;
                  case 3:
                     var48 = 5;
                     break;
                  case 4:
                     var48 = 83;
                     break;
                  case 5:
                     var48 = 100;
                     break;
                  default:
                     var48 = 83;
               }

               var10005[var10006] = (char)(var47 ^ var33 ^ var48);
               var14++;
               if (var28 == 0) {
                  var10006 = var28;
                  var10005 = var10002;
                  var33 = var28;
               } else {
                  if (var18 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var33 = var28;
                  var10006 = var14;
               }
            }
         }

         String var30 = new String(var10002).intern();
         int var20 = -1;
         var13[var11++] = var30;
         if ((var8 += var9) >= var12) {
            f = var13;
            h = new String[2];
            long var0 = 8366153390349842794L;
            long[] var6 = new long[51];
            int var3 = 0;
            String var4 = "`NþûxxO½¼\u0083]YR\u0099ª\u0091z\u000b\u0005I©ÈÝde»\u0010ïÏ£Ö+©\rÖû\u009dwZ\u009fnÛ°\u0087n\u0094c@_i°4[y!\u009c Á¦Õ\u000e¥¥\u0005LpÀÍ\u0084\r\u0010\u009f«¿j©F;[äï¿tzf\u0019\u001cè\u009cq¥Xâ\u008fÃ¼\u008aå\u0088EÐN\u008d\nìÅËÞ>\u0006\u001dºÄ¿\u001eA\u0010£Ç®Àµ¼\u0013t\u0007O\u0090\u001ev\u008f\u0083x\u001f9\u008eðlç4ì\u001aIj\"\n\u0090\u0001¼'g¾5\u0006æ±\u009f/\u001eóÌaó÷u\u0080#ì\u0017ÔV(âGå\u0081ª$í\u009bnáh\u0088z·\u0012A\u001dmç>\u0094¡\u0083\u0099!\u008cY\u009eZ\fð_Ðô\u001cÂ\u0096@ÔØ\u009f</ÉCÆA\u009bºÌÂcüâwå\u0013ÌúgßÅÒÜî\u008b¼3@MÎEv\u009a¤ë(öØOpd½î+Z=3/\u0007gö\u0013Ù\n¡{%ðàäêOÌì¨z¸\u0093í\b\u0002XÔÁ¦®h£üxçUS\u0094Øn\u0081\u008a<ÑéÖ\u001fxÐJU\nn\u0016ä-Ú;\u009bÊ#ql\u0002\u001eñKß¾ÈeW®1®\u0095ùÏX\u0098o\u001e\u001b.ø*½¾MK«\u0085\u008cW.\u008d7´ñd\u0088\u001cC\u001eôÄ\u0013\u0082`n7\u000e®ð8Í\u0081\u0094Õ\u008f\u0083\n?\u0014!´g\u008c\f\u008cH¡T";
            int var5 = "`NþûxxO½¼\u0083]YR\u0099ª\u0091z\u000b\u0005I©ÈÝde»\u0010ïÏ£Ö+©\rÖû\u009dwZ\u009fnÛ°\u0087n\u0094c@_i°4[y!\u009c Á¦Õ\u000e¥¥\u0005LpÀÍ\u0084\r\u0010\u009f«¿j©F;[äï¿tzf\u0019\u001cè\u009cq¥Xâ\u008fÃ¼\u008aå\u0088EÐN\u008d\nìÅËÞ>\u0006\u001dºÄ¿\u001eA\u0010£Ç®Àµ¼\u0013t\u0007O\u0090\u001ev\u008f\u0083x\u001f9\u008eðlç4ì\u001aIj\"\n\u0090\u0001¼'g¾5\u0006æ±\u009f/\u001eóÌaó÷u\u0080#ì\u0017ÔV(âGå\u0081ª$í\u009bnáh\u0088z·\u0012A\u001dmç>\u0094¡\u0083\u0099!\u008cY\u009eZ\fð_Ðô\u001cÂ\u0096@ÔØ\u009f</ÉCÆA\u009bºÌÂcüâwå\u0013ÌúgßÅÒÜî\u008b¼3@MÎEv\u009a¤ë(öØOpd½î+Z=3/\u0007gö\u0013Ù\n¡{%ðàäêOÌì¨z¸\u0093í\b\u0002XÔÁ¦®h£üxçUS\u0094Øn\u0081\u008a<ÑéÖ\u001fxÐJU\nn\u0016ä-Ú;\u009bÊ#ql\u0002\u001eñKß¾ÈeW®1®\u0095ùÏX\u0098o\u001e\u001b.ø*½¾MK«\u0085\u008cW.\u008d7´ñd\u0088\u001cC\u001eôÄ\u0013\u0082`n7\u000e®ð8Í\u0081\u0094Õ\u008f\u0083\n?\u0014!´g\u008c\f\u008cH¡T"
               .length();
            byte var2 = 0;

            label40:
            while (true) {
               var20 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var20, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var20 = var3++;
               long var26 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var31 = -1;

               while (true) {
                  long var38 = var26 ^ var0;
                  switch (var31) {
                     case 0:
                        var10000[var20] = var38;
                        if (var2 >= var5) {
                           l = var6;
                           n = new Integer[51];
                           T = b(22202, 29056);
                           R = b(13609, 8070901454368017042L);
                           a = null;
                           N = null;
                           i = new Hashtable();
                           q = new Hashtable();
                           byte[] var17 = new byte[b(5018, 3043138607408491561L)];
                           var17[0] = (byte)b(27022, 7962152073362167336L);
                           var17[1] = (byte)b(1204, 7547392352964819768L);
                           var17[2] = (byte)b(19401, 2206496864129643602L);
                           var17[3] = (byte)b(27742, 8380671225153901512L);
                           var17[4] = (byte)b(2918, 1662942794567890143L);
                           var17[5] = (byte)b(2391, 3280916419536762575L);
                           var17[b(3968, 8187888141456191494L)] = (byte)b(8477, 269345572039433898L);
                           var17[b(13883, 6975816083359828365L)] = (byte)b(23057, 639843822784701855L);
                           var17[b(3313, 7957817832201302849L)] = (byte)b(11867, 7685691254249230810L);
                           var17[b(4316, 8616035975968632648L)] = (byte)b(23078, 699496003293832635L);
                           var17[b(5947, 661197202576091273L)] = (byte)b(6410, 5630745526664210101L);
                           var17[b(15501, 8197039543027204870L)] = (byte)b(26701, 8777126574775359472L);
                           var17[b(25587, 6557098287480888419L)] = (byte)b(7173, 194981015474414486L);
                           var17[b(336, 2864688802895019721L)] = (byte)b(22030, 4273606956036811153L);
                           var17[b(26519, 6343066119178541104L)] = (byte)b(31414, 5693739669946156348L);
                           var17[b(17237, 2906693066227252457L)] = (byte)b(8626, 6894505932044541490L);
                           D = var17;
                           return;
                        }
                        break;
                     default:
                        var10000[var20] = var38;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "Bv\u0005¦Ô_/r\u008fð\u00192àCÖ2";
                        var5 = "Bv\u0005¦Ô_/r\u008fð\u00192àCÖ2".length();
                        var2 = 0;
                  }

                  byte var23 = var2;
                  var2 += 8;
                  var7 = var4.substring(var23, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var20 = var3++;
                  var26 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var31 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





