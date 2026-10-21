package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wq2_2 {
   public static long p;
   public static Logger h;
   public final Ug2 T;
   @Nullable
   public N3 I;
   public final List E;
   public final K62 P;
   public boolean g;
   public volatile boolean V;
   public long R;
   public Integer e;
   public boolean b;
   @Nullable
   public Nd2 y;
   public static String[] S;
   public static String[] c;
   public static String[] d;

   public Wq2_2(@NotNull Ug2 var1) {
   super();
      String[] var10000 = y();
      String[] var2 = var10000;

      try {
         this.E = new ArrayList();
         this.P = new K62();
         this.g = false;
         this.V = false;
         this.e = null;
         this.b = false;
         this.y = null;
         this.T = var1;
         if (var2 != null) {
            Ky4.K(new String[3]);
         }
      } catch (IllegalStateException var3) {
         throw a(var3);
      }
   }

   public void O() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 008: invokeinterface com/finalshell/core/Ug2.E ()Z 1
      // 00d: aload 1
      // 00e: ifnonnull 026
      // 011: ifeq 034
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield com/finalshell/core/Wq2_2.V Z
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 025: athrow
      // 026: aload 1
      // 027: ifnonnull 04b
      // 02a: ifeq 035
      // 02d: goto 034
      // 030: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 033: athrow
      // 034: return
      // 035: aload 0
      // 036: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 039: invokeinterface com/finalshell/core/Ug2.U ()V 1
      // 03e: aload 0
      // 03f: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 042: aload 1
      // 043: ifnonnull 060
      // 046: invokeinterface com/finalshell/core/Ug2.x ()Z 1
      // 04b: ifeq 05c
      // 04e: aload 0
      // 04f: invokespecial com/finalshell/core/Wq2_2.F ()V
      // 052: aload 0
      // 053: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 056: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 05b: return
      // 05c: aload 0
      // 05d: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 060: invokeinterface com/finalshell/core/Ug2.S ()Lcom/finalshell/core/Xo2; 1
      // 065: astore 2
      // 066: aload 0
      // 067: aload 1
      // 068: ifnonnull 0af
      // 06b: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 06e: invokeinterface java/util/List.isEmpty ()Z 1
      // 073: ifne 0ae
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 07c: athrow
      // 07d: aload 0
      // 07e: aload 2
      // 07f: getfield com/finalshell/core/Xo2.f I
      // 082: invokespecial com/finalshell/core/Wq2_2.y (I)V
      // 085: aload 0
      // 086: aload 1
      // 087: ifnonnull 0af
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 090: athrow
      // 091: getfield com/finalshell/core/Wq2_2.I Lcom/finalshell/core/N3;
      // 094: ifnull 0ae
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield com/finalshell/core/Wq2_2.I Lcom/finalshell/core/N3;
      // 0a2: invokeinterface com/finalshell/core/N3.q ()V 1
      // 0a7: goto 0ae
      // 0aa: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield com/finalshell/core/Wq2_2.y Lcom/finalshell/core/Nd2;
      // 0b2: ifnull 0d4
      // 0b5: aload 2
      // 0b6: aload 0
      // 0b7: getfield com/finalshell/core/Wq2_2.y Lcom/finalshell/core/Nd2;
      // 0ba: getfield com/finalshell/core/Nd2.E Lcom/finalshell/core/Xo2;
      // 0bd: invokevirtual com/finalshell/core/Xo2.equals (Ljava/lang/Object;)Z
      // 0c0: ifeq 0d4
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 0ce: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 0d3: return
      // 0d4: new java/util/ArrayList
      // 0d7: dup
      // 0d8: invokespecial java/util/ArrayList.<init> ()V
      // 0db: astore 3
      // 0dc: aload 0
      // 0dd: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 0e0: invokeinterface java/util/List.isEmpty ()Z 1
      // 0e5: ifne 132
      // 0e8: aload 2
      // 0e9: aload 0
      // 0ea: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 0ed: bipush 0
      // 0ee: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0f3: checkcast com/finalshell/core/Nd2
      // 0f6: getfield com/finalshell/core/Nd2.E Lcom/finalshell/core/Xo2;
      // 0f9: invokevirtual com/finalshell/core/Xo2.equals (Ljava/lang/Object;)Z
      // 0fc: aload 1
      // 0fd: ifnonnull 13b
      // 100: aload 1
      // 101: ifnonnull 13b
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 10a: athrow
      // 10b: ifne 132
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 114: athrow
      // 115: aload 3
      // 116: aload 0
      // 117: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 11a: bipush 0
      // 11b: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 120: checkcast com/finalshell/core/Nd2
      // 123: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 126: pop
      // 127: aload 1
      // 128: ifnull 0dc
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 131: athrow
      // 132: aload 0
      // 133: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 136: invokeinterface java/util/List.isEmpty ()Z 1
      // 13b: aload 1
      // 13c: ifnonnull 17d
      // 13f: ifeq 15d
      // 142: goto 149
      // 145: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 148: athrow
      // 149: aload 0
      // 14a: bipush 1
      // 14b: putfield com/finalshell/core/Wq2_2.V Z
      // 14e: aload 0
      // 14f: invokespecial com/finalshell/core/Wq2_2.F ()V
      // 152: aload 1
      // 153: ifnull 1d5
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15c: athrow
      // 15d: aload 0
      // 15e: aload 0
      // 15f: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 162: bipush 0
      // 163: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 168: checkcast com/finalshell/core/Nd2
      // 16b: putfield com/finalshell/core/Wq2_2.y Lcom/finalshell/core/Nd2;
      // 16e: aload 3
      // 16f: aload 0
      // 170: getfield com/finalshell/core/Wq2_2.y Lcom/finalshell/core/Nd2;
      // 173: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 176: goto 17d
      // 179: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 17c: athrow
      // 17d: pop
      // 17e: aload 3
      // 17f: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 182: astore 4
      // 184: aload 4
      // 186: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18b: ifeq 1d1
      // 18e: aload 4
      // 190: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 195: checkcast com/finalshell/core/Nd2
      // 198: astore 5
      // 19a: aload 0
      // 19b: aload 1
      // 19c: ifnonnull 1c9
      // 19f: getfield com/finalshell/core/Wq2_2.P Lcom/finalshell/core/K62;
      // 1a2: aload 5
      // 1a4: invokevirtual com/finalshell/core/K62.E (Lcom/finalshell/core/Nd2;)V
      // 1a7: aload 1
      // 1a8: ifnonnull 1de
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b1: athrow
      // 1b2: aload 5
      // 1b4: instanceof com/finalshell/core/Nf2
      // 1b7: ifeq 1cd
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: goto 1c9
      // 1c5: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1c8: athrow
      // 1c9: bipush 1
      // 1ca: putfield com/finalshell/core/Wq2_2.b Z
      // 1cd: aload 1
      // 1ce: ifnull 184
      // 1d1: aload 0
      // 1d2: invokespecial com/finalshell/core/Wq2_2.T ()V
      // 1d5: aload 0
      // 1d6: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 1d9: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 1de: goto 1ef
      // 1e1: astore 6
      // 1e3: aload 0
      // 1e4: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 1e7: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 1ec: aload 6
      // 1ee: athrow
      // 1ef: return
   }

   public void X(@NotNull QK param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 008: invokeinterface com/finalshell/core/Ug2.E ()Z 1
      // 00d: aload 2
      // 00e: ifnonnull 032
      // 011: ifne 01c
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 01a: athrow
      // 01b: return
      // 01c: aload 0
      // 01d: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 020: invokeinterface com/finalshell/core/Ug2.U ()V 1
      // 025: aload 0
      // 026: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 029: aload 2
      // 02a: ifnonnull 047
      // 02d: invokeinterface com/finalshell/core/Ug2.x ()Z 1
      // 032: ifeq 043
      // 035: aload 0
      // 036: invokespecial com/finalshell/core/Wq2_2.F ()V
      // 039: aload 0
      // 03a: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 03d: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 042: return
      // 043: aload 0
      // 044: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 047: invokeinterface com/finalshell/core/Ug2.S ()Lcom/finalshell/core/Xo2; 1
      // 04c: astore 3
      // 04d: aload 0
      // 04e: getfield com/finalshell/core/Wq2_2.R J
      // 051: lstore 4
      // 053: aload 0
      // 054: invokestatic java/lang/System.nanoTime ()J
      // 057: putfield com/finalshell/core/Wq2_2.R J
      // 05a: aload 0
      // 05b: getfield com/finalshell/core/Wq2_2.P Lcom/finalshell/core/K62;
      // 05e: aload 2
      // 05f: ifnonnull 07b
      // 062: invokestatic com/finalshell/core/K62.m (Lcom/finalshell/core/K62;)I
      // 065: bipush 2
      // 066: if_icmplt 08a
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 06f: athrow
      // 070: aload 0
      // 071: getfield com/finalshell/core/Wq2_2.P Lcom/finalshell/core/K62;
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 07a: athrow
      // 07b: invokevirtual com/finalshell/core/K62.D ()J
      // 07e: getstatic com/finalshell/core/Wq2_2.p J
      // 081: invokestatic java/lang/Math.min (JJ)J
      // 084: lstore 6
      // 086: aload 2
      // 087: ifnull 08f
      // 08a: getstatic com/finalshell/core/Wq2_2.p J
      // 08d: lstore 6
      // 08f: invokestatic java/lang/System.nanoTime ()J
      // 092: lload 4
      // 094: lsub
      // 095: lload 6
      // 097: lcmp
      // 098: aload 2
      // 099: ifnonnull 0a7
      // 09c: ifge 0aa
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a5: athrow
      // 0a6: bipush 1
      // 0a7: goto 0ab
      // 0aa: bipush 0
      // 0ab: istore 8
      // 0ad: iload 8
      // 0af: aload 2
      // 0b0: ifnonnull 0c8
      // 0b3: ifeq 0e0
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: getfield com/finalshell/core/Wq2_2.V Z
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c7: athrow
      // 0c8: aload 2
      // 0c9: ifnonnull 107
      // 0cc: ifeq 0e5
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 0da: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 0df: return
      // 0e0: aload 0
      // 0e1: bipush 0
      // 0e2: putfield com/finalshell/core/Wq2_2.V Z
      // 0e5: aload 0
      // 0e6: iload 8
      // 0e8: invokespecial com/finalshell/core/Wq2_2.a (Z)V
      // 0eb: aload 0
      // 0ec: aload 3
      // 0ed: getfield com/finalshell/core/Xo2.f I
      // 0f0: invokespecial com/finalshell/core/Wq2_2.y (I)V
      // 0f3: aload 0
      // 0f4: aload 2
      // 0f5: ifnonnull 134
      // 0f8: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 0fb: invokeinterface java/util/List.isEmpty ()Z 1
      // 100: goto 107
      // 103: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 106: athrow
      // 107: ifeq 133
      // 10a: aload 0
      // 10b: aload 2
      // 10c: ifnonnull 134
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 115: athrow
      // 116: getfield com/finalshell/core/Wq2_2.I Lcom/finalshell/core/N3;
      // 119: ifnull 133
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 122: athrow
      // 123: aload 0
      // 124: getfield com/finalshell/core/Wq2_2.I Lcom/finalshell/core/N3;
      // 127: invokeinterface com/finalshell/core/N3.q ()V 1
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 132: athrow
      // 133: aload 0
      // 134: aload 3
      // 135: aload 1
      // 136: invokespecial com/finalshell/core/Wq2_2.q (Lcom/finalshell/core/Xo2;Lcom/finalshell/core/QK;)Lcom/finalshell/core/Nd2;
      // 139: astore 9
      // 13b: aload 0
      // 13c: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 13f: aload 9
      // 141: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 146: pop
      // 147: aload 0
      // 148: invokespecial com/finalshell/core/Wq2_2.T ()V
      // 14b: getstatic com/finalshell/core/Wq2_2.h Lorg/slf4j/Logger;
      // 14e: new java/lang/StringBuilder
      // 151: dup
      // 152: invokespecial java/lang/StringBuilder.<init> ()V
      // 155: sipush -30570
      // 158: sipush 1615
      // 15b: invokestatic com/finalshell/core/Wq2_2.a (II)Ljava/lang/String;
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: aload 1
      // 162: getfield com/finalshell/core/QK.W Lcom/finalshell/ui/model/Dy2_2;
      // 165: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 168: sipush -30569
      // 16b: sipush 1822
      // 16e: invokestatic com/finalshell/core/Wq2_2.a (II)Ljava/lang/String;
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 177: invokeinterface org/slf4j/Logger.debug (Ljava/lang/String;)V 2
      // 17c: aload 0
      // 17d: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 180: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 185: goto 196
      // 188: astore 10
      // 18a: aload 0
      // 18b: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 18e: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 193: aload 10
      // 195: athrow
      // 196: return
   }

   public void R() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 08: aload 1
      // 09: ifnonnull 31
      // 0c: invokeinterface com/finalshell/core/Ug2.E ()Z 1
      // 11: ifne 20
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a: athrow
      // 1b: return
      // 1c: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 24: invokeinterface com/finalshell/core/Ug2.U ()V 1
      // 29: aload 0
      // 2a: invokespecial com/finalshell/core/Wq2_2.F ()V
      // 2d: aload 0
      // 2e: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 31: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 36: goto 45
      // 39: astore 2
      // 3a: aload 0
      // 3b: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 3e: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 43: aload 2
      // 44: athrow
      // 45: return
   }

   public int x() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 07: invokeinterface com/finalshell/core/Ug2.U ()V 1
      // 0c: astore 1
      // 0d: aload 0
      // 0e: aload 1
      // 0f: ifnonnull 4e
      // 12: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 15: invokeinterface com/finalshell/core/Ug2.x ()Z 1
      // 1a: ifeq 4d
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 28: aload 1
      // 29: ifnonnull 51
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 32: athrow
      // 33: invokeinterface java/util/List.isEmpty ()Z 1
      // 38: ifne 4d
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 41: athrow
      // 42: aload 0
      // 43: invokespecial com/finalshell/core/Wq2_2.F ()V
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4c: athrow
      // 4d: aload 0
      // 4e: invokespecial com/finalshell/core/Wq2_2.z ()Ljava/util/List;
      // 51: astore 2
      // 52: aload 2
      // 53: aload 1
      // 54: ifnonnull 87
      // 57: invokeinterface java/util/List.isEmpty ()Z 1
      // 5c: ifeq 79
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 65: athrow
      // 66: aload 0
      // 67: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 6a: invokeinterface com/finalshell/core/Ug2.S ()Lcom/finalshell/core/Xo2; 1
      // 6f: getfield com/finalshell/core/Xo2.f I
      // 72: goto 90
      // 75: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 78: athrow
      // 79: aload 2
      // 7a: aload 2
      // 7b: invokeinterface java/util/List.size ()I 1
      // 80: bipush 1
      // 81: isub
      // 82: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 87: checkcast com/finalshell/core/Nd2
      // 8a: getfield com/finalshell/core/Nd2.E Lcom/finalshell/core/Xo2;
      // 8d: getfield com/finalshell/core/Xo2.f I
      // 90: istore 3
      // 91: iload 3
      // 92: bipush 1
      // 93: iadd
      // 94: istore 4
      // 96: aload 0
      // 97: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 9a: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 9f: iload 4
      // a1: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // a4: ifnull b5
      // a7: bipush 5
      // a8: anewarray 66
      // ab: invokestatic com/finalshell/core/Wq2_2.V ([Ljava/lang/String;)V
      // ae: goto b5
      // b1: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // b4: athrow
      // b5: ireturn
      // b6: astore 5
      // b8: aload 0
      // b9: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // bc: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // c1: aload 5
      // c3: athrow
   }

   public void Y() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 07: invokeinterface com/finalshell/core/Ug2.U ()V 1
      // 0c: astore 1
      // 0d: aload 0
      // 0e: aload 1
      // 0f: ifnonnull 41
      // 12: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 15: invokeinterface java/util/List.isEmpty ()Z 1
      // 1a: ifne 40
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 23: athrow
      // 24: getstatic com/finalshell/core/Wq2_2.h Lorg/slf4j/Logger;
      // 27: sipush -30574
      // 2a: sipush -27507
      // 2d: invokestatic com/finalshell/core/Wq2_2.a (II)Ljava/lang/String;
      // 30: invokeinterface org/slf4j/Logger.debug (Ljava/lang/String;)V 2
      // 35: aload 0
      // 36: invokespecial com/finalshell/core/Wq2_2.F ()V
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 44: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 49: goto 58
      // 4c: astore 2
      // 4d: aload 0
      // 4e: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 51: invokeinterface com/finalshell/core/Ug2.D ()V 1
      // 56: aload 2
      // 57: athrow
      // 58: return
   }

   public void L(@NotNull N3 var1) {
      this.I = var1;
   }

   @Nullable
   public Nd2 e() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 08: aload 1
      // 09: ifnonnull 37
      // 0c: invokeinterface java/util/List.isEmpty ()Z 1
      // 11: ifeq 23
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a: athrow
      // 1b: aconst_null
      // 1c: goto 3a
      // 1f: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 27: aload 0
      // 28: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 2b: invokeinterface java/util/List.size ()I 1
      // 30: bipush 1
      // 31: isub
      // 32: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 37: checkcast com/finalshell/core/Nd2
      // 3a: areturn
   }

   @NotNull
   public List z() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: iload 2
      // 07: aload 0
      // 08: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 4a
      // 13: aload 0
      // 14: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 17: iload 2
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast com/finalshell/core/Nd2
      // 20: getfield com/finalshell/core/Nd2.M Z
      // 23: aload 1
      // 24: ifnonnull 4e
      // 27: aload 1
      // 28: ifnonnull 4e
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 31: athrow
      // 32: ifeq 4a
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3b: athrow
      // 3c: iinc 2 1
      // 3f: aload 1
      // 40: ifnull 06
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 49: athrow
      // 4a: iinc 2 -1
      // 4d: iload 2
      // 4e: iflt 65
      // 51: aload 0
      // 52: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 55: bipush 0
      // 56: iload 2
      // 57: bipush 1
      // 58: iadd
      // 59: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 5e: goto 68
      // 61: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 64: athrow
      // 65: invokestatic java/util/Collections.emptyList ()Ljava/util/List;
      // 68: areturn
   }

   public void y(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 31
      // 09: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 0c: ifnonnull 29
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b: putfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 1e: aload 2
      // 1f: ifnull 42
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 28: athrow
      // 29: aload 0
      // 2a: goto 31
      // 2d: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 30: athrow
      // 31: aload 0
      // 32: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 35: invokevirtual java/lang/Integer.intValue ()I
      // 38: iload 1
      // 39: invokestatic java/lang/Math.min (II)I
      // 3c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3f: putfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 42: return
   }

   public void F() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 04: invokeinterface com/finalshell/core/Ug2.N ()V 1
      // 09: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 0c: aload 0
      // 0d: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 10: invokeinterface java/util/List.clear ()V 1
      // 15: aload 0
      // 16: aconst_null
      // 17: putfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 1a: aload 0
      // 1b: aconst_null
      // 1c: putfield com/finalshell/core/Wq2_2.y Lcom/finalshell/core/Nd2;
      // 1f: astore 1
      // 20: aload 0
      // 21: bipush 0
      // 22: putfield com/finalshell/core/Wq2_2.b Z
      // 25: aload 0
      // 26: getfield com/finalshell/core/Wq2_2.I Lcom/finalshell/core/N3;
      // 29: aload 1
      // 2a: ifnonnull 42
      // 2d: ifnull 47
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield com/finalshell/core/Wq2_2.I Lcom/finalshell/core/N3;
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 41: athrow
      // 42: invokeinterface com/finalshell/core/N3.y ()V 1
      // 47: return
   }

   public void a(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 08: invokeinterface com/finalshell/core/Ug2.E ()Z 1
      // 0d: aload 2
      // 0e: ifnonnull 44
      // 11: ifne 2b
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: bipush 0
      // 1d: putfield com/finalshell/core/Wq2_2.g Z
      // 20: aload 2
      // 21: ifnull b6
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/core/Wq2_2.P Lcom/finalshell/core/K62;
      // 2f: aload 2
      // 30: ifnonnull 53
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 39: athrow
      // 3a: invokestatic com/finalshell/core/K62.m (Lcom/finalshell/core/K62;)I
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 43: athrow
      // 44: bipush 2
      // 45: if_icmplt b6
      // 48: aload 0
      // 49: getfield com/finalshell/core/Wq2_2.P Lcom/finalshell/core/K62;
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 52: athrow
      // 53: invokevirtual com/finalshell/core/K62.w ()J
      // 56: lstore 3
      // 57: lload 3
      // 58: aload 0
      // 59: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 5c: invokeinterface com/finalshell/core/Ug2.j ()J 1
      // 61: lcmp
      // 62: aload 2
      // 63: ifnonnull 98
      // 66: iflt 80
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6f: athrow
      // 70: aload 0
      // 71: bipush 1
      // 72: putfield com/finalshell/core/Wq2_2.g Z
      // 75: aload 2
      // 76: ifnull b6
      // 79: goto 80
      // 7c: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7f: athrow
      // 80: lload 3
      // 81: l2d
      // 82: aload 0
      // 83: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 86: invokeinterface com/finalshell/core/Ug2.j ()J 1
      // 8b: l2d
      // 8c: ldc2_w 0.5
      // 8f: dmul
      // 90: dcmpg
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 97: athrow
      // 98: aload 2
      // 99: ifnonnull a7
      // 9c: ifge b6
      // 9f: goto a6
      // a2: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // a5: athrow
      // a6: iload 1
      // a7: ifne b6
      // aa: aload 0
      // ab: bipush 0
      // ac: putfield com/finalshell/core/Wq2_2.g Z
      // af: goto b6
      // b2: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // b5: athrow
      // b6: return
   }

   public void T() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 003: aload 0
      // 004: invokespecial com/finalshell/core/Wq2_2.z ()Ljava/util/List;
      // 007: astore 2
      // 008: aload 0
      // 009: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 00c: invokeinterface com/finalshell/core/Ug2.N ()V 1
      // 011: astore 1
      // 012: aload 2
      // 013: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 018: astore 3
      // 019: aload 3
      // 01a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01f: ifeq 132
      // 022: aload 3
      // 023: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 028: checkcast com/finalshell/core/Nd2
      // 02b: astore 4
      // 02d: aload 4
      // 02f: getfield com/finalshell/core/Nd2.E Lcom/finalshell/core/Xo2;
      // 032: getfield com/finalshell/core/Xo2.f I
      // 035: istore 5
      // 037: aload 1
      // 038: ifnonnull 13b
      // 03b: aload 4
      // 03d: instanceof com/finalshell/core/Nf2
      // 040: aload 1
      // 041: ifnonnull 08c
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 04a: athrow
      // 04b: ifeq 080
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 054: athrow
      // 055: aload 0
      // 056: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 059: aload 4
      // 05b: checkcast com/finalshell/core/Nf2
      // 05e: getfield com/finalshell/core/Nf2.o C
      // 061: iload 5
      // 063: bipush 1
      // 064: isub
      // 065: invokeinterface com/finalshell/core/Ug2.N (CI)V 3
      // 06a: aload 0
      // 06b: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 06e: iload 5
      // 070: invokeinterface com/finalshell/core/Ug2.e (I)V 2
      // 075: aload 1
      // 076: ifnull 12e
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 07f: athrow
      // 080: aload 4
      // 082: instanceof com/finalshell/core/Ni2
      // 085: goto 08c
      // 088: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 08b: athrow
      // 08c: aload 1
      // 08d: ifnonnull 0cf
      // 090: ifeq 0c3
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 09e: iload 5
      // 0a0: invokeinterface com/finalshell/core/Ug2.e (I)V 2
      // 0a5: aload 0
      // 0a6: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 0a9: iload 5
      // 0ab: aload 4
      // 0ad: checkcast com/finalshell/core/Ni2
      // 0b0: getfield com/finalshell/core/Ni2.o I
      // 0b3: invokeinterface com/finalshell/core/Ug2.O (II)V 3
      // 0b8: aload 1
      // 0b9: ifnull 12e
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c2: athrow
      // 0c3: aload 4
      // 0c5: instanceof com/finalshell/core/N8
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ce: athrow
      // 0cf: aload 1
      // 0d0: ifnonnull 0ff
      // 0d3: ifeq 0f3
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 0e1: iload 5
      // 0e3: invokeinterface com/finalshell/core/Ug2.e (I)V 2
      // 0e8: aload 1
      // 0e9: ifnull 12e
      // 0ec: goto 0f3
      // 0ef: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f2: athrow
      // 0f3: aload 4
      // 0f5: instanceof com/finalshell/core/Nh2
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0fe: athrow
      // 0ff: ifeq 119
      // 102: aload 0
      // 103: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 106: iload 5
      // 108: bipush 1
      // 109: invokeinterface com/finalshell/core/Ug2.O (II)V 3
      // 10e: aload 1
      // 10f: ifnull 12e
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 118: athrow
      // 119: new java/lang/IllegalStateException
      // 11c: dup
      // 11d: sipush -30573
      // 120: sipush 27089
      // 123: invokestatic com/finalshell/core/Wq2_2.a (II)Ljava/lang/String;
      // 126: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 129: athrow
      // 12a: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 12d: athrow
      // 12e: aload 1
      // 12f: ifnull 019
      // 132: aload 0
      // 133: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 136: invokeinterface com/finalshell/core/Ug2.B ()V 1
      // 13b: return
   }

   @NotNull
   public Nd2 q(@NotNull Xo2 param1, @NotNull QK param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Wq2_2.y ()[Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: invokespecial com/finalshell/core/Wq2_2.e ()Lcom/finalshell/core/Nd2;
      // 008: aload 3
      // 009: ifnonnull 029
      // 00c: instanceof com/finalshell/core/NV
      // 00f: ifeq 025
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 018: athrow
      // 019: new com/finalshell/core/NV
      // 01c: dup
      // 01d: invokespecial com/finalshell/core/NV.<init> ()V
      // 020: areturn
      // 021: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 024: athrow
      // 025: aload 0
      // 026: invokespecial com/finalshell/core/Wq2_2.e ()Lcom/finalshell/core/Nd2;
      // 029: astore 5
      // 02b: aload 5
      // 02d: aload 3
      // 02e: ifnonnull 03d
      // 031: ifnull 049
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 03a: athrow
      // 03b: aload 5
      // 03d: getfield com/finalshell/core/Nd2.E Lcom/finalshell/core/Xo2;
      // 040: invokevirtual com/finalshell/core/Xo2.k ()Lcom/finalshell/core/Xo2;
      // 043: astore 4
      // 045: aload 3
      // 046: ifnull 04f
      // 049: aload 1
      // 04a: invokevirtual com/finalshell/core/Xo2.k ()Lcom/finalshell/core/Xo2;
      // 04d: astore 4
      // 04f: getstatic com/finalshell/core/I0.j [I
      // 052: aload 2
      // 053: getfield com/finalshell/core/QK.W Lcom/finalshell/ui/model/Dy2_2;
      // 056: invokevirtual com/finalshell/ui/model/Dy2_2.ordinal ()I
      // 059: iaload
      // 05a: aload 3
      // 05b: ifnonnull 0a8
      // 05e: tableswitch 1239 1 11 62 362 504 681 681 851 851 1049 1111 1154 1231
      // 098: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09b: athrow
      // 09c: aload 4
      // 09e: getfield com/finalshell/core/Xo2.f I
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a7: athrow
      // 0a8: aload 3
      // 0a9: ifnonnull 0de
      // 0ac: aload 0
      // 0ad: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 0b0: invokeinterface com/finalshell/core/Ug2.f ()I 1
      // 0b5: if_icmplt 0cb
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0be: athrow
      // 0bf: new com/finalshell/core/NV
      // 0c2: dup
      // 0c3: invokespecial com/finalshell/core/NV.<init> ()V
      // 0c6: areturn
      // 0c7: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield com/finalshell/core/Wq2_2.E Ljava/util/List;
      // 0cf: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 0d4: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, com/finalshell/core/Wq2_2.lambda$createPrediction$0 (Lcom/finalshell/core/Nd2;)Z, (Lcom/finalshell/core/Nd2;)Z ]
      // 0d9: invokeinterface java/util/stream/Stream.anyMatch (Ljava/util/function/Predicate;)Z 2
      // 0de: istore 6
      // 0e0: aload 2
      // 0e1: invokevirtual com/finalshell/core/QK.Z ()Ljava/lang/Character;
      // 0e4: astore 7
      // 0e6: aload 7
      // 0e8: ifnonnull 100
      // 0eb: new java/lang/IllegalStateException
      // 0ee: dup
      // 0ef: sipush -30571
      // 0f2: sipush 22174
      // 0f5: invokestatic com/finalshell/core/Wq2_2.a (II)Ljava/lang/String;
      // 0f8: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 0fb: athrow
      // 0fc: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ff: athrow
      // 100: aload 4
      // 102: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 105: invokevirtual java/lang/StringBuffer.length ()I
      // 108: aload 4
      // 10a: getfield com/finalshell/core/Xo2.f I
      // 10d: aload 3
      // 10e: ifnonnull 176
      // 111: if_icmpge 13f
      // 114: goto 11b
      // 117: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 11a: athrow
      // 11b: aload 4
      // 11d: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 120: ldc_w " "
      // 123: aload 4
      // 125: getfield com/finalshell/core/Xo2.f I
      // 128: aload 4
      // 12a: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 12d: invokevirtual java/lang/StringBuffer.length ()I
      // 130: isub
      // 131: invokevirtual java/lang/String.repeat (I)Ljava/lang/String;
      // 134: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 137: pop
      // 138: goto 13f
      // 13b: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 13e: athrow
      // 13f: aload 4
      // 141: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 144: aload 4
      // 146: getfield com/finalshell/core/Xo2.f I
      // 149: aload 7
      // 14b: invokevirtual java/lang/StringBuffer.insert (ILjava/lang/Object;)Ljava/lang/StringBuffer;
      // 14e: pop
      // 14f: aload 4
      // 151: dup
      // 152: getfield com/finalshell/core/Xo2.f I
      // 155: bipush 1
      // 156: iadd
      // 157: putfield com/finalshell/core/Xo2.f I
      // 15a: aload 4
      // 15c: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 15f: aload 3
      // 160: ifnonnull 199
      // 163: invokevirtual java/lang/StringBuffer.length ()I
      // 166: aload 0
      // 167: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 16a: invokeinterface com/finalshell/core/Ug2.f ()I 1
      // 16f: goto 176
      // 172: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 175: athrow
      // 176: if_icmple 19a
      // 179: aload 4
      // 17b: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 17e: aload 0
      // 17f: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 182: invokeinterface com/finalshell/core/Ug2.f ()I 1
      // 187: aload 4
      // 189: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 18c: invokevirtual java/lang/StringBuffer.length ()I
      // 18f: invokevirtual java/lang/StringBuffer.delete (II)Ljava/lang/StringBuffer;
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 198: athrow
      // 199: pop
      // 19a: new com/finalshell/core/Nf2
      // 19d: dup
      // 19e: aload 4
      // 1a0: aload 7
      // 1a2: invokevirtual java/lang/Character.charValue ()C
      // 1a5: aload 0
      // 1a6: getfield com/finalshell/core/Wq2_2.b Z
      // 1a9: ifne 1b8
      // 1ac: iload 6
      // 1ae: ifeq 1c3
      // 1b1: goto 1b8
      // 1b4: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: getfield com/finalshell/core/Wq2_2.g Z
      // 1bc: ifeq 1c3
      // 1bf: bipush 1
      // 1c0: goto 1c4
      // 1c3: bipush 0
      // 1c4: invokespecial com/finalshell/core/Nf2.<init> (Lcom/finalshell/core/Xo2;CZ)V
      // 1c7: areturn
      // 1c8: aload 4
      // 1ca: getfield com/finalshell/core/Xo2.f I
      // 1cd: aload 3
      // 1ce: ifnonnull 202
      // 1d1: ifne 1e7
      // 1d4: goto 1db
      // 1d7: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1da: athrow
      // 1db: new com/finalshell/core/NV
      // 1de: dup
      // 1df: invokespecial com/finalshell/core/NV.<init> ()V
      // 1e2: areturn
      // 1e3: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1e6: athrow
      // 1e7: aload 4
      // 1e9: dup
      // 1ea: getfield com/finalshell/core/Xo2.f I
      // 1ed: bipush 1
      // 1ee: isub
      // 1ef: putfield com/finalshell/core/Xo2.f I
      // 1f2: aload 4
      // 1f4: aload 3
      // 1f5: ifnonnull 216
      // 1f8: getfield com/finalshell/core/Xo2.f I
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 201: athrow
      // 202: aload 4
      // 204: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 207: invokevirtual java/lang/StringBuffer.length ()I
      // 20a: if_icmpge 222
      // 20d: aload 4
      // 20f: goto 216
      // 212: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 215: athrow
      // 216: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 219: aload 4
      // 21b: getfield com/finalshell/core/Xo2.f I
      // 21e: invokevirtual java/lang/StringBuffer.deleteCharAt (I)Ljava/lang/StringBuffer;
      // 221: pop
      // 222: new com/finalshell/core/Ni2
      // 225: dup
      // 226: aload 4
      // 228: bipush 1
      // 229: aload 0
      // 22a: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 22d: ifnull 251
      // 230: aload 0
      // 231: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 234: invokevirtual java/lang/Integer.intValue ()I
      // 237: aload 4
      // 239: getfield com/finalshell/core/Xo2.f I
      // 23c: if_icmpgt 251
      // 23f: goto 246
      // 242: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 245: athrow
      // 246: aload 0
      // 247: getfield com/finalshell/core/Wq2_2.g Z
      // 24a: ifeq 251
      // 24d: bipush 1
      // 24e: goto 252
      // 251: bipush 0
      // 252: invokespecial com/finalshell/core/Ni2.<init> (Lcom/finalshell/core/Xo2;IZ)V
      // 255: areturn
      // 256: aload 4
      // 258: getfield com/finalshell/core/Xo2.f I
      // 25b: istore 8
      // 25d: aload 4
      // 25f: bipush 0
      // 260: aload 0
      // 261: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 264: invokeinterface com/finalshell/core/Ug2.e ()Lcom/finalshell/ui/model/US; 1
      // 269: invokevirtual com/finalshell/core/Xo2.X (ZLcom/finalshell/ui/model/US;)V
      // 26c: aload 4
      // 26e: getfield com/finalshell/core/Xo2.f I
      // 271: aload 3
      // 272: ifnonnull 293
      // 275: ifge 28b
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 27e: athrow
      // 27f: new com/finalshell/core/NV
      // 282: dup
      // 283: invokespecial com/finalshell/core/NV.<init> ()V
      // 286: areturn
      // 287: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 28a: athrow
      // 28b: iload 8
      // 28d: aload 4
      // 28f: getfield com/finalshell/core/Xo2.f I
      // 292: isub
      // 293: istore 9
      // 295: aload 4
      // 297: aload 3
      // 298: ifnonnull 2b9
      // 29b: getfield com/finalshell/core/Xo2.f I
      // 29e: aload 4
      // 2a0: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 2a3: invokevirtual java/lang/StringBuffer.length ()I
      // 2a6: if_icmpge 2d2
      // 2a9: goto 2b0
      // 2ac: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2af: athrow
      // 2b0: aload 4
      // 2b2: goto 2b9
      // 2b5: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2b8: athrow
      // 2b9: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 2bc: aload 4
      // 2be: getfield com/finalshell/core/Xo2.f I
      // 2c1: iload 8
      // 2c3: aload 4
      // 2c5: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 2c8: invokevirtual java/lang/StringBuffer.length ()I
      // 2cb: invokestatic java/lang/Math.min (II)I
      // 2ce: invokevirtual java/lang/StringBuffer.delete (II)Ljava/lang/StringBuffer;
      // 2d1: pop
      // 2d2: new com/finalshell/core/Ni2
      // 2d5: dup
      // 2d6: aload 4
      // 2d8: iload 9
      // 2da: aload 0
      // 2db: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 2de: ifnull 302
      // 2e1: aload 0
      // 2e2: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 2e5: invokevirtual java/lang/Integer.intValue ()I
      // 2e8: aload 4
      // 2ea: getfield com/finalshell/core/Xo2.f I
      // 2ed: if_icmpgt 302
      // 2f0: goto 2f7
      // 2f3: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2f6: athrow
      // 2f7: aload 0
      // 2f8: getfield com/finalshell/core/Wq2_2.g Z
      // 2fb: ifeq 302
      // 2fe: bipush 1
      // 2ff: goto 303
      // 302: bipush 0
      // 303: invokespecial com/finalshell/core/Ni2.<init> (Lcom/finalshell/core/Xo2;IZ)V
      // 306: areturn
      // 307: aload 2
      // 308: getfield com/finalshell/core/QK.W Lcom/finalshell/ui/model/Dy2_2;
      // 30b: getstatic com/finalshell/ui/model/Dy2_2.RightArrow Lcom/finalshell/ui/model/Dy2_2;
      // 30e: if_acmpne 319
      // 311: bipush 1
      // 312: goto 31a
      // 315: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 318: athrow
      // 319: bipush -1
      // 31a: istore 9
      // 31c: aload 4
      // 31e: dup
      // 31f: getfield com/finalshell/core/Xo2.f I
      // 322: iload 9
      // 324: iadd
      // 325: putfield com/finalshell/core/Xo2.f I
      // 328: aload 4
      // 32a: getfield com/finalshell/core/Xo2.f I
      // 32d: aload 3
      // 32e: ifnonnull 347
      // 331: iflt 360
      // 334: goto 33b
      // 337: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 33a: athrow
      // 33b: aload 4
      // 33d: getfield com/finalshell/core/Xo2.f I
      // 340: goto 347
      // 343: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 346: athrow
      // 347: aload 4
      // 349: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 34c: invokevirtual java/lang/StringBuffer.length ()I
      // 34f: bipush 1
      // 350: iadd
      // 351: aload 0
      // 352: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 355: invokeinterface com/finalshell/core/Ug2.f ()I 1
      // 35a: invokestatic java/lang/Math.max (II)I
      // 35d: if_icmplt 36c
      // 360: new com/finalshell/core/NV
      // 363: dup
      // 364: invokespecial com/finalshell/core/NV.<init> ()V
      // 367: areturn
      // 368: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 36b: athrow
      // 36c: new com/finalshell/core/N8
      // 36f: dup
      // 370: aload 4
      // 372: iload 9
      // 374: aload 0
      // 375: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 378: ifnull 3ac
      // 37b: aload 0
      // 37c: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 37f: invokevirtual java/lang/Integer.intValue ()I
      // 382: aload 4
      // 384: getfield com/finalshell/core/Xo2.f I
      // 387: if_icmpgt 3ac
      // 38a: goto 391
      // 38d: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 390: athrow
      // 391: aload 4
      // 393: getfield com/finalshell/core/Xo2.f I
      // 396: aload 4
      // 398: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 39b: invokevirtual java/lang/StringBuffer.length ()I
      // 39e: if_icmpgt 3ac
      // 3a1: aload 0
      // 3a2: getfield com/finalshell/core/Wq2_2.g Z
      // 3a5: ifeq 3ac
      // 3a8: bipush 1
      // 3a9: goto 3ad
      // 3ac: bipush 0
      // 3ad: invokespecial com/finalshell/core/N8.<init> (Lcom/finalshell/core/Xo2;IZ)V
      // 3b0: areturn
      // 3b1: aload 4
      // 3b3: getfield com/finalshell/core/Xo2.f I
      // 3b6: istore 8
      // 3b8: aload 4
      // 3ba: aload 2
      // 3bb: getfield com/finalshell/core/QK.W Lcom/finalshell/ui/model/Dy2_2;
      // 3be: getstatic com/finalshell/ui/model/Dy2_2.AltRightArrow Lcom/finalshell/ui/model/Dy2_2;
      // 3c1: if_acmpne 3cc
      // 3c4: bipush 1
      // 3c5: goto 3cd
      // 3c8: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3cb: athrow
      // 3cc: bipush 0
      // 3cd: aload 0
      // 3ce: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 3d1: invokeinterface com/finalshell/core/Ug2.e ()Lcom/finalshell/ui/model/US; 1
      // 3d6: invokevirtual com/finalshell/core/Xo2.X (ZLcom/finalshell/ui/model/US;)V
      // 3d9: aload 4
      // 3db: getfield com/finalshell/core/Xo2.f I
      // 3de: aload 3
      // 3df: ifnonnull 3f8
      // 3e2: iflt 41c
      // 3e5: goto 3ec
      // 3e8: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3eb: athrow
      // 3ec: aload 4
      // 3ee: getfield com/finalshell/core/Xo2.f I
      // 3f1: goto 3f8
      // 3f4: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3f7: athrow
      // 3f8: aload 4
      // 3fa: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 3fd: invokevirtual java/lang/StringBuffer.length ()I
      // 400: bipush 1
      // 401: iadd
      // 402: aload 0
      // 403: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 406: invokeinterface com/finalshell/core/Ug2.f ()I 1
      // 40b: invokestatic java/lang/Math.max (II)I
      // 40e: aload 3
      // 40f: ifnonnull 42f
      // 412: if_icmplt 428
      // 415: goto 41c
      // 418: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 41b: athrow
      // 41c: new com/finalshell/core/NV
      // 41f: dup
      // 420: invokespecial com/finalshell/core/NV.<init> ()V
      // 423: areturn
      // 424: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 427: athrow
      // 428: aload 4
      // 42a: getfield com/finalshell/core/Xo2.f I
      // 42d: iload 8
      // 42f: isub
      // 430: istore 9
      // 432: new com/finalshell/core/N8
      // 435: dup
      // 436: aload 4
      // 438: iload 9
      // 43a: aload 0
      // 43b: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 43e: ifnull 472
      // 441: aload 0
      // 442: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 445: invokevirtual java/lang/Integer.intValue ()I
      // 448: aload 4
      // 44a: getfield com/finalshell/core/Xo2.f I
      // 44d: if_icmpgt 472
      // 450: goto 457
      // 453: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 456: athrow
      // 457: aload 4
      // 459: getfield com/finalshell/core/Xo2.f I
      // 45c: aload 4
      // 45e: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 461: invokevirtual java/lang/StringBuffer.length ()I
      // 464: if_icmpgt 472
      // 467: aload 0
      // 468: getfield com/finalshell/core/Wq2_2.g Z
      // 46b: ifeq 472
      // 46e: bipush 1
      // 46f: goto 473
      // 472: bipush 0
      // 473: invokespecial com/finalshell/core/N8.<init> (Lcom/finalshell/core/Xo2;IZ)V
      // 476: areturn
      // 477: aload 4
      // 479: aload 3
      // 47a: ifnonnull 49b
      // 47d: getfield com/finalshell/core/Xo2.f I
      // 480: aload 4
      // 482: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 485: invokevirtual java/lang/StringBuffer.length ()I
      // 488: if_icmpge 4a7
      // 48b: goto 492
      // 48e: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 491: athrow
      // 492: aload 4
      // 494: goto 49b
      // 497: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 49a: athrow
      // 49b: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 49e: aload 4
      // 4a0: getfield com/finalshell/core/Xo2.f I
      // 4a3: invokevirtual java/lang/StringBuffer.deleteCharAt (I)Ljava/lang/StringBuffer;
      // 4a6: pop
      // 4a7: new com/finalshell/core/Nh2
      // 4aa: dup
      // 4ab: aload 4
      // 4ad: aload 0
      // 4ae: getfield com/finalshell/core/Wq2_2.g Z
      // 4b1: invokespecial com/finalshell/core/Nh2.<init> (Lcom/finalshell/core/Xo2;Z)V
      // 4b4: areturn
      // 4b5: aload 0
      // 4b6: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 4b9: invokevirtual java/lang/Integer.intValue ()I
      // 4bc: aload 4
      // 4be: getfield com/finalshell/core/Xo2.f I
      // 4c1: isub
      // 4c2: istore 9
      // 4c4: aload 4
      // 4c6: aload 0
      // 4c7: getfield com/finalshell/core/Wq2_2.e Ljava/lang/Integer;
      // 4ca: invokevirtual java/lang/Integer.intValue ()I
      // 4cd: putfield com/finalshell/core/Xo2.f I
      // 4d0: new com/finalshell/core/N8
      // 4d3: dup
      // 4d4: aload 4
      // 4d6: iload 9
      // 4d8: aload 0
      // 4d9: getfield com/finalshell/core/Wq2_2.g Z
      // 4dc: invokespecial com/finalshell/core/N8.<init> (Lcom/finalshell/core/Xo2;IZ)V
      // 4df: areturn
      // 4e0: aload 4
      // 4e2: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 4e5: invokevirtual java/lang/StringBuffer.length ()I
      // 4e8: istore 10
      // 4ea: iload 10
      // 4ec: aload 0
      // 4ed: getfield com/finalshell/core/Wq2_2.T Lcom/finalshell/core/Ug2;
      // 4f0: invokeinterface com/finalshell/core/Ug2.f ()I 1
      // 4f5: aload 3
      // 4f6: ifnonnull 50d
      // 4f9: if_icmpne 506
      // 4fc: goto 503
      // 4ff: invokestatic com/finalshell/core/Wq2_2.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 502: athrow
      // 503: iinc 10 -1
      // 506: iload 10
      // 508: aload 4
      // 50a: getfield com/finalshell/core/Xo2.f I
      // 50d: isub
      // 50e: istore 9
      // 510: aload 4
      // 512: aload 4
      // 514: getfield com/finalshell/core/Xo2.x Ljava/lang/StringBuffer;
      // 517: invokevirtual java/lang/StringBuffer.length ()I
      // 51a: putfield com/finalshell/core/Xo2.f I
      // 51d: new com/finalshell/core/N8
      // 520: dup
      // 521: aload 4
      // 523: iload 9
      // 525: aload 0
      // 526: getfield com/finalshell/core/Wq2_2.g Z
      // 529: invokespecial com/finalshell/core/N8.<init> (Lcom/finalshell/core/Xo2;IZ)V
      // 52c: areturn
      // 52d: new com/finalshell/core/NV
      // 530: dup
      // 531: invokespecial com/finalshell/core/NV.<init> ()V
      // 534: areturn
      // 535: new java/lang/IllegalStateException
      // 538: dup
      // 539: sipush -30572
      // 53c: sipush 20879
      // 53f: invokestatic com/finalshell/core/Wq2_2.a (II)Ljava/lang/String;
      // 542: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 545: athrow
   }

   public static boolean lambda$createPrediction$0(Nd2 var0) {
      return var0 instanceof Nf2;
   }

   static {
      __vfClinit__();
   }

   public static void V(String[] var0) {
      S = var0;
   }

   public static String[] y() {
      return S;
   }

   public static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -30569) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 195;
               break;
            case 1:
               var10000 = 20;
               break;
            case 2:
               var10000 = 106;
               break;
            case 3:
               var10000 = 207;
               break;
            case 4:
               var10000 = 231;
               break;
            case 5:
               var10000 = 114;
               break;
            case 6:
               var10000 = 87;
               break;
            case 7:
               var10000 = 122;
               break;
            case 8:
               var10000 = 53;
               break;
            case 9:
               var10000 = 120;
               break;
            case 10:
               var10000 = 135;
               break;
            case 11:
               var10000 = 144;
               break;
            case 12:
               var10000 = 59;
               break;
            case 13:
               var10000 = 75;
               break;
            case 14:
               var10000 = 164;
               break;
            case 15:
               var10000 = 227;
               break;
            case 16:
               var10000 = 69;
               break;
            case 17:
               var10000 = 68;
               break;
            case 18:
               var10000 = 188;
               break;
            case 19:
               var10000 = 29;
               break;
            case 20:
               var10000 = 98;
               break;
            case 21:
               var10000 = 129;
               break;
            case 22:
               var10000 = 146;
               break;
            case 23:
               var10000 = 8;
               break;
            case 24:
               var10000 = 66;
               break;
            case 25:
               var10000 = 149;
               break;
            case 26:
               var10000 = 158;
               break;
            case 27:
               var10000 = 88;
               break;
            case 28:
               var10000 = 136;
               break;
            case 29:
               var10000 = 1;
               break;
            case 30:
               var10000 = 187;
               break;
            case 31:
               var10000 = 234;
               break;
            case 32:
               var10000 = 193;
               break;
            case 33:
               var10000 = 131;
               break;
            case 34:
               var10000 = 189;
               break;
            case 35:
               var10000 = 150;
               break;
            case 36:
               var10000 = 209;
               break;
            case 37:
               var10000 = 184;
               break;
            case 38:
               var10000 = 38;
               break;
            case 39:
               var10000 = 85;
               break;
            case 40:
               var10000 = 82;
               break;
            case 41:
               var10000 = 92;
               break;
            case 42:
               var10000 = 194;
               break;
            case 43:
               var10000 = 34;
               break;
            case 44:
               var10000 = 51;
               break;
            case 45:
               var10000 = 175;
               break;
            case 46:
               var10000 = 220;
               break;
            case 47:
               var10000 = 239;
               break;
            case 48:
               var10000 = 10;
               break;
            case 49:
               var10000 = 12;
               break;
            case 50:
               var10000 = 24;
               break;
            case 51:
               var10000 = 109;
               break;
            case 52:
               var10000 = 100;
               break;
            case 53:
               var10000 = 138;
               break;
            case 54:
               var10000 = 143;
               break;
            case 55:
               var10000 = 216;
               break;
            case 56:
               var10000 = 52;
               break;
            case 57:
               var10000 = 104;
               break;
            case 58:
               var10000 = 133;
               break;
            case 59:
               var10000 = 105;
               break;
            case 60:
               var10000 = 22;
               break;
            case 61:
               var10000 = 236;
               break;
            case 62:
               var10000 = 56;
               break;
            case 63:
               var10000 = 186;
               break;
            case 64:
               var10000 = 49;
               break;
            case 65:
               var10000 = 196;
               break;
            case 66:
               var10000 = 3;
               break;
            case 67:
               var10000 = 28;
               break;
            case 68:
               var10000 = 255;
               break;
            case 69:
               var10000 = 242;
               break;
            case 70:
               var10000 = 65;
               break;
            case 71:
               var10000 = 7;
               break;
            case 72:
               var10000 = 210;
               break;
            case 73:
               var10000 = 140;
               break;
            case 74:
               var10000 = 130;
               break;
            case 75:
               var10000 = 251;
               break;
            case 76:
               var10000 = 222;
               break;
            case 77:
               var10000 = 112;
               break;
            case 78:
               var10000 = 17;
               break;
            case 79:
               var10000 = 71;
               break;
            case 80:
               var10000 = 30;
               break;
            case 81:
               var10000 = 50;
               break;
            case 82:
               var10000 = 41;
               break;
            case 83:
               var10000 = 156;
               break;
            case 84:
               var10000 = 148;
               break;
            case 85:
               var10000 = 152;
               break;
            case 86:
               var10000 = 212;
               break;
            case 87:
               var10000 = 60;
               break;
            case 88:
               var10000 = 206;
               break;
            case 89:
               var10000 = 55;
               break;
            case 90:
               var10000 = 13;
               break;
            case 91:
               var10000 = 40;
               break;
            case 92:
               var10000 = 121;
               break;
            case 93:
               var10000 = 171;
               break;
            case 94:
               var10000 = 248;
               break;
            case 95:
               var10000 = 160;
               break;
            case 96:
               var10000 = 119;
               break;
            case 97:
               var10000 = 237;
               break;
            case 98:
               var10000 = 238;
               break;
            case 99:
               var10000 = 166;
               break;
            case 100:
               var10000 = 84;
               break;
            case 101:
               var10000 = 81;
               break;
            case 102:
               var10000 = 233;
               break;
            case 103:
               var10000 = 110;
               break;
            case 104:
               var10000 = 199;
               break;
            case 105:
               var10000 = 247;
               break;
            case 106:
               var10000 = 128;
               break;
            case 107:
               var10000 = 14;
               break;
            case 108:
               var10000 = 217;
               break;
            case 109:
               var10000 = 153;
               break;
            case 110:
               var10000 = 115;
               break;
            case 111:
               var10000 = 58;
               break;
            case 112:
               var10000 = 54;
               break;
            case 113:
               var10000 = 0;
               break;
            case 114:
               var10000 = 159;
               break;
            case 115:
               var10000 = 137;
               break;
            case 116:
               var10000 = 179;
               break;
            case 117:
               var10000 = 168;
               break;
            case 118:
               var10000 = 200;
               break;
            case 119:
               var10000 = 78;
               break;
            case 120:
               var10000 = 99;
               break;
            case 121:
               var10000 = 61;
               break;
            case 122:
               var10000 = 80;
               break;
            case 123:
               var10000 = 252;
               break;
            case 124:
               var10000 = 142;
               break;
            case 125:
               var10000 = 27;
               break;
            case 126:
               var10000 = 224;
               break;
            case 127:
               var10000 = 26;
               break;
            case 128:
               var10000 = 147;
               break;
            case 129:
               var10000 = 161;
               break;
            case 130:
               var10000 = 37;
               break;
            case 131:
               var10000 = 91;
               break;
            case 132:
               var10000 = 118;
               break;
            case 133:
               var10000 = 18;
               break;
            case 134:
               var10000 = 64;
               break;
            case 135:
               var10000 = 219;
               break;
            case 136:
               var10000 = 203;
               break;
            case 137:
               var10000 = 9;
               break;
            case 138:
               var10000 = 125;
               break;
            case 139:
               var10000 = 229;
               break;
            case 140:
               var10000 = 240;
               break;
            case 141:
               var10000 = 250;
               break;
            case 142:
               var10000 = 215;
               break;
            case 143:
               var10000 = 244;
               break;
            case 144:
               var10000 = 5;
               break;
            case 145:
               var10000 = 181;
               break;
            case 146:
               var10000 = 103;
               break;
            case 147:
               var10000 = 157;
               break;
            case 148:
               var10000 = 245;
               break;
            case 149:
               var10000 = 77;
               break;
            case 150:
               var10000 = 108;
               break;
            case 151:
               var10000 = 162;
               break;
            case 152:
               var10000 = 116;
               break;
            case 153:
               var10000 = 176;
               break;
            case 154:
               var10000 = 204;
               break;
            case 155:
               var10000 = 197;
               break;
            case 156:
               var10000 = 90;
               break;
            case 157:
               var10000 = 214;
               break;
            case 158:
               var10000 = 205;
               break;
            case 159:
               var10000 = 39;
               break;
            case 160:
               var10000 = 102;
               break;
            case 161:
               var10000 = 126;
               break;
            case 162:
               var10000 = 226;
               break;
            case 163:
               var10000 = 113;
               break;
            case 164:
               var10000 = 32;
               break;
            case 165:
               var10000 = 124;
               break;
            case 166:
               var10000 = 139;
               break;
            case 167:
               var10000 = 180;
               break;
            case 168:
               var10000 = 19;
               break;
            case 169:
               var10000 = 96;
               break;
            case 170:
               var10000 = 249;
               break;
            case 171:
               var10000 = 228;
               break;
            case 172:
               var10000 = 192;
               break;
            case 173:
               var10000 = 15;
               break;
            case 174:
               var10000 = 127;
               break;
            case 175:
               var10000 = 198;
               break;
            case 176:
               var10000 = 174;
               break;
            case 177:
               var10000 = 170;
               break;
            case 178:
               var10000 = 202;
               break;
            case 179:
               var10000 = 221;
               break;
            case 180:
               var10000 = 123;
               break;
            case 181:
               var10000 = 97;
               break;
            case 182:
               var10000 = 57;
               break;
            case 183:
               var10000 = 172;
               break;
            case 184:
               var10000 = 177;
               break;
            case 185:
               var10000 = 70;
               break;
            case 186:
               var10000 = 48;
               break;
            case 187:
               var10000 = 21;
               break;
            case 188:
               var10000 = 72;
               break;
            case 189:
               var10000 = 151;
               break;
            case 190:
               var10000 = 183;
               break;
            case 191:
               var10000 = 36;
               break;
            case 192:
               var10000 = 83;
               break;
            case 193:
               var10000 = 117;
               break;
            case 194:
               var10000 = 201;
               break;
            case 195:
               var10000 = 107;
               break;
            case 196:
               var10000 = 132;
               break;
            case 197:
               var10000 = 11;
               break;
            case 198:
               var10000 = 62;
               break;
            case 199:
               var10000 = 86;
               break;
            case 200:
               var10000 = 253;
               break;
            case 201:
               var10000 = 246;
               break;
            case 202:
               var10000 = 95;
               break;
            case 203:
               var10000 = 163;
               break;
            case 204:
               var10000 = 25;
               break;
            case 205:
               var10000 = 4;
               break;
            case 206:
               var10000 = 165;
               break;
            case 207:
               var10000 = 63;
               break;
            case 208:
               var10000 = 93;
               break;
            case 209:
               var10000 = 211;
               break;
            case 210:
               var10000 = 145;
               break;
            case 211:
               var10000 = 42;
               break;
            case 212:
               var10000 = 35;
               break;
            case 213:
               var10000 = 254;
               break;
            case 214:
               var10000 = 73;
               break;
            case 215:
               var10000 = 169;
               break;
            case 216:
               var10000 = 43;
               break;
            case 217:
               var10000 = 218;
               break;
            case 218:
               var10000 = 16;
               break;
            case 219:
               var10000 = 23;
               break;
            case 220:
               var10000 = 134;
               break;
            case 221:
               var10000 = 178;
               break;
            case 222:
               var10000 = 74;
               break;
            case 223:
               var10000 = 232;
               break;
            case 224:
               var10000 = 213;
               break;
            case 225:
               var10000 = 2;
               break;
            case 226:
               var10000 = 155;
               break;
            case 227:
               var10000 = 94;
               break;
            case 228:
               var10000 = 208;
               break;
            case 229:
               var10000 = 190;
               break;
            case 230:
               var10000 = 241;
               break;
            case 231:
               var10000 = 185;
               break;
            case 232:
               var10000 = 79;
               break;
            case 233:
               var10000 = 46;
               break;
            case 234:
               var10000 = 47;
               break;
            case 235:
               var10000 = 182;
               break;
            case 236:
               var10000 = 31;
               break;
            case 237:
               var10000 = 154;
               break;
            case 238:
               var10000 = 141;
               break;
            case 239:
               var10000 = 225;
               break;
            case 240:
               var10000 = 167;
               break;
            case 241:
               var10000 = 44;
               break;
            case 242:
               var10000 = 173;
               break;
            case 243:
               var10000 = 89;
               break;
            case 244:
               var10000 = 33;
               break;
            case 245:
               var10000 = 230;
               break;
            case 246:
               var10000 = 6;
               break;
            case 247:
               var10000 = 67;
               break;
            case 248:
               var10000 = 191;
               break;
            case 249:
               var10000 = 235;
               break;
            case 250:
               var10000 = 45;
               break;
            case 251:
               var10000 = 101;
               break;
            case 252:
               var10000 = 243;
               break;
            case 253:
               var10000 = 111;
               break;
            case 254:
               var10000 = 76;
               break;
            default:
               var10000 = 223;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var25;
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "}\u001d\u008fÉ\u001e\u008eÍäh\u007fV\b\u0093²JzCpsâ;íR\u0090·\u0085iã\u0095HJ%t\u0080UµJ¤fo\u0091\u007f\u001b\u0007,ûº\u0081\u008cd|\u0001oÖ\u0085Ó\u0095E\u0012dx\f\u0018\u0007\u008aÜ7\u0000®¼º¨Èe·\u0001\u0087t\u0088O'\u00133\u009bÆÕ\u0090Øk\u0016cÊ2ò\u009eõW÷:ET\u0080\u0089*\u001c\u009f\r«ÔYTÃs\u0019Ä%\u0013N\u009e\u008b";
      int var8 = "}\u001d\u008fÉ\u001e\u008eÍäh\u007fV\b\u0093²JzCpsâ;íR\u0090·\u0085iã\u0095HJ%t\u0080UµJ¤fo\u0091\u007f\u001b\u0007,ûº\u0081\u008cd|\u0001oÖ\u0085Ó\u0095E\u0012dx\f\u0018\u0007\u008aÜ7\u0000®¼º¨Èe·\u0001\u0087t\u0088O'\u00133\u009bÆÕ\u0090Øk\u0016cÊ2ò\u009eõW÷:ET\u0080\u0089*\u001c\u009f\r«ÔYTÃs\u0019Ä%\u0013N\u009e\u008b"
         .length();
      V(null);
      char var5 = 11;
      int var12 = -1;

      label52:
      while (true) {
         byte var10000 = 109;
         String var10001 = var6.substring(++var12, var12 + var5);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var30 = var10001.toCharArray();
               int var10004 = var30.length;
               int var10 = 0;
               byte var33 = var10000;
               var25 = var30;
               int var18 = var10004;
               byte var38;
               char[] var42;
               int var10006;
               if (var10004 <= 1) {
                  var42 = var30;
                  var38 = var10000;
                  var10006 = var10;
               } else {
                  var33 = var10000;
                  var18 = var10004;
                  if (var10004 <= var10) {
                     break label47;
                  }

                  var42 = var30;
                  var38 = var10000;
                  var10006 = var10;
               }

               while (true) {
                  char var51 = var42[var10006];
                  byte var52;
                  switch (var10 % 7) {
                     case 0:
                        var52 = 102;
                        break;
                     case 1:
                        var52 = 63;
                        break;
                     case 2:
                        var52 = 122;
                        break;
                     case 3:
                        var52 = 86;
                        break;
                     case 4:
                        var52 = 56;
                        break;
                     case 5:
                        var52 = 29;
                        break;
                     default:
                        var52 = 66;
                  }

                  var42[var10006] = (char)(var51 ^ var38 ^ var52);
                  var10++;
                  if (var33 == 0) {
                     var10006 = var33;
                     var42 = var25;
                     var38 = var33;
                  } else {
                     if (var18 <= var10) {
                        break;
                     }

                     var42 = var25;
                     var38 = var33;
                     var10006 = var10;
                  }
               }
            }

            String var35 = new String(var25).intern();
            switch (var10002) {
               case 0:
                  var9[var7++] = var35;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[6];
                     long var2 = 5937570077755257327L;
                     long var29 = 5937570077755257907L ^ var2;
                     byte var20 = -1;
                     long var0 = var29;
                     p = TimeUnit.MILLISECONDS.toNanos(var0);
                     h = LoggerFactory.getLogger(Wq2_2.class);
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var35;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label52;
                  }

                  var6 = "T\u009e[_\u009a|ì\u00ad÷±:Cã\u0090IÖÔ\u000b6;ýc\u0081æ7Êé\bÑ\u0090Éîþ\rÉI";
                  var8 = "T\u009e[_\u009a|ì\u00ad÷±:Cã\u0090IÖÔ\u000b6;ýc\u0081æ7Êé\bÑ\u0090Éîþ\rÉI".length();
                  var5 = 27;
                  var12 = -1;
            }

            var10000 = 46;
            var10001 = var6.substring(++var12, var12 + var5);
            var10002 = 0;
         }
      }
   }
}





