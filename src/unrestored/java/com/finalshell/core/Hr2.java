package com.finalshell.core;

public class Hr2 {
   public float[] j = null;
   public float[] K = null;
   public int d;
   public int F;
   public static String[] a;
   public static String[] b;

   public Hr2(int var1, int var2, int var3, int var4) {
      String[] var10000 = W5.q();
      this.d = var1;
      this.F = var2;
      String[] var5 = var10000;
      this.j = new float[var1 * var2];
      this.K = new float[var1 * var2];
      int var6 = 0;
      int var7 = 0;

      while (var7 < var1) {
         int var8 = 0;

         while (true) {
            if (var8 < var2) {
               try {
                  this.j[var6] = (float)var8 * (float)(var3 - 1) / (float)(var2 - 1);
                  this.K[var6] = (float)var7 * (float)(var4 - 1) / (float)(var1 - 1);
                  var6++;
                  var8++;
                  if (var5 == null) {
                     break;
                  }

                  if (var5 != null) {
                     continue;
                  }
               } catch (IllegalArgumentException var9) {
                  throw a(var9);
               }
            }

            var7++;
            break;
         }

         if (var5 == null) {
            break;
         }
      }
   }

   public void E(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 003: aload 0
      // 004: getfield com/finalshell/core/Hr2.d I
      // 007: bipush 1
      // 008: iadd
      // 009: aload 0
      // 00a: getfield com/finalshell/core/Hr2.F I
      // 00d: imul
      // 00e: istore 3
      // 00f: iload 3
      // 010: newarray 6
      // 012: astore 4
      // 014: astore 2
      // 015: iload 3
      // 016: newarray 6
      // 018: astore 5
      // 01a: aload 0
      // 01b: dup
      // 01c: getfield com/finalshell/core/Hr2.d I
      // 01f: bipush 1
      // 020: iadd
      // 021: putfield com/finalshell/core/Hr2.d I
      // 024: bipush 0
      // 025: istore 6
      // 027: bipush 0
      // 028: istore 7
      // 02a: bipush 0
      // 02b: istore 8
      // 02d: iload 8
      // 02f: aload 0
      // 030: getfield com/finalshell/core/Hr2.d I
      // 033: if_icmpge 0f9
      // 036: aload 2
      // 037: ifnull 105
      // 03a: bipush 0
      // 03b: istore 9
      // 03d: iload 9
      // 03f: aload 0
      // 040: getfield com/finalshell/core/Hr2.F I
      // 043: if_icmpge 0cd
      // 046: iload 7
      // 048: iload 9
      // 04a: iadd
      // 04b: istore 10
      // 04d: iload 6
      // 04f: iload 9
      // 051: iadd
      // 052: istore 11
      // 054: aload 2
      // 055: ifnull 0ba
      // 058: iload 8
      // 05a: iload 1
      // 05b: aload 2
      // 05c: ifnull 0d2
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: if_icmpne 0a7
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: aload 4
      // 072: iload 10
      // 074: aload 0
      // 075: getfield com/finalshell/core/Hr2.j [F
      // 078: iload 11
      // 07a: faload
      // 07b: aload 0
      // 07c: getfield com/finalshell/core/Hr2.j [F
      // 07f: iload 10
      // 081: faload
      // 082: fadd
      // 083: fconst_2
      // 084: fdiv
      // 085: fastore
      // 086: aload 5
      // 088: iload 10
      // 08a: aload 0
      // 08b: getfield com/finalshell/core/Hr2.K [F
      // 08e: iload 11
      // 090: faload
      // 091: aload 0
      // 092: getfield com/finalshell/core/Hr2.K [F
      // 095: iload 10
      // 097: faload
      // 098: fadd
      // 099: fconst_2
      // 09a: fdiv
      // 09b: fastore
      // 09c: aload 2
      // 09d: ifnonnull 0c6
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: aload 4
      // 0a9: iload 10
      // 0ab: aload 0
      // 0ac: getfield com/finalshell/core/Hr2.j [F
      // 0af: iload 11
      // 0b1: faload
      // 0b2: fastore
      // 0b3: goto 0ba
      // 0b6: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: aload 5
      // 0bc: iload 10
      // 0be: aload 0
      // 0bf: getfield com/finalshell/core/Hr2.K [F
      // 0c2: iload 11
      // 0c4: faload
      // 0c5: fastore
      // 0c6: iinc 9 1
      // 0c9: aload 2
      // 0ca: ifnonnull 03d
      // 0cd: iload 8
      // 0cf: iload 1
      // 0d0: bipush 1
      // 0d1: isub
      // 0d2: aload 2
      // 0d3: ifnull 0ef
      // 0d6: if_icmpeq 0e9
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: iload 6
      // 0e2: aload 0
      // 0e3: getfield com/finalshell/core/Hr2.F I
      // 0e6: iadd
      // 0e7: istore 6
      // 0e9: iload 7
      // 0eb: aload 0
      // 0ec: getfield com/finalshell/core/Hr2.F I
      // 0ef: iadd
      // 0f0: istore 7
      // 0f2: iinc 8 1
      // 0f5: aload 2
      // 0f6: ifnonnull 02d
      // 0f9: aload 0
      // 0fa: aload 4
      // 0fc: putfield com/finalshell/core/Hr2.j [F
      // 0ff: aload 0
      // 100: aload 5
      // 102: putfield com/finalshell/core/Hr2.K [F
      // 105: return
   }

   public void f(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/finalshell/core/Hr2.d I
      // 04: aload 0
      // 05: getfield com/finalshell/core/Hr2.F I
      // 08: bipush 1
      // 09: iadd
      // 0a: imul
      // 0b: istore 3
      // 0c: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 0f: iload 3
      // 10: newarray 6
      // 12: astore 4
      // 14: iload 3
      // 15: newarray 6
      // 17: astore 5
      // 19: aload 0
      // 1a: dup
      // 1b: getfield com/finalshell/core/Hr2.F I
      // 1e: bipush 1
      // 1f: iadd
      // 20: putfield com/finalshell/core/Hr2.F I
      // 23: astore 2
      // 24: bipush 0
      // 25: istore 6
      // 27: bipush 0
      // 28: istore 7
      // 2a: bipush 0
      // 2b: istore 8
      // 2d: iload 8
      // 2f: aload 0
      // 30: getfield com/finalshell/core/Hr2.d I
      // 33: if_icmpge be
      // 36: aload 2
      // 37: ifnull ca
      // 3a: bipush 0
      // 3b: istore 9
      // 3d: iload 9
      // 3f: aload 0
      // 40: getfield com/finalshell/core/Hr2.F I
      // 43: if_icmpge b7
      // 46: iload 9
      // 48: iload 1
      // 49: aload 2
      // 4a: ifnull 33
      // 4d: if_icmpne 8b
      // 50: aload 4
      // 52: iload 7
      // 54: aload 0
      // 55: getfield com/finalshell/core/Hr2.j [F
      // 58: iload 6
      // 5a: faload
      // 5b: aload 0
      // 5c: getfield com/finalshell/core/Hr2.j [F
      // 5f: iload 6
      // 61: bipush 1
      // 62: isub
      // 63: faload
      // 64: fadd
      // 65: fconst_2
      // 66: fdiv
      // 67: fastore
      // 68: aload 5
      // 6a: iload 7
      // 6c: aload 0
      // 6d: getfield com/finalshell/core/Hr2.K [F
      // 70: iload 6
      // 72: faload
      // 73: aload 0
      // 74: getfield com/finalshell/core/Hr2.K [F
      // 77: iload 6
      // 79: bipush 1
      // 7a: isub
      // 7b: faload
      // 7c: fadd
      // 7d: fconst_2
      // 7e: fdiv
      // 7f: fastore
      // 80: aload 2
      // 81: ifnonnull ad
      // 84: goto 8b
      // 87: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a: athrow
      // 8b: aload 4
      // 8d: iload 7
      // 8f: aload 0
      // 90: getfield com/finalshell/core/Hr2.j [F
      // 93: iload 6
      // 95: faload
      // 96: fastore
      // 97: aload 5
      // 99: iload 7
      // 9b: aload 0
      // 9c: getfield com/finalshell/core/Hr2.K [F
      // 9f: iload 6
      // a1: faload
      // a2: fastore
      // a3: iinc 6 1
      // a6: goto ad
      // a9: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: iinc 7 1
      // b0: iinc 9 1
      // b3: aload 2
      // b4: ifnonnull 3d
      // b7: iinc 8 1
      // ba: aload 2
      // bb: ifnonnull 2d
      // be: aload 0
      // bf: aload 4
      // c1: putfield com/finalshell/core/Hr2.j [F
      // c4: aload 0
      // c5: aload 5
      // c7: putfield com/finalshell/core/Hr2.K [F
      // ca: return
   }

   public void r(int var1) {
      int var14;
      int var3 = (this.d - 1) * this.F;
      float[] var4 = new float[var3];
      String[] var10000 = W5.q();
      float[] var5 = new float[var3];
      String[] var2 = var10000;
      this.d--;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      while (true) {
         if (var8 < this.d) {
            if (var2 == null) {
               break;
            }

            int var9 = 0;

            label60: {
               while (var9 < this.F) {
                  int var10 = var7 + var9;
                  int var11 = var6 + var9;

                  try {
                     var4[var10] = this.j[var11];
                     var5[var10] = this.K[var11];
                     var9++;
                     if (var2 == null) {
                        break label60;
                     }

                     if (var2 == null) {
                        break;
                     }
                  } catch (IllegalArgumentException var13) {
                     throw a(var13);
                  }
               }

               int var10001;
               label40: {
                  label39: {
                     try {
                        var14 = var8;
                        var10001 = var1 - 1;
                        if (var2 == null) {
                           break label40;
                        }

                        if (var8 != var10001) {
                           break label39;
                        }
                     } catch (IllegalArgumentException var12) {
                        throw a(var12);
                     }

                     var6 += this.F;
                  }

                  var6 += this.F;
                  var14 = var7;
                  var10001 = this.F;
               }

               var7 = var14 + var10001;
               var8++;
            }

            if (var2 != null) {
               continue;
            }
         }

         this.j = var4;
         this.K = var5;
         break;
      }
   }

   public void b(int var1) {
      int var3 = this.d * (this.F + 1);
      float[] var4 = new float[var3];
      float[] var5 = new float[var3];
      String[] var10000 = W5.q();
      this.F--;
      String[] var2 = var10000;
      int var6 = 0;

      label49:
      while (true) {
         int var11 = var6;
         int var10001 = this.d;

         label46:
         while (var11 < var10001) {
            int var7 = var6 * (this.F + 1);
            int var8 = var6 * this.F;
            if (var2 == null) {
               return;
            }

            int var9 = 0;

            while (var9 < this.F) {
               label56: {
                  try {
                     var4[var8] = this.j[var7];
                     var5[var8] = this.K[var7];
                     if (var2 == null) {
                        break label56;
                     }

                     var11 = var9;
                     var10001 = var1 - 1;
                     if (var2 == null) {
                        continue label46;
                     }
                  } catch (IllegalArgumentException var10) {
                     throw a(var10);
                  }

                  if (var11 == var10001) {
                     var7++;
                  }

                  var7++;
                  var8++;
                  var9++;
               }

               if (var2 == null) {
                  break;
               }
            }

            var6++;
            if (var2 != null) {
               continue label49;
            }
            break;
         }

         this.j = var4;
         this.K = var5;
         return;
      }
   }

   public void O(float param1, Hr2 param2, Hr2 param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield com/finalshell/core/Hr2.d I
      // 009: aload 2
      // 00a: getfield com/finalshell/core/Hr2.d I
      // 00d: aload 4
      // 00f: ifnull 02b
      // 012: if_icmpne 03a
      // 015: goto 01c
      // 018: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield com/finalshell/core/Hr2.F I
      // 020: aload 2
      // 021: getfield com/finalshell/core/Hr2.F I
      // 024: goto 02b
      // 027: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 4
      // 02d: ifnull 057
      // 030: if_icmpeq 04f
      // 033: goto 03a
      // 036: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: new java/lang/IllegalArgumentException
      // 03d: dup
      // 03e: sipush 30714
      // 041: sipush 5371
      // 044: invokestatic com/finalshell/core/Hr2.a (II)Ljava/lang/String;
      // 047: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 04a: athrow
      // 04b: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 0
      // 050: getfield com/finalshell/core/Hr2.d I
      // 053: aload 3
      // 054: getfield com/finalshell/core/Hr2.d I
      // 057: aload 4
      // 059: ifnull 081
      // 05c: if_icmpne 084
      // 05f: goto 066
      // 062: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: aload 0
      // 067: getfield com/finalshell/core/Hr2.F I
      // 06a: aload 4
      // 06c: ifnull 09a
      // 06f: goto 076
      // 072: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: aload 3
      // 077: getfield com/finalshell/core/Hr2.F I
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: if_icmpeq 099
      // 084: new java/lang/IllegalArgumentException
      // 087: dup
      // 088: sipush 30715
      // 08b: sipush 3410
      // 08e: invokestatic com/finalshell/core/Hr2.a (II)Ljava/lang/String;
      // 091: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 094: athrow
      // 095: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: bipush 0
      // 09a: istore 5
      // 09c: bipush 0
      // 09d: istore 6
      // 09f: iload 6
      // 0a1: aload 0
      // 0a2: getfield com/finalshell/core/Hr2.d I
      // 0a5: if_icmpge 105
      // 0a8: bipush 0
      // 0a9: istore 7
      // 0ab: iload 7
      // 0ad: aload 0
      // 0ae: getfield com/finalshell/core/Hr2.F I
      // 0b1: if_icmpge 0fd
      // 0b4: aload 3
      // 0b5: getfield com/finalshell/core/Hr2.j [F
      // 0b8: iload 5
      // 0ba: fload 1
      // 0bb: aload 0
      // 0bc: getfield com/finalshell/core/Hr2.j [F
      // 0bf: iload 5
      // 0c1: faload
      // 0c2: aload 2
      // 0c3: getfield com/finalshell/core/Hr2.j [F
      // 0c6: iload 5
      // 0c8: faload
      // 0c9: invokestatic com/finalshell/core/NM.J (FFF)F
      // 0cc: fastore
      // 0cd: aload 3
      // 0ce: getfield com/finalshell/core/Hr2.K [F
      // 0d1: iload 5
      // 0d3: fload 1
      // 0d4: aload 0
      // 0d5: getfield com/finalshell/core/Hr2.K [F
      // 0d8: iload 5
      // 0da: faload
      // 0db: aload 2
      // 0dc: getfield com/finalshell/core/Hr2.K [F
      // 0df: iload 5
      // 0e1: faload
      // 0e2: invokestatic com/finalshell/core/NM.J (FFF)F
      // 0e5: fastore
      // 0e6: iinc 5 1
      // 0e9: iinc 7 1
      // 0ec: aload 4
      // 0ee: ifnull 100
      // 0f1: aload 4
      // 0f3: ifnonnull 0ab
      // 0f6: goto 0fd
      // 0f9: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: iinc 6 1
      // 100: aload 4
      // 102: ifnonnull 09f
      // 105: return
   }

   public void l(int[] param1, int param2, int param3, Hr2 param4, Hr2 param5, int[] param6) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 003: astore 7
      // 005: aload 4
      // 007: getfield com/finalshell/core/Hr2.d I
      // 00a: aload 5
      // 00c: getfield com/finalshell/core/Hr2.d I
      // 00f: aload 7
      // 011: ifnull 02f
      // 014: if_icmpne 03e
      // 017: goto 01e
      // 01a: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 4
      // 020: getfield com/finalshell/core/Hr2.F I
      // 023: aload 5
      // 025: getfield com/finalshell/core/Hr2.F I
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 7
      // 031: ifnull 055
      // 034: if_icmpeq 053
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: new java/lang/IllegalArgumentException
      // 041: dup
      // 042: sipush 30712
      // 045: sipush 19153
      // 048: invokestatic com/finalshell/core/Hr2.a (II)Ljava/lang/String;
      // 04b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 04e: athrow
      // 04f: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: iload 2
      // 054: iload 3
      // 055: invokestatic java/lang/Math.max (II)I
      // 058: istore 14
      // 05a: iload 14
      // 05c: newarray 6
      // 05e: astore 15
      // 060: iload 14
      // 062: newarray 6
      // 064: astore 16
      // 066: iload 14
      // 068: bipush 1
      // 069: iadd
      // 06a: newarray 6
      // 06c: astore 17
      // 06e: iload 14
      // 070: bipush 1
      // 071: iadd
      // 072: newarray 6
      // 074: astore 18
      // 076: aload 4
      // 078: getfield com/finalshell/core/Hr2.F I
      // 07b: istore 19
      // 07d: aload 4
      // 07f: getfield com/finalshell/core/Hr2.d I
      // 082: istore 20
      // 084: new com/finalshell/core/Hr2
      // 087: dup
      // 088: iload 3
      // 089: iload 19
      // 08b: bipush 1
      // 08c: bipush 1
      // 08d: invokespecial com/finalshell/core/Hr2.<init> (IIII)V
      // 090: astore 13
      // 092: bipush 0
      // 093: istore 10
      // 095: iload 10
      // 097: iload 19
      // 099: if_icmpge 130
      // 09c: iload 10
      // 09e: istore 21
      // 0a0: bipush 0
      // 0a1: aload 7
      // 0a3: ifnull 131
      // 0a6: istore 11
      // 0a8: iload 11
      // 0aa: iload 20
      // 0ac: if_icmpge 0e4
      // 0af: aload 15
      // 0b1: iload 11
      // 0b3: aload 4
      // 0b5: getfield com/finalshell/core/Hr2.j [F
      // 0b8: iload 21
      // 0ba: faload
      // 0bb: fastore
      // 0bc: aload 16
      // 0be: iload 11
      // 0c0: aload 4
      // 0c2: getfield com/finalshell/core/Hr2.K [F
      // 0c5: iload 21
      // 0c7: faload
      // 0c8: fastore
      // 0c9: iload 21
      // 0cb: iload 19
      // 0cd: iadd
      // 0ce: istore 21
      // 0d0: iinc 11 1
      // 0d3: aload 7
      // 0d5: ifnull 0f7
      // 0d8: aload 7
      // 0da: ifnonnull 0a8
      // 0dd: goto 0e4
      // 0e0: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: aload 16
      // 0e7: aload 15
      // 0e9: bipush 0
      // 0ea: iload 20
      // 0ec: aload 18
      // 0ee: bipush 0
      // 0ef: iload 3
      // 0f0: invokevirtual com/finalshell/core/Hr2.D ([F[FII[FII)V
      // 0f3: iload 10
      // 0f5: istore 21
      // 0f7: bipush 0
      // 0f8: istore 9
      // 0fa: iload 9
      // 0fc: iload 3
      // 0fd: if_icmpge 128
      // 100: aload 13
      // 102: getfield com/finalshell/core/Hr2.j [F
      // 105: iload 21
      // 107: aload 18
      // 109: iload 9
      // 10b: faload
      // 10c: fastore
      // 10d: iload 21
      // 10f: iload 19
      // 111: iadd
      // 112: istore 21
      // 114: iinc 9 1
      // 117: aload 7
      // 119: ifnull 12b
      // 11c: aload 7
      // 11e: ifnonnull 0fa
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 127: athrow
      // 128: iinc 10 1
      // 12b: aload 7
      // 12d: ifnonnull 095
      // 130: bipush 0
      // 131: istore 10
      // 133: iload 10
      // 135: iload 19
      // 137: if_icmpge 1ce
      // 13a: iload 10
      // 13c: istore 21
      // 13e: bipush 0
      // 13f: aload 7
      // 141: ifnull 1d1
      // 144: istore 11
      // 146: iload 11
      // 148: iload 20
      // 14a: if_icmpge 182
      // 14d: aload 15
      // 14f: iload 11
      // 151: aload 5
      // 153: getfield com/finalshell/core/Hr2.j [F
      // 156: iload 21
      // 158: faload
      // 159: fastore
      // 15a: aload 16
      // 15c: iload 11
      // 15e: aload 5
      // 160: getfield com/finalshell/core/Hr2.K [F
      // 163: iload 21
      // 165: faload
      // 166: fastore
      // 167: iload 21
      // 169: iload 19
      // 16b: iadd
      // 16c: istore 21
      // 16e: iinc 11 1
      // 171: aload 7
      // 173: ifnull 195
      // 176: aload 7
      // 178: ifnonnull 146
      // 17b: goto 182
      // 17e: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: aload 0
      // 183: aload 16
      // 185: aload 15
      // 187: bipush 0
      // 188: iload 20
      // 18a: aload 18
      // 18c: bipush 0
      // 18d: iload 3
      // 18e: invokevirtual com/finalshell/core/Hr2.D ([F[FII[FII)V
      // 191: iload 10
      // 193: istore 21
      // 195: bipush 0
      // 196: istore 9
      // 198: iload 9
      // 19a: iload 3
      // 19b: if_icmpge 1c6
      // 19e: aload 13
      // 1a0: getfield com/finalshell/core/Hr2.K [F
      // 1a3: iload 21
      // 1a5: aload 18
      // 1a7: iload 9
      // 1a9: faload
      // 1aa: fastore
      // 1ab: iload 21
      // 1ad: iload 19
      // 1af: iadd
      // 1b0: istore 21
      // 1b2: iinc 9 1
      // 1b5: aload 7
      // 1b7: ifnull 1c9
      // 1ba: aload 7
      // 1bc: ifnonnull 198
      // 1bf: goto 1c6
      // 1c2: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c5: athrow
      // 1c6: iinc 10 1
      // 1c9: aload 7
      // 1cb: ifnonnull 133
      // 1ce: iload 3
      // 1cf: iload 2
      // 1d0: imul
      // 1d1: newarray 10
      // 1d3: astore 12
      // 1d5: bipush 0
      // 1d6: istore 21
      // 1d8: bipush 0
      // 1d9: istore 9
      // 1db: iload 9
      // 1dd: iload 3
      // 1de: if_icmpge 226
      // 1e1: aload 0
      // 1e2: aload 13
      // 1e4: getfield com/finalshell/core/Hr2.j [F
      // 1e7: aload 13
      // 1e9: getfield com/finalshell/core/Hr2.K [F
      // 1ec: iload 21
      // 1ee: iload 19
      // 1f0: aload 17
      // 1f2: bipush 0
      // 1f3: iload 2
      // 1f4: invokevirtual com/finalshell/core/Hr2.D ([F[FII[FII)V
      // 1f7: aload 17
      // 1f9: iload 2
      // 1fa: iload 2
      // 1fb: i2f
      // 1fc: fastore
      // 1fd: aload 1
      // 1fe: aload 12
      // 200: iload 2
      // 201: iload 9
      // 203: iload 2
      // 204: imul
      // 205: bipush 1
      // 206: aload 17
      // 208: invokestatic com/finalshell/core/NM.K ([I[IIII[F)V
      // 20b: iload 21
      // 20d: iload 19
      // 20f: iadd
      // 210: istore 21
      // 212: iinc 9 1
      // 215: aload 7
      // 217: ifnull 237
      // 21a: aload 7
      // 21c: ifnonnull 1db
      // 21f: goto 226
      // 222: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 225: athrow
      // 226: new com/finalshell/core/Hr2
      // 229: dup
      // 22a: iload 20
      // 22c: iload 2
      // 22d: bipush 1
      // 22e: bipush 1
      // 22f: invokespecial com/finalshell/core/Hr2.<init> (IIII)V
      // 232: astore 13
      // 234: bipush 0
      // 235: istore 21
      // 237: bipush 0
      // 238: istore 22
      // 23a: bipush 0
      // 23b: istore 11
      // 23d: iload 11
      // 23f: iload 20
      // 241: if_icmpge 27f
      // 244: aload 0
      // 245: aload 4
      // 247: getfield com/finalshell/core/Hr2.j [F
      // 24a: aload 4
      // 24c: getfield com/finalshell/core/Hr2.K [F
      // 24f: iload 21
      // 251: iload 19
      // 253: aload 13
      // 255: getfield com/finalshell/core/Hr2.j [F
      // 258: iload 22
      // 25a: iload 2
      // 25b: invokevirtual com/finalshell/core/Hr2.D ([F[FII[FII)V
      // 25e: iload 21
      // 260: iload 19
      // 262: iadd
      // 263: istore 21
      // 265: iload 22
      // 267: iload 2
      // 268: iadd
      // 269: istore 22
      // 26b: iinc 11 1
      // 26e: aload 7
      // 270: ifnull 285
      // 273: aload 7
      // 275: ifnonnull 23d
      // 278: goto 27f
      // 27b: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27e: athrow
      // 27f: bipush 0
      // 280: istore 21
      // 282: bipush 0
      // 283: istore 22
      // 285: bipush 0
      // 286: istore 11
      // 288: iload 11
      // 28a: iload 20
      // 28c: if_icmpge 2ca
      // 28f: aload 0
      // 290: aload 5
      // 292: getfield com/finalshell/core/Hr2.j [F
      // 295: aload 5
      // 297: getfield com/finalshell/core/Hr2.K [F
      // 29a: iload 21
      // 29c: iload 19
      // 29e: aload 13
      // 2a0: getfield com/finalshell/core/Hr2.K [F
      // 2a3: iload 22
      // 2a5: iload 2
      // 2a6: invokevirtual com/finalshell/core/Hr2.D ([F[FII[FII)V
      // 2a9: iload 21
      // 2ab: iload 19
      // 2ad: iadd
      // 2ae: istore 21
      // 2b0: iload 22
      // 2b2: iload 2
      // 2b3: iadd
      // 2b4: istore 22
      // 2b6: iinc 11 1
      // 2b9: aload 7
      // 2bb: ifnull 34e
      // 2be: aload 7
      // 2c0: ifnonnull 288
      // 2c3: goto 2ca
      // 2c6: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: bipush 0
      // 2cb: istore 8
      // 2cd: iload 8
      // 2cf: iload 2
      // 2d0: if_icmpge 344
      // 2d3: iload 8
      // 2d5: istore 23
      // 2d7: aload 7
      // 2d9: ifnull 34e
      // 2dc: bipush 0
      // 2dd: istore 11
      // 2df: iload 11
      // 2e1: iload 20
      // 2e3: if_icmpge 31a
      // 2e6: aload 15
      // 2e8: iload 11
      // 2ea: aload 13
      // 2ec: getfield com/finalshell/core/Hr2.j [F
      // 2ef: iload 23
      // 2f1: faload
      // 2f2: fastore
      // 2f3: aload 16
      // 2f5: iload 11
      // 2f7: aload 13
      // 2f9: getfield com/finalshell/core/Hr2.K [F
      // 2fc: iload 23
      // 2fe: faload
      // 2ff: fastore
      // 300: iload 23
      // 302: iload 2
      // 303: iadd
      // 304: istore 23
      // 306: iinc 11 1
      // 309: aload 7
      // 30b: ifnull 33f
      // 30e: aload 7
      // 310: ifnonnull 2df
      // 313: goto 31a
      // 316: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 319: athrow
      // 31a: aload 0
      // 31b: aload 15
      // 31d: aload 16
      // 31f: bipush 0
      // 320: iload 20
      // 322: aload 17
      // 324: bipush 0
      // 325: iload 3
      // 326: invokevirtual com/finalshell/core/Hr2.D ([F[FII[FII)V
      // 329: aload 17
      // 32b: iload 3
      // 32c: iload 3
      // 32d: i2f
      // 32e: fastore
      // 32f: aload 12
      // 331: aload 6
      // 333: iload 3
      // 334: iload 8
      // 336: iload 2
      // 337: aload 17
      // 339: invokestatic com/finalshell/core/NM.K ([I[IIII[F)V
      // 33c: iinc 8 1
      // 33f: aload 7
      // 341: ifnonnull 2cd
      // 344: goto 34e
      // 347: astore 8
      // 349: aload 8
      // 34b: invokevirtual java/lang/Exception.printStackTrace ()V
      // 34e: return
   }

   public void D(float[] param1, float[] param2, int param3, int param4, float[] param5, int param6, int param7) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: istore 9
      // 003: iload 3
      // 004: iload 4
      // 006: iadd
      // 007: bipush 1
      // 008: isub
      // 009: istore 10
      // 00b: invokestatic com/finalshell/core/W5.q ()[Ljava/lang/String;
      // 00e: aload 1
      // 00f: iload 9
      // 011: faload
      // 012: fstore 11
      // 014: aload 2
      // 015: iload 9
      // 017: faload
      // 018: dup
      // 019: fstore 15
      // 01b: dup
      // 01c: fstore 14
      // 01e: fstore 13
      // 020: aload 1
      // 021: iload 9
      // 023: bipush 1
      // 024: iadd
      // 025: faload
      // 026: fstore 12
      // 028: aload 2
      // 029: iload 9
      // 02b: bipush 1
      // 02c: iadd
      // 02d: faload
      // 02e: fstore 16
      // 030: bipush 0
      // 031: istore 21
      // 033: astore 8
      // 035: iload 21
      // 037: iload 7
      // 039: if_icmpge 128
      // 03c: iload 9
      // 03e: aload 8
      // 040: ifnull 0b5
      // 043: iload 10
      // 045: if_icmpgt 0b3
      // 048: goto 04f
      // 04b: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: iload 21
      // 051: i2f
      // 052: aload 1
      // 053: iload 9
      // 055: faload
      // 056: fcmpl
      // 057: aload 8
      // 059: ifnull 0b5
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 062: athrow
      // 063: ifle 0b3
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: fload 14
      // 06f: fstore 13
      // 071: fload 15
      // 073: fstore 14
      // 075: fload 16
      // 077: fstore 15
      // 079: aload 1
      // 07a: iload 9
      // 07c: faload
      // 07d: fstore 11
      // 07f: iinc 9 1
      // 082: iload 9
      // 084: iload 10
      // 086: aload 8
      // 088: ifnull 09f
      // 08b: if_icmpgt 09b
      // 08e: goto 095
      // 091: invokestatic com/finalshell/core/Hr2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 094: athrow
      // 095: aload 1
      // 096: iload 9
      // 098: faload
      // 099: fstore 12
      // 09b: iload 9
      // 09d: iload 10
      // 09f: if_icmpge 0af
      // 0a2: aload 2
      // 0a3: iload 9
      // 0a5: bipush 1
      // 0a6: iadd
      // 0a7: faload
      // 0a8: fstore 16
      // 0aa: aload 8
      // 0ac: ifnonnull 0b3
      // 0af: fload 15
      // 0b1: fstore 16
      // 0b3: iload 21
      // 0b5: i2f
      // 0b6: fload 11
      // 0b8: fsub
      // 0b9: fload 12
      // 0bb: fload 11
      // 0bd: fsub
      // 0be: fdiv
      // 0bf: fstore 22
      // 0c1: ldc -0.5
      // 0c3: fload 13
      // 0c5: fmul
      // 0c6: ldc 1.5
      // 0c8: fload 14
      // 0ca: fmul
      // 0cb: fadd
      // 0cc: ldc -1.5
      // 0ce: fload 15
      // 0d0: fmul
      // 0d1: fadd
      // 0d2: ldc 0.5
      // 0d4: fload 16
      // 0d6: fmul
      // 0d7: fadd
      // 0d8: fstore 20
      // 0da: fconst_1
      // 0db: fload 13
      // 0dd: fmul
      // 0de: ldc -2.5
      // 0e0: fload 14
      // 0e2: fmul
      // 0e3: fadd
      // 0e4: fconst_2
      // 0e5: fload 15
      // 0e7: fmul
      // 0e8: fadd
      // 0e9: ldc -0.5
      // 0eb: fload 16
      // 0ed: fmul
      // 0ee: fadd
      // 0ef: fstore 19
      // 0f1: ldc -0.5
      // 0f3: fload 13
      // 0f5: fmul
      // 0f6: ldc 0.5
      // 0f8: fload 15
      // 0fa: fmul
      // 0fb: fadd
      // 0fc: fstore 18
      // 0fe: fconst_1
      // 0ff: fload 14
      // 101: fmul
      // 102: fstore 17
      // 104: aload 5
      // 106: iload 6
      // 108: iload 21
      // 10a: iadd
      // 10b: fload 20
      // 10d: fload 22
      // 10f: fmul
      // 110: fload 19
      // 112: fadd
      // 113: fload 22
      // 115: fmul
      // 116: fload 18
      // 118: fadd
      // 119: fload 22
      // 11b: fmul
      // 11c: fload 17
      // 11e: fadd
      // 11f: fastore
      // 120: iinc 21 1
      // 123: aload 8
      // 125: ifnonnull 035
      // 128: return
   }

   public void G(float[] var1, float[] var2, int var3, float[] var4, int var5, int var6) {
      float var14;
      int var8 = var3;
      String[] var10000 = W5.q();
      float var9 = var1[var3];
      String[] var7 = var10000;
      float var11 = var2[var3];
      float var10 = var1[var3 + 1];
      float var12 = var2[var3 + 1];
      int var13 = 0;

      while (var13 < var6) {
         label26: {
            label25: {
               try {
                  float var17;
                  var16 = (var17 = (float)var13 - var1[var8]) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
                  if (var7 == null) {
                     break label26;
                  }

                  if (var16 <= 0) {
                     break label25;
                  }
               } catch (IllegalArgumentException var15) {
      int var16;
                  throw a(var15);
               }

               var9 = var1[var8];
               var11 = var2[var8];
               var10 = var1[++var8];
               var12 = var2[var8];
            }

            var16 = var13;
         }

         var14 = ((float)var16 - var9) / (var10 - var9);
         var4[var5 + var13] = var11 + var14 * (var12 - var11);
         var13++;
         if (var7 == null) {
            break;
         }
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 30714) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 144;
               break;
            case 1:
               var10000 = 8;
               break;
            case 2:
               var10000 = 147;
               break;
            case 3:
               var10000 = 237;
               break;
            case 4:
               var10000 = 29;
               break;
            case 5:
               var10000 = 141;
               break;
            case 6:
               var10000 = 77;
               break;
            case 7:
               var10000 = 57;
               break;
            case 8:
               var10000 = 233;
               break;
            case 9:
               var10000 = 62;
               break;
            case 10:
               var10000 = 44;
               break;
            case 11:
               var10000 = 101;
               break;
            case 12:
               var10000 = 139;
               break;
            case 13:
               var10000 = 247;
               break;
            case 14:
               var10000 = 198;
               break;
            case 15:
               var10000 = 136;
               break;
            case 16:
               var10000 = 145;
               break;
            case 17:
               var10000 = 185;
               break;
            case 18:
               var10000 = 73;
               break;
            case 19:
               var10000 = 28;
               break;
            case 20:
               var10000 = 103;
               break;
            case 21:
               var10000 = 204;
               break;
            case 22:
               var10000 = 154;
               break;
            case 23:
               var10000 = 67;
               break;
            case 24:
               var10000 = 115;
               break;
            case 25:
               var10000 = 34;
               break;
            case 26:
               var10000 = 68;
               break;
            case 27:
               var10000 = 2;
               break;
            case 28:
               var10000 = 93;
               break;
            case 29:
               var10000 = 200;
               break;
            case 30:
               var10000 = 108;
               break;
            case 31:
               var10000 = 249;
               break;
            case 32:
               var10000 = 135;
               break;
            case 33:
               var10000 = 222;
               break;
            case 34:
               var10000 = 146;
               break;
            case 35:
               var10000 = 31;
               break;
            case 36:
               var10000 = 114;
               break;
            case 37:
               var10000 = 184;
               break;
            case 38:
               var10000 = 7;
               break;
            case 39:
               var10000 = 109;
               break;
            case 40:
               var10000 = 100;
               break;
            case 41:
               var10000 = 148;
               break;
            case 42:
               var10000 = 163;
               break;
            case 43:
               var10000 = 164;
               break;
            case 44:
               var10000 = 95;
               break;
            case 45:
               var10000 = 209;
               break;
            case 46:
               var10000 = 5;
               break;
            case 47:
               var10000 = 235;
               break;
            case 48:
               var10000 = 129;
               break;
            case 49:
               var10000 = 215;
               break;
            case 50:
               var10000 = 166;
               break;
            case 51:
               var10000 = 112;
               break;
            case 52:
               var10000 = 190;
               break;
            case 53:
               var10000 = 52;
               break;
            case 54:
               var10000 = 0;
               break;
            case 55:
               var10000 = 38;
               break;
            case 56:
               var10000 = 78;
               break;
            case 57:
               var10000 = 138;
               break;
            case 58:
               var10000 = 241;
               break;
            case 59:
               var10000 = 150;
               break;
            case 60:
               var10000 = 113;
               break;
            case 61:
               var10000 = 81;
               break;
            case 62:
               var10000 = 234;
               break;
            case 63:
               var10000 = 19;
               break;
            case 64:
               var10000 = 238;
               break;
            case 65:
               var10000 = 111;
               break;
            case 66:
               var10000 = 216;
               break;
            case 67:
               var10000 = 82;
               break;
            case 68:
               var10000 = 13;
               break;
            case 69:
               var10000 = 173;
               break;
            case 70:
               var10000 = 96;
               break;
            case 71:
               var10000 = 194;
               break;
            case 72:
               var10000 = 14;
               break;
            case 73:
               var10000 = 42;
               break;
            case 74:
               var10000 = 214;
               break;
            case 75:
               var10000 = 140;
               break;
            case 76:
               var10000 = 179;
               break;
            case 77:
               var10000 = 119;
               break;
            case 78:
               var10000 = 120;
               break;
            case 79:
               var10000 = 86;
               break;
            case 80:
               var10000 = 253;
               break;
            case 81:
               var10000 = 70;
               break;
            case 82:
               var10000 = 105;
               break;
            case 83:
               var10000 = 165;
               break;
            case 84:
               var10000 = 25;
               break;
            case 85:
               var10000 = 207;
               break;
            case 86:
               var10000 = 226;
               break;
            case 87:
               var10000 = 74;
               break;
            case 88:
               var10000 = 53;
               break;
            case 89:
               var10000 = 49;
               break;
            case 90:
               var10000 = 169;
               break;
            case 91:
               var10000 = 66;
               break;
            case 92:
               var10000 = 35;
               break;
            case 93:
               var10000 = 149;
               break;
            case 94:
               var10000 = 186;
               break;
            case 95:
               var10000 = 171;
               break;
            case 96:
               var10000 = 3;
               break;
            case 97:
               var10000 = 191;
               break;
            case 98:
               var10000 = 43;
               break;
            case 99:
               var10000 = 99;
               break;
            case 100:
               var10000 = 56;
               break;
            case 101:
               var10000 = 72;
               break;
            case 102:
               var10000 = 143;
               break;
            case 103:
               var10000 = 161;
               break;
            case 104:
               var10000 = 98;
               break;
            case 105:
               var10000 = 245;
               break;
            case 106:
               var10000 = 51;
               break;
            case 107:
               var10000 = 242;
               break;
            case 108:
               var10000 = 252;
               break;
            case 109:
               var10000 = 243;
               break;
            case 110:
               var10000 = 26;
               break;
            case 111:
               var10000 = 122;
               break;
            case 112:
               var10000 = 89;
               break;
            case 113:
               var10000 = 239;
               break;
            case 114:
               var10000 = 223;
               break;
            case 115:
               var10000 = 181;
               break;
            case 116:
               var10000 = 251;
               break;
            case 117:
               var10000 = 76;
               break;
            case 118:
               var10000 = 128;
               break;
            case 119:
               var10000 = 157;
               break;
            case 120:
               var10000 = 228;
               break;
            case 121:
               var10000 = 199;
               break;
            case 122:
               var10000 = 39;
               break;
            case 123:
               var10000 = 30;
               break;
            case 124:
               var10000 = 236;
               break;
            case 125:
               var10000 = 195;
               break;
            case 126:
               var10000 = 69;
               break;
            case 127:
               var10000 = 188;
               break;
            case 128:
               var10000 = 102;
               break;
            case 129:
               var10000 = 91;
               break;
            case 130:
               var10000 = 172;
               break;
            case 131:
               var10000 = 240;
               break;
            case 132:
               var10000 = 224;
               break;
            case 133:
               var10000 = 210;
               break;
            case 134:
               var10000 = 110;
               break;
            case 135:
               var10000 = 217;
               break;
            case 136:
               var10000 = 117;
               break;
            case 137:
               var10000 = 41;
               break;
            case 138:
               var10000 = 106;
               break;
            case 139:
               var10000 = 133;
               break;
            case 140:
               var10000 = 211;
               break;
            case 141:
               var10000 = 174;
               break;
            case 142:
               var10000 = 250;
               break;
            case 143:
               var10000 = 65;
               break;
            case 144:
               var10000 = 248;
               break;
            case 145:
               var10000 = 64;
               break;
            case 146:
               var10000 = 232;
               break;
            case 147:
               var10000 = 178;
               break;
            case 148:
               var10000 = 208;
               break;
            case 149:
               var10000 = 196;
               break;
            case 150:
               var10000 = 79;
               break;
            case 151:
               var10000 = 153;
               break;
            case 152:
               var10000 = 61;
               break;
            case 153:
               var10000 = 205;
               break;
            case 154:
               var10000 = 231;
               break;
            case 155:
               var10000 = 227;
               break;
            case 156:
               var10000 = 87;
               break;
            case 157:
               var10000 = 180;
               break;
            case 158:
               var10000 = 54;
               break;
            case 159:
               var10000 = 182;
               break;
            case 160:
               var10000 = 246;
               break;
            case 161:
               var10000 = 193;
               break;
            case 162:
               var10000 = 167;
               break;
            case 163:
               var10000 = 4;
               break;
            case 164:
               var10000 = 254;
               break;
            case 165:
               var10000 = 94;
               break;
            case 166:
               var10000 = 63;
               break;
            case 167:
               var10000 = 75;
               break;
            case 168:
               var10000 = 6;
               break;
            case 169:
               var10000 = 10;
               break;
            case 170:
               var10000 = 32;
               break;
            case 171:
               var10000 = 24;
               break;
            case 172:
               var10000 = 177;
               break;
            case 173:
               var10000 = 131;
               break;
            case 174:
               var10000 = 221;
               break;
            case 175:
               var10000 = 220;
               break;
            case 176:
               var10000 = 45;
               break;
            case 177:
               var10000 = 85;
               break;
            case 178:
               var10000 = 88;
               break;
            case 179:
               var10000 = 155;
               break;
            case 180:
               var10000 = 118;
               break;
            case 181:
               var10000 = 197;
               break;
            case 182:
               var10000 = 189;
               break;
            case 183:
               var10000 = 37;
               break;
            case 184:
               var10000 = 104;
               break;
            case 185:
               var10000 = 201;
               break;
            case 186:
               var10000 = 21;
               break;
            case 187:
               var10000 = 23;
               break;
            case 188:
               var10000 = 176;
               break;
            case 189:
               var10000 = 151;
               break;
            case 190:
               var10000 = 244;
               break;
            case 191:
               var10000 = 212;
               break;
            case 192:
               var10000 = 127;
               break;
            case 193:
               var10000 = 206;
               break;
            case 194:
               var10000 = 219;
               break;
            case 195:
               var10000 = 107;
               break;
            case 196:
               var10000 = 15;
               break;
            case 197:
               var10000 = 97;
               break;
            case 198:
               var10000 = 142;
               break;
            case 199:
               var10000 = 130;
               break;
            case 200:
               var10000 = 162;
               break;
            case 201:
               var10000 = 33;
               break;
            case 202:
               var10000 = 116;
               break;
            case 203:
               var10000 = 84;
               break;
            case 204:
               var10000 = 83;
               break;
            case 205:
               var10000 = 203;
               break;
            case 206:
               var10000 = 121;
               break;
            case 207:
               var10000 = 27;
               break;
            case 208:
               var10000 = 90;
               break;
            case 209:
               var10000 = 137;
               break;
            case 210:
               var10000 = 213;
               break;
            case 211:
               var10000 = 218;
               break;
            case 212:
               var10000 = 158;
               break;
            case 213:
               var10000 = 225;
               break;
            case 214:
               var10000 = 47;
               break;
            case 215:
               var10000 = 50;
               break;
            case 216:
               var10000 = 20;
               break;
            case 217:
               var10000 = 125;
               break;
            case 218:
               var10000 = 48;
               break;
            case 219:
               var10000 = 22;
               break;
            case 220:
               var10000 = 80;
               break;
            case 221:
               var10000 = 12;
               break;
            case 222:
               var10000 = 255;
               break;
            case 223:
               var10000 = 46;
               break;
            case 224:
               var10000 = 36;
               break;
            case 225:
               var10000 = 55;
               break;
            case 226:
               var10000 = 16;
               break;
            case 227:
               var10000 = 168;
               break;
            case 228:
               var10000 = 183;
               break;
            case 229:
               var10000 = 59;
               break;
            case 230:
               var10000 = 11;
               break;
            case 231:
               var10000 = 132;
               break;
            case 232:
               var10000 = 134;
               break;
            case 233:
               var10000 = 230;
               break;
            case 234:
               var10000 = 126;
               break;
            case 235:
               var10000 = 152;
               break;
            case 236:
               var10000 = 71;
               break;
            case 237:
               var10000 = 60;
               break;
            case 238:
               var10000 = 156;
               break;
            case 239:
               var10000 = 124;
               break;
            case 240:
               var10000 = 123;
               break;
            case 241:
               var10000 = 58;
               break;
            case 242:
               var10000 = 17;
               break;
            case 243:
               var10000 = 192;
               break;
            case 244:
               var10000 = 160;
               break;
            case 245:
               var10000 = 18;
               break;
            case 246:
               var10000 = 92;
               break;
            case 247:
               var10000 = 202;
               break;
            case 248:
               var10000 = 187;
               break;
            case 249:
               var10000 = 175;
               break;
            case 250:
               var10000 = 1;
               break;
            case 251:
               var10000 = 229;
               break;
            case 252:
               var10000 = 170;
               break;
            case 253:
               var10000 = 9;
               break;
            case 254:
               var10000 = 40;
               break;
            default:
               var10000 = 159;
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
            int var8 = var7 % 2;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var16;
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u0002'\u0094kn^\u009f\u009dÞ&'\fÏgºÿ\u007f¥|úg\u008b)\u000f\f\u008d÷aMÅ7\bzÇ`»èB/k®V+\"å\u00903îU\u008füÜ\ng\u0084ÌÝ¡T,¬e_X%DÂ_J©(f/þ¸T¥[\u0018±<À\u008e\u0015\u008d\u001a0\u009b\u0000§\u008f\bÂS\u000eGT\u0014B©®vÆæ\u0082O\u001e\u0001\u0017å\u009a\u0095õ\u0080ô&\u0085.ç\u009d;\u0083\u00175\u0091\u0001Ú\u0018\u009b~\u009d>«¢Y";
      int var4 = "\u0002'\u0094kn^\u009f\u009dÞ&'\fÏgºÿ\u007f¥|úg\u008b)\u000f\f\u008d÷aMÅ7\bzÇ`»èB/k®V+\"å\u00903îU\u008füÜ\ng\u0084ÌÝ¡T,¬e_X%DÂ_J©(f/þ¸T¥[\u0018±<À\u008e\u0015\u008d\u001a0\u009b\u0000§\u008f\bÂS\u000eGT\u0014B©®vÆæ\u0082O\u001e\u0001\u0017å\u009a\u0095õ\u0080ô&\u0085.ç\u009d;\u0083\u00175\u0091\u0001Ú\u0018\u009b~\u009d>«¢Y"
         .length();
      char var1 = '*';
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 76;
            var10002 = var10003;
            int var8 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 76;
               var10006 = var6;
            } else {
               var13 = 76;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 76;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 50;
                     break;
                  case 1:
                     var29 = 44;
                     break;
                  case 2:
                     var29 = 63;
                     break;
                  case 3:
                     var29 = 63;
                     break;
                  case 4:
                     var29 = 102;
                     break;
                  case 5:
                     var29 = 72;
                     break;
                  default:
                     var29 = 116;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var5[var3++] = var15;
         if ((var0 += var1) >= var4) {
            a = var5;
            b = new String[3];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}





