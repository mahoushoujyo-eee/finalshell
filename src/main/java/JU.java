import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class JU {
   private String W = a(-27349, -10718);
   private String c;
   private String Q;
   private long z;
   private int S;
   private int u;
   private long d;
   private long h;
   private long H;
   private long q;
   private long P;
   private long p;
   private long t;
   private long D;
   private RandomAccessFile J;
   private byte[] Z;
   private static final String[] a;
   private static final String[] b;
   private static final long[] e;
   private static final Integer[] f;
   private static final long[] g;
   private static final Long[] i;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private long K(byte[] var1) {
      String[] var10000 = QI.N();
      long var3 = 0L;
      String[] var2 = var10000;
      int var5 = 0;
      long var9;
      if (var2 == null) {
         var9 = 1L;
      } else if (var5 >= var1.length) {
         var9 = var3;
         if (var2 != null) {
            return var3;
         }
      } else {
         var9 = 1L;
      }

      while (true) {
         long var6 = var9;
         int var8 = 0;
         if (var2 == null) {
            var6 *= b(20967, 2056173557039323437L);
            var8++;
         }

         while (true) {
            while (var8 < var5) {
               var6 *= b(20967, 2056173557039323437L);
               var8++;
            }

            if (var2 != null) {
               var3 += (long)(var2 != null ? (var1[var5] < 0 ? a(23616, 5326862907161902554L) + var1[var5] : var1[var5]) : var1[var5]) * var6;
               if (++var5 >= var1.length) {
                  var9 = var3;
                  if (var2 != null) {
                     return var3;
                  }
               } else {
                  var9 = 1L;
               }
               break;
            }

            var6 = var3;
            var8++;
         }
      }
   }

   private long A(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: sipush -27351
      // 04: sipush -30150
      // 07: invokestatic JU.a (II)Ljava/lang/String;
      // 0a: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 0d: astore 3
      // 0e: lconst_0
      // 0f: lstore 4
      // 11: invokestatic QI.N ()[Ljava/lang/String;
      // 14: bipush 0
      // 15: istore 6
      // 17: astore 2
      // 18: aload 2
      // 19: ifnonnull 6b
      // 1c: lconst_1
      // 1d: goto 24
      // 20: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: lstore 7
      // 26: bipush 0
      // 27: istore 9
      // 29: aload 2
      // 2a: ifnonnull 3e
      // 2d: lload 7
      // 2f: sipush 19834
      // 32: ldc2_w 5372736604183938488
      // 35: invokestatic JU.b (IJ)J
      // 38: lmul
      // 39: lstore 7
      // 3b: iinc 9 1
      // 3e: iload 9
      // 40: iload 6
      // 42: if_icmplt 2d
      // 45: lload 4
      // 47: aload 3
      // 48: aload 3
      // 49: arraylength
      // 4a: iload 6
      // 4c: isub
      // 4d: bipush 1
      // 4e: isub
      // 4f: aaload
      // 50: invokestatic java/lang/Long.parseLong (Ljava/lang/String;)J
      // 53: lload 7
      // 55: lmul
      // 56: ladd
      // 57: lstore 4
      // 59: aload 2
      // 5a: ifnull 3b
      // 5d: goto 68
      // 60: astore 9
      // 62: lload 4
      // 64: lconst_0
      // 65: ladd
      // 66: lstore 4
      // 68: iinc 6 1
      // 6b: iload 6
      // 6d: aload 3
      // 6e: arraylength
      // 6f: if_icmplt 1c
      // 72: lload 4
      // 74: aload 2
      // 75: ifnull 24
      // 78: lreturn
   }

   public void i(String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: aload 1
      // 003: invokespecial JU.A (Ljava/lang/String;)J
      // 006: putfield JU.z J
      // 009: invokestatic QI.N ()[Ljava/lang/String;
      // 00c: aload 0
      // 00d: new java/io/RandomAccessFile
      // 010: dup
      // 011: aload 0
      // 012: getfield JU.W Ljava/lang/String;
      // 015: ldc "r"
      // 017: invokespecial java/io/RandomAccessFile.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 01a: putfield JU.J Ljava/io/RandomAccessFile;
      // 01d: astore 2
      // 01e: aload 0
      // 01f: bipush 4
      // 020: newarray 8
      // 022: putfield JU.Z [B
      // 025: aload 0
      // 026: getfield JU.J Ljava/io/RandomAccessFile;
      // 029: lconst_0
      // 02a: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 02d: aload 0
      // 02e: getfield JU.J Ljava/io/RandomAccessFile;
      // 031: aload 0
      // 032: getfield JU.Z [B
      // 035: invokevirtual java/io/RandomAccessFile.read ([B)I
      // 038: pop
      // 039: aload 0
      // 03a: aload 0
      // 03b: aload 0
      // 03c: getfield JU.Z [B
      // 03f: invokespecial JU.K ([B)J
      // 042: putfield JU.p J
      // 045: aload 0
      // 046: getfield JU.J Ljava/io/RandomAccessFile;
      // 049: aload 0
      // 04a: getfield JU.Z [B
      // 04d: invokevirtual java/io/RandomAccessFile.read ([B)I
      // 050: pop
      // 051: aload 0
      // 052: aload 0
      // 053: aload 0
      // 054: getfield JU.Z [B
      // 057: invokespecial JU.K ([B)J
      // 05a: putfield JU.t J
      // 05d: aload 0
      // 05e: aload 0
      // 05f: getfield JU.t J
      // 062: aload 0
      // 063: getfield JU.p J
      // 066: lsub
      // 067: sipush 2819
      // 06a: ldc2_w 6159728159312511936
      // 06d: invokestatic JU.b (IJ)J
      // 070: ldiv
      // 071: l2i
      // 072: putfield JU.S I
      // 075: aload 0
      // 076: aload 2
      // 077: ifnull 0ac
      // 07a: getfield JU.S I
      // 07d: bipush 1
      // 07e: if_icmpgt 0a6
      // 081: goto 088
      // 084: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: aload 0
      // 089: aload 0
      // 08a: sipush -27346
      // 08d: sipush 14127
      // 090: invokestatic JU.a (II)Ljava/lang/String;
      // 093: dup_x1
      // 094: putfield JU.c Ljava/lang/String;
      // 097: putfield JU.Q Ljava/lang/String;
      // 09a: new java/lang/Exception
      // 09d: dup
      // 09e: invokespecial java/lang/Exception.<init> ()V
      // 0a1: athrow
      // 0a2: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: lconst_0
      // 0a8: putfield JU.h J
      // 0ab: aload 0
      // 0ac: aload 0
      // 0ad: getfield JU.S I
      // 0b0: i2l
      // 0b1: putfield JU.d J
      // 0b4: aload 0
      // 0b5: getfield JU.h J
      // 0b8: aload 0
      // 0b9: getfield JU.d J
      // 0bc: ladd
      // 0bd: sipush 6865
      // 0c0: ldc2_w 5806973823154033174
      // 0c3: invokestatic JU.b (IJ)J
      // 0c6: ldiv
      // 0c7: lstore 3
      // 0c8: aload 0
      // 0c9: lload 3
      // 0ca: invokespecial JU.g (J)J
      // 0cd: pop2
      // 0ce: aload 0
      // 0cf: getfield JU.z J
      // 0d2: aload 0
      // 0d3: getfield JU.q J
      // 0d6: lcmp
      // 0d7: ifne 0e3
      // 0da: aload 0
      // 0db: lload 3
      // 0dc: putfield JU.h J
      // 0df: aload 2
      // 0e0: ifnonnull 124
      // 0e3: aload 0
      // 0e4: aload 2
      // 0e5: ifnull 112
      // 0e8: getfield JU.z J
      // 0eb: aload 0
      // 0ec: getfield JU.q J
      // 0ef: lcmp
      // 0f0: ifle 10a
      // 0f3: goto 0fa
      // 0f6: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: lload 3
      // 0fc: putfield JU.h J
      // 0ff: aload 2
      // 100: ifnonnull 116
      // 103: goto 10a
      // 106: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: aload 0
      // 10b: goto 112
      // 10e: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: lload 3
      // 113: putfield JU.d J
      // 116: aload 0
      // 117: getfield JU.h J
      // 11a: aload 0
      // 11b: getfield JU.d J
      // 11e: lconst_1
      // 11f: lsub
      // 120: lcmp
      // 121: iflt 0b4
      // 124: aload 0
      // 125: aload 0
      // 126: getfield JU.h J
      // 129: invokespecial JU.g (J)J
      // 12c: pop2
      // 12d: aload 0
      // 12e: invokespecial JU.g ()J
      // 131: pop2
      // 132: aload 0
      // 133: aload 0
      // 134: getfield JU.z J
      // 137: invokespecial JU.A (J)V
      // 13a: aload 0
      // 13b: getfield JU.J Ljava/io/RandomAccessFile;
      // 13e: invokevirtual java/io/RandomAccessFile.close ()V
      // 141: aload 2
      // 142: ifnull 0df
      // 145: return
   }

   private String U(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic QI.N ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 4
      // 06: astore 3
      // 07: aload 0
      // 08: getfield JU.J Ljava/io/RandomAccessFile;
      // 0b: lload 1
      // 0c: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 0f: aload 0
      // 10: bipush 1
      // 11: newarray 8
      // 13: putfield JU.Z [B
      // 16: aload 0
      // 17: getfield JU.J Ljava/io/RandomAccessFile;
      // 1a: aload 0
      // 1b: getfield JU.Z [B
      // 1e: invokevirtual java/io/RandomAccessFile.read ([B)I
      // 21: pop
      // 22: aload 0
      // 23: getfield JU.Z [B
      // 26: bipush 0
      // 27: baload
      // 28: ifge 46
      // 2b: sipush 13268
      // 2e: ldc2_w 5041556145516810828
      // 31: invokestatic JU.a (IJ)I
      // 34: aload 0
      // 35: getfield JU.Z [B
      // 38: bipush 0
      // 39: baload
      // 3a: iadd
      // 3b: aload 3
      // 3c: ifnull 50
      // 3f: goto 4c
      // 42: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 0
      // 47: getfield JU.Z [B
      // 4a: bipush 0
      // 4b: baload
      // 4c: istore 4
      // 4e: iload 4
      // 50: bipush 1
      // 51: aload 3
      // 52: ifnull 9f
      // 55: if_icmpeq 77
      // 58: goto 5f
      // 5b: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: iload 4
      // 61: aload 3
      // 62: ifnull dd
      // 65: goto 6c
      // 68: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: bipush 2
      // 6d: if_icmpne d2
      // 70: goto 77
      // 73: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aload 0
      // 78: bipush 3
      // 79: newarray 8
      // 7b: putfield JU.Z [B
      // 7e: aload 0
      // 7f: getfield JU.J Ljava/io/RandomAccessFile;
      // 82: aload 0
      // 83: getfield JU.Z [B
      // 86: invokevirtual java/io/RandomAccessFile.read ([B)I
      // 89: pop
      // 8a: aload 3
      // 8b: ifnull ce
      // 8e: goto 95
      // 91: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94: athrow
      // 95: iload 4
      // 97: bipush 2
      // 98: goto 9f
      // 9b: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: if_icmpne c5
      // a2: aload 0
      // a3: sipush 757
      // a6: ldc2_w 6571048245440553836
      // a9: invokestatic JU.a (IJ)I
      // ac: putfield JU.u I
      // af: aload 0
      // b0: lload 1
      // b1: sipush 17333
      // b4: ldc2_w 798059639594961780
      // b7: invokestatic JU.b (IJ)J
      // ba: lsub
      // bb: putfield JU.D J
      // be: goto c5
      // c1: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c4: athrow
      // c5: aload 0
      // c6: aload 0
      // c7: getfield JU.Z [B
      // ca: invokespecial JU.K ([B)J
      // cd: lstore 1
      // ce: aload 3
      // cf: ifnonnull 07
      // d2: lload 1
      // d3: sipush 16455
      // d6: ldc2_w 6349168546533886092
      // d9: invokestatic JU.b (IJ)J
      // dc: lcmp
      // dd: ifge e7
      // e0: ldc ""
      // e2: areturn
      // e3: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e6: athrow
      // e7: aload 0
      // e8: getfield JU.J Ljava/io/RandomAccessFile;
      // eb: lload 1
      // ec: invokevirtual java/io/RandomAccessFile.seek (J)V
      // ef: aload 0
      // f0: invokespecial JU.I ()Ljava/lang/String;
      // f3: areturn
   }

   private String I() throws IOException {
      long var1 = this.J.length();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      byte var4 = this.J.readByte();

      do {
         var3.write(var4);
         var4 = this.J.readByte();
      } while (var4 != 0 && this.J.getFilePointer() < var1);

      return var3.toString();
   }

   private void A(long param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic QI.N ()[Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: getfield JU.u I
      // 008: bipush 1
      // 009: aload 3
      // 00a: ifnull 05e
      // 00d: if_icmpeq 031
      // 010: goto 017
      // 013: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: aload 3
      // 019: ifnull 134
      // 01c: goto 023
      // 01f: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: getfield JU.u I
      // 026: bipush 2
      // 027: if_icmpne 116
      // 02a: goto 031
      // 02d: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 0
      // 032: aload 0
      // 033: aload 0
      // 034: getfield JU.D J
      // 037: sipush 24130
      // 03a: ldc2_w 2046877826402440838
      // 03d: invokestatic JU.b (IJ)J
      // 040: ladd
      // 041: invokespecial JU.U (J)Ljava/lang/String;
      // 044: putfield JU.c Ljava/lang/String;
      // 047: aload 0
      // 048: aload 3
      // 049: ifnull 0fd
      // 04c: goto 053
      // 04f: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: getfield JU.u I
      // 056: bipush 1
      // 057: goto 05e
      // 05a: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: if_icmpne 0f5
      // 061: aload 0
      // 062: aload 0
      // 063: aload 0
      // 064: getfield JU.J Ljava/io/RandomAccessFile;
      // 067: invokevirtual java/io/RandomAccessFile.getFilePointer ()J
      // 06a: invokespecial JU.U (J)Ljava/lang/String;
      // 06d: putfield JU.Q Ljava/lang/String;
      // 070: aload 0
      // 071: getfield JU.z J
      // 074: aload 0
      // 075: sipush -27352
      // 078: sipush -26383
      // 07b: invokestatic JU.a (II)Ljava/lang/String;
      // 07e: invokespecial JU.A (Ljava/lang/String;)J
      // 081: lcmp
      // 082: aload 3
      // 083: ifnull 0bb
      // 086: goto 08d
      // 089: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: iflt 142
      // 090: goto 097
      // 093: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 0
      // 098: aload 3
      // 099: ifnull 0dc
      // 09c: goto 0a3
      // 09f: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a2: athrow
      // 0a3: getfield JU.z J
      // 0a6: aload 0
      // 0a7: sipush -27345
      // 0aa: sipush -7202
      // 0ad: invokestatic JU.a (II)Ljava/lang/String;
      // 0b0: invokespecial JU.A (Ljava/lang/String;)J
      // 0b3: lcmp
      // 0b4: goto 0bb
      // 0b7: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: ifgt 142
      // 0be: aload 0
      // 0bf: aload 0
      // 0c0: aload 0
      // 0c1: getfield JU.D J
      // 0c4: sipush 14610
      // 0c7: ldc2_w 5607223311547937234
      // 0ca: invokestatic JU.b (IJ)J
      // 0cd: ladd
      // 0ce: invokespecial JU.U (J)Ljava/lang/String;
      // 0d1: putfield JU.Q Ljava/lang/String;
      // 0d4: aload 0
      // 0d5: goto 0dc
      // 0d8: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: aload 0
      // 0de: getfield JU.D J
      // 0e1: sipush 10878
      // 0e4: ldc2_w 2614362255680316091
      // 0e7: invokestatic JU.b (IJ)J
      // 0ea: ladd
      // 0eb: invokespecial JU.U (J)Ljava/lang/String;
      // 0ee: putfield JU.c Ljava/lang/String;
      // 0f1: aload 3
      // 0f2: ifnonnull 142
      // 0f5: aload 0
      // 0f6: goto 0fd
      // 0f9: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: aload 0
      // 0ff: getfield JU.D J
      // 102: sipush 23505
      // 105: ldc2_w 5927161472955568921
      // 108: invokestatic JU.b (IJ)J
      // 10b: ladd
      // 10c: invokespecial JU.U (J)Ljava/lang/String;
      // 10f: putfield JU.Q Ljava/lang/String;
      // 112: aload 3
      // 113: ifnonnull 142
      // 116: aload 0
      // 117: aload 0
      // 118: aload 0
      // 119: getfield JU.D J
      // 11c: sipush 24130
      // 11f: ldc2_w 2046877826402440838
      // 122: invokestatic JU.b (IJ)J
      // 125: ladd
      // 126: invokespecial JU.U (J)Ljava/lang/String;
      // 129: putfield JU.c Ljava/lang/String;
      // 12c: aload 0
      // 12d: goto 134
      // 130: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: aload 0
      // 135: aload 0
      // 136: getfield JU.J Ljava/io/RandomAccessFile;
      // 139: invokevirtual java/io/RandomAccessFile.getFilePointer ()J
      // 13c: invokespecial JU.U (J)Ljava/lang/String;
      // 13f: putfield JU.Q Ljava/lang/String;
      // 142: return
   }

   private long g() throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield JU.J Ljava/io/RandomAccessFile;
      // 04: aload 0
      // 05: getfield JU.D J
      // 08: invokevirtual java/io/RandomAccessFile.seek (J)V
      // 0b: invokestatic QI.N ()[Ljava/lang/String;
      // 0e: aload 0
      // 0f: bipush 4
      // 10: newarray 8
      // 12: putfield JU.Z [B
      // 15: astore 1
      // 16: aload 0
      // 17: getfield JU.J Ljava/io/RandomAccessFile;
      // 1a: aload 0
      // 1b: getfield JU.Z [B
      // 1e: invokevirtual java/io/RandomAccessFile.read ([B)I
      // 21: pop
      // 22: aload 0
      // 23: aload 0
      // 24: aload 0
      // 25: getfield JU.Z [B
      // 28: invokespecial JU.K ([B)J
      // 2b: putfield JU.P J
      // 2e: aload 0
      // 2f: bipush 1
      // 30: newarray 8
      // 32: putfield JU.Z [B
      // 35: aload 0
      // 36: getfield JU.J Ljava/io/RandomAccessFile;
      // 39: aload 0
      // 3a: getfield JU.Z [B
      // 3d: invokevirtual java/io/RandomAccessFile.read ([B)I
      // 40: pop
      // 41: aload 0
      // 42: aload 0
      // 43: getfield JU.Z [B
      // 46: bipush 0
      // 47: aload 1
      // 48: ifnull 72
      // 4b: baload
      // 4c: ifge 6d
      // 4f: goto 56
      // 52: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: sipush 23616
      // 59: ldc2_w 5326862907161902554
      // 5c: invokestatic JU.a (IJ)I
      // 5f: aload 0
      // 60: getfield JU.Z [B
      // 63: bipush 0
      // 64: baload
      // 65: iadd
      // 66: goto 73
      // 69: invokestatic JU.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield JU.Z [B
      // 71: bipush 0
      // 72: baload
      // 73: putfield JU.u I
      // 76: aload 0
      // 77: getfield JU.P J
      // 7a: lreturn
   }

   private long g(long var1) throws IOException {
      this.H = this.p + var1 * b(31050, 8545736823142838668L);
      this.J.seek(this.H);
      this.Z = new byte[4];
      this.J.read(this.Z);
      this.q = this.K(this.Z);
      this.Z = new byte[3];
      this.J.read(this.Z);
      this.D = this.K(this.Z);
      return this.q;
   }

   public String o() {
      return this.Q;
   }

   public String a() {
      return this.c;
   }

   public void x(String var1) {
      this.W = var1;
   }

   public static void main(String[] var0) throws Exception {
      JU var1 = new JU();
      var1.i(a(-27350, -2686));
      Jy_2.g(var1.a() + " " + var1.o());
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[6];
      int var19 = 0;
      String var18 = "ì4)¨\u0018ÀßA0\u000e\u007f\u0083V)R8§í\u0000ü¾\u0083Í\u0091\u0002øV\rÞÞ\u0006e¼µ\u0018ØÑYxKk";
      int var20 = "ì4)¨\u0018ÀßA0\u000e\u007f\u0083V)R8§í\u0000ü¾\u0083Í\u0091\u0002øV\rÞÞ\u0006e¼µ\u0018ØÑYxKk".length();
      char var17 = '\t';
      int var25 = -1;

      label80:
      while (true) {
         byte var10000 = 67;
         String var10001 = var18.substring(++var25, var25 + var17);
         byte var10002 = -1;

         while (true) {
            label75: {
               char[] var49 = var10001.toCharArray();
               int var10004 = var49.length;
               int var22 = 0;
               byte var52 = var10000;
               var43 = var49;
               int var32 = var10004;
               byte var60;
               char[] var67;
               int var10006;
               if (var10004 <= 1) {
                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               } else {
                  var52 = var10000;
                  var32 = var10004;
                  if (var10004 <= var22) {
                     break label75;
                  }

                  var67 = var49;
                  var60 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var76 = var67[var10006];
                  byte var77;
                  switch (var22 % 7) {
                     case 0:
                        var77 = 93;
                        break;
                     case 1:
                        var77 = 49;
                        break;
                     case 2:
                        var77 = 28;
                        break;
                     case 3:
                        var77 = 14;
                        break;
                     case 4:
                        var77 = 117;
                        break;
                     case 5:
                        var77 = 45;
                        break;
                     default:
                        var77 = 75;
                  }

                  var67[var10006] = (char)(var76 ^ var60 ^ var77);
                  var22++;
                  if (var52 == 0) {
                     var10006 = var52;
                     var67 = var43;
                     var60 = var52;
                  } else {
                     if (var32 <= var22) {
                        break;
                     }

                     var67 = var43;
                     var60 = var52;
                     var10006 = var22;
                  }
               }
            }

            String var54 = new String(var43).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var54;
                  if ((var25 += var17) >= var20) {
                     a = var21;
                     b = new String[6];
                     long var8 = 8070760161456388995L;
                     long[] var14 = new long[3];
                     int var11 = 0;
                     String var12 = "ï?+nJLèÏ\tçÙâ]\u008bXí\u0085\u0019ï¯~m\u0087Y";
                     int var13 = "ï?+nJLèÏ\tçÙâ]\u008bXí\u0085\u0019ï¯~m\u0087Y".length();
                     byte var10 = 0;

                     do {
                        byte var34 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var34, var10).getBytes("ISO-8859-1");
                        int var35 = var11++;
                        long var64 = (
                              ((long)var15[0] & 255L) << 56
                                 | ((long)var15[1] & 255L) << 48
                                 | ((long)var15[2] & 255L) << 40
                                 | ((long)var15[3] & 255L) << 32
                                 | ((long)var15[4] & 255L) << 24
                                 | ((long)var15[5] & 255L) << 16
                                 | ((long)var15[6] & 255L) << 8
                                 | (long)var15[7] & 255L
                           )
                           ^ var8;
                        byte var55 = -1;
                        var14[var35] = var64;
                     } while (var10 < var13);

                     e = var14;
                     f = new Integer[3];
                     long var0 = 9156469775385679444L;
                     long[] var6 = new long[11];
                     int var3 = 0;
                     String var4 = "5\u009d\u009bÆÚi\u0092ì*i\u0090\u009fv½Õ\u00932Â\u008b[Ûlg\u0093t\u0001\u0017¼éÔ\u009d$\t\u008aÞâa\u0011§ß/\u0084ÓS\u008b`D@cu¨6«!\u0080Ö[ZD!Úutãc\u009a®KÙ\u0097\u008ey";
                     int var5 = "5\u009d\u009bÆÚi\u0092ì*i\u0090\u009fv½Õ\u00932Â\u008b[Ûlg\u0093t\u0001\u0017¼éÔ\u009d$\t\u008aÞâa\u0011§ß/\u0084ÓS\u008b`D@cu¨6«!\u0080Ö[ZD!Úutãc\u009a®KÙ\u0097\u008ey"
                        .length();
                     byte var2 = 0;

                     label49:
                     while (true) {
                        byte var36 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                        long[] var27 = var6;
                        int var37 = var3++;
                        long var47 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var56 = -1;

                        while (true) {
                           long var66 = var47 ^ var0;
                           switch (var56) {
                              case 0:
                                 var27[var37] = var66;
                                 if (var2 >= var5) {
                                    g = var6;
                                    i = new Long[11];
                                    return;
                                 }
                                 break;
                              default:
                                 var27[var37] = var66;
                                 if (var2 < var5) {
                                    continue label49;
                                 }

                                 var4 = "'\u000e\u0097\u0098=J\u009eÔ-SÑK¯\u0093\u0005E";
                                 var5 = "'\u000e\u0097\u0098=J\u009eÔ-SÑK¯\u0093\u0005E".length();
                                 var2 = 0;
                           }

                           byte var38 = var2;
                           var2 += 8;
                           var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                           var27 = var6;
                           var37 = var3++;
                           var47 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var56 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var25);
                  break;
               default:
                  var21[var19++] = var54;
                  if ((var25 += var17) < var20) {
                     var17 = var18.charAt(var25);
                     continue label80;
                  }

                  var18 = ",Z\u009d0\nÚ\u000bðv\u0099I\u0096\u008a\u0007\u0006\u0002朧瞼";
                  var20 = ",Z\u009d0\nÚ\u000bðv\u0099I\u0096\u008a\u0007\u0006\u0002朧瞼".length();
                  var17 = 15;
                  var25 = -1;
            }

            var10000 = 15;
            var10001 = var18.substring(++var25, var25 + var17);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -27349) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 67;
               break;
            case 1:
               var10000 = 79;
               break;
            case 2:
               var10000 = 210;
               break;
            case 3:
               var10000 = 18;
               break;
            case 4:
               var10000 = 63;
               break;
            case 5:
               var10000 = 206;
               break;
            case 6:
               var10000 = 35;
               break;
            case 7:
               var10000 = 36;
               break;
            case 8:
               var10000 = 123;
               break;
            case 9:
               var10000 = 150;
               break;
            case 10:
               var10000 = 133;
               break;
            case 11:
               var10000 = 20;
               break;
            case 12:
               var10000 = 216;
               break;
            case 13:
               var10000 = 40;
               break;
            case 14:
               var10000 = 85;
               break;
            case 15:
               var10000 = 135;
               break;
            case 16:
               var10000 = 59;
               break;
            case 17:
               var10000 = 245;
               break;
            case 18:
               var10000 = 187;
               break;
            case 19:
               var10000 = 222;
               break;
            case 20:
               var10000 = 87;
               break;
            case 21:
               var10000 = 69;
               break;
            case 22:
               var10000 = 89;
               break;
            case 23:
               var10000 = 21;
               break;
            case 24:
               var10000 = 76;
               break;
            case 25:
               var10000 = 9;
               break;
            case 26:
               var10000 = 190;
               break;
            case 27:
               var10000 = 90;
               break;
            case 28:
               var10000 = 91;
               break;
            case 29:
               var10000 = 83;
               break;
            case 30:
               var10000 = 248;
               break;
            case 31:
               var10000 = 110;
               break;
            case 32:
               var10000 = 234;
               break;
            case 33:
               var10000 = 98;
               break;
            case 34:
               var10000 = 52;
               break;
            case 35:
               var10000 = 196;
               break;
            case 36:
               var10000 = 148;
               break;
            case 37:
               var10000 = 26;
               break;
            case 38:
               var10000 = 201;
               break;
            case 39:
               var10000 = 116;
               break;
            case 40:
               var10000 = 231;
               break;
            case 41:
               var10000 = 38;
               break;
            case 42:
               var10000 = 62;
               break;
            case 43:
               var10000 = 139;
               break;
            case 44:
               var10000 = 233;
               break;
            case 45:
               var10000 = 225;
               break;
            case 46:
               var10000 = 0;
               break;
            case 47:
               var10000 = 57;
               break;
            case 48:
               var10000 = 24;
               break;
            case 49:
               var10000 = 163;
               break;
            case 50:
               var10000 = 71;
               break;
            case 51:
               var10000 = 121;
               break;
            case 52:
               var10000 = 181;
               break;
            case 53:
               var10000 = 151;
               break;
            case 54:
               var10000 = 132;
               break;
            case 55:
               var10000 = 197;
               break;
            case 56:
               var10000 = 118;
               break;
            case 57:
               var10000 = 122;
               break;
            case 58:
               var10000 = 212;
               break;
            case 59:
               var10000 = 53;
               break;
            case 60:
               var10000 = 247;
               break;
            case 61:
               var10000 = 51;
               break;
            case 62:
               var10000 = 220;
               break;
            case 63:
               var10000 = 16;
               break;
            case 64:
               var10000 = 252;
               break;
            case 65:
               var10000 = 42;
               break;
            case 66:
               var10000 = 164;
               break;
            case 67:
               var10000 = 166;
               break;
            case 68:
               var10000 = 184;
               break;
            case 69:
               var10000 = 10;
               break;
            case 70:
               var10000 = 105;
               break;
            case 71:
               var10000 = 240;
               break;
            case 72:
               var10000 = 137;
               break;
            case 73:
               var10000 = 127;
               break;
            case 74:
               var10000 = 180;
               break;
            case 75:
               var10000 = 75;
               break;
            case 76:
               var10000 = 195;
               break;
            case 77:
               var10000 = 254;
               break;
            case 78:
               var10000 = 100;
               break;
            case 79:
               var10000 = 176;
               break;
            case 80:
               var10000 = 162;
               break;
            case 81:
               var10000 = 86;
               break;
            case 82:
               var10000 = 6;
               break;
            case 83:
               var10000 = 68;
               break;
            case 84:
               var10000 = 237;
               break;
            case 85:
               var10000 = 43;
               break;
            case 86:
               var10000 = 84;
               break;
            case 87:
               var10000 = 218;
               break;
            case 88:
               var10000 = 109;
               break;
            case 89:
               var10000 = 34;
               break;
            case 90:
               var10000 = 204;
               break;
            case 91:
               var10000 = 168;
               break;
            case 92:
               var10000 = 198;
               break;
            case 93:
               var10000 = 33;
               break;
            case 94:
               var10000 = 15;
               break;
            case 95:
               var10000 = 235;
               break;
            case 96:
               var10000 = 217;
               break;
            case 97:
               var10000 = 50;
               break;
            case 98:
               var10000 = 177;
               break;
            case 99:
               var10000 = 81;
               break;
            case 100:
               var10000 = 215;
               break;
            case 101:
               var10000 = 186;
               break;
            case 102:
               var10000 = 73;
               break;
            case 103:
               var10000 = 92;
               break;
            case 104:
               var10000 = 193;
               break;
            case 105:
               var10000 = 246;
               break;
            case 106:
               var10000 = 115;
               break;
            case 107:
               var10000 = 22;
               break;
            case 108:
               var10000 = 104;
               break;
            case 109:
               var10000 = 82;
               break;
            case 110:
               var10000 = 2;
               break;
            case 111:
               var10000 = 1;
               break;
            case 112:
               var10000 = 182;
               break;
            case 113:
               var10000 = 55;
               break;
            case 114:
               var10000 = 106;
               break;
            case 115:
               var10000 = 61;
               break;
            case 116:
               var10000 = 111;
               break;
            case 117:
               var10000 = 208;
               break;
            case 118:
               var10000 = 64;
               break;
            case 119:
               var10000 = 117;
               break;
            case 120:
               var10000 = 4;
               break;
            case 121:
               var10000 = 156;
               break;
            case 122:
               var10000 = 174;
               break;
            case 123:
               var10000 = 152;
               break;
            case 124:
               var10000 = 30;
               break;
            case 125:
               var10000 = 209;
               break;
            case 126:
               var10000 = 146;
               break;
            case 127:
               var10000 = 113;
               break;
            case 128:
               var10000 = 74;
               break;
            case 129:
               var10000 = 147;
               break;
            case 130:
               var10000 = 23;
               break;
            case 131:
               var10000 = 170;
               break;
            case 132:
               var10000 = 126;
               break;
            case 133:
               var10000 = 232;
               break;
            case 134:
               var10000 = 130;
               break;
            case 135:
               var10000 = 114;
               break;
            case 136:
               var10000 = 14;
               break;
            case 137:
               var10000 = 223;
               break;
            case 138:
               var10000 = 125;
               break;
            case 139:
               var10000 = 88;
               break;
            case 140:
               var10000 = 143;
               break;
            case 141:
               var10000 = 94;
               break;
            case 142:
               var10000 = 136;
               break;
            case 143:
               var10000 = 31;
               break;
            case 144:
               var10000 = 243;
               break;
            case 145:
               var10000 = 158;
               break;
            case 146:
               var10000 = 200;
               break;
            case 147:
               var10000 = 78;
               break;
            case 148:
               var10000 = 5;
               break;
            case 149:
               var10000 = 149;
               break;
            case 150:
               var10000 = 192;
               break;
            case 151:
               var10000 = 172;
               break;
            case 152:
               var10000 = 65;
               break;
            case 153:
               var10000 = 242;
               break;
            case 154:
               var10000 = 101;
               break;
            case 155:
               var10000 = 11;
               break;
            case 156:
               var10000 = 178;
               break;
            case 157:
               var10000 = 17;
               break;
            case 158:
               var10000 = 167;
               break;
            case 159:
               var10000 = 183;
               break;
            case 160:
               var10000 = 129;
               break;
            case 161:
               var10000 = 19;
               break;
            case 162:
               var10000 = 44;
               break;
            case 163:
               var10000 = 97;
               break;
            case 164:
               var10000 = 60;
               break;
            case 165:
               var10000 = 39;
               break;
            case 166:
               var10000 = 241;
               break;
            case 167:
               var10000 = 236;
               break;
            case 168:
               var10000 = 191;
               break;
            case 169:
               var10000 = 47;
               break;
            case 170:
               var10000 = 228;
               break;
            case 171:
               var10000 = 12;
               break;
            case 172:
               var10000 = 25;
               break;
            case 173:
               var10000 = 202;
               break;
            case 174:
               var10000 = 211;
               break;
            case 175:
               var10000 = 120;
               break;
            case 176:
               var10000 = 213;
               break;
            case 177:
               var10000 = 185;
               break;
            case 178:
               var10000 = 194;
               break;
            case 179:
               var10000 = 37;
               break;
            case 180:
               var10000 = 49;
               break;
            case 181:
               var10000 = 54;
               break;
            case 182:
               var10000 = 160;
               break;
            case 183:
               var10000 = 171;
               break;
            case 184:
               var10000 = 99;
               break;
            case 185:
               var10000 = 226;
               break;
            case 186:
               var10000 = 70;
               break;
            case 187:
               var10000 = 199;
               break;
            case 188:
               var10000 = 142;
               break;
            case 189:
               var10000 = 249;
               break;
            case 190:
               var10000 = 173;
               break;
            case 191:
               var10000 = 77;
               break;
            case 192:
               var10000 = 255;
               break;
            case 193:
               var10000 = 188;
               break;
            case 194:
               var10000 = 157;
               break;
            case 195:
               var10000 = 28;
               break;
            case 196:
               var10000 = 13;
               break;
            case 197:
               var10000 = 80;
               break;
            case 198:
               var10000 = 95;
               break;
            case 199:
               var10000 = 93;
               break;
            case 200:
               var10000 = 154;
               break;
            case 201:
               var10000 = 229;
               break;
            case 202:
               var10000 = 155;
               break;
            case 203:
               var10000 = 251;
               break;
            case 204:
               var10000 = 153;
               break;
            case 205:
               var10000 = 27;
               break;
            case 206:
               var10000 = 250;
               break;
            case 207:
               var10000 = 131;
               break;
            case 208:
               var10000 = 141;
               break;
            case 209:
               var10000 = 102;
               break;
            case 210:
               var10000 = 107;
               break;
            case 211:
               var10000 = 179;
               break;
            case 212:
               var10000 = 138;
               break;
            case 213:
               var10000 = 230;
               break;
            case 214:
               var10000 = 124;
               break;
            case 215:
               var10000 = 3;
               break;
            case 216:
               var10000 = 205;
               break;
            case 217:
               var10000 = 219;
               break;
            case 218:
               var10000 = 214;
               break;
            case 219:
               var10000 = 224;
               break;
            case 220:
               var10000 = 145;
               break;
            case 221:
               var10000 = 41;
               break;
            case 222:
               var10000 = 66;
               break;
            case 223:
               var10000 = 96;
               break;
            case 224:
               var10000 = 165;
               break;
            case 225:
               var10000 = 119;
               break;
            case 226:
               var10000 = 175;
               break;
            case 227:
               var10000 = 169;
               break;
            case 228:
               var10000 = 108;
               break;
            case 229:
               var10000 = 144;
               break;
            case 230:
               var10000 = 128;
               break;
            case 231:
               var10000 = 72;
               break;
            case 232:
               var10000 = 244;
               break;
            case 233:
               var10000 = 56;
               break;
            case 234:
               var10000 = 48;
               break;
            case 235:
               var10000 = 227;
               break;
            case 236:
               var10000 = 7;
               break;
            case 237:
               var10000 = 253;
               break;
            case 238:
               var10000 = 238;
               break;
            case 239:
               var10000 = 32;
               break;
            case 240:
               var10000 = 239;
               break;
            case 241:
               var10000 = 221;
               break;
            case 242:
               var10000 = 159;
               break;
            case 243:
               var10000 = 203;
               break;
            case 244:
               var10000 = 103;
               break;
            case 245:
               var10000 = 207;
               break;
            case 246:
               var10000 = 161;
               break;
            case 247:
               var10000 = 8;
               break;
            case 248:
               var10000 = 134;
               break;
            case 249:
               var10000 = 29;
               break;
            case 250:
               var10000 = 189;
               break;
            case 251:
               var10000 = 112;
               break;
            case 252:
               var10000 = 45;
               break;
            case 253:
               var10000 = 140;
               break;
            case 254:
               var10000 = 58;
               break;
            default:
               var10000 = 46;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8600;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 2242) & 32767;
      if (i[var3] == null) {
         i[var3] = g[var3] ^ var1;
      }

      return i[var3];
   }
}





