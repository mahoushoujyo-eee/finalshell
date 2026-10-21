package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.SwingConstants;

public class Tz2_2 extends T4 implements SwingConstants {
   public static List T;
   public static List H;
   public final Map Q = new HashMap();
   public int w = 0;
   public int K = 0;
   public boolean Y = false;
   public boolean Z = false;
   public static String[] a;
   public static String[] b;

   public int u() {
      return this.w;
   }

   public void p(int var1) {
      this.w = var1;
   }

   public int n() {
      return this.K;
   }

   public void a(int var1) {
      this.K = var1;
   }

   public boolean t() {
      return this.Y;
   }

   public void Y(boolean var1) {
      this.Y = var1;
   }

   public boolean b() {
      return this.Z;
   }

   public void x(boolean var1) {
      this.Z = var1;
   }

   @Override
   public void A(Component param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/T4.O ()I
      // 03: aload 2
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: istore 3
      // 0a: aload 4
      // 0c: iload 3
      // 0d: ifne a7
      // 10: ifnull 97
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 4
      // 1c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1f: iload 3
      // 20: ifne a7
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: ldc ""
      // 2c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f: ifne 97
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 0
      // 3a: aload 4
      // 3c: invokevirtual com/finalshell/core/Tz2_2.u (Ljava/lang/String;)I
      // 3f: istore 5
      // 41: getstatic com/finalshell/core/Tz2_2.T Ljava/util/List;
      // 44: iload 5
      // 46: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 49: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 4e: iload 3
      // 4f: ifne 6d
      // 52: ifne 67
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 0
      // 5d: invokevirtual com/finalshell/core/Tz2_2.R ()V
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 0
      // 68: aload 4
      // 6a: invokevirtual com/finalshell/core/Tz2_2.c (Ljava/lang/String;)I
      // 6d: istore 6
      // 6f: getstatic com/finalshell/core/Tz2_2.H Ljava/util/List;
      // 72: iload 6
      // 74: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 77: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 7c: ifne 8a
      // 7f: aload 0
      // 80: invokevirtual com/finalshell/core/Tz2_2.R ()V
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: goto a9
      // 8d: astore 5
      // 8f: aload 0
      // 90: invokevirtual com/finalshell/core/Tz2_2.R ()V
      // 93: iload 3
      // 94: ifeq a9
      // 97: sipush 19251
      // 9a: sipush -23407
      // 9d: invokestatic com/finalshell/core/Tz2_2.a (II)Ljava/lang/String;
      // a0: goto a7
      // a3: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: astore 4
      // a9: aload 0
      // aa: getfield com/finalshell/core/Tz2_2.Q Ljava/util/Map;
      // ad: aload 1
      // ae: aload 4
      // b0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b5: pop
      // b6: return
   }

   public void R() {
      throw new IllegalArgumentException(a(19250, -11561));
   }

   public int u(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/T4.O ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 26
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 29
      // 17: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 1
      // 1c: bipush 0
      // 1d: aload 1
      // 1e: ldc ","
      // 20: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 23: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 26: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 29: ireturn
   }

   public int c(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/T4.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 2b
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 2e
      // 17: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 1
      // 1d: ldc ","
      // 1f: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 22: ldc ","
      // 24: invokevirtual java/lang/String.length ()I
      // 27: iadd
      // 28: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2b: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 2e: ireturn
   }

   @Override
   public void F(Component var1) {
      this.Q.remove(var1);
   }

   @Override
   public Dimension preferredLayoutSize(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/T4.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual java/awt/Container.getComponentCount ()I
      // 008: bipush 1
      // 009: iload 2
      // 00a: ifeq 2a9
      // 00d: if_icmple 292
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: new java/util/HashMap
      // 01a: dup
      // 01b: invokespecial java/util/HashMap.<init> ()V
      // 01e: astore 4
      // 020: new java/util/HashMap
      // 023: dup
      // 024: invokespecial java/util/HashMap.<init> ()V
      // 027: astore 5
      // 029: getstatic com/finalshell/core/Tz2_2.T Ljava/util/List;
      // 02c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 031: astore 6
      // 033: aload 6
      // 035: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03a: ifeq 171
      // 03d: aload 6
      // 03f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 044: checkcast java/lang/Integer
      // 047: invokevirtual java/lang/Integer.intValue ()I
      // 04a: istore 7
      // 04c: getstatic com/finalshell/core/Tz2_2.H Ljava/util/List;
      // 04f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 054: astore 8
      // 056: aload 8
      // 058: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05d: ifeq 16d
      // 060: aload 8
      // 062: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 067: checkcast java/lang/Integer
      // 06a: invokevirtual java/lang/Integer.intValue ()I
      // 06d: istore 9
      // 06f: aload 0
      // 070: aload 1
      // 071: iload 7
      // 073: iload 9
      // 075: invokevirtual com/finalshell/core/Tz2_2.S (Ljava/awt/Container;II)Ljava/awt/Dimension;
      // 078: astore 10
      // 07a: aload 10
      // 07c: iload 2
      // 07d: ifeq 17a
      // 080: ifnull 169
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: aload 0
      // 08b: getfield com/finalshell/core/Tz2_2.Y Z
      // 08e: iload 2
      // 08f: ifeq 101
      // 092: goto 099
      // 095: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: ifne 0fd
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 4
      // 0a5: iload 7
      // 0a7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0aa: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0af: iload 2
      // 0b0: ifeq 0dd
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: ifeq 0e0
      // 0bd: goto 0c4
      // 0c0: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: aload 4
      // 0c6: iload 7
      // 0c8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0cb: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d0: checkcast java/lang/Integer
      // 0d3: invokevirtual java/lang/Integer.intValue ()I
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: goto 0e1
      // 0e0: bipush 0
      // 0e1: istore 11
      // 0e3: aload 4
      // 0e5: iload 7
      // 0e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ea: iload 11
      // 0ec: aload 10
      // 0ee: getfield java/awt/Dimension.width I
      // 0f1: invokestatic java/lang/Math.max (II)I
      // 0f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0fc: pop
      // 0fd: aload 0
      // 0fe: getfield com/finalshell/core/Tz2_2.Z Z
      // 101: iload 2
      // 102: ifeq 122
      // 105: ifne 169
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10e: athrow
      // 10f: aload 4
      // 111: iload 9
      // 113: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 116: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: iload 2
      // 123: ifeq 149
      // 126: ifeq 14c
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 4
      // 132: iload 9
      // 134: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 137: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 13c: checkcast java/lang/Integer
      // 13f: invokevirtual java/lang/Integer.intValue ()I
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 148: athrow
      // 149: goto 14d
      // 14c: bipush 0
      // 14d: istore 11
      // 14f: aload 5
      // 151: iload 9
      // 153: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 156: iload 11
      // 158: aload 10
      // 15a: getfield java/awt/Dimension.height I
      // 15d: invokestatic java/lang/Math.max (II)I
      // 160: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 163: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 168: pop
      // 169: iload 2
      // 16a: ifne 056
      // 16d: iload 2
      // 16e: ifne 033
      // 171: new java/awt/Dimension
      // 174: dup
      // 175: bipush 0
      // 176: bipush 0
      // 177: invokespecial java/awt/Dimension.<init> (II)V
      // 17a: astore 3
      // 17b: iload 2
      // 17c: ifeq 19f
      // 17f: aload 0
      // 180: getfield com/finalshell/core/Tz2_2.Y Z
      // 183: ifeq 1a3
      // 186: goto 18d
      // 189: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18c: athrow
      // 18d: aload 3
      // 18e: aload 1
      // 18f: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 192: invokestatic com/finalshell/core/FN.f ([Ljava/awt/Component;)I
      // 195: putfield java/awt/Dimension.width I
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: iload 2
      // 1a0: ifne 20a
      // 1a3: aload 4
      // 1a5: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 1aa: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1af: astore 6
      // 1b1: aload 6
      // 1b3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b8: ifeq 20a
      // 1bb: aload 6
      // 1bd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c2: checkcast java/lang/Integer
      // 1c5: astore 7
      // 1c7: aload 3
      // 1c8: dup
      // 1c9: getfield java/awt/Dimension.width I
      // 1cc: aload 3
      // 1cd: getfield java/awt/Dimension.width I
      // 1d0: iload 2
      // 1d1: ifeq 25f
      // 1d4: iload 2
      // 1d5: ifeq 1fa
      // 1d8: goto 1df
      // 1db: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1de: athrow
      // 1df: ifle 1fd
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: getfield com/finalshell/core/Tz2_2.w I
      // 1ed: aload 7
      // 1ef: invokevirtual java/lang/Integer.intValue ()I
      // 1f2: iadd
      // 1f3: goto 1fa
      // 1f6: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f9: athrow
      // 1fa: goto 202
      // 1fd: aload 7
      // 1ff: invokevirtual java/lang/Integer.intValue ()I
      // 202: iadd
      // 203: putfield java/awt/Dimension.width I
      // 206: iload 2
      // 207: ifne 1b1
      // 20a: aload 0
      // 20b: getfield com/finalshell/core/Tz2_2.Z Z
      // 20e: ifeq 227
      // 211: aload 3
      // 212: aload 1
      // 213: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 216: invokestatic com/finalshell/core/FN.T ([Ljava/awt/Component;)I
      // 219: putfield java/awt/Dimension.height I
      // 21c: iload 2
      // 21d: ifne 28e
      // 220: goto 227
      // 223: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 226: athrow
      // 227: aload 5
      // 229: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 22e: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 233: astore 6
      // 235: aload 6
      // 237: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 23c: ifeq 28e
      // 23f: aload 6
      // 241: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 246: checkcast java/lang/Integer
      // 249: astore 7
      // 24b: iload 2
      // 24c: ifeq 2ca
      // 24f: aload 3
      // 250: dup
      // 251: getfield java/awt/Dimension.height I
      // 254: aload 3
      // 255: getfield java/awt/Dimension.height I
      // 258: goto 25f
      // 25b: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25e: athrow
      // 25f: iload 2
      // 260: ifeq 27e
      // 263: ifle 281
      // 266: goto 26d
      // 269: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26c: athrow
      // 26d: aload 0
      // 26e: getfield com/finalshell/core/Tz2_2.K I
      // 271: aload 7
      // 273: invokevirtual java/lang/Integer.intValue ()I
      // 276: iadd
      // 277: goto 27e
      // 27a: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27d: athrow
      // 27e: goto 286
      // 281: aload 7
      // 283: invokevirtual java/lang/Integer.intValue ()I
      // 286: iadd
      // 287: putfield java/awt/Dimension.height I
      // 28a: iload 2
      // 28b: ifne 235
      // 28e: iload 2
      // 28f: ifne 2ca
      // 292: aload 1
      // 293: iload 2
      // 294: ifeq 2b8
      // 297: goto 29e
      // 29a: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: invokevirtual java/awt/Container.getComponentCount ()I
      // 2a1: bipush 1
      // 2a2: goto 2a9
      // 2a5: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a8: athrow
      // 2a9: if_icmpne 2c0
      // 2ac: aload 1
      // 2ad: bipush 0
      // 2ae: invokevirtual java/awt/Container.getComponent (I)Ljava/awt/Component;
      // 2b1: goto 2b8
      // 2b4: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b7: athrow
      // 2b8: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 2bb: astore 3
      // 2bc: iload 2
      // 2bd: ifne 2ca
      // 2c0: new java/awt/Dimension
      // 2c3: dup
      // 2c4: bipush 0
      // 2c5: bipush 0
      // 2c6: invokespecial java/awt/Dimension.<init> (II)V
      // 2c9: astore 3
      // 2ca: aload 1
      // 2cb: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 2ce: astore 4
      // 2d0: aload 3
      // 2d1: dup
      // 2d2: getfield java/awt/Dimension.width I
      // 2d5: aload 4
      // 2d7: getfield java/awt/Insets.left I
      // 2da: aload 4
      // 2dc: getfield java/awt/Insets.right I
      // 2df: iadd
      // 2e0: iadd
      // 2e1: putfield java/awt/Dimension.width I
      // 2e4: aload 3
      // 2e5: dup
      // 2e6: getfield java/awt/Dimension.height I
      // 2e9: aload 4
      // 2eb: getfield java/awt/Insets.top I
      // 2ee: aload 4
      // 2f0: getfield java/awt/Insets.bottom I
      // 2f3: iadd
      // 2f4: iadd
      // 2f5: putfield java/awt/Dimension.height I
      // 2f8: aload 3
      // 2f9: areturn
   }

   public Dimension S(Container param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/T4.O ()I
      // 03: new java/awt/Dimension
      // 06: dup
      // 07: bipush 0
      // 08: bipush 0
      // 09: invokespecial java/awt/Dimension.<init> (II)V
      // 0c: astore 5
      // 0e: aload 1
      // 0f: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 12: astore 6
      // 14: istore 4
      // 16: aload 6
      // 18: arraylength
      // 19: istore 7
      // 1b: bipush 0
      // 1c: istore 8
      // 1e: iload 8
      // 20: iload 7
      // 22: if_icmpge 83
      // 25: aload 6
      // 27: iload 8
      // 29: aaload
      // 2a: astore 9
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/Tz2_2.Q Ljava/util/Map;
      // 30: aload 9
      // 32: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 37: checkcast java/lang/String
      // 3a: astore 10
      // 3c: iload 4
      // 3e: ifne 7e
      // 41: aload 0
      // 42: aload 10
      // 44: invokevirtual com/finalshell/core/Tz2_2.u (Ljava/lang/String;)I
      // 47: iload 4
      // 49: ifne 94
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: iload 2
      // 54: if_icmpne 7b
      // 57: goto 5e
      // 5a: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 10
      // 61: invokevirtual com/finalshell/core/Tz2_2.c (Ljava/lang/String;)I
      // 64: iload 3
      // 65: if_icmpne 7b
      // 68: goto 6f
      // 6b: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: aload 5
      // 71: aload 9
      // 73: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 76: invokestatic com/finalshell/core/FN.h (Ljava/awt/Dimension;Ljava/awt/Dimension;)Ljava/awt/Dimension;
      // 79: astore 5
      // 7b: iinc 8 1
      // 7e: iload 4
      // 80: ifeq 1e
      // 83: aload 5
      // 85: iload 4
      // 87: ifne bb
      // 8a: getfield java/awt/Dimension.width I
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: ifgt b2
      // 97: aload 5
      // 99: iload 4
      // 9b: ifne bb
      // 9e: goto a5
      // a1: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a4: athrow
      // a5: getfield java/awt/Dimension.height I
      // a8: ifle be
      // ab: goto b2
      // ae: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: aload 5
      // b4: goto bb
      // b7: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ba: athrow
      // bb: goto bf
      // be: aconst_null
      // bf: areturn
   }

   @Override
   public void layoutContainer(Container param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/T4.b ()I
      // 003: aload 1
      // 004: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 007: astore 3
      // 008: aload 1
      // 009: invokevirtual java/awt/Container.getWidth ()I
      // 00c: aload 3
      // 00d: getfield java/awt/Insets.left I
      // 010: isub
      // 011: aload 3
      // 012: getfield java/awt/Insets.right I
      // 015: isub
      // 016: istore 4
      // 018: aload 1
      // 019: invokevirtual java/awt/Container.getHeight ()I
      // 01c: aload 3
      // 01d: getfield java/awt/Insets.top I
      // 020: isub
      // 021: aload 3
      // 022: getfield java/awt/Insets.bottom I
      // 025: isub
      // 026: istore 5
      // 028: aload 1
      // 029: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 02c: astore 6
      // 02e: aload 6
      // 030: arraylength
      // 031: istore 7
      // 033: istore 2
      // 034: bipush 0
      // 035: istore 8
      // 037: iload 8
      // 039: iload 7
      // 03b: if_icmpge 1ba
      // 03e: aload 6
      // 040: iload 8
      // 042: aaload
      // 043: astore 9
      // 045: aload 0
      // 046: getfield com/finalshell/core/Tz2_2.Q Ljava/util/Map;
      // 049: aload 9
      // 04b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 050: checkcast java/lang/String
      // 053: astore 10
      // 055: aload 0
      // 056: aload 10
      // 058: invokevirtual com/finalshell/core/Tz2_2.u (Ljava/lang/String;)I
      // 05b: istore 11
      // 05d: aload 0
      // 05e: aload 10
      // 060: invokevirtual com/finalshell/core/Tz2_2.c (Ljava/lang/String;)I
      // 063: istore 12
      // 065: aload 9
      // 067: invokevirtual java/awt/Component.getPreferredSize ()Ljava/awt/Dimension;
      // 06a: astore 13
      // 06c: bipush 0
      // 06d: istore 14
      // 06f: aload 0
      // 070: getfield com/finalshell/core/Tz2_2.Y Z
      // 073: iload 2
      // 074: ifeq 094
      // 077: ifeq 08b
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: aload 3
      // 082: getfield java/awt/Insets.left I
      // 085: istore 14
      // 087: iload 2
      // 088: ifne 0ef
      // 08b: iload 11
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: iload 2
      // 095: ifeq 0f0
      // 098: tableswitch 87 0 4 50 87 40 87 70
      // 0bc: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: aload 3
      // 0c1: getfield java/awt/Insets.left I
      // 0c4: istore 14
      // 0c6: iload 2
      // 0c7: ifne 0ef
      // 0ca: aload 1
      // 0cb: invokevirtual java/awt/Container.getWidth ()I
      // 0ce: bipush 2
      // 0cf: idiv
      // 0d0: aload 13
      // 0d2: getfield java/awt/Dimension.width I
      // 0d5: bipush 2
      // 0d6: idiv
      // 0d7: isub
      // 0d8: istore 14
      // 0da: iload 2
      // 0db: ifne 0ef
      // 0de: aload 1
      // 0df: invokevirtual java/awt/Container.getWidth ()I
      // 0e2: aload 13
      // 0e4: getfield java/awt/Dimension.width I
      // 0e7: isub
      // 0e8: aload 3
      // 0e9: getfield java/awt/Insets.right I
      // 0ec: isub
      // 0ed: istore 14
      // 0ef: bipush 0
      // 0f0: istore 15
      // 0f2: aload 0
      // 0f3: getfield com/finalshell/core/Tz2_2.Z Z
      // 0f6: iload 2
      // 0f7: ifeq 117
      // 0fa: ifeq 10e
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 3
      // 105: getfield java/awt/Insets.top I
      // 108: istore 15
      // 10a: iload 2
      // 10b: ifne 172
      // 10e: iload 12
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: iload 2
      // 118: ifeq 147
      // 11b: tableswitch 87 0 3 50 33 87 70
      // 138: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: aload 3
      // 13d: getfield java/awt/Insets.top I
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: istore 15
      // 149: iload 2
      // 14a: ifne 172
      // 14d: aload 1
      // 14e: invokevirtual java/awt/Container.getHeight ()I
      // 151: bipush 2
      // 152: idiv
      // 153: aload 13
      // 155: getfield java/awt/Dimension.height I
      // 158: bipush 2
      // 159: idiv
      // 15a: isub
      // 15b: istore 15
      // 15d: iload 2
      // 15e: ifne 172
      // 161: aload 1
      // 162: invokevirtual java/awt/Container.getHeight ()I
      // 165: aload 13
      // 167: getfield java/awt/Dimension.height I
      // 16a: isub
      // 16b: aload 3
      // 16c: getfield java/awt/Insets.bottom I
      // 16f: isub
      // 170: istore 15
      // 172: aload 9
      // 174: iload 14
      // 176: iload 15
      // 178: aload 0
      // 179: getfield com/finalshell/core/Tz2_2.Y Z
      // 17c: iload 2
      // 17d: ifeq 18c
      // 180: ifeq 18f
      // 183: goto 18a
      // 186: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 189: athrow
      // 18a: iload 4
      // 18c: goto 194
      // 18f: aload 13
      // 191: getfield java/awt/Dimension.width I
      // 194: aload 0
      // 195: getfield com/finalshell/core/Tz2_2.Z Z
      // 198: iload 2
      // 199: ifeq 1a8
      // 19c: ifeq 1ab
      // 19f: goto 1a6
      // 1a2: invokestatic com/finalshell/core/Tz2_2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: iload 5
      // 1a8: goto 1b0
      // 1ab: aload 13
      // 1ad: getfield java/awt/Dimension.height I
      // 1b0: invokevirtual java/awt/Component.setBounds (IIII)V
      // 1b3: iinc 8 1
      // 1b6: iload 2
      // 1b7: ifne 037
      // 1ba: return
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 19250) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 243;
               break;
            case 1:
               var10000 = 173;
               break;
            case 2:
               var10000 = 100;
               break;
            case 3:
               var10000 = 236;
               break;
            case 4:
               var10000 = 139;
               break;
            case 5:
               var10000 = 187;
               break;
            case 6:
               var10000 = 238;
               break;
            case 7:
               var10000 = 253;
               break;
            case 8:
               var10000 = 17;
               break;
            case 9:
               var10000 = 251;
               break;
            case 10:
               var10000 = 207;
               break;
            case 11:
               var10000 = 170;
               break;
            case 12:
               var10000 = 115;
               break;
            case 13:
               var10000 = 172;
               break;
            case 14:
               var10000 = 62;
               break;
            case 15:
               var10000 = 160;
               break;
            case 16:
               var10000 = 71;
               break;
            case 17:
               var10000 = 25;
               break;
            case 18:
               var10000 = 196;
               break;
            case 19:
               var10000 = 19;
               break;
            case 20:
               var10000 = 93;
               break;
            case 21:
               var10000 = 119;
               break;
            case 22:
               var10000 = 248;
               break;
            case 23:
               var10000 = 188;
               break;
            case 24:
               var10000 = 74;
               break;
            case 25:
               var10000 = 225;
               break;
            case 26:
               var10000 = 209;
               break;
            case 27:
               var10000 = 31;
               break;
            case 28:
               var10000 = 234;
               break;
            case 29:
               var10000 = 28;
               break;
            case 30:
               var10000 = 45;
               break;
            case 31:
               var10000 = 208;
               break;
            case 32:
               var10000 = 233;
               break;
            case 33:
               var10000 = 86;
               break;
            case 34:
               var10000 = 126;
               break;
            case 35:
               var10000 = 175;
               break;
            case 36:
               var10000 = 35;
               break;
            case 37:
               var10000 = 138;
               break;
            case 38:
               var10000 = 193;
               break;
            case 39:
               var10000 = 53;
               break;
            case 40:
               var10000 = 227;
               break;
            case 41:
               var10000 = 101;
               break;
            case 42:
               var10000 = 13;
               break;
            case 43:
               var10000 = 222;
               break;
            case 44:
               var10000 = 5;
               break;
            case 45:
               var10000 = 18;
               break;
            case 46:
               var10000 = 199;
               break;
            case 47:
               var10000 = 228;
               break;
            case 48:
               var10000 = 216;
               break;
            case 49:
               var10000 = 12;
               break;
            case 50:
               var10000 = 89;
               break;
            case 51:
               var10000 = 137;
               break;
            case 52:
               var10000 = 179;
               break;
            case 53:
               var10000 = 73;
               break;
            case 54:
               var10000 = 168;
               break;
            case 55:
               var10000 = 49;
               break;
            case 56:
               var10000 = 102;
               break;
            case 57:
               var10000 = 15;
               break;
            case 58:
               var10000 = 51;
               break;
            case 59:
               var10000 = 223;
               break;
            case 60:
               var10000 = 57;
               break;
            case 61:
               var10000 = 224;
               break;
            case 62:
               var10000 = 61;
               break;
            case 63:
               var10000 = 92;
               break;
            case 64:
               var10000 = 162;
               break;
            case 65:
               var10000 = 26;
               break;
            case 66:
               var10000 = 182;
               break;
            case 67:
               var10000 = 127;
               break;
            case 68:
               var10000 = 151;
               break;
            case 69:
               var10000 = 63;
               break;
            case 70:
               var10000 = 149;
               break;
            case 71:
               var10000 = 78;
               break;
            case 72:
               var10000 = 64;
               break;
            case 73:
               var10000 = 85;
               break;
            case 74:
               var10000 = 165;
               break;
            case 75:
               var10000 = 52;
               break;
            case 76:
               var10000 = 177;
               break;
            case 77:
               var10000 = 191;
               break;
            case 78:
               var10000 = 197;
               break;
            case 79:
               var10000 = 84;
               break;
            case 80:
               var10000 = 143;
               break;
            case 81:
               var10000 = 109;
               break;
            case 82:
               var10000 = 32;
               break;
            case 83:
               var10000 = 27;
               break;
            case 84:
               var10000 = 106;
               break;
            case 85:
               var10000 = 217;
               break;
            case 86:
               var10000 = 87;
               break;
            case 87:
               var10000 = 94;
               break;
            case 88:
               var10000 = 90;
               break;
            case 89:
               var10000 = 178;
               break;
            case 90:
               var10000 = 9;
               break;
            case 91:
               var10000 = 81;
               break;
            case 92:
               var10000 = 11;
               break;
            case 93:
               var10000 = 72;
               break;
            case 94:
               var10000 = 99;
               break;
            case 95:
               var10000 = 198;
               break;
            case 96:
               var10000 = 136;
               break;
            case 97:
               var10000 = 47;
               break;
            case 98:
               var10000 = 2;
               break;
            case 99:
               var10000 = 22;
               break;
            case 100:
               var10000 = 212;
               break;
            case 101:
               var10000 = 105;
               break;
            case 102:
               var10000 = 4;
               break;
            case 103:
               var10000 = 147;
               break;
            case 104:
               var10000 = 46;
               break;
            case 105:
               var10000 = 135;
               break;
            case 106:
               var10000 = 250;
               break;
            case 107:
               var10000 = 226;
               break;
            case 108:
               var10000 = 20;
               break;
            case 109:
               var10000 = 14;
               break;
            case 110:
               var10000 = 55;
               break;
            case 111:
               var10000 = 98;
               break;
            case 112:
               var10000 = 219;
               break;
            case 113:
               var10000 = 60;
               break;
            case 114:
               var10000 = 190;
               break;
            case 115:
               var10000 = 205;
               break;
            case 116:
               var10000 = 218;
               break;
            case 117:
               var10000 = 108;
               break;
            case 118:
               var10000 = 116;
               break;
            case 119:
               var10000 = 112;
               break;
            case 120:
               var10000 = 189;
               break;
            case 121:
               var10000 = 124;
               break;
            case 122:
               var10000 = 247;
               break;
            case 123:
               var10000 = 194;
               break;
            case 124:
               var10000 = 36;
               break;
            case 125:
               var10000 = 150;
               break;
            case 126:
               var10000 = 254;
               break;
            case 127:
               var10000 = 186;
               break;
            case 128:
               var10000 = 231;
               break;
            case 129:
               var10000 = 155;
               break;
            case 130:
               var10000 = 220;
               break;
            case 131:
               var10000 = 122;
               break;
            case 132:
               var10000 = 10;
               break;
            case 133:
               var10000 = 244;
               break;
            case 134:
               var10000 = 50;
               break;
            case 135:
               var10000 = 110;
               break;
            case 136:
               var10000 = 158;
               break;
            case 137:
               var10000 = 181;
               break;
            case 138:
               var10000 = 176;
               break;
            case 139:
               var10000 = 82;
               break;
            case 140:
               var10000 = 163;
               break;
            case 141:
               var10000 = 21;
               break;
            case 142:
               var10000 = 166;
               break;
            case 143:
               var10000 = 120;
               break;
            case 144:
               var10000 = 211;
               break;
            case 145:
               var10000 = 245;
               break;
            case 146:
               var10000 = 229;
               break;
            case 147:
               var10000 = 255;
               break;
            case 148:
               var10000 = 157;
               break;
            case 149:
               var10000 = 29;
               break;
            case 150:
               var10000 = 129;
               break;
            case 151:
               var10000 = 41;
               break;
            case 152:
               var10000 = 192;
               break;
            case 153:
               var10000 = 204;
               break;
            case 154:
               var10000 = 239;
               break;
            case 155:
               var10000 = 125;
               break;
            case 156:
               var10000 = 3;
               break;
            case 157:
               var10000 = 249;
               break;
            case 158:
               var10000 = 134;
               break;
            case 159:
               var10000 = 140;
               break;
            case 160:
               var10000 = 79;
               break;
            case 161:
               var10000 = 43;
               break;
            case 162:
               var10000 = 111;
               break;
            case 163:
               var10000 = 30;
               break;
            case 164:
               var10000 = 24;
               break;
            case 165:
               var10000 = 67;
               break;
            case 166:
               var10000 = 34;
               break;
            case 167:
               var10000 = 213;
               break;
            case 168:
               var10000 = 107;
               break;
            case 169:
               var10000 = 141;
               break;
            case 170:
               var10000 = 123;
               break;
            case 171:
               var10000 = 184;
               break;
            case 172:
               var10000 = 167;
               break;
            case 173:
               var10000 = 159;
               break;
            case 174:
               var10000 = 146;
               break;
            case 175:
               var10000 = 235;
               break;
            case 176:
               var10000 = 23;
               break;
            case 177:
               var10000 = 8;
               break;
            case 178:
               var10000 = 246;
               break;
            case 179:
               var10000 = 37;
               break;
            case 180:
               var10000 = 171;
               break;
            case 181:
               var10000 = 232;
               break;
            case 182:
               var10000 = 130;
               break;
            case 183:
               var10000 = 156;
               break;
            case 184:
               var10000 = 161;
               break;
            case 185:
               var10000 = 169;
               break;
            case 186:
               var10000 = 65;
               break;
            case 187:
               var10000 = 174;
               break;
            case 188:
               var10000 = 54;
               break;
            case 189:
               var10000 = 97;
               break;
            case 190:
               var10000 = 240;
               break;
            case 191:
               var10000 = 230;
               break;
            case 192:
               var10000 = 154;
               break;
            case 193:
               var10000 = 131;
               break;
            case 194:
               var10000 = 80;
               break;
            case 195:
               var10000 = 153;
               break;
            case 196:
               var10000 = 38;
               break;
            case 197:
               var10000 = 210;
               break;
            case 198:
               var10000 = 69;
               break;
            case 199:
               var10000 = 180;
               break;
            case 200:
               var10000 = 96;
               break;
            case 201:
               var10000 = 152;
               break;
            case 202:
               var10000 = 164;
               break;
            case 203:
               var10000 = 58;
               break;
            case 204:
               var10000 = 114;
               break;
            case 205:
               var10000 = 148;
               break;
            case 206:
               var10000 = 201;
               break;
            case 207:
               var10000 = 88;
               break;
            case 208:
               var10000 = 142;
               break;
            case 209:
               var10000 = 77;
               break;
            case 210:
               var10000 = 215;
               break;
            case 211:
               var10000 = 206;
               break;
            case 212:
               var10000 = 91;
               break;
            case 213:
               var10000 = 237;
               break;
            case 214:
               var10000 = 6;
               break;
            case 215:
               var10000 = 252;
               break;
            case 216:
               var10000 = 33;
               break;
            case 217:
               var10000 = 117;
               break;
            case 218:
               var10000 = 76;
               break;
            case 219:
               var10000 = 83;
               break;
            case 220:
               var10000 = 75;
               break;
            case 221:
               var10000 = 42;
               break;
            case 222:
               var10000 = 200;
               break;
            case 223:
               var10000 = 185;
               break;
            case 224:
               var10000 = 183;
               break;
            case 225:
               var10000 = 0;
               break;
            case 226:
               var10000 = 44;
               break;
            case 227:
               var10000 = 145;
               break;
            case 228:
               var10000 = 7;
               break;
            case 229:
               var10000 = 16;
               break;
            case 230:
               var10000 = 195;
               break;
            case 231:
               var10000 = 121;
               break;
            case 232:
               var10000 = 221;
               break;
            case 233:
               var10000 = 128;
               break;
            case 234:
               var10000 = 133;
               break;
            case 235:
               var10000 = 144;
               break;
            case 236:
               var10000 = 40;
               break;
            case 237:
               var10000 = 95;
               break;
            case 238:
               var10000 = 48;
               break;
            case 239:
               var10000 = 113;
               break;
            case 240:
               var10000 = 39;
               break;
            case 241:
               var10000 = 59;
               break;
            case 242:
               var10000 = 56;
               break;
            case 243:
               var10000 = 214;
               break;
            case 244:
               var10000 = 68;
               break;
            case 245:
               var10000 = 70;
               break;
            case 246:
               var10000 = 132;
               break;
            case 247:
               var10000 = 103;
               break;
            case 248:
               var10000 = 202;
               break;
            case 249:
               var10000 = 104;
               break;
            case 250:
               var10000 = 242;
               break;
            case 251:
               var10000 = 1;
               break;
            case 252:
               var10000 = 66;
               break;
            case 253:
               var10000 = 118;
               break;
            case 254:
               var10000 = 241;
               break;
            default:
               var10000 = 203;
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
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u009eõ\u009a>\u000bD\u009e²\u0011sIf6K\u0089®¥T\u0003(Ü~\u0014\u008b:e©Ù©\u0003m»$\u0083°ì\u001e·6sÞÔvñ\u009fÕCh\u001fJ§ëêj\u0090[Ò\u0018\u0081Ï?ø\u0099\u008ea\u0003ÊmS";
      int var4 = "\u009eõ\u009a>\u000bD\u009e²\u0011sIf6K\u0089®¥T\u0003(Ü~\u0014\u008b:e©Ù©\u0003m»$\u0083°ì\u001e·6sÞÔvñ\u009fÕCh\u001fJ§ëêj\u0090[Ò\u0018\u0081Ï?ø\u0099\u008ea\u0003ÊmS"
         .length();
      char var1 = 'A';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 28;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 28;
               var10006 = var6;
            } else {
               var13 = 28;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 28;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 31;
                     break;
                  case 1:
                     var29 = 81;
                     break;
                  case 2:
                     var29 = 112;
                     break;
                  case 3:
                     var29 = 22;
                     break;
                  case 4:
                     var29 = 5;
                     break;
                  case 5:
                     var29 = 9;
                     break;
                  default:
                     var29 = 98;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[2];
            T = Arrays.asList(2, 0, 4);
            H = Arrays.asList(1, 0, 3);
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}





