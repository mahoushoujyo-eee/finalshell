package com.finalshell.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.logging.Logger;

public abstract class Hd2 implements C_f_2 {
   public static Logger b;
   public static Object M;
   public static Hd2 I;
   public static Hd2 s;
   public static Hd2 E;
   public static Hd2 O;
   public static Hd2 D;
   public static Hd2 l;
   public static Hd2 G;
   public static Hd2 S;
   public static Hd2 e;
   public static Hd2 t;
   @C_9
   public C_J[] x;
   @C_9
   public Hv2_2[] X;
   @C_9
   public HP_2[] K;
   @C_9
   public Map p;
   @C_9
   public HP_2[] f;
   public static HP_2[] H;
   @C_9
   public Map R;
   @C_9
   public Hd2[] o;
   public boolean z;
   @C_9
   public Hd2 h;
   public boolean Z;
   @C_9
   public Hd2 V;
   public boolean A;
   @C_9
   public Hd2 r;
   @C_9
   public Hd2[] v;
   @C_9
   public String d;
   public boolean m;
   @C_9
   public Hd2 g;
   public static Set y;
   public final Map C = new HashMap();
   public static Hd2[] Y;
   @C_9
   public H4_2[] W;
   public static H4_2[] u;
   public static boolean N;
   public static String[] i;
   public static String[] w;
   public static long[] L;
   public static Integer[] T;

   public final C_J[] X() throws B2_5 {
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
      // 05: getfield com/finalshell/core/Hd2.x [Lcom/finalshell/core/C_J;
      // 08: aload 1
      // 09: ifnull 28
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hd2.x [Lcom/finalshell/core/C_J;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: invokevirtual com/finalshell/core/Hd2.V$arr_J ()[Lcom/finalshell/core/C_J;
      // 24: dup_x1
      // 25: putfield com/finalshell/core/Hd2.x [Lcom/finalshell/core/C_J;
      // 28: areturn
   }

   public abstract C_J[] V$arr_J() throws B2_5;

   public final Hv2_2[] e() {
      String[] var1 = RG_2.C();
      Hv2_2[] var10000 = this.X;
      if (var1 != null) {
         if (this.X != null) {
            return this.X;
         }

         var10000 = this.X = this.C();
      }

      return var10000;
   }

   public abstract Hv2_2[] C();

   public final HP_2[] j$arrhP() {
      String[] var1 = RG_2.C();
      HP_2[] var10000 = this.K;
      if (var1 != null) {
         if (this.K != null) {
            return this.K;
         }

         var10000 = this.K = this.H();
      }

      return var10000;
   }

   public abstract HP_2[] H();

   public final HP_2[] q(String var1) {
      String[] var2;
      Object var18;
      var18 = RG_2.C();
      Object var3 = this.p;
      var2 = (String[])var18;
      var18 = (HP_2)var3;
      label82:
      if (var2 != null) {
         if (var3 == null) {
            HP_2[] var4 = this.j$arrhP();
            var3 = new HashMap();

            for (HP_2 var8 : var4) {
               String var9 = var8.K();
               Object var10 = var3.get(var9);
               var18 = (HP_2)var10;
               if (var2 == null) {
                  break label82;
               }

               label87: {
                  if (var2 != null) {
                     if (var10 == null) {
                        var3.put(var9, var8);
                        if (var2 != null) {
                           break label87;
                        }
                     }

                     var18 = (HP_2)var10;
                  }

                  if (var2 != null) {
                     if (var18 instanceof HP_2) {
                        ArrayList var11 = new ArrayList();
                        var11.add((HP_2)var10);
                        var11.add(var8);
                        var3.put(var9, var11);
                        if (var2 != null) {
                           break label87;
                        }
                     }

                     var18 = (HP_2)var10;
                  }

                  List var17 = (List)var18;
                  var17.add(var8);
               }

               if (var2 == null) {
                  break;
               }
            }

            for (Entry var14 : var3.entrySet()) {
               Object var15 = var14.getValue();
               var18 = (HP_2)var15;
               if (var2 == null) {
                  break label82;
               }

               label52: {
                  if (var2 != null) {
                     if (var15 instanceof HP_2) {
                        var14.setValue(new HP_2[]{(HP_2)var15});
                        if (var2 != null) {
                           break label52;
                        }
                     }

                     var18 = (HP_2)var15;
                  }

                  List var16 = (List)var18;
                  var14.setValue(var16.toArray(new HP_2[var16.size()]));
               }

               if (var2 == null) {
                  break;
               }
            }

            this.p = (Map)var3;
         }

         var18 = (HP_2)var3.get(var1);
      }

      HP_2[] var12 = (HP_2[])var18;
      var18 = var12;
      if (var2 != null) {
         var18 = var12 == null ? H : var12;
      }

      return (HP_2[])(var18);
   }

   public final HP_2[] w() throws B2_5 {
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
      // 05: getfield com/finalshell/core/Hd2.f [Lcom/finalshell/core/HP_2;
      // 08: aload 1
      // 09: ifnull 21
      // 0c: ifnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hd2.f [Lcom/finalshell/core/HP_2;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 20: athrow
      // 21: areturn
      // 22: new java/util/ArrayList
      // 25: dup
      // 26: invokespecial java/util/ArrayList.<init> ()V
      // 29: astore 2
      // 2a: aload 0
      // 2b: aload 2
      // 2c: invokespecial com/finalshell/core/Hd2.g (Ljava/util/List;)V
      // 2f: aload 0
      // 30: aload 2
      // 31: aload 2
      // 32: invokeinterface java/util/List.size ()I 1
      // 37: anewarray 107
      // 3a: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 3f: checkcast [Lcom/finalshell/core/HP_2;
      // 42: dup_x1
      // 43: putfield com/finalshell/core/Hd2.f [Lcom/finalshell/core/HP_2;
      // 46: areturn
   }

   public void g(List param1) throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual com/finalshell/core/Hd2.j$arrhP ()[Lcom/finalshell/core/HP_2;
      // 04: astore 3
      // 05: aload 3
      // 06: astore 4
      // 08: aload 4
      // 0a: arraylength
      // 0b: istore 5
      // 0d: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 10: bipush 0
      // 11: istore 6
      // 13: astore 2
      // 14: iload 6
      // 16: iload 5
      // 18: if_icmpge ab
      // 1b: aload 4
      // 1d: iload 6
      // 1f: aaload
      // 20: astore 7
      // 22: aload 7
      // 24: invokevirtual com/finalshell/core/HP_2.Y ()Lcom/finalshell/core/F3_4;
      // 27: astore 8
      // 29: aload 7
      // 2b: invokevirtual com/finalshell/core/HP_2.K ()Ljava/lang/String;
      // 2e: astore 9
      // 30: aload 1
      // 31: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 36: astore 10
      // 38: aload 10
      // 3a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f: ifeq 9b
      // 42: aload 10
      // 44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 49: checkcast com/finalshell/core/HP_2
      // 4c: astore 11
      // 4e: aload 9
      // 50: aload 11
      // 52: invokevirtual com/finalshell/core/HP_2.K ()Ljava/lang/String;
      // 55: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 58: aload 2
      // 59: ifnull a3
      // 5c: aload 2
      // 5d: ifnull 82
      // 60: goto 67
      // 63: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 66: athrow
      // 67: ifeq 90
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 70: athrow
      // 71: aload 8
      // 73: aload 11
      // 75: invokevirtual com/finalshell/core/HP_2.Y ()Lcom/finalshell/core/F3_4;
      // 78: invokevirtual com/finalshell/core/F3_4.equals (Ljava/lang/Object;)Z
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 81: athrow
      // 82: ifeq 90
      // 85: aload 2
      // 86: ifnonnull a4
      // 89: goto 90
      // 8c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 8f: athrow
      // 90: aload 2
      // 91: ifnonnull 38
      // 94: goto 9b
      // 97: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 9a: athrow
      // 9b: aload 1
      // 9c: aload 7
      // 9e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a3: pop
      // a4: iinc 6 1
      // a7: aload 2
      // a8: ifnonnull 14
      // ab: aload 0
      // ac: invokevirtual com/finalshell/core/Hd2.c ()Lcom/finalshell/core/Hd2;
      // af: astore 4
      // b1: aload 4
      // b3: aload 2
      // b4: ifnull cf
      // b7: ifnull ce
      // ba: goto c1
      // bd: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // c0: athrow
      // c1: aload 4
      // c3: aload 1
      // c4: invokespecial com/finalshell/core/Hd2.g (Ljava/util/List;)V
      // c7: goto ce
      // ca: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // cd: athrow
      // ce: aload 0
      // cf: invokevirtual com/finalshell/core/Hd2.L$arrhd_2 ()[Lcom/finalshell/core/Hd2;
      // d2: astore 5
      // d4: aload 5
      // d6: arraylength
      // d7: istore 6
      // d9: bipush 0
      // da: istore 7
      // dc: iload 7
      // de: iload 6
      // e0: if_icmpge f7
      // e3: aload 5
      // e5: iload 7
      // e7: aaload
      // e8: astore 8
      // ea: aload 8
      // ec: aload 1
      // ed: invokespecial com/finalshell/core/Hd2.g (Ljava/util/List;)V
      // f0: iinc 7 1
      // f3: aload 2
      // f4: ifnonnull dc
      // f7: return
   }

   public final boolean L(String var1, Hd2[] var2) throws B2_5 {
      try {
         if (this.U(var1, var2) != null) {
            return true;
         }
      } catch (B2_5 var3) {
         throw a(var3);
      }

      return false;
   }

   @C_9
   public final HP_2 U(String param1, Hd2[] param2) throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 4
      // 003: aload 0
      // 004: aload 1
      // 005: invokevirtual com/finalshell/core/Hd2.q (Ljava/lang/String;)[Lcom/finalshell/core/HP_2;
      // 008: astore 5
      // 00a: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 00d: aload 5
      // 00f: arraylength
      // 010: istore 6
      // 012: bipush 0
      // 013: istore 7
      // 015: astore 3
      // 016: iload 7
      // 018: iload 6
      // 01a: if_icmpge 091
      // 01d: aload 5
      // 01f: iload 7
      // 021: aaload
      // 022: astore 8
      // 024: aload 3
      // 025: ifnull 08d
      // 028: aload 8
      // 02a: aload 3
      // 02b: ifnull 093
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 034: athrow
      // 035: invokevirtual com/finalshell/core/HP_2.p ()[Lcom/finalshell/core/Hd2;
      // 038: aload 2
      // 039: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 03c: ifeq 08a
      // 03f: goto 046
      // 042: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 045: athrow
      // 046: aload 4
      // 048: aload 3
      // 049: ifnull 088
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 052: athrow
      // 053: ifnull 07f
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 05c: athrow
      // 05d: aload 4
      // 05f: aload 3
      // 060: ifnull 088
      // 063: goto 06a
      // 066: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 069: athrow
      // 06a: invokevirtual com/finalshell/core/HP_2.p ()Lcom/finalshell/core/Hd2;
      // 06d: aload 8
      // 06f: invokevirtual com/finalshell/core/HP_2.p ()Lcom/finalshell/core/Hd2;
      // 072: invokevirtual com/finalshell/core/Hd2.I (Lcom/finalshell/core/Hd2;)Z
      // 075: ifeq 08a
      // 078: goto 07f
      // 07b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 07e: athrow
      // 07f: aload 8
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 087: athrow
      // 088: astore 4
      // 08a: iinc 7 1
      // 08d: aload 3
      // 08e: ifnonnull 016
      // 091: aload 4
      // 093: aload 3
      // 094: ifnull 0a3
      // 097: ifnull 0a4
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0a0: athrow
      // 0a1: aload 4
      // 0a3: areturn
      // 0a4: aload 0
      // 0a5: invokevirtual com/finalshell/core/Hd2.c ()Lcom/finalshell/core/Hd2;
      // 0a8: astore 4
      // 0aa: aload 4
      // 0ac: aload 3
      // 0ad: ifnull 0db
      // 0b0: ifnull 0da
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0b9: athrow
      // 0ba: aload 4
      // 0bc: aload 3
      // 0bd: ifnull 0db
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0c6: athrow
      // 0c7: aload 1
      // 0c8: aload 2
      // 0c9: invokevirtual com/finalshell/core/Hd2.U (Ljava/lang/String;[Lcom/finalshell/core/Hd2;)Lcom/finalshell/core/HP_2;
      // 0cc: astore 5
      // 0ce: aload 5
      // 0d0: ifnull 0da
      // 0d3: aload 5
      // 0d5: areturn
      // 0d6: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: invokevirtual com/finalshell/core/Hd2.L$arrhd_2 ()[Lcom/finalshell/core/Hd2;
      // 0de: astore 4
      // 0e0: aload 4
      // 0e2: astore 5
      // 0e4: aload 5
      // 0e6: arraylength
      // 0e7: istore 6
      // 0e9: bipush 0
      // 0ea: istore 7
      // 0ec: iload 7
      // 0ee: iload 6
      // 0f0: if_icmpge 121
      // 0f3: aload 5
      // 0f5: iload 7
      // 0f7: aaload
      // 0f8: astore 8
      // 0fa: aload 8
      // 0fc: aload 1
      // 0fd: aload 2
      // 0fe: invokevirtual com/finalshell/core/Hd2.U (Ljava/lang/String;[Lcom/finalshell/core/Hd2;)Lcom/finalshell/core/HP_2;
      // 101: astore 9
      // 103: aload 3
      // 104: ifnull 11d
      // 107: aload 9
      // 109: ifnull 11a
      // 10c: goto 113
      // 10f: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 112: athrow
      // 113: aload 9
      // 115: areturn
      // 116: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 119: athrow
      // 11a: iinc 7 1
      // 11d: aload 3
      // 11e: ifnonnull 0ec
      // 121: aconst_null
      // 122: areturn
   }

   @C_9
   public final Hv2_2 O(Hd2[] param1) throws B2_5 {
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
      // 04: invokevirtual com/finalshell/core/Hd2.e ()[Lcom/finalshell/core/Hv2_2;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: astore 4
      // 0c: aload 4
      // 0e: arraylength
      // 0f: istore 5
      // 11: bipush 0
      // 12: istore 6
      // 14: iload 6
      // 16: iload 5
      // 18: if_icmpge 47
      // 1b: aload 4
      // 1d: iload 6
      // 1f: aaload
      // 20: astore 7
      // 22: aload 2
      // 23: ifnull 43
      // 26: aload 7
      // 28: invokevirtual com/finalshell/core/Hv2_2.p ()[Lcom/finalshell/core/Hd2;
      // 2b: aload 1
      // 2c: invokestatic java/util/Arrays.equals ([Ljava/lang/Object;[Ljava/lang/Object;)Z
      // 2f: ifeq 40
      // 32: goto 39
      // 35: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 38: athrow
      // 39: aload 7
      // 3b: areturn
      // 3c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 3f: athrow
      // 40: iinc 6 1
      // 43: aload 2
      // 44: ifnonnull 14
      // 47: aconst_null
      // 48: areturn
   }

   public final U3_3[] y() {
      Collection var1 = this.V$Map().values();
      return (U3_3[])(var1.toArray(new U3_3[var1.size()]));
   }

   public Map V$Map() {
      LinkedHashMap var8;
      String[] var1 = RG_2.C();
      Hd2 var10000 = this;
      if (var1 != null) {
         if (this.R != null) {
            return this.R;
         }

         var10000 = this;
      }

      U3_3[] var2 = var10000.A$arru_3();
      LinkedHashMap var3 = new LinkedHashMap();
      U3_3[] var4 = var2;
      int var5 = var2.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            U3_3 var7 = var4[var6];
            var8 = var3;
            if (var1 == null) {
               break;
            }

            var3.put(var7.h(), var7);
            var6++;
            if (var1 != null) {
               continue;
            }
         }

         var8 = (LinkedHashMap)(this.R = var3);
         break;
      }

      return (Map)var8;
   }

   @C_9
   public final U3_3 G(String var1) {
      return (U3_3)this.V$Map().get(var1);
   }

   public void z$void() {
      this.R = null;
   }

   public abstract U3_3[] A$arru_3();

   public U3_3[] I() {
      return new U3_3[0];
   }

   public final Hd2[] p$arrhd_2() throws B2_5 {
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
      // 05: getfield com/finalshell/core/Hd2.o [Lcom/finalshell/core/Hd2;
      // 08: aload 1
      // 09: ifnull 28
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hd2.o [Lcom/finalshell/core/Hd2;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: invokevirtual com/finalshell/core/Hd2.j$arrhd_2 ()[Lcom/finalshell/core/Hd2;
      // 24: dup_x1
      // 25: putfield com/finalshell/core/Hd2.o [Lcom/finalshell/core/Hd2;
      // 28: areturn
   }

   public abstract Hd2[] j$arrhd_2() throws B2_5;

   @C_9
   public final Hd2 L$hd_2() throws B2_5 {
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
      // 06: ifnull 2e
      // 09: getfield com/finalshell/core/Hd2.z Z
      // 0c: ifne 2a
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual com/finalshell/core/Hd2.V$hd_2 ()Lcom/finalshell/core/Hd2;
      // 1b: putfield com/finalshell/core/Hd2.h Lcom/finalshell/core/Hd2;
      // 1e: aload 0
      // 1f: bipush 1
      // 20: putfield com/finalshell/core/Hd2.z Z
      // 23: goto 2a
      // 26: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/finalshell/core/Hd2.h Lcom/finalshell/core/Hd2;
      // 2e: areturn
   }

   @C_9
   public abstract Hd2 V$hd_2() throws B2_5;

   @C_9
   public final Hd2 i() throws B2_5 {
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
      // 06: ifnull 2d
      // 09: getfield com/finalshell/core/Hd2.Z Z
      // 0c: ifeq 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hd2.V Lcom/finalshell/core/Hd2;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1e: athrow
      // 1f: aload 0
      // 20: bipush 1
      // 21: putfield com/finalshell/core/Hd2.Z Z
      // 24: aload 0
      // 25: aload 0
      // 26: invokevirtual com/finalshell/core/Hd2.l$hd_2 ()Lcom/finalshell/core/Hd2;
      // 29: dup_x1
      // 2a: putfield com/finalshell/core/Hd2.V Lcom/finalshell/core/Hd2;
      // 2d: areturn
   }

   @C_9
   public abstract Hd2 l$hd_2() throws B2_5;

   @C_9
   public final Hd2 c() throws B2_5 {
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
      // 06: ifnull 23
      // 09: getfield com/finalshell/core/Hd2.A Z
      // 0c: ifeq 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hd2.r Lcom/finalshell/core/Hd2;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual com/finalshell/core/Hd2.g ()Lcom/finalshell/core/Hd2;
      // 23: astore 2
      // 24: aload 2
      // 25: aload 1
      // 26: ifnull 8e
      // 29: ifnull 83
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 32: athrow
      // 33: aload 2
      // 34: invokestatic com/finalshell/core/Hd2.R (Lcom/finalshell/core/Q4_3;)Lcom/finalshell/core/Hd2;
      // 37: aload 0
      // 38: aload 1
      // 39: ifnull 8a
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 42: athrow
      // 43: invokevirtual com/finalshell/core/Hd2.m (Lcom/finalshell/core/Hd2;)Z
      // 46: ifeq 83
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 4f: athrow
      // 50: new com/finalshell/core/B2_5
      // 53: dup
      // 54: new java/lang/StringBuilder
      // 57: dup
      // 58: invokespecial java/lang/StringBuilder.<init> ()V
      // 5b: sipush 24618
      // 5e: sipush 16364
      // 61: invokestatic com/finalshell/core/Hd2.a (II)Ljava/lang/String;
      // 64: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 67: aload 0
      // 68: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 6b: invokestatic com/finalshell/core/F0_2.F (Ljava/lang/String;)Ljava/lang/String;
      // 6e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71: ldc_w "\""
      // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7a: aconst_null
      // 7b: invokespecial com/finalshell/core/B2_5.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 7e: athrow
      // 7f: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 82: athrow
      // 83: aload 0
      // 84: bipush 1
      // 85: putfield com/finalshell/core/Hd2.A Z
      // 88: aload 0
      // 89: aload 2
      // 8a: dup_x1
      // 8b: putfield com/finalshell/core/Hd2.r Lcom/finalshell/core/Hd2;
      // 8e: areturn
   }

   @C_9
   public abstract Hd2 g() throws B2_5;

   public abstract com.finalshell.ui.model.S_3 r();

   public abstract boolean M();

   public final Hd2[] L$arrhd_2() throws B2_5 {
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
      // 05: getfield com/finalshell/core/Hd2.v [Lcom/finalshell/core/Hd2;
      // 08: aload 1
      // 09: ifnull 23
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hd2.v [Lcom/finalshell/core/Hd2;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual com/finalshell/core/Hd2.l$arrhd_2 ()[Lcom/finalshell/core/Hd2;
      // 23: astore 2
      // 24: aload 2
      // 25: astore 3
      // 26: aload 3
      // 27: arraylength
      // 28: istore 4
      // 2a: bipush 0
      // 2b: istore 5
      // 2d: iload 5
      // 2f: iload 4
      // 31: if_icmpge 93
      // 34: aload 3
      // 35: iload 5
      // 37: aaload
      // 38: astore 6
      // 3a: aload 1
      // 3b: ifnull 8f
      // 3e: aload 6
      // 40: aload 1
      // 41: ifnull 94
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokevirtual com/finalshell/core/Hd2.G (Lcom/finalshell/core/Hd2;)Z
      // 4f: ifeq 8c
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 58: athrow
      // 59: new com/finalshell/core/B2_5
      // 5c: dup
      // 5d: new java/lang/StringBuilder
      // 60: dup
      // 61: invokespecial java/lang/StringBuilder.<init> ()V
      // 64: sipush 24629
      // 67: sipush 22644
      // 6a: invokestatic com/finalshell/core/Hd2.a (II)Ljava/lang/String;
      // 6d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 70: aload 0
      // 71: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 74: invokestatic com/finalshell/core/F0_2.F (Ljava/lang/String;)Ljava/lang/String;
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: ldc_w "\""
      // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 80: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 83: aconst_null
      // 84: invokespecial com/finalshell/core/B2_5.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 87: athrow
      // 88: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 8b: athrow
      // 8c: iinc 5 1
      // 8f: aload 1
      // 90: ifnonnull 2d
      // 93: aload 0
      // 94: aload 2
      // 95: dup_x1
      // 96: putfield com/finalshell/core/Hd2.v [Lcom/finalshell/core/Hd2;
      // 99: areturn
   }

   public abstract Hd2[] l$arrhd_2() throws B2_5;

   public abstract boolean B();

   public final String z$String() {
      String[] var1 = RG_2.C();
      String var10000 = this.d;
      if (var1 != null) {
         if (this.d != null) {
            return this.d;
         }

         var10000 = this.d = this.J();
      }

      return var10000;
   }

   public abstract String J();

   public static String[] k(Hd2[] var0) {
      String[] var2 = new String[var0.length];
      String[] var10000 = RG_2.C();
      int var3 = 0;
      String[] var1 = var10000;

      while (true) {
         if (var3 < var0.length) {
            var10000 = var2;
            if (var1 == null) {
               break;
            }

            var2[var3] = var0[var3].z$String();
            var3++;
            if (var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   public abstract boolean s();

   public abstract boolean P$boolean();

   public abstract boolean q();

   public abstract boolean o();

   public abstract boolean p$boolean();

   @C_9
   public final Hd2 k() {
      String[] var1 = RG_2.C();
      Hd2 var10000 = this;
      if (var1 != null) {
         if (this.m) {
            return this.g;
         }

         this.g = this.G();
         this.m = true;
         var10000 = this.g;
      }

      return var10000;
   }

   @C_9
   public abstract Hd2 G();

   @Override
   public String toString() {
      String[] var10000 = RG_2.C();
      String var2 = F0_2.F(this.z$String());
      String[] var1 = var10000;
      String var3 = var2;
      if (var1 != null) {
         if (var2.startsWith(a(24617, 23747))) {
            if (var1 == null) {
               return var2;
            }

            if (var2.indexOf(a(22814, 5238499819929658620L), a(12766, 5748442128758869055L)) == -1) {
               var2 = var2.substring(a(19318, 6738677895195981457L));
            }
         }

         var3 = var2;
      }

      return var3;
   }

   public boolean I(Hd2 param1) throws B2_5 {
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
      // 005: aload 1
      // 006: if_acmpne 00f
      // 009: bipush 1
      // 00a: ireturn
      // 00b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 00e: athrow
      // 00f: new java/lang/StringBuilder
      // 012: dup
      // 013: invokespecial java/lang/StringBuilder.<init> ()V
      // 016: aload 1
      // 017: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 01a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 01d: aload 0
      // 01e: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 021: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 024: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 027: astore 3
      // 028: aload 3
      // 029: invokevirtual java/lang/String.length ()I
      // 02c: aload 2
      // 02d: ifnull 064
      // 030: bipush 2
      // 031: if_icmpne 05f
      // 034: goto 03b
      // 037: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 03a: athrow
      // 03b: getstatic com/finalshell/core/Hd2.y Ljava/util/Set;
      // 03e: aload 3
      // 03f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 044: aload 2
      // 045: ifnull 064
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 04e: athrow
      // 04f: ifeq 05f
      // 052: goto 059
      // 055: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 058: athrow
      // 059: bipush 1
      // 05a: ireturn
      // 05b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 05e: athrow
      // 05f: aload 1
      // 060: aload 0
      // 061: invokevirtual com/finalshell/core/Hd2.m (Lcom/finalshell/core/Hd2;)Z
      // 064: aload 2
      // 065: ifnull 088
      // 068: ifeq 078
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 071: athrow
      // 072: bipush 1
      // 073: ireturn
      // 074: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 077: athrow
      // 078: aload 1
      // 079: aload 0
      // 07a: aload 2
      // 07b: ifnull 0a0
      // 07e: invokevirtual com/finalshell/core/Hd2.G (Lcom/finalshell/core/Hd2;)Z
      // 081: goto 088
      // 084: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 087: athrow
      // 088: ifeq 091
      // 08b: bipush 1
      // 08c: ireturn
      // 08d: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 090: athrow
      // 091: aload 1
      // 092: aload 2
      // 093: ifnull 0c3
      // 096: getstatic com/finalshell/core/Hd2.I Lcom/finalshell/core/Hd2;
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 09f: athrow
      // 0a0: if_acmpne 0c2
      // 0a3: aload 0
      // 0a4: invokevirtual com/finalshell/core/Hd2.o ()Z
      // 0a7: aload 2
      // 0a8: ifnull 0c6
      // 0ab: goto 0b2
      // 0ae: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0b1: athrow
      // 0b2: ifne 0c2
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0bb: athrow
      // 0bc: bipush 1
      // 0bd: ireturn
      // 0be: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0c1: athrow
      // 0c2: aload 1
      // 0c3: invokevirtual com/finalshell/core/Hd2.P$boolean ()Z
      // 0c6: aload 2
      // 0c7: ifnull 103
      // 0ca: ifeq 0ff
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 0d8: sipush 24622
      // 0db: sipush 29184
      // 0de: invokestatic com/finalshell/core/Hd2.a (II)Ljava/lang/String;
      // 0e1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e4: aload 2
      // 0e5: ifnull 103
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0ee: athrow
      // 0ef: ifeq 0ff
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0f8: athrow
      // 0f9: bipush 1
      // 0fa: ireturn
      // 0fb: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0fe: athrow
      // 0ff: aload 1
      // 100: invokevirtual com/finalshell/core/Hd2.q ()Z
      // 103: aload 2
      // 104: ifnull 231
      // 107: ifeq 230
      // 10a: goto 111
      // 10d: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 110: athrow
      // 111: aload 0
      // 112: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 115: sipush 24616
      // 118: sipush -20933
      // 11b: invokestatic com/finalshell/core/Hd2.a (II)Ljava/lang/String;
      // 11e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 121: aload 2
      // 122: ifnull 14c
      // 125: goto 12c
      // 128: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 12b: athrow
      // 12c: ifeq 13c
      // 12f: goto 136
      // 132: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 135: athrow
      // 136: bipush 1
      // 137: ireturn
      // 138: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 13b: athrow
      // 13c: aload 0
      // 13d: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 140: sipush 24627
      // 143: sipush 8776
      // 146: invokestatic com/finalshell/core/Hd2.a (II)Ljava/lang/String;
      // 149: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14c: aload 2
      // 14d: ifnull 170
      // 150: ifeq 160
      // 153: goto 15a
      // 156: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 159: athrow
      // 15a: bipush 1
      // 15b: ireturn
      // 15c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15f: athrow
      // 160: aload 0
      // 161: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 164: sipush 24628
      // 167: sipush -11904
      // 16a: invokestatic com/finalshell/core/Hd2.a (II)Ljava/lang/String;
      // 16d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 170: aload 2
      // 171: ifnull 188
      // 174: ifeq 184
      // 177: goto 17e
      // 17a: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 17d: athrow
      // 17e: bipush 1
      // 17f: ireturn
      // 180: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 183: athrow
      // 184: aload 0
      // 185: invokevirtual com/finalshell/core/Hd2.q ()Z
      // 188: aload 2
      // 189: ifnull 231
      // 18c: ifeq 230
      // 18f: goto 196
      // 192: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 195: athrow
      // 196: aload 0
      // 197: invokevirtual com/finalshell/core/Hd2.k ()Lcom/finalshell/core/Hd2;
      // 19a: astore 3
      // 19b: aload 1
      // 19c: invokevirtual com/finalshell/core/Hd2.k ()Lcom/finalshell/core/Hd2;
      // 19f: astore 4
      // 1a1: getstatic com/finalshell/core/Hd2.N Z
      // 1a4: aload 2
      // 1a5: ifnull 1cc
      // 1a8: ifne 1c9
      // 1ab: goto 1b2
      // 1ae: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1b1: athrow
      // 1b2: aload 3
      // 1b3: ifnonnull 1c9
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1bc: athrow
      // 1bd: new java/lang/AssertionError
      // 1c0: dup
      // 1c1: invokespecial java/lang/AssertionError.<init> ()V
      // 1c4: athrow
      // 1c5: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1c8: athrow
      // 1c9: getstatic com/finalshell/core/Hd2.N Z
      // 1cc: aload 2
      // 1cd: ifnull 201
      // 1d0: ifne 1fd
      // 1d3: goto 1da
      // 1d6: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1d9: athrow
      // 1da: aload 4
      // 1dc: aload 2
      // 1dd: ifnull 1fe
      // 1e0: goto 1e7
      // 1e3: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1e6: athrow
      // 1e7: ifnonnull 1fd
      // 1ea: goto 1f1
      // 1ed: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1f0: athrow
      // 1f1: new java/lang/AssertionError
      // 1f4: dup
      // 1f5: invokespecial java/lang/AssertionError.<init> ()V
      // 1f8: athrow
      // 1f9: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1fc: athrow
      // 1fd: aload 3
      // 1fe: invokevirtual com/finalshell/core/Hd2.o ()Z
      // 201: aload 2
      // 202: ifnull 231
      // 205: ifne 230
      // 208: goto 20f
      // 20b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 20e: athrow
      // 20f: aload 3
      // 210: aload 4
      // 212: invokevirtual com/finalshell/core/Hd2.I (Lcom/finalshell/core/Hd2;)Z
      // 215: aload 2
      // 216: ifnull 231
      // 219: goto 220
      // 21c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 21f: athrow
      // 220: ifeq 230
      // 223: goto 22a
      // 226: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 229: athrow
      // 22a: bipush 1
      // 22b: ireturn
      // 22c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 22f: athrow
      // 230: bipush 0
      // 231: ireturn
   }

   public boolean m(Hd2 param1) throws B2_5 {
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
      // 04: invokevirtual com/finalshell/core/Hd2.c ()Lcom/finalshell/core/Hd2;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: ifnull 2c
      // 0d: aload 3
      // 0e: aload 2
      // 0f: ifnull 27
      // 12: aload 1
      // 13: if_acmpne 23
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: ireturn
      // 1f: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 22: athrow
      // 23: aload 3
      // 24: invokevirtual com/finalshell/core/Hd2.c ()Lcom/finalshell/core/Hd2;
      // 27: astore 3
      // 28: aload 2
      // 29: ifnonnull 09
      // 2c: bipush 0
      // 2d: ireturn
   }

   public boolean G(Hd2 param1) throws B2_5 {
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
      // 04: astore 3
      // 05: astore 2
      // 06: aload 3
      // 07: ifnull 77
      // 0a: aload 3
      // 0b: invokevirtual com/finalshell/core/Hd2.L$arrhd_2 ()[Lcom/finalshell/core/Hd2;
      // 0e: astore 4
      // 10: aload 4
      // 12: astore 5
      // 14: aload 5
      // 16: arraylength
      // 17: istore 6
      // 19: bipush 0
      // 1a: aload 2
      // 1b: ifnull 78
      // 1e: istore 7
      // 20: iload 7
      // 22: iload 6
      // 24: if_icmpge 6e
      // 27: aload 5
      // 29: iload 7
      // 2b: aaload
      // 2c: astore 8
      // 2e: aload 8
      // 30: aload 2
      // 31: ifnull 72
      // 34: aload 1
      // 35: aload 2
      // 36: ifnull 54
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 3f: athrow
      // 40: if_acmpeq 65
      // 43: goto 4a
      // 46: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 49: athrow
      // 4a: aload 8
      // 4c: aload 1
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 53: athrow
      // 54: invokevirtual com/finalshell/core/Hd2.G (Lcom/finalshell/core/Hd2;)Z
      // 57: aload 2
      // 58: ifnull 66
      // 5b: ifeq 67
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 64: athrow
      // 65: bipush 1
      // 66: ireturn
      // 67: iinc 7 1
      // 6a: aload 2
      // 6b: ifnonnull 20
      // 6e: aload 3
      // 6f: invokevirtual com/finalshell/core/Hd2.c ()Lcom/finalshell/core/Hd2;
      // 72: astore 3
      // 73: aload 2
      // 74: ifnonnull 06
      // 77: bipush 0
      // 78: ireturn
   }

   public Hd2[] W(@C_9 String param1) throws B2_5 {
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
      // 04: getfield com/finalshell/core/Hd2.C Ljava/util/Map;
      // 07: aload 1
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: checkcast [Lcom/finalshell/core/Hd2;
      // 10: astore 3
      // 11: astore 2
      // 12: aload 3
      // 13: aload 2
      // 14: ifnull 72
      // 17: ifnonnull 71
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 20: athrow
      // 21: new java/util/HashSet
      // 24: dup
      // 25: invokespecial java/util/HashSet.<init> ()V
      // 28: astore 4
      // 2a: aload 0
      // 2b: aload 1
      // 2c: aload 4
      // 2e: invokespecial com/finalshell/core/Hd2.c (Ljava/lang/String;Ljava/util/Collection;)V
      // 31: aload 4
      // 33: aload 2
      // 34: ifnull 52
      // 37: invokeinterface java/util/Set.isEmpty ()Z 1
      // 3c: ifeq 50
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 45: athrow
      // 46: getstatic com/finalshell/core/Hd2.Y [Lcom/finalshell/core/Hd2;
      // 49: goto 64
      // 4c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 4f: athrow
      // 50: aload 4
      // 52: aload 4
      // 54: invokeinterface java/util/Set.size ()I 1
      // 59: anewarray 2
      // 5c: invokeinterface java/util/Set.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 61: checkcast [Lcom/finalshell/core/Hd2;
      // 64: astore 3
      // 65: aload 0
      // 66: getfield com/finalshell/core/Hd2.C Ljava/util/Map;
      // 69: aload 1
      // 6a: aload 3
      // 6b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 70: pop
      // 71: aload 3
      // 72: areturn
   }

   public void c(@C_9 String param1, Collection param2) throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: aload 0
      // 004: invokevirtual com/finalshell/core/Hd2.p$arrhd_2 ()[Lcom/finalshell/core/Hd2;
      // 007: astore 4
      // 009: astore 3
      // 00a: aload 1
      // 00b: aload 3
      // 00c: ifnull 05e
      // 00f: ifnonnull 030
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 018: athrow
      // 019: aload 2
      // 01a: aload 4
      // 01c: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 01f: invokeinterface java/util/Collection.addAll (Ljava/util/Collection;)Z 2
      // 024: pop
      // 025: aload 3
      // 026: ifnonnull 0b2
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 02f: athrow
      // 030: new java/lang/StringBuilder
      // 033: dup
      // 034: invokespecial java/lang/StringBuilder.<init> ()V
      // 037: aload 0
      // 038: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 03b: invokestatic com/finalshell/core/F0_2.F (Ljava/lang/String;)Ljava/lang/String;
      // 03e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 041: sipush 2798
      // 044: ldc2_w 2616070818844882691
      // 047: invokestatic com/finalshell/core/Hd2.a (IJ)I
      // 04a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 04d: aload 1
      // 04e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 051: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 054: invokestatic com/finalshell/core/F0_2.n (Ljava/lang/String;)Ljava/lang/String;
      // 057: goto 05e
      // 05a: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 05d: athrow
      // 05e: astore 5
      // 060: aload 4
      // 062: astore 6
      // 064: aload 6
      // 066: arraylength
      // 067: istore 7
      // 069: bipush 0
      // 06a: istore 8
      // 06c: iload 8
      // 06e: iload 7
      // 070: if_icmpge 0b2
      // 073: aload 6
      // 075: iload 8
      // 077: aaload
      // 078: astore 9
      // 07a: aload 3
      // 07b: ifnull 0ae
      // 07e: aload 9
      // 080: aload 3
      // 081: ifnull 0b6
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 08a: athrow
      // 08b: invokevirtual com/finalshell/core/Hd2.z$String ()Ljava/lang/String;
      // 08e: aload 5
      // 090: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 093: ifeq 0ab
      // 096: goto 09d
      // 099: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 09c: athrow
      // 09d: aload 2
      // 09e: aload 9
      // 0a0: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0a5: pop
      // 0a6: return
      // 0a7: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0aa: athrow
      // 0ab: iinc 8 1
      // 0ae: aload 3
      // 0af: ifnonnull 06c
      // 0b2: aload 0
      // 0b3: invokevirtual com/finalshell/core/Hd2.c ()Lcom/finalshell/core/Hd2;
      // 0b6: astore 5
      // 0b8: aload 5
      // 0ba: aload 3
      // 0bb: ifnull 0d7
      // 0be: ifnull 0d6
      // 0c1: goto 0c8
      // 0c4: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0c7: athrow
      // 0c8: aload 5
      // 0ca: aload 1
      // 0cb: aload 2
      // 0cc: invokespecial com/finalshell/core/Hd2.c (Ljava/lang/String;Ljava/util/Collection;)V
      // 0cf: goto 0d6
      // 0d2: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: invokevirtual com/finalshell/core/Hd2.L$arrhd_2 ()[Lcom/finalshell/core/Hd2;
      // 0da: astore 5
      // 0dc: aload 5
      // 0de: arraylength
      // 0df: istore 6
      // 0e1: bipush 0
      // 0e2: istore 7
      // 0e4: iload 7
      // 0e6: iload 6
      // 0e8: if_icmpge 10b
      // 0eb: aload 5
      // 0ed: iload 7
      // 0ef: aaload
      // 0f0: astore 8
      // 0f2: aload 8
      // 0f4: aload 3
      // 0f5: ifnull 10f
      // 0f8: aload 1
      // 0f9: aload 2
      // 0fa: invokespecial com/finalshell/core/Hd2.c (Ljava/lang/String;Ljava/util/Collection;)V
      // 0fd: iinc 7 1
      // 100: aload 3
      // 101: ifnonnull 0e4
      // 104: goto 10b
      // 107: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 10a: athrow
      // 10b: aload 0
      // 10c: invokevirtual com/finalshell/core/Hd2.L$hd_2 ()Lcom/finalshell/core/Hd2;
      // 10f: astore 5
      // 111: aload 0
      // 112: invokevirtual com/finalshell/core/Hd2.i ()Lcom/finalshell/core/Hd2;
      // 115: astore 6
      // 117: aload 5
      // 119: aload 3
      // 11a: ifnull 137
      // 11d: ifnull 135
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 126: athrow
      // 127: aload 5
      // 129: aload 1
      // 12a: aload 2
      // 12b: invokespecial com/finalshell/core/Hd2.c (Ljava/lang/String;Ljava/util/Collection;)V
      // 12e: goto 135
      // 131: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 134: athrow
      // 135: aload 6
      // 137: aload 3
      // 138: ifnull 147
      // 13b: ifnull 165
      // 13e: goto 145
      // 141: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 144: athrow
      // 145: aload 6
      // 147: aload 3
      // 148: ifnull 160
      // 14b: aload 5
      // 14d: if_acmpeq 165
      // 150: goto 157
      // 153: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 156: athrow
      // 157: aload 6
      // 159: goto 160
      // 15c: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15f: athrow
      // 160: aload 1
      // 161: aload 2
      // 162: invokespecial com/finalshell/core/Hd2.c (Ljava/lang/String;Ljava/util/Collection;)V
      // 165: return
   }

   public final H4_2[] A$arrh4() throws B2_5 {
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
      // 05: getfield com/finalshell/core/Hd2.W [Lcom/finalshell/core/H4_2;
      // 08: aload 1
      // 09: ifnull 28
      // 0c: ifnull 1f
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Hd2.W [Lcom/finalshell/core/H4_2;
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Hd2.a (Lcom/finalshell/core/B2_5;)Lcom/finalshell/core/B2_5;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: invokevirtual com/finalshell/core/Hd2.a ()[Lcom/finalshell/core/H4_2;
      // 24: dup_x1
      // 25: putfield com/finalshell/core/Hd2.W [Lcom/finalshell/core/H4_2;
      // 28: areturn
   }

   public H4_2[] a() throws B2_5 {
      return u;
   }

   public void R() {
      this.K = null;
      this.p = null;
   }

   public static Hd2 R(Q4_3 var0) {
      String[] var1 = RG_2.C();

      while (true) {
         if (var0 instanceof I_2_2) {
            var0 = ((I_2_2)var0).V();
            if (var1 == null) {
               break;
            }

            if (var1 != null) {
               continue;
            }
         }

         boolean var10000 = N;
         if (var1 != null) {
            if (N) {
               break;
            }

            if (var1 == null) {
               return (Hd2)var0;
            }

            var10000 = var0 instanceof Hd2;
         }

         if (!var10000) {
            throw new AssertionError();
         }
         break;
      }

      return (Hd2)var0;
   }

   public static Logger P$Logger() {
      return b;
   }

   static {
      __vfClinit__();
   }

   public static B2_5 a(B2_5 var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ 24614) & 65535;
      if (w[var2] == null) {
         char[] var3 = i[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 90;
               break;
            case 1:
               var10000 = 135;
               break;
            case 2:
               var10000 = 9;
               break;
            case 3:
               var10000 = 249;
               break;
            case 4:
               var10000 = 161;
               break;
            case 5:
               var10000 = 165;
               break;
            case 6:
               var10000 = 131;
               break;
            case 7:
               var10000 = 240;
               break;
            case 8:
               var10000 = 193;
               break;
            case 9:
               var10000 = 46;
               break;
            case 10:
               var10000 = 143;
               break;
            case 11:
               var10000 = 86;
               break;
            case 12:
               var10000 = 223;
               break;
            case 13:
               var10000 = 235;
               break;
            case 14:
               var10000 = 31;
               break;
            case 15:
               var10000 = 103;
               break;
            case 16:
               var10000 = 70;
               break;
            case 17:
               var10000 = 159;
               break;
            case 18:
               var10000 = 113;
               break;
            case 19:
               var10000 = 206;
               break;
            case 20:
               var10000 = 217;
               break;
            case 21:
               var10000 = 134;
               break;
            case 22:
               var10000 = 137;
               break;
            case 23:
               var10000 = 84;
               break;
            case 24:
               var10000 = 244;
               break;
            case 25:
               var10000 = 83;
               break;
            case 26:
               var10000 = 24;
               break;
            case 27:
               var10000 = 151;
               break;
            case 28:
               var10000 = 130;
               break;
            case 29:
               var10000 = 218;
               break;
            case 30:
               var10000 = 157;
               break;
            case 31:
               var10000 = 185;
               break;
            case 32:
               var10000 = 41;
               break;
            case 33:
               var10000 = 230;
               break;
            case 34:
               var10000 = 233;
               break;
            case 35:
               var10000 = 53;
               break;
            case 36:
               var10000 = 150;
               break;
            case 37:
               var10000 = 142;
               break;
            case 38:
               var10000 = 220;
               break;
            case 39:
               var10000 = 49;
               break;
            case 40:
               var10000 = 250;
               break;
            case 41:
               var10000 = 149;
               break;
            case 42:
               var10000 = 17;
               break;
            case 43:
               var10000 = 91;
               break;
            case 44:
               var10000 = 94;
               break;
            case 45:
               var10000 = 210;
               break;
            case 46:
               var10000 = 16;
               break;
            case 47:
               var10000 = 190;
               break;
            case 48:
               var10000 = 99;
               break;
            case 49:
               var10000 = 164;
               break;
            case 50:
               var10000 = 204;
               break;
            case 51:
               var10000 = 136;
               break;
            case 52:
               var10000 = 6;
               break;
            case 53:
               var10000 = 234;
               break;
            case 54:
               var10000 = 255;
               break;
            case 55:
               var10000 = 81;
               break;
            case 56:
               var10000 = 232;
               break;
            case 57:
               var10000 = 78;
               break;
            case 58:
               var10000 = 22;
               break;
            case 59:
               var10000 = 153;
               break;
            case 60:
               var10000 = 20;
               break;
            case 61:
               var10000 = 118;
               break;
            case 62:
               var10000 = 197;
               break;
            case 63:
               var10000 = 166;
               break;
            case 64:
               var10000 = 92;
               break;
            case 65:
               var10000 = 0;
               break;
            case 66:
               var10000 = 180;
               break;
            case 67:
               var10000 = 187;
               break;
            case 68:
               var10000 = 163;
               break;
            case 69:
               var10000 = 209;
               break;
            case 70:
               var10000 = 121;
               break;
            case 71:
               var10000 = 172;
               break;
            case 72:
               var10000 = 42;
               break;
            case 73:
               var10000 = 178;
               break;
            case 74:
               var10000 = 129;
               break;
            case 75:
               var10000 = 101;
               break;
            case 76:
               var10000 = 33;
               break;
            case 77:
               var10000 = 177;
               break;
            case 78:
               var10000 = 88;
               break;
            case 79:
               var10000 = 251;
               break;
            case 80:
               var10000 = 243;
               break;
            case 81:
               var10000 = 97;
               break;
            case 82:
               var10000 = 104;
               break;
            case 83:
               var10000 = 57;
               break;
            case 84:
               var10000 = 219;
               break;
            case 85:
               var10000 = 2;
               break;
            case 86:
               var10000 = 102;
               break;
            case 87:
               var10000 = 174;
               break;
            case 88:
               var10000 = 114;
               break;
            case 89:
               var10000 = 194;
               break;
            case 90:
               var10000 = 167;
               break;
            case 91:
               var10000 = 100;
               break;
            case 92:
               var10000 = 15;
               break;
            case 93:
               var10000 = 95;
               break;
            case 94:
               var10000 = 96;
               break;
            case 95:
               var10000 = 188;
               break;
            case 96:
               var10000 = 122;
               break;
            case 97:
               var10000 = 221;
               break;
            case 98:
               var10000 = 208;
               break;
            case 99:
               var10000 = 128;
               break;
            case 100:
               var10000 = 52;
               break;
            case 101:
               var10000 = 112;
               break;
            case 102:
               var10000 = 207;
               break;
            case 103:
               var10000 = 23;
               break;
            case 104:
               var10000 = 156;
               break;
            case 105:
               var10000 = 7;
               break;
            case 106:
               var10000 = 3;
               break;
            case 107:
               var10000 = 133;
               break;
            case 108:
               var10000 = 98;
               break;
            case 109:
               var10000 = 27;
               break;
            case 110:
               var10000 = 28;
               break;
            case 111:
               var10000 = 189;
               break;
            case 112:
               var10000 = 238;
               break;
            case 113:
               var10000 = 184;
               break;
            case 114:
               var10000 = 171;
               break;
            case 115:
               var10000 = 85;
               break;
            case 116:
               var10000 = 182;
               break;
            case 117:
               var10000 = 37;
               break;
            case 118:
               var10000 = 26;
               break;
            case 119:
               var10000 = 173;
               break;
            case 120:
               var10000 = 21;
               break;
            case 121:
               var10000 = 141;
               break;
            case 122:
               var10000 = 214;
               break;
            case 123:
               var10000 = 252;
               break;
            case 124:
               var10000 = 76;
               break;
            case 125:
               var10000 = 77;
               break;
            case 126:
               var10000 = 247;
               break;
            case 127:
               var10000 = 168;
               break;
            case 128:
               var10000 = 116;
               break;
            case 129:
               var10000 = 115;
               break;
            case 130:
               var10000 = 145;
               break;
            case 131:
               var10000 = 175;
               break;
            case 132:
               var10000 = 213;
               break;
            case 133:
               var10000 = 93;
               break;
            case 134:
               var10000 = 40;
               break;
            case 135:
               var10000 = 4;
               break;
            case 136:
               var10000 = 48;
               break;
            case 137:
               var10000 = 160;
               break;
            case 138:
               var10000 = 19;
               break;
            case 139:
               var10000 = 13;
               break;
            case 140:
               var10000 = 64;
               break;
            case 141:
               var10000 = 202;
               break;
            case 142:
               var10000 = 246;
               break;
            case 143:
               var10000 = 34;
               break;
            case 144:
               var10000 = 25;
               break;
            case 145:
               var10000 = 147;
               break;
            case 146:
               var10000 = 32;
               break;
            case 147:
               var10000 = 50;
               break;
            case 148:
               var10000 = 239;
               break;
            case 149:
               var10000 = 152;
               break;
            case 150:
               var10000 = 196;
               break;
            case 151:
               var10000 = 201;
               break;
            case 152:
               var10000 = 54;
               break;
            case 153:
               var10000 = 119;
               break;
            case 154:
               var10000 = 183;
               break;
            case 155:
               var10000 = 195;
               break;
            case 156:
               var10000 = 12;
               break;
            case 157:
               var10000 = 203;
               break;
            case 158:
               var10000 = 229;
               break;
            case 159:
               var10000 = 10;
               break;
            case 160:
               var10000 = 222;
               break;
            case 161:
               var10000 = 231;
               break;
            case 162:
               var10000 = 62;
               break;
            case 163:
               var10000 = 11;
               break;
            case 164:
               var10000 = 199;
               break;
            case 165:
               var10000 = 212;
               break;
            case 166:
               var10000 = 225;
               break;
            case 167:
               var10000 = 215;
               break;
            case 168:
               var10000 = 248;
               break;
            case 169:
               var10000 = 132;
               break;
            case 170:
               var10000 = 55;
               break;
            case 171:
               var10000 = 146;
               break;
            case 172:
               var10000 = 254;
               break;
            case 173:
               var10000 = 67;
               break;
            case 174:
               var10000 = 65;
               break;
            case 175:
               var10000 = 39;
               break;
            case 176:
               var10000 = 18;
               break;
            case 177:
               var10000 = 155;
               break;
            case 178:
               var10000 = 111;
               break;
            case 179:
               var10000 = 140;
               break;
            case 180:
               var10000 = 127;
               break;
            case 181:
               var10000 = 66;
               break;
            case 182:
               var10000 = 108;
               break;
            case 183:
               var10000 = 227;
               break;
            case 184:
               var10000 = 179;
               break;
            case 185:
               var10000 = 73;
               break;
            case 186:
               var10000 = 148;
               break;
            case 187:
               var10000 = 125;
               break;
            case 188:
               var10000 = 5;
               break;
            case 189:
               var10000 = 237;
               break;
            case 190:
               var10000 = 61;
               break;
            case 191:
               var10000 = 107;
               break;
            case 192:
               var10000 = 120;
               break;
            case 193:
               var10000 = 29;
               break;
            case 194:
               var10000 = 186;
               break;
            case 195:
               var10000 = 14;
               break;
            case 196:
               var10000 = 45;
               break;
            case 197:
               var10000 = 59;
               break;
            case 198:
               var10000 = 236;
               break;
            case 199:
               var10000 = 245;
               break;
            case 200:
               var10000 = 72;
               break;
            case 201:
               var10000 = 30;
               break;
            case 202:
               var10000 = 68;
               break;
            case 203:
               var10000 = 126;
               break;
            case 204:
               var10000 = 138;
               break;
            case 205:
               var10000 = 56;
               break;
            case 206:
               var10000 = 74;
               break;
            case 207:
               var10000 = 211;
               break;
            case 208:
               var10000 = 154;
               break;
            case 209:
               var10000 = 89;
               break;
            case 210:
               var10000 = 47;
               break;
            case 211:
               var10000 = 170;
               break;
            case 212:
               var10000 = 176;
               break;
            case 213:
               var10000 = 139;
               break;
            case 214:
               var10000 = 226;
               break;
            case 215:
               var10000 = 110;
               break;
            case 216:
               var10000 = 1;
               break;
            case 217:
               var10000 = 224;
               break;
            case 218:
               var10000 = 38;
               break;
            case 219:
               var10000 = 82;
               break;
            case 220:
               var10000 = 63;
               break;
            case 221:
               var10000 = 106;
               break;
            case 222:
               var10000 = 191;
               break;
            case 223:
               var10000 = 253;
               break;
            case 224:
               var10000 = 44;
               break;
            case 225:
               var10000 = 79;
               break;
            case 226:
               var10000 = 80;
               break;
            case 227:
               var10000 = 8;
               break;
            case 228:
               var10000 = 60;
               break;
            case 229:
               var10000 = 87;
               break;
            case 230:
               var10000 = 158;
               break;
            case 231:
               var10000 = 205;
               break;
            case 232:
               var10000 = 43;
               break;
            case 233:
               var10000 = 241;
               break;
            case 234:
               var10000 = 200;
               break;
            case 235:
               var10000 = 216;
               break;
            case 236:
               var10000 = 51;
               break;
            case 237:
               var10000 = 105;
               break;
            case 238:
               var10000 = 169;
               break;
            case 239:
               var10000 = 117;
               break;
            case 240:
               var10000 = 162;
               break;
            case 241:
               var10000 = 69;
               break;
            case 242:
               var10000 = 35;
               break;
            case 243:
               var10000 = 75;
               break;
            case 244:
               var10000 = 109;
               break;
            case 245:
               var10000 = 181;
               break;
            case 246:
               var10000 = 192;
               break;
            case 247:
               var10000 = 144;
               break;
            case 248:
               var10000 = 123;
               break;
            case 249:
               var10000 = 124;
               break;
            case 250:
               var10000 = 198;
               break;
            case 251:
               var10000 = 71;
               break;
            case 252:
               var10000 = 228;
               break;
            case 253:
               var10000 = 36;
               break;
            case 254:
               var10000 = 242;
               break;
            default:
               var10000 = 58;
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
            var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         w[var2] = new String(var3).intern();
      }

      return w[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15843;
      if (T[var3] == null) {
         T[var3] = (int)(L[var3] ^ var1);
      }

      return T[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var39;
      String[] var13 = new String[26];
      int var11 = 0;
      String var10 = "¬Â\u0002ðË\u0002Ù)\u0002¼ \u00023\u001e\u0002Ëq\u0002K¶\u0002\u0081Æ\u0012¾_ci\u001aVÛÿ9Åx&K±¼¿:\u0010\u0002ªÄ\u0002\u009eå\u0002³u Ëd#Í\u0000hÇÞHì\u0093¤$¾>RêC5Å\u0083\u008a$ü=[¢\\\u0081\u009e\u0082\u001e\u0002\u0010Q\u0012î(i\u0087[\u008bóD<²ØÈ_l>\u0004jg\n)þd @É;(\u0080\u0098\u00022L\u0002\u0081*\u0016\r/\u0015gÔ\u0097\u0007ÉFø´\u000eÚ%íM6_Ë&\u008b\u0080$Î\u0080Ý\u0005iãÉ+ÜZâ\\Í\u0015n\fgÁ\u0092\u009cÖ×%«ë\u0083\btõÝGæùè$\u009d\u0002l\u0085\u0015\u008f6EDÞóCK*S\u001aø\tâ0vÔ¶áq_\u0002\u001c6\u0002gÓ";
      int var12 = "¬Â\u0002ðË\u0002Ù)\u0002¼ \u00023\u001e\u0002Ëq\u0002K¶\u0002\u0081Æ\u0012¾_ci\u001aVÛÿ9Åx&K±¼¿:\u0010\u0002ªÄ\u0002\u009eå\u0002³u Ëd#Í\u0000hÇÞHì\u0093¤$¾>RêC5Å\u0083\u008a$ü=[¢\\\u0081\u009e\u0082\u001e\u0002\u0010Q\u0012î(i\u0087[\u008bóD<²ØÈ_l>\u0004jg\n)þd @É;(\u0080\u0098\u00022L\u0002\u0081*\u0016\r/\u0015gÔ\u0097\u0007ÉFø´\u000eÚ%íM6_Ë&\u008b\u0080$Î\u0080Ý\u0005iãÉ+ÜZâ\\Í\u0015n\fgÁ\u0092\u009cÖ×%«ë\u0083\btõÝGæùè$\u009d\u0002l\u0085\u0015\u008f6EDÞóCK*S\u001aø\tâ0vÔ¶áq_\u0002\u001c6\u0002gÓ"
         .length();
      char var9 = 2;
      int var22 = -1;

      label85:
      while (true) {
         byte var10000 = 10;
         String var10001 = var10.substring(++var22, var22 + var9);
         byte var10002 = -1;

         while (true) {
            label80: {
               char[] var45 = var10001.toCharArray();
               int var10004 = var45.length;
               int var14 = 0;
               byte var48 = var10000;
               var39 = var45;
               int var30 = var10004;
               byte var55;
               char[] var61;
               int var10006;
               if (var10004 <= 1) {
                  var61 = var45;
                  var55 = var10000;
                  var10006 = var14;
               } else {
                  var48 = var10000;
                  var30 = var10004;
                  if (var10004 <= var14) {
                     break label80;
                  }

                  var61 = var45;
                  var55 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var70 = var61[var10006];
                  byte var71;
                  switch (var14 % 7) {
                     case 0:
                        var71 = 81;
                        break;
                     case 1:
                        var71 = 36;
                        break;
                     case 2:
                        var71 = 113;
                        break;
                     case 3:
                        var71 = 28;
                        break;
                     case 4:
                        var71 = 63;
                        break;
                     case 5:
                        var71 = 36;
                        break;
                     default:
                        var71 = 21;
                  }

                  var61[var10006] = (char)(var70 ^ var55 ^ var71);
                  var14++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var61 = var39;
                     var55 = var48;
                  } else {
                     if (var30 <= var14) {
                        break;
                     }

                     var61 = var39;
                     var55 = var48;
                     var10006 = var14;
                  }
               }
            }

            String var50 = new String(var39).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var50;
                  if ((var22 += var9) >= var12) {
                     i = var13;
                     w = new String[26];
                     long var0 = 8317457223667326940L;
                     long[] var6 = new long[17];
                     int var3 = 0;
                     String var4 = "?òñÂ\u008e¬¯\u0002`.q\u000e)è{\u000e°\u0089}Ø+¢\u0093éÄ÷_\u001cû\u008f~j¦\u0005ú#EÜiG´MB`)æ\u0010ÁGø$4Ê\u00ad\u0012Ã|\u0012ÐÕmhû¬\u007f\"¶'\u00049N«Ú\u0088½k²ò\u0093¹\u008f\u0081ç}µímÅx]ÎÿEWt-ê-¸ÉÛLµ\u0013\u00913\u0003¹\u0013È\u0012\u0007 _Þkk±(û";
                     int var5 = "?òñÂ\u008e¬¯\u0002`.q\u000e)è{\u000e°\u0089}Ø+¢\u0093éÄ÷_\u001cû\u008f~j¦\u0005ú#EÜiG´MB`)æ\u0010ÁGø$4Ê\u00ad\u0012Ã|\u0012ÐÕmhû¬\u007f\"¶'\u00049N«Ú\u0088½k²ò\u0093¹\u008f\u0081ç}µímÅx]ÎÿEWt-ê-¸ÉÛLµ\u0013\u00913\u0003¹\u0013È\u0012\u0007 _Þkk±(û"
                        .length();
                     byte var2 = 0;

                     label59:
                     while (true) {
                        byte var32 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var32, var2).getBytes("ISO-8859-1");
                        long[] var24 = var6;
                        int var33 = var3++;
                        long var43 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var51 = -1;

                        while (true) {
                           long var60 = var43 ^ var0;
                           switch (var51) {
                              case 0:
                                 var24[var33] = var60;
                                 if (var2 >= var5) {
                                    L = var6;
                                    T = new Integer[17];
                                    N = !Hd2.class.desiredAssertionStatus();
                                    b = Logger.getLogger(Hd2.class.getName());
                                    M = new He2_2();
                                    I = new Hr2_2("");
                                    s = new Hr2_2("V");
                                    E = new Hr2_2("B");
                                    O = new Hr2_2("C");
                                    D = new Hr2_2("D");
                                    l = new Hr2_2("F");
                                    G = new Hr2_2("I");
                                    S = new Hr2_2("J");
                                    e = new Hr2_2("S");
                                    t = new Hr2_2("Z");
                                    H = new HP_2[0];
                                    y = new HashSet();
                                    String[] var25 = new String[a(7359, 91374271584739660L)];
                                    var25[0] = a(24639, 15997);
                                    var25[1] = a(24615, 15995);
                                    var25[2] = a(24610, 5591);
                                    var25[3] = a(24625, -14189);
                                    var25[4] = a(24623, -6664);
                                    var25[5] = a(24624, -320);
                                    var25[a(20470, 3706966831049732639L)] = a(24620, -17215);
                                    var25[a(22046, 2854065080455523318L)] = a(24609, -14151);
                                    var25[a(12349, 6799388736099093971L)] = a(24638, 30434);
                                    var25[a(12678, 4331772014323829868L)] = a(24611, 13020);
                                    var25[a(19318, 6738677895195981457L)] = a(24621, 18646);
                                    var25[a(12529, 8283781889519488276L)] = a(24630, 11047);
                                    var25[a(3377, 1659444098196451538L)] = a(24613, -27270);
                                    var25[a(27793, 549551085531681146L)] = a(24614, 14405);
                                    var25[a(14273, 8894533008459958829L)] = a(24612, -11166);
                                    var25[a(5935, 8615691842265950912L)] = a(24608, 8857);
                                    var25[a(13035, 5670053924763373325L)] = a(24619, -24473);
                                    var25[a(23623, 6119853420808364455L)] = a(24626, 16590);
                                    var25[a(22918, 825072003426444386L)] = a(24631, 26306);
                                    String[] var15 = var25;

                                    for (String var19 : var15) {
                                       y.add(var19);
                                    }

                                    Y = new Hd2[0];
                                    u = new H4_2[0];
                                    return;
                                 }
                                 break;
                              default:
                                 var24[var33] = var60;
                                 if (var2 < var5) {
                                    continue label59;
                                 }

                                 var4 = "\u001d\u0004ÑÕ¯\f\u0095ÿ\u0005\u0010¡Q\u0084Y¾\u0083";
                                 var5 = "\u001d\u0004ÑÕ¯\f\u0095ÿ\u0005\u0010¡Q\u0084Y¾\u0083".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var24 = var6;
                           var33 = var3++;
                           var43 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var51 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var22);
                  break;
               default:
                  var13[var11++] = var50;
                  if ((var22 += var9) < var12) {
                     var9 = var10.charAt(var22);
                     continue label85;
                  }

                  var10 = "î\u000b\u0002\u0000¥";
                  var12 = "î\u000b\u0002\u0000¥".length();
                  var9 = 2;
                  var22 = -1;
            }

            var10000 = 23;
            var10001 = var10.substring(++var22, var22 + var9);
            var10002 = 0;
         }
      }
   }
}





