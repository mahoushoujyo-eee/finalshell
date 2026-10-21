package com.finalshell.core;

import java.util.Collection;

public class Hg2_2 extends Hd2 {
   @C_9
   public Hd2[] q;
   public static boolean U;
   public final C_i_2 J;
   public final K_2_2 P;
   public final H3_2 j;
   public static String[] a;
   public static String[] c;

   public Hg2_2(H3_2 var1, C_i_2 var2, K_2_2 var3) {
      this.j = var1;
      this.J = var2;
      this.P = var3;
   }

   @Override
   public C_J[] V$arr_J() throws B2_5 {
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
      // 05: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 08: aload 1
      // 09: ifnull 26
      // 0c: instanceof com/finalshell/core/C_Y_2
      // 0f: ifne 22
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: bipush 0
      // 1a: anewarray 47
      // 1d: areturn
      // 1e: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 26: checkcast com/finalshell/core/C_Y_2
      // 29: astore 2
      // 2a: aload 2
      // 2b: invokeinterface com/finalshell/core/C_Y_2.a ()[Lcom/finalshell/core/C_U; 1
      // 30: astore 3
      // 31: aload 3
      // 32: aload 1
      // 33: ifnull 4a
      // 36: ifnonnull 49
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: bipush 0
      // 41: anewarray 47
      // 44: areturn
      // 45: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: aload 3
      // 4a: arraylength
      // 4b: anewarray 47
      // 4e: astore 4
      // 50: bipush 0
      // 51: istore 5
      // 53: iload 5
      // 55: aload 4
      // 57: arraylength
      // 58: if_icmpge fc
      // 5b: aload 3
      // 5c: iload 5
      // 5e: aaload
      // 5f: astore 6
      // 61: aload 6
      // 63: getfield com/finalshell/core/C_U.t [Lcom/finalshell/core/NA_3;
      // 66: aload 1
      // 67: ifnull 81
      // 6a: ifnonnull 7c
      // 6d: goto 74
      // 70: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: bipush 0
      // 75: goto 82
      // 78: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: aload 6
      // 7e: getfield com/finalshell/core/C_U.t [Lcom/finalshell/core/NA_3;
      // 81: arraylength
      // 82: anewarray 58
      // 85: astore 7
      // 87: bipush 0
      // 88: istore 8
      // 8a: iload 8
      // 8c: aload 7
      // 8e: arraylength
      // 8f: if_icmpge e4
      // 92: aload 0
      // 93: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 96: aload 6
      // 98: getfield com/finalshell/core/C_U.t [Lcom/finalshell/core/NA_3;
      // 9b: iload 8
      // 9d: aaload
      // 9e: invokestatic com/finalshell/core/H3_2.v (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/Nt2_2;)Lcom/finalshell/core/Q4_3;
      // a1: astore 9
      // a3: aload 1
      // a4: ifnull e0
      // a7: getstatic com/finalshell/core/Hg2_2.U Z
      // aa: aload 1
      // ab: ifnull 55
      // ae: goto b5
      // b1: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b4: athrow
      // b5: ifne d3
      // b8: aload 9
      // ba: instanceof com/finalshell/core/C_f_2
      // bd: ifne d3
      // c0: goto c7
      // c3: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c6: athrow
      // c7: new java/lang/AssertionError
      // ca: dup
      // cb: invokespecial java/lang/AssertionError.<init> ()V
      // ce: athrow
      // cf: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d2: athrow
      // d3: aload 7
      // d5: iload 8
      // d7: aload 9
      // d9: checkcast com/finalshell/core/C_f_2
      // dc: aastore
      // dd: iinc 8 1
      // e0: aload 1
      // e1: ifnonnull 8a
      // e4: aload 4
      // e6: iload 5
      // e8: new com/finalshell/core/C32_3
      // eb: dup
      // ec: aload 0
      // ed: aload 6
      // ef: aload 7
      // f1: invokespecial com/finalshell/core/C32_3.<init> (Lcom/finalshell/core/Hg2_2;Lcom/finalshell/core/C_U;[Lcom/finalshell/core/C_f_2;)V
      // f4: aastore
      // f5: iinc 5 1
      // f8: aload 1
      // f9: ifnonnull 53
      // fc: aload 4
      // fe: areturn
   }

   @Override
   public HP_2[] H() {
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
      // 07: aload 0
      // 08: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 0b: invokevirtual com/finalshell/core/C_i_2.d$List ()Ljava/util/List;
      // 0e: invokeinterface java/util/List.size ()I 1
      // 13: invokespecial java/util/ArrayList.<init> (I)V
      // 16: astore 2
      // 17: astore 1
      // 18: aload 0
      // 19: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 1c: invokevirtual com/finalshell/core/C_i_2.d$List ()Ljava/util/List;
      // 1f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 24: astore 3
      // 25: aload 3
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 58
      // 2e: aload 3
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast com/finalshell/core/NS
      // 37: astore 4
      // 39: aload 2
      // 3a: aload 0
      // 3b: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 3e: aload 4
      // 40: invokevirtual com/finalshell/core/H3_2.Y (Lcom/finalshell/core/NS;)Lcom/finalshell/core/HP_2;
      // 43: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 48: pop
      // 49: aload 1
      // 4a: ifnull 92
      // 4d: aload 1
      // 4e: ifnonnull 25
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/finalshell/core/Hg2_2.P Lcom/finalshell/core/K_2_2;
      // 5c: instanceof com/finalshell/core/K3_4
      // 5f: aload 1
      // 60: ifnull 91
      // 63: ifeq 92
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 2
      // 6e: new com/finalshell/core/HQ_2
      // 71: dup
      // 72: aload 0
      // 73: invokespecial com/finalshell/core/HQ_2.<init> (Lcom/finalshell/core/Hg2_2;)V
      // 76: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7b: pop
      // 7c: aload 2
      // 7d: new com/finalshell/core/Hf2_2
      // 80: dup
      // 81: aload 0
      // 82: invokespecial com/finalshell/core/Hf2_2.<init> (Lcom/finalshell/core/Hg2_2;)V
      // 85: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8a: goto 91
      // 8d: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: pop
      // 92: aload 2
      // 93: aload 2
      // 94: invokeinterface java/util/List.size ()I 1
      // 99: anewarray 131
      // 9c: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // a1: checkcast [Lcom/finalshell/core/HP_2;
      // a4: areturn
   }

   @Override
   public Hd2[] j$arrhd_2() {
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
      // 05: aload 1
      // 06: ifnull 20
      // 09: getfield com/finalshell/core/Hg2_2.q [Lcom/finalshell/core/Hd2;
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hg2_2.q [Lcom/finalshell/core/Hd2;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Hg2_2.P Lcom/finalshell/core/K_2_2;
      // 23: invokeinterface com/finalshell/core/K_2_2.L ()Ljava/util/Collection; 1
      // 28: astore 2
      // 29: aload 2
      // 2a: invokeinterface java/util/Collection.size ()I 1
      // 2f: anewarray 4
      // 32: astore 3
      // 33: bipush 0
      // 34: istore 4
      // 36: aload 2
      // 37: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 3c: astore 5
      // 3e: aload 5
      // 40: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 45: ifeq 73
      // 48: aload 5
      // 4a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4f: checkcast com/finalshell/core/RW_2
      // 52: astore 6
      // 54: aload 3
      // 55: aload 1
      // 56: ifnull 79
      // 59: iload 4
      // 5b: iinc 4 1
      // 5e: aload 0
      // 5f: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 62: aload 6
      // 64: invokestatic com/finalshell/core/H3_2.e (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/K_2_2;)Lcom/finalshell/core/Hd2;
      // 67: aastore
      // 68: aload 1
      // 69: ifnonnull 3e
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: aload 0
      // 74: aload 3
      // 75: dup_x1
      // 76: putfield com/finalshell/core/Hg2_2.q [Lcom/finalshell/core/Hd2;
      // 79: areturn
   }

   @C_9
   @Override
   public Hd2 V$hd_2() {
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
      // 04: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 2
      // 0a: instanceof com/finalshell/core/FW_2
      // 0d: ifne 33
      // 10: aload 2
      // 11: aload 1
      // 12: ifnull 2e
      // 15: instanceof com/finalshell/core/RD
      // 18: ifeq 28
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aconst_null
      // 23: areturn
      // 24: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 2
      // 29: invokeinterface com/finalshell/core/X_3_2.y ()Lcom/finalshell/core/X_3_2; 1
      // 2e: astore 2
      // 2f: aload 1
      // 30: ifnonnull 09
      // 33: aload 0
      // 34: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 37: aload 2
      // 38: invokeinterface com/finalshell/core/X_3_2.y ()Lcom/finalshell/core/X_3_2; 1
      // 3d: checkcast com/finalshell/core/C_i_2
      // 40: invokestatic com/finalshell/core/H3_2.e (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/K_2_2;)Lcom/finalshell/core/Hd2;
      // 43: areturn
   }

   @C_9
   @Override
   public Hd2 l$hd_2() {
      C_i_2 var1 = (C_i_2)H3_2.V$K_2(this.J);

      try {
         if (var1 == null) {
            return null;
         }
      } catch (P_5 var2) {
         throw a(var2);
      }

      return H3_2.e(this.j, var1);
   }

   @Override
   public String J() {
      return F0_2.n(this.J.R());
   }

   @Override
   public boolean q() {
      return false;
   }

   @Override
   public Hd2 G() {
      throw new P_5(this.P.Q(), b(-18572, -13878));
   }

   @Override
   public boolean o() {
      return false;
   }

   @Override
   public boolean p$boolean() {
      return false;
   }

   @Override
   public Hv2_2[] C() {
      String[] var1 = RG_2.C();

      label49: {
         try {
            byte var10000 = (this.J instanceof C_q_2_2) ? 1 : 0;
            if (var1 == null) {
               return new Hv2_2[var10000];
            }

            if (var10000 != 0) {
               break label49;
            }
         } catch (P_5 var7) {
            throw a(var7);
         }

         return new Hv2_2[0];
      }

      C_q_2_2 var2 = (C_q_2_2)this.J;
      NU_3[] var3 = var2.z();
      Hv2_2[] var4 = new Hv2_2[var3.length];
      int var5 = 0;

      Hv2_2[] var8;
      while (true) {
         if (var5 < var3.length) {
            try {
               var8 = var4;
               if (var1 == null) {
                  break;
               }

               var4[var5] = this.j.Z$hv_2(var3[var5]);
               var5++;
               if (var1 != null) {
                  continue;
               }
            } catch (P_5 var6) {
               throw a(var6);
            }
         }

         var8 = var4;
         break;
      }

      return var8;
   }

   @Override
   public U3_3[] A$arru_3() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 008: instanceof com/finalshell/core/C_q_2_2
      // 00b: aload 1
      // 00c: ifnull 125
      // 00f: ifeq 113
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 01d: checkcast com/finalshell/core/C_q_2_2
      // 020: astore 2
      // 021: new java/util/ArrayList
      // 024: dup
      // 025: invokespecial java/util/ArrayList.<init> ()V
      // 028: astore 3
      // 029: aload 2
      // 02a: getfield com/finalshell/core/C_q_2_2.I Ljava/util/List;
      // 02d: ldc com/finalshell/core/RF
      // 02f: invokestatic com/finalshell/core/F3_3.L (Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/lang/Iterable;
      // 032: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 037: astore 4
      // 039: aload 4
      // 03b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 040: ifeq 071
      // 043: aload 4
      // 045: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04a: checkcast com/finalshell/core/RF
      // 04d: astore 5
      // 04f: aload 3
      // 050: aload 0
      // 051: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 054: aload 5
      // 056: invokestatic com/finalshell/core/H3_2.N (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/RF;)[Lcom/finalshell/core/U3_3;
      // 059: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 05c: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 061: pop
      // 062: aload 1
      // 063: ifnull 100
      // 066: aload 1
      // 067: ifnonnull 039
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 0
      // 072: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 075: aload 1
      // 076: ifnull 091
      // 079: instanceof com/finalshell/core/K3_4
      // 07c: ifeq 100
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: aload 0
      // 087: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 08a: goto 091
      // 08d: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: checkcast com/finalshell/core/K3_4
      // 094: astore 4
      // 096: aload 4
      // 098: invokeinterface com/finalshell/core/K3_4.N ()Ljava/util/List; 1
      // 09d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a2: astore 5
      // 0a4: aload 5
      // 0a6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ab: ifeq 100
      // 0ae: aload 5
      // 0b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b5: checkcast com/finalshell/core/C_B_2
      // 0b8: astore 6
      // 0ba: aload 3
      // 0bb: aload 1
      // 0bc: ifnull 101
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 0c3: aload 4
      // 0c5: bipush 0
      // 0c6: anewarray 248
      // 0c9: getstatic com/finalshell/ui/model/S_3.PUBLIC Lcom/finalshell/ui/model/S_3;
      // 0cc: bipush 1
      // 0cd: bipush 1
      // 0ce: new com/finalshell/core/NH_2
      // 0d1: dup
      // 0d2: aload 4
      // 0d4: invokeinterface com/finalshell/core/K3_4.Q ()Lcom/finalshell/ui/model/I; 1
      // 0d9: aload 0
      // 0da: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 0dd: aload 4
      // 0df: invokestatic com/finalshell/core/H3_2.e (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/K_2_2;)Lcom/finalshell/core/Hd2;
      // 0e2: invokespecial com/finalshell/core/NH_2.<init> (Lcom/finalshell/ui/model/I;Lcom/finalshell/core/Q4_3;)V
      // 0e5: bipush 0
      // 0e6: aload 6
      // 0e8: getfield com/finalshell/core/C_B_2.f Ljava/lang/String;
      // 0eb: aconst_null
      // 0ec: invokestatic com/finalshell/core/H3_2.E (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/K_2_2;[Lcom/finalshell/core/HV_2;Lcom/finalshell/ui/model/S_3;ZZLcom/finalshell/core/Nt2_2;ILjava/lang/String;Lcom/finalshell/core/M3_2;)Lcom/finalshell/core/U3_3;
      // 0ef: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f4: pop
      // 0f5: aload 1
      // 0f6: ifnonnull 0a4
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: aload 3
      // 101: aload 3
      // 102: invokeinterface java/util/List.size ()I 1
      // 107: anewarray 270
      // 10a: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 10f: checkcast [Lcom/finalshell/core/U3_3;
      // 112: areturn
      // 113: aload 0
      // 114: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 117: aload 1
      // 118: ifnull 133
      // 11b: instanceof com/finalshell/core/C_n_2
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: ifeq 19a
      // 128: aload 0
      // 129: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: checkcast com/finalshell/core/C_n_2
      // 136: astore 2
      // 137: new java/util/ArrayList
      // 13a: dup
      // 13b: invokespecial java/util/ArrayList.<init> ()V
      // 13e: astore 3
      // 13f: aload 2
      // 140: getfield com/finalshell/core/C_n_2.Q Ljava/util/List;
      // 143: ldc com/finalshell/core/RF
      // 145: invokestatic com/finalshell/core/F3_3.L (Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/lang/Iterable;
      // 148: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 14d: astore 4
      // 14f: aload 4
      // 151: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 156: ifeq 187
      // 159: aload 4
      // 15b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 160: checkcast com/finalshell/core/RF
      // 163: astore 5
      // 165: aload 3
      // 166: aload 0
      // 167: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 16a: aload 5
      // 16c: invokestatic com/finalshell/core/H3_2.N (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/RF;)[Lcom/finalshell/core/U3_3;
      // 16f: aload 1
      // 170: ifnull 191
      // 173: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 176: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 17b: pop
      // 17c: aload 1
      // 17d: ifnonnull 14f
      // 180: goto 187
      // 183: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: aload 3
      // 188: aload 3
      // 189: invokeinterface java/util/List.size ()I 1
      // 18e: anewarray 270
      // 191: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 196: checkcast [Lcom/finalshell/core/U3_3;
      // 199: areturn
      // 19a: new com/finalshell/core/P_5
      // 19d: dup
      // 19e: aload 0
      // 19f: getfield com/finalshell/core/Hg2_2.P Lcom/finalshell/core/K_2_2;
      // 1a2: invokeinterface com/finalshell/core/K_2_2.Q ()Lcom/finalshell/ui/model/I; 1
      // 1a7: sipush -18575
      // 1aa: sipush 32705
      // 1ad: invokestatic com/finalshell/core/Hg2_2.b (II)Ljava/lang/String;
      // 1b0: invokespecial com/finalshell/core/P_5.<init> (Lcom/finalshell/ui/model/I;Ljava/lang/String;)V
      // 1b3: athrow
   }

   @Override
   public U3_3[] I() {
      String[] var1 = RG_2.C();

      label27: {
         try {
            byte var10000 = (this.J instanceof C_q_2_2) ? 1 : 0;
            if (var1 == null) {
               return new U3_3[var10000];
            }

            if (var10000 != 0) {
               break label27;
            }
         } catch (P_5 var3) {
            throw a(var3);
         }

         return new U3_3[0];
      }

      Collection var2 = ((C_q_2_2)this.J).E.values();
      return var2.toArray(new U3_3[var2.size()]);
   }

   @C_9
   @Override
   public Hd2 g() throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 008: instanceof com/finalshell/core/K3_4
      // 00b: aload 1
      // 00c: ifnull 02f
      // 00f: ifeq 028
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 01d: invokestatic com/finalshell/core/H3_2.Q (Lcom/finalshell/core/H3_2;)Lcom/finalshell/core/C_L;
      // 020: getfield com/finalshell/core/C_L.b Lcom/finalshell/core/Hd2;
      // 023: areturn
      // 024: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: aload 0
      // 029: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 02c: instanceof com/finalshell/core/C_h_2_2
      // 02f: aload 1
      // 030: ifnull 089
      // 033: ifeq 077
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: aload 0
      // 03e: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 041: aload 0
      // 042: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 045: checkcast com/finalshell/core/C_h_2_2
      // 048: getfield com/finalshell/core/C_h_2_2.J Lcom/finalshell/core/Nt2_2;
      // 04b: invokestatic com/finalshell/core/H3_2.c (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/Nt2_2;)Lcom/finalshell/core/Hd2;
      // 04e: astore 2
      // 04f: aload 2
      // 050: aload 1
      // 051: ifnull 072
      // 054: invokestatic com/finalshell/core/H3_2.u (Lcom/finalshell/core/Q4_3;)Z
      // 057: ifeq 075
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: aload 0
      // 062: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 065: invokestatic com/finalshell/core/H3_2.Q (Lcom/finalshell/core/H3_2;)Lcom/finalshell/core/C_L;
      // 068: getfield com/finalshell/core/C_L.P Lcom/finalshell/core/Hd2;
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: goto 076
      // 075: aload 2
      // 076: areturn
      // 077: aload 0
      // 078: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 07b: aload 1
      // 07c: ifnull 097
      // 07f: instanceof com/finalshell/core/C_D
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: ifeq 10e
      // 08c: aload 0
      // 08d: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: checkcast com/finalshell/core/C_D
      // 09a: astore 2
      // 09b: aload 2
      // 09c: getfield com/finalshell/core/C_D.s Lcom/finalshell/core/Nt2_2;
      // 09f: astore 3
      // 0a0: aload 3
      // 0a1: ifnonnull 0b3
      // 0a4: aload 0
      // 0a5: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 0a8: invokestatic com/finalshell/core/H3_2.Q (Lcom/finalshell/core/H3_2;)Lcom/finalshell/core/C_L;
      // 0ab: getfield com/finalshell/core/C_L.P Lcom/finalshell/core/Hd2;
      // 0ae: areturn
      // 0af: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 0b7: aload 3
      // 0b8: invokestatic com/finalshell/core/H3_2.c (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/Nt2_2;)Lcom/finalshell/core/Hd2;
      // 0bb: astore 4
      // 0bd: aload 4
      // 0bf: aload 1
      // 0c0: ifnull 10d
      // 0c3: invokevirtual com/finalshell/core/Hd2.P$boolean ()Z
      // 0c6: ifeq 10b
      // 0c9: goto 0d0
      // 0cc: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 0d4: new java/lang/StringBuilder
      // 0d7: dup
      // 0d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0db: ldc_w "\""
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e1: aload 4
      // 0e3: invokevirtual com/finalshell/core/Hd2.toString ()Ljava/lang/String;
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: sipush -18569
      // 0ec: sipush -25637
      // 0ef: invokestatic com/finalshell/core/Hg2_2.b (II)Ljava/lang/String;
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f8: aload 0
      // 0f9: getfield com/finalshell/core/Hg2_2.P Lcom/finalshell/core/K_2_2;
      // 0fc: invokeinterface com/finalshell/core/K_2_2.Q ()Lcom/finalshell/ui/model/I; 1
      // 101: invokestatic com/finalshell/core/H3_2.T (Lcom/finalshell/core/H3_2;Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: aload 4
      // 10d: areturn
      // 10e: aconst_null
      // 10f: areturn
   }

   @Override
   public com.finalshell.ui.model.S_3 r() {
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
      // 05: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 08: instanceof com/finalshell/core/C_j_2
      // 0b: aload 1
      // 0c: ifnull 2f
      // 0f: ifeq 28
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 1d: checkcast com/finalshell/core/C_j_2
      // 20: invokevirtual com/finalshell/core/C_j_2.Q ()Lcom/finalshell/ui/model/S_3;
      // 23: areturn
      // 24: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 0
      // 29: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 2c: instanceof com/finalshell/core/C_E_2
      // 2f: aload 1
      // 30: ifnull 53
      // 33: ifeq 4c
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 41: checkcast com/finalshell/core/C_E_2
      // 44: invokevirtual com/finalshell/core/C_E_2.Z ()Lcom/finalshell/ui/model/S_3;
      // 47: areturn
      // 48: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 50: instanceof com/finalshell/core/C_O
      // 53: aload 1
      // 54: ifnull 77
      // 57: ifeq 70
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 65: checkcast com/finalshell/core/C_O
      // 68: invokevirtual com/finalshell/core/C_O.Q ()Lcom/finalshell/ui/model/S_3;
      // 6b: areturn
      // 6c: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 74: instanceof com/finalshell/core/C_G
      // 77: aload 1
      // 78: ifnull 9b
      // 7b: ifeq 94
      // 7e: goto 85
      // 81: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84: athrow
      // 85: aload 0
      // 86: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 89: checkcast com/finalshell/core/C_G
      // 8c: invokevirtual com/finalshell/core/C_G.Z ()Lcom/finalshell/ui/model/S_3;
      // 8f: areturn
      // 90: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: aload 0
      // 95: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 98: instanceof com/finalshell/core/C_h_2_2
      // 9b: aload 1
      // 9c: ifnull b8
      // 9f: ifeq b1
      // a2: goto a9
      // a5: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a8: athrow
      // a9: getstatic com/finalshell/ui/model/S_3.PUBLIC Lcom/finalshell/ui/model/S_3;
      // ac: areturn
      // ad: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: aload 0
      // b2: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // b5: instanceof com/finalshell/core/C_1_2
      // b8: ifeq c3
      // bb: getstatic com/finalshell/ui/model/S_3.PUBLIC Lcom/finalshell/ui/model/S_3;
      // be: areturn
      // bf: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c2: athrow
      // c3: new com/finalshell/core/P_5
      // c6: dup
      // c7: aload 0
      // c8: getfield com/finalshell/core/Hg2_2.P Lcom/finalshell/core/K_2_2;
      // cb: invokeinterface com/finalshell/core/K_2_2.Q ()Lcom/finalshell/ui/model/I; 1
      // d0: aload 0
      // d1: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // d4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // d7: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // da: invokespecial com/finalshell/core/P_5.<init> (Lcom/finalshell/ui/model/I;Ljava/lang/String;)V
      // dd: athrow
   }

   @Override
   public boolean M() {
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
      // 05: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 08: instanceof com/finalshell/core/C_D
      // 0b: aload 1
      // 0c: ifnull 2a
      // 0f: ifeq 3c
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 1d: checkcast com/finalshell/core/C_D
      // 20: invokevirtual com/finalshell/core/C_D.m ()Z
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 1
      // 2b: ifnull 39
      // 2e: ifeq 3c
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   @Override
   public Hd2[] l$arrhd_2() throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 008: instanceof com/finalshell/core/C_h_2_2
      // 00b: aload 1
      // 00c: ifnull 058
      // 00f: ifeq 051
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 01d: aload 0
      // 01e: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 021: checkcast com/finalshell/core/C_h_2_2
      // 024: getfield com/finalshell/core/C_h_2_2.J Lcom/finalshell/core/Nt2_2;
      // 027: invokestatic com/finalshell/core/H3_2.c (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/Nt2_2;)Lcom/finalshell/core/Hd2;
      // 02a: astore 2
      // 02b: aload 2
      // 02c: invokevirtual com/finalshell/core/Hd2.P$boolean ()Z
      // 02f: aload 1
      // 030: ifnull 04d
      // 033: ifeq 04c
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: bipush 1
      // 03e: anewarray 4
      // 041: dup
      // 042: bipush 0
      // 043: aload 2
      // 044: aastore
      // 045: goto 050
      // 048: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: bipush 0
      // 04d: anewarray 4
      // 050: areturn
      // 051: aload 0
      // 052: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 055: instanceof com/finalshell/core/C_D
      // 058: aload 1
      // 059: ifnull 10b
      // 05c: ifeq 0f9
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: aload 0
      // 067: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 06a: checkcast com/finalshell/core/C_D
      // 06d: astore 2
      // 06e: aload 2
      // 06f: getfield com/finalshell/core/C_D.g [Lcom/finalshell/core/Nt2_2;
      // 072: arraylength
      // 073: anewarray 4
      // 076: astore 3
      // 077: bipush 0
      // 078: istore 4
      // 07a: iload 4
      // 07c: aload 3
      // 07d: arraylength
      // 07e: if_icmpge 0f7
      // 081: aload 3
      // 082: iload 4
      // 084: aload 0
      // 085: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 088: aload 2
      // 089: getfield com/finalshell/core/C_D.g [Lcom/finalshell/core/Nt2_2;
      // 08c: iload 4
      // 08e: aaload
      // 08f: invokestatic com/finalshell/core/H3_2.c (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/Nt2_2;)Lcom/finalshell/core/Hd2;
      // 092: aastore
      // 093: aload 1
      // 094: ifnull 0f3
      // 097: aload 3
      // 098: aload 1
      // 099: ifnull 0f8
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a2: athrow
      // 0a3: iload 4
      // 0a5: aaload
      // 0a6: invokevirtual com/finalshell/core/Hd2.P$boolean ()Z
      // 0a9: ifne 0f0
      // 0ac: goto 0b3
      // 0af: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 0b7: new java/lang/StringBuilder
      // 0ba: dup
      // 0bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0be: ldc_w "\""
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: aload 3
      // 0c5: iload 4
      // 0c7: aaload
      // 0c8: invokevirtual com/finalshell/core/Hd2.toString ()Ljava/lang/String;
      // 0cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ce: sipush -18570
      // 0d1: sipush -12774
      // 0d4: invokestatic com/finalshell/core/Hg2_2.b (II)Ljava/lang/String;
      // 0d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0dd: aload 0
      // 0de: getfield com/finalshell/core/Hg2_2.P Lcom/finalshell/core/K_2_2;
      // 0e1: invokeinterface com/finalshell/core/K_2_2.Q ()Lcom/finalshell/ui/model/I; 1
      // 0e6: invokestatic com/finalshell/core/H3_2.T (Lcom/finalshell/core/H3_2;Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: iinc 4 1
      // 0f3: aload 1
      // 0f4: ifnonnull 07a
      // 0f7: aload 3
      // 0f8: areturn
      // 0f9: aload 0
      // 0fa: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 0fd: aload 1
      // 0fe: ifnull 119
      // 101: instanceof com/finalshell/core/C_n_2
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: ifeq 1a8
      // 10e: aload 0
      // 10f: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: checkcast com/finalshell/core/C_n_2
      // 11c: astore 2
      // 11d: aload 2
      // 11e: getfield com/finalshell/core/C_n_2.q [Lcom/finalshell/core/Nt2_2;
      // 121: arraylength
      // 122: anewarray 4
      // 125: astore 3
      // 126: bipush 0
      // 127: istore 4
      // 129: iload 4
      // 12b: aload 3
      // 12c: arraylength
      // 12d: if_icmpge 1a6
      // 130: aload 3
      // 131: iload 4
      // 133: aload 0
      // 134: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 137: aload 2
      // 138: getfield com/finalshell/core/C_n_2.q [Lcom/finalshell/core/Nt2_2;
      // 13b: iload 4
      // 13d: aaload
      // 13e: invokestatic com/finalshell/core/H3_2.c (Lcom/finalshell/core/H3_2;Lcom/finalshell/core/Nt2_2;)Lcom/finalshell/core/Hd2;
      // 141: aastore
      // 142: aload 1
      // 143: ifnull 1a2
      // 146: aload 3
      // 147: aload 1
      // 148: ifnull 1a7
      // 14b: goto 152
      // 14e: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: iload 4
      // 154: aaload
      // 155: invokevirtual com/finalshell/core/Hd2.P$boolean ()Z
      // 158: ifne 19f
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: aload 0
      // 163: getfield com/finalshell/core/Hg2_2.j Lcom/finalshell/core/H3_2;
      // 166: new java/lang/StringBuilder
      // 169: dup
      // 16a: invokespecial java/lang/StringBuilder.<init> ()V
      // 16d: ldc_w "\""
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: aload 3
      // 174: iload 4
      // 176: aaload
      // 177: invokevirtual com/finalshell/core/Hd2.toString ()Ljava/lang/String;
      // 17a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17d: sipush -18576
      // 180: sipush 27003
      // 183: invokestatic com/finalshell/core/Hg2_2.b (II)Ljava/lang/String;
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18c: aload 0
      // 18d: getfield com/finalshell/core/Hg2_2.P Lcom/finalshell/core/K_2_2;
      // 190: invokeinterface com/finalshell/core/K_2_2.Q ()Lcom/finalshell/ui/model/I; 1
      // 195: invokestatic com/finalshell/core/H3_2.T (Lcom/finalshell/core/H3_2;Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: iinc 4 1
      // 1a2: aload 1
      // 1a3: ifnonnull 129
      // 1a6: aload 3
      // 1a7: areturn
      // 1a8: new com/finalshell/core/P_5
      // 1ab: dup
      // 1ac: aload 0
      // 1ad: getfield com/finalshell/core/Hg2_2.P Lcom/finalshell/core/K_2_2;
      // 1b0: invokeinterface com/finalshell/core/K_2_2.Q ()Lcom/finalshell/ui/model/I; 1
      // 1b5: sipush -18571
      // 1b8: sipush -28658
      // 1bb: invokestatic com/finalshell/core/Hg2_2.b (II)Ljava/lang/String;
      // 1be: invokespecial com/finalshell/core/P_5.<init> (Lcom/finalshell/ui/model/I;Ljava/lang/String;)V
      // 1c1: athrow
   }

   @Override
   public H4_2[] a() throws B2_5 {
      return H3_2.R(this.j, this.P.d());
   }

   @Override
   public boolean B() {
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
      // 05: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 08: instanceof com/finalshell/core/C_n_2
      // 0b: aload 1
      // 0c: ifnull 55
      // 0f: ifne 54
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 1d: instanceof com/finalshell/core/C_D
      // 20: aload 1
      // 21: ifnull 46
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: ifeq 58
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: getfield com/finalshell/core/Hg2_2.J Lcom/finalshell/core/C_i_2;
      // 39: checkcast com/finalshell/core/C_D
      // 3c: invokevirtual com/finalshell/core/C_D.d ()Z
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 1
      // 47: ifnull 55
      // 4a: ifeq 58
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/Hg2_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   @Override
   public boolean s() {
      return this.J instanceof K3_4;
   }

   @Override
   public boolean P$boolean() {
      return this.J instanceof C_n_2;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -18571) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 30;
               break;
            case 1:
               var10000 = 210;
               break;
            case 2:
               var10000 = 145;
               break;
            case 3:
               var10000 = 186;
               break;
            case 4:
               var10000 = 211;
               break;
            case 5:
               var10000 = 27;
               break;
            case 6:
               var10000 = 196;
               break;
            case 7:
               var10000 = 96;
               break;
            case 8:
               var10000 = 103;
               break;
            case 9:
               var10000 = 47;
               break;
            case 10:
               var10000 = 39;
               break;
            case 11:
               var10000 = 46;
               break;
            case 12:
               var10000 = 78;
               break;
            case 13:
               var10000 = 224;
               break;
            case 14:
               var10000 = 57;
               break;
            case 15:
               var10000 = 86;
               break;
            case 16:
               var10000 = 250;
               break;
            case 17:
               var10000 = 89;
               break;
            case 18:
               var10000 = 3;
               break;
            case 19:
               var10000 = 236;
               break;
            case 20:
               var10000 = 60;
               break;
            case 21:
               var10000 = 166;
               break;
            case 22:
               var10000 = 50;
               break;
            case 23:
               var10000 = 68;
               break;
            case 24:
               var10000 = 209;
               break;
            case 25:
               var10000 = 98;
               break;
            case 26:
               var10000 = 159;
               break;
            case 27:
               var10000 = 237;
               break;
            case 28:
               var10000 = 135;
               break;
            case 29:
               var10000 = 128;
               break;
            case 30:
               var10000 = 160;
               break;
            case 31:
               var10000 = 254;
               break;
            case 32:
               var10000 = 191;
               break;
            case 33:
               var10000 = 142;
               break;
            case 34:
               var10000 = 177;
               break;
            case 35:
               var10000 = 58;
               break;
            case 36:
               var10000 = 233;
               break;
            case 37:
               var10000 = 178;
               break;
            case 38:
               var10000 = 216;
               break;
            case 39:
               var10000 = 121;
               break;
            case 40:
               var10000 = 163;
               break;
            case 41:
               var10000 = 161;
               break;
            case 42:
               var10000 = 93;
               break;
            case 43:
               var10000 = 23;
               break;
            case 44:
               var10000 = 100;
               break;
            case 45:
               var10000 = 125;
               break;
            case 46:
               var10000 = 138;
               break;
            case 47:
               var10000 = 14;
               break;
            case 48:
               var10000 = 181;
               break;
            case 49:
               var10000 = 143;
               break;
            case 50:
               var10000 = 55;
               break;
            case 51:
               var10000 = 223;
               break;
            case 52:
               var10000 = 127;
               break;
            case 53:
               var10000 = 65;
               break;
            case 54:
               var10000 = 56;
               break;
            case 55:
               var10000 = 187;
               break;
            case 56:
               var10000 = 118;
               break;
            case 57:
               var10000 = 249;
               break;
            case 58:
               var10000 = 170;
               break;
            case 59:
               var10000 = 91;
               break;
            case 60:
               var10000 = 90;
               break;
            case 61:
               var10000 = 11;
               break;
            case 62:
               var10000 = 67;
               break;
            case 63:
               var10000 = 51;
               break;
            case 64:
               var10000 = 102;
               break;
            case 65:
               var10000 = 144;
               break;
            case 66:
               var10000 = 228;
               break;
            case 67:
               var10000 = 203;
               break;
            case 68:
               var10000 = 247;
               break;
            case 69:
               var10000 = 171;
               break;
            case 70:
               var10000 = 243;
               break;
            case 71:
               var10000 = 40;
               break;
            case 72:
               var10000 = 169;
               break;
            case 73:
               var10000 = 134;
               break;
            case 74:
               var10000 = 137;
               break;
            case 75:
               var10000 = 202;
               break;
            case 76:
               var10000 = 131;
               break;
            case 77:
               var10000 = 219;
               break;
            case 78:
               var10000 = 217;
               break;
            case 79:
               var10000 = 45;
               break;
            case 80:
               var10000 = 64;
               break;
            case 81:
               var10000 = 208;
               break;
            case 82:
               var10000 = 194;
               break;
            case 83:
               var10000 = 16;
               break;
            case 84:
               var10000 = 115;
               break;
            case 85:
               var10000 = 255;
               break;
            case 86:
               var10000 = 106;
               break;
            case 87:
               var10000 = 182;
               break;
            case 88:
               var10000 = 188;
               break;
            case 89:
               var10000 = 88;
               break;
            case 90:
               var10000 = 226;
               break;
            case 91:
               var10000 = 147;
               break;
            case 92:
               var10000 = 29;
               break;
            case 93:
               var10000 = 0;
               break;
            case 94:
               var10000 = 132;
               break;
            case 95:
               var10000 = 108;
               break;
            case 96:
               var10000 = 215;
               break;
            case 97:
               var10000 = 31;
               break;
            case 98:
               var10000 = 133;
               break;
            case 99:
               var10000 = 123;
               break;
            case 100:
               var10000 = 18;
               break;
            case 101:
               var10000 = 116;
               break;
            case 102:
               var10000 = 36;
               break;
            case 103:
               var10000 = 154;
               break;
            case 104:
               var10000 = 205;
               break;
            case 105:
               var10000 = 251;
               break;
            case 106:
               var10000 = 198;
               break;
            case 107:
               var10000 = 207;
               break;
            case 108:
               var10000 = 152;
               break;
            case 109:
               var10000 = 195;
               break;
            case 110:
               var10000 = 149;
               break;
            case 111:
               var10000 = 157;
               break;
            case 112:
               var10000 = 12;
               break;
            case 113:
               var10000 = 4;
               break;
            case 114:
               var10000 = 7;
               break;
            case 115:
               var10000 = 148;
               break;
            case 116:
               var10000 = 190;
               break;
            case 117:
               var10000 = 246;
               break;
            case 118:
               var10000 = 146;
               break;
            case 119:
               var10000 = 180;
               break;
            case 120:
               var10000 = 85;
               break;
            case 121:
               var10000 = 21;
               break;
            case 122:
               var10000 = 73;
               break;
            case 123:
               var10000 = 87;
               break;
            case 124:
               var10000 = 10;
               break;
            case 125:
               var10000 = 172;
               break;
            case 126:
               var10000 = 15;
               break;
            case 127:
               var10000 = 20;
               break;
            case 128:
               var10000 = 212;
               break;
            case 129:
               var10000 = 70;
               break;
            case 130:
               var10000 = 110;
               break;
            case 131:
               var10000 = 66;
               break;
            case 132:
               var10000 = 112;
               break;
            case 133:
               var10000 = 35;
               break;
            case 134:
               var10000 = 80;
               break;
            case 135:
               var10000 = 117;
               break;
            case 136:
               var10000 = 69;
               break;
            case 137:
               var10000 = 26;
               break;
            case 138:
               var10000 = 221;
               break;
            case 139:
               var10000 = 75;
               break;
            case 140:
               var10000 = 42;
               break;
            case 141:
               var10000 = 158;
               break;
            case 142:
               var10000 = 218;
               break;
            case 143:
               var10000 = 99;
               break;
            case 144:
               var10000 = 25;
               break;
            case 145:
               var10000 = 122;
               break;
            case 146:
               var10000 = 49;
               break;
            case 147:
               var10000 = 48;
               break;
            case 148:
               var10000 = 239;
               break;
            case 149:
               var10000 = 6;
               break;
            case 150:
               var10000 = 232;
               break;
            case 151:
               var10000 = 242;
               break;
            case 152:
               var10000 = 44;
               break;
            case 153:
               var10000 = 235;
               break;
            case 154:
               var10000 = 167;
               break;
            case 155:
               var10000 = 248;
               break;
            case 156:
               var10000 = 53;
               break;
            case 157:
               var10000 = 95;
               break;
            case 158:
               var10000 = 183;
               break;
            case 159:
               var10000 = 71;
               break;
            case 160:
               var10000 = 185;
               break;
            case 161:
               var10000 = 61;
               break;
            case 162:
               var10000 = 150;
               break;
            case 163:
               var10000 = 113;
               break;
            case 164:
               var10000 = 83;
               break;
            case 165:
               var10000 = 43;
               break;
            case 166:
               var10000 = 241;
               break;
            case 167:
               var10000 = 101;
               break;
            case 168:
               var10000 = 189;
               break;
            case 169:
               var10000 = 240;
               break;
            case 170:
               var10000 = 174;
               break;
            case 171:
               var10000 = 151;
               break;
            case 172:
               var10000 = 22;
               break;
            case 173:
               var10000 = 72;
               break;
            case 174:
               var10000 = 140;
               break;
            case 175:
               var10000 = 164;
               break;
            case 176:
               var10000 = 173;
               break;
            case 177:
               var10000 = 63;
               break;
            case 178:
               var10000 = 141;
               break;
            case 179:
               var10000 = 153;
               break;
            case 180:
               var10000 = 213;
               break;
            case 181:
               var10000 = 13;
               break;
            case 182:
               var10000 = 92;
               break;
            case 183:
               var10000 = 231;
               break;
            case 184:
               var10000 = 179;
               break;
            case 185:
               var10000 = 165;
               break;
            case 186:
               var10000 = 136;
               break;
            case 187:
               var10000 = 8;
               break;
            case 188:
               var10000 = 200;
               break;
            case 189:
               var10000 = 126;
               break;
            case 190:
               var10000 = 175;
               break;
            case 191:
               var10000 = 227;
               break;
            case 192:
               var10000 = 62;
               break;
            case 193:
               var10000 = 234;
               break;
            case 194:
               var10000 = 229;
               break;
            case 195:
               var10000 = 82;
               break;
            case 196:
               var10000 = 59;
               break;
            case 197:
               var10000 = 230;
               break;
            case 198:
               var10000 = 201;
               break;
            case 199:
               var10000 = 104;
               break;
            case 200:
               var10000 = 94;
               break;
            case 201:
               var10000 = 97;
               break;
            case 202:
               var10000 = 197;
               break;
            case 203:
               var10000 = 120;
               break;
            case 204:
               var10000 = 41;
               break;
            case 205:
               var10000 = 76;
               break;
            case 206:
               var10000 = 5;
               break;
            case 207:
               var10000 = 238;
               break;
            case 208:
               var10000 = 38;
               break;
            case 209:
               var10000 = 34;
               break;
            case 210:
               var10000 = 156;
               break;
            case 211:
               var10000 = 28;
               break;
            case 212:
               var10000 = 245;
               break;
            case 213:
               var10000 = 1;
               break;
            case 214:
               var10000 = 184;
               break;
            case 215:
               var10000 = 222;
               break;
            case 216:
               var10000 = 114;
               break;
            case 217:
               var10000 = 168;
               break;
            case 218:
               var10000 = 32;
               break;
            case 219:
               var10000 = 129;
               break;
            case 220:
               var10000 = 206;
               break;
            case 221:
               var10000 = 19;
               break;
            case 222:
               var10000 = 244;
               break;
            case 223:
               var10000 = 111;
               break;
            case 224:
               var10000 = 155;
               break;
            case 225:
               var10000 = 24;
               break;
            case 226:
               var10000 = 225;
               break;
            case 227:
               var10000 = 139;
               break;
            case 228:
               var10000 = 17;
               break;
            case 229:
               var10000 = 193;
               break;
            case 230:
               var10000 = 176;
               break;
            case 231:
               var10000 = 2;
               break;
            case 232:
               var10000 = 79;
               break;
            case 233:
               var10000 = 253;
               break;
            case 234:
               var10000 = 192;
               break;
            case 235:
               var10000 = 52;
               break;
            case 236:
               var10000 = 252;
               break;
            case 237:
               var10000 = 214;
               break;
            case 238:
               var10000 = 107;
               break;
            case 239:
               var10000 = 9;
               break;
            case 240:
               var10000 = 37;
               break;
            case 241:
               var10000 = 74;
               break;
            case 242:
               var10000 = 119;
               break;
            case 243:
               var10000 = 105;
               break;
            case 244:
               var10000 = 199;
               break;
            case 245:
               var10000 = 77;
               break;
            case 246:
               var10000 = 33;
               break;
            case 247:
               var10000 = 204;
               break;
            case 248:
               var10000 = 54;
               break;
            case 249:
               var10000 = 81;
               break;
            case 250:
               var10000 = 162;
               break;
            case 251:
               var10000 = 124;
               break;
            case 252:
               var10000 = 84;
               break;
            case 253:
               var10000 = 109;
               break;
            case 254:
               var10000 = 220;
               break;
            default:
               var10000 = 130;
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
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "\u0007ðÁco©«^HóRð\u008aE£a\u0010Ö\u007f\u008cJ\u008e½ª? \u008b>¢jTé(\u0085Ï|²G\u0081Ð¶Rí¿Ôn3\u009bÃl\u008cö\u0019+OO:C[y\u0018£I\u0011\u0088ý~3ÿNÅ\u0002@%·ÎÚà\u0018Þé)»ÑVG\u009d\"øÜ×\u000eÀ/¼ \u008bQ{`\u008d«\u0010As\u0012ÝØÁú\u0002Zå$}\u009ab\u009f¨*\u0088\u001eÛ2YïsjÛÈ1\u0005\u008b½\u0081 A»\u0004ÙÿÏÇ?°øãvÄq\u0088P%\f\u009e\u008dH¦Ód.\u0087¸3zË½\u0097ä\u001c\u0005\u00142Í<ÝWã}É%r\u0002\u008b\u008cû-LïÈ\\ÆäT¬¢ÐÚrÓñ\u0011\u0000+\tÛ\u009fïk\u0090Ð?£ýdyÅjs\u0001\"]\u0013\u0016\u00906\u000f6ö·qÚ\u0080$¬";
      int var4 = "\u0007ðÁco©«^HóRð\u008aE£a\u0010Ö\u007f\u008cJ\u008e½ª? \u008b>¢jTé(\u0085Ï|²G\u0081Ð¶Rí¿Ôn3\u009bÃl\u008cö\u0019+OO:C[y\u0018£I\u0011\u0088ý~3ÿNÅ\u0002@%·ÎÚà\u0018Þé)»ÑVG\u009d\"øÜ×\u000eÀ/¼ \u008bQ{`\u008d«\u0010As\u0012ÝØÁú\u0002Zå$}\u009ab\u009f¨*\u0088\u001eÛ2YïsjÛÈ1\u0005\u008b½\u0081 A»\u0004ÙÿÏÇ?°øãvÄq\u0088P%\f\u009e\u008dH¦Ód.\u0087¸3zË½\u0097ä\u001c\u0005\u00142Í<ÝWã}É%r\u0002\u008b\u008cû-LïÈ\\ÆäT¬¢ÐÚrÓñ\u0011\u0000+\tÛ\u009fïk\u0090Ð?£ýdyÅjs\u0001\"]\u0013\u0016\u00906\u000f6ö·qÚ\u0080$¬"
         .length();
      char var1 = 'Q';
      int var9 = -1;

      label67:
      while (true) {
         byte var10000 = 47;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
      char[] var22;
            label62: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = var10000;
               var22 = var26;
               int var16 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               } else {
                  var29 = var10000;
                  var16 = var10004;
                  if (var10004 <= var6) {
                     break label62;
                  }

                  var38 = var26;
                  var34 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var47 = var38[var10006];
                  byte var48;
                  switch (var6 % 7) {
                     case 0:
                        var48 = 117;
                        break;
                     case 1:
                        var48 = 1;
                        break;
                     case 2:
                        var48 = 51;
                        break;
                     case 3:
                        var48 = 42;
                        break;
                     case 4:
                        var48 = 125;
                        break;
                     case 5:
                        var48 = 118;
                        break;
                     default:
                        var48 = 101;
                  }

                  var38[var10006] = (char)(var47 ^ var34 ^ var48);
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var16 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     c = new String[6];

                     label40: {
                        try {
                           if (!H3_2.class.desiredAssertionStatus()) {
                              var11 = true;
                              break label40;
                           }
                        } catch (P_5 var7) {
                           throw a(var7);
                        }

                        var11 = false;
                     }

                     U = var11;
                     return;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label67;
                  }

                  var2 = "lÇ±\u0098|ËÔ\u000fºÄ\u0011\u000bÿ'\u00100{á\u000fwYìÂûÍ\u0097ÈÅ×\bç¸C²¿\u0087¡%þ\u0081De®D¡\f\u0080Ê¨[ü\r\nI0\u001eÈt\u0018\u0082mÁú@ãÊ\u000eÈì,ºS²\u0012ô5¯\u0082«\u008f\u0082<\u0080\u0004U\n\u0002Ö\u0016a\u001aýÔ\u001e´\u0094Ê.\u009b·âÛi#¾\u001b@\u009f*f\u0086ëS\u0088Ú\u001c8ª\u001cr\u0092ÈXÞ¦\u0092Â2\u00866`)÷%\u0013®\u000egð_|J";
                  var4 = "lÇ±\u0098|ËÔ\u000fºÄ\u0011\u000bÿ'\u00100{á\u000fwYìÂûÍ\u0097ÈÅ×\bç¸C²¿\u0087¡%þ\u0081De®D¡\f\u0080Ê¨[ü\r\nI0\u001eÈt\u0018\u0082mÁú@ãÊ\u000eÈì,ºS²\u0012ô5¯\u0082«\u008f\u0082<\u0080\u0004U\n\u0002Ö\u0016a\u001aýÔ\u001e´\u0094Ê.\u009b·âÛi#¾\u001b@\u009f*f\u0086ëS\u0088Ú\u001c8ª\u001cr\u0092ÈXÞ¦\u0092Â2\u00866`)÷%\u0013®\u000egð_|J"
                     .length();
                  var1 = 'Q';
                  var9 = -1;
            }

            var10000 = 92;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }
}





