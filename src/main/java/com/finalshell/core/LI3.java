package com.finalshell.core;

public abstract class LI3 extends Ls4 {
   public byte[] c;
   public byte[] K;
   public static String[] a;
   public static String[] b;

   public LI3(Xe2 var1, byte[] var2, byte[] var3) {
      super(var1);
      this.c = var2;
      this.K = var3;
   }

   public abstract String y();

   public abstract String Y$String();

   @Override
   public void K(int var1) throws Pc2 {
      try {
         java.lang.Class var2 = java.lang.Class.forName(Xe2.r(b(-4608, 26316))).asSubclass(PA.class);
         PA var3 = (PA)var2.getDeclaredConstructor().newInstance();
         var3.X(this.Y$String(), this.r());
         this.c = var3.K();
         this.K = var3.b();
         Object var5 = null;
      } catch (NoClassDefFoundError | Exception var4) {
         throw new Pc2(var4.toString(), var4);
      }
   }

   public byte[] Y$arrbyte() {
      throw new UnsupportedOperationException();
   }

   @Override
   public byte[] d() {
      throw new UnsupportedOperationException();
   }

   @Override
   public byte[] r$arrbyte() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean I(byte[] param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Dm4.J$boolean ()Z
      // 003: istore 2
      // 004: aload 0
      // 005: getfield com/finalshell/core/LI3.P I
      // 008: bipush 2
      // 009: iload 2
      // 00a: ifne 023
      // 00d: if_icmpeq 031
      // 010: goto 017
      // 013: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield com/finalshell/core/LI3.P I
      // 01b: bipush 5
      // 01c: goto 023
      // 01f: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: iload 2
      // 024: ifne 099
      // 027: if_icmpne 094
      // 02a: goto 031
      // 02d: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: new com/finalshell/core/UJ
      // 034: dup
      // 035: aload 1
      // 036: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 039: astore 3
      // 03a: aload 3
      // 03b: aload 1
      // 03c: arraylength
      // 03d: invokevirtual com/finalshell/core/UJ.S (I)V
      // 040: aload 3
      // 041: bipush 1
      // 042: ldc ""
      // 044: invokevirtual com/finalshell/core/UJ.U (ILjava/lang/String;)[[B
      // 047: astore 4
      // 049: aload 0
      // 04a: aload 4
      // 04c: bipush 0
      // 04d: aaload
      // 04e: putfield com/finalshell/core/LI3.K [B
      // 051: goto 092
      // 054: astore 4
      // 056: aload 0
      // 057: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 05a: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 05d: bipush 3
      // 05e: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 063: iload 2
      // 064: ifne 091
      // 067: ifeq 090
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 0
      // 072: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 075: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 078: bipush 3
      // 079: sipush -4602
      // 07c: sipush 12800
      // 07f: invokestatic com/finalshell/core/LI3.b (II)Ljava/lang/String;
      // 082: aload 4
      // 084: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: bipush 0
      // 091: ireturn
      // 092: bipush 1
      // 093: ireturn
      // 094: aload 0
      // 095: getfield com/finalshell/core/LI3.P I
      // 098: bipush 4
      // 099: iload 2
      // 09a: ifne 155
      // 09d: if_icmpne 145
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: new com/finalshell/core/UJ
      // 0aa: dup
      // 0ab: aload 1
      // 0ac: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 0af: astore 3
      // 0b0: aload 3
      // 0b1: invokevirtual com/finalshell/core/UJ.d ()I
      // 0b4: istore 4
      // 0b6: aload 3
      // 0b7: invokevirtual com/finalshell/core/UJ.d ()I
      // 0ba: istore 5
      // 0bc: iload 4
      // 0be: iload 5
      // 0c0: if_icmpeq 0d8
      // 0c3: new com/finalshell/core/Pc2
      // 0c6: dup
      // 0c7: sipush -4607
      // 0ca: sipush -8525
      // 0cd: invokestatic com/finalshell/core/LI3.b (II)Ljava/lang/String;
      // 0d0: invokespecial com/finalshell/core/Pc2.<init> (Ljava/lang/String;)V
      // 0d3: athrow
      // 0d4: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: aload 3
      // 0d9: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0dc: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 0df: astore 6
      // 0e1: aload 0
      // 0e2: aload 3
      // 0e3: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0e6: putfield com/finalshell/core/LI3.c [B
      // 0e9: aload 3
      // 0ea: invokevirtual com/finalshell/core/UJ.S ()[B
      // 0ed: astore 7
      // 0ef: aload 0
      // 0f0: aload 7
      // 0f2: aload 0
      // 0f3: invokevirtual com/finalshell/core/LI3.r ()I
      // 0f6: invokestatic java/util/Arrays.copyOf ([BI)[B
      // 0f9: putfield com/finalshell/core/LI3.K [B
      // 0fc: aload 0
      // 0fd: aload 3
      // 0fe: invokevirtual com/finalshell/core/UJ.S ()[B
      // 101: invokestatic com/finalshell/core/E8.B ([B)Ljava/lang/String;
      // 104: putfield com/finalshell/core/LI3.m Ljava/lang/String;
      // 107: bipush 1
      // 108: ireturn
      // 109: astore 3
      // 10a: aload 0
      // 10b: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 10e: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 111: bipush 3
      // 112: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 117: iload 2
      // 118: ifne 144
      // 11b: ifeq 143
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: aload 0
      // 126: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 129: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 12c: bipush 3
      // 12d: sipush -4603
      // 130: sipush -7728
      // 133: invokestatic com/finalshell/core/LI3.b (II)Ljava/lang/String;
      // 136: aload 3
      // 137: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 13c: goto 143
      // 13f: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: bipush 0
      // 144: ireturn
      // 145: aload 0
      // 146: getfield com/finalshell/core/LI3.P I
      // 149: iload 2
      // 14a: ifne 1ee
      // 14d: bipush 3
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: if_icmpne 1e1
      // 158: sipush -4601
      // 15b: sipush -11231
      // 15e: invokestatic com/finalshell/core/LI3.b (II)Ljava/lang/String;
      // 161: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 164: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 167: ldc com/finalshell/core/PA
      // 169: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 16c: astore 3
      // 16d: aload 3
      // 16e: bipush 0
      // 16f: anewarray 41
      // 172: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 175: bipush 0
      // 176: anewarray 57
      // 179: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 17c: checkcast com/finalshell/core/PA
      // 17f: astore 4
      // 181: aload 4
      // 183: aload 0
      // 184: invokevirtual com/finalshell/core/LI3.Y$String ()Ljava/lang/String;
      // 187: aload 1
      // 188: invokeinterface com/finalshell/core/PA.k (Ljava/lang/String;[B)V 3
      // 18d: aload 0
      // 18e: aload 4
      // 190: invokeinterface com/finalshell/core/PA.K ()[B 1
      // 195: putfield com/finalshell/core/LI3.c [B
      // 198: aload 0
      // 199: aload 4
      // 19b: invokeinterface com/finalshell/core/PA.b ()[B 1
      // 1a0: putfield com/finalshell/core/LI3.K [B
      // 1a3: bipush 1
      // 1a4: ireturn
      // 1a5: astore 3
      // 1a6: aload 0
      // 1a7: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 1aa: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 1ad: bipush 3
      // 1ae: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1b3: iload 2
      // 1b4: ifne 1e0
      // 1b7: ifeq 1df
      // 1ba: goto 1c1
      // 1bd: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 1c5: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 1c8: bipush 3
      // 1c9: sipush -4603
      // 1cc: sipush -7728
      // 1cf: invokestatic com/finalshell/core/LI3.b (II)Ljava/lang/String;
      // 1d2: aload 3
      // 1d3: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // 1d8: goto 1df
      // 1db: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: bipush 0
      // 1e0: ireturn
      // 1e1: aload 0
      // 1e2: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 1e5: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 1e8: bipush 3
      // 1e9: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 1ee: iload 2
      // 1ef: ifne 21a
      // 1f2: ifeq 219
      // 1f5: goto 1fc
      // 1f8: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fb: athrow
      // 1fc: aload 0
      // 1fd: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 200: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 203: bipush 3
      // 204: sipush -4603
      // 207: sipush -7728
      // 20a: invokestatic com/finalshell/core/LI3.b (II)Ljava/lang/String;
      // 20d: invokeinterface com/finalshell/core/GN.t (ILjava/lang/String;)V 3
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 218: athrow
      // 219: bipush 0
      // 21a: ireturn
   }

   @Override
   public byte[] O() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: aload 0
      // 04: invokespecial com/finalshell/core/Ls4.O ()[B
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 22
      // 0e: ifnull 1e
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 2
      // 19: areturn
      // 1a: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield com/finalshell/core/LI3.c [B
      // 22: ifnonnull 2b
      // 25: aconst_null
      // 26: areturn
      // 27: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: bipush 2
      // 2c: anewarray 175
      // 2f: astore 3
      // 30: aload 3
      // 31: bipush 0
      // 32: aload 0
      // 33: invokevirtual com/finalshell/core/LI3.A ()[B
      // 36: aastore
      // 37: aload 3
      // 38: bipush 1
      // 39: aload 0
      // 3a: getfield com/finalshell/core/LI3.c [B
      // 3d: aastore
      // 3e: aload 3
      // 3f: invokestatic com/finalshell/core/UJ.h ([[B)Lcom/finalshell/core/UJ;
      // 42: getfield com/finalshell/core/UJ.g [B
      // 45: areturn
   }

   @Override
   public byte[] A() {
      return E8.J(this.y());
   }

   @Override
   public byte[] l(byte[] var1) {
      return this.e(var1, this.y());
   }

   @Override
   public byte[] e(byte[] param1, String param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 3
      // 04: aload 2
      // 05: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 08: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0b: ldc com/finalshell/core/Wt2_2
      // 0d: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 10: astore 4
      // 12: aload 4
      // 14: bipush 0
      // 15: anewarray 41
      // 18: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 1b: bipush 0
      // 1c: anewarray 57
      // 1f: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 22: checkcast com/finalshell/core/Wt2_2
      // 25: astore 5
      // 27: aload 5
      // 29: invokeinterface com/finalshell/core/Wt2_2.k ()V 1
      // 2e: aload 5
      // 30: aload 0
      // 31: getfield com/finalshell/core/LI3.K [B
      // 34: invokeinterface com/finalshell/core/Wt2_2.Z ([B)V 2
      // 39: aload 5
      // 3b: aload 1
      // 3c: invokeinterface com/finalshell/core/Wt2_2.d ([B)V 2
      // 41: aload 5
      // 43: invokeinterface com/finalshell/core/Wt2_2.k ()[B 1
      // 48: astore 6
      // 4a: bipush 2
      // 4b: anewarray 175
      // 4e: astore 7
      // 50: aload 7
      // 52: bipush 0
      // 53: aload 2
      // 54: invokestatic com/finalshell/core/E8.J (Ljava/lang/String;)[B
      // 57: aastore
      // 58: aload 7
      // 5a: bipush 1
      // 5b: aload 6
      // 5d: aastore
      // 5e: aload 7
      // 60: invokestatic com/finalshell/core/UJ.h ([[B)Lcom/finalshell/core/UJ;
      // 63: getfield com/finalshell/core/UJ.g [B
      // 66: areturn
      // 67: astore 4
      // 69: aload 0
      // 6a: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 6d: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 70: bipush 3
      // 71: iload 3
      // 72: ifeq 93
      // 75: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 7a: ifeq a3
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: aload 0
      // 85: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 88: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 8b: bipush 3
      // 8c: goto 93
      // 8f: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92: athrow
      // 93: sipush -4606
      // 96: sipush 1439
      // 99: invokestatic com/finalshell/core/LI3.b (II)Ljava/lang/String;
      // 9c: aload 4
      // 9e: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // a3: aconst_null
      // a4: areturn
   }

   @Override
   public Al2 R() {
      return this.a$al_2(this.y());
   }

   @Override
   public Al2 a$al_2(String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Dm4.F$boolean ()Z
      // 03: istore 2
      // 04: aload 1
      // 05: invokestatic com/finalshell/core/Xe2.r (Ljava/lang/String;)Ljava/lang/String;
      // 08: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 0b: ldc com/finalshell/core/Wt2_2
      // 0d: invokevirtual java/lang/Class.asSubclass (Ljava/lang/Class;)Ljava/lang/Class;
      // 10: astore 3
      // 11: aload 3
      // 12: bipush 0
      // 13: anewarray 41
      // 16: invokevirtual java/lang/Class.getDeclaredConstructor ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      // 19: bipush 0
      // 1a: anewarray 57
      // 1d: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 20: checkcast com/finalshell/core/Wt2_2
      // 23: astore 4
      // 25: aload 4
      // 27: invokeinterface com/finalshell/core/Wt2_2.k ()V 1
      // 2c: iload 2
      // 2d: ifeq 73
      // 30: aload 0
      // 31: getfield com/finalshell/core/LI3.c [B
      // 34: ifnonnull 68
      // 37: goto 3e
      // 3a: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: invokevirtual com/finalshell/core/LI3.O ()[B
      // 42: ifnull 68
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: new com/finalshell/core/UJ
      // 4f: dup
      // 50: aload 0
      // 51: invokevirtual com/finalshell/core/LI3.O ()[B
      // 54: invokespecial com/finalshell/core/UJ.<init> ([B)V
      // 57: astore 5
      // 59: aload 5
      // 5b: invokevirtual com/finalshell/core/UJ.S ()[B
      // 5e: pop
      // 5f: aload 0
      // 60: aload 5
      // 62: invokevirtual com/finalshell/core/UJ.S ()[B
      // 65: putfield com/finalshell/core/LI3.c [B
      // 68: aload 4
      // 6a: aload 0
      // 6b: getfield com/finalshell/core/LI3.c [B
      // 6e: invokeinterface com/finalshell/core/Wt2_2.v ([B)V 2
      // 73: aload 4
      // 75: areturn
      // 76: astore 3
      // 77: aload 0
      // 78: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 7b: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 7e: bipush 3
      // 7f: iload 2
      // 80: ifeq a1
      // 83: invokeinterface com/finalshell/core/GN.K (I)Z 2
      // 88: ifeq b0
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: aload 0
      // 93: getfield com/finalshell/core/LI3.Q Lcom/finalshell/core/Xe2;
      // 96: invokevirtual com/finalshell/core/Xe2.p ()Lcom/finalshell/core/GN;
      // 99: bipush 3
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/LI3.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0: athrow
      // a1: sipush -4605
      // a4: sipush 12592
      // a7: invokestatic com/finalshell/core/LI3.b (II)Ljava/lang/String;
      // aa: aload 3
      // ab: invokeinterface com/finalshell/core/GN.c (ILjava/lang/String;Ljava/lang/Throwable;)V 4
      // b0: aconst_null
      // b1: areturn
   }

   @Override
   public byte[] T$arrbyte() throws Pc2 {
      try {
         if (this.t()) {
            throw new Pc2(b(-4604, -26905));
         }
      } catch (Pc2 var4) {
         throw b(var4);
      }

      UJ var1 = new UJ();
      var1.q(this.A());
      var1.q(this.c);
      byte[] var2 = new byte[this.K.length + this.c.length];
      System.arraycopy(this.K, 0, var2, 0, this.K.length);
      System.arraycopy(this.c, 0, var2, this.K.length, this.c.length);
      var1.q(var2);
      var1.q(E8.J(this.m));
      byte[] var3 = new byte[var1.P()];
      var1.G(var3, 0, var3.length);
      return var3;
   }

   @Override
   public void a$void() {
      super.a$void();
      E8.Q(this.K);
   }

   public static Exception b(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -4603) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 26;
               break;
            case 1:
               var10000 = 28;
               break;
            case 2:
               var10000 = 204;
               break;
            case 3:
               var10000 = 41;
               break;
            case 4:
               var10000 = 65;
               break;
            case 5:
               var10000 = 52;
               break;
            case 6:
               var10000 = 105;
               break;
            case 7:
               var10000 = 171;
               break;
            case 8:
               var10000 = 98;
               break;
            case 9:
               var10000 = 223;
               break;
            case 10:
               var10000 = 147;
               break;
            case 11:
               var10000 = 240;
               break;
            case 12:
               var10000 = 205;
               break;
            case 13:
               var10000 = 232;
               break;
            case 14:
               var10000 = 231;
               break;
            case 15:
               var10000 = 224;
               break;
            case 16:
               var10000 = 220;
               break;
            case 17:
               var10000 = 159;
               break;
            case 18:
               var10000 = 85;
               break;
            case 19:
               var10000 = 148;
               break;
            case 20:
               var10000 = 168;
               break;
            case 21:
               var10000 = 72;
               break;
            case 22:
               var10000 = 244;
               break;
            case 23:
               var10000 = 7;
               break;
            case 24:
               var10000 = 63;
               break;
            case 25:
               var10000 = 114;
               break;
            case 26:
               var10000 = 37;
               break;
            case 27:
               var10000 = 141;
               break;
            case 28:
               var10000 = 115;
               break;
            case 29:
               var10000 = 53;
               break;
            case 30:
               var10000 = 44;
               break;
            case 31:
               var10000 = 186;
               break;
            case 32:
               var10000 = 93;
               break;
            case 33:
               var10000 = 67;
               break;
            case 34:
               var10000 = 17;
               break;
            case 35:
               var10000 = 107;
               break;
            case 36:
               var10000 = 237;
               break;
            case 37:
               var10000 = 138;
               break;
            case 38:
               var10000 = 38;
               break;
            case 39:
               var10000 = 54;
               break;
            case 40:
               var10000 = 104;
               break;
            case 41:
               var10000 = 145;
               break;
            case 42:
               var10000 = 173;
               break;
            case 43:
               var10000 = 170;
               break;
            case 44:
               var10000 = 39;
               break;
            case 45:
               var10000 = 241;
               break;
            case 46:
               var10000 = 172;
               break;
            case 47:
               var10000 = 191;
               break;
            case 48:
               var10000 = 197;
               break;
            case 49:
               var10000 = 66;
               break;
            case 50:
               var10000 = 142;
               break;
            case 51:
               var10000 = 225;
               break;
            case 52:
               var10000 = 253;
               break;
            case 53:
               var10000 = 212;
               break;
            case 54:
               var10000 = 201;
               break;
            case 55:
               var10000 = 238;
               break;
            case 56:
               var10000 = 1;
               break;
            case 57:
               var10000 = 48;
               break;
            case 58:
               var10000 = 25;
               break;
            case 59:
               var10000 = 219;
               break;
            case 60:
               var10000 = 121;
               break;
            case 61:
               var10000 = 227;
               break;
            case 62:
               var10000 = 216;
               break;
            case 63:
               var10000 = 155;
               break;
            case 64:
               var10000 = 30;
               break;
            case 65:
               var10000 = 50;
               break;
            case 66:
               var10000 = 89;
               break;
            case 67:
               var10000 = 130;
               break;
            case 68:
               var10000 = 222;
               break;
            case 69:
               var10000 = 157;
               break;
            case 70:
               var10000 = 95;
               break;
            case 71:
               var10000 = 250;
               break;
            case 72:
               var10000 = 8;
               break;
            case 73:
               var10000 = 252;
               break;
            case 74:
               var10000 = 139;
               break;
            case 75:
               var10000 = 113;
               break;
            case 76:
               var10000 = 94;
               break;
            case 77:
               var10000 = 246;
               break;
            case 78:
               var10000 = 45;
               break;
            case 79:
               var10000 = 15;
               break;
            case 80:
               var10000 = 75;
               break;
            case 81:
               var10000 = 92;
               break;
            case 82:
               var10000 = 154;
               break;
            case 83:
               var10000 = 61;
               break;
            case 84:
               var10000 = 70;
               break;
            case 85:
               var10000 = 255;
               break;
            case 86:
               var10000 = 29;
               break;
            case 87:
               var10000 = 217;
               break;
            case 88:
               var10000 = 83;
               break;
            case 89:
               var10000 = 36;
               break;
            case 90:
               var10000 = 180;
               break;
            case 91:
               var10000 = 215;
               break;
            case 92:
               var10000 = 58;
               break;
            case 93:
               var10000 = 78;
               break;
            case 94:
               var10000 = 108;
               break;
            case 95:
               var10000 = 118;
               break;
            case 96:
               var10000 = 106;
               break;
            case 97:
               var10000 = 137;
               break;
            case 98:
               var10000 = 236;
               break;
            case 99:
               var10000 = 5;
               break;
            case 100:
               var10000 = 51;
               break;
            case 101:
               var10000 = 152;
               break;
            case 102:
               var10000 = 11;
               break;
            case 103:
               var10000 = 46;
               break;
            case 104:
               var10000 = 156;
               break;
            case 105:
               var10000 = 239;
               break;
            case 106:
               var10000 = 109;
               break;
            case 107:
               var10000 = 144;
               break;
            case 108:
               var10000 = 249;
               break;
            case 109:
               var10000 = 127;
               break;
            case 110:
               var10000 = 135;
               break;
            case 111:
               var10000 = 40;
               break;
            case 112:
               var10000 = 42;
               break;
            case 113:
               var10000 = 86;
               break;
            case 114:
               var10000 = 199;
               break;
            case 115:
               var10000 = 80;
               break;
            case 116:
               var10000 = 177;
               break;
            case 117:
               var10000 = 43;
               break;
            case 118:
               var10000 = 181;
               break;
            case 119:
               var10000 = 243;
               break;
            case 120:
               var10000 = 163;
               break;
            case 121:
               var10000 = 210;
               break;
            case 122:
               var10000 = 192;
               break;
            case 123:
               var10000 = 209;
               break;
            case 124:
               var10000 = 116;
               break;
            case 125:
               var10000 = 69;
               break;
            case 126:
               var10000 = 207;
               break;
            case 127:
               var10000 = 202;
               break;
            case 128:
               var10000 = 112;
               break;
            case 129:
               var10000 = 160;
               break;
            case 130:
               var10000 = 185;
               break;
            case 131:
               var10000 = 221;
               break;
            case 132:
               var10000 = 203;
               break;
            case 133:
               var10000 = 247;
               break;
            case 134:
               var10000 = 230;
               break;
            case 135:
               var10000 = 193;
               break;
            case 136:
               var10000 = 31;
               break;
            case 137:
               var10000 = 35;
               break;
            case 138:
               var10000 = 234;
               break;
            case 139:
               var10000 = 183;
               break;
            case 140:
               var10000 = 140;
               break;
            case 141:
               var10000 = 149;
               break;
            case 142:
               var10000 = 60;
               break;
            case 143:
               var10000 = 233;
               break;
            case 144:
               var10000 = 179;
               break;
            case 145:
               var10000 = 245;
               break;
            case 146:
               var10000 = 165;
               break;
            case 147:
               var10000 = 2;
               break;
            case 148:
               var10000 = 84;
               break;
            case 149:
               var10000 = 218;
               break;
            case 150:
               var10000 = 187;
               break;
            case 151:
               var10000 = 123;
               break;
            case 152:
               var10000 = 134;
               break;
            case 153:
               var10000 = 153;
               break;
            case 154:
               var10000 = 13;
               break;
            case 155:
               var10000 = 251;
               break;
            case 156:
               var10000 = 254;
               break;
            case 157:
               var10000 = 158;
               break;
            case 158:
               var10000 = 21;
               break;
            case 159:
               var10000 = 150;
               break;
            case 160:
               var10000 = 194;
               break;
            case 161:
               var10000 = 81;
               break;
            case 162:
               var10000 = 55;
               break;
            case 163:
               var10000 = 213;
               break;
            case 164:
               var10000 = 242;
               break;
            case 165:
               var10000 = 77;
               break;
            case 166:
               var10000 = 161;
               break;
            case 167:
               var10000 = 111;
               break;
            case 168:
               var10000 = 164;
               break;
            case 169:
               var10000 = 169;
               break;
            case 170:
               var10000 = 117;
               break;
            case 171:
               var10000 = 0;
               break;
            case 172:
               var10000 = 211;
               break;
            case 173:
               var10000 = 99;
               break;
            case 174:
               var10000 = 200;
               break;
            case 175:
               var10000 = 188;
               break;
            case 176:
               var10000 = 131;
               break;
            case 177:
               var10000 = 184;
               break;
            case 178:
               var10000 = 214;
               break;
            case 179:
               var10000 = 101;
               break;
            case 180:
               var10000 = 9;
               break;
            case 181:
               var10000 = 196;
               break;
            case 182:
               var10000 = 122;
               break;
            case 183:
               var10000 = 76;
               break;
            case 184:
               var10000 = 33;
               break;
            case 185:
               var10000 = 47;
               break;
            case 186:
               var10000 = 32;
               break;
            case 187:
               var10000 = 96;
               break;
            case 188:
               var10000 = 228;
               break;
            case 189:
               var10000 = 90;
               break;
            case 190:
               var10000 = 124;
               break;
            case 191:
               var10000 = 198;
               break;
            case 192:
               var10000 = 102;
               break;
            case 193:
               var10000 = 68;
               break;
            case 194:
               var10000 = 74;
               break;
            case 195:
               var10000 = 97;
               break;
            case 196:
               var10000 = 49;
               break;
            case 197:
               var10000 = 34;
               break;
            case 198:
               var10000 = 23;
               break;
            case 199:
               var10000 = 82;
               break;
            case 200:
               var10000 = 195;
               break;
            case 201:
               var10000 = 143;
               break;
            case 202:
               var10000 = 162;
               break;
            case 203:
               var10000 = 64;
               break;
            case 204:
               var10000 = 128;
               break;
            case 205:
               var10000 = 18;
               break;
            case 206:
               var10000 = 20;
               break;
            case 207:
               var10000 = 189;
               break;
            case 208:
               var10000 = 190;
               break;
            case 209:
               var10000 = 166;
               break;
            case 210:
               var10000 = 146;
               break;
            case 211:
               var10000 = 12;
               break;
            case 212:
               var10000 = 151;
               break;
            case 213:
               var10000 = 73;
               break;
            case 214:
               var10000 = 167;
               break;
            case 215:
               var10000 = 136;
               break;
            case 216:
               var10000 = 229;
               break;
            case 217:
               var10000 = 126;
               break;
            case 218:
               var10000 = 248;
               break;
            case 219:
               var10000 = 59;
               break;
            case 220:
               var10000 = 79;
               break;
            case 221:
               var10000 = 22;
               break;
            case 222:
               var10000 = 100;
               break;
            case 223:
               var10000 = 6;
               break;
            case 224:
               var10000 = 16;
               break;
            case 225:
               var10000 = 57;
               break;
            case 226:
               var10000 = 110;
               break;
            case 227:
               var10000 = 56;
               break;
            case 228:
               var10000 = 88;
               break;
            case 229:
               var10000 = 208;
               break;
            case 230:
               var10000 = 3;
               break;
            case 231:
               var10000 = 24;
               break;
            case 232:
               var10000 = 174;
               break;
            case 233:
               var10000 = 120;
               break;
            case 234:
               var10000 = 10;
               break;
            case 235:
               var10000 = 91;
               break;
            case 236:
               var10000 = 62;
               break;
            case 237:
               var10000 = 226;
               break;
            case 238:
               var10000 = 19;
               break;
            case 239:
               var10000 = 103;
               break;
            case 240:
               var10000 = 206;
               break;
            case 241:
               var10000 = 133;
               break;
            case 242:
               var10000 = 132;
               break;
            case 243:
               var10000 = 178;
               break;
            case 244:
               var10000 = 175;
               break;
            case 245:
               var10000 = 125;
               break;
            case 246:
               var10000 = 27;
               break;
            case 247:
               var10000 = 71;
               break;
            case 248:
               var10000 = 176;
               break;
            case 249:
               var10000 = 235;
               break;
            case 250:
               var10000 = 119;
               break;
            case 251:
               var10000 = 4;
               break;
            case 252:
               var10000 = 182;
               break;
            case 253:
               var10000 = 14;
               break;
            case 254:
               var10000 = 87;
               break;
            default:
               var10000 = 129;
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
      String[] var5 = new String[8];
      int var3 = 0;
      String var2 = "/qè²\f\u0088ê\u0080ü\u0004ÐõM\u0002ý\u0097Ó\u000e5\u0011Ã4ÉÒ6V ¿¤\u0093ø4\b&\u0017°Ë\u001c©\u0092\u0084V\u0097\u0086OþZô`k\u0091*n]±\u0001L^ÇîÆ¿êj\u009dF\u0013cZa×=$Ì\u00158¶H£^È\u009fÎ\u009f%¼\f\u000fqE\u0095:Æ¥\u0090\u009dý/\n\u0010úZîOÚ¥æ\u009aox·ù\"\u0010Òa";
      int var4 = "/qè²\f\u0088ê\u0080ü\u0004ÐõM\u0002ý\u0097Ó\u000e5\u0011Ã4ÉÒ6V ¿¤\u0093ø4\b&\u0017°Ë\u001c©\u0092\u0084V\u0097\u0086OþZô`k\u0091*n]±\u0001L^ÇîÆ¿êj\u009dF\u0013cZa×=$Ì\u00158¶H£^È\u009fÎ\u009f%¼\f\u000fqE\u0095:Æ¥\u0090\u009dý/\n\u0010úZîOÚ¥æ\u009aox·ù\"\u0010Òa"
         .length();
      char var1 = 19;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 97;
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
                        var46 = 70;
                        break;
                     case 1:
                        var46 = 14;
                        break;
                     case 2:
                        var46 = 75;
                        break;
                     case 3:
                        var46 = 49;
                        break;
                     case 4:
                        var46 = 20;
                        break;
                     case 5:
                        var46 = 48;
                        break;
                     default:
                        var46 = 77;
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
                     b = new String[8];
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

                  var2 = "h&ä¼i\u00ad¢À\u0011è\u009a\u009f\u0086È\u0084?`\u0001\u0099Uõ\u0019\u009dÆÜ\u001cÕ|S÷\u009fÄ|íÊMå<æMä\u000fþ\u0090Ñ\u0017\u0011q\u0006îN1þþ";
                  var4 = "h&ä¼i\u00ad¢À\u0011è\u009a\u009f\u0086È\u0084?`\u0001\u0099Uõ\u0019\u009dÆÜ\u001cÕ|S÷\u009fÄ|íÊMå<æMä\u000fþ\u0090Ñ\u0017\u0011q\u0006îN1þþ"
                     .length();
                  var1 = 25;
                  var8 = -1;
            }

            var10000 = 44;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





