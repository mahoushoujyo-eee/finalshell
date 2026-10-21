package com.finalshell.ui.listener;

import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.Bq2;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

public class YN3 implements MouseListener {
   public final AM P;
   public final T32 R;
   public final boolean z;
   public final Bq2 h;
   public static long[] a;
   public static Long[] b;

   public YN3(Bq2 var1, AM var2, T32 var3, boolean var4) {
      this.h = var1;
      this.P = var2;
      this.R = var3;
      this.z = var4;
   }

   @Override
   public void mouseReleased(MouseEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/AM.s$arrString ()[Ljava/lang/String;
      // 003: aload 0
      // 004: ldc2_w 479413945485822457
      // 007: astore 13
      // 009: ldc2_w 479413945485822457
      // 00c: aload 13
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: aload 1
      // 012: invokevirtual java/awt/event/MouseEvent.getLocationOnScreen ()Ljava/awt/Point;
      // 015: ldc2_w 517593553776656381
      // 018: astore 16
      // 01a: astore 15
      // 01c: ldc2_w 517593553776656381
      // 01f: aload 15
      // 021: aload 16
      // 023: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 026: astore 2
      // 027: aload 1
      // 028: invokevirtual java/awt/event/MouseEvent.getButton ()I
      // 02b: bipush 1
      // 02c: if_icmpne 02f
      // 02f: aload 0
      // 030: ldc2_w 479413945485822457
      // 033: astore 17
      // 035: ldc2_w 479413945485822457
      // 038: aload 17
      // 03a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 03d: ldc2_w 461249878665463746
      // 040: astore 19
      // 042: ldc2_w 461249878665463746
      // 045: aload 19
      // 047: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04a: checkcast com/finalshell/core/TH3
      // 04d: bipush 0
      // 04e: invokevirtual com/finalshell/core/TH3.setVisible (Z)V
      // 051: aload 0
      // 052: ldc2_w 479413945485822457
      // 055: astore 21
      // 057: ldc2_w 479413945485822457
      // 05a: aload 21
      // 05c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05f: checkcast com/finalshell/ui/panel/Bq2
      // 062: invokevirtual com/finalshell/ui/panel/Bq2.getParent ()Ljava/awt/Container;
      // 065: invokevirtual java/awt/Container.getComponents ()[Ljava/awt/Component;
      // 068: astore 3
      // 069: bipush 0
      // 06a: istore 4
      // 06c: bipush 0
      // 06d: istore 5
      // 06f: aload 3
      // 070: astore 6
      // 072: aload 6
      // 074: arraylength
      // 075: istore 7
      // 077: bipush 0
      // 078: istore 8
      // 07a: iload 8
      // 07c: iload 7
      // 07e: if_icmpge 0d0
      // 081: aload 6
      // 083: iload 8
      // 085: aaload
      // 086: astore 9
      // 088: aload 2
      // 089: ifnonnull 0cc
      // 08c: aload 9
      // 08e: aload 0
      // 08f: ldc2_w 479413945485822457
      // 092: astore 23
      // 094: ldc2_w 479413945485822457
      // 097: aload 23
      // 099: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 09c: checkcast com/finalshell/ui/panel/Bq2
      // 09f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0a2: aload 2
      // 0a3: ifnonnull 0e8
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ac: athrow
      // 0ad: ifeq 0bf
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0b6: athrow
      // 0b7: iload 4
      // 0b9: istore 5
      // 0bb: aload 2
      // 0bc: ifnull 0d0
      // 0bf: iinc 4 1
      // 0c2: iinc 8 1
      // 0c5: goto 0cc
      // 0c8: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0cb: athrow
      // 0cc: aload 2
      // 0cd: ifnull 07a
      // 0d0: aload 0
      // 0d1: ldc2_w 479413945485822457
      // 0d4: astore 25
      // 0d6: ldc2_w 479413945485822457
      // 0d9: aload 25
      // 0db: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0de: ldc2_w 613636876466420761
      // 0e1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e4: swap
      // 0e5: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 0e8: aload 2
      // 0e9: ifnonnull 1c5
      // 0ec: ifeq 17d
      // 0ef: goto 0f6
      // 0f2: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: ldc2_w 479413945485822457
      // 0fa: astore 27
      // 0fc: ldc2_w 479413945485822457
      // 0ff: aload 27
      // 101: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 104: ldc2_w 198114728363002908
      // 107: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 10a: swap
      // 10b: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 10e: bipush -1
      // 10f: aload 2
      // 110: ifnonnull 1d1
      // 113: goto 11a
      // 116: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 119: athrow
      // 11a: if_icmple 17d
      // 11d: goto 124
      // 120: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 123: athrow
      // 124: aload 0
      // 125: ldc2_w 465738942243700971
      // 128: astore 29
      // 12a: ldc2_w 465738942243700971
      // 12d: aload 29
      // 12f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 132: aload 0
      // 133: ldc2_w 340109765049345419
      // 136: astore 31
      // 138: ldc2_w 340109765049345419
      // 13b: aload 31
      // 13d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 140: iload 5
      // 142: aload 0
      // 143: ldc2_w 479413945485822457
      // 146: astore 33
      // 148: ldc2_w 479413945485822457
      // 14b: aload 33
      // 14d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 150: ldc2_w 198114728363002908
      // 153: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 156: swap
      // 157: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 15a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;II)[Ljava/lang/Object;
      // 15d: ldc2_w 161838549202144815
      // 160: astore 36
      // 162: astore 35
      // 164: ldc2_w 161838549202144815
      // 167: aload 35
      // 169: aload 36
      // 16b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16e: pop
      // 16f: goto 176
      // 172: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 175: athrow
      // 176: goto 17d
      // 179: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 17c: athrow
      // 17d: aload 0
      // 17e: ldc2_w 479413945485822457
      // 181: astore 37
      // 183: ldc2_w 479413945485822457
      // 186: aload 37
      // 188: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 18b: bipush 0
      // 18c: ldc2_w 373975248585568357
      // 18f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 192: dup_x2
      // 193: pop
      // 194: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 197: aload 0
      // 198: ldc2_w 479413945485822457
      // 19b: astore 39
      // 19d: ldc2_w 479413945485822457
      // 1a0: aload 39
      // 1a2: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1a5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1a8: ldc2_w 475559379800111291
      // 1ab: astore 42
      // 1ad: astore 41
      // 1af: ldc2_w 475559379800111291
      // 1b2: aload 41
      // 1b4: aload 42
      // 1b6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b9: pop
      // 1ba: goto 1c1
      // 1bd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: aload 1
      // 1c2: invokevirtual java/awt/event/MouseEvent.getButton ()I
      // 1c5: aload 2
      // 1c6: ifnonnull 2d8
      // 1c9: bipush 3
      // 1ca: goto 1d1
      // 1cd: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1d0: athrow
      // 1d1: if_icmpne 288
      // 1d4: aload 0
      // 1d5: ldc2_w 320197001260686948
      // 1d8: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1db: swap
      // 1dc: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 1df: aload 2
      // 1e0: ifnonnull 2d8
      // 1e3: goto 1ea
      // 1e6: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1e9: athrow
      // 1ea: ifne 288
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1f3: athrow
      // 1f4: aload 0
      // 1f5: ldc2_w 465738942243700971
      // 1f8: astore 43
      // 1fa: ldc2_w 465738942243700971
      // 1fd: aload 43
      // 1ff: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 202: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 205: ldc2_w 593027665482143819
      // 208: astore 46
      // 20a: astore 45
      // 20c: ldc2_w 593027665482143819
      // 20f: aload 45
      // 211: aload 46
      // 213: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 216: checkcast java/lang/Boolean
      // 219: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 21c: goto 223
      // 21f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 222: athrow
      // 223: aload 2
      // 224: ifnonnull 2d8
      // 227: goto 22e
      // 22a: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 22d: athrow
      // 22e: ifeq 288
      // 231: goto 238
      // 234: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 237: athrow
      // 238: new com/finalshell/ui/panel/CopyMenu
      // 23b: dup
      // 23c: aload 0
      // 23d: ldc2_w 465738942243700971
      // 240: astore 47
      // 242: ldc2_w 465738942243700971
      // 245: aload 47
      // 247: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 24a: checkcast com/finalshell/ui/panel/AM
      // 24d: aload 0
      // 24e: ldc2_w 340109765049345419
      // 251: astore 49
      // 253: ldc2_w 340109765049345419
      // 256: aload 49
      // 258: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 25b: checkcast com/finalshell/core/T32
      // 25e: aload 0
      // 25f: ldc2_w 479413945485822457
      // 262: astore 51
      // 264: ldc2_w 479413945485822457
      // 267: aload 51
      // 269: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 26c: checkcast com/finalshell/ui/panel/Bq2
      // 26f: invokespecial com/finalshell/ui/panel/CopyMenu.<init> (Lcom/finalshell/ui/panel/AM;Lcom/finalshell/core/T32;Lcom/finalshell/ui/panel/Bq2;)V
      // 272: astore 6
      // 274: aload 6
      // 276: aload 1
      // 277: invokevirtual java/awt/event/MouseEvent.getSource ()Ljava/lang/Object;
      // 27a: checkcast java/awt/Component
      // 27d: aload 1
      // 27e: invokevirtual java/awt/event/MouseEvent.getX ()I
      // 281: aload 1
      // 282: invokevirtual java/awt/event/MouseEvent.getY ()I
      // 285: invokevirtual com/finalshell/ui/panel/CopyMenu.show (Ljava/awt/Component;II)V
      // 288: aload 0
      // 289: ldc2_w 479413945485822457
      // 28c: astore 53
      // 28e: ldc2_w 479413945485822457
      // 291: aload 53
      // 293: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 296: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 299: ldc2_w 467250021884313480
      // 29c: astore 56
      // 29e: astore 55
      // 2a0: ldc2_w 467250021884313480
      // 2a3: aload 55
      // 2a5: aload 56
      // 2a7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2aa: pop
      // 2ab: goto 2b2
      // 2ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b1: athrow
      // 2b2: aload 0
      // 2b3: ldc2_w 479413945485822457
      // 2b6: astore 57
      // 2b8: ldc2_w 479413945485822457
      // 2bb: aload 57
      // 2bd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2c0: checkcast com/finalshell/ui/panel/Bq2
      // 2c3: aload 2
      // 2c4: ifnonnull 35b
      // 2c7: ldc2_w 613636876466420761
      // 2ca: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2cd: swap
      // 2ce: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 2d1: goto 2d8
      // 2d4: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2d7: athrow
      // 2d8: ifne 34a
      // 2db: new com/finalshell/core/Y9
      // 2de: dup
      // 2df: aload 0
      // 2e0: ldc2_w 340109765049345419
      // 2e3: astore 59
      // 2e5: ldc2_w 340109765049345419
      // 2e8: aload 59
      // 2ea: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2ed: checkcast com/finalshell/core/T32
      // 2f0: ldc2_w 454291477903395804
      // 2f3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2f6: aconst_null
      // 2f7: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 2fa: invokespecial com/finalshell/core/Y9.<init> (Lcom/finalshell/core/T32;I)V
      // 2fd: astore 6
      // 2ff: aload 6
      // 301: aload 1
      // 302: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 305: ldc2_w 236847225442494468
      // 308: astore 62
      // 30a: astore 61
      // 30c: ldc2_w 236847225442494468
      // 30f: aload 61
      // 311: aload 62
      // 313: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 316: pop
      // 317: goto 31e
      // 31a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 31d: athrow
      // 31e: aload 0
      // 31f: ldc2_w 465738942243700971
      // 322: astore 63
      // 324: ldc2_w 465738942243700971
      // 327: aload 63
      // 329: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 32c: aload 6
      // 32e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 331: ldc2_w 484591085759846041
      // 334: astore 66
      // 336: astore 65
      // 338: ldc2_w 484591085759846041
      // 33b: aload 65
      // 33d: aload 66
      // 33f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 342: pop
      // 343: goto 34a
      // 346: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 349: athrow
      // 34a: aload 0
      // 34b: ldc2_w 479413945485822457
      // 34e: astore 67
      // 350: ldc2_w 479413945485822457
      // 353: aload 67
      // 355: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 358: checkcast com/finalshell/ui/panel/Bq2
      // 35b: bipush 0
      // 35c: ldc2_w 613636876466420761
      // 35f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 362: dup_x2
      // 363: pop
      // 364: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 367: aload 0
      // 368: ldc2_w 465738942243700971
      // 36b: astore 69
      // 36d: ldc2_w 465738942243700971
      // 370: aload 69
      // 372: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 375: bipush 0
      // 376: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 379: ldc2_w 241611532530183374
      // 37c: astore 72
      // 37e: astore 71
      // 380: ldc2_w 241611532530183374
      // 383: aload 71
      // 385: aload 72
      // 387: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 38a: pop
      // 38b: goto 392
      // 38e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 391: athrow
      // 392: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 395: ldc2_w 299368763907830673
      // 398: astore 73
      // 39a: ldc2_w 299368763907830673
      // 39d: aload 73
      // 39f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 3a2: checkcast com/finalshell/core/Jc2
      // 3a5: goto 3ac
      // 3a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3ab: athrow
      // 3ac: astore 6
      // 3ae: aload 6
      // 3b0: bipush 0
      // 3b1: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 3b4: ldc2_w 555622091513386681
      // 3b7: astore 76
      // 3b9: astore 75
      // 3bb: ldc2_w 555622091513386681
      // 3be: aload 75
      // 3c0: aload 76
      // 3c2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3c5: pop
      // 3c6: goto 3cd
      // 3c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3cc: athrow
      // 3cd: aload 6
      // 3cf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3d2: ldc2_w 386124335143120314
      // 3d5: astore 78
      // 3d7: astore 77
      // 3d9: ldc2_w 386124335143120314
      // 3dc: aload 77
      // 3de: aload 78
      // 3e0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3e3: checkcast java/lang/Integer
      // 3e6: invokevirtual java/lang/Integer.intValue ()I
      // 3e9: goto 3f0
      // 3ec: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3ef: athrow
      // 3f0: istore 7
      // 3f2: aload 0
      // 3f3: ldc2_w 465738942243700971
      // 3f6: astore 79
      // 3f8: ldc2_w 465738942243700971
      // 3fb: aload 79
      // 3fd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 400: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 403: ldc2_w 308510891685223410
      // 406: astore 82
      // 408: astore 81
      // 40a: ldc2_w 308510891685223410
      // 40d: aload 81
      // 40f: aload 82
      // 411: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 414: checkcast java/lang/Boolean
      // 417: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 41a: goto 421
      // 41d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 420: athrow
      // 421: aload 2
      // 422: ifnonnull 432
      // 425: ifne 430
      // 428: goto 42f
      // 42b: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 42e: athrow
      // 42f: return
      // 430: iload 7
      // 432: aload 2
      // 433: ifnonnull a9b
      // 436: bipush -1
      // 437: if_icmpeq a6c
      // 43a: goto 441
      // 43d: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 440: athrow
      // 441: iload 7
      // 443: ldc2_w 489009438537732568
      // 446: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 449: aconst_null
      // 44a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 44d: aload 2
      // 44e: ifnonnull 673
      // 451: goto 458
      // 454: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 457: athrow
      // 458: if_icmpne 667
      // 45b: goto 462
      // 45e: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 461: athrow
      // 462: aload 6
      // 464: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 467: ldc2_w 368429882308878805
      // 46a: astore 84
      // 46c: astore 83
      // 46e: ldc2_w 368429882308878805
      // 471: aload 83
      // 473: aload 84
      // 475: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 478: checkcast java/lang/Boolean
      // 47b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 47e: goto 485
      // 481: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 484: athrow
      // 485: aload 2
      // 486: ifnonnull a9b
      // 489: goto 490
      // 48c: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 48f: athrow
      // 490: ifeq a6c
      // 493: goto 49a
      // 496: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 499: athrow
      // 49a: aload 6
      // 49c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 49f: ldc2_w 404411013658768945
      // 4a2: astore 86
      // 4a4: astore 85
      // 4a6: ldc2_w 404411013658768945
      // 4a9: aload 85
      // 4ab: aload 86
      // 4ad: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4b0: checkcast com/finalshell/ui/panel/AM
      // 4b3: goto 4ba
      // 4b6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4b9: athrow
      // 4ba: astore 8
      // 4bc: aload 8
      // 4be: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4c1: ldc2_w 308510891685223410
      // 4c4: astore 88
      // 4c6: astore 87
      // 4c8: ldc2_w 308510891685223410
      // 4cb: aload 87
      // 4cd: aload 88
      // 4cf: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4d2: checkcast java/lang/Boolean
      // 4d5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4d8: goto 4df
      // 4db: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4de: athrow
      // 4df: aload 2
      // 4e0: ifnonnull 511
      // 4e3: ifne 4ee
      // 4e6: goto 4ed
      // 4e9: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 4ec: athrow
      // 4ed: return
      // 4ee: aload 8
      // 4f0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 4f3: ldc2_w 383822697771831640
      // 4f6: astore 90
      // 4f8: astore 89
      // 4fa: ldc2_w 383822697771831640
      // 4fd: aload 89
      // 4ff: aload 90
      // 501: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 504: checkcast java/lang/Integer
      // 507: invokevirtual java/lang/Integer.intValue ()I
      // 50a: goto 511
      // 50d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 510: athrow
      // 511: aload 2
      // 512: ifnonnull 563
      // 515: ifle 664
      // 518: goto 51f
      // 51b: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 51e: athrow
      // 51f: aload 0
      // 520: ldc2_w 465738942243700971
      // 523: astore 91
      // 525: ldc2_w 465738942243700971
      // 528: aload 91
      // 52a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 52d: checkcast com/finalshell/ui/panel/AM
      // 530: aload 2
      // 531: ifnonnull 57f
      // 534: goto 53b
      // 537: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 53a: athrow
      // 53b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 53e: ldc2_w 230171768324088030
      // 541: astore 94
      // 543: astore 93
      // 545: ldc2_w 230171768324088030
      // 548: aload 93
      // 54a: aload 94
      // 54c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 54f: checkcast java/util/ArrayList
      // 552: goto 559
      // 555: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 558: athrow
      // 559: invokevirtual java/util/ArrayList.size ()I
      // 55c: goto 563
      // 55f: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 562: athrow
      // 563: bipush 1
      // 564: if_icmpne 59c
      // 567: aload 0
      // 568: ldc2_w 465738942243700971
      // 56b: astore 95
      // 56d: ldc2_w 465738942243700971
      // 570: aload 95
      // 572: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 575: checkcast com/finalshell/ui/panel/AM
      // 578: goto 57f
      // 57b: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 57e: athrow
      // 57f: bipush 1
      // 580: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 583: ldc2_w 244186568690454157
      // 586: astore 98
      // 588: astore 97
      // 58a: ldc2_w 244186568690454157
      // 58d: aload 97
      // 58f: aload 98
      // 591: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 594: pop
      // 595: goto 59c
      // 598: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 59b: athrow
      // 59c: aload 6
      // 59e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5a1: ldc2_w 467213861955203865
      // 5a4: astore 100
      // 5a6: astore 99
      // 5a8: ldc2_w 467213861955203865
      // 5ab: aload 99
      // 5ad: aload 100
      // 5af: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5b2: checkcast com/finalshell/ui/panel/Bq2
      // 5b5: goto 5bc
      // 5b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5bb: athrow
      // 5bc: astore 9
      // 5be: aload 0
      // 5bf: ldc2_w 465738942243700971
      // 5c2: astore 101
      // 5c4: ldc2_w 465738942243700971
      // 5c7: aload 101
      // 5c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5cc: aload 0
      // 5cd: ldc2_w 340109765049345419
      // 5d0: astore 103
      // 5d2: ldc2_w 340109765049345419
      // 5d5: aload 103
      // 5d7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5da: bipush 1
      // 5db: bipush 0
      // 5dc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 5df: ldc2_w 456507190647444792
      // 5e2: astore 106
      // 5e4: astore 105
      // 5e6: ldc2_w 456507190647444792
      // 5e9: aload 105
      // 5eb: aload 106
      // 5ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5f0: pop
      // 5f1: goto 5f8
      // 5f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5f7: athrow
      // 5f8: aload 6
      // 5fa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5fd: ldc2_w 404411013658768945
      // 600: astore 108
      // 602: astore 107
      // 604: ldc2_w 404411013658768945
      // 607: aload 107
      // 609: aload 108
      // 60b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 60e: goto 615
      // 611: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 614: athrow
      // 615: aload 0
      // 616: ldc2_w 340109765049345419
      // 619: astore 109
      // 61b: ldc2_w 340109765049345419
      // 61e: aload 109
      // 620: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 623: aload 8
      // 625: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 628: ldc2_w 383822697771831640
      // 62b: astore 112
      // 62d: astore 111
      // 62f: ldc2_w 383822697771831640
      // 632: aload 111
      // 634: aload 112
      // 636: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 639: checkcast java/lang/Integer
      // 63c: invokevirtual java/lang/Integer.intValue ()I
      // 63f: goto 646
      // 642: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 645: athrow
      // 646: bipush 1
      // 647: isub
      // 648: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 64b: ldc2_w 525546020316376362
      // 64e: astore 114
      // 650: astore 113
      // 652: ldc2_w 525546020316376362
      // 655: aload 113
      // 657: aload 114
      // 659: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 65c: goto 663
      // 65f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 662: athrow
      // 663: pop
      // 664: goto a6c
      // 667: iload 7
      // 669: ldc2_w 617945104086657545
      // 66c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 66f: aconst_null
      // 670: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 673: aload 2
      // 674: ifnonnull 7fb
      // 677: if_icmpne 7ef
      // 67a: goto 681
      // 67d: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 680: athrow
      // 681: aload 0
      // 682: ldc2_w 465738942243700971
      // 685: astore 115
      // 687: ldc2_w 465738942243700971
      // 68a: aload 115
      // 68c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 68f: checkcast com/finalshell/ui/panel/AM
      // 692: aload 2
      // 693: ifnonnull 6e1
      // 696: goto 69d
      // 699: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 69c: athrow
      // 69d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6a0: ldc2_w 230171768324088030
      // 6a3: astore 118
      // 6a5: astore 117
      // 6a7: ldc2_w 230171768324088030
      // 6aa: aload 117
      // 6ac: aload 118
      // 6ae: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6b1: checkcast java/util/ArrayList
      // 6b4: goto 6bb
      // 6b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6ba: athrow
      // 6bb: invokevirtual java/util/ArrayList.size ()I
      // 6be: bipush 1
      // 6bf: if_icmpne 6fe
      // 6c2: goto 6c9
      // 6c5: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6c8: athrow
      // 6c9: aload 0
      // 6ca: ldc2_w 465738942243700971
      // 6cd: astore 119
      // 6cf: ldc2_w 465738942243700971
      // 6d2: aload 119
      // 6d4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6d7: checkcast com/finalshell/ui/panel/AM
      // 6da: goto 6e1
      // 6dd: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 6e0: athrow
      // 6e1: bipush 1
      // 6e2: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 6e5: ldc2_w 244186568690454157
      // 6e8: astore 122
      // 6ea: astore 121
      // 6ec: ldc2_w 244186568690454157
      // 6ef: aload 121
      // 6f1: aload 122
      // 6f3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6f6: pop
      // 6f7: goto 6fe
      // 6fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6fd: athrow
      // 6fe: aload 6
      // 700: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 703: ldc2_w 293621347996046521
      // 706: astore 124
      // 708: astore 123
      // 70a: ldc2_w 293621347996046521
      // 70d: aload 123
      // 70f: aload 124
      // 711: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 714: checkcast java/awt/Window
      // 717: goto 71e
      // 71a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 71d: athrow
      // 71e: astore 8
      // 720: aload 8
      // 722: aload 2
      // 723: ifnonnull 73c
      // 726: instanceof com/finalshell/ui/frame/U
      // 729: ifeq 7ec
      // 72c: goto 733
      // 72f: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 732: athrow
      // 733: aload 8
      // 735: goto 73c
      // 738: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 73b: athrow
      // 73c: checkcast com/finalshell/ui/frame/U
      // 73f: astore 9
      // 741: aload 9
      // 743: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 746: ldc2_w 303756590022481369
      // 749: astore 126
      // 74b: astore 125
      // 74d: ldc2_w 303756590022481369
      // 750: aload 125
      // 752: aload 126
      // 754: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 757: checkcast com/finalshell/ui/panel/AM
      // 75a: goto 761
      // 75d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 760: athrow
      // 761: astore 10
      // 763: aload 0
      // 764: ldc2_w 465738942243700971
      // 767: astore 127
      // 769: ldc2_w 465738942243700971
      // 76c: aload 127
      // 76e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 771: aload 0
      // 772: ldc2_w 340109765049345419
      // 775: astore 129
      // 777: ldc2_w 340109765049345419
      // 77a: aload 129
      // 77c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 77f: bipush 1
      // 780: bipush 0
      // 781: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 784: ldc2_w 456507190647444792
      // 787: astore 132
      // 789: astore 131
      // 78b: ldc2_w 456507190647444792
      // 78e: aload 131
      // 790: aload 132
      // 792: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 795: pop
      // 796: goto 79d
      // 799: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 79c: athrow
      // 79d: aload 10
      // 79f: aload 0
      // 7a0: ldc2_w 340109765049345419
      // 7a3: astore 133
      // 7a5: ldc2_w 340109765049345419
      // 7a8: aload 133
      // 7aa: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 7ad: aload 10
      // 7af: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 7b2: ldc2_w 230171768324088030
      // 7b5: astore 136
      // 7b7: astore 135
      // 7b9: ldc2_w 230171768324088030
      // 7bc: aload 135
      // 7be: aload 136
      // 7c0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7c3: checkcast java/util/ArrayList
      // 7c6: goto 7cd
      // 7c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7cc: athrow
      // 7cd: invokevirtual java/util/ArrayList.size ()I
      // 7d0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 7d3: ldc2_w 525546020316376362
      // 7d6: astore 138
      // 7d8: astore 137
      // 7da: ldc2_w 525546020316376362
      // 7dd: aload 137
      // 7df: aload 138
      // 7e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7e4: goto 7eb
      // 7e7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7ea: athrow
      // 7eb: pop
      // 7ec: goto a6c
      // 7ef: iload 7
      // 7f1: ldc2_w 470891030811937041
      // 7f4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 7f7: aconst_null
      // 7f8: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 7fb: aload 2
      // 7fc: ifnonnull 827
      // 7ff: if_icmpeq 82a
      // 802: goto 809
      // 805: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 808: athrow
      // 809: iload 7
      // 80b: aload 2
      // 80c: ifnonnull a9b
      // 80f: goto 816
      // 812: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 815: athrow
      // 816: ldc2_w 581124220784366544
      // 819: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 81c: aconst_null
      // 81d: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 820: goto 827
      // 823: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 826: athrow
      // 827: if_icmpne a6c
      // 82a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 82d: ldc2_w 270389152141252877
      // 830: astore 139
      // 832: ldc2_w 270389152141252877
      // 835: aload 139
      // 837: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 83a: goto 841
      // 83d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 840: athrow
      // 841: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 844: ldc2_w 634817973682994708
      // 847: astore 142
      // 849: astore 141
      // 84b: ldc2_w 634817973682994708
      // 84e: aload 141
      // 850: aload 142
      // 852: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 855: goto 85c
      // 858: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 85b: athrow
      // 85c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 85f: ldc2_w 240567170779145617
      // 862: astore 144
      // 864: astore 143
      // 866: ldc2_w 240567170779145617
      // 869: aload 143
      // 86b: aload 144
      // 86d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 870: goto 877
      // 873: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 876: athrow
      // 877: bipush 1
      // 878: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 87b: ldc2_w 561698688134982306
      // 87e: astore 146
      // 880: astore 145
      // 882: ldc2_w 561698688134982306
      // 885: aload 145
      // 887: aload 146
      // 889: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 88c: checkcast com/finalshell/ui/frame/U
      // 88f: goto 896
      // 892: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 895: athrow
      // 896: astore 8
      // 898: aload 8
      // 89a: aconst_null
      // 89b: invokevirtual com/finalshell/ui/frame/U.setLocationRelativeTo (Ljava/awt/Component;)V
      // 89e: aload 8
      // 8a0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 8a3: ldc2_w 303756590022481369
      // 8a6: astore 148
      // 8a8: astore 147
      // 8aa: ldc2_w 303756590022481369
      // 8ad: aload 147
      // 8af: aload 148
      // 8b1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 8b4: checkcast com/finalshell/ui/panel/AM
      // 8b7: goto 8be
      // 8ba: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8bd: athrow
      // 8be: ifnonnull 8df
      // 8c1: sipush 3842
      // 8c4: ldc2_w 4494157810304747572
      // 8c7: invokestatic com/finalshell/ui/listener/YN3.a (IJ)J
      // 8ca: invokestatic java/lang/Thread.sleep (J)V
      // 8cd: aload 2
      // 8ce: ifnonnull 952
      // 8d1: goto 89e
      // 8d4: astore 9
      // 8d6: aload 9
      // 8d8: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 8db: aload 2
      // 8dc: ifnull 89e
      // 8df: aload 0
      // 8e0: ldc2_w 465738942243700971
      // 8e3: astore 149
      // 8e5: ldc2_w 465738942243700971
      // 8e8: aload 149
      // 8ea: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 8ed: checkcast com/finalshell/ui/panel/AM
      // 8f0: aload 2
      // 8f1: ifnonnull 972
      // 8f4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 8f7: ldc2_w 230171768324088030
      // 8fa: astore 152
      // 8fc: astore 151
      // 8fe: ldc2_w 230171768324088030
      // 901: aload 151
      // 903: aload 152
      // 905: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 908: checkcast java/util/ArrayList
      // 90b: goto 912
      // 90e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 911: athrow
      // 912: invokevirtual java/util/ArrayList.size ()I
      // 915: bipush 1
      // 916: if_icmpne 952
      // 919: goto 920
      // 91c: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 91f: athrow
      // 920: aload 0
      // 921: ldc2_w 465738942243700971
      // 924: astore 153
      // 926: ldc2_w 465738942243700971
      // 929: aload 153
      // 92b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 92e: bipush 1
      // 92f: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 932: ldc2_w 244186568690454157
      // 935: astore 156
      // 937: astore 155
      // 939: ldc2_w 244186568690454157
      // 93c: aload 155
      // 93e: aload 156
      // 940: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 943: pop
      // 944: goto 94b
      // 947: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 94a: athrow
      // 94b: goto 952
      // 94e: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 951: athrow
      // 952: aload 8
      // 954: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 957: ldc2_w 303756590022481369
      // 95a: astore 158
      // 95c: astore 157
      // 95e: ldc2_w 303756590022481369
      // 961: aload 157
      // 963: aload 158
      // 965: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 968: checkcast com/finalshell/ui/panel/AM
      // 96b: goto 972
      // 96e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 971: athrow
      // 972: astore 9
      // 974: aload 0
      // 975: ldc2_w 465738942243700971
      // 978: astore 159
      // 97a: ldc2_w 465738942243700971
      // 97d: aload 159
      // 97f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 982: aload 0
      // 983: ldc2_w 340109765049345419
      // 986: astore 161
      // 988: ldc2_w 340109765049345419
      // 98b: aload 161
      // 98d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 990: bipush 1
      // 991: bipush 0
      // 992: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 995: ldc2_w 456507190647444792
      // 998: astore 164
      // 99a: astore 163
      // 99c: ldc2_w 456507190647444792
      // 99f: aload 163
      // 9a1: aload 164
      // 9a3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9a6: pop
      // 9a7: goto 9ae
      // 9aa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9ad: athrow
      // 9ae: sipush 20367
      // 9b1: ldc2_w 238018566748719288
      // 9b4: invokestatic com/finalshell/ui/listener/YN3.a (IJ)J
      // 9b7: invokestatic java/lang/Thread.sleep (J)V
      // 9ba: goto 9c4
      // 9bd: astore 10
      // 9bf: aload 10
      // 9c1: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 9c4: aload 9
      // 9c6: aload 0
      // 9c7: ldc2_w 340109765049345419
      // 9ca: astore 165
      // 9cc: ldc2_w 340109765049345419
      // 9cf: aload 165
      // 9d1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 9d4: bipush 0
      // 9d5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;I)[Ljava/lang/Object;
      // 9d8: ldc2_w 525546020316376362
      // 9db: astore 168
      // 9dd: astore 167
      // 9df: ldc2_w 525546020316376362
      // 9e2: aload 167
      // 9e4: aload 168
      // 9e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 9e9: checkcast com/finalshell/core/T32
      // 9ec: goto 9f3
      // 9ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9f2: athrow
      // 9f3: astore 10
      // 9f5: aload 8
      // 9f7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 9fa: ldc2_w 303756590022481369
      // 9fd: astore 170
      // 9ff: astore 169
      // a01: ldc2_w 303756590022481369
      // a04: aload 169
      // a06: aload 170
      // a08: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // a0b: goto a12
      // a0e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a11: athrow
      // a12: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // a15: ldc2_w 230171768324088030
      // a18: astore 172
      // a1a: astore 171
      // a1c: ldc2_w 230171768324088030
      // a1f: aload 171
      // a21: aload 172
      // a23: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // a26: checkcast java/util/ArrayList
      // a29: goto a30
      // a2c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a2f: athrow
      // a30: bipush 0
      // a31: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // a34: checkcast com/finalshell/core/T32
      // a37: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // a3a: ldc2_w 584096728105558414
      // a3d: astore 174
      // a3f: astore 173
      // a41: ldc2_w 584096728105558414
      // a44: aload 173
      // a46: aload 174
      // a48: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // a4b: checkcast com/finalshell/ui/panel/Bq2
      // a4e: goto a55
      // a51: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a54: athrow
      // a55: astore 11
      // a57: new com/finalshell/ui/listener/BW
      // a5a: dup
      // a5b: aload 0
      // a5c: aload 11
      // a5e: aload 8
      // a60: invokespecial com/finalshell/ui/listener/BW.<init> (Lcom/finalshell/ui/listener/YN3;Lcom/finalshell/ui/panel/Bq2;Lcom/finalshell/ui/frame/U;)V
      // a63: astore 12
      // a65: aload 8
      // a67: aload 12
      // a69: invokevirtual com/finalshell/ui/frame/U.addComponentListener (Ljava/awt/event/ComponentListener;)V
      // a6c: aload 0
      // a6d: ldc2_w 479413945485822457
      // a70: astore 175
      // a72: ldc2_w 479413945485822457
      // a75: aload 175
      // a77: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // a7a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // a7d: ldc2_w 589411218730404657
      // a80: astore 178
      // a82: astore 177
      // a84: ldc2_w 589411218730404657
      // a87: aload 177
      // a89: aload 178
      // a8b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // a8e: checkcast java/lang/Boolean
      // a91: invokevirtual java/lang/Boolean.booleanValue ()Z
      // a94: goto a9b
      // a97: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a9a: athrow
      // a9b: aload 2
      // a9c: ifnonnull bd0
      // a9f: ifeq b2b
      // aa2: goto aa9
      // aa5: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // aa8: athrow
      // aa9: aload 0
      // aaa: ldc2_w 465738942243700971
      // aad: astore 179
      // aaf: ldc2_w 465738942243700971
      // ab2: aload 179
      // ab4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // ab7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // aba: ldc2_w 230171768324088030
      // abd: astore 182
      // abf: astore 181
      // ac1: ldc2_w 230171768324088030
      // ac4: aload 181
      // ac6: aload 182
      // ac8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // acb: checkcast java/util/ArrayList
      // ace: goto ad5
      // ad1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // ad4: athrow
      // ad5: invokevirtual java/util/ArrayList.size ()I
      // ad8: aload 2
      // ad9: ifnonnull bd0
      // adc: goto ae3
      // adf: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // ae2: athrow
      // ae3: ifne b2b
      // ae6: goto aed
      // ae9: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // aec: athrow
      // aed: aload 0
      // aee: ldc2_w 479413945485822457
      // af1: astore 183
      // af3: ldc2_w 479413945485822457
      // af6: aload 183
      // af8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // afb: ldc2_w 285898895368671213
      // afe: astore 185
      // b00: ldc2_w 285898895368671213
      // b03: aload 185
      // b05: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // b08: checkcast com/finalshell/ui/frame/U
      // b0b: astore 8
      // b0d: aload 8
      // b0f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // b12: ldc2_w 174232955119676627
      // b15: astore 188
      // b17: astore 187
      // b19: ldc2_w 174232955119676627
      // b1c: aload 187
      // b1e: aload 188
      // b20: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // b23: pop
      // b24: goto b2b
      // b27: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b2a: athrow
      // b2b: aload 6
      // b2d: bipush 0
      // b2e: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // b31: ldc2_w 271429106917420594
      // b34: astore 190
      // b36: astore 189
      // b38: ldc2_w 271429106917420594
      // b3b: aload 189
      // b3d: aload 190
      // b3f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // b42: pop
      // b43: goto b4a
      // b46: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b49: athrow
      // b4a: aload 6
      // b4c: bipush -1
      // b4d: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // b50: ldc2_w 273888125386462853
      // b53: astore 192
      // b55: astore 191
      // b57: ldc2_w 273888125386462853
      // b5a: aload 191
      // b5c: aload 192
      // b5e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // b61: pop
      // b62: goto b69
      // b65: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b68: athrow
      // b69: aload 0
      // b6a: ldc2_w 465738942243700971
      // b6d: astore 193
      // b6f: ldc2_w 465738942243700971
      // b72: aload 193
      // b74: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // b77: pop
      // b78: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // b7b: ldc2_w 600137117057204551
      // b7e: astore 195
      // b80: ldc2_w 600137117057204551
      // b83: aload 195
      // b85: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // b88: checkcast com/finalshell/core/DP
      // b8b: goto b92
      // b8e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // b91: athrow
      // b92: bipush 0
      // b93: invokevirtual com/finalshell/core/DP.setVisible (Z)V
      // b96: aload 0
      // b97: ldc2_w 340109765049345419
      // b9a: astore 197
      // b9c: ldc2_w 340109765049345419
      // b9f: aload 197
      // ba1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // ba4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // ba7: ldc2_w 424156930953488367
      // baa: astore 200
      // bac: astore 199
      // bae: ldc2_w 424156930953488367
      // bb1: aload 199
      // bb3: aload 200
      // bb5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // bb8: checkcast com/finalshell/ui/panel/F8
      // bbb: goto bc2
      // bbe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // bc1: athrow
      // bc2: aload 2
      // bc3: ifnonnull c06
      // bc6: instanceof com/finalshell/ui/panel/ConnectionProperty
      // bc9: goto bd0
      // bcc: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // bcf: athrow
      // bd0: ifeq c13
      // bd3: aload 0
      // bd4: ldc2_w 340109765049345419
      // bd7: astore 201
      // bd9: ldc2_w 340109765049345419
      // bdc: aload 201
      // bde: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // be1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // be4: ldc2_w 424156930953488367
      // be7: astore 204
      // be9: astore 203
      // beb: ldc2_w 424156930953488367
      // bee: aload 203
      // bf0: aload 204
      // bf2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // bf5: checkcast com/finalshell/ui/panel/F8
      // bf8: goto bff
      // bfb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // bfe: athrow
      // bff: goto c06
      // c02: invokestatic com/finalshell/ui/listener/YN3.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // c05: athrow
      // c06: checkcast com/finalshell/ui/panel/ConnectionProperty
      // c09: astore 8
      // c0b: aload 8
      // c0d: invokevirtual com/finalshell/ui/panel/ConnectionProperty.O$pA_3 ()Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // c10: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.requestFocus ()V
      // c13: return
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = AM.s$arrString();
      Object var3 = 479413945485822457L;
      Bq2 var10001 = (Bq2)Ref.g(479413945485822457L, var3);
      if (var2 == null) {
         Object var5 = 285898895368671213L;
         if ((Window)Ref.g(285898895368671213L, var5) == null) {
            Object var7 = 479413945485822457L;
            Ref.g(479413945485822457L, var7);
            Object var9 = 479413945485822457L;
            Window var10005 = SwingUtilities.getWindowAncestor((Bq2)Ref.g(479413945485822457L, var9));
            long var12 = 285898895368671213L;
            Window var11 = var10005;
            Ref.s(285898895368671213L, var11, var12);
         }

         Object var13 = 479413945485822457L;
         Ref.g(479413945485822457L, var13);
         Point var10004 = var1.getLocationOnScreen();
         long var16 = 408069082181507819L;
         Point var15 = var10004;
         Ref.s(408069082181507819L, var15, var16);
         Object var17 = 479413945485822457L;
         Ref.g(479413945485822457L, var17);
         Object var19 = 479413945485822457L;
         Point var10007 = ((Bq2)Ref.g(479413945485822457L, var19)).getMousePosition();
         long var22 = 161378981027509202L;
         Point var21 = var10007;
         Ref.s(161378981027509202L, var21, var22);
         Object var23 = 479413945485822457L;
         Registry.lookupField(373975248585568357L).setBoolean(Ref.g(479413945485822457L, var23), true);
         Object var25 = 479413945485822457L;
         Registry.lookupField(308935006170094327L).setInt(Ref.g(479413945485822457L, var25), var1.getButton());
         Object var27 = 479413945485822457L;
         Bq2 var10010 = (Bq2)Ref.g(479413945485822457L, var27);
      }

      Registry.lookupField(265947950920722185L).setLong(var10001, System.currentTimeMillis());
      if (var2 == null) {
         if (var1.getButton() == 1) {
            Object var29 = 465738942243700971L;
            Ref.g(465738942243700971L, var29);
            Object[] var10003 = Registry.packArgs(true);
            long var32 = 570607021388710037L;
            Object[] var31 = var10003;
            Ref.h(570607021388710037L, var31, var32);

            try {
               ;
            } catch (InvocationTargetException var52) {
               throw var52.getTargetException();
            }

            Object var33 = 465738942243700971L;
            Ref.g(465738942243700971L, var33);
            Object var35 = 340109765049345419L;
            Object[] var10006 = Registry.packArgs(Ref.g(340109765049345419L, var35));
            long var38 = 176011466134249595L;
            Object[] var37 = var10006;
            Ref.h(176011466134249595L, var37, var38);

            try {
               ;
            } catch (InvocationTargetException var51) {
               throw var51.getTargetException();
            }
         }

         Object var39 = 479413945485822457L;
         Ref.g(479413945485822457L, var39);
         Object[] var53 = Registry.emptyArgs();
         long var42 = 168016210297284127L;
         Object[] var41 = var53;
         Ref.h(168016210297284127L, var41, var42);

         try {
            ;
         } catch (InvocationTargetException var50) {
            throw var50.getTargetException();
         }

         Object var43 = 479413945485822457L;
         Ref.g(479413945485822457L, var43);
         Object[] var54 = Registry.emptyArgs();
         long var46 = 475559379800111291L;
         Object[] var45 = var54;
         Ref.h(475559379800111291L, var45, var46);

         try {
            ;
         } catch (InvocationTargetException var49) {
            throw var49.getTargetException();
         }

         Object var47 = 479413945485822457L;
         Registry.lookupField(613636876466420761L).setBoolean(Ref.g(479413945485822457L, var47), false);
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 479413945485822457L;
      Ref.g(479413945485822457L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 259809416276946956L;
      Object[] var4 = var10002;
      Ref.h(259809416276946956L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object var6 = 479413945485822457L;
      Ref.g(479413945485822457L, var6);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 475559379800111291L;
      Object[] var8 = var10004;
      Ref.h(475559379800111291L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object var3 = 479413945485822457L;
      Ref.g(479413945485822457L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 259809416276946956L;
      Object[] var5 = var10002;
      Ref.h(259809416276946956L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var56) {
         throw var56.getTargetException();
      }

      AM.s$arrString();
      Object var7 = 479413945485822457L;
      Registry.lookupField(223239328082186834L).setBoolean(Ref.g(479413945485822457L, var7), true);
      Object var9 = 479413945485822457L;
      Ref.g(479413945485822457L, var9);
      Object[] var10005 = Registry.emptyArgs();
      long var12 = 475559379800111291L;
      Object[] var11 = var10005;
      Ref.h(475559379800111291L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      Object var13 = 479413945485822457L;
      Ref.g(479413945485822457L, var13);
      Object[] var10007 = Registry.emptyArgs();
      long var16 = 168016210297284127L;
      Object[] var15 = var10007;
      Ref.h(168016210297284127L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var54) {
         throw var54.getTargetException();
      }

      Object var17 = 465738942243700971L;
      Ref.g(465738942243700971L, var17);
      Registry.emptyArgs();
      long var19 = 299368763907830673L;
      Ref.h2(299368763907830673L, var19);
      Boolean var10010 = (Boolean)(Registry.emptyArgs());
      long var22 = 400084338690857485L;
      Object var21 = var10010;
      var10010 = Ref.h(400084338690857485L, var21, var22);

      try {
         var10010 = (Boolean)var10010;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      label99: {
         if (this == null) {
            if (var10010 == null) {
               return;
            }

            var10010 = (Boolean)(this);
            Object var23 = 465738942243700971L;
            AM var10011 = (AM)Ref.g(465738942243700971L, var23);
            if (this != null) {
               break label99;
            }

            Object[] var10012 = Registry.emptyArgs();
            long var26 = 193033702979442502L;
            Object[] var25 = var10012;
            var10012 = Ref.h(193033702979442502L, var25, var26);

            try {
            } catch (InvocationTargetException var52) {
               throw var52.getTargetException();
            }
         }

         if (var10010 == null) {
            return;
         }

         Object var27 = 465738942243700971L;
         Ref.g(465738942243700971L, var27);
         Registry.emptyArgs();
         long var29 = 299368763907830673L;
         Ref.h2(299368763907830673L, var29);
         Object[] var10013 = Registry.packArgs(true);
         long var32 = 271429106917420594L;
         Object[] var31 = var10013;
         Ref.h(271429106917420594L, var31, var32);

         try {
            ;
         } catch (InvocationTargetException var51) {
            throw var51.getTargetException();
         }

         Object var33 = 465738942243700971L;
         Ref.g(465738942243700971L, var33);
         Registry.emptyArgs();
         long var35 = 299368763907830673L;
         Ref.h2(299368763907830673L, var35);
         Object var37 = 465738942243700971L;
         Object[] var10017 = Registry.packArgs(Ref.g(465738942243700971L, var37));
         long var40 = 588837842234789414L;
         Object[] var39 = var10017;
         Ref.h(588837842234789414L, var39, var40);

         try {
            ;
         } catch (InvocationTargetException var50) {
            throw var50.getTargetException();
         }

         Object var41 = 465738942243700971L;
         AM var10018 = (AM)Ref.g(465738942243700971L, var41);
      }

      Registry.emptyArgs();
      long var43 = 299368763907830673L;
      Ref.h2(299368763907830673L, var43);
      Object var45 = 479413945485822457L;
      Object[] var10021 = Registry.packArgs(Ref.g(479413945485822457L, var45));
      long var48 = 398254944238506226L;
      Object[] var47 = var10021;
      Ref.h(398254944238506226L, var47, var48);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 1846) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5348400469076570630L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "tg!T\u001c\u0014z1ItÉC¢Ö:v";
      int var5 = "tg!T\u001c\u0014z1ItÉC¢Ö:v".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Long[2];
   }
}





