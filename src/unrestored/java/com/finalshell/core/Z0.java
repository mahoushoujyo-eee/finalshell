package com.finalshell.core;

import com.finalshell.ui.model.S6;

public class Z0 extends Z8 {
   public final A0_2 E;
   public final S6 N;

   public Z0(String var1, boolean var2, A0_2 var3, S6 var4) {
      super(var1, var2);
      this.E = var3;
      this.N = var4;
   }

   @Override
   public boolean x(Ph4 param1, Object param2, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 003: aload 0
      // 004: aload 1
      // 005: aload 2
      // 006: aload 4
      // 008: invokevirtual com/finalshell/core/Z0.H (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 00b: astore 6
      // 00d: astore 5
      // 00f: aload 6
      // 011: aload 5
      // 013: ifnonnull 028
      // 016: ifnonnull 026
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 01f: athrow
      // 020: bipush 0
      // 021: ireturn
      // 022: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 025: athrow
      // 026: aload 6
      // 028: aload 5
      // 02a: ifnonnull 04c
      // 02d: instanceof java/lang/Number
      // 030: ifne 040
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 039: athrow
      // 03a: bipush 0
      // 03b: ireturn
      // 03c: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield com/finalshell/core/Z0.E Lcom/finalshell/core/A0_2;
      // 044: aload 1
      // 045: aload 2
      // 046: aload 2
      // 047: invokeinterface com/finalshell/core/A0_2.Y (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 4
      // 04c: astore 7
      // 04e: aload 7
      // 050: aload 5
      // 052: ifnonnull 0bc
      // 055: instanceof java/lang/Integer
      // 058: ifne 0b3
      // 05b: goto 062
      // 05e: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 061: athrow
      // 062: aload 7
      // 064: aload 5
      // 066: ifnonnull 0bc
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 06f: athrow
      // 070: instanceof java/lang/Long
      // 073: ifne 0b3
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 07c: athrow
      // 07d: aload 7
      // 07f: aload 5
      // 081: ifnonnull 0bc
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 08a: athrow
      // 08b: instanceof java/lang/Short
      // 08e: ifne 0b3
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 097: athrow
      // 098: aload 7
      // 09a: aload 5
      // 09c: ifnonnull 0bc
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0a5: athrow
      // 0a6: instanceof java/lang/Byte
      // 0a9: ifeq 323
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0b2: athrow
      // 0b3: aload 7
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0bb: athrow
      // 0bc: checkcast java/lang/Number
      // 0bf: invokestatic com/finalshell/core/B8_2.e (Ljava/lang/Number;)J
      // 0c2: lstore 8
      // 0c4: aload 6
      // 0c6: aload 5
      // 0c8: ifnonnull 12b
      // 0cb: instanceof java/lang/Integer
      // 0ce: ifne 129
      // 0d1: goto 0d8
      // 0d4: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0d7: athrow
      // 0d8: aload 6
      // 0da: aload 5
      // 0dc: ifnonnull 12b
      // 0df: goto 0e6
      // 0e2: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0e5: athrow
      // 0e6: instanceof java/lang/Long
      // 0e9: ifne 129
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0f2: athrow
      // 0f3: aload 6
      // 0f5: aload 5
      // 0f7: ifnonnull 12b
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 100: athrow
      // 101: instanceof java/lang/Short
      // 104: ifne 129
      // 107: goto 10e
      // 10a: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 10d: athrow
      // 10e: aload 6
      // 110: instanceof java/lang/Byte
      // 113: aload 5
      // 115: ifnonnull 220
      // 118: goto 11f
      // 11b: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 11e: athrow
      // 11f: ifeq 214
      // 122: goto 129
      // 125: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 128: athrow
      // 129: aload 6
      // 12b: checkcast java/lang/Number
      // 12e: invokestatic com/finalshell/core/B8_2.e (Ljava/lang/Number;)J
      // 131: lstore 10
      // 133: getstatic com/finalshell/core/L12.U [I
      // 136: aload 0
      // 137: getfield com/finalshell/core/Z0.N Lcom/finalshell/ui/model/S6;
      // 13a: invokevirtual com/finalshell/ui/model/S6.ordinal ()I
      // 13d: iaload
      // 13e: aload 5
      // 140: ifnonnull 178
      // 143: tableswitch 204 1 6 41 74 100 126 152 178
      // 168: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 16b: athrow
      // 16c: lload 10
      // 16e: lload 8
      // 170: lcmp
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 177: athrow
      // 178: aload 5
      // 17a: ifnonnull 188
      // 17d: ifne 18b
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 186: athrow
      // 187: bipush 1
      // 188: goto 18c
      // 18b: bipush 0
      // 18c: ireturn
      // 18d: lload 10
      // 18f: lload 8
      // 191: lcmp
      // 192: aload 5
      // 194: ifnonnull 1a2
      // 197: ifeq 1a5
      // 19a: goto 1a1
      // 19d: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1a0: athrow
      // 1a1: bipush 1
      // 1a2: goto 1a6
      // 1a5: bipush 0
      // 1a6: ireturn
      // 1a7: lload 10
      // 1a9: lload 8
      // 1ab: lcmp
      // 1ac: aload 5
      // 1ae: ifnonnull 1bc
      // 1b1: iflt 1bf
      // 1b4: goto 1bb
      // 1b7: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1ba: athrow
      // 1bb: bipush 1
      // 1bc: goto 1c0
      // 1bf: bipush 0
      // 1c0: ireturn
      // 1c1: lload 10
      // 1c3: lload 8
      // 1c5: lcmp
      // 1c6: aload 5
      // 1c8: ifnonnull 1d6
      // 1cb: ifle 1d9
      // 1ce: goto 1d5
      // 1d1: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1d4: athrow
      // 1d5: bipush 1
      // 1d6: goto 1da
      // 1d9: bipush 0
      // 1da: ireturn
      // 1db: lload 10
      // 1dd: lload 8
      // 1df: lcmp
      // 1e0: aload 5
      // 1e2: ifnonnull 1f0
      // 1e5: ifgt 1f3
      // 1e8: goto 1ef
      // 1eb: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1ee: athrow
      // 1ef: bipush 1
      // 1f0: goto 1f4
      // 1f3: bipush 0
      // 1f4: ireturn
      // 1f5: lload 10
      // 1f7: lload 8
      // 1f9: lcmp
      // 1fa: aload 5
      // 1fc: ifnonnull 20a
      // 1ff: ifge 20d
      // 202: goto 209
      // 205: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 208: athrow
      // 209: bipush 1
      // 20a: goto 20e
      // 20d: bipush 0
      // 20e: ireturn
      // 20f: aload 5
      // 211: ifnull 323
      // 214: aload 6
      // 216: instanceof java/math/BigDecimal
      // 219: goto 220
      // 21c: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 21f: athrow
      // 220: ifeq 323
      // 223: lload 8
      // 225: invokestatic java/math/BigDecimal.valueOf (J)Ljava/math/BigDecimal;
      // 228: astore 10
      // 22a: aload 10
      // 22c: aload 6
      // 22e: checkcast java/math/BigDecimal
      // 231: invokevirtual java/math/BigDecimal.compareTo (Ljava/math/BigDecimal;)I
      // 234: istore 11
      // 236: getstatic com/finalshell/core/L12.U [I
      // 239: aload 0
      // 23a: getfield com/finalshell/core/Z0.N Lcom/finalshell/ui/model/S6;
      // 23d: invokevirtual com/finalshell/ui/model/S6.ordinal ()I
      // 240: iaload
      // 241: aload 5
      // 243: ifnonnull 322
      // 246: tableswitch 219 1 6 42 72 95 126 157 188
      // 26c: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 26f: athrow
      // 270: iload 11
      // 272: aload 5
      // 274: ifnonnull 289
      // 277: goto 27e
      // 27a: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 27d: athrow
      // 27e: ifne 28c
      // 281: goto 288
      // 284: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 287: athrow
      // 288: bipush 1
      // 289: goto 28d
      // 28c: bipush 0
      // 28d: ireturn
      // 28e: iload 11
      // 290: aload 5
      // 292: ifnonnull 2a0
      // 295: ifeq 2a3
      // 298: goto 29f
      // 29b: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 29e: athrow
      // 29f: bipush 1
      // 2a0: goto 2a4
      // 2a3: bipush 0
      // 2a4: ireturn
      // 2a5: bipush 0
      // 2a6: aload 5
      // 2a8: ifnonnull 2bf
      // 2ab: iload 11
      // 2ad: if_icmplt 2c2
      // 2b0: goto 2b7
      // 2b3: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2b6: athrow
      // 2b7: bipush 1
      // 2b8: goto 2bf
      // 2bb: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2be: athrow
      // 2bf: goto 2c3
      // 2c2: bipush 0
      // 2c3: ireturn
      // 2c4: bipush 0
      // 2c5: aload 5
      // 2c7: ifnonnull 2de
      // 2ca: iload 11
      // 2cc: if_icmple 2e1
      // 2cf: goto 2d6
      // 2d2: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2d5: athrow
      // 2d6: bipush 1
      // 2d7: goto 2de
      // 2da: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2dd: athrow
      // 2de: goto 2e2
      // 2e1: bipush 0
      // 2e2: ireturn
      // 2e3: bipush 0
      // 2e4: aload 5
      // 2e6: ifnonnull 2fd
      // 2e9: iload 11
      // 2eb: if_icmpgt 300
      // 2ee: goto 2f5
      // 2f1: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2f4: athrow
      // 2f5: bipush 1
      // 2f6: goto 2fd
      // 2f9: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 2fc: athrow
      // 2fd: goto 301
      // 300: bipush 0
      // 301: ireturn
      // 302: bipush 0
      // 303: aload 5
      // 305: ifnonnull 31c
      // 308: iload 11
      // 30a: if_icmpge 31f
      // 30d: goto 314
      // 310: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 313: athrow
      // 314: bipush 1
      // 315: goto 31c
      // 318: invokestatic com/finalshell/core/Z0.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 31b: athrow
      // 31c: goto 320
      // 31f: bipush 0
      // 320: ireturn
      // 321: bipush 0
      // 322: ireturn
      // 323: new java/lang/UnsupportedOperationException
      // 326: dup
      // 327: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 32a: athrow
   }

   public static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}





