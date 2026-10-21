package com.finalshell.task;

import com.finalshell.core.Connect;
import java.io.IOException;
import java.io.OutputStream;

public class LO extends Thread {
   final Connect k;
   public final OutputStream M;
   public static String a;
   public static long b;

   LO(Connect var1, OutputStream var2) {
      this.k = var1;
      this.M = var2;
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
      // 00: getstatic com/finalshell/task/LO.b J
      // 03: l2i
      // 04: newarray 8
      // 06: astore 2
      // 07: invokestatic com/finalshell/crypto/PingMessageR.N ()[Ljava/lang/String;
      // 0a: bipush 0
      // 0b: istore 3
      // 0c: astore 1
      // 0d: aload 1
      // 0e: ifnonnull 4b
      // 11: iinc 3 1
      // 14: aload 0
      // 15: getfield com/finalshell/task/LO.M Ljava/io/OutputStream;
      // 18: aload 2
      // 19: invokevirtual java/io/OutputStream.write ([B)V
      // 1c: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1f: new java/lang/StringBuilder
      // 22: dup
      // 23: getstatic com/finalshell/task/LO.a Ljava/lang/String;
      // 26: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 29: iload 3
      // 2a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 33: goto 41
      // 36: astore 4
      // 38: aload 4
      // 3a: invokevirtual java/io/IOException.printStackTrace ()V
      // 3d: aload 1
      // 3e: ifnonnull 50
      // 41: iinc 3 1
      // 44: goto 4b
      // 47: invokestatic com/finalshell/task/LO.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 4a: athrow
      // 4b: iload 3
      // 4c: bipush 5
      // 4d: if_icmplt 11
      // 50: aload 1
      // 51: ifnull 33
      // 54: return
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "冹兠宝戒g".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 117;
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
         var10007 = 117;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 85;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 100;
               break;
            case 3:
               var21 = 119;
               break;
            case 4:
               var21 = 50;
               break;
            case 5:
               var21 = 117;
               break;
            default:
               var21 = 44;
         }
      } else {
         var13 = 117;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 3842574752230863022L;
            long var12 = -8591029276728691242L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 117;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 85;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 100;
               break;
            case 3:
               var21 = 119;
               break;
            case 4:
               var21 = 50;
               break;
            case 5:
               var21 = 117;
               break;
            default:
               var21 = 44;
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
                  var21 = 85;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 100;
                  break;
               case 3:
                  var21 = 119;
                  break;
               case 4:
                  var21 = 50;
                  break;
               case 5:
                  var21 = 117;
                  break;
               default:
                  var21 = 44;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 3842574752230863022L;
               long var11 = -8591029276728691242L ^ var0;
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
                  var21 = 85;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 100;
                  break;
               case 3:
                  var21 = 119;
                  break;
               case 4:
                  var21 = 50;
                  break;
               case 5:
                  var21 = 117;
                  break;
               default:
                  var21 = 44;
            }
         }
      }
   }
}





