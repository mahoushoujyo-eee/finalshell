package com.finalshell.io;

import com.finalshell.core.Dm4;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Gu2 extends PipedInputStream {
   public int q;
   public int r;
   public static long[] a;
   public static Integer[] b;

   public Gu2() throws IOException {
      this.q = a(1994, 105303827313998873L);
      this.r = this.q;
   }

   public Gu2(int var1) throws IOException {
      this.q = a(1994, 105303827313998873L);
      this.r = this.q;
      this.buffer = new byte[var1];
      this.q = var1;
      this.r = var1;
   }

   public Gu2(int var1, int var2) throws IOException {
      this(var1);
      this.r = var2;
   }

   public Gu2(PipedOutputStream var1) throws IOException {
      super(var1);
      this.q = a(1701, 1369861003029101943L);
      this.r = this.q;
   }

   public Gu2(PipedOutputStream var1, int var2) throws IOException {
      super(var1);
      this.q = a(1994, 105303827313998873L);
      this.r = this.q;
      this.buffer = new byte[var2];
      this.q = var2;
   }

   public synchronized void w() throws IOException {
      boolean var1 = Dm4.J$boolean();

      try {
         int var10000 = this.available();
         if (var1) {
            return;
         }

         if (var10000 != 0) {
            return;
         }
      } catch (IOException var2) {
         throw a(var2);
      }

      this.in = 0;
      this.out = 0;
      this.buffer[this.in++] = 0;
      this.read();
   }

   public int e() {
      int var10000 = (Dm4.J$boolean()) ? 1 : 0;
      int var2 = 0;
      boolean var1 = (var10000) != 0;
      var10000 = this.out;
      int var10001 = this.in;
      if (!var1) {
         if (this.out < this.in) {
            var2 = this.buffer.length - this.in;
            if (!var1) {
               return var2;
            }
         }

         var10000 = this.in;
         if (var1) {
            return this.in;
         }

         var10001 = this.out;
      }

      if (var10000 < var10001) {
         var10000 = this.in;
         var10001 = -1;
         if (!var1) {
            if (this.in == -1) {
               var2 = this.buffer.length;
               if (!var1) {
                  return var2;
               }
            }

            var10000 = this.out;
            var10001 = this.in;
         }

         var2 = var10000 - var10001;
      }

      return var2;
   }

   public synchronized void r(int param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 003: aload 0
      // 004: invokespecial com/finalshell/io/Gu2.e ()I
      // 007: istore 3
      // 008: istore 2
      // 009: iload 3
      // 00a: iload 1
      // 00b: iload 2
      // 00c: ifeq 189
      // 00f: if_icmpge 17c
      // 012: goto 019
      // 015: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield com/finalshell/io/Gu2.buffer [B
      // 01d: arraylength
      // 01e: iload 3
      // 01f: isub
      // 020: istore 4
      // 022: aload 0
      // 023: getfield com/finalshell/io/Gu2.buffer [B
      // 026: arraylength
      // 027: istore 5
      // 029: iload 5
      // 02b: iload 4
      // 02d: isub
      // 02e: iload 1
      // 02f: if_icmpge 047
      // 032: iload 5
      // 034: bipush 2
      // 035: imul
      // 036: istore 5
      // 038: iload 2
      // 039: ifeq 061
      // 03c: iload 2
      // 03d: ifne 029
      // 040: goto 047
      // 043: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 046: athrow
      // 047: iload 5
      // 049: aload 0
      // 04a: getfield com/finalshell/io/Gu2.r I
      // 04d: iload 2
      // 04e: ifeq 072
      // 051: if_icmple 061
      // 054: goto 05b
      // 057: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 05a: athrow
      // 05b: aload 0
      // 05c: getfield com/finalshell/io/Gu2.r I
      // 05f: istore 5
      // 061: iload 5
      // 063: iload 4
      // 065: isub
      // 066: iload 2
      // 067: ifeq 078
      // 06a: iload 1
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 071: athrow
      // 072: if_icmpge 076
      // 075: return
      // 076: iload 5
      // 078: newarray 8
      // 07a: astore 6
      // 07c: aload 0
      // 07d: getfield com/finalshell/io/Gu2.out I
      // 080: aload 0
      // 081: getfield com/finalshell/io/Gu2.in I
      // 084: iload 2
      // 085: ifeq 0bc
      // 088: if_icmpge 0ad
      // 08b: goto 092
      // 08e: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 091: athrow
      // 092: aload 0
      // 093: getfield com/finalshell/io/Gu2.buffer [B
      // 096: bipush 0
      // 097: aload 6
      // 099: bipush 0
      // 09a: aload 0
      // 09b: getfield com/finalshell/io/Gu2.buffer [B
      // 09e: arraylength
      // 09f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a2: iload 2
      // 0a3: ifne 172
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield com/finalshell/io/Gu2.in I
      // 0b1: aload 0
      // 0b2: getfield com/finalshell/io/Gu2.out I
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0bb: athrow
      // 0bc: iload 2
      // 0bd: ifeq 14f
      // 0c0: if_icmpge 135
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: iload 2
      // 0cc: ifeq 120
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0d5: athrow
      // 0d6: getfield com/finalshell/io/Gu2.in I
      // 0d9: bipush -1
      // 0da: if_icmpne 0eb
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0e3: athrow
      // 0e4: goto 172
      // 0e7: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield com/finalshell/io/Gu2.buffer [B
      // 0ef: bipush 0
      // 0f0: aload 6
      // 0f2: bipush 0
      // 0f3: aload 0
      // 0f4: getfield com/finalshell/io/Gu2.in I
      // 0f7: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0fa: aload 0
      // 0fb: getfield com/finalshell/io/Gu2.buffer [B
      // 0fe: aload 0
      // 0ff: getfield com/finalshell/io/Gu2.out I
      // 102: aload 6
      // 104: aload 6
      // 106: arraylength
      // 107: aload 0
      // 108: getfield com/finalshell/io/Gu2.buffer [B
      // 10b: arraylength
      // 10c: aload 0
      // 10d: getfield com/finalshell/io/Gu2.out I
      // 110: isub
      // 111: isub
      // 112: aload 0
      // 113: getfield com/finalshell/io/Gu2.buffer [B
      // 116: arraylength
      // 117: aload 0
      // 118: getfield com/finalshell/io/Gu2.out I
      // 11b: isub
      // 11c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 11f: aload 0
      // 120: aload 6
      // 122: arraylength
      // 123: aload 0
      // 124: getfield com/finalshell/io/Gu2.buffer [B
      // 127: arraylength
      // 128: aload 0
      // 129: getfield com/finalshell/io/Gu2.out I
      // 12c: isub
      // 12d: isub
      // 12e: putfield com/finalshell/io/Gu2.out I
      // 131: iload 2
      // 132: ifne 172
      // 135: aload 0
      // 136: iload 2
      // 137: ifeq 173
      // 13a: goto 141
      // 13d: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 140: athrow
      // 141: getfield com/finalshell/io/Gu2.in I
      // 144: aload 0
      // 145: getfield com/finalshell/io/Gu2.out I
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 14e: athrow
      // 14f: if_icmpne 172
      // 152: aload 0
      // 153: getfield com/finalshell/io/Gu2.buffer [B
      // 156: bipush 0
      // 157: aload 6
      // 159: bipush 0
      // 15a: aload 0
      // 15b: getfield com/finalshell/io/Gu2.buffer [B
      // 15e: arraylength
      // 15f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 162: aload 0
      // 163: aload 0
      // 164: getfield com/finalshell/io/Gu2.buffer [B
      // 167: arraylength
      // 168: putfield com/finalshell/io/Gu2.in I
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 171: athrow
      // 172: aload 0
      // 173: aload 6
      // 175: putfield com/finalshell/io/Gu2.buffer [B
      // 178: iload 2
      // 179: ifne 1e3
      // 17c: aload 0
      // 17d: getfield com/finalshell/io/Gu2.buffer [B
      // 180: arraylength
      // 181: iload 3
      // 182: goto 189
      // 185: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 188: athrow
      // 189: iload 2
      // 18a: ifeq 1a3
      // 18d: if_icmpne 1e3
      // 190: goto 197
      // 193: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 196: athrow
      // 197: iload 3
      // 198: aload 0
      // 199: getfield com/finalshell/io/Gu2.q I
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a2: athrow
      // 1a3: iload 2
      // 1a4: ifeq 1ba
      // 1a7: if_icmple 1e3
      // 1aa: goto 1b1
      // 1ad: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b0: athrow
      // 1b1: iload 3
      // 1b2: bipush 2
      // 1b3: goto 1ba
      // 1b6: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1b9: athrow
      // 1ba: idiv
      // 1bb: istore 4
      // 1bd: iload 4
      // 1bf: iload 2
      // 1c0: ifeq 1d9
      // 1c3: aload 0
      // 1c4: getfield com/finalshell/io/Gu2.q I
      // 1c7: if_icmpge 1d7
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/io/Gu2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: getfield com/finalshell/io/Gu2.q I
      // 1d5: istore 4
      // 1d7: iload 4
      // 1d9: newarray 8
      // 1db: astore 5
      // 1dd: aload 0
      // 1de: aload 5
      // 1e0: putfield com/finalshell/io/Gu2.buffer [B
      // 1e3: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15314;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5001779090725853855L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0018\u0095y¤\u0016\u0085cèçßÀ®ÿ:â\u0086";
      int var5 = "\u0018\u0095y¤\u0016\u0085cèçßÀ®ÿ:â\u0086".length();
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
}





