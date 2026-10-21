package com.finalshell.task;

import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Kq2 implements Runnable {
   public final DefaultMutableTreeNode u;
   public final Tf4 q;
   public final DefaultMutableTreeNode J;
   public final boolean R;
   public final TreePath v;
   public final String E;
   public final boolean y;
   public final ConnectionInfoPanel r;
   public static long a;

   public Kq2(ConnectionInfoPanel var1, DefaultMutableTreeNode var2, Tf4 var3, DefaultMutableTreeNode var4, boolean var5, TreePath var6, String var7, boolean var8) {
      this.r = var1;
      this.u = var2;
      this.q = var3;
      this.J = var4;
      this.R = var5;
      this.v = var6;
      this.E = var7;
      this.y = var8;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 003: astore 1
      // 004: aload 0
      // 005: ldc2_w 343561976343973986
      // 008: astore 3
      // 009: ldc2_w 343561976343973986
      // 00c: aload 3
      // 00d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 010: aload 0
      // 011: ldc2_w 186035289376754136
      // 014: astore 5
      // 016: ldc2_w 186035289376754136
      // 019: aload 5
      // 01b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01e: aload 0
      // 01f: ldc2_w 159050853805299127
      // 022: astore 7
      // 024: ldc2_w 159050853805299127
      // 027: aload 7
      // 029: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 02c: bipush 1
      // 02d: bipush 0
      // 02e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 031: aload 0
      // 032: ldc2_w 526560366781086974
      // 035: astore 9
      // 037: ldc2_w 526560366781086974
      // 03a: aload 9
      // 03c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03f: bipush 0
      // 040: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 043: ldc2_w 280876818035359663
      // 046: astore 12
      // 048: astore 11
      // 04a: ldc2_w 280876818035359663
      // 04d: aload 11
      // 04f: aload 12
      // 051: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 054: pop
      // 055: goto 05c
      // 058: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05b: athrow
      // 05c: aload 0
      // 05d: ldc2_w 343561976343973986
      // 060: astore 13
      // 062: ldc2_w 343561976343973986
      // 065: aload 13
      // 067: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06a: aload 0
      // 06b: ldc2_w 159050853805299127
      // 06e: astore 15
      // 070: ldc2_w 159050853805299127
      // 073: aload 15
      // 075: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 078: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 07b: ldc2_w 197703613863722085
      // 07e: astore 18
      // 080: astore 17
      // 082: ldc2_w 197703613863722085
      // 085: aload 17
      // 087: aload 18
      // 089: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 08c: checkcast java/lang/Boolean
      // 08f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 092: goto 099
      // 095: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 098: athrow
      // 099: aload 1
      // 09a: ifnull 182
      // 09d: ifeq 12a
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: ldc2_w 159050853805299127
      // 0ab: astore 19
      // 0ad: ldc2_w 159050853805299127
      // 0b0: aload 19
      // 0b2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0b5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b8: ldc2_w 490764181082108623
      // 0bb: astore 22
      // 0bd: astore 21
      // 0bf: ldc2_w 490764181082108623
      // 0c2: aload 21
      // 0c4: aload 22
      // 0c6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c9: checkcast java/lang/Boolean
      // 0cc: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0cf: goto 0d6
      // 0d2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: ifnull 182
      // 0da: goto 0e1
      // 0dd: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e0: athrow
      // 0e1: ifne 12a
      // 0e4: goto 0eb
      // 0e7: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: ldc2_w 343561976343973986
      // 0ef: astore 23
      // 0f1: ldc2_w 343561976343973986
      // 0f4: aload 23
      // 0f6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0f9: ldc2_w 592764144014982287
      // 0fc: astore 25
      // 0fe: ldc2_w 592764144014982287
      // 101: aload 25
      // 103: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 106: bipush 0
      // 107: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 10a: ldc2_w 596499686400442579
      // 10d: astore 28
      // 10f: astore 27
      // 111: ldc2_w 596499686400442579
      // 114: aload 27
      // 116: aload 28
      // 118: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11b: pop
      // 11c: goto 123
      // 11f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 122: athrow
      // 123: goto 12a
      // 126: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 129: athrow
      // 12a: aload 0
      // 12b: aload 1
      // 12c: ifnull 242
      // 12f: ldc2_w 343561976343973986
      // 132: astore 29
      // 134: ldc2_w 343561976343973986
      // 137: aload 29
      // 139: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 13c: ldc2_w 428509894309855334
      // 13f: astore 31
      // 141: ldc2_w 428509894309855334
      // 144: aload 31
      // 146: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 149: checkcast java/util/HashSet
      // 14c: aload 0
      // 14d: ldc2_w 159050853805299127
      // 150: astore 33
      // 152: ldc2_w 159050853805299127
      // 155: aload 33
      // 157: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 15a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 15d: ldc2_w 498856411508641826
      // 160: astore 36
      // 162: astore 35
      // 164: ldc2_w 498856411508641826
      // 167: aload 35
      // 169: aload 36
      // 16b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16e: checkcast java/lang/String
      // 171: goto 178
      // 174: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 177: athrow
      // 178: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 181: athrow
      // 182: ifeq 241
      // 185: aload 0
      // 186: ldc2_w 278474631522754292
      // 189: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 18c: swap
      // 18d: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 190: aload 1
      // 191: ifnull 240
      // 194: goto 19b
      // 197: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 19a: athrow
      // 19b: ifeq 1f3
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: ldc2_w 159050853805299127
      // 1a9: astore 37
      // 1ab: ldc2_w 159050853805299127
      // 1ae: aload 37
      // 1b0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b6: ldc2_w 490764181082108623
      // 1b9: astore 40
      // 1bb: astore 39
      // 1bd: ldc2_w 490764181082108623
      // 1c0: aload 39
      // 1c2: aload 40
      // 1c4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c7: checkcast java/lang/Boolean
      // 1ca: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1cd: goto 1d4
      // 1d0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: ifeq 1e8
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1dd: athrow
      // 1de: getstatic com/finalshell/task/Kq2.a J
      // 1e1: invokestatic java/lang/Thread.sleep (J)V
      // 1e4: goto 1e8
      // 1e7: astore 2
      // 1e8: new com/finalshell/task/Nm2
      // 1eb: dup
      // 1ec: aload 0
      // 1ed: invokespecial com/finalshell/task/Nm2.<init> (Lcom/finalshell/task/Kq2;)V
      // 1f0: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 1f3: aload 0
      // 1f4: ldc2_w 343561976343973986
      // 1f7: astore 41
      // 1f9: ldc2_w 343561976343973986
      // 1fc: aload 41
      // 1fe: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 201: ldc2_w 428509894309855334
      // 204: astore 43
      // 206: ldc2_w 428509894309855334
      // 209: aload 43
      // 20b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 20e: checkcast java/util/HashSet
      // 211: aload 0
      // 212: ldc2_w 159050853805299127
      // 215: astore 45
      // 217: ldc2_w 159050853805299127
      // 21a: aload 45
      // 21c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 21f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 222: ldc2_w 498856411508641826
      // 225: astore 48
      // 227: astore 47
      // 229: ldc2_w 498856411508641826
      // 22c: aload 47
      // 22e: aload 48
      // 230: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 233: checkcast java/lang/String
      // 236: goto 23d
      // 239: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 240: pop
      // 241: aload 0
      // 242: ldc2_w 440972903857434927
      // 245: astore 49
      // 247: ldc2_w 440972903857434927
      // 24a: aload 49
      // 24c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 24f: checkcast java/lang/String
      // 252: aload 1
      // 253: ifnull 2d6
      // 256: ifnull 2aa
      // 259: goto 260
      // 25c: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 25f: athrow
      // 260: aload 0
      // 261: ldc2_w 343561976343973986
      // 264: astore 51
      // 266: ldc2_w 343561976343973986
      // 269: aload 51
      // 26b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 26e: aload 0
      // 26f: ldc2_w 440972903857434927
      // 272: astore 53
      // 274: ldc2_w 440972903857434927
      // 277: aload 53
      // 279: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 27c: aload 0
      // 27d: ldc2_w 425965035529287134
      // 280: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 283: swap
      // 284: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 287: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 28a: ldc2_w 164933463804385401
      // 28d: astore 56
      // 28f: astore 55
      // 291: ldc2_w 164933463804385401
      // 294: aload 55
      // 296: aload 56
      // 298: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29b: pop
      // 29c: goto 2a3
      // 29f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a2: athrow
      // 2a3: goto 2aa
      // 2a6: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2a9: athrow
      // 2aa: aload 0
      // 2ab: ldc2_w 343561976343973986
      // 2ae: astore 57
      // 2b0: ldc2_w 343561976343973986
      // 2b3: aload 57
      // 2b5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2b8: checkcast com/finalshell/ui/panel/Connection4
      // 2bb: aload 1
      // 2bc: ifnull 343
      // 2bf: ldc2_w 438003004996277190
      // 2c2: astore 59
      // 2c4: ldc2_w 438003004996277190
      // 2c7: aload 59
      // 2c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2cc: checkcast java/lang/String
      // 2cf: goto 2d6
      // 2d2: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2d5: athrow
      // 2d6: ifnull 355
      // 2d9: aload 0
      // 2da: ldc2_w 343561976343973986
      // 2dd: astore 61
      // 2df: ldc2_w 343561976343973986
      // 2e2: aload 61
      // 2e4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2e7: ldc2_w 285663222664681848
      // 2ea: astore 63
      // 2ec: ldc2_w 285663222664681848
      // 2ef: aload 63
      // 2f1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2f4: aload 0
      // 2f5: ldc2_w 343561976343973986
      // 2f8: astore 65
      // 2fa: ldc2_w 343561976343973986
      // 2fd: aload 65
      // 2ff: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 302: ldc2_w 438003004996277190
      // 305: astore 67
      // 307: ldc2_w 438003004996277190
      // 30a: aload 67
      // 30c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 30f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 312: ldc2_w 343697430899942544
      // 315: astore 70
      // 317: astore 69
      // 319: ldc2_w 343697430899942544
      // 31c: aload 69
      // 31e: aload 70
      // 320: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 323: pop
      // 324: goto 32b
      // 327: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32a: athrow
      // 32b: aload 0
      // 32c: ldc2_w 343561976343973986
      // 32f: astore 71
      // 331: ldc2_w 343561976343973986
      // 334: aload 71
      // 336: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 339: checkcast com/finalshell/ui/panel/Connection4
      // 33c: goto 343
      // 33f: invokestatic com/finalshell/task/Kq2.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 342: athrow
      // 343: aconst_null
      // 344: ldc2_w 438003004996277190
      // 347: astore 74
      // 349: astore 73
      // 34b: ldc2_w 438003004996277190
      // 34e: aload 73
      // 350: aload 74
      // 352: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 355: goto 3a7
      // 358: astore 2
      // 359: aload 0
      // 35a: ldc2_w 343561976343973986
      // 35d: astore 75
      // 35f: ldc2_w 343561976343973986
      // 362: aload 75
      // 364: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 367: ldc2_w 490343386624486773
      // 36a: astore 77
      // 36c: ldc2_w 490343386624486773
      // 36f: aload 77
      // 371: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 374: checkcast java/util/HashSet
      // 377: aload 0
      // 378: ldc2_w 159050853805299127
      // 37b: astore 79
      // 37d: ldc2_w 159050853805299127
      // 380: aload 79
      // 382: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 385: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 388: ldc2_w 498856411508641826
      // 38b: astore 82
      // 38d: astore 81
      // 38f: ldc2_w 498856411508641826
      // 392: aload 81
      // 394: aload 82
      // 396: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 399: checkcast java/lang/String
      // 39c: goto 3a3
      // 39f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a2: athrow
      // 3a3: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 3a6: pop
      // 3a7: aload 0
      // 3a8: ldc2_w 343561976343973986
      // 3ab: astore 83
      // 3ad: ldc2_w 343561976343973986
      // 3b0: aload 83
      // 3b2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3b5: ldc2_w 467542466021000295
      // 3b8: astore 85
      // 3ba: ldc2_w 467542466021000295
      // 3bd: aload 85
      // 3bf: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3c2: checkcast java/util/HashSet
      // 3c5: aload 0
      // 3c6: ldc2_w 159050853805299127
      // 3c9: astore 87
      // 3cb: ldc2_w 159050853805299127
      // 3ce: aload 87
      // 3d0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3d3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3d6: ldc2_w 498856411508641826
      // 3d9: astore 90
      // 3db: astore 89
      // 3dd: ldc2_w 498856411508641826
      // 3e0: aload 89
      // 3e2: aload 90
      // 3e4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3e7: checkcast java/lang/String
      // 3ea: goto 3f1
      // 3ed: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f0: athrow
      // 3f1: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 3f4: pop
      // 3f5: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5785613971342639345L;
      long var10002 = 5785613971342639253L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





