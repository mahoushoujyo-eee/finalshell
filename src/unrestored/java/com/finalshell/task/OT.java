package com.finalshell.task;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;

import com.finalshell.core.YI;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;

public class OT implements Runnable {
   public final YI R;
   public final SelectDownloadFolderPanel C;
   public static long a;

   public OT(SelectDownloadFolderPanel var1, YI var2) {
      this.C = var1;
      this.R = var2;
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
      // 000: invokestatic com/finalshell/ui/panel/SelectDownloadFolderPanel.O$arrint ()[I
      // 003: astore 1
      // 004: getstatic com/finalshell/task/OT.a J
      // 007: invokestatic java/lang/Thread.sleep (J)V
      // 00a: goto 012
      // 00d: astore 2
      // 00e: aload 2
      // 00f: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 012: bipush 1
      // 013: istore 2
      // 014: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 017: ldc2_w 270389152141252877
      // 01a: astore 8
      // 01c: ldc2_w 270389152141252877
      // 01f: aload 8
      // 021: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 024: goto 02b
      // 027: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02e: ldc2_w 306266403902896148
      // 031: astore 11
      // 033: astore 10
      // 035: ldc2_w 306266403902896148
      // 038: aload 10
      // 03a: aload 11
      // 03c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03f: checkcast com/finalshell/core/U62
      // 042: goto 049
      // 045: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 048: athrow
      // 049: astore 3
      // 04a: new java/io/File
      // 04d: dup
      // 04e: aload 0
      // 04f: ldc2_w 406580448552580548
      // 052: astore 12
      // 054: ldc2_w 406580448552580548
      // 057: aload 12
      // 059: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05f: ldc2_w 191716730601734423
      // 062: astore 15
      // 064: astore 14
      // 066: ldc2_w 191716730601734423
      // 069: aload 14
      // 06b: aload 15
      // 06d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 070: checkcast java/lang/String
      // 073: goto 07a
      // 076: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 079: athrow
      // 07a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 07d: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 080: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 083: ldc2_w 353935338506646766
      // 086: astore 16
      // 088: ldc2_w 353935338506646766
      // 08b: aload 16
      // 08d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 090: checkcast java/lang/String
      // 093: goto 09a
      // 096: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 099: athrow
      // 09a: astore 4
      // 09c: aload 3
      // 09d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a0: ldc2_w 339037510611298074
      // 0a3: astore 19
      // 0a5: astore 18
      // 0a7: ldc2_w 339037510611298074
      // 0aa: aload 18
      // 0ac: aload 19
      // 0ae: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b1: checkcast java/util/ArrayList
      // 0b4: goto 0bb
      // 0b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: astore 5
      // 0bd: aload 5
      // 0bf: aload 4
      // 0c1: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 0c4: aload 1
      // 0c5: ifnonnull 0d5
      // 0c8: ifeq 0d4
      // 0cb: goto 0d2
      // 0ce: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0d1: athrow
      // 0d2: bipush 0
      // 0d3: istore 2
      // 0d4: iload 2
      // 0d5: aload 1
      // 0d6: ifnonnull 2a7
      // 0d9: ifeq 250
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0e2: athrow
      // 0e3: bipush 0
      // 0e4: istore 6
      // 0e6: aload 3
      // 0e7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ea: ldc2_w 407355336116664491
      // 0ed: astore 21
      // 0ef: astore 20
      // 0f1: ldc2_w 407355336116664491
      // 0f4: aload 20
      // 0f6: aload 21
      // 0f8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0fb: checkcast java/lang/Integer
      // 0fe: invokevirtual java/lang/Integer.intValue ()I
      // 101: goto 108
      // 104: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 107: athrow
      // 108: aload 1
      // 109: ifnonnull 146
      // 10c: ifne 11d
      // 10f: goto 116
      // 112: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 115: athrow
      // 116: bipush 1
      // 117: istore 6
      // 119: aload 1
      // 11a: ifnull 1c3
      // 11d: aload 3
      // 11e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 121: ldc2_w 407355336116664491
      // 124: astore 23
      // 126: astore 22
      // 128: ldc2_w 407355336116664491
      // 12b: aload 22
      // 12d: aload 23
      // 12f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 132: checkcast java/lang/Integer
      // 135: invokevirtual java/lang/Integer.intValue ()I
      // 138: goto 13f
      // 13b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: goto 146
      // 142: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 145: athrow
      // 146: aload 1
      // 147: ifnonnull 1c5
      // 14a: bipush 1
      // 14b: if_icmpne 1c3
      // 14e: goto 155
      // 151: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 154: athrow
      // 155: aload 3
      // 156: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 159: ldc2_w 620011176897972573
      // 15c: astore 25
      // 15e: astore 24
      // 160: ldc2_w 620011176897972573
      // 163: aload 24
      // 165: aload 25
      // 167: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 16a: checkcast java/lang/String
      // 16d: goto 174
      // 170: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 173: athrow
      // 174: ifnonnull 185
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 17d: athrow
      // 17e: bipush 1
      // 17f: istore 6
      // 181: aload 1
      // 182: ifnull 1c3
      // 185: new java/io/File
      // 188: dup
      // 189: aload 3
      // 18a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 18d: ldc2_w 620011176897972573
      // 190: astore 27
      // 192: astore 26
      // 194: ldc2_w 620011176897972573
      // 197: aload 26
      // 199: aload 27
      // 19b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19e: checkcast java/lang/String
      // 1a1: goto 1a8
      // 1a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a7: athrow
      // 1a8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1ab: astore 7
      // 1ad: aload 7
      // 1af: invokevirtual java/io/File.exists ()Z
      // 1b2: aload 1
      // 1b3: ifnonnull 1c5
      // 1b6: ifne 1c3
      // 1b9: goto 1c0
      // 1bc: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1bf: athrow
      // 1c0: bipush 1
      // 1c1: istore 6
      // 1c3: iload 6
      // 1c5: ifeq 1de
      // 1c8: new com/finalshell/task/T92
      // 1cb: dup
      // 1cc: aload 0
      // 1cd: invokespecial com/finalshell/task/T92.<init> (Lcom/finalshell/task/OT;)V
      // 1d0: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 1d3: aload 1
      // 1d4: ifnull 24c
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 1dd: athrow
      // 1de: new java/io/File
      // 1e1: dup
      // 1e2: aload 0
      // 1e3: ldc2_w 406580448552580548
      // 1e6: astore 28
      // 1e8: ldc2_w 406580448552580548
      // 1eb: aload 28
      // 1ed: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1f3: ldc2_w 191716730601734423
      // 1f6: astore 31
      // 1f8: astore 30
      // 1fa: ldc2_w 191716730601734423
      // 1fd: aload 30
      // 1ff: aload 31
      // 201: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 204: checkcast java/lang/String
      // 207: goto 20e
      // 20a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20d: athrow
      // 20e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 211: aload 3
      // 212: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 215: ldc2_w 620011176897972573
      // 218: astore 33
      // 21a: astore 32
      // 21c: ldc2_w 620011176897972573
      // 21f: aload 32
      // 221: aload 33
      // 223: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 226: goto 22d
      // 229: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22c: athrow
      // 22d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 230: ldc2_w 131234937297882749
      // 233: astore 34
      // 235: ldc2_w 131234937297882749
      // 238: aload 34
      // 23a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 23d: pop
      // 23e: goto 245
      // 241: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 244: athrow
      // 245: goto 24c
      // 248: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 24b: athrow
      // 24c: aload 1
      // 24d: ifnull 2a8
      // 250: new java/io/File
      // 253: dup
      // 254: aload 0
      // 255: ldc2_w 406580448552580548
      // 258: astore 36
      // 25a: ldc2_w 406580448552580548
      // 25d: aload 36
      // 25f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 262: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 265: ldc2_w 191716730601734423
      // 268: astore 39
      // 26a: astore 38
      // 26c: ldc2_w 191716730601734423
      // 26f: aload 38
      // 271: aload 39
      // 273: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 276: checkcast java/lang/String
      // 279: goto 280
      // 27c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 27f: athrow
      // 280: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 283: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 286: ldc2_w 557190378343810325
      // 289: astore 40
      // 28b: ldc2_w 557190378343810325
      // 28e: aload 40
      // 290: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 293: checkcast java/lang/Boolean
      // 296: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 299: goto 2a0
      // 29c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 29f: athrow
      // 2a0: goto 2a7
      // 2a3: invokestatic com/finalshell/task/OT.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 2a6: athrow
      // 2a7: pop
      // 2a8: return
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6610927057226258166L;
      long var10002 = 6610927057226258394L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





