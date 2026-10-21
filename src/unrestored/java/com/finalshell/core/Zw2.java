package com.finalshell.core;

public class Zw2 extends Z8 {
   public final Object d;
   public boolean o;
   public static String c;

   public Zw2(String param1, boolean param2, Object param3, boolean param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: iload 2
      // 06: invokespecial com/finalshell/core/Z8.<init> (Ljava/lang/String;Z)V
      // 09: aload 0
      // 0a: bipush 1
      // 0b: putfield com/finalshell/core/Zw2.o Z
      // 0e: astore 5
      // 10: aload 5
      // 12: ifnonnull 3a
      // 15: aload 3
      // 16: ifnonnull 2f
      // 19: goto 20
      // 1c: invokestatic com/finalshell/core/Zw2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f: athrow
      // 20: new java/lang/IllegalArgumentException
      // 23: dup
      // 24: getstatic com/finalshell/core/Zw2.c Ljava/lang/String;
      // 27: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 2a: athrow
      // 2b: invokestatic com/finalshell/core/Zw2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 3
      // 31: putfield com/finalshell/core/Zw2.d Ljava/lang/Object;
      // 34: aload 0
      // 35: iload 4
      // 37: putfield com/finalshell/core/Zw2.o Z
      // 3a: return
   }

   @Override
   public boolean x(Ph4 param1, Object param2, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: aload 0
      // 04: aload 1
      // 05: aload 2
      // 06: aload 4
      // 08: invokevirtual com/finalshell/core/Zw2.H (Lcom/finalshell/core/Ph4;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 6
      // 0d: astore 5
      // 0f: aload 0
      // 10: getfield com/finalshell/core/Zw2.d Ljava/lang/Object;
      // 13: aload 6
      // 15: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 18: istore 7
      // 1a: aload 0
      // 1b: getfield com/finalshell/core/Zw2.o Z
      // 1e: aload 5
      // 20: ifnonnull 4e
      // 23: ifne 4c
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Zw2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: iload 7
      // 2f: aload 5
      // 31: ifnonnull 46
      // 34: goto 3b
      // 37: invokestatic com/finalshell/core/Zw2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: ifne 49
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Zw2.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4a
      // 49: bipush 0
      // 4a: istore 7
      // 4c: iload 7
      // 4e: ireturn
   }

   public static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Z<*? ^T_}(?)\u0012".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 34;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 34;
         var10006 = var0;
      } else {
         var6 = 34;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 34;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 14;
               break;
            case 1:
               var23 = 127;
               break;
            case 2:
               var23 = 100;
               break;
            case 3:
               var23 = 104;
               break;
            case 4:
               var23 = 103;
               break;
            case 5:
               var23 = 92;
               break;
            default:
               var23 = 31;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               c = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





