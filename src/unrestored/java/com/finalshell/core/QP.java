package com.finalshell.core;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import java.awt.Window;
import java.awt.event.KeyEvent;

public class QP extends Qh2 {
   public final ZG_2 n;
   public final ZG_2 T;
   public final com.finalshell.ui.frame.MainFrame w;
   public static long a;

   public QP(com.finalshell.ui.frame.MainFrame var1, Window var2, ZG_2 var3, ZG_2 var4) {
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
      // 000: invokestatic com/finalshell/ui/panel/F8.y ()[Ljava/lang/String;
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
      // 014: getstatic com/finalshell/core/QP.a J
      // 017: l2i
      // 018: if_icmpeq 06e
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: aload 1
      // 023: invokevirtual java/awt/event/KeyEvent.getModifiers ()I
      // 026: aload 2
      // 027: ifnonnull 06f
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: bipush 2
      // 032: if_icmpeq 06e
      // 035: goto 03c
      // 038: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: aload 1
      // 03d: invokevirtual java/awt/event/KeyEvent.isAltDown ()Z
      // 040: aload 2
      // 041: ifnonnull 06f
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: ifne 06e
      // 04e: goto 055
      // 051: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: aload 1
      // 056: invokevirtual java/awt/event/KeyEvent.isControlDown ()Z
      // 059: aload 2
      // 05a: ifnonnull 199
      // 05d: goto 064
      // 060: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: ifeq 169
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 0a1: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a4: athrow
      // 0a5: aload 6
      // 0a7: invokestatic org/apache/commons/lang/StringUtils.isNumeric (Ljava/lang/String;)Z
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 2
      // 0b2: ifnonnull 0cb
      // 0b5: ifeq 0cd
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: aload 6
      // 0c1: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: istore 5
      // 0cd: goto 0d7
      // 0d0: astore 6
      // 0d2: aload 6
      // 0d4: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0d7: iload 5
      // 0d9: aload 2
      // 0da: ifnonnull 199
      // 0dd: ifle 169
      // 0e0: goto 0e7
      // 0e3: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: ldc2_w 161177414596717597
      // 0eb: astore 7
      // 0ed: ldc2_w 161177414596717597
      // 0f0: aload 7
      // 0f2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f5: ldc2_w 493158471773442262
      // 0f8: astore 9
      // 0fa: ldc2_w 493158471773442262
      // 0fd: aload 9
      // 0ff: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 102: iload 5
      // 104: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 107: ldc2_w 567768013360538453
      // 10a: astore 12
      // 10c: astore 11
      // 10e: ldc2_w 567768013360538453
      // 111: aload 11
      // 113: aload 12
      // 115: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 118: checkcast com/finalshell/core/T32
      // 11b: goto 122
      // 11e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 121: athrow
      // 122: astore 6
      // 124: aload 6
      // 126: ifnull 169
      // 129: aload 0
      // 12a: ldc2_w 161177414596717597
      // 12d: astore 13
      // 12f: ldc2_w 161177414596717597
      // 132: aload 13
      // 134: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 137: ldc2_w 493158471773442262
      // 13a: astore 15
      // 13c: ldc2_w 493158471773442262
      // 13f: aload 15
      // 141: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 144: aload 6
      // 146: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 149: ldc2_w 176011466134249595
      // 14c: astore 18
      // 14e: astore 17
      // 150: ldc2_w 176011466134249595
      // 153: aload 17
      // 155: aload 18
      // 157: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15a: pop
      // 15b: goto 162
      // 15e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 161: athrow
      // 162: goto 169
      // 165: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: aload 3
      // 16a: aload 0
      // 16b: ldc2_w 319551843007769804
      // 16e: astore 19
      // 170: ldc2_w 319551843007769804
      // 173: aload 19
      // 175: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 178: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 17b: ldc2_w 546345160214988812
      // 17e: astore 22
      // 180: astore 21
      // 182: ldc2_w 546345160214988812
      // 185: aload 21
      // 187: aload 22
      // 189: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18c: checkcast javax/swing/KeyStroke
      // 18f: goto 196
      // 192: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 195: athrow
      // 196: invokevirtual javax/swing/KeyStroke.equals (Ljava/lang/Object;)Z
      // 199: aload 2
      // 19a: ifnonnull 220
      // 19d: ifeq 1e9
      // 1a0: goto 1a7
      // 1a3: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: ldc2_w 161177414596717597
      // 1ab: astore 23
      // 1ad: ldc2_w 161177414596717597
      // 1b0: aload 23
      // 1b2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b5: ldc2_w 493158471773442262
      // 1b8: astore 25
      // 1ba: ldc2_w 493158471773442262
      // 1bd: aload 25
      // 1bf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1c2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1c5: ldc2_w 590160201207864641
      // 1c8: astore 28
      // 1ca: astore 27
      // 1cc: ldc2_w 590160201207864641
      // 1cf: aload 27
      // 1d1: aload 28
      // 1d3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1d6: pop
      // 1d7: goto 1de
      // 1da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1dd: athrow
      // 1de: aload 2
      // 1df: ifnull 367
      // 1e2: goto 1e9
      // 1e5: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: aload 3
      // 1ea: aload 0
      // 1eb: ldc2_w 471446672619646134
      // 1ee: astore 29
      // 1f0: ldc2_w 471446672619646134
      // 1f3: aload 29
      // 1f5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1fb: ldc2_w 546345160214988812
      // 1fe: astore 32
      // 200: astore 31
      // 202: ldc2_w 546345160214988812
      // 205: aload 31
      // 207: aload 32
      // 209: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20c: checkcast javax/swing/KeyStroke
      // 20f: goto 216
      // 212: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 215: athrow
      // 216: invokevirtual javax/swing/KeyStroke.equals (Ljava/lang/Object;)Z
      // 219: goto 220
      // 21c: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21f: athrow
      // 220: aload 2
      // 221: ifnonnull 2f0
      // 224: ifeq 270
      // 227: goto 22e
      // 22a: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22d: athrow
      // 22e: aload 0
      // 22f: ldc2_w 161177414596717597
      // 232: astore 33
      // 234: ldc2_w 161177414596717597
      // 237: aload 33
      // 239: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 23c: ldc2_w 493158471773442262
      // 23f: astore 35
      // 241: ldc2_w 493158471773442262
      // 244: aload 35
      // 246: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 249: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 24c: ldc2_w 143308290537343547
      // 24f: astore 38
      // 251: astore 37
      // 253: ldc2_w 143308290537343547
      // 256: aload 37
      // 258: aload 38
      // 25a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 25d: pop
      // 25e: goto 265
      // 261: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 264: athrow
      // 265: aload 2
      // 266: ifnull 367
      // 269: goto 270
      // 26c: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: aload 3
      // 271: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 274: ldc2_w 270389152141252877
      // 277: astore 39
      // 279: ldc2_w 270389152141252877
      // 27c: aload 39
      // 27e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 281: goto 288
      // 284: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 287: athrow
      // 288: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 28b: ldc2_w 306266403902896148
      // 28e: astore 42
      // 290: astore 41
      // 292: ldc2_w 306266403902896148
      // 295: aload 41
      // 297: aload 42
      // 299: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29c: goto 2a3
      // 29f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a2: athrow
      // 2a3: ldc2_w 391819096557420250
      // 2a6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2a9: aconst_null
      // 2aa: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2ad: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 2b0: ldc2_w 487190762664997585
      // 2b3: astore 44
      // 2b5: astore 43
      // 2b7: ldc2_w 487190762664997585
      // 2ba: aload 43
      // 2bc: aload 44
      // 2be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2c1: goto 2c8
      // 2c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2cb: ldc2_w 546345160214988812
      // 2ce: astore 46
      // 2d0: astore 45
      // 2d2: ldc2_w 546345160214988812
      // 2d5: aload 45
      // 2d7: aload 46
      // 2d9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2dc: checkcast javax/swing/KeyStroke
      // 2df: goto 2e6
      // 2e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e5: athrow
      // 2e6: invokevirtual javax/swing/KeyStroke.equals (Ljava/lang/Object;)Z
      // 2e9: goto 2f0
      // 2ec: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ef: athrow
      // 2f0: ifeq 367
      // 2f3: aload 0
      // 2f4: ldc2_w 161177414596717597
      // 2f7: astore 47
      // 2f9: ldc2_w 161177414596717597
      // 2fc: aload 47
      // 2fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 301: ldc2_w 493158471773442262
      // 304: astore 49
      // 306: ldc2_w 493158471773442262
      // 309: aload 49
      // 30b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 30e: aload 0
      // 30f: ldc2_w 161177414596717597
      // 312: astore 51
      // 314: ldc2_w 161177414596717597
      // 317: aload 51
      // 319: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 31c: ldc2_w 493158471773442262
      // 31f: astore 53
      // 321: ldc2_w 493158471773442262
      // 324: aload 53
      // 326: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 329: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 32c: ldc2_w 194560825135347400
      // 32f: astore 56
      // 331: astore 55
      // 333: ldc2_w 194560825135347400
      // 336: aload 55
      // 338: aload 56
      // 33a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 33d: goto 344
      // 340: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 343: athrow
      // 344: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 347: ldc2_w 228917422408595458
      // 34a: astore 58
      // 34c: astore 57
      // 34e: ldc2_w 228917422408595458
      // 351: aload 57
      // 353: aload 58
      // 355: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 358: pop
      // 359: goto 360
      // 35c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 35f: athrow
      // 360: goto 367
      // 363: invokestatic com/finalshell/core/QP.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 366: athrow
      // 367: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2291886859903111746L;
      long var10002 = -7900989553427017142L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





