package com;

import java.util.ArrayList;

class _o_2 implements com.a0 {
   private boolean g;
   private boolean d;
   public static final _o_2 O;
   public static final _o_2 v;
   public static final _o_2 t;
   private static final String a;

   private _o_2(boolean var1, boolean var2) {
      this.g = var1;
      this.d = var2;
   }

   @Override
   public Object Y(ph_4 var1, Object var2, Object var3) {
      try {
         if (!this.g) {
            return var1.G(var3);
         }
      } catch (Hi_2 var5) {
         throw a(var5);
      }

      ArrayList var4 = new ArrayList();
      var1.u(var3, var4);
      return var4;
   }

   @Override
   public void Z(ph_4 param1, com.yn_4 param2, com.KE param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/Hi_2.C ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 3
      // 06: aload 4
      // 08: ifnonnull 23
      // 0b: getfield com/KE.o Z
      // 0e: ifeq ce
      // 11: goto 18
      // 14: invokestatic com/_o_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual com/yn_4.M ()Ljava/lang/Object;
      // 1c: goto 23
      // 1f: invokestatic com/_o_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 22: athrow
      // 23: astore 5
      // 25: aload 0
      // 26: getfield com/_o_2.g Z
      // 29: aload 4
      // 2b: ifnonnull 83
      // 2e: ifeq 7e
      // 31: goto 38
      // 34: invokestatic com/_o_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 37: athrow
      // 38: new java/util/ArrayList
      // 3b: dup
      // 3c: invokespecial java/util/ArrayList.<init> ()V
      // 3f: astore 6
      // 41: aload 4
      // 43: ifnonnull 63
      // 46: aload 0
      // 47: getfield com/_o_2.d Z
      // 4a: ifeq 68
      // 4d: goto 54
      // 50: invokestatic com/_o_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 53: athrow
      // 54: aload 1
      // 55: aload 5
      // 57: aload 6
      // 59: invokevirtual com/ph_4.X (Ljava/lang/Object;Ljava/util/List;)V
      // 5c: goto 63
      // 5f: invokestatic com/_o_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 62: athrow
      // 63: aload 4
      // 65: ifnull 77
      // 68: aload 1
      // 69: aload 5
      // 6b: aload 6
      // 6d: invokevirtual com/ph_4.u (Ljava/lang/Object;Ljava/util/List;)V
      // 70: goto 77
      // 73: invokestatic com/_o_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 76: athrow
      // 77: aload 3
      // 78: aload 6
      // 7a: putfield com/KE.t Ljava/lang/Object;
      // 7d: return
      // 7e: aload 5
      // 80: instanceof com/O0
      // 83: aload 4
      // 85: ifnonnull c0
      // 88: ifeq bb
      // 8b: goto 92
      // 8e: invokestatic com/_o_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // 91: athrow
      // 92: aload 5
      // 94: checkcast com/O0
      // 97: invokevirtual com/O0.values ()Ljava/util/Collection;
      // 9a: astore 6
      // 9c: new com/Oc_2
      // 9f: dup
      // a0: aload 6
      // a2: invokeinterface java/util/Collection.size ()I 1
      // a7: invokespecial com/Oc_2.<init> (I)V
      // aa: astore 7
      // ac: aload 7
      // ae: aload 6
      // b0: invokevirtual com/Oc_2.addAll (Ljava/util/Collection;)Z
      // b3: pop
      // b4: aload 3
      // b5: aload 7
      // b7: putfield com/KE.t Ljava/lang/Object;
      // ba: return
      // bb: aload 5
      // bd: instanceof com/Oc_2
      // c0: ifeq ce
      // c3: aload 3
      // c4: aload 5
      // c6: putfield com/KE.t Ljava/lang/Object;
      // c9: return
      // ca: invokestatic com/_o_2.a (Lcom/Hi_2;)Lcom/Hi_2;
      // cd: athrow
      // ce: new com/Hi_2
      // d1: dup
      // d2: getstatic com/_o_2.a Ljava/lang/String;
      // d5: invokespecial com/Hi_2.<init> (Ljava/lang/String;)V
      // d8: athrow
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "G\\'\t".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 56;
      char[] var10002 = var10003;
      int var1 = var10004;
      char[] var10;
      byte var14;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var10 = var10003;
         var10005 = var0;
         char var10008 = var10003[var0];
         var10007 = 56;
         var10006 = var10008;
         switch (var0 % 7) {
            case 0:
               var14 = 43;
               break;
            case 1:
               var14 = 43;
               break;
            case 2:
               var14 = 91;
               break;
            case 3:
               var14 = 126;
               break;
            case 4:
               var14 = 119;
               break;
            case 5:
               var14 = 106;
               break;
            default:
               var14 = 87;
         }
      } else {
         var6 = 56;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            O = new _o_2(false, false);
            v = new _o_2(true, false);
            t = new _o_2(true, true);
            return;
         }

         var10 = var10003;
         var10005 = var0;
         char var15 = var10003[var0];
         var10007 = 56;
         var10006 = var15;
         switch (var0 % 7) {
            case 0:
               var14 = 43;
               break;
            case 1:
               var14 = 43;
               break;
            case 2:
               var14 = 91;
               break;
            case 3:
               var14 = 126;
               break;
            case 4:
               var14 = 119;
               break;
            case 5:
               var14 = 106;
               break;
            default:
               var14 = 87;
         }
      }

      while (true) {
         var10[var10005] = (char)(var10006 ^ var10007 ^ var14);
         var0++;
         if (var6 == 0) {
            var10 = var10002;
            var10005 = var6;
            char var17 = var10002[var6];
            var10007 = var6;
            var10006 = var17;
            switch (var0 % 7) {
               case 0:
                  var14 = 43;
                  break;
               case 1:
                  var14 = 43;
                  break;
               case 2:
                  var14 = 91;
                  break;
               case 3:
                  var14 = 126;
                  break;
               case 4:
                  var14 = 119;
                  break;
               case 5:
                  var14 = 106;
                  break;
               default:
                  var14 = 87;
            }
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               O = new _o_2(false, false);
               v = new _o_2(true, false);
               t = new _o_2(true, true);
               return;
            }

            var10 = var10002;
            var10005 = var0;
            char var16 = var10002[var0];
            var10007 = var6;
            var10006 = var16;
            switch (var0 % 7) {
               case 0:
                  var14 = 43;
                  break;
               case 1:
                  var14 = 43;
                  break;
               case 2:
                  var14 = 91;
                  break;
               case 3:
                  var14 = 126;
                  break;
               case 4:
                  var14 = 119;
                  break;
               case 5:
                  var14 = 106;
                  break;
               default:
                  var14 = 87;
            }
         }
      }
   }

   private static Hi_2 a(Hi_2 var0) {
      return var0;
   }
}





