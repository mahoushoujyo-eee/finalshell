package com.finalshell.core;

import com.finalshell.io.YM3;
import com.finalshell.ui.model.EP;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Type;

public class Hg2 implements Ak2, X4 {
   public static Hg2 w;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static boolean y(java.lang.Class param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: ldc java/awt/Point
      // 07: aload 1
      // 08: ifnull 1f
      // 0b: if_acmpeq 52
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: aload 0
      // 16: ldc java/awt/Rectangle
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 1
      // 20: ifnull 37
      // 23: if_acmpeq 52
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 0
      // 2e: ldc java/awt/Font
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: aload 1
      // 38: ifnull 4f
      // 3b: if_acmpeq 52
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 0
      // 46: ldc java/awt/Color
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: if_acmpne 5a
      // 52: bipush 1
      // 53: goto 5b
      // 56: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: bipush 0
      // 5b: ireturn
   }

   @Override
   public void u(NL3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
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
      // 007: astore 7
      // 009: astore 6
      // 00b: aload 6
      // 00d: ifnull 027
      // 010: aload 2
      // 011: ifnonnull 028
      // 014: goto 01b
      // 017: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: aload 7
      // 01d: invokevirtual com/finalshell/io/YM3.Y ()V
      // 020: goto 027
      // 023: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: return
      // 028: sipush 29601
      // 02b: ldc2_w 1673135259243974211
      // 02e: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 031: istore 8
      // 033: aload 2
      // 034: instanceof java/awt/Point
      // 037: aload 6
      // 039: ifnull 08b
      // 03c: ifeq 080
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: aload 2
      // 047: checkcast java/awt/Point
      // 04a: astore 9
      // 04c: aload 0
      // 04d: aload 7
      // 04f: ldc java/awt/Point
      // 051: iload 8
      // 053: invokevirtual com/finalshell/core/Hg2.W (Lcom/finalshell/io/YM3;Ljava/lang/Class;C)C
      // 056: istore 8
      // 058: aload 7
      // 05a: iload 8
      // 05c: ldc "x"
      // 05e: aload 9
      // 060: getfield java/awt/Point.x I
      // 063: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 066: aload 7
      // 068: sipush 16416
      // 06b: ldc2_w 305322563811556813
      // 06e: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 071: ldc "y"
      // 073: aload 9
      // 075: getfield java/awt/Point.y I
      // 078: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 07b: aload 6
      // 07d: ifnonnull 256
      // 080: aload 2
      // 081: instanceof java/awt/Font
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: aload 6
      // 08d: ifnull 109
      // 090: ifeq 0fe
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: aload 2
      // 09b: checkcast java/awt/Font
      // 09e: astore 9
      // 0a0: aload 0
      // 0a1: aload 7
      // 0a3: ldc java/awt/Font
      // 0a5: iload 8
      // 0a7: invokevirtual com/finalshell/core/Hg2.W (Lcom/finalshell/io/YM3;Ljava/lang/Class;C)C
      // 0aa: istore 8
      // 0ac: aload 7
      // 0ae: iload 8
      // 0b0: sipush 5852
      // 0b3: sipush -10108
      // 0b6: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 0b9: aload 9
      // 0bb: invokevirtual java/awt/Font.getName ()Ljava/lang/String;
      // 0be: invokevirtual com/finalshell/io/YM3.H (CLjava/lang/String;Ljava/lang/String;)V
      // 0c1: aload 7
      // 0c3: sipush 9451
      // 0c6: ldc2_w 7224593862732372224
      // 0c9: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 0cc: sipush 5830
      // 0cf: sipush 6029
      // 0d2: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 0d5: aload 9
      // 0d7: invokevirtual java/awt/Font.getStyle ()I
      // 0da: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 0dd: aload 7
      // 0df: sipush 9451
      // 0e2: ldc2_w 7224593862732372224
      // 0e5: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 0e8: sipush 5827
      // 0eb: sipush -3407
      // 0ee: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 0f1: aload 9
      // 0f3: invokevirtual java/awt/Font.getSize ()I
      // 0f6: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 0f9: aload 6
      // 0fb: ifnonnull 256
      // 0fe: aload 2
      // 0ff: instanceof java/awt/Rectangle
      // 102: goto 109
      // 105: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: aload 6
      // 10b: ifnull 1a1
      // 10e: ifeq 18a
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: aload 2
      // 119: checkcast java/awt/Rectangle
      // 11c: astore 9
      // 11e: aload 0
      // 11f: aload 7
      // 121: ldc java/awt/Rectangle
      // 123: iload 8
      // 125: invokevirtual com/finalshell/core/Hg2.W (Lcom/finalshell/io/YM3;Ljava/lang/Class;C)C
      // 128: istore 8
      // 12a: aload 7
      // 12c: iload 8
      // 12e: ldc "x"
      // 130: aload 9
      // 132: getfield java/awt/Rectangle.x I
      // 135: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 138: aload 7
      // 13a: sipush 9451
      // 13d: ldc2_w 7224593862732372224
      // 140: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 143: ldc "y"
      // 145: aload 9
      // 147: getfield java/awt/Rectangle.y I
      // 14a: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 14d: aload 7
      // 14f: sipush 9451
      // 152: ldc2_w 7224593862732372224
      // 155: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 158: sipush 5844
      // 15b: sipush -30461
      // 15e: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 161: aload 9
      // 163: getfield java/awt/Rectangle.width I
      // 166: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 169: aload 7
      // 16b: sipush 9451
      // 16e: ldc2_w 7224593862732372224
      // 171: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 174: sipush 5842
      // 177: sipush -28216
      // 17a: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 17d: aload 9
      // 17f: getfield java/awt/Rectangle.height I
      // 182: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 185: aload 6
      // 187: ifnonnull 256
      // 18a: aload 2
      // 18b: aload 6
      // 18d: ifnull 1a5
      // 190: goto 197
      // 193: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 196: athrow
      // 197: instanceof java/awt/Color
      // 19a: goto 1a1
      // 19d: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: ifeq 22a
      // 1a4: aload 2
      // 1a5: checkcast java/awt/Color
      // 1a8: astore 9
      // 1aa: aload 0
      // 1ab: aload 7
      // 1ad: ldc java/awt/Color
      // 1af: iload 8
      // 1b1: invokevirtual com/finalshell/core/Hg2.W (Lcom/finalshell/io/YM3;Ljava/lang/Class;C)C
      // 1b4: istore 8
      // 1b6: aload 7
      // 1b8: iload 8
      // 1ba: ldc "r"
      // 1bc: aload 9
      // 1be: invokevirtual java/awt/Color.getRed ()I
      // 1c1: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 1c4: aload 7
      // 1c6: sipush 9451
      // 1c9: ldc2_w 7224593862732372224
      // 1cc: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 1cf: ldc "g"
      // 1d1: aload 9
      // 1d3: invokevirtual java/awt/Color.getGreen ()I
      // 1d6: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 1d9: aload 7
      // 1db: sipush 9451
      // 1de: ldc2_w 7224593862732372224
      // 1e1: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 1e4: ldc "b"
      // 1e6: aload 9
      // 1e8: invokevirtual java/awt/Color.getBlue ()I
      // 1eb: aload 6
      // 1ed: ifnull 222
      // 1f0: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 1f3: aload 9
      // 1f5: invokevirtual java/awt/Color.getAlpha ()I
      // 1f8: ifle 225
      // 1fb: goto 202
      // 1fe: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 7
      // 204: sipush 9451
      // 207: ldc2_w 7224593862732372224
      // 20a: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 20d: sipush 5825
      // 210: sipush -3995
      // 213: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 216: aload 9
      // 218: invokevirtual java/awt/Color.getAlpha ()I
      // 21b: goto 222
      // 21e: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 221: athrow
      // 222: invokevirtual com/finalshell/io/YM3.D (CLjava/lang/String;I)V
      // 225: aload 6
      // 227: ifnonnull 256
      // 22a: new com/finalshell/core/Hi2
      // 22d: dup
      // 22e: new java/lang/StringBuilder
      // 231: dup
      // 232: invokespecial java/lang/StringBuilder.<init> ()V
      // 235: sipush 5849
      // 238: sipush 2359
      // 23b: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 23e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 241: aload 2
      // 242: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 245: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24e: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 251: athrow
      // 252: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 255: athrow
      // 256: aload 7
      // 258: sipush 4879
      // 25b: ldc2_w 8481963488836906720
      // 25e: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 261: invokevirtual com/finalshell/io/YM3.write (I)V
      // 264: return
   }

   public char W(YM3 var1, java.lang.Class var2, char var3) {
      String var4 = Nv4.o();

      try {
         char var10000 = (var1.I(EP.WriteClassName)) ? 1 : 0;
         if (var4 == null) {
            return var10000;
         }

         if (var10000 == 0) {
            return var3;
         }
      } catch (Hi2 var5) {
         throw a(var5);
      }

      var1.write(a(4621, 6209918400756543468L));
      var1.u(Ok2.Z);
      var1.y(var2.getName());
      return (char)a(9451, 7224593862732372224L);
   }

   @Override
   public Object z(Yn4 param1, Type param2, Object param3) {
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
      // 004: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 007: astore 5
      // 009: astore 4
      // 00b: aload 5
      // 00d: invokeinterface com/finalshell/core/P7.P ()I 1
      // 012: sipush 23247
      // 015: ldc2_w 3457865441324803878
      // 018: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 01b: aload 4
      // 01d: ifnull 05c
      // 020: if_icmpne 040
      // 023: goto 02a
      // 026: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 029: athrow
      // 02a: aload 5
      // 02c: sipush 17292
      // 02f: ldc2_w 892265204399193711
      // 032: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 035: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 03a: aconst_null
      // 03b: areturn
      // 03c: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: aload 5
      // 042: aload 4
      // 044: ifnull 09c
      // 047: invokeinterface com/finalshell/core/P7.P ()I 1
      // 04c: sipush 22345
      // 04f: ldc2_w 596108195657427625
      // 052: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: if_icmpeq 09a
      // 05f: aload 5
      // 061: aload 4
      // 063: ifnull 09c
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: invokeinterface com/finalshell/core/P7.P ()I 1
      // 072: sipush 17292
      // 075: ldc2_w 892265204399193711
      // 078: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 07b: if_icmpeq 09a
      // 07e: goto 085
      // 081: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: new com/finalshell/core/Hi2
      // 088: dup
      // 089: sipush 5848
      // 08c: sipush 15564
      // 08f: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 092: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 095: athrow
      // 096: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: aload 5
      // 09c: invokeinterface com/finalshell/core/P7.K ()V 1
      // 0a1: aload 2
      // 0a2: ldc java/awt/Point
      // 0a4: aload 4
      // 0a6: ifnull 0ca
      // 0a9: if_acmpne 0c0
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: aload 1
      // 0b5: aload 3
      // 0b6: invokevirtual com/finalshell/core/Hg2.i (Lcom/finalshell/core/Yn4;Ljava/lang/Object;)Ljava/awt/Point;
      // 0b9: astore 6
      // 0bb: aload 4
      // 0bd: ifnonnull 149
      // 0c0: aload 2
      // 0c1: ldc java/awt/Rectangle
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: aload 4
      // 0cc: ifnull 0ef
      // 0cf: if_acmpne 0e5
      // 0d2: goto 0d9
      // 0d5: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: aload 1
      // 0db: invokevirtual com/finalshell/core/Hg2.W (Lcom/finalshell/core/Yn4;)Ljava/awt/Rectangle;
      // 0de: astore 6
      // 0e0: aload 4
      // 0e2: ifnonnull 149
      // 0e5: aload 2
      // 0e6: ldc java/awt/Color
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: aload 4
      // 0f1: ifnull 114
      // 0f4: if_acmpne 10a
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: aload 1
      // 100: invokevirtual com/finalshell/core/Hg2.K (Lcom/finalshell/core/Yn4;)Ljava/awt/Color;
      // 103: astore 6
      // 105: aload 4
      // 107: ifnonnull 149
      // 10a: aload 2
      // 10b: ldc java/awt/Font
      // 10d: goto 114
      // 110: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: if_acmpne 123
      // 117: aload 0
      // 118: aload 1
      // 119: invokevirtual com/finalshell/core/Hg2.T (Lcom/finalshell/core/Yn4;)Ljava/awt/Font;
      // 11c: astore 6
      // 11e: aload 4
      // 120: ifnonnull 149
      // 123: new com/finalshell/core/Hi2
      // 126: dup
      // 127: new java/lang/StringBuilder
      // 12a: dup
      // 12b: invokespecial java/lang/StringBuilder.<init> ()V
      // 12e: sipush 5841
      // 131: sipush 266
      // 134: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: aload 2
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 141: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 144: athrow
      // 145: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 148: athrow
      // 149: aload 1
      // 14a: invokevirtual com/finalshell/core/Yn4.A$xM_3 ()Lcom/finalshell/core/XM3;
      // 14d: astore 7
      // 14f: aload 1
      // 150: aload 6
      // 152: aload 3
      // 153: invokevirtual com/finalshell/core/Yn4.F (Ljava/lang/Object;Ljava/lang/Object;)Lcom/finalshell/core/XM3;
      // 156: pop
      // 157: aload 1
      // 158: aload 7
      // 15a: invokevirtual com/finalshell/core/Yn4.z (Lcom/finalshell/core/XM3;)V
      // 15d: aload 6
      // 15f: areturn
   }

   public Font T(Yn4 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 004: astore 3
      // 005: bipush 0
      // 006: istore 4
      // 008: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 00b: bipush 0
      // 00c: istore 5
      // 00e: astore 2
      // 00f: aconst_null
      // 010: astore 6
      // 012: aload 3
      // 013: invokeinterface com/finalshell/core/P7.P ()I 1
      // 018: sipush 22553
      // 01b: ldc2_w 4571839915522172403
      // 01e: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 021: if_icmpne 039
      // 024: aload 3
      // 025: invokeinterface com/finalshell/core/P7.K ()V 1
      // 02a: aload 2
      // 02b: ifnull 06f
      // 02e: aload 2
      // 02f: ifnonnull 1fd
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: aload 3
      // 03a: aload 2
      // 03b: ifnull 05d
      // 03e: goto 045
      // 041: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: invokeinterface com/finalshell/core/P7.P ()I 1
      // 04a: bipush 4
      // 04b: if_icmpne 06f
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: aload 3
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 062: astore 7
      // 064: aload 3
      // 065: bipush 2
      // 066: invokeinterface com/finalshell/core/P7.e (I)V 2
      // 06b: aload 2
      // 06c: ifnonnull 080
      // 06f: new com/finalshell/core/Hi2
      // 072: dup
      // 073: sipush 5850
      // 076: sipush -31501
      // 079: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 07c: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 07f: athrow
      // 080: aload 7
      // 082: sipush 5854
      // 085: sipush 9513
      // 088: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 08b: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 08e: aload 2
      // 08f: ifnull 0ed
      // 092: ifeq 0df
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 3
      // 09d: aload 2
      // 09e: ifnull 0c1
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: invokeinterface com/finalshell/core/P7.P ()I 1
      // 0ad: bipush 4
      // 0ae: if_icmpne 0ca
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: aload 3
      // 0b9: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 0be: astore 6
      // 0c0: aload 3
      // 0c1: invokeinterface com/finalshell/core/P7.K ()V 1
      // 0c6: aload 2
      // 0c7: ifnonnull 1ce
      // 0ca: new com/finalshell/core/Hi2
      // 0cd: dup
      // 0ce: sipush 5848
      // 0d1: sipush 15564
      // 0d4: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 0d7: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0da: athrow
      // 0db: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: aload 7
      // 0e1: sipush 5853
      // 0e4: sipush 31792
      // 0e7: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 0ea: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0ed: aload 2
      // 0ee: ifnull 153
      // 0f1: ifeq 145
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: aload 3
      // 0fc: invokeinterface com/finalshell/core/P7.P ()I 1
      // 101: aload 2
      // 102: ifnull 124
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: bipush 2
      // 10d: if_icmpne 130
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: aload 3
      // 118: invokeinterface com/finalshell/core/P7.G ()I 1
      // 11d: goto 124
      // 120: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: istore 5
      // 126: aload 3
      // 127: invokeinterface com/finalshell/core/P7.K ()V 1
      // 12c: aload 2
      // 12d: ifnonnull 1ce
      // 130: new com/finalshell/core/Hi2
      // 133: dup
      // 134: sipush 5848
      // 137: sipush 15564
      // 13a: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 13d: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 140: athrow
      // 141: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: aload 7
      // 147: sipush 5846
      // 14a: sipush -32603
      // 14d: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 150: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 153: aload 2
      // 154: ifnull 16e
      // 157: ifeq 1ab
      // 15a: goto 161
      // 15d: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 160: athrow
      // 161: aload 3
      // 162: invokeinterface com/finalshell/core/P7.P ()I 1
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: aload 2
      // 16f: ifnull 18a
      // 172: bipush 2
      // 173: if_icmpne 196
      // 176: goto 17d
      // 179: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: aload 3
      // 17e: invokeinterface com/finalshell/core/P7.G ()I 1
      // 183: goto 18a
      // 186: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: istore 4
      // 18c: aload 3
      // 18d: invokeinterface com/finalshell/core/P7.K ()V 1
      // 192: aload 2
      // 193: ifnonnull 1ce
      // 196: new com/finalshell/core/Hi2
      // 199: dup
      // 19a: sipush 5848
      // 19d: sipush 15564
      // 1a0: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 1a3: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1a6: athrow
      // 1a7: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1aa: athrow
      // 1ab: new com/finalshell/core/Hi2
      // 1ae: dup
      // 1af: new java/lang/StringBuilder
      // 1b2: dup
      // 1b3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b6: sipush 5855
      // 1b9: sipush 9527
      // 1bc: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 1bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c2: aload 7
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ca: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1cd: athrow
      // 1ce: aload 3
      // 1cf: aload 2
      // 1d0: ifnull 1f3
      // 1d3: invokeinterface com/finalshell/core/P7.P ()I 1
      // 1d8: sipush 17403
      // 1db: ldc2_w 2737210487338876439
      // 1de: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 1e1: if_icmpne 1f9
      // 1e4: goto 1eb
      // 1e7: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ea: athrow
      // 1eb: aload 3
      // 1ec: goto 1f3
      // 1ef: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f2: athrow
      // 1f3: bipush 4
      // 1f4: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 1f9: aload 2
      // 1fa: ifnonnull 012
      // 1fd: new java/awt/Font
      // 200: dup
      // 201: aload 6
      // 203: iload 5
      // 205: iload 4
      // 207: invokespecial java/awt/Font.<init> (Ljava/lang/String;II)V
      // 20a: areturn
   }

   public Color K(Yn4 param1) {
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
      // 004: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 007: astore 3
      // 008: bipush 0
      // 009: istore 4
      // 00b: bipush 0
      // 00c: istore 5
      // 00e: bipush 0
      // 00f: istore 6
      // 011: bipush 0
      // 012: istore 7
      // 014: astore 2
      // 015: aload 3
      // 016: invokeinterface com/finalshell/core/P7.P ()I 1
      // 01b: sipush 6708
      // 01e: ldc2_w 1308407740119508954
      // 021: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 024: if_icmpne 03c
      // 027: aload 3
      // 028: invokeinterface com/finalshell/core/P7.K ()V 1
      // 02d: aload 2
      // 02e: ifnull 072
      // 031: aload 2
      // 032: ifnonnull 1ac
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 3
      // 03d: aload 2
      // 03e: ifnull 060
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: invokeinterface com/finalshell/core/P7.P ()I 1
      // 04d: bipush 4
      // 04e: if_icmpne 072
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 3
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 065: astore 8
      // 067: aload 3
      // 068: bipush 2
      // 069: invokeinterface com/finalshell/core/P7.e (I)V 2
      // 06e: aload 2
      // 06f: ifnonnull 083
      // 072: new com/finalshell/core/Hi2
      // 075: dup
      // 076: sipush 5848
      // 079: sipush 15564
      // 07c: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 07f: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 082: athrow
      // 083: aload 3
      // 084: invokeinterface com/finalshell/core/P7.P ()I 1
      // 089: aload 2
      // 08a: ifnull 0a5
      // 08d: bipush 2
      // 08e: if_icmpne 0b1
      // 091: goto 098
      // 094: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: aload 3
      // 099: invokeinterface com/finalshell/core/P7.G ()I 1
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: istore 9
      // 0a7: aload 3
      // 0a8: invokeinterface com/finalshell/core/P7.K ()V 1
      // 0ad: aload 2
      // 0ae: ifnonnull 0c6
      // 0b1: new com/finalshell/core/Hi2
      // 0b4: dup
      // 0b5: sipush 5848
      // 0b8: sipush 15564
      // 0bb: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 0be: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0c1: athrow
      // 0c2: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 8
      // 0c8: ldc "r"
      // 0ca: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0cd: aload 2
      // 0ce: ifnull 0f1
      // 0d1: ifeq 0e3
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: iload 9
      // 0dd: istore 4
      // 0df: aload 2
      // 0e0: ifnonnull 17d
      // 0e3: aload 8
      // 0e5: ldc "g"
      // 0e7: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0ea: goto 0f1
      // 0ed: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: ifnull 115
      // 0f5: ifeq 107
      // 0f8: goto 0ff
      // 0fb: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fe: athrow
      // 0ff: iload 9
      // 101: istore 5
      // 103: aload 2
      // 104: ifnonnull 17d
      // 107: aload 8
      // 109: ldc "b"
      // 10b: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 10e: goto 115
      // 111: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: aload 2
      // 116: ifnull 140
      // 119: ifeq 12b
      // 11c: goto 123
      // 11f: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: iload 9
      // 125: istore 6
      // 127: aload 2
      // 128: ifnonnull 17d
      // 12b: aload 8
      // 12d: sipush 5845
      // 130: sipush 19208
      // 133: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 136: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 139: goto 140
      // 13c: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13f: athrow
      // 140: aload 2
      // 141: ifnull 150
      // 144: ifeq 156
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: iload 9
      // 150: istore 7
      // 152: aload 2
      // 153: ifnonnull 17d
      // 156: new com/finalshell/core/Hi2
      // 159: dup
      // 15a: new java/lang/StringBuilder
      // 15d: dup
      // 15e: invokespecial java/lang/StringBuilder.<init> ()V
      // 161: sipush 5840
      // 164: sipush 30302
      // 167: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 16a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16d: aload 8
      // 16f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 172: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 175: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 178: athrow
      // 179: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: aload 3
      // 17e: aload 2
      // 17f: ifnull 1a2
      // 182: invokeinterface com/finalshell/core/P7.P ()I 1
      // 187: sipush 17292
      // 18a: ldc2_w 892265204399193711
      // 18d: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 190: if_icmpne 1a8
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: aload 3
      // 19b: goto 1a2
      // 19e: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a1: athrow
      // 1a2: bipush 4
      // 1a3: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 1a8: aload 2
      // 1a9: ifnonnull 015
      // 1ac: new java/awt/Color
      // 1af: dup
      // 1b0: iload 4
      // 1b2: iload 5
      // 1b4: iload 6
      // 1b6: iload 7
      // 1b8: invokespecial java/awt/Color.<init> (IIII)V
      // 1bb: areturn
   }

   public Rectangle W(Yn4 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 004: astore 3
      // 005: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 008: bipush 0
      // 009: istore 4
      // 00b: bipush 0
      // 00c: istore 5
      // 00e: astore 2
      // 00f: bipush 0
      // 010: istore 6
      // 012: bipush 0
      // 013: istore 7
      // 015: aload 3
      // 016: invokeinterface com/finalshell/core/P7.P ()I 1
      // 01b: sipush 6708
      // 01e: ldc2_w 1308407740119508954
      // 021: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 024: if_icmpne 03c
      // 027: aload 3
      // 028: invokeinterface com/finalshell/core/P7.K ()V 1
      // 02d: aload 2
      // 02e: ifnull 072
      // 031: aload 2
      // 032: ifnonnull 1e2
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 3
      // 03d: aload 2
      // 03e: ifnull 060
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: invokeinterface com/finalshell/core/P7.P ()I 1
      // 04d: bipush 4
      // 04e: if_icmpne 072
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 3
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 065: astore 8
      // 067: aload 3
      // 068: bipush 2
      // 069: invokeinterface com/finalshell/core/P7.e (I)V 2
      // 06e: aload 2
      // 06f: ifnonnull 083
      // 072: new com/finalshell/core/Hi2
      // 075: dup
      // 076: sipush 5848
      // 079: sipush 15564
      // 07c: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 07f: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 082: athrow
      // 083: aload 3
      // 084: invokeinterface com/finalshell/core/P7.P ()I 1
      // 089: istore 10
      // 08b: iload 10
      // 08d: bipush 2
      // 08e: aload 2
      // 08f: ifnull 0c3
      // 092: if_icmpne 0ae
      // 095: goto 09c
      // 098: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 3
      // 09d: invokeinterface com/finalshell/core/P7.G ()I 1
      // 0a2: istore 9
      // 0a4: aload 3
      // 0a5: invokeinterface com/finalshell/core/P7.K ()V 1
      // 0aa: aload 2
      // 0ab: ifnonnull 0f5
      // 0ae: iload 10
      // 0b0: aload 2
      // 0b1: ifnull 0d4
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: bipush 3
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: if_icmpne 0e0
      // 0c6: aload 3
      // 0c7: invokeinterface com/finalshell/core/P7.I ()F 1
      // 0cc: f2i
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: istore 9
      // 0d6: aload 3
      // 0d7: invokeinterface com/finalshell/core/P7.K ()V 1
      // 0dc: aload 2
      // 0dd: ifnonnull 0f5
      // 0e0: new com/finalshell/core/Hi2
      // 0e3: dup
      // 0e4: sipush 5848
      // 0e7: sipush 15564
      // 0ea: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 0ed: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0f0: athrow
      // 0f1: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: aload 8
      // 0f7: ldc "x"
      // 0f9: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0fc: aload 2
      // 0fd: ifnull 120
      // 100: ifeq 112
      // 103: goto 10a
      // 106: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: iload 9
      // 10c: istore 4
      // 10e: aload 2
      // 10f: ifnonnull 1b3
      // 112: aload 8
      // 114: ldc "y"
      // 116: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: aload 2
      // 121: ifnull 14b
      // 124: ifeq 136
      // 127: goto 12e
      // 12a: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: iload 9
      // 130: istore 5
      // 132: aload 2
      // 133: ifnonnull 1b3
      // 136: aload 8
      // 138: sipush 5851
      // 13b: sipush -26995
      // 13e: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 141: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 144: goto 14b
      // 147: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: aload 2
      // 14c: ifnull 176
      // 14f: ifeq 161
      // 152: goto 159
      // 155: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: iload 9
      // 15b: istore 6
      // 15d: aload 2
      // 15e: ifnonnull 1b3
      // 161: aload 8
      // 163: sipush 5847
      // 166: sipush -27774
      // 169: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 16c: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 16f: goto 176
      // 172: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: aload 2
      // 177: ifnull 186
      // 17a: ifeq 18c
      // 17d: goto 184
      // 180: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: iload 9
      // 186: istore 7
      // 188: aload 2
      // 189: ifnonnull 1b3
      // 18c: new com/finalshell/core/Hi2
      // 18f: dup
      // 190: new java/lang/StringBuilder
      // 193: dup
      // 194: invokespecial java/lang/StringBuilder.<init> ()V
      // 197: sipush 5840
      // 19a: sipush 30302
      // 19d: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a3: aload 8
      // 1a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ab: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1ae: athrow
      // 1af: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: aload 3
      // 1b4: aload 2
      // 1b5: ifnull 1d8
      // 1b8: invokeinterface com/finalshell/core/P7.P ()I 1
      // 1bd: sipush 17292
      // 1c0: ldc2_w 892265204399193711
      // 1c3: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 1c6: if_icmpne 1de
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: aload 3
      // 1d1: goto 1d8
      // 1d4: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d7: athrow
      // 1d8: bipush 4
      // 1d9: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 1de: aload 2
      // 1df: ifnonnull 015
      // 1e2: new java/awt/Rectangle
      // 1e5: dup
      // 1e6: iload 4
      // 1e8: iload 5
      // 1ea: iload 6
      // 1ec: iload 7
      // 1ee: invokespecial java/awt/Rectangle.<init> (IIII)V
      // 1f1: areturn
   }

   public Point i(Yn4 param1, Object param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 004: astore 4
      // 006: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 009: bipush 0
      // 00a: istore 5
      // 00c: astore 3
      // 00d: bipush 0
      // 00e: istore 6
      // 010: aload 4
      // 012: invokeinterface com/finalshell/core/P7.P ()I 1
      // 017: sipush 6708
      // 01a: ldc2_w 1308407740119508954
      // 01d: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 020: if_icmpne 039
      // 023: aload 4
      // 025: invokeinterface com/finalshell/core/P7.K ()V 1
      // 02a: aload 3
      // 02b: ifnull 0cd
      // 02e: aload 3
      // 02f: ifnonnull 205
      // 032: goto 039
      // 035: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 038: athrow
      // 039: aload 4
      // 03b: aload 3
      // 03c: ifnull 05f
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: invokeinterface com/finalshell/core/P7.P ()I 1
      // 04b: bipush 4
      // 04c: if_icmpne 0cd
      // 04f: goto 056
      // 052: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 055: athrow
      // 056: aload 4
      // 058: goto 05f
      // 05b: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 064: astore 7
      // 066: getstatic com/finalshell/core/Ok2.Z Ljava/lang/String;
      // 069: aload 7
      // 06b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06e: aload 3
      // 06f: ifnull 0ad
      // 072: ifeq 094
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 1
      // 07d: sipush 5826
      // 080: sipush 23561
      // 083: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 086: invokevirtual com/finalshell/core/Yn4.N (Ljava/lang/String;)V
      // 089: aload 3
      // 08a: ifnonnull 010
      // 08d: goto 094
      // 090: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: sipush 5843
      // 097: sipush 28816
      // 09a: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 09d: aload 3
      // 09e: ifnull 0bd
      // 0a1: aload 7
      // 0a3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: ifeq 0c1
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: aload 2
      // 0b3: invokespecial com/finalshell/core/Hg2.y (Lcom/finalshell/core/Yn4;Ljava/lang/Object;)Ljava/lang/Object;
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: checkcast java/awt/Point
      // 0c0: areturn
      // 0c1: aload 4
      // 0c3: bipush 2
      // 0c4: invokeinterface com/finalshell/core/P7.e (I)V 2
      // 0c9: aload 3
      // 0ca: ifnonnull 0de
      // 0cd: new com/finalshell/core/Hi2
      // 0d0: dup
      // 0d1: sipush 5848
      // 0d4: sipush 15564
      // 0d7: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 0da: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: invokeinterface com/finalshell/core/P7.P ()I 1
      // 0e5: istore 8
      // 0e7: iload 8
      // 0e9: bipush 2
      // 0ea: aload 3
      // 0eb: ifnull 121
      // 0ee: if_icmpne 10c
      // 0f1: goto 0f8
      // 0f4: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 4
      // 0fa: invokeinterface com/finalshell/core/P7.G ()I 1
      // 0ff: istore 9
      // 101: aload 4
      // 103: invokeinterface com/finalshell/core/P7.K ()V 1
      // 108: aload 3
      // 109: ifnonnull 16c
      // 10c: iload 8
      // 10e: aload 3
      // 10f: ifnull 133
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: bipush 3
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: if_icmpne 140
      // 124: aload 4
      // 126: invokeinterface com/finalshell/core/P7.I ()F 1
      // 12b: f2i
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: istore 9
      // 135: aload 4
      // 137: invokeinterface com/finalshell/core/P7.K ()V 1
      // 13c: aload 3
      // 13d: ifnonnull 16c
      // 140: new com/finalshell/core/Hi2
      // 143: dup
      // 144: new java/lang/StringBuilder
      // 147: dup
      // 148: invokespecial java/lang/StringBuilder.<init> ()V
      // 14b: sipush 5824
      // 14e: sipush 12059
      // 151: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: aload 4
      // 159: invokeinterface com/finalshell/core/P7.B ()Ljava/lang/String; 1
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 164: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 167: athrow
      // 168: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 7
      // 16e: ldc "x"
      // 170: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 173: aload 3
      // 174: ifnull 197
      // 177: ifeq 189
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: iload 9
      // 183: istore 5
      // 185: aload 3
      // 186: ifnonnull 1d4
      // 189: aload 7
      // 18b: ldc "y"
      // 18d: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 190: goto 197
      // 193: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 196: athrow
      // 197: aload 3
      // 198: ifnull 1a7
      // 19b: ifeq 1ad
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: iload 9
      // 1a7: istore 6
      // 1a9: aload 3
      // 1aa: ifnonnull 1d4
      // 1ad: new com/finalshell/core/Hi2
      // 1b0: dup
      // 1b1: new java/lang/StringBuilder
      // 1b4: dup
      // 1b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b8: sipush 5840
      // 1bb: sipush 30302
      // 1be: invokestatic com/finalshell/core/Hg2.a (II)Ljava/lang/String;
      // 1c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c4: aload 7
      // 1c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1cc: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 1cf: athrow
      // 1d0: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d3: athrow
      // 1d4: aload 4
      // 1d6: aload 3
      // 1d7: ifnull 1fb
      // 1da: invokeinterface com/finalshell/core/P7.P ()I 1
      // 1df: sipush 17292
      // 1e2: ldc2_w 892265204399193711
      // 1e5: invokestatic com/finalshell/core/Hg2.a (IJ)I
      // 1e8: if_icmpne 201
      // 1eb: goto 1f2
      // 1ee: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f1: athrow
      // 1f2: aload 4
      // 1f4: goto 1fb
      // 1f7: invokestatic com/finalshell/core/Hg2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fa: athrow
      // 1fb: bipush 4
      // 1fc: invokeinterface com/finalshell/core/P7.S (I)V 2
      // 201: aload 3
      // 202: ifnonnull 010
      // 205: new java/awt/Point
      // 208: dup
      // 209: iload 5
      // 20b: iload 6
      // 20d: invokespecial java/awt/Point.<init> (II)V
      // 210: areturn
   }

   public Object y(Yn4 var1, Object var2) {
      P7 var3 = var1.E();
      var3.e(4);
      String var4 = var3.z();
      var1.F(var1.A$xM_3(), var2);
      var1.O(new N_2_2(var1.A$xM_3(), var4));
      var1.A$void();
      var1.l(1);
      var3.S(a(6708, 1308407740119508954L));
      var1.M(a(6708, 1308407740119508954L));
      return null;
   }

   @Override
   public int j() {
      return a(27645, 5503816077835212309L);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 5842) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 152;
               break;
            case 1:
               var10000 = 239;
               break;
            case 2:
               var10000 = 245;
               break;
            case 3:
               var10000 = 131;
               break;
            case 4:
               var10000 = 115;
               break;
            case 5:
               var10000 = 51;
               break;
            case 6:
               var10000 = 187;
               break;
            case 7:
               var10000 = 212;
               break;
            case 8:
               var10000 = 174;
               break;
            case 9:
               var10000 = 8;
               break;
            case 10:
               var10000 = 136;
               break;
            case 11:
               var10000 = 214;
               break;
            case 12:
               var10000 = 220;
               break;
            case 13:
               var10000 = 121;
               break;
            case 14:
               var10000 = 28;
               break;
            case 15:
               var10000 = 128;
               break;
            case 16:
               var10000 = 94;
               break;
            case 17:
               var10000 = 175;
               break;
            case 18:
               var10000 = 57;
               break;
            case 19:
               var10000 = 215;
               break;
            case 20:
               var10000 = 147;
               break;
            case 21:
               var10000 = 17;
               break;
            case 22:
               var10000 = 83;
               break;
            case 23:
               var10000 = 235;
               break;
            case 24:
               var10000 = 114;
               break;
            case 25:
               var10000 = 221;
               break;
            case 26:
               var10000 = 145;
               break;
            case 27:
               var10000 = 86;
               break;
            case 28:
               var10000 = 39;
               break;
            case 29:
               var10000 = 59;
               break;
            case 30:
               var10000 = 26;
               break;
            case 31:
               var10000 = 205;
               break;
            case 32:
               var10000 = 68;
               break;
            case 33:
               var10000 = 139;
               break;
            case 34:
               var10000 = 55;
               break;
            case 35:
               var10000 = 154;
               break;
            case 36:
               var10000 = 170;
               break;
            case 37:
               var10000 = 35;
               break;
            case 38:
               var10000 = 142;
               break;
            case 39:
               var10000 = 189;
               break;
            case 40:
               var10000 = 176;
               break;
            case 41:
               var10000 = 87;
               break;
            case 42:
               var10000 = 37;
               break;
            case 43:
               var10000 = 32;
               break;
            case 44:
               var10000 = 74;
               break;
            case 45:
               var10000 = 244;
               break;
            case 46:
               var10000 = 190;
               break;
            case 47:
               var10000 = 25;
               break;
            case 48:
               var10000 = 148;
               break;
            case 49:
               var10000 = 160;
               break;
            case 50:
               var10000 = 90;
               break;
            case 51:
               var10000 = 252;
               break;
            case 52:
               var10000 = 58;
               break;
            case 53:
               var10000 = 204;
               break;
            case 54:
               var10000 = 104;
               break;
            case 55:
               var10000 = 60;
               break;
            case 56:
               var10000 = 38;
               break;
            case 57:
               var10000 = 191;
               break;
            case 58:
               var10000 = 9;
               break;
            case 59:
               var10000 = 162;
               break;
            case 60:
               var10000 = 76;
               break;
            case 61:
               var10000 = 111;
               break;
            case 62:
               var10000 = 173;
               break;
            case 63:
               var10000 = 133;
               break;
            case 64:
               var10000 = 98;
               break;
            case 65:
               var10000 = 56;
               break;
            case 66:
               var10000 = 72;
               break;
            case 67:
               var10000 = 164;
               break;
            case 68:
               var10000 = 99;
               break;
            case 69:
               var10000 = 48;
               break;
            case 70:
               var10000 = 192;
               break;
            case 71:
               var10000 = 172;
               break;
            case 72:
               var10000 = 254;
               break;
            case 73:
               var10000 = 118;
               break;
            case 74:
               var10000 = 34;
               break;
            case 75:
               var10000 = 119;
               break;
            case 76:
               var10000 = 157;
               break;
            case 77:
               var10000 = 166;
               break;
            case 78:
               var10000 = 78;
               break;
            case 79:
               var10000 = 103;
               break;
            case 80:
               var10000 = 144;
               break;
            case 81:
               var10000 = 0;
               break;
            case 82:
               var10000 = 3;
               break;
            case 83:
               var10000 = 237;
               break;
            case 84:
               var10000 = 64;
               break;
            case 85:
               var10000 = 88;
               break;
            case 86:
               var10000 = 11;
               break;
            case 87:
               var10000 = 208;
               break;
            case 88:
               var10000 = 155;
               break;
            case 89:
               var10000 = 236;
               break;
            case 90:
               var10000 = 207;
               break;
            case 91:
               var10000 = 209;
               break;
            case 92:
               var10000 = 151;
               break;
            case 93:
               var10000 = 97;
               break;
            case 94:
               var10000 = 49;
               break;
            case 95:
               var10000 = 135;
               break;
            case 96:
               var10000 = 218;
               break;
            case 97:
               var10000 = 92;
               break;
            case 98:
               var10000 = 247;
               break;
            case 99:
               var10000 = 197;
               break;
            case 100:
               var10000 = 23;
               break;
            case 101:
               var10000 = 33;
               break;
            case 102:
               var10000 = 65;
               break;
            case 103:
               var10000 = 181;
               break;
            case 104:
               var10000 = 210;
               break;
            case 105:
               var10000 = 12;
               break;
            case 106:
               var10000 = 137;
               break;
            case 107:
               var10000 = 156;
               break;
            case 108:
               var10000 = 70;
               break;
            case 109:
               var10000 = 108;
               break;
            case 110:
               var10000 = 31;
               break;
            case 111:
               var10000 = 200;
               break;
            case 112:
               var10000 = 41;
               break;
            case 113:
               var10000 = 188;
               break;
            case 114:
               var10000 = 82;
               break;
            case 115:
               var10000 = 61;
               break;
            case 116:
               var10000 = 16;
               break;
            case 117:
               var10000 = 232;
               break;
            case 118:
               var10000 = 42;
               break;
            case 119:
               var10000 = 66;
               break;
            case 120:
               var10000 = 195;
               break;
            case 121:
               var10000 = 146;
               break;
            case 122:
               var10000 = 132;
               break;
            case 123:
               var10000 = 45;
               break;
            case 124:
               var10000 = 228;
               break;
            case 125:
               var10000 = 126;
               break;
            case 126:
               var10000 = 177;
               break;
            case 127:
               var10000 = 246;
               break;
            case 128:
               var10000 = 80;
               break;
            case 129:
               var10000 = 226;
               break;
            case 130:
               var10000 = 224;
               break;
            case 131:
               var10000 = 199;
               break;
            case 132:
               var10000 = 150;
               break;
            case 133:
               var10000 = 201;
               break;
            case 134:
               var10000 = 222;
               break;
            case 135:
               var10000 = 40;
               break;
            case 136:
               var10000 = 19;
               break;
            case 137:
               var10000 = 81;
               break;
            case 138:
               var10000 = 14;
               break;
            case 139:
               var10000 = 62;
               break;
            case 140:
               var10000 = 63;
               break;
            case 141:
               var10000 = 124;
               break;
            case 142:
               var10000 = 171;
               break;
            case 143:
               var10000 = 255;
               break;
            case 144:
               var10000 = 105;
               break;
            case 145:
               var10000 = 225;
               break;
            case 146:
               var10000 = 13;
               break;
            case 147:
               var10000 = 4;
               break;
            case 148:
               var10000 = 102;
               break;
            case 149:
               var10000 = 140;
               break;
            case 150:
               var10000 = 67;
               break;
            case 151:
               var10000 = 18;
               break;
            case 152:
               var10000 = 213;
               break;
            case 153:
               var10000 = 219;
               break;
            case 154:
               var10000 = 243;
               break;
            case 155:
               var10000 = 46;
               break;
            case 156:
               var10000 = 117;
               break;
            case 157:
               var10000 = 198;
               break;
            case 158:
               var10000 = 27;
               break;
            case 159:
               var10000 = 5;
               break;
            case 160:
               var10000 = 227;
               break;
            case 161:
               var10000 = 123;
               break;
            case 162:
               var10000 = 93;
               break;
            case 163:
               var10000 = 15;
               break;
            case 164:
               var10000 = 77;
               break;
            case 165:
               var10000 = 100;
               break;
            case 166:
               var10000 = 158;
               break;
            case 167:
               var10000 = 120;
               break;
            case 168:
               var10000 = 106;
               break;
            case 169:
               var10000 = 7;
               break;
            case 170:
               var10000 = 125;
               break;
            case 171:
               var10000 = 89;
               break;
            case 172:
               var10000 = 138;
               break;
            case 173:
               var10000 = 95;
               break;
            case 174:
               var10000 = 127;
               break;
            case 175:
               var10000 = 30;
               break;
            case 176:
               var10000 = 20;
               break;
            case 177:
               var10000 = 29;
               break;
            case 178:
               var10000 = 253;
               break;
            case 179:
               var10000 = 167;
               break;
            case 180:
               var10000 = 73;
               break;
            case 181:
               var10000 = 234;
               break;
            case 182:
               var10000 = 43;
               break;
            case 183:
               var10000 = 107;
               break;
            case 184:
               var10000 = 180;
               break;
            case 185:
               var10000 = 6;
               break;
            case 186:
               var10000 = 54;
               break;
            case 187:
               var10000 = 149;
               break;
            case 188:
               var10000 = 163;
               break;
            case 189:
               var10000 = 50;
               break;
            case 190:
               var10000 = 153;
               break;
            case 191:
               var10000 = 141;
               break;
            case 192:
               var10000 = 47;
               break;
            case 193:
               var10000 = 165;
               break;
            case 194:
               var10000 = 251;
               break;
            case 195:
               var10000 = 110;
               break;
            case 196:
               var10000 = 238;
               break;
            case 197:
               var10000 = 84;
               break;
            case 198:
               var10000 = 202;
               break;
            case 199:
               var10000 = 186;
               break;
            case 200:
               var10000 = 241;
               break;
            case 201:
               var10000 = 185;
               break;
            case 202:
               var10000 = 217;
               break;
            case 203:
               var10000 = 206;
               break;
            case 204:
               var10000 = 1;
               break;
            case 205:
               var10000 = 101;
               break;
            case 206:
               var10000 = 75;
               break;
            case 207:
               var10000 = 85;
               break;
            case 208:
               var10000 = 179;
               break;
            case 209:
               var10000 = 182;
               break;
            case 210:
               var10000 = 143;
               break;
            case 211:
               var10000 = 240;
               break;
            case 212:
               var10000 = 10;
               break;
            case 213:
               var10000 = 231;
               break;
            case 214:
               var10000 = 36;
               break;
            case 215:
               var10000 = 194;
               break;
            case 216:
               var10000 = 122;
               break;
            case 217:
               var10000 = 169;
               break;
            case 218:
               var10000 = 250;
               break;
            case 219:
               var10000 = 21;
               break;
            case 220:
               var10000 = 69;
               break;
            case 221:
               var10000 = 134;
               break;
            case 222:
               var10000 = 196;
               break;
            case 223:
               var10000 = 168;
               break;
            case 224:
               var10000 = 233;
               break;
            case 225:
               var10000 = 242;
               break;
            case 226:
               var10000 = 248;
               break;
            case 227:
               var10000 = 229;
               break;
            case 228:
               var10000 = 216;
               break;
            case 229:
               var10000 = 109;
               break;
            case 230:
               var10000 = 161;
               break;
            case 231:
               var10000 = 113;
               break;
            case 232:
               var10000 = 159;
               break;
            case 233:
               var10000 = 184;
               break;
            case 234:
               var10000 = 71;
               break;
            case 235:
               var10000 = 52;
               break;
            case 236:
               var10000 = 203;
               break;
            case 237:
               var10000 = 79;
               break;
            case 238:
               var10000 = 130;
               break;
            case 239:
               var10000 = 44;
               break;
            case 240:
               var10000 = 24;
               break;
            case 241:
               var10000 = 230;
               break;
            case 242:
               var10000 = 193;
               break;
            case 243:
               var10000 = 53;
               break;
            case 244:
               var10000 = 96;
               break;
            case 245:
               var10000 = 22;
               break;
            case 246:
               var10000 = 91;
               break;
            case 247:
               var10000 = 249;
               break;
            case 248:
               var10000 = 183;
               break;
            case 249:
               var10000 = 211;
               break;
            case 250:
               var10000 = 129;
               break;
            case 251:
               var10000 = 2;
               break;
            case 252:
               var10000 = 223;
               break;
            case 253:
               var10000 = 116;
               break;
            case 254:
               var10000 = 178;
               break;
            default:
               var10000 = 112;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32234;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[21];
      int var11 = 0;
      String var10 = "\u007f\u0010W^ºÑ\u0004\u000eã°Ô\u000eqHéÙ\u0083\\ÏûØpº<\u001cI\u0018\u0095ÐÑJÏýFv®vÑ®DTÓDW2ø1óy.\u009f\u0004ë\u008f®\"\u0006«ìÍÁé\"\u0005\u0095Nû\u000b\u0083\u0005; îo¾\fS\u00ad\u00ade\u000bËÞ\tú.þ÷\u0005Í\u0083ð²â\fÄ\u0005_pUi\u0015]\u0083¤Ñ¦\u0018\u0002\u000e#\u0091\u0091\u0086\u008d\u0019×\u009bþ\u0013¡ão²Àì\nê\u00ad\u0002åð\u0004\u008dÝËa\u000eJ\t\u008eñoYR[kdÌ¾Ò\u0019\u0004ÍõÃd\u0005yqÿJ°\u000e\u0092?·9\u001cîÍ\u0086yÎY\u0096\"0\u0004\u0006\u0086\u0013\u0003\u000f\u0001|ç_B\u008c÷áß3ZT\f^ç";
      int var12 = "\u007f\u0010W^ºÑ\u0004\u000eã°Ô\u000eqHéÙ\u0083\\ÏûØpº<\u001cI\u0018\u0095ÐÑJÏýFv®vÑ®DTÓDW2ø1óy.\u009f\u0004ë\u008f®\"\u0006«ìÍÁé\"\u0005\u0095Nû\u000b\u0083\u0005; îo¾\fS\u00ad\u00ade\u000bËÞ\tú.þ÷\u0005Í\u0083ð²â\fÄ\u0005_pUi\u0015]\u0083¤Ñ¦\u0018\u0002\u000e#\u0091\u0091\u0086\u008d\u0019×\u009bþ\u0013¡ão²Àì\nê\u00ad\u0002åð\u0004\u008dÝËa\u000eJ\t\u008eñoYR[kdÌ¾Ò\u0019\u0004ÍõÃd\u0005yqÿJ°\u000e\u0092?·9\u001cîÍ\u0086yÎY\u0096\"0\u0004\u0006\u0086\u0013\u0003\u000f\u0001|ç_B\u008c÷áß3ZT\f^ç"
         .length();
      char var9 = 6;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 53;
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
                        var65 = 26;
                        break;
                     case 1:
                        var65 = 65;
                        break;
                     case 2:
                        var65 = 100;
                        break;
                     case 3:
                        var65 = 73;
                        break;
                     case 4:
                        var65 = 99;
                        break;
                     case 5:
                        var65 = 95;
                        break;
                     default:
                        var65 = 45;
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
                     b = new String[21];
                     long var0 = 1851304529347514432L;
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "6ir\u000b\u001cr5¾:lB\u0007\u0018uÉluè\u000f-Þ§\u0006YXy\u008fsu\u00977n®Ê1\u001aaåw\u0097~\u0012jæ§ ~Ýªk\u0091Ô¿\u009a.G\u009e*zw'2\u00ad¡\u008d¶¹µ~¿\u009exËôL-ós.?";
                     int var5 = "6ir\u000b\u001cr5¾:lB\u0007\u0018uÉluè\u000f-Þ§\u0006YXy\u008fsu\u00977n®Ê1\u001aaåw\u0097~\u0012jæ§ ~Ýªk\u0091Ô¿\u009a.G\u009e*zw'2\u00ad¡\u008d¶¹µ~¿\u009exËôL-ós.?"
                        .length();
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
                                    c = var6;
                                    d = new Integer[12];
                                    w = new Hg2();
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "Gk\f=Ë\bºåH©\u008båc\u0095ÿ×";
                                 var5 = "Gk\f=Ë\bºåH©\u008båc\u0095ÿ×".length();
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

                  var10 = "Ú\u0019ëa'\u0005øÒö\u0007¨";
                  var12 = "Ú\u0019ëa'\u0005øÒö\u0007¨".length();
                  var9 = 5;
                  var17 = -1;
            }

            var10000 = 102;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





