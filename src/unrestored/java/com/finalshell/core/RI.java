package com.finalshell.core;

import java.util.Vector;

public class RI implements IF {
   public String L;
   public Vector r;
   public final H1 w;
   public static String[] a;
   public static String[] b;

   public RI(H1 param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: putfield com/finalshell/core/RI.w Lcom/finalshell/core/H1;
      // 005: aload 0
      // 006: invokespecial java/lang/Object.<init> ()V
      // 009: aload 0
      // 00a: new java/util/Vector
      // 00d: dup
      // 00e: invokespecial java/util/Vector.<init> ()V
      // 011: putfield com/finalshell/core/RI.r Ljava/util/Vector;
      // 014: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 017: aload 0
      // 018: aload 2
      // 019: putfield com/finalshell/core/RI.L Ljava/lang/String;
      // 01c: istore 3
      // 01d: aload 0
      // 01e: getfield com/finalshell/core/RI.r Ljava/util/Vector;
      // 021: aload 1
      // 022: invokestatic com/finalshell/core/H1.H (Lcom/finalshell/core/H1;)Ljava/util/Hashtable;
      // 025: ldc ""
      // 027: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 02a: checkcast java/util/Vector
      // 02d: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 030: aload 2
      // 031: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 034: astore 4
      // 036: aload 1
      // 037: invokestatic com/finalshell/core/H1.T (Lcom/finalshell/core/H1;)Ljava/util/Vector;
      // 03a: invokevirtual java/util/Vector.size ()I
      // 03d: iload 3
      // 03e: ifne 054
      // 041: bipush 1
      // 042: if_icmple 13f
      // 045: goto 04c
      // 048: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 04b: athrow
      // 04c: bipush 1
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 053: athrow
      // 054: istore 5
      // 056: iload 5
      // 058: aload 1
      // 059: invokestatic com/finalshell/core/H1.T (Lcom/finalshell/core/H1;)Ljava/util/Vector;
      // 05c: invokevirtual java/util/Vector.size ()I
      // 05f: if_icmpge 13f
      // 062: aload 1
      // 063: invokestatic com/finalshell/core/H1.T (Lcom/finalshell/core/H1;)Ljava/util/Vector;
      // 066: iload 5
      // 068: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 06b: checkcast java/lang/String
      // 06e: sipush -12996
      // 071: sipush 16958
      // 074: invokestatic com/finalshell/core/RI.a (II)Ljava/lang/String;
      // 077: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 07a: astore 6
      // 07c: bipush 0
      // 07d: istore 7
      // 07f: iload 7
      // 081: aload 6
      // 083: arraylength
      // 084: if_icmpge 138
      // 087: bipush 0
      // 088: istore 8
      // 08a: aload 6
      // 08c: iload 7
      // 08e: aaload
      // 08f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 092: astore 9
      // 094: aload 9
      // 096: ldc "!"
      // 098: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 09b: iload 3
      // 09c: ifne 058
      // 09f: iload 3
      // 0a0: ifne 0c5
      // 0a3: ifeq 0bb
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0ac: athrow
      // 0ad: bipush 1
      // 0ae: istore 8
      // 0b0: aload 9
      // 0b2: bipush 1
      // 0b3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0b6: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0b9: astore 9
      // 0bb: aload 9
      // 0bd: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 0c0: aload 4
      // 0c2: invokestatic com/finalshell/core/E8.j ([B[B)Z
      // 0c5: iload 3
      // 0c6: ifne 10d
      // 0c9: ifeq 104
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0d2: athrow
      // 0d3: iload 8
      // 0d5: ifne 131
      // 0d8: goto 0df
      // 0db: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: getfield com/finalshell/core/RI.r Ljava/util/Vector;
      // 0e3: aload 1
      // 0e4: invokestatic com/finalshell/core/H1.H (Lcom/finalshell/core/H1;)Ljava/util/Hashtable;
      // 0e7: aload 1
      // 0e8: invokestatic com/finalshell/core/H1.T (Lcom/finalshell/core/H1;)Ljava/util/Vector;
      // 0eb: iload 5
      // 0ed: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 0f0: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f3: checkcast java/util/Vector
      // 0f6: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 0f9: iload 3
      // 0fa: ifeq 131
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 103: athrow
      // 104: iload 8
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 10c: athrow
      // 10d: ifeq 131
      // 110: aload 0
      // 111: getfield com/finalshell/core/RI.r Ljava/util/Vector;
      // 114: aload 1
      // 115: invokestatic com/finalshell/core/H1.H (Lcom/finalshell/core/H1;)Ljava/util/Hashtable;
      // 118: aload 1
      // 119: invokestatic com/finalshell/core/H1.T (Lcom/finalshell/core/H1;)Ljava/util/Vector;
      // 11c: iload 5
      // 11e: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 121: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 124: checkcast java/util/Vector
      // 127: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 12a: goto 131
      // 12d: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 130: athrow
      // 131: iinc 7 1
      // 134: iload 3
      // 135: ifeq 07f
      // 138: iinc 5 1
      // 13b: iload 3
      // 13c: ifeq 056
      // 13f: return
   }

   public String S(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: aload 1
      // 004: astore 3
      // 005: istore 2
      // 006: iload 2
      // 007: ifne 02b
      // 00a: invokestatic com/finalshell/core/H1.l ()Ljava/util/Hashtable;
      // 00d: aload 1
      // 00e: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 011: ifnull 026
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 01a: athrow
      // 01b: invokestatic com/finalshell/core/H1.l ()Ljava/util/Hashtable;
      // 01e: aload 1
      // 01f: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 022: checkcast java/lang/String
      // 025: astore 1
      // 026: aload 1
      // 027: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 02a: astore 1
      // 02b: aconst_null
      // 02c: astore 4
      // 02e: bipush 0
      // 02f: istore 5
      // 031: iload 5
      // 033: aload 0
      // 034: getfield com/finalshell/core/RI.r Ljava/util/Vector;
      // 037: invokevirtual java/util/Vector.size ()I
      // 03a: if_icmpge 0bb
      // 03d: aload 0
      // 03e: getfield com/finalshell/core/RI.r Ljava/util/Vector;
      // 041: iload 5
      // 043: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 046: checkcast java/util/Vector
      // 049: astore 6
      // 04b: bipush 0
      // 04c: iload 2
      // 04d: ifne 0c4
      // 050: istore 7
      // 052: iload 7
      // 054: aload 6
      // 056: invokevirtual java/util/Vector.size ()I
      // 059: if_icmpge 09d
      // 05c: aload 6
      // 05e: iload 7
      // 060: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 063: checkcast [Ljava/lang/String;
      // 066: astore 8
      // 068: iload 2
      // 069: ifne 099
      // 06c: aload 8
      // 06e: bipush 0
      // 06f: aaload
      // 070: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 073: aload 1
      // 074: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 077: iload 2
      // 078: ifne 033
      // 07b: goto 082
      // 07e: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 081: athrow
      // 082: ifeq 08f
      // 085: aload 8
      // 087: bipush 1
      // 088: aaload
      // 089: astore 4
      // 08b: iload 2
      // 08c: ifeq 09d
      // 08f: iinc 7 1
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 098: athrow
      // 099: iload 2
      // 09a: ifeq 052
      // 09d: aload 4
      // 09f: ifnull 0ad
      // 0a2: iload 2
      // 0a3: ifeq 0bb
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0ac: athrow
      // 0ad: iinc 5 1
      // 0b0: iload 2
      // 0b1: ifeq 031
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0ba: athrow
      // 0bb: invokestatic com/finalshell/core/H1.e ()Ljava/util/Set;
      // 0be: aload 1
      // 0bf: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0c4: ifeq 240
      // 0c7: aload 4
      // 0c9: iload 2
      // 0ca: ifne 242
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0d3: athrow
      // 0d4: ifnull 240
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: iload 2
      // 0e1: ifne 140
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0ea: athrow
      // 0eb: ldc "+"
      // 0ed: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0f0: ifne 132
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0f9: athrow
      // 0fa: aload 4
      // 0fc: iload 2
      // 0fd: ifne 140
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 106: athrow
      // 107: ldc "-"
      // 109: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 10c: ifne 132
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 115: athrow
      // 116: aload 4
      // 118: iload 2
      // 119: ifne 242
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 122: athrow
      // 123: ldc "^"
      // 125: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 128: ifeq 240
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 131: athrow
      // 132: aload 3
      // 133: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 136: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 13f: athrow
      // 140: astore 5
      // 142: aload 4
      // 144: ldc "+"
      // 146: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 149: iload 2
      // 14a: ifne 18b
      // 14d: ifeq 17d
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 156: athrow
      // 157: new java/lang/StringBuilder
      // 15a: dup
      // 15b: invokespecial java/lang/StringBuilder.<init> ()V
      // 15e: aload 5
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: ldc ","
      // 165: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 168: aload 4
      // 16a: bipush 1
      // 16b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 16e: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 177: astore 4
      // 179: iload 2
      // 17a: ifeq 240
      // 17d: aload 4
      // 17f: ldc "-"
      // 181: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 184: goto 18b
      // 187: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 18a: athrow
      // 18b: iload 2
      // 18c: ifne 21b
      // 18f: ifeq 202
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 198: athrow
      // 199: aload 5
      // 19b: ldc ","
      // 19d: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 1a0: invokestatic java/util/Arrays.stream ([Ljava/lang/Object;)Ljava/util/stream/Stream;
      // 1a3: invokestatic java/util/stream/Collectors.toList ()Ljava/util/stream/Collector;
      // 1a6: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 1ab: checkcast java/util/List
      // 1ae: astore 6
      // 1b0: aload 4
      // 1b2: bipush 1
      // 1b3: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1b6: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1b9: ldc ","
      // 1bb: invokestatic com/finalshell/core/E8.b (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 1be: astore 7
      // 1c0: aload 7
      // 1c2: arraylength
      // 1c3: istore 8
      // 1c5: bipush 0
      // 1c6: istore 9
      // 1c8: iload 9
      // 1ca: iload 8
      // 1cc: if_icmpge 1f5
      // 1cf: aload 7
      // 1d1: iload 9
      // 1d3: aaload
      // 1d4: astore 10
      // 1d6: aload 6
      // 1d8: aload 10
      // 1da: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1dd: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 1e2: pop
      // 1e3: iinc 9 1
      // 1e6: iload 2
      // 1e7: ifne 1fe
      // 1ea: iload 2
      // 1eb: ifeq 1c8
      // 1ee: goto 1f5
      // 1f1: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1f4: athrow
      // 1f5: ldc ","
      // 1f7: aload 6
      // 1f9: invokestatic java/lang/String.join (Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
      // 1fc: astore 4
      // 1fe: iload 2
      // 1ff: ifeq 240
      // 202: aload 4
      // 204: iload 2
      // 205: ifne 242
      // 208: goto 20f
      // 20b: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 20e: athrow
      // 20f: ldc "^"
      // 211: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 214: goto 21b
      // 217: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 21a: athrow
      // 21b: ifeq 240
      // 21e: new java/lang/StringBuilder
      // 221: dup
      // 222: invokespecial java/lang/StringBuilder.<init> ()V
      // 225: aload 4
      // 227: bipush 1
      // 228: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 22b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 22e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 231: ldc ","
      // 233: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 236: aload 5
      // 238: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23e: astore 4
      // 240: aload 4
      // 242: areturn
   }

   public String[] F(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 1
      // 04: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 07: astore 1
      // 08: new java/util/Vector
      // 0b: dup
      // 0c: invokespecial java/util/Vector.<init> ()V
      // 0f: astore 3
      // 10: istore 2
      // 11: bipush 0
      // 12: istore 4
      // 14: iload 4
      // 16: aload 0
      // 17: getfield com/finalshell/core/RI.r Ljava/util/Vector;
      // 1a: invokevirtual java/util/Vector.size ()I
      // 1d: if_icmpge a0
      // 20: aload 0
      // 21: getfield com/finalshell/core/RI.r Ljava/util/Vector;
      // 24: iload 4
      // 26: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 29: checkcast java/util/Vector
      // 2c: astore 5
      // 2e: bipush 0
      // 2f: iload 2
      // 30: ifeq a4
      // 33: istore 6
      // 35: iload 6
      // 37: aload 5
      // 39: invokevirtual java/util/Vector.size ()I
      // 3c: if_icmpge 99
      // 3f: aload 5
      // 41: iload 6
      // 43: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 46: checkcast [Ljava/lang/String;
      // 49: astore 7
      // 4b: iload 2
      // 4c: ifeq 95
      // 4f: aload 7
      // 51: bipush 0
      // 52: aaload
      // 53: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 56: aload 1
      // 57: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5a: iload 2
      // 5b: ifeq 16
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 64: athrow
      // 65: ifeq 92
      // 68: aload 7
      // 6a: bipush 1
      // 6b: aaload
      // 6c: astore 8
      // 6e: iload 2
      // 6f: ifeq 95
      // 72: aload 8
      // 74: ifnull 92
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 7d: athrow
      // 7e: aload 3
      // 7f: aload 8
      // 81: invokevirtual java/util/Vector.remove (Ljava/lang/Object;)Z
      // 84: pop
      // 85: aload 3
      // 86: aload 8
      // 88: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 91: athrow
      // 92: iinc 6 1
      // 95: iload 2
      // 96: ifne 35
      // 99: iinc 4 1
      // 9c: iload 2
      // 9d: ifne 14
      // a0: aload 3
      // a1: invokevirtual java/util/Vector.size ()I
      // a4: anewarray 79
      // a7: astore 4
      // a9: aload 3
      // aa: aload 4
      // ac: invokevirtual java/util/Vector.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // af: pop
      // b0: aload 4
      // b2: areturn
   }

   @Override
   public String U() {
      return this.S(a(-12994, -6020));
   }

   @Override
   public String o() {
      return this.S(a(-12999, 26946));
   }

   @Override
   public int x() {
      String var1 = this.S(a(-12995, 14952));
      int var2 = -1;

      try {
         var2 = Integer.parseInt(var1);
      } catch (NumberFormatException var4) {
      }

      return var2;
   }

   @Override
   public String m(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 4d
      // 09: sipush -13000
      // 0c: sipush -29539
      // 0f: invokestatic com/finalshell/core/RI.a (II)Ljava/lang/String;
      // 12: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15: ifne 41
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 1e: athrow
      // 1f: aload 1
      // 20: iload 2
      // 21: ifne 9f
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 2a: athrow
      // 2b: sipush -12993
      // 2e: sipush 19915
      // 31: invokestatic com/finalshell/core/RI.a (II)Ljava/lang/String;
      // 34: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 37: ifeq 9a
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 40: athrow
      // 41: aload 0
      // 42: aload 1
      // 43: invokespecial com/finalshell/core/RI.S (Ljava/lang/String;)Ljava/lang/String;
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 4c: athrow
      // 4d: astore 3
      // 4e: aload 3
      // 4f: iload 2
      // 50: ifne 8f
      // 53: ifnull 7f
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 5c: athrow
      // 5d: aload 3
      // 5e: iload 2
      // 5f: ifne 99
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 68: athrow
      // 69: sipush -12997
      // 6c: sipush 8864
      // 6f: invokestatic com/finalshell/core/RI.a (II)Ljava/lang/String;
      // 72: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 75: ifeq 90
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 7e: athrow
      // 7f: sipush -13008
      // 82: sipush -8105
      // 85: invokestatic com/finalshell/core/RI.a (II)Ljava/lang/String;
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/core/RI.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 8e: athrow
      // 8f: areturn
      // 90: sipush -12998
      // 93: sipush -22170
      // 96: invokestatic com/finalshell/core/RI.a (II)Ljava/lang/String;
      // 99: areturn
      // 9a: aload 0
      // 9b: aload 1
      // 9c: invokespecial com/finalshell/core/RI.S (Ljava/lang/String;)Ljava/lang/String;
      // 9f: areturn
   }

   @Override
   public String[] G(String var1) {
      return this.F(var1);
   }

   public static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -13000) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 154;
               break;
            case 1:
               var10000 = 238;
               break;
            case 2:
               var10000 = 208;
               break;
            case 3:
               var10000 = 188;
               break;
            case 4:
               var10000 = 168;
               break;
            case 5:
               var10000 = 119;
               break;
            case 6:
               var10000 = 171;
               break;
            case 7:
               var10000 = 5;
               break;
            case 8:
               var10000 = 136;
               break;
            case 9:
               var10000 = 170;
               break;
            case 10:
               var10000 = 17;
               break;
            case 11:
               var10000 = 7;
               break;
            case 12:
               var10000 = 74;
               break;
            case 13:
               var10000 = 134;
               break;
            case 14:
               var10000 = 44;
               break;
            case 15:
               var10000 = 190;
               break;
            case 16:
               var10000 = 38;
               break;
            case 17:
               var10000 = 27;
               break;
            case 18:
               var10000 = 254;
               break;
            case 19:
               var10000 = 69;
               break;
            case 20:
               var10000 = 51;
               break;
            case 21:
               var10000 = 59;
               break;
            case 22:
               var10000 = 53;
               break;
            case 23:
               var10000 = 139;
               break;
            case 24:
               var10000 = 176;
               break;
            case 25:
               var10000 = 158;
               break;
            case 26:
               var10000 = 20;
               break;
            case 27:
               var10000 = 204;
               break;
            case 28:
               var10000 = 149;
               break;
            case 29:
               var10000 = 162;
               break;
            case 30:
               var10000 = 84;
               break;
            case 31:
               var10000 = 221;
               break;
            case 32:
               var10000 = 133;
               break;
            case 33:
               var10000 = 25;
               break;
            case 34:
               var10000 = 124;
               break;
            case 35:
               var10000 = 66;
               break;
            case 36:
               var10000 = 86;
               break;
            case 37:
               var10000 = 213;
               break;
            case 38:
               var10000 = 112;
               break;
            case 39:
               var10000 = 192;
               break;
            case 40:
               var10000 = 64;
               break;
            case 41:
               var10000 = 130;
               break;
            case 42:
               var10000 = 0;
               break;
            case 43:
               var10000 = 97;
               break;
            case 44:
               var10000 = 217;
               break;
            case 45:
               var10000 = 248;
               break;
            case 46:
               var10000 = 111;
               break;
            case 47:
               var10000 = 227;
               break;
            case 48:
               var10000 = 186;
               break;
            case 49:
               var10000 = 231;
               break;
            case 50:
               var10000 = 93;
               break;
            case 51:
               var10000 = 155;
               break;
            case 52:
               var10000 = 96;
               break;
            case 53:
               var10000 = 157;
               break;
            case 54:
               var10000 = 161;
               break;
            case 55:
               var10000 = 210;
               break;
            case 56:
               var10000 = 141;
               break;
            case 57:
               var10000 = 195;
               break;
            case 58:
               var10000 = 203;
               break;
            case 59:
               var10000 = 220;
               break;
            case 60:
               var10000 = 70;
               break;
            case 61:
               var10000 = 151;
               break;
            case 62:
               var10000 = 76;
               break;
            case 63:
               var10000 = 129;
               break;
            case 64:
               var10000 = 198;
               break;
            case 65:
               var10000 = 46;
               break;
            case 66:
               var10000 = 250;
               break;
            case 67:
               var10000 = 40;
               break;
            case 68:
               var10000 = 185;
               break;
            case 69:
               var10000 = 202;
               break;
            case 70:
               var10000 = 166;
               break;
            case 71:
               var10000 = 184;
               break;
            case 72:
               var10000 = 63;
               break;
            case 73:
               var10000 = 165;
               break;
            case 74:
               var10000 = 6;
               break;
            case 75:
               var10000 = 35;
               break;
            case 76:
               var10000 = 229;
               break;
            case 77:
               var10000 = 55;
               break;
            case 78:
               var10000 = 230;
               break;
            case 79:
               var10000 = 215;
               break;
            case 80:
               var10000 = 98;
               break;
            case 81:
               var10000 = 197;
               break;
            case 82:
               var10000 = 11;
               break;
            case 83:
               var10000 = 144;
               break;
            case 84:
               var10000 = 58;
               break;
            case 85:
               var10000 = 18;
               break;
            case 86:
               var10000 = 251;
               break;
            case 87:
               var10000 = 95;
               break;
            case 88:
               var10000 = 37;
               break;
            case 89:
               var10000 = 209;
               break;
            case 90:
               var10000 = 21;
               break;
            case 91:
               var10000 = 90;
               break;
            case 92:
               var10000 = 183;
               break;
            case 93:
               var10000 = 103;
               break;
            case 94:
               var10000 = 78;
               break;
            case 95:
               var10000 = 200;
               break;
            case 96:
               var10000 = 24;
               break;
            case 97:
               var10000 = 148;
               break;
            case 98:
               var10000 = 222;
               break;
            case 99:
               var10000 = 179;
               break;
            case 100:
               var10000 = 172;
               break;
            case 101:
               var10000 = 122;
               break;
            case 102:
               var10000 = 196;
               break;
            case 103:
               var10000 = 226;
               break;
            case 104:
               var10000 = 71;
               break;
            case 105:
               var10000 = 4;
               break;
            case 106:
               var10000 = 255;
               break;
            case 107:
               var10000 = 80;
               break;
            case 108:
               var10000 = 1;
               break;
            case 109:
               var10000 = 128;
               break;
            case 110:
               var10000 = 62;
               break;
            case 111:
               var10000 = 45;
               break;
            case 112:
               var10000 = 156;
               break;
            case 113:
               var10000 = 131;
               break;
            case 114:
               var10000 = 114;
               break;
            case 115:
               var10000 = 245;
               break;
            case 116:
               var10000 = 60;
               break;
            case 117:
               var10000 = 41;
               break;
            case 118:
               var10000 = 36;
               break;
            case 119:
               var10000 = 244;
               break;
            case 120:
               var10000 = 142;
               break;
            case 121:
               var10000 = 79;
               break;
            case 122:
               var10000 = 201;
               break;
            case 123:
               var10000 = 49;
               break;
            case 124:
               var10000 = 247;
               break;
            case 125:
               var10000 = 68;
               break;
            case 126:
               var10000 = 153;
               break;
            case 127:
               var10000 = 54;
               break;
            case 128:
               var10000 = 219;
               break;
            case 129:
               var10000 = 181;
               break;
            case 130:
               var10000 = 31;
               break;
            case 131:
               var10000 = 105;
               break;
            case 132:
               var10000 = 189;
               break;
            case 133:
               var10000 = 118;
               break;
            case 134:
               var10000 = 253;
               break;
            case 135:
               var10000 = 3;
               break;
            case 136:
               var10000 = 99;
               break;
            case 137:
               var10000 = 115;
               break;
            case 138:
               var10000 = 77;
               break;
            case 139:
               var10000 = 177;
               break;
            case 140:
               var10000 = 15;
               break;
            case 141:
               var10000 = 57;
               break;
            case 142:
               var10000 = 218;
               break;
            case 143:
               var10000 = 106;
               break;
            case 144:
               var10000 = 223;
               break;
            case 145:
               var10000 = 14;
               break;
            case 146:
               var10000 = 123;
               break;
            case 147:
               var10000 = 32;
               break;
            case 148:
               var10000 = 175;
               break;
            case 149:
               var10000 = 164;
               break;
            case 150:
               var10000 = 214;
               break;
            case 151:
               var10000 = 10;
               break;
            case 152:
               var10000 = 138;
               break;
            case 153:
               var10000 = 52;
               break;
            case 154:
               var10000 = 137;
               break;
            case 155:
               var10000 = 167;
               break;
            case 156:
               var10000 = 116;
               break;
            case 157:
               var10000 = 120;
               break;
            case 158:
               var10000 = 107;
               break;
            case 159:
               var10000 = 232;
               break;
            case 160:
               var10000 = 205;
               break;
            case 161:
               var10000 = 143;
               break;
            case 162:
               var10000 = 206;
               break;
            case 163:
               var10000 = 87;
               break;
            case 164:
               var10000 = 240;
               break;
            case 165:
               var10000 = 249;
               break;
            case 166:
               var10000 = 33;
               break;
            case 167:
               var10000 = 178;
               break;
            case 168:
               var10000 = 228;
               break;
            case 169:
               var10000 = 233;
               break;
            case 170:
               var10000 = 113;
               break;
            case 171:
               var10000 = 145;
               break;
            case 172:
               var10000 = 224;
               break;
            case 173:
               var10000 = 34;
               break;
            case 174:
               var10000 = 135;
               break;
            case 175:
               var10000 = 75;
               break;
            case 176:
               var10000 = 110;
               break;
            case 177:
               var10000 = 173;
               break;
            case 178:
               var10000 = 194;
               break;
            case 179:
               var10000 = 236;
               break;
            case 180:
               var10000 = 65;
               break;
            case 181:
               var10000 = 199;
               break;
            case 182:
               var10000 = 132;
               break;
            case 183:
               var10000 = 23;
               break;
            case 184:
               var10000 = 225;
               break;
            case 185:
               var10000 = 193;
               break;
            case 186:
               var10000 = 82;
               break;
            case 187:
               var10000 = 72;
               break;
            case 188:
               var10000 = 127;
               break;
            case 189:
               var10000 = 8;
               break;
            case 190:
               var10000 = 56;
               break;
            case 191:
               var10000 = 242;
               break;
            case 192:
               var10000 = 39;
               break;
            case 193:
               var10000 = 246;
               break;
            case 194:
               var10000 = 73;
               break;
            case 195:
               var10000 = 61;
               break;
            case 196:
               var10000 = 30;
               break;
            case 197:
               var10000 = 26;
               break;
            case 198:
               var10000 = 146;
               break;
            case 199:
               var10000 = 85;
               break;
            case 200:
               var10000 = 243;
               break;
            case 201:
               var10000 = 140;
               break;
            case 202:
               var10000 = 9;
               break;
            case 203:
               var10000 = 101;
               break;
            case 204:
               var10000 = 234;
               break;
            case 205:
               var10000 = 174;
               break;
            case 206:
               var10000 = 91;
               break;
            case 207:
               var10000 = 147;
               break;
            case 208:
               var10000 = 182;
               break;
            case 209:
               var10000 = 102;
               break;
            case 210:
               var10000 = 125;
               break;
            case 211:
               var10000 = 13;
               break;
            case 212:
               var10000 = 235;
               break;
            case 213:
               var10000 = 180;
               break;
            case 214:
               var10000 = 83;
               break;
            case 215:
               var10000 = 42;
               break;
            case 216:
               var10000 = 16;
               break;
            case 217:
               var10000 = 212;
               break;
            case 218:
               var10000 = 81;
               break;
            case 219:
               var10000 = 241;
               break;
            case 220:
               var10000 = 43;
               break;
            case 221:
               var10000 = 48;
               break;
            case 222:
               var10000 = 191;
               break;
            case 223:
               var10000 = 89;
               break;
            case 224:
               var10000 = 121;
               break;
            case 225:
               var10000 = 169;
               break;
            case 226:
               var10000 = 47;
               break;
            case 227:
               var10000 = 22;
               break;
            case 228:
               var10000 = 29;
               break;
            case 229:
               var10000 = 160;
               break;
            case 230:
               var10000 = 159;
               break;
            case 231:
               var10000 = 152;
               break;
            case 232:
               var10000 = 126;
               break;
            case 233:
               var10000 = 12;
               break;
            case 234:
               var10000 = 100;
               break;
            case 235:
               var10000 = 108;
               break;
            case 236:
               var10000 = 67;
               break;
            case 237:
               var10000 = 28;
               break;
            case 238:
               var10000 = 163;
               break;
            case 239:
               var10000 = 88;
               break;
            case 240:
               var10000 = 239;
               break;
            case 241:
               var10000 = 92;
               break;
            case 242:
               var10000 = 19;
               break;
            case 243:
               var10000 = 117;
               break;
            case 244:
               var10000 = 2;
               break;
            case 245:
               var10000 = 207;
               break;
            case 246:
               var10000 = 94;
               break;
            case 247:
               var10000 = 109;
               break;
            case 248:
               var10000 = 150;
               break;
            case 249:
               var10000 = 50;
               break;
            case 250:
               var10000 = 211;
               break;
            case 251:
               var10000 = 104;
               break;
            case 252:
               var10000 = 252;
               break;
            case 253:
               var10000 = 187;
               break;
            case 254:
               var10000 = 216;
               break;
            default:
               var10000 = 237;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "þ´\u009a¸Q¿|\f#Ô\u0092\u00861\u0010\u0019\u0004Ù\u0083\u0086Ã\u001aYÙPd¾~öi\u0016°ÎÓYeî\u0016T¤ÿ{eF4)\u0097r\u0002\u001b±\u0004Äæ\u0086y\u0004¶\u000eÙë\b\u0016ð×49®ð¼";
      int var4 = "þ´\u009a¸Q¿|\f#Ô\u0092\u00861\u0010\u0019\u0004Ù\u0083\u0086Ã\u001aYÙPd¾~öi\u0016°ÎÓYeî\u0016T¤ÿ{eF4)\u0097r\u0002\u001b±\u0004Äæ\u0086y\u0004¶\u000eÙë\b\u0016ð×49®ð¼"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 65;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 10;
                        break;
                     case 1:
                        var46 = 95;
                        break;
                     case 2:
                        var46 = 15;
                        break;
                     case 3:
                        var46 = 94;
                        break;
                     case 4:
                        var46 = 56;
                        break;
                     case 5:
                        var46 = 17;
                        break;
                     default:
                        var46 = 119;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[9];
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0005Þìü\u0096>\u008d5\u0014ú}JÕ\u0080\u008e\u001a>å$\u008e²Ø\u0083\u000f\"ËÐøG\u001f\u001aâ\u0018º¼iåË×\u0092sh";
                  var4 = "\u0005Þìü\u0096>\u008d5\u0014ú}JÕ\u0080\u008e\u001a>å$\u008e²Ø\u0083\u000f\"ËÐøG\u001f\u001aâ\u0018º¼iåË×\u0092sh".length();
                  var1 = 15;
                  var8 = -1;
            }

            var10000 = 73;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





