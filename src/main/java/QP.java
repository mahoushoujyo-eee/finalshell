import java.awt.Window;
import java.awt.event.KeyEvent;

class QP extends Qh_2 {
   final zG n;
   final zG T;
   final U w;
   private static final long a;

   QP(U var1, Window var2, zG var3, zG var4) {
      super(var2);
      this.w = var1;
      this.n = var3;
      this.T = var4;
   }

   @Override
   public void i(KeyEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic F8.y ()[Ljava/lang/String;
      // 003: aload 1
      // 004: invokestatic javax/swing/KeyStroke.getKeyStrokeForEvent (Ljava/awt/event/KeyEvent;)Ljavax/swing/KeyStroke;
      // 007: astore 3
      // 008: astore 2
      // 009: bipush 0
      // 00a: istore 4
      // 00c: aload 1
      // 00d: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 010: aload 2
      // 011: ifnonnull 06f
      // 014: getstatic QP.a J
      // 017: l2i
      // 018: if_icmpeq 06e
      // 01b: goto 022
      // 01e: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: aload 1
      // 023: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 026: aload 2
      // 027: ifnonnull 06f
      // 02a: goto 031
      // 02d: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: bipush 2
      // 032: if_icmpeq 06e
      // 035: goto 03c
      // 038: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 1
      // 03d: invokevirtual java/awt/event/KeyEvent.isAltDown ()Z
      // 040: aload 2
      // 041: ifnonnull 06f
      // 044: goto 04b
      // 047: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: ifne 06e
      // 04e: goto 055
      // 051: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: aload 1
      // 056: invokevirtual java/awt/event/KeyEvent.isControlDown ()Z
      // 059: aload 2
      // 05a: ifnonnull 178
      // 05d: goto 064
      // 060: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: ifeq 151
      // 067: goto 06e
      // 06a: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: bipush 0
      // 06f: istore 5
      // 071: new java/lang/StringBuilder
      // 074: dup
      // 075: invokespecial java/lang/StringBuilder.<init> ()V
      // 078: aload 1
      // 079: invokevirtual java/awt/event/KeyEvent.getKeyChar ()C
      // 07c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 07f: ldc ""
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 087: astore 6
      // 089: aload 6
      // 08b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 08e: astore 6
      // 090: aload 6
      // 092: ldc ""
      // 094: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 097: aload 2
      // 098: ifnonnull 0b1
      // 09b: ifne 0cd
      // 09e: goto 0a5
      // 0a1: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 6
      // 0a7: invokestatic org/apache/commons/lang/StringUtils.isNumeric (Ljava/lang/String;)Z
      // 0aa: goto 0b1
      // 0ad: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 2
      // 0b2: ifnonnull 0cb
      // 0b5: ifeq 0cd
      // 0b8: goto 0bf
      // 0bb: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 6
      // 0c1: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0c4: goto 0cb
      // 0c7: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: istore 5
      // 0cd: goto 0d7
      // 0d0: astore 6
      // 0d2: aload 6
      // 0d4: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0d7: iload 5
      // 0d9: aload 2
      // 0da: ifnonnull 178
      // 0dd: ifle 151
      // 0e0: goto 0e7
      // 0e3: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: ldc2_w 161177414596717597
      // 0eb: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ee: swap
      // 0ef: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f2: ldc2_w 493158471773442262
      // 0f5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0f8: swap
      // 0f9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0fc: iload 5
      // 0fe: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 101: ldc2_w 567768013360538453
      // 104: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 107: dup_x2
      // 108: pop
      // 109: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 10c: checkcast t3_2
      // 10f: goto 116
      // 112: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 115: athrow
      // 116: astore 6
      // 118: aload 6
      // 11a: ifnull 151
      // 11d: aload 0
      // 11e: ldc2_w 161177414596717597
      // 121: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 124: swap
      // 125: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 128: ldc2_w 493158471773442262
      // 12b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 12e: swap
      // 12f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 132: aload 6
      // 134: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 137: ldc2_w 176011466134249595
      // 13a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 13d: dup_x2
      // 13e: pop
      // 13f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 142: pop
      // 143: goto 14a
      // 146: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 149: athrow
      // 14a: goto 151
      // 14d: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: aload 3
      // 152: aload 0
      // 153: ldc2_w 319551843007769804
      // 156: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 159: swap
      // 15a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 15d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 160: ldc2_w 546345160214988812
      // 163: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 166: dup_x2
      // 167: pop
      // 168: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 16b: checkcast javax/swing/KeyStroke
      // 16e: goto 175
      // 171: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 174: athrow
      // 175: invokevirtual javax/swing/KeyStroke.equals (Ljava/lang/Object;)Z
      // 178: aload 2
      // 179: ifnonnull 1ea
      // 17c: ifeq 1bc
      // 17f: goto 186
      // 182: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 185: athrow
      // 186: aload 0
      // 187: ldc2_w 161177414596717597
      // 18a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 18d: swap
      // 18e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 191: ldc2_w 493158471773442262
      // 194: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 197: swap
      // 198: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 19b: invokestatic com/c.f ()[Ljava/lang/Object;
      // 19e: ldc2_w 590160201207864641
      // 1a1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1a4: dup_x2
      // 1a5: pop
      // 1a6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1a9: pop
      // 1aa: goto 1b1
      // 1ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: aload 2
      // 1b2: ifnull 2fa
      // 1b5: goto 1bc
      // 1b8: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bb: athrow
      // 1bc: aload 3
      // 1bd: aload 0
      // 1be: ldc2_w 471446672619646134
      // 1c1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1c4: swap
      // 1c5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1c8: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1cb: ldc2_w 546345160214988812
      // 1ce: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1d1: dup_x2
      // 1d2: pop
      // 1d3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1d6: checkcast javax/swing/KeyStroke
      // 1d9: goto 1e0
      // 1dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1df: athrow
      // 1e0: invokevirtual javax/swing/KeyStroke.equals (Ljava/lang/Object;)Z
      // 1e3: goto 1ea
      // 1e6: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e9: athrow
      // 1ea: aload 2
      // 1eb: ifnonnull 29b
      // 1ee: ifeq 22e
      // 1f1: goto 1f8
      // 1f4: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: ldc2_w 161177414596717597
      // 1fc: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1ff: swap
      // 200: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 203: ldc2_w 493158471773442262
      // 206: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 209: swap
      // 20a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 20d: invokestatic com/c.f ()[Ljava/lang/Object;
      // 210: ldc2_w 143308290537343547
      // 213: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 216: dup_x2
      // 217: pop
      // 218: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 21b: pop
      // 21c: goto 223
      // 21f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 222: athrow
      // 223: aload 2
      // 224: ifnull 2fa
      // 227: goto 22e
      // 22a: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22d: athrow
      // 22e: aload 3
      // 22f: invokestatic com/c.f ()[Ljava/lang/Object;
      // 232: ldc2_w 270389152141252877
      // 235: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 238: swap
      // 239: aconst_null
      // 23a: swap
      // 23b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 23e: goto 245
      // 241: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 244: athrow
      // 245: invokestatic com/c.f ()[Ljava/lang/Object;
      // 248: ldc2_w 306266403902896148
      // 24b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 24e: dup_x2
      // 24f: pop
      // 250: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 253: goto 25a
      // 256: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 259: athrow
      // 25a: ldc2_w 391819096557420250
      // 25d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 260: aconst_null
      // 261: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 264: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 267: ldc2_w 487190762664997585
      // 26a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 26d: dup_x2
      // 26e: pop
      // 26f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 272: goto 279
      // 275: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 278: athrow
      // 279: invokestatic com/c.f ()[Ljava/lang/Object;
      // 27c: ldc2_w 546345160214988812
      // 27f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 282: dup_x2
      // 283: pop
      // 284: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 287: checkcast javax/swing/KeyStroke
      // 28a: goto 291
      // 28d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 290: athrow
      // 291: invokevirtual javax/swing/KeyStroke.equals (Ljava/lang/Object;)Z
      // 294: goto 29b
      // 297: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29a: athrow
      // 29b: ifeq 2fa
      // 29e: aload 0
      // 29f: ldc2_w 161177414596717597
      // 2a2: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2a5: swap
      // 2a6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2a9: ldc2_w 493158471773442262
      // 2ac: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2af: swap
      // 2b0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2b3: aload 0
      // 2b4: ldc2_w 161177414596717597
      // 2b7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2ba: swap
      // 2bb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2be: ldc2_w 493158471773442262
      // 2c1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2c4: swap
      // 2c5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c8: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2cb: ldc2_w 194560825135347400
      // 2ce: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2d1: dup_x2
      // 2d2: pop
      // 2d3: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2d6: goto 2dd
      // 2d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dc: athrow
      // 2dd: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2e0: ldc2_w 228917422408595458
      // 2e3: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2e6: dup_x2
      // 2e7: pop
      // 2e8: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2eb: pop
      // 2ec: goto 2f3
      // 2ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f2: athrow
      // 2f3: goto 2fa
      // 2f6: invokestatic QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f9: athrow
      // 2fa: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   static {
      long var0 = 2291886859903111746L;
      long var10002 = -7900989553427017142L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





