package com.finalshell.core;

import com.finalshell.io.YM3;
import com.finalshell.ui.model.EP;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class ON3 implements Closeable, Flushable {
   public YM3 F;
   public NL3 q;
   public RC d;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public ON3(Writer var1) {
      this.F = new YM3(var1);
      this.q = new NL3(this.F);
   }

   public void O(EP var1, boolean var2) {
      this.F.k(var1, var2);
   }

   public void G() {
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
      // 06: ifnonnull 3a
      // 09: getfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 0c: ifnull 21
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial com/finalshell/core/ON3.J ()V
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 20: athrow
      // 21: aload 0
      // 22: new com/finalshell/core/RC
      // 25: dup
      // 26: aload 0
      // 27: getfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 2a: sipush 28642
      // 2d: ldc2_w 4188737048031171003
      // 30: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 33: invokespecial com/finalshell/core/RC.<init> (Lcom/finalshell/core/RC;I)V
      // 36: putfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 39: aload 0
      // 3a: getfield com/finalshell/core/ON3.F Lcom/finalshell/io/YM3;
      // 3d: sipush 901
      // 40: ldc2_w 9133198515351125457
      // 43: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 46: invokevirtual com/finalshell/io/YM3.write (I)V
      // 49: return
   }

   public void n() {
      this.F.write(a(25396, 7652739688652381545L));
      this.j();
   }

   public void Q(String var1) {
      this.j(var1);
   }

   public void o(Object var1) {
      this.W(var1);
   }

   public void j(String var1) {
      this.A();
      this.q.l(var1);
      this.d();
   }

   public void W(Object var1) {
      this.A();
      this.q.B(var1);
      this.d();
   }

   public void m() {
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
      // 06: ifnonnull 3a
      // 09: getfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 0c: ifnull 21
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial com/finalshell/core/ON3.J ()V
      // 1a: goto 21
      // 1d: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 20: athrow
      // 21: aload 0
      // 22: new com/finalshell/core/RC
      // 25: dup
      // 26: aload 0
      // 27: getfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 2a: sipush 32163
      // 2d: ldc2_w 8809813507594257401
      // 30: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 33: invokespecial com/finalshell/core/RC.<init> (Lcom/finalshell/core/RC;I)V
      // 36: putfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 39: aload 0
      // 3a: getfield com/finalshell/core/ON3.F Lcom/finalshell/io/YM3;
      // 3d: sipush 2803
      // 40: ldc2_w 12498422416766113
      // 43: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 46: invokevirtual com/finalshell/io/YM3.write (I)V
      // 49: return
   }

   public void J() {
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
      // 04: getfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 07: getfield com/finalshell/core/RC.S I
      // 0a: istore 2
      // 0b: astore 1
      // 0c: aload 0
      // 0d: aload 1
      // 0e: ifnonnull 44
      // 11: getfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 14: getfield com/finalshell/core/RC.S I
      // 17: tableswitch 113 1001 1005 91 37 113 102 64
      // 38: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 3b: athrow
      // 3c: aload 0
      // 3d: goto 44
      // 40: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 43: athrow
      // 44: getfield com/finalshell/core/ON3.F Lcom/finalshell/io/YM3;
      // 47: sipush 31028
      // 4a: ldc2_w 9038264540284421991
      // 4d: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 50: invokevirtual com/finalshell/io/YM3.write (I)V
      // 53: aload 1
      // 54: ifnull a8
      // 57: aload 0
      // 58: getfield com/finalshell/core/ON3.F Lcom/finalshell/io/YM3;
      // 5b: sipush 20686
      // 5e: ldc2_w 3104274003673001617
      // 61: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 64: invokevirtual com/finalshell/io/YM3.write (I)V
      // 67: aload 1
      // 68: ifnull a8
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 71: athrow
      // 72: aload 1
      // 73: ifnull a8
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 7c: athrow
      // 7d: aload 1
      // 7e: ifnull a8
      // 81: goto 88
      // 84: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 87: athrow
      // 88: new com/finalshell/core/Hi2
      // 8b: dup
      // 8c: new java/lang/StringBuilder
      // 8f: dup
      // 90: invokespecial java/lang/StringBuilder.<init> ()V
      // 93: getstatic com/finalshell/core/ON3.a Ljava/lang/String;
      // 96: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 99: iload 2
      // 9a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a0: invokespecial com/finalshell/core/Hi2.<init> (Ljava/lang/String;)V
      // a3: athrow
      // a4: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // a7: athrow
      // a8: return
   }

   public void I() {
      this.F.write(a(14623, 5063355052576458569L));
      this.j();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void j() {
      int var8;
      String var10000 = Hi2.C();
      this.d = this.d.K;
      String var1 = var10000;

      try {
         if (this.d == null) {
            return;
         }
      } catch (Hi2 var7) {
         throw new RuntimeException(a(var7));
      }

      int var2 = -1;

      label78: {
         label60: {
            label59: {
               label73: {
                  label57: {
                     try {
                        var8 = this.d.S;
                        if (var1 != null) {
                           break label78;
                        }

                        switch (this.d.S) {
                           case 1001:
                              break label59;
                           case 1002:
                              break;
                           case 1003:
                           default:
                              break label60;
                           case 1004:
                              break label57;
                           case 1005:
                              break label73;
                        }
                     } catch (Hi2 var6) {
                        throw new RuntimeException(a(var6));
                     }

                     var2 = a(12631, 3442598437512597248L);
                     if (var1 == null) {
                        break label60;
                     }
                  }

                  var2 = a(31089, 7521341819023886121L);

                  try {
                     if (var1 == null) {
                        break label60;
                     }
                  } catch (Hi2 var5) {
                     boolean var10001 = false;
                     throw new RuntimeException(a(var5));
                  }
               }

               try {
                  if (var1 == null) {
                     break label60;
                  }
               } catch (Hi2 var4) {
                  boolean var10 = false;
                  throw new RuntimeException(a(var4));
               }
            }

            var2 = a(25670, 7824052376647604760L);
         }

         var8 = var2;
      }

      try {
         if (var8 != -1) {
            this.d.S = var2;
         }
      } catch (Hi2 var3) {
         throw new RuntimeException(a(var3));
      }
   }

   public void A() {
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
      // 05: getfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 08: aload 1
      // 09: ifnonnull 1b
      // 0c: ifnonnull 17
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 15: athrow
      // 16: return
      // 17: aload 0
      // 18: getfield com/finalshell/core/ON3.d Lcom/finalshell/core/RC;
      // 1b: getfield com/finalshell/core/RC.S I
      // 1e: tableswitch 122 1001 1005 34 45 72 34 99
      // 40: aload 1
      // 41: ifnull 98
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield com/finalshell/core/ON3.F Lcom/finalshell/io/YM3;
      // 4f: sipush 13433
      // 52: ldc2_w 1559066485048953388
      // 55: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 58: invokevirtual com/finalshell/io/YM3.write (I)V
      // 5b: aload 1
      // 5c: ifnull 98
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 65: athrow
      // 66: aload 0
      // 67: getfield com/finalshell/core/ON3.F Lcom/finalshell/io/YM3;
      // 6a: sipush 23773
      // 6d: ldc2_w 6741049983396913804
      // 70: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 73: invokevirtual com/finalshell/io/YM3.write (I)V
      // 76: aload 1
      // 77: ifnull 98
      // 7a: goto 81
      // 7d: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 80: athrow
      // 81: aload 0
      // 82: getfield com/finalshell/core/ON3.F Lcom/finalshell/io/YM3;
      // 85: sipush 23773
      // 88: ldc2_w 6741049983396913804
      // 8b: invokestatic com/finalshell/core/ON3.a (IJ)I
      // 8e: invokevirtual com/finalshell/io/YM3.write (I)V
      // 91: goto 98
      // 94: invokestatic com/finalshell/core/ON3.a (Lcom/finalshell/core/Hi2;)Lcom/finalshell/core/Hi2;
      // 97: athrow
      // 98: return
   }

   public void d() {
      int var8;
      String var1 = Hi2.C();

      RC var10000;
      label67: {
         try {
            var10000 = this.d;
            if (var1 != null) {
               break label67;
            }

            if (this.d == null) {
               return;
            }
         } catch (Hi2 var7) {
            throw new RuntimeException(a(var7));
         }

         var10000 = this.d;
      }

      int var2 = var10000.S;
      int var3 = -1;

      label56: {
         label72: {
            label54: {
               label53: {
                  try {
                     var8 = var2;
                     if (var1 != null) {
                        break label56;
                     }

                     switch (var2) {
                        case 1001:
                        case 1003:
                           break label53;
                        case 1002:
                           break;
                        case 1004:
                           break label54;
                        case 1005:
                        default:
                           break label72;
                     }
                  } catch (Hi2 var6) {
                     throw new RuntimeException(a(var6));
                  }

                  var3 = a(5087, 6118394040811187599L);
                  if (var1 == null) {
                     break label72;
                  }
               }

               var3 = a(19641, 7410109384547349218L);
               if (var1 == null) {
                  break label72;
               }
            }

            var3 = a(3358, 5896488422009074498L);

            try {
               if (var1 != null) {
               }
            } catch (Hi2 var5) {
               throw new RuntimeException(a(var5));
            }
         }

         var8 = var3;
      }

      try {
         if (var8 != -1) {
            this.d.S = var3;
         }
      } catch (Hi2 var4) {
         throw new RuntimeException(a(var4));
      }
   }

   @Override
   public void flush() throws IOException {
      this.F.flush();
   }

   @Override
   public void close() throws IOException {
      this.F.close();
   }

   @Deprecated
   public void E() {
      this.G();
   }

   @Deprecated
   public void O() {
      this.n();
   }

   @Deprecated
   public void X() {
      this.m();
   }

   @Deprecated
   public void g() {
      this.I();
   }

   public static Hi2 a(Hi2 var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32338;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0015ucBzZg\\j{Fi^+F9".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 7;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 7;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 123;
               break;
            case 1:
               var50 = 30;
               break;
            case 2:
               var50 = 8;
               break;
            case 3:
               var50 = 32;
               break;
            case 4:
               var50 = 26;
               break;
            case 5:
               var50 = 60;
               break;
            default:
               var50 = 12;
         }
      } else {
         var34 = 7;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 408931835321987548L;
            long[] var14 = new long[16];
            int var11 = 0;
            String var12 = "ýR\f³ÑÐE&GM\u0013z\u0000\u001e¶\u0081[£ÿñËÝß¸l¸\u0007+ä1\u0093|3´Üª\u009dÈöÈ}\u0086\u0016va÷ý7¹\"î\u0019\u009f\u0017Ìv.\u001fÈ![8{Ê\u0016ÄçÇ\u001c/1É½\u001e¬Fá\f\u0080Ô³s\u0085\u0005°\u0082µ\u0018µ\u0091z£\u0090Ý£\u008e5\u0097ï\u009c»\u0096¨.GÕ\\x7ß\u009fa";
            int var13 = "ýR\f³ÑÐE&GM\u0013z\u0000\u001e¶\u0081[£ÿñËÝß¸l¸\u0007+ä1\u0093|3´Üª\u009dÈöÈ}\u0086\u0016va÷ý7¹\"î\u0019\u009f\u0017Ìv.\u001fÈ![8{Ê\u0016ÄçÇ\u001c/1É½\u001e¬Fá\f\u0080Ô³s\u0085\u0005°\u0082µ\u0018µ\u0091z£\u0090Ý£\u008e5\u0097ï\u009c»\u0096¨.GÕ\\x7ß\u009fa"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[16];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "[\u009b%\fõºÁs\u0091¼°§\u0001\u001f¬È";
                        var13 = "[\u009b%\fõºÁs\u0091¼°§\u0001\u001f¬È".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 7;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 123;
               break;
            case 1:
               var50 = 30;
               break;
            case 2:
               var50 = 8;
               break;
            case 3:
               var50 = 32;
               break;
            case 4:
               var50 = 26;
               break;
            case 5:
               var50 = 60;
               break;
            default:
               var50 = 12;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 123;
                  break;
               case 1:
                  var50 = 30;
                  break;
               case 2:
                  var50 = 8;
                  break;
               case 3:
                  var50 = 32;
                  break;
               case 4:
                  var50 = 26;
                  break;
               case 5:
                  var50 = 60;
                  break;
               default:
                  var50 = 12;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 408931835321987548L;
               long[] var6 = new long[16];
               int var3 = 0;
               String var4 = "ýR\f³ÑÐE&GM\u0013z\u0000\u001e¶\u0081[£ÿñËÝß¸l¸\u0007+ä1\u0093|3´Üª\u009dÈöÈ}\u0086\u0016va÷ý7¹\"î\u0019\u009f\u0017Ìv.\u001fÈ![8{Ê\u0016ÄçÇ\u001c/1É½\u001e¬Fá\f\u0080Ô³s\u0085\u0005°\u0082µ\u0018µ\u0091z£\u0090Ý£\u008e5\u0097ï\u009c»\u0096¨.GÕ\\x7ß\u009fa";
               int var5 = "ýR\f³ÑÐE&GM\u0013z\u0000\u001e¶\u0081[£ÿñËÝß¸l¸\u0007+ä1\u0093|3´Üª\u009dÈöÈ}\u0086\u0016va÷ý7¹\"î\u0019\u009f\u0017Ìv.\u001fÈ![8{Ê\u0016ÄçÇ\u001c/1É½\u001e¬Fá\f\u0080Ô³s\u0085\u0005°\u0082µ\u0018µ\u0091z£\u0090Ý£\u008e5\u0097ï\u009c»\u0096¨.GÕ\\x7ß\u009fa"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[16];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "[\u009b%\fõºÁs\u0091¼°§\u0001\u001f¬È";
                           var5 = "[\u009b%\fõºÁs\u0091¼°§\u0001\u001f¬È".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 123;
                  break;
               case 1:
                  var50 = 30;
                  break;
               case 2:
                  var50 = 8;
                  break;
               case 3:
                  var50 = 32;
                  break;
               case 4:
                  var50 = 26;
                  break;
               case 5:
                  var50 = 60;
                  break;
               default:
                  var50 = 12;
            }
         }
      }
   }
}





