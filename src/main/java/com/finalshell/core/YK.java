package com.finalshell.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class YK {
   public static Properties s;
   public static File W;

   static {
      __vfClinit__();
   }

   public static String T(String var0) {
      String var1 = D6.k();
      Properties var10000 = s;
      String var10001 = var0;
      if (var1 == null) {
         if (!s.containsKey(var0)) {
            return "";
         }

         var10000 = s;
         var10001 = var0;
      }

      return var10000.get(var10001).toString();
   }

   public static void u(String var0, String var1) {
      String var2 = D6.k();
      Properties var10000 = s;
      String var10001 = var0;
      if (var2 == null) {
         if (!s.containsKey(var0)) {
            return;
         }

         var10000 = s;
         var10001 = var0;
      }

      var10000.put(var10001, var1);
   }

   public static void N(String[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D6.k ()Ljava/lang/String;
      // 03: astore 1
      // 04: new java/io/FileWriter
      // 07: dup
      // 08: getstatic com/finalshell/core/YK.W Ljava/io/File;
      // 0b: invokespecial java/io/FileWriter.<init> (Ljava/io/File;)V
      // 0e: astore 2
      // 0f: new java/io/BufferedWriter
      // 12: dup
      // 13: aload 2
      // 14: invokespecial java/io/BufferedWriter.<init> (Ljava/io/Writer;)V
      // 17: astore 3
      // 18: bipush 0
      // 19: istore 4
      // 1b: aload 1
      // 1c: ifnull 51
      // 1f: aload 3
      // 20: new java/lang/StringBuilder
      // 23: dup
      // 24: aload 0
      // 25: iload 4
      // 27: aaload
      // 28: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 2b: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 2e: ldc "="
      // 30: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33: aload 0
      // 34: iload 4
      // 36: aaload
      // 37: invokestatic com/finalshell/core/YK.T (Ljava/lang/String;)Ljava/lang/String;
      // 3a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 40: invokevirtual java/io/BufferedWriter.write (Ljava/lang/String;)V
      // 43: aload 3
      // 44: invokevirtual java/io/BufferedWriter.newLine ()V
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/YK.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: iinc 4 1
      // 51: iload 4
      // 53: aload 0
      // 54: arraylength
      // 55: if_icmplt 1f
      // 58: aload 3
      // 59: invokevirtual java/io/BufferedWriter.close ()V
      // 5c: aload 2
      // 5d: invokevirtual java/io/FileWriter.close ()V
      // 60: aload 1
      // 61: ifnonnull 4e
      // 64: goto 6c
      // 67: astore 2
      // 68: aload 2
      // 69: invokevirtual java/lang/Exception.printStackTrace ()V
      // 6c: return
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Pg\u0013\n\u0012)\u001eE|\u0017\u000b8(\u0019".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var11 = 34;
      char[] var10002 = var10003;
      int var6 = var10004;
      char[] var15;
      byte var19;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var15 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 34;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var19 = 1;
               break;
            case 1:
               var19 = 55;
               break;
            case 2:
               var19 = 82;
               break;
            case 3:
               var19 = 7;
               break;
            case 4:
               var19 = 115;
               break;
            case 5:
               var19 = 100;
               break;
            default:
               var19 = 82;
         }
      } else {
         var11 = 34;
         var6 = var10004;
         if (var10004 <= var1) {
            String var14 = new String(var10003).intern();
            byte var9 = -1;
            String var5 = var14;
            s = null;
            W = new File(var5);

            try {
               s = new Properties();
               s.load(new FileInputStream(W));
            } catch (Exception var4) {
               var4.printStackTrace();
            }

            return;
         }

         var15 = var10003;
         var10005 = var1;
         char var20 = var10003[var1];
         var10007 = 34;
         var10006 = var20;
         switch (var1 % 7) {
            case 0:
               var19 = 1;
               break;
            case 1:
               var19 = 55;
               break;
            case 2:
               var19 = 82;
               break;
            case 3:
               var19 = 7;
               break;
            case 4:
               var19 = 115;
               break;
            case 5:
               var19 = 100;
               break;
            default:
               var19 = 82;
         }
      }

      while (true) {
         var15[var10005] = (char)(var10006 ^ var10007 ^ var19);
         var1++;
         if (var11 == 0) {
            var15 = var10002;
            var10005 = var11;
            char var22 = var10002[var11];
            var10007 = var11;
            var10006 = var22;
            switch (var1 % 7) {
               case 0:
                  var19 = 1;
                  break;
               case 1:
                  var19 = 55;
                  break;
               case 2:
                  var19 = 82;
                  break;
               case 3:
                  var19 = 7;
                  break;
               case 4:
                  var19 = 115;
                  break;
               case 5:
                  var19 = 100;
                  break;
               default:
                  var19 = 82;
            }
         } else {
            if (var6 <= var1) {
               String var13 = new String(var10002).intern();
               byte var8 = -1;
               String var0 = var13;
               s = null;
               W = new File(var0);

               try {
                  s = new Properties();
                  s.load(new FileInputStream(W));
               } catch (Exception var3) {
                  var3.printStackTrace();
               }

               return;
            }

            var15 = var10002;
            var10005 = var1;
            char var21 = var10002[var1];
            var10007 = var11;
            var10006 = var21;
            switch (var1 % 7) {
               case 0:
                  var19 = 1;
                  break;
               case 1:
                  var19 = 55;
                  break;
               case 2:
                  var19 = 82;
                  break;
               case 3:
                  var19 = 7;
                  break;
               case 4:
                  var19 = 115;
                  break;
               case 5:
                  var19 = 100;
                  break;
               default:
                  var19 = 82;
            }
         }
      }
   }
}





