package com;

import java.io.IOException;
import java.lang.reflect.Type;

public class cT_3 implements com.ak_2 {
   public static final com.cT_3 Q;
   private static final String a;

   @Override
   public void u(nL_3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/nL_3.w Lcom/yM_3;
      // 07: astore 7
      // 09: astore 6
      // 0b: getstatic com/np_4.a Lcom/np_4;
      // 0e: astore 8
      // 10: aload 2
      // 11: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 14: getstatic com/cT_3.a Ljava/lang/String;
      // 17: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 1a: astore 9
      // 1c: aload 9
      // 1e: aload 6
      // 20: ifnull 46
      // 23: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 26: invokestatic java/lang/reflect/Modifier.isPrivate (I)Z
      // 29: ifeq 40
      // 2c: goto 33
      // 2f: invokestatic com/cT_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: aload 9
      // 35: bipush 1
      // 36: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 39: goto 40
      // 3c: invokestatic com/cT_3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 9
      // 42: aload 2
      // 43: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 46: astore 10
      // 48: aload 8
      // 4a: aload 1
      // 4b: aload 10
      // 4d: aload 3
      // 4e: aload 4
      // 50: iload 5
      // 52: invokevirtual com/np_4.u (Lcom/nL_3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
      // 55: goto 5f
      // 58: astore 9
      // 5a: aload 7
      // 5c: invokevirtual com/yM_3.Y ()V
      // 5f: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "z\u0005Q".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 26;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 26;
         var10006 = var0;
      } else {
         var6 = 26;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            Q = new com.cT_3();
            return;
         }

         var10005 = var10003;
         var10 = 26;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 13;
               break;
            case 1:
               var23 = 126;
               break;
            case 2:
               var23 = 59;
               break;
            case 3:
               var23 = 31;
               break;
            case 4:
               var23 = 72;
               break;
            case 5:
               var23 = 75;
               break;
            default:
               var23 = 79;
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
               Q = new com.cT_3();
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





