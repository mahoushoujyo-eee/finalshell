package com;

import java.io.IOException;

class Y4 {
   com.O3[] G;
   int r;
   int R;
   final com.dY_3 Y;
   private static final String a;
   private static final long b;

   Y4(com.dY_3 var1, int var2) {
      boolean var10000 = com.dm_4.J();
      this.Y = var1;
      boolean var3 = var10000;
      super();
      this.G = null;
      this.G = new com.O3[var2];
      int var4 = 0;

      while (true) {
         if (var4 < this.G.length) {
            this.G[var4] = new com.O3(this);
            var4++;
            if (var3) {
               break;
            }

            if (!var3) {
               continue;
            }
         }

         this.w();
         break;
      }
   }

   void w() {
      this.r = this.R = 0;
   }

   void Y(int var1, long var2, int var4) {
      boolean var5 = com.dm_4.J();
      int var10000 = this.R;
      if (!var5) {
         if (this.R == 0) {
            this.r = 0;
         }

         var10000 = this.r + this.R;
      }

      int var6 = var10000;
      if (!var5) {
         if (var6 >= this.G.length) {
            var6 -= this.G.length;
         }

         this.G[var6].y = var1;
         this.G[var6].P = var2;
         this.G[var6].C = (long)var4;
         this.R++;
      }
   }

   com.O3 y(int param1) throws com.oU_3, com.Dn_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/dm_4.J ()Z
      // 03: aload 0
      // 04: dup
      // 05: getfield com/Y4.R I
      // 08: bipush 1
      // 09: isub
      // 0a: putfield com/Y4.R I
      // 0d: istore 2
      // 0e: aload 0
      // 0f: getfield com/Y4.r I
      // 12: istore 3
      // 13: aload 0
      // 14: dup
      // 15: getfield com/Y4.r I
      // 18: bipush 1
      // 19: iadd
      // 1a: putfield com/Y4.r I
      // 1d: aload 0
      // 1e: getfield com/Y4.r I
      // 21: aload 0
      // 22: getfield com/Y4.G [Lcom/O3;
      // 25: arraylength
      // 26: iload 2
      // 27: ifne 55
      // 2a: if_icmpne 40
      // 2d: goto 34
      // 30: invokestatic com/Y4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: bipush 0
      // 36: putfield com/Y4.r I
      // 39: goto 40
      // 3c: invokestatic com/Y4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/Y4.G [Lcom/O3;
      // 44: iload 3
      // 45: aaload
      // 46: iload 2
      // 47: ifne fa
      // 4a: getfield com/O3.y I
      // 4d: iload 1
      // 4e: goto 55
      // 51: invokestatic com/Y4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: if_icmpeq ea
      // 58: aload 0
      // 59: invokevirtual com/Y4.M ()J
      // 5c: lstore 4
      // 5e: bipush 0
      // 5f: istore 6
      // 61: bipush 0
      // 62: istore 7
      // 64: iload 7
      // 66: aload 0
      // 67: getfield com/Y4.G [Lcom/O3;
      // 6a: arraylength
      // 6b: if_icmpge b9
      // 6e: aload 0
      // 6f: getfield com/Y4.G [Lcom/O3;
      // 72: iload 7
      // 74: aaload
      // 75: getfield com/O3.y I
      // 78: iload 2
      // 79: ifne bb
      // 7c: iload 2
      // 7d: ifne 9a
      // 80: goto 87
      // 83: invokestatic com/Y4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: iload 1
      // 88: if_icmpne ab
      // 8b: goto 92
      // 8e: invokestatic com/Y4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: bipush 1
      // 93: goto 9a
      // 96: invokestatic com/Y4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: istore 6
      // 9c: aload 0
      // 9d: getfield com/Y4.G [Lcom/O3;
      // a0: iload 7
      // a2: aaload
      // a3: bipush 0
      // a4: putfield com/O3.y I
      // a7: iload 2
      // a8: ifeq b9
      // ab: iinc 7 1
      // ae: iload 2
      // af: ifeq 64
      // b2: goto b9
      // b5: invokestatic com/Y4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b8: athrow
      // b9: iload 6
      // bb: ifeq cd
      // be: new com/oU_3
      // c1: dup
      // c2: aload 0
      // c3: lload 4
      // c5: invokespecial com/oU_3.<init> (Lcom/Y4;J)V
      // c8: athrow
      // c9: invokestatic com/Y4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cc: athrow
      // cd: new com/Dn_2
      // d0: dup
      // d1: bipush 4
      // d2: new java/lang/StringBuilder
      // d5: dup
      // d6: invokespecial java/lang/StringBuilder.<init> ()V
      // d9: getstatic com/Y4.a Ljava/lang/String;
      // dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // df: iload 1
      // e0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e6: invokespecial com/Dn_2.<init> (ILjava/lang/String;)V
      // e9: athrow
      // ea: aload 0
      // eb: getfield com/Y4.G [Lcom/O3;
      // ee: iload 3
      // ef: aaload
      // f0: bipush 0
      // f1: putfield com/O3.y I
      // f4: aload 0
      // f5: getfield com/Y4.G [Lcom/O3;
      // f8: iload 3
      // f9: aaload
      // fa: areturn
   }

   int J() {
      return this.R;
   }

   int D() {
      return this.G.length;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   void W(s_2 var1, uJ var2) throws IOException {
      int var10000 = com.dm_4.J();
      int var4 = this.R;
      boolean var3 = (boolean)var10000;
      int var5 = 0;

      label67:
      while (true) {
         var10000 = var5;
         int var10001 = var4;

         label64:
         while (var10000 < var10001) {
            var1 = com.dY_3.b(this.Y, var2, var1);
            int var6 = var1.W;
            if (var3) {
               return;
            }

            int var7 = 0;

            while (var7 < this.G.length) {
               label57: {
                  label56: {
                     try {
                        var13 = this.G[var7];
                        if (var3) {
                           break label56;
                        }

                        var10000 = var13.y;
                        var10001 = var1.w;
                        if (var3) {
                           continue label64;
                        }
                     } catch (IOException var11) {
                        throw a(var11);
                     }

                     try {
                        if (var10000 != var10001) {
                           break label57;
                        }

                        var13 = this.G[var7];
                     } catch (IOException var10) {
                        throw a(var10);
                     }
                  }

                  try {
                     var13.y = 0;
                     if (!var3) {
                        break;
                     }
                  } catch (IOException var9) {
                     boolean var15 = false;
                     throw a(var9);
                  }
               }

               try {
                  var7++;
                  if (var3) {
                     break;
                  }
               } catch (IOException var8) {
                  boolean var16 = false;
                  throw a(var8);
               }
            }

            com.dY_3.B(this.Y, (long)var6);
            var5++;
            if (!var3) {
               continue label67;
            }
            break;
         }

         this.w();
         return;
      }
   }

   long M() {
      long var2 = b;
      int var10000 = com.dm_4.J();
      int var4 = 0;
      boolean var1 = (boolean)var10000;

      while (var4 < this.G.length) {
         label30: {
            label38: {
               var10000 = this.G[var4].y;
               if (!var1) {
                  if (this.G[var4].y == 0 && !var1) {
                     break label30;
                  }

                  var6 = var2;
                  if (var1) {
                     break label38;
                  }

                  long var7;
                  var10000 = (var7 = var2 - this.G[var4].P) == 0L ? 0 : (var7 < 0L ? -1 : 1);
               }

               if (var10000 <= 0) {
                  break label30;
               }

               var6 = this.G[var4].P;
            }

            var2 = var6;
         }

         var4++;
         if (var1) {
            break;
         }
      }

      return var2;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "By\"G7J\bAi6G7\u0003\\er8\\=N\u00120n6C'\\\u000fd<:Vr".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 76;
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
         var10007 = 76;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 92;
               break;
            case 1:
               var21 = 80;
               break;
            case 2:
               var21 = 31;
               break;
            case 3:
               var21 = 126;
               break;
            case 4:
               var21 = 30;
               break;
            case 5:
               var21 = 117;
               break;
            default:
               var21 = 48;
         }
      } else {
         var13 = 76;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 4939171300816766569L;
            long var12 = 4284200736038009238L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 76;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 92;
               break;
            case 1:
               var21 = 80;
               break;
            case 2:
               var21 = 31;
               break;
            case 3:
               var21 = 126;
               break;
            case 4:
               var21 = 30;
               break;
            case 5:
               var21 = 117;
               break;
            default:
               var21 = 48;
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
                  var21 = 92;
                  break;
               case 1:
                  var21 = 80;
                  break;
               case 2:
                  var21 = 31;
                  break;
               case 3:
                  var21 = 126;
                  break;
               case 4:
                  var21 = 30;
                  break;
               case 5:
                  var21 = 117;
                  break;
               default:
                  var21 = 48;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 4939171300816766569L;
               long var11 = 4284200736038009238L ^ var0;
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
                  var21 = 92;
                  break;
               case 1:
                  var21 = 80;
                  break;
               case 2:
                  var21 = 31;
                  break;
               case 3:
                  var21 = 126;
                  break;
               case 4:
                  var21 = 30;
                  break;
               case 5:
                  var21 = 117;
                  break;
               default:
                  var21 = 48;
            }
         }
      }
   }
}





