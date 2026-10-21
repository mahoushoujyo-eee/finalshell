package com.finalshell.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class C_i_2 implements K_2_2 {
   public final com.finalshell.ui.model.I U;
   public final Fu2_2[] y;
   @C_9
   public final C_U[] W;
   public final List w = new ArrayList();
   public final List Y = new ArrayList();
   @C_9
   public X_3_2 O;
   @C_9
   public Hd2 m;
   public int r;
   public int B;
   public static boolean Z;
   public static int[] u;
   public static String[] a;
   public static String[] b;
   public static long[] j;
   public static Integer[] l;

   public C_i_2(com.finalshell.ui.model.I var1, Fu2_2[] var2, @C_9 C_U[] var3) {
      this.U = var1;
      this.y = var2;
      this.W = var3;
   }

   public void r(X_3_2 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnull 067
      // 009: getfield com/finalshell/core/C_i_2.O Lcom/finalshell/core/X_3_2;
      // 00c: ifnull 061
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 015: athrow
      // 016: aload 1
      // 017: aload 0
      // 018: getfield com/finalshell/core/C_i_2.O Lcom/finalshell/core/X_3_2;
      // 01b: if_acmpeq 061
      // 01e: goto 025
      // 021: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 024: athrow
      // 025: new com/finalshell/core/P_5
      // 028: dup
      // 029: new java/lang/StringBuilder
      // 02c: dup
      // 02d: invokespecial java/lang/StringBuilder.<init> ()V
      // 030: sipush 6756
      // 033: sipush -295
      // 036: invokestatic com/finalshell/core/C_i_2.a (II)Ljava/lang/String;
      // 039: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03c: aload 0
      // 03d: invokevirtual com/finalshell/core/C_i_2.toString ()Ljava/lang/String;
      // 040: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 043: sipush 6757
      // 046: sipush 11241
      // 049: invokestatic com/finalshell/core/C_i_2.a (II)Ljava/lang/String;
      // 04c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04f: aload 0
      // 050: invokevirtual com/finalshell/core/C_i_2.Q ()Lcom/finalshell/ui/model/I;
      // 053: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 056: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 059: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 05c: athrow
      // 05d: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 060: athrow
      // 061: aload 0
      // 062: aload 1
      // 063: putfield com/finalshell/core/C_i_2.O Lcom/finalshell/core/X_3_2;
      // 066: aload 0
      // 067: getfield com/finalshell/core/C_i_2.y [Lcom/finalshell/core/Fu2_2;
      // 06a: astore 3
      // 06b: aload 3
      // 06c: arraylength
      // 06d: istore 4
      // 06f: bipush 0
      // 070: istore 5
      // 072: iload 5
      // 074: iload 4
      // 076: if_icmpge 0b6
      // 079: aload 3
      // 07a: iload 5
      // 07c: aaload
      // 07d: astore 6
      // 07f: aload 2
      // 080: ifnull 137
      // 083: aload 2
      // 084: ifnull 0b2
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 08d: athrow
      // 08e: aload 6
      // 090: instanceof com/finalshell/core/HV_2
      // 093: ifeq 0af
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 09c: athrow
      // 09d: aload 6
      // 09f: checkcast com/finalshell/core/HV_2
      // 0a2: aload 1
      // 0a3: invokeinterface com/finalshell/core/HV_2.d (Lcom/finalshell/core/X_3_2;)V 2
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0ae: athrow
      // 0af: iinc 5 1
      // 0b2: aload 2
      // 0b3: ifnonnull 072
      // 0b6: aload 0
      // 0b7: getfield com/finalshell/core/C_i_2.W [Lcom/finalshell/core/C_U;
      // 0ba: aload 2
      // 0bb: ifnull 0d3
      // 0be: ifnull 137
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield com/finalshell/core/C_i_2.W [Lcom/finalshell/core/C_U;
      // 0cc: goto 0d3
      // 0cf: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0d2: athrow
      // 0d3: astore 3
      // 0d4: aload 3
      // 0d5: arraylength
      // 0d6: istore 4
      // 0d8: bipush 0
      // 0d9: istore 5
      // 0db: iload 5
      // 0dd: iload 4
      // 0df: if_icmpge 137
      // 0e2: aload 3
      // 0e3: iload 5
      // 0e5: aaload
      // 0e6: astore 6
      // 0e8: aload 2
      // 0e9: ifnull 133
      // 0ec: aload 6
      // 0ee: getfield com/finalshell/core/C_U.t [Lcom/finalshell/core/NA_3;
      // 0f1: ifnull 130
      // 0f4: goto 0fb
      // 0f7: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 0fa: athrow
      // 0fb: aload 6
      // 0fd: getfield com/finalshell/core/C_U.t [Lcom/finalshell/core/NA_3;
      // 100: astore 7
      // 102: aload 7
      // 104: arraylength
      // 105: istore 8
      // 107: bipush 0
      // 108: istore 9
      // 10a: iload 9
      // 10c: iload 8
      // 10e: if_icmpge 130
      // 111: aload 7
      // 113: iload 9
      // 115: aaload
      // 116: astore 10
      // 118: aload 10
      // 11a: aload 1
      // 11b: invokevirtual com/finalshell/core/NA_3.n (Lcom/finalshell/core/X_3_2;)V
      // 11e: iinc 9 1
      // 121: aload 2
      // 122: ifnull 133
      // 125: aload 2
      // 126: ifnonnull 10a
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 12f: athrow
      // 130: iinc 5 1
      // 133: aload 2
      // 134: ifnonnull 0db
      // 137: return
   }

   public Fu2_2[] D() {
      return this.y;
   }

   public HV_2[] d$arrhV() {
      return RG_2.h(this.y);
   }

   @C_9
   public C_U[] a() {
      return this.W;
   }

   @Override
   public X_3_2 y() {
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
      // 04: getstatic com/finalshell/core/C_i_2.Z Z
      // 07: ifne 2f
      // 0a: aload 0
      // 0b: getfield com/finalshell/core/C_i_2.O Lcom/finalshell/core/X_3_2;
      // 0e: aload 1
      // 0f: ifnull 33
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 18: athrow
      // 19: ifnonnull 2f
      // 1c: goto 23
      // 1f: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 22: athrow
      // 23: new java/lang/AssertionError
      // 26: dup
      // 27: invokespecial java/lang/AssertionError.<init> ()V
      // 2a: athrow
      // 2b: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield com/finalshell/core/C_i_2.O Lcom/finalshell/core/X_3_2;
      // 33: areturn
   }

   public void x() {
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
      // 05: getfield com/finalshell/core/C_i_2.m Lcom/finalshell/core/Hd2;
      // 08: aload 1
      // 09: ifnull 21
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/C_i_2.m Lcom/finalshell/core/Hd2;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 20: athrow
      // 21: invokevirtual com/finalshell/core/Hd2.R ()V
      // 24: return
   }

   public void T(RW_2 var1) {
      this.Y.add(var1);
      var1.C(this);
   }

   public void O(NS var1) {
      this.w.add(var1);
      var1.C(this);
   }

   @Override
   public Collection L() {
      return this.Y;
   }

   @C_9
   @Override
   public RW_2 J(String param1) {
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
      // 04: getfield com/finalshell/core/C_i_2.Y Ljava/util/List;
      // 07: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c: astore 3
      // 0d: astore 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 49
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast com/finalshell/core/RW_2
      // 20: astore 4
      // 22: aload 4
      // 24: aload 2
      // 25: ifnull 44
      // 28: invokeinterface com/finalshell/core/RW_2.j ()Ljava/lang/String; 1
      // 2d: aload 1
      // 2e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 31: ifeq 45
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 3a: athrow
      // 3b: aload 4
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 43: athrow
      // 44: areturn
      // 45: aload 2
      // 46: ifnonnull 0e
      // 49: aconst_null
      // 4a: areturn
   }

   @C_9
   @Override
   public NS F(String param1) {
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
      // 04: getfield com/finalshell/core/C_i_2.w Ljava/util/List;
      // 07: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c: astore 3
      // 0d: astore 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 47
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast com/finalshell/core/NS
      // 20: astore 4
      // 22: aload 4
      // 24: aload 2
      // 25: ifnull 42
      // 28: getfield com/finalshell/core/NS.P Ljava/lang/String;
      // 2b: aload 1
      // 2c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f: ifeq 43
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 38: athrow
      // 39: aload 4
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/C_i_2.a (Lcom/finalshell/core/P_5;)Lcom/finalshell/core/P_5;
      // 41: athrow
      // 42: areturn
      // 43: aload 2
      // 44: ifnonnull 0e
      // 47: aconst_null
      // 48: areturn
   }

   public List d$List() {
      return this.w;
   }

   @Override
   public String O(String var1) {
      return this.R() + a(3381, 3990255014598064266L) + ++this.B + a(3381, 3990255014598064266L) + var1;
   }

   @Override
   public String M() {
      return this.R() + a(20611, 3028935861198579005L) + ++this.r;
   }

   @Override
   public com.finalshell.ui.model.I Q() {
      return this.U;
   }

   @Override
   public void M(String var1) throws B2_5 {
      throw new B2_5(var1, this.U);
   }

   @Override
   public abstract String toString();

   static {
      __vfClinit__();
   }

   public static void W(int[] var0) {
      u = var0;
   }

   public static int[] q() {
      return u;
   }

   public static P_5 a(P_5 var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 6757) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 43;
               break;
            case 1:
               var10000 = 21;
               break;
            case 2:
               var10000 = 66;
               break;
            case 3:
               var10000 = 171;
               break;
            case 4:
               var10000 = 232;
               break;
            case 5:
               var10000 = 252;
               break;
            case 6:
               var10000 = 163;
               break;
            case 7:
               var10000 = 59;
               break;
            case 8:
               var10000 = 50;
               break;
            case 9:
               var10000 = 247;
               break;
            case 10:
               var10000 = 227;
               break;
            case 11:
               var10000 = 67;
               break;
            case 12:
               var10000 = 146;
               break;
            case 13:
               var10000 = 217;
               break;
            case 14:
               var10000 = 24;
               break;
            case 15:
               var10000 = 228;
               break;
            case 16:
               var10000 = 174;
               break;
            case 17:
               var10000 = 56;
               break;
            case 18:
               var10000 = 185;
               break;
            case 19:
               var10000 = 202;
               break;
            case 20:
               var10000 = 123;
               break;
            case 21:
               var10000 = 195;
               break;
            case 22:
               var10000 = 39;
               break;
            case 23:
               var10000 = 234;
               break;
            case 24:
               var10000 = 13;
               break;
            case 25:
               var10000 = 151;
               break;
            case 26:
               var10000 = 182;
               break;
            case 27:
               var10000 = 213;
               break;
            case 28:
               var10000 = 126;
               break;
            case 29:
               var10000 = 211;
               break;
            case 30:
               var10000 = 238;
               break;
            case 31:
               var10000 = 94;
               break;
            case 32:
               var10000 = 115;
               break;
            case 33:
               var10000 = 26;
               break;
            case 34:
               var10000 = 77;
               break;
            case 35:
               var10000 = 137;
               break;
            case 36:
               var10000 = 192;
               break;
            case 37:
               var10000 = 223;
               break;
            case 38:
               var10000 = 100;
               break;
            case 39:
               var10000 = 34;
               break;
            case 40:
               var10000 = 178;
               break;
            case 41:
               var10000 = 140;
               break;
            case 42:
               var10000 = 212;
               break;
            case 43:
               var10000 = 160;
               break;
            case 44:
               var10000 = 245;
               break;
            case 45:
               var10000 = 177;
               break;
            case 46:
               var10000 = 118;
               break;
            case 47:
               var10000 = 0;
               break;
            case 48:
               var10000 = 141;
               break;
            case 49:
               var10000 = 253;
               break;
            case 50:
               var10000 = 229;
               break;
            case 51:
               var10000 = 201;
               break;
            case 52:
               var10000 = 150;
               break;
            case 53:
               var10000 = 216;
               break;
            case 54:
               var10000 = 153;
               break;
            case 55:
               var10000 = 9;
               break;
            case 56:
               var10000 = 22;
               break;
            case 57:
               var10000 = 80;
               break;
            case 58:
               var10000 = 17;
               break;
            case 59:
               var10000 = 172;
               break;
            case 60:
               var10000 = 142;
               break;
            case 61:
               var10000 = 65;
               break;
            case 62:
               var10000 = 168;
               break;
            case 63:
               var10000 = 154;
               break;
            case 64:
               var10000 = 71;
               break;
            case 65:
               var10000 = 149;
               break;
            case 66:
               var10000 = 62;
               break;
            case 67:
               var10000 = 147;
               break;
            case 68:
               var10000 = 33;
               break;
            case 69:
               var10000 = 121;
               break;
            case 70:
               var10000 = 210;
               break;
            case 71:
               var10000 = 132;
               break;
            case 72:
               var10000 = 166;
               break;
            case 73:
               var10000 = 239;
               break;
            case 74:
               var10000 = 162;
               break;
            case 75:
               var10000 = 237;
               break;
            case 76:
               var10000 = 233;
               break;
            case 77:
               var10000 = 170;
               break;
            case 78:
               var10000 = 5;
               break;
            case 79:
               var10000 = 38;
               break;
            case 80:
               var10000 = 18;
               break;
            case 81:
               var10000 = 28;
               break;
            case 82:
               var10000 = 64;
               break;
            case 83:
               var10000 = 176;
               break;
            case 84:
               var10000 = 197;
               break;
            case 85:
               var10000 = 107;
               break;
            case 86:
               var10000 = 102;
               break;
            case 87:
               var10000 = 188;
               break;
            case 88:
               var10000 = 98;
               break;
            case 89:
               var10000 = 97;
               break;
            case 90:
               var10000 = 19;
               break;
            case 91:
               var10000 = 73;
               break;
            case 92:
               var10000 = 128;
               break;
            case 93:
               var10000 = 91;
               break;
            case 94:
               var10000 = 255;
               break;
            case 95:
               var10000 = 92;
               break;
            case 96:
               var10000 = 209;
               break;
            case 97:
               var10000 = 230;
               break;
            case 98:
               var10000 = 40;
               break;
            case 99:
               var10000 = 117;
               break;
            case 100:
               var10000 = 133;
               break;
            case 101:
               var10000 = 226;
               break;
            case 102:
               var10000 = 3;
               break;
            case 103:
               var10000 = 243;
               break;
            case 104:
               var10000 = 93;
               break;
            case 105:
               var10000 = 103;
               break;
            case 106:
               var10000 = 134;
               break;
            case 107:
               var10000 = 214;
               break;
            case 108:
               var10000 = 220;
               break;
            case 109:
               var10000 = 193;
               break;
            case 110:
               var10000 = 208;
               break;
            case 111:
               var10000 = 16;
               break;
            case 112:
               var10000 = 55;
               break;
            case 113:
               var10000 = 81;
               break;
            case 114:
               var10000 = 88;
               break;
            case 115:
               var10000 = 246;
               break;
            case 116:
               var10000 = 75;
               break;
            case 117:
               var10000 = 54;
               break;
            case 118:
               var10000 = 79;
               break;
            case 119:
               var10000 = 119;
               break;
            case 120:
               var10000 = 145;
               break;
            case 121:
               var10000 = 235;
               break;
            case 122:
               var10000 = 48;
               break;
            case 123:
               var10000 = 76;
               break;
            case 124:
               var10000 = 105;
               break;
            case 125:
               var10000 = 30;
               break;
            case 126:
               var10000 = 89;
               break;
            case 127:
               var10000 = 136;
               break;
            case 128:
               var10000 = 131;
               break;
            case 129:
               var10000 = 69;
               break;
            case 130:
               var10000 = 84;
               break;
            case 131:
               var10000 = 236;
               break;
            case 132:
               var10000 = 157;
               break;
            case 133:
               var10000 = 224;
               break;
            case 134:
               var10000 = 189;
               break;
            case 135:
               var10000 = 6;
               break;
            case 136:
               var10000 = 175;
               break;
            case 137:
               var10000 = 248;
               break;
            case 138:
               var10000 = 23;
               break;
            case 139:
               var10000 = 222;
               break;
            case 140:
               var10000 = 196;
               break;
            case 141:
               var10000 = 215;
               break;
            case 142:
               var10000 = 20;
               break;
            case 143:
               var10000 = 41;
               break;
            case 144:
               var10000 = 113;
               break;
            case 145:
               var10000 = 86;
               break;
            case 146:
               var10000 = 85;
               break;
            case 147:
               var10000 = 130;
               break;
            case 148:
               var10000 = 191;
               break;
            case 149:
               var10000 = 70;
               break;
            case 150:
               var10000 = 120;
               break;
            case 151:
               var10000 = 161;
               break;
            case 152:
               var10000 = 203;
               break;
            case 153:
               var10000 = 187;
               break;
            case 154:
               var10000 = 109;
               break;
            case 155:
               var10000 = 61;
               break;
            case 156:
               var10000 = 106;
               break;
            case 157:
               var10000 = 31;
               break;
            case 158:
               var10000 = 207;
               break;
            case 159:
               var10000 = 4;
               break;
            case 160:
               var10000 = 114;
               break;
            case 161:
               var10000 = 8;
               break;
            case 162:
               var10000 = 10;
               break;
            case 163:
               var10000 = 51;
               break;
            case 164:
               var10000 = 129;
               break;
            case 165:
               var10000 = 204;
               break;
            case 166:
               var10000 = 58;
               break;
            case 167:
               var10000 = 74;
               break;
            case 168:
               var10000 = 96;
               break;
            case 169:
               var10000 = 186;
               break;
            case 170:
               var10000 = 2;
               break;
            case 171:
               var10000 = 52;
               break;
            case 172:
               var10000 = 78;
               break;
            case 173:
               var10000 = 12;
               break;
            case 174:
               var10000 = 47;
               break;
            case 175:
               var10000 = 159;
               break;
            case 176:
               var10000 = 194;
               break;
            case 177:
               var10000 = 181;
               break;
            case 178:
               var10000 = 42;
               break;
            case 179:
               var10000 = 139;
               break;
            case 180:
               var10000 = 101;
               break;
            case 181:
               var10000 = 148;
               break;
            case 182:
               var10000 = 63;
               break;
            case 183:
               var10000 = 138;
               break;
            case 184:
               var10000 = 122;
               break;
            case 185:
               var10000 = 37;
               break;
            case 186:
               var10000 = 7;
               break;
            case 187:
               var10000 = 104;
               break;
            case 188:
               var10000 = 244;
               break;
            case 189:
               var10000 = 49;
               break;
            case 190:
               var10000 = 152;
               break;
            case 191:
               var10000 = 199;
               break;
            case 192:
               var10000 = 144;
               break;
            case 193:
               var10000 = 164;
               break;
            case 194:
               var10000 = 11;
               break;
            case 195:
               var10000 = 15;
               break;
            case 196:
               var10000 = 240;
               break;
            case 197:
               var10000 = 90;
               break;
            case 198:
               var10000 = 124;
               break;
            case 199:
               var10000 = 53;
               break;
            case 200:
               var10000 = 190;
               break;
            case 201:
               var10000 = 14;
               break;
            case 202:
               var10000 = 169;
               break;
            case 203:
               var10000 = 127;
               break;
            case 204:
               var10000 = 82;
               break;
            case 205:
               var10000 = 221;
               break;
            case 206:
               var10000 = 125;
               break;
            case 207:
               var10000 = 112;
               break;
            case 208:
               var10000 = 111;
               break;
            case 209:
               var10000 = 180;
               break;
            case 210:
               var10000 = 184;
               break;
            case 211:
               var10000 = 68;
               break;
            case 212:
               var10000 = 95;
               break;
            case 213:
               var10000 = 57;
               break;
            case 214:
               var10000 = 29;
               break;
            case 215:
               var10000 = 173;
               break;
            case 216:
               var10000 = 44;
               break;
            case 217:
               var10000 = 60;
               break;
            case 218:
               var10000 = 108;
               break;
            case 219:
               var10000 = 219;
               break;
            case 220:
               var10000 = 165;
               break;
            case 221:
               var10000 = 36;
               break;
            case 222:
               var10000 = 46;
               break;
            case 223:
               var10000 = 206;
               break;
            case 224:
               var10000 = 25;
               break;
            case 225:
               var10000 = 251;
               break;
            case 226:
               var10000 = 116;
               break;
            case 227:
               var10000 = 156;
               break;
            case 228:
               var10000 = 143;
               break;
            case 229:
               var10000 = 249;
               break;
            case 230:
               var10000 = 158;
               break;
            case 231:
               var10000 = 167;
               break;
            case 232:
               var10000 = 218;
               break;
            case 233:
               var10000 = 87;
               break;
            case 234:
               var10000 = 242;
               break;
            case 235:
               var10000 = 179;
               break;
            case 236:
               var10000 = 45;
               break;
            case 237:
               var10000 = 225;
               break;
            case 238:
               var10000 = 250;
               break;
            case 239:
               var10000 = 183;
               break;
            case 240:
               var10000 = 83;
               break;
            case 241:
               var10000 = 241;
               break;
            case 242:
               var10000 = 198;
               break;
            case 243:
               var10000 = 254;
               break;
            case 244:
               var10000 = 99;
               break;
            case 245:
               var10000 = 1;
               break;
            case 246:
               var10000 = 27;
               break;
            case 247:
               var10000 = 135;
               break;
            case 248:
               var10000 = 200;
               break;
            case 249:
               var10000 = 205;
               break;
            case 250:
               var10000 = 231;
               break;
            case 251:
               var10000 = 110;
               break;
            case 252:
               var10000 = 32;
               break;
            case 253:
               var10000 = 35;
               break;
            case 254:
               var10000 = 155;
               break;
            default:
               var10000 = 72;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13759;
      if (l[var3] == null) {
         l[var3] = (int)(j[var3] ^ var1);
      }

      return l[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean var17;
      String[] var13 = new String[2];
      int[] var10000 = new int[3];
      int var11 = 0;
      String var10 = "3\u0004,\u0016ê5ÝæxÕm\u0081Êg\u0001\"\u001e\u0001\u0018ÓÀ_õzØ\u009aßH\u0004\u0019ë\u0015\u001c\u000bæsx4F÷æ\u0092ú\u0095ªîQ\u0010\u0085Ü\u0093Î\\8#¶59á";
      int var12 = "3\u0004,\u0016ê5ÝæxÕm\u0081Êg\u0001\"\u001e\u0001\u0018ÓÀ_õzØ\u009aßH\u0004\u0019ë\u0015\u001c\u000bæsx4F÷æ\u0092ú\u0095ªîQ\u0010\u0085Ü\u0093Î\\8#¶59á"
         .length();
      char var9 = 5;
      int var8 = -1;
      W(var10000);

      while (true) {
         char[] var10002;
         label63: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var25 = 74;
            var10002 = var10003;
            int var18 = var10004;
            byte var29;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var29 = 74;
               var10006 = var14;
            } else {
               var25 = 74;
               var18 = var10004;
               if (var10004 <= var14) {
                  break label63;
               }

               var10005 = var10003;
               var29 = 74;
               var10006 = var14;
            }

            while (true) {
               char var42 = var10005[var10006];
               byte var43;
               switch (var14 % 7) {
                  case 0:
                     var43 = 107;
                     break;
                  case 1:
                     var43 = 28;
                     break;
                  case 2:
                     var43 = 35;
                     break;
                  case 3:
                     var43 = 70;
                     break;
                  case 4:
                     var43 = 101;
                     break;
                  case 5:
                     var43 = 98;
                     break;
                  default:
                     var43 = 35;
               }

               var10005[var10006] = (char)(var42 ^ var29 ^ var43);
               var14++;
               if (var25 == 0) {
                  var10006 = var25;
                  var10005 = var10002;
                  var29 = var25;
               } else {
                  if (var18 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var29 = var25;
                  var10006 = var14;
               }
            }
         }

         String var27 = new String(var10002).intern();
         int var20 = -1;
         var13[var11++] = var27;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 820238120486414120L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "Æ´ï\u009cî\u0085\u001f\u0086Æ\u0088½Ú¬ýB1";
            int var5 = "Æ´ï\u009cî\u0085\u001f\u0086Æ\u0088½Ú¬ýB1".length();
            byte var2 = 0;

            do {
               var20 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var20, var2).getBytes("ISO-8859-1");
               var20 = var3++;
               long var33 = (
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
               byte var28 = -1;
               var6[var20] = var33;
            } while (var2 < var5);

            j = var6;
            l = new Integer[2];

            label41: {
               try {
                  if (!RG_2.class.desiredAssertionStatus()) {
                     var17 = true;
                     break label41;
                  }
               } catch (P_5 var15) {
                  throw a(var15);
               }

               var17 = false;
            }

            Z = var17;
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
}





