package com.finalshell.task;

import com.finalshell.core.Km2;
import com.finalshell.core.Yd2;
import java.awt.datatransfer.Transferable;

public class A implements Runnable {
   final Transferable S;
   final Km2 Q;
   final int L;
   final Yd2 f;

   A(Yd2 var1, Transferable var2, Km2 var3, int var4) {
      this.f = var1;
      this.S = var2;
      this.Q = var3;
      this.L = var4;
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
      // 000: invokestatic com/finalshell/core/Km2.U$String ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: ldc2_w 531712827319826179
      // 008: astore 13
      // 00a: ldc2_w 531712827319826179
      // 00d: aload 13
      // 00f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 012: checkcast java/awt/datatransfer/Transferable
      // 015: aload 0
      // 016: ldc2_w 559936057139545685
      // 019: astore 15
      // 01b: ldc2_w 559936057139545685
      // 01e: aload 15
      // 020: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 023: ldc2_w 506201016193824005
      // 026: astore 17
      // 028: ldc2_w 506201016193824005
      // 02b: aload 17
      // 02d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 030: checkcast java/awt/datatransfer/DataFlavor
      // 033: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 038: checkcast [Ljava/lang/Object;
      // 03b: astore 2
      // 03c: aload 0
      // 03d: ldc2_w 193186583532502824
      // 040: astore 19
      // 042: ldc2_w 193186583532502824
      // 045: aload 19
      // 047: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04a: aload 0
      // 04b: ldc2_w 219261314347366614
      // 04e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 051: swap
      // 052: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 055: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 058: ldc2_w 303488344973038628
      // 05b: astore 22
      // 05d: astore 21
      // 05f: ldc2_w 303488344973038628
      // 062: aload 21
      // 064: aload 22
      // 066: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 069: checkcast java/lang/Object
      // 06c: goto 073
      // 06f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 072: athrow
      // 073: astore 3
      // 074: aload 3
      // 075: aload 1
      // 076: ifnonnull 08e
      // 079: instanceof com/finalshell/ui/model/Tf4
      // 07c: ifeq 45b
      // 07f: goto 086
      // 082: invokestatic com/finalshell/task/A.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: aload 3
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/task/A.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: checkcast com/finalshell/ui/model/Tf4
      // 091: astore 4
      // 093: aload 2
      // 094: astore 5
      // 096: aload 5
      // 098: arraylength
      // 099: istore 6
      // 09b: bipush 0
      // 09c: istore 7
      // 09e: iload 7
      // 0a0: iload 6
      // 0a2: if_icmpge 45b
      // 0a5: aload 5
      // 0a7: iload 7
      // 0a9: aaload
      // 0aa: astore 8
      // 0ac: aload 1
      // 0ad: ifnonnull 463
      // 0b0: aload 8
      // 0b2: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0b5: ldc com/finalshell/ui/model/Tf4
      // 0b7: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0ba: aload 1
      // 0bb: ifnonnull 292
      // 0be: goto 0c5
      // 0c1: invokestatic com/finalshell/task/A.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: ifeq 276
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/task/A.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: aload 8
      // 0d1: checkcast com/finalshell/ui/model/Tf4
      // 0d4: astore 9
      // 0d6: aload 0
      // 0d7: ldc2_w 193186583532502824
      // 0da: astore 23
      // 0dc: ldc2_w 193186583532502824
      // 0df: aload 23
      // 0e1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0e4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e7: ldc2_w 386440316720074980
      // 0ea: astore 26
      // 0ec: astore 25
      // 0ee: ldc2_w 386440316720074980
      // 0f1: aload 25
      // 0f3: aload 26
      // 0f5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f8: goto 0ff
      // 0fb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 102: ldc2_w 622340890791521181
      // 105: astore 28
      // 107: astore 27
      // 109: ldc2_w 622340890791521181
      // 10c: aload 27
      // 10e: aload 28
      // 110: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 113: checkcast com/finalshell/connection/Connection12
      // 116: goto 11d
      // 119: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: astore 10
      // 11f: aload 9
      // 121: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 124: ldc2_w 498856411508641826
      // 127: astore 30
      // 129: astore 29
      // 12b: ldc2_w 498856411508641826
      // 12e: aload 29
      // 130: aload 30
      // 132: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 135: goto 13c
      // 138: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 13f: ldc2_w 159824902428932603
      // 142: astore 31
      // 144: ldc2_w 159824902428932603
      // 147: aload 31
      // 149: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 14c: checkcast java/lang/String
      // 14f: goto 156
      // 152: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 155: athrow
      // 156: astore 11
      // 158: aload 10
      // 15a: aload 9
      // 15c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 15f: ldc2_w 498856411508641826
      // 162: astore 34
      // 164: astore 33
      // 166: ldc2_w 498856411508641826
      // 169: aload 33
      // 16b: aload 34
      // 16d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 170: goto 177
      // 173: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 176: athrow
      // 177: new java/lang/StringBuilder
      // 17a: dup
      // 17b: invokespecial java/lang/StringBuilder.<init> ()V
      // 17e: aload 4
      // 180: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 183: ldc2_w 498856411508641826
      // 186: astore 36
      // 188: astore 35
      // 18a: ldc2_w 498856411508641826
      // 18d: aload 35
      // 18f: aload 36
      // 191: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 194: checkcast java/lang/String
      // 197: goto 19e
      // 19a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a1: aload 11
      // 1a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a6: aload 9
      // 1a8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ab: ldc2_w 179612178163941306
      // 1ae: astore 38
      // 1b0: astore 37
      // 1b2: ldc2_w 179612178163941306
      // 1b5: aload 37
      // 1b7: aload 38
      // 1b9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1bc: checkcast java/lang/String
      // 1bf: goto 1c6
      // 1c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1cc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1cf: ldc2_w 247777483328047393
      // 1d2: astore 40
      // 1d4: astore 39
      // 1d6: ldc2_w 247777483328047393
      // 1d9: aload 39
      // 1db: aload 40
      // 1dd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e0: pop
      // 1e1: goto 1e8
      // 1e4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e7: athrow
      // 1e8: aload 0
      // 1e9: ldc2_w 193186583532502824
      // 1ec: astore 41
      // 1ee: ldc2_w 193186583532502824
      // 1f1: aload 41
      // 1f3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1f9: ldc2_w 235623913163851460
      // 1fc: astore 44
      // 1fe: astore 43
      // 200: ldc2_w 235623913163851460
      // 203: aload 43
      // 205: aload 44
      // 207: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20a: goto 211
      // 20d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 210: athrow
      // 211: aload 9
      // 213: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 216: ldc2_w 498856411508641826
      // 219: astore 46
      // 21b: astore 45
      // 21d: ldc2_w 498856411508641826
      // 220: aload 45
      // 222: aload 46
      // 224: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 227: goto 22e
      // 22a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22d: athrow
      // 22e: aload 4
      // 230: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 233: ldc2_w 498856411508641826
      // 236: astore 48
      // 238: astore 47
      // 23a: ldc2_w 498856411508641826
      // 23d: aload 47
      // 23f: aload 48
      // 241: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 244: goto 24b
      // 247: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 24a: athrow
      // 24b: bipush 0
      // 24c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 24f: ldc2_w 405516439223989653
      // 252: astore 50
      // 254: astore 49
      // 256: ldc2_w 405516439223989653
      // 259: aload 49
      // 25b: aload 50
      // 25d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 260: pop
      // 261: goto 268
      // 264: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 267: athrow
      // 268: goto 272
      // 26b: astore 12
      // 26d: aload 12
      // 26f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 272: aload 1
      // 273: ifnull 454
      // 276: aload 8
      // 278: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 27b: aload 1
      // 27c: ifnonnull 297
      // 27f: goto 286
      // 282: invokestatic com/finalshell/task/A.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: ldc com/finalshell/ui/model/Ck4
      // 288: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 28b: goto 292
      // 28e: invokestatic com/finalshell/task/A.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 291: athrow
      // 292: ifeq 454
      // 295: aload 8
      // 297: checkcast com/finalshell/ui/model/Ck4
      // 29a: astore 9
      // 29c: aload 0
      // 29d: ldc2_w 193186583532502824
      // 2a0: astore 51
      // 2a2: ldc2_w 193186583532502824
      // 2a5: aload 51
      // 2a7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2aa: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ad: ldc2_w 235623913163851460
      // 2b0: astore 54
      // 2b2: astore 53
      // 2b4: ldc2_w 235623913163851460
      // 2b7: aload 53
      // 2b9: aload 54
      // 2bb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2be: goto 2c5
      // 2c1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c4: athrow
      // 2c5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2c8: ldc2_w 212042562452272939
      // 2cb: astore 56
      // 2cd: astore 55
      // 2cf: ldc2_w 212042562452272939
      // 2d2: aload 55
      // 2d4: aload 56
      // 2d6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d9: checkcast com/finalshell/connection/Connection12
      // 2dc: goto 2e3
      // 2df: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e2: athrow
      // 2e3: astore 10
      // 2e5: aload 9
      // 2e7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ea: ldc2_w 605430732347023634
      // 2ed: astore 58
      // 2ef: astore 57
      // 2f1: ldc2_w 605430732347023634
      // 2f4: aload 57
      // 2f6: aload 58
      // 2f8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2fb: goto 302
      // 2fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 301: athrow
      // 302: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 305: ldc2_w 159824902428932603
      // 308: astore 59
      // 30a: ldc2_w 159824902428932603
      // 30d: aload 59
      // 30f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 312: checkcast java/lang/String
      // 315: goto 31c
      // 318: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 31b: athrow
      // 31c: astore 11
      // 31e: aload 10
      // 320: aload 9
      // 322: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 325: ldc2_w 605430732347023634
      // 328: astore 62
      // 32a: astore 61
      // 32c: ldc2_w 605430732347023634
      // 32f: aload 61
      // 331: aload 62
      // 333: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 336: goto 33d
      // 339: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 33c: athrow
      // 33d: new java/lang/StringBuilder
      // 340: dup
      // 341: invokespecial java/lang/StringBuilder.<init> ()V
      // 344: aload 4
      // 346: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 349: ldc2_w 498856411508641826
      // 34c: astore 64
      // 34e: astore 63
      // 350: ldc2_w 498856411508641826
      // 353: aload 63
      // 355: aload 64
      // 357: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 35a: checkcast java/lang/String
      // 35d: goto 364
      // 360: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 363: athrow
      // 364: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 367: aload 11
      // 369: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36c: aload 9
      // 36e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 371: ldc2_w 396085629172753019
      // 374: astore 66
      // 376: astore 65
      // 378: ldc2_w 396085629172753019
      // 37b: aload 65
      // 37d: aload 66
      // 37f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 382: checkcast java/lang/String
      // 385: goto 38c
      // 388: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 38b: athrow
      // 38c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 392: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 395: ldc2_w 247777483328047393
      // 398: astore 68
      // 39a: astore 67
      // 39c: ldc2_w 247777483328047393
      // 39f: aload 67
      // 3a1: aload 68
      // 3a3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3a6: pop
      // 3a7: goto 3ae
      // 3aa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3ad: athrow
      // 3ae: aload 0
      // 3af: ldc2_w 193186583532502824
      // 3b2: astore 69
      // 3b4: ldc2_w 193186583532502824
      // 3b7: aload 69
      // 3b9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3bc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3bf: ldc2_w 235623913163851460
      // 3c2: astore 72
      // 3c4: astore 71
      // 3c6: ldc2_w 235623913163851460
      // 3c9: aload 71
      // 3cb: aload 72
      // 3cd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3d0: goto 3d7
      // 3d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d6: athrow
      // 3d7: aload 9
      // 3d9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3dc: ldc2_w 605430732347023634
      // 3df: astore 74
      // 3e1: astore 73
      // 3e3: ldc2_w 605430732347023634
      // 3e6: aload 73
      // 3e8: aload 74
      // 3ea: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3ed: goto 3f4
      // 3f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f3: athrow
      // 3f4: aload 4
      // 3f6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3f9: ldc2_w 498856411508641826
      // 3fc: astore 76
      // 3fe: astore 75
      // 400: ldc2_w 498856411508641826
      // 403: aload 75
      // 405: aload 76
      // 407: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 40a: goto 411
      // 40d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 410: athrow
      // 411: aload 9
      // 413: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 416: ldc2_w 396085629172753019
      // 419: astore 78
      // 41b: astore 77
      // 41d: ldc2_w 396085629172753019
      // 420: aload 77
      // 422: aload 78
      // 424: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 427: goto 42e
      // 42a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 42d: athrow
      // 42e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 431: ldc2_w 117823788615315526
      // 434: astore 80
      // 436: astore 79
      // 438: ldc2_w 117823788615315526
      // 43b: aload 79
      // 43d: aload 80
      // 43f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 442: pop
      // 443: goto 44a
      // 446: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 449: athrow
      // 44a: goto 454
      // 44d: astore 12
      // 44f: aload 12
      // 451: invokevirtual java/lang/Exception.printStackTrace ()V
      // 454: iinc 7 1
      // 457: aload 1
      // 458: ifnull 09e
      // 45b: goto 463
      // 45e: astore 2
      // 45f: aload 2
      // 460: invokevirtual java/lang/Exception.printStackTrace ()V
      // 463: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





