package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.io.OutputStream;

public class P42 {
   public final int g;
   public final int x;
   public final byte[] S;
   public final int a;
   public int z;
   public int D;
   public int h;
   public int Z;
   public int V;
   public int X;
   public int[] d;
   public int[] J;
   public int H;
   public int L;
   public boolean G;
   public int U;
   public int W;
   public int m;
   public int I;
   public int Q;
   public int[] B;
   public int R;
   public byte[] f;
   public static long[] b;
   public static Integer[] c;

   public P42(int var1, int var2, byte[] var3, int var4) {
   super();
      Ky4[] var10000 = Kj4.d();
      this.Z = a(23188, 7711734704620450771L);
      this.X = a(432, 2357350484718938362L);
      Ky4[] var5 = var10000;
      this.d = new int[a(32268, 1402356889283729265L)];
      this.J = new int[a(17148, 8387878617645132721L)];
      this.H = a(17148, 8387878617645132721L);
      this.L = 0;
      this.G = false;
      this.I = 0;
      this.Q = 0;
      int[] var10001 = new int[a(4045, 6346920828874876574L)];
      var10001[0] = 0;
      var10001[1] = 1;
      var10001[2] = 3;
      var10001[3] = a(17364, 7202264991543274129L);
      var10001[4] = a(27821, 6960800015077836257L);
      var10001[5] = a(19941, 1221823719686218905L);
      var10001[a(22284, 1684266695584890455L)] = a(11807, 6457157969564321628L);
      var10001[a(3148, 7219560503460717850L)] = a(18881, 3448547466843791517L);
      var10001[a(13184, 7967115493810166482L)] = a(22875, 3585342920667246611L);
      var10001[a(5800, 424791115309252579L)] = a(17547, 2591646184835296706L);
      var10001[a(30534, 939170754969968132L)] = a(17604, 3391431268792184194L);
      var10001[a(5463, 406921236491009038L)] = a(30440, 7762398030644322229L);
      var10001[a(11947, 7646462328727521253L)] = a(18261, 2852886083778031124L);
      var10001[a(12806, 4657545342652734329L)] = a(13871, 8294920902705799024L);
      var10001[a(27780, 3243132885943059908L)] = a(12545, 6461061564852394073L);
      var10001[a(7023, 4436605272131859006L)] = a(21686, 6342580050738986482L);
      var10001[a(12236, 7979561018637633177L)] = a(7927, 2728571986722387885L);
      this.B = var10001;
      this.f = new byte[a(3529, 1676098211751879838L)];
      this.g = var1;
      this.x = var2;
      this.S = var3;
      this.a = Math.max(2, var4);
      if (var5 == null) {
         Ky4.K(new String[1]);
      }
   }

   public void i(byte param1, OutputStream param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Kj4.d ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: getfield com/finalshell/core/P42.f [B
      // 07: aload 0
      // 08: dup
      // 09: getfield com/finalshell/core/P42.R I
      // 0c: dup_x1
      // 0d: bipush 1
      // 0e: iadd
      // 0f: putfield com/finalshell/core/P42.R I
      // 12: iload 1
      // 13: bastore
      // 14: astore 3
      // 15: aload 0
      // 16: aload 3
      // 17: ifnull 38
      // 1a: getfield com/finalshell/core/P42.R I
      // 1d: sipush 14170
      // 20: ldc2_w 6226793814904692238
      // 23: invokestatic com/finalshell/core/P42.a (IJ)I
      // 26: if_icmplt 3c
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 2f: athrow
      // 30: aload 0
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 37: athrow
      // 38: aload 2
      // 39: invokevirtual com/finalshell/core/P42.H (Ljava/io/OutputStream;)V
      // 3c: return
   }

   public void t(OutputStream var1) throws IOException {
      this.C(this.H);
      this.L = this.W + 2;
      this.G = true;
      this.x(this.W, var1);
   }

   public void C(int var1) {
      Ky4[] var10000 = Kj4.d();
      int var3 = 0;
      Ky4[] var2 = var10000;

      while (var3 < var1) {
         this.d[var3] = -1;
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void O(int param1, OutputStream param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 1
      // 002: putfield com/finalshell/core/P42.U I
      // 005: aload 0
      // 006: bipush 0
      // 007: putfield com/finalshell/core/P42.G Z
      // 00a: aload 0
      // 00b: aload 0
      // 00c: getfield com/finalshell/core/P42.U I
      // 00f: putfield com/finalshell/core/P42.h I
      // 012: invokestatic com/finalshell/core/Kj4.d ()[Lcom/finalshell/ui/panel/Ky4;
      // 015: aload 0
      // 016: aload 0
      // 017: aload 0
      // 018: getfield com/finalshell/core/P42.h I
      // 01b: invokevirtual com/finalshell/core/P42.t (I)I
      // 01e: putfield com/finalshell/core/P42.V I
      // 021: astore 3
      // 022: aload 0
      // 023: bipush 1
      // 024: iload 1
      // 025: bipush 1
      // 026: isub
      // 027: ishl
      // 028: putfield com/finalshell/core/P42.W I
      // 02b: aload 0
      // 02c: aload 0
      // 02d: getfield com/finalshell/core/P42.W I
      // 030: bipush 1
      // 031: iadd
      // 032: putfield com/finalshell/core/P42.m I
      // 035: aload 0
      // 036: aload 0
      // 037: getfield com/finalshell/core/P42.W I
      // 03a: bipush 2
      // 03b: iadd
      // 03c: putfield com/finalshell/core/P42.L I
      // 03f: aload 0
      // 040: bipush 0
      // 041: putfield com/finalshell/core/P42.R I
      // 044: aload 0
      // 045: invokespecial com/finalshell/core/P42.K ()I
      // 048: istore 7
      // 04a: bipush 0
      // 04b: istore 10
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/P42.H I
      // 051: istore 4
      // 053: iload 4
      // 055: sipush 13466
      // 058: ldc2_w 8560583206025551317
      // 05b: invokestatic com/finalshell/core/P42.a (IJ)I
      // 05e: if_icmpge 079
      // 061: iinc 10 1
      // 064: iload 4
      // 066: bipush 2
      // 067: imul
      // 068: istore 4
      // 06a: aload 3
      // 06b: ifnull 087
      // 06e: aload 3
      // 06f: ifnonnull 053
      // 072: goto 079
      // 075: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 078: athrow
      // 079: sipush 14292
      // 07c: ldc2_w 713517377204412042
      // 07f: invokestatic com/finalshell/core/P42.a (IJ)I
      // 082: iload 10
      // 084: isub
      // 085: istore 10
      // 087: aload 0
      // 088: getfield com/finalshell/core/P42.H I
      // 08b: istore 9
      // 08d: aload 0
      // 08e: iload 9
      // 090: invokevirtual com/finalshell/core/P42.C (I)V
      // 093: aload 0
      // 094: aload 0
      // 095: getfield com/finalshell/core/P42.W I
      // 098: aload 2
      // 099: invokevirtual com/finalshell/core/P42.x (ILjava/io/OutputStream;)V
      // 09c: aload 0
      // 09d: invokespecial com/finalshell/core/P42.K ()I
      // 0a0: dup
      // 0a1: istore 6
      // 0a3: bipush -1
      // 0a4: if_icmpeq 1af
      // 0a7: iload 6
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/core/P42.Z I
      // 0ad: ishl
      // 0ae: iload 7
      // 0b0: iadd
      // 0b1: istore 4
      // 0b3: iload 6
      // 0b5: iload 10
      // 0b7: ishl
      // 0b8: iload 7
      // 0ba: ixor
      // 0bb: istore 5
      // 0bd: aload 0
      // 0be: aload 3
      // 0bf: ifnull 1b7
      // 0c2: getfield com/finalshell/core/P42.d [I
      // 0c5: iload 5
      // 0c7: iaload
      // 0c8: aload 3
      // 0c9: ifnull 0f3
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d2: athrow
      // 0d3: iload 4
      // 0d5: if_icmpne 0ec
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: getfield com/finalshell/core/P42.J [I
      // 0e3: iload 5
      // 0e5: iaload
      // 0e6: istore 7
      // 0e8: aload 3
      // 0e9: ifnonnull 09c
      // 0ec: aload 0
      // 0ed: getfield com/finalshell/core/P42.d [I
      // 0f0: iload 5
      // 0f2: iaload
      // 0f3: aload 3
      // 0f4: ifnull 175
      // 0f7: iflt 15b
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 100: athrow
      // 101: iload 9
      // 103: iload 5
      // 105: isub
      // 106: istore 8
      // 108: iload 5
      // 10a: aload 3
      // 10b: ifnull 123
      // 10e: ifne 11b
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 117: athrow
      // 118: bipush 1
      // 119: istore 8
      // 11b: iload 5
      // 11d: iload 8
      // 11f: isub
      // 120: dup
      // 121: istore 5
      // 123: ifge 12d
      // 126: iload 5
      // 128: iload 9
      // 12a: iadd
      // 12b: istore 5
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/P42.d [I
      // 131: iload 5
      // 133: iaload
      // 134: aload 3
      // 135: ifnull 158
      // 138: iload 4
      // 13a: if_icmpne 151
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 143: athrow
      // 144: aload 0
      // 145: getfield com/finalshell/core/P42.J [I
      // 148: iload 5
      // 14a: iaload
      // 14b: istore 7
      // 14d: aload 3
      // 14e: ifnonnull 09c
      // 151: aload 0
      // 152: getfield com/finalshell/core/P42.d [I
      // 155: iload 5
      // 157: iaload
      // 158: ifge 11b
      // 15b: aload 0
      // 15c: iload 7
      // 15e: aload 2
      // 15f: invokevirtual com/finalshell/core/P42.x (ILjava/io/OutputStream;)V
      // 162: iload 6
      // 164: istore 7
      // 166: aload 0
      // 167: aload 3
      // 168: ifnull 1a7
      // 16b: getfield com/finalshell/core/P42.L I
      // 16e: goto 175
      // 171: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 174: athrow
      // 175: aload 0
      // 176: getfield com/finalshell/core/P42.X I
      // 179: aload 3
      // 17a: ifnull 0a4
      // 17d: if_icmpge 1a6
      // 180: aload 0
      // 181: getfield com/finalshell/core/P42.J [I
      // 184: iload 5
      // 186: aload 0
      // 187: dup
      // 188: getfield com/finalshell/core/P42.L I
      // 18b: dup_x1
      // 18c: bipush 1
      // 18d: iadd
      // 18e: putfield com/finalshell/core/P42.L I
      // 191: iastore
      // 192: aload 0
      // 193: getfield com/finalshell/core/P42.d [I
      // 196: iload 5
      // 198: iload 4
      // 19a: iastore
      // 19b: aload 3
      // 19c: ifnonnull 09c
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: aload 2
      // 1a8: invokevirtual com/finalshell/core/P42.t (Ljava/io/OutputStream;)V
      // 1ab: aload 3
      // 1ac: ifnonnull 09c
      // 1af: aload 0
      // 1b0: iload 7
      // 1b2: aload 2
      // 1b3: invokevirtual com/finalshell/core/P42.x (ILjava/io/OutputStream;)V
      // 1b6: aload 0
      // 1b7: aload 0
      // 1b8: getfield com/finalshell/core/P42.m I
      // 1bb: aload 2
      // 1bc: invokevirtual com/finalshell/core/P42.x (ILjava/io/OutputStream;)V
      // 1bf: return
   }

   public void e(OutputStream var1) throws IOException {
      var1.write(this.a);
      this.z = this.g * this.x;
      this.D = 0;
      this.O(this.a + 1, var1);
      var1.write(0);
   }

   public void H(OutputStream param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Kj4.d ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnull 33
      // 09: getfield com/finalshell/core/P42.R I
      // 0c: ifle 37
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 15: athrow
      // 16: aload 1
      // 17: aload 0
      // 18: getfield com/finalshell/core/P42.R I
      // 1b: invokevirtual java/io/OutputStream.write (I)V
      // 1e: aload 1
      // 1f: aload 0
      // 20: getfield com/finalshell/core/P42.f [B
      // 23: bipush 0
      // 24: aload 0
      // 25: getfield com/finalshell/core/P42.R I
      // 28: invokevirtual java/io/OutputStream.write ([BII)V
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 32: athrow
      // 33: bipush 0
      // 34: putfield com/finalshell/core/P42.R I
      // 37: return
   }

   public final int t(int var1) {
      return (1 << var1) - 1;
   }

   public int K() {
      Ky4[] var1 = Kj4.d();
      int var10000 = this.z;
      if (var1 != null) {
         if (this.z == 0) {
            return -1;
         }

         this.z--;
         var10000 = this.S[this.D++];
      }

      int var2 = var10000;
      return var2 & a(9476, 4430856160928123988L);
   }

   public void x(int param1, OutputStream param2) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Kj4.d ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: dup
      // 005: getfield com/finalshell/core/P42.I I
      // 008: aload 0
      // 009: getfield com/finalshell/core/P42.B [I
      // 00c: aload 0
      // 00d: getfield com/finalshell/core/P42.Q I
      // 010: iaload
      // 011: iand
      // 012: putfield com/finalshell/core/P42.I I
      // 015: astore 3
      // 016: aload 0
      // 017: aload 3
      // 018: ifnull 04a
      // 01b: getfield com/finalshell/core/P42.Q I
      // 01e: ifle 042
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 027: athrow
      // 028: aload 0
      // 029: dup
      // 02a: getfield com/finalshell/core/P42.I I
      // 02d: iload 1
      // 02e: aload 0
      // 02f: getfield com/finalshell/core/P42.Q I
      // 032: ishl
      // 033: ior
      // 034: putfield com/finalshell/core/P42.I I
      // 037: aload 3
      // 038: ifnonnull 04e
      // 03b: goto 042
      // 03e: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 041: athrow
      // 042: aload 0
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 049: athrow
      // 04a: iload 1
      // 04b: putfield com/finalshell/core/P42.I I
      // 04e: aload 0
      // 04f: dup
      // 050: getfield com/finalshell/core/P42.Q I
      // 053: aload 0
      // 054: getfield com/finalshell/core/P42.h I
      // 057: iadd
      // 058: putfield com/finalshell/core/P42.Q I
      // 05b: aload 0
      // 05c: getfield com/finalshell/core/P42.Q I
      // 05f: sipush 14292
      // 062: ldc2_w 713517377204412042
      // 065: invokestatic com/finalshell/core/P42.a (IJ)I
      // 068: if_icmplt 0b2
      // 06b: aload 0
      // 06c: aload 0
      // 06d: getfield com/finalshell/core/P42.I I
      // 070: sipush 9476
      // 073: ldc2_w 4430856160928123988
      // 076: invokestatic com/finalshell/core/P42.a (IJ)I
      // 079: iand
      // 07a: i2b
      // 07b: aload 2
      // 07c: invokevirtual com/finalshell/core/P42.i (BLjava/io/OutputStream;)V
      // 07f: aload 0
      // 080: dup
      // 081: getfield com/finalshell/core/P42.I I
      // 084: sipush 14292
      // 087: ldc2_w 713517377204412042
      // 08a: invokestatic com/finalshell/core/P42.a (IJ)I
      // 08d: ishr
      // 08e: putfield com/finalshell/core/P42.I I
      // 091: aload 0
      // 092: dup
      // 093: getfield com/finalshell/core/P42.Q I
      // 096: sipush 14292
      // 099: ldc2_w 713517377204412042
      // 09c: invokestatic com/finalshell/core/P42.a (IJ)I
      // 09f: isub
      // 0a0: putfield com/finalshell/core/P42.Q I
      // 0a3: aload 3
      // 0a4: ifnull 0e1
      // 0a7: aload 3
      // 0a8: ifnonnull 05b
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield com/finalshell/core/P42.L I
      // 0b6: aload 3
      // 0b7: ifnull 0e5
      // 0ba: aload 0
      // 0bb: getfield com/finalshell/core/P42.V I
      // 0be: if_icmpgt 0e1
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield com/finalshell/core/P42.G Z
      // 0cc: aload 3
      // 0cd: ifnull 162
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d6: athrow
      // 0d7: ifeq 161
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield com/finalshell/core/P42.G Z
      // 0e5: aload 3
      // 0e6: ifnull 134
      // 0e9: ifeq 114
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 0
      // 0f5: aload 0
      // 0f6: aload 0
      // 0f7: getfield com/finalshell/core/P42.U I
      // 0fa: dup_x1
      // 0fb: putfield com/finalshell/core/P42.h I
      // 0fe: invokevirtual com/finalshell/core/P42.t (I)I
      // 101: putfield com/finalshell/core/P42.V I
      // 104: aload 0
      // 105: bipush 0
      // 106: putfield com/finalshell/core/P42.G Z
      // 109: aload 3
      // 10a: ifnonnull 161
      // 10d: goto 114
      // 110: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 113: athrow
      // 114: aload 0
      // 115: dup
      // 116: getfield com/finalshell/core/P42.h I
      // 119: bipush 1
      // 11a: iadd
      // 11b: putfield com/finalshell/core/P42.h I
      // 11e: aload 0
      // 11f: aload 3
      // 120: ifnull 156
      // 123: goto 12a
      // 126: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 129: athrow
      // 12a: getfield com/finalshell/core/P42.h I
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 133: athrow
      // 134: aload 0
      // 135: getfield com/finalshell/core/P42.Z I
      // 138: if_icmpne 14e
      // 13b: aload 0
      // 13c: aload 0
      // 13d: getfield com/finalshell/core/P42.X I
      // 140: putfield com/finalshell/core/P42.V I
      // 143: aload 3
      // 144: ifnonnull 161
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14d: athrow
      // 14e: aload 0
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 155: athrow
      // 156: aload 0
      // 157: aload 0
      // 158: getfield com/finalshell/core/P42.h I
      // 15b: invokevirtual com/finalshell/core/P42.t (I)I
      // 15e: putfield com/finalshell/core/P42.V I
      // 161: iload 1
      // 162: aload 3
      // 163: ifnull 17f
      // 166: aload 0
      // 167: getfield com/finalshell/core/P42.m I
      // 16a: if_icmpne 1d5
      // 16d: goto 174
      // 170: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 173: athrow
      // 174: aload 0
      // 175: getfield com/finalshell/core/P42.Q I
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 17e: athrow
      // 17f: ifle 1d0
      // 182: aload 0
      // 183: aload 0
      // 184: getfield com/finalshell/core/P42.I I
      // 187: sipush 9476
      // 18a: ldc2_w 4430856160928123988
      // 18d: invokestatic com/finalshell/core/P42.a (IJ)I
      // 190: iand
      // 191: i2b
      // 192: aload 2
      // 193: invokevirtual com/finalshell/core/P42.i (BLjava/io/OutputStream;)V
      // 196: aload 0
      // 197: dup
      // 198: getfield com/finalshell/core/P42.I I
      // 19b: sipush 14292
      // 19e: ldc2_w 713517377204412042
      // 1a1: invokestatic com/finalshell/core/P42.a (IJ)I
      // 1a4: ishr
      // 1a5: putfield com/finalshell/core/P42.I I
      // 1a8: aload 0
      // 1a9: dup
      // 1aa: getfield com/finalshell/core/P42.Q I
      // 1ad: sipush 14292
      // 1b0: ldc2_w 713517377204412042
      // 1b3: invokestatic com/finalshell/core/P42.a (IJ)I
      // 1b6: isub
      // 1b7: putfield com/finalshell/core/P42.Q I
      // 1ba: aload 3
      // 1bb: ifnull 1d5
      // 1be: goto 1c5
      // 1c1: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c4: athrow
      // 1c5: aload 3
      // 1c6: ifnonnull 174
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/P42.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: aload 2
      // 1d2: invokevirtual com/finalshell/core/P42.H (Ljava/io/OutputStream;)V
      // 1d5: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26973;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5875077809874358961L;
      long[] var6 = new long[35];
      int var3 = 0;
      String var4 = "Z\u007f?é8èJû.~\u00adC\u009d\u001brS}P¿\"(ê\u0092>òÞ\u008d\\Ì\u0001\f3Ðe©\u0010\u0095Ì®´\u0092,\b\u0089)£µ\u0017àµ·\u0015,\fìà\u009e\u00ad/B\u0011üÚã\u0007È\b²ö$\u00148\u0088í\u0088:/©\fA!\u0093F\u009f\u0085t7/ì~\u009c¥\u0016`7¬ÌzÃ\u008bÛ\\ \u0080É\u000f²\u008b\u001f¯\u009e\u001a\t\n\u001443Ê4>7ÛS\u001b\u0080G\u0088kWdUý\u0092\u0082j\u008bDÌ²Ì&h×_õ\u0007Ãg\u0014\u0005\u008fdr½ÎÖQb\u0095XÉÂò\u009b«Íþ\u008cYãd\u009c\r\u0002b]<\u0087\u009e|6è\u00ad[ Ä»ªQ\u0093*K\u0082ì®~B|x'æ§\u0014Û^\u0091\u0090¼ª\u0006®\u009b\u000b£ani{KUÅÕüÌGÁÚáÕióZ\u000bí\u0017\u0089·QW{,\u009a\u00adoÇ!\u0095ÒO\u0097çl\u009c<Ì¿:\u0085 T×CVK";
      int var5 = "Z\u007f?é8èJû.~\u00adC\u009d\u001brS}P¿\"(ê\u0092>òÞ\u008d\\Ì\u0001\f3Ðe©\u0010\u0095Ì®´\u0092,\b\u0089)£µ\u0017àµ·\u0015,\fìà\u009e\u00ad/B\u0011üÚã\u0007È\b²ö$\u00148\u0088í\u0088:/©\fA!\u0093F\u009f\u0085t7/ì~\u009c¥\u0016`7¬ÌzÃ\u008bÛ\\ \u0080É\u000f²\u008b\u001f¯\u009e\u001a\t\n\u001443Ê4>7ÛS\u001b\u0080G\u0088kWdUý\u0092\u0082j\u008bDÌ²Ì&h×_õ\u0007Ãg\u0014\u0005\u008fdr½ÎÖQb\u0095XÉÂò\u009b«Íþ\u008cYãd\u009c\r\u0002b]<\u0087\u009e|6è\u00ad[ Ä»ªQ\u0093*K\u0082ì®~B|x'æ§\u0014Û^\u0091\u0090¼ª\u0006®\u009b\u000b£ani{KUÅÕüÌGÁÚáÕióZ\u000bí\u0017\u0089·QW{,\u009a\u00adoÇ!\u0095ÒO\u0097çl\u009c<Ì¿:\u0085 T×CVK"
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
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     b = var6;
                     c = new Integer[35];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\"Øïpë\\v7øF°=\u0007@\tÅ";
                  var5 = "\"Øïpë\\v7øF°=\u0007@\tÅ".length();
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
}





