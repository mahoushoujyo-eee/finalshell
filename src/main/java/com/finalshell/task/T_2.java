package com.finalshell.task;

import com.finalshell.core.ZModemTransfer;
import com.finalshell.core.SelectUploadFile;
import com.finalshell.io.To2;

public class T_2 implements Runnable {
   public final To2 d;
   public final int p;
   public final ZModemTransfer j;
   public final SelectUploadFile c;
   public static String[] a;
   public static String[] b;
   public static long[] e;
   public static Integer[] f;

   public T_2(SelectUploadFile var1, To2 var2, int var3, ZModemTransfer var4) {
      this.c = var1;
      this.d = var2;
      this.p = var3;
      this.j = var4;
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
      // 000: invokestatic com/finalshell/core/SelectUploadFile.r$String ()Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 008: aload 0
      // 009: getfield com/finalshell/task/T_2.d Lcom/finalshell/io/To2;
      // 00c: aload 0
      // 00d: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 010: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 013: bipush 0
      // 014: aload 0
      // 015: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 018: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 01b: arraylength
      // 01c: invokevirtual com/finalshell/io/To2.read ([BII)I
      // 01f: putfield com/finalshell/core/SelectUploadFile.G I
      // 022: aload 0
      // 023: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 026: getfield com/finalshell/core/SelectUploadFile.G I
      // 029: ifge 030
      // 02c: aload 1
      // 02d: ifnull 503
      // 030: aload 0
      // 031: getfield com/finalshell/task/T_2.p I
      // 034: sipush 12320
      // 037: ldc2_w 5919789102947246461
      // 03a: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 03d: aload 1
      // 03e: ifnonnull 18e
      // 041: goto 048
      // 044: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: if_icmpne 176
      // 04b: goto 052
      // 04e: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: aload 0
      // 053: getfield com/finalshell/task/T_2.j Lcom/finalshell/core/CK;
      // 056: invokevirtual com/finalshell/core/CK.k$boolean ()Z
      // 059: aload 1
      // 05a: ifnonnull 185
      // 05d: goto 064
      // 060: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: ifeq 176
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: new java/lang/String
      // 071: dup
      // 072: aload 0
      // 073: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 076: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 079: bipush 0
      // 07a: aload 0
      // 07b: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 07e: getfield com/finalshell/core/SelectUploadFile.G I
      // 081: invokespecial java/lang/String.<init> ([BII)V
      // 084: astore 2
      // 085: aload 2
      // 086: sipush 4877
      // 089: sipush 22865
      // 08c: invokestatic com/finalshell/task/T_2.a (II)Ljava/lang/String;
      // 08f: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 092: aload 1
      // 093: ifnonnull 0d5
      // 096: ifne 0c7
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 0a4: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 0a7: bipush 0
      // 0a8: baload
      // 0a9: sipush 32532
      // 0ac: ldc2_w 7398968839053569615
      // 0af: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 0b2: aload 1
      // 0b3: ifnonnull 18e
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: if_icmpne 176
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 0cb: getfield com/finalshell/core/SelectUploadFile.G I
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: aload 1
      // 0d6: ifnonnull 185
      // 0d9: ifle 176
      // 0dc: goto 0e3
      // 0df: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: bipush -1
      // 0e4: istore 3
      // 0e5: bipush 0
      // 0e6: istore 4
      // 0e8: iload 4
      // 0ea: aload 0
      // 0eb: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 0ee: getfield com/finalshell/core/SelectUploadFile.G I
      // 0f1: if_icmpge 176
      // 0f4: aload 0
      // 0f5: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 0f8: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 0fb: iload 4
      // 0fd: baload
      // 0fe: istore 5
      // 100: aload 1
      // 101: ifnonnull 172
      // 104: iload 5
      // 106: sipush 22297
      // 109: ldc2_w 7452143167699863109
      // 10c: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 10f: aload 1
      // 110: ifnonnull 18e
      // 113: goto 11a
      // 116: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: if_icmpne 168
      // 11d: goto 124
      // 120: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: iload 4
      // 126: istore 3
      // 127: aload 0
      // 128: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 12b: getfield com/finalshell/core/SelectUploadFile.G I
      // 12e: iload 3
      // 12f: isub
      // 130: istore 6
      // 132: iload 6
      // 134: newarray 8
      // 136: astore 7
      // 138: aload 0
      // 139: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 13c: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 13f: iload 3
      // 140: aload 7
      // 142: bipush 0
      // 143: iload 6
      // 145: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 148: aload 0
      // 149: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 14c: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 14f: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // 152: aload 7
      // 154: iload 6
      // 156: invokevirtual com/finalshell/io/To2.F ([BI)V
      // 159: aload 0
      // 15a: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 15d: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 160: bipush 1
      // 161: invokevirtual com/finalshell/core/Cj4.R (Z)V
      // 164: aload 1
      // 165: ifnull 503
      // 168: iinc 4 1
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: aload 1
      // 173: ifnull 0e8
      // 176: aload 0
      // 177: aload 1
      // 178: ifnonnull 1f8
      // 17b: getfield com/finalshell/task/T_2.p I
      // 17e: goto 185
      // 181: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 184: athrow
      // 185: sipush 1647
      // 188: ldc2_w 5347706874292705077
      // 18b: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 18e: if_icmpne 1de
      // 191: aload 0
      // 192: aload 1
      // 193: ifnonnull 1f8
      // 196: goto 19d
      // 199: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: getfield com/finalshell/task/T_2.j Lcom/finalshell/core/CK;
      // 1a0: invokevirtual com/finalshell/core/CK.O$boolean ()Z
      // 1a3: ifeq 1de
      // 1a6: goto 1ad
      // 1a9: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 1b1: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 1b4: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // 1b7: aload 0
      // 1b8: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 1bb: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 1be: aload 0
      // 1bf: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 1c2: getfield com/finalshell/core/SelectUploadFile.G I
      // 1c5: invokevirtual com/finalshell/io/To2.F ([BI)V
      // 1c8: aload 0
      // 1c9: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 1cc: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 1cf: bipush 1
      // 1d0: invokevirtual com/finalshell/core/Cj4.R (Z)V
      // 1d3: aload 1
      // 1d4: ifnull 503
      // 1d7: goto 1de
      // 1da: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 1e2: getfield com/finalshell/core/SelectUploadFile.L Ljava/io/PipedOutputStream;
      // 1e5: aload 0
      // 1e6: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 1e9: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 1ec: bipush 0
      // 1ed: aload 0
      // 1ee: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 1f1: getfield com/finalshell/core/SelectUploadFile.G I
      // 1f4: invokevirtual java/io/PipedOutputStream.write ([BII)V
      // 1f7: aload 0
      // 1f8: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 1fb: getfield com/finalshell/core/SelectUploadFile.L Ljava/io/PipedOutputStream;
      // 1fe: invokevirtual java/io/PipedOutputStream.flush ()V
      // 201: goto 266
      // 204: astore 2
      // 205: aload 2
      // 206: invokevirtual java/lang/Exception.printStackTrace ()V
      // 209: aload 0
      // 20a: getfield com/finalshell/task/T_2.j Lcom/finalshell/core/CK;
      // 20d: invokevirtual com/finalshell/core/CK.k$boolean ()Z
      // 210: aload 1
      // 211: ifnonnull 26a
      // 214: ifne 266
      // 217: goto 21e
      // 21a: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: aload 0
      // 21f: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 222: aload 1
      // 223: ifnonnull 259
      // 226: goto 22d
      // 229: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22c: athrow
      // 22d: getfield com/finalshell/core/SelectUploadFile.G I
      // 230: ifle 264
      // 233: goto 23a
      // 236: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: aload 0
      // 23b: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 23e: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 241: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // 244: aload 0
      // 245: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 248: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 24b: aload 0
      // 24c: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 24f: getfield com/finalshell/core/SelectUploadFile.G I
      // 252: invokevirtual com/finalshell/io/To2.F ([BI)V
      // 255: aload 0
      // 256: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 259: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 25c: bipush 1
      // 25d: invokevirtual com/finalshell/core/Cj4.R (Z)V
      // 260: goto 264
      // 263: astore 3
      // 264: aload 2
      // 265: athrow
      // 266: aload 0
      // 267: getfield com/finalshell/task/T_2.p I
      // 26a: aload 1
      // 26b: ifnonnull 397
      // 26e: sipush 31246
      // 271: ldc2_w 7588324232136747862
      // 274: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 277: if_icmpne 389
      // 27a: goto 281
      // 27d: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 280: athrow
      // 281: new java/lang/String
      // 284: dup
      // 285: aload 0
      // 286: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 289: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 28c: bipush 0
      // 28d: aload 0
      // 28e: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 291: getfield com/finalshell/core/SelectUploadFile.G I
      // 294: invokespecial java/lang/String.<init> ([BII)V
      // 297: astore 2
      // 298: aload 2
      // 299: sipush 4876
      // 29c: sipush 6495
      // 29f: invokestatic com/finalshell/task/T_2.a (II)Ljava/lang/String;
      // 2a2: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 2a5: aload 1
      // 2a6: ifnonnull 397
      // 2a9: ifeq 389
      // 2ac: goto 2b3
      // 2af: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b2: athrow
      // 2b3: aload 0
      // 2b4: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 2b7: aload 1
      // 2b8: ifnonnull 507
      // 2bb: goto 2c2
      // 2be: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c1: athrow
      // 2c2: getfield com/finalshell/core/SelectUploadFile.G I
      // 2c5: ifle 503
      // 2c8: goto 2cf
      // 2cb: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ce: athrow
      // 2cf: bipush -1
      // 2d0: istore 3
      // 2d1: bipush 0
      // 2d2: istore 4
      // 2d4: iload 4
      // 2d6: aload 0
      // 2d7: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 2da: getfield com/finalshell/core/SelectUploadFile.G I
      // 2dd: if_icmpge 385
      // 2e0: aload 0
      // 2e1: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 2e4: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 2e7: iload 4
      // 2e9: baload
      // 2ea: istore 5
      // 2ec: aload 1
      // 2ed: ifnonnull 50b
      // 2f0: aload 1
      // 2f1: ifnonnull 381
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: iload 5
      // 2fd: sipush 22297
      // 300: ldc2_w 7452143167699863109
      // 303: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 306: if_icmpne 377
      // 309: goto 310
      // 30c: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30f: athrow
      // 310: iload 4
      // 312: istore 3
      // 313: aload 0
      // 314: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 317: getfield com/finalshell/core/SelectUploadFile.G I
      // 31a: iload 3
      // 31b: isub
      // 31c: istore 6
      // 31e: iload 6
      // 320: newarray 8
      // 322: astore 7
      // 324: aload 0
      // 325: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 328: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 32b: iload 3
      // 32c: aload 7
      // 32e: bipush 0
      // 32f: iload 6
      // 331: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 334: aload 0
      // 335: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 338: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 33b: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // 33e: aload 7
      // 340: iload 6
      // 342: invokevirtual com/finalshell/io/To2.F ([BI)V
      // 345: aload 0
      // 346: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 349: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 34c: bipush 1
      // 34d: invokevirtual com/finalshell/core/Cj4.R (Z)V
      // 350: aload 0
      // 351: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 354: getfield com/finalshell/core/SelectUploadFile.c Lcom/finalshell/core/YI;
      // 357: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 35a: ldc2_w 195140127399124721
      // 35d: astore 11
      // 35f: astore 10
      // 361: ldc2_w 195140127399124721
      // 364: aload 10
      // 366: aload 11
      // 368: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 36b: pop
      // 36c: goto 373
      // 36f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 372: athrow
      // 373: aload 1
      // 374: ifnull 503
      // 377: iinc 4 1
      // 37a: goto 381
      // 37d: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 380: athrow
      // 381: aload 1
      // 382: ifnull 2d4
      // 385: aload 1
      // 386: ifnull 503
      // 389: aload 0
      // 38a: getfield com/finalshell/task/T_2.j Lcom/finalshell/core/CK;
      // 38d: invokevirtual com/finalshell/core/CK.k$boolean ()Z
      // 390: goto 397
      // 393: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 396: athrow
      // 397: aload 1
      // 398: ifnonnull 4f5
      // 39b: ifeq 4ee
      // 39e: goto 3a5
      // 3a1: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a4: athrow
      // 3a5: aload 0
      // 3a6: getfield com/finalshell/task/T_2.p I
      // 3a9: aload 1
      // 3aa: ifnonnull 4f5
      // 3ad: goto 3b4
      // 3b0: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b3: athrow
      // 3b4: sipush 7680
      // 3b7: ldc2_w 5427706203742113631
      // 3ba: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 3bd: if_icmpne 4ee
      // 3c0: goto 3c7
      // 3c3: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c6: athrow
      // 3c7: invokestatic java/lang/System.currentTimeMillis ()J
      // 3ca: lstore 2
      // 3cb: ldc2_w 388376917454860932
      // 3ce: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3d1: aconst_null
      // 3d2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3d5: new com/finalshell/task/GP
      // 3d8: dup
      // 3d9: aload 0
      // 3da: lload 2
      // 3db: invokespecial com/finalshell/task/GP.<init> (Lcom/finalshell/task/T_2;J)V
      // 3de: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3e1: ldc2_w 434592463220957006
      // 3e4: astore 13
      // 3e6: astore 12
      // 3e8: ldc2_w 434592463220957006
      // 3eb: aload 12
      // 3ed: aload 13
      // 3ef: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3f2: pop
      // 3f3: goto 3fa
      // 3f6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3f9: athrow
      // 3fa: aload 0
      // 3fb: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 3fe: aload 0
      // 3ff: getfield com/finalshell/task/T_2.d Lcom/finalshell/io/To2;
      // 402: aload 0
      // 403: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 406: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 409: bipush 0
      // 40a: aload 0
      // 40b: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 40e: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 411: arraylength
      // 412: invokevirtual com/finalshell/io/To2.read ([BII)I
      // 415: dup_x1
      // 416: putfield com/finalshell/core/SelectUploadFile.G I
      // 419: ifle 503
      // 41c: bipush -1
      // 41d: istore 4
      // 41f: aload 1
      // 420: ifnonnull 50b
      // 423: bipush 0
      // 424: istore 5
      // 426: iload 5
      // 428: aload 0
      // 429: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 42c: getfield com/finalshell/core/SelectUploadFile.G I
      // 42f: if_icmpge 4ea
      // 432: iload 5
      // 434: sipush 21082
      // 437: ldc2_w 4260303926617752323
      // 43a: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 43d: aload 1
      // 43e: ifnonnull 42f
      // 441: aload 1
      // 442: ifnonnull 461
      // 445: if_icmpge 4ea
      // 448: goto 44f
      // 44b: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44e: athrow
      // 44f: aload 0
      // 450: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 453: getfield com/finalshell/core/SelectUploadFile.G I
      // 456: iload 5
      // 458: isub
      // 459: bipush 1
      // 45a: goto 461
      // 45d: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 460: athrow
      // 461: isub
      // 462: istore 4
      // 464: aload 0
      // 465: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 468: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 46b: iload 4
      // 46d: baload
      // 46e: istore 6
      // 470: aload 1
      // 471: ifnonnull 4e6
      // 474: iload 6
      // 476: sipush 1818
      // 479: ldc2_w 7108398593453463108
      // 47c: invokestatic com/finalshell/task/T_2.a (IJ)I
      // 47f: if_icmpne 4dc
      // 482: goto 489
      // 485: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 488: athrow
      // 489: aload 0
      // 48a: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 48d: bipush 1
      // 48e: putfield com/finalshell/core/SelectUploadFile.b Z
      // 491: iinc 4 1
      // 494: aload 0
      // 495: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 498: getfield com/finalshell/core/SelectUploadFile.G I
      // 49b: iload 4
      // 49d: isub
      // 49e: istore 7
      // 4a0: iload 7
      // 4a2: newarray 8
      // 4a4: astore 8
      // 4a6: aload 0
      // 4a7: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 4aa: getfield com/finalshell/core/SelectUploadFile.Z [B
      // 4ad: iload 4
      // 4af: aload 8
      // 4b1: bipush 0
      // 4b2: iload 7
      // 4b4: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 4b7: aload 0
      // 4b8: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 4bb: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 4be: invokevirtual com/finalshell/core/Cj4.f$To_2 ()Lcom/finalshell/io/To2;
      // 4c1: aload 8
      // 4c3: iload 7
      // 4c5: invokevirtual com/finalshell/io/To2.F ([BI)V
      // 4c8: aload 0
      // 4c9: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 4cc: getfield com/finalshell/core/SelectUploadFile.K Lcom/finalshell/core/Cj4;
      // 4cf: bipush 1
      // 4d0: invokevirtual com/finalshell/core/Cj4.R (Z)V
      // 4d3: goto 503
      // 4d6: astore 7
      // 4d8: aload 1
      // 4d9: ifnull 503
      // 4dc: iinc 5 1
      // 4df: goto 4e6
      // 4e2: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e5: athrow
      // 4e6: aload 1
      // 4e7: ifnull 426
      // 4ea: aload 1
      // 4eb: ifnull 3fa
      // 4ee: aload 0
      // 4ef: getfield com/finalshell/task/T_2.j Lcom/finalshell/core/CK;
      // 4f2: invokevirtual com/finalshell/core/CK.a$boolean ()Z
      // 4f5: ifeq 004
      // 4f8: aload 1
      // 4f9: ifnonnull 50b
      // 4fc: goto 503
      // 4ff: invokestatic com/finalshell/task/T_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 502: athrow
      // 503: aload 0
      // 504: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 507: bipush 1
      // 508: putfield com/finalshell/core/SelectUploadFile.P Z
      // 50b: goto 52b
      // 50e: astore 2
      // 50f: aload 2
      // 510: invokevirtual java/io/IOException.printStackTrace ()V
      // 513: aload 0
      // 514: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 517: bipush 1
      // 518: putfield com/finalshell/core/SelectUploadFile.P Z
      // 51b: goto 52b
      // 51e: astore 9
      // 520: aload 0
      // 521: getfield com/finalshell/task/T_2.c Lcom/finalshell/core/SelectUploadFile;
      // 524: bipush 1
      // 525: putfield com/finalshell/core/SelectUploadFile.P Z
      // 528: aload 9
      // 52a: athrow
      // 52b: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 4876) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 0;
               break;
            case 1:
               var10000 = 123;
               break;
            case 2:
               var10000 = 141;
               break;
            case 3:
               var10000 = 105;
               break;
            case 4:
               var10000 = 180;
               break;
            case 5:
               var10000 = 251;
               break;
            case 6:
               var10000 = 173;
               break;
            case 7:
               var10000 = 14;
               break;
            case 8:
               var10000 = 29;
               break;
            case 9:
               var10000 = 36;
               break;
            case 10:
               var10000 = 8;
               break;
            case 11:
               var10000 = 200;
               break;
            case 12:
               var10000 = 126;
               break;
            case 13:
               var10000 = 145;
               break;
            case 14:
               var10000 = 125;
               break;
            case 15:
               var10000 = 194;
               break;
            case 16:
               var10000 = 119;
               break;
            case 17:
               var10000 = 34;
               break;
            case 18:
               var10000 = 1;
               break;
            case 19:
               var10000 = 67;
               break;
            case 20:
               var10000 = 41;
               break;
            case 21:
               var10000 = 94;
               break;
            case 22:
               var10000 = 55;
               break;
            case 23:
               var10000 = 90;
               break;
            case 24:
               var10000 = 151;
               break;
            case 25:
               var10000 = 103;
               break;
            case 26:
               var10000 = 152;
               break;
            case 27:
               var10000 = 127;
               break;
            case 28:
               var10000 = 17;
               break;
            case 29:
               var10000 = 120;
               break;
            case 30:
               var10000 = 146;
               break;
            case 31:
               var10000 = 40;
               break;
            case 32:
               var10000 = 149;
               break;
            case 33:
               var10000 = 58;
               break;
            case 34:
               var10000 = 182;
               break;
            case 35:
               var10000 = 140;
               break;
            case 36:
               var10000 = 170;
               break;
            case 37:
               var10000 = 183;
               break;
            case 38:
               var10000 = 63;
               break;
            case 39:
               var10000 = 186;
               break;
            case 40:
               var10000 = 92;
               break;
            case 41:
               var10000 = 227;
               break;
            case 42:
               var10000 = 165;
               break;
            case 43:
               var10000 = 56;
               break;
            case 44:
               var10000 = 19;
               break;
            case 45:
               var10000 = 243;
               break;
            case 46:
               var10000 = 205;
               break;
            case 47:
               var10000 = 116;
               break;
            case 48:
               var10000 = 161;
               break;
            case 49:
               var10000 = 27;
               break;
            case 50:
               var10000 = 219;
               break;
            case 51:
               var10000 = 74;
               break;
            case 52:
               var10000 = 6;
               break;
            case 53:
               var10000 = 208;
               break;
            case 54:
               var10000 = 121;
               break;
            case 55:
               var10000 = 26;
               break;
            case 56:
               var10000 = 156;
               break;
            case 57:
               var10000 = 101;
               break;
            case 58:
               var10000 = 95;
               break;
            case 59:
               var10000 = 154;
               break;
            case 60:
               var10000 = 3;
               break;
            case 61:
               var10000 = 85;
               break;
            case 62:
               var10000 = 255;
               break;
            case 63:
               var10000 = 133;
               break;
            case 64:
               var10000 = 69;
               break;
            case 65:
               var10000 = 76;
               break;
            case 66:
               var10000 = 89;
               break;
            case 67:
               var10000 = 224;
               break;
            case 68:
               var10000 = 30;
               break;
            case 69:
               var10000 = 175;
               break;
            case 70:
               var10000 = 53;
               break;
            case 71:
               var10000 = 138;
               break;
            case 72:
               var10000 = 12;
               break;
            case 73:
               var10000 = 70;
               break;
            case 74:
               var10000 = 65;
               break;
            case 75:
               var10000 = 192;
               break;
            case 76:
               var10000 = 47;
               break;
            case 77:
               var10000 = 80;
               break;
            case 78:
               var10000 = 238;
               break;
            case 79:
               var10000 = 100;
               break;
            case 80:
               var10000 = 75;
               break;
            case 81:
               var10000 = 2;
               break;
            case 82:
               var10000 = 158;
               break;
            case 83:
               var10000 = 217;
               break;
            case 84:
               var10000 = 228;
               break;
            case 85:
               var10000 = 134;
               break;
            case 86:
               var10000 = 129;
               break;
            case 87:
               var10000 = 91;
               break;
            case 88:
               var10000 = 195;
               break;
            case 89:
               var10000 = 4;
               break;
            case 90:
               var10000 = 172;
               break;
            case 91:
               var10000 = 54;
               break;
            case 92:
               var10000 = 214;
               break;
            case 93:
               var10000 = 222;
               break;
            case 94:
               var10000 = 51;
               break;
            case 95:
               var10000 = 176;
               break;
            case 96:
               var10000 = 124;
               break;
            case 97:
               var10000 = 178;
               break;
            case 98:
               var10000 = 253;
               break;
            case 99:
               var10000 = 252;
               break;
            case 100:
               var10000 = 221;
               break;
            case 101:
               var10000 = 49;
               break;
            case 102:
               var10000 = 157;
               break;
            case 103:
               var10000 = 198;
               break;
            case 104:
               var10000 = 232;
               break;
            case 105:
               var10000 = 188;
               break;
            case 106:
               var10000 = 139;
               break;
            case 107:
               var10000 = 196;
               break;
            case 108:
               var10000 = 35;
               break;
            case 109:
               var10000 = 202;
               break;
            case 110:
               var10000 = 231;
               break;
            case 111:
               var10000 = 61;
               break;
            case 112:
               var10000 = 130;
               break;
            case 113:
               var10000 = 59;
               break;
            case 114:
               var10000 = 248;
               break;
            case 115:
               var10000 = 112;
               break;
            case 116:
               var10000 = 39;
               break;
            case 117:
               var10000 = 118;
               break;
            case 118:
               var10000 = 136;
               break;
            case 119:
               var10000 = 24;
               break;
            case 120:
               var10000 = 88;
               break;
            case 121:
               var10000 = 201;
               break;
            case 122:
               var10000 = 246;
               break;
            case 123:
               var10000 = 155;
               break;
            case 124:
               var10000 = 110;
               break;
            case 125:
               var10000 = 207;
               break;
            case 126:
               var10000 = 57;
               break;
            case 127:
               var10000 = 242;
               break;
            case 128:
               var10000 = 144;
               break;
            case 129:
               var10000 = 226;
               break;
            case 130:
               var10000 = 143;
               break;
            case 131:
               var10000 = 233;
               break;
            case 132:
               var10000 = 163;
               break;
            case 133:
               var10000 = 77;
               break;
            case 134:
               var10000 = 189;
               break;
            case 135:
               var10000 = 241;
               break;
            case 136:
               var10000 = 223;
               break;
            case 137:
               var10000 = 42;
               break;
            case 138:
               var10000 = 177;
               break;
            case 139:
               var10000 = 38;
               break;
            case 140:
               var10000 = 7;
               break;
            case 141:
               var10000 = 10;
               break;
            case 142:
               var10000 = 249;
               break;
            case 143:
               var10000 = 181;
               break;
            case 144:
               var10000 = 5;
               break;
            case 145:
               var10000 = 117;
               break;
            case 146:
               var10000 = 206;
               break;
            case 147:
               var10000 = 142;
               break;
            case 148:
               var10000 = 199;
               break;
            case 149:
               var10000 = 28;
               break;
            case 150:
               var10000 = 115;
               break;
            case 151:
               var10000 = 159;
               break;
            case 152:
               var10000 = 62;
               break;
            case 153:
               var10000 = 107;
               break;
            case 154:
               var10000 = 185;
               break;
            case 155:
               var10000 = 23;
               break;
            case 156:
               var10000 = 128;
               break;
            case 157:
               var10000 = 240;
               break;
            case 158:
               var10000 = 64;
               break;
            case 159:
               var10000 = 153;
               break;
            case 160:
               var10000 = 93;
               break;
            case 161:
               var10000 = 237;
               break;
            case 162:
               var10000 = 191;
               break;
            case 163:
               var10000 = 9;
               break;
            case 164:
               var10000 = 46;
               break;
            case 165:
               var10000 = 220;
               break;
            case 166:
               var10000 = 87;
               break;
            case 167:
               var10000 = 97;
               break;
            case 168:
               var10000 = 135;
               break;
            case 169:
               var10000 = 230;
               break;
            case 170:
               var10000 = 212;
               break;
            case 171:
               var10000 = 179;
               break;
            case 172:
               var10000 = 171;
               break;
            case 173:
               var10000 = 204;
               break;
            case 174:
               var10000 = 254;
               break;
            case 175:
               var10000 = 236;
               break;
            case 176:
               var10000 = 45;
               break;
            case 177:
               var10000 = 82;
               break;
            case 178:
               var10000 = 102;
               break;
            case 179:
               var10000 = 239;
               break;
            case 180:
               var10000 = 71;
               break;
            case 181:
               var10000 = 234;
               break;
            case 182:
               var10000 = 197;
               break;
            case 183:
               var10000 = 114;
               break;
            case 184:
               var10000 = 96;
               break;
            case 185:
               var10000 = 32;
               break;
            case 186:
               var10000 = 166;
               break;
            case 187:
               var10000 = 104;
               break;
            case 188:
               var10000 = 250;
               break;
            case 189:
               var10000 = 244;
               break;
            case 190:
               var10000 = 235;
               break;
            case 191:
               var10000 = 43;
               break;
            case 192:
               var10000 = 162;
               break;
            case 193:
               var10000 = 25;
               break;
            case 194:
               var10000 = 83;
               break;
            case 195:
               var10000 = 132;
               break;
            case 196:
               var10000 = 72;
               break;
            case 197:
               var10000 = 31;
               break;
            case 198:
               var10000 = 73;
               break;
            case 199:
               var10000 = 211;
               break;
            case 200:
               var10000 = 18;
               break;
            case 201:
               var10000 = 66;
               break;
            case 202:
               var10000 = 113;
               break;
            case 203:
               var10000 = 122;
               break;
            case 204:
               var10000 = 99;
               break;
            case 205:
               var10000 = 13;
               break;
            case 206:
               var10000 = 193;
               break;
            case 207:
               var10000 = 106;
               break;
            case 208:
               var10000 = 160;
               break;
            case 209:
               var10000 = 174;
               break;
            case 210:
               var10000 = 150;
               break;
            case 211:
               var10000 = 81;
               break;
            case 212:
               var10000 = 111;
               break;
            case 213:
               var10000 = 245;
               break;
            case 214:
               var10000 = 187;
               break;
            case 215:
               var10000 = 50;
               break;
            case 216:
               var10000 = 167;
               break;
            case 217:
               var10000 = 78;
               break;
            case 218:
               var10000 = 33;
               break;
            case 219:
               var10000 = 213;
               break;
            case 220:
               var10000 = 137;
               break;
            case 221:
               var10000 = 21;
               break;
            case 222:
               var10000 = 184;
               break;
            case 223:
               var10000 = 15;
               break;
            case 224:
               var10000 = 218;
               break;
            case 225:
               var10000 = 48;
               break;
            case 226:
               var10000 = 44;
               break;
            case 227:
               var10000 = 190;
               break;
            case 228:
               var10000 = 108;
               break;
            case 229:
               var10000 = 210;
               break;
            case 230:
               var10000 = 168;
               break;
            case 231:
               var10000 = 84;
               break;
            case 232:
               var10000 = 52;
               break;
            case 233:
               var10000 = 209;
               break;
            case 234:
               var10000 = 79;
               break;
            case 235:
               var10000 = 109;
               break;
            case 236:
               var10000 = 37;
               break;
            case 237:
               var10000 = 86;
               break;
            case 238:
               var10000 = 16;
               break;
            case 239:
               var10000 = 147;
               break;
            case 240:
               var10000 = 22;
               break;
            case 241:
               var10000 = 216;
               break;
            case 242:
               var10000 = 169;
               break;
            case 243:
               var10000 = 225;
               break;
            case 244:
               var10000 = 148;
               break;
            case 245:
               var10000 = 229;
               break;
            case 246:
               var10000 = 68;
               break;
            case 247:
               var10000 = 60;
               break;
            case 248:
               var10000 = 131;
               break;
            case 249:
               var10000 = 11;
               break;
            case 250:
               var10000 = 247;
               break;
            case 251:
               var10000 = 203;
               break;
            case 252:
               var10000 = 20;
               break;
            case 253:
               var10000 = 164;
               break;
            case 254:
               var10000 = 215;
               break;
            default:
               var10000 = 98;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4445;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "¼*üÒ\u0003V\"¡";
      int var12 = "¼*üÒ\u0003V\"¡".length();
      char var9 = 4;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 91;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 91;
               var10006 = var14;
            } else {
               var27 = 91;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 91;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 49;
                     break;
                  case 1:
                     var47 = 85;
                     break;
                  case 2:
                     var47 = 123;
                     break;
                  case 3:
                     var47 = 24;
                     break;
                  case 4:
                     var47 = 125;
                     break;
                  case 5:
                     var47 = 120;
                     break;
                  default:
                     var47 = 11;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 2369723038262046346L;
            long[] var6 = new long[8];
            int var3 = 0;
            String var4 = "\u0081\u0011ãQeÍ\u000fý8\ræ\u0019\u0011±èÔOÃ\u001a]¼\u0090¡Á^Å±~\u009b\u00058Éêp\u0082L\"ëîa\u0019W\u0007ì\u007fTÅÖ";
            int var5 = "\u0081\u0011ãQeÍ\u000fý8\ræ\u0019\u0011±èÔOÃ\u001a]¼\u0090¡Á^Å±~\u009b\u00058Éêp\u0082L\"ëîa\u0019W\u0007ì\u007fTÅÖ".length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           e = var6;
                           f = new Integer[8];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "´;¡!lSÀÞp\u001cÒ[Ú\u008a¹«";
                        var5 = "´;¡!lSÀÞp\u001cÒ[Ú\u008a¹«".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





