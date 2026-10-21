package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.EnumSet;
import java.util.Map;

public class Hn2_2 extends F2_4 implements D_4 {
   public static java.lang.Class[] X;
   @C_9
   public Y_5 R;
   public final HO_2 r = new HO_2();
   public String[] S = new String[0];
   public int j = -1;
   public String Z;
   @C_9
   public java.lang.Class P;
   public java.lang.Class[] s;
   @C_9
   public java.lang.Class h;
   public static String[] b;
   public static String[] c;
   public static long d;

   public Hn2_2(String var1) throws B2_5 {
      this.Z = a(-21408, -22790);
      this.s = X;
      this.D(var1);
   }

   public Hn2_2(@C_9 String var1, InputStream var2) throws B2_5, IOException {
      this.Z = a(-21408, -22790);
      this.s = X;
      this.f(var1, var2);
   }

   public Hn2_2(@C_9 String var1, Reader var2) throws B2_5, IOException {
      this.Z = a(-21408, -22790);
      this.s = X;
      this.Y(var1, var2);
   }

   public Hn2_2(Hc2_2 var1, @C_9 ClassLoader var2) throws B2_5, IOException {
      this.Z = a(-21405, 18238);
      this.s = X;
      this.w(var2);
      this.S(var1);
   }

   public Hn2_2(Hc2_2 var1, @C_9 java.lang.Class var2, java.lang.Class[] var3, @C_9 ClassLoader var4) throws B2_5, IOException {
      this.Z = a(-21408, -22790);
      this.s = X;
      this.Q(var2);
      this.P(var3);
      this.w(var4);
      this.S(var1);
   }

   public Hn2_2(Hc2_2 var1, String var2, @C_9 java.lang.Class var3, java.lang.Class[] var4, @C_9 ClassLoader var5) throws B2_5, IOException {
      this.Z = a(-21408, -22790);
      this.s = X;
      this.t(var2);
      this.Q(var3);
      this.P(var4);
      this.w(var5);
      this.S(var1);
   }

   public Hn2_2() {
      this.Z = a(-21408, -22790);
      this.s = X;
   }

   @Override
   public void P(String[] var1) {
      this.S = (String[])var1.clone();
   }

   @Override
   public String[] i() {
      return (String[])this.S.clone();
   }

   @Override
   public void t(String var1) {
      this.Z = var1;
   }

   @Override
   public void Q(@C_9 java.lang.Class var1) {
      this.P = var1;
   }

   @Override
   public void Z(@C_9 java.lang.Class var1) {
      this.Q(var1);
   }

   @Override
   public void P(java.lang.Class[] var1) {
      this.s = var1;
   }

   @Override
   public void Q(java.lang.Class[] var1) {
      this.P(var1);
   }

   @Override
   public void w(@C_9 ClassLoader var1) {
      this.r.C(var1);
   }

   @Override
   public void N(boolean var1, boolean var2, boolean var3) {
      this.r.I(var1, var2, var3);
   }

   @Override
   public void n(int var1) {
      this.r.n(var1);
      this.j = var1;
   }

   @Override
   public void v(int var1) {
      this.r.v(var1);
   }

   @Override
   public void q(@C_9 U_5 var1) {
      this.r.N(var1);
   }

   @Override
   public void t(@C_9 Y_5 var1) {
      this.r.q(var1);
      this.R = var1;
   }

   public EnumSet z() {
      return this.r.A();
   }

   public Hn2_2 p(EnumSet var1) {
      this.r.C(var1);
      return this;
   }

   @Override
   public final void Y(@C_9 String var1, Reader var2) throws B2_5, IOException {
      this.S(new Hc2_2(var1, var2));
   }

   public void S(Hc2_2 var1) throws B2_5, IOException {
      HG var3 = new HG(var1);
      String[] var10000 = RG_2.C();
      var3.Q(this.j);
      FK[] var4 = this.q(var3);
      RD var5 = new RD(var1.F(), var4);
      String[] var2 = var10000;
      C_E_2 var6 = this.X(var1.m(), var5);

      while (true) {
         if (!var3.d(com.finalshell.ui.model.F2_2.END_OF_INPUT)) {
            try {
               var3.j(var6);
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            } catch (B2_5 var7) {
               throw a(var7);
            }
         }

         this.o(var5);
         break;
      }
   }

   void o(RD var1) throws B2_5 {
      this.r.T(var1);

      java.lang.Class var2;
      try {
         var2 = this.r.Y().loadClass(this.Z);
      } catch (ClassNotFoundException var4) {
         throw new P_5(a(-21402, 29328) + this.Z + "'", var4);
      }

      this.h = var2;
   }

   @Override
   public java.lang.Class t() {
      return this.d();
   }

   @Override
   public Map Q() {
      return this.r.Q();
   }

   final FK[] q$FK(@C_9 HG param1) throws B2_5, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 3
      // 08: aload 0
      // 09: getfield com/finalshell/core/Hn2_2.S [Ljava/lang/String;
      // 0c: astore 4
      // 0e: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 11: aload 4
      // 13: arraylength
      // 14: istore 5
      // 16: bipush 0
      // 17: istore 6
      // 19: astore 2
      // 1a: iload 6
      // 1c: iload 5
      // 1e: if_icmpge 7b
      // 21: aload 4
      // 23: iload 6
      // 25: aaload
      // 26: astore 7
      // 28: new com/finalshell/core/HG
      // 2b: dup
      // 2c: new com/finalshell/core/Hc2_2
      // 2f: dup
      // 30: aconst_null
      // 31: new java/io/StringReader
      // 34: dup
      // 35: aload 7
      // 37: invokespecial java/io/StringReader.<init> (Ljava/lang/String;)V
      // 3a: invokespecial com/finalshell/core/Hc2_2.<init> (Ljava/lang/String;Ljava/io/Reader;)V
      // 3d: invokespecial com/finalshell/core/HG.<init> (Lcom/finalshell/core/Hc2_2;)V
      // 40: astore 8
      // 42: aload 8
      // 44: aload 0
      // 45: getfield com/finalshell/core/Hn2_2.j I
      // 48: invokevirtual com/finalshell/core/HG.Q (I)V
      // 4b: aload 8
      // 4d: aload 0
      // 4e: getfield com/finalshell/core/Hn2_2.R Lcom/finalshell/core/Y_5;
      // 51: invokevirtual com/finalshell/core/HG.S (Lcom/finalshell/core/Y_5;)V
      // 54: aload 3
      // 55: aload 8
      // 57: invokevirtual com/finalshell/core/HG.P$fK ()Lcom/finalshell/core/FK;
      // 5a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5f: pop
      // 60: aload 8
      // 62: getstatic com/finalshell/ui/model/F2_2.END_OF_INPUT Lcom/finalshell/ui/model/F2_2;
      // 65: invokevirtual com/finalshell/core/HG.Z (Lcom/finalshell/ui/model/F2_2;)Ljava/lang/String;
      // 68: pop
      // 69: iinc 6 1
      // 6c: aload 2
      // 6d: ifnull bb
      // 70: aload 2
      // 71: ifnonnull 1a
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: aload 1
      // 7c: aload 2
      // 7d: ifnull 8b
      // 80: ifnull bb
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: aload 1
      // 8b: sipush -21406
      // 8e: sipush 24091
      // 91: invokestatic com/finalshell/core/Hn2_2.a (II)Ljava/lang/String;
      // 94: invokevirtual com/finalshell/core/HG.Z (Ljava/lang/String;)Z
      // 97: ifeq bb
      // 9a: aload 3
      // 9b: aload 2
      // 9c: ifnull bc
      // 9f: goto a6
      // a2: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a5: athrow
      // a6: aload 1
      // a7: invokevirtual com/finalshell/core/HG.l$fK ()Lcom/finalshell/core/FK;
      // aa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // af: pop
      // b0: aload 2
      // b1: ifnonnull 8a
      // b4: goto bb
      // b7: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ba: athrow
      // bb: aload 3
      // bc: aload 3
      // bd: invokeinterface java/util/List.size ()I 1
      // c2: anewarray 258
      // c5: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // ca: checkcast [Lcom/finalshell/core/FK;
      // cd: areturn
   }

   protected C_E_2 X(com.finalshell.ui.model.I param1, RD param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/Hn2_2.Z Ljava/lang/String;
      // 07: astore 4
      // 09: astore 3
      // 0a: aload 4
      // 0c: getstatic com/finalshell/core/Hn2_2.d J
      // 0f: l2i
      // 10: invokevirtual java/lang/String.lastIndexOf (I)I
      // 13: istore 5
      // 15: aload 3
      // 16: ifnull 41
      // 19: iload 5
      // 1b: bipush -1
      // 1c: if_icmpeq 4c
      // 1f: goto 26
      // 22: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 2
      // 27: new com/finalshell/core/Rs2
      // 2a: dup
      // 2b: aload 1
      // 2c: aload 4
      // 2e: bipush 0
      // 2f: iload 5
      // 31: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 34: invokespecial com/finalshell/core/Rs2.<init> (Lcom/finalshell/ui/model/I;Ljava/lang/String;)V
      // 37: invokevirtual com/finalshell/core/RD.g (Lcom/finalshell/core/Rs2;)V
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 4
      // 43: iload 5
      // 45: bipush 1
      // 46: iadd
      // 47: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4a: astore 4
      // 4c: new com/finalshell/core/C_E_2
      // 4f: dup
      // 50: aload 1
      // 51: aconst_null
      // 52: bipush 1
      // 53: anewarray 289
      // 56: dup
      // 57: bipush 0
      // 58: new com/finalshell/core/N9_2
      // 5b: dup
      // 5c: sipush -21407
      // 5f: sipush -1073
      // 62: invokestatic com/finalshell/core/Hn2_2.a (II)Ljava/lang/String;
      // 65: aload 1
      // 66: invokespecial com/finalshell/core/N9_2.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 69: aastore
      // 6a: aload 4
      // 6c: aconst_null
      // 6d: aload 0
      // 6e: aload 1
      // 6f: aload 0
      // 70: getfield com/finalshell/core/Hn2_2.P Ljava/lang/Class;
      // 73: invokevirtual com/finalshell/core/Hn2_2.k (Lcom/finalshell/ui/model/I;Ljava/lang/Class;)Lcom/finalshell/core/Nt2_2;
      // 76: aload 0
      // 77: getfield com/finalshell/core/Hn2_2.r Lcom/finalshell/core/HO_2;
      // 7a: aload 1
      // 7b: aload 0
      // 7c: getfield com/finalshell/core/Hn2_2.s [Ljava/lang/Class;
      // 7f: invokevirtual com/finalshell/core/HO_2.J (Lcom/finalshell/ui/model/I;[Ljava/lang/Class;)[Lcom/finalshell/core/Nt2_2;
      // 82: invokespecial com/finalshell/core/C_E_2.<init> (Lcom/finalshell/ui/model/I;Ljava/lang/String;[Lcom/finalshell/core/Fu2_2;Ljava/lang/String;[Lcom/finalshell/core/C_U;Lcom/finalshell/core/Nt2_2;[Lcom/finalshell/core/Nt2_2;)V
      // 85: astore 6
      // 87: aload 2
      // 88: aload 6
      // 8a: invokevirtual com/finalshell/core/RD.Y (Lcom/finalshell/core/C_9_2;)V
      // 8d: aload 6
      // 8f: areturn
   }

   @C_9
   protected Nt2_2 k(com.finalshell.ui.model.I var1, @C_9 java.lang.Class var2) {
      return this.r.D(var1, var2);
   }

   protected Nt2_2 N(com.finalshell.ui.model.I var1, java.lang.Class var2) {
      return this.r.S(var1, var2);
   }

   public Nt2_2[] m(com.finalshell.ui.model.I var1, java.lang.Class[] var2) {
      return this.r.J(var1, var2);
   }

   public java.lang.Class d() {
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
      // 05: getfield com/finalshell/core/Hn2_2.h Ljava/lang/Class;
      // 08: aload 1
      // 09: ifnull 21
      // 0c: ifnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hn2_2.h Ljava/lang/Class;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: areturn
      // 22: new java/lang/IllegalStateException
      // 25: dup
      // 26: sipush -21401
      // 29: sipush 3161
      // 2c: invokestatic com/finalshell/core/Hn2_2.a (II)Ljava/lang/String;
      // 2f: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 32: athrow
   }

   @Override
   public Object c(Reader var1) throws B2_5, IOException {
      this.f(var1);

      try {
         return this.t().newInstance();
      } catch (InstantiationException var4) {
         B2_5 var6 = new B2_5(a(-21403, -7339), null);
         var6.initCause(var4);
         throw var6;
      } catch (IllegalAccessException var5) {
         B2_5 var3 = new B2_5(a(-21404, 16817), null);
         var3.initCause(var5);
         throw var3;
      }
   }

   @Deprecated
   public static Object z(Hc2_2 param0, @C_9 java.lang.Class param1, @C_9 ClassLoader param2) throws B2_5, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: sipush -21408
      // 08: sipush -22790
      // 0b: invokestatic com/finalshell/core/Hn2_2.a (II)Ljava/lang/String;
      // 0e: aload 1
      // 0f: aload 3
      // 10: ifnull 1e
      // 13: ifnull 3a
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 3
      // 1f: ifnull 37
      // 22: invokevirtual java/lang/Class.isInterface ()Z
      // 25: ifne 3a
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 1
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: goto 3b
      // 3a: aconst_null
      // 3b: aload 1
      // 3c: aload 3
      // 3d: ifnull 4b
      // 40: ifnull 6b
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: aload 1
      // 4b: invokevirtual java/lang/Class.isInterface ()Z
      // 4e: aload 3
      // 4f: ifnull 6c
      // 52: ifeq 6b
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: anewarray 326
      // 60: dup
      // 61: bipush 0
      // 62: aload 1
      // 63: aastore
      // 64: goto 6f
      // 67: invokestatic com/finalshell/core/Hn2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: anewarray 326
      // 6f: aload 2
      // 70: invokestatic com/finalshell/core/Hn2_2.Y (Lcom/finalshell/core/Hc2_2;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/lang/Object;
      // 73: areturn
   }

   @Deprecated
   public static Object Y(Hc2_2 var0, String var1, @C_9 java.lang.Class var2, java.lang.Class[] var3, @C_9 ClassLoader var4) throws B2_5, IOException {
      Hn2_2 var5 = new Hn2_2();
      var5.t(var1);
      var5.Q(var2);
      var5.P(var3);
      var5.w(var4);
      var5.S(var0);
      java.lang.Class var6 = var5.t();

      try {
         return var6.newInstance();
      } catch (InstantiationException var8) {
         throw new B2_5(var8.getMessage(), null);
      } catch (IllegalAccessException var9) {
         throw new P_5(var9.toString(), var9);
      }
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -21408) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 208;
               break;
            case 1:
               var10000 = 42;
               break;
            case 2:
               var10000 = 67;
               break;
            case 3:
               var10000 = 61;
               break;
            case 4:
               var10000 = 227;
               break;
            case 5:
               var10000 = 112;
               break;
            case 6:
               var10000 = 137;
               break;
            case 7:
               var10000 = 201;
               break;
            case 8:
               var10000 = 130;
               break;
            case 9:
               var10000 = 8;
               break;
            case 10:
               var10000 = 190;
               break;
            case 11:
               var10000 = 56;
               break;
            case 12:
               var10000 = 19;
               break;
            case 13:
               var10000 = 223;
               break;
            case 14:
               var10000 = 237;
               break;
            case 15:
               var10000 = 73;
               break;
            case 16:
               var10000 = 251;
               break;
            case 17:
               var10000 = 68;
               break;
            case 18:
               var10000 = 0;
               break;
            case 19:
               var10000 = 202;
               break;
            case 20:
               var10000 = 252;
               break;
            case 21:
               var10000 = 144;
               break;
            case 22:
               var10000 = 79;
               break;
            case 23:
               var10000 = 188;
               break;
            case 24:
               var10000 = 209;
               break;
            case 25:
               var10000 = 225;
               break;
            case 26:
               var10000 = 90;
               break;
            case 27:
               var10000 = 28;
               break;
            case 28:
               var10000 = 85;
               break;
            case 29:
               var10000 = 166;
               break;
            case 30:
               var10000 = 121;
               break;
            case 31:
               var10000 = 29;
               break;
            case 32:
               var10000 = 183;
               break;
            case 33:
               var10000 = 46;
               break;
            case 34:
               var10000 = 95;
               break;
            case 35:
               var10000 = 230;
               break;
            case 36:
               var10000 = 108;
               break;
            case 37:
               var10000 = 198;
               break;
            case 38:
               var10000 = 133;
               break;
            case 39:
               var10000 = 205;
               break;
            case 40:
               var10000 = 113;
               break;
            case 41:
               var10000 = 173;
               break;
            case 42:
               var10000 = 247;
               break;
            case 43:
               var10000 = 214;
               break;
            case 44:
               var10000 = 117;
               break;
            case 45:
               var10000 = 139;
               break;
            case 46:
               var10000 = 82;
               break;
            case 47:
               var10000 = 9;
               break;
            case 48:
               var10000 = 59;
               break;
            case 49:
               var10000 = 62;
               break;
            case 50:
               var10000 = 69;
               break;
            case 51:
               var10000 = 192;
               break;
            case 52:
               var10000 = 1;
               break;
            case 53:
               var10000 = 34;
               break;
            case 54:
               var10000 = 229;
               break;
            case 55:
               var10000 = 31;
               break;
            case 56:
               var10000 = 154;
               break;
            case 57:
               var10000 = 143;
               break;
            case 58:
               var10000 = 94;
               break;
            case 59:
               var10000 = 217;
               break;
            case 60:
               var10000 = 5;
               break;
            case 61:
               var10000 = 220;
               break;
            case 62:
               var10000 = 148;
               break;
            case 63:
               var10000 = 254;
               break;
            case 64:
               var10000 = 36;
               break;
            case 65:
               var10000 = 72;
               break;
            case 66:
               var10000 = 248;
               break;
            case 67:
               var10000 = 124;
               break;
            case 68:
               var10000 = 168;
               break;
            case 69:
               var10000 = 41;
               break;
            case 70:
               var10000 = 2;
               break;
            case 71:
               var10000 = 244;
               break;
            case 72:
               var10000 = 63;
               break;
            case 73:
               var10000 = 86;
               break;
            case 74:
               var10000 = 186;
               break;
            case 75:
               var10000 = 218;
               break;
            case 76:
               var10000 = 204;
               break;
            case 77:
               var10000 = 178;
               break;
            case 78:
               var10000 = 17;
               break;
            case 79:
               var10000 = 84;
               break;
            case 80:
               var10000 = 60;
               break;
            case 81:
               var10000 = 76;
               break;
            case 82:
               var10000 = 177;
               break;
            case 83:
               var10000 = 129;
               break;
            case 84:
               var10000 = 92;
               break;
            case 85:
               var10000 = 3;
               break;
            case 86:
               var10000 = 146;
               break;
            case 87:
               var10000 = 87;
               break;
            case 88:
               var10000 = 169;
               break;
            case 89:
               var10000 = 49;
               break;
            case 90:
               var10000 = 25;
               break;
            case 91:
               var10000 = 125;
               break;
            case 92:
               var10000 = 149;
               break;
            case 93:
               var10000 = 30;
               break;
            case 94:
               var10000 = 123;
               break;
            case 95:
               var10000 = 91;
               break;
            case 96:
               var10000 = 158;
               break;
            case 97:
               var10000 = 81;
               break;
            case 98:
               var10000 = 189;
               break;
            case 99:
               var10000 = 232;
               break;
            case 100:
               var10000 = 54;
               break;
            case 101:
               var10000 = 15;
               break;
            case 102:
               var10000 = 77;
               break;
            case 103:
               var10000 = 114;
               break;
            case 104:
               var10000 = 99;
               break;
            case 105:
               var10000 = 203;
               break;
            case 106:
               var10000 = 106;
               break;
            case 107:
               var10000 = 21;
               break;
            case 108:
               var10000 = 18;
               break;
            case 109:
               var10000 = 175;
               break;
            case 110:
               var10000 = 253;
               break;
            case 111:
               var10000 = 187;
               break;
            case 112:
               var10000 = 101;
               break;
            case 113:
               var10000 = 246;
               break;
            case 114:
               var10000 = 184;
               break;
            case 115:
               var10000 = 200;
               break;
            case 116:
               var10000 = 142;
               break;
            case 117:
               var10000 = 127;
               break;
            case 118:
               var10000 = 157;
               break;
            case 119:
               var10000 = 126;
               break;
            case 120:
               var10000 = 213;
               break;
            case 121:
               var10000 = 27;
               break;
            case 122:
               var10000 = 215;
               break;
            case 123:
               var10000 = 51;
               break;
            case 124:
               var10000 = 194;
               break;
            case 125:
               var10000 = 164;
               break;
            case 126:
               var10000 = 136;
               break;
            case 127:
               var10000 = 210;
               break;
            case 128:
               var10000 = 55;
               break;
            case 129:
               var10000 = 219;
               break;
            case 130:
               var10000 = 13;
               break;
            case 131:
               var10000 = 224;
               break;
            case 132:
               var10000 = 107;
               break;
            case 133:
               var10000 = 179;
               break;
            case 134:
               var10000 = 7;
               break;
            case 135:
               var10000 = 33;
               break;
            case 136:
               var10000 = 96;
               break;
            case 137:
               var10000 = 228;
               break;
            case 138:
               var10000 = 211;
               break;
            case 139:
               var10000 = 4;
               break;
            case 140:
               var10000 = 97;
               break;
            case 141:
               var10000 = 122;
               break;
            case 142:
               var10000 = 105;
               break;
            case 143:
               var10000 = 239;
               break;
            case 144:
               var10000 = 150;
               break;
            case 145:
               var10000 = 50;
               break;
            case 146:
               var10000 = 11;
               break;
            case 147:
               var10000 = 250;
               break;
            case 148:
               var10000 = 170;
               break;
            case 149:
               var10000 = 44;
               break;
            case 150:
               var10000 = 231;
               break;
            case 151:
               var10000 = 100;
               break;
            case 152:
               var10000 = 165;
               break;
            case 153:
               var10000 = 71;
               break;
            case 154:
               var10000 = 199;
               break;
            case 155:
               var10000 = 172;
               break;
            case 156:
               var10000 = 145;
               break;
            case 157:
               var10000 = 163;
               break;
            case 158:
               var10000 = 134;
               break;
            case 159:
               var10000 = 38;
               break;
            case 160:
               var10000 = 135;
               break;
            case 161:
               var10000 = 238;
               break;
            case 162:
               var10000 = 151;
               break;
            case 163:
               var10000 = 249;
               break;
            case 164:
               var10000 = 23;
               break;
            case 165:
               var10000 = 131;
               break;
            case 166:
               var10000 = 212;
               break;
            case 167:
               var10000 = 191;
               break;
            case 168:
               var10000 = 160;
               break;
            case 169:
               var10000 = 116;
               break;
            case 170:
               var10000 = 140;
               break;
            case 171:
               var10000 = 222;
               break;
            case 172:
               var10000 = 83;
               break;
            case 173:
               var10000 = 74;
               break;
            case 174:
               var10000 = 162;
               break;
            case 175:
               var10000 = 235;
               break;
            case 176:
               var10000 = 53;
               break;
            case 177:
               var10000 = 109;
               break;
            case 178:
               var10000 = 80;
               break;
            case 179:
               var10000 = 26;
               break;
            case 180:
               var10000 = 58;
               break;
            case 181:
               var10000 = 93;
               break;
            case 182:
               var10000 = 156;
               break;
            case 183:
               var10000 = 221;
               break;
            case 184:
               var10000 = 110;
               break;
            case 185:
               var10000 = 66;
               break;
            case 186:
               var10000 = 153;
               break;
            case 187:
               var10000 = 39;
               break;
            case 188:
               var10000 = 102;
               break;
            case 189:
               var10000 = 45;
               break;
            case 190:
               var10000 = 118;
               break;
            case 191:
               var10000 = 119;
               break;
            case 192:
               var10000 = 245;
               break;
            case 193:
               var10000 = 206;
               break;
            case 194:
               var10000 = 70;
               break;
            case 195:
               var10000 = 43;
               break;
            case 196:
               var10000 = 132;
               break;
            case 197:
               var10000 = 181;
               break;
            case 198:
               var10000 = 104;
               break;
            case 199:
               var10000 = 243;
               break;
            case 200:
               var10000 = 57;
               break;
            case 201:
               var10000 = 10;
               break;
            case 202:
               var10000 = 196;
               break;
            case 203:
               var10000 = 22;
               break;
            case 204:
               var10000 = 197;
               break;
            case 205:
               var10000 = 35;
               break;
            case 206:
               var10000 = 120;
               break;
            case 207:
               var10000 = 242;
               break;
            case 208:
               var10000 = 171;
               break;
            case 209:
               var10000 = 147;
               break;
            case 210:
               var10000 = 6;
               break;
            case 211:
               var10000 = 64;
               break;
            case 212:
               var10000 = 111;
               break;
            case 213:
               var10000 = 75;
               break;
            case 214:
               var10000 = 167;
               break;
            case 215:
               var10000 = 180;
               break;
            case 216:
               var10000 = 193;
               break;
            case 217:
               var10000 = 241;
               break;
            case 218:
               var10000 = 20;
               break;
            case 219:
               var10000 = 176;
               break;
            case 220:
               var10000 = 161;
               break;
            case 221:
               var10000 = 115;
               break;
            case 222:
               var10000 = 152;
               break;
            case 223:
               var10000 = 88;
               break;
            case 224:
               var10000 = 47;
               break;
            case 225:
               var10000 = 236;
               break;
            case 226:
               var10000 = 207;
               break;
            case 227:
               var10000 = 52;
               break;
            case 228:
               var10000 = 185;
               break;
            case 229:
               var10000 = 216;
               break;
            case 230:
               var10000 = 155;
               break;
            case 231:
               var10000 = 128;
               break;
            case 232:
               var10000 = 174;
               break;
            case 233:
               var10000 = 16;
               break;
            case 234:
               var10000 = 195;
               break;
            case 235:
               var10000 = 226;
               break;
            case 236:
               var10000 = 182;
               break;
            case 237:
               var10000 = 24;
               break;
            case 238:
               var10000 = 233;
               break;
            case 239:
               var10000 = 14;
               break;
            case 240:
               var10000 = 98;
               break;
            case 241:
               var10000 = 103;
               break;
            case 242:
               var10000 = 40;
               break;
            case 243:
               var10000 = 240;
               break;
            case 244:
               var10000 = 65;
               break;
            case 245:
               var10000 = 12;
               break;
            case 246:
               var10000 = 37;
               break;
            case 247:
               var10000 = 89;
               break;
            case 248:
               var10000 = 138;
               break;
            case 249:
               var10000 = 159;
               break;
            case 250:
               var10000 = 255;
               break;
            case 251:
               var10000 = 141;
               break;
            case 252:
               var10000 = 48;
               break;
            case 253:
               var10000 = 234;
               break;
            case 254:
               var10000 = 32;
               break;
            default:
               var10000 = 78;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "\u008e`\u0006\u00130Bël{\u0006\u0089Â9\u00adHÇ\u0002at=û}ø°ÖÚÏüW\u009eÂæ~òªù³\u0002T\u0083WT\u0088_G¤=Ç&Äp+2ª\\\u0091ÌaL\u0010¢\u0019é\u0011T/\u008d\u0012\u0081 \u0002³];E`'è§oÜp\bßw3³ßy\u0099Ûsg32rè\u0081\u0018Iºefô\u0096è¸¸\u001bÃ\u000b!u]$çµ¤äþùáþ*ß\u009d©{hÚK¦ýÕ³Î£\u008fõL\u000eò:gaS\u008f\u0004B%\u009a},th2\u0011\nj\"\u007f,ðð÷\u0016\u0080ÑÔ!¾\u0006½\u0007ÎÐ¯(YÊ²A\u0083-X@\u0081êÏîü\u0011{Ñ";
      int var6 = "\u008e`\u0006\u00130Bël{\u0006\u0089Â9\u00adHÇ\u0002at=û}ø°ÖÚÏüW\u009eÂæ~òªù³\u0002T\u0083WT\u0088_G¤=Ç&Äp+2ª\\\u0091ÌaL\u0010¢\u0019é\u0011T/\u008d\u0012\u0081 \u0002³];E`'è§oÜp\bßw3³ßy\u0099Ûsg32rè\u0081\u0018Iºefô\u0096è¸¸\u001bÃ\u000b!u]$çµ¤äþùáþ*ß\u009d©{hÚK¦ýÕ³Î£\u008fõL\u000eò:gaS\u008f\u0004B%\u009a},th2\u0011\nj\"\u007f,ðð÷\u0016\u0080ÑÔ!¾\u0006½\u0007ÎÐ¯(YÊ²A\u0083-X@\u0081êÏîü\u0011{Ñ"
         .length();
      char var3 = 2;
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 115;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
      char[] var23;
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 2;
                        break;
                     case 1:
                        var50 = 8;
                        break;
                     case 2:
                        var50 = 97;
                        break;
                     case 3:
                        var50 = 70;
                        break;
                     case 4:
                        var50 = 82;
                        break;
                     case 5:
                        var50 = 81;
                        break;
                     default:
                        var50 = 44;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     b = var7;
                     c = new String[8];
                     long var0 = 5575544975762966738L;
                     long var27 = -2986097232139204356L ^ var0;
                     byte var18 = -1;
                     d = var27;
                     X = new java.lang.Class[0];
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "X-'$g\\°\u0019L¨\u001dXi\u0088\u0097lãÓ\u008b1~P¬t<¡Çÿá»±/\u00adL%+»L\u0000[@è\u001a`¼^\u0001\u0001!Ù\u009a\u000fýÚ`|\"\u0003ü\u00ad\f\u008döæcð÷\u0016º.àÓ\u0089\u0001\u0089 :\u0080Vß_O\u0007\u0010ºýÁ\f®«=";
                  var6 = "X-'$g\\°\u0019L¨\u001dXi\u0088\u0097lãÓ\u008b1~P¬t<¡Çÿá»±/\u00adL%+»L\u0000[@è\u001a`¼^\u0001\u0001!Ù\u009a\u000fýÚ`|\"\u0003ü\u00ad\f\u008döæcð÷\u0016º.àÓ\u0089\u0001\u0089 :\u0080Vß_O\u0007\u0010ºýÁ\f®«="
                     .length();
                  var3 = '8';
                  var10 = -1;
            }

            var10000 = 81;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





