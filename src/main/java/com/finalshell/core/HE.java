package com.finalshell.core;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;

public class HE extends C2_5{
   public int l = -1;
   @C_9
   public Y_5 E;
   public final HI_2 U = new HI_2();
   public static String[] c;
   public static String[] d;

   public HE(String var1, java.lang.Class var2, String[] var3, java.lang.Class[] var4) throws B2_5 {
      this.U.Z(a(18935, 10670));
      this.U.A(C_5.G);
      this.y(var2);
      this.F(var3, var4);
      this.D(var1);
   }

   public HE(String var1, java.lang.Class var2, String[] var3, java.lang.Class[] var4, java.lang.Class[] var5, @C_9 ClassLoader var6) throws B2_5 {
      this.U.Z(a(18935, 10670));
      this.U.A(C_5.G);
      this.y(var2);
      this.F(var3, var4);
      this.K(var5);
      this.c(var6);
      this.D(var1);
   }

   public HE(
      String var1,
      java.lang.Class var2,
      String[] var3,
      java.lang.Class[] var4,
      java.lang.Class[] var5,
      java.lang.Class var6,
      java.lang.Class[] var7,
      @C_9 ClassLoader var8
   ) throws B2_5 {
      this.U.Z(a(18935, 10670));
      this.U.A(C_5.G);
      this.y(var2);
      this.F(var3, var4);
      this.K(var5);
      this.O(var6);
      this.b(var7);
      this.c(var8);
      this.D(var1);
   }

   public HE(
      Hc2_2 var1,
      String var2,
      @C_9 java.lang.Class var3,
      java.lang.Class[] var4,
      boolean var5,
      java.lang.Class var6,
      String var7,
      String[] var8,
      java.lang.Class[] var9,
      java.lang.Class[] var10,
      @C_9 ClassLoader var11
   ) throws B2_5, IOException {
      this.U.Z(a(18935, 10670));
      this.U.A(C_5.G);
      this.F(var2);
      this.O(var3);
      this.b(var4);
      this.M(var5);
      this.y(var6);
      this.v(var7);
      this.F(var8, var9);
      this.K(var10);
      this.c(var11);
      this.Z(var1);
   }

   public HE() {
      this.U.Z(a(18935, 10670));
      this.U.A(C_5.G);
   }

   public void c(@C_9 ClassLoader var1) {
      this.U.e(var1);
   }

   public void w(boolean var1, boolean var2, boolean var3) {
      this.U.L(var1, var2, var3);
   }

   @Override
   public void n(int var1) {
      this.U.n(var1);
      this.l = var1;
   }

   @Override
   public void v(int var1) {
      this.U.v(var1);
   }

   public void l(@C_9 U_5 var1) {
      this.U.e(var1);
   }

   public void X(@C_9 Y_5 var1) {
      this.U.s(var1);
      this.E = var1;
   }

   public void u(String[] var1) {
      this.U.A(var1);
   }

   public String[] F() {
      return this.U.H();
   }

   public EnumSet G() {
      return this.U.u();
   }

   public HE N(EnumSet var1) {
      this.U.S(var1);
      return this;
   }

   public void E(java.lang.Class var1) {
      this.U.A(var1);
   }

   public java.lang.Class o() {
      return this.U.c();
   }

   public void b(java.lang.Class[] var1) {
      this.U.j(var1);
   }

   public void z(java.lang.Class var1) {
      this.U.J(var1);
   }

   public void y(java.lang.Class var1) {
      this.U.J(var1);
   }

   public void V(java.lang.Class[] var1) {
      this.U.B(var1);
   }

   public void C(boolean var1) {
      this.U.h(var1);
   }

   public void Q(boolean[] var1) {
      this.U.e(var1);
   }

   public void F(String[] var1, java.lang.Class[] var2) {
      this.U.N(var1, var2);
   }

   public void O(String[][] var1, java.lang.Class[][] var2) {
      this.U.Y(var1, var2);
   }

   @Override
   public void F(String var1) {
      this.U.Z(var1);
   }

   @Override
   public void O(@C_9 java.lang.Class var1) {
      this.U.c(var1);
   }

   @Override
   public void M(boolean var1) {
      this.U.Y(var1);
   }

   @Override
   public void W(boolean[] var1) {
      this.U.p(var1);
   }

   @Override
   public void v(String var1) {
      this.U.L(var1);
   }

   @Override
   public void V(String[] var1) {
      this.U.E(var1);
   }

   @Override
   public void K(java.lang.Class[] var1) {
      this.U.I(var1);
   }

   @Override
   public void v(java.lang.Class[][] var1) {
      this.U.q(var1);
   }

   @Override
   public Method Z$Method() {
      return this.U.E();
   }

   @Override
   public Method y(int var1) {
      return this.U.R(var1);
   }

   @Override
   public Method[] l() {
      return this.U.C();
   }

   @Override
   public void Y(@C_9 String var1, Reader var2) throws B2_5, IOException {
      this.Z(new Hc2_2(var1, var2));
   }

   @Override
   public void a(String[] var1, Reader[] var2) throws B2_5, IOException {
      int var4 = var1.length;
      Hc2_2[] var5 = new Hc2_2[var4];
      String[] var10000 = RG_2.C();
      int var6 = 0;
      String[] var3 = var10000;

      while (true) {
         if (var6 < var4) {
            try {
               var5[var6] = new Hc2_2(var1[var6], var2[var6]);
               var6++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            } catch (B2_5 var7) {
               throw a(var7);
            }
         }

         this.n(var5);
         break;
      }
   }

   public final void Z(Hc2_2 var1) throws B2_5, IOException {
      this.n(new Hc2_2[]{var1});
   }

   public final void n(Hc2_2[] var1) throws B2_5, IOException {
      HG[] var3 = new HG[var1.length];
      String[] var10000 = RG_2.C();
      int var4 = 0;
      String[] var2 = var10000;

      while (true) {
         if (var4 < var1.length) {
            try {
               var3[var4] = new HG(var1[var4]);
               var3[var4].Q(this.l);
               var3[var4].S(this.E);
               var4++;
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            } catch (B2_5 var5) {
               throw a(var5);
            }
         }

         this.p(var3);
         break;
      }
   }

   public final void p(HG[] param1) throws B2_5, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: aload 1
      // 004: arraylength
      // 005: istore 3
      // 006: astore 2
      // 007: aload 0
      // 008: getfield com/finalshell/core/HE.U Lcom/finalshell/core/HI_2;
      // 00b: iload 3
      // 00c: invokevirtual com/finalshell/core/HI_2.E (I)V
      // 00f: aload 1
      // 010: aload 2
      // 011: ifnull 028
      // 014: arraylength
      // 015: bipush 1
      // 016: if_icmplt 033
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: aload 1
      // 021: goto 028
      // 024: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: bipush 0
      // 029: aaload
      // 02a: invokevirtual com/finalshell/core/HG.g$hc_2 ()Lcom/finalshell/core/Hc2_2;
      // 02d: invokevirtual com/finalshell/core/Hc2_2.F ()Ljava/lang/String;
      // 030: goto 034
      // 033: aconst_null
      // 034: astore 4
      // 036: aload 0
      // 037: getfield com/finalshell/core/HE.U Lcom/finalshell/core/HI_2;
      // 03a: aload 1
      // 03b: aload 2
      // 03c: ifnull 053
      // 03f: arraylength
      // 040: bipush 1
      // 041: if_icmpne 058
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 1
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: bipush 0
      // 054: aaload
      // 055: goto 059
      // 058: aconst_null
      // 059: invokevirtual com/finalshell/core/HI_2.A (Lcom/finalshell/core/HG;)[Lcom/finalshell/core/FK;
      // 05c: astore 5
      // 05e: iload 3
      // 05f: anewarray 227
      // 062: astore 6
      // 064: iload 3
      // 065: anewarray 229
      // 068: astore 7
      // 06a: bipush 0
      // 06b: istore 8
      // 06d: iload 8
      // 06f: aload 1
      // 070: arraylength
      // 071: if_icmpge 11c
      // 074: aload 0
      // 075: getfield com/finalshell/core/HE.U Lcom/finalshell/core/HI_2;
      // 078: iload 8
      // 07a: invokevirtual com/finalshell/core/HI_2.L (I)Ljava/lang/Class;
      // 07d: astore 9
      // 07f: aload 1
      // 080: iload 8
      // 082: aaload
      // 083: astore 10
      // 085: aload 10
      // 087: invokevirtual com/finalshell/core/HG.V$NV ()Lcom/finalshell/core/NV_2;
      // 08a: astore 11
      // 08c: aload 2
      // 08d: ifnull 12b
      // 090: aload 9
      // 092: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 095: if_acmpne 0ae
      // 098: goto 09f
      // 09b: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: new com/finalshell/core/RY_2
      // 0a2: dup
      // 0a3: aload 11
      // 0a5: invokespecial com/finalshell/core/RY_2.<init> (Lcom/finalshell/core/NV_2;)V
      // 0a8: astore 12
      // 0aa: aload 2
      // 0ab: ifnonnull 0be
      // 0ae: new com/finalshell/core/RC_2
      // 0b1: dup
      // 0b2: aload 10
      // 0b4: invokevirtual com/finalshell/core/HG.C$I ()Lcom/finalshell/ui/model/I;
      // 0b7: aload 11
      // 0b9: invokespecial com/finalshell/core/RC_2.<init> (Lcom/finalshell/ui/model/I;Lcom/finalshell/core/NV_2;)V
      // 0bc: astore 12
      // 0be: aload 10
      // 0c0: getstatic com/finalshell/ui/model/F2_2.END_OF_INPUT Lcom/finalshell/ui/model/F2_2;
      // 0c3: invokevirtual com/finalshell/core/HG.d (Lcom/finalshell/ui/model/F2_2;)Z
      // 0c6: ifne 0fe
      // 0c9: new com/finalshell/core/B2_5
      // 0cc: dup
      // 0cd: new java/lang/StringBuilder
      // 0d0: dup
      // 0d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d4: sipush 18928
      // 0d7: sipush -29689
      // 0da: invokestatic com/finalshell/core/HE.a (II)Ljava/lang/String;
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: aload 10
      // 0e2: invokevirtual com/finalshell/core/HG.M$f1 ()Lcom/finalshell/core/F1;
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e8: ldc_w "\""
      // 0eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f1: aload 10
      // 0f3: invokevirtual com/finalshell/core/HG.C$I ()Lcom/finalshell/ui/model/I;
      // 0f6: invokespecial com/finalshell/core/B2_5.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 0f9: athrow
      // 0fa: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aload 6
      // 100: iload 8
      // 102: bipush 1
      // 103: anewarray 288
      // 106: dup
      // 107: bipush 0
      // 108: aload 12
      // 10a: aastore
      // 10b: aastore
      // 10c: aload 7
      // 10e: iload 8
      // 110: bipush 0
      // 111: anewarray 290
      // 114: aastore
      // 115: iinc 8 1
      // 118: aload 2
      // 119: ifnonnull 06d
      // 11c: aload 0
      // 11d: getfield com/finalshell/core/HE.U Lcom/finalshell/core/HI_2;
      // 120: aload 4
      // 122: aload 5
      // 124: aload 6
      // 126: aload 7
      // 128: invokevirtual com/finalshell/core/HI_2.D (Ljava/lang/String;[Lcom/finalshell/core/FK;[[Lcom/finalshell/core/C_r_2;[[Lcom/finalshell/core/NS;)V
      // 12b: return
   }

   public Nt2_2[] G(com.finalshell.ui.model.I param1, @C_9 java.lang.Class[] param2) {
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
      // 04: aload 2
      // 05: aload 3
      // 06: ifnull 1d
      // 09: ifnonnull 1c
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: bipush 0
      // 14: anewarray 298
      // 17: areturn
      // 18: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 2
      // 1d: arraylength
      // 1e: anewarray 298
      // 21: astore 4
      // 23: bipush 0
      // 24: istore 5
      // 26: iload 5
      // 28: aload 2
      // 29: arraylength
      // 2a: if_icmpge 4d
      // 2d: aload 4
      // 2f: aload 3
      // 30: ifnull 4f
      // 33: iload 5
      // 35: aload 0
      // 36: aload 1
      // 37: aload 2
      // 38: iload 5
      // 3a: aaload
      // 3b: invokevirtual com/finalshell/core/HE.L (Lcom/finalshell/ui/model/I;Ljava/lang/Class;)Lcom/finalshell/core/Nt2_2;
      // 3e: aastore
      // 3f: iinc 5 1
      // 42: aload 3
      // 43: ifnonnull 26
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 4
      // 4f: areturn
   }

   @C_9
   public Nt2_2 l(com.finalshell.ui.model.I var1, @C_9 java.lang.Class var2) {
      return this.U.N(var1, var2);
   }

   public Nt2_2 L(com.finalshell.ui.model.I var1, java.lang.Class var2) {
      return this.U.k(var1, var2);
   }

   @C_9
   @Override
   public Object V(@C_9 Object[] var1) throws InvocationTargetException {
      return this.C(0, var1);
   }

   @C_9
   @Override
   public Object C(int var1, @C_9 Object[] var2) throws InvocationTargetException {
      Method var3 = this.y(var1);

      try {
         return var3.invoke(null, var2);
      } catch (IllegalAccessException var5) {
         throw new P_5(var5.toString(), var5);
      }
   }

   @Override
   public java.lang.Class Z$Class() {
      return this.U.e();
   }

   @Override
   public Map Q() {
      return this.U.Q();
   }

   @Deprecated
   public static Object y(String var0, java.lang.Class var1, String[] var2, @C_9 ClassLoader var3) throws B2_5 {
      try {
         return S(new Hc2_2(null, new StringReader(var0)), a(18933, -31788), null, var1, var2, null);
      } catch (IOException var6) {
         AssertionError var5 = new AssertionError(a(18941, -22561));
         var5.initCause(var6);
         throw var5;
      }
   }

   @Deprecated
   public static Object S(Hc2_2 var0, String var1, @C_9 java.lang.Class var2, java.lang.Class var3, String[] var4, @C_9 ClassLoader var5) throws B2_5, IOException {
      return L(var0, new String[0], var1, var2, var3, var4, var5);
   }

   @Deprecated
   public static Object L(Hc2_2 var0, String[] var1, String var2, @C_9 java.lang.Class var3, java.lang.Class var4, String[] var5, @C_9 ClassLoader var6) throws B2_5, IOException {
      HE var7 = new HE();
      var7.F(var2);
      var7.O(var3);
      var7.u(var1);
      var7.c(var6);
      return var7.Z(var0, var4, var5);
   }

   @Override
   public Object j(Reader var1, java.lang.Class var2, String[] var3) throws B2_5, IOException {
      return this.Z(new Hc2_2(null, var1), var2, var3);
   }

   @Override
   public Object H(String var1, java.lang.Class var2, String[] var3) throws B2_5 {
      try {
         return this.j(new StringReader(var1), var2, var3);
      } catch (IOException var5) {
         throw new P_5(a(18932, 2600), var5);
      }
   }

   public Object Z(Hc2_2 param1, java.lang.Class param2, String[] param3) throws B2_5, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 4
      // 005: aload 2
      // 006: aload 4
      // 008: ifnull 045
      // 00b: invokevirtual java/lang/Class.isInterface ()Z
      // 00e: ifne 044
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: new com/finalshell/core/P_5
      // 01b: dup
      // 01c: new java/lang/StringBuilder
      // 01f: dup
      // 020: invokespecial java/lang/StringBuilder.<init> ()V
      // 023: ldc_w "\""
      // 026: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 029: aload 2
      // 02a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 02d: sipush 18940
      // 030: sipush 9850
      // 033: invokestatic com/finalshell/core/HE.a (II)Ljava/lang/String;
      // 036: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 039: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03c: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 03f: athrow
      // 040: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: aload 2
      // 045: invokevirtual java/lang/Class.getDeclaredMethods ()[Ljava/lang/reflect/Method;
      // 048: astore 6
      // 04a: aload 6
      // 04c: aload 4
      // 04e: ifnull 091
      // 051: arraylength
      // 052: bipush 1
      // 053: if_icmpeq 08f
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: new com/finalshell/core/P_5
      // 060: dup
      // 061: new java/lang/StringBuilder
      // 064: dup
      // 065: invokespecial java/lang/StringBuilder.<init> ()V
      // 068: sipush 18930
      // 06b: sipush -24608
      // 06e: invokestatic com/finalshell/core/HE.a (II)Ljava/lang/String;
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: aload 2
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 078: sipush 18934
      // 07b: sipush 15687
      // 07e: invokestatic com/finalshell/core/HE.a (II)Ljava/lang/String;
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 087: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 08a: athrow
      // 08b: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: aload 6
      // 091: bipush 0
      // 092: aaload
      // 093: astore 5
      // 095: aload 0
      // 096: bipush 1
      // 097: anewarray 369
      // 09a: dup
      // 09b: bipush 0
      // 09c: aload 2
      // 09d: aastore
      // 09e: invokevirtual com/finalshell/core/HE.b ([Ljava/lang/Class;)V
      // 0a1: aload 0
      // 0a2: bipush 1
      // 0a3: invokevirtual com/finalshell/core/HE.C (Z)V
      // 0a6: aload 0
      // 0a7: bipush 0
      // 0a8: invokevirtual com/finalshell/core/HE.M (Z)V
      // 0ab: aload 0
      // 0ac: aload 4
      // 0ae: ifnull 0dd
      // 0b1: instanceof com/finalshell/core/C_5
      // 0b4: ifeq 0d5
      // 0b7: goto 0be
      // 0ba: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: aload 5
      // 0c1: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 0c4: invokeinterface com/finalshell/core/C_5.y (Ljava/lang/Class;)V 2
      // 0c9: aload 4
      // 0cb: ifnonnull 0e5
      // 0ce: goto 0d5
      // 0d1: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: goto 0dd
      // 0d9: invokestatic com/finalshell/core/HE.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 5
      // 0df: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 0e2: invokevirtual com/finalshell/core/HE.y (Ljava/lang/Class;)V
      // 0e5: aload 0
      // 0e6: aload 5
      // 0e8: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 0eb: invokevirtual com/finalshell/core/HE.v (Ljava/lang/String;)V
      // 0ee: aload 0
      // 0ef: aload 3
      // 0f0: aload 5
      // 0f2: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 0f5: invokevirtual com/finalshell/core/HE.F ([Ljava/lang/String;[Ljava/lang/Class;)V
      // 0f8: aload 0
      // 0f9: aload 5
      // 0fb: invokevirtual java/lang/reflect/Method.getExceptionTypes ()[Ljava/lang/Class;
      // 0fe: invokevirtual com/finalshell/core/HE.K ([Ljava/lang/Class;)V
      // 101: aload 0
      // 102: aload 1
      // 103: invokevirtual com/finalshell/core/HE.Z (Lcom/finalshell/core/Hc2_2;)V
      // 106: aload 0
      // 107: invokevirtual com/finalshell/core/HE.Z$Method ()Ljava/lang/reflect/Method;
      // 10a: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 10d: astore 6
      // 10f: aload 6
      // 111: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 114: areturn
      // 115: astore 7
      // 117: new com/finalshell/core/P_5
      // 11a: dup
      // 11b: aload 7
      // 11d: invokevirtual java/lang/InstantiationException.toString ()Ljava/lang/String;
      // 120: aload 7
      // 122: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 125: athrow
      // 126: astore 7
      // 128: new com/finalshell/core/P_5
      // 12b: dup
      // 12c: aload 7
      // 12e: invokevirtual java/lang/IllegalAccessException.toString ()Ljava/lang/String;
      // 131: aload 7
      // 133: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 136: athrow
   }

   public static String[] R(Hc2_2 var0) throws B2_5, IOException {
      String[] var10000 = RG_2.C();
      HG var2 = new HG(var0);
      String[] var1 = var10000;

      while (true) {
         if (var2.Z(a(18929, 29963))) {
            try {
               var7 = var2;
               if (var1 == null) {
                  break;
               }

               var2.l$fK();
               if (var1 != null) {
                  continue;
               }
            } catch (B2_5 var6) {
               throw a(var6);
            }
         }

         var7 = var2;
         break;
      }

      NV_2 var3 = var7.V$NV();

      try {
         if (!var2.d(com.finalshell.ui.model.F2_2.END_OF_INPUT)) {
            throw new B2_5(a(18931, 9524) + var2.M$f1() + "\"", var0.m());
         }
      } catch (B2_5 var5) {
         throw a(var5);
      }

      HashSet var4 = new HashSet();
      new C_x_2_2(var4).U(var3);
      return var4.toArray(new String[var4.size()]);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 18933) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 178;
               break;
            case 1:
               var10000 = 224;
               break;
            case 2:
               var10000 = 227;
               break;
            case 3:
               var10000 = 151;
               break;
            case 4:
               var10000 = 12;
               break;
            case 5:
               var10000 = 166;
               break;
            case 6:
               var10000 = 236;
               break;
            case 7:
               var10000 = 254;
               break;
            case 8:
               var10000 = 243;
               break;
            case 9:
               var10000 = 17;
               break;
            case 10:
               var10000 = 82;
               break;
            case 11:
               var10000 = 108;
               break;
            case 12:
               var10000 = 42;
               break;
            case 13:
               var10000 = 238;
               break;
            case 14:
               var10000 = 199;
               break;
            case 15:
               var10000 = 247;
               break;
            case 16:
               var10000 = 156;
               break;
            case 17:
               var10000 = 252;
               break;
            case 18:
               var10000 = 193;
               break;
            case 19:
               var10000 = 200;
               break;
            case 20:
               var10000 = 179;
               break;
            case 21:
               var10000 = 66;
               break;
            case 22:
               var10000 = 107;
               break;
            case 23:
               var10000 = 140;
               break;
            case 24:
               var10000 = 135;
               break;
            case 25:
               var10000 = 235;
               break;
            case 26:
               var10000 = 16;
               break;
            case 27:
               var10000 = 159;
               break;
            case 28:
               var10000 = 204;
               break;
            case 29:
               var10000 = 248;
               break;
            case 30:
               var10000 = 77;
               break;
            case 31:
               var10000 = 222;
               break;
            case 32:
               var10000 = 59;
               break;
            case 33:
               var10000 = 158;
               break;
            case 34:
               var10000 = 114;
               break;
            case 35:
               var10000 = 117;
               break;
            case 36:
               var10000 = 212;
               break;
            case 37:
               var10000 = 57;
               break;
            case 38:
               var10000 = 186;
               break;
            case 39:
               var10000 = 123;
               break;
            case 40:
               var10000 = 171;
               break;
            case 41:
               var10000 = 229;
               break;
            case 42:
               var10000 = 52;
               break;
            case 43:
               var10000 = 22;
               break;
            case 44:
               var10000 = 163;
               break;
            case 45:
               var10000 = 69;
               break;
            case 46:
               var10000 = 102;
               break;
            case 47:
               var10000 = 175;
               break;
            case 48:
               var10000 = 182;
               break;
            case 49:
               var10000 = 101;
               break;
            case 50:
               var10000 = 13;
               break;
            case 51:
               var10000 = 162;
               break;
            case 52:
               var10000 = 23;
               break;
            case 53:
               var10000 = 32;
               break;
            case 54:
               var10000 = 11;
               break;
            case 55:
               var10000 = 138;
               break;
            case 56:
               var10000 = 189;
               break;
            case 57:
               var10000 = 100;
               break;
            case 58:
               var10000 = 185;
               break;
            case 59:
               var10000 = 93;
               break;
            case 60:
               var10000 = 126;
               break;
            case 61:
               var10000 = 112;
               break;
            case 62:
               var10000 = 70;
               break;
            case 63:
               var10000 = 49;
               break;
            case 64:
               var10000 = 249;
               break;
            case 65:
               var10000 = 219;
               break;
            case 66:
               var10000 = 38;
               break;
            case 67:
               var10000 = 115;
               break;
            case 68:
               var10000 = 37;
               break;
            case 69:
               var10000 = 19;
               break;
            case 70:
               var10000 = 75;
               break;
            case 71:
               var10000 = 210;
               break;
            case 72:
               var10000 = 121;
               break;
            case 73:
               var10000 = 15;
               break;
            case 74:
               var10000 = 223;
               break;
            case 75:
               var10000 = 190;
               break;
            case 76:
               var10000 = 51;
               break;
            case 77:
               var10000 = 231;
               break;
            case 78:
               var10000 = 184;
               break;
            case 79:
               var10000 = 253;
               break;
            case 80:
               var10000 = 81;
               break;
            case 81:
               var10000 = 169;
               break;
            case 82:
               var10000 = 18;
               break;
            case 83:
               var10000 = 97;
               break;
            case 84:
               var10000 = 43;
               break;
            case 85:
               var10000 = 207;
               break;
            case 86:
               var10000 = 76;
               break;
            case 87:
               var10000 = 78;
               break;
            case 88:
               var10000 = 160;
               break;
            case 89:
               var10000 = 234;
               break;
            case 90:
               var10000 = 244;
               break;
            case 91:
               var10000 = 72;
               break;
            case 92:
               var10000 = 208;
               break;
            case 93:
               var10000 = 110;
               break;
            case 94:
               var10000 = 119;
               break;
            case 95:
               var10000 = 214;
               break;
            case 96:
               var10000 = 50;
               break;
            case 97:
               var10000 = 86;
               break;
            case 98:
               var10000 = 141;
               break;
            case 99:
               var10000 = 228;
               break;
            case 100:
               var10000 = 139;
               break;
            case 101:
               var10000 = 61;
               break;
            case 102:
               var10000 = 206;
               break;
            case 103:
               var10000 = 187;
               break;
            case 104:
               var10000 = 188;
               break;
            case 105:
               var10000 = 170;
               break;
            case 106:
               var10000 = 127;
               break;
            case 107:
               var10000 = 67;
               break;
            case 108:
               var10000 = 31;
               break;
            case 109:
               var10000 = 155;
               break;
            case 110:
               var10000 = 88;
               break;
            case 111:
               var10000 = 21;
               break;
            case 112:
               var10000 = 98;
               break;
            case 113:
               var10000 = 245;
               break;
            case 114:
               var10000 = 148;
               break;
            case 115:
               var10000 = 73;
               break;
            case 116:
               var10000 = 198;
               break;
            case 117:
               var10000 = 68;
               break;
            case 118:
               var10000 = 137;
               break;
            case 119:
               var10000 = 183;
               break;
            case 120:
               var10000 = 217;
               break;
            case 121:
               var10000 = 133;
               break;
            case 122:
               var10000 = 39;
               break;
            case 123:
               var10000 = 240;
               break;
            case 124:
               var10000 = 124;
               break;
            case 125:
               var10000 = 90;
               break;
            case 126:
               var10000 = 33;
               break;
            case 127:
               var10000 = 128;
               break;
            case 128:
               var10000 = 25;
               break;
            case 129:
               var10000 = 111;
               break;
            case 130:
               var10000 = 172;
               break;
            case 131:
               var10000 = 134;
               break;
            case 132:
               var10000 = 103;
               break;
            case 133:
               var10000 = 157;
               break;
            case 134:
               var10000 = 29;
               break;
            case 135:
               var10000 = 181;
               break;
            case 136:
               var10000 = 197;
               break;
            case 137:
               var10000 = 216;
               break;
            case 138:
               var10000 = 152;
               break;
            case 139:
               var10000 = 9;
               break;
            case 140:
               var10000 = 14;
               break;
            case 141:
               var10000 = 230;
               break;
            case 142:
               var10000 = 8;
               break;
            case 143:
               var10000 = 205;
               break;
            case 144:
               var10000 = 145;
               break;
            case 145:
               var10000 = 147;
               break;
            case 146:
               var10000 = 226;
               break;
            case 147:
               var10000 = 239;
               break;
            case 148:
               var10000 = 58;
               break;
            case 149:
               var10000 = 233;
               break;
            case 150:
               var10000 = 5;
               break;
            case 151:
               var10000 = 250;
               break;
            case 152:
               var10000 = 71;
               break;
            case 153:
               var10000 = 237;
               break;
            case 154:
               var10000 = 55;
               break;
            case 155:
               var10000 = 80;
               break;
            case 156:
               var10000 = 84;
               break;
            case 157:
               var10000 = 149;
               break;
            case 158:
               var10000 = 1;
               break;
            case 159:
               var10000 = 220;
               break;
            case 160:
               var10000 = 154;
               break;
            case 161:
               var10000 = 24;
               break;
            case 162:
               var10000 = 48;
               break;
            case 163:
               var10000 = 95;
               break;
            case 164:
               var10000 = 65;
               break;
            case 165:
               var10000 = 153;
               break;
            case 166:
               var10000 = 62;
               break;
            case 167:
               var10000 = 89;
               break;
            case 168:
               var10000 = 180;
               break;
            case 169:
               var10000 = 96;
               break;
            case 170:
               var10000 = 116;
               break;
            case 171:
               var10000 = 176;
               break;
            case 172:
               var10000 = 246;
               break;
            case 173:
               var10000 = 45;
               break;
            case 174:
               var10000 = 202;
               break;
            case 175:
               var10000 = 63;
               break;
            case 176:
               var10000 = 94;
               break;
            case 177:
               var10000 = 118;
               break;
            case 178:
               var10000 = 136;
               break;
            case 179:
               var10000 = 209;
               break;
            case 180:
               var10000 = 146;
               break;
            case 181:
               var10000 = 26;
               break;
            case 182:
               var10000 = 225;
               break;
            case 183:
               var10000 = 129;
               break;
            case 184:
               var10000 = 104;
               break;
            case 185:
               var10000 = 164;
               break;
            case 186:
               var10000 = 44;
               break;
            case 187:
               var10000 = 203;
               break;
            case 188:
               var10000 = 122;
               break;
            case 189:
               var10000 = 113;
               break;
            case 190:
               var10000 = 232;
               break;
            case 191:
               var10000 = 105;
               break;
            case 192:
               var10000 = 53;
               break;
            case 193:
               var10000 = 177;
               break;
            case 194:
               var10000 = 106;
               break;
            case 195:
               var10000 = 125;
               break;
            case 196:
               var10000 = 194;
               break;
            case 197:
               var10000 = 131;
               break;
            case 198:
               var10000 = 173;
               break;
            case 199:
               var10000 = 221;
               break;
            case 200:
               var10000 = 92;
               break;
            case 201:
               var10000 = 2;
               break;
            case 202:
               var10000 = 7;
               break;
            case 203:
               var10000 = 64;
               break;
            case 204:
               var10000 = 35;
               break;
            case 205:
               var10000 = 132;
               break;
            case 206:
               var10000 = 211;
               break;
            case 207:
               var10000 = 20;
               break;
            case 208:
               var10000 = 174;
               break;
            case 209:
               var10000 = 213;
               break;
            case 210:
               var10000 = 46;
               break;
            case 211:
               var10000 = 161;
               break;
            case 212:
               var10000 = 251;
               break;
            case 213:
               var10000 = 144;
               break;
            case 214:
               var10000 = 54;
               break;
            case 215:
               var10000 = 99;
               break;
            case 216:
               var10000 = 191;
               break;
            case 217:
               var10000 = 74;
               break;
            case 218:
               var10000 = 28;
               break;
            case 219:
               var10000 = 85;
               break;
            case 220:
               var10000 = 167;
               break;
            case 221:
               var10000 = 165;
               break;
            case 222:
               var10000 = 218;
               break;
            case 223:
               var10000 = 143;
               break;
            case 224:
               var10000 = 215;
               break;
            case 225:
               var10000 = 201;
               break;
            case 226:
               var10000 = 3;
               break;
            case 227:
               var10000 = 120;
               break;
            case 228:
               var10000 = 242;
               break;
            case 229:
               var10000 = 0;
               break;
            case 230:
               var10000 = 40;
               break;
            case 231:
               var10000 = 36;
               break;
            case 232:
               var10000 = 30;
               break;
            case 233:
               var10000 = 79;
               break;
            case 234:
               var10000 = 60;
               break;
            case 235:
               var10000 = 56;
               break;
            case 236:
               var10000 = 83;
               break;
            case 237:
               var10000 = 6;
               break;
            case 238:
               var10000 = 168;
               break;
            case 239:
               var10000 = 150;
               break;
            case 240:
               var10000 = 4;
               break;
            case 241:
               var10000 = 109;
               break;
            case 242:
               var10000 = 87;
               break;
            case 243:
               var10000 = 34;
               break;
            case 244:
               var10000 = 142;
               break;
            case 245:
               var10000 = 241;
               break;
            case 246:
               var10000 = 195;
               break;
            case 247:
               var10000 = 27;
               break;
            case 248:
               var10000 = 41;
               break;
            case 249:
               var10000 = 255;
               break;
            case 250:
               var10000 = 47;
               break;
            case 251:
               var10000 = 130;
               break;
            case 252:
               var10000 = 196;
               break;
            case 253:
               var10000 = 91;
               break;
            case 254:
               var10000 = 10;
               break;
            default:
               var10000 = 192;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var5 = new String[10];
      int var3 = 0;
      String var2 = "Ý$ \u0005;N:\rjç2\u001e\u0018jëµ\u0005ïìB\u0014#gÇ~F\u0097\u0019\u009bí¤\u0006Ì#\u0080\u0002$ó!N \tÖØJ\u001f\u0015WâÌx5\u001ex\u009a\u0098xM\tó`Jþ\u0080r¬Ó\u0016;¨q^\u0006Q\u0095Õ\u009eü\u001a\u0012\u0004êÑ\u0005É\u008d\u001dÎ<\u008cíGÉ@\u001c\u0095¡°\u0012\u0005uñöÍó\u009d\u0001,uïx\u0089§\u0014i /\u000bCý·ú4Ïâò\u0081ºX";
      int var4 = "Ý$ \u0005;N:\rjç2\u001e\u0018jëµ\u0005ïìB\u0014#gÇ~F\u0097\u0019\u009bí¤\u0006Ì#\u0080\u0002$ó!N \tÖØJ\u001f\u0015WâÌx5\u001ex\u009a\u0098xM\tó`Jþ\u0080r¬Ó\u0016;¨q^\u0006Q\u0095Õ\u009eü\u001a\u0012\u0004êÑ\u0005É\u008d\u001dÎ<\u008cíGÉ@\u001c\u0095¡°\u0012\u0005uñöÍó\u009d\u0001,uïx\u0089§\u0014i /\u000bCý·ú4Ïâò\u0081ºX"
         .length();
      char var1 = 2;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 59;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
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
                        var46 = 63;
                        break;
                     case 1:
                        var46 = 101;
                        break;
                     case 2:
                        var46 = 112;
                        break;
                     case 3:
                        var46 = 115;
                        break;
                     case 4:
                        var46 = 24;
                        break;
                     case 5:
                        var46 = 13;
                        break;
                     default:
                        var46 = 102;
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
                     c = var5;
                     d = new String[10];
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

                  var2 = "¬8qPà-PÐâNÿ+\r\u0017ò¤ë\u0017\u001c\r*9ñuåÍxd¾Þ>È\u0015\u0003/®;ñ!F;\u0095=q\u008aÑ(Â<\u0011¡?Èü";
                  var4 = "¬8qPà-PÐâNÿ+\r\u0017ò¤ë\u0017\u001c\r*9ñuåÍxd¾Þ>È\u0015\u0003/®;ñ!F;\u0095=q\u008aÑ(Â<\u0011¡?Èü".length();
                  var1 = ' ';
                  var8 = -1;
            }

            var10000 = 121;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





















