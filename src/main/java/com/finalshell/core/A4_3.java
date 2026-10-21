package com.finalshell.core;

import java.io.ByteArrayOutputStream;

public final class A4_3 {
   public int O;
   public int N;
   public long i = c(4102, 4271266680613976758L);
   public long a;
   public int V;
   public int y;
   public int t;
   public DC G;
   public final Df2 s;
   public int W;
   public int U = -1;
   public byte[] R = new byte[4];
   public DF_2 F = null;
   public static byte[] H;
   public ByteArrayOutputStream B = null;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;
   public static long[] f;
   public static Long[] g;

   public int v() {
      int[] var1 = Nm4.g();
      Df2 var10000 = this.s;
      if (var1 == null) {
         if (this.s == null) {
            return a(20936, 7115522834845632053L);
         }

         this.s.O = this.s.F = 0L;
         var10000 = this.s;
      }

      var10000.t = null;
      this.O = a(27645, 8674853530203503658L);
      this.U = -1;
      this.G.z();
      return 0;
   }

   public int m() {
      int[] var1 = Nm4.g();
      DC var10000 = this.G;
      if (var1 == null) {
         if (this.G == null) {
            return 0;
         }

         var10000 = this.G;
      }

      var10000.I();
      return 0;
   }

   public A4_3(Df2 var1) {
      this.s = var1;
   }

   public int e(int var1) {
      int[] var2;
      int var3;
      int var10001;
      label84: {
         label85: {
            this.s.t = null;
            int[] var10000 = Nm4.g();
            this.G = null;
            this.y = 0;
            var2 = var10000;
            var3 = var1;
            if (var2 == null) {
               if (var1 < 0) {
                  var1 = -var1;
                  if (var2 == null) {
                     break label85;
                  }
               }

               var3 = var1 & a(26721, 4951765260771999639L);
            }

            if (var2 == null) {
               if (var3 != 0) {
                  this.y = a(27417, 2622813429361687796L);
                  var1 &= a(31770, 4741819084736474050L);
                  var3 = var1;
                  var10001 = a(6305, 4999559189936852800L);
                  if (var2 != null) {
                     break label84;
                  }

                  if (var1 >= var10001) {
                     break label85;
                  }

                  var1 &= a(28734, 2695156862434486231L);
                  if (var2 == null) {
                     break label85;
                  }
               }

               var3 = var1 & a(9442, 2039352601519289123L);
            }

            if (var2 == null) {
               if (var3 != 0) {
                  this.y = a(6476, 7117838744833773200L);
                  var1 &= a(10469, 5696939088395304733L);
                  if (var2 == null) {
                     break label85;
                  }
               }

               this.y = (var1 >> 4) + 1;
               var3 = var1;
            }

            var10001 = a(8254, 3334861552766056393L);
            if (var2 != null) {
               break label84;
            }

            if (var3 < var10001) {
               var1 &= a(10469, 5696939088395304733L);
            }
         }

         var3 = var1;
         if (var2 != null) {
            return var1;
         }

         var10001 = a(19408, 3788319632254082052L);
      }

      if (var3 >= var10001) {
         if (var2 != null) {
            return var1;
         }

         if (var1 <= a(10469, 5696939088395304733L)) {
            A4_3 var4 = this;
            if (var2 == null) {
               if (this.G != null) {
                  if (var2 != null) {
                     return this.t;
                  }

                  if (this.t != var1) {
                     this.G.I();
                     this.G = null;
                  }
               }

               this.t = var1;
               this.G = new DC(this.s, 1 << var1);
               var4 = this;
            }

            var4.v();
            return 0;
         }
      }

      this.m();
      return a(20936, 7115522834845632053L);
   }

   public int N(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: invokestatic com/finalshell/core/Nm4.g ()[I
      // 0003: bipush 0
      // 0004: istore 3
      // 0005: astore 2
      // 0006: aload 0
      // 0007: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 000a: aload 2
      // 000b: ifnonnull 0023
      // 000e: ifnull 0029
      // 0011: goto 0018
      // 0014: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0017: athrow
      // 0018: aload 0
      // 0019: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 001c: goto 0023
      // 001f: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0022: athrow
      // 0023: getfield com/finalshell/core/Df2.x [B
      // 0026: ifnonnull 0072
      // 0029: iload 1
      // 002a: aload 2
      // 002b: ifnonnull 0071
      // 002e: goto 0035
      // 0031: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0034: athrow
      // 0035: bipush 4
      // 0036: if_icmpne 0068
      // 0039: goto 0040
      // 003c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 003f: athrow
      // 0040: aload 0
      // 0041: getfield com/finalshell/core/A4_3.O I
      // 0044: aload 2
      // 0045: ifnonnull 0071
      // 0048: goto 004f
      // 004b: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 004e: athrow
      // 004f: sipush 22937
      // 0052: ldc2_w 7010560974798851680
      // 0055: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0058: if_icmpne 0068
      // 005b: goto 0062
      // 005e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0061: athrow
      // 0062: bipush 0
      // 0063: ireturn
      // 0064: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0067: athrow
      // 0068: sipush 20936
      // 006b: ldc2_w 7115522834845632053
      // 006e: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0071: ireturn
      // 0072: iload 1
      // 0073: aload 2
      // 0074: ifnonnull 0092
      // 0077: bipush 4
      // 0078: if_icmpne 0095
      // 007b: goto 0082
      // 007e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0081: athrow
      // 0082: sipush 22448
      // 0085: ldc2_w 3656459363730980966
      // 0088: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 008b: goto 0092
      // 008e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0091: athrow
      // 0092: goto 0096
      // 0095: bipush 0
      // 0096: istore 1
      // 0097: sipush 22448
      // 009a: ldc2_w 3656459363730980966
      // 009d: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 00a0: istore 4
      // 00a2: aload 0
      // 00a3: getfield com/finalshell/core/A4_3.O I
      // 00a6: tableswitch 4314 2 23 985 1112 1244 1376 1506 1550 1739 1866 1998 2130 2867 2869 102 2499 3121 3235 3392 3591 3817 3955 4093 2879
      // 010c: aload 0
      // 010d: getfield com/finalshell/core/A4_3.y I
      // 0110: aload 2
      // 0111: ifnonnull 013e
      // 0114: ifne 0136
      // 0117: goto 011e
      // 011a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 011d: athrow
      // 011e: aload 0
      // 011f: sipush 16593
      // 0122: ldc2_w 6164126498226640671
      // 0125: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0128: putfield com/finalshell/core/A4_3.O I
      // 012b: aload 2
      // 012c: ifnull 00a2
      // 012f: goto 0136
      // 0132: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0135: athrow
      // 0136: aload 0
      // 0137: bipush 2
      // 0138: iload 4
      // 013a: iload 1
      // 013b: invokespecial com/finalshell/core/A4_3.Y (III)I
      // 013e: istore 4
      // 0140: goto 014b
      // 0143: astore 6
      // 0145: aload 6
      // 0147: getfield com/finalshell/core/Ik4.Y I
      // 014a: ireturn
      // 014b: aload 0
      // 014c: getfield com/finalshell/core/A4_3.y I
      // 014f: aload 2
      // 0150: ifnonnull 018e
      // 0153: bipush 4
      // 0154: if_icmpeq 0179
      // 0157: goto 015e
      // 015a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 015d: athrow
      // 015e: aload 0
      // 015f: getfield com/finalshell/core/A4_3.y I
      // 0162: bipush 2
      // 0163: iand
      // 0164: aload 2
      // 0165: ifnonnull 021c
      // 0168: goto 016f
      // 016b: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 016e: athrow
      // 016f: ifeq 0216
      // 0172: goto 0179
      // 0175: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0178: athrow
      // 0179: aload 0
      // 017a: getfield com/finalshell/core/A4_3.a J
      // 017d: sipush 32097
      // 0180: ldc2_w 5500606694343268306
      // 0183: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 0186: lcmp
      // 0187: goto 018e
      // 018a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 018d: athrow
      // 018e: aload 2
      // 018f: ifnonnull 021c
      // 0192: ifne 0216
      // 0195: goto 019c
      // 0198: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 019b: athrow
      // 019c: aload 0
      // 019d: aload 2
      // 019e: ifnonnull 01e2
      // 01a1: goto 01a8
      // 01a4: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 01a7: athrow
      // 01a8: getfield com/finalshell/core/A4_3.y I
      // 01ab: bipush 4
      // 01ac: if_icmpne 01ca
      // 01af: goto 01b6
      // 01b2: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 01b5: athrow
      // 01b6: aload 0
      // 01b7: sipush 28429
      // 01ba: ldc2_w 3754601069931215054
      // 01bd: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 01c0: putfield com/finalshell/core/A4_3.y I
      // 01c3: goto 01ca
      // 01c6: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 01c9: athrow
      // 01ca: aload 0
      // 01cb: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 01ce: new com/finalshell/core/Ue2
      // 01d1: dup
      // 01d2: invokespecial com/finalshell/core/Ue2.<init> ()V
      // 01d5: putfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // 01d8: aload 0
      // 01d9: bipush 2
      // 01da: aload 0
      // 01db: getfield com/finalshell/core/A4_3.a J
      // 01de: invokespecial com/finalshell/core/A4_3.b (IJ)V
      // 01e1: aload 0
      // 01e2: aload 2
      // 01e3: ifnonnull 0206
      // 01e6: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 01e9: ifnonnull 0205
      // 01ec: goto 01f3
      // 01ef: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 01f2: athrow
      // 01f3: aload 0
      // 01f4: new com/finalshell/core/DF_2
      // 01f7: dup
      // 01f8: invokespecial com/finalshell/core/DF_2.<init> ()V
      // 01fb: putfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 01fe: goto 0205
      // 0201: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0204: athrow
      // 0205: aload 0
      // 0206: sipush 11471
      // 0209: ldc2_w 1089527730443254531
      // 020c: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 020f: putfield com/finalshell/core/A4_3.O I
      // 0212: aload 2
      // 0213: ifnull 00a2
      // 0216: aload 0
      // 0217: getfield com/finalshell/core/A4_3.y I
      // 021a: bipush 2
      // 021b: iand
      // 021c: aload 2
      // 021d: ifnonnull 0283
      // 0220: ifeq 0252
      // 0223: goto 022a
      // 0226: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0229: athrow
      // 022a: aload 0
      // 022b: sipush 32117
      // 022e: ldc2_w 1266935714368826016
      // 0231: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0234: putfield com/finalshell/core/A4_3.O I
      // 0237: aload 0
      // 0238: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 023b: sipush -19411
      // 023e: sipush -16875
      // 0241: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0244: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0247: aload 2
      // 0248: ifnull 00a2
      // 024b: goto 0252
      // 024e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0251: athrow
      // 0252: aload 0
      // 0253: bipush 0
      // 0254: putfield com/finalshell/core/A4_3.W I
      // 0257: aload 0
      // 0258: aload 0
      // 0259: getfield com/finalshell/core/A4_3.a J
      // 025c: l2i
      // 025d: sipush 22692
      // 0260: ldc2_w 6839445763520368510
      // 0263: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0266: iand
      // 0267: putfield com/finalshell/core/A4_3.N I
      // 026a: aload 0
      // 026b: getfield com/finalshell/core/A4_3.a J
      // 026e: sipush 8444
      // 0271: ldc2_w 6817212859351660315
      // 0274: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0277: lshr
      // 0278: l2i
      // 0279: sipush 22692
      // 027c: ldc2_w 6839445763520368510
      // 027f: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0282: iand
      // 0283: istore 5
      // 0285: aload 0
      // 0286: getfield com/finalshell/core/A4_3.y I
      // 0289: bipush 1
      // 028a: iand
      // 028b: aload 2
      // 028c: ifnonnull 02de
      // 028f: ifeq 02c9
      // 0292: goto 0299
      // 0295: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0298: athrow
      // 0299: aload 0
      // 029a: getfield com/finalshell/core/A4_3.N I
      // 029d: sipush 8444
      // 02a0: ldc2_w 6817212859351660315
      // 02a3: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 02a6: ishl
      // 02a7: iload 5
      // 02a9: iadd
      // 02aa: sipush 22700
      // 02ad: ldc2_w 3879518310618959723
      // 02b0: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 02b3: irem
      // 02b4: aload 2
      // 02b5: ifnonnull 038a
      // 02b8: goto 02bf
      // 02bb: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 02be: athrow
      // 02bf: ifeq 037c
      // 02c2: goto 02c9
      // 02c5: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 02c8: athrow
      // 02c9: aload 0
      // 02ca: getfield com/finalshell/core/A4_3.N I
      // 02cd: sipush 10469
      // 02d0: ldc2_w 5696939088395304733
      // 02d3: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 02d6: iand
      // 02d7: goto 02de
      // 02da: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 02dd: athrow
      // 02de: sipush 8444
      // 02e1: ldc2_w 6817212859351660315
      // 02e4: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 02e7: aload 2
      // 02e8: ifnonnull 0393
      // 02eb: if_icmpeq 037c
      // 02ee: goto 02f5
      // 02f1: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 02f4: athrow
      // 02f5: aload 0
      // 02f6: aload 2
      // 02f7: ifnonnull 0369
      // 02fa: goto 0301
      // 02fd: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0300: athrow
      // 0301: getfield com/finalshell/core/A4_3.y I
      // 0304: bipush 4
      // 0305: if_icmpne 035b
      // 0308: goto 030f
      // 030b: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 030e: athrow
      // 030f: aload 0
      // 0310: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0313: dup
      // 0314: getfield com/finalshell/core/Df2.f I
      // 0317: bipush 2
      // 0318: isub
      // 0319: putfield com/finalshell/core/Df2.f I
      // 031c: aload 0
      // 031d: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0320: dup
      // 0321: getfield com/finalshell/core/Df2.L I
      // 0324: bipush 2
      // 0325: iadd
      // 0326: putfield com/finalshell/core/Df2.L I
      // 0329: aload 0
      // 032a: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 032d: dup
      // 032e: getfield com/finalshell/core/Df2.O J
      // 0331: sipush 7538
      // 0334: ldc2_w 8981576780583090125
      // 0337: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 033a: lsub
      // 033b: putfield com/finalshell/core/Df2.O J
      // 033e: aload 0
      // 033f: bipush 0
      // 0340: putfield com/finalshell/core/A4_3.y I
      // 0343: aload 0
      // 0344: sipush 16593
      // 0347: ldc2_w 6164126498226640671
      // 034a: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 034d: putfield com/finalshell/core/A4_3.O I
      // 0350: aload 2
      // 0351: ifnull 00a2
      // 0354: goto 035b
      // 0357: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 035a: athrow
      // 035b: aload 0
      // 035c: sipush 32117
      // 035f: ldc2_w 1266935714368826016
      // 0362: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0365: putfield com/finalshell/core/A4_3.O I
      // 0368: aload 0
      // 0369: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 036c: sipush -19410
      // 036f: sipush 3280
      // 0372: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0375: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0378: aload 2
      // 0379: ifnull 00a2
      // 037c: aload 0
      // 037d: getfield com/finalshell/core/A4_3.N I
      // 0380: sipush 10469
      // 0383: ldc2_w 5696939088395304733
      // 0386: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0389: iand
      // 038a: sipush 8444
      // 038d: ldc2_w 6817212859351660315
      // 0390: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0393: aload 2
      // 0394: ifnonnull 03ce
      // 0397: if_icmpeq 03c9
      // 039a: goto 03a1
      // 039d: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 03a0: athrow
      // 03a1: aload 0
      // 03a2: sipush 32117
      // 03a5: ldc2_w 1266935714368826016
      // 03a8: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 03ab: putfield com/finalshell/core/A4_3.O I
      // 03ae: aload 0
      // 03af: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 03b2: sipush -19412
      // 03b5: sipush -32341
      // 03b8: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 03bb: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 03be: aload 2
      // 03bf: ifnull 00a2
      // 03c2: goto 03c9
      // 03c5: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 03c8: athrow
      // 03c9: aload 0
      // 03ca: getfield com/finalshell/core/A4_3.y I
      // 03cd: bipush 4
      // 03ce: aload 2
      // 03cf: ifnonnull 03fc
      // 03d2: if_icmpne 03e8
      // 03d5: goto 03dc
      // 03d8: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 03db: athrow
      // 03dc: aload 0
      // 03dd: bipush 1
      // 03de: putfield com/finalshell/core/A4_3.y I
      // 03e1: goto 03e8
      // 03e4: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 03e7: athrow
      // 03e8: aload 0
      // 03e9: getfield com/finalshell/core/A4_3.N I
      // 03ec: bipush 4
      // 03ed: ishr
      // 03ee: sipush 8444
      // 03f1: ldc2_w 6817212859351660315
      // 03f4: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 03f7: iadd
      // 03f8: aload 0
      // 03f9: getfield com/finalshell/core/A4_3.t I
      // 03fc: aload 2
      // 03fd: ifnonnull 0456
      // 0400: if_icmple 0432
      // 0403: goto 040a
      // 0406: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0409: athrow
      // 040a: aload 0
      // 040b: sipush 32117
      // 040e: ldc2_w 1266935714368826016
      // 0411: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0414: putfield com/finalshell/core/A4_3.O I
      // 0417: aload 0
      // 0418: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 041b: sipush -19423
      // 041e: sipush 16674
      // 0421: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0424: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0427: aload 2
      // 0428: ifnull 00a2
      // 042b: goto 0432
      // 042e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0431: athrow
      // 0432: aload 0
      // 0433: aload 2
      // 0434: ifnonnull 0473
      // 0437: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 043a: new com/finalshell/core/DG3
      // 043d: dup
      // 043e: invokespecial com/finalshell/core/DG3.<init> ()V
      // 0441: putfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // 0444: iload 5
      // 0446: sipush 10506
      // 0449: ldc2_w 7643847508299316969
      // 044c: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 044f: goto 0456
      // 0452: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0455: athrow
      // 0456: iand
      // 0457: ifne 0472
      // 045a: aload 0
      // 045b: sipush 16593
      // 045e: ldc2_w 6164126498226640671
      // 0461: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0464: putfield com/finalshell/core/A4_3.O I
      // 0467: aload 2
      // 0468: ifnull 00a2
      // 046b: goto 0472
      // 046e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0471: athrow
      // 0472: aload 0
      // 0473: sipush 22278
      // 0476: ldc2_w 6624816313608732864
      // 0479: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 047c: putfield com/finalshell/core/A4_3.O I
      // 047f: aload 0
      // 0480: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0483: getfield com/finalshell/core/Df2.L I
      // 0486: aload 2
      // 0487: ifnonnull 049c
      // 048a: ifne 049b
      // 048d: goto 0494
      // 0490: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0493: athrow
      // 0494: iload 4
      // 0496: ireturn
      // 0497: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 049a: athrow
      // 049b: iload 1
      // 049c: istore 4
      // 049e: aload 0
      // 049f: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 04a2: dup
      // 04a3: getfield com/finalshell/core/Df2.L I
      // 04a6: bipush 1
      // 04a7: isub
      // 04a8: putfield com/finalshell/core/Df2.L I
      // 04ab: aload 0
      // 04ac: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 04af: dup
      // 04b0: getfield com/finalshell/core/Df2.O J
      // 04b3: lconst_1
      // 04b4: ladd
      // 04b5: putfield com/finalshell/core/Df2.O J
      // 04b8: aload 0
      // 04b9: aload 0
      // 04ba: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 04bd: getfield com/finalshell/core/Df2.x [B
      // 04c0: aload 0
      // 04c1: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 04c4: dup
      // 04c5: getfield com/finalshell/core/Df2.f I
      // 04c8: dup_x1
      // 04c9: bipush 1
      // 04ca: iadd
      // 04cb: putfield com/finalshell/core/Df2.f I
      // 04ce: baload
      // 04cf: sipush 22692
      // 04d2: ldc2_w 6839445763520368510
      // 04d5: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 04d8: iand
      // 04d9: sipush 13412
      // 04dc: ldc2_w 9003296142589256577
      // 04df: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 04e2: ishl
      // 04e3: i2l
      // 04e4: sipush 22736
      // 04e7: ldc2_w 1686306058536612461
      // 04ea: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 04ed: land
      // 04ee: putfield com/finalshell/core/A4_3.a J
      // 04f1: aload 0
      // 04f2: sipush 4916
      // 04f5: ldc2_w 496060451737060603
      // 04f8: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 04fb: putfield com/finalshell/core/A4_3.O I
      // 04fe: aload 0
      // 04ff: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0502: getfield com/finalshell/core/Df2.L I
      // 0505: aload 2
      // 0506: ifnonnull 051b
      // 0509: ifne 051a
      // 050c: goto 0513
      // 050f: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0512: athrow
      // 0513: iload 4
      // 0515: ireturn
      // 0516: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0519: athrow
      // 051a: iload 1
      // 051b: istore 4
      // 051d: aload 0
      // 051e: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0521: dup
      // 0522: getfield com/finalshell/core/Df2.L I
      // 0525: bipush 1
      // 0526: isub
      // 0527: putfield com/finalshell/core/Df2.L I
      // 052a: aload 0
      // 052b: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 052e: dup
      // 052f: getfield com/finalshell/core/Df2.O J
      // 0532: lconst_1
      // 0533: ladd
      // 0534: putfield com/finalshell/core/Df2.O J
      // 0537: aload 0
      // 0538: dup
      // 0539: getfield com/finalshell/core/A4_3.a J
      // 053c: aload 0
      // 053d: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0540: getfield com/finalshell/core/Df2.x [B
      // 0543: aload 0
      // 0544: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0547: dup
      // 0548: getfield com/finalshell/core/Df2.f I
      // 054b: dup_x1
      // 054c: bipush 1
      // 054d: iadd
      // 054e: putfield com/finalshell/core/Df2.f I
      // 0551: baload
      // 0552: sipush 22692
      // 0555: ldc2_w 6839445763520368510
      // 0558: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 055b: iand
      // 055c: sipush 27317
      // 055f: ldc2_w 4626486676951186789
      // 0562: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0565: ishl
      // 0566: i2l
      // 0567: sipush 8797
      // 056a: ldc2_w 2442095170423720164
      // 056d: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 0570: land
      // 0571: ladd
      // 0572: putfield com/finalshell/core/A4_3.a J
      // 0575: aload 0
      // 0576: sipush 6476
      // 0579: ldc2_w 7117838744833773200
      // 057c: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 057f: putfield com/finalshell/core/A4_3.O I
      // 0582: aload 0
      // 0583: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0586: getfield com/finalshell/core/Df2.L I
      // 0589: aload 2
      // 058a: ifnonnull 059f
      // 058d: ifne 059e
      // 0590: goto 0597
      // 0593: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0596: athrow
      // 0597: iload 4
      // 0599: ireturn
      // 059a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 059d: athrow
      // 059e: iload 1
      // 059f: istore 4
      // 05a1: aload 0
      // 05a2: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 05a5: dup
      // 05a6: getfield com/finalshell/core/Df2.L I
      // 05a9: bipush 1
      // 05aa: isub
      // 05ab: putfield com/finalshell/core/Df2.L I
      // 05ae: aload 0
      // 05af: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 05b2: dup
      // 05b3: getfield com/finalshell/core/Df2.O J
      // 05b6: lconst_1
      // 05b7: ladd
      // 05b8: putfield com/finalshell/core/Df2.O J
      // 05bb: aload 0
      // 05bc: dup
      // 05bd: getfield com/finalshell/core/A4_3.a J
      // 05c0: aload 0
      // 05c1: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 05c4: getfield com/finalshell/core/Df2.x [B
      // 05c7: aload 0
      // 05c8: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 05cb: dup
      // 05cc: getfield com/finalshell/core/Df2.f I
      // 05cf: dup_x1
      // 05d0: bipush 1
      // 05d1: iadd
      // 05d2: putfield com/finalshell/core/Df2.f I
      // 05d5: baload
      // 05d6: sipush 22692
      // 05d9: ldc2_w 6839445763520368510
      // 05dc: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 05df: iand
      // 05e0: sipush 8444
      // 05e3: ldc2_w 6817212859351660315
      // 05e6: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 05e9: ishl
      // 05ea: i2l
      // 05eb: sipush 16899
      // 05ee: ldc2_w 7059650450529675451
      // 05f1: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 05f4: land
      // 05f5: ladd
      // 05f6: putfield com/finalshell/core/A4_3.a J
      // 05f9: aload 0
      // 05fa: sipush 24241
      // 05fd: ldc2_w 4532158553124047210
      // 0600: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0603: putfield com/finalshell/core/A4_3.O I
      // 0606: aload 0
      // 0607: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 060a: getfield com/finalshell/core/Df2.L I
      // 060d: aload 2
      // 060e: ifnonnull 0687
      // 0611: ifne 0622
      // 0614: goto 061b
      // 0617: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 061a: athrow
      // 061b: iload 4
      // 061d: ireturn
      // 061e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0621: athrow
      // 0622: iload 1
      // 0623: istore 4
      // 0625: aload 0
      // 0626: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0629: dup
      // 062a: getfield com/finalshell/core/Df2.L I
      // 062d: bipush 1
      // 062e: isub
      // 062f: putfield com/finalshell/core/Df2.L I
      // 0632: aload 0
      // 0633: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0636: dup
      // 0637: getfield com/finalshell/core/Df2.O J
      // 063a: lconst_1
      // 063b: ladd
      // 063c: putfield com/finalshell/core/Df2.O J
      // 063f: aload 0
      // 0640: dup
      // 0641: getfield com/finalshell/core/A4_3.a J
      // 0644: aload 0
      // 0645: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0648: getfield com/finalshell/core/Df2.x [B
      // 064b: aload 0
      // 064c: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 064f: dup
      // 0650: getfield com/finalshell/core/Df2.f I
      // 0653: dup_x1
      // 0654: bipush 1
      // 0655: iadd
      // 0656: putfield com/finalshell/core/Df2.f I
      // 0659: baload
      // 065a: i2l
      // 065b: sipush 6512
      // 065e: ldc2_w 9077575468358120396
      // 0661: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 0664: land
      // 0665: ladd
      // 0666: putfield com/finalshell/core/A4_3.a J
      // 0669: aload 0
      // 066a: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 066d: getfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // 0670: aload 0
      // 0671: getfield com/finalshell/core/A4_3.a J
      // 0674: invokeinterface com/finalshell/core/Aj2.I (J)V 3
      // 0679: aload 0
      // 067a: sipush 23306
      // 067d: ldc2_w 8467786741266091262
      // 0680: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0683: putfield com/finalshell/core/A4_3.O I
      // 0686: bipush 2
      // 0687: ireturn
      // 0688: aload 0
      // 0689: sipush 32117
      // 068c: ldc2_w 1266935714368826016
      // 068f: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0692: putfield com/finalshell/core/A4_3.O I
      // 0695: sipush 20936
      // 0698: aload 0
      // 0699: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 069c: sipush -19424
      // 069f: sipush 13061
      // 06a2: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 06a5: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 06a8: ldc2_w 7115522834845632053
      // 06ab: aload 0
      // 06ac: bipush 0
      // 06ad: putfield com/finalshell/core/A4_3.V I
      // 06b0: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 06b3: ireturn
      // 06b4: aload 0
      // 06b5: getfield com/finalshell/core/A4_3.G Lcom/finalshell/core/DC;
      // 06b8: iload 4
      // 06ba: invokevirtual com/finalshell/core/DC.S (I)I
      // 06bd: istore 4
      // 06bf: iload 4
      // 06c1: aload 2
      // 06c2: ifnonnull 06f7
      // 06c5: sipush 31892
      // 06c8: ldc2_w 2187186631325723462
      // 06cb: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 06ce: if_icmpne 06f5
      // 06d1: goto 06d8
      // 06d4: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 06d7: athrow
      // 06d8: aload 0
      // 06d9: sipush 32117
      // 06dc: ldc2_w 1266935714368826016
      // 06df: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 06e2: putfield com/finalshell/core/A4_3.O I
      // 06e5: aload 0
      // 06e6: bipush 0
      // 06e7: putfield com/finalshell/core/A4_3.V I
      // 06ea: aload 2
      // 06eb: ifnull 00a2
      // 06ee: goto 06f5
      // 06f1: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 06f4: athrow
      // 06f5: iload 4
      // 06f7: aload 2
      // 06f8: ifnonnull 070a
      // 06fb: ifne 0708
      // 06fe: goto 0705
      // 0701: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0704: athrow
      // 0705: iload 1
      // 0706: istore 4
      // 0708: iload 4
      // 070a: aload 2
      // 070b: ifnonnull 0749
      // 070e: bipush 1
      // 070f: if_icmpeq 0720
      // 0712: goto 0719
      // 0715: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0718: athrow
      // 0719: iload 4
      // 071b: ireturn
      // 071c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 071f: athrow
      // 0720: iload 1
      // 0721: istore 4
      // 0723: aload 0
      // 0724: aload 0
      // 0725: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0728: getfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // 072b: invokeinterface com/finalshell/core/Aj2.u ()J 1
      // 0730: putfield com/finalshell/core/A4_3.i J
      // 0733: aload 0
      // 0734: getfield com/finalshell/core/A4_3.G Lcom/finalshell/core/DC;
      // 0737: invokevirtual com/finalshell/core/DC.z ()V
      // 073a: aload 0
      // 073b: aload 2
      // 073c: ifnonnull 0765
      // 073f: getfield com/finalshell/core/A4_3.y I
      // 0742: goto 0749
      // 0745: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0748: athrow
      // 0749: ifne 0764
      // 074c: aload 0
      // 074d: sipush 24344
      // 0750: ldc2_w 7085604449346455787
      // 0753: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0756: putfield com/finalshell/core/A4_3.O I
      // 0759: aload 2
      // 075a: ifnull 00a2
      // 075d: goto 0764
      // 0760: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0763: athrow
      // 0764: aload 0
      // 0765: sipush 8444
      // 0768: ldc2_w 6817212859351660315
      // 076b: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 076e: putfield com/finalshell/core/A4_3.O I
      // 0771: aload 0
      // 0772: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0775: getfield com/finalshell/core/Df2.L I
      // 0778: aload 2
      // 0779: ifnonnull 078e
      // 077c: ifne 078d
      // 077f: goto 0786
      // 0782: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0785: athrow
      // 0786: iload 4
      // 0788: ireturn
      // 0789: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 078c: athrow
      // 078d: iload 1
      // 078e: istore 4
      // 0790: aload 0
      // 0791: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0794: dup
      // 0795: getfield com/finalshell/core/Df2.L I
      // 0798: bipush 1
      // 0799: isub
      // 079a: putfield com/finalshell/core/Df2.L I
      // 079d: aload 0
      // 079e: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 07a1: dup
      // 07a2: getfield com/finalshell/core/Df2.O J
      // 07a5: lconst_1
      // 07a6: ladd
      // 07a7: putfield com/finalshell/core/Df2.O J
      // 07aa: aload 0
      // 07ab: aload 0
      // 07ac: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 07af: getfield com/finalshell/core/Df2.x [B
      // 07b2: aload 0
      // 07b3: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 07b6: dup
      // 07b7: getfield com/finalshell/core/Df2.f I
      // 07ba: dup_x1
      // 07bb: bipush 1
      // 07bc: iadd
      // 07bd: putfield com/finalshell/core/Df2.f I
      // 07c0: baload
      // 07c1: sipush 22692
      // 07c4: ldc2_w 6839445763520368510
      // 07c7: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 07ca: iand
      // 07cb: sipush 31945
      // 07ce: ldc2_w 5763188300358855436
      // 07d1: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 07d4: ishl
      // 07d5: i2l
      // 07d6: sipush 1777
      // 07d9: ldc2_w 8841734766773218374
      // 07dc: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 07df: land
      // 07e0: putfield com/finalshell/core/A4_3.a J
      // 07e3: aload 0
      // 07e4: sipush 10378
      // 07e7: ldc2_w 654152618383638376
      // 07ea: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 07ed: putfield com/finalshell/core/A4_3.O I
      // 07f0: aload 0
      // 07f1: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 07f4: getfield com/finalshell/core/Df2.L I
      // 07f7: aload 2
      // 07f8: ifnonnull 080d
      // 07fb: ifne 080c
      // 07fe: goto 0805
      // 0801: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0804: athrow
      // 0805: iload 4
      // 0807: ireturn
      // 0808: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 080b: athrow
      // 080c: iload 1
      // 080d: istore 4
      // 080f: aload 0
      // 0810: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0813: dup
      // 0814: getfield com/finalshell/core/Df2.L I
      // 0817: bipush 1
      // 0818: isub
      // 0819: putfield com/finalshell/core/Df2.L I
      // 081c: aload 0
      // 081d: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0820: dup
      // 0821: getfield com/finalshell/core/Df2.O J
      // 0824: lconst_1
      // 0825: ladd
      // 0826: putfield com/finalshell/core/Df2.O J
      // 0829: aload 0
      // 082a: dup
      // 082b: getfield com/finalshell/core/A4_3.a J
      // 082e: aload 0
      // 082f: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0832: getfield com/finalshell/core/Df2.x [B
      // 0835: aload 0
      // 0836: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0839: dup
      // 083a: getfield com/finalshell/core/Df2.f I
      // 083d: dup_x1
      // 083e: bipush 1
      // 083f: iadd
      // 0840: putfield com/finalshell/core/Df2.f I
      // 0843: baload
      // 0844: sipush 22692
      // 0847: ldc2_w 6839445763520368510
      // 084a: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 084d: iand
      // 084e: sipush 3084
      // 0851: ldc2_w 9186361394830433234
      // 0854: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0857: ishl
      // 0858: i2l
      // 0859: sipush 726
      // 085c: ldc2_w 8155737978570844263
      // 085f: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 0862: land
      // 0863: ladd
      // 0864: putfield com/finalshell/core/A4_3.a J
      // 0867: aload 0
      // 0868: sipush 3992
      // 086b: ldc2_w 1304366854327457912
      // 086e: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0871: putfield com/finalshell/core/A4_3.O I
      // 0874: aload 0
      // 0875: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0878: getfield com/finalshell/core/Df2.L I
      // 087b: aload 2
      // 087c: ifnonnull 0891
      // 087f: ifne 0890
      // 0882: goto 0889
      // 0885: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0888: athrow
      // 0889: iload 4
      // 088b: ireturn
      // 088c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 088f: athrow
      // 0890: iload 1
      // 0891: istore 4
      // 0893: aload 0
      // 0894: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0897: dup
      // 0898: getfield com/finalshell/core/Df2.L I
      // 089b: bipush 1
      // 089c: isub
      // 089d: putfield com/finalshell/core/Df2.L I
      // 08a0: aload 0
      // 08a1: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 08a4: dup
      // 08a5: getfield com/finalshell/core/Df2.O J
      // 08a8: lconst_1
      // 08a9: ladd
      // 08aa: putfield com/finalshell/core/Df2.O J
      // 08ad: aload 0
      // 08ae: dup
      // 08af: getfield com/finalshell/core/A4_3.a J
      // 08b2: aload 0
      // 08b3: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 08b6: getfield com/finalshell/core/Df2.x [B
      // 08b9: aload 0
      // 08ba: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 08bd: dup
      // 08be: getfield com/finalshell/core/Df2.f I
      // 08c1: dup_x1
      // 08c2: bipush 1
      // 08c3: iadd
      // 08c4: putfield com/finalshell/core/Df2.f I
      // 08c7: baload
      // 08c8: sipush 22692
      // 08cb: ldc2_w 6839445763520368510
      // 08ce: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 08d1: iand
      // 08d2: sipush 8444
      // 08d5: ldc2_w 6817212859351660315
      // 08d8: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 08db: ishl
      // 08dc: i2l
      // 08dd: sipush 279
      // 08e0: ldc2_w 9182932253811846060
      // 08e3: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 08e6: land
      // 08e7: ladd
      // 08e8: putfield com/finalshell/core/A4_3.a J
      // 08eb: aload 0
      // 08ec: sipush 9026
      // 08ef: ldc2_w 6129355384654853304
      // 08f2: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 08f5: putfield com/finalshell/core/A4_3.O I
      // 08f8: aload 0
      // 08f9: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 08fc: getfield com/finalshell/core/Df2.L I
      // 08ff: aload 2
      // 0900: ifnonnull 095f
      // 0903: ifne 0914
      // 0906: goto 090d
      // 0909: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 090c: athrow
      // 090d: iload 4
      // 090f: ireturn
      // 0910: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0913: athrow
      // 0914: iload 1
      // 0915: istore 4
      // 0917: aload 0
      // 0918: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 091b: dup
      // 091c: getfield com/finalshell/core/Df2.L I
      // 091f: bipush 1
      // 0920: isub
      // 0921: putfield com/finalshell/core/Df2.L I
      // 0924: aload 0
      // 0925: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0928: dup
      // 0929: getfield com/finalshell/core/Df2.O J
      // 092c: lconst_1
      // 092d: ladd
      // 092e: putfield com/finalshell/core/Df2.O J
      // 0931: aload 0
      // 0932: dup
      // 0933: getfield com/finalshell/core/A4_3.a J
      // 0936: aload 0
      // 0937: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 093a: getfield com/finalshell/core/Df2.x [B
      // 093d: aload 0
      // 093e: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0941: dup
      // 0942: getfield com/finalshell/core/Df2.f I
      // 0945: dup_x1
      // 0946: bipush 1
      // 0947: iadd
      // 0948: putfield com/finalshell/core/Df2.f I
      // 094b: baload
      // 094c: i2l
      // 094d: sipush 26144
      // 0950: ldc2_w 654664165493460118
      // 0953: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 0956: land
      // 0957: ladd
      // 0958: putfield com/finalshell/core/A4_3.a J
      // 095b: aload 0
      // 095c: getfield com/finalshell/core/A4_3.W I
      // 095f: aload 2
      // 0960: ifnonnull 09ea
      // 0963: ifeq 09e5
      // 0966: goto 096d
      // 0969: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 096c: athrow
      // 096d: aload 0
      // 096e: aload 0
      // 096f: getfield com/finalshell/core/A4_3.a J
      // 0972: sipush 5360
      // 0975: ldc2_w 8867307719897693762
      // 0978: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 097b: land
      // 097c: sipush 31945
      // 097f: ldc2_w 5763188300358855436
      // 0982: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0985: lshr
      // 0986: aload 0
      // 0987: getfield com/finalshell/core/A4_3.a J
      // 098a: sipush 726
      // 098d: ldc2_w 8155737978570844263
      // 0990: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 0993: land
      // 0994: sipush 8444
      // 0997: ldc2_w 6817212859351660315
      // 099a: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 099d: lshr
      // 099e: lor
      // 099f: aload 0
      // 09a0: getfield com/finalshell/core/A4_3.a J
      // 09a3: sipush 279
      // 09a6: ldc2_w 9182932253811846060
      // 09a9: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 09ac: land
      // 09ad: sipush 8444
      // 09b0: ldc2_w 6817212859351660315
      // 09b3: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 09b6: lshl
      // 09b7: lor
      // 09b8: aload 0
      // 09b9: getfield com/finalshell/core/A4_3.a J
      // 09bc: sipush 238
      // 09bf: ldc2_w 2775247064706198100
      // 09c2: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 09c5: land
      // 09c6: sipush 31945
      // 09c9: ldc2_w 5763188300358855436
      // 09cc: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 09cf: lshl
      // 09d0: lor
      // 09d1: sipush 20141
      // 09d4: ldc2_w 7723234579825550361
      // 09d7: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 09da: land
      // 09db: putfield com/finalshell/core/A4_3.a J
      // 09de: goto 09e5
      // 09e1: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 09e4: athrow
      // 09e5: aload 0
      // 09e6: getfield com/finalshell/core/A4_3.i J
      // 09e9: l2i
      // 09ea: aload 2
      // 09eb: ifnonnull 0a2e
      // 09ee: aload 0
      // 09ef: getfield com/finalshell/core/A4_3.a J
      // 09f2: l2i
      // 09f3: if_icmpeq 0a18
      // 09f6: goto 09fd
      // 09f9: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 09fc: athrow
      // 09fd: aload 0
      // 09fe: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0a01: sipush -19418
      // 0a04: sipush 17267
      // 0a07: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0a0a: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0a0d: aload 2
      // 0a0e: ifnull 0a5c
      // 0a11: goto 0a18
      // 0a14: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a17: athrow
      // 0a18: aload 0
      // 0a19: aload 2
      // 0a1a: ifnonnull 0a5d
      // 0a1d: goto 0a24
      // 0a20: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a23: athrow
      // 0a24: getfield com/finalshell/core/A4_3.W I
      // 0a27: goto 0a2e
      // 0a2a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a2d: athrow
      // 0a2e: ifeq 0a5c
      // 0a31: aload 0
      // 0a32: aload 2
      // 0a33: ifnonnull 0a5d
      // 0a36: goto 0a3d
      // 0a39: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a3c: athrow
      // 0a3d: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0a40: ifnull 0a5c
      // 0a43: goto 0a4a
      // 0a46: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a49: athrow
      // 0a4a: aload 0
      // 0a4b: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0a4e: aload 0
      // 0a4f: getfield com/finalshell/core/A4_3.a J
      // 0a52: putfield com/finalshell/core/DF_2.C J
      // 0a55: goto 0a5c
      // 0a58: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a5b: athrow
      // 0a5c: aload 0
      // 0a5d: sipush 10469
      // 0a60: ldc2_w 5696939088395304733
      // 0a63: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0a66: putfield com/finalshell/core/A4_3.O I
      // 0a69: aload 0
      // 0a6a: aload 2
      // 0a6b: ifnonnull 0b6b
      // 0a6e: getfield com/finalshell/core/A4_3.y I
      // 0a71: ifeq 0b63
      // 0a74: goto 0a7b
      // 0a77: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a7a: athrow
      // 0a7b: aload 0
      // 0a7c: aload 2
      // 0a7d: ifnonnull 0b6b
      // 0a80: goto 0a87
      // 0a83: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a86: athrow
      // 0a87: getfield com/finalshell/core/A4_3.W I
      // 0a8a: ifeq 0b63
      // 0a8d: goto 0a94
      // 0a90: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0a93: athrow
      // 0a94: aload 0
      // 0a95: bipush 4
      // 0a96: iload 4
      // 0a98: iload 1
      // 0a99: invokespecial com/finalshell/core/A4_3.Y (III)I
      // 0a9c: istore 4
      // 0a9e: goto 0aa9
      // 0aa1: astore 6
      // 0aa3: aload 6
      // 0aa5: getfield com/finalshell/core/Ik4.Y I
      // 0aa8: ireturn
      // 0aa9: aload 0
      // 0aaa: aload 2
      // 0aab: ifnonnull 0b0c
      // 0aae: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0ab1: getfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0ab4: ifnull 0b0b
      // 0ab7: goto 0abe
      // 0aba: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0abd: athrow
      // 0abe: aload 0
      // 0abf: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0ac2: getfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0ac5: sipush -19417
      // 0ac8: sipush -27147
      // 0acb: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0ace: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ad1: aload 2
      // 0ad2: ifnonnull 0b2c
      // 0ad5: goto 0adc
      // 0ad8: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0adb: athrow
      // 0adc: ifeq 0b0b
      // 0adf: goto 0ae6
      // 0ae2: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0ae5: athrow
      // 0ae6: aload 0
      // 0ae7: sipush 32117
      // 0aea: ldc2_w 1266935714368826016
      // 0aed: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0af0: putfield com/finalshell/core/A4_3.O I
      // 0af3: aload 0
      // 0af4: sipush 6686
      // 0af7: ldc2_w 61080495891172813
      // 0afa: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0afd: putfield com/finalshell/core/A4_3.V I
      // 0b00: aload 2
      // 0b01: ifnull 00a2
      // 0b04: goto 0b0b
      // 0b07: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0b0a: athrow
      // 0b0b: aload 0
      // 0b0c: aload 2
      // 0b0d: ifnonnull 0b58
      // 0b10: getfield com/finalshell/core/A4_3.a J
      // 0b13: aload 0
      // 0b14: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0b17: getfield com/finalshell/core/Df2.F J
      // 0b1a: sipush 20141
      // 0b1d: ldc2_w 7723234579825550361
      // 0b20: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 0b23: land
      // 0b24: lcmp
      // 0b25: goto 0b2c
      // 0b28: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0b2b: athrow
      // 0b2c: ifeq 0b57
      // 0b2f: aload 0
      // 0b30: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0b33: sipush -19422
      // 0b36: sipush 13262
      // 0b39: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0b3c: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0b3f: aload 0
      // 0b40: sipush 32117
      // 0b43: ldc2_w 1266935714368826016
      // 0b46: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0b49: putfield com/finalshell/core/A4_3.O I
      // 0b4c: aload 2
      // 0b4d: ifnull 00a2
      // 0b50: goto 0b57
      // 0b53: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0b56: athrow
      // 0b57: aload 0
      // 0b58: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0b5b: aconst_null
      // 0b5c: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0b5f: aload 2
      // 0b60: ifnull 0bcc
      // 0b63: aload 0
      // 0b64: goto 0b6b
      // 0b67: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0b6a: athrow
      // 0b6b: aload 2
      // 0b6c: ifnonnull 0bcd
      // 0b6f: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0b72: getfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0b75: ifnull 0bcc
      // 0b78: goto 0b7f
      // 0b7b: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0b7e: athrow
      // 0b7f: aload 0
      // 0b80: aload 2
      // 0b81: ifnonnull 0bcd
      // 0b84: goto 0b8b
      // 0b87: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0b8a: athrow
      // 0b8b: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0b8e: getfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0b91: sipush -19417
      // 0b94: sipush -27147
      // 0b97: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0b9a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b9d: ifeq 0bcc
      // 0ba0: goto 0ba7
      // 0ba3: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0ba6: athrow
      // 0ba7: aload 0
      // 0ba8: sipush 32117
      // 0bab: ldc2_w 1266935714368826016
      // 0bae: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0bb1: putfield com/finalshell/core/A4_3.O I
      // 0bb4: aload 0
      // 0bb5: sipush 6686
      // 0bb8: ldc2_w 61080495891172813
      // 0bbb: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0bbe: putfield com/finalshell/core/A4_3.V I
      // 0bc1: aload 2
      // 0bc2: ifnull 00a2
      // 0bc5: goto 0bcc
      // 0bc8: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0bcb: athrow
      // 0bcc: aload 0
      // 0bcd: sipush 17617
      // 0bd0: ldc2_w 7141208964640641834
      // 0bd3: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0bd6: putfield com/finalshell/core/A4_3.O I
      // 0bd9: bipush 1
      // 0bda: ireturn
      // 0bdb: sipush 31892
      // 0bde: ldc2_w 2187186631325723462
      // 0be1: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0be4: ireturn
      // 0be5: aload 0
      // 0be6: bipush 2
      // 0be7: iload 4
      // 0be9: iload 1
      // 0bea: invokespecial com/finalshell/core/A4_3.Y (III)I
      // 0bed: istore 4
      // 0bef: goto 0bfa
      // 0bf2: astore 6
      // 0bf4: aload 6
      // 0bf6: getfield com/finalshell/core/Ik4.Y I
      // 0bf9: ireturn
      // 0bfa: aload 0
      // 0bfb: aload 0
      // 0bfc: getfield com/finalshell/core/A4_3.a J
      // 0bff: l2i
      // 0c00: sipush 7932
      // 0c03: ldc2_w 2661146856993540375
      // 0c06: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0c09: iand
      // 0c0a: putfield com/finalshell/core/A4_3.W I
      // 0c0d: aload 0
      // 0c0e: getfield com/finalshell/core/A4_3.W I
      // 0c11: sipush 22692
      // 0c14: ldc2_w 6839445763520368510
      // 0c17: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0c1a: iand
      // 0c1b: sipush 8444
      // 0c1e: ldc2_w 6817212859351660315
      // 0c21: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0c24: aload 2
      // 0c25: ifnonnull 0c67
      // 0c28: if_icmpeq 0c5a
      // 0c2b: goto 0c32
      // 0c2e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0c31: athrow
      // 0c32: aload 0
      // 0c33: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0c36: sipush -19409
      // 0c39: sipush -18998
      // 0c3c: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0c3f: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0c42: aload 0
      // 0c43: sipush 32117
      // 0c46: ldc2_w 1266935714368826016
      // 0c49: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0c4c: putfield com/finalshell/core/A4_3.O I
      // 0c4f: aload 2
      // 0c50: ifnull 00a2
      // 0c53: goto 0c5a
      // 0c56: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0c59: athrow
      // 0c5a: aload 0
      // 0c5b: getfield com/finalshell/core/A4_3.W I
      // 0c5e: sipush 4658
      // 0c61: ldc2_w 6584332778978067951
      // 0c64: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0c67: iand
      // 0c68: aload 2
      // 0c69: ifnonnull 0cb7
      // 0c6c: ifeq 0c9e
      // 0c6f: goto 0c76
      // 0c72: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0c75: athrow
      // 0c76: aload 0
      // 0c77: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0c7a: sipush -19420
      // 0c7d: sipush -9201
      // 0c80: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0c83: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0c86: aload 0
      // 0c87: sipush 32117
      // 0c8a: ldc2_w 1266935714368826016
      // 0c8d: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0c90: putfield com/finalshell/core/A4_3.O I
      // 0c93: aload 2
      // 0c94: ifnull 00a2
      // 0c97: goto 0c9e
      // 0c9a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0c9d: athrow
      // 0c9e: aload 0
      // 0c9f: aload 2
      // 0ca0: ifnonnull 0ccb
      // 0ca3: getfield com/finalshell/core/A4_3.W I
      // 0ca6: sipush 23437
      // 0ca9: ldc2_w 8523780503787113551
      // 0cac: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0caf: iand
      // 0cb0: goto 0cb7
      // 0cb3: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0cb6: athrow
      // 0cb7: ifeq 0cca
      // 0cba: aload 0
      // 0cbb: bipush 2
      // 0cbc: aload 0
      // 0cbd: getfield com/finalshell/core/A4_3.a J
      // 0cc0: invokespecial com/finalshell/core/A4_3.b (IJ)V
      // 0cc3: goto 0cca
      // 0cc6: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0cc9: athrow
      // 0cca: aload 0
      // 0ccb: sipush 3084
      // 0cce: ldc2_w 9186361394830433234
      // 0cd1: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0cd4: putfield com/finalshell/core/A4_3.O I
      // 0cd7: aload 0
      // 0cd8: bipush 4
      // 0cd9: iload 4
      // 0cdb: iload 1
      // 0cdc: invokespecial com/finalshell/core/A4_3.Y (III)I
      // 0cdf: istore 4
      // 0ce1: goto 0cec
      // 0ce4: astore 6
      // 0ce6: aload 6
      // 0ce8: getfield com/finalshell/core/Ik4.Y I
      // 0ceb: ireturn
      // 0cec: aload 0
      // 0ced: aload 2
      // 0cee: ifnonnull 0d11
      // 0cf1: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0cf4: ifnull 0d10
      // 0cf7: goto 0cfe
      // 0cfa: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0cfd: athrow
      // 0cfe: aload 0
      // 0cff: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0d02: aload 0
      // 0d03: getfield com/finalshell/core/A4_3.a J
      // 0d06: invokevirtual com/finalshell/core/DF_2.E (J)V
      // 0d09: goto 0d10
      // 0d0c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0d0f: athrow
      // 0d10: aload 0
      // 0d11: aload 2
      // 0d12: ifnonnull 0d3d
      // 0d15: getfield com/finalshell/core/A4_3.W I
      // 0d18: sipush 15155
      // 0d1b: ldc2_w 6536086958589766860
      // 0d1e: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0d21: iand
      // 0d22: ifeq 0d3c
      // 0d25: goto 0d2c
      // 0d28: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0d2b: athrow
      // 0d2c: aload 0
      // 0d2d: bipush 4
      // 0d2e: aload 0
      // 0d2f: getfield com/finalshell/core/A4_3.a J
      // 0d32: invokespecial com/finalshell/core/A4_3.b (IJ)V
      // 0d35: goto 0d3c
      // 0d38: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0d3b: athrow
      // 0d3c: aload 0
      // 0d3d: sipush 3255
      // 0d40: ldc2_w 3392611941295315827
      // 0d43: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0d46: putfield com/finalshell/core/A4_3.O I
      // 0d49: aload 0
      // 0d4a: bipush 2
      // 0d4b: iload 4
      // 0d4d: iload 1
      // 0d4e: invokespecial com/finalshell/core/A4_3.Y (III)I
      // 0d51: istore 4
      // 0d53: goto 0d5e
      // 0d56: astore 6
      // 0d58: aload 6
      // 0d5a: getfield com/finalshell/core/Ik4.Y I
      // 0d5d: ireturn
      // 0d5e: aload 0
      // 0d5f: aload 2
      // 0d60: ifnonnull 0dae
      // 0d63: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0d66: ifnull 0dad
      // 0d69: goto 0d70
      // 0d6c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0d6f: athrow
      // 0d70: aload 0
      // 0d71: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0d74: aload 0
      // 0d75: getfield com/finalshell/core/A4_3.a J
      // 0d78: l2i
      // 0d79: sipush 22692
      // 0d7c: ldc2_w 6839445763520368510
      // 0d7f: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0d82: iand
      // 0d83: putfield com/finalshell/core/DF_2.c I
      // 0d86: aload 0
      // 0d87: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0d8a: aload 0
      // 0d8b: getfield com/finalshell/core/A4_3.a J
      // 0d8e: l2i
      // 0d8f: sipush 8444
      // 0d92: ldc2_w 6817212859351660315
      // 0d95: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0d98: ishr
      // 0d99: sipush 22692
      // 0d9c: ldc2_w 6839445763520368510
      // 0d9f: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0da2: iand
      // 0da3: putfield com/finalshell/core/DF_2.i I
      // 0da6: goto 0dad
      // 0da9: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0dac: athrow
      // 0dad: aload 0
      // 0dae: aload 2
      // 0daf: ifnonnull 0dda
      // 0db2: getfield com/finalshell/core/A4_3.W I
      // 0db5: sipush 15155
      // 0db8: ldc2_w 6536086958589766860
      // 0dbb: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0dbe: iand
      // 0dbf: ifeq 0dd9
      // 0dc2: goto 0dc9
      // 0dc5: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0dc8: athrow
      // 0dc9: aload 0
      // 0dca: bipush 2
      // 0dcb: aload 0
      // 0dcc: getfield com/finalshell/core/A4_3.a J
      // 0dcf: invokespecial com/finalshell/core/A4_3.b (IJ)V
      // 0dd2: goto 0dd9
      // 0dd5: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0dd8: athrow
      // 0dd9: aload 0
      // 0dda: sipush 15355
      // 0ddd: ldc2_w 5754904432264408106
      // 0de0: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0de3: putfield com/finalshell/core/A4_3.O I
      // 0de6: aload 0
      // 0de7: aload 2
      // 0de8: ifnonnull 0e80
      // 0deb: getfield com/finalshell/core/A4_3.W I
      // 0dee: sipush 31306
      // 0df1: ldc2_w 3940252259571346879
      // 0df4: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0df7: iand
      // 0df8: ifeq 0e78
      // 0dfb: goto 0e02
      // 0dfe: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0e01: athrow
      // 0e02: aload 0
      // 0e03: bipush 2
      // 0e04: iload 4
      // 0e06: iload 1
      // 0e07: invokespecial com/finalshell/core/A4_3.Y (III)I
      // 0e0a: istore 4
      // 0e0c: goto 0e17
      // 0e0f: astore 6
      // 0e11: aload 6
      // 0e13: getfield com/finalshell/core/Ik4.Y I
      // 0e16: ireturn
      // 0e17: aload 0
      // 0e18: aload 2
      // 0e19: ifnonnull 0e49
      // 0e1c: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0e1f: ifnull 0e48
      // 0e22: goto 0e29
      // 0e25: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0e28: athrow
      // 0e29: aload 0
      // 0e2a: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0e2d: aload 0
      // 0e2e: getfield com/finalshell/core/A4_3.a J
      // 0e31: l2i
      // 0e32: sipush 20212
      // 0e35: ldc2_w 6282669335024343304
      // 0e38: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0e3b: iand
      // 0e3c: newarray 8
      // 0e3e: putfield com/finalshell/core/DF_2.L [B
      // 0e41: goto 0e48
      // 0e44: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0e47: athrow
      // 0e48: aload 0
      // 0e49: aload 2
      // 0e4a: ifnonnull 0ea1
      // 0e4d: getfield com/finalshell/core/A4_3.W I
      // 0e50: sipush 15155
      // 0e53: ldc2_w 6536086958589766860
      // 0e56: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0e59: iand
      // 0e5a: ifeq 0ea0
      // 0e5d: goto 0e64
      // 0e60: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0e63: athrow
      // 0e64: aload 0
      // 0e65: bipush 2
      // 0e66: aload 0
      // 0e67: getfield com/finalshell/core/A4_3.a J
      // 0e6a: invokespecial com/finalshell/core/A4_3.b (IJ)V
      // 0e6d: aload 2
      // 0e6e: ifnull 0ea0
      // 0e71: goto 0e78
      // 0e74: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0e77: athrow
      // 0e78: aload 0
      // 0e79: goto 0e80
      // 0e7c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0e7f: athrow
      // 0e80: aload 2
      // 0e81: ifnonnull 0ea1
      // 0e84: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0e87: ifnull 0ea0
      // 0e8a: goto 0e91
      // 0e8d: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0e90: athrow
      // 0e91: aload 0
      // 0e92: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0e95: aconst_null
      // 0e96: putfield com/finalshell/core/DF_2.L [B
      // 0e99: goto 0ea0
      // 0e9c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0e9f: athrow
      // 0ea0: aload 0
      // 0ea1: sipush 8061
      // 0ea4: ldc2_w 2556608508573042837
      // 0ea7: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0eaa: putfield com/finalshell/core/A4_3.O I
      // 0ead: aload 0
      // 0eae: aload 2
      // 0eaf: ifnonnull 0f62
      // 0eb2: getfield com/finalshell/core/A4_3.W I
      // 0eb5: sipush 26720
      // 0eb8: ldc2_w 6606262198121152398
      // 0ebb: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0ebe: iand
      // 0ebf: ifeq 0f61
      // 0ec2: goto 0ec9
      // 0ec5: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0ec8: athrow
      // 0ec9: aload 0
      // 0eca: iload 4
      // 0ecc: iload 1
      // 0ecd: invokespecial com/finalshell/core/A4_3.d (II)I
      // 0ed0: istore 4
      // 0ed2: aload 0
      // 0ed3: aload 2
      // 0ed4: ifnonnull 0eec
      // 0ed7: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0eda: ifnull 0f56
      // 0edd: goto 0ee4
      // 0ee0: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0ee3: athrow
      // 0ee4: aload 0
      // 0ee5: goto 0eec
      // 0ee8: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0eeb: athrow
      // 0eec: getfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 0eef: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 0ef2: astore 6
      // 0ef4: aload 0
      // 0ef5: aconst_null
      // 0ef6: putfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 0ef9: aload 2
      // 0efa: ifnonnull 0f52
      // 0efd: aload 6
      // 0eff: arraylength
      // 0f00: aload 0
      // 0f01: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0f04: getfield com/finalshell/core/DF_2.L [B
      // 0f07: arraylength
      // 0f08: if_icmpne 0f2e
      // 0f0b: goto 0f12
      // 0f0e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0f11: athrow
      // 0f12: aload 6
      // 0f14: bipush 0
      // 0f15: aload 0
      // 0f16: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0f19: getfield com/finalshell/core/DF_2.L [B
      // 0f1c: bipush 0
      // 0f1d: aload 6
      // 0f1f: arraylength
      // 0f20: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f23: aload 2
      // 0f24: ifnull 0f56
      // 0f27: goto 0f2e
      // 0f2a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0f2d: athrow
      // 0f2e: aload 0
      // 0f2f: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 0f32: sipush -19421
      // 0f35: sipush -28680
      // 0f38: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 0f3b: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 0f3e: aload 0
      // 0f3f: sipush 32117
      // 0f42: ldc2_w 1266935714368826016
      // 0f45: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0f48: putfield com/finalshell/core/A4_3.O I
      // 0f4b: goto 0f52
      // 0f4e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0f51: athrow
      // 0f52: aload 2
      // 0f53: ifnull 00a2
      // 0f56: goto 0f82
      // 0f59: astore 6
      // 0f5b: aload 6
      // 0f5d: getfield com/finalshell/core/Ik4.Y I
      // 0f60: ireturn
      // 0f61: aload 0
      // 0f62: aload 2
      // 0f63: ifnonnull 0f83
      // 0f66: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0f69: ifnull 0f82
      // 0f6c: goto 0f73
      // 0f6f: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0f72: athrow
      // 0f73: aload 0
      // 0f74: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0f77: aconst_null
      // 0f78: putfield com/finalshell/core/DF_2.L [B
      // 0f7b: goto 0f82
      // 0f7e: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0f81: athrow
      // 0f82: aload 0
      // 0f83: sipush 5286
      // 0f86: ldc2_w 3720931722568057686
      // 0f89: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0f8c: putfield com/finalshell/core/A4_3.O I
      // 0f8f: aload 0
      // 0f90: aload 2
      // 0f91: ifnonnull 0fec
      // 0f94: getfield com/finalshell/core/A4_3.W I
      // 0f97: sipush 5004
      // 0f9a: ldc2_w 8057696975919891582
      // 0f9d: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0fa0: iand
      // 0fa1: ifeq 0feb
      // 0fa4: goto 0fab
      // 0fa7: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0faa: athrow
      // 0fab: aload 0
      // 0fac: iload 4
      // 0fae: iload 1
      // 0faf: invokespecial com/finalshell/core/A4_3.b (II)I
      // 0fb2: istore 4
      // 0fb4: aload 0
      // 0fb5: aload 2
      // 0fb6: ifnonnull 0fdc
      // 0fb9: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0fbc: ifnull 0fdb
      // 0fbf: goto 0fc6
      // 0fc2: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0fc5: athrow
      // 0fc6: aload 0
      // 0fc7: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0fca: aload 0
      // 0fcb: getfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 0fce: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 0fd1: putfield com/finalshell/core/DF_2.Z [B
      // 0fd4: goto 0fdb
      // 0fd7: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0fda: athrow
      // 0fdb: aload 0
      // 0fdc: aconst_null
      // 0fdd: putfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 0fe0: goto 100c
      // 0fe3: astore 6
      // 0fe5: aload 6
      // 0fe7: getfield com/finalshell/core/Ik4.Y I
      // 0fea: ireturn
      // 0feb: aload 0
      // 0fec: aload 2
      // 0fed: ifnonnull 100d
      // 0ff0: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 0ff3: ifnull 100c
      // 0ff6: goto 0ffd
      // 0ff9: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0ffc: athrow
      // 0ffd: aload 0
      // 0ffe: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 1001: aconst_null
      // 1002: putfield com/finalshell/core/DF_2.Z [B
      // 1005: goto 100c
      // 1008: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 100b: athrow
      // 100c: aload 0
      // 100d: sipush 27816
      // 1010: ldc2_w 6333333479151254338
      // 1013: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 1016: putfield com/finalshell/core/A4_3.O I
      // 1019: aload 0
      // 101a: aload 2
      // 101b: ifnonnull 1076
      // 101e: getfield com/finalshell/core/A4_3.W I
      // 1021: sipush 17939
      // 1024: ldc2_w 4100839962586092028
      // 1027: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 102a: iand
      // 102b: ifeq 1075
      // 102e: goto 1035
      // 1031: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 1034: athrow
      // 1035: aload 0
      // 1036: iload 4
      // 1038: iload 1
      // 1039: invokespecial com/finalshell/core/A4_3.b (II)I
      // 103c: istore 4
      // 103e: aload 0
      // 103f: aload 2
      // 1040: ifnonnull 1066
      // 1043: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 1046: ifnull 1065
      // 1049: goto 1050
      // 104c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 104f: athrow
      // 1050: aload 0
      // 1051: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 1054: aload 0
      // 1055: getfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 1058: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 105b: putfield com/finalshell/core/DF_2.q [B
      // 105e: goto 1065
      // 1061: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 1064: athrow
      // 1065: aload 0
      // 1066: aconst_null
      // 1067: putfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 106a: goto 1096
      // 106d: astore 6
      // 106f: aload 6
      // 1071: getfield com/finalshell/core/Ik4.Y I
      // 1074: ireturn
      // 1075: aload 0
      // 1076: aload 2
      // 1077: ifnonnull 1097
      // 107a: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 107d: ifnull 1096
      // 1080: goto 1087
      // 1083: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 1086: athrow
      // 1087: aload 0
      // 1088: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 108b: aconst_null
      // 108c: putfield com/finalshell/core/DF_2.q [B
      // 108f: goto 1096
      // 1092: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 1095: athrow
      // 1096: aload 0
      // 1097: sipush 16105
      // 109a: ldc2_w 8165030562487003407
      // 109d: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 10a0: putfield com/finalshell/core/A4_3.O I
      // 10a3: aload 0
      // 10a4: aload 2
      // 10a5: ifnonnull 1170
      // 10a8: getfield com/finalshell/core/A4_3.W I
      // 10ab: sipush 15155
      // 10ae: ldc2_w 6536086958589766860
      // 10b1: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 10b4: iand
      // 10b5: ifeq 1161
      // 10b8: goto 10bf
      // 10bb: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 10be: athrow
      // 10bf: aload 0
      // 10c0: bipush 2
      // 10c1: iload 4
      // 10c3: iload 1
      // 10c4: invokespecial com/finalshell/core/A4_3.Y (III)I
      // 10c7: istore 4
      // 10c9: goto 10d4
      // 10cc: astore 6
      // 10ce: aload 6
      // 10d0: getfield com/finalshell/core/Ik4.Y I
      // 10d3: ireturn
      // 10d4: aload 0
      // 10d5: aload 2
      // 10d6: ifnonnull 1104
      // 10d9: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 10dc: ifnull 1103
      // 10df: goto 10e6
      // 10e2: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 10e5: athrow
      // 10e6: aload 0
      // 10e7: getfield com/finalshell/core/A4_3.F Lcom/finalshell/core/DF_2;
      // 10ea: aload 0
      // 10eb: getfield com/finalshell/core/A4_3.a J
      // 10ee: sipush 238
      // 10f1: ldc2_w 2775247064706198100
      // 10f4: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 10f7: land
      // 10f8: l2i
      // 10f9: putfield com/finalshell/core/DF_2.F I
      // 10fc: goto 1103
      // 10ff: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 1102: athrow
      // 1103: aload 0
      // 1104: aload 2
      // 1105: ifnonnull 1170
      // 1108: getfield com/finalshell/core/A4_3.a J
      // 110b: aload 0
      // 110c: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 110f: getfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // 1112: invokeinterface com/finalshell/core/Aj2.u ()J 1
      // 1117: sipush 238
      // 111a: ldc2_w 2775247064706198100
      // 111d: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 1120: land
      // 1121: lcmp
      // 1122: ifeq 1161
      // 1125: goto 112c
      // 1128: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 112b: athrow
      // 112c: aload 0
      // 112d: sipush 32117
      // 1130: ldc2_w 1266935714368826016
      // 1133: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 1136: putfield com/finalshell/core/A4_3.O I
      // 1139: aload 0
      // 113a: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 113d: sipush -19419
      // 1140: sipush -19746
      // 1143: invokestatic com/finalshell/core/A4_3.a (II)Ljava/lang/String;
      // 1146: putfield com/finalshell/core/Df2.t Ljava/lang/String;
      // 1149: aload 0
      // 114a: sipush 6686
      // 114d: ldc2_w 61080495891172813
      // 1150: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 1153: putfield com/finalshell/core/A4_3.V I
      // 1156: aload 2
      // 1157: ifnull 00a2
      // 115a: goto 1161
      // 115d: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 1160: athrow
      // 1161: aload 0
      // 1162: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 1165: new com/finalshell/core/Ue2
      // 1168: dup
      // 1169: invokespecial com/finalshell/core/Ue2.<init> ()V
      // 116c: putfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // 116f: aload 0
      // 1170: sipush 16593
      // 1173: ldc2_w 6164126498226640671
      // 1176: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 1179: putfield com/finalshell/core/A4_3.O I
      // 117c: aload 2
      // 117d: ifnull 00a2
      // 1180: sipush 20936
      // 1183: ldc2_w 7115522834845632053
      // 1186: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 1189: ireturn
   }

   public int I(byte[] var1, int var2) {
      int[] var3 = Nm4.g();
      A4_3 var10000 = this;
      if (var3 == null) {
         if (this.s == null) {
            return a(2035, 7247708505408589868L);
         }

         var10000 = this;
      }

      var8 = var10000.O;
      label50:
      if (var3 == null) {
         if (var10000.O != a(24817, 6086439531815286528L)) {
            var8 = this.y;
            if (var3 != null) {
               break label50;
            }

            if (this.y != 0) {
               return a(2035, 7247708505408589868L);
            }
         }

         var8 = 0;
      }

      int var4 = var8;
      int var5 = var2;
      int var9 = this.O;
      int var10001 = a(23306, 8467786741266091262L);
      if (var3 == null) {
         label35: {
            if (var9 == var10001) {
               long var6 = this.s.e.u();
               this.s.e.C();
               this.s.e.A(var1, 0, var2);
               long var10;
               var9 = (var10 = this.s.e.u() - var6) == 0L ? 0 : (var10 < 0L ? -1 : 1);
               if (var3 != null) {
                  break label35;
               }

               if (var9 != 0) {
                  return a(16117, 6564650233520974105L);
               }
            }

            this.s.e.C();
            var9 = var2;
         }

         if (var3 != null) {
            return var9;
         }

         var10001 = 1 << this.t;
      }

      if (var9 >= var10001) {
         var5 = (1 << this.t) - 1;
         var4 = var2 - var5;
      }

      this.G.b(var1, var4, var5);
      this.O = a(14698, 6846870617226473130L);
      return 0;
   }

   public int D() {
      int[] var1 = Nm4.g();
      A4_3 var10000 = this;
      if (var1 == null) {
         if (this.s == null) {
            return a(20936, 7115522834845632053L);
         }

         var10000 = this;
      }

      int var9 = var10000.O;
      int var10001 = a(15657, 8283836157454772951L);
      if (var1 == null) {
         if (var9 != var10001) {
            this.O = a(32117, 1266935714368826016L);
            this.V = 0;
         }

         var9 = this.s.L;
         var10001 = this.s.L;
      }

      int var2 = var10001;
      if (var1 == null) {
         if (var9 == 0) {
            return a(6953, 5045079500675960048L);
         }

         var9 = this.s.f;
      }

      int var3 = var9;
      int var4 = this.V;

      label80: {
         while (true) {
            if (var2 != 0) {
      A4_3 var10;
               var10 = var4;
               var13 = 4;
               if (var1 != null || var1 != null) {
                  break;
               }

               if (var4 < 4) {
                  label83: {
                     int var11 = this.s.x[var3];
                     if (var1 == null) {
                        if (var11 == H[var4]) {
                           var4++;
                           if (var1 == null) {
                              break label83;
                           }
                        }

                        var11 = this.s.x[var3];
                     }

                     if (var1 == null) {
                        if (var11 != 0) {
                           var4 = 0;
                           if (var1 == null) {
                              break label83;
                           }
                        }

                        var11 = 4 - var4;
                     }

                     var4 = var11;
                  }

                  var3++;
                  var2--;
                  if (var1 == null) {
                     continue;
                  }
               }
            }

            this.s.O = this.s.O + (long)(var3 - this.s.f);
            this.s.f = var3;
            this.s.L = var2;
            var10000 = this;
            if (var1 != null) {
      A4_3 var10;
               break label80;
            }

            this.V = var4;
            var10 = var4;
            var13 = 4;
            break;
         }

         if (var10 != var13) {
            return a(31892, 2187186631325723462L);
         }

         var10000 = this;
      }

      long var5 = var10000.s.O;
      long var7 = this.s.F;
      this.v();
      this.s.O = var5;
      this.s.F = var7;
      this.O = a(16593, 6164126498226640671L);
      return 0;
   }

   public int i() {
      int[] var1 = Nm4.g();
      A4_3 var10000 = this;
      if (var1 == null) {
         if (this.s == null) {
            return a(20936, 7115522834845632053L);
         }

         var10000 = this;
      }

      DC var2 = var10000.G;
      if (var1 == null) {
         if (var10000.G == null) {
            return a(20936, 7115522834845632053L);
         }

         var2 = this.G;
      }

      return var2.F();
   }

   public int Y(int param1, int param2, int param3) throws Ik4 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nm4.g ()[I
      // 003: astore 4
      // 005: aload 0
      // 006: getfield com/finalshell/core/A4_3.U I
      // 009: aload 4
      // 00b: ifnonnull 02e
      // 00e: bipush -1
      // 00f: if_icmpne 02a
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 018: athrow
      // 019: aload 0
      // 01a: iload 1
      // 01b: putfield com/finalshell/core/A4_3.U I
      // 01e: aload 0
      // 01f: lconst_0
      // 020: putfield com/finalshell/core/A4_3.a J
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield com/finalshell/core/A4_3.U I
      // 02e: ifle 0cd
      // 031: aload 0
      // 032: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 035: getfield com/finalshell/core/Df2.L I
      // 038: aload 4
      // 03a: ifnonnull 0ce
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 043: athrow
      // 044: aload 4
      // 046: ifnonnull 068
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 04f: athrow
      // 050: ifne 067
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 059: athrow
      // 05a: new com/finalshell/core/Ik4
      // 05d: dup
      // 05e: iload 2
      // 05f: invokespecial com/finalshell/core/Ik4.<init> (I)V
      // 062: athrow
      // 063: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 066: athrow
      // 067: iload 3
      // 068: istore 2
      // 069: aload 0
      // 06a: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 06d: dup
      // 06e: getfield com/finalshell/core/Df2.L I
      // 071: bipush 1
      // 072: isub
      // 073: putfield com/finalshell/core/Df2.L I
      // 076: aload 0
      // 077: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 07a: dup
      // 07b: getfield com/finalshell/core/Df2.O J
      // 07e: lconst_1
      // 07f: ladd
      // 080: putfield com/finalshell/core/Df2.O J
      // 083: aload 0
      // 084: aload 0
      // 085: getfield com/finalshell/core/A4_3.a J
      // 088: aload 0
      // 089: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 08c: getfield com/finalshell/core/Df2.x [B
      // 08f: aload 0
      // 090: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 093: dup
      // 094: getfield com/finalshell/core/Df2.f I
      // 097: dup_x1
      // 098: bipush 1
      // 099: iadd
      // 09a: putfield com/finalshell/core/Df2.f I
      // 09d: baload
      // 09e: sipush 6288
      // 0a1: ldc2_w 5667599485599567732
      // 0a4: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0a7: iand
      // 0a8: iload 1
      // 0a9: aload 0
      // 0aa: getfield com/finalshell/core/A4_3.U I
      // 0ad: isub
      // 0ae: sipush 8444
      // 0b1: ldc2_w 6817212859351660315
      // 0b4: invokestatic com/finalshell/core/A4_3.a (IJ)I
      // 0b7: imul
      // 0b8: ishl
      // 0b9: i2l
      // 0ba: lor
      // 0bb: putfield com/finalshell/core/A4_3.a J
      // 0be: aload 0
      // 0bf: dup
      // 0c0: getfield com/finalshell/core/A4_3.U I
      // 0c3: bipush 1
      // 0c4: isub
      // 0c5: putfield com/finalshell/core/A4_3.U I
      // 0c8: aload 4
      // 0ca: ifnull 02a
      // 0cd: iload 1
      // 0ce: bipush 2
      // 0cf: aload 4
      // 0d1: ifnonnull 111
      // 0d4: if_icmpne 0fc
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: dup
      // 0e0: getfield com/finalshell/core/A4_3.a J
      // 0e3: sipush 24887
      // 0e6: ldc2_w 2063881861406182274
      // 0e9: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 0ec: land
      // 0ed: putfield com/finalshell/core/A4_3.a J
      // 0f0: aload 4
      // 0f2: ifnull 12d
      // 0f5: goto 0fc
      // 0f8: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 0fb: athrow
      // 0fc: iload 1
      // 0fd: aload 4
      // 0ff: ifnonnull 133
      // 102: goto 109
      // 105: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 108: athrow
      // 109: bipush 4
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 110: athrow
      // 111: if_icmpne 12d
      // 114: aload 0
      // 115: dup
      // 116: getfield com/finalshell/core/A4_3.a J
      // 119: sipush 13615
      // 11c: ldc2_w 1627355144446320529
      // 11f: invokestatic com/finalshell/core/A4_3.c (IJ)J
      // 122: land
      // 123: putfield com/finalshell/core/A4_3.a J
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 12c: athrow
      // 12d: aload 0
      // 12e: bipush -1
      // 12f: putfield com/finalshell/core/A4_3.U I
      // 132: iload 2
      // 133: ireturn
   }

   public int b(int param1, int param2) throws Ik4 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 3
      // 04: aload 0
      // 05: aload 3
      // 06: ifnonnull 1e
      // 09: getfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 0c: ifnonnull 28
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 1d: athrow
      // 1e: new java/io/ByteArrayOutputStream
      // 21: dup
      // 22: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 25: putfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 28: bipush 0
      // 29: istore 4
      // 2b: aload 0
      // 2c: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 2f: getfield com/finalshell/core/Df2.L I
      // 32: ifne 3e
      // 35: new com/finalshell/core/Ik4
      // 38: dup
      // 39: iload 1
      // 3a: invokespecial com/finalshell/core/Ik4.<init> (I)V
      // 3d: athrow
      // 3e: iload 2
      // 3f: istore 1
      // 40: aload 0
      // 41: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 44: dup
      // 45: getfield com/finalshell/core/Df2.L I
      // 48: bipush 1
      // 49: isub
      // 4a: putfield com/finalshell/core/Df2.L I
      // 4d: aload 0
      // 4e: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 51: dup
      // 52: getfield com/finalshell/core/Df2.O J
      // 55: lconst_1
      // 56: ladd
      // 57: putfield com/finalshell/core/Df2.O J
      // 5a: aload 0
      // 5b: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 5e: getfield com/finalshell/core/Df2.x [B
      // 61: aload 0
      // 62: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 65: getfield com/finalshell/core/Df2.f I
      // 68: baload
      // 69: istore 4
      // 6b: iload 4
      // 6d: aload 3
      // 6e: ifnonnull c2
      // 71: ifeq 98
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 7a: athrow
      // 7b: aload 0
      // 7c: getfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 7f: aload 0
      // 80: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 83: getfield com/finalshell/core/Df2.x [B
      // 86: aload 0
      // 87: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 8a: getfield com/finalshell/core/Df2.f I
      // 8d: bipush 1
      // 8e: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 97: athrow
      // 98: aload 0
      // 99: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 9c: getfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // 9f: aload 0
      // a0: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // a3: getfield com/finalshell/core/Df2.x [B
      // a6: aload 0
      // a7: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // aa: getfield com/finalshell/core/Df2.f I
      // ad: bipush 1
      // ae: invokeinterface com/finalshell/core/Aj2.A ([BII)V 4
      // b3: aload 0
      // b4: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // b7: dup
      // b8: getfield com/finalshell/core/Df2.f I
      // bb: bipush 1
      // bc: iadd
      // bd: putfield com/finalshell/core/Df2.f I
      // c0: iload 4
      // c2: ifne 2b
      // c5: iload 1
      // c6: ireturn
   }

   public int d(int param1, int param2) throws Ik4 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nm4.g ()[I
      // 03: astore 3
      // 04: aload 0
      // 05: aload 3
      // 06: ifnonnull 1e
      // 09: getfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 0c: ifnonnull 28
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 1d: athrow
      // 1e: new java/io/ByteArrayOutputStream
      // 21: dup
      // 22: invokespecial java/io/ByteArrayOutputStream.<init> ()V
      // 25: putfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 28: bipush 0
      // 29: istore 4
      // 2b: aload 0
      // 2c: getfield com/finalshell/core/A4_3.a J
      // 2f: lconst_0
      // 30: lcmp
      // 31: ifle da
      // 34: aload 0
      // 35: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 38: getfield com/finalshell/core/Df2.L I
      // 3b: aload 3
      // 3c: ifnonnull db
      // 3f: aload 3
      // 40: ifnonnull 8c
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 49: athrow
      // 4a: ifne 61
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 53: athrow
      // 54: new com/finalshell/core/Ik4
      // 57: dup
      // 58: iload 1
      // 59: invokespecial com/finalshell/core/Ik4.<init> (I)V
      // 5c: athrow
      // 5d: invokestatic com/finalshell/core/A4_3.a (Lcom/finalshell/core/Ik4;)Lcom/finalshell/core/Ik4;
      // 60: athrow
      // 61: iload 2
      // 62: istore 1
      // 63: aload 0
      // 64: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 67: dup
      // 68: getfield com/finalshell/core/Df2.L I
      // 6b: bipush 1
      // 6c: isub
      // 6d: putfield com/finalshell/core/Df2.L I
      // 70: aload 0
      // 71: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 74: dup
      // 75: getfield com/finalshell/core/Df2.O J
      // 78: lconst_1
      // 79: ladd
      // 7a: putfield com/finalshell/core/Df2.O J
      // 7d: aload 0
      // 7e: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 81: getfield com/finalshell/core/Df2.x [B
      // 84: aload 0
      // 85: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 88: getfield com/finalshell/core/Df2.f I
      // 8b: baload
      // 8c: istore 4
      // 8e: aload 0
      // 8f: getfield com/finalshell/core/A4_3.B Ljava/io/ByteArrayOutputStream;
      // 92: aload 0
      // 93: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 96: getfield com/finalshell/core/Df2.x [B
      // 99: aload 0
      // 9a: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // 9d: getfield com/finalshell/core/Df2.f I
      // a0: bipush 1
      // a1: invokevirtual java/io/ByteArrayOutputStream.write ([BII)V
      // a4: aload 0
      // a5: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // a8: getfield com/finalshell/core/Df2.e Lcom/finalshell/core/Aj2;
      // ab: aload 0
      // ac: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // af: getfield com/finalshell/core/Df2.x [B
      // b2: aload 0
      // b3: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // b6: getfield com/finalshell/core/Df2.f I
      // b9: bipush 1
      // ba: invokeinterface com/finalshell/core/Aj2.A ([BII)V 4
      // bf: aload 0
      // c0: getfield com/finalshell/core/A4_3.s Lcom/finalshell/core/Df2;
      // c3: dup
      // c4: getfield com/finalshell/core/Df2.f I
      // c7: bipush 1
      // c8: iadd
      // c9: putfield com/finalshell/core/Df2.f I
      // cc: aload 0
      // cd: dup
      // ce: getfield com/finalshell/core/A4_3.a J
      // d1: lconst_1
      // d2: lsub
      // d3: putfield com/finalshell/core/A4_3.a J
      // d6: aload 3
      // d7: ifnull 2b
      // da: iload 1
      // db: ireturn
   }

   public void b(int var1, long var2) {
      int[] var10000 = Nm4.g();
      int var5 = 0;
      int[] var4 = var10000;

      while (true) {
         if (var5 < var1) {
            this.R[var5] = (byte)((int)(var2 & c(26144, 654664165493460118L)));
            var2 >>= a(8444, 6817212859351660315L);
            var5++;
            if (var4 != null) {
               break;
            }

            if (var4 == null) {
               continue;
            }
         }

         this.s.e.A(this.R, 0, var1);
         break;
      }
   }

   public DF_2 y() {
      return this.F;
   }

   public boolean z() {
      int[] var1 = Nm4.g();
      int var10000 = this.O;
      if (var1 == null) {
         switch (this.O) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
               return true;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            default:
               var10000 = 0;
         }
      }

      return (boolean)var10000;
   }

   static {
      __vfClinit__();
   }

   public static Ik4 a(Ik4 var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -19418) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 97;
               break;
            case 1:
               var10000 = 49;
               break;
            case 2:
               var10000 = 124;
               break;
            case 3:
               var10000 = 134;
               break;
            case 4:
               var10000 = 29;
               break;
            case 5:
               var10000 = 119;
               break;
            case 6:
               var10000 = 74;
               break;
            case 7:
               var10000 = 41;
               break;
            case 8:
               var10000 = 48;
               break;
            case 9:
               var10000 = 128;
               break;
            case 10:
               var10000 = 115;
               break;
            case 11:
               var10000 = 130;
               break;
            case 12:
               var10000 = 199;
               break;
            case 13:
               var10000 = 239;
               break;
            case 14:
               var10000 = 186;
               break;
            case 15:
               var10000 = 191;
               break;
            case 16:
               var10000 = 100;
               break;
            case 17:
               var10000 = 94;
               break;
            case 18:
               var10000 = 83;
               break;
            case 19:
               var10000 = 151;
               break;
            case 20:
               var10000 = 107;
               break;
            case 21:
               var10000 = 234;
               break;
            case 22:
               var10000 = 86;
               break;
            case 23:
               var10000 = 114;
               break;
            case 24:
               var10000 = 84;
               break;
            case 25:
               var10000 = 16;
               break;
            case 26:
               var10000 = 109;
               break;
            case 27:
               var10000 = 3;
               break;
            case 28:
               var10000 = 10;
               break;
            case 29:
               var10000 = 14;
               break;
            case 30:
               var10000 = 24;
               break;
            case 31:
               var10000 = 254;
               break;
            case 32:
               var10000 = 38;
               break;
            case 33:
               var10000 = 58;
               break;
            case 34:
               var10000 = 64;
               break;
            case 35:
               var10000 = 154;
               break;
            case 36:
               var10000 = 157;
               break;
            case 37:
               var10000 = 4;
               break;
            case 38:
               var10000 = 232;
               break;
            case 39:
               var10000 = 222;
               break;
            case 40:
               var10000 = 8;
               break;
            case 41:
               var10000 = 47;
               break;
            case 42:
               var10000 = 69;
               break;
            case 43:
               var10000 = 212;
               break;
            case 44:
               var10000 = 206;
               break;
            case 45:
               var10000 = 164;
               break;
            case 46:
               var10000 = 185;
               break;
            case 47:
               var10000 = 135;
               break;
            case 48:
               var10000 = 34;
               break;
            case 49:
               var10000 = 56;
               break;
            case 50:
               var10000 = 231;
               break;
            case 51:
               var10000 = 175;
               break;
            case 52:
               var10000 = 220;
               break;
            case 53:
               var10000 = 246;
               break;
            case 54:
               var10000 = 60;
               break;
            case 55:
               var10000 = 233;
               break;
            case 56:
               var10000 = 53;
               break;
            case 57:
               var10000 = 176;
               break;
            case 58:
               var10000 = 113;
               break;
            case 59:
               var10000 = 75;
               break;
            case 60:
               var10000 = 20;
               break;
            case 61:
               var10000 = 208;
               break;
            case 62:
               var10000 = 183;
               break;
            case 63:
               var10000 = 68;
               break;
            case 64:
               var10000 = 76;
               break;
            case 65:
               var10000 = 120;
               break;
            case 66:
               var10000 = 198;
               break;
            case 67:
               var10000 = 129;
               break;
            case 68:
               var10000 = 125;
               break;
            case 69:
               var10000 = 90;
               break;
            case 70:
               var10000 = 12;
               break;
            case 71:
               var10000 = 26;
               break;
            case 72:
               var10000 = 190;
               break;
            case 73:
               var10000 = 85;
               break;
            case 74:
               var10000 = 133;
               break;
            case 75:
               var10000 = 170;
               break;
            case 76:
               var10000 = 104;
               break;
            case 77:
               var10000 = 11;
               break;
            case 78:
               var10000 = 235;
               break;
            case 79:
               var10000 = 219;
               break;
            case 80:
               var10000 = 126;
               break;
            case 81:
               var10000 = 247;
               break;
            case 82:
               var10000 = 150;
               break;
            case 83:
               var10000 = 105;
               break;
            case 84:
               var10000 = 227;
               break;
            case 85:
               var10000 = 116;
               break;
            case 86:
               var10000 = 193;
               break;
            case 87:
               var10000 = 178;
               break;
            case 88:
               var10000 = 103;
               break;
            case 89:
               var10000 = 214;
               break;
            case 90:
               var10000 = 78;
               break;
            case 91:
               var10000 = 117;
               break;
            case 92:
               var10000 = 54;
               break;
            case 93:
               var10000 = 148;
               break;
            case 94:
               var10000 = 37;
               break;
            case 95:
               var10000 = 253;
               break;
            case 96:
               var10000 = 31;
               break;
            case 97:
               var10000 = 42;
               break;
            case 98:
               var10000 = 236;
               break;
            case 99:
               var10000 = 152;
               break;
            case 100:
               var10000 = 2;
               break;
            case 101:
               var10000 = 91;
               break;
            case 102:
               var10000 = 161;
               break;
            case 103:
               var10000 = 165;
               break;
            case 104:
               var10000 = 250;
               break;
            case 105:
               var10000 = 200;
               break;
            case 106:
               var10000 = 0;
               break;
            case 107:
               var10000 = 248;
               break;
            case 108:
               var10000 = 21;
               break;
            case 109:
               var10000 = 177;
               break;
            case 110:
               var10000 = 61;
               break;
            case 111:
               var10000 = 207;
               break;
            case 112:
               var10000 = 136;
               break;
            case 113:
               var10000 = 230;
               break;
            case 114:
               var10000 = 226;
               break;
            case 115:
               var10000 = 172;
               break;
            case 116:
               var10000 = 179;
               break;
            case 117:
               var10000 = 71;
               break;
            case 118:
               var10000 = 162;
               break;
            case 119:
               var10000 = 131;
               break;
            case 120:
               var10000 = 237;
               break;
            case 121:
               var10000 = 57;
               break;
            case 122:
               var10000 = 1;
               break;
            case 123:
               var10000 = 23;
               break;
            case 124:
               var10000 = 156;
               break;
            case 125:
               var10000 = 140;
               break;
            case 126:
               var10000 = 203;
               break;
            case 127:
               var10000 = 211;
               break;
            case 128:
               var10000 = 173;
               break;
            case 129:
               var10000 = 251;
               break;
            case 130:
               var10000 = 45;
               break;
            case 131:
               var10000 = 63;
               break;
            case 132:
               var10000 = 17;
               break;
            case 133:
               var10000 = 122;
               break;
            case 134:
               var10000 = 50;
               break;
            case 135:
               var10000 = 245;
               break;
            case 136:
               var10000 = 89;
               break;
            case 137:
               var10000 = 32;
               break;
            case 138:
               var10000 = 99;
               break;
            case 139:
               var10000 = 13;
               break;
            case 140:
               var10000 = 187;
               break;
            case 141:
               var10000 = 123;
               break;
            case 142:
               var10000 = 238;
               break;
            case 143:
               var10000 = 88;
               break;
            case 144:
               var10000 = 252;
               break;
            case 145:
               var10000 = 55;
               break;
            case 146:
               var10000 = 210;
               break;
            case 147:
               var10000 = 194;
               break;
            case 148:
               var10000 = 92;
               break;
            case 149:
               var10000 = 159;
               break;
            case 150:
               var10000 = 35;
               break;
            case 151:
               var10000 = 149;
               break;
            case 152:
               var10000 = 209;
               break;
            case 153:
               var10000 = 244;
               break;
            case 154:
               var10000 = 46;
               break;
            case 155:
               var10000 = 139;
               break;
            case 156:
               var10000 = 93;
               break;
            case 157:
               var10000 = 39;
               break;
            case 158:
               var10000 = 201;
               break;
            case 159:
               var10000 = 202;
               break;
            case 160:
               var10000 = 73;
               break;
            case 161:
               var10000 = 166;
               break;
            case 162:
               var10000 = 205;
               break;
            case 163:
               var10000 = 62;
               break;
            case 164:
               var10000 = 215;
               break;
            case 165:
               var10000 = 101;
               break;
            case 166:
               var10000 = 163;
               break;
            case 167:
               var10000 = 228;
               break;
            case 168:
               var10000 = 81;
               break;
            case 169:
               var10000 = 189;
               break;
            case 170:
               var10000 = 98;
               break;
            case 171:
               var10000 = 96;
               break;
            case 172:
               var10000 = 108;
               break;
            case 173:
               var10000 = 184;
               break;
            case 174:
               var10000 = 137;
               break;
            case 175:
               var10000 = 80;
               break;
            case 176:
               var10000 = 19;
               break;
            case 177:
               var10000 = 5;
               break;
            case 178:
               var10000 = 40;
               break;
            case 179:
               var10000 = 195;
               break;
            case 180:
               var10000 = 70;
               break;
            case 181:
               var10000 = 144;
               break;
            case 182:
               var10000 = 224;
               break;
            case 183:
               var10000 = 27;
               break;
            case 184:
               var10000 = 25;
               break;
            case 185:
               var10000 = 255;
               break;
            case 186:
               var10000 = 66;
               break;
            case 187:
               var10000 = 221;
               break;
            case 188:
               var10000 = 147;
               break;
            case 189:
               var10000 = 243;
               break;
            case 190:
               var10000 = 196;
               break;
            case 191:
               var10000 = 168;
               break;
            case 192:
               var10000 = 112;
               break;
            case 193:
               var10000 = 33;
               break;
            case 194:
               var10000 = 72;
               break;
            case 195:
               var10000 = 30;
               break;
            case 196:
               var10000 = 158;
               break;
            case 197:
               var10000 = 15;
               break;
            case 198:
               var10000 = 52;
               break;
            case 199:
               var10000 = 155;
               break;
            case 200:
               var10000 = 6;
               break;
            case 201:
               var10000 = 118;
               break;
            case 202:
               var10000 = 142;
               break;
            case 203:
               var10000 = 51;
               break;
            case 204:
               var10000 = 59;
               break;
            case 205:
               var10000 = 141;
               break;
            case 206:
               var10000 = 110;
               break;
            case 207:
               var10000 = 241;
               break;
            case 208:
               var10000 = 82;
               break;
            case 209:
               var10000 = 180;
               break;
            case 210:
               var10000 = 216;
               break;
            case 211:
               var10000 = 229;
               break;
            case 212:
               var10000 = 138;
               break;
            case 213:
               var10000 = 143;
               break;
            case 214:
               var10000 = 146;
               break;
            case 215:
               var10000 = 87;
               break;
            case 216:
               var10000 = 182;
               break;
            case 217:
               var10000 = 28;
               break;
            case 218:
               var10000 = 192;
               break;
            case 219:
               var10000 = 67;
               break;
            case 220:
               var10000 = 7;
               break;
            case 221:
               var10000 = 77;
               break;
            case 222:
               var10000 = 44;
               break;
            case 223:
               var10000 = 36;
               break;
            case 224:
               var10000 = 169;
               break;
            case 225:
               var10000 = 213;
               break;
            case 226:
               var10000 = 22;
               break;
            case 227:
               var10000 = 153;
               break;
            case 228:
               var10000 = 171;
               break;
            case 229:
               var10000 = 174;
               break;
            case 230:
               var10000 = 160;
               break;
            case 231:
               var10000 = 240;
               break;
            case 232:
               var10000 = 95;
               break;
            case 233:
               var10000 = 218;
               break;
            case 234:
               var10000 = 43;
               break;
            case 235:
               var10000 = 111;
               break;
            case 236:
               var10000 = 223;
               break;
            case 237:
               var10000 = 242;
               break;
            case 238:
               var10000 = 167;
               break;
            case 239:
               var10000 = 249;
               break;
            case 240:
               var10000 = 79;
               break;
            case 241:
               var10000 = 65;
               break;
            case 242:
               var10000 = 188;
               break;
            case 243:
               var10000 = 121;
               break;
            case 244:
               var10000 = 204;
               break;
            case 245:
               var10000 = 225;
               break;
            case 246:
               var10000 = 127;
               break;
            case 247:
               var10000 = 106;
               break;
            case 248:
               var10000 = 18;
               break;
            case 249:
               var10000 = 181;
               break;
            case 250:
               var10000 = 9;
               break;
            case 251:
               var10000 = 132;
               break;
            case 252:
               var10000 = 217;
               break;
            case 253:
               var10000 = 197;
               break;
            case 254:
               var10000 = 145;
               break;
            default:
               var10000 = 102;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22518;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   public static long c(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 10940) & 32767;
      if (g[var3] == null) {
         g[var3] = f[var3] ^ var1;
      }

      return g[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[12];
      int var19 = 0;
      String var18 = "ÔÍ0\u0017ß¯\u001a\u008a}óS\u009fKg\u0093A³ Ô\u001b\u0014Õ\u001c\u0010-Ûè\u009abmîQ<\u000b\u0013\u009bÏ²ñô!\u0018\u0093ûOÐ$sÐ÷R2,O\u0010ËË ¼½µ4¥Èvý\u0013¿è~ÒC}9Ðòû ¹ô<\u0097xËCO\u0016\u001c®){ü\"~;ñÅÊ]k½\u009a×\u0004\u009eh\u0004³\u0002\u0016åa{#F\u0085Í\u0095¡#}\u008dÝ!6fÏïÒî5\u001e\u000f\u007f\b¤ÎÙèÎ¶j=º)\tL5\u0013¥¯\u000bU\u00113\u001f\"ÿ\u0084j\u0014<¥\u0005Ý`¾\u0089\u0016z\u0017åLeÄMç\u0097^\u0002.ùÐ7\u0003\u0082]¸|©\r\u001aäÄ¡7ù\u008fkh.ËÅ/·F\u0099ñÊ.×Ú\u008c:¦k#È";
      int var20 = "ÔÍ0\u0017ß¯\u001a\u008a}óS\u009fKg\u0093A³ Ô\u001b\u0014Õ\u001c\u0010-Ûè\u009abmîQ<\u000b\u0013\u009bÏ²ñô!\u0018\u0093ûOÐ$sÐ÷R2,O\u0010ËË ¼½µ4¥Èvý\u0013¿è~ÒC}9Ðòû ¹ô<\u0097xËCO\u0016\u001c®){ü\"~;ñÅÊ]k½\u009a×\u0004\u009eh\u0004³\u0002\u0016åa{#F\u0085Í\u0095¡#}\u008dÝ!6fÏïÒî5\u001e\u000f\u007f\b¤ÎÙèÎ¶j=º)\tL5\u0013¥¯\u000bU\u00113\u001f\"ÿ\u0084j\u0014<¥\u0005Ý`¾\u0089\u0016z\u0017åLeÄMç\u0097^\u0002.ùÐ7\u0003\u0082]¸|©\r\u001aäÄ¡7ù\u008fkh.ËÅ/·F\u0099ñÊ.×Ú\u008c:¦k#È"
         .length();
      char var17 = 20;
      int var26 = -1;

      label88:
      while (true) {
         byte var10000 = 4;
         String var10001 = var18.substring(++var26, var26 + var17);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var54 = var10001.toCharArray();
               int var10004 = var54.length;
               int var22 = 0;
               byte var57 = var10000;
               var46 = var54;
               int var34 = var10004;
               byte var66;
               char[] var74;
               int var10006;
               if (var10004 <= 1) {
                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               } else {
                  var57 = var10000;
                  var34 = var10004;
                  if (var10004 <= var22) {
                     break label83;
                  }

                  var74 = var54;
                  var66 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var83 = var74[var10006];
                  byte var84;
                  switch (var22 % 7) {
                     case 0:
                        var84 = 10;
                        break;
                     case 1:
                        var84 = 36;
                        break;
                     case 2:
                        var84 = 72;
                        break;
                     case 3:
                        var84 = 98;
                        break;
                     case 4:
                        var84 = 41;
                        break;
                     case 5:
                        var84 = 117;
                        break;
                     default:
                        var84 = 25;
                  }

                  var74[var10006] = (char)(var83 ^ var66 ^ var84);
                  var22++;
                  if (var57 == 0) {
                     var10006 = var57;
                     var74 = var46;
                     var66 = var57;
                  } else {
                     if (var34 <= var22) {
                        break;
                     }

                     var74 = var46;
                     var66 = var57;
                     var10006 = var22;
                  }
               }
            }

            String var59 = new String(var46).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var59;
                  if ((var26 += var17) >= var20) {
                     b = var21;
                     c = new String[12];
                     long var8 = 2241097446209005461L;
                     long[] var14 = new long[59];
                     int var11 = 0;
                     String var12 = "F9\u0010ÂG=\u0098\u0002Ë\u009d<\u00827èÐlB}\u008f\u0085®¿+mÎ)¨c%|\u008e*¹uz}¡#kë\u0090%\rNzk¯rJ\u0003ÿ_\u0011td×yõ\u009c\u0091$ì\u0010\u0093eÕ¯\u0003\u0092òMO×¤Gfo\u009cÉY³C¬TÇ\u000fÁbpÒÈ\u0000\u0089\u008aÞ^\u0081Õ\u0013¥\u0080(S&Çk~\u0010Po4³Y\rå\u000e*\u0084X\u0087è©n®ÇH©ûfWª\nµlN\u008c\u00812Ü¤\u0013³Ð\u0086\u0091\u0007´]Ð\u000bè\u001e¯2?&\u0006ÿÄ\fê7Ê;Ë÷Xô^.²©½=Ù\\I¸ùÒ¤©ÿçÙ÷×jÉëhåKaÓèXH\u009c\u001b\u0018ëþáæù&i/\u0015\u009f\u0003 \u001e±qÖ\bdô\u0015h\u009behèá\u009d\u0088´\u009cÂÏ¸\u0080Xvm\u0011}ì\u0012é\u008b{no\u0013\u0017r/Óã\u000f\u0080MçA\u0089Ä={X\b=\u00178Ìî\u0000\u001b±\u000b¡4Ï¼v;\u0099L\u009b\u0096ß<g\r8\u0098\u0005~\u00142\ns.ÿPµÓÈ\u001eê]ò`¹Õ=\u0092\u001aà±\u0017ÏÖÅ\"K\u00adP\u0019w¶\u0081h|WM¨éfOÙ\u0088G\u0011îç*\u0086\u0006é\u0001þþ\u0085Ô\u0011 \u0082zcH£â¿|(\u0014P\u000b¤\u000eôç®ú\u0083\u0019\u0098\u0019ÍOó¨ X\u008aFvÈ\u0014\u009eò´i1\u0086\u008e'W²i\u001c_°C¨á)\u009adh\u0011õ|÷\u001fÍå\u008b\u009cÁ\f\u0081\u0092\r±øëó)Ú \u0011à¸\"ß\u009fYÃ\nÒ\u00136\u0085I8Ê\u001aÕxÂþ+V\u008e\u008e±\u0086Á\r°\u008d";
                     int var13 = "F9\u0010ÂG=\u0098\u0002Ë\u009d<\u00827èÐlB}\u008f\u0085®¿+mÎ)¨c%|\u008e*¹uz}¡#kë\u0090%\rNzk¯rJ\u0003ÿ_\u0011td×yõ\u009c\u0091$ì\u0010\u0093eÕ¯\u0003\u0092òMO×¤Gfo\u009cÉY³C¬TÇ\u000fÁbpÒÈ\u0000\u0089\u008aÞ^\u0081Õ\u0013¥\u0080(S&Çk~\u0010Po4³Y\rå\u000e*\u0084X\u0087è©n®ÇH©ûfWª\nµlN\u008c\u00812Ü¤\u0013³Ð\u0086\u0091\u0007´]Ð\u000bè\u001e¯2?&\u0006ÿÄ\fê7Ê;Ë÷Xô^.²©½=Ù\\I¸ùÒ¤©ÿçÙ÷×jÉëhåKaÓèXH\u009c\u001b\u0018ëþáæù&i/\u0015\u009f\u0003 \u001e±qÖ\bdô\u0015h\u009behèá\u009d\u0088´\u009cÂÏ¸\u0080Xvm\u0011}ì\u0012é\u008b{no\u0013\u0017r/Óã\u000f\u0080MçA\u0089Ä={X\b=\u00178Ìî\u0000\u001b±\u000b¡4Ï¼v;\u0099L\u009b\u0096ß<g\r8\u0098\u0005~\u00142\ns.ÿPµÓÈ\u001eê]ò`¹Õ=\u0092\u001aà±\u0017ÏÖÅ\"K\u00adP\u0019w¶\u0081h|WM¨éfOÙ\u0088G\u0011îç*\u0086\u0006é\u0001þþ\u0085Ô\u0011 \u0082zcH£â¿|(\u0014P\u000b¤\u000eôç®ú\u0083\u0019\u0098\u0019ÍOó¨ X\u008aFvÈ\u0014\u009eò´i1\u0086\u008e'W²i\u001c_°C¨á)\u009adh\u0011õ|÷\u001fÍå\u008b\u009cÁ\f\u0081\u0092\r±øëó)Ú \u0011à¸\"ß\u009fYÃ\nÒ\u00136\u0085I8Ê\u001aÕxÂþ+V\u008e\u008e±\u0086Á\r°\u008d"
                        .length();
                     byte var10 = 0;

                     label62:
                     while (true) {
                        byte var36 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var36, var10).getBytes("ISO-8859-1");
                        long[] var28 = var14;
                        int var37 = var11++;
                        long var50 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var71 = var50 ^ var8;
                           switch (var60) {
                              case 0:
                                 var28[var37] = var71;
                                 if (var10 >= var13) {
                                    d = var14;
                                    e = new Integer[59];
                                    long var0 = 6075897820323748396L;
                                    long[] var6 = new long[16];
                                    int var3 = 0;
                                    String var4 = ")«ê+Z¾©\u001fC7\u001a\u008d¹^hABÄj\u0001\u0004(úB(õ\u0014\u009e\u009ez\u00adã5©\u0006N\u0019È\r\u0097uµü~#Å\u0012ÈrÒD`\u00185O\u0087+!¸Û\u000f\u0019Î\u0080?\u007f\u009c\u000e÷\u008b\u0081ÊHõ\u008d~p\u008b®Q]D9w@\u009dÖE.åÊ\f{J¶j\u0090è\u0085uÎý_e%~ì\u009bBè2K";
                                    int var5 = ")«ê+Z¾©\u001fC7\u001a\u008d¹^hABÄj\u0001\u0004(úB(õ\u0014\u009e\u009ez\u00adã5©\u0006N\u0019È\r\u0097uµü~#Å\u0012ÈrÒD`\u00185O\u0087+!¸Û\u000f\u0019Î\u0080?\u007f\u009c\u000e÷\u008b\u0081ÊHõ\u008d~p\u008b®Q]D9w@\u009dÖE.åÊ\f{J¶j\u0090è\u0085uÎý_e%~ì\u009bBè2K"
                                       .length();
                                    byte var2 = 0;

                                    label52:
                                    while (true) {
                                       byte var39 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                                       long[] var29 = var6;
                                       int var40 = var3++;
                                       long var52 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var62 = -1;

                                       while (true) {
                                          var71 = var52 ^ var0;
                                          switch (var62) {
                                             case 0:
                                                var29[var40] = var71;
                                                if (var2 >= var5) {
                                                   f = var6;
                                                   g = new Long[16];
                                                   H = new byte[]{0, 0, -1, -1};
                                                   return;
                                                }
                                                break;
                                             default:
                                                var29[var40] = var71;
                                                if (var2 < var5) {
                                                   continue label52;
                                                }

                                                var4 = "Ð¡\u0012|^c$n\u0018\u0007øEf\u0080Fá";
                                                var5 = "Ð¡\u0012|^c$n\u0018\u0007øEf\u0080Fá".length();
                                                var2 = 0;
                                          }

                                          byte var41 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                                          var29 = var6;
                                          var40 = var3++;
                                          var52 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var62 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var28[var37] = var71;
                                 if (var10 < var13) {
                                    continue label62;
                                 }

                                 var12 = "\u0007b¥\u0096 ºãm^½Ë\u0099&S\\\u0081";
                                 var13 = "\u0007b¥\u0096 ºãm^½Ë\u0099&S\\\u0081".length();
                                 var10 = 0;
                           }

                           byte var38 = var10;
                           var10 += 8;
                           var15 = var12.substring(var38, var10).getBytes("ISO-8859-1");
                           var28 = var14;
                           var37 = var11++;
                           var50 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var26);
                  break;
               default:
                  var21[var19++] = var59;
                  if ((var26 += var17) < var20) {
                     var17 = var18.charAt(var26);
                     continue label88;
                  }

                  var18 = "ù¦Ç¾ð{\u008f3we+?¯\u0081_Ì×L±S\u0085ÎB0zf\u0016\u008cRþ!Ã¬\\/p\u0082;p\u001bÞ®\u0007t\u0018£\u0011\u000fe";
                  var20 = "ù¦Ç¾ð{\u008f3we+?¯\u0081_Ì×L±S\u0085ÎB0zf\u0016\u008cRþ!Ã¬\\/p\u0082;p\u001bÞ®\u0007t\u0018£\u0011\u000fe".length();
                  var17 = 26;
                  var26 = -1;
            }

            var10000 = 72;
            var10001 = var18.substring(++var26, var26 + var17);
            var10002 = 0;
         }
      }
   }
}






