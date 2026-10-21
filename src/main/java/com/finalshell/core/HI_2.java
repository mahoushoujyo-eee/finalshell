package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HI_2 extends C2_5{
   public int K = -1;
   @C_9
   public Y_5 v;
   public final Hn2_2 z = new Hn2_2();
   @C_9
   public C_a_2[] O;
   public java.lang.Class u = N2_5.M;
   @C_9
   public Method[] B;
   public static boolean X;
   public static String[] c;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;

   public void e(@C_9 ClassLoader var1) {
      this.z.w(var1);
   }

   public void L(boolean var1, boolean var2, boolean var3) {
      this.z.N(var1, var2, var3);
   }

   @Override
   public void n(int var1) {
      this.z.n(var1);
      this.K = var1;
   }

   @Override
   public void v(int var1) {
      this.z.v(var1);
   }

   public void e$void(@C_9 U_5 var1) {
      this.z.q(var1);
   }

   public void s(@C_9 Y_5 var1) {
      this.z.t(var1);
      this.v = var1;
   }

   public EnumSet u() {
      return this.z.z();
   }

   public HI_2 S(EnumSet var1) {
      this.z.p(var1);
      return this;
   }

   public void E(int param1) {
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
      // 04: getfield com/finalshell/core/HI_2.O [Lcom/finalshell/core/C_a_2;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 2
      // 0a: ifnull 22
      // 0d: aload 3
      // 0e: ifnonnull 60
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: iload 1
      // 1a: anewarray 87
      // 1d: dup
      // 1e: astore 3
      // 1f: putfield com/finalshell/core/HI_2.O [Lcom/finalshell/core/C_a_2;
      // 22: bipush 0
      // 23: istore 4
      // 25: iload 4
      // 27: iload 1
      // 28: if_icmpge 5c
      // 2b: aload 3
      // 2c: iload 4
      // 2e: new com/finalshell/core/C_a_2
      // 31: dup
      // 32: aload 0
      // 33: sipush 27890
      // 36: sipush -3345
      // 39: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 3c: ldc "*"
      // 3e: iload 4
      // 40: invokestatic java/lang/Integer.toString (I)Ljava/lang/String;
      // 43: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 46: invokespecial com/finalshell/core/C_a_2.<init> (Lcom/finalshell/core/HI_2;Ljava/lang/String;)V
      // 49: aastore
      // 4a: iinc 4 1
      // 4d: aload 2
      // 4e: ifnull a4
      // 51: aload 2
      // 52: ifnonnull 25
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: aload 2
      // 5d: ifnonnull a4
      // 60: iload 1
      // 61: aload 3
      // 62: arraylength
      // 63: if_icmpeq a4
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: new java/lang/IllegalArgumentException
      // 70: dup
      // 71: new java/lang/StringBuilder
      // 74: dup
      // 75: invokespecial java/lang/StringBuilder.<init> ()V
      // 78: sipush 27886
      // 7b: sipush 30240
      // 7e: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: aload 3
      // 85: arraylength
      // 86: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 89: sipush 27884
      // 8c: sipush -16447
      // 8f: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 92: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 95: iload 1
      // 96: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 99: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9c: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 9f: athrow
      // a0: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3: athrow
      // a4: return
   }

   public C_a_2 Z(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/HI_2.O [Lcom/finalshell/core/C_a_2;
      // 08: aload 2
      // 09: ifnull 21
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/HI_2.O [Lcom/finalshell/core/C_a_2;
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 1
      // 22: aaload
      // 23: areturn
      // 24: new java/lang/IllegalStateException
      // 27: dup
      // 28: sipush 27901
      // 2b: sipush -15526
      // 2e: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 31: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 34: athrow
   }

   public HI_2(String var1) throws B2_5 {
      this.D(var1);
   }

   public HI_2(String var1, java.lang.Class var2) throws B2_5 {
      this.J(var2);
      this.D(var1);
   }

   public HI_2(String var1, java.lang.Class var2, String[] var3, java.lang.Class[] var4) throws B2_5 {
      this.J(var2);
      this.N(var3, var4);
      this.D(var1);
   }

   public HI_2(String var1, java.lang.Class var2, String[] var3, java.lang.Class[] var4, java.lang.Class[] var5) throws B2_5 {
      this.J(var2);
      this.N(var3, var4);
      this.I(var5);
      this.D(var1);
   }

   public HI_2(@C_9 String var1, InputStream var2, java.lang.Class var3, String[] var4, java.lang.Class[] var5, java.lang.Class[] var6, @C_9 ClassLoader var7) throws B2_5, IOException {
      this.J(var3);
      this.N(var4, var5);
      this.I(var6);
      this.e(var7);
      this.f(var1, var2);
   }

   public HI_2(@C_9 String var1, Reader var2, java.lang.Class var3, String[] var4, java.lang.Class[] var5, java.lang.Class[] var6, @C_9 ClassLoader var7) throws B2_5, IOException {
      this.J(var3);
      this.N(var4, var5);
      this.I(var6);
      this.e(var7);
      this.Y(var1, var2);
   }

   public HI_2(Hc2_2 var1, java.lang.Class var2, String[] var3, java.lang.Class[] var4, java.lang.Class[] var5, @C_9 ClassLoader var6) throws B2_5, IOException {
      this.J(var2);
      this.N(var3, var4);
      this.I(var5);
      this.e(var6);
      this.W(new Hc2_2[]{var1});
   }

   public HI_2(
      Hc2_2 var1,
      @C_9 java.lang.Class var2,
      java.lang.Class[] var3,
      java.lang.Class var4,
      String[] var5,
      java.lang.Class[] var6,
      java.lang.Class[] var7,
      @C_9 ClassLoader var8
   ) throws B2_5, IOException {
      this.c(var2);
      this.j(var3);
      this.J(var4);
      this.N(var5, var6);
      this.I(var7);
      this.e(var8);
      this.W(new Hc2_2[]{var1});
   }

   public HI_2(
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
      this.Z(var2);
      this.c(var3);
      this.j(var4);
      this.Y(var5);
      this.J(var6);
      this.L(var7);
      this.N(var8, var9);
      this.I(var10);
      this.e(var11);
      this.W(new Hc2_2[]{var1});
   }

   public HI_2() {
   }

   public HI_2(int var1) {
      this.E(var1);
   }


   public void Z(String var1) {
      this.z.t(var1);
   }


   public void j(java.lang.Class[] var1) {
      this.z.P(var1);
   }


   public void c(@C_9 java.lang.Class var1) {
      this.z.Q(var1);
   }


   public void A(java.lang.Class var1) {
      this.u = var1;
   }


   public java.lang.Class c() {
      return this.u;
   }


   public void h(boolean var1) {
      this.e(new boolean[]{var1});
   }


   public void Y(boolean var1) {
      this.p(new boolean[]{var1});
   }


   public void J(@C_9 java.lang.Class var1) {
      this.B(new java.lang.Class[]{var1});
   }


   public void L(@C_9 String var1) {
      this.E(new String[]{var1});
   }


   public void N(String[] var1, java.lang.Class[] var2) {
      this.Y(new String[][]{var1}, new java.lang.Class[][]{var2});
   }


   public void I(java.lang.Class[] var1) {
      this.q(new java.lang.Class[][]{var1});
   }


   public void e(boolean[] var1) {
      this.E(var1.length);
      String[] var10000 = RG_2.C();
      int var3 = 0;
      String[] var2 = var10000;

      while (var3 < var1.length) {
         this.Z(var3).i = var1[var3];
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }


   public void p(boolean[] var1) {
      String[] var10000 = RG_2.C();
      this.E(var1.length);
      int var3 = 0;
      String[] var2 = var10000;

      while (var3 < var1.length) {
         this.Z(var3).G = var1[var3];
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }


   public void B(java.lang.Class[] var1) {
      this.E(var1.length);
      String[] var10000 = RG_2.C();
      int var3 = 0;
      String[] var2 = var10000;

      while (var3 < var1.length) {
         this.Z(var3).K = var1[var3];
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }


   public void E(String[] var1) {
      String[] var10000 = RG_2.C();
      this.E(var1.length);
      String[] var2 = var10000;
      int var3 = 0;

      while (var3 < var1.length) {
         C_a_2.q(this.Z(var3), var1[var3]);
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }


   public void Y(String[][] var1, java.lang.Class[][] var2) {
      String[] var10000 = RG_2.C();
      this.E(var1.length);
      String[] var3 = var10000;
      this.E(var2.length);
      int var4 = 0;

      while (var4 < var1.length) {
         C_a_2 var5 = this.Z(var4);
         C_a_2.R(var5, (String[])var1[var4].clone());
         C_a_2.d(var5, (java.lang.Class[])var2[var4].clone());
         var4++;
         if (var3 == null) {
            break;
         }
      }
   }


   public void q(java.lang.Class[][] var1) {
      String[] var10000 = RG_2.C();
      this.E(var1.length);
      String[] var2 = var10000;
      int var3 = 0;

      while (var3 < var1.length) {
         C_a_2.c(this.Z(var3), var1[var3]);
         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void Y(@C_9 String var1, Reader var2) throws B2_5, IOException {
      this.W(new Hc2_2[]{new Hc2_2(var1, var2)});
   }

   @Override
   public final void a(String[] var1, Reader[] var2) throws B2_5, IOException {
      String[] var10000 = RG_2.C();
      this.E(var1.length);
      this.E(var2.length);
      Hc2_2[] var4 = new Hc2_2[var2.length];
      int var5 = 0;
      String[] var3 = var10000;

      while (true) {
         if (var5 < var2.length) {
            try {
               var4[var5] = new Hc2_2(var1[var5], var2[var5]);
               var5++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            } catch (B2_5 var6) {
               throw a(var6);
            }
         }

         this.W(var4);
         break;
      }
   }

   public final void W(Hc2_2[] var1) throws B2_5, IOException {
      String[] var10000 = RG_2.C();
      this.E(var1.length);
      String[] var2 = var10000;
      HG[] var3 = new HG[var1.length];
      int var4 = 0;

      while (true) {
         if (var4 < var1.length) {
            try {
               var3[var4] = new HG(var1[var4]);
               var3[var4].Q(this.K);
               var3[var4].S(this.v);
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

         this.J(var3);
         break;
      }
   }

   public final void J(HG[] param1) throws B2_5, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 03: aload 1
      // 04: arraylength
      // 05: istore 3
      // 06: aload 0
      // 07: iload 3
      // 08: invokevirtual com/finalshell/core/HI_2.E (I)V
      // 0b: astore 2
      // 0c: iload 3
      // 0d: bipush 1
      // 0e: if_icmpne 1b
      // 11: aload 1
      // 12: bipush 0
      // 13: aaload
      // 14: goto 1c
      // 17: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aconst_null
      // 1c: astore 4
      // 1e: aload 0
      // 1f: aload 4
      // 21: invokevirtual com/finalshell/core/HI_2.A (Lcom/finalshell/core/HG;)[Lcom/finalshell/core/FK;
      // 24: astore 5
      // 26: iload 3
      // 27: anewarray 270
      // 2a: astore 6
      // 2c: iload 3
      // 2d: anewarray 272
      // 30: astore 7
      // 32: bipush 0
      // 33: istore 8
      // 35: iload 8
      // 37: iload 3
      // 38: if_icmpge 9f
      // 3b: new java/util/ArrayList
      // 3e: dup
      // 3f: invokespecial java/util/ArrayList.<init> ()V
      // 42: astore 9
      // 44: new java/util/ArrayList
      // 47: dup
      // 48: invokespecial java/util/ArrayList.<init> ()V
      // 4b: astore 10
      // 4d: aload 0
      // 4e: iload 8
      // 50: aload 1
      // 51: iload 8
      // 53: aaload
      // 54: aload 9
      // 56: aload 10
      // 58: invokevirtual com/finalshell/core/HI_2.N (ILcom/finalshell/core/HG;Ljava/util/List;Ljava/util/List;)V
      // 5b: aload 6
      // 5d: iload 8
      // 5f: aload 9
      // 61: aload 9
      // 63: invokeinterface java/util/List.size ()I 1
      // 68: anewarray 286
      // 6b: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 70: checkcast [Lcom/finalshell/core/C_r_2;
      // 73: aastore
      // 74: aload 7
      // 76: iload 8
      // 78: aload 10
      // 7a: aload 10
      // 7c: invokeinterface java/util/List.size ()I 1
      // 81: anewarray 292
      // 84: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 89: checkcast [Lcom/finalshell/core/NS;
      // 8c: aastore
      // 8d: iinc 8 1
      // 90: aload 2
      // 91: ifnull ce
      // 94: aload 2
      // 95: ifnonnull 35
      // 98: goto 9f
      // 9b: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: aload 0
      // a0: aload 1
      // a1: aload 2
      // a2: ifnull b9
      // a5: arraylength
      // a6: bipush 1
      // a7: if_icmplt c4
      // aa: goto b1
      // ad: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b0: athrow
      // b1: aload 1
      // b2: goto b9
      // b5: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8: athrow
      // b9: bipush 0
      // ba: aaload
      // bb: invokevirtual com/finalshell/core/HG.g$hc_2 ()Lcom/finalshell/core/Hc2_2;
      // be: invokevirtual com/finalshell/core/Hc2_2.F ()Ljava/lang/String;
      // c1: goto c5
      // c4: aconst_null
      // c5: aload 5
      // c7: aload 6
      // c9: aload 7
      // cb: invokevirtual com/finalshell/core/HI_2.D (Ljava/lang/String;[Lcom/finalshell/core/FK;[[Lcom/finalshell/core/C_r_2;[[Lcom/finalshell/core/NS;)V
      // ce: return
   }

   public void D(@C_9 String param1, FK[] param2, C_r_2[][] param3, NS[][] param4) throws B2_5 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: arraylength
      // 002: istore 6
      // 004: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 007: new java/util/ArrayList
      // 00a: dup
      // 00b: invokespecial java/util/ArrayList.<init> ()V
      // 00e: astore 7
      // 010: astore 5
      // 012: bipush 0
      // 013: istore 8
      // 015: iload 8
      // 017: iload 6
      // 019: if_icmpge 12a
      // 01c: aload 0
      // 01d: iload 8
      // 01f: invokespecial com/finalshell/core/HI_2.Z (I)Lcom/finalshell/core/C_a_2;
      // 022: astore 9
      // 024: aload 3
      // 025: iload 8
      // 027: aaload
      // 028: astore 10
      // 02a: aload 4
      // 02c: iload 8
      // 02e: aaload
      // 02f: astore 11
      // 031: aload 5
      // 033: ifnull 139
      // 036: aload 10
      // 038: aload 5
      // 03a: ifnull 05b
      // 03d: goto 044
      // 040: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: arraylength
      // 045: ifne 059
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: getstatic com/finalshell/ui/model/I.z Lcom/finalshell/ui/model/I;
      // 052: goto 062
      // 055: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: aload 10
      // 05b: bipush 0
      // 05c: aaload
      // 05d: invokeinterface com/finalshell/core/C_r_2.Q ()Lcom/finalshell/ui/model/I; 1
      // 062: astore 12
      // 064: aload 9
      // 066: getfield com/finalshell/core/C_a_2.K Ljava/lang/Class;
      // 069: astore 13
      // 06b: aload 13
      // 06d: aload 5
      // 06f: ifnull 087
      // 072: ifnonnull 089
      // 075: goto 07c
      // 078: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 0
      // 07d: invokevirtual com/finalshell/core/HI_2.c ()Ljava/lang/Class;
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: astore 13
      // 089: aload 7
      // 08b: aload 0
      // 08c: aload 12
      // 08e: aload 9
      // 090: getfield com/finalshell/core/C_a_2.i Z
      // 093: aload 5
      // 095: ifnull 0c1
      // 098: ifeq 0c0
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: bipush 1
      // 0a3: anewarray 314
      // 0a6: dup
      // 0a7: bipush 0
      // 0a8: new com/finalshell/core/RA
      // 0ab: dup
      // 0ac: aload 0
      // 0ad: aload 12
      // 0af: ldc_w java/lang/Override
      // 0b2: invokevirtual com/finalshell/core/HI_2.k (Lcom/finalshell/ui/model/I;Ljava/lang/Class;)Lcom/finalshell/core/Nt2_2;
      // 0b5: invokespecial com/finalshell/core/RA.<init> (Lcom/finalshell/core/Nt2_2;)V
      // 0b8: aastore
      // 0b9: goto 0c4
      // 0bc: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: bipush 0
      // 0c1: anewarray 314
      // 0c4: aload 9
      // 0c6: getfield com/finalshell/core/C_a_2.G Z
      // 0c9: aload 13
      // 0cb: aload 9
      // 0cd: invokestatic com/finalshell/core/C_a_2.E (Lcom/finalshell/core/C_a_2;)Ljava/lang/String;
      // 0d0: aload 9
      // 0d2: invokestatic com/finalshell/core/C_a_2.V (Lcom/finalshell/core/C_a_2;)[Ljava/lang/Class;
      // 0d5: aload 9
      // 0d7: invokestatic com/finalshell/core/C_a_2.x (Lcom/finalshell/core/C_a_2;)[Ljava/lang/String;
      // 0da: aload 9
      // 0dc: invokestatic com/finalshell/core/C_a_2.B (Lcom/finalshell/core/C_a_2;)[Ljava/lang/Class;
      // 0df: aload 10
      // 0e1: invokespecial com/finalshell/core/HI_2.L (Lcom/finalshell/ui/model/I;[Lcom/finalshell/core/HV_2;ZLjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;[Lcom/finalshell/core/C_r_2;)Lcom/finalshell/core/NS;
      // 0e4: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 0e9: pop
      // 0ea: aload 11
      // 0ec: astore 14
      // 0ee: aload 14
      // 0f0: arraylength
      // 0f1: istore 15
      // 0f3: bipush 0
      // 0f4: istore 16
      // 0f6: iload 16
      // 0f8: iload 15
      // 0fa: if_icmpge 122
      // 0fd: aload 14
      // 0ff: iload 16
      // 101: aaload
      // 102: astore 17
      // 104: aload 7
      // 106: aload 17
      // 108: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 10d: pop
      // 10e: iinc 16 1
      // 111: aload 5
      // 113: ifnull 125
      // 116: aload 5
      // 118: ifnonnull 0f6
      // 11b: goto 122
      // 11e: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: iinc 8 1
      // 125: aload 5
      // 127: ifnonnull 015
      // 12a: aload 0
      // 12b: new com/finalshell/core/RD
      // 12e: dup
      // 12f: aload 1
      // 130: aload 2
      // 131: invokespecial com/finalshell/core/RD.<init> (Ljava/lang/String;[Lcom/finalshell/core/FK;)V
      // 134: aload 7
      // 136: invokevirtual com/finalshell/core/HI_2.b (Lcom/finalshell/core/RD;Ljava/util/Collection;)V
      // 139: return
   }

   public final void b(RD var1, Collection var2) throws B2_5 {
      C_E_2 var4 = this.z.X(((NS)var2.iterator().next()).Q(), var1);
      String[] var10000 = RG_2.C();
      Iterator var5 = var2.iterator();
      String[] var3 = var10000;

      while (true) {
         if (var5.hasNext()) {
            NS var6 = (NS)var5.next();

            try {
               var4.O(var6);
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

         this.n(var1);
         break;
      }
   }

   public FK[] A(@C_9 HG var1) throws B2_5, IOException {
      return this.z.q(var1);
   }


   public Method[] C() {
      return this.Z();
   }

   public Method[] Z() {
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
      // 004: getfield com/finalshell/core/HI_2.B [Ljava/lang/reflect/Method;
      // 007: astore 2
      // 008: astore 1
      // 009: aload 2
      // 00a: aload 1
      // 00b: ifnull 019
      // 00e: ifnull 01a
      // 011: goto 018
      // 014: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: aload 2
      // 019: areturn
      // 01a: aload 0
      // 01b: invokevirtual com/finalshell/core/HI_2.e ()Ljava/lang/Class;
      // 01e: astore 3
      // 01f: getstatic com/finalshell/core/HI_2.X Z
      // 022: aload 1
      // 023: ifnull 05a
      // 026: ifne 055
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield com/finalshell/core/HI_2.O [Lcom/finalshell/core/C_a_2;
      // 034: aload 1
      // 035: ifnull 059
      // 038: goto 03f
      // 03b: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: ifnonnull 055
      // 042: goto 049
      // 045: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: new java/lang/AssertionError
      // 04c: dup
      // 04d: invokespecial java/lang/AssertionError.<init> ()V
      // 050: athrow
      // 051: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: aload 0
      // 056: getfield com/finalshell/core/HI_2.O [Lcom/finalshell/core/C_a_2;
      // 059: arraylength
      // 05a: istore 4
      // 05c: iload 4
      // 05e: anewarray 397
      // 061: astore 2
      // 062: new java/util/HashMap
      // 065: dup
      // 066: bipush 2
      // 067: iload 4
      // 069: imul
      // 06a: invokespecial java/util/HashMap.<init> (I)V
      // 06d: astore 5
      // 06f: bipush 0
      // 070: istore 6
      // 072: iload 6
      // 074: iload 4
      // 076: if_icmpge 0cf
      // 079: aload 0
      // 07a: iload 6
      // 07c: invokespecial com/finalshell/core/HI_2.Z (I)Lcom/finalshell/core/C_a_2;
      // 07f: astore 7
      // 081: aload 5
      // 083: aload 7
      // 085: invokestatic com/finalshell/core/C_a_2.E (Lcom/finalshell/core/C_a_2;)Ljava/lang/String;
      // 088: aload 7
      // 08a: invokestatic com/finalshell/core/C_a_2.V (Lcom/finalshell/core/C_a_2;)[Ljava/lang/Class;
      // 08d: invokestatic com/finalshell/core/HI_2.R (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;
      // 090: iload 6
      // 092: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 095: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 09a: checkcast java/lang/Integer
      // 09d: astore 8
      // 09f: aload 1
      // 0a0: ifnull 0cb
      // 0a3: getstatic com/finalshell/core/HI_2.X Z
      // 0a6: ifne 0c8
      // 0a9: goto 0b0
      // 0ac: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: aload 8
      // 0b2: ifnull 0c8
      // 0b5: goto 0bc
      // 0b8: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: new java/lang/AssertionError
      // 0bf: dup
      // 0c0: invokespecial java/lang/AssertionError.<init> ()V
      // 0c3: athrow
      // 0c4: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: iinc 6 1
      // 0cb: aload 1
      // 0cc: ifnonnull 072
      // 0cf: aload 3
      // 0d0: invokevirtual java/lang/Class.getDeclaredMethods ()[Ljava/lang/reflect/Method;
      // 0d3: astore 6
      // 0d5: aload 6
      // 0d7: arraylength
      // 0d8: istore 7
      // 0da: bipush 0
      // 0db: istore 8
      // 0dd: iload 8
      // 0df: iload 7
      // 0e1: if_icmpge 14e
      // 0e4: aload 6
      // 0e6: iload 8
      // 0e8: aaload
      // 0e9: astore 9
      // 0eb: aload 5
      // 0ed: aload 9
      // 0ef: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 0f2: aload 9
      // 0f4: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 0f7: invokestatic com/finalshell/core/HI_2.R (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;
      // 0fa: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0ff: checkcast java/lang/Integer
      // 102: astore 10
      // 104: aload 10
      // 106: ifnonnull 110
      // 109: goto 147
      // 10c: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: getstatic com/finalshell/core/HI_2.X Z
      // 113: ifne 13e
      // 116: aload 2
      // 117: aload 10
      // 119: invokevirtual java/lang/Integer.intValue ()I
      // 11c: aload 1
      // 11d: ifnull 144
      // 120: goto 127
      // 123: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: aaload
      // 128: ifnull 13e
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 131: athrow
      // 132: new java/lang/AssertionError
      // 135: dup
      // 136: invokespecial java/lang/AssertionError.<init> ()V
      // 139: athrow
      // 13a: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: aload 2
      // 13f: aload 10
      // 141: invokevirtual java/lang/Integer.intValue ()I
      // 144: aload 9
      // 146: aastore
      // 147: iinc 8 1
      // 14a: aload 1
      // 14b: ifnonnull 0dd
      // 14e: bipush 0
      // 14f: istore 6
      // 151: iload 6
      // 153: iload 4
      // 155: if_icmpge 1b6
      // 158: aload 2
      // 159: aload 1
      // 15a: ifnull 1bc
      // 15d: iload 6
      // 15f: aaload
      // 160: ifnonnull 1af
      // 163: goto 16a
      // 166: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: new com/finalshell/core/P_5
      // 16d: dup
      // 16e: new java/lang/StringBuilder
      // 171: dup
      // 172: invokespecial java/lang/StringBuilder.<init> ()V
      // 175: sipush 27903
      // 178: sipush 19063
      // 17b: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 17e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 181: aload 0
      // 182: iload 6
      // 184: invokespecial com/finalshell/core/HI_2.Z (I)Lcom/finalshell/core/C_a_2;
      // 187: invokestatic com/finalshell/core/C_a_2.E (Lcom/finalshell/core/C_a_2;)Ljava/lang/String;
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: sipush 27882
      // 190: sipush -15838
      // 193: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 199: iload 6
      // 19b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 19e: ldc_w ")"
      // 1a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a7: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 1aa: athrow
      // 1ab: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ae: athrow
      // 1af: iinc 6 1
      // 1b2: aload 1
      // 1b3: ifnonnull 151
      // 1b6: aload 0
      // 1b7: aload 2
      // 1b8: dup_x1
      // 1b9: putfield com/finalshell/core/HI_2.B [Ljava/lang/reflect/Method;
      // 1bc: areturn
   }

   @C_9
   public Nt2_2 N(com.finalshell.ui.model.I var1, @C_9 java.lang.Class var2) {
      return this.z.k(var1, var2);
   }

   public Nt2_2 k(com.finalshell.ui.model.I var1, java.lang.Class var2) {
      return this.z.N(var1, var2);
   }

   public Nt2_2[] v(com.finalshell.ui.model.I var1, java.lang.Class[] var2) {
      return this.z.m(var1, var2);
   }

   public void n(RD var1) throws B2_5 {
      this.z.o(var1);
   }

   public static Object R(String var0, java.lang.Class[] var1) {
      return Arrays.asList(l(var0, var1, Object.class));
   }

   public static Object[] l(Object var0, Object[] var1, java.lang.Class var2) {
      Object[] var3 = (Object[])Array.newInstance(var2, 1 + var1.length);
      var3[0] = var0;
      System.arraycopy(var1, 0, var3, 1, var1.length);
      return var3;
   }

   @C_9

   public Object s$Object(@C_9 Object[] var1) throws InvocationTargetException {
      return this.W(0, var1);
   }

   @C_9

   public Object W(int var1, @C_9 Object[] var2) throws InvocationTargetException {
      Method var3 = this.R(var1);

      try {
         return var3.invoke(null, var2);
      } catch (IllegalAccessException var5) {
         throw new P_5(var5.toString(), var5);
      }
   }


   public Method E() {
      return this.R(0);
   }


   public Method R(int var1) {
      return this.Z()[var1];
   }


   public java.lang.Class e() {
      return this.z.t();
   }

   @Override
   public Map Q() {
      return this.z.Q();
   }

   @C_9
   public final java.lang.Class L(int var1) {
      return this.Z(var1).K;
   }

   public void N(int var1, HG var2, List var3, List var4) throws B2_5, IOException {
      String[] var5 = RG_2.C();

      while (!var2.d(com.finalshell.ui.model.F2_2.END_OF_INPUT)) {
         s(var2, var3, var4);
         if (var5 == null) {
            break;
         }
      }
   }

   public static void s(HG param0, List param1, List param2) throws B2_5, IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/RG_2.C ()[Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: getstatic com/finalshell/ui/model/F2_2.IDENTIFIER Lcom/finalshell/ui/model/F2_2;
      // 008: invokevirtual com/finalshell/core/HG.d (Lcom/finalshell/ui/model/F2_2;)Z
      // 00b: aload 3
      // 00c: ifnull 128
      // 00f: ifeq 035
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 018: athrow
      // 019: aload 0
      // 01a: ldc_w ":"
      // 01d: invokevirtual com/finalshell/core/HG.k (Ljava/lang/String;)Z
      // 020: aload 3
      // 021: ifnull 148
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: ifne 137
      // 02e: goto 035
      // 031: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: aload 0
      // 036: sipush 29636
      // 039: ldc2_w 1855433022880526553
      // 03c: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 03f: anewarray 100
      // 042: dup
      // 043: bipush 0
      // 044: sipush 27877
      // 047: sipush -11789
      // 04a: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 04d: aastore
      // 04e: dup
      // 04f: bipush 1
      // 050: sipush 27881
      // 053: sipush -25740
      // 056: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 059: aastore
      // 05a: dup
      // 05b: bipush 2
      // 05c: sipush 27876
      // 05f: sipush 14162
      // 062: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 065: aastore
      // 066: dup
      // 067: bipush 3
      // 068: sipush 27878
      // 06b: sipush -433
      // 06e: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 071: aastore
      // 072: dup
      // 073: bipush 4
      // 074: sipush 27900
      // 077: sipush 11664
      // 07a: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 07d: aastore
      // 07e: dup
      // 07f: bipush 5
      // 080: sipush 27893
      // 083: sipush -26216
      // 086: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 089: aastore
      // 08a: dup
      // 08b: sipush 29588
      // 08e: ldc2_w 2463760692835594379
      // 091: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 094: sipush 27899
      // 097: sipush -29215
      // 09a: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 09d: aastore
      // 09e: dup
      // 09f: sipush 10851
      // 0a2: ldc2_w 248250037839554943
      // 0a5: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 0a8: sipush 27875
      // 0ab: sipush -9214
      // 0ae: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 0b1: aastore
      // 0b2: dup
      // 0b3: sipush 10778
      // 0b6: ldc2_w 2858918420207167745
      // 0b9: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 0bc: sipush 27891
      // 0bf: sipush -2265
      // 0c2: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 0c5: aastore
      // 0c6: dup
      // 0c7: sipush 5076
      // 0ca: ldc2_w 8476109761066094784
      // 0cd: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 0d0: sipush 27880
      // 0d3: sipush -20010
      // 0d6: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 0d9: aastore
      // 0da: dup
      // 0db: sipush 19853
      // 0de: ldc2_w 3727565594618465941
      // 0e1: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 0e4: sipush 27897
      // 0e7: sipush -11819
      // 0ea: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 0ed: aastore
      // 0ee: dup
      // 0ef: sipush 7348
      // 0f2: ldc2_w 3677816505998860206
      // 0f5: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 0f8: sipush 27902
      // 0fb: sipush 26631
      // 0fe: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 101: aastore
      // 102: dup
      // 103: sipush 30190
      // 106: ldc2_w 4638680191467665136
      // 109: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 10c: ldc_w "{"
      // 10f: aastore
      // 110: dup
      // 111: sipush 15261
      // 114: ldc2_w 4354910627044915332
      // 117: invokestatic com/finalshell/core/HI_2.a (IJ)I
      // 11a: ldc_w ";"
      // 11d: aastore
      // 11e: invokevirtual com/finalshell/core/HG.a ([Ljava/lang/String;)I
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: aload 3
      // 129: ifnull 162
      // 12c: bipush -1
      // 12d: if_icmpeq 14a
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 136: athrow
      // 137: aload 1
      // 138: aload 0
      // 139: invokevirtual com/finalshell/core/HG.W$R8 ()Lcom/finalshell/core/R8_2;
      // 13c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 141: goto 148
      // 144: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 147: athrow
      // 148: pop
      // 149: return
      // 14a: aload 0
      // 14b: aload 3
      // 14c: ifnull 188
      // 14f: sipush 27885
      // 152: sipush -27106
      // 155: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 158: invokevirtual com/finalshell/core/HG.I (Ljava/lang/String;)Z
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: ifeq 187
      // 165: aload 0
      // 166: aconst_null
      // 167: bipush 0
      // 168: anewarray 555
      // 16b: getstatic com/finalshell/ui/model/G3.BLOCK Lcom/finalshell/ui/model/G3;
      // 16e: invokevirtual com/finalshell/core/HG.f (Ljava/lang/String;[Lcom/finalshell/core/Fu2_2;Lcom/finalshell/ui/model/G3;)Lcom/finalshell/core/C_D;
      // 171: checkcast com/finalshell/core/C_1_2
      // 174: astore 4
      // 176: aload 1
      // 177: new com/finalshell/core/RM_2
      // 17a: dup
      // 17b: aload 4
      // 17d: invokespecial com/finalshell/core/RM_2.<init> (Lcom/finalshell/core/C_1_2;)V
      // 180: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 185: pop
      // 186: return
      // 187: aload 0
      // 188: invokevirtual com/finalshell/core/HG.c$arrfu_2 ()[Lcom/finalshell/core/Fu2_2;
      // 18b: astore 4
      // 18d: aload 0
      // 18e: sipush 27894
      // 191: sipush 22616
      // 194: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 197: invokevirtual com/finalshell/core/HG.I (Ljava/lang/String;)Z
      // 19a: aload 3
      // 19b: ifnull 1d8
      // 19e: ifeq 1d5
      // 1a1: goto 1a8
      // 1a4: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: getstatic com/finalshell/ui/model/F2_2.IDENTIFIER Lcom/finalshell/ui/model/F2_2;
      // 1ac: invokevirtual com/finalshell/core/HG.Z (Lcom/finalshell/ui/model/F2_2;)Ljava/lang/String;
      // 1af: astore 5
      // 1b1: aload 2
      // 1b2: aload 0
      // 1b3: aconst_null
      // 1b4: aload 4
      // 1b6: aconst_null
      // 1b7: new com/finalshell/core/NK_2
      // 1ba: dup
      // 1bb: aload 0
      // 1bc: invokevirtual com/finalshell/core/HG.C$I ()Lcom/finalshell/ui/model/I;
      // 1bf: getstatic com/finalshell/ui/model/D4.VOID Lcom/finalshell/ui/model/D4;
      // 1c2: invokespecial com/finalshell/core/NK_2.<init> (Lcom/finalshell/ui/model/I;Lcom/finalshell/ui/model/D4;)V
      // 1c5: aload 5
      // 1c7: bipush 0
      // 1c8: getstatic com/finalshell/ui/model/X_2.CLASS_DECLARATION Lcom/finalshell/ui/model/X_2;
      // 1cb: invokevirtual com/finalshell/core/HG.K (Ljava/lang/String;[Lcom/finalshell/core/Fu2_2;[Lcom/finalshell/core/C_U;Lcom/finalshell/core/Nt2_2;Ljava/lang/String;ZLcom/finalshell/ui/model/X_2;)Lcom/finalshell/core/NS;
      // 1ce: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d3: pop
      // 1d4: return
      // 1d5: aload 4
      // 1d7: arraylength
      // 1d8: ifle 255
      // 1db: aload 0
      // 1dc: invokevirtual com/finalshell/core/HG.H$Nt_2 ()Lcom/finalshell/core/Nt2_2;
      // 1df: astore 5
      // 1e1: aload 0
      // 1e2: getstatic com/finalshell/ui/model/F2_2.IDENTIFIER Lcom/finalshell/ui/model/F2_2;
      // 1e5: invokevirtual com/finalshell/core/HG.d (Lcom/finalshell/ui/model/F2_2;)Z
      // 1e8: aload 3
      // 1e9: ifnull 24c
      // 1ec: ifeq 233
      // 1ef: goto 1f6
      // 1f2: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: ldc_w "("
      // 1fa: invokevirtual com/finalshell/core/HG.k (Ljava/lang/String;)Z
      // 1fd: aload 3
      // 1fe: ifnull 24c
      // 201: goto 208
      // 204: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 207: athrow
      // 208: ifeq 233
      // 20b: goto 212
      // 20e: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 211: athrow
      // 212: aload 2
      // 213: aload 0
      // 214: aconst_null
      // 215: aload 4
      // 217: aconst_null
      // 218: aload 5
      // 21a: aload 0
      // 21b: getstatic com/finalshell/ui/model/F2_2.IDENTIFIER Lcom/finalshell/ui/model/F2_2;
      // 21e: invokevirtual com/finalshell/core/HG.Z (Lcom/finalshell/ui/model/F2_2;)Ljava/lang/String;
      // 221: bipush 0
      // 222: getstatic com/finalshell/ui/model/X_2.CLASS_DECLARATION Lcom/finalshell/ui/model/X_2;
      // 225: invokevirtual com/finalshell/core/HG.K (Ljava/lang/String;[Lcom/finalshell/core/Fu2_2;[Lcom/finalshell/core/C_U;Lcom/finalshell/core/Nt2_2;Ljava/lang/String;ZLcom/finalshell/ui/model/X_2;)Lcom/finalshell/core/NS;
      // 228: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 22d: pop
      // 22e: return
      // 22f: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 232: athrow
      // 233: aload 1
      // 234: new com/finalshell/core/RX_2
      // 237: dup
      // 238: aload 0
      // 239: invokevirtual com/finalshell/core/HG.C$I ()Lcom/finalshell/ui/model/I;
      // 23c: aload 4
      // 23e: aload 5
      // 240: aload 0
      // 241: invokevirtual com/finalshell/core/HG.r ()[Lcom/finalshell/core/Rq2_2;
      // 244: invokespecial com/finalshell/core/RX_2.<init> (Lcom/finalshell/ui/model/I;[Lcom/finalshell/core/Fu2_2;Lcom/finalshell/core/Nt2_2;[Lcom/finalshell/core/Rq2_2;)V
      // 247: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 24c: pop
      // 24d: aload 0
      // 24e: ldc_w ";"
      // 251: invokevirtual com/finalshell/core/HG.C (Ljava/lang/String;)V
      // 254: return
      // 255: aload 0
      // 256: invokevirtual com/finalshell/core/HG.n$N_ ()Lcom/finalshell/core/N_;
      // 259: astore 5
      // 25b: aload 0
      // 25c: ldc_w ";"
      // 25f: invokevirtual com/finalshell/core/HG.I (Ljava/lang/String;)Z
      // 262: aload 3
      // 263: ifnull 289
      // 266: ifeq 28b
      // 269: goto 270
      // 26c: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: aload 1
      // 271: new com/finalshell/core/RY_2
      // 274: dup
      // 275: aload 5
      // 277: invokevirtual com/finalshell/core/N_.Z ()Lcom/finalshell/core/NV_2;
      // 27a: invokespecial com/finalshell/core/RY_2.<init> (Lcom/finalshell/core/NV_2;)V
      // 27d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 282: goto 289
      // 285: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 288: athrow
      // 289: pop
      // 28a: return
      // 28b: aload 5
      // 28d: invokevirtual com/finalshell/core/N_.w ()Lcom/finalshell/core/Nt2_2;
      // 290: astore 6
      // 292: aload 0
      // 293: getstatic com/finalshell/ui/model/F2_2.IDENTIFIER Lcom/finalshell/ui/model/F2_2;
      // 296: invokevirtual com/finalshell/core/HG.d (Lcom/finalshell/ui/model/F2_2;)Z
      // 299: aload 3
      // 29a: ifnull 2fe
      // 29d: ifeq 2e4
      // 2a0: goto 2a7
      // 2a3: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: ldc_w "("
      // 2ab: invokevirtual com/finalshell/core/HG.k (Ljava/lang/String;)Z
      // 2ae: aload 3
      // 2af: ifnull 2fe
      // 2b2: goto 2b9
      // 2b5: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b8: athrow
      // 2b9: ifeq 2e4
      // 2bc: goto 2c3
      // 2bf: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c2: athrow
      // 2c3: aload 2
      // 2c4: aload 0
      // 2c5: aconst_null
      // 2c6: aload 4
      // 2c8: aconst_null
      // 2c9: aload 6
      // 2cb: aload 0
      // 2cc: getstatic com/finalshell/ui/model/F2_2.IDENTIFIER Lcom/finalshell/ui/model/F2_2;
      // 2cf: invokevirtual com/finalshell/core/HG.Z (Lcom/finalshell/ui/model/F2_2;)Ljava/lang/String;
      // 2d2: bipush 0
      // 2d3: getstatic com/finalshell/ui/model/X_2.CLASS_DECLARATION Lcom/finalshell/ui/model/X_2;
      // 2d6: invokevirtual com/finalshell/core/HG.K (Ljava/lang/String;[Lcom/finalshell/core/Fu2_2;[Lcom/finalshell/core/C_U;Lcom/finalshell/core/Nt2_2;Ljava/lang/String;ZLcom/finalshell/ui/model/X_2;)Lcom/finalshell/core/NS;
      // 2d9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2de: pop
      // 2df: return
      // 2e0: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e3: athrow
      // 2e4: aload 1
      // 2e5: new com/finalshell/core/RX_2
      // 2e8: dup
      // 2e9: aload 5
      // 2eb: invokevirtual com/finalshell/core/N_.Q ()Lcom/finalshell/ui/model/I;
      // 2ee: aload 4
      // 2f0: aload 6
      // 2f2: aload 0
      // 2f3: invokevirtual com/finalshell/core/HG.r ()[Lcom/finalshell/core/Rq2_2;
      // 2f6: invokespecial com/finalshell/core/RX_2.<init> (Lcom/finalshell/ui/model/I;[Lcom/finalshell/core/Fu2_2;Lcom/finalshell/core/Nt2_2;[Lcom/finalshell/core/Rq2_2;)V
      // 2f9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2fe: pop
      // 2ff: aload 0
      // 300: ldc_w ";"
      // 303: invokevirtual com/finalshell/core/HG.C (Ljava/lang/String;)V
      // 306: return
   }

   public NS L(
      com.finalshell.ui.model.I var1,
      HV_2[] var2,
      boolean var3,
      java.lang.Class var4,
      String var5,
      java.lang.Class[] var6,
      String[] var7,
      java.lang.Class[] var8,
      C_r_2[] var9
   ) {
      String[] var10 = RG_2.C();

      try {
         if (var7.length != var6.length) {
            throw new P_5(a(27883, 30257) + var7.length + a(27892, 22710) + var6.length + a(27872, 7768));
         }
      } catch (IllegalArgumentException var15) {
         throw a(var15);
      }

      RJ_2 var11 = new RJ_2(var1, new R9[var7.length], false);
      int var12 = 0;

      while (var12 < var11.Q.length) {
         var11.Q[var12] = new R9(var1, RG_2.J(var1, new String[]{a(27887, -1092)}), this.k(var1, var6[var12]), var7[var12]);
         var12++;
         if (var10 == null) {
            break;
         }
      }

      ArrayList var13 = new ArrayList();

      ArrayList var10000;
      label29: {
         label28: {
            try {
               var13.addAll(Arrays.asList(var2));
               var10000 = var13;
               if (var10 == null) {
                  break label29;
               }

               var13.add(new N9_2(a(27898, 21279), var1));
               if (!var3) {
                  break label28;
               }
            } catch (IllegalArgumentException var14) {
               throw a(var14);
            }

            var13.add(new N9_2(a(27874, -15489), var1));
         }

         var10000 = var13;
      }

      Fu2_2[] var16 = var10000.toArray(new Fu2_2[var13.size()]);
      return new NS(var1, null, var16, null, this.k(var1, var4), var5, var11, this.v(var1, var8), null, Arrays.asList(var9));
   }

   @Deprecated
   public static Object i(String var0, java.lang.Class var1, String[] var2) throws B2_5 {
      HI_2 var3 = new HI_2();
      return var3.F(var0, var1, var2);
   }

   @Deprecated
   public static Object I(Hc2_2 var0, java.lang.Class var1, String[] var2, @C_9 ClassLoader var3) throws B2_5, IOException {
      HI_2 var4 = new HI_2();
      var4.e(var3);
      return var4.c(var0, var1, var2);
   }

   @Deprecated
   public static Object i(Hc2_2 var0, String var1, @C_9 java.lang.Class var2, java.lang.Class var3, String[] var4, @C_9 ClassLoader var5) throws B2_5, IOException {
      HI_2 var6 = new HI_2();
      var6.Z(var1);
      var6.c(var2);
      var6.e(var5);
      return var6.c(var0, var3, var4);
   }

   @Deprecated
   public static Object k(Hc2_2 var0, String[] var1, String var2, @C_9 java.lang.Class var3, java.lang.Class var4, String[] var5, @C_9 ClassLoader var6) throws B2_5, IOException {
      HI_2 var7 = new HI_2();
      var7.A(var1);
      var7.Z(var2);
      var7.c(var3);
      var7.e(var6);
      return var7.c(var0, var4, var5);
   }


   public void A(String[] var1) {
      this.z.P(var1);
   }


   public String[] H() {
      return this.z.i();
   }


   public Object K(Reader var1, java.lang.Class var2, String[] var3) throws B2_5, IOException {
      return this.c(new Hc2_2(null, var1), var2, var3);
   }


   public Object F(String var1, java.lang.Class var2, String[] var3) throws B2_5 {
      try {
         return this.K(new StringReader(var1), var2, var3);
      } catch (IOException var5) {
         throw new P_5(a(27896, 27003), var5);
      }
   }

   public Object c(Hc2_2 param1, java.lang.Class param2, String[] param3) throws B2_5, IOException {
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
      // 014: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 02d: sipush 27888
      // 030: sipush 10256
      // 033: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 036: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 039: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03c: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 03f: athrow
      // 040: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 059: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: new com/finalshell/core/P_5
      // 060: dup
      // 061: new java/lang/StringBuilder
      // 064: dup
      // 065: invokespecial java/lang/StringBuilder.<init> ()V
      // 068: sipush 27873
      // 06b: sipush 17471
      // 06e: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: aload 2
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 078: sipush 27889
      // 07b: sipush -18524
      // 07e: invokestatic com/finalshell/core/HI_2.a (II)Ljava/lang/String;
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 087: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 08a: athrow
      // 08b: invokestatic com/finalshell/core/HI_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: aload 6
      // 091: bipush 0
      // 092: aaload
      // 093: astore 5
      // 095: aload 0
      // 096: bipush 1
      // 097: anewarray 209
      // 09a: dup
      // 09b: bipush 0
      // 09c: aload 2
      // 09d: aastore
      // 09e: invokevirtual com/finalshell/core/HI_2.j ([Ljava/lang/Class;)V
      // 0a1: aload 0
      // 0a2: bipush 1
      // 0a3: invokevirtual com/finalshell/core/HI_2.h (Z)V
      // 0a6: aload 0
      // 0a7: bipush 0
      // 0a8: invokevirtual com/finalshell/core/HI_2.Y (Z)V
      // 0ab: aload 0
      // 0ac: aload 5
      // 0ae: invokevirtual java/lang/reflect/Method.getReturnType ()Ljava/lang/Class;
      // 0b1: invokevirtual com/finalshell/core/HI_2.J (Ljava/lang/Class;)V
      // 0b4: aload 0
      // 0b5: aload 5
      // 0b7: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 0ba: invokevirtual com/finalshell/core/HI_2.L (Ljava/lang/String;)V
      // 0bd: aload 0
      // 0be: aload 3
      // 0bf: aload 5
      // 0c1: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 0c4: invokevirtual com/finalshell/core/HI_2.N ([Ljava/lang/String;[Ljava/lang/Class;)V
      // 0c7: aload 0
      // 0c8: aload 5
      // 0ca: invokevirtual java/lang/reflect/Method.getExceptionTypes ()[Ljava/lang/Class;
      // 0cd: invokevirtual com/finalshell/core/HI_2.I ([Ljava/lang/Class;)V
      // 0d0: aload 0
      // 0d1: bipush 1
      // 0d2: anewarray 171
      // 0d5: dup
      // 0d6: bipush 0
      // 0d7: aload 1
      // 0d8: aastore
      // 0d9: invokevirtual com/finalshell/core/HI_2.W ([Lcom/finalshell/core/Hc2_2;)V
      // 0dc: aload 0
      // 0dd: invokevirtual com/finalshell/core/HI_2.E ()Ljava/lang/reflect/Method;
      // 0e0: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 0e3: astore 6
      // 0e5: aload 6
      // 0e7: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 0ea: astore 7
      // 0ec: aload 7
      // 0ee: areturn
      // 0ef: astore 7
      // 0f1: new com/finalshell/core/P_5
      // 0f4: dup
      // 0f5: aload 7
      // 0f7: invokevirtual java/lang/InstantiationException.toString ()Ljava/lang/String;
      // 0fa: aload 7
      // 0fc: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0ff: athrow
      // 100: astore 7
      // 102: new com/finalshell/core/P_5
      // 105: dup
      // 106: aload 7
      // 108: invokevirtual java/lang/IllegalAccessException.toString ()Ljava/lang/String;
      // 10b: aload 7
      // 10d: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 110: athrow
   }

   public static String[] G(Hc2_2 var0) throws B2_5, IOException {
      String[] var10000 = RG_2.C();
      HG var2 = new HG(var0);
      String[] var1 = var10000;

      while (var2.Z(a(27879, 10787))) {
         var2.l$fK();
         if (var1 == null) {
            break;
         }
      }

      RN_2 var3 = new RN_2(var0.m());

      while (!var2.d(com.finalshell.ui.model.F2_2.END_OF_INPUT)) {
         var3.q(var2.F$_r_2());
         if (var1 == null) {
            break;
         }
      }

      HashSet var4 = new HashSet();
      HashSet var5 = new HashSet();
      new C_Q_2(var4, var5).B(var3);
      return var5.toArray(new String[var5.size()]);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 27880) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 198;
               break;
            case 1:
               var10000 = 15;
               break;
            case 2:
               var10000 = 104;
               break;
            case 3:
               var10000 = 158;
               break;
            case 4:
               var10000 = 125;
               break;
            case 5:
               var10000 = 169;
               break;
            case 6:
               var10000 = 16;
               break;
            case 7:
               var10000 = 131;
               break;
            case 8:
               var10000 = 26;
               break;
            case 9:
               var10000 = 89;
               break;
            case 10:
               var10000 = 56;
               break;
            case 11:
               var10000 = 144;
               break;
            case 12:
               var10000 = 142;
               break;
            case 13:
               var10000 = 151;
               break;
            case 14:
               var10000 = 29;
               break;
            case 15:
               var10000 = 122;
               break;
            case 16:
               var10000 = 189;
               break;
            case 17:
               var10000 = 12;
               break;
            case 18:
               var10000 = 213;
               break;
            case 19:
               var10000 = 199;
               break;
            case 20:
               var10000 = 167;
               break;
            case 21:
               var10000 = 174;
               break;
            case 22:
               var10000 = 61;
               break;
            case 23:
               var10000 = 175;
               break;
            case 24:
               var10000 = 77;
               break;
            case 25:
               var10000 = 182;
               break;
            case 26:
               var10000 = 188;
               break;
            case 27:
               var10000 = 116;
               break;
            case 28:
               var10000 = 147;
               break;
            case 29:
               var10000 = 253;
               break;
            case 30:
               var10000 = 8;
               break;
            case 31:
               var10000 = 74;
               break;
            case 32:
               var10000 = 49;
               break;
            case 33:
               var10000 = 13;
               break;
            case 34:
               var10000 = 208;
               break;
            case 35:
               var10000 = 180;
               break;
            case 36:
               var10000 = 75;
               break;
            case 37:
               var10000 = 6;
               break;
            case 38:
               var10000 = 37;
               break;
            case 39:
               var10000 = 76;
               break;
            case 40:
               var10000 = 194;
               break;
            case 41:
               var10000 = 153;
               break;
            case 42:
               var10000 = 102;
               break;
            case 43:
               var10000 = 64;
               break;
            case 44:
               var10000 = 4;
               break;
            case 45:
               var10000 = 197;
               break;
            case 46:
               var10000 = 82;
               break;
            case 47:
               var10000 = 195;
               break;
            case 48:
               var10000 = 207;
               break;
            case 49:
               var10000 = 243;
               break;
            case 50:
               var10000 = 0;
               break;
            case 51:
               var10000 = 205;
               break;
            case 52:
               var10000 = 235;
               break;
            case 53:
               var10000 = 192;
               break;
            case 54:
               var10000 = 36;
               break;
            case 55:
               var10000 = 137;
               break;
            case 56:
               var10000 = 48;
               break;
            case 57:
               var10000 = 233;
               break;
            case 58:
               var10000 = 62;
               break;
            case 59:
               var10000 = 17;
               break;
            case 60:
               var10000 = 178;
               break;
            case 61:
               var10000 = 211;
               break;
            case 62:
               var10000 = 24;
               break;
            case 63:
               var10000 = 115;
               break;
            case 64:
               var10000 = 193;
               break;
            case 65:
               var10000 = 128;
               break;
            case 66:
               var10000 = 152;
               break;
            case 67:
               var10000 = 34;
               break;
            case 68:
               var10000 = 126;
               break;
            case 69:
               var10000 = 2;
               break;
            case 70:
               var10000 = 132;
               break;
            case 71:
               var10000 = 252;
               break;
            case 72:
               var10000 = 156;
               break;
            case 73:
               var10000 = 135;
               break;
            case 74:
               var10000 = 67;
               break;
            case 75:
               var10000 = 157;
               break;
            case 76:
               var10000 = 130;
               break;
            case 77:
               var10000 = 87;
               break;
            case 78:
               var10000 = 111;
               break;
            case 79:
               var10000 = 202;
               break;
            case 80:
               var10000 = 127;
               break;
            case 81:
               var10000 = 229;
               break;
            case 82:
               var10000 = 248;
               break;
            case 83:
               var10000 = 190;
               break;
            case 84:
               var10000 = 215;
               break;
            case 85:
               var10000 = 159;
               break;
            case 86:
               var10000 = 214;
               break;
            case 87:
               var10000 = 51;
               break;
            case 88:
               var10000 = 100;
               break;
            case 89:
               var10000 = 107;
               break;
            case 90:
               var10000 = 227;
               break;
            case 91:
               var10000 = 201;
               break;
            case 92:
               var10000 = 168;
               break;
            case 93:
               var10000 = 40;
               break;
            case 94:
               var10000 = 94;
               break;
            case 95:
               var10000 = 59;
               break;
            case 96:
               var10000 = 118;
               break;
            case 97:
               var10000 = 109;
               break;
            case 98:
               var10000 = 119;
               break;
            case 99:
               var10000 = 47;
               break;
            case 100:
               var10000 = 220;
               break;
            case 101:
               var10000 = 221;
               break;
            case 102:
               var10000 = 9;
               break;
            case 103:
               var10000 = 42;
               break;
            case 104:
               var10000 = 154;
               break;
            case 105:
               var10000 = 108;
               break;
            case 106:
               var10000 = 90;
               break;
            case 107:
               var10000 = 68;
               break;
            case 108:
               var10000 = 247;
               break;
            case 109:
               var10000 = 231;
               break;
            case 110:
               var10000 = 28;
               break;
            case 111:
               var10000 = 106;
               break;
            case 112:
               var10000 = 35;
               break;
            case 113:
               var10000 = 112;
               break;
            case 114:
               var10000 = 72;
               break;
            case 115:
               var10000 = 251;
               break;
            case 116:
               var10000 = 7;
               break;
            case 117:
               var10000 = 255;
               break;
            case 118:
               var10000 = 164;
               break;
            case 119:
               var10000 = 5;
               break;
            case 120:
               var10000 = 21;
               break;
            case 121:
               var10000 = 129;
               break;
            case 122:
               var10000 = 143;
               break;
            case 123:
               var10000 = 232;
               break;
            case 124:
               var10000 = 139;
               break;
            case 125:
               var10000 = 150;
               break;
            case 126:
               var10000 = 33;
               break;
            case 127:
               var10000 = 226;
               break;
            case 128:
               var10000 = 186;
               break;
            case 129:
               var10000 = 163;
               break;
            case 130:
               var10000 = 95;
               break;
            case 131:
               var10000 = 98;
               break;
            case 132:
               var10000 = 63;
               break;
            case 133:
               var10000 = 25;
               break;
            case 134:
               var10000 = 110;
               break;
            case 135:
               var10000 = 165;
               break;
            case 136:
               var10000 = 60;
               break;
            case 137:
               var10000 = 184;
               break;
            case 138:
               var10000 = 176;
               break;
            case 139:
               var10000 = 39;
               break;
            case 140:
               var10000 = 238;
               break;
            case 141:
               var10000 = 217;
               break;
            case 142:
               var10000 = 52;
               break;
            case 143:
               var10000 = 120;
               break;
            case 144:
               var10000 = 204;
               break;
            case 145:
               var10000 = 113;
               break;
            case 146:
               var10000 = 22;
               break;
            case 147:
               var10000 = 99;
               break;
            case 148:
               var10000 = 171;
               break;
            case 149:
               var10000 = 44;
               break;
            case 150:
               var10000 = 203;
               break;
            case 151:
               var10000 = 218;
               break;
            case 152:
               var10000 = 20;
               break;
            case 153:
               var10000 = 70;
               break;
            case 154:
               var10000 = 73;
               break;
            case 155:
               var10000 = 10;
               break;
            case 156:
               var10000 = 200;
               break;
            case 157:
               var10000 = 212;
               break;
            case 158:
               var10000 = 210;
               break;
            case 159:
               var10000 = 124;
               break;
            case 160:
               var10000 = 18;
               break;
            case 161:
               var10000 = 145;
               break;
            case 162:
               var10000 = 88;
               break;
            case 163:
               var10000 = 136;
               break;
            case 164:
               var10000 = 162;
               break;
            case 165:
               var10000 = 11;
               break;
            case 166:
               var10000 = 117;
               break;
            case 167:
               var10000 = 172;
               break;
            case 168:
               var10000 = 161;
               break;
            case 169:
               var10000 = 146;
               break;
            case 170:
               var10000 = 92;
               break;
            case 171:
               var10000 = 160;
               break;
            case 172:
               var10000 = 181;
               break;
            case 173:
               var10000 = 236;
               break;
            case 174:
               var10000 = 170;
               break;
            case 175:
               var10000 = 58;
               break;
            case 176:
               var10000 = 141;
               break;
            case 177:
               var10000 = 65;
               break;
            case 178:
               var10000 = 191;
               break;
            case 179:
               var10000 = 38;
               break;
            case 180:
               var10000 = 83;
               break;
            case 181:
               var10000 = 219;
               break;
            case 182:
               var10000 = 79;
               break;
            case 183:
               var10000 = 1;
               break;
            case 184:
               var10000 = 41;
               break;
            case 185:
               var10000 = 177;
               break;
            case 186:
               var10000 = 27;
               break;
            case 187:
               var10000 = 101;
               break;
            case 188:
               var10000 = 140;
               break;
            case 189:
               var10000 = 96;
               break;
            case 190:
               var10000 = 3;
               break;
            case 191:
               var10000 = 179;
               break;
            case 192:
               var10000 = 80;
               break;
            case 193:
               var10000 = 14;
               break;
            case 194:
               var10000 = 246;
               break;
            case 195:
               var10000 = 149;
               break;
            case 196:
               var10000 = 187;
               break;
            case 197:
               var10000 = 91;
               break;
            case 198:
               var10000 = 103;
               break;
            case 199:
               var10000 = 228;
               break;
            case 200:
               var10000 = 97;
               break;
            case 201:
               var10000 = 148;
               break;
            case 202:
               var10000 = 230;
               break;
            case 203:
               var10000 = 223;
               break;
            case 204:
               var10000 = 46;
               break;
            case 205:
               var10000 = 78;
               break;
            case 206:
               var10000 = 254;
               break;
            case 207:
               var10000 = 209;
               break;
            case 208:
               var10000 = 86;
               break;
            case 209:
               var10000 = 138;
               break;
            case 210:
               var10000 = 30;
               break;
            case 211:
               var10000 = 85;
               break;
            case 212:
               var10000 = 244;
               break;
            case 213:
               var10000 = 183;
               break;
            case 214:
               var10000 = 173;
               break;
            case 215:
               var10000 = 134;
               break;
            case 216:
               var10000 = 66;
               break;
            case 217:
               var10000 = 32;
               break;
            case 218:
               var10000 = 19;
               break;
            case 219:
               var10000 = 206;
               break;
            case 220:
               var10000 = 133;
               break;
            case 221:
               var10000 = 50;
               break;
            case 222:
               var10000 = 71;
               break;
            case 223:
               var10000 = 242;
               break;
            case 224:
               var10000 = 196;
               break;
            case 225:
               var10000 = 237;
               break;
            case 226:
               var10000 = 240;
               break;
            case 227:
               var10000 = 121;
               break;
            case 228:
               var10000 = 249;
               break;
            case 229:
               var10000 = 81;
               break;
            case 230:
               var10000 = 222;
               break;
            case 231:
               var10000 = 250;
               break;
            case 232:
               var10000 = 245;
               break;
            case 233:
               var10000 = 123;
               break;
            case 234:
               var10000 = 23;
               break;
            case 235:
               var10000 = 114;
               break;
            case 236:
               var10000 = 43;
               break;
            case 237:
               var10000 = 185;
               break;
            case 238:
               var10000 = 45;
               break;
            case 239:
               var10000 = 55;
               break;
            case 240:
               var10000 = 216;
               break;
            case 241:
               var10000 = 155;
               break;
            case 242:
               var10000 = 225;
               break;
            case 243:
               var10000 = 241;
               break;
            case 244:
               var10000 = 53;
               break;
            case 245:
               var10000 = 84;
               break;
            case 246:
               var10000 = 239;
               break;
            case 247:
               var10000 = 166;
               break;
            case 248:
               var10000 = 224;
               break;
            case 249:
               var10000 = 57;
               break;
            case 250:
               var10000 = 69;
               break;
            case 251:
               var10000 = 105;
               break;
            case 252:
               var10000 = 93;
               break;
            case 253:
               var10000 = 31;
               break;
            case 254:
               var10000 = 234;
               break;
            default:
               var10000 = 54;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17180;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      boolean var21;
      char[] var35;
      String[] var13 = new String[31];
      int var11 = 0;
      String var10 = "\u0084ÔÁ\u0019h\u0003ÑÒø\tWÐ¾\u0089fÿÞñK\u001dp'¿\u0094Ò\u009f\u0007(ë]\u0001Ñ\u009aéÁhsû(=Y¾\u000f'\u0017¥ç],\u0006¨\u0083Èå?ð\u0005'\u0095\u0090þÞ&\u0080(\t\u0017²ýHO@\u008bB>%\u009a}EÓ:¸÷Z+H\u0093x\u0018;û¯\u001d¥Ý\u0091d\u0017¥ÿo\u0005q\u001cðx#\u000eU#Øñ!<»Î¬T\u000eÌ\u0001ß\u000b\u0099\u0090=\nÝ\u00002W\u0017ß×\u0006Ò´<ÆQ¯\u0006óÿ,\u009dÿè\u0005nq'ù7\u0002ëÿ\u0002\u0090\u000f\u0006D^¦º*O \u00010\u001f\u0006\u009f<X¤e\u001bX3\"óA¾F\u0003\u001bT-D\u0097\u0001~ñÐ\u0004ýT\u008dÎ\b\u0084©ë\u001dEÙMc\u0006U)¬L å\f\u0096í»VNY\u0017çp?ñD\u0003k\u00adô/DÏ\u0091ØZlÔu¯\u0084}±NÎXê#OEà\u001ek06\u0090\u0092$a\u0006¾\u008d\n*5\bs\u001e8-ÈÞ\u0093©¤¤\u0099i\u0006àv8h\u009a^.ø3s\u0005\u001atÖÑ\u000fñ\u0097\u00844Úñ©l\u0085í`Të¸ê8F\u009aW\u001a1Ç¹\u0081|\u008a\u0082\u0000Vzy\u0015Z©3\u008dr\u0015\u0001\u001e5J0Ô\u0099Óèû\u0089à\u0015\u0082\fï\u0013\u008cÍ¶E!\u001a(R\u008a\u000b\u0010\u0088\u0002)Ñ^¦¶(TÐÌl\u007fZXV³éâ(1uùc\u0084'c\u0005^kygº\u0005Cªú\u0081æ\u0018ÛU\f>ZªU\u009fÔåh\u001fË\u0083K\u0081î«\u0081¨é`yX";
      int var12 = "\u0084ÔÁ\u0019h\u0003ÑÒø\tWÐ¾\u0089fÿÞñK\u001dp'¿\u0094Ò\u009f\u0007(ë]\u0001Ñ\u009aéÁhsû(=Y¾\u000f'\u0017¥ç],\u0006¨\u0083Èå?ð\u0005'\u0095\u0090þÞ&\u0080(\t\u0017²ýHO@\u008bB>%\u009a}EÓ:¸÷Z+H\u0093x\u0018;û¯\u001d¥Ý\u0091d\u0017¥ÿo\u0005q\u001cðx#\u000eU#Øñ!<»Î¬T\u000eÌ\u0001ß\u000b\u0099\u0090=\nÝ\u00002W\u0017ß×\u0006Ò´<ÆQ¯\u0006óÿ,\u009dÿè\u0005nq'ù7\u0002ëÿ\u0002\u0090\u000f\u0006D^¦º*O \u00010\u001f\u0006\u009f<X¤e\u001bX3\"óA¾F\u0003\u001bT-D\u0097\u0001~ñÐ\u0004ýT\u008dÎ\b\u0084©ë\u001dEÙMc\u0006U)¬L å\f\u0096í»VNY\u0017çp?ñD\u0003k\u00adô/DÏ\u0091ØZlÔu¯\u0084}±NÎXê#OEà\u001ek06\u0090\u0092$a\u0006¾\u008d\n*5\bs\u001e8-ÈÞ\u0093©¤¤\u0099i\u0006àv8h\u009a^.ø3s\u0005\u001atÖÑ\u000fñ\u0097\u00844Úñ©l\u0085í`Të¸ê8F\u009aW\u001a1Ç¹\u0081|\u008a\u0082\u0000Vzy\u0015Z©3\u008dr\u0015\u0001\u001e5J0Ô\u0099Óèû\u0089à\u0015\u0082\fï\u0013\u008cÍ¶E!\u001a(R\u008a\u000b\u0010\u0088\u0002)Ñ^¦¶(TÐÌl\u007fZXV³éâ(1uùc\u0084'c\u0005^kygº\u0005Cªú\u0081æ\u0018ÛU\f>ZªU\u009fÔåh\u001fË\u0083K\u0081î«\u0081¨é`yX"
         .length();
      char var9 = 5;
      int var18 = -1;

      label85:
      while (true) {
         byte var10000 = 63;
         String var10001 = var10.substring(++var18, var18 + var9);
         byte var10002 = -1;

         while (true) {
            label80: {
               char[] var41 = var10001.toCharArray();
               int var10004 = var41.length;
               int var14 = 0;
               byte var44 = var10000;
               var35 = var41;
               int var26 = var10004;
               byte var51;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               } else {
                  var44 = var10000;
                  var26 = var10004;
                  if (var10004 <= var14) {
                     break label80;
                  }

                  var57 = var41;
                  var51 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var66 = var57[var10006];
                  byte var67;
                  switch (var14 % 7) {
                     case 0:
                        var67 = 12;
                        break;
                     case 1:
                        var67 = 41;
                        break;
                     case 2:
                        var67 = 67;
                        break;
                     case 3:
                        var67 = 35;
                        break;
                     case 4:
                        var67 = 66;
                        break;
                     case 5:
                        var67 = 82;
                        break;
                     default:
                        var67 = 68;
                  }

                  var57[var10006] = (char)(var66 ^ var51 ^ var67);
                  var14++;
                  if (var44 == 0) {
                     var10006 = var44;
                     var57 = var35;
                     var51 = var44;
                  } else {
                     if (var26 <= var14) {
                        break;
                     }

                     var57 = var35;
                     var51 = var44;
                     var10006 = var14;
                  }
               }
            }

            String var46 = new String(var35).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var46;
                  if ((var18 += var9) >= var12) {
                     c = var13;
                     d = new String[31];
                     long var0 = 9063756843062790238L;
                     long[] var6 = new long[9];
                     int var3 = 0;
                     String var4 = "2Vº¾©¡a&¸\u008a;RH\u0014¸\u0089SÜ{e\u001eT>¢\u009f\u008f\u009c\u0084]O8Ó¥\u009a\u008a\u0011\u0019u\u0086Á\u001e1ÌjèÓð×\u00073ÃyägWû";
                     int var5 = "2Vº¾©¡a&¸\u008a;RH\u0014¸\u0089SÜ{e\u001eT>¢\u009f\u008f\u009c\u0084]O8Ó¥\u009a\u008a\u0011\u0019u\u0086Á\u001e1ÌjèÓð×\u00073ÃyägWû"
                        .length();
                     byte var2 = 0;

                     label59:
                     while (true) {
                        byte var28 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var29 = var3++;
                        long var39 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var47 = -1;

                        while (true) {
                           long var56 = var39 ^ var0;
                           switch (var47) {
                              case 0:
                                 var20[var29] = var56;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[9];

                                    label48: {
                                       try {
                                          if (!HI_2.class.desiredAssertionStatus()) {
                                             var21 = true;
                                             break label48;
                                          }
                                       } catch (IllegalArgumentException var15) {
                                          throw a(var15);
                                       }

                                       var21 = false;
                                    }

                                    X = var21;
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var29] = var56;
                                 if (var2 < var5) {
                                    continue label59;
                                 }

                                 var4 = "ÈäHü_\u0002áWj\u0091'³èÖØ\u0097";
                                 var5 = "ÈäHü_\u0002áWj\u0091'³èÖØ\u0097".length();
                                 var2 = 0;
                           }

                           byte var30 = var2;
                           var2 += 8;
                           var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var29 = var3++;
                           var39 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var47 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var18);
                  break;
               default:
                  var13[var11++] = var46;
                  if ((var18 += var9) < var12) {
                     var9 = var10.charAt(var18);
                     continue label85;
                  }

                  var10 = "/\r!8[Ñ\u0004Äøù\u008d";
                  var12 = "/\r!8[Ñ\u0004Äøù\u008d".length();
                  var9 = 6;
                  var18 = -1;
            }

            var10000 = 89;
            var10001 = var10.substring(++var18, var18 + var9);
            var10002 = 0;
         }
      }
   }
}









