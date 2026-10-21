package com.finalshell.core;

import com.finalshell.ui.model.EP;
import java.io.IOException;
import java.lang.reflect.Type;

public class Np4 extends Nv4 implements Ak2 {
   public static Np4 a;
   public static int O;
   public static long[] b;
   public static Integer[] c;

   @Override
   public void u(NL3 var1, Object var2, Object var3, Type var4, int var5) throws IOException {
      this.N(var1, var2, var3, var4, var5, false);
   }

   public void N(NL3 param1, Object param2, Object param3, Type param4, int param5, boolean param6) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: aload 1
      // 004: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 007: astore 8
      // 009: astore 7
      // 00b: aload 2
      // 00c: aload 7
      // 00e: ifnull 026
      // 011: ifnonnull 025
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 8
      // 01d: invokevirtual com/finalshell/io/YM3.Y ()V
      // 020: return
      // 021: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 2
      // 026: checkcast java/util/Map
      // 029: astore 9
      // 02b: getstatic com/finalshell/ui/model/EP.MapSortField Lcom/finalshell/ui/model/EP;
      // 02e: getfield com/finalshell/ui/model/EP.mask I
      // 031: istore 10
      // 033: aload 8
      // 035: getfield com/finalshell/io/YM3.q I
      // 038: iload 10
      // 03a: iand
      // 03b: aload 7
      // 03d: ifnull 071
      // 040: ifne 065
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 049: athrow
      // 04a: iload 5
      // 04c: iload 10
      // 04e: iand
      // 04f: aload 7
      // 051: ifnull 0da
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: ifeq 0c9
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: aload 9
      // 067: instanceof com/finalshell/ui/model/O0
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 7
      // 073: ifnull 08f
      // 076: ifeq 08a
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 9
      // 082: checkcast com/finalshell/ui/model/O0
      // 085: invokevirtual com/finalshell/ui/model/O0.d ()Ljava/util/Map;
      // 088: astore 9
      // 08a: aload 9
      // 08c: instanceof java/util/SortedMap
      // 08f: aload 7
      // 091: ifnull 0da
      // 094: ifne 0c9
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 9
      // 0a0: instanceof java/util/LinkedHashMap
      // 0a3: aload 7
      // 0a5: ifnull 0da
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: ifne 0c9
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: new java/util/TreeMap
      // 0bc: dup
      // 0bd: aload 9
      // 0bf: invokespecial java/util/TreeMap.<init> (Ljava/util/Map;)V
      // 0c2: astore 9
      // 0c4: goto 0c9
      // 0c7: astore 11
      // 0c9: aload 1
      // 0ca: aload 7
      // 0cc: ifnull 0e8
      // 0cf: aload 2
      // 0d0: invokevirtual com/finalshell/core/NL3.S (Ljava/lang/Object;)Z
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: ifeq 0e7
      // 0dd: aload 1
      // 0de: aload 2
      // 0df: invokevirtual com/finalshell/core/NL3.G (Ljava/lang/Object;)V
      // 0e2: return
      // 0e3: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 1
      // 0e8: getfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // 0eb: astore 11
      // 0ed: aload 1
      // 0ee: aload 11
      // 0f0: aload 2
      // 0f1: aload 3
      // 0f2: bipush 0
      // 0f3: invokevirtual com/finalshell/core/NL3.N (Lcom/finalshell/core/Uh2_2;Ljava/lang/Object;Ljava/lang/Object;I)V
      // 0f6: aload 7
      // 0f8: ifnull 119
      // 0fb: iload 6
      // 0fd: ifne 115
      // 100: aload 8
      // 102: sipush 31407
      // 105: ldc2_w 5403482207086803581
      // 108: invokestatic com/finalshell/core/Np4.a (IJ)I
      // 10b: invokevirtual com/finalshell/io/YM3.write (I)V
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: aload 1
      // 116: invokevirtual com/finalshell/core/NL3.C ()V
      // 119: aconst_null
      // 11a: astore 12
      // 11c: aconst_null
      // 11d: astore 13
      // 11f: bipush 1
      // 120: istore 14
      // 122: aload 8
      // 124: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 127: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 12a: ifeq 1cc
      // 12d: aload 1
      // 12e: getfield com/finalshell/core/NL3.B Lcom/finalshell/core/En2;
      // 131: getfield com/finalshell/core/En2.t Ljava/lang/String;
      // 134: astore 15
      // 136: aload 9
      // 138: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 13b: astore 16
      // 13d: aload 16
      // 13f: ldc com/finalshell/ui/model/O0
      // 141: aload 7
      // 143: ifnull 15b
      // 146: if_acmpeq 178
      // 149: goto 150
      // 14c: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: aload 16
      // 152: ldc java/util/HashMap
      // 154: goto 15b
      // 157: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: aload 7
      // 15d: ifnull 175
      // 160: if_acmpeq 178
      // 163: goto 16a
      // 166: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aload 16
      // 16c: ldc java/util/LinkedHashMap
      // 16e: goto 175
      // 171: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: if_acmpne 19b
      // 178: aload 9
      // 17a: aload 15
      // 17c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 181: aload 7
      // 183: ifnull 198
      // 186: goto 18d
      // 189: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: ifeq 19b
      // 190: goto 197
      // 193: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 196: athrow
      // 197: bipush 1
      // 198: goto 19c
      // 19b: bipush 0
      // 19c: istore 17
      // 19e: iload 17
      // 1a0: aload 7
      // 1a2: ifnull 1ca
      // 1a5: ifne 1cc
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ae: athrow
      // 1af: aload 8
      // 1b1: aload 15
      // 1b3: invokevirtual com/finalshell/io/YM3.u (Ljava/lang/String;)V
      // 1b6: aload 8
      // 1b8: aload 2
      // 1b9: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1bc: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 1bf: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 1c2: bipush 0
      // 1c3: goto 1ca
      // 1c6: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c9: athrow
      // 1ca: istore 14
      // 1cc: aload 9
      // 1ce: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 1d3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1d8: astore 15
      // 1da: aload 15
      // 1dc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e1: ifeq a4f
      // 1e4: aload 15
      // 1e6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1eb: checkcast java/util/Map$Entry
      // 1ee: astore 16
      // 1f0: aload 16
      // 1f2: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 1f7: astore 17
      // 1f9: aload 16
      // 1fb: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 200: astore 18
      // 202: aload 1
      // 203: getfield com/finalshell/core/NL3.K Ljava/util/List;
      // 206: astore 19
      // 208: aload 7
      // 20a: ifnull a55
      // 20d: aload 19
      // 20f: aload 7
      // 211: ifnull 306
      // 214: goto 21b
      // 217: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21a: athrow
      // 21b: ifnull 2fe
      // 21e: goto 225
      // 221: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 224: athrow
      // 225: aload 19
      // 227: aload 7
      // 229: ifnull 306
      // 22c: goto 233
      // 22f: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 232: athrow
      // 233: invokeinterface java/util/List.size ()I 1
      // 238: ifle 2fe
      // 23b: goto 242
      // 23e: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 241: athrow
      // 242: aload 18
      // 244: aload 7
      // 246: ifnull 25c
      // 249: goto 250
      // 24c: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24f: athrow
      // 250: ifnull 26e
      // 253: goto 25a
      // 256: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 259: athrow
      // 25a: aload 18
      // 25c: instanceof java/lang/String
      // 25f: aload 7
      // 261: ifnull 2af
      // 264: ifeq 29b
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: aload 0
      // 26f: aload 7
      // 271: ifnull 2ff
      // 274: goto 27b
      // 277: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: aload 1
      // 27c: aload 2
      // 27d: aload 18
      // 27f: checkcast java/lang/String
      // 282: invokevirtual com/finalshell/core/Np4.O (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;)Z
      // 285: ifne 2fe
      // 288: goto 28f
      // 28b: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28e: athrow
      // 28f: aload 7
      // 291: ifnonnull 1da
      // 294: goto 29b
      // 297: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29a: athrow
      // 29b: aload 18
      // 29d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2a0: aload 7
      // 2a2: ifnull 2d6
      // 2a5: invokevirtual java/lang/Class.isPrimitive ()Z
      // 2a8: goto 2af
      // 2ab: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ae: athrow
      // 2af: ifne 2cd
      // 2b2: aload 18
      // 2b4: aload 7
      // 2b6: ifnull 2d6
      // 2b9: goto 2c0
      // 2bc: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2bf: athrow
      // 2c0: instanceof java/lang/Number
      // 2c3: ifeq 2fe
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: aload 18
      // 2cf: goto 2d6
      // 2d2: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d5: athrow
      // 2d6: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 2d9: astore 20
      // 2db: aload 0
      // 2dc: aload 7
      // 2de: ifnull 2ff
      // 2e1: aload 1
      // 2e2: aload 2
      // 2e3: aload 20
      // 2e5: invokevirtual com/finalshell/core/Np4.O (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;)Z
      // 2e8: ifne 2fe
      // 2eb: goto 2f2
      // 2ee: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f1: athrow
      // 2f2: aload 7
      // 2f4: ifnonnull 1da
      // 2f7: goto 2fe
      // 2fa: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fd: athrow
      // 2fe: aload 0
      // 2ff: getfield com/finalshell/core/Np4.K Ljava/util/List;
      // 302: astore 19
      // 304: aload 19
      // 306: aload 7
      // 308: ifnull 3ea
      // 30b: ifnull 3e2
      // 30e: goto 315
      // 311: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 314: athrow
      // 315: aload 19
      // 317: aload 7
      // 319: ifnull 3ea
      // 31c: goto 323
      // 31f: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 322: athrow
      // 323: invokeinterface java/util/List.size ()I 1
      // 328: ifle 3e2
      // 32b: goto 332
      // 32e: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 331: athrow
      // 332: aload 18
      // 334: aload 7
      // 336: ifnull 34c
      // 339: goto 340
      // 33c: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33f: athrow
      // 340: ifnull 35e
      // 343: goto 34a
      // 346: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 349: athrow
      // 34a: aload 18
      // 34c: instanceof java/lang/String
      // 34f: aload 7
      // 351: ifnull 393
      // 354: ifeq 37f
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35d: athrow
      // 35e: aload 0
      // 35f: aload 1
      // 360: aload 2
      // 361: aload 18
      // 363: checkcast java/lang/String
      // 366: invokevirtual com/finalshell/core/Np4.O (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;)Z
      // 369: ifne 3e2
      // 36c: goto 373
      // 36f: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 372: athrow
      // 373: aload 7
      // 375: ifnonnull 1da
      // 378: goto 37f
      // 37b: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37e: athrow
      // 37f: aload 18
      // 381: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 384: aload 7
      // 386: ifnull 3ba
      // 389: invokevirtual java/lang/Class.isPrimitive ()Z
      // 38c: goto 393
      // 38f: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 392: athrow
      // 393: ifne 3b1
      // 396: aload 18
      // 398: aload 7
      // 39a: ifnull 3ba
      // 39d: goto 3a4
      // 3a0: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: instanceof java/lang/Number
      // 3a7: ifeq 3e2
      // 3aa: goto 3b1
      // 3ad: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b0: athrow
      // 3b1: aload 18
      // 3b3: goto 3ba
      // 3b6: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b9: athrow
      // 3ba: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 3bd: astore 20
      // 3bf: aload 7
      // 3c1: ifnull 3e8
      // 3c4: aload 0
      // 3c5: aload 1
      // 3c6: aload 2
      // 3c7: aload 20
      // 3c9: invokevirtual com/finalshell/core/Np4.O (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;)Z
      // 3cc: ifne 3e2
      // 3cf: goto 3d6
      // 3d2: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d5: athrow
      // 3d6: aload 7
      // 3d8: ifnonnull 1da
      // 3db: goto 3e2
      // 3de: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e1: athrow
      // 3e2: aload 1
      // 3e3: getfield com/finalshell/core/NL3.m Ljava/util/List;
      // 3e6: astore 19
      // 3e8: aload 19
      // 3ea: aload 7
      // 3ec: ifnull 4de
      // 3ef: ifnull 4d6
      // 3f2: goto 3f9
      // 3f5: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f8: athrow
      // 3f9: aload 19
      // 3fb: aload 7
      // 3fd: ifnull 4de
      // 400: goto 407
      // 403: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 406: athrow
      // 407: invokeinterface java/util/List.size ()I 1
      // 40c: ifle 4d6
      // 40f: goto 416
      // 412: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 415: athrow
      // 416: aload 18
      // 418: aload 7
      // 41a: ifnull 430
      // 41d: goto 424
      // 420: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 423: athrow
      // 424: ifnull 442
      // 427: goto 42e
      // 42a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42d: athrow
      // 42e: aload 18
      // 430: instanceof java/lang/String
      // 433: aload 7
      // 435: ifnull 485
      // 438: ifeq 471
      // 43b: goto 442
      // 43e: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 441: athrow
      // 442: aload 0
      // 443: aload 7
      // 445: ifnull 4d7
      // 448: goto 44f
      // 44b: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44e: athrow
      // 44f: aload 1
      // 450: aload 2
      // 451: aload 18
      // 453: checkcast java/lang/String
      // 456: aload 17
      // 458: invokevirtual com/finalshell/core/Np4.d (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
      // 45b: ifne 4d6
      // 45e: goto 465
      // 461: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 464: athrow
      // 465: aload 7
      // 467: ifnonnull 1da
      // 46a: goto 471
      // 46d: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 470: athrow
      // 471: aload 18
      // 473: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 476: aload 7
      // 478: ifnull 4ac
      // 47b: invokevirtual java/lang/Class.isPrimitive ()Z
      // 47e: goto 485
      // 481: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 484: athrow
      // 485: ifne 4a3
      // 488: aload 18
      // 48a: aload 7
      // 48c: ifnull 4ac
      // 48f: goto 496
      // 492: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 495: athrow
      // 496: instanceof java/lang/Number
      // 499: ifeq 4d6
      // 49c: goto 4a3
      // 49f: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a2: athrow
      // 4a3: aload 18
      // 4a5: goto 4ac
      // 4a8: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ab: athrow
      // 4ac: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 4af: astore 20
      // 4b1: aload 0
      // 4b2: aload 7
      // 4b4: ifnull 4d7
      // 4b7: aload 1
      // 4b8: aload 2
      // 4b9: aload 20
      // 4bb: aload 17
      // 4bd: invokevirtual com/finalshell/core/Np4.d (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
      // 4c0: ifne 4d6
      // 4c3: goto 4ca
      // 4c6: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c9: athrow
      // 4ca: aload 7
      // 4cc: ifnonnull 1da
      // 4cf: goto 4d6
      // 4d2: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d5: athrow
      // 4d6: aload 0
      // 4d7: getfield com/finalshell/core/Np4.m Ljava/util/List;
      // 4da: astore 19
      // 4dc: aload 19
      // 4de: aload 7
      // 4e0: ifnull 5c6
      // 4e3: ifnull 5be
      // 4e6: goto 4ed
      // 4e9: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ec: athrow
      // 4ed: aload 19
      // 4ef: aload 7
      // 4f1: ifnull 5c6
      // 4f4: goto 4fb
      // 4f7: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4fa: athrow
      // 4fb: invokeinterface java/util/List.size ()I 1
      // 500: ifle 5be
      // 503: goto 50a
      // 506: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 509: athrow
      // 50a: aload 18
      // 50c: aload 7
      // 50e: ifnull 524
      // 511: goto 518
      // 514: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 517: athrow
      // 518: ifnull 536
      // 51b: goto 522
      // 51e: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 521: athrow
      // 522: aload 18
      // 524: instanceof java/lang/String
      // 527: aload 7
      // 529: ifnull 56d
      // 52c: ifeq 559
      // 52f: goto 536
      // 532: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 535: athrow
      // 536: aload 0
      // 537: aload 1
      // 538: aload 2
      // 539: aload 18
      // 53b: checkcast java/lang/String
      // 53e: aload 17
      // 540: invokevirtual com/finalshell/core/Np4.d (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
      // 543: ifne 5be
      // 546: goto 54d
      // 549: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54c: athrow
      // 54d: aload 7
      // 54f: ifnonnull 1da
      // 552: goto 559
      // 555: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 558: athrow
      // 559: aload 18
      // 55b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 55e: aload 7
      // 560: ifnull 594
      // 563: invokevirtual java/lang/Class.isPrimitive ()Z
      // 566: goto 56d
      // 569: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56c: athrow
      // 56d: ifne 58b
      // 570: aload 18
      // 572: aload 7
      // 574: ifnull 594
      // 577: goto 57e
      // 57a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57d: athrow
      // 57e: instanceof java/lang/Number
      // 581: ifeq 5be
      // 584: goto 58b
      // 587: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58a: athrow
      // 58b: aload 18
      // 58d: goto 594
      // 590: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 593: athrow
      // 594: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 597: astore 20
      // 599: aload 7
      // 59b: ifnull 5c4
      // 59e: aload 0
      // 59f: aload 1
      // 5a0: aload 2
      // 5a1: aload 20
      // 5a3: aload 17
      // 5a5: invokevirtual com/finalshell/core/Np4.d (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
      // 5a8: ifne 5be
      // 5ab: goto 5b2
      // 5ae: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b1: athrow
      // 5b2: aload 7
      // 5b4: ifnonnull 1da
      // 5b7: goto 5be
      // 5ba: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5bd: athrow
      // 5be: aload 1
      // 5bf: getfield com/finalshell/core/NL3.U Ljava/util/List;
      // 5c2: astore 19
      // 5c4: aload 19
      // 5c6: aload 7
      // 5c8: ifnull 68d
      // 5cb: ifnull 685
      // 5ce: goto 5d5
      // 5d1: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d4: athrow
      // 5d5: aload 19
      // 5d7: aload 7
      // 5d9: ifnull 68d
      // 5dc: goto 5e3
      // 5df: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e2: athrow
      // 5e3: invokeinterface java/util/List.size ()I 1
      // 5e8: ifle 685
      // 5eb: goto 5f2
      // 5ee: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f1: athrow
      // 5f2: aload 18
      // 5f4: aload 7
      // 5f6: ifnull 60c
      // 5f9: goto 600
      // 5fc: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ff: athrow
      // 600: ifnull 61e
      // 603: goto 60a
      // 606: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 609: athrow
      // 60a: aload 18
      // 60c: instanceof java/lang/String
      // 60f: aload 7
      // 611: ifnull 64d
      // 614: ifeq 632
      // 617: goto 61e
      // 61a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61d: athrow
      // 61e: aload 0
      // 61f: aload 1
      // 620: aload 2
      // 621: aload 18
      // 623: checkcast java/lang/String
      // 626: aload 17
      // 628: invokevirtual com/finalshell/core/Np4.i (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      // 62b: astore 18
      // 62d: aload 7
      // 62f: ifnonnull 685
      // 632: aload 18
      // 634: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 637: aload 7
      // 639: ifnull 674
      // 63c: goto 643
      // 63f: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 642: athrow
      // 643: invokevirtual java/lang/Class.isPrimitive ()Z
      // 646: goto 64d
      // 649: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64c: athrow
      // 64d: ifne 66b
      // 650: aload 18
      // 652: aload 7
      // 654: ifnull 674
      // 657: goto 65e
      // 65a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65d: athrow
      // 65e: instanceof java/lang/Number
      // 661: ifeq 685
      // 664: goto 66b
      // 667: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66a: athrow
      // 66b: aload 18
      // 66d: goto 674
      // 670: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 673: athrow
      // 674: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 677: astore 20
      // 679: aload 0
      // 67a: aload 1
      // 67b: aload 2
      // 67c: aload 20
      // 67e: aload 17
      // 680: invokevirtual com/finalshell/core/Np4.i (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      // 683: astore 18
      // 685: aload 0
      // 686: getfield com/finalshell/core/Np4.U Ljava/util/List;
      // 689: astore 19
      // 68b: aload 19
      // 68d: aload 7
      // 68f: ifnull 74e
      // 692: ifnull 74c
      // 695: goto 69c
      // 698: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69b: athrow
      // 69c: aload 19
      // 69e: aload 7
      // 6a0: ifnull 74e
      // 6a3: goto 6aa
      // 6a6: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a9: athrow
      // 6aa: invokeinterface java/util/List.size ()I 1
      // 6af: ifle 74c
      // 6b2: goto 6b9
      // 6b5: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b8: athrow
      // 6b9: aload 18
      // 6bb: aload 7
      // 6bd: ifnull 6d3
      // 6c0: goto 6c7
      // 6c3: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c6: athrow
      // 6c7: ifnull 6e5
      // 6ca: goto 6d1
      // 6cd: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d0: athrow
      // 6d1: aload 18
      // 6d3: instanceof java/lang/String
      // 6d6: aload 7
      // 6d8: ifnull 714
      // 6db: ifeq 6f9
      // 6de: goto 6e5
      // 6e1: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e4: athrow
      // 6e5: aload 0
      // 6e6: aload 1
      // 6e7: aload 2
      // 6e8: aload 18
      // 6ea: checkcast java/lang/String
      // 6ed: aload 17
      // 6ef: invokevirtual com/finalshell/core/Np4.i (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      // 6f2: astore 18
      // 6f4: aload 7
      // 6f6: ifnonnull 74c
      // 6f9: aload 18
      // 6fb: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 6fe: aload 7
      // 700: ifnull 73b
      // 703: goto 70a
      // 706: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 709: athrow
      // 70a: invokevirtual java/lang/Class.isPrimitive ()Z
      // 70d: goto 714
      // 710: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 713: athrow
      // 714: ifne 732
      // 717: aload 18
      // 719: aload 7
      // 71b: ifnull 74e
      // 71e: goto 725
      // 721: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 724: athrow
      // 725: instanceof java/lang/Number
      // 728: ifeq 74c
      // 72b: goto 732
      // 72e: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 731: athrow
      // 732: aload 18
      // 734: goto 73b
      // 737: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73a: athrow
      // 73b: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 73e: astore 20
      // 740: aload 0
      // 741: aload 1
      // 742: aload 2
      // 743: aload 20
      // 745: aload 17
      // 747: invokevirtual com/finalshell/core/Np4.i (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
      // 74a: astore 18
      // 74c: aload 18
      // 74e: aload 7
      // 750: ifnull 78f
      // 753: ifnull 778
      // 756: goto 75d
      // 759: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75c: athrow
      // 75d: aload 18
      // 75f: instanceof java/lang/String
      // 762: aload 7
      // 764: ifnull 7a2
      // 767: goto 76e
      // 76a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76d: athrow
      // 76e: ifeq 796
      // 771: goto 778
      // 774: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 777: athrow
      // 778: aload 0
      // 779: aload 1
      // 77a: aconst_null
      // 77b: aload 2
      // 77c: aload 18
      // 77e: checkcast java/lang/String
      // 781: aload 17
      // 783: iload 5
      // 785: invokevirtual com/finalshell/core/Np4.L (Lcom/finalshell/core/NL3;Lcom/finalshell/core/DL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;
      // 788: goto 78f
      // 78b: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78e: athrow
      // 78f: astore 17
      // 791: aload 7
      // 793: ifnonnull 7ee
      // 796: aload 18
      // 798: instanceof java/util/Map
      // 79b: goto 7a2
      // 79e: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a1: athrow
      // 7a2: aload 7
      // 7a4: ifnull 7cd
      // 7a7: ifne 7cc
      // 7aa: goto 7b1
      // 7ad: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b0: athrow
      // 7b1: aload 18
      // 7b3: instanceof java/util/Collection
      // 7b6: aload 7
      // 7b8: ifnull 7cd
      // 7bb: goto 7c2
      // 7be: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c1: athrow
      // 7c2: ifeq 7d0
      // 7c5: goto 7cc
      // 7c8: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7cb: athrow
      // 7cc: bipush 1
      // 7cd: goto 7d1
      // 7d0: bipush 0
      // 7d1: istore 19
      // 7d3: iload 19
      // 7d5: ifne 7ee
      // 7d8: aload 18
      // 7da: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 7dd: astore 20
      // 7df: aload 0
      // 7e0: aload 1
      // 7e1: aconst_null
      // 7e2: aload 2
      // 7e3: aload 20
      // 7e5: aload 17
      // 7e7: iload 5
      // 7e9: invokevirtual com/finalshell/core/Np4.L (Lcom/finalshell/core/NL3;Lcom/finalshell/core/DL3;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;I)Ljava/lang/Object;
      // 7ec: astore 17
      // 7ee: aload 17
      // 7f0: aload 7
      // 7f2: ifnull 830
      // 7f5: ifnonnull 82e
      // 7f8: goto 7ff
      // 7fb: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7fe: athrow
      // 7ff: aload 8
      // 801: getfield com/finalshell/io/YM3.q I
      // 804: iload 5
      // 806: getstatic com/finalshell/ui/model/EP.WriteMapNullValue Lcom/finalshell/ui/model/EP;
      // 809: invokestatic com/finalshell/ui/model/EP.a (IILcom/finalshell/ui/model/EP;)Z
      // 80c: aload 7
      // 80e: ifnull 833
      // 811: goto 818
      // 814: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 817: athrow
      // 818: ifne 82e
      // 81b: goto 822
      // 81e: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 821: athrow
      // 822: aload 7
      // 824: ifnonnull 1da
      // 827: goto 82e
      // 82a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82d: athrow
      // 82e: aload 18
      // 830: instanceof java/lang/String
      // 833: aload 7
      // 835: ifnull 8a7
      // 838: ifeq 89e
      // 83b: goto 842
      // 83e: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 841: athrow
      // 842: aload 18
      // 844: checkcast java/lang/String
      // 847: astore 19
      // 849: iload 14
      // 84b: aload 7
      // 84d: ifnull 883
      // 850: ifne 86f
      // 853: goto 85a
      // 856: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 859: athrow
      // 85a: aload 8
      // 85c: sipush 18717
      // 85f: ldc2_w 8641834446759479757
      // 862: invokestatic com/finalshell/core/Np4.a (IJ)I
      // 865: invokevirtual com/finalshell/io/YM3.write (I)V
      // 868: goto 86f
      // 86b: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86e: athrow
      // 86f: aload 8
      // 871: aload 7
      // 873: ifnull 893
      // 876: getstatic com/finalshell/ui/model/EP.PrettyFormat Lcom/finalshell/ui/model/EP;
      // 879: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // 87c: goto 883
      // 87f: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 882: athrow
      // 883: ifeq 891
      // 886: aload 1
      // 887: invokevirtual com/finalshell/core/NL3.i ()V
      // 88a: goto 891
      // 88d: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 890: athrow
      // 891: aload 8
      // 893: aload 19
      // 895: bipush 1
      // 896: invokevirtual com/finalshell/io/YM3.o (Ljava/lang/String;Z)V
      // 899: aload 7
      // 89b: ifnonnull 948
      // 89e: iload 14
      // 8a0: goto 8a7
      // 8a3: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a6: athrow
      // 8a7: aload 7
      // 8a9: ifnull 8d3
      // 8ac: ifne 8cb
      // 8af: goto 8b6
      // 8b2: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b5: athrow
      // 8b6: aload 8
      // 8b8: sipush 22653
      // 8bb: ldc2_w 6813463864366225580
      // 8be: invokestatic com/finalshell/core/Np4.a (IJ)I
      // 8c1: invokevirtual com/finalshell/io/YM3.write (I)V
      // 8c4: goto 8cb
      // 8c7: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8ca: athrow
      // 8cb: aload 8
      // 8cd: getstatic com/finalshell/core/Np4.O I
      // 8d0: invokevirtual com/finalshell/io/YM3.y (I)Z
      // 8d3: aload 7
      // 8d5: ifnull 918
      // 8d8: ifne 900
      // 8db: goto 8e2
      // 8de: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e1: athrow
      // 8e2: iload 5
      // 8e4: getstatic com/finalshell/ui/model/EP.WriteNonStringKeyAsString Lcom/finalshell/ui/model/EP;
      // 8e7: invokestatic com/finalshell/ui/model/EP.e (ILcom/finalshell/ui/model/EP;)Z
      // 8ea: aload 7
      // 8ec: ifnull 918
      // 8ef: goto 8f6
      // 8f2: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f5: athrow
      // 8f6: ifeq 92d
      // 8f9: goto 900
      // 8fc: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8ff: athrow
      // 900: aload 18
      // 902: aload 7
      // 904: ifnull 91d
      // 907: goto 90e
      // 90a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90d: athrow
      // 90e: instanceof java/lang/Enum
      // 911: goto 918
      // 914: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 917: athrow
      // 918: ifne 92d
      // 91b: aload 18
      // 91d: invokestatic com/finalshell/core/Ok2.x (Ljava/lang/Object;)Ljava/lang/String;
      // 920: astore 19
      // 922: aload 1
      // 923: aload 19
      // 925: invokevirtual com/finalshell/core/NL3.l (Ljava/lang/String;)V
      // 928: aload 7
      // 92a: ifnonnull 93a
      // 92d: aload 1
      // 92e: aload 18
      // 930: invokevirtual com/finalshell/core/NL3.B (Ljava/lang/Object;)V
      // 933: goto 93a
      // 936: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 939: athrow
      // 93a: aload 8
      // 93c: sipush 13450
      // 93f: ldc2_w 2723450853000721497
      // 942: invokestatic com/finalshell/core/Np4.a (IJ)I
      // 945: invokevirtual com/finalshell/io/YM3.write (I)V
      // 948: bipush 0
      // 949: istore 14
      // 94b: aload 17
      // 94d: aload 7
      // 94f: ifnull 96f
      // 952: ifnonnull 96d
      // 955: goto 95c
      // 958: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95b: athrow
      // 95c: aload 8
      // 95e: invokevirtual com/finalshell/io/YM3.Y ()V
      // 961: aload 7
      // 963: ifnonnull 1da
      // 966: goto 96d
      // 969: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 96c: athrow
      // 96d: aload 17
      // 96f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 972: astore 19
      // 974: aload 19
      // 976: aload 7
      // 978: ifnull 990
      // 97b: aload 12
      // 97d: if_acmpeq 99a
      // 980: goto 987
      // 983: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 986: athrow
      // 987: aload 19
      // 989: goto 990
      // 98c: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98f: athrow
      // 990: astore 12
      // 992: aload 1
      // 993: aload 19
      // 995: invokevirtual com/finalshell/core/NL3.E (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 998: astore 13
      // 99a: iload 5
      // 99c: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 99f: invokestatic com/finalshell/ui/model/EP.e (ILcom/finalshell/ui/model/EP;)Z
      // 9a2: aload 7
      // 9a4: ifnull 9c9
      // 9a7: ifeq a34
      // 9aa: goto 9b1
      // 9ad: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b0: athrow
      // 9b1: aload 13
      // 9b3: aload 7
      // 9b5: ifnull a3d
      // 9b8: goto 9bf
      // 9bb: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9be: athrow
      // 9bf: instanceof com/finalshell/core/Nj4
      // 9c2: goto 9c9
      // 9c5: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c8: athrow
      // 9c9: ifeq a34
      // 9cc: aconst_null
      // 9cd: astore 20
      // 9cf: aload 4
      // 9d1: aload 7
      // 9d3: ifnull 9ec
      // 9d6: instanceof java/lang/reflect/ParameterizedType
      // 9d9: ifeq a1a
      // 9dc: goto 9e3
      // 9df: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e2: athrow
      // 9e3: aload 4
      // 9e5: goto 9ec
      // 9e8: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9eb: athrow
      // 9ec: checkcast java/lang/reflect/ParameterizedType
      // 9ef: astore 21
      // 9f1: aload 21
      // 9f3: invokeinterface java/lang/reflect/ParameterizedType.getActualTypeArguments ()[Ljava/lang/reflect/Type; 1
      // 9f8: astore 22
      // 9fa: aload 22
      // 9fc: aload 7
      // 9fe: ifnull a16
      // a01: arraylength
      // a02: bipush 2
      // a03: if_icmpne a1a
      // a06: goto a0d
      // a09: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0c: athrow
      // a0d: aload 22
      // a0f: goto a16
      // a12: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a15: athrow
      // a16: bipush 1
      // a17: aaload
      // a18: astore 20
      // a1a: aload 13
      // a1c: checkcast com/finalshell/core/Nj4
      // a1f: astore 21
      // a21: aload 21
      // a23: aload 1
      // a24: aload 17
      // a26: aload 18
      // a28: aload 20
      // a2a: iload 5
      // a2c: invokevirtual com/finalshell/core/Nj4.s (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
      // a2f: aload 7
      // a31: ifnonnull a4a
      // a34: aload 13
      // a36: goto a3d
      // a39: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3c: athrow
      // a3d: aload 1
      // a3e: aload 17
      // a40: aload 18
      // a42: aconst_null
      // a43: iload 5
      // a45: invokeinterface com/finalshell/core/Ak2.u (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // a4a: aload 7
      // a4c: ifnonnull 1da
      // a4f: aload 1
      // a50: aload 11
      // a52: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // a55: goto a63
      // a58: astore 23
      // a5a: aload 1
      // a5b: aload 11
      // a5d: putfield com/finalshell/core/NL3.W Lcom/finalshell/core/Uh2_2;
      // a60: aload 23
      // a62: athrow
      // a63: aload 1
      // a64: invokevirtual com/finalshell/core/NL3.r ()V
      // a67: aload 8
      // a69: getstatic com/finalshell/ui/model/EP.PrettyFormat Lcom/finalshell/ui/model/EP;
      // a6c: invokevirtual com/finalshell/io/YM3.I (Lcom/finalshell/ui/model/EP;)Z
      // a6f: aload 7
      // a71: ifnull aa8
      // a74: ifeq aa6
      // a77: goto a7e
      // a7a: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a7d: athrow
      // a7e: aload 9
      // a80: invokeinterface java/util/Map.size ()I 1
      // a85: aload 7
      // a87: ifnull aa8
      // a8a: goto a91
      // a8d: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a90: athrow
      // a91: ifle aa6
      // a94: goto a9b
      // a97: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9a: athrow
      // a9b: aload 1
      // a9c: invokevirtual com/finalshell/core/NL3.i ()V
      // a9f: goto aa6
      // aa2: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa5: athrow
      // aa6: iload 6
      // aa8: ifne ac0
      // aab: aload 8
      // aad: sipush 4015
      // ab0: ldc2_w 8553355544636690298
      // ab3: invokestatic com/finalshell/core/Np4.a (IJ)I
      // ab6: invokevirtual com/finalshell/io/YM3.write (I)V
      // ab9: goto ac0
      // abc: invokestatic com/finalshell/core/Np4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // abf: athrow
      // ac0: return
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 209;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2800628077246942042L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "\u0018\u0006÷ÂÑÈSÚ\"øö2J\u009fB»Ï\u008d6fÌ\u001d¿9";
      int var5 = "\u0018\u0006÷ÂÑÈSÚ\"øö2J\u009fB»Ï\u008d6fÌ\u001d¿9".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     c = new Integer[5];
                     a = new Np4();
                     O = EP.Q(new EP[]{EP.BrowserCompatible, EP.WriteNonStringKeyAsString, EP.BrowserSecure});
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "fæáóãÇq\\'\t$ï\u0007ú\u0004]";
                  var5 = "fæáóãÇq\\'\t$ï\u0007ú\u0004]".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





