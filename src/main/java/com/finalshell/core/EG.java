package com.finalshell.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EG {
   public static Logger E;
   public final Im4 L;
   public final int I;
   public final int V;
   public final Map Y = new HashMap();
   public final List J = new ArrayList();
   public DC3 a;
   public int B;
   public static String[] b;
   public static String[] c;

   EG(@NotNull Im4 var1, int var2, int var3) {
      this.L = var1;
      this.I = var2;
      this.V = var3;
   }

   void W(@NotNull XE var1) {
      this.Y.put(new Ay2_2(var1, false), null);
   }

   void U(@NotNull XE var1, boolean var2) {
      this.Y.put(new Ay2_2(var1, var2), null);
   }

   @NotNull
   XE d(@NotNull XE param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: aload 0
      // 04: getfield com/finalshell/core/EG.Y Ljava/util/Map;
      // 07: new com/finalshell/core/Ay2_2
      // 0a: dup
      // 0b: aload 1
      // 0c: bipush 0
      // 0d: invokespecial com/finalshell/core/Ay2_2.<init> (Lcom/finalshell/core/XE;Z)V
      // 10: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 15: checkcast com/finalshell/core/XE
      // 18: astore 3
      // 19: istore 2
      // 1a: aload 3
      // 1b: iload 2
      // 1c: ifeq 46
      // 1f: ifnull 2f
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 28: athrow
      // 29: aload 3
      // 2a: areturn
      // 2b: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/finalshell/core/EG.Y Ljava/util/Map;
      // 33: new com/finalshell/core/Ay2_2
      // 36: dup
      // 37: aload 1
      // 38: bipush 1
      // 39: invokespecial com/finalshell/core/Ay2_2.<init> (Lcom/finalshell/core/XE;Z)V
      // 3c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 41: checkcast com/finalshell/core/XE
      // 44: astore 3
      // 45: aload 3
      // 46: iload 2
      // 47: ifeq 7d
      // 4a: ifnull 5a
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 53: athrow
      // 54: aload 3
      // 55: areturn
      // 56: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 59: athrow
      // 5a: getstatic com/finalshell/core/EG.E Lorg/slf4j/Logger;
      // 5d: new java/lang/StringBuilder
      // 60: dup
      // 61: invokespecial java/lang/StringBuilder.<init> ()V
      // 64: sipush 13500
      // 67: sipush -8636
      // 6a: invokestatic com/finalshell/core/EG.a (II)Ljava/lang/String;
      // 6d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 70: aload 1
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 74: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 77: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
      // 7c: aload 1
      // 7d: areturn
   }

   void i() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 003: aload 0
      // 004: getfield com/finalshell/core/EG.L Lcom/finalshell/core/Im4;
      // 007: invokevirtual com/finalshell/core/Im4.T$ua_2 ()Lcom/finalshell/core/Ua2;
      // 00a: astore 2
      // 00b: bipush 0
      // 00c: istore 3
      // 00d: istore 1
      // 00e: iload 3
      // 00f: aload 2
      // 010: invokevirtual com/finalshell/core/Ua2.b ()I
      // 013: if_icmpge 035
      // 016: aload 2
      // 017: iload 3
      // 018: invokevirtual com/finalshell/core/Ua2.t (I)Lcom/finalshell/core/DC3;
      // 01b: astore 4
      // 01d: aload 0
      // 01e: aload 4
      // 020: invokespecial com/finalshell/core/EG.G (Lcom/finalshell/core/DC3;)V
      // 023: iinc 3 1
      // 026: iload 1
      // 027: ifeq 041
      // 02a: iload 1
      // 02b: ifne 00e
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 034: athrow
      // 035: aload 0
      // 036: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 039: invokeinterface java/util/List.size ()I 1
      // 03e: bipush 1
      // 03f: isub
      // 040: istore 3
      // 041: aload 0
      // 042: iload 1
      // 043: ifeq 05b
      // 046: getfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 049: ifnull 070
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 052: athrow
      // 053: aload 0
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 05a: athrow
      // 05b: getfield com/finalshell/core/EG.B I
      // 05e: iload 1
      // 05f: ifeq 07b
      // 062: aload 0
      // 063: getfield com/finalshell/core/EG.I I
      // 066: if_icmpne 07a
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 06f: athrow
      // 070: iinc 3 1
      // 073: goto 07a
      // 076: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 079: athrow
      // 07a: iload 3
      // 07b: ifge 0a4
      // 07e: new java/lang/IndexOutOfBoundsException
      // 081: dup
      // 082: new java/lang/StringBuilder
      // 085: dup
      // 086: invokespecial java/lang/StringBuilder.<init> ()V
      // 089: sipush 13503
      // 08c: sipush 21870
      // 08f: invokestatic com/finalshell/core/EG.a (II)Ljava/lang/String;
      // 092: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 095: iload 3
      // 096: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 099: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09c: invokespecial java/lang/IndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 09f: athrow
      // 0a0: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield com/finalshell/core/EG.L Lcom/finalshell/core/Im4;
      // 0a8: invokevirtual com/finalshell/core/Im4.N ()Lcom/finalshell/core/Ua2;
      // 0ab: astore 4
      // 0ad: aload 4
      // 0af: invokevirtual com/finalshell/core/Ua2.b ()I
      // 0b2: aload 0
      // 0b3: getfield com/finalshell/core/EG.L Lcom/finalshell/core/Im4;
      // 0b6: invokevirtual com/finalshell/core/Im4.O ()I
      // 0b9: iload 1
      // 0ba: ifeq 116
      // 0bd: if_icmple 10a
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 0c6: athrow
      // 0c7: getstatic com/finalshell/core/EG.E Lorg/slf4j/Logger;
      // 0ca: new java/lang/StringBuilder
      // 0cd: dup
      // 0ce: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d1: sipush 13502
      // 0d4: sipush -25425
      // 0d7: invokestatic com/finalshell/core/EG.a (II)Ljava/lang/String;
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: aload 0
      // 0de: getfield com/finalshell/core/EG.L Lcom/finalshell/core/Im4;
      // 0e1: invokevirtual com/finalshell/core/Im4.O ()I
      // 0e4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e7: sipush 13501
      // 0ea: sipush 8140
      // 0ed: invokestatic com/finalshell/core/EG.a (II)Ljava/lang/String;
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: aload 4
      // 0f5: invokevirtual com/finalshell/core/Ua2.b ()I
      // 0f8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: invokeinterface org/slf4j/Logger.warn (Ljava/lang/String;)V 2
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 109: athrow
      // 10a: aload 4
      // 10c: invokevirtual com/finalshell/core/Ua2.b ()I
      // 10f: aload 0
      // 110: getfield com/finalshell/core/EG.L Lcom/finalshell/core/Im4;
      // 113: invokevirtual com/finalshell/core/Im4.O ()I
      // 116: invokestatic java/lang/Math.min (II)I
      // 119: istore 5
      // 11b: bipush 0
      // 11c: istore 6
      // 11e: iload 6
      // 120: iload 5
      // 122: if_icmpge 1c9
      // 125: aload 0
      // 126: iload 6
      // 128: invokespecial com/finalshell/core/EG.M (I)Ljava/util/List;
      // 12b: astore 7
      // 12d: aload 7
      // 12f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 134: iload 1
      // 135: ifeq 1f3
      // 138: astore 8
      // 13a: aload 8
      // 13c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 141: ifeq 1b7
      // 144: aload 8
      // 146: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 14b: checkcast com/finalshell/core/Ay2_2
      // 14e: astore 9
      // 150: aload 0
      // 151: getfield com/finalshell/core/EG.B I
      // 154: aload 9
      // 156: invokevirtual com/finalshell/core/Ay2_2.S ()I
      // 159: iadd
      // 15a: aload 0
      // 15b: getfield com/finalshell/core/EG.I I
      // 15e: irem
      // 15f: istore 10
      // 161: aload 0
      // 162: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 165: invokeinterface java/util/List.size ()I 1
      // 16a: aload 0
      // 16b: getfield com/finalshell/core/EG.B I
      // 16e: aload 9
      // 170: invokevirtual com/finalshell/core/Ay2_2.S ()I
      // 173: iadd
      // 174: aload 0
      // 175: getfield com/finalshell/core/EG.I I
      // 178: idiv
      // 179: iadd
      // 17a: istore 11
      // 17c: aload 0
      // 17d: getfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 180: iload 1
      // 181: ifeq 249
      // 184: iload 1
      // 185: ifeq 1b2
      // 188: goto 18f
      // 18b: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 18e: athrow
      // 18f: ifnull 19c
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 198: athrow
      // 199: iinc 11 -1
      // 19c: aload 0
      // 19d: getfield com/finalshell/core/EG.Y Ljava/util/Map;
      // 1a0: aload 9
      // 1a2: new com/finalshell/core/XE
      // 1a5: dup
      // 1a6: iload 10
      // 1a8: iload 11
      // 1aa: invokespecial com/finalshell/core/XE.<init> (II)V
      // 1ad: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1b2: pop
      // 1b3: iload 1
      // 1b4: ifne 13a
      // 1b7: aload 0
      // 1b8: aload 4
      // 1ba: iload 6
      // 1bc: invokevirtual com/finalshell/core/Ua2.t (I)Lcom/finalshell/core/DC3;
      // 1bf: invokespecial com/finalshell/core/EG.G (Lcom/finalshell/core/DC3;)V
      // 1c2: iinc 6 1
      // 1c5: iload 1
      // 1c6: ifne 11e
      // 1c9: iload 5
      // 1cb: istore 6
      // 1cd: iload 6
      // 1cf: aload 0
      // 1d0: getfield com/finalshell/core/EG.L Lcom/finalshell/core/Im4;
      // 1d3: invokevirtual com/finalshell/core/Im4.O ()I
      // 1d6: if_icmpge 260
      // 1d9: aload 0
      // 1da: iload 6
      // 1dc: invokespecial com/finalshell/core/EG.M (I)Ljava/util/List;
      // 1df: astore 7
      // 1e1: iload 1
      // 1e2: ifeq 266
      // 1e5: aload 7
      // 1e7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1ec: goto 1f3
      // 1ef: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 1f2: athrow
      // 1f3: astore 8
      // 1f5: aload 8
      // 1f7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1fc: ifeq 259
      // 1ff: aload 8
      // 201: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 206: checkcast com/finalshell/core/Ay2_2
      // 209: astore 9
      // 20b: aload 9
      // 20d: invokevirtual com/finalshell/core/Ay2_2.S ()I
      // 210: aload 0
      // 211: getfield com/finalshell/core/EG.I I
      // 214: irem
      // 215: istore 10
      // 217: iload 6
      // 219: iload 5
      // 21b: isub
      // 21c: aload 0
      // 21d: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 220: invokeinterface java/util/List.size ()I 1
      // 225: iadd
      // 226: aload 9
      // 228: invokevirtual com/finalshell/core/Ay2_2.S ()I
      // 22b: aload 0
      // 22c: getfield com/finalshell/core/EG.I I
      // 22f: idiv
      // 230: iadd
      // 231: istore 11
      // 233: aload 0
      // 234: getfield com/finalshell/core/EG.Y Ljava/util/Map;
      // 237: aload 9
      // 239: new com/finalshell/core/XE
      // 23c: dup
      // 23d: iload 10
      // 23f: iload 11
      // 241: invokespecial com/finalshell/core/XE.<init> (II)V
      // 244: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 249: pop
      // 24a: iload 1
      // 24b: ifeq 25c
      // 24e: iload 1
      // 24f: ifne 1f5
      // 252: goto 259
      // 255: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 258: athrow
      // 259: iinc 6 1
      // 25c: iload 1
      // 25d: ifne 1cd
      // 260: aload 0
      // 261: invokespecial com/finalshell/core/EG.K ()I
      // 264: istore 6
      // 266: bipush 0
      // 267: istore 7
      // 269: aload 0
      // 26a: getfield com/finalshell/core/EG.Y Ljava/util/Map;
      // 26d: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 272: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 277: astore 8
      // 279: aload 8
      // 27b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 280: ifeq 2d4
      // 283: aload 8
      // 285: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 28a: checkcast java/util/Map$Entry
      // 28d: astore 9
      // 28f: aload 9
      // 291: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 296: checkcast com/finalshell/core/Ay2_2
      // 299: invokevirtual com/finalshell/core/Ay2_2.p ()Z
      // 29c: iload 1
      // 29d: ifeq 322
      // 2a0: iload 1
      // 2a1: ifeq 2ce
      // 2a4: goto 2ab
      // 2a7: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 2aa: athrow
      // 2ab: ifeq 2d0
      // 2ae: goto 2b5
      // 2b1: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 2b4: athrow
      // 2b5: iload 7
      // 2b7: aload 9
      // 2b9: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2be: checkcast com/finalshell/core/XE
      // 2c1: getfield com/finalshell/core/XE.r I
      // 2c4: invokestatic java/lang/Math.max (II)I
      // 2c7: goto 2ce
      // 2ca: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 2cd: athrow
      // 2ce: istore 7
      // 2d0: iload 1
      // 2d1: ifne 279
      // 2d4: iload 3
      // 2d5: aload 0
      // 2d6: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 2d9: invokeinterface java/util/List.size ()I 1
      // 2de: aload 0
      // 2df: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 2e2: invokeinterface java/util/List.size ()I 1
      // 2e7: aload 0
      // 2e8: getfield com/finalshell/core/EG.V I
      // 2eb: invokestatic java/lang/Math.min (II)I
      // 2ee: isub
      // 2ef: iload 6
      // 2f1: isub
      // 2f2: invokestatic java/lang/Math.max (II)I
      // 2f5: istore 3
      // 2f6: iload 3
      // 2f7: aload 0
      // 2f8: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 2fb: invokeinterface java/util/List.size ()I 1
      // 300: aload 0
      // 301: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 304: invokeinterface java/util/List.size ()I 1
      // 309: aload 0
      // 30a: getfield com/finalshell/core/EG.V I
      // 30d: invokestatic java/lang/Math.min (II)I
      // 310: isub
      // 311: invokestatic java/lang/Math.min (II)I
      // 314: istore 3
      // 315: iload 3
      // 316: iload 7
      // 318: aload 0
      // 319: getfield com/finalshell/core/EG.V I
      // 31c: isub
      // 31d: bipush 1
      // 31e: iadd
      // 31f: invokestatic java/lang/Math.max (II)I
      // 322: istore 3
      // 323: aload 2
      // 324: invokevirtual com/finalshell/core/Ua2.D ()V
      // 327: aload 2
      // 328: aload 0
      // 329: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 32c: bipush 0
      // 32d: iload 3
      // 32e: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 333: invokevirtual com/finalshell/core/Ua2.O (Ljava/util/List;)V
      // 336: aload 4
      // 338: invokevirtual com/finalshell/core/Ua2.D ()V
      // 33b: aload 4
      // 33d: aload 0
      // 33e: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 341: iload 3
      // 342: iload 3
      // 343: aload 0
      // 344: getfield com/finalshell/core/EG.V I
      // 347: iadd
      // 348: aload 0
      // 349: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 34c: invokeinterface java/util/List.size ()I 1
      // 351: invokestatic java/lang/Math.min (II)I
      // 354: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 359: invokevirtual com/finalshell/core/Ua2.O (Ljava/util/List;)V
      // 35c: aload 0
      // 35d: getfield com/finalshell/core/EG.Y Ljava/util/Map;
      // 360: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 365: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 36a: astore 8
      // 36c: aload 8
      // 36e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 373: ifeq 412
      // 376: aload 8
      // 378: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37d: checkcast java/util/Map$Entry
      // 380: astore 9
      // 382: aload 9
      // 384: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 389: checkcast com/finalshell/core/XE
      // 38c: astore 10
      // 38e: aload 10
      // 390: iload 1
      // 391: ifeq 3c2
      // 394: ifnull 3b4
      // 397: goto 39e
      // 39a: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 39d: athrow
      // 39e: aload 10
      // 3a0: dup
      // 3a1: getfield com/finalshell/core/XE.r I
      // 3a4: iload 3
      // 3a5: isub
      // 3a6: putfield com/finalshell/core/XE.r I
      // 3a9: iload 1
      // 3aa: ifne 3e4
      // 3ad: goto 3b4
      // 3b0: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3b3: athrow
      // 3b4: aload 9
      // 3b6: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 3bb: goto 3c2
      // 3be: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3c1: athrow
      // 3c2: checkcast com/finalshell/core/Ay2_2
      // 3c5: astore 11
      // 3c7: new com/finalshell/core/XE
      // 3ca: dup
      // 3cb: aload 11
      // 3cd: invokevirtual com/finalshell/core/Ay2_2.S ()I
      // 3d0: aload 11
      // 3d2: invokevirtual com/finalshell/core/Ay2_2.r ()I
      // 3d5: invokespecial com/finalshell/core/XE.<init> (II)V
      // 3d8: astore 10
      // 3da: aload 9
      // 3dc: aload 10
      // 3de: invokeinterface java/util/Map$Entry.setValue (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3e3: pop
      // 3e4: aload 10
      // 3e6: aload 0
      // 3e7: getfield com/finalshell/core/EG.I I
      // 3ea: bipush 0
      // 3eb: aload 10
      // 3ed: getfield com/finalshell/core/XE.q I
      // 3f0: invokestatic java/lang/Math.max (II)I
      // 3f3: invokestatic java/lang/Math.min (II)I
      // 3f6: putfield com/finalshell/core/XE.q I
      // 3f9: aload 10
      // 3fb: aload 0
      // 3fc: getfield com/finalshell/core/EG.V I
      // 3ff: bipush 0
      // 400: aload 10
      // 402: getfield com/finalshell/core/XE.r I
      // 405: invokestatic java/lang/Math.max (II)I
      // 408: invokestatic java/lang/Math.min (II)I
      // 40b: putfield com/finalshell/core/XE.r I
      // 40e: iload 1
      // 40f: ifne 36c
      // 412: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 415: ifnull 42f
      // 418: iload 1
      // 419: ifeq 42b
      // 41c: goto 423
      // 41f: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 422: athrow
      // 423: bipush 0
      // 424: goto 42c
      // 427: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 42a: athrow
      // 42b: bipush 1
      // 42c: invokestatic com/finalshell/ui/model/J2.q (Z)V
      // 42f: return
   }

   public int K() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: bipush 0
      // 04: istore 2
      // 05: istore 1
      // 06: iload 2
      // 07: aload 0
      // 08: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 56
      // 13: aload 0
      // 14: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 17: aload 0
      // 18: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 1b: invokeinterface java/util/List.size ()I 1
      // 20: iload 2
      // 21: isub
      // 22: bipush 1
      // 23: isub
      // 24: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 29: checkcast com/finalshell/core/DC3
      // 2c: invokevirtual com/finalshell/core/DC3.V$boolean ()Z
      // 2f: iload 1
      // 30: ifeq 57
      // 33: iload 1
      // 34: ifeq 57
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3d: athrow
      // 3e: ifeq 56
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 47: athrow
      // 48: iinc 2 1
      // 4b: iload 1
      // 4c: ifne 06
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 55: athrow
      // 56: iload 2
      // 57: ireturn
   }

   @NotNull
   public List M(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 03: astore 3
      // 04: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 07: aload 0
      // 08: getfield com/finalshell/core/EG.Y Ljava/util/Map;
      // 0b: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 10: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 15: astore 4
      // 17: istore 2
      // 18: aload 4
      // 1a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f: ifeq 72
      // 22: aload 4
      // 24: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 29: checkcast com/finalshell/core/Ay2_2
      // 2c: astore 5
      // 2e: aload 5
      // 30: invokevirtual com/finalshell/core/Ay2_2.r ()I
      // 33: iload 2
      // 34: ifeq 4f
      // 37: iload 1
      // 38: if_icmpne 6e
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 41: athrow
      // 42: aload 3
      // 43: invokeinterface java/util/List.isEmpty ()Z 1
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 4e: athrow
      // 4f: iload 2
      // 50: ifeq 6d
      // 53: ifeq 65
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 5c: athrow
      // 5d: new java/util/ArrayList
      // 60: dup
      // 61: invokespecial java/util/ArrayList.<init> ()V
      // 64: astore 3
      // 65: aload 3
      // 66: aload 5
      // 68: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6d: pop
      // 6e: iload 2
      // 6f: ifne 18
      // 72: aload 3
      // 73: areturn
   }

   public void G(@NotNull DC3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.P ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual com/finalshell/core/DC3.V$boolean ()Z
      // 08: iload 2
      // 09: ifne 67
      // 0c: ifeq 4e
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 15: athrow
      // 16: aload 0
      // 17: iload 2
      // 18: ifne 41
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 21: athrow
      // 22: getfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 25: ifnull 40
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 2e: athrow
      // 2f: aload 0
      // 30: aconst_null
      // 31: putfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 34: aload 0
      // 35: bipush 0
      // 36: putfield com/finalshell/core/EG.B I
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 44: invokestatic com/finalshell/core/DC3.v ()Lcom/finalshell/core/DC3;
      // 47: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4c: pop
      // 4d: return
      // 4e: aload 1
      // 4f: aload 0
      // 50: invokedynamic accept (Lcom/finalshell/core/EG;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, com/finalshell/core/EG.lambda$addLine$0 (Lcom/finalshell/core/Lu4;)V, (Lcom/finalshell/core/Lu4;)V ]
      // 55: invokevirtual com/finalshell/core/DC3.R (Ljava/util/function/Consumer;)V
      // 58: iload 2
      // 59: ifne 76
      // 5c: aload 1
      // 5d: invokevirtual com/finalshell/core/DC3.G ()Z
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 66: athrow
      // 67: ifne 7b
      // 6a: aload 0
      // 6b: aconst_null
      // 6c: putfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 6f: goto 76
      // 72: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 75: athrow
      // 76: aload 0
      // 77: bipush 0
      // 78: putfield com/finalshell/core/EG.B I
      // 7b: return
   }

   @NotNull
   public static Lu4 m(@NotNull Lu4 var0, int var1, int var2) {
      boolean var3 = com.finalshell.ui.model.J2.P();

      int var10000;
      label25: {
         try {
            var10000 = var1;
            if (var3) {
               break label25;
            }

            if (var1 != 0) {
               return new Lu4(var0.j(), var0.v().Y(var1, var2));
            }
         } catch (IndexOutOfBoundsException var5) {
            throw a(var5);
         }

         var10000 = var2;
      }

      try {
         if (var10000 == var0.s()) {
            return var0;
         }
      } catch (IndexOutOfBoundsException var4) {
         throw a(var4);
      }

      return new Lu4(var0.j(), var0.v().Y(var1, var2));
   }

   public void lambda$addLine$0(Lu4 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/J2.g ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual com/finalshell/core/Lu4.V ()Z
      // 08: iload 2
      // 09: ifeq 18
      // 0c: ifeq 17
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 15: athrow
      // 16: return
      // 17: bipush 0
      // 18: istore 3
      // 19: iload 3
      // 1a: aload 1
      // 1b: invokevirtual com/finalshell/core/Lu4.s ()I
      // 1e: if_icmpge da
      // 21: aload 0
      // 22: getfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 25: iload 2
      // 26: ifeq 78
      // 29: ifnull 69
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 32: athrow
      // 33: aload 0
      // 34: iload 2
      // 35: ifeq 6a
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 3e: athrow
      // 3f: getfield com/finalshell/core/EG.B I
      // 42: aload 0
      // 43: getfield com/finalshell/core/EG.I I
      // 46: if_icmpne 69
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 54: bipush 1
      // 55: invokevirtual com/finalshell/core/DC3.M (Z)V
      // 58: aload 0
      // 59: aconst_null
      // 5a: putfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 5d: aload 0
      // 5e: bipush 0
      // 5f: putfield com/finalshell/core/EG.B I
      // 62: goto 69
      // 65: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 68: athrow
      // 69: aload 0
      // 6a: iload 2
      // 6b: ifeq a1
      // 6e: getfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 77: athrow
      // 78: ifnonnull a0
      // 7b: aload 0
      // 7c: new com/finalshell/core/DC3
      // 7f: dup
      // 80: invokespecial com/finalshell/core/DC3.<init> ()V
      // 83: putfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 86: aload 0
      // 87: bipush 0
      // 88: putfield com/finalshell/core/EG.B I
      // 8b: aload 0
      // 8c: getfield com/finalshell/core/EG.J Ljava/util/List;
      // 8f: aload 0
      // 90: getfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // 93: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 98: pop
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/EG.a (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
      // 9f: athrow
      // a0: aload 0
      // a1: getfield com/finalshell/core/EG.I I
      // a4: aload 0
      // a5: getfield com/finalshell/core/EG.B I
      // a8: isub
      // a9: aload 1
      // aa: invokevirtual com/finalshell/core/Lu4.s ()I
      // ad: iload 3
      // ae: isub
      // af: invokestatic java/lang/Math.min (II)I
      // b2: istore 4
      // b4: aload 1
      // b5: iload 3
      // b6: iload 4
      // b8: invokestatic com/finalshell/core/EG.m (Lcom/finalshell/core/Lu4;II)Lcom/finalshell/core/Lu4;
      // bb: astore 5
      // bd: aload 0
      // be: getfield com/finalshell/core/EG.a Lcom/finalshell/core/DC3;
      // c1: aload 5
      // c3: invokevirtual com/finalshell/core/DC3.s (Lcom/finalshell/core/Lu4;)V
      // c6: aload 0
      // c7: dup
      // c8: getfield com/finalshell/core/EG.B I
      // cb: iload 4
      // cd: iadd
      // ce: putfield com/finalshell/core/EG.B I
      // d1: iload 3
      // d2: iload 4
      // d4: iadd
      // d5: istore 3
      // d6: iload 2
      // d7: ifne 19
      // da: return
   }

   static {
      __vfClinit__();
   }

   public static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 13503) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 73;
               break;
            case 1:
               var10000 = 234;
               break;
            case 2:
               var10000 = 229;
               break;
            case 3:
               var10000 = 43;
               break;
            case 4:
               var10000 = 36;
               break;
            case 5:
               var10000 = 232;
               break;
            case 6:
               var10000 = 185;
               break;
            case 7:
               var10000 = 241;
               break;
            case 8:
               var10000 = 83;
               break;
            case 9:
               var10000 = 143;
               break;
            case 10:
               var10000 = 110;
               break;
            case 11:
               var10000 = 245;
               break;
            case 12:
               var10000 = 145;
               break;
            case 13:
               var10000 = 239;
               break;
            case 14:
               var10000 = 179;
               break;
            case 15:
               var10000 = 205;
               break;
            case 16:
               var10000 = 10;
               break;
            case 17:
               var10000 = 24;
               break;
            case 18:
               var10000 = 37;
               break;
            case 19:
               var10000 = 184;
               break;
            case 20:
               var10000 = 203;
               break;
            case 21:
               var10000 = 189;
               break;
            case 22:
               var10000 = 225;
               break;
            case 23:
               var10000 = 181;
               break;
            case 24:
               var10000 = 68;
               break;
            case 25:
               var10000 = 114;
               break;
            case 26:
               var10000 = 39;
               break;
            case 27:
               var10000 = 8;
               break;
            case 28:
               var10000 = 202;
               break;
            case 29:
               var10000 = 89;
               break;
            case 30:
               var10000 = 127;
               break;
            case 31:
               var10000 = 29;
               break;
            case 32:
               var10000 = 57;
               break;
            case 33:
               var10000 = 95;
               break;
            case 34:
               var10000 = 21;
               break;
            case 35:
               var10000 = 140;
               break;
            case 36:
               var10000 = 201;
               break;
            case 37:
               var10000 = 135;
               break;
            case 38:
               var10000 = 18;
               break;
            case 39:
               var10000 = 240;
               break;
            case 40:
               var10000 = 16;
               break;
            case 41:
               var10000 = 177;
               break;
            case 42:
               var10000 = 125;
               break;
            case 43:
               var10000 = 49;
               break;
            case 44:
               var10000 = 238;
               break;
            case 45:
               var10000 = 86;
               break;
            case 46:
               var10000 = 77;
               break;
            case 47:
               var10000 = 90;
               break;
            case 48:
               var10000 = 2;
               break;
            case 49:
               var10000 = 218;
               break;
            case 50:
               var10000 = 172;
               break;
            case 51:
               var10000 = 32;
               break;
            case 52:
               var10000 = 22;
               break;
            case 53:
               var10000 = 192;
               break;
            case 54:
               var10000 = 236;
               break;
            case 55:
               var10000 = 146;
               break;
            case 56:
               var10000 = 222;
               break;
            case 57:
               var10000 = 151;
               break;
            case 58:
               var10000 = 250;
               break;
            case 59:
               var10000 = 139;
               break;
            case 60:
               var10000 = 38;
               break;
            case 61:
               var10000 = 252;
               break;
            case 62:
               var10000 = 219;
               break;
            case 63:
               var10000 = 7;
               break;
            case 64:
               var10000 = 53;
               break;
            case 65:
               var10000 = 153;
               break;
            case 66:
               var10000 = 227;
               break;
            case 67:
               var10000 = 48;
               break;
            case 68:
               var10000 = 112;
               break;
            case 69:
               var10000 = 5;
               break;
            case 70:
               var10000 = 251;
               break;
            case 71:
               var10000 = 54;
               break;
            case 72:
               var10000 = 188;
               break;
            case 73:
               var10000 = 244;
               break;
            case 74:
               var10000 = 25;
               break;
            case 75:
               var10000 = 6;
               break;
            case 76:
               var10000 = 242;
               break;
            case 77:
               var10000 = 119;
               break;
            case 78:
               var10000 = 64;
               break;
            case 79:
               var10000 = 228;
               break;
            case 80:
               var10000 = 158;
               break;
            case 81:
               var10000 = 224;
               break;
            case 82:
               var10000 = 206;
               break;
            case 83:
               var10000 = 42;
               break;
            case 84:
               var10000 = 174;
               break;
            case 85:
               var10000 = 47;
               break;
            case 86:
               var10000 = 199;
               break;
            case 87:
               var10000 = 175;
               break;
            case 88:
               var10000 = 9;
               break;
            case 89:
               var10000 = 155;
               break;
            case 90:
               var10000 = 93;
               break;
            case 91:
               var10000 = 76;
               break;
            case 92:
               var10000 = 96;
               break;
            case 93:
               var10000 = 253;
               break;
            case 94:
               var10000 = 91;
               break;
            case 95:
               var10000 = 148;
               break;
            case 96:
               var10000 = 193;
               break;
            case 97:
               var10000 = 166;
               break;
            case 98:
               var10000 = 44;
               break;
            case 99:
               var10000 = 23;
               break;
            case 100:
               var10000 = 75;
               break;
            case 101:
               var10000 = 124;
               break;
            case 102:
               var10000 = 134;
               break;
            case 103:
               var10000 = 150;
               break;
            case 104:
               var10000 = 88;
               break;
            case 105:
               var10000 = 128;
               break;
            case 106:
               var10000 = 247;
               break;
            case 107:
               var10000 = 20;
               break;
            case 108:
               var10000 = 19;
               break;
            case 109:
               var10000 = 173;
               break;
            case 110:
               var10000 = 226;
               break;
            case 111:
               var10000 = 61;
               break;
            case 112:
               var10000 = 233;
               break;
            case 113:
               var10000 = 164;
               break;
            case 114:
               var10000 = 51;
               break;
            case 115:
               var10000 = 74;
               break;
            case 116:
               var10000 = 190;
               break;
            case 117:
               var10000 = 56;
               break;
            case 118:
               var10000 = 176;
               break;
            case 119:
               var10000 = 161;
               break;
            case 120:
               var10000 = 79;
               break;
            case 121:
               var10000 = 220;
               break;
            case 122:
               var10000 = 59;
               break;
            case 123:
               var10000 = 133;
               break;
            case 124:
               var10000 = 27;
               break;
            case 125:
               var10000 = 26;
               break;
            case 126:
               var10000 = 136;
               break;
            case 127:
               var10000 = 254;
               break;
            case 128:
               var10000 = 117;
               break;
            case 129:
               var10000 = 113;
               break;
            case 130:
               var10000 = 72;
               break;
            case 131:
               var10000 = 98;
               break;
            case 132:
               var10000 = 71;
               break;
            case 133:
               var10000 = 171;
               break;
            case 134:
               var10000 = 115;
               break;
            case 135:
               var10000 = 183;
               break;
            case 136:
               var10000 = 235;
               break;
            case 137:
               var10000 = 178;
               break;
            case 138:
               var10000 = 132;
               break;
            case 139:
               var10000 = 30;
               break;
            case 140:
               var10000 = 81;
               break;
            case 141:
               var10000 = 196;
               break;
            case 142:
               var10000 = 210;
               break;
            case 143:
               var10000 = 198;
               break;
            case 144:
               var10000 = 223;
               break;
            case 145:
               var10000 = 231;
               break;
            case 146:
               var10000 = 248;
               break;
            case 147:
               var10000 = 154;
               break;
            case 148:
               var10000 = 70;
               break;
            case 149:
               var10000 = 35;
               break;
            case 150:
               var10000 = 102;
               break;
            case 151:
               var10000 = 82;
               break;
            case 152:
               var10000 = 17;
               break;
            case 153:
               var10000 = 34;
               break;
            case 154:
               var10000 = 66;
               break;
            case 155:
               var10000 = 1;
               break;
            case 156:
               var10000 = 168;
               break;
            case 157:
               var10000 = 182;
               break;
            case 158:
               var10000 = 103;
               break;
            case 159:
               var10000 = 207;
               break;
            case 160:
               var10000 = 15;
               break;
            case 161:
               var10000 = 85;
               break;
            case 162:
               var10000 = 111;
               break;
            case 163:
               var10000 = 204;
               break;
            case 164:
               var10000 = 211;
               break;
            case 165:
               var10000 = 62;
               break;
            case 166:
               var10000 = 191;
               break;
            case 167:
               var10000 = 97;
               break;
            case 168:
               var10000 = 215;
               break;
            case 169:
               var10000 = 123;
               break;
            case 170:
               var10000 = 167;
               break;
            case 171:
               var10000 = 131;
               break;
            case 172:
               var10000 = 52;
               break;
            case 173:
               var10000 = 106;
               break;
            case 174:
               var10000 = 142;
               break;
            case 175:
               var10000 = 99;
               break;
            case 176:
               var10000 = 63;
               break;
            case 177:
               var10000 = 156;
               break;
            case 178:
               var10000 = 40;
               break;
            case 179:
               var10000 = 195;
               break;
            case 180:
               var10000 = 144;
               break;
            case 181:
               var10000 = 213;
               break;
            case 182:
               var10000 = 216;
               break;
            case 183:
               var10000 = 157;
               break;
            case 184:
               var10000 = 186;
               break;
            case 185:
               var10000 = 237;
               break;
            case 186:
               var10000 = 137;
               break;
            case 187:
               var10000 = 120;
               break;
            case 188:
               var10000 = 197;
               break;
            case 189:
               var10000 = 60;
               break;
            case 190:
               var10000 = 45;
               break;
            case 191:
               var10000 = 33;
               break;
            case 192:
               var10000 = 212;
               break;
            case 193:
               var10000 = 46;
               break;
            case 194:
               var10000 = 187;
               break;
            case 195:
               var10000 = 80;
               break;
            case 196:
               var10000 = 147;
               break;
            case 197:
               var10000 = 108;
               break;
            case 198:
               var10000 = 104;
               break;
            case 199:
               var10000 = 170;
               break;
            case 200:
               var10000 = 58;
               break;
            case 201:
               var10000 = 194;
               break;
            case 202:
               var10000 = 126;
               break;
            case 203:
               var10000 = 141;
               break;
            case 204:
               var10000 = 11;
               break;
            case 205:
               var10000 = 0;
               break;
            case 206:
               var10000 = 152;
               break;
            case 207:
               var10000 = 105;
               break;
            case 208:
               var10000 = 50;
               break;
            case 209:
               var10000 = 67;
               break;
            case 210:
               var10000 = 249;
               break;
            case 211:
               var10000 = 230;
               break;
            case 212:
               var10000 = 4;
               break;
            case 213:
               var10000 = 69;
               break;
            case 214:
               var10000 = 87;
               break;
            case 215:
               var10000 = 101;
               break;
            case 216:
               var10000 = 180;
               break;
            case 217:
               var10000 = 163;
               break;
            case 218:
               var10000 = 31;
               break;
            case 219:
               var10000 = 12;
               break;
            case 220:
               var10000 = 55;
               break;
            case 221:
               var10000 = 107;
               break;
            case 222:
               var10000 = 121;
               break;
            case 223:
               var10000 = 209;
               break;
            case 224:
               var10000 = 217;
               break;
            case 225:
               var10000 = 94;
               break;
            case 226:
               var10000 = 221;
               break;
            case 227:
               var10000 = 14;
               break;
            case 228:
               var10000 = 130;
               break;
            case 229:
               var10000 = 160;
               break;
            case 230:
               var10000 = 92;
               break;
            case 231:
               var10000 = 116;
               break;
            case 232:
               var10000 = 129;
               break;
            case 233:
               var10000 = 169;
               break;
            case 234:
               var10000 = 3;
               break;
            case 235:
               var10000 = 78;
               break;
            case 236:
               var10000 = 41;
               break;
            case 237:
               var10000 = 200;
               break;
            case 238:
               var10000 = 84;
               break;
            case 239:
               var10000 = 243;
               break;
            case 240:
               var10000 = 118;
               break;
            case 241:
               var10000 = 208;
               break;
            case 242:
               var10000 = 28;
               break;
            case 243:
               var10000 = 159;
               break;
            case 244:
               var10000 = 214;
               break;
            case 245:
               var10000 = 246;
               break;
            case 246:
               var10000 = 138;
               break;
            case 247:
               var10000 = 65;
               break;
            case 248:
               var10000 = 162;
               break;
            case 249:
               var10000 = 100;
               break;
            case 250:
               var10000 = 165;
               break;
            case 251:
               var10000 = 13;
               break;
            case 252:
               var10000 = 109;
               break;
            case 253:
               var10000 = 149;
               break;
            case 254:
               var10000 = 122;
               break;
            default:
               var10000 = 255;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "¬\b~6@\u0081NIä%ø\u0007k8@¦\u0088\u0002Ù¶,F?à\u001e\u009f\u008d\nÐY\u001778¨÷DÎÊ\u0080G·[2Ge\\»:ãTÆÖl\\ Ø\u008bí_«Gy\u009b\u0018Ü";
      int var4 = "¬\b~6@\u0081NIä%ø\u0007k8@¦\u0088\u0002Ù¶,F?à\u001e\u009f\u008d\nÐY\u001778¨÷DÎÊ\u0080G·[2Ge\\»:ãTÆÖl\\ Ø\u008bí_«Gy\u009b\u0018Ü".length();
      char var1 = 20;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 67;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var20;
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
                        var46 = 13;
                        break;
                     case 1:
                        var46 = 80;
                        break;
                     case 2:
                        var46 = 14;
                        break;
                     case 3:
                        var46 = 124;
                        break;
                     case 4:
                        var46 = 60;
                        break;
                     case 5:
                        var46 = 68;
                        break;
                     default:
                        var46 = 112;
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
                     b = var5;
                     c = new String[4];
                     E = LoggerFactory.getLogger(Im4.class);
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

                  var2 = "\u001b\u0085¶\u0013Ò4x,\u0002fRhL¶ã¼QUÆf9]~";
                  var4 = "\u001b\u0085¶\u0013Ò4x,\u0002fRhL¶ã¼QUÆf9]~".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 112;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





