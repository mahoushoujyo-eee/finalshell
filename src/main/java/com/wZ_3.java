package com;

class wZ_3 implements Runnable {
   final String X;
   final boolean u;
   final boolean d;
   final pA_3 e;
   private static final String a;
   private static final long b;

   wZ_3(pA_3 var1, String var2, boolean var3, boolean var4) {
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
      // 00: invokestatic com/_y_2.y ()I
      // 03: aload 0
      // 04: getfield com/wZ_3.X Ljava/lang/String;
      // 07: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a: ldc2_w 187742315791378852
      // 0d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 10: swap
      // 11: aconst_null
      // 12: swap
      // 13: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 16: checkcast [Ljava/lang/String;
      // 19: goto 20
      // 1c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f: athrow
      // 20: astore 2
      // 21: bipush 1
      // 22: newarray 8
      // 24: astore 3
      // 25: istore 1
      // 26: aload 3
      // 27: bipush 0
      // 28: getstatic com/wZ_3.b J
      // 2b: l2i
      // 2c: bastore
      // 2d: bipush 0
      // 2e: istore 4
      // 30: iload 4
      // 32: aload 2
      // 33: arraylength
      // 34: if_icmpge d2
      // 37: aload 2
      // 38: iload 4
      // 3a: aaload
      // 3b: astore 5
      // 3d: aload 5
      // 3f: getstatic com/wZ_3.a Ljava/lang/String;
      // 42: ldc ""
      // 44: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 47: astore 5
      // 49: aload 0
      // 4a: getfield com/wZ_3.e Lcom/pA_3;
      // 4d: invokestatic com/pA_3.A (Lcom/pA_3;)Lcom/E0;
      // 50: aload 5
      // 52: invokevirtual com/E0.D (Ljava/lang/String;)V
      // 55: goto 5a
      // 58: astore 6
      // 5a: iload 4
      // 5c: aload 2
      // 5d: arraylength
      // 5e: bipush 1
      // 5f: isub
      // 60: if_icmpne 63
      // 63: bipush 1
      // 64: istore 6
      // 66: iload 4
      // 68: iload 1
      // 69: ifne 82
      // 6c: aload 2
      // 6d: arraylength
      // 6e: bipush 1
      // 6f: isub
      // 70: if_icmpne 80
      // 73: goto 7a
      // 76: invokestatic com/wZ_3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield com/wZ_3.u Z
      // 7e: istore 6
      // 80: iload 6
      // 82: iload 1
      // 83: ifne a6
      // 86: ifeq cb
      // 89: goto 90
      // 8c: invokestatic com/wZ_3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8f: athrow
      // 90: aload 0
      // 91: iload 1
      // 92: ifne bc
      // 95: goto 9c
      // 98: invokestatic com/wZ_3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9b: athrow
      // 9c: getfield com/wZ_3.d Z
      // 9f: goto a6
      // a2: invokestatic com/wZ_3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a5: athrow
      // a6: ifeq bb
      // a9: aload 0
      // aa: getfield com/wZ_3.e Lcom/pA_3;
      // ad: invokevirtual com/pA_3.K ()V
      // b0: iload 1
      // b1: ifeq cb
      // b4: goto bb
      // b7: invokestatic com/wZ_3.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ba: athrow
      // bb: aload 0
      // bc: getfield com/wZ_3.e Lcom/pA_3;
      // bf: invokestatic com/pA_3.A (Lcom/pA_3;)Lcom/E0;
      // c2: aload 3
      // c3: invokevirtual com/E0.J ([B)V
      // c6: goto cb
      // c9: astore 7
      // cb: iinc 4 1
      // ce: iload 1
      // cf: ifeq 30
      // d2: return
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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





