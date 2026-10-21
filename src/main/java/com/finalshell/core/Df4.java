package com.finalshell.core;

import com.finalshell.ui.model.Ks2_2;
import java.io.Closeable;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class Df4 implements Closeable {
   public final Yn4 e;
   public RC C;
   public transient RC i;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public Df4(Reader var1) {
      this(var1, new Ks2_2[0]);
   }

   public Df4(Reader var1, Ks2_2[] var2) {
      this(new U7(var1));
      Ks2_2[] var4 = var2;
      String var10000 = Hi2.C();
      int var5 = var2.length;
      String var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         Ks2_2 var7 = var4[var6];
         this.W(var7, true);
         var6++;
         if (var3 != null) {
            break;
         }
      }
   }

   public Df4(P7 var1) {
      this(new Yn4(var1));
   }

   public Df4(Yn4 var1) {
      this.e = var1;
   }

   public void G(TimeZone var1) {
      this.e.N.J(var1);
   }

   public void V(Locale var1) {
      this.e.N.D(var1);
   }

   public void W(Ks2_2 var1, boolean var2) {
      this.e.i(var1, var2);
   }

   public Locale h$Locale() {
      return this.e.N.w$Locale();
   }

   public TimeZone q() {
      return this.e.N.t();
   }

   public void a() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 08: aload 1
      // 09: ifnonnull 50
      // 0c: ifnonnull 36
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: new com/finalshell/core/RC
      // 1a: dup
      // 1b: aconst_null
      // 1c: sipush 16074
      // 1f: ldc2_w 6738680088542658812
      // 22: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 25: invokespecial com/finalshell/core/RC.<init> (Lcom/finalshell/core/RC;I)V
      // 28: putfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 2b: aload 1
      // 2c: ifnull da
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 35: athrow
      // 36: aload 0
      // 37: invokespecial com/finalshell/core/Df4.L ()V
      // 3a: aload 0
      // 3b: aload 1
      // 3c: ifnonnull c3
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 45: athrow
      // 46: getfield com/finalshell/core/Df4.i Lcom/finalshell/core/RC;
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4f: athrow
      // 50: ifnull bb
      // 53: aload 0
      // 54: aload 1
      // 55: ifnonnull c3
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5e: athrow
      // 5f: getfield com/finalshell/core/Df4.i Lcom/finalshell/core/RC;
      // 62: getfield com/finalshell/core/RC.K Lcom/finalshell/core/RC;
      // 65: aload 0
      // 66: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 69: if_acmpne bb
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 72: athrow
      // 73: aload 0
      // 74: aload 0
      // 75: getfield com/finalshell/core/Df4.i Lcom/finalshell/core/RC;
      // 78: putfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 7b: aload 0
      // 7c: aload 1
      // 7d: ifnonnull db
      // 80: goto 87
      // 83: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 86: athrow
      // 87: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 8a: getfield com/finalshell/core/RC.S I
      // 8d: sipush 16074
      // 90: ldc2_w 6738680088542658812
      // 93: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 96: if_icmpeq da
      // 99: goto a0
      // 9c: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 9f: athrow
      // a0: aload 0
      // a1: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // a4: sipush 16074
      // a7: ldc2_w 6738680088542658812
      // aa: invokestatic com/finalshell/core/Df4.a (IJ)I
      // ad: putfield com/finalshell/core/RC.S I
      // b0: aload 1
      // b1: ifnull da
      // b4: goto bb
      // b7: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // ba: athrow
      // bb: aload 0
      // bc: goto c3
      // bf: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // c2: athrow
      // c3: new com/finalshell/core/RC
      // c6: dup
      // c7: aload 0
      // c8: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // cb: sipush 16074
      // ce: ldc2_w 6738680088542658812
      // d1: invokestatic com/finalshell/core/Df4.a (IJ)I
      // d4: invokespecial com/finalshell/core/RC.<init> (Lcom/finalshell/core/RC;I)V
      // d7: putfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // da: aload 0
      // db: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // de: sipush 13216
      // e1: ldc2_w 8914143018644557207
      // e4: invokestatic com/finalshell/core/Df4.a (IJ)I
      // e7: sipush 16414
      // ea: ldc2_w 7073758786284535355
      // ed: invokestatic com/finalshell/core/Df4.a (IJ)I
      // f0: invokevirtual com/finalshell/core/Yn4.Q (II)V
      // f3: return
   }

   public void G() {
      this.e.M(a(8489, 4561076111265554185L));
      this.U();
   }

   public void K() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 42
      // 09: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 0c: ifnonnull 36
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: new com/finalshell/core/RC
      // 1a: dup
      // 1b: aconst_null
      // 1c: sipush 26701
      // 1f: ldc2_w 2181033325635835488
      // 22: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 25: invokespecial com/finalshell/core/RC.<init> (Lcom/finalshell/core/RC;I)V
      // 28: putfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 2b: aload 1
      // 2c: ifnull 59
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 35: athrow
      // 36: aload 0
      // 37: invokespecial com/finalshell/core/Df4.L ()V
      // 3a: aload 0
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 41: athrow
      // 42: new com/finalshell/core/RC
      // 45: dup
      // 46: aload 0
      // 47: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 4a: sipush 14264
      // 4d: ldc2_w 2322034178794473867
      // 50: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 53: invokespecial com/finalshell/core/RC.<init> (Lcom/finalshell/core/RC;I)V
      // 56: putfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 59: aload 0
      // 5a: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 5d: sipush 405
      // 60: ldc2_w 6941549716645674934
      // 63: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 66: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 69: return
   }

   public void z() {
      this.e.M(a(15313, 7959610702651246064L));
      this.U();
   }

   public void L() {
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
      // 04: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 07: getfield com/finalshell/core/RC.S I
      // 0a: istore 2
      // 0b: astore 1
      // 0c: aload 1
      // 0d: ifnonnull 4f
      // 10: iload 2
      // 11: tableswitch 104 1001 1005 93 39 66 93 66
      // 34: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 37: athrow
      // 38: aload 0
      // 39: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 3c: sipush 24927
      // 3f: ldc2_w 8718001235039428458
      // 42: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 45: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4e: athrow
      // 4f: aload 1
      // 50: ifnull a5
      // 53: aload 0
      // 54: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 57: sipush 4302
      // 5a: ldc2_w 6362598819577491172
      // 5d: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 60: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 63: aload 1
      // 64: ifnull a5
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6d: athrow
      // 6e: aload 1
      // 6f: ifnull a5
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 78: athrow
      // 79: new com/finalshell/core/Hi2
      // 7c: dup
      // 7d: new java/lang/StringBuilder
      // 80: dup
      // 81: invokespecial java/lang/StringBuilder.<init> ()V
      // 84: sipush -14360
      // 87: sipush -20216
      // 8a: invokestatic com/finalshell/core/Df4.a (II)Ljava/lang/String;
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: aload 0
      // 91: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 94: getfield com/finalshell/core/RC.S I
      // 97: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9d: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // a0: athrow
      // a1: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // a4: athrow
      // a5: return
   }

   public void U() {
      int var7;
      int var8;
      String var10000 = Hi2.C();
      this.i = this.C;
      this.C = this.C.K;
      String var1 = var10000;

      label60: {
         try {
            var7 = (int)(this.C);
            if (var1 != null) {
               break label60;
            }

            if (this.C == null) {
               return;
            }
         } catch (Hi2 var6) {
            throw a(var6);
         }

         var7 = (int)(this.C);
      }

      int var2 = var7.S;
      int var3 = -1;

      label49: {
         label48: {
            label47: {
               label46: {
                  try {
                     var8 = var2;
                     if (var1 != null) {
                        break label49;
                     }

                     switch (var2) {
                        case 1001:
                        case 1003:
                           break label47;
                        case 1002:
                           break;
                        case 1004:
                           break label46;
                        default:
                           break label48;
                     }
                  } catch (Hi2 var5) {
                     throw a(var5);
                  }

                  var3 = a(24505, 8195589133128278427L);
                  if (var1 == null) {
                     break label48;
                  }
               }

               var3 = a(32625, 7468402146301641048L);
               if (var1 == null) {
                  break label48;
               }
            }

            var3 = a(29877, 7012138120669301406L);
         }

         var8 = var3;
      }

      try {
         if (var8 != -1) {
            this.C.S = var3;
         }
      } catch (Hi2 var4) {
         throw a(var4);
      }
   }

   public boolean b() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 2c
      // 09: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 0c: ifnonnull 2b
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: new com/finalshell/core/Hi2
      // 19: dup
      // 1a: sipush -14357
      // 1d: sipush -9275
      // 20: invokestatic com/finalshell/core/Df4.a (II)Ljava/lang/String;
      // 23: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // 26: athrow
      // 27: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 2f: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 32: invokeinterface com/finalshell/core/P7.P ()I 1
      // 37: istore 2
      // 38: aload 0
      // 39: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 3c: getfield com/finalshell/core/RC.S I
      // 3f: istore 3
      // 40: iload 3
      // 41: aload 1
      // 42: ifnonnull 6d
      // 45: tableswitch 113 1001 1005 76 113 76 39 39
      // 68: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 6b: athrow
      // 6c: iload 2
      // 6d: aload 1
      // 6e: ifnonnull 8c
      // 71: sipush 29121
      // 74: ldc2_w 9036493613734465511
      // 77: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 7a: if_icmpeq 8f
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 83: athrow
      // 84: bipush 1
      // 85: goto 8c
      // 88: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 8b: athrow
      // 8c: goto 90
      // 8f: bipush 0
      // 90: ireturn
      // 91: iload 2
      // 92: aload 1
      // 93: ifnonnull b1
      // 96: sipush 22818
      // 99: ldc2_w 2619316412001691404
      // 9c: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 9f: if_icmpeq b4
      // a2: goto a9
      // a5: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // a8: athrow
      // a9: bipush 1
      // aa: goto b1
      // ad: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // b0: athrow
      // b1: goto b5
      // b4: bipush 0
      // b5: ireturn
      // b6: new com/finalshell/core/Hi2
      // b9: dup
      // ba: new java/lang/StringBuilder
      // bd: dup
      // be: invokespecial java/lang/StringBuilder.<init> ()V
      // c1: sipush -14359
      // c4: sipush 27408
      // c7: invokestatic com/finalshell/core/Df4.a (II)Ljava/lang/String;
      // ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cd: iload 3
      // ce: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d4: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // d7: athrow
   }

   public int X() {
      return this.e.N.P();
   }

   @Override
   public void close() {
      this.e.close();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public Integer S() {
      boolean var7;
      Object var8;
      String var1 = Hi2.C();

      Object var10000;
      label46: {
         label41: {
            try {
               var10000 = this.C;
               if (var1 != null) {
                  break label46;
               }

               if (this.C != null) {
                  break label41;
               }
            } catch (Hi2 var5) {
               throw a(var5);
            }

            Object var2 = this.e.M();

            try {
               if (var1 == null) {
                  return B8_2.Y(var2);
               }
            } catch (Hi2 var4) {
               boolean var10001 = false;
               throw a(var4);
            }
         }

         try {
            this.R();
            var10000 = this.e.M();
         } catch (Hi2 var3) {
            var7 = false;
            throw a(var3);
         }
      }

      var8 = var10000;
      this.h$void();
      return B8_2.Y(var8);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public Long o() {
      boolean var7;
      Object var8;
      String var1 = Hi2.C();

      Object var10000;
      label46: {
         label41: {
            try {
               var10000 = this.C;
               if (var1 != null) {
                  break label46;
               }

               if (this.C != null) {
                  break label41;
               }
            } catch (Hi2 var5) {
               throw a(var5);
            }

            Object var2 = this.e.M();

            try {
               if (var1 == null) {
                  return B8_2.s(var2);
               }
            } catch (Hi2 var4) {
               boolean var10001 = false;
               throw a(var4);
            }
         }

         try {
            this.R();
            var10000 = this.e.M();
         } catch (Hi2 var3) {
            var7 = false;
            throw a(var3);
         }
      }

      var8 = var10000;
      this.h$void();
      return B8_2.s(var8);
   }

   public String c() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnonnull 2e
      // 09: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 0c: ifnonnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 1a: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 1d: astore 2
      // 1e: aload 1
      // 1f: ifnull 9b
      // 22: aload 0
      // 23: invokespecial com/finalshell/core/Df4.R ()V
      // 26: aload 0
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 2d: athrow
      // 2e: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 31: getfield com/finalshell/core/Yn4.N Lcom/finalshell/core/P7;
      // 34: astore 3
      // 35: aload 0
      // 36: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 39: aload 1
      // 3a: ifnonnull 96
      // 3d: getfield com/finalshell/core/RC.S I
      // 40: sipush 18777
      // 43: ldc2_w 2672073003113756542
      // 46: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 49: if_icmpne 88
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 52: athrow
      // 53: aload 3
      // 54: aload 1
      // 55: ifnonnull 96
      // 58: goto 5f
      // 5b: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 5e: athrow
      // 5f: invokeinterface com/finalshell/core/P7.P ()I 1
      // 64: sipush 22390
      // 67: ldc2_w 5037246021153892690
      // 6a: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 6d: if_icmpne 88
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 76: athrow
      // 77: aload 3
      // 78: invokeinterface com/finalshell/core/P7.z ()Ljava/lang/String; 1
      // 7d: astore 2
      // 7e: aload 3
      // 7f: invokeinterface com/finalshell/core/P7.K ()V 1
      // 84: aload 1
      // 85: ifnull 97
      // 88: aload 0
      // 89: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 8c: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 8f: goto 96
      // 92: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 95: athrow
      // 96: astore 2
      // 97: aload 0
      // 98: invokespecial com/finalshell/core/Df4.h$void ()V
      // 9b: aload 2
      // 9c: invokestatic com/finalshell/core/B8_2.i (Ljava/lang/Object;)Ljava/lang/String;
      // 9f: areturn
   }

   public Object q(HI var1) {
      return this.Y(var1.O());
   }

   public Object Y(Type param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 08: aload 2
      // 09: ifnonnull 2f
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 1a: aload 1
      // 1b: invokevirtual com/finalshell/core/Yn4.o (Ljava/lang/reflect/Type;)Ljava/lang/Object;
      // 1e: areturn
      // 1f: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 22: athrow
      // 23: aload 0
      // 24: invokespecial com/finalshell/core/Df4.R ()V
      // 27: aload 0
      // 28: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 2b: aload 1
      // 2c: invokevirtual com/finalshell/core/Yn4.o (Ljava/lang/reflect/Type;)Ljava/lang/Object;
      // 2f: astore 3
      // 30: aload 0
      // 31: invokespecial com/finalshell/core/Df4.h$void ()V
      // 34: aload 3
      // 35: areturn
   }

   public Object l(java.lang.Class param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 08: aload 2
      // 09: ifnonnull 2f
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 1a: aload 1
      // 1b: invokevirtual com/finalshell/core/Yn4.M (Ljava/lang/Class;)Ljava/lang/Object;
      // 1e: areturn
      // 1f: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 22: athrow
      // 23: aload 0
      // 24: invokespecial com/finalshell/core/Df4.R ()V
      // 27: aload 0
      // 28: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 2b: aload 1
      // 2c: invokevirtual com/finalshell/core/Yn4.M (Ljava/lang/Class;)Ljava/lang/Object;
      // 2f: astore 3
      // 30: aload 0
      // 31: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 34: aload 3
      // 35: invokevirtual com/finalshell/core/Yn4.Y (Ljava/lang/Object;)V
      // 38: aload 0
      // 39: invokespecial com/finalshell/core/Df4.h$void ()V
      // 3c: aload 3
      // 3d: areturn
   }

   public void m(Object param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 30
      // 09: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 1a: aload 1
      // 1b: invokevirtual com/finalshell/core/Yn4.v (Ljava/lang/Object;)V
      // 1e: return
      // 1f: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 22: athrow
      // 23: aload 0
      // 24: invokespecial com/finalshell/core/Df4.R ()V
      // 27: aload 0
      // 28: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 2b: aload 1
      // 2c: invokevirtual com/finalshell/core/Yn4.v (Ljava/lang/Object;)V
      // 2f: aload 0
      // 30: invokespecial com/finalshell/core/Df4.h$void ()V
      // 33: return
   }

   public Object P() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 08: aload 1
      // 09: ifnonnull 2a
      // 0c: ifnonnull 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 1a: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 1d: areturn
      // 1e: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 21: athrow
      // 22: aload 0
      // 23: invokespecial com/finalshell/core/Df4.R ()V
      // 26: aload 0
      // 27: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 2a: aload 1
      // 2b: ifnonnull 6a
      // 2e: getfield com/finalshell/core/RC.S I
      // 31: lookupswitch 43 2 1001 31 1003 31
      // 4c: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 54: invokevirtual com/finalshell/core/Yn4.x ()Ljava/lang/Object;
      // 57: astore 2
      // 58: aload 1
      // 59: ifnull 6b
      // 5c: aload 0
      // 5d: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 60: invokevirtual com/finalshell/core/Yn4.M ()Ljava/lang/Object;
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 69: athrow
      // 6a: astore 2
      // 6b: aload 0
      // 6c: invokespecial com/finalshell/core/Df4.h$void ()V
      // 6f: aload 2
      // 70: areturn
   }

   public Object z(Map param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Hi2.C ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 08: aload 2
      // 09: ifnonnull 2f
      // 0c: ifnonnull 23
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 1a: aload 1
      // 1b: invokevirtual com/finalshell/core/Yn4.u (Ljava/util/Map;)Ljava/lang/Object;
      // 1e: areturn
      // 1f: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 22: athrow
      // 23: aload 0
      // 24: invokespecial com/finalshell/core/Df4.R ()V
      // 27: aload 0
      // 28: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 2b: aload 1
      // 2c: invokevirtual com/finalshell/core/Yn4.u (Ljava/util/Map;)Ljava/lang/Object;
      // 2f: astore 3
      // 30: aload 0
      // 31: invokespecial com/finalshell/core/Df4.h$void ()V
      // 34: aload 3
      // 35: areturn
   }

   public void R() {
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
      // 04: getfield com/finalshell/core/Df4.C Lcom/finalshell/core/RC;
      // 07: getfield com/finalshell/core/RC.S I
      // 0a: istore 2
      // 0b: astore 1
      // 0c: aload 1
      // 0d: ifnonnull 4f
      // 10: iload 2
      // 11: tableswitch 151 1001 1005 129 39 66 140 102
      // 34: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 37: athrow
      // 38: aload 0
      // 39: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 3c: sipush 3526
      // 3f: ldc2_w 782728140932838386
      // 42: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 45: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4e: athrow
      // 4f: aload 1
      // 50: ifnull ce
      // 53: aload 0
      // 54: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 57: sipush 22483
      // 5a: ldc2_w 870090798774004193
      // 5d: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 60: sipush 16414
      // 63: ldc2_w 7073758786284535355
      // 66: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 69: invokevirtual com/finalshell/core/Yn4.Q (II)V
      // 6c: aload 1
      // 6d: ifnull ce
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 76: athrow
      // 77: aload 0
      // 78: getfield com/finalshell/core/Df4.e Lcom/finalshell/core/Yn4;
      // 7b: sipush 22483
      // 7e: ldc2_w 870090798774004193
      // 81: invokestatic com/finalshell/core/Df4.a (IJ)I
      // 84: invokevirtual com/finalshell/core/Yn4.M (I)V
      // 87: aload 1
      // 88: ifnull ce
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 91: athrow
      // 92: aload 1
      // 93: ifnull ce
      // 96: goto 9d
      // 99: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 9c: athrow
      // 9d: aload 1
      // 9e: ifnull ce
      // a1: goto a8
      // a4: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // a7: athrow
      // a8: new com/finalshell/core/Hi2
      // ab: dup
      // ac: new java/lang/StringBuilder
      // af: dup
      // b0: invokespecial java/lang/StringBuilder.<init> ()V
      // b3: sipush -14359
      // b6: sipush 27408
      // b9: invokestatic com/finalshell/core/Df4.a (II)Ljava/lang/String;
      // bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bf: iload 2
      // c0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c6: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // c9: athrow
      // ca: invokestatic com/finalshell/core/Df4.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // cd: athrow
      // ce: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void h$void() {
      int var10;
      String var10000 = Hi2.C();
      int var2 = this.C.S;
      String var1 = var10000;
      int var3 = -1;

      label76: {
         label82: {
            label74: {
               label83: {
                  label72: {
                     label71: {
                        label70: {
                           try {
                              var10 = var2;
                              if (var1 != null) {
                                 break label70;
                              }

                              switch (var2) {
                                 case 1001:
                                    break;
                                 case 1002:
                                    break label71;
                                 case 1003:
                                    break label72;
                                 case 1004:
                                    break label74;
                                 case 1005:
                                    break label83;
                                 default:
                                    break label82;
                              }
                           } catch (Hi2 var9) {
                              throw a(var9);
                           }

                           var10 = a(24620, 2029354948302183936L);
                        }

                        var3 = var10;
                        if (var1 == null) {
                           break label76;
                        }
                     }

                     var3 = a(13871, 5789654220549769216L);
                     if (var1 == null) {
                        break label76;
                     }
                  }

                  var3 = a(24620, 2029354948302183936L);

                  try {
                     if (var1 == null) {
                        break label76;
                     }
                  } catch (Hi2 var8) {
                     boolean var10001 = false;
                     throw a(var8);
                  }
               }

               try {
                  if (var1 == null) {
                     break label76;
                  }
               } catch (Hi2 var7) {
                  boolean var13 = false;
                  throw a(var7);
               }
            }

            var3 = a(21535, 26335485618235959L);

            try {
               if (var1 == null) {
                  break label76;
               }
            } catch (Hi2 var6) {
               boolean var14 = false;
               throw a(var6);
            }
         }

         try {
            throw new Hi2(a(-14359, 27408) + var2);
         } catch (Hi2 var5) {
            boolean var15 = false;
            throw a(var5);
         }
      }

      try {
         if (var3 != -1) {
            this.C.S = var3;
         }
      } catch (Hi2 var4) {
         throw a(var4);
      }
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ -14359) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 91;
               break;
            case 1:
               var10000 = 170;
               break;
            case 2:
               var10000 = 23;
               break;
            case 3:
               var10000 = 132;
               break;
            case 4:
               var10000 = 217;
               break;
            case 5:
               var10000 = 161;
               break;
            case 6:
               var10000 = 62;
               break;
            case 7:
               var10000 = 29;
               break;
            case 8:
               var10000 = 230;
               break;
            case 9:
               var10000 = 93;
               break;
            case 10:
               var10000 = 51;
               break;
            case 11:
               var10000 = 20;
               break;
            case 12:
               var10000 = 64;
               break;
            case 13:
               var10000 = 199;
               break;
            case 14:
               var10000 = 96;
               break;
            case 15:
               var10000 = 55;
               break;
            case 16:
               var10000 = 251;
               break;
            case 17:
               var10000 = 133;
               break;
            case 18:
               var10000 = 101;
               break;
            case 19:
               var10000 = 24;
               break;
            case 20:
               var10000 = 113;
               break;
            case 21:
               var10000 = 246;
               break;
            case 22:
               var10000 = 153;
               break;
            case 23:
               var10000 = 97;
               break;
            case 24:
               var10000 = 107;
               break;
            case 25:
               var10000 = 137;
               break;
            case 26:
               var10000 = 109;
               break;
            case 27:
               var10000 = 193;
               break;
            case 28:
               var10000 = 21;
               break;
            case 29:
               var10000 = 155;
               break;
            case 30:
               var10000 = 34;
               break;
            case 31:
               var10000 = 115;
               break;
            case 32:
               var10000 = 57;
               break;
            case 33:
               var10000 = 242;
               break;
            case 34:
               var10000 = 86;
               break;
            case 35:
               var10000 = 4;
               break;
            case 36:
               var10000 = 239;
               break;
            case 37:
               var10000 = 41;
               break;
            case 38:
               var10000 = 125;
               break;
            case 39:
               var10000 = 150;
               break;
            case 40:
               var10000 = 76;
               break;
            case 41:
               var10000 = 187;
               break;
            case 42:
               var10000 = 13;
               break;
            case 43:
               var10000 = 253;
               break;
            case 44:
               var10000 = 191;
               break;
            case 45:
               var10000 = 228;
               break;
            case 46:
               var10000 = 89;
               break;
            case 47:
               var10000 = 54;
               break;
            case 48:
               var10000 = 158;
               break;
            case 49:
               var10000 = 28;
               break;
            case 50:
               var10000 = 31;
               break;
            case 51:
               var10000 = 169;
               break;
            case 52:
               var10000 = 151;
               break;
            case 53:
               var10000 = 136;
               break;
            case 54:
               var10000 = 252;
               break;
            case 55:
               var10000 = 196;
               break;
            case 56:
               var10000 = 112;
               break;
            case 57:
               var10000 = 114;
               break;
            case 58:
               var10000 = 104;
               break;
            case 59:
               var10000 = 141;
               break;
            case 60:
               var10000 = 87;
               break;
            case 61:
               var10000 = 138;
               break;
            case 62:
               var10000 = 159;
               break;
            case 63:
               var10000 = 200;
               break;
            case 64:
               var10000 = 162;
               break;
            case 65:
               var10000 = 122;
               break;
            case 66:
               var10000 = 0;
               break;
            case 67:
               var10000 = 165;
               break;
            case 68:
               var10000 = 68;
               break;
            case 69:
               var10000 = 163;
               break;
            case 70:
               var10000 = 7;
               break;
            case 71:
               var10000 = 12;
               break;
            case 72:
               var10000 = 190;
               break;
            case 73:
               var10000 = 188;
               break;
            case 74:
               var10000 = 212;
               break;
            case 75:
               var10000 = 194;
               break;
            case 76:
               var10000 = 66;
               break;
            case 77:
               var10000 = 208;
               break;
            case 78:
               var10000 = 95;
               break;
            case 79:
               var10000 = 216;
               break;
            case 80:
               var10000 = 10;
               break;
            case 81:
               var10000 = 17;
               break;
            case 82:
               var10000 = 144;
               break;
            case 83:
               var10000 = 22;
               break;
            case 84:
               var10000 = 219;
               break;
            case 85:
               var10000 = 42;
               break;
            case 86:
               var10000 = 247;
               break;
            case 87:
               var10000 = 14;
               break;
            case 88:
               var10000 = 67;
               break;
            case 89:
               var10000 = 249;
               break;
            case 90:
               var10000 = 19;
               break;
            case 91:
               var10000 = 88;
               break;
            case 92:
               var10000 = 77;
               break;
            case 93:
               var10000 = 11;
               break;
            case 94:
               var10000 = 179;
               break;
            case 95:
               var10000 = 90;
               break;
            case 96:
               var10000 = 223;
               break;
            case 97:
               var10000 = 110;
               break;
            case 98:
               var10000 = 81;
               break;
            case 99:
               var10000 = 5;
               break;
            case 100:
               var10000 = 227;
               break;
            case 101:
               var10000 = 45;
               break;
            case 102:
               var10000 = 80;
               break;
            case 103:
               var10000 = 183;
               break;
            case 104:
               var10000 = 52;
               break;
            case 105:
               var10000 = 73;
               break;
            case 106:
               var10000 = 221;
               break;
            case 107:
               var10000 = 206;
               break;
            case 108:
               var10000 = 53;
               break;
            case 109:
               var10000 = 146;
               break;
            case 110:
               var10000 = 118;
               break;
            case 111:
               var10000 = 203;
               break;
            case 112:
               var10000 = 229;
               break;
            case 113:
               var10000 = 36;
               break;
            case 114:
               var10000 = 32;
               break;
            case 115:
               var10000 = 214;
               break;
            case 116:
               var10000 = 9;
               break;
            case 117:
               var10000 = 171;
               break;
            case 118:
               var10000 = 174;
               break;
            case 119:
               var10000 = 177;
               break;
            case 120:
               var10000 = 222;
               break;
            case 121:
               var10000 = 254;
               break;
            case 122:
               var10000 = 8;
               break;
            case 123:
               var10000 = 123;
               break;
            case 124:
               var10000 = 166;
               break;
            case 125:
               var10000 = 157;
               break;
            case 126:
               var10000 = 120;
               break;
            case 127:
               var10000 = 178;
               break;
            case 128:
               var10000 = 124;
               break;
            case 129:
               var10000 = 65;
               break;
            case 130:
               var10000 = 243;
               break;
            case 131:
               var10000 = 30;
               break;
            case 132:
               var10000 = 72;
               break;
            case 133:
               var10000 = 47;
               break;
            case 134:
               var10000 = 198;
               break;
            case 135:
               var10000 = 134;
               break;
            case 136:
               var10000 = 61;
               break;
            case 137:
               var10000 = 152;
               break;
            case 138:
               var10000 = 226;
               break;
            case 139:
               var10000 = 35;
               break;
            case 140:
               var10000 = 241;
               break;
            case 141:
               var10000 = 185;
               break;
            case 142:
               var10000 = 74;
               break;
            case 143:
               var10000 = 63;
               break;
            case 144:
               var10000 = 75;
               break;
            case 145:
               var10000 = 156;
               break;
            case 146:
               var10000 = 167;
               break;
            case 147:
               var10000 = 143;
               break;
            case 148:
               var10000 = 79;
               break;
            case 149:
               var10000 = 164;
               break;
            case 150:
               var10000 = 182;
               break;
            case 151:
               var10000 = 236;
               break;
            case 152:
               var10000 = 189;
               break;
            case 153:
               var10000 = 195;
               break;
            case 154:
               var10000 = 224;
               break;
            case 155:
               var10000 = 119;
               break;
            case 156:
               var10000 = 27;
               break;
            case 157:
               var10000 = 237;
               break;
            case 158:
               var10000 = 234;
               break;
            case 159:
               var10000 = 48;
               break;
            case 160:
               var10000 = 250;
               break;
            case 161:
               var10000 = 175;
               break;
            case 162:
               var10000 = 201;
               break;
            case 163:
               var10000 = 111;
               break;
            case 164:
               var10000 = 240;
               break;
            case 165:
               var10000 = 186;
               break;
            case 166:
               var10000 = 98;
               break;
            case 167:
               var10000 = 69;
               break;
            case 168:
               var10000 = 197;
               break;
            case 169:
               var10000 = 142;
               break;
            case 170:
               var10000 = 39;
               break;
            case 171:
               var10000 = 192;
               break;
            case 172:
               var10000 = 154;
               break;
            case 173:
               var10000 = 245;
               break;
            case 174:
               var10000 = 207;
               break;
            case 175:
               var10000 = 46;
               break;
            case 176:
               var10000 = 3;
               break;
            case 177:
               var10000 = 16;
               break;
            case 178:
               var10000 = 56;
               break;
            case 179:
               var10000 = 176;
               break;
            case 180:
               var10000 = 220;
               break;
            case 181:
               var10000 = 211;
               break;
            case 182:
               var10000 = 231;
               break;
            case 183:
               var10000 = 60;
               break;
            case 184:
               var10000 = 149;
               break;
            case 185:
               var10000 = 44;
               break;
            case 186:
               var10000 = 15;
               break;
            case 187:
               var10000 = 181;
               break;
            case 188:
               var10000 = 94;
               break;
            case 189:
               var10000 = 128;
               break;
            case 190:
               var10000 = 235;
               break;
            case 191:
               var10000 = 129;
               break;
            case 192:
               var10000 = 25;
               break;
            case 193:
               var10000 = 147;
               break;
            case 194:
               var10000 = 58;
               break;
            case 195:
               var10000 = 106;
               break;
            case 196:
               var10000 = 99;
               break;
            case 197:
               var10000 = 40;
               break;
            case 198:
               var10000 = 215;
               break;
            case 199:
               var10000 = 2;
               break;
            case 200:
               var10000 = 1;
               break;
            case 201:
               var10000 = 218;
               break;
            case 202:
               var10000 = 126;
               break;
            case 203:
               var10000 = 85;
               break;
            case 204:
               var10000 = 37;
               break;
            case 205:
               var10000 = 102;
               break;
            case 206:
               var10000 = 131;
               break;
            case 207:
               var10000 = 172;
               break;
            case 208:
               var10000 = 84;
               break;
            case 209:
               var10000 = 135;
               break;
            case 210:
               var10000 = 117;
               break;
            case 211:
               var10000 = 78;
               break;
            case 212:
               var10000 = 205;
               break;
            case 213:
               var10000 = 71;
               break;
            case 214:
               var10000 = 238;
               break;
            case 215:
               var10000 = 173;
               break;
            case 216:
               var10000 = 232;
               break;
            case 217:
               var10000 = 130;
               break;
            case 218:
               var10000 = 49;
               break;
            case 219:
               var10000 = 103;
               break;
            case 220:
               var10000 = 105;
               break;
            case 221:
               var10000 = 180;
               break;
            case 222:
               var10000 = 38;
               break;
            case 223:
               var10000 = 204;
               break;
            case 224:
               var10000 = 210;
               break;
            case 225:
               var10000 = 92;
               break;
            case 226:
               var10000 = 168;
               break;
            case 227:
               var10000 = 100;
               break;
            case 228:
               var10000 = 213;
               break;
            case 229:
               var10000 = 202;
               break;
            case 230:
               var10000 = 83;
               break;
            case 231:
               var10000 = 121;
               break;
            case 232:
               var10000 = 116;
               break;
            case 233:
               var10000 = 139;
               break;
            case 234:
               var10000 = 50;
               break;
            case 235:
               var10000 = 18;
               break;
            case 236:
               var10000 = 244;
               break;
            case 237:
               var10000 = 145;
               break;
            case 238:
               var10000 = 6;
               break;
            case 239:
               var10000 = 70;
               break;
            case 240:
               var10000 = 255;
               break;
            case 241:
               var10000 = 160;
               break;
            case 242:
               var10000 = 43;
               break;
            case 243:
               var10000 = 59;
               break;
            case 244:
               var10000 = 26;
               break;
            case 245:
               var10000 = 108;
               break;
            case 246:
               var10000 = 248;
               break;
            case 247:
               var10000 = 127;
               break;
            case 248:
               var10000 = 225;
               break;
            case 249:
               var10000 = 82;
               break;
            case 250:
               var10000 = 184;
               break;
            case 251:
               var10000 = 148;
               break;
            case 252:
               var10000 = 233;
               break;
            case 253:
               var10000 = 209;
               break;
            case 254:
               var10000 = 140;
               break;
            default:
               var10000 = 33;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32294;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      byte[] var7;
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "ÿ8´@Ã\u0086Ý\u0017\u00adÑ\ngOt°\u000e\u0010àûW8¿\u0089Rö\\í4à\u0088\u0084H\u0010\u000f\u0014A\u0080\u001d\u0005\u0007_\u001dü\u00978RpÇ\u0013";
      int var12 = "ÿ8´@Ã\u0086Ý\u0017\u00adÑ\ngOt°\u000e\u0010àûW8¿\u0089Rö\\í4à\u0088\u0084H\u0010\u000f\u0014A\u0080\u001d\u0005\u0007_\u001dü\u00978RpÇ\u0013"
         .length();
      char var9 = 16;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 120;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 120;
               var10006 = var14;
            } else {
               var27 = 120;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 120;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 27;
                     break;
                  case 1:
                     var47 = 124;
                     break;
                  case 2:
                     var47 = 119;
                     break;
                  case 3:
                     var47 = 59;
                     break;
                  case 4:
                     var47 = 74;
                     break;
                  case 5:
                     var47 = 54;
                     break;
                  default:
                     var47 = 124;
               }

               var10005[var10006] = (char)(var46 ^ var32 ^ var47);
               var14++;
               if (var27 == 0) {
                  var10006 = var27;
                  var10005 = var10002;
                  var32 = var27;
               } else {
                  if (var17 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var32 = var27;
                  var10006 = var14;
               }
            }
         }

         String var29 = new String(var10002).intern();
         int var19 = -1;
         var13[var11++] = var29;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[3];
            long var0 = 4940825594417940331L;
            long[] var6 = new long[22];
            int var3 = 0;
            String var4 = "\u009fÞÆR!Ê\b\u0083hÎd\u0083`ñ3üøHdæ\rP.+?M¤L\u001799B,@¢å©Y%\u001bR?$ß/\u0010xÓµ*\"\téðXo±ÚGNu\u009cB\u0094\u0018\u000bêÎwÆ jñ\u0016ÜJàEL\u0080,¤IÅ\u0084Ë\u001a\u0081\u0095°¤ ] \u0092ç¡\u0002o¾-Lé\u009f)O\u0091cR\b\u008e\u001fÆ\u009bW¡E3®±\b$S{\u009ec\u0085ÞÄ\u001a#¹0åÄ~d6\u008eKó&Êð7EÔÛ\u0088pt\u0088Aë\u0017P¹\u0081\u0098\u0010";
            int var5 = "\u009fÞÆR!Ê\b\u0083hÎd\u0083`ñ3üøHdæ\rP.+?M¤L\u001799B,@¢å©Y%\u001bR?$ß/\u0010xÓµ*\"\téðXo±ÚGNu\u009cB\u0094\u0018\u000bêÎwÆ jñ\u0016ÜJàEL\u0080,¤IÅ\u0084Ë\u001a\u0081\u0095°¤ ] \u0092ç¡\u0002o¾-Lé\u009f)O\u0091cR\b\u008e\u001fÆ\u009bW¡E3®±\b$S{\u009ec\u0085ÞÄ\u001a#¹0åÄ~d6\u008eKó&Êð7EÔÛ\u0088pt\u0088Aë\u0017P¹\u0081\u0098\u0010"
               .length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
               long[] var10000 = var6;
               var19 = var3++;
               long var25 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var30 = -1;

               while (true) {
                  long var37 = var25 ^ var0;
                  switch (var30) {
                     case 0:
                        var10000[var19] = var37;
                        if (var2 >= var5) {
                           c = var6;
                           d = new Integer[22];
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "Ü\u008d¥[ã2.\u009a¥Þ\u007f\u0019;,Í\f";
                        var5 = "Ü\u008d¥[ã2.\u009a¥Þ\u007f\u0019;,Í\f".length();
                        var2 = 0;
                  }

                  byte var22 = var2;
                  var2 += 8;
                  var7 = var4.substring(var22, var2).getBytes("ISO-8859-1");
                  var10000 = var6;
                  var19 = var3++;
                  var25 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var30 = 0;
               }
            }
         }

         var9 = var10.charAt(var8);
      }
   }
}





