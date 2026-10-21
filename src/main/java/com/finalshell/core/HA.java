package com.finalshell.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class HA extends Hd2 {
   public final java.lang.Class J;
   public final C_L P;
   public static String[] a;
   public static String[] c;

   public HA(java.lang.Class var1, C_L var2) {
      this.J = var1;
      var1.getTypeParameters();
      this.P = var2;
   }

   @Override
   public C_J[] V$arr_J() {
      TypeVariable[] var2 = this.J.getTypeParameters();
      C_J[] var3 = new C_J[var2.length];
      String[] var10000 = RG_2.C();
      int var4 = 0;
      String[] var1 = var10000;

      while (true) {
         if (var4 < var3.length) {
      C_J[] var6;
            try {
               var6 = var3;
               if (var1 == null) {
                  break;
               }

               var3[var4] = this.z(var2[var4]);
               var4++;
               if (var1 != null) {
                  continue;
               }
            } catch (P_5 var5) {
      C_J[] var6;
               throw a(var5);
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public C_J z(TypeVariable var1) {
      return new C_t_2_2(this, var1);
   }

   public Q4_3[] R(Type[] var1) throws B2_5 {
      Q4_3[] var3 = new Q4_3[var1.length];
      String[] var10000 = RG_2.C();
      int var4 = 0;
      String[] var2 = var10000;

      while (true) {
         if (var4 < var3.length) {
            try {
               var6 = var3;
               if (var2 == null) {
                  break;
               }

               var3[var4] = this.j(var1[var4]);
               var4++;
               if (var2 != null) {
                  continue;
               }
            } catch (B2_5 var5) {
               throw a(var5);
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public Q4_3 j(Type param1) throws B2_5 {
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
      // 004: aload 1
      // 005: instanceof java/lang/Class
      // 008: aload 2
      // 009: ifnull 098
      // 00c: ifeq 094
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: getfield com/finalshell/core/HA.P Lcom/finalshell/core/C_L;
      // 01a: aload 1
      // 01b: checkcast java/lang/Class
      // 01e: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 021: invokestatic com/finalshell/core/F0_2.n (Ljava/lang/String;)Ljava/lang/String;
      // 024: invokevirtual com/finalshell/core/C_L.X (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 027: astore 3
      // 028: goto 057
      // 02b: astore 4
      // 02d: new com/finalshell/core/B2_5
      // 030: dup
      // 031: new java/lang/StringBuilder
      // 034: dup
      // 035: invokespecial java/lang/StringBuilder.<init> ()V
      // 038: sipush -11968
      // 03b: sipush 1945
      // 03e: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 041: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 044: aload 1
      // 045: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 048: ldc "\""
      // 04a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 050: aconst_null
      // 051: aload 4
      // 053: invokespecial com/finalshell/core/B2_5.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;Ljava/lang/Throwable;)V
      // 056: athrow
      // 057: aload 3
      // 058: aload 2
      // 059: ifnull 093
      // 05c: ifnonnull 092
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: new com/finalshell/core/B2_5
      // 069: dup
      // 06a: new java/lang/StringBuilder
      // 06d: dup
      // 06e: invokespecial java/lang/StringBuilder.<init> ()V
      // 071: sipush -11953
      // 074: sipush -18531
      // 077: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 07a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07d: aload 1
      // 07e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 081: ldc "\""
      // 083: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 086: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 089: aconst_null
      // 08a: invokespecial com/finalshell/core/B2_5.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 08d: athrow
      // 08e: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: aload 3
      // 093: areturn
      // 094: aload 1
      // 095: instanceof java/lang/reflect/GenericArrayType
      // 098: aload 2
      // 099: ifnull 0bf
      // 09c: ifeq 0bb
      // 09f: goto 0a6
      // 0a2: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: new java/lang/AssertionError
      // 0a9: dup
      // 0aa: sipush -11966
      // 0ad: sipush 21141
      // 0b0: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 0b3: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 0b6: athrow
      // 0b7: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: instanceof java/lang/reflect/ParameterizedType
      // 0bf: aload 2
      // 0c0: ifnull 0e6
      // 0c3: ifeq 0e2
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: new java/lang/AssertionError
      // 0d0: dup
      // 0d1: sipush -11954
      // 0d4: sipush 20175
      // 0d7: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 0da: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 0dd: athrow
      // 0de: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: aload 1
      // 0e3: instanceof java/lang/reflect/TypeVariable
      // 0e6: aload 2
      // 0e7: ifnull 10d
      // 0ea: ifeq 109
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: new java/lang/AssertionError
      // 0f7: dup
      // 0f8: sipush -11954
      // 0fb: sipush 20175
      // 0fe: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 101: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 104: athrow
      // 105: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: aload 1
      // 10a: instanceof java/lang/reflect/WildcardType
      // 10d: ifeq 125
      // 110: new java/lang/AssertionError
      // 113: dup
      // 114: sipush -11954
      // 117: sipush 20175
      // 11a: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 11d: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 120: athrow
      // 121: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: new java/lang/AssertionError
      // 128: dup
      // 129: aload 1
      // 12a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 12d: invokespecial java/lang/AssertionError.<init> (Ljava/lang/Object;)V
      // 130: athrow
   }

   @Override
   public Hv2_2[] C() {
      String[] var10000 = RG_2.C();
      Constructor[] var2 = this.J.getDeclaredConstructors();
      Hv2_2[] var3 = new Hv2_2[var2.length];
      String[] var1 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var2.length) {
            try {
               var6 = var3;
               if (var1 == null) {
                  break;
               }

               var3[var4] = new Ho2(this, var2[var4]);
               var4++;
               if (var1 != null) {
                  continue;
               }
            } catch (P_5 var5) {
               throw a(var5);
            }
         }

         var6 = var3;
         break;
      }

      return var6;
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
      // 03: aload 0
      // 04: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 07: invokevirtual java/lang/Class.getDeclaredMethods ()[Ljava/lang/reflect/Method;
      // 0a: astore 2
      // 0b: astore 1
      // 0c: aload 2
      // 0d: arraylength
      // 0e: aload 1
      // 0f: ifnull 35
      // 12: ifne 4c
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: ifnull 4d
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 2b: invokevirtual java/lang/Class.isArray ()Z
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: ifeq 4c
      // 38: bipush 1
      // 39: anewarray 147
      // 3c: dup
      // 3d: bipush 0
      // 3e: new com/finalshell/core/HC_2
      // 41: dup
      // 42: aload 0
      // 43: invokespecial com/finalshell/core/HC_2.<init> (Lcom/finalshell/core/HA;)V
      // 46: aastore
      // 47: areturn
      // 48: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 2
      // 4e: invokespecial com/finalshell/core/HA.V ([Ljava/lang/reflect/Method;)[Lcom/finalshell/core/HP_2;
      // 51: areturn
   }

   @Override
   public U3_3[] A$arru_3() {
      return this.V(this.J.getDeclaredFields());
   }

   @Override
   public Hd2[] j$arrhd_2() {
      return this.h(this.J.getDeclaredClasses());
   }

   @C_9
   @Override
   public Hd2 V$hd_2() {
      java.lang.Class var1 = this.J.getDeclaringClass();

      try {
         if (var1 == null) {
            return null;
         }
      } catch (P_5 var2) {
         throw a(var2);
      }

      return this.X(var1);
   }

   @C_9
   @Override
   public Hd2 l$hd_2() throws B2_5 {
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
      // 06: ifnull 26
      // 09: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 0c: invokevirtual java/lang/Class.getModifiers ()I
      // 0f: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 12: ifeq 22
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aconst_null
      // 1d: areturn
      // 1e: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual com/finalshell/core/HA.L ()Lcom/finalshell/core/Hd2;
      // 26: areturn
   }

   @C_9
   @Override
   public Hd2 g() {
      java.lang.Class var1 = this.J.getSuperclass();

      try {
         if (var1 == null) {
            return null;
         }
      } catch (P_5 var2) {
         throw a(var2);
      }

      return this.X(var1);
   }

   @C_9
   @Override
   public Hd2 G() {
      java.lang.Class var1 = this.J.getComponentType();

      try {
         if (var1 == null) {
            return null;
         }
      } catch (P_5 var2) {
         throw a(var2);
      }

      return this.X(var1);
   }

   @Override
   public Hd2[] l$arrhd_2() {
      return this.h(this.J.getInterfaces());
   }

   @Override
   public String J() {
      return F0_2.n(this.J.getName());
   }

   @Override
   public com.finalshell.ui.model.S_3 r() {
      return C(this.J.getModifiers());
   }

   @Override
   public boolean M() {
      return Modifier.isFinal(this.J.getModifiers());
   }

   @Override
   public boolean s() {
      return this.J.isEnum();
   }

   @Override
   public boolean P$boolean() {
      return this.J.isInterface();
   }

   @Override
   public boolean B() {
      return Modifier.isAbstract(this.J.getModifiers());
   }

   @Override
   public boolean q() {
      return this.J.isArray();
   }

   @Override
   public boolean o() {
      return this.J.isPrimitive();
   }

   @Override
   public boolean p$boolean() {
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
      // 05: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 08: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 0b: aload 1
      // 0c: ifnull 27
      // 0f: if_acmpeq b6
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 1d: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 20: goto 27
      // 23: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 1
      // 28: ifnull 43
      // 2b: if_acmpeq b6
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 39: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 1
      // 44: ifnull 5f
      // 47: if_acmpeq b6
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 55: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 1
      // 60: ifnull 7b
      // 63: if_acmpeq b6
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 71: getstatic java/lang/Character.TYPE Ljava/lang/Class;
      // 74: goto 7b
      // 77: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: aload 1
      // 7c: ifnull 97
      // 7f: if_acmpeq b6
      // 82: goto 89
      // 85: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 88: athrow
      // 89: aload 0
      // 8a: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 8d: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 90: goto 97
      // 93: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 96: athrow
      // 97: aload 1
      // 98: ifnull b3
      // 9b: if_acmpeq b6
      // 9e: goto a5
      // a1: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: aload 0
      // a6: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // a9: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // ac: goto b3
      // af: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b2: athrow
      // b3: if_acmpne be
      // b6: bipush 1
      // b7: goto bf
      // ba: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bd: athrow
      // be: bipush 0
      // bf: ireturn
   }

   @Override
   public H4_2[] a() throws B2_5 {
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
      // 04: getfield com/finalshell/core/HA.J Ljava/lang/Class;
      // 07: invokevirtual java/lang/Class.getAnnotations ()[Ljava/lang/annotation/Annotation;
      // 0a: astore 2
      // 0b: astore 1
      // 0c: aload 2
      // 0d: arraylength
      // 0e: aload 1
      // 0f: ifnull 26
      // 12: ifne 24
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: getstatic com/finalshell/core/Hd2.u [Lcom/finalshell/core/H4_2;
      // 1f: areturn
      // 20: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 2
      // 25: arraylength
      // 26: anewarray 271
      // 29: astore 3
      // 2a: bipush 0
      // 2b: istore 4
      // 2d: iload 4
      // 2f: aload 2
      // 30: arraylength
      // 31: if_icmpge bb
      // 34: aload 2
      // 35: iload 4
      // 37: aaload
      // 38: astore 5
      // 3a: aload 5
      // 3c: invokeinterface java/lang/annotation/Annotation.annotationType ()Ljava/lang/Class; 1
      // 41: astore 6
      // 43: aload 0
      // 44: getfield com/finalshell/core/HA.P Lcom/finalshell/core/C_L;
      // 47: aload 6
      // 49: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 4c: invokestatic com/finalshell/core/F0_2.n (Ljava/lang/String;)Ljava/lang/String;
      // 4f: invokevirtual com/finalshell/core/C_L.X (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 52: astore 7
      // 54: goto 6d
      // 57: astore 8
      // 59: new com/finalshell/core/B2_5
      // 5c: dup
      // 5d: sipush -11955
      // 60: sipush -24032
      // 63: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 66: aconst_null
      // 67: aload 8
      // 69: invokespecial com/finalshell/core/B2_5.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;Ljava/lang/Throwable;)V
      // 6c: athrow
      // 6d: aload 7
      // 6f: ifnonnull a2
      // 72: new com/finalshell/core/B2_5
      // 75: dup
      // 76: new java/lang/StringBuilder
      // 79: dup
      // 7a: invokespecial java/lang/StringBuilder.<init> ()V
      // 7d: sipush -11960
      // 80: sipush 21567
      // 83: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89: aload 6
      // 8b: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: ldc "\""
      // 93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 96: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 99: aconst_null
      // 9a: invokespecial com/finalshell/core/B2_5.<init> (Ljava/lang/String;Lcom/finalshell/ui/model/I;)V
      // 9d: athrow
      // 9e: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: aload 3
      // a3: iload 4
      // a5: new com/finalshell/core/Hk_2
      // a8: dup
      // a9: aload 0
      // aa: aload 7
      // ac: aload 5
      // ae: aload 6
      // b0: invokespecial com/finalshell/core/Hk_2.<init> (Lcom/finalshell/core/HA;Lcom/finalshell/core/Hd2;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V
      // b3: aastore
      // b4: iinc 4 1
      // b7: aload 1
      // b8: ifnonnull 2d
      // bb: aload 3
      // bc: areturn
   }

   public java.lang.Class w() {
      return this.J;
   }

   @Override
   public String toString() {
      int var2 = 0;
      String var10000 = RG_2.C();
      java.lang.Class var3 = this.J;
      String[] var1 = var10000;

      while (true) {
         if (var3.isArray()) {
            var2++;
            var5 = var3.getComponentType();
            if (var1 == null) {
               break;
            }

            var3 = var5;
            if (var1 != null) {
               continue;
            }
         }

         var5 = var3;
         break;
      }

      String var4 = var5.getName();

      while (true) {
         if (var2-- > 0) {
            var10000 = var4 + b(-11965, 2977);
            if (var1 == null) {
               break;
            }

            var4 = var10000;
            if (var1 != null) {
               continue;
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   public Hd2 X(java.lang.Class param1) {
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
      // 05: getfield com/finalshell/core/HA.P Lcom/finalshell/core/C_L;
      // 08: aload 1
      // 09: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0c: invokestatic com/finalshell/core/F0_2.n (Ljava/lang/String;)Ljava/lang/String;
      // 0f: invokevirtual com/finalshell/core/C_L.X (Ljava/lang/String;)Lcom/finalshell/core/Hd2;
      // 12: astore 3
      // 13: goto 4e
      // 16: astore 4
      // 18: new com/finalshell/core/P_5
      // 1b: dup
      // 1c: new java/lang/StringBuilder
      // 1f: dup
      // 20: invokespecial java/lang/StringBuilder.<init> ()V
      // 23: sipush -11956
      // 26: sipush 10975
      // 29: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f: aload 1
      // 30: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 33: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36: sipush -11959
      // 39: sipush -2286
      // 3c: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: aload 4
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 47: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4a: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 4d: athrow
      // 4e: aload 3
      // 4f: aload 2
      // 50: ifnull 93
      // 53: ifnonnull 92
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: new com/finalshell/core/P_5
      // 60: dup
      // 61: new java/lang/StringBuilder
      // 64: dup
      // 65: invokespecial java/lang/StringBuilder.<init> ()V
      // 68: sipush -11958
      // 6b: sipush 28796
      // 6e: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: aload 1
      // 75: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b: sipush -11957
      // 7e: sipush 24617
      // 81: invokestatic com/finalshell/core/HA.b (II)Ljava/lang/String;
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8a: invokespecial com/finalshell/core/P_5.<init> (Ljava/lang/String;)V
      // 8d: athrow
      // 8e: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: aload 3
      // 93: areturn
   }

   public Hd2[] h(java.lang.Class[] var1) {
      String[] var10000 = RG_2.C();
      Hd2[] var3 = new Hd2[var1.length];
      String[] var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var1.length) {
            try {
               var6 = var3;
               if (var2 == null) {
                  break;
               }

               var3[var4] = this.X(var1[var4]);
               var4++;
               if (var2 != null) {
                  continue;
               }
            } catch (P_5 var5) {
               throw a(var5);
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public HP_2[] V(Method[] var1) {
      String[] var10000 = RG_2.C();
      HP_2[] var3 = new HP_2[var1.length];
      int var4 = 0;
      String[] var2 = var10000;

      while (true) {
         if (var4 < var3.length) {
            try {
               var6 = var3;
               if (var2 == null) {
                  break;
               }

               var3[var4] = new Ha2_2(this, var1[var4]);
               var4++;
               if (var2 != null) {
                  continue;
               }
            } catch (P_5 var5) {
               throw a(var5);
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public U3_3[] V(Field[] var1) {
      String[] var10000 = RG_2.C();
      U3_3[] var3 = new U3_3[var1.length];
      String[] var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var1.length) {
            try {
               var6 = var3;
               if (var2 == null) {
                  break;
               }

               var3[var4] = new I3(this, var1[var4]);
               var4++;
               if (var2 != null) {
                  continue;
               }
            } catch (P_5 var5) {
               throw a(var5);
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   public static com.finalshell.ui.model.S_3 C(int param0) {
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
      // 04: iload 0
      // 05: invokestatic java/lang/reflect/Modifier.isPrivate (I)Z
      // 08: aload 1
      // 09: ifnull 24
      // 0c: ifeq 20
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: getstatic com/finalshell/ui/model/S_3.PRIVATE Lcom/finalshell/ui/model/S_3;
      // 19: goto 50
      // 1c: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: iload 0
      // 21: invokestatic java/lang/reflect/Modifier.isProtected (I)Z
      // 24: aload 1
      // 25: ifnull 40
      // 28: ifeq 3c
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: getstatic com/finalshell/ui/model/S_3.PROTECTED Lcom/finalshell/ui/model/S_3;
      // 35: goto 50
      // 38: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: iload 0
      // 3d: invokestatic java/lang/reflect/Modifier.isPublic (I)Z
      // 40: ifeq 4d
      // 43: getstatic com/finalshell/ui/model/S_3.PUBLIC Lcom/finalshell/ui/model/S_3;
      // 46: goto 50
      // 49: invokestatic com/finalshell/core/HA.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: getstatic com/finalshell/ui/model/S_3.DEFAULT Lcom/finalshell/ui/model/S_3;
      // 50: areturn
   }

   public static Q4_3[] f(HA var0, Type[] var1) throws B2_5 {
      return var0.R(var1);
   }

   public static C_L v(HA var0) {
      return var0.P;
   }

   public static Hd2 r(HA var0, java.lang.Class var1) {
      return var0.X(var1);
   }

   public static com.finalshell.ui.model.S_3 J(int var0) {
      return C(var0);
   }

   public static Hd2[] f(HA var0, java.lang.Class[] var1) {
      return var0.h(var1);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -11958) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 144;
               break;
            case 1:
               var10000 = 206;
               break;
            case 2:
               var10000 = 23;
               break;
            case 3:
               var10000 = 234;
               break;
            case 4:
               var10000 = 61;
               break;
            case 5:
               var10000 = 27;
               break;
            case 6:
               var10000 = 120;
               break;
            case 7:
               var10000 = 40;
               break;
            case 8:
               var10000 = 223;
               break;
            case 9:
               var10000 = 177;
               break;
            case 10:
               var10000 = 246;
               break;
            case 11:
               var10000 = 185;
               break;
            case 12:
               var10000 = 212;
               break;
            case 13:
               var10000 = 8;
               break;
            case 14:
               var10000 = 11;
               break;
            case 15:
               var10000 = 114;
               break;
            case 16:
               var10000 = 176;
               break;
            case 17:
               var10000 = 250;
               break;
            case 18:
               var10000 = 21;
               break;
            case 19:
               var10000 = 87;
               break;
            case 20:
               var10000 = 160;
               break;
            case 21:
               var10000 = 35;
               break;
            case 22:
               var10000 = 165;
               break;
            case 23:
               var10000 = 51;
               break;
            case 24:
               var10000 = 100;
               break;
            case 25:
               var10000 = 85;
               break;
            case 26:
               var10000 = 174;
               break;
            case 27:
               var10000 = 14;
               break;
            case 28:
               var10000 = 9;
               break;
            case 29:
               var10000 = 188;
               break;
            case 30:
               var10000 = 129;
               break;
            case 31:
               var10000 = 232;
               break;
            case 32:
               var10000 = 208;
               break;
            case 33:
               var10000 = 104;
               break;
            case 34:
               var10000 = 194;
               break;
            case 35:
               var10000 = 82;
               break;
            case 36:
               var10000 = 18;
               break;
            case 37:
               var10000 = 236;
               break;
            case 38:
               var10000 = 93;
               break;
            case 39:
               var10000 = 52;
               break;
            case 40:
               var10000 = 158;
               break;
            case 41:
               var10000 = 103;
               break;
            case 42:
               var10000 = 181;
               break;
            case 43:
               var10000 = 125;
               break;
            case 44:
               var10000 = 226;
               break;
            case 45:
               var10000 = 175;
               break;
            case 46:
               var10000 = 89;
               break;
            case 47:
               var10000 = 13;
               break;
            case 48:
               var10000 = 65;
               break;
            case 49:
               var10000 = 22;
               break;
            case 50:
               var10000 = 142;
               break;
            case 51:
               var10000 = 229;
               break;
            case 52:
               var10000 = 81;
               break;
            case 53:
               var10000 = 43;
               break;
            case 54:
               var10000 = 166;
               break;
            case 55:
               var10000 = 128;
               break;
            case 56:
               var10000 = 58;
               break;
            case 57:
               var10000 = 7;
               break;
            case 58:
               var10000 = 225;
               break;
            case 59:
               var10000 = 231;
               break;
            case 60:
               var10000 = 92;
               break;
            case 61:
               var10000 = 202;
               break;
            case 62:
               var10000 = 179;
               break;
            case 63:
               var10000 = 143;
               break;
            case 64:
               var10000 = 127;
               break;
            case 65:
               var10000 = 84;
               break;
            case 66:
               var10000 = 122;
               break;
            case 67:
               var10000 = 233;
               break;
            case 68:
               var10000 = 44;
               break;
            case 69:
               var10000 = 38;
               break;
            case 70:
               var10000 = 170;
               break;
            case 71:
               var10000 = 133;
               break;
            case 72:
               var10000 = 149;
               break;
            case 73:
               var10000 = 164;
               break;
            case 74:
               var10000 = 148;
               break;
            case 75:
               var10000 = 86;
               break;
            case 76:
               var10000 = 1;
               break;
            case 77:
               var10000 = 6;
               break;
            case 78:
               var10000 = 169;
               break;
            case 79:
               var10000 = 0;
               break;
            case 80:
               var10000 = 15;
               break;
            case 81:
               var10000 = 221;
               break;
            case 82:
               var10000 = 162;
               break;
            case 83:
               var10000 = 159;
               break;
            case 84:
               var10000 = 239;
               break;
            case 85:
               var10000 = 57;
               break;
            case 86:
               var10000 = 241;
               break;
            case 87:
               var10000 = 74;
               break;
            case 88:
               var10000 = 20;
               break;
            case 89:
               var10000 = 39;
               break;
            case 90:
               var10000 = 217;
               break;
            case 91:
               var10000 = 215;
               break;
            case 92:
               var10000 = 200;
               break;
            case 93:
               var10000 = 62;
               break;
            case 94:
               var10000 = 245;
               break;
            case 95:
               var10000 = 10;
               break;
            case 96:
               var10000 = 252;
               break;
            case 97:
               var10000 = 227;
               break;
            case 98:
               var10000 = 193;
               break;
            case 99:
               var10000 = 157;
               break;
            case 100:
               var10000 = 238;
               break;
            case 101:
               var10000 = 47;
               break;
            case 102:
               var10000 = 192;
               break;
            case 103:
               var10000 = 31;
               break;
            case 104:
               var10000 = 88;
               break;
            case 105:
               var10000 = 97;
               break;
            case 106:
               var10000 = 187;
               break;
            case 107:
               var10000 = 73;
               break;
            case 108:
               var10000 = 191;
               break;
            case 109:
               var10000 = 155;
               break;
            case 110:
               var10000 = 186;
               break;
            case 111:
               var10000 = 25;
               break;
            case 112:
               var10000 = 116;
               break;
            case 113:
               var10000 = 211;
               break;
            case 114:
               var10000 = 222;
               break;
            case 115:
               var10000 = 50;
               break;
            case 116:
               var10000 = 195;
               break;
            case 117:
               var10000 = 131;
               break;
            case 118:
               var10000 = 102;
               break;
            case 119:
               var10000 = 45;
               break;
            case 120:
               var10000 = 30;
               break;
            case 121:
               var10000 = 99;
               break;
            case 122:
               var10000 = 209;
               break;
            case 123:
               var10000 = 147;
               break;
            case 124:
               var10000 = 17;
               break;
            case 125:
               var10000 = 182;
               break;
            case 126:
               var10000 = 67;
               break;
            case 127:
               var10000 = 197;
               break;
            case 128:
               var10000 = 235;
               break;
            case 129:
               var10000 = 115;
               break;
            case 130:
               var10000 = 237;
               break;
            case 131:
               var10000 = 141;
               break;
            case 132:
               var10000 = 101;
               break;
            case 133:
               var10000 = 121;
               break;
            case 134:
               var10000 = 172;
               break;
            case 135:
               var10000 = 70;
               break;
            case 136:
               var10000 = 32;
               break;
            case 137:
               var10000 = 49;
               break;
            case 138:
               var10000 = 199;
               break;
            case 139:
               var10000 = 210;
               break;
            case 140:
               var10000 = 243;
               break;
            case 141:
               var10000 = 255;
               break;
            case 142:
               var10000 = 216;
               break;
            case 143:
               var10000 = 56;
               break;
            case 144:
               var10000 = 184;
               break;
            case 145:
               var10000 = 78;
               break;
            case 146:
               var10000 = 218;
               break;
            case 147:
               var10000 = 190;
               break;
            case 148:
               var10000 = 123;
               break;
            case 149:
               var10000 = 41;
               break;
            case 150:
               var10000 = 247;
               break;
            case 151:
               var10000 = 64;
               break;
            case 152:
               var10000 = 132;
               break;
            case 153:
               var10000 = 219;
               break;
            case 154:
               var10000 = 153;
               break;
            case 155:
               var10000 = 224;
               break;
            case 156:
               var10000 = 80;
               break;
            case 157:
               var10000 = 109;
               break;
            case 158:
               var10000 = 24;
               break;
            case 159:
               var10000 = 230;
               break;
            case 160:
               var10000 = 180;
               break;
            case 161:
               var10000 = 213;
               break;
            case 162:
               var10000 = 117;
               break;
            case 163:
               var10000 = 249;
               break;
            case 164:
               var10000 = 37;
               break;
            case 165:
               var10000 = 90;
               break;
            case 166:
               var10000 = 68;
               break;
            case 167:
               var10000 = 113;
               break;
            case 168:
               var10000 = 34;
               break;
            case 169:
               var10000 = 136;
               break;
            case 170:
               var10000 = 2;
               break;
            case 171:
               var10000 = 167;
               break;
            case 172:
               var10000 = 207;
               break;
            case 173:
               var10000 = 59;
               break;
            case 174:
               var10000 = 173;
               break;
            case 175:
               var10000 = 220;
               break;
            case 176:
               var10000 = 135;
               break;
            case 177:
               var10000 = 72;
               break;
            case 178:
               var10000 = 201;
               break;
            case 179:
               var10000 = 53;
               break;
            case 180:
               var10000 = 42;
               break;
            case 181:
               var10000 = 178;
               break;
            case 182:
               var10000 = 71;
               break;
            case 183:
               var10000 = 139;
               break;
            case 184:
               var10000 = 126;
               break;
            case 185:
               var10000 = 204;
               break;
            case 186:
               var10000 = 69;
               break;
            case 187:
               var10000 = 242;
               break;
            case 188:
               var10000 = 112;
               break;
            case 189:
               var10000 = 154;
               break;
            case 190:
               var10000 = 134;
               break;
            case 191:
               var10000 = 138;
               break;
            case 192:
               var10000 = 145;
               break;
            case 193:
               var10000 = 119;
               break;
            case 194:
               var10000 = 189;
               break;
            case 195:
               var10000 = 33;
               break;
            case 196:
               var10000 = 5;
               break;
            case 197:
               var10000 = 46;
               break;
            case 198:
               var10000 = 66;
               break;
            case 199:
               var10000 = 77;
               break;
            case 200:
               var10000 = 75;
               break;
            case 201:
               var10000 = 161;
               break;
            case 202:
               var10000 = 91;
               break;
            case 203:
               var10000 = 244;
               break;
            case 204:
               var10000 = 19;
               break;
            case 205:
               var10000 = 124;
               break;
            case 206:
               var10000 = 248;
               break;
            case 207:
               var10000 = 214;
               break;
            case 208:
               var10000 = 96;
               break;
            case 209:
               var10000 = 140;
               break;
            case 210:
               var10000 = 168;
               break;
            case 211:
               var10000 = 146;
               break;
            case 212:
               var10000 = 196;
               break;
            case 213:
               var10000 = 163;
               break;
            case 214:
               var10000 = 150;
               break;
            case 215:
               var10000 = 203;
               break;
            case 216:
               var10000 = 240;
               break;
            case 217:
               var10000 = 76;
               break;
            case 218:
               var10000 = 105;
               break;
            case 219:
               var10000 = 254;
               break;
            case 220:
               var10000 = 48;
               break;
            case 221:
               var10000 = 28;
               break;
            case 222:
               var10000 = 4;
               break;
            case 223:
               var10000 = 26;
               break;
            case 224:
               var10000 = 205;
               break;
            case 225:
               var10000 = 107;
               break;
            case 226:
               var10000 = 95;
               break;
            case 227:
               var10000 = 111;
               break;
            case 228:
               var10000 = 156;
               break;
            case 229:
               var10000 = 79;
               break;
            case 230:
               var10000 = 110;
               break;
            case 231:
               var10000 = 183;
               break;
            case 232:
               var10000 = 60;
               break;
            case 233:
               var10000 = 253;
               break;
            case 234:
               var10000 = 55;
               break;
            case 235:
               var10000 = 106;
               break;
            case 236:
               var10000 = 63;
               break;
            case 237:
               var10000 = 54;
               break;
            case 238:
               var10000 = 108;
               break;
            case 239:
               var10000 = 36;
               break;
            case 240:
               var10000 = 3;
               break;
            case 241:
               var10000 = 152;
               break;
            case 242:
               var10000 = 98;
               break;
            case 243:
               var10000 = 29;
               break;
            case 244:
               var10000 = 83;
               break;
            case 245:
               var10000 = 137;
               break;
            case 246:
               var10000 = 94;
               break;
            case 247:
               var10000 = 228;
               break;
            case 248:
               var10000 = 118;
               break;
            case 249:
               var10000 = 12;
               break;
            case 250:
               var10000 = 198;
               break;
            case 251:
               var10000 = 171;
               break;
            case 252:
               var10000 = 151;
               break;
            case 253:
               var10000 = 251;
               break;
            case 254:
               var10000 = 130;
               break;
            default:
               var10000 = 16;
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
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "ÐTm¹b\u0092µu{\u001c\u0099íÊ®\u0086ÁÜ\u0015§\u001fïdÝÐ0b\u0014\u0018·\u009a÷\u001c\u0013\u009d}x`>Ù\\\u0080rÜîµ\u008f¶\u000e\u0081o\u0098\u0010îí±C\u008aÛ\u008c\u0081À \u009e\\!6ø\u008a\u0003I&]\u0003\u008dGM\u0010Q\u0005F^txSõ;.á\u008dÎ\f\u0005Í\u0010wMx_(\u001f}Ñëoa¤Ìñ\u0015\u0087\u0017éf«:R³2D*ðvÑk\u0082Ròíd\u001c)\u0085\u001e\u0005\u0003×/\u0006";
      int var4 = "ÐTm¹b\u0092µu{\u001c\u0099íÊ®\u0086ÁÜ\u0015§\u001fïdÝÐ0b\u0014\u0018·\u009a÷\u001c\u0013\u009d}x`>Ù\\\u0080rÜîµ\u008f¶\u000e\u0081o\u0098\u0010îí±C\u008aÛ\u008c\u0081À \u009e\\!6ø\u008a\u0003I&]\u0003\u008dGM\u0010Q\u0005F^txSõ;.á\u008dÎ\f\u0005Í\u0010wMx_(\u001f}Ñëoa¤Ìñ\u0015\u0087\u0017éf«:R³2D*ðvÑk\u0082Ròíd\u001c)\u0085\u001e\u0005\u0003×/\u0006"
         .length();
      char var1 = 19;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 89;
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
                        var46 = 66;
                        break;
                     case 1:
                        var46 = 16;
                        break;
                     case 2:
                        var46 = 8;
                        break;
                     case 3:
                        var46 = 96;
                        break;
                     case 4:
                        var46 = 112;
                        break;
                     case 5:
                        var46 = 12;
                        break;
                     default:
                        var46 = 39;
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
                     c = new String[11];
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

                  var2 = "Á#\ttsÛ[\u009f\\Hzå";
                  var4 = "Á#\ttsÛ[\u009f\\Hzå".length();
                  var1 = 2;
                  var8 = -1;
            }

            var10000 = 126;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}






