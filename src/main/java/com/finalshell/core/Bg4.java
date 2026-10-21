package com.finalshell.core;

public class Bg4 extends BN3 {
   public static Exception L;
   public static Thread f;
   public static Thread O;
   public static String a;
   public static long b;

   static void T() throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/BN3.Z ()I
      // 03: istore 0
      // 04: getstatic com/finalshell/core/Bg4.a Ljava/lang/String;
      // 07: invokestatic com/finalshell/core/Bg4.r (Ljava/lang/String;)V
      // 0a: invokestatic com/finalshell/core/Bg4.m ()V
      // 0d: new java/lang/Thread
      // 10: dup
      // 11: new com/finalshell/task/Z4
      // 14: dup
      // 15: invokespecial com/finalshell/task/Z4.<init> ()V
      // 18: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 1b: putstatic com/finalshell/core/Bg4.f Ljava/lang/Thread;
      // 1e: new java/lang/Thread
      // 21: dup
      // 22: new com/finalshell/task/CK3
      // 25: dup
      // 26: invokespecial com/finalshell/task/CK3.<init> ()V
      // 29: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 2c: putstatic com/finalshell/core/Bg4.O Ljava/lang/Thread;
      // 2f: getstatic com/finalshell/core/Bg4.f Ljava/lang/Thread;
      // 32: invokevirtual java/lang/Thread.start ()V
      // 35: getstatic com/finalshell/core/Bg4.O Ljava/lang/Thread;
      // 38: invokevirtual java/lang/Thread.start ()V
      // 3b: getstatic com/finalshell/core/Bg4.f Ljava/lang/Thread;
      // 3e: invokevirtual java/lang/Thread.isAlive ()Z
      // 41: ifne 63
      // 44: getstatic com/finalshell/core/Bg4.O Ljava/lang/Thread;
      // 47: invokevirtual java/lang/Thread.isAlive ()Z
      // 4a: iload 0
      // 4b: ifeq 67
      // 4e: iload 0
      // 4f: ifeq 67
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/Bg4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: ifeq 6e
      // 5c: goto 63
      // 5f: invokestatic com/finalshell/core/Bg4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: getstatic com/finalshell/core/Bg4.b J
      // 66: l2i
      // 67: invokestatic com/finalshell/core/Bg4.D (I)V
      // 6a: iload 0
      // 6b: ifne 3b
      // 6e: getstatic com/finalshell/core/Bg4.L Ljava/lang/Exception;
      // 71: iload 0
      // 72: ifeq 82
      // 75: ifnull 83
      // 78: goto 7f
      // 7b: invokestatic com/finalshell/core/Bg4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: getstatic com/finalshell/core/Bg4.L Ljava/lang/Exception;
      // 82: athrow
      // 83: invokestatic com/finalshell/core/Bg4.i ()V
      // 86: invokestatic com/finalshell/core/Bg4.Y ()V
      // 89: goto 92
      // 8c: astore 1
      // 8d: invokestatic com/finalshell/core/Bg4.Y ()V
      // 90: aload 1
      // 91: athrow
      // 92: return
   }

   static Exception D() {
      return L;
   }

   static Exception t(Exception var0) {
      L = var0;
      return var0;
   }

   static Thread b() {
      return f;
   }

   static Thread Y() {
      return O;
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "F9H::-\u00002(R#jbXf".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 110;
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
         var10007 = 110;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 124;
               break;
            case 1:
               var21 = 50;
               break;
            case 2:
               var21 = 85;
               break;
            case 3:
               var21 = 32;
               break;
            case 4:
               var21 = 97;
               break;
            case 5:
               var21 = 99;
               break;
            default:
               var21 = 67;
         }
      } else {
         var13 = 110;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 8713189916433717069L;
            long var12 = 5010915351228847913L ^ var3;
            var8 = -1;
            b = var12;
            L = null;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 110;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 124;
               break;
            case 1:
               var21 = 50;
               break;
            case 2:
               var21 = 85;
               break;
            case 3:
               var21 = 32;
               break;
            case 4:
               var21 = 97;
               break;
            case 5:
               var21 = 99;
               break;
            default:
               var21 = 67;
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
                  var21 = 124;
                  break;
               case 1:
                  var21 = 50;
                  break;
               case 2:
                  var21 = 85;
                  break;
               case 3:
                  var21 = 32;
                  break;
               case 4:
                  var21 = 97;
                  break;
               case 5:
                  var21 = 99;
                  break;
               default:
                  var21 = 67;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 8713189916433717069L;
               long var11 = 5010915351228847913L ^ var0;
               var6 = -1;
               b = var11;
               L = null;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 124;
                  break;
               case 1:
                  var21 = 50;
                  break;
               case 2:
                  var21 = 85;
                  break;
               case 3:
                  var21 = 32;
                  break;
               case 4:
                  var21 = 97;
                  break;
               case 5:
                  var21 = 99;
                  break;
               default:
                  var21 = 67;
            }
         }
      }
   }
}





