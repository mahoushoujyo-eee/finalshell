package org.V;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public abstract class f implements org.V.H {
   private static int[] N;
   private static final String a;

   @Override
   public final OutputStream X(String param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/V/f.h ()[I
      // 03: aload 0
      // 04: aload 1
      // 05: invokevirtual org/V/f.r (Ljava/lang/String;)Ljava/io/File;
      // 08: astore 3
      // 09: aload 3
      // 0a: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0d: astore 4
      // 0f: astore 2
      // 10: aload 4
      // 12: aload 2
      // 13: ifnonnull 22
      // 16: ifnull 67
      // 19: goto 20
      // 1c: invokestatic org/V/f.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1f: athrow
      // 20: aload 4
      // 22: invokevirtual java/io/File.isDirectory ()Z
      // 25: aload 2
      // 26: ifnonnull 3f
      // 29: ifne 67
      // 2c: goto 33
      // 2f: invokestatic org/V/f.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 32: athrow
      // 33: aload 4
      // 35: invokevirtual java/io/File.mkdirs ()Z
      // 38: goto 3f
      // 3b: invokestatic org/V/f.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 3e: athrow
      // 3f: ifne 67
      // 42: new java/io/IOException
      // 45: dup
      // 46: new java/lang/StringBuilder
      // 49: dup
      // 4a: invokespecial java/lang/StringBuilder.<init> ()V
      // 4d: getstatic org/V/f.a Ljava/lang/String;
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: aload 3
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 57: ldc "\""
      // 59: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5f: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 62: athrow
      // 63: invokestatic org/V/f.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 66: athrow
      // 67: new java/io/FileOutputStream
      // 6a: dup
      // 6b: aload 3
      // 6c: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 6f: areturn
   }

   @Override
   public final boolean A(String var1) {
      return this.r(var1).delete();
   }

   protected abstract File r(String var1);

   public static void M(int[] var0) {
      N = var0;
   }

   public static int[] h() {
      return N;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      if (h() != null) {
         M(new int[1]);
      }

      char[] var10003 = "o\u0010\u0011\u0003\u000f3[O\u0003\u001a\f\u0014\"[H\u0018\r\b\u00033\u0014^\b_\u000b\u000f5[O\u001d\u001e\u001e\u0013g\u001dE\u001d\u001aMB"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 67;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 67;
         var10006 = var0;
      } else {
         var6 = 67;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 67;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 111;
               break;
            case 1:
               var23 = 50;
               break;
            case 2:
               var23 = 60;
               break;
            case 3:
               var23 = 46;
               break;
            case 4:
               var23 = 35;
               break;
            case 5:
               var23 = 4;
               break;
            default:
               var23 = 56;
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





