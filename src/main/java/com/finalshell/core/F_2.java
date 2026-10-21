package com.finalshell.core;

public class F_2 implements WS {
   public F_2 X;
   public final W02 V;
   public int T;
   public final int A;
   public final int J;
   public int s;
   public int[] Q;
   public RE3 p;
   public int d;
   public int S;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public F_2(W02 param1, int param2, String param3, String param4, String param5, String[] param6) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XB.X ()[I
      // 03: aload 0
      // 04: invokespecial java/lang/Object.<init> ()V
      // 07: astore 7
      // 09: aload 0
      // 0a: new com/finalshell/core/RE3
      // 0d: dup
      // 0e: invokespecial com/finalshell/core/RE3.<init> ()V
      // 11: putfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 14: aload 1
      // 15: getfield com/finalshell/core/W02.R Lcom/finalshell/core/F_2;
      // 18: aload 7
      // 1a: ifnonnull 43
      // 1d: ifnonnull 38
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 26: athrow
      // 27: aload 1
      // 28: aload 0
      // 29: putfield com/finalshell/core/W02.R Lcom/finalshell/core/F_2;
      // 2c: aload 7
      // 2e: ifnull 47
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 37: athrow
      // 38: aload 1
      // 39: getfield com/finalshell/core/W02.U Lcom/finalshell/core/F_2;
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 42: athrow
      // 43: aload 0
      // 44: putfield com/finalshell/core/F_2.X Lcom/finalshell/core/F_2;
      // 47: aload 1
      // 48: aload 0
      // 49: putfield com/finalshell/core/W02.U Lcom/finalshell/core/F_2;
      // 4c: aload 0
      // 4d: aload 1
      // 4e: putfield com/finalshell/core/F_2.V Lcom/finalshell/core/W02;
      // 51: aload 0
      // 52: iload 2
      // 53: putfield com/finalshell/core/F_2.T I
      // 56: aload 0
      // 57: aload 1
      // 58: aload 3
      // 59: invokevirtual com/finalshell/core/W02.O (Ljava/lang/String;)I
      // 5c: putfield com/finalshell/core/F_2.A I
      // 5f: aload 0
      // 60: aload 1
      // 61: aload 4
      // 63: invokevirtual com/finalshell/core/W02.O (Ljava/lang/String;)I
      // 66: putfield com/finalshell/core/F_2.J I
      // 69: aload 6
      // 6b: aload 7
      // 6d: ifnonnull 7c
      // 70: ifnull cb
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 79: athrow
      // 7a: aload 6
      // 7c: arraylength
      // 7d: aload 7
      // 7f: ifnonnull a5
      // 82: ifle cb
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 8b: athrow
      // 8c: aload 0
      // 8d: aload 6
      // 8f: arraylength
      // 90: putfield com/finalshell/core/F_2.s I
      // 93: aload 0
      // 94: aload 0
      // 95: getfield com/finalshell/core/F_2.s I
      // 98: newarray 10
      // 9a: putfield com/finalshell/core/F_2.Q [I
      // 9d: bipush 0
      // 9e: goto a5
      // a1: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // a4: athrow
      // a5: istore 8
      // a7: iload 8
      // a9: aload 0
      // aa: getfield com/finalshell/core/F_2.s I
      // ad: if_icmpge cb
      // b0: aload 0
      // b1: getfield com/finalshell/core/F_2.Q [I
      // b4: iload 8
      // b6: aload 1
      // b7: aload 6
      // b9: iload 8
      // bb: aaload
      // bc: invokevirtual com/finalshell/core/W02.H (Ljava/lang/String;)Lcom/finalshell/core/Nl4;
      // bf: getfield com/finalshell/core/Nl4.J I
      // c2: iastore
      // c3: iinc 8 1
      // c6: aload 7
      // c8: ifnull a7
      // cb: return
   }

   @Override
   public void a(int var1) {
      this.p.c(var1);
   }

   @Override
   public void v(int var1, int var2) {
      this.p.W(var1, var2);
   }

   @Override
   public void i(int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XB.X ()[I
      // 03: astore 3
      // 04: iload 2
      // 05: bipush 4
      // 06: aload 3
      // 07: ifnonnull b2
      // 0a: if_icmpge a1
      // 0d: goto 14
      // 10: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 13: athrow
      // 14: iload 1
      // 15: sipush 24084
      // 18: ldc2_w 8525837155732369005
      // 1b: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 1e: aload 3
      // 1f: ifnonnull b2
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 28: athrow
      // 29: if_icmpeq a1
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 32: athrow
      // 33: iload 1
      // 34: sipush 9887
      // 37: ldc2_w 391404941246682862
      // 3a: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 3d: aload 3
      // 3e: ifnonnull 90
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 47: athrow
      // 48: if_icmpge 71
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 51: athrow
      // 52: sipush 25457
      // 55: ldc2_w 940192056310928132
      // 58: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 5b: iload 1
      // 5c: sipush 13458
      // 5f: ldc2_w 1049591138131723503
      // 62: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 65: isub
      // 66: bipush 2
      // 67: ishl
      // 68: iadd
      // 69: iload 2
      // 6a: iadd
      // 6b: istore 4
      // 6d: aload 3
      // 6e: ifnull 93
      // 71: sipush 23290
      // 74: ldc2_w 963145301943560838
      // 77: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 7a: iload 1
      // 7b: sipush 22043
      // 7e: ldc2_w 2708196981267015268
      // 81: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 84: isub
      // 85: bipush 2
      // 86: ishl
      // 87: iadd
      // 88: iload 2
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 8f: athrow
      // 90: iadd
      // 91: istore 4
      // 93: aload 0
      // 94: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 97: iload 4
      // 99: invokevirtual com/finalshell/core/RE3.c (I)Lcom/finalshell/core/RE3;
      // 9c: pop
      // 9d: aload 3
      // 9e: ifnull e7
      // a1: iload 2
      // a2: sipush 28660
      // a5: ldc2_w 7953969994162577294
      // a8: invokestatic com/finalshell/core/F_2.a (IJ)I
      // ab: goto b2
      // ae: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // b1: athrow
      // b2: if_icmplt d6
      // b5: aload 0
      // b6: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // b9: sipush 2749
      // bc: ldc2_w 7287114296545180357
      // bf: invokestatic com/finalshell/core/F_2.a (IJ)I
      // c2: invokevirtual com/finalshell/core/RE3.c (I)Lcom/finalshell/core/RE3;
      // c5: iload 1
      // c6: iload 2
      // c7: invokevirtual com/finalshell/core/RE3.d (II)Lcom/finalshell/core/RE3;
      // ca: pop
      // cb: aload 3
      // cc: ifnull e7
      // cf: goto d6
      // d2: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // d5: athrow
      // d6: aload 0
      // d7: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // da: iload 1
      // db: iload 2
      // dc: invokevirtual com/finalshell/core/RE3.W (II)Lcom/finalshell/core/RE3;
      // df: pop
      // e0: goto e7
      // e3: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // e6: athrow
      // e7: return
   }

   @Override
   public void K(int var1, String var2) {
      Nl4 var3 = this.V.H(var2);
      this.p.d(var1, var3.J);
   }

   @Override
   public void w(int var1, String var2, String var3, String var4) {
      Nl4 var5 = this.V.h(var2, var3, var4);
      this.p.d(var1, var5.J);
   }

   @Override
   public void d(int param1, String param2, String param3, String param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XB.X ()[I
      // 03: astore 5
      // 05: iload 1
      // 06: aload 5
      // 08: ifnonnull 26
      // 0b: sipush 9469
      // 0e: ldc2_w 2495528535348728991
      // 11: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 14: if_icmpne 29
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 25: athrow
      // 26: goto 2a
      // 29: bipush 0
      // 2a: istore 6
      // 2c: aload 0
      // 2d: getfield com/finalshell/core/F_2.V Lcom/finalshell/core/W02;
      // 30: aload 2
      // 31: aload 3
      // 32: aload 4
      // 34: iload 6
      // 36: invokevirtual com/finalshell/core/W02.d (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/finalshell/core/Nl4;
      // 39: astore 7
      // 3b: aload 7
      // 3d: getfield com/finalshell/core/Nl4.Y I
      // 40: istore 8
      // 42: iload 6
      // 44: aload 5
      // 46: ifnonnull 55
      // 49: ifeq 9c
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 52: athrow
      // 53: iload 8
      // 55: aload 5
      // 57: ifnonnull 70
      // 5a: ifne 79
      // 5d: goto 64
      // 60: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 63: athrow
      // 64: aload 4
      // 66: invokestatic com/finalshell/core/XB.V (Ljava/lang/String;)I
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 6f: athrow
      // 70: istore 8
      // 72: aload 7
      // 74: iload 8
      // 76: putfield com/finalshell/core/Nl4.Y I
      // 79: aload 0
      // 7a: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 7d: sipush 504
      // 80: ldc2_w 1240789978836562307
      // 83: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 86: aload 7
      // 88: getfield com/finalshell/core/Nl4.J I
      // 8b: invokevirtual com/finalshell/core/RE3.d (II)Lcom/finalshell/core/RE3;
      // 8e: iload 8
      // 90: bipush 2
      // 91: ishr
      // 92: bipush 0
      // 93: invokevirtual com/finalshell/core/RE3.W (II)Lcom/finalshell/core/RE3;
      // 96: pop
      // 97: aload 5
      // 99: ifnull b1
      // 9c: aload 0
      // 9d: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // a0: iload 1
      // a1: aload 7
      // a3: getfield com/finalshell/core/Nl4.J I
      // a6: invokevirtual com/finalshell/core/RE3.d (II)Lcom/finalshell/core/RE3;
      // a9: pop
      // aa: goto b1
      // ad: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // b0: athrow
      // b1: return
   }

   @Override
   public void M(int param1, De2 param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XB.X ()[I
      // 03: astore 3
      // 04: aload 2
      // 05: aload 3
      // 06: ifnonnull 58
      // 09: getfield com/finalshell/core/De2.p I
      // 0c: bipush 2
      // 0d: iand
      // 0e: ifeq 4e
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 17: athrow
      // 18: aload 2
      // 19: aload 3
      // 1a: ifnonnull 58
      // 1d: goto 24
      // 20: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 23: athrow
      // 24: getfield com/finalshell/core/De2.W I
      // 27: aload 0
      // 28: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 2b: getfield com/finalshell/core/RE3.V I
      // 2e: isub
      // 2f: sipush 7509
      // 32: ldc2_w 5444537365062839605
      // 35: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 38: if_icmpge 4e
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 41: athrow
      // 42: new java/lang/UnsupportedOperationException
      // 45: dup
      // 46: invokespecial java/lang/UnsupportedOperationException.<init> ()V
      // 49: athrow
      // 4a: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 52: iload 1
      // 53: invokevirtual com/finalshell/core/RE3.c (I)Lcom/finalshell/core/RE3;
      // 56: pop
      // 57: aload 2
      // 58: aload 0
      // 59: aload 0
      // 5a: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 5d: aload 0
      // 5e: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 61: getfield com/finalshell/core/RE3.V I
      // 64: bipush 1
      // 65: isub
      // 66: iload 1
      // 67: aload 3
      // 68: ifnonnull 86
      // 6b: sipush 8561
      // 6e: ldc2_w 4262596755866767617
      // 71: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 74: if_icmpne 89
      // 77: goto 7e
      // 7a: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 7d: athrow
      // 7e: bipush 1
      // 7f: goto 86
      // 82: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 85: athrow
      // 86: goto 8a
      // 89: bipush 0
      // 8a: invokevirtual com/finalshell/core/De2.B (Lcom/finalshell/core/F_2;Lcom/finalshell/core/RE3;IZ)V
      // 8d: return
   }

   @Override
   public void X(De2 var1) {
      var1.y(this, this.p.V, this.p.Q);
   }

   @Override
   public void K(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/XB.X ()[I
      // 03: aload 0
      // 04: getfield com/finalshell/core/F_2.V Lcom/finalshell/core/W02;
      // 07: aload 1
      // 08: invokevirtual com/finalshell/core/W02.N (Ljava/lang/Object;)Lcom/finalshell/core/Nl4;
      // 0b: astore 3
      // 0c: astore 2
      // 0d: aload 3
      // 0e: getfield com/finalshell/core/Nl4.J I
      // 11: istore 4
      // 13: aload 2
      // 14: ifnonnull 62
      // 17: aload 3
      // 18: getfield com/finalshell/core/Nl4.p I
      // 1b: bipush 5
      // 1c: if_icmpeq 48
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 25: athrow
      // 26: aload 3
      // 27: getfield com/finalshell/core/Nl4.p I
      // 2a: sipush 18715
      // 2d: ldc2_w 5834817662975916415
      // 30: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 33: aload 2
      // 34: ifnonnull 78
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 3d: athrow
      // 3e: if_icmpne 66
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 47: athrow
      // 48: aload 0
      // 49: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 4c: sipush 25936
      // 4f: ldc2_w 5189940548616426787
      // 52: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 55: iload 4
      // 57: invokevirtual com/finalshell/core/RE3.d (II)Lcom/finalshell/core/RE3;
      // 5a: pop
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 61: athrow
      // 62: aload 2
      // 63: ifnull b3
      // 66: iload 4
      // 68: sipush 7554
      // 6b: ldc2_w 485518918345158140
      // 6e: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 77: athrow
      // 78: if_icmplt 99
      // 7b: aload 0
      // 7c: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 7f: sipush 150
      // 82: ldc2_w 216136075019415780
      // 85: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 88: iload 4
      // 8a: invokevirtual com/finalshell/core/RE3.d (II)Lcom/finalshell/core/RE3;
      // 8d: pop
      // 8e: aload 2
      // 8f: ifnull b3
      // 92: goto 99
      // 95: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 98: athrow
      // 99: aload 0
      // 9a: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 9d: sipush 21449
      // a0: ldc2_w 4197248593369539496
      // a3: invokestatic com/finalshell/core/F_2.a (IJ)I
      // a6: iload 4
      // a8: invokevirtual com/finalshell/core/RE3.W (II)Lcom/finalshell/core/RE3;
      // ab: pop
      // ac: goto b3
      // af: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // b2: athrow
      // b3: return
   }

   @Override
   public void m(int var1, int var2) {
      this.p.c(a(27434, 6034407650826918732L)).W(var1, var2);
   }

   @Override
   public void j(int var1, int var2) {
      this.d = var1;
      this.S = var2;
   }

   @Override
   public void J() {
   }

   public final int A() {
      int var5;
      int[] var10000 = XB.X();
      int var2 = a(31672, 4241364992867011551L);
      int[] var1 = var10000;

      label37: {
         label36: {
            try {
               var5 = this.p.V;
               if (var1 != null) {
                  break label37;
               }

               if (this.p.V <= 0) {
                  break label36;
               }
            } catch (UnsupportedOperationException var4) {
               throw a(var4);
            }

            this.V.O(a(25446, 14797));
            var2 += a(8975, 1909113725282079611L) + this.p.V + 0;
         }

         var5 = this.s;
      }

      try {
         if (var1 != null) {
            return var5;
         }

         if (var5 <= 0) {
            return var2;
         }
      } catch (UnsupportedOperationException var3) {
         throw a(var3);
      }

      this.V.O(a(25445, -26033));
      var2 += a(14762, 4142460480816990685L) + 2 * this.s;
      return var2;
   }

   public final void S(RE3 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: sipush 13951
      // 003: ldc2_w 835773993152398857
      // 006: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 009: istore 3
      // 00a: invokestatic com/finalshell/core/XB.X ()[I
      // 00d: aload 1
      // 00e: aload 0
      // 00f: getfield com/finalshell/core/F_2.T I
      // 012: sipush 19773
      // 015: ldc2_w 7663494879908314456
      // 018: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 01b: iand
      // 01c: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 01f: aload 0
      // 020: getfield com/finalshell/core/F_2.A I
      // 023: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 026: aload 0
      // 027: getfield com/finalshell/core/F_2.J I
      // 02a: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 02d: pop
      // 02e: astore 2
      // 02f: bipush 0
      // 030: istore 4
      // 032: aload 0
      // 033: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 036: getfield com/finalshell/core/RE3.V I
      // 039: aload 2
      // 03a: ifnonnull 04e
      // 03d: ifle 04a
      // 040: goto 047
      // 043: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 046: athrow
      // 047: iinc 4 1
      // 04a: aload 0
      // 04b: getfield com/finalshell/core/F_2.s I
      // 04e: aload 2
      // 04f: ifnonnull 06d
      // 052: ifle 05f
      // 055: goto 05c
      // 058: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 05b: athrow
      // 05c: iinc 4 1
      // 05f: aload 1
      // 060: iload 4
      // 062: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 065: pop
      // 066: aload 0
      // 067: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 06a: getfield com/finalshell/core/RE3.V I
      // 06d: aload 2
      // 06e: ifnonnull 0ec
      // 071: ifle 0e8
      // 074: goto 07b
      // 077: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 07a: athrow
      // 07b: sipush 11262
      // 07e: ldc2_w 5938777165607099293
      // 081: invokestatic com/finalshell/core/F_2.a (IJ)I
      // 084: aload 0
      // 085: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 088: getfield com/finalshell/core/RE3.V I
      // 08b: iadd
      // 08c: bipush 0
      // 08d: iadd
      // 08e: istore 5
      // 090: aload 1
      // 091: aload 0
      // 092: getfield com/finalshell/core/F_2.V Lcom/finalshell/core/W02;
      // 095: sipush 25444
      // 098: sipush -6770
      // 09b: invokestatic com/finalshell/core/F_2.a (II)Ljava/lang/String;
      // 09e: invokevirtual com/finalshell/core/W02.O (Ljava/lang/String;)I
      // 0a1: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 0a4: iload 5
      // 0a6: invokevirtual com/finalshell/core/RE3.z (I)Lcom/finalshell/core/RE3;
      // 0a9: pop
      // 0aa: aload 1
      // 0ab: aload 0
      // 0ac: getfield com/finalshell/core/F_2.d I
      // 0af: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 0b2: aload 0
      // 0b3: getfield com/finalshell/core/F_2.S I
      // 0b6: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 0b9: pop
      // 0ba: aload 1
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 0bf: getfield com/finalshell/core/RE3.V I
      // 0c2: invokevirtual com/finalshell/core/RE3.z (I)Lcom/finalshell/core/RE3;
      // 0c5: aload 0
      // 0c6: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 0c9: getfield com/finalshell/core/RE3.Q [B
      // 0cc: bipush 0
      // 0cd: aload 0
      // 0ce: getfield com/finalshell/core/F_2.p Lcom/finalshell/core/RE3;
      // 0d1: getfield com/finalshell/core/RE3.V I
      // 0d4: invokevirtual com/finalshell/core/RE3.t ([BII)Lcom/finalshell/core/RE3;
      // 0d7: pop
      // 0d8: aload 1
      // 0d9: bipush 0
      // 0da: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 0dd: pop
      // 0de: bipush 0
      // 0df: istore 4
      // 0e1: aload 1
      // 0e2: iload 4
      // 0e4: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 0e7: pop
      // 0e8: aload 0
      // 0e9: getfield com/finalshell/core/F_2.s I
      // 0ec: aload 2
      // 0ed: ifnonnull 12b
      // 0f0: ifle 149
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0f9: athrow
      // 0fa: aload 1
      // 0fb: aload 0
      // 0fc: getfield com/finalshell/core/F_2.V Lcom/finalshell/core/W02;
      // 0ff: sipush 25447
      // 102: sipush 26129
      // 105: invokestatic com/finalshell/core/F_2.a (II)Ljava/lang/String;
      // 108: invokevirtual com/finalshell/core/W02.O (Ljava/lang/String;)I
      // 10b: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 10e: bipush 2
      // 10f: aload 0
      // 110: getfield com/finalshell/core/F_2.s I
      // 113: imul
      // 114: bipush 2
      // 115: iadd
      // 116: invokevirtual com/finalshell/core/RE3.z (I)Lcom/finalshell/core/RE3;
      // 119: pop
      // 11a: aload 1
      // 11b: aload 0
      // 11c: getfield com/finalshell/core/F_2.s I
      // 11f: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 122: pop
      // 123: bipush 0
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/F_2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 12a: athrow
      // 12b: istore 5
      // 12d: iload 5
      // 12f: aload 0
      // 130: getfield com/finalshell/core/F_2.s I
      // 133: if_icmpge 149
      // 136: aload 1
      // 137: aload 0
      // 138: getfield com/finalshell/core/F_2.Q [I
      // 13b: iload 5
      // 13d: iaload
      // 13e: invokevirtual com/finalshell/core/RE3.G (I)Lcom/finalshell/core/RE3;
      // 141: pop
      // 142: iinc 5 1
      // 145: aload 2
      // 146: ifnull 12d
      // 149: return
   }

   public static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 25446) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 244;
               break;
            case 1:
               var10000 = 203;
               break;
            case 2:
               var10000 = 227;
               break;
            case 3:
               var10000 = 87;
               break;
            case 4:
               var10000 = 138;
               break;
            case 5:
               var10000 = 210;
               break;
            case 6:
               var10000 = 136;
               break;
            case 7:
               var10000 = 216;
               break;
            case 8:
               var10000 = 217;
               break;
            case 9:
               var10000 = 144;
               break;
            case 10:
               var10000 = 126;
               break;
            case 11:
               var10000 = 14;
               break;
            case 12:
               var10000 = 62;
               break;
            case 13:
               var10000 = 140;
               break;
            case 14:
               var10000 = 176;
               break;
            case 15:
               var10000 = 194;
               break;
            case 16:
               var10000 = 34;
               break;
            case 17:
               var10000 = 206;
               break;
            case 18:
               var10000 = 231;
               break;
            case 19:
               var10000 = 235;
               break;
            case 20:
               var10000 = 239;
               break;
            case 21:
               var10000 = 172;
               break;
            case 22:
               var10000 = 31;
               break;
            case 23:
               var10000 = 167;
               break;
            case 24:
               var10000 = 178;
               break;
            case 25:
               var10000 = 211;
               break;
            case 26:
               var10000 = 183;
               break;
            case 27:
               var10000 = 146;
               break;
            case 28:
               var10000 = 6;
               break;
            case 29:
               var10000 = 48;
               break;
            case 30:
               var10000 = 71;
               break;
            case 31:
               var10000 = 120;
               break;
            case 32:
               var10000 = 9;
               break;
            case 33:
               var10000 = 67;
               break;
            case 34:
               var10000 = 1;
               break;
            case 35:
               var10000 = 160;
               break;
            case 36:
               var10000 = 111;
               break;
            case 37:
               var10000 = 195;
               break;
            case 38:
               var10000 = 95;
               break;
            case 39:
               var10000 = 232;
               break;
            case 40:
               var10000 = 202;
               break;
            case 41:
               var10000 = 78;
               break;
            case 42:
               var10000 = 19;
               break;
            case 43:
               var10000 = 10;
               break;
            case 44:
               var10000 = 88;
               break;
            case 45:
               var10000 = 164;
               break;
            case 46:
               var10000 = 218;
               break;
            case 47:
               var10000 = 246;
               break;
            case 48:
               var10000 = 65;
               break;
            case 49:
               var10000 = 114;
               break;
            case 50:
               var10000 = 115;
               break;
            case 51:
               var10000 = 69;
               break;
            case 52:
               var10000 = 222;
               break;
            case 53:
               var10000 = 189;
               break;
            case 54:
               var10000 = 168;
               break;
            case 55:
               var10000 = 11;
               break;
            case 56:
               var10000 = 243;
               break;
            case 57:
               var10000 = 81;
               break;
            case 58:
               var10000 = 45;
               break;
            case 59:
               var10000 = 240;
               break;
            case 60:
               var10000 = 230;
               break;
            case 61:
               var10000 = 49;
               break;
            case 62:
               var10000 = 74;
               break;
            case 63:
               var10000 = 182;
               break;
            case 64:
               var10000 = 60;
               break;
            case 65:
               var10000 = 17;
               break;
            case 66:
               var10000 = 253;
               break;
            case 67:
               var10000 = 26;
               break;
            case 68:
               var10000 = 219;
               break;
            case 69:
               var10000 = 15;
               break;
            case 70:
               var10000 = 175;
               break;
            case 71:
               var10000 = 70;
               break;
            case 72:
               var10000 = 141;
               break;
            case 73:
               var10000 = 186;
               break;
            case 74:
               var10000 = 185;
               break;
            case 75:
               var10000 = 242;
               break;
            case 76:
               var10000 = 47;
               break;
            case 77:
               var10000 = 212;
               break;
            case 78:
               var10000 = 23;
               break;
            case 79:
               var10000 = 197;
               break;
            case 80:
               var10000 = 204;
               break;
            case 81:
               var10000 = 50;
               break;
            case 82:
               var10000 = 187;
               break;
            case 83:
               var10000 = 137;
               break;
            case 84:
               var10000 = 158;
               break;
            case 85:
               var10000 = 233;
               break;
            case 86:
               var10000 = 221;
               break;
            case 87:
               var10000 = 161;
               break;
            case 88:
               var10000 = 101;
               break;
            case 89:
               var10000 = 32;
               break;
            case 90:
               var10000 = 58;
               break;
            case 91:
               var10000 = 8;
               break;
            case 92:
               var10000 = 89;
               break;
            case 93:
               var10000 = 18;
               break;
            case 94:
               var10000 = 247;
               break;
            case 95:
               var10000 = 21;
               break;
            case 96:
               var10000 = 63;
               break;
            case 97:
               var10000 = 199;
               break;
            case 98:
               var10000 = 80;
               break;
            case 99:
               var10000 = 39;
               break;
            case 100:
               var10000 = 104;
               break;
            case 101:
               var10000 = 2;
               break;
            case 102:
               var10000 = 151;
               break;
            case 103:
               var10000 = 130;
               break;
            case 104:
               var10000 = 128;
               break;
            case 105:
               var10000 = 191;
               break;
            case 106:
               var10000 = 226;
               break;
            case 107:
               var10000 = 76;
               break;
            case 108:
               var10000 = 42;
               break;
            case 109:
               var10000 = 68;
               break;
            case 110:
               var10000 = 86;
               break;
            case 111:
               var10000 = 105;
               break;
            case 112:
               var10000 = 53;
               break;
            case 113:
               var10000 = 213;
               break;
            case 114:
               var10000 = 184;
               break;
            case 115:
               var10000 = 170;
               break;
            case 116:
               var10000 = 59;
               break;
            case 117:
               var10000 = 3;
               break;
            case 118:
               var10000 = 57;
               break;
            case 119:
               var10000 = 192;
               break;
            case 120:
               var10000 = 112;
               break;
            case 121:
               var10000 = 201;
               break;
            case 122:
               var10000 = 179;
               break;
            case 123:
               var10000 = 205;
               break;
            case 124:
               var10000 = 100;
               break;
            case 125:
               var10000 = 173;
               break;
            case 126:
               var10000 = 127;
               break;
            case 127:
               var10000 = 92;
               break;
            case 128:
               var10000 = 102;
               break;
            case 129:
               var10000 = 38;
               break;
            case 130:
               var10000 = 109;
               break;
            case 131:
               var10000 = 200;
               break;
            case 132:
               var10000 = 237;
               break;
            case 133:
               var10000 = 97;
               break;
            case 134:
               var10000 = 29;
               break;
            case 135:
               var10000 = 35;
               break;
            case 136:
               var10000 = 98;
               break;
            case 137:
               var10000 = 207;
               break;
            case 138:
               var10000 = 181;
               break;
            case 139:
               var10000 = 224;
               break;
            case 140:
               var10000 = 22;
               break;
            case 141:
               var10000 = 234;
               break;
            case 142:
               var10000 = 143;
               break;
            case 143:
               var10000 = 33;
               break;
            case 144:
               var10000 = 20;
               break;
            case 145:
               var10000 = 73;
               break;
            case 146:
               var10000 = 122;
               break;
            case 147:
               var10000 = 52;
               break;
            case 148:
               var10000 = 148;
               break;
            case 149:
               var10000 = 107;
               break;
            case 150:
               var10000 = 99;
               break;
            case 151:
               var10000 = 132;
               break;
            case 152:
               var10000 = 220;
               break;
            case 153:
               var10000 = 255;
               break;
            case 154:
               var10000 = 193;
               break;
            case 155:
               var10000 = 166;
               break;
            case 156:
               var10000 = 82;
               break;
            case 157:
               var10000 = 159;
               break;
            case 158:
               var10000 = 196;
               break;
            case 159:
               var10000 = 108;
               break;
            case 160:
               var10000 = 223;
               break;
            case 161:
               var10000 = 209;
               break;
            case 162:
               var10000 = 236;
               break;
            case 163:
               var10000 = 5;
               break;
            case 164:
               var10000 = 150;
               break;
            case 165:
               var10000 = 251;
               break;
            case 166:
               var10000 = 106;
               break;
            case 167:
               var10000 = 142;
               break;
            case 168:
               var10000 = 4;
               break;
            case 169:
               var10000 = 123;
               break;
            case 170:
               var10000 = 180;
               break;
            case 171:
               var10000 = 252;
               break;
            case 172:
               var10000 = 163;
               break;
            case 173:
               var10000 = 190;
               break;
            case 174:
               var10000 = 153;
               break;
            case 175:
               var10000 = 155;
               break;
            case 176:
               var10000 = 7;
               break;
            case 177:
               var10000 = 134;
               break;
            case 178:
               var10000 = 30;
               break;
            case 179:
               var10000 = 84;
               break;
            case 180:
               var10000 = 119;
               break;
            case 181:
               var10000 = 154;
               break;
            case 182:
               var10000 = 61;
               break;
            case 183:
               var10000 = 0;
               break;
            case 184:
               var10000 = 96;
               break;
            case 185:
               var10000 = 129;
               break;
            case 186:
               var10000 = 36;
               break;
            case 187:
               var10000 = 131;
               break;
            case 188:
               var10000 = 43;
               break;
            case 189:
               var10000 = 121;
               break;
            case 190:
               var10000 = 25;
               break;
            case 191:
               var10000 = 46;
               break;
            case 192:
               var10000 = 125;
               break;
            case 193:
               var10000 = 135;
               break;
            case 194:
               var10000 = 83;
               break;
            case 195:
               var10000 = 156;
               break;
            case 196:
               var10000 = 157;
               break;
            case 197:
               var10000 = 55;
               break;
            case 198:
               var10000 = 248;
               break;
            case 199:
               var10000 = 28;
               break;
            case 200:
               var10000 = 79;
               break;
            case 201:
               var10000 = 228;
               break;
            case 202:
               var10000 = 77;
               break;
            case 203:
               var10000 = 165;
               break;
            case 204:
               var10000 = 139;
               break;
            case 205:
               var10000 = 152;
               break;
            case 206:
               var10000 = 91;
               break;
            case 207:
               var10000 = 110;
               break;
            case 208:
               var10000 = 64;
               break;
            case 209:
               var10000 = 41;
               break;
            case 210:
               var10000 = 72;
               break;
            case 211:
               var10000 = 149;
               break;
            case 212:
               var10000 = 103;
               break;
            case 213:
               var10000 = 198;
               break;
            case 214:
               var10000 = 250;
               break;
            case 215:
               var10000 = 225;
               break;
            case 216:
               var10000 = 171;
               break;
            case 217:
               var10000 = 90;
               break;
            case 218:
               var10000 = 40;
               break;
            case 219:
               var10000 = 94;
               break;
            case 220:
               var10000 = 215;
               break;
            case 221:
               var10000 = 56;
               break;
            case 222:
               var10000 = 37;
               break;
            case 223:
               var10000 = 188;
               break;
            case 224:
               var10000 = 133;
               break;
            case 225:
               var10000 = 238;
               break;
            case 226:
               var10000 = 116;
               break;
            case 227:
               var10000 = 214;
               break;
            case 228:
               var10000 = 93;
               break;
            case 229:
               var10000 = 13;
               break;
            case 230:
               var10000 = 44;
               break;
            case 231:
               var10000 = 249;
               break;
            case 232:
               var10000 = 162;
               break;
            case 233:
               var10000 = 208;
               break;
            case 234:
               var10000 = 245;
               break;
            case 235:
               var10000 = 229;
               break;
            case 236:
               var10000 = 145;
               break;
            case 237:
               var10000 = 117;
               break;
            case 238:
               var10000 = 174;
               break;
            case 239:
               var10000 = 113;
               break;
            case 240:
               var10000 = 124;
               break;
            case 241:
               var10000 = 147;
               break;
            case 242:
               var10000 = 118;
               break;
            case 243:
               var10000 = 54;
               break;
            case 244:
               var10000 = 24;
               break;
            case 245:
               var10000 = 16;
               break;
            case 246:
               var10000 = 66;
               break;
            case 247:
               var10000 = 75;
               break;
            case 248:
               var10000 = 241;
               break;
            case 249:
               var10000 = 51;
               break;
            case 250:
               var10000 = 12;
               break;
            case 251:
               var10000 = 169;
               break;
            case 252:
               var10000 = 177;
               break;
            case 253:
               var10000 = 254;
               break;
            case 254:
               var10000 = 27;
               break;
            default:
               var10000 = 85;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28791;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      boolean var5;
      String[] var13 = new String[4];
      int var11 = 0;
      String var10 = "{âÿy\n\u0017À³È\f\u0006\u0093iè\u0003";
      int var12 = "{âÿy\n\u0017À³È\f\u0006\u0093iè\u0003".length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 122;
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
                        var65 = 7;
                        break;
                     case 1:
                        var65 = 70;
                        break;
                     case 2:
                        var65 = 10;
                        break;
                     case 3:
                        var65 = 63;
                        break;
                     case 4:
                        var65 = 113;
                        break;
                     case 5:
                        var65 = 112;
                        break;
                     default:
                        var65 = 30;
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
                     b = new String[4];
                     long var0 = 8029493242380069918L;
                     long[] var6 = new long[24];
                     int var3 = 0;
                     String var4 = "\u0083\nò.ÙFeË\u0089÷ôK\u0010+j\u0017\u009cìØ\twx?\u0000wx`µ¡4\u007fw]ï|S£Û9)w\u0080Ì| Û\\é±/b&°!úÆ<\\ÔV\u0098]}×w\u0015!ý\u009cB\nL\u0095¢åa\u0095Ç@â&\u0017\u0099^\u0095ËèäÏ9PBC\u0018\u0006£@\u0019{Ó¿\u001c]$\u0086\u0083<\u0094\u008e[²\u0090{÷m\u000f~7\u0082ÚÇå ¥ÝHV\u001fÝ\u008b\u0004·\u0094ë'ÉßtË\u0014¿\u0006·ÖÆ?\u009eÄ¯zî¹<ò\u001føÄ¬\u0015gêÄpü*@÷\u008f*w»oò9x8";
                     var5 = "\u0083\nò.ÙFeË\u0089÷ôK\u0010+j\u0017\u009cìØ\twx?\u0000wx`µ¡4\u007fw]ï|S£Û9)w\u0080Ì| Û\\é±/b&°!úÆ<\\ÔV\u0098]}×w\u0015!ý\u009cB\nL\u0095¢åa\u0095Ç@â&\u0017\u0099^\u0095ËèäÏ9PBC\u0018\u0006£@\u0019{Ó¿\u001c]$\u0086\u0083<\u0094\u008e[²\u0090{÷m\u000f~7\u0082ÚÇå ¥ÝHV\u001fÝ\u008b\u0004·\u0094ë'ÉßtË\u0014¿\u0006·ÖÆ?\u009eÄ¯zî¹<ò\u001føÄ¬\u0015gêÄpü*@÷\u008f*w»oò9x8";
                        // [VF] .length();
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
                                    e = new Integer[24];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "\u009dAÌwGº\u000f¤^ªOí3`A+";
                                 var5 = ("\u009dAÌwGº\u000f¤^ªOí3`A+".length()) != 0;
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

                  var10 = "\f\u008að\u0095\nùÐ\u008f+j\u009b¾;¬¨";
                  var12 = "\f\u008að\u0095\nùÐ\u008f+j\u009b¾;¬¨".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 22;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





