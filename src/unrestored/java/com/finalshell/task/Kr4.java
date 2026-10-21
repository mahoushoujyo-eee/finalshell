package com.finalshell.task;

import com.finalshell.core.Ip6;

public class Kr4 implements Runnable {
   public final Ip6 B;
   public static String a;

   public Kr4(Ip6 var1) {
      this.B = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Co4.n ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/task/Kr4.B Lcom/finalshell/core/Ip6;
      // 07: invokestatic com/finalshell/core/Ip6.h (Lcom/finalshell/core/Ip6;)Ljava/io/File;
      // 0a: invokevirtual java/io/File.lastModified ()J
      // 0d: lstore 2
      // 0e: astore 1
      // 0f: lload 2
      // 10: aload 1
      // 11: ifnonnull 2d
      // 14: invokestatic com/finalshell/core/Ip6.T ()Ljava/lang/Long;
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lcmp
      // 1b: ifle 4e
      // 1e: goto 25
      // 21: invokestatic com/finalshell/task/Kr4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: lload 2
      // 26: goto 2d
      // 29: invokestatic com/finalshell/task/Kr4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30: invokestatic com/finalshell/core/Ip6.D (Ljava/lang/Long;)Ljava/lang/Long;
      // 33: pop
      // 34: aload 0
      // 35: getfield com/finalshell/task/Kr4.B Lcom/finalshell/core/Ip6;
      // 38: invokestatic com/finalshell/core/Ip6.p (Lcom/finalshell/core/Ip6;)V
      // 3b: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 3e: getstatic com/finalshell/task/Kr4.a Ljava/lang/String;
      // 41: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 44: goto 4e
      // 47: astore 4
      // 49: aload 4
      // 4b: invokevirtual java/lang/Exception.printStackTrace ()V
      // 4e: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "^\u0001v7O\u0003".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 90;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 90;
         var10006 = var0;
      } else {
         var6 = 90;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 90;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 118;
               break;
            case 1:
               var23 = 62;
               break;
            case 2:
               var23 = 64;
               break;
            case 3:
               var23 = 2;
               break;
            case 4:
               var23 = 116;
               break;
            case 5:
               var23 = 61;
               break;
            default:
               var23 = 10;
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
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





