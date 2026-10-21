package com.finalshell.core;

import java.util.Objects;

public class H32_2 extends HP_2 {
   @C_9
   public H4_2[] T;
   public final NS n;
   public final H3_2 i;

   public H32_2(H3_2 var1, Hd2 var2, NS var3) {
   super(var2);
      this.i = var1;
      this.n = var3;
      Objects.requireNonNull(var2);
   }

   public com.finalshell.ui.model.S_3 p$_S() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 08: aload 1
      // 09: ifnull 49
      // 0c: invokevirtual com/finalshell/core/NS.H ()Lcom/finalshell/core/K_2_2;
      // 0f: instanceof com/finalshell/core/C_n_2
      // 12: ifeq 45
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 20: aload 1
      // 21: ifnull 49
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: invokevirtual com/finalshell/core/NS.A ()Lcom/finalshell/ui/model/S_3;
      // 2e: getstatic com/finalshell/ui/model/S_3.DEFAULT Lcom/finalshell/ui/model/S_3;
      // 31: if_acmpne 45
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: getstatic com/finalshell/ui/model/S_3.PUBLIC Lcom/finalshell/ui/model/S_3;
      // 3e: goto 4c
      // 41: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: aload 0
      // 46: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 49: invokevirtual com/finalshell/core/NS.A ()Lcom/finalshell/ui/model/S_3;
      // 4c: areturn
   }

   @Override
   public H4_2[] f() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/H32_2.T [Lcom/finalshell/core/H4_2;
      // 08: aload 1
      // 09: ifnull 32
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/H32_2.T [Lcom/finalshell/core/H4_2;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: getfield com/finalshell/core/H32_2.i Lcom/finalshell/core/H3_2;
      // 24: aload 0
      // 25: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 28: invokevirtual com/finalshell/core/NS.d ()[Lcom/finalshell/core/HV_2;
      // 2b: invokestatic com/finalshell/core/H3_2.R (Lcom/finalshell/core/H3_2;[Lcom/finalshell/core/HV_2;)[Lcom/finalshell/core/H4_2;
      // 2e: dup_x1
      // 2f: putfield com/finalshell/core/H32_2.T [Lcom/finalshell/core/H4_2;
      // 32: areturn
      // 33: astore 2
      // 34: new com/finalshell/core/P_5
      // 37: dup
      // 38: aload 0
      // 39: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 3c: invokevirtual com/finalshell/core/NS.Q ()Lcom/finalshell/ui/model/I;
      // 3f: aconst_null
      // 40: aload 2
      // 41: invokespecial com/finalshell/core/P_5.<init> (Lcom/finalshell/ui/model/I;Ljava/lang/String;Ljava/lang/Throwable;)V
      // 44: athrow
   }

   @Override
   public boolean c() {
      return this.n.t.v;
   }

   @Override
   public Hd2[] d() throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 04: getfield com/finalshell/core/NS.t Lcom/finalshell/core/RJ_2;
      // 07: getfield com/finalshell/core/RJ_2.Q [Lcom/finalshell/core/R9;
      // 0a: astore 2
      // 0b: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 0e: aload 2
      // 0f: arraylength
      // 10: anewarray 102
      // 13: astore 3
      // 14: astore 1
      // 15: bipush 0
      // 16: istore 4
      // 18: iload 4
      // 1a: aload 2
      // 1b: arraylength
      // 1c: if_icmpge 84
      // 1f: aload 0
      // 20: getfield com/finalshell/core/H32_2.i Lcom/finalshell/core/H3_2;
      // 23: aload 2
      // 24: iload 4
      // 26: aaload
      // 27: getfield com/finalshell/core/R9.Y Lcom/finalshell/core/Nt2_2;
      // 2a: invokestatic com/finalshell/core/H3_2.c (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/Nt2_2;)Lcom/finalshell/core/Hd2;
      // 2d: astore 5
      // 2f: aload 1
      // 30: ifnull 80
      // 33: iload 4
      // 35: aload 2
      // 36: arraylength
      // 37: bipush 1
      // 38: isub
      // 39: if_icmpne 77
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 0
      // 44: aload 1
      // 45: ifnull 6a
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 52: getfield com/finalshell/core/NS.t Lcom/finalshell/core/RJ_2;
      // 55: getfield com/finalshell/core/RJ_2.v Z
      // 58: ifeq 77
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: aload 0
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: getfield com/finalshell/core/H32_2.i Lcom/finalshell/core/H3_2;
      // 6d: invokestatic com/finalshell/core/H3_2.Q (Lcom/finalshell/core/H3_2;)Lcom/finalshell/core/C_L;
      // 70: aload 5
      // 72: invokevirtual com/finalshell/core/C_L.h (Lcom/finalshell/core/Hd2;)Lcom/finalshell/core/Hd2;
      // 75: astore 5
      // 77: aload 3
      // 78: iload 4
      // 7a: aload 5
      // 7c: aastore
      // 7d: iinc 4 1
      // 80: aload 1
      // 81: ifnonnull 18
      // 84: aload 3
      // 85: areturn
   }

   @Override
   public Hd2[] S() throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: new java/util/ArrayList
      // 06: dup
      // 07: invokespecial java/util/ArrayList.<init> ()V
      // 0a: astore 2
      // 0b: aload 0
      // 0c: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 0f: getfield com/finalshell/core/NS.g [Lcom/finalshell/core/Nt2_2;
      // 12: astore 3
      // 13: aload 3
      // 14: arraylength
      // 15: istore 4
      // 17: bipush 0
      // 18: istore 5
      // 1a: astore 1
      // 1b: iload 5
      // 1d: iload 4
      // 1f: if_icmpge a6
      // 22: aload 3
      // 23: aload 1
      // 24: ifnull b5
      // 27: iload 5
      // 29: aaload
      // 2a: astore 6
      // 2c: aload 6
      // 2e: instanceof com/finalshell/core/NA_3
      // 31: aload 1
      // 32: ifnull 9e
      // 35: ifeq 88
      // 38: goto 3f
      // 3b: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 6
      // 41: checkcast com/finalshell/core/NA_3
      // 44: getfield com/finalshell/core/NA_3.k [Ljava/lang/String;
      // 47: astore 7
      // 49: aload 7
      // 4b: arraylength
      // 4c: aload 1
      // 4d: ifnull 9e
      // 50: bipush 1
      // 51: if_icmpne 88
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: invokestatic com/finalshell/core/H3_2.F ()Ljava/util/regex/Pattern;
      // 5e: aload 7
      // 60: bipush 0
      // 61: aaload
      // 62: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 65: invokevirtual java/util/regex/Matcher.matches ()Z
      // 68: aload 1
      // 69: ifnull 9e
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: ifeq 88
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c: athrow
      // 7d: aload 1
      // 7e: ifnonnull 9f
      // 81: goto 88
      // 84: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: aload 2
      // 89: aload 0
      // 8a: getfield com/finalshell/core/H32_2.i Lcom/finalshell/core/H3_2;
      // 8d: aload 6
      // 8f: invokestatic com/finalshell/core/H3_2.c (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/Nt2_2;)Lcom/finalshell/core/Hd2;
      // 92: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 97: goto 9e
      // 9a: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: pop
      // 9f: iinc 5 1
      // a2: aload 1
      // a3: ifnonnull 1b
      // a6: aload 2
      // a7: aload 2
      // a8: invokeinterface java/util/List.size ()I 1
      // ad: anewarray 102
      // b0: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // b5: checkcast [Lcom/finalshell/core/Hd2;
      // b8: areturn
   }

   @Override
   public boolean u() {
      return this.n.N();
   }

   @Override
   public boolean F() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 08: invokevirtual com/finalshell/core/NS.H ()Lcom/finalshell/core/K_2_2;
      // 0b: instanceof com/finalshell/core/C_n_2
      // 0e: aload 1
      // 0f: ifnull 65
      // 12: ifeq 57
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 20: invokevirtual com/finalshell/core/NS.R ()Z
      // 23: aload 1
      // 24: ifnull 65
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: ifne 57
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aload 0
      // 39: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 3c: aload 1
      // 3d: ifnull 62
      // 40: goto 47
      // 43: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: invokevirtual com/finalshell/core/NS.A ()Lcom/finalshell/ui/model/S_3;
      // 4a: getstatic com/finalshell/ui/model/S_3.PRIVATE Lcom/finalshell/ui/model/S_3;
      // 4d: if_acmpne 73
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 0
      // 58: getfield com/finalshell/core/H32_2.n Lcom/finalshell/core/NS;
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: invokevirtual com/finalshell/core/NS.y ()Z
      // 65: aload 1
      // 66: ifnull 74
      // 69: ifeq 77
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/H32_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: bipush 1
      // 74: goto 78
      // 77: bipush 0
      // 78: ireturn
   }

   public Hd2 p$hd_2() throws B2_5 {
      return H3_2.T(H3_2.a(this.i, this.n));
   }

   @Override
   public String K() {
      return this.n.P;
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





