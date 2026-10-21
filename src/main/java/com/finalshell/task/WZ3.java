package com.finalshell.task;

import com.finalshell.ui.panel.SetBackgroundImagePanel;

public class WZ3 implements Runnable {
   public final String X;
   public final boolean u;
   public final boolean d;
   public final SetBackgroundImagePanel e;
   public static String a;
   public static long b;

   public WZ3(SetBackgroundImagePanel var1, String var2, boolean var3, boolean var4) {
      this.e = var1;
      this.X = var2;
      this.u = var3;
      this.d = var4;
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
      // 00: invokestatic com/finalshell/ui/panel/ConnectionProperty.y ()I
      // 03: aload 0
      // 04: getfield com/finalshell/task/WZ3.X Ljava/lang/String;
      // 07: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a: ldc2_w 187742315791378852
      // 0d: astore 8
      // 0f: ldc2_w 187742315791378852
      // 12: aload 8
      // 14: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 17: checkcast [Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20: athrow
      // 21: astore 2
      // 22: bipush 1
      // 23: newarray 8
      // 25: astore 3
      // 26: istore 1
      // 27: aload 3
      // 28: bipush 0
      // 29: getstatic com/finalshell/task/WZ3.b J
      // 2c: l2i
      // 2d: bastore
      // 2e: bipush 0
      // 2f: istore 4
      // 31: iload 4
      // 33: aload 2
      // 34: arraylength
      // 35: if_icmpge d3
      // 38: aload 2
      // 39: iload 4
      // 3b: aaload
      // 3c: astore 5
      // 3e: aload 5
      // 40: getstatic com/finalshell/task/WZ3.a Ljava/lang/String;
      // 43: ldc ""
      // 45: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 48: astore 5
      // 4a: aload 0
      // 4b: getfield com/finalshell/task/WZ3.e Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // 4e: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.A$E0 (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)Lcom/finalshell/core/E0;
      // 51: aload 5
      // 53: invokevirtual com/finalshell/core/E0.D (Ljava/lang/String;)V
      // 56: goto 5b
      // 59: astore 6
      // 5b: iload 4
      // 5d: aload 2
      // 5e: arraylength
      // 5f: bipush 1
      // 60: isub
      // 61: if_icmpne 64
      // 64: bipush 1
      // 65: istore 6
      // 67: iload 4
      // 69: iload 1
      // 6a: ifne 83
      // 6d: aload 2
      // 6e: arraylength
      // 6f: bipush 1
      // 70: isub
      // 71: if_icmpne 81
      // 74: goto 7b
      // 77: invokestatic com/finalshell/task/WZ3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7a: athrow
      // 7b: aload 0
      // 7c: getfield com/finalshell/task/WZ3.u Z
      // 7f: istore 6
      // 81: iload 6
      // 83: iload 1
      // 84: ifne a7
      // 87: ifeq cc
      // 8a: goto 91
      // 8d: invokestatic com/finalshell/task/WZ3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 90: athrow
      // 91: aload 0
      // 92: iload 1
      // 93: ifne bd
      // 96: goto 9d
      // 99: invokestatic com/finalshell/task/WZ3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9c: athrow
      // 9d: getfield com/finalshell/task/WZ3.d Z
      // a0: goto a7
      // a3: invokestatic com/finalshell/task/WZ3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a6: athrow
      // a7: ifeq bc
      // aa: aload 0
      // ab: getfield com/finalshell/task/WZ3.e Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // ae: invokevirtual com/finalshell/ui/panel/SetBackgroundImagePanel.K ()V
      // b1: iload 1
      // b2: ifeq cc
      // b5: goto bc
      // b8: invokestatic com/finalshell/task/WZ3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // bb: athrow
      // bc: aload 0
      // bd: getfield com/finalshell/task/WZ3.e Lcom/finalshell/ui/panel/SetBackgroundImagePanel;
      // c0: invokestatic com/finalshell/ui/panel/SetBackgroundImagePanel.A$E0 (Lcom/finalshell/ui/panel/SetBackgroundImagePanel;)Lcom/finalshell/core/E0;
      // c3: aload 3
      // c4: invokevirtual com/finalshell/core/E0.J ([B)V
      // c7: goto cc
      // ca: astore 7
      // cc: iinc 4 1
      // cf: iload 1
      // d0: ifeq 31
      // d3: return
   }

   public static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = " R0".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 36;
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
         var10007 = 36;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 88;
               break;
            case 1:
               var21 = 4;
               break;
            case 2:
               var21 = 48;
               break;
            case 3:
               var21 = 20;
               break;
            case 4:
               var21 = 74;
               break;
            case 5:
               var21 = 34;
               break;
            default:
               var21 = 106;
         }
      } else {
         var13 = 36;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 6827464145713970689L;
            long var12 = 8780127020605455884L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 36;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 88;
               break;
            case 1:
               var21 = 4;
               break;
            case 2:
               var21 = 48;
               break;
            case 3:
               var21 = 20;
               break;
            case 4:
               var21 = 74;
               break;
            case 5:
               var21 = 34;
               break;
            default:
               var21 = 106;
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
                  var21 = 88;
                  break;
               case 1:
                  var21 = 4;
                  break;
               case 2:
                  var21 = 48;
                  break;
               case 3:
                  var21 = 20;
                  break;
               case 4:
                  var21 = 74;
                  break;
               case 5:
                  var21 = 34;
                  break;
               default:
                  var21 = 106;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 6827464145713970689L;
               long var11 = 8780127020605455884L ^ var0;
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
                  var21 = 88;
                  break;
               case 1:
                  var21 = 4;
                  break;
               case 2:
                  var21 = 48;
                  break;
               case 3:
                  var21 = 20;
                  break;
               case 4:
                  var21 = 74;
                  break;
               case 5:
                  var21 = 34;
                  break;
               default:
                  var21 = 106;
            }
         }
      }
   }
}





