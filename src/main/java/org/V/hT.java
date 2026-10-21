package org.v;

import java.util.HashMap;

class hT implements _e_2 {
   static final boolean m;
   final H_3 T;
   private static final String a;

   hT(H_3 var1) {
      this.T = var1;
   }

   public h4 v(RA var1) throws org.b_2 {
      return this.E(var1.A, new hy_2[0]);
   }

   public h4 O(RH var1) throws org.b_2 {
      return this.E(var1.A, new hy_2[]{new hy_2(a, var1.V)});
   }

   public h4 Y(Rg_2 var1) throws org.b_2 {
      return this.E(var1.A, var1.Z);
   }

   private h4 E(Nt_2 var1, hy_2[] var2) throws org.b_2 {
      String[] var10000 = RG.C();
      HashMap var4 = new HashMap();
      String[] var3 = var10000;

      for (hy_2 var8 : var2) {
         var4.put(var8.l, this.z(var8.R));
         if (var3 == null) {
            break;
         }
      }

      return new C_2(this, var4, var1);
   }

   private Object z(t_4 param1) throws org.b_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/v/RG.C ()[Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: new org/v/_d_2
      // 08: dup
      // 09: aload 0
      // 0a: invokespecial org/v/_d_2.<init> (Lorg/v/hT;)V
      // 0d: invokeinterface org/v/t_4.g (Lorg/v/f_3;)Ljava/lang/Object; 2
      // 12: astore 3
      // 13: getstatic org/v/hT.m Z
      // 16: ifne 3b
      // 19: aload 3
      // 1a: aload 2
      // 1b: ifnull 3c
      // 1e: goto 25
      // 21: invokestatic org/v/hT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: ifnonnull 3b
      // 28: goto 2f
      // 2b: invokestatic org/v/hT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: new java/lang/AssertionError
      // 32: dup
      // 33: invokespecial java/lang/AssertionError.<init> ()V
      // 36: athrow
      // 37: invokestatic org/v/hT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 3
      // 3c: areturn
      // 3d: astore 3
      // 3e: aload 3
      // 3f: aload 2
      // 40: ifnull 58
      // 43: instanceof org/b_2
      // 46: ifeq 5c
      // 49: goto 50
      // 4c: invokestatic org/v/hT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 3
      // 51: goto 58
      // 54: invokestatic org/v/hT.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: checkcast org/b_2
      // 5b: athrow
      // 5c: new java/lang/IllegalStateException
      // 5f: dup
      // 60: aload 3
      // 61: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/Throwable;)V
      // 64: athrow
   }

   @Override
   public Object b(RH var1) throws Throwable {
      return this.O(var1);
   }

   @Override
   public Object a(Rg_2 var1) throws Throwable {
      return this.Y(var1);
   }

   @Override
   public Object z(RA var1) throws Throwable {
      return this.v(var1);
   }

   static Object F(hT var0, t_4 var1) throws org.b_2 {
      return var0.z(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u00118\u0019\f\"".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var9 = 21;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var13;
      byte var17;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var13 = var10003;
         var10005 = var0;
         char var10008 = var10003[var0];
         var10007 = 21;
         var10006 = var10008;
         switch (var0 % 7) {
            case 0:
               var17 = 114;
               break;
            case 1:
               var17 = 76;
               break;
            case 2:
               var17 = 96;
               break;
            case 3:
               var17 = 108;
               break;
            case 4:
               var17 = 82;
               break;
            case 5:
               var17 = 114;
               break;
            default:
               var17 = 82;
         }
      } else {
         var9 = 21;
         var4 = var10004;
         if (var10004 <= var0) {
            String var12 = new String(var10003).intern();
            byte var7 = -1;
            a = var12;

            boolean var3;
            label69: {
               try {
                  if (!H_3.class.desiredAssertionStatus()) {
                     var3 = true;
                     break label69;
                  }
               } catch (IllegalStateException var2) {
                  throw a(var2);
               }

               var3 = false;
            }

            m = var3;
            return;
         }

         var13 = var10003;
         var10005 = var0;
         char var18 = var10003[var0];
         var10007 = 21;
         var10006 = var18;
         switch (var0 % 7) {
            case 0:
               var17 = 114;
               break;
            case 1:
               var17 = 76;
               break;
            case 2:
               var17 = 96;
               break;
            case 3:
               var17 = 108;
               break;
            case 4:
               var17 = 82;
               break;
            case 5:
               var17 = 114;
               break;
            default:
               var17 = 82;
         }
      }

      while (true) {
         var13[var10005] = (char)(var10006 ^ var10007 ^ var17);
         var0++;
         if (var9 == 0) {
            var13 = var10002;
            var10005 = var9;
            char var20 = var10002[var9];
            var10007 = var9;
            var10006 = var20;
            switch (var0 % 7) {
               case 0:
                  var17 = 114;
                  break;
               case 1:
                  var17 = 76;
                  break;
               case 2:
                  var17 = 96;
                  break;
               case 3:
                  var17 = 108;
                  break;
               case 4:
                  var17 = 82;
                  break;
               case 5:
                  var17 = 114;
                  break;
               default:
                  var17 = 82;
            }
         } else {
            if (var4 <= var0) {
               String var11 = new String(var10002).intern();
               byte var6 = -1;
               a = var11;

               boolean var10000;
               label33: {
                  try {
                     if (!H_3.class.desiredAssertionStatus()) {
                        var10000 = true;
                        break label33;
                     }
                  } catch (IllegalStateException var1) {
                     throw a(var1);
                  }

                  var10000 = false;
               }

               m = var10000;
               return;
            }

            var13 = var10002;
            var10005 = var0;
            char var19 = var10002[var0];
            var10007 = var9;
            var10006 = var19;
            switch (var0 % 7) {
               case 0:
                  var17 = 114;
                  break;
               case 1:
                  var17 = 76;
                  break;
               case 2:
                  var17 = 96;
                  break;
               case 3:
                  var17 = 108;
                  break;
               case 4:
                  var17 = 82;
                  break;
               case 5:
                  var17 = 114;
                  break;
               default:
                  var17 = 82;
            }
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





