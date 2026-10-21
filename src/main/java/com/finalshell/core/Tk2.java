package com.finalshell.core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class Tk2 extends T4 {
   public Map I = new WeakHashMap();
   public float w = 0.0F;
   public static boolean l;
   public static String[] a;
   public static String[] b;

   public float w() {
      return this.w;
   }

   public void C(float var1) {
      this.w = var1;
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
      // 00: invokestatic com/finalshell/core/Tk2.Q ()Z
      // 03: aload 2
      // 04: checkcast java/lang/String
      // 07: astore 4
      // 09: istore 3
      // 0a: aload 4
      // 0c: iload 3
      // 0d: ifeq 1c
      // 10: ifnull 7c
      // 13: goto 1a
      // 16: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 4
      // 1c: iload 3
      // 1d: ifeq 9d
      // 20: sipush -13680
      // 23: sipush -8603
      // 26: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 29: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c: ifne 91
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: aload 4
      // 38: iload 3
      // 39: ifeq 9d
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: sipush -13677
      // 46: sipush -5287
      // 49: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 4c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4f: ifne 91
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58: athrow
      // 59: aload 4
      // 5b: iload 3
      // 5c: ifeq 9d
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 65: athrow
      // 66: sipush -13675
      // 69: sipush -20818
      // 6c: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 6f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 72: ifne 91
      // 75: goto 7c
      // 78: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b: athrow
      // 7c: new java/lang/IllegalArgumentException
      // 7f: dup
      // 80: sipush -13679
      // 83: sipush 5654
      // 86: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 89: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 8c: athrow
      // 8d: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 90: athrow
      // 91: aload 0
      // 92: getfield com/finalshell/core/Tk2.I Ljava/util/Map;
      // 95: aload 1
      // 96: aload 4
      // 98: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 9d: pop
      // 9e: return
   }

   @Override
   public void F(Component var1) {
      this.I.remove(var1);
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      boolean var10000 = B();
      int var3 = 0;
      boolean var2 = var10000;
      int var4 = 0;

      for (Entry var6 : this.I.entrySet()) {
         Dimension var7 = ((Component)var6.getKey()).getPreferredSize();
         var3 = Math.max(var7.width, var3);
         var4 = Math.max(var7.height, var4);
         if (var2) {
            break;
         }
      }

      Insets var8 = var1.getInsets();
      return new Dimension(var8.left + var3 * 2 + var8.right, var8.top + var4 + var8.bottom);
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
      // 000: invokestatic com/finalshell/core/Tk2.B ()Z
      // 003: aload 1
      // 004: invokevirtual java/awt/Container.getComponentOrientation ()Ljava/awt/ComponentOrientation;
      // 007: invokevirtual java/awt/ComponentOrientation.isLeftToRight ()Z
      // 00a: istore 3
      // 00b: aload 1
      // 00c: invokevirtual java/awt/Container.getInsets ()Ljava/awt/Insets;
      // 00f: astore 4
      // 011: aload 1
      // 012: invokevirtual java/awt/Container.getWidth ()I
      // 015: aload 4
      // 017: getfield java/awt/Insets.left I
      // 01a: isub
      // 01b: aload 4
      // 01d: getfield java/awt/Insets.right I
      // 020: isub
      // 021: istore 5
      // 023: istore 2
      // 024: iload 5
      // 026: bipush 2
      // 027: idiv
      // 028: istore 6
      // 02a: aload 1
      // 02b: invokevirtual java/awt/Container.getHeight ()I
      // 02e: aload 4
      // 030: getfield java/awt/Insets.top I
      // 033: isub
      // 034: aload 4
      // 036: getfield java/awt/Insets.bottom I
      // 039: isub
      // 03a: istore 7
      // 03c: aload 4
      // 03e: getfield java/awt/Insets.left I
      // 041: istore 8
      // 043: iload 8
      // 045: iload 5
      // 047: bipush 2
      // 048: idiv
      // 049: iadd
      // 04a: istore 9
      // 04c: aload 4
      // 04e: getfield java/awt/Insets.top I
      // 051: istore 10
      // 053: aload 0
      // 054: getfield com/finalshell/core/Tk2.I Ljava/util/Map;
      // 057: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 05c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 061: astore 11
      // 063: aload 11
      // 065: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06a: ifeq 219
      // 06d: aload 11
      // 06f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 074: checkcast java/util/Map$Entry
      // 077: astore 12
      // 079: aload 12
      // 07b: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 080: checkcast java/lang/String
      // 083: astore 13
      // 085: aload 13
      // 087: sipush -13674
      // 08a: sipush 32602
      // 08d: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 090: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 093: iload 2
      // 094: ifne 0fd
      // 097: ifeq 0f5
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a0: athrow
      // 0a1: iload 3
      // 0a2: iload 2
      // 0a3: ifne 0ce
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ac: athrow
      // 0ad: ifeq 0cc
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b6: athrow
      // 0b7: iload 8
      // 0b9: aload 0
      // 0ba: getfield com/finalshell/core/Tk2.w F
      // 0bd: iload 6
      // 0bf: i2f
      // 0c0: fmul
      // 0c1: invokestatic java/lang/Math.round (F)I
      // 0c4: iadd
      // 0c5: goto 0da
      // 0c8: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cb: athrow
      // 0cc: iload 9
      // 0ce: aload 0
      // 0cf: getfield com/finalshell/core/Tk2.w F
      // 0d2: iload 6
      // 0d4: i2f
      // 0d5: fmul
      // 0d6: invokestatic java/lang/Math.round (F)I
      // 0d9: isub
      // 0da: istore 14
      // 0dc: aload 12
      // 0de: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0e3: checkcast java/awt/Component
      // 0e6: iload 14
      // 0e8: iload 10
      // 0ea: iload 6
      // 0ec: iload 7
      // 0ee: invokevirtual java/awt/Component.setBounds (IIII)V
      // 0f1: iload 2
      // 0f2: ifeq 215
      // 0f5: iload 3
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ifne 136
      // 101: ifeq 12e
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10a: athrow
      // 10b: aload 13
      // 10d: iload 2
      // 10e: ifne 175
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 117: athrow
      // 118: sipush -13678
      // 11b: sipush 28166
      // 11e: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 121: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 124: ifne 167
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12d: athrow
      // 12e: iload 3
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 135: athrow
      // 136: iload 2
      // 137: ifne 18f
      // 13a: ifne 187
      // 13d: goto 144
      // 140: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 143: athrow
      // 144: aload 13
      // 146: sipush -13673
      // 149: sipush -8304
      // 14c: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 14f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 152: iload 2
      // 153: ifne 18f
      // 156: goto 15d
      // 159: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15c: athrow
      // 15d: ifeq 187
      // 160: goto 167
      // 163: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 166: athrow
      // 167: aload 12
      // 169: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 16e: goto 175
      // 171: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 174: athrow
      // 175: checkcast java/awt/Component
      // 178: iload 8
      // 17a: iload 10
      // 17c: iload 6
      // 17e: iload 7
      // 180: invokevirtual java/awt/Component.setBounds (IIII)V
      // 183: iload 2
      // 184: ifeq 215
      // 187: iload 3
      // 188: goto 18f
      // 18b: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18e: athrow
      // 18f: iload 2
      // 190: ifne 1c8
      // 193: ifeq 1c0
      // 196: goto 19d
      // 199: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19c: athrow
      // 19d: aload 13
      // 19f: iload 2
      // 1a0: ifne 207
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a9: athrow
      // 1aa: sipush -13677
      // 1ad: sipush -5287
      // 1b0: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 1b3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b6: ifne 1f9
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bf: athrow
      // 1c0: iload 3
      // 1c1: goto 1c8
      // 1c4: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c7: athrow
      // 1c8: iload 2
      // 1c9: ifne 1f6
      // 1cc: ifne 215
      // 1cf: goto 1d6
      // 1d2: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d5: athrow
      // 1d6: aload 13
      // 1d8: iload 2
      // 1d9: ifne 207
      // 1dc: goto 1e3
      // 1df: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e2: athrow
      // 1e3: sipush -13680
      // 1e6: sipush -8603
      // 1e9: invokestatic com/finalshell/core/Tk2.a (II)Ljava/lang/String;
      // 1ec: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f5: athrow
      // 1f6: ifeq 215
      // 1f9: aload 12
      // 1fb: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 200: goto 207
      // 203: invokestatic com/finalshell/core/Tk2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 206: athrow
      // 207: checkcast java/awt/Component
      // 20a: iload 9
      // 20c: iload 10
      // 20e: iload 6
      // 210: iload 7
      // 212: invokevirtual java/awt/Component.setBounds (IIII)V
      // 215: iload 2
      // 216: ifeq 063
      // 219: return
   }

   public static void U(boolean var0) {
      l = var0;
   }

   public static boolean B() {
      return l;
   }

   public static boolean Q() {
      boolean var0 = B();

      try {
         return !var0;
      } catch (IllegalArgumentException var1) {
         throw a(var1);
      }
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -13677) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 99;
               break;
            case 1:
               var10000 = 56;
               break;
            case 2:
               var10000 = 77;
               break;
            case 3:
               var10000 = 165;
               break;
            case 4:
               var10000 = 69;
               break;
            case 5:
               var10000 = 116;
               break;
            case 6:
               var10000 = 237;
               break;
            case 7:
               var10000 = 55;
               break;
            case 8:
               var10000 = 97;
               break;
            case 9:
               var10000 = 155;
               break;
            case 10:
               var10000 = 6;
               break;
            case 11:
               var10000 = 60;
               break;
            case 12:
               var10000 = 189;
               break;
            case 13:
               var10000 = 180;
               break;
            case 14:
               var10000 = 125;
               break;
            case 15:
               var10000 = 105;
               break;
            case 16:
               var10000 = 87;
               break;
            case 17:
               var10000 = 213;
               break;
            case 18:
               var10000 = 34;
               break;
            case 19:
               var10000 = 185;
               break;
            case 20:
               var10000 = 118;
               break;
            case 21:
               var10000 = 85;
               break;
            case 22:
               var10000 = 7;
               break;
            case 23:
               var10000 = 119;
               break;
            case 24:
               var10000 = 82;
               break;
            case 25:
               var10000 = 203;
               break;
            case 26:
               var10000 = 253;
               break;
            case 27:
               var10000 = 37;
               break;
            case 28:
               var10000 = 141;
               break;
            case 29:
               var10000 = 227;
               break;
            case 30:
               var10000 = 140;
               break;
            case 31:
               var10000 = 80;
               break;
            case 32:
               var10000 = 191;
               break;
            case 33:
               var10000 = 25;
               break;
            case 34:
               var10000 = 138;
               break;
            case 35:
               var10000 = 9;
               break;
            case 36:
               var10000 = 220;
               break;
            case 37:
               var10000 = 195;
               break;
            case 38:
               var10000 = 121;
               break;
            case 39:
               var10000 = 211;
               break;
            case 40:
               var10000 = 162;
               break;
            case 41:
               var10000 = 247;
               break;
            case 42:
               var10000 = 187;
               break;
            case 43:
               var10000 = 232;
               break;
            case 44:
               var10000 = 96;
               break;
            case 45:
               var10000 = 190;
               break;
            case 46:
               var10000 = 126;
               break;
            case 47:
               var10000 = 219;
               break;
            case 48:
               var10000 = 204;
               break;
            case 49:
               var10000 = 68;
               break;
            case 50:
               var10000 = 72;
               break;
            case 51:
               var10000 = 18;
               break;
            case 52:
               var10000 = 42;
               break;
            case 53:
               var10000 = 45;
               break;
            case 54:
               var10000 = 93;
               break;
            case 55:
               var10000 = 24;
               break;
            case 56:
               var10000 = 102;
               break;
            case 57:
               var10000 = 170;
               break;
            case 58:
               var10000 = 150;
               break;
            case 59:
               var10000 = 117;
               break;
            case 60:
               var10000 = 132;
               break;
            case 61:
               var10000 = 200;
               break;
            case 62:
               var10000 = 5;
               break;
            case 63:
               var10000 = 223;
               break;
            case 64:
               var10000 = 8;
               break;
            case 65:
               var10000 = 252;
               break;
            case 66:
               var10000 = 207;
               break;
            case 67:
               var10000 = 210;
               break;
            case 68:
               var10000 = 233;
               break;
            case 69:
               var10000 = 188;
               break;
            case 70:
               var10000 = 21;
               break;
            case 71:
               var10000 = 67;
               break;
            case 72:
               var10000 = 199;
               break;
            case 73:
               var10000 = 0;
               break;
            case 74:
               var10000 = 63;
               break;
            case 75:
               var10000 = 110;
               break;
            case 76:
               var10000 = 172;
               break;
            case 77:
               var10000 = 38;
               break;
            case 78:
               var10000 = 10;
               break;
            case 79:
               var10000 = 135;
               break;
            case 80:
               var10000 = 75;
               break;
            case 81:
               var10000 = 240;
               break;
            case 82:
               var10000 = 86;
               break;
            case 83:
               var10000 = 153;
               break;
            case 84:
               var10000 = 41;
               break;
            case 85:
               var10000 = 148;
               break;
            case 86:
               var10000 = 26;
               break;
            case 87:
               var10000 = 161;
               break;
            case 88:
               var10000 = 238;
               break;
            case 89:
               var10000 = 245;
               break;
            case 90:
               var10000 = 222;
               break;
            case 91:
               var10000 = 234;
               break;
            case 92:
               var10000 = 111;
               break;
            case 93:
               var10000 = 157;
               break;
            case 94:
               var10000 = 47;
               break;
            case 95:
               var10000 = 79;
               break;
            case 96:
               var10000 = 214;
               break;
            case 97:
               var10000 = 92;
               break;
            case 98:
               var10000 = 12;
               break;
            case 99:
               var10000 = 154;
               break;
            case 100:
               var10000 = 136;
               break;
            case 101:
               var10000 = 46;
               break;
            case 102:
               var10000 = 206;
               break;
            case 103:
               var10000 = 120;
               break;
            case 104:
               var10000 = 244;
               break;
            case 105:
               var10000 = 164;
               break;
            case 106:
               var10000 = 89;
               break;
            case 107:
               var10000 = 179;
               break;
            case 108:
               var10000 = 226;
               break;
            case 109:
               var10000 = 76;
               break;
            case 110:
               var10000 = 249;
               break;
            case 111:
               var10000 = 215;
               break;
            case 112:
               var10000 = 156;
               break;
            case 113:
               var10000 = 84;
               break;
            case 114:
               var10000 = 11;
               break;
            case 115:
               var10000 = 17;
               break;
            case 116:
               var10000 = 61;
               break;
            case 117:
               var10000 = 44;
               break;
            case 118:
               var10000 = 202;
               break;
            case 119:
               var10000 = 16;
               break;
            case 120:
               var10000 = 124;
               break;
            case 121:
               var10000 = 217;
               break;
            case 122:
               var10000 = 230;
               break;
            case 123:
               var10000 = 163;
               break;
            case 124:
               var10000 = 152;
               break;
            case 125:
               var10000 = 216;
               break;
            case 126:
               var10000 = 27;
               break;
            case 127:
               var10000 = 15;
               break;
            case 128:
               var10000 = 40;
               break;
            case 129:
               var10000 = 74;
               break;
            case 130:
               var10000 = 184;
               break;
            case 131:
               var10000 = 197;
               break;
            case 132:
               var10000 = 115;
               break;
            case 133:
               var10000 = 70;
               break;
            case 134:
               var10000 = 4;
               break;
            case 135:
               var10000 = 39;
               break;
            case 136:
               var10000 = 109;
               break;
            case 137:
               var10000 = 54;
               break;
            case 138:
               var10000 = 194;
               break;
            case 139:
               var10000 = 19;
               break;
            case 140:
               var10000 = 193;
               break;
            case 141:
               var10000 = 221;
               break;
            case 142:
               var10000 = 65;
               break;
            case 143:
               var10000 = 131;
               break;
            case 144:
               var10000 = 173;
               break;
            case 145:
               var10000 = 251;
               break;
            case 146:
               var10000 = 129;
               break;
            case 147:
               var10000 = 169;
               break;
            case 148:
               var10000 = 43;
               break;
            case 149:
               var10000 = 182;
               break;
            case 150:
               var10000 = 243;
               break;
            case 151:
               var10000 = 246;
               break;
            case 152:
               var10000 = 186;
               break;
            case 153:
               var10000 = 71;
               break;
            case 154:
               var10000 = 145;
               break;
            case 155:
               var10000 = 20;
               break;
            case 156:
               var10000 = 106;
               break;
            case 157:
               var10000 = 137;
               break;
            case 158:
               var10000 = 73;
               break;
            case 159:
               var10000 = 239;
               break;
            case 160:
               var10000 = 81;
               break;
            case 161:
               var10000 = 225;
               break;
            case 162:
               var10000 = 64;
               break;
            case 163:
               var10000 = 51;
               break;
            case 164:
               var10000 = 49;
               break;
            case 165:
               var10000 = 254;
               break;
            case 166:
               var10000 = 28;
               break;
            case 167:
               var10000 = 88;
               break;
            case 168:
               var10000 = 57;
               break;
            case 169:
               var10000 = 100;
               break;
            case 170:
               var10000 = 201;
               break;
            case 171:
               var10000 = 178;
               break;
            case 172:
               var10000 = 66;
               break;
            case 173:
               var10000 = 176;
               break;
            case 174:
               var10000 = 196;
               break;
            case 175:
               var10000 = 95;
               break;
            case 176:
               var10000 = 235;
               break;
            case 177:
               var10000 = 231;
               break;
            case 178:
               var10000 = 192;
               break;
            case 179:
               var10000 = 104;
               break;
            case 180:
               var10000 = 205;
               break;
            case 181:
               var10000 = 175;
               break;
            case 182:
               var10000 = 183;
               break;
            case 183:
               var10000 = 108;
               break;
            case 184:
               var10000 = 198;
               break;
            case 185:
               var10000 = 160;
               break;
            case 186:
               var10000 = 177;
               break;
            case 187:
               var10000 = 166;
               break;
            case 188:
               var10000 = 50;
               break;
            case 189:
               var10000 = 114;
               break;
            case 190:
               var10000 = 103;
               break;
            case 191:
               var10000 = 146;
               break;
            case 192:
               var10000 = 14;
               break;
            case 193:
               var10000 = 209;
               break;
            case 194:
               var10000 = 112;
               break;
            case 195:
               var10000 = 53;
               break;
            case 196:
               var10000 = 31;
               break;
            case 197:
               var10000 = 35;
               break;
            case 198:
               var10000 = 30;
               break;
            case 199:
               var10000 = 144;
               break;
            case 200:
               var10000 = 83;
               break;
            case 201:
               var10000 = 224;
               break;
            case 202:
               var10000 = 142;
               break;
            case 203:
               var10000 = 159;
               break;
            case 204:
               var10000 = 1;
               break;
            case 205:
               var10000 = 59;
               break;
            case 206:
               var10000 = 228;
               break;
            case 207:
               var10000 = 90;
               break;
            case 208:
               var10000 = 248;
               break;
            case 209:
               var10000 = 123;
               break;
            case 210:
               var10000 = 151;
               break;
            case 211:
               var10000 = 127;
               break;
            case 212:
               var10000 = 91;
               break;
            case 213:
               var10000 = 52;
               break;
            case 214:
               var10000 = 139;
               break;
            case 215:
               var10000 = 229;
               break;
            case 216:
               var10000 = 2;
               break;
            case 217:
               var10000 = 167;
               break;
            case 218:
               var10000 = 174;
               break;
            case 219:
               var10000 = 236;
               break;
            case 220:
               var10000 = 143;
               break;
            case 221:
               var10000 = 113;
               break;
            case 222:
               var10000 = 36;
               break;
            case 223:
               var10000 = 62;
               break;
            case 224:
               var10000 = 133;
               break;
            case 225:
               var10000 = 171;
               break;
            case 226:
               var10000 = 208;
               break;
            case 227:
               var10000 = 181;
               break;
            case 228:
               var10000 = 94;
               break;
            case 229:
               var10000 = 22;
               break;
            case 230:
               var10000 = 242;
               break;
            case 231:
               var10000 = 128;
               break;
            case 232:
               var10000 = 48;
               break;
            case 233:
               var10000 = 98;
               break;
            case 234:
               var10000 = 241;
               break;
            case 235:
               var10000 = 107;
               break;
            case 236:
               var10000 = 78;
               break;
            case 237:
               var10000 = 122;
               break;
            case 238:
               var10000 = 33;
               break;
            case 239:
               var10000 = 23;
               break;
            case 240:
               var10000 = 32;
               break;
            case 241:
               var10000 = 3;
               break;
            case 242:
               var10000 = 250;
               break;
            case 243:
               var10000 = 218;
               break;
            case 244:
               var10000 = 147;
               break;
            case 245:
               var10000 = 255;
               break;
            case 246:
               var10000 = 58;
               break;
            case 247:
               var10000 = 130;
               break;
            case 248:
               var10000 = 149;
               break;
            case 249:
               var10000 = 13;
               break;
            case 250:
               var10000 = 101;
               break;
            case 251:
               var10000 = 168;
               break;
            case 252:
               var10000 = 134;
               break;
            case 253:
               var10000 = 29;
               break;
            case 254:
               var10000 = 212;
               break;
            default:
               var10000 = 158;
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
      String[] var5 = new String[7];
      int var3 = 0;
      String var2 = "¸M\t&f\u0004\u0084IR7H_\u0001ï¤\u008d\u0088Õ`\fdî¬]\u0089¯\u0082,Õ\u001a\u0087dÀd\u0012J\u000fUHÛª\u0019Â\u001c\u0004\u0014ÙÛGD\u0015M\u008a+!§:á}\u001eÝ¿¥xó¢IZR\u009b\u000b\u0087\u009a)±\u0019O4\u0005\"õük\u0004ëå¿¢\u0005\u0016¢ÜÛÜ";
      int var4 = "¸M\t&f\u0004\u0084IR7H_\u0001ï¤\u008d\u0088Õ`\fdî¬]\u0089¯\u0082,Õ\u001a\u0087dÀd\u0012J\u000fUHÛª\u0019Â\u001c\u0004\u0014ÙÛGD\u0015M\u008a+!§:á}\u001eÝ¿¥xó¢IZR\u009b\u000b\u0087\u009a)±\u0019O4\u0005\"õük\u0004ëå¿¢\u0005\u0016¢ÜÛÜ"
         .length();
      char var1 = 5;
      int var8 = -1;
      U(false);

      label52:
      while (true) {
         byte var10000 = 127;
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
                        var46 = 93;
                        break;
                     case 1:
                        var46 = 33;
                        break;
                     case 2:
                        var46 = 122;
                        break;
                     case 3:
                        var46 = 19;
                        break;
                     case 4:
                        var46 = 99;
                        break;
                     case 5:
                        var46 = 57;
                        break;
                     default:
                        var46 = 58;
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
                     b = new String[7];
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

                  var2 = "\u001a¬\u0082\u001cº1ÿ\u0007\u0010yÃ¦\u0092fú";
                  var4 = "\u001a¬\u0082\u001cº1ÿ\u0007\u0010yÃ¦\u0092fú".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 93;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





