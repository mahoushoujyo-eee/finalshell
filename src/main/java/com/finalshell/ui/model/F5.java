package com.finalshell.ui.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias("Pair")
public class F5 implements Serializable, Cloneable {
   @XStreamAsAttribute
   public Object f;
   @XStreamAsAttribute
   public Object q;
   public static boolean e;
   public static String a;
   public static long b;

   public F5() {
      this(null, null);
   }

   public F5(Object var1) {
      this(var1, null);
   }

   public F5(Object var1, Object var2) {
      this.f = var1;
      this.q = var2;
   }

   public Object H() {
      return this.f;
   }

   public void x(Object var1) {
      this.f = var1;
   }

   public Object L() {
      return this.q;
   }

   public void s(Object var1) {
      this.q = var1;
   }

   @Override
   public String toString() {
      return this.f + "=" + this.q;
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/F5.A ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: getfield com/finalshell/ui/model/F5.f Ljava/lang/Object;
      // 08: invokevirtual java/lang/Object.hashCode ()I
      // 0b: getstatic com/finalshell/ui/model/F5.b J
      // 0e: l2i
      // 0f: imul
      // 10: aload 0
      // 11: getfield com/finalshell/ui/model/F5.q Ljava/lang/Object;
      // 14: iload 1
      // 15: ifne 2e
      // 18: ifnonnull 2a
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21: athrow
      // 22: bipush 0
      // 23: goto 31
      // 26: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield com/finalshell/ui/model/F5.q Ljava/lang/Object;
      // 2e: invokevirtual java/lang/Object.hashCode ()I
      // 31: iadd
      // 32: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 35: ifnull 4f
      // 38: iload 1
      // 39: ifeq 4b
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: bipush 0
      // 44: goto 4c
      // 47: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: invokestatic com/finalshell/ui/model/F5.k (Z)V
      // 4f: ireturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/F5.A ()Z
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 1
      // 1b: instanceof com/finalshell/ui/model/F5
      // 1e: iload 2
      // 1f: ifne c6
      // 22: ifeq c5
      // 25: goto 2c
      // 28: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/finalshell/ui/model/F5
      // 30: astore 3
      // 31: aload 0
      // 32: getfield com/finalshell/ui/model/F5.f Ljava/lang/Object;
      // 35: iload 2
      // 36: ifne 6e
      // 39: ifnull 6a
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield com/finalshell/ui/model/F5.f Ljava/lang/Object;
      // 47: iload 2
      // 48: ifne 87
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 51: athrow
      // 52: aload 3
      // 53: getfield com/finalshell/ui/model/F5.f Ljava/lang/Object;
      // 56: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 59: ifne 7c
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 62: athrow
      // 63: goto c3
      // 66: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 69: athrow
      // 6a: aload 3
      // 6b: getfield com/finalshell/ui/model/F5.f Ljava/lang/Object;
      // 6e: iload 2
      // 6f: ifne 87
      // 72: ifnonnull c3
      // 75: goto 7c
      // 78: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7b: athrow
      // 7c: aload 0
      // 7d: getfield com/finalshell/ui/model/F5.q Ljava/lang/Object;
      // 80: goto 87
      // 83: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 86: athrow
      // 87: iload 2
      // 88: ifne bc
      // 8b: ifnull b8
      // 8e: goto 95
      // 91: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 94: athrow
      // 95: aload 0
      // 96: getfield com/finalshell/ui/model/F5.q Ljava/lang/Object;
      // 99: aload 3
      // 9a: getfield com/finalshell/ui/model/F5.q Ljava/lang/Object;
      // 9d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // a0: iload 2
      // a1: ifne c0
      // a4: goto ab
      // a7: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // aa: athrow
      // ab: ifne bf
      // ae: goto b5
      // b1: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b4: athrow
      // b5: goto c3
      // b8: aload 3
      // b9: getfield com/finalshell/ui/model/F5.q Ljava/lang/Object;
      // bc: ifnonnull c3
      // bf: bipush 1
      // c0: goto c4
      // c3: bipush 0
      // c4: ireturn
      // c5: bipush 0
      // c6: ireturn
   }

   public F5 N() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/model/F5.A ()Z
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/ui/model/F5.H ()Ljava/lang/Object;
      // 08: instanceof java/lang/Cloneable
      // 0b: iload 1
      // 0c: ifne 32
      // 0f: ifeq 6a
      // 12: goto 19
      // 15: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifne 57
      // 1e: goto 25
      // 21: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24: athrow
      // 25: invokevirtual com/finalshell/ui/model/F5.L ()Ljava/lang/Object;
      // 28: instanceof java/lang/Cloneable
      // 2b: goto 32
      // 2e: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31: athrow
      // 32: ifeq 6a
      // 35: new com/finalshell/ui/model/F5
      // 38: dup
      // 39: aload 0
      // 3a: invokevirtual com/finalshell/ui/model/F5.H ()Ljava/lang/Object;
      // 3d: checkcast java/lang/Cloneable
      // 40: invokestatic com/finalshell/core/Kp2.E (Ljava/lang/Cloneable;)Ljava/lang/Cloneable;
      // 43: aload 0
      // 44: invokevirtual com/finalshell/ui/model/F5.L ()Ljava/lang/Object;
      // 47: checkcast java/lang/Cloneable
      // 4a: invokestatic com/finalshell/core/Kp2.E (Ljava/lang/Cloneable;)Ljava/lang/Cloneable;
      // 4d: invokespecial com/finalshell/ui/model/F5.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 50: goto 57
      // 53: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 56: athrow
      // 57: iload 1
      // 58: ifeq 69
      // 5b: bipush 4
      // 5c: anewarray 98
      // 5f: invokestatic com/finalshell/ui/panel/Ky4.K ([Ljava/lang/String;)V
      // 62: goto 69
      // 65: invokestatic com/finalshell/ui/model/F5.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 68: athrow
      // 69: areturn
      // 6a: new java/lang/RuntimeException
      // 6d: dup
      // 6e: getstatic com/finalshell/ui/model/F5.a Ljava/lang/String;
      // 71: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 74: athrow
   }

   @Override
   public Object clone() throws CloneNotSupportedException {
      return this.N();
   }

   public static void k(boolean var0) {
      e = var0;
   }

   public static boolean A() {
      return e;
   }

   public static boolean E() {
      boolean var0 = A();

      try {
         return !var0;
      } catch (RuntimeException var1) {
         throw a(var1);
      }
   }

   public static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (!E()) {
         k(true);
      }

      char[] var10003 = "g`H\u000f\u0015\u0013?\\/]\tQX,DcI\u0002\u0015\u000b2JzP\u0003\u0015\u00117UcY\nP\u0016.\u0005LP\b[\u001d;GcYF".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 78;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 78;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 107;
               break;
            case 1:
               var21 = 65;
               break;
            case 2:
               var21 = 114;
               break;
            case 3:
               var21 = 41;
               break;
            case 4:
               var21 = 123;
               break;
            case 5:
               var21 = 54;
               break;
            default:
               var21 = 20;
         }
      } else {
         var13 = 78;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 2419539180270016244L;
            long var12 = 8327290356892849913L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 78;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 107;
               break;
            case 1:
               var21 = 65;
               break;
            case 2:
               var21 = 114;
               break;
            case 3:
               var21 = 41;
               break;
            case 4:
               var21 = 123;
               break;
            case 5:
               var21 = 54;
               break;
            default:
               var21 = 20;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 107;
                  break;
               case 1:
                  var21 = 65;
                  break;
               case 2:
                  var21 = 114;
                  break;
               case 3:
                  var21 = 41;
                  break;
               case 4:
                  var21 = 123;
                  break;
               case 5:
                  var21 = 54;
                  break;
               default:
                  var21 = 20;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 2419539180270016244L;
               long var11 = 8327290356892849913L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 107;
                  break;
               case 1:
                  var21 = 65;
                  break;
               case 2:
                  var21 = 114;
                  break;
               case 3:
                  var21 = 41;
                  break;
               case 4:
                  var21 = 123;
                  break;
               case 5:
                  var21 = 54;
                  break;
               default:
                  var21 = 20;
            }
         }
      }
   }
}





