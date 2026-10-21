package com.finalshell.core;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Nj4 extends Nv4 implements Ak2 {
   public final Nc2[] h;
   public final Nc2[] b;
   public final Zzzzd4BeanInfo j;
   public transient volatile long[] i;
   public transient volatile short[] w;
   public static String[] a;
   public static String[] c;
   public static long[] e;
   public static Integer[] f;

   public Nj4(java.lang.Class var1) {
      this(var1, (Map)null);
   }

   public Nj4(java.lang.Class var1, String[] var2) {
      this(var1, N(var2));
   }

   public static Map N(String[] var0) {
      HashMap var8;
      String var10000 = Nv4.o();
      HashMap var2 = new HashMap();
      String[] var3 = var0;
      String var1 = var10000;
      int var4 = var0.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            String var6 = var3[var5];

            try {
               var8 = var2;
               if (var1 == null) {
                  break;
               }

               var2.put(var6, var6);
               var5++;
               if (var1 != null) {
                  continue;
               }
            } catch (Hi2 var7) {
               throw a(var7);
            }
         }

         var8 = var2;
         break;
      }

      return var8;
   }

   public O4 j() {
      return this.j.L;
   }

   public java.lang.Class p() {
      return this.j.x;
   }

   public Nj4(java.lang.Class var1, Map var2) {
      this(B8_2.L(var1, var2, null));
   }

   public Nj4(Zzzzd4BeanInfo param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 0
      // 004: invokespecial com/finalshell/core/Nv4.<init> ()V
      // 007: aload 0
      // 008: aload 1
      // 009: putfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 00c: astore 2
      // 00d: aload 0
      // 00e: aload 1
      // 00f: getfield com/finalshell/core/Zzzzd4BeanInfo.D [Lcom/finalshell/core/Ph2;
      // 012: arraylength
      // 013: anewarray 84
      // 016: putfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 019: bipush 0
      // 01a: istore 3
      // 01b: iload 3
      // 01c: aload 0
      // 01d: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 020: arraylength
      // 021: if_icmpge 04d
      // 024: aload 0
      // 025: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 028: iload 3
      // 029: new com/finalshell/core/Nc2
      // 02c: dup
      // 02d: aload 1
      // 02e: getfield com/finalshell/core/Zzzzd4BeanInfo.x Ljava/lang/Class;
      // 031: aload 1
      // 032: getfield com/finalshell/core/Zzzzd4BeanInfo.D [Lcom/finalshell/core/Ph2;
      // 035: iload 3
      // 036: aaload
      // 037: invokespecial com/finalshell/core/Nc2.<init> (Ljava/lang/Class;Lcom/finalshell/core/Ph2;)V
      // 03a: aastore
      // 03b: iinc 3 1
      // 03e: aload 2
      // 03f: ifnull 079
      // 042: aload 2
      // 043: ifnonnull 01b
      // 046: goto 04d
      // 049: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04c: athrow
      // 04d: aload 1
      // 04e: getfield com/finalshell/core/Zzzzd4BeanInfo.b [Lcom/finalshell/core/Ph2;
      // 051: aload 1
      // 052: getfield com/finalshell/core/Zzzzd4BeanInfo.D [Lcom/finalshell/core/Ph2;
      // 055: if_acmpne 06b
      // 058: aload 0
      // 059: aload 0
      // 05a: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 05d: putfield com/finalshell/core/Nj4.h [Lcom/finalshell/core/Nc2;
      // 060: aload 2
      // 061: ifnonnull 0eb
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: aload 0
      // 06c: aload 1
      // 06d: getfield com/finalshell/core/Zzzzd4BeanInfo.b [Lcom/finalshell/core/Ph2;
      // 070: arraylength
      // 071: anewarray 84
      // 074: putfield com/finalshell/core/Nj4.h [Lcom/finalshell/core/Nc2;
      // 077: bipush 0
      // 078: istore 3
      // 079: bipush 0
      // 07a: istore 4
      // 07c: iload 4
      // 07e: aload 0
      // 07f: getfield com/finalshell/core/Nj4.h [Lcom/finalshell/core/Nc2;
      // 082: arraylength
      // 083: if_icmpge 0ce
      // 086: aload 0
      // 087: aload 1
      // 088: getfield com/finalshell/core/Zzzzd4BeanInfo.b [Lcom/finalshell/core/Ph2;
      // 08b: iload 4
      // 08d: aaload
      // 08e: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 091: invokevirtual com/finalshell/core/Nj4.d (Ljava/lang/String;)Lcom/finalshell/core/Nc2;
      // 094: astore 5
      // 096: aload 2
      // 097: ifnull 0eb
      // 09a: aload 2
      // 09b: ifnull 0ca
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 5
      // 0a7: ifnonnull 0b7
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: bipush 1
      // 0b2: istore 3
      // 0b3: aload 2
      // 0b4: ifnonnull 0ce
      // 0b7: aload 0
      // 0b8: getfield com/finalshell/core/Nj4.h [Lcom/finalshell/core/Nc2;
      // 0bb: iload 4
      // 0bd: aload 5
      // 0bf: aastore
      // 0c0: iinc 4 1
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: aload 2
      // 0cb: ifnonnull 07c
      // 0ce: iload 3
      // 0cf: ifeq 0eb
      // 0d2: aload 0
      // 0d3: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 0d6: bipush 0
      // 0d7: aload 0
      // 0d8: getfield com/finalshell/core/Nj4.h [Lcom/finalshell/core/Nc2;
      // 0db: bipush 0
      // 0dc: aload 0
      // 0dd: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 0e0: arraylength
      // 0e1: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: aload 1
      // 0ec: getfield com/finalshell/core/Zzzzd4BeanInfo.L Lcom/finalshell/core/O4;
      // 0ef: aload 2
      // 0f0: ifnull 108
      // 0f3: ifnull 149
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: aload 1
      // 0fe: getfield com/finalshell/core/Zzzzd4BeanInfo.L Lcom/finalshell/core/O4;
      // 101: goto 108
      // 104: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: invokeinterface com/finalshell/core/O4.s ()[Ljava/lang/Class; 1
      // 10d: astore 3
      // 10e: aload 3
      // 10f: arraylength
      // 110: istore 4
      // 112: bipush 0
      // 113: istore 5
      // 115: iload 5
      // 117: iload 4
      // 119: if_icmpge 149
      // 11c: aload 3
      // 11d: iload 5
      // 11f: aaload
      // 120: astore 6
      // 122: aload 6
      // 124: bipush 0
      // 125: anewarray 117
      // 128: invokevirtual java/lang/Class.getConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 12b: bipush 0
      // 12c: anewarray 123
      // 12f: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 132: checkcast com/finalshell/core/Wr4
      // 135: astore 7
      // 137: aload 0
      // 138: aload 7
      // 13a: invokevirtual com/finalshell/core/Nj4.a (Lcom/finalshell/core/Wr4;)V
      // 13d: goto 142
      // 140: astore 7
      // 142: iinc 5 1
      // 145: aload 2
      // 146: ifnonnull 115
      // 149: return
   }

   public void F(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      this.u(var1, var2, var3, var4, var5);
   }

   public void Q(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      this.u(var1, var2, var3, var4, var5);
   }

   public void z(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      this.u(var1, var2, var3, var4, var5);
   }

   @Override
   public void u(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      this.z(var1, var2, var3, var4, var5, false);
   }

   public void s(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      this.z(var1, var2, var3, var4, var5, false);
   }

   public void z(NL3 param1, Object param2, Object param3, Type param4, int param5, boolean param6) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 0003: aload 1
      // 0004: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 0007: astore 8
      // 0009: astore 7
      // 000b: aload 7
      // 000d: ifnull 0027
      // 0010: aload 2
      // 0011: ifnonnull 0028
      // 0014: goto 001b
      // 0017: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 001a: athrow
      // 001b: aload 8
      // 001d: invokevirtual com/finalshell/io/YM3.Y ()V
      // 0020: goto 0027
      // 0023: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0026: athrow
      // 0027: return
      // 0028: aload 0
      // 0029: aload 1
      // 002a: aload 2
      // 002b: iload 5
      // 002d: invokevirtual com/finalshell/core/Nj4.e (Lcom/finalshell/core/NL3;Ljava/lang/Object;I)Z
      // 0030: aload 7
      // 0032: ifnull 0045
      // 0035: ifeq 0040
      // 0038: goto 003f
      // 003b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 003e: athrow
      // 003f: return
      // 0040: aload 8
      // 0042: getfield com/finalshell/io/YM3.K Z
      // 0045: ifeq 0053
      // 0048: aload 0
      // 0049: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 004c: astore 9
      // 004e: aload 7
      // 0050: ifnonnull 0059
      // 0053: aload 0
      // 0054: getfield com/finalshell/core/Nj4.h [Lcom/finalshell/core/Nc2;
      // 0057: astore 9
      // 0059: aload 1
      // 005a: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 005d: astore 10
      // 005f: aload 0
      // 0060: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 0063: getfield com/finalshell/core/Zzzzd4BeanInfo.x Ljava/lang/Class;
      // 0066: invokevirtual java/lang/Class.isEnum ()Z
      // 0069: aload 7
      // 006b: ifnull 0097
      // 006e: ifne 0090
      // 0071: goto 0078
      // 0074: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0077: athrow
      // 0078: aload 1
      // 0079: aload 10
      // 007b: aload 2
      // 007c: aload 3
      // 007d: aload 0
      // 007e: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 0081: getfield com/finalshell/core/Zzzzd4BeanInfo.P I
      // 0084: iload 5
      // 0086: invokevirtual com/finalshell/core/NL3.c (Lcom/finalshell/core/Uh2_2;Ljava/lang/Object;Ljava/lang/Object;II)V
      // 0089: goto 0090
      // 008c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 008f: athrow
      // 0090: aload 0
      // 0091: aload 1
      // 0092: iload 5
      // 0094: invokevirtual com/finalshell/core/Nj4.N (Lcom/finalshell/core/NL3;I)Z
      // 0097: istore 11
      // 0099: aconst_null
      // 009a: astore 12
      // 009c: iload 11
      // 009e: aload 7
      // 00a0: ifnull 00b6
      // 00a3: ifeq 00b9
      // 00a6: goto 00ad
      // 00a9: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00ac: athrow
      // 00ad: sipush 24123
      // 00b0: ldc2_w 1950468920880821728
      // 00b3: invokestatic com/finalshell/core/Nj4.a (IJ)I
      // 00b6: goto 00c2
      // 00b9: sipush 15081
      // 00bc: ldc2_w 3611749829019734327
      // 00bf: invokestatic com/finalshell/core/Nj4.a (IJ)I
      // 00c2: istore 13
      // 00c4: iload 11
      // 00c6: aload 7
      // 00c8: ifnull 00de
      // 00cb: ifeq 00e1
      // 00ce: goto 00d5
      // 00d1: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00d4: athrow
      // 00d5: sipush 7006
      // 00d8: ldc2_w 7539156952856473734
      // 00db: invokestatic com/finalshell/core/Nj4.a (IJ)I
      // 00de: goto 00ea
      // 00e1: sipush 25765
      // 00e4: ldc2_w 5676975172320350074
      // 00e7: invokestatic com/finalshell/core/Nj4.a (IJ)I
      // 00ea: istore 14
      // 00ec: iload 6
      // 00ee: aload 7
      // 00f0: ifnull 010f
      // 00f3: ifne 010c
      // 00f6: goto 00fd
      // 00f9: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00fc: athrow
      // 00fd: aload 8
      // 00ff: iload 13
      // 0101: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 0104: pop
      // 0105: goto 010c
      // 0108: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 010b: athrow
      // 010c: aload 9
      // 010e: arraylength
      // 010f: aload 7
      // 0111: ifnull 014c
      // 0114: ifle 014b
      // 0117: goto 011e
      // 011a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 011d: athrow
      // 011e: aload 8
      // 0120: getstatic com/finalshell/ui/model/EP.PrettyFormat Lcom/finalshell/ui/model/EP;
      // 0123: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0126: aload 7
      // 0128: ifnull 014c
      // 012b: goto 0132
      // 012e: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0131: athrow
      // 0132: ifeq 014b
      // 0135: goto 013c
      // 0138: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 013b: athrow
      // 013c: aload 1
      // 013d: invokevirtual com/finalshell/core/NL3.C ()V
      // 0140: aload 1
      // 0141: invokevirtual com/finalshell/core/NL3.i ()V
      // 0144: goto 014b
      // 0147: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014a: athrow
      // 014b: bipush 0
      // 014c: istore 15
      // 014e: aload 0
      // 014f: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 0152: aload 7
      // 0154: ifnull 01a8
      // 0157: getfield com/finalshell/core/Zzzzd4BeanInfo.P I
      // 015a: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 015d: getfield com/finalshell/ui/model/EP.mask I
      // 0160: iand
      // 0161: ifne 01a7
      // 0164: goto 016b
      // 0167: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016a: athrow
      // 016b: iload 5
      // 016d: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 0170: getfield com/finalshell/ui/model/EP.mask I
      // 0173: iand
      // 0174: aload 7
      // 0176: ifnull 0198
      // 0179: goto 0180
      // 017c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017f: athrow
      // 0180: ifne 01a7
      // 0183: goto 018a
      // 0186: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0189: athrow
      // 018a: aload 1
      // 018b: aload 4
      // 018d: aload 2
      // 018e: invokevirtual com/finalshell/core/NL3.x (Ljava/lang/reflect/Type;Ljava/lang/Object;)Z
      // 0191: goto 0198
      // 0194: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0197: athrow
      // 0198: aload 7
      // 019a: ifnull 020b
      // 019d: ifeq 0209
      // 01a0: goto 01a7
      // 01a3: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a6: athrow
      // 01a7: aload 2
      // 01a8: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 01ab: astore 16
      // 01ad: aload 16
      // 01af: aload 7
      // 01b1: ifnull 01f0
      // 01b4: aload 4
      // 01b6: if_acmpeq 01e7
      // 01b9: goto 01c0
      // 01bc: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01bf: athrow
      // 01c0: aload 4
      // 01c2: aload 7
      // 01c4: ifnull 01f0
      // 01c7: goto 01ce
      // 01ca: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01cd: athrow
      // 01ce: instanceof java/lang/reflect/WildcardType
      // 01d1: ifeq 01e7
      // 01d4: goto 01db
      // 01d7: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01da: athrow
      // 01db: aload 4
      // 01dd: invokestatic com/finalshell/core/B8_2.x (Ljava/lang/reflect/Type;)Ljava/lang/Class;
      // 01e0: astore 17
      // 01e2: aload 7
      // 01e4: ifnonnull 01f2
      // 01e7: aload 4
      // 01e9: goto 01f0
      // 01ec: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01ef: athrow
      // 01f0: astore 17
      // 01f2: aload 16
      // 01f4: aload 17
      // 01f6: if_acmpeq 0209
      // 01f9: aload 0
      // 01fa: aload 1
      // 01fb: aload 0
      // 01fc: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 01ff: getfield com/finalshell/core/Zzzzd4BeanInfo.z Ljava/lang/String;
      // 0202: aload 2
      // 0203: invokevirtual com/finalshell/core/Nj4.w (Lcom/finalshell/core/NL3;Ljava/lang/String;Ljava/lang/Object;)V
      // 0206: bipush 1
      // 0207: istore 15
      // 0209: iload 15
      // 020b: aload 7
      // 020d: ifnull 0223
      // 0210: ifeq 0226
      // 0213: goto 021a
      // 0216: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0219: athrow
      // 021a: sipush 27577
      // 021d: ldc2_w 5160614792450064480
      // 0220: invokestatic com/finalshell/core/Nj4.a (IJ)I
      // 0223: goto 0227
      // 0226: bipush 0
      // 0227: istore 16
      // 0229: aload 8
      // 022b: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 022e: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0231: istore 17
      // 0233: aload 0
      // 0234: aload 1
      // 0235: aload 2
      // 0236: iload 16
      // 0238: invokevirtual com/finalshell/core/Nj4.Q (Lcom/finalshell/core/NL3;Ljava/lang/Object;C)C
      // 023b: istore 18
      // 023d: iload 18
      // 023f: aload 7
      // 0241: ifnull 025f
      // 0244: sipush 11729
      // 0247: ldc2_w 5727250840277747211
      // 024a: invokestatic com/finalshell/core/Nj4.a (IJ)I
      // 024d: if_icmpne 0262
      // 0250: goto 0257
      // 0253: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0256: athrow
      // 0257: bipush 1
      // 0258: goto 025f
      // 025b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025e: athrow
      // 025f: goto 0263
      // 0262: bipush 0
      // 0263: istore 15
      // 0265: aload 8
      // 0267: getstatic com/finalshell/ui/model/EP.SkipTransientField Lcom/finalshell/ui/model/EP;
      // 026a: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 026d: istore 19
      // 026f: aload 8
      // 0271: getstatic com/finalshell/ui/model/EP.IgnoreNonFieldGetter Lcom/finalshell/ui/model/EP;
      // 0274: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0277: istore 20
      // 0279: bipush 0
      // 027a: istore 21
      // 027c: iload 21
      // 027e: aload 9
      // 0280: arraylength
      // 0281: if_icmpge 1103
      // 0284: aload 9
      // 0286: iload 21
      // 0288: aaload
      // 0289: astore 22
      // 028b: aload 22
      // 028d: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 0290: getfield com/finalshell/core/Ph2.w Ljava/lang/reflect/Field;
      // 0293: astore 23
      // 0295: aload 22
      // 0297: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 029a: astore 24
      // 029c: aload 24
      // 029e: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 02a1: astore 25
      // 02a3: aload 24
      // 02a5: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 02a8: astore 26
      // 02aa: aload 8
      // 02ac: getfield com/finalshell/io/YM3.q I
      // 02af: aload 24
      // 02b1: getfield com/finalshell/core/Ph2.c I
      // 02b4: getstatic com/finalshell/ui/model/EP.UseSingleQuotes Lcom/finalshell/ui/model/EP;
      // 02b7: invokestatic com/finalshell/ui/model/EP.a (IILcom/finalshell/ui/model/EP;)Z
      // 02ba: istore 27
      // 02bc: aload 8
      // 02be: getfield com/finalshell/io/YM3.e Z
      // 02c1: aload 7
      // 02c3: ifnull 112b
      // 02c6: aload 7
      // 02c8: ifnull 02de
      // 02cb: goto 02d2
      // 02ce: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d1: athrow
      // 02d2: ifeq 02f1
      // 02d5: goto 02dc
      // 02d8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02db: athrow
      // 02dc: iload 27
      // 02de: aload 7
      // 02e0: ifnull 02ee
      // 02e3: ifne 02f1
      // 02e6: goto 02ed
      // 02e9: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02ec: athrow
      // 02ed: bipush 1
      // 02ee: goto 02f2
      // 02f1: bipush 0
      // 02f2: istore 28
      // 02f4: iload 19
      // 02f6: aload 7
      // 02f8: ifnull 0335
      // 02fb: ifeq 032c
      // 02fe: goto 0305
      // 0301: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0304: athrow
      // 0305: aload 24
      // 0307: getfield com/finalshell/core/Ph2.Z Z
      // 030a: aload 7
      // 030c: ifnull 0335
      // 030f: goto 0316
      // 0312: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0315: athrow
      // 0316: ifeq 032c
      // 0319: goto 0320
      // 031c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031f: athrow
      // 0320: aload 7
      // 0322: ifnonnull 10fb
      // 0325: goto 032c
      // 0328: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032b: athrow
      // 032c: iload 20
      // 032e: goto 0335
      // 0331: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0334: athrow
      // 0335: aload 7
      // 0337: ifnull 0364
      // 033a: ifeq 035c
      // 033d: goto 0344
      // 0340: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0343: athrow
      // 0344: aload 23
      // 0346: ifnonnull 035c
      // 0349: goto 0350
      // 034c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034f: athrow
      // 0350: aload 7
      // 0352: ifnonnull 10fb
      // 0355: goto 035c
      // 0358: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035b: athrow
      // 035c: bipush 0
      // 035d: goto 0364
      // 0360: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0363: athrow
      // 0364: istore 29
      // 0366: aload 0
      // 0367: aload 1
      // 0368: aload 2
      // 0369: aload 25
      // 036b: invokevirtual com/finalshell/core/Nj4.O (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;)Z
      // 036e: aload 7
      // 0370: ifnull 039f
      // 0373: ifeq 039d
      // 0376: goto 037d
      // 0379: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037c: athrow
      // 037d: aload 0
      // 037e: aload 1
      // 037f: aload 24
      // 0381: getfield com/finalshell/core/Ph2.N Ljava/lang/String;
      // 0384: invokevirtual com/finalshell/core/Nj4.y (Lcom/finalshell/core/NL3;Ljava/lang/String;)Z
      // 0387: aload 7
      // 0389: ifnull 03bd
      // 038c: goto 0393
      // 038f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0392: athrow
      // 0393: ifne 03b1
      // 0396: goto 039d
      // 0399: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039c: athrow
      // 039d: iload 11
      // 039f: aload 7
      // 03a1: ifnull 03af
      // 03a4: ifeq 10fb
      // 03a7: goto 03ae
      // 03aa: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03ad: athrow
      // 03ae: bipush 1
      // 03af: istore 29
      // 03b1: aload 25
      // 03b3: aload 0
      // 03b4: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 03b7: getfield com/finalshell/core/Zzzzd4BeanInfo.z Ljava/lang/String;
      // 03ba: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03bd: aload 7
      // 03bf: ifnull 03fe
      // 03c2: ifeq 03f5
      // 03c5: goto 03cc
      // 03c8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03cb: athrow
      // 03cc: aload 1
      // 03cd: aload 4
      // 03cf: aload 2
      // 03d0: invokevirtual com/finalshell/core/NL3.x (Ljava/lang/reflect/Type;Ljava/lang/Object;)Z
      // 03d3: aload 7
      // 03d5: ifnull 03fe
      // 03d8: goto 03df
      // 03db: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03de: athrow
      // 03df: ifeq 03f5
      // 03e2: goto 03e9
      // 03e5: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e8: athrow
      // 03e9: aload 7
      // 03eb: ifnonnull 10fb
      // 03ee: goto 03f5
      // 03f1: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f4: athrow
      // 03f5: iload 29
      // 03f7: goto 03fe
      // 03fa: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03fd: athrow
      // 03fe: ifeq 0409
      // 0401: aconst_null
      // 0402: astore 30
      // 0404: aload 7
      // 0406: ifnonnull 0434
      // 0409: aload 22
      // 040b: aload 2
      // 040c: invokevirtual com/finalshell/core/Nc2.t (Ljava/lang/Object;)Ljava/lang/Object;
      // 040f: astore 30
      // 0411: goto 0434
      // 0414: astore 31
      // 0416: aload 22
      // 0418: astore 12
      // 041a: aload 8
      // 041c: getstatic com/finalshell/ui/model/EP.IgnoreErrorGetter Lcom/finalshell/ui/model/EP;
      // 041f: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0422: ifeq 042d
      // 0425: aconst_null
      // 0426: astore 30
      // 0428: aload 7
      // 042a: ifnonnull 0434
      // 042d: aload 31
      // 042f: athrow
      // 0430: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0433: athrow
      // 0434: aload 0
      // 0435: aload 1
      // 0436: aload 2
      // 0437: aload 25
      // 0439: aload 30
      // 043b: invokevirtual com/finalshell/core/Nj4.d (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
      // 043e: ifne 044d
      // 0441: aload 7
      // 0443: ifnonnull 10fb
      // 0446: goto 044d
      // 0449: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044c: athrow
      // 044d: aload 26
      // 044f: ldc_w java/lang/String
      // 0452: if_acmpne 04a5
      // 0455: goto 045c
      // 0458: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045b: athrow
      // 045c: sipush -18571
      // 045f: sipush 25264
      // 0462: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 0465: aload 7
      // 0467: ifnull 04a7
      // 046a: goto 0471
      // 046d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0470: athrow
      // 0471: aload 24
      // 0473: getfield com/finalshell/core/Ph2.J Ljava/lang/String;
      // 0476: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0479: ifeq 04a5
      // 047c: goto 0483
      // 047f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0482: athrow
      // 0483: aload 30
      // 0485: aload 7
      // 0487: ifnull 049d
      // 048a: goto 0491
      // 048d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0490: athrow
      // 0491: ifnull 04a5
      // 0494: goto 049b
      // 0497: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049a: athrow
      // 049b: aload 30
      // 049d: checkcast java/lang/String
      // 04a0: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 04a3: astore 30
      // 04a5: aload 25
      // 04a7: astore 31
      // 04a9: aload 0
      // 04aa: aload 1
      // 04ab: aload 2
      // 04ac: aload 31
      // 04ae: aload 30
      // 04b0: invokevirtual com/finalshell/core/Nj4.i (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      // 04b3: astore 31
      // 04b5: aload 30
      // 04b7: astore 32
      // 04b9: aload 0
      // 04ba: aload 1
      // 04bb: aload 22
      // 04bd: getfield com/finalshell/core/Nc2.D Lcom/finalshell/core/DL3;
      // 04c0: aload 2
      // 04c1: aload 25
      // 04c3: aload 30
      // 04c5: iload 5
      // 04c7: invokevirtual com/finalshell/core/Nj4.L (Lcom/finalshell/core/NL3;Lcom/finalshell/core/DL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;
      // 04ca: astore 30
      // 04cc: aload 30
      // 04ce: aload 7
      // 04d0: ifnull 0974
      // 04d3: ifnonnull 096b
      // 04d6: goto 04dd
      // 04d9: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04dc: athrow
      // 04dd: aload 24
      // 04df: getfield com/finalshell/core/Ph2.c I
      // 04e2: istore 33
      // 04e4: aload 24
      // 04e6: invokevirtual com/finalshell/core/Ph2.Z ()Lcom/finalshell/core/E6;
      // 04e9: astore 34
      // 04eb: aload 0
      // 04ec: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 04ef: getfield com/finalshell/core/Zzzzd4BeanInfo.L Lcom/finalshell/core/O4;
      // 04f2: ifnull 0509
      // 04f5: iload 33
      // 04f7: aload 0
      // 04f8: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 04fb: getfield com/finalshell/core/Zzzzd4BeanInfo.L Lcom/finalshell/core/O4;
      // 04fe: invokeinterface com/finalshell/core/O4.u ()[Lcom/finalshell/ui/model/EP; 1
      // 0503: invokestatic com/finalshell/ui/model/EP.Q ([Lcom/finalshell/ui/model/EP;)I
      // 0506: ior
      // 0507: istore 33
      // 0509: aload 34
      // 050b: ifnull 0546
      // 050e: ldc_w ""
      // 0511: aload 7
      // 0513: ifnull 053f
      // 0516: goto 051d
      // 0519: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051c: athrow
      // 051d: aload 34
      // 051f: invokeinterface com/finalshell/core/E6.u$String ()Ljava/lang/String; 1
      // 0524: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0527: ifne 0546
      // 052a: goto 0531
      // 052d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0530: athrow
      // 0531: aload 34
      // 0533: invokeinterface com/finalshell/core/E6.u$String ()Ljava/lang/String; 1
      // 0538: goto 053f
      // 053b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053e: athrow
      // 053f: astore 30
      // 0541: aload 7
      // 0543: ifnonnull 096b
      // 0546: aload 26
      // 0548: ldc_w java/lang/Boolean
      // 054b: aload 7
      // 054d: ifnull 0644
      // 0550: goto 0557
      // 0553: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0556: athrow
      // 0557: if_acmpne 0638
      // 055a: goto 0561
      // 055d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0560: athrow
      // 0561: getstatic com/finalshell/ui/model/EP.WriteNullBooleanAsFalse Lcom/finalshell/ui/model/EP;
      // 0564: getfield com/finalshell/ui/model/EP.mask I
      // 0567: istore 35
      // 0569: iload 35
      // 056b: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 056e: getfield com/finalshell/ui/model/EP.mask I
      // 0571: ior
      // 0572: istore 36
      // 0574: iload 11
      // 0576: aload 7
      // 0578: ifnull 05d6
      // 057b: ifne 05ca
      // 057e: goto 0585
      // 0581: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0584: athrow
      // 0585: iload 33
      // 0587: iload 36
      // 0589: iand
      // 058a: aload 7
      // 058c: ifnull 05d6
      // 058f: goto 0596
      // 0592: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0595: athrow
      // 0596: ifne 05ca
      // 0599: goto 05a0
      // 059c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059f: athrow
      // 05a0: aload 8
      // 05a2: getfield com/finalshell/io/YM3.q I
      // 05a5: iload 36
      // 05a7: iand
      // 05a8: aload 7
      // 05aa: ifnull 05d6
      // 05ad: goto 05b4
      // 05b0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b3: athrow
      // 05b4: ifne 05ca
      // 05b7: goto 05be
      // 05ba: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05bd: athrow
      // 05be: aload 7
      // 05c0: ifnonnull 10fb
      // 05c3: goto 05ca
      // 05c6: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c9: athrow
      // 05ca: iload 33
      // 05cc: iload 35
      // 05ce: iand
      // 05cf: goto 05d6
      // 05d2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d5: athrow
      // 05d6: aload 7
      // 05d8: ifnull 05ff
      // 05db: ifeq 05f0
      // 05de: goto 05e5
      // 05e1: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e4: athrow
      // 05e5: bipush 0
      // 05e6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 05e9: astore 30
      // 05eb: aload 7
      // 05ed: ifnonnull 0633
      // 05f0: aload 8
      // 05f2: getfield com/finalshell/io/YM3.q I
      // 05f5: iload 35
      // 05f7: iand
      // 05f8: goto 05ff
      // 05fb: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05fe: athrow
      // 05ff: aload 7
      // 0601: ifnull 061e
      // 0604: ifeq 0633
      // 0607: goto 060e
      // 060a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060d: athrow
      // 060e: iload 33
      // 0610: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 0613: getfield com/finalshell/ui/model/EP.mask I
      // 0616: iand
      // 0617: goto 061e
      // 061a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061d: athrow
      // 061e: aload 7
      // 0620: ifnull 062e
      // 0623: ifne 0633
      // 0626: goto 062d
      // 0629: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062c: athrow
      // 062d: bipush 0
      // 062e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0631: astore 30
      // 0633: aload 7
      // 0635: ifnonnull 096b
      // 0638: aload 26
      // 063a: ldc_w java/lang/String
      // 063d: goto 0644
      // 0640: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0643: athrow
      // 0644: aload 7
      // 0646: ifnull 0728
      // 0649: if_acmpne 071c
      // 064c: goto 0653
      // 064f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0652: athrow
      // 0653: getstatic com/finalshell/ui/model/EP.WriteNullStringAsEmpty Lcom/finalshell/ui/model/EP;
      // 0656: getfield com/finalshell/ui/model/EP.mask I
      // 0659: istore 35
      // 065b: iload 35
      // 065d: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 0660: getfield com/finalshell/ui/model/EP.mask I
      // 0663: ior
      // 0664: istore 36
      // 0666: iload 11
      // 0668: aload 7
      // 066a: ifnull 06c8
      // 066d: ifne 06bc
      // 0670: goto 0677
      // 0673: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0676: athrow
      // 0677: iload 33
      // 0679: iload 36
      // 067b: iand
      // 067c: aload 7
      // 067e: ifnull 06c8
      // 0681: goto 0688
      // 0684: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0687: athrow
      // 0688: ifne 06bc
      // 068b: goto 0692
      // 068e: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0691: athrow
      // 0692: aload 8
      // 0694: getfield com/finalshell/io/YM3.q I
      // 0697: iload 36
      // 0699: iand
      // 069a: aload 7
      // 069c: ifnull 06c8
      // 069f: goto 06a6
      // 06a2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a5: athrow
      // 06a6: ifne 06bc
      // 06a9: goto 06b0
      // 06ac: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06af: athrow
      // 06b0: aload 7
      // 06b2: ifnonnull 10fb
      // 06b5: goto 06bc
      // 06b8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06bb: athrow
      // 06bc: iload 33
      // 06be: iload 35
      // 06c0: iand
      // 06c1: goto 06c8
      // 06c4: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c7: athrow
      // 06c8: aload 7
      // 06ca: ifnull 06f0
      // 06cd: ifeq 06e1
      // 06d0: goto 06d7
      // 06d3: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d6: athrow
      // 06d7: ldc_w ""
      // 06da: astore 30
      // 06dc: aload 7
      // 06de: ifnonnull 0717
      // 06e1: aload 8
      // 06e3: getfield com/finalshell/io/YM3.q I
      // 06e6: iload 35
      // 06e8: iand
      // 06e9: goto 06f0
      // 06ec: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06ef: athrow
      // 06f0: aload 7
      // 06f2: ifnull 070f
      // 06f5: ifeq 0717
      // 06f8: goto 06ff
      // 06fb: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06fe: athrow
      // 06ff: iload 33
      // 0701: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 0704: getfield com/finalshell/ui/model/EP.mask I
      // 0707: iand
      // 0708: goto 070f
      // 070b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070e: athrow
      // 070f: ifne 0717
      // 0712: ldc_w ""
      // 0715: astore 30
      // 0717: aload 7
      // 0719: ifnonnull 096b
      // 071c: ldc_w java/lang/Number
      // 071f: aload 26
      // 0721: goto 0728
      // 0724: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0727: athrow
      // 0728: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 072b: aload 7
      // 072d: ifnull 0820
      // 0730: ifeq 0811
      // 0733: goto 073a
      // 0736: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0739: athrow
      // 073a: getstatic com/finalshell/ui/model/EP.WriteNullNumberAsZero Lcom/finalshell/ui/model/EP;
      // 073d: getfield com/finalshell/ui/model/EP.mask I
      // 0740: istore 35
      // 0742: iload 35
      // 0744: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 0747: getfield com/finalshell/ui/model/EP.mask I
      // 074a: ior
      // 074b: istore 36
      // 074d: iload 11
      // 074f: aload 7
      // 0751: ifnull 07af
      // 0754: ifne 07a3
      // 0757: goto 075e
      // 075a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075d: athrow
      // 075e: iload 33
      // 0760: iload 36
      // 0762: iand
      // 0763: aload 7
      // 0765: ifnull 07af
      // 0768: goto 076f
      // 076b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076e: athrow
      // 076f: ifne 07a3
      // 0772: goto 0779
      // 0775: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0778: athrow
      // 0779: aload 8
      // 077b: getfield com/finalshell/io/YM3.q I
      // 077e: iload 36
      // 0780: iand
      // 0781: aload 7
      // 0783: ifnull 07af
      // 0786: goto 078d
      // 0789: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078c: athrow
      // 078d: ifne 07a3
      // 0790: goto 0797
      // 0793: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0796: athrow
      // 0797: aload 7
      // 0799: ifnonnull 10fb
      // 079c: goto 07a3
      // 079f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a2: athrow
      // 07a3: iload 33
      // 07a5: iload 35
      // 07a7: iand
      // 07a8: goto 07af
      // 07ab: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07ae: athrow
      // 07af: aload 7
      // 07b1: ifnull 07d8
      // 07b4: ifeq 07c9
      // 07b7: goto 07be
      // 07ba: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07bd: athrow
      // 07be: bipush 0
      // 07bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07c2: astore 30
      // 07c4: aload 7
      // 07c6: ifnonnull 080c
      // 07c9: aload 8
      // 07cb: getfield com/finalshell/io/YM3.q I
      // 07ce: iload 35
      // 07d0: iand
      // 07d1: goto 07d8
      // 07d4: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d7: athrow
      // 07d8: aload 7
      // 07da: ifnull 07f7
      // 07dd: ifeq 080c
      // 07e0: goto 07e7
      // 07e3: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e6: athrow
      // 07e7: iload 33
      // 07e9: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 07ec: getfield com/finalshell/ui/model/EP.mask I
      // 07ef: iand
      // 07f0: goto 07f7
      // 07f3: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f6: athrow
      // 07f7: aload 7
      // 07f9: ifnull 0807
      // 07fc: ifne 080c
      // 07ff: goto 0806
      // 0802: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0805: athrow
      // 0806: bipush 0
      // 0807: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 080a: astore 30
      // 080c: aload 7
      // 080e: ifnonnull 096b
      // 0811: ldc_w java/util/Collection
      // 0814: aload 26
      // 0816: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 0819: goto 0820
      // 081c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081f: athrow
      // 0820: aload 7
      // 0822: ifnull 0901
      // 0825: ifeq 08f8
      // 0828: goto 082f
      // 082b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082e: athrow
      // 082f: getstatic com/finalshell/ui/model/EP.WriteNullListAsEmpty Lcom/finalshell/ui/model/EP;
      // 0832: getfield com/finalshell/ui/model/EP.mask I
      // 0835: istore 35
      // 0837: iload 35
      // 0839: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 083c: getfield com/finalshell/ui/model/EP.mask I
      // 083f: ior
      // 0840: istore 36
      // 0842: iload 11
      // 0844: aload 7
      // 0846: ifnull 08a4
      // 0849: ifne 0898
      // 084c: goto 0853
      // 084f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0852: athrow
      // 0853: iload 33
      // 0855: iload 36
      // 0857: iand
      // 0858: aload 7
      // 085a: ifnull 08a4
      // 085d: goto 0864
      // 0860: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0863: athrow
      // 0864: ifne 0898
      // 0867: goto 086e
      // 086a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086d: athrow
      // 086e: aload 8
      // 0870: getfield com/finalshell/io/YM3.q I
      // 0873: iload 36
      // 0875: iand
      // 0876: aload 7
      // 0878: ifnull 08a4
      // 087b: goto 0882
      // 087e: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0881: athrow
      // 0882: ifne 0898
      // 0885: goto 088c
      // 0888: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088b: athrow
      // 088c: aload 7
      // 088e: ifnonnull 10fb
      // 0891: goto 0898
      // 0894: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0897: athrow
      // 0898: iload 33
      // 089a: iload 35
      // 089c: iand
      // 089d: goto 08a4
      // 08a0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a3: athrow
      // 08a4: aload 7
      // 08a6: ifnull 08cc
      // 08a9: ifeq 08bd
      // 08ac: goto 08b3
      // 08af: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b2: athrow
      // 08b3: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 08b6: astore 30
      // 08b8: aload 7
      // 08ba: ifnonnull 08f3
      // 08bd: aload 8
      // 08bf: getfield com/finalshell/io/YM3.q I
      // 08c2: iload 35
      // 08c4: iand
      // 08c5: goto 08cc
      // 08c8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08cb: athrow
      // 08cc: aload 7
      // 08ce: ifnull 08eb
      // 08d1: ifeq 08f3
      // 08d4: goto 08db
      // 08d7: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08da: athrow
      // 08db: iload 33
      // 08dd: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 08e0: getfield com/finalshell/ui/model/EP.mask I
      // 08e3: iand
      // 08e4: goto 08eb
      // 08e7: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08ea: athrow
      // 08eb: ifne 08f3
      // 08ee: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 08f1: astore 30
      // 08f3: aload 7
      // 08f5: ifnonnull 096b
      // 08f8: iload 11
      // 08fa: goto 0901
      // 08fd: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0900: athrow
      // 0901: aload 7
      // 0903: ifnull 0928
      // 0906: ifne 096b
      // 0909: goto 0910
      // 090c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090f: athrow
      // 0910: aload 22
      // 0912: aload 7
      // 0914: ifnull 0974
      // 0917: goto 091e
      // 091a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091d: athrow
      // 091e: getfield com/finalshell/core/Nc2.O Z
      // 0921: goto 0928
      // 0924: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0927: athrow
      // 0928: ifne 096b
      // 092b: aload 8
      // 092d: aload 7
      // 092f: ifnull 0974
      // 0932: goto 0939
      // 0935: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0938: athrow
      // 0939: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 093c: getfield com/finalshell/ui/model/EP.mask I
      // 093f: invokevirtual com/finalshell/io/YM3.y (I)Z
      // 0942: ifne 096b
      // 0945: goto 094c
      // 0948: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094b: athrow
      // 094c: iload 33
      // 094e: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 0951: getfield com/finalshell/ui/model/EP.mask I
      // 0954: iand
      // 0955: ifne 096b
      // 0958: goto 095f
      // 095b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095e: athrow
      // 095f: aload 7
      // 0961: ifnonnull 10fb
      // 0964: goto 096b
      // 0967: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096a: athrow
      // 096b: aload 30
      // 096d: goto 0974
      // 0970: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0973: athrow
      // 0974: ifnull 0c2f
      // 0977: aload 8
      // 0979: getfield com/finalshell/io/YM3.d Z
      // 097c: aload 7
      // 097e: ifnull 09b1
      // 0981: goto 0988
      // 0984: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0987: athrow
      // 0988: ifne 09d8
      // 098b: goto 0992
      // 098e: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0991: athrow
      // 0992: aload 24
      // 0994: aload 7
      // 0996: ifnull 09da
      // 0999: goto 09a0
      // 099c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099f: athrow
      // 09a0: getfield com/finalshell/core/Ph2.c I
      // 09a3: getstatic com/finalshell/ui/model/EP.NotWriteDefaultValue Lcom/finalshell/ui/model/EP;
      // 09a6: getfield com/finalshell/ui/model/EP.mask I
      // 09a9: iand
      // 09aa: goto 09b1
      // 09ad: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b0: athrow
      // 09b1: ifne 09d8
      // 09b4: aload 0
      // 09b5: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 09b8: getfield com/finalshell/core/Zzzzd4BeanInfo.P I
      // 09bb: getstatic com/finalshell/ui/model/EP.NotWriteDefaultValue Lcom/finalshell/ui/model/EP;
      // 09be: getfield com/finalshell/ui/model/EP.mask I
      // 09c1: iand
      // 09c2: aload 7
      // 09c4: ifnull 0c38
      // 09c7: goto 09ce
      // 09ca: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09cd: athrow
      // 09ce: ifeq 0c2f
      // 09d1: goto 09d8
      // 09d4: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d7: athrow
      // 09d8: aload 24
      // 09da: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 09dd: astore 33
      // 09df: aload 33
      // 09e1: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 09e4: aload 7
      // 09e6: ifnull 0a38
      // 09e9: if_acmpne 0a2c
      // 09ec: goto 09f3
      // 09ef: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f2: athrow
      // 09f3: aload 30
      // 09f5: instanceof java/lang/Byte
      // 09f8: aload 7
      // 09fa: ifnull 0a1d
      // 09fd: goto 0a04
      // 0a00: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a03: athrow
      // 0a04: ifeq 0a2c
      // 0a07: goto 0a0e
      // 0a0a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0d: athrow
      // 0a0e: aload 30
      // 0a10: checkcast java/lang/Byte
      // 0a13: invokevirtual java/lang/Byte.byteValue ()B
      // 0a16: goto 0a1d
      // 0a19: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1c: athrow
      // 0a1d: ifne 0a2c
      // 0a20: aload 7
      // 0a22: ifnonnull 10fb
      // 0a25: goto 0a2c
      // 0a28: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a2b: athrow
      // 0a2c: aload 33
      // 0a2e: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 0a31: goto 0a38
      // 0a34: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a37: athrow
      // 0a38: aload 7
      // 0a3a: ifnull 0a8c
      // 0a3d: if_acmpne 0a80
      // 0a40: goto 0a47
      // 0a43: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a46: athrow
      // 0a47: aload 30
      // 0a49: instanceof java/lang/Short
      // 0a4c: aload 7
      // 0a4e: ifnull 0a71
      // 0a51: goto 0a58
      // 0a54: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a57: athrow
      // 0a58: ifeq 0a80
      // 0a5b: goto 0a62
      // 0a5e: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a61: athrow
      // 0a62: aload 30
      // 0a64: checkcast java/lang/Short
      // 0a67: invokevirtual java/lang/Short.shortValue ()S
      // 0a6a: goto 0a71
      // 0a6d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a70: athrow
      // 0a71: ifne 0a80
      // 0a74: aload 7
      // 0a76: ifnonnull 10fb
      // 0a79: goto 0a80
      // 0a7c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7f: athrow
      // 0a80: aload 33
      // 0a82: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 0a85: goto 0a8c
      // 0a88: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8b: athrow
      // 0a8c: aload 7
      // 0a8e: ifnull 0ae0
      // 0a91: if_acmpne 0ad4
      // 0a94: goto 0a9b
      // 0a97: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9a: athrow
      // 0a9b: aload 30
      // 0a9d: instanceof java/lang/Integer
      // 0aa0: aload 7
      // 0aa2: ifnull 0ac5
      // 0aa5: goto 0aac
      // 0aa8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aab: athrow
      // 0aac: ifeq 0ad4
      // 0aaf: goto 0ab6
      // 0ab2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab5: athrow
      // 0ab6: aload 30
      // 0ab8: checkcast java/lang/Integer
      // 0abb: invokevirtual java/lang/Integer.intValue ()I
      // 0abe: goto 0ac5
      // 0ac1: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac4: athrow
      // 0ac5: ifne 0ad4
      // 0ac8: aload 7
      // 0aca: ifnonnull 10fb
      // 0acd: goto 0ad4
      // 0ad0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad3: athrow
      // 0ad4: aload 33
      // 0ad6: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 0ad9: goto 0ae0
      // 0adc: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0adf: athrow
      // 0ae0: aload 7
      // 0ae2: ifnull 0b36
      // 0ae5: if_acmpne 0b2a
      // 0ae8: goto 0aef
      // 0aeb: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aee: athrow
      // 0aef: aload 30
      // 0af1: instanceof java/lang/Long
      // 0af4: aload 7
      // 0af6: ifnull 0b1b
      // 0af9: goto 0b00
      // 0afc: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aff: athrow
      // 0b00: ifeq 0b2a
      // 0b03: goto 0b0a
      // 0b06: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b09: athrow
      // 0b0a: aload 30
      // 0b0c: checkcast java/lang/Long
      // 0b0f: invokevirtual java/lang/Long.longValue ()J
      // 0b12: lconst_0
      // 0b13: lcmp
      // 0b14: goto 0b1b
      // 0b17: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1a: athrow
      // 0b1b: ifne 0b2a
      // 0b1e: aload 7
      // 0b20: ifnonnull 10fb
      // 0b23: goto 0b2a
      // 0b26: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b29: athrow
      // 0b2a: aload 33
      // 0b2c: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 0b2f: goto 0b36
      // 0b32: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b35: athrow
      // 0b36: aload 7
      // 0b38: ifnull 0b8c
      // 0b3b: if_acmpne 0b80
      // 0b3e: goto 0b45
      // 0b41: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b44: athrow
      // 0b45: aload 30
      // 0b47: instanceof java/lang/Float
      // 0b4a: aload 7
      // 0b4c: ifnull 0b71
      // 0b4f: goto 0b56
      // 0b52: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b55: athrow
      // 0b56: ifeq 0b80
      // 0b59: goto 0b60
      // 0b5c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5f: athrow
      // 0b60: aload 30
      // 0b62: checkcast java/lang/Float
      // 0b65: invokevirtual java/lang/Float.floatValue ()F
      // 0b68: fconst_0
      // 0b69: fcmpl
      // 0b6a: goto 0b71
      // 0b6d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b70: athrow
      // 0b71: ifne 0b80
      // 0b74: aload 7
      // 0b76: ifnonnull 10fb
      // 0b79: goto 0b80
      // 0b7c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7f: athrow
      // 0b80: aload 33
      // 0b82: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 0b85: goto 0b8c
      // 0b88: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8b: athrow
      // 0b8c: aload 7
      // 0b8e: ifnull 0bee
      // 0b91: if_acmpne 0bd6
      // 0b94: goto 0b9b
      // 0b97: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9a: athrow
      // 0b9b: aload 30
      // 0b9d: instanceof java/lang/Double
      // 0ba0: aload 7
      // 0ba2: ifnull 0bc7
      // 0ba5: goto 0bac
      // 0ba8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bab: athrow
      // 0bac: ifeq 0bd6
      // 0baf: goto 0bb6
      // 0bb2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb5: athrow
      // 0bb6: aload 30
      // 0bb8: checkcast java/lang/Double
      // 0bbb: invokevirtual java/lang/Double.doubleValue ()D
      // 0bbe: dconst_0
      // 0bbf: dcmpl
      // 0bc0: goto 0bc7
      // 0bc3: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc6: athrow
      // 0bc7: ifne 0bd6
      // 0bca: aload 7
      // 0bcc: ifnonnull 10fb
      // 0bcf: goto 0bd6
      // 0bd2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd5: athrow
      // 0bd6: aload 33
      // 0bd8: aload 7
      // 0bda: ifnull 0bf3
      // 0bdd: goto 0be4
      // 0be0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be3: athrow
      // 0be4: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 0be7: goto 0bee
      // 0bea: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bed: athrow
      // 0bee: if_acmpne 0c2f
      // 0bf1: aload 30
      // 0bf3: instanceof java/lang/Boolean
      // 0bf6: aload 7
      // 0bf8: ifnull 0c38
      // 0bfb: ifeq 0c2f
      // 0bfe: goto 0c05
      // 0c01: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c04: athrow
      // 0c05: aload 30
      // 0c07: checkcast java/lang/Boolean
      // 0c0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c0d: aload 7
      // 0c0f: ifnull 0c38
      // 0c12: goto 0c19
      // 0c15: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c18: athrow
      // 0c19: ifne 0c2f
      // 0c1c: goto 0c23
      // 0c1f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c22: athrow
      // 0c23: aload 7
      // 0c25: ifnonnull 10fb
      // 0c28: goto 0c2f
      // 0c2b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2e: athrow
      // 0c2f: iload 15
      // 0c31: goto 0c38
      // 0c34: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c37: athrow
      // 0c38: aload 7
      // 0c3a: ifnull 0c53
      // 0c3d: ifeq 0cd4
      // 0c40: goto 0c47
      // 0c43: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c46: athrow
      // 0c47: aload 24
      // 0c49: getfield com/finalshell/core/Ph2.D Z
      // 0c4c: goto 0c53
      // 0c4f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c52: athrow
      // 0c53: aload 7
      // 0c55: ifnull 0cc6
      // 0c58: ifeq 0ca9
      // 0c5b: goto 0c62
      // 0c5e: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c61: athrow
      // 0c62: aload 30
      // 0c64: instanceof java/util/Map
      // 0c67: aload 7
      // 0c69: ifnull 0cc6
      // 0c6c: goto 0c73
      // 0c6f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c72: athrow
      // 0c73: ifeq 0ca9
      // 0c76: goto 0c7d
      // 0c79: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7c: athrow
      // 0c7d: aload 30
      // 0c7f: checkcast java/util/Map
      // 0c82: invokeinterface java/util/Map.size ()I 1
      // 0c87: aload 7
      // 0c89: ifnull 0cc6
      // 0c8c: goto 0c93
      // 0c8f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c92: athrow
      // 0c93: ifne 0ca9
      // 0c96: goto 0c9d
      // 0c99: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9c: athrow
      // 0c9d: aload 7
      // 0c9f: ifnonnull 10fb
      // 0ca2: goto 0ca9
      // 0ca5: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca8: athrow
      // 0ca9: aload 8
      // 0cab: sipush 11729
      // 0cae: ldc2_w 5727250840277747211
      // 0cb1: invokestatic com/finalshell/core/Nj4.a (IJ)I
      // 0cb4: invokevirtual com/finalshell/io/YM3.write (I)V
      // 0cb7: aload 8
      // 0cb9: getstatic com/finalshell/ui/model/EP.PrettyFormat Lcom/finalshell/ui/model/EP;
      // 0cbc: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 0cbf: goto 0cc6
      // 0cc2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc5: athrow
      // 0cc6: ifeq 0cd4
      // 0cc9: aload 1
      // 0cca: invokevirtual com/finalshell/core/NL3.i ()V
      // 0ccd: goto 0cd4
      // 0cd0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cd3: athrow
      // 0cd4: aload 31
      // 0cd6: aload 25
      // 0cd8: aload 7
      // 0cda: ifnull 0d18
      // 0cdd: if_acmpeq 0d0d
      // 0ce0: goto 0ce7
      // 0ce3: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce6: athrow
      // 0ce7: iload 11
      // 0ce9: ifne 0d02
      // 0cec: goto 0cf3
      // 0cef: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf2: athrow
      // 0cf3: aload 8
      // 0cf5: aload 31
      // 0cf7: bipush 1
      // 0cf8: invokevirtual com/finalshell/io/YM3.o (Ljava/lang/String;Z)V
      // 0cfb: goto 0d02
      // 0cfe: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d01: athrow
      // 0d02: aload 1
      // 0d03: aload 30
      // 0d05: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 0d08: aload 7
      // 0d0a: ifnonnull 1011
      // 0d0d: aload 32
      // 0d0f: aload 30
      // 0d11: goto 0d18
      // 0d14: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d17: athrow
      // 0d18: if_acmpeq 0d3f
      // 0d1b: iload 11
      // 0d1d: ifne 0d34
      // 0d20: goto 0d27
      // 0d23: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d26: athrow
      // 0d27: aload 22
      // 0d29: aload 1
      // 0d2a: invokevirtual com/finalshell/core/Nc2.E (Lcom/finalshell/core/NL3;)V
      // 0d2d: goto 0d34
      // 0d30: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d33: athrow
      // 0d34: aload 1
      // 0d35: aload 30
      // 0d37: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 0d3a: aload 7
      // 0d3c: ifnonnull 1011
      // 0d3f: iload 11
      // 0d41: aload 7
      // 0d43: ifnull 0e3d
      // 0d46: goto 0d4d
      // 0d49: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4c: athrow
      // 0d4d: ifne 0e3b
      // 0d50: goto 0d57
      // 0d53: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d56: athrow
      // 0d57: ldc java/util/Map
      // 0d59: aload 26
      // 0d5b: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 0d5e: istore 33
      // 0d60: aload 26
      // 0d62: aload 7
      // 0d64: ifnull 0d9d
      // 0d67: invokevirtual java/lang/Class.isPrimitive ()Z
      // 0d6a: ifne 0d9b
      // 0d6d: goto 0d74
      // 0d70: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d73: athrow
      // 0d74: aload 26
      // 0d76: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0d79: sipush -18566
      // 0d7c: sipush 23686
      // 0d7f: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 0d82: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0d85: aload 7
      // 0d87: ifnull 0daa
      // 0d8a: goto 0d91
      // 0d8d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d90: athrow
      // 0d91: ifeq 0da2
      // 0d94: goto 0d9b
      // 0d97: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9a: athrow
      // 0d9b: aload 26
      // 0d9d: ldc java/lang/Object
      // 0d9f: if_acmpne 0dad
      // 0da2: bipush 1
      // 0da3: goto 0daa
      // 0da6: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da9: athrow
      // 0daa: goto 0dae
      // 0dad: bipush 0
      // 0dae: istore 34
      // 0db0: iload 17
      // 0db2: aload 7
      // 0db4: ifnull 0e0e
      // 0db7: ifne 0e0c
      // 0dba: goto 0dc1
      // 0dbd: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc0: athrow
      // 0dc1: aload 24
      // 0dc3: getfield com/finalshell/core/Ph2.D Z
      // 0dc6: aload 7
      // 0dc8: ifnull 0e0e
      // 0dcb: goto 0dd2
      // 0dce: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd1: athrow
      // 0dd2: ifeq 0e0c
      // 0dd5: goto 0ddc
      // 0dd8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ddb: athrow
      // 0ddc: iload 33
      // 0dde: aload 7
      // 0de0: ifnull 0e3d
      // 0de3: goto 0dea
      // 0de6: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de9: athrow
      // 0dea: ifne 0e3b
      // 0ded: goto 0df4
      // 0df0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df3: athrow
      // 0df4: iload 34
      // 0df6: aload 7
      // 0df8: ifnull 0e3d
      // 0dfb: goto 0e02
      // 0dfe: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e01: athrow
      // 0e02: ifne 0e3b
      // 0e05: goto 0e0c
      // 0e08: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0b: athrow
      // 0e0c: iload 28
      // 0e0e: ifeq 0e2e
      // 0e11: aload 8
      // 0e13: aload 24
      // 0e15: getfield com/finalshell/core/Ph2.L [C
      // 0e18: bipush 0
      // 0e19: aload 24
      // 0e1b: getfield com/finalshell/core/Ph2.L [C
      // 0e1e: arraylength
      // 0e1f: invokevirtual com/finalshell/io/YM3.write ([CII)V
      // 0e22: aload 7
      // 0e24: ifnonnull 0e3b
      // 0e27: goto 0e2e
      // 0e2a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2d: athrow
      // 0e2e: aload 22
      // 0e30: aload 1
      // 0e31: invokevirtual com/finalshell/core/Nc2.E (Lcom/finalshell/core/NL3;)V
      // 0e34: goto 0e3b
      // 0e37: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3a: athrow
      // 0e3b: iload 11
      // 0e3d: ifne 1002
      // 0e40: aload 24
      // 0e42: invokevirtual com/finalshell/core/Ph2.Z ()Lcom/finalshell/core/E6;
      // 0e45: astore 33
      // 0e47: aload 26
      // 0e49: ldc_w java/lang/String
      // 0e4c: if_acmpne 0f90
      // 0e4f: aload 33
      // 0e51: aload 7
      // 0e53: ifnull 0e90
      // 0e56: goto 0e5d
      // 0e59: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5c: athrow
      // 0e5d: ifnull 0e87
      // 0e60: goto 0e67
      // 0e63: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e66: athrow
      // 0e67: aload 33
      // 0e69: invokeinterface com/finalshell/core/E6.u$Class ()Ljava/lang/Class; 1
      // 0e6e: aload 7
      // 0e70: ifnull 0e90
      // 0e73: goto 0e7a
      // 0e76: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e79: athrow
      // 0e7a: ldc_w java/lang/Void
      // 0e7d: if_acmpne 0f90
      // 0e80: goto 0e87
      // 0e83: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e86: athrow
      // 0e87: aload 30
      // 0e89: goto 0e90
      // 0e8c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8f: athrow
      // 0e90: aload 7
      // 0e92: ifnull 0f53
      // 0e95: ifnonnull 0f4a
      // 0e98: goto 0e9f
      // 0e9b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9e: athrow
      // 0e9f: aload 22
      // 0ea1: getfield com/finalshell/core/Nc2.V I
      // 0ea4: istore 34
      // 0ea6: aload 0
      // 0ea7: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 0eaa: getfield com/finalshell/core/Zzzzd4BeanInfo.L Lcom/finalshell/core/O4;
      // 0ead: ifnull 0ec4
      // 0eb0: iload 34
      // 0eb2: aload 0
      // 0eb3: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 0eb6: getfield com/finalshell/core/Zzzzd4BeanInfo.L Lcom/finalshell/core/O4;
      // 0eb9: invokeinterface com/finalshell/core/O4.u ()[Lcom/finalshell/ui/model/EP; 1
      // 0ebe: invokestatic com/finalshell/ui/model/EP.Q ([Lcom/finalshell/ui/model/EP;)I
      // 0ec1: ior
      // 0ec2: istore 34
      // 0ec4: aload 8
      // 0ec6: getfield com/finalshell/io/YM3.q I
      // 0ec9: getstatic com/finalshell/ui/model/EP.WriteNullStringAsEmpty Lcom/finalshell/ui/model/EP;
      // 0ecc: getfield com/finalshell/ui/model/EP.mask I
      // 0ecf: iand
      // 0ed0: aload 7
      // 0ed2: ifnull 0f22
      // 0ed5: ifeq 0f12
      // 0ed8: goto 0edf
      // 0edb: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ede: athrow
      // 0edf: iload 34
      // 0ee1: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 0ee4: getfield com/finalshell/ui/model/EP.mask I
      // 0ee7: iand
      // 0ee8: aload 7
      // 0eea: ifnull 0f22
      // 0eed: goto 0ef4
      // 0ef0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef3: athrow
      // 0ef4: ifne 0f12
      // 0ef7: goto 0efe
      // 0efa: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0efd: athrow
      // 0efe: aload 8
      // 0f00: ldc_w ""
      // 0f03: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 0f06: aload 7
      // 0f08: ifnonnull 0f45
      // 0f0b: goto 0f12
      // 0f0e: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f11: athrow
      // 0f12: iload 34
      // 0f14: getstatic com/finalshell/ui/model/EP.WriteNullStringAsEmpty Lcom/finalshell/ui/model/EP;
      // 0f17: getfield com/finalshell/ui/model/EP.mask I
      // 0f1a: iand
      // 0f1b: goto 0f22
      // 0f1e: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f21: athrow
      // 0f22: ifeq 0f39
      // 0f25: aload 8
      // 0f27: ldc_w ""
      // 0f2a: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 0f2d: aload 7
      // 0f2f: ifnonnull 0f45
      // 0f32: goto 0f39
      // 0f35: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f38: athrow
      // 0f39: aload 8
      // 0f3b: invokevirtual com/finalshell/io/YM3.Y ()V
      // 0f3e: goto 0f45
      // 0f41: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f44: athrow
      // 0f45: aload 7
      // 0f47: ifnonnull 0ffd
      // 0f4a: aload 30
      // 0f4c: goto 0f53
      // 0f4f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f52: athrow
      // 0f53: checkcast java/lang/String
      // 0f56: astore 34
      // 0f58: aload 7
      // 0f5a: ifnull 0f77
      // 0f5d: iload 27
      // 0f5f: ifeq 0f7c
      // 0f62: goto 0f69
      // 0f65: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f68: athrow
      // 0f69: aload 8
      // 0f6b: aload 34
      // 0f6d: invokevirtual com/finalshell/io/YM3.E (Ljava/lang/String;)V
      // 0f70: goto 0f77
      // 0f73: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f76: athrow
      // 0f77: aload 7
      // 0f79: ifnonnull 0f8b
      // 0f7c: aload 8
      // 0f7e: aload 34
      // 0f80: bipush 0
      // 0f81: invokevirtual com/finalshell/io/YM3.j (Ljava/lang/String;C)V
      // 0f84: goto 0f8b
      // 0f87: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8a: athrow
      // 0f8b: aload 7
      // 0f8d: ifnonnull 0ffd
      // 0f90: aload 24
      // 0f92: getfield com/finalshell/core/Ph2.D Z
      // 0f95: aload 7
      // 0f97: ifnull 0fb7
      // 0f9a: goto 0fa1
      // 0f9d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa0: athrow
      // 0fa1: ifeq 0fee
      // 0fa4: goto 0fab
      // 0fa7: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0faa: athrow
      // 0fab: aload 30
      // 0fad: instanceof java/util/Map
      // 0fb0: goto 0fb7
      // 0fb3: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb6: athrow
      // 0fb7: aload 7
      // 0fb9: ifnull 0fd7
      // 0fbc: ifeq 0fee
      // 0fbf: goto 0fc6
      // 0fc2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc5: athrow
      // 0fc6: aload 30
      // 0fc8: checkcast java/util/Map
      // 0fcb: invokeinterface java/util/Map.size ()I 1
      // 0fd0: goto 0fd7
      // 0fd3: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd6: athrow
      // 0fd7: aload 7
      // 0fd9: ifnull 0fe7
      // 0fdc: ifne 0fee
      // 0fdf: goto 0fe6
      // 0fe2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe5: athrow
      // 0fe6: bipush 0
      // 0fe7: istore 15
      // 0fe9: aload 7
      // 0feb: ifnonnull 10fb
      // 0fee: aload 22
      // 0ff0: aload 1
      // 0ff1: aload 30
      // 0ff3: invokevirtual com/finalshell/core/Nc2.L (Lcom/finalshell/core/NL3;Ljava/lang/Object;)V
      // 0ff6: goto 0ffd
      // 0ff9: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ffc: athrow
      // 0ffd: aload 7
      // 0fff: ifnonnull 1011
      // 1002: aload 22
      // 1004: aload 1
      // 1005: aload 30
      // 1007: invokevirtual com/finalshell/core/Nc2.L (Lcom/finalshell/core/NL3;Ljava/lang/Object;)V
      // 100a: goto 1011
      // 100d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1010: athrow
      // 1011: bipush 0
      // 1012: istore 33
      // 1014: aload 24
      // 1016: getfield com/finalshell/core/Ph2.D Z
      // 1019: aload 7
      // 101b: ifnull 10e9
      // 101e: ifeq 10e7
      // 1021: goto 1028
      // 1024: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1027: athrow
      // 1028: aload 30
      // 102a: instanceof java/util/Map
      // 102d: aload 7
      // 102f: ifnull 10e9
      // 1032: goto 1039
      // 1035: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1038: athrow
      // 1039: ifeq 10e7
      // 103c: goto 1043
      // 103f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1042: athrow
      // 1043: aload 30
      // 1045: checkcast java/util/Map
      // 1048: astore 34
      // 104a: aload 34
      // 104c: invokeinterface java/util/Map.size ()I 1
      // 1051: aload 7
      // 1053: ifnull 1076
      // 1056: ifne 1068
      // 1059: goto 1060
      // 105c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105f: athrow
      // 1060: bipush 1
      // 1061: istore 33
      // 1063: aload 7
      // 1065: ifnonnull 10e7
      // 1068: aload 1
      // 1069: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 106c: invokevirtual com/finalshell/core/NL3.z (Lcom/finalshell/ui/model/EP;)Z
      // 106f: goto 1076
      // 1072: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1075: athrow
      // 1076: aload 7
      // 1078: ifnull 10e9
      // 107b: ifne 10e7
      // 107e: goto 1085
      // 1081: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1084: athrow
      // 1085: bipush 0
      // 1086: istore 35
      // 1088: aload 34
      // 108a: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 108f: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1094: astore 36
      // 1096: aload 36
      // 1098: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 109d: ifeq 10d3
      // 10a0: aload 36
      // 10a2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10a7: astore 37
      // 10a9: aload 7
      // 10ab: ifnull 10c2
      // 10ae: aload 37
      // 10b0: aload 7
      // 10b2: ifnull 040f
      // 10b5: goto 10bc
      // 10b8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10bb: athrow
      // 10bc: ifnull 10c7
      // 10bf: bipush 1
      // 10c0: istore 35
      // 10c2: aload 7
      // 10c4: ifnonnull 10d3
      // 10c7: aload 7
      // 10c9: ifnonnull 1096
      // 10cc: goto 10d3
      // 10cf: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d2: athrow
      // 10d3: iload 35
      // 10d5: aload 7
      // 10d7: ifnull 10e9
      // 10da: ifne 10e7
      // 10dd: goto 10e4
      // 10e0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e3: athrow
      // 10e4: bipush 1
      // 10e5: istore 33
      // 10e7: iload 33
      // 10e9: aload 7
      // 10eb: ifnull 10f9
      // 10ee: ifne 10fb
      // 10f1: goto 10f8
      // 10f4: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f7: athrow
      // 10f8: bipush 1
      // 10f9: istore 15
      // 10fb: iinc 21 1
      // 10fe: aload 7
      // 1100: ifnonnull 027c
      // 1103: aload 0
      // 1104: aload 1
      // 1105: aload 2
      // 1106: iload 15
      // 1108: aload 7
      // 110a: ifnull 1120
      // 110d: ifeq 1123
      // 1110: goto 1117
      // 1113: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1116: athrow
      // 1117: sipush 11729
      // 111a: ldc2_w 5727250840277747211
      // 111d: invokestatic com/finalshell/core/Nj4.a (IJ)I
      // 1120: goto 1124
      // 1123: bipush 0
      // 1124: invokevirtual com/finalshell/core/Nj4.v (Lcom/finalshell/core/NL3;Ljava/lang/Object;C)C
      // 1127: pop
      // 1128: aload 9
      // 112a: arraylength
      // 112b: aload 7
      // 112d: ifnull 1169
      // 1130: ifle 1167
      // 1133: goto 113a
      // 1136: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1139: athrow
      // 113a: aload 8
      // 113c: getstatic com/finalshell/ui/model/EP.PrettyFormat Lcom/finalshell/ui/model/EP;
      // 113f: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 1142: aload 7
      // 1144: ifnull 1169
      // 1147: goto 114e
      // 114a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114d: athrow
      // 114e: ifeq 1167
      // 1151: goto 1158
      // 1154: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1157: athrow
      // 1158: aload 1
      // 1159: invokevirtual com/finalshell/core/NL3.r ()V
      // 115c: aload 1
      // 115d: invokevirtual com/finalshell/core/NL3.i ()V
      // 1160: goto 1167
      // 1163: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1166: athrow
      // 1167: iload 6
      // 1169: ifne 117b
      // 116c: aload 8
      // 116e: iload 14
      // 1170: invokevirtual com/finalshell/io/YM3.T (C)Lcom/finalshell/io/YM3;
      // 1173: pop
      // 1174: goto 117b
      // 1177: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117a: athrow
      // 117b: aload 1
      // 117c: aload 10
      // 117e: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 1181: goto 131a
      // 1184: astore 13
      // 1186: sipush -18567
      // 1189: sipush -3110
      // 118c: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 118f: astore 14
      // 1191: aload 2
      // 1192: aload 7
      // 1194: ifnull 11c9
      // 1197: ifnull 11c8
      // 119a: goto 11a1
      // 119d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11a0: athrow
      // 11a1: new java/lang/StringBuilder
      // 11a4: dup
      // 11a5: invokespecial java/lang/StringBuilder.<init> ()V
      // 11a8: aload 14
      // 11aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11ad: sipush -18573
      // 11b0: sipush -13174
      // 11b3: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 11b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b9: aload 2
      // 11ba: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 11bd: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 11c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11c6: astore 14
      // 11c8: aload 3
      // 11c9: ifnull 11f2
      // 11cc: new java/lang/StringBuilder
      // 11cf: dup
      // 11d0: invokespecial java/lang/StringBuilder.<init> ()V
      // 11d3: aload 14
      // 11d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d8: sipush -18572
      // 11db: sipush 20962
      // 11de: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 11e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e4: aload 3
      // 11e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 11e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11eb: astore 14
      // 11ed: aload 7
      // 11ef: ifnonnull 1295
      // 11f2: aload 12
      // 11f4: aload 7
      // 11f6: ifnull 120c
      // 11f9: goto 1200
      // 11fc: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11ff: athrow
      // 1200: ifnull 1295
      // 1203: goto 120a
      // 1206: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1209: athrow
      // 120a: aload 12
      // 120c: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 120f: aload 7
      // 1211: ifnull 122a
      // 1214: ifnull 1295
      // 1217: goto 121e
      // 121a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121d: athrow
      // 121e: aload 12
      // 1220: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 1223: goto 122a
      // 1226: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1229: athrow
      // 122a: astore 15
      // 122c: aload 7
      // 122e: ifnull 1268
      // 1231: aload 15
      // 1233: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 1236: ifnull 126d
      // 1239: goto 1240
      // 123c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123f: athrow
      // 1240: new java/lang/StringBuilder
      // 1243: dup
      // 1244: invokespecial java/lang/StringBuilder.<init> ()V
      // 1247: aload 14
      // 1249: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124c: sipush -18562
      // 124f: sipush 19268
      // 1252: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 1255: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1258: aload 15
      // 125a: getfield com/finalshell/core/Ph2.Y Ljava/lang/reflect/Method;
      // 125d: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 1260: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1263: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1266: astore 14
      // 1268: aload 7
      // 126a: ifnonnull 1295
      // 126d: new java/lang/StringBuilder
      // 1270: dup
      // 1271: invokespecial java/lang/StringBuilder.<init> ()V
      // 1274: aload 14
      // 1276: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1279: sipush -18569
      // 127c: sipush 11104
      // 127f: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 1282: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1285: aload 12
      // 1287: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 128a: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 128d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1290: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1293: astore 14
      // 1295: aload 13
      // 1297: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 129a: aload 7
      // 129c: ifnull 12d3
      // 129f: ifnull 12d5
      // 12a2: goto 12a9
      // 12a5: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a8: athrow
      // 12a9: new java/lang/StringBuilder
      // 12ac: dup
      // 12ad: invokespecial java/lang/StringBuilder.<init> ()V
      // 12b0: aload 14
      // 12b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b5: sipush -18574
      // 12b8: sipush 9979
      // 12bb: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 12be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12c1: aload 13
      // 12c3: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 12c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12cc: goto 12d3
      // 12cf: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d2: athrow
      // 12d3: astore 14
      // 12d5: aconst_null
      // 12d6: astore 15
      // 12d8: aload 13
      // 12da: aload 7
      // 12dc: ifnull 12f8
      // 12df: instanceof java/lang/reflect/InvocationTargetException
      // 12e2: ifeq 12fa
      // 12e5: goto 12ec
      // 12e8: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12eb: athrow
      // 12ec: aload 13
      // 12ee: invokevirtual java/lang/Exception.getCause ()Ljava/lang/Throwable;
      // 12f1: goto 12f8
      // 12f4: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12f7: athrow
      // 12f8: astore 15
      // 12fa: aload 15
      // 12fc: ifnonnull 1303
      // 12ff: aload 13
      // 1301: astore 15
      // 1303: new com/finalshell/core/Hi2
      // 1306: dup
      // 1307: aload 14
      // 1309: aload 15
      // 130b: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 130e: athrow
      // 130f: astore 38
      // 1311: aload 1
      // 1312: aload 10
      // 1314: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 1317: aload 38
      // 1319: athrow
      // 131a: return
   }

   public void w(NL3 var1, String var2, Object var3) {
      java.lang.Class var10;
      String var4 = Nv4.o();

      String var10000;
      label57: {
         label56: {
            try {
               var10000 = var2;
               if (var4 == null) {
                  break label57;
               }

               if (var2 != null) {
                  break label56;
               }
            } catch (Hi2 var9) {
               throw a(var9);
            }

            var2 = var1.B.t;
         }

         var1.w.o(var2, false);
         var10000 = this.j.j;
      }

      String var5 = var10000;

      label61: {
         try {
            if (var4 == null) {
               return;
            }

            if (var5 != null) {
               break label61;
            }
         } catch (Hi2 var8) {
            throw a(var8);
         }

         java.lang.Class var6 = var3.getClass();

         label39: {
            label38: {
               try {
                  var10 = var6;
                  if (var4 == null) {
                     break label39;
                  }

                  if (!B8_2.F(var6)) {
                     break label38;
                  }
               } catch (Hi2 var7) {
                  throw a(var7);
               }

               var6 = var6.getSuperclass();
            }

            var10 = var6;
         }

         var5 = var10.getName();
      }

      var1.l(var5);
   }

   public boolean e(NL3 param1, Object param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 07: astore 5
      // 09: astore 4
      // 0b: getstatic com/finalshell/ui/model/EP.DisableCircularReferenceDetect Lcom/finalshell/ui/model/EP;
      // 0e: getfield com/finalshell/ui/model/EP.mask I
      // 11: istore 6
      // 13: aload 5
      // 15: aload 4
      // 17: ifnull 26
      // 1a: ifnull 55
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 5
      // 26: getfield com/finalshell/core/Uh2_2.g I
      // 29: iload 6
      // 2b: iand
      // 2c: aload 4
      // 2e: ifnull 56
      // 31: ifne 55
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: iload 3
      // 3c: iload 6
      // 3e: iand
      // 3f: aload 4
      // 41: ifnull 56
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: ifeq 57
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
      // 57: aload 1
      // 58: getfield com/finalshell/core/NL3.Y Ljava/util/IdentityHashMap;
      // 5b: aload 4
      // 5d: ifnull 75
      // 60: ifnull 93
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: aload 1
      // 6b: getfield com/finalshell/core/NL3.Y Ljava/util/IdentityHashMap;
      // 6e: goto 75
      // 71: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 2
      // 76: invokevirtual java/util/IdentityHashMap.containsKey (Ljava/lang/Object;)Z
      // 79: aload 4
      // 7b: ifnull 94
      // 7e: ifeq 93
      // 81: goto 88
      // 84: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: aload 1
      // 89: aload 2
      // 8a: invokevirtual com/finalshell/core/NL3.G (Ljava/lang/Object;)V
      // 8d: bipush 1
      // 8e: ireturn
      // 8f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92: athrow
      // 93: bipush 0
      // 94: ireturn
   }

   public boolean x(NL3 var1) {
      return this.N(var1, 0);
   }

   public boolean N(NL3 param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: getstatic com/finalshell/ui/model/EP.BeanToArray Lcom/finalshell/ui/model/EP;
      // 06: getfield com/finalshell/ui/model/EP.mask I
      // 09: istore 4
      // 0b: astore 3
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Nj4.j Lcom/finalshell/core/Zzzzd4BeanInfo;
      // 10: getfield com/finalshell/core/Zzzzd4BeanInfo.P I
      // 13: iload 4
      // 15: iand
      // 16: aload 3
      // 17: ifnull 5a
      // 1a: ifne 59
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 1
      // 25: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 28: getfield com/finalshell/io/YM3.A Z
      // 2b: aload 3
      // 2c: ifnull 5a
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: ifne 59
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: iload 2
      // 41: iload 4
      // 43: iand
      // 44: aload 3
      // 45: ifnull 5a
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: ifeq 5d
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   public Object W(Object param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 2
      // 05: invokevirtual com/finalshell/core/Nj4.d (Ljava/lang/String;)Lcom/finalshell/core/Nc2;
      // 08: astore 4
      // 0a: astore 3
      // 0b: aload 4
      // 0d: aload 3
      // 0e: ifnull 47
      // 11: ifnonnull 41
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: new com/finalshell/core/Hi2
      // 1e: dup
      // 1f: new java/lang/StringBuilder
      // 22: dup
      // 23: invokespecial java/lang/StringBuilder.<init> ()V
      // 26: sipush -18575
      // 29: sipush -24613
      // 2c: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 2f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32: aload 2
      // 33: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 39: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 4
      // 43: aload 1
      // 44: invokevirtual com/finalshell/core/Nc2.d (Ljava/lang/Object;)Ljava/lang/Object;
      // 47: areturn
      // 48: astore 5
      // 4a: new com/finalshell/core/Hi2
      // 4d: dup
      // 4e: new java/lang/StringBuilder
      // 51: dup
      // 52: invokespecial java/lang/StringBuilder.<init> ()V
      // 55: sipush -18568
      // 58: sipush 11301
      // 5b: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 61: aload 2
      // 62: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 68: aload 5
      // 6a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 6d: athrow
      // 6e: astore 5
      // 70: new com/finalshell/core/Hi2
      // 73: dup
      // 74: new java/lang/StringBuilder
      // 77: dup
      // 78: invokespecial java/lang/StringBuilder.<init> ()V
      // 7b: sipush -18568
      // 7e: sipush 11301
      // 81: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87: aload 2
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8e: aload 5
      // 90: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 93: athrow
   }

   public Object R(Object param1, String param2, long param3, boolean param5) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: lload 3
      // 05: invokevirtual com/finalshell/core/Nj4.d (J)Lcom/finalshell/core/Nc2;
      // 08: astore 7
      // 0a: astore 6
      // 0c: aload 7
      // 0e: aload 6
      // 10: ifnull 57
      // 13: ifnonnull 51
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: iload 5
      // 1f: ifeq 4f
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: new com/finalshell/core/Hi2
      // 2c: dup
      // 2d: new java/lang/StringBuilder
      // 30: dup
      // 31: invokespecial java/lang/StringBuilder.<init> ()V
      // 34: sipush -18576
      // 37: sipush 21518
      // 3a: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 3d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40: aload 2
      // 41: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 47: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 4a: athrow
      // 4b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aconst_null
      // 50: areturn
      // 51: aload 7
      // 53: aload 1
      // 54: invokevirtual com/finalshell/core/Nc2.d (Ljava/lang/Object;)Ljava/lang/Object;
      // 57: areturn
      // 58: astore 8
      // 5a: new com/finalshell/core/Hi2
      // 5d: dup
      // 5e: new java/lang/StringBuilder
      // 61: dup
      // 62: invokespecial java/lang/StringBuilder.<init> ()V
      // 65: sipush -18570
      // 68: sipush 12449
      // 6b: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 6e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71: aload 2
      // 72: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 78: aload 8
      // 7a: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 7d: athrow
      // 7e: astore 8
      // 80: new com/finalshell/core/Hi2
      // 83: dup
      // 84: new java/lang/StringBuilder
      // 87: dup
      // 88: invokespecial java/lang/StringBuilder.<init> ()V
      // 8b: sipush -18568
      // 8e: sipush 11301
      // 91: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 94: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 97: aload 2
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9e: aload 8
      // a0: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // a3: athrow
   }

   public Nc2 d(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnonnull 0e
      // 08: aconst_null
      // 09: areturn
      // 0a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d: athrow
      // 0e: bipush 0
      // 0f: istore 3
      // 10: aload 0
      // 11: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 14: arraylength
      // 15: bipush 1
      // 16: isub
      // 17: istore 4
      // 19: iload 3
      // 1a: iload 4
      // 1c: if_icmpgt 8f
      // 1f: iload 3
      // 20: iload 4
      // 22: iadd
      // 23: bipush 1
      // 24: iushr
      // 25: istore 5
      // 27: aload 0
      // 28: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 2b: iload 5
      // 2d: aaload
      // 2e: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 31: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 34: astore 6
      // 36: aload 6
      // 38: aload 1
      // 39: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 3c: istore 7
      // 3e: iload 7
      // 40: aload 2
      // 41: ifnull 60
      // 44: ifge 57
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: iload 5
      // 50: bipush 1
      // 51: iadd
      // 52: istore 3
      // 53: aload 2
      // 54: ifnonnull 8b
      // 57: iload 7
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: aload 2
      // 61: ifnull 79
      // 64: ifle 7f
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: iload 5
      // 70: bipush 1
      // 71: isub
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: istore 4
      // 7b: aload 2
      // 7c: ifnonnull 8b
      // 7f: aload 0
      // 80: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 83: iload 5
      // 85: aaload
      // 86: areturn
      // 87: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a: athrow
      // 8b: aload 2
      // 8c: ifnonnull 19
      // 8f: aconst_null
      // 90: areturn
   }

   public Nc2 d(long param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aconst_null
      // 004: astore 4
      // 006: astore 3
      // 007: aload 0
      // 008: getfield com/finalshell/core/Nj4.i [J
      // 00b: ifnonnull 0bf
      // 00e: invokestatic com/finalshell/ui/model/D.values ()[Lcom/finalshell/ui/model/D;
      // 011: astore 4
      // 013: aload 0
      // 014: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 017: arraylength
      // 018: aload 4
      // 01a: arraylength
      // 01b: imul
      // 01c: newarray 11
      // 01e: astore 5
      // 020: bipush 0
      // 021: istore 6
      // 023: bipush 0
      // 024: istore 7
      // 026: iload 7
      // 028: aload 0
      // 029: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 02c: arraylength
      // 02d: if_icmpge 0a2
      // 030: aload 0
      // 031: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 034: iload 7
      // 036: aaload
      // 037: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 03a: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 03d: astore 8
      // 03f: aload 5
      // 041: iload 6
      // 043: iinc 6 1
      // 046: aload 8
      // 048: invokestatic com/finalshell/core/B8_2.z$long (Ljava/lang/String;)J
      // 04b: lastore
      // 04c: bipush 0
      // 04d: aload 3
      // 04e: ifnull 0c7
      // 051: istore 9
      // 053: iload 9
      // 055: aload 4
      // 057: arraylength
      // 058: if_icmpge 09b
      // 05b: aload 4
      // 05d: iload 9
      // 05f: aaload
      // 060: aload 8
      // 062: invokevirtual com/finalshell/ui/model/D.C (Ljava/lang/String;)Ljava/lang/String;
      // 065: astore 10
      // 067: aload 8
      // 069: aload 10
      // 06b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06e: aload 3
      // 06f: ifnull 028
      // 072: ifeq 080
      // 075: aload 3
      // 076: ifnonnull 094
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 5
      // 082: iload 6
      // 084: iinc 6 1
      // 087: aload 10
      // 089: invokestatic com/finalshell/core/B8_2.z$long (Ljava/lang/String;)J
      // 08c: lastore
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: iinc 9 1
      // 097: aload 3
      // 098: ifnonnull 053
      // 09b: iinc 7 1
      // 09e: aload 3
      // 09f: ifnonnull 026
      // 0a2: aload 5
      // 0a4: bipush 0
      // 0a5: iload 6
      // 0a7: invokestatic java/util/Arrays.sort ([JII)V
      // 0aa: aload 0
      // 0ab: iload 6
      // 0ad: newarray 11
      // 0af: putfield com/finalshell/core/Nj4.i [J
      // 0b2: aload 5
      // 0b4: bipush 0
      // 0b5: aload 0
      // 0b6: getfield com/finalshell/core/Nj4.i [J
      // 0b9: bipush 0
      // 0ba: iload 6
      // 0bc: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/Nj4.i [J
      // 0c3: lload 1
      // 0c4: invokestatic java/util/Arrays.binarySearch ([JJ)I
      // 0c7: istore 5
      // 0c9: iload 5
      // 0cb: ifge 0d4
      // 0ce: aconst_null
      // 0cf: areturn
      // 0d0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield com/finalshell/core/Nj4.w [S
      // 0d8: aload 3
      // 0d9: ifnull 1ec
      // 0dc: ifnonnull 1e8
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e5: athrow
      // 0e6: aload 4
      // 0e8: aload 3
      // 0e9: ifnull 100
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: ifnonnull 102
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: invokestatic com/finalshell/ui/model/D.values ()[Lcom/finalshell/ui/model/D;
      // 100: astore 4
      // 102: aload 0
      // 103: getfield com/finalshell/core/Nj4.i [J
      // 106: arraylength
      // 107: newarray 9
      // 109: astore 6
      // 10b: aload 6
      // 10d: bipush -1
      // 10e: invokestatic java/util/Arrays.fill ([SS)V
      // 111: bipush 0
      // 112: istore 7
      // 114: iload 7
      // 116: aload 0
      // 117: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 11a: arraylength
      // 11b: if_icmpge 1e2
      // 11e: aload 0
      // 11f: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 122: iload 7
      // 124: aaload
      // 125: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 128: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 12b: astore 8
      // 12d: aload 0
      // 12e: getfield com/finalshell/core/Nj4.i [J
      // 131: aload 8
      // 133: invokestatic com/finalshell/core/B8_2.z$long (Ljava/lang/String;)J
      // 136: invokestatic java/util/Arrays.binarySearch ([JJ)I
      // 139: istore 9
      // 13b: iload 9
      // 13d: aload 3
      // 13e: ifnull 1ef
      // 141: aload 3
      // 142: ifnull 166
      // 145: goto 14c
      // 148: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: iflt 165
      // 14f: goto 156
      // 152: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: aload 6
      // 158: iload 9
      // 15a: iload 7
      // 15c: i2s
      // 15d: sastore
      // 15e: goto 165
      // 161: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: bipush 0
      // 166: istore 10
      // 168: iload 10
      // 16a: aload 4
      // 16c: arraylength
      // 16d: if_icmpge 1db
      // 170: aload 4
      // 172: iload 10
      // 174: aaload
      // 175: aload 8
      // 177: invokevirtual com/finalshell/ui/model/D.C (Ljava/lang/String;)Ljava/lang/String;
      // 17a: astore 11
      // 17c: aload 8
      // 17e: aload 11
      // 180: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 183: aload 3
      // 184: ifnull 116
      // 187: aload 3
      // 188: ifnull 1b3
      // 18b: ifeq 1a0
      // 18e: goto 195
      // 191: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: aload 3
      // 196: ifnonnull 1d4
      // 199: goto 1a0
      // 19c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: getfield com/finalshell/core/Nj4.i [J
      // 1a4: aload 11
      // 1a6: invokestatic com/finalshell/core/B8_2.z$long (Ljava/lang/String;)J
      // 1a9: invokestatic java/util/Arrays.binarySearch ([JJ)I
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: istore 12
      // 1b5: aload 3
      // 1b6: ifnull 1d7
      // 1b9: iload 12
      // 1bb: iflt 1d4
      // 1be: goto 1c5
      // 1c1: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c4: athrow
      // 1c5: aload 6
      // 1c7: iload 12
      // 1c9: iload 7
      // 1cb: i2s
      // 1cc: sastore
      // 1cd: goto 1d4
      // 1d0: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: iinc 10 1
      // 1d7: aload 3
      // 1d8: ifnonnull 168
      // 1db: iinc 7 1
      // 1de: aload 3
      // 1df: ifnonnull 114
      // 1e2: aload 0
      // 1e3: aload 6
      // 1e5: putfield com/finalshell/core/Nj4.w [S
      // 1e8: aload 0
      // 1e9: getfield com/finalshell/core/Nj4.w [S
      // 1ec: iload 5
      // 1ee: saload
      // 1ef: istore 6
      // 1f1: iload 6
      // 1f3: bipush -1
      // 1f4: if_icmpeq 203
      // 1f7: aload 0
      // 1f8: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 1fb: iload 6
      // 1fd: aaload
      // 1fe: areturn
      // 1ff: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: aconst_null
      // 204: areturn
   }

   public List Y(Object var1) throws Exception {
      ArrayList var9;
      ArrayList var3 = new ArrayList(this.b.length);
      String var10000 = Nv4.o();
      Nc2[] var4 = this.b;
      int var5 = var4.length;
      String var2 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            Nc2 var7 = var4[var6];

            try {
               var9 = var3;
               if (var2 == null) {
                  break;
               }

               var3.add(var7.d(var1));
               var6++;
               if (var2 != null) {
                  continue;
               }
            } catch (Exception var8) {
               throw a(var8);
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   public List y(Object param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: aload 0
      // 05: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 08: arraylength
      // 09: invokespecial java/util/ArrayList.<init> (I)V
      // 0c: astore 3
      // 0d: aload 0
      // 0e: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 11: astore 4
      // 13: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 16: aload 4
      // 18: arraylength
      // 19: istore 5
      // 1b: bipush 0
      // 1c: istore 6
      // 1e: astore 2
      // 1f: iload 6
      // 21: iload 5
      // 23: if_icmpge a1
      // 26: aload 4
      // 28: iload 6
      // 2a: aaload
      // 2b: astore 7
      // 2d: aload 7
      // 2f: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 32: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 35: astore 8
      // 37: aload 8
      // 39: invokevirtual java/lang/Class.isPrimitive ()Z
      // 3c: aload 2
      // 3d: ifnull 6d
      // 40: ifeq 55
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: aload 2
      // 4b: ifnonnull 9a
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: aload 8
      // 57: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 5a: sipush -18565
      // 5d: sipush -20733
      // 60: invokestatic com/finalshell/core/Nj4.a (II)Ljava/lang/String;
      // 63: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 2
      // 6e: ifnull 99
      // 71: ifeq 86
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: aload 2
      // 7c: ifnonnull 9a
      // 7f: goto 86
      // 82: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 3
      // 87: aload 7
      // 89: aload 1
      // 8a: invokevirtual com/finalshell/core/Nc2.d (Ljava/lang/Object;)Ljava/lang/Object;
      // 8d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 92: goto 99
      // 95: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: pop
      // 9a: iinc 6 1
      // 9d: aload 2
      // 9e: ifnonnull 1f
      // a1: aload 3
      // a2: areturn
   }

   public int J(Object param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 05: aload 0
      // 06: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 09: astore 4
      // 0b: astore 2
      // 0c: aload 4
      // 0e: arraylength
      // 0f: istore 5
      // 11: bipush 0
      // 12: istore 6
      // 14: iload 6
      // 16: iload 5
      // 18: if_icmpge 4b
      // 1b: aload 4
      // 1d: iload 6
      // 1f: aaload
      // 20: astore 7
      // 22: aload 7
      // 24: aload 1
      // 25: invokevirtual com/finalshell/core/Nc2.t (Ljava/lang/Object;)Ljava/lang/Object;
      // 28: astore 8
      // 2a: aload 2
      // 2b: ifnull 47
      // 2e: aload 8
      // 30: ifnull 44
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: iinc 3 1
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: iinc 6 1
      // 47: aload 2
      // 48: ifnonnull 14
      // 4b: iload 3
      // 4c: ireturn
   }

   public Set v(Object param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: new java/util/HashSet
      // 06: dup
      // 07: invokespecial java/util/HashSet.<init> ()V
      // 0a: astore 3
      // 0b: astore 2
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 10: astore 4
      // 12: aload 4
      // 14: arraylength
      // 15: istore 5
      // 17: bipush 0
      // 18: istore 6
      // 1a: iload 6
      // 1c: iload 5
      // 1e: if_icmpge 5d
      // 21: aload 4
      // 23: iload 6
      // 25: aaload
      // 26: astore 7
      // 28: aload 7
      // 2a: aload 1
      // 2b: invokevirtual com/finalshell/core/Nc2.t (Ljava/lang/Object;)Ljava/lang/Object;
      // 2e: astore 8
      // 30: aload 2
      // 31: ifnull 59
      // 34: aload 8
      // 36: ifnull 56
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 3
      // 41: aload 7
      // 43: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 46: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 49: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 4e: pop
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: iinc 6 1
      // 59: aload 2
      // 5a: ifnonnull 1a
      // 5d: aload 3
      // 5e: areturn
   }

   public Map k(Object param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: new java/util/LinkedHashMap
      // 006: dup
      // 007: aload 0
      // 008: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 00b: arraylength
      // 00c: invokespecial java/util/LinkedHashMap.<init> (I)V
      // 00f: astore 3
      // 010: astore 2
      // 011: bipush 1
      // 012: istore 4
      // 014: aconst_null
      // 015: astore 5
      // 017: aload 0
      // 018: getfield com/finalshell/core/Nj4.b [Lcom/finalshell/core/Nc2;
      // 01b: astore 6
      // 01d: aload 6
      // 01f: arraylength
      // 020: istore 7
      // 022: bipush 0
      // 023: istore 8
      // 025: iload 8
      // 027: iload 7
      // 029: if_icmpge 12b
      // 02c: aload 6
      // 02e: iload 8
      // 030: aaload
      // 031: astore 9
      // 033: aload 9
      // 035: getfield com/finalshell/core/Nc2.V I
      // 038: getstatic com/finalshell/ui/model/EP.SkipTransientField Lcom/finalshell/ui/model/EP;
      // 03b: invokestatic com/finalshell/ui/model/EP.e (ILcom/finalshell/ui/model/EP;)Z
      // 03e: istore 4
      // 040: aload 9
      // 042: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 045: astore 5
      // 047: iload 4
      // 049: aload 2
      // 04a: ifnull 0ad
      // 04d: ifeq 093
      // 050: goto 057
      // 053: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: aload 5
      // 059: aload 2
      // 05a: ifnull 09f
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: ifnull 093
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aload 5
      // 070: getfield com/finalshell/core/Ph2.Z Z
      // 073: aload 2
      // 074: ifnull 0ad
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: ifeq 093
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: aload 2
      // 089: ifnonnull 124
      // 08c: goto 093
      // 08f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: aload 9
      // 095: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: aload 2
      // 0a0: ifnull 123
      // 0a3: getfield com/finalshell/core/Ph2.D Z
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: ifeq 108
      // 0b0: aload 9
      // 0b2: aload 1
      // 0b3: invokevirtual com/finalshell/core/Nc2.d (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b6: astore 10
      // 0b8: aload 10
      // 0ba: invokestatic com/finalshell/core/Ok2.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 0bd: astore 11
      // 0bf: aload 11
      // 0c1: aload 2
      // 0c2: ifnull 103
      // 0c5: instanceof java/util/Map
      // 0c8: ifeq 0e8
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: aload 3
      // 0d3: aload 11
      // 0d5: checkcast java/util/Map
      // 0d8: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 0dd: aload 2
      // 0de: ifnonnull 104
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 3
      // 0e9: aload 9
      // 0eb: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 0ee: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 0f1: aload 9
      // 0f3: aload 1
      // 0f4: invokevirtual com/finalshell/core/Nc2.d (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0fc: goto 103
      // 0ff: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: pop
      // 104: aload 2
      // 105: ifnonnull 124
      // 108: aload 3
      // 109: aload 9
      // 10b: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 10e: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 111: aload 9
      // 113: aload 1
      // 114: invokevirtual com/finalshell/core/Nc2.d (Ljava/lang/Object;)Ljava/lang/Object;
      // 117: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: pop
      // 124: iinc 8 1
      // 127: aload 2
      // 128: ifnonnull 025
      // 12b: aload 3
      // 12c: areturn
   }

   public DL3 n(int var1) {
      return this.b[var1].D;
   }

   public Type Q(int var1) {
      return this.b[var1].j.a;
   }

   public char Q(NL3 param1, Object param2, char param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 1
      // 06: getfield com/finalshell/core/NL3.J Ljava/util/List;
      // 09: aload 4
      // 0b: ifnull 57
      // 0e: ifnull 53
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 1
      // 19: getfield com/finalshell/core/NL3.J Ljava/util/List;
      // 1c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 21: astore 5
      // 23: aload 5
      // 25: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a: ifeq 53
      // 2d: aload 5
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast com/finalshell/core/IK
      // 37: astore 6
      // 39: aload 6
      // 3b: aload 1
      // 3c: aload 2
      // 3d: iload 3
      // 3e: invokevirtual com/finalshell/core/IK.v (Lcom/finalshell/core/NL3;Ljava/lang/Object;C)C
      // 41: istore 3
      // 42: aload 4
      // 44: ifnull a1
      // 47: aload 4
      // 49: ifnonnull 23
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: aload 0
      // 54: getfield com/finalshell/core/Nj4.J Ljava/util/List;
      // 57: aload 4
      // 59: ifnull 71
      // 5c: ifnull a1
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 0
      // 67: getfield com/finalshell/core/Nj4.J Ljava/util/List;
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 76: astore 5
      // 78: aload 5
      // 7a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7f: ifeq a1
      // 82: aload 5
      // 84: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 89: checkcast com/finalshell/core/IK
      // 8c: astore 6
      // 8e: aload 6
      // 90: aload 1
      // 91: aload 2
      // 92: iload 3
      // 93: invokevirtual com/finalshell/core/IK.v (Lcom/finalshell/core/NL3;Ljava/lang/Object;C)C
      // 96: aload 4
      // 98: ifnull a2
      // 9b: istore 3
      // 9c: aload 4
      // 9e: ifnonnull 78
      // a1: iload 3
      // a2: ireturn
   }

   public char v(NL3 param1, Object param2, char param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 1
      // 06: getfield com/finalshell/core/NL3.s Ljava/util/List;
      // 09: aload 4
      // 0b: ifnull 57
      // 0e: ifnull 53
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 1
      // 19: getfield com/finalshell/core/NL3.s Ljava/util/List;
      // 1c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 21: astore 5
      // 23: aload 5
      // 25: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a: ifeq 53
      // 2d: aload 5
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast com/finalshell/core/H2
      // 37: astore 6
      // 39: aload 6
      // 3b: aload 1
      // 3c: aload 2
      // 3d: iload 3
      // 3e: invokevirtual com/finalshell/core/H2.y (Lcom/finalshell/core/NL3;Ljava/lang/Object;C)C
      // 41: istore 3
      // 42: aload 4
      // 44: ifnull a1
      // 47: aload 4
      // 49: ifnonnull 23
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: aload 0
      // 54: getfield com/finalshell/core/Nj4.s Ljava/util/List;
      // 57: aload 4
      // 59: ifnull 71
      // 5c: ifnull a1
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: aload 0
      // 67: getfield com/finalshell/core/Nj4.s Ljava/util/List;
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 76: astore 5
      // 78: aload 5
      // 7a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7f: ifeq a1
      // 82: aload 5
      // 84: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 89: checkcast com/finalshell/core/H2
      // 8c: astore 6
      // 8e: aload 6
      // 90: aload 1
      // 91: aload 2
      // 92: iload 3
      // 93: invokevirtual com/finalshell/core/H2.y (Lcom/finalshell/core/NL3;Ljava/lang/Object;C)C
      // 96: aload 4
      // 98: ifnull a2
      // 9b: istore 3
      // 9c: aload 4
      // 9e: ifnonnull 78
      // a1: iload 3
      // a2: ireturn
   }

   public boolean y(NL3 param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 1
      // 05: getfield com/finalshell/core/NL3.d Ljava/util/List;
      // 08: aload 3
      // 09: ifnull 62
      // 0c: ifnull 5e
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: getfield com/finalshell/core/NL3.d Ljava/util/List;
      // 1a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1f: astore 4
      // 21: aload 4
      // 23: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 28: ifeq 5e
      // 2b: aload 4
      // 2d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 32: checkcast com/finalshell/core/Wy4
      // 35: astore 5
      // 37: aload 5
      // 39: aload 2
      // 3a: invokeinterface com/finalshell/core/Wy4.F (Ljava/lang/String;)Z 2
      // 3f: aload 3
      // 40: ifnull c0
      // 43: aload 3
      // 44: ifnull 59
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: ifne 5a
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
      // 5a: aload 3
      // 5b: ifnonnull 21
      // 5e: aload 0
      // 5f: getfield com/finalshell/core/Nj4.d Ljava/util/List;
      // 62: aload 3
      // 63: ifnull 7b
      // 66: ifnull bf
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield com/finalshell/core/Nj4.d Ljava/util/List;
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 80: astore 4
      // 82: aload 4
      // 84: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 89: ifeq bf
      // 8c: aload 4
      // 8e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 93: checkcast com/finalshell/core/Wy4
      // 96: astore 5
      // 98: aload 5
      // 9a: aload 2
      // 9b: invokeinterface com/finalshell/core/Wy4.F (Ljava/lang/String;)Z 2
      // a0: aload 3
      // a1: ifnull c0
      // a4: aload 3
      // a5: ifnull ba
      // a8: goto af
      // ab: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: ifne bb
      // b2: goto b9
      // b5: invokestatic com/finalshell/core/Nj4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8: athrow
      // b9: bipush 0
      // ba: ireturn
      // bb: aload 3
      // bc: ifnonnull 82
      // bf: bipush 1
      // c0: ireturn
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ -18574) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 68;
               break;
            case 1:
               var10000 = 118;
               break;
            case 2:
               var10000 = 108;
               break;
            case 3:
               var10000 = 51;
               break;
            case 4:
               var10000 = 55;
               break;
            case 5:
               var10000 = 209;
               break;
            case 6:
               var10000 = 114;
               break;
            case 7:
               var10000 = 226;
               break;
            case 8:
               var10000 = 157;
               break;
            case 9:
               var10000 = 234;
               break;
            case 10:
               var10000 = 117;
               break;
            case 11:
               var10000 = 38;
               break;
            case 12:
               var10000 = 75;
               break;
            case 13:
               var10000 = 137;
               break;
            case 14:
               var10000 = 80;
               break;
            case 15:
               var10000 = 8;
               break;
            case 16:
               var10000 = 241;
               break;
            case 17:
               var10000 = 4;
               break;
            case 18:
               var10000 = 204;
               break;
            case 19:
               var10000 = 220;
               break;
            case 20:
               var10000 = 133;
               break;
            case 21:
               var10000 = 9;
               break;
            case 22:
               var10000 = 180;
               break;
            case 23:
               var10000 = 143;
               break;
            case 24:
               var10000 = 36;
               break;
            case 25:
               var10000 = 47;
               break;
            case 26:
               var10000 = 153;
               break;
            case 27:
               var10000 = 183;
               break;
            case 28:
               var10000 = 211;
               break;
            case 29:
               var10000 = 155;
               break;
            case 30:
               var10000 = 83;
               break;
            case 31:
               var10000 = 119;
               break;
            case 32:
               var10000 = 178;
               break;
            case 33:
               var10000 = 249;
               break;
            case 34:
               var10000 = 59;
               break;
            case 35:
               var10000 = 189;
               break;
            case 36:
               var10000 = 26;
               break;
            case 37:
               var10000 = 106;
               break;
            case 38:
               var10000 = 230;
               break;
            case 39:
               var10000 = 103;
               break;
            case 40:
               var10000 = 214;
               break;
            case 41:
               var10000 = 63;
               break;
            case 42:
               var10000 = 248;
               break;
            case 43:
               var10000 = 41;
               break;
            case 44:
               var10000 = 33;
               break;
            case 45:
               var10000 = 134;
               break;
            case 46:
               var10000 = 224;
               break;
            case 47:
               var10000 = 246;
               break;
            case 48:
               var10000 = 65;
               break;
            case 49:
               var10000 = 88;
               break;
            case 50:
               var10000 = 175;
               break;
            case 51:
               var10000 = 159;
               break;
            case 52:
               var10000 = 10;
               break;
            case 53:
               var10000 = 208;
               break;
            case 54:
               var10000 = 23;
               break;
            case 55:
               var10000 = 105;
               break;
            case 56:
               var10000 = 144;
               break;
            case 57:
               var10000 = 235;
               break;
            case 58:
               var10000 = 122;
               break;
            case 59:
               var10000 = 49;
               break;
            case 60:
               var10000 = 53;
               break;
            case 61:
               var10000 = 182;
               break;
            case 62:
               var10000 = 123;
               break;
            case 63:
               var10000 = 142;
               break;
            case 64:
               var10000 = 163;
               break;
            case 65:
               var10000 = 165;
               break;
            case 66:
               var10000 = 141;
               break;
            case 67:
               var10000 = 250;
               break;
            case 68:
               var10000 = 77;
               break;
            case 69:
               var10000 = 194;
               break;
            case 70:
               var10000 = 17;
               break;
            case 71:
               var10000 = 70;
               break;
            case 72:
               var10000 = 25;
               break;
            case 73:
               var10000 = 237;
               break;
            case 74:
               var10000 = 166;
               break;
            case 75:
               var10000 = 29;
               break;
            case 76:
               var10000 = 212;
               break;
            case 77:
               var10000 = 193;
               break;
            case 78:
               var10000 = 231;
               break;
            case 79:
               var10000 = 169;
               break;
            case 80:
               var10000 = 14;
               break;
            case 81:
               var10000 = 245;
               break;
            case 82:
               var10000 = 154;
               break;
            case 83:
               var10000 = 179;
               break;
            case 84:
               var10000 = 232;
               break;
            case 85:
               var10000 = 164;
               break;
            case 86:
               var10000 = 96;
               break;
            case 87:
               var10000 = 58;
               break;
            case 88:
               var10000 = 221;
               break;
            case 89:
               var10000 = 113;
               break;
            case 90:
               var10000 = 188;
               break;
            case 91:
               var10000 = 229;
               break;
            case 92:
               var10000 = 236;
               break;
            case 93:
               var10000 = 247;
               break;
            case 94:
               var10000 = 177;
               break;
            case 95:
               var10000 = 43;
               break;
            case 96:
               var10000 = 102;
               break;
            case 97:
               var10000 = 198;
               break;
            case 98:
               var10000 = 95;
               break;
            case 99:
               var10000 = 1;
               break;
            case 100:
               var10000 = 115;
               break;
            case 101:
               var10000 = 18;
               break;
            case 102:
               var10000 = 238;
               break;
            case 103:
               var10000 = 37;
               break;
            case 104:
               var10000 = 148;
               break;
            case 105:
               var10000 = 138;
               break;
            case 106:
               var10000 = 21;
               break;
            case 107:
               var10000 = 81;
               break;
            case 108:
               var10000 = 255;
               break;
            case 109:
               var10000 = 207;
               break;
            case 110:
               var10000 = 116;
               break;
            case 111:
               var10000 = 130;
               break;
            case 112:
               var10000 = 146;
               break;
            case 113:
               var10000 = 2;
               break;
            case 114:
               var10000 = 64;
               break;
            case 115:
               var10000 = 126;
               break;
            case 116:
               var10000 = 76;
               break;
            case 117:
               var10000 = 16;
               break;
            case 118:
               var10000 = 196;
               break;
            case 119:
               var10000 = 210;
               break;
            case 120:
               var10000 = 32;
               break;
            case 121:
               var10000 = 84;
               break;
            case 122:
               var10000 = 69;
               break;
            case 123:
               var10000 = 152;
               break;
            case 124:
               var10000 = 73;
               break;
            case 125:
               var10000 = 62;
               break;
            case 126:
               var10000 = 42;
               break;
            case 127:
               var10000 = 20;
               break;
            case 128:
               var10000 = 61;
               break;
            case 129:
               var10000 = 203;
               break;
            case 130:
               var10000 = 60;
               break;
            case 131:
               var10000 = 156;
               break;
            case 132:
               var10000 = 120;
               break;
            case 133:
               var10000 = 252;
               break;
            case 134:
               var10000 = 170;
               break;
            case 135:
               var10000 = 215;
               break;
            case 136:
               var10000 = 31;
               break;
            case 137:
               var10000 = 150;
               break;
            case 138:
               var10000 = 174;
               break;
            case 139:
               var10000 = 98;
               break;
            case 140:
               var10000 = 91;
               break;
            case 141:
               var10000 = 185;
               break;
            case 142:
               var10000 = 44;
               break;
            case 143:
               var10000 = 251;
               break;
            case 144:
               var10000 = 147;
               break;
            case 145:
               var10000 = 101;
               break;
            case 146:
               var10000 = 228;
               break;
            case 147:
               var10000 = 186;
               break;
            case 148:
               var10000 = 172;
               break;
            case 149:
               var10000 = 67;
               break;
            case 150:
               var10000 = 99;
               break;
            case 151:
               var10000 = 191;
               break;
            case 152:
               var10000 = 222;
               break;
            case 153:
               var10000 = 90;
               break;
            case 154:
               var10000 = 87;
               break;
            case 155:
               var10000 = 139;
               break;
            case 156:
               var10000 = 171;
               break;
            case 157:
               var10000 = 124;
               break;
            case 158:
               var10000 = 145;
               break;
            case 159:
               var10000 = 92;
               break;
            case 160:
               var10000 = 239;
               break;
            case 161:
               var10000 = 27;
               break;
            case 162:
               var10000 = 217;
               break;
            case 163:
               var10000 = 22;
               break;
            case 164:
               var10000 = 227;
               break;
            case 165:
               var10000 = 52;
               break;
            case 166:
               var10000 = 78;
               break;
            case 167:
               var10000 = 28;
               break;
            case 168:
               var10000 = 3;
               break;
            case 169:
               var10000 = 39;
               break;
            case 170:
               var10000 = 202;
               break;
            case 171:
               var10000 = 72;
               break;
            case 172:
               var10000 = 71;
               break;
            case 173:
               var10000 = 131;
               break;
            case 174:
               var10000 = 79;
               break;
            case 175:
               var10000 = 254;
               break;
            case 176:
               var10000 = 109;
               break;
            case 177:
               var10000 = 187;
               break;
            case 178:
               var10000 = 35;
               break;
            case 179:
               var10000 = 5;
               break;
            case 180:
               var10000 = 181;
               break;
            case 181:
               var10000 = 167;
               break;
            case 182:
               var10000 = 173;
               break;
            case 183:
               var10000 = 46;
               break;
            case 184:
               var10000 = 104;
               break;
            case 185:
               var10000 = 12;
               break;
            case 186:
               var10000 = 24;
               break;
            case 187:
               var10000 = 195;
               break;
            case 188:
               var10000 = 244;
               break;
            case 189:
               var10000 = 0;
               break;
            case 190:
               var10000 = 216;
               break;
            case 191:
               var10000 = 151;
               break;
            case 192:
               var10000 = 128;
               break;
            case 193:
               var10000 = 54;
               break;
            case 194:
               var10000 = 11;
               break;
            case 195:
               var10000 = 45;
               break;
            case 196:
               var10000 = 100;
               break;
            case 197:
               var10000 = 233;
               break;
            case 198:
               var10000 = 218;
               break;
            case 199:
               var10000 = 253;
               break;
            case 200:
               var10000 = 240;
               break;
            case 201:
               var10000 = 243;
               break;
            case 202:
               var10000 = 86;
               break;
            case 203:
               var10000 = 140;
               break;
            case 204:
               var10000 = 57;
               break;
            case 205:
               var10000 = 111;
               break;
            case 206:
               var10000 = 135;
               break;
            case 207:
               var10000 = 112;
               break;
            case 208:
               var10000 = 13;
               break;
            case 209:
               var10000 = 168;
               break;
            case 210:
               var10000 = 213;
               break;
            case 211:
               var10000 = 158;
               break;
            case 212:
               var10000 = 129;
               break;
            case 213:
               var10000 = 190;
               break;
            case 214:
               var10000 = 184;
               break;
            case 215:
               var10000 = 162;
               break;
            case 216:
               var10000 = 97;
               break;
            case 217:
               var10000 = 199;
               break;
            case 218:
               var10000 = 74;
               break;
            case 219:
               var10000 = 7;
               break;
            case 220:
               var10000 = 160;
               break;
            case 221:
               var10000 = 200;
               break;
            case 222:
               var10000 = 40;
               break;
            case 223:
               var10000 = 34;
               break;
            case 224:
               var10000 = 132;
               break;
            case 225:
               var10000 = 56;
               break;
            case 226:
               var10000 = 110;
               break;
            case 227:
               var10000 = 50;
               break;
            case 228:
               var10000 = 223;
               break;
            case 229:
               var10000 = 205;
               break;
            case 230:
               var10000 = 161;
               break;
            case 231:
               var10000 = 197;
               break;
            case 232:
               var10000 = 136;
               break;
            case 233:
               var10000 = 93;
               break;
            case 234:
               var10000 = 48;
               break;
            case 235:
               var10000 = 125;
               break;
            case 236:
               var10000 = 6;
               break;
            case 237:
               var10000 = 192;
               break;
            case 238:
               var10000 = 225;
               break;
            case 239:
               var10000 = 82;
               break;
            case 240:
               var10000 = 19;
               break;
            case 241:
               var10000 = 121;
               break;
            case 242:
               var10000 = 66;
               break;
            case 243:
               var10000 = 206;
               break;
            case 244:
               var10000 = 89;
               break;
            case 245:
               var10000 = 242;
               break;
            case 246:
               var10000 = 176;
               break;
            case 247:
               var10000 = 149;
               break;
            case 248:
               var10000 = 201;
               break;
            case 249:
               var10000 = 107;
               break;
            case 250:
               var10000 = 85;
               break;
            case 251:
               var10000 = 94;
               break;
            case 252:
               var10000 = 30;
               break;
            case 253:
               var10000 = 219;
               break;
            case 254:
               var10000 = 127;
               break;
            default:
               var10000 = 15;
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
            var8 = var7 % 2;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11227;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var10;
      char[] var33;
      String[] var13 = new String[13];
      int var11 = 0;
      var10 = "\u0099¼\bãkr\u0086¹\u007f¦E\u0011³8}\u008c\u009bmZqkHRÛ¨8=}«\u0011ÊCRã~\u0080æÌüÿ -öæö¦Ò\u0014Ü\u000f Í\u001eoD×È·JWð¾%vÛ>¬V\u000eA4#h2\u0018D;öIUPd¡\u000e;\u0006l.ÛÐy\"Qj¡4ú-\u0004}ëø\u008f\u0005 \u0083\u0081ÿ?\n\u0001\u001cµ\f¹\u009d\u0012«\u009f<\u0014\u0003J[eaz«u5ãõÝ\u0007ïÛ\\\u0004{Wþ";
      int var12 = "\u0099¼\bãkr\u0086¹\u007f¦E\u0011³8}\u008c\u009bmZqkHRÛ¨8=}«\u0011ÊCRã~\u0080æÌüÿ -öæö¦Ò\u0014Ü\u000f Í\u001eoD×È·JWð¾%vÛ>¬V\u000eA4#h2\u0018D;öIUPd¡\u000e;\u0006l.ÛÐy\"Qj¡4ú-\u0004}ëø\u008f\u0005 \u0083\u0081ÿ?\n\u0001\u001cµ\f¹\u009d\u0012«\u009f<\u0014\u0003J[eaz«u5ãõÝ\u0007ïÛ\\\u0004{Wþ"
         .length();
      char var9 = 2;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 56;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 45;
                        break;
                     case 1:
                        var65 = 111;
                        break;
                     case 2:
                        var65 = 94;
                        break;
                     case 3:
                        var65 = 113;
                        break;
                     case 4:
                        var65 = 109;
                        break;
                     case 5:
                        var65 = 44;
                        break;
                     default:
                        var65 = 61;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     c = new String[13];
                     long var0 = 9055949403804787736L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u0001ÿ%õÓ;\u0091£VË°\u000f\u0017áâ?î´çÐS-$Tý\u008eØWe\\ÔÃ";
                     int var5 = "\u0001ÿ%õÓ;\u0091£VË°\u000f\u0017áâ?î´çÐS-$Tý\u008eØWe\\ÔÃ".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "¨\u009dü\u0086õl+\u001fÅ\u0013lXýýuT";
                                 var5 = "¨\u009dü\u0086õl+\u001fÅ\u0013lXýýuT".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "\u0082ì\u008f\u009d¢¿³Î;ÚÕ\u0001\u0007Ãñ¢G§ÉlÓí©×¤±5û\u0092\u0010ß\u009fÈïçÔ\u0092\u009f¸\u0013Ë\u0003À?ê\u000b\u0012U©£ó\u0003¯\u001dK^%";
                  var12 = "\u0082ì\u008f\u009d¢¿³Î;ÚÕ\u0001\u0007Ãñ¢G§ÉlÓí©×¤±5û\u0092\u0010ß\u009fÈïçÔ\u0092\u009f¸\u0013Ë\u0003À?ê\u000b\u0012U©£ó\u0003¯\u001dK^%"
                     .length();
                  var9 = '-';
                  var17 = -1;
            }

            var10000 = 22;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





