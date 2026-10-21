package com.finalshell.core;

import com.finalshell.ui.model.EP;
import com.finalshell.ui.panel.Ky4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Nc2 implements Comparable {
   public final Ph2 j;
   protected final boolean O;
   protected int V;
   public final String C;
   public String c;
   public String l;
   protected DL3 D;
   public String t;
   protected boolean s;
   protected boolean q;
   protected boolean y;
   protected boolean Q;
   protected boolean W;
   protected boolean B;
   public HR b;
   public static String[] a;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;
   public static long[] g;
   public static Long[] h;

   public Nc2(java.lang.Class var1, Ph2 var2) {
      String var3;
      super();
      this.s = false;
      this.q = false;
      String var10000 = Nv4.o();
      this.y = false;
      this.Q = false;
      this.W = false;
      this.j = var2;
      var3 = var10000;
      this.D = new DL3(var1, var2);
      label182:
      if (var3 != null) {
         if (var1 != null) {
            O4 var4 = (O4)B8_2.X(var1, O4.class);
            if (var3 == null) {
               break label182;
            }

            if (var4 != null) {
               for (EP var8 : var4.u()) {
                  if (var3 == null) {
                     break label182;
                  }

                  label186: {
                     EP var17 = var8;
                     EP var10001 = EP.WriteEnumUsingToString;
                     if (var3 != null) {
                        if (var8 == EP.WriteEnumUsingToString) {
                           this.s = true;
                           if (var3 != null) {
                              break label186;
                           }
                        }

                        var17 = var8;
                        var10001 = EP.WriteEnumUsingName;
                     }

                     if (var3 != null) {
                        if (var17 == var10001) {
                           this.q = true;
                           if (var3 != null) {
                              break label186;
                           }
                        }

                        var17 = var8;
                        var10001 = EP.DisableCircularReferenceDetect;
                     }

                     if (var3 != null) {
                        if (var17 == var10001) {
                           this.y = true;
                           if (var3 != null) {
                              break label186;
                           }
                        }

                        var17 = var8;
                        var10001 = EP.BrowserCompatible;
                     }

                     if (var3 != null) {
                        if (var17 == var10001) {
                           this.V = this.V | EP.BrowserCompatible.mask;
                           this.B = true;
                           if (var3 != null) {
                              break label186;
                           }
                        }

                        var17 = var8;
                        var10001 = EP.WriteMapNullValue;
                     }

                     if (var17 == var10001) {
                        this.V = this.V | EP.WriteMapNullValue.mask;
                     }
                  }

                  if (var3 == null) {
                     break;
                  }
               }
            }
         }

         var2.L();
         this.C = a(18308, 3236670209737139664L) + var2.I + a(27561, 29103);
      }

      boolean var10 = false;
      E6 var11 = var2.Z();
      label140:
      if (var3 != null) {
         if (var11 != null) {
            EP[] var12 = var11.N();
            int var13 = var12.length;
            int var14 = 0;

            label135: {
               while (var14 < var13) {
                  EP var9 = var12[var14];
                  if (var3 != null) {
                     var18 = var9.a() & EP.WRITE_MAP_NULL_FEATURES;
                     if (var3 == null) {
                        break label135;
                     }

                     if (var18 != 0) {
                        var10 = true;
                        if (var3 != null) {
                           break;
                        }
                     }

                     var14++;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               this.t = var11.q();
               var18 = this.t.trim().length();
            }

            if (var3 != null) {
               if (var18 == 0) {
                  this.t = null;
               }

               var12 = var11.N();
               var13 = var12.length;
               var18 = 0;
            }

            var14 = var18;

            while (var14 < var13) {
               EP var16 = var12[var14];
               if (var3 == null) {
                  break label140;
               }

               label191: {
                  EP var19 = var16;
                  EP var20 = EP.WriteEnumUsingToString;
                  if (var3 != null) {
                     if (var16 == EP.WriteEnumUsingToString) {
                        this.s = true;
                        if (var3 != null) {
                           break label191;
                        }
                     }

                     var19 = var16;
                     var20 = EP.WriteEnumUsingName;
                  }

                  if (var3 != null) {
                     if (var19 == var20) {
                        this.q = true;
                        if (var3 != null) {
                           break label191;
                        }
                     }

                     var19 = var16;
                     var20 = EP.DisableCircularReferenceDetect;
                  }

                  if (var3 != null) {
                     if (var19 == var20) {
                        this.y = true;
                        if (var3 != null) {
                           break label191;
                        }
                     }

                     var19 = var16;
                     var20 = EP.BrowserCompatible;
                  }

                  if (var19 == var20) {
                     this.B = true;
                  }
               }

               var14++;
               if (var3 == null) {
                  break;
               }
            }

            this.V = this.V | EP.Q(var11.N());
         }

         this.O = var10;
      }

      boolean var21;
      var21 = B8_2.z(var2.Y);
      label90:
      if (var3 != null) {
         if (!var21) {
            var21 = B8_2.G(var2.Y);
            if (var3 == null) {
               break label90;
            }

            if (!var21) {
               var21 = false;
               break label90;
            }
         }

         var21 = true;
      }

      this.W = var21;
      if (Ky4.F$arrString() != null) {
         Nv4.J("uHlCQb");
      }
   }

   public void E(NL3 param1) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 1
      // 04: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: getfield com/finalshell/io/YM3.e Z
      // 0d: aload 2
      // 0e: ifnull 33
      // 11: ifeq a9
      // 14: goto 1b
      // 17: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: aload 3
      // 1c: getfield com/finalshell/io/YM3.q I
      // 1f: aload 0
      // 20: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 23: getfield com/finalshell/core/Ph2.c I
      // 26: getstatic com/finalshell/ui/model/EP.UseSingleQuotes Lcom/finalshell/ui/model/EP;
      // 29: invokestatic com/finalshell/ui/model/EP.a (IILcom/finalshell/ui/model/EP;)Z
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: istore 4
      // 35: iload 4
      // 37: ifeq 96
      // 3a: aload 0
      // 3b: aload 2
      // 3c: ifnull 5b
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: getfield com/finalshell/core/Nc2.c Ljava/lang/String;
      // 49: ifnonnull 8a
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: aload 0
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: new java/lang/StringBuilder
      // 5e: dup
      // 5f: invokespecial java/lang/StringBuilder.<init> ()V
      // 62: sipush 18291
      // 65: ldc2_w 509579454648689958
      // 68: invokestatic com/finalshell/core/Nc2.a (IJ)I
      // 6b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 6e: aload 0
      // 6f: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 72: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 75: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 78: sipush 27560
      // 7b: sipush 6081
      // 7e: invokestatic com/finalshell/core/Nc2.a (II)Ljava/lang/String;
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 87: putfield com/finalshell/core/Nc2.c Ljava/lang/String;
      // 8a: aload 3
      // 8b: aload 0
      // 8c: getfield com/finalshell/core/Nc2.c Ljava/lang/String;
      // 8f: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 92: aload 2
      // 93: ifnonnull a5
      // 96: aload 3
      // 97: aload 0
      // 98: getfield com/finalshell/core/Nc2.C Ljava/lang/String;
      // 9b: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // 9e: goto a5
      // a1: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: aload 2
      // a6: ifnonnull ee
      // a9: aload 0
      // aa: aload 2
      // ab: ifnull ca
      // ae: goto b5
      // b1: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b4: athrow
      // b5: getfield com/finalshell/core/Nc2.l Ljava/lang/String;
      // b8: ifnonnull e6
      // bb: goto c2
      // be: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c1: athrow
      // c2: aload 0
      // c3: goto ca
      // c6: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9: athrow
      // ca: new java/lang/StringBuilder
      // cd: dup
      // ce: invokespecial java/lang/StringBuilder.<init> ()V
      // d1: aload 0
      // d2: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // d5: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // db: ldc ":"
      // dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e3: putfield com/finalshell/core/Nc2.l Ljava/lang/String;
      // e6: aload 3
      // e7: aload 0
      // e8: getfield com/finalshell/core/Nc2.l Ljava/lang/String;
      // eb: invokevirtual com/finalshell/io/YM3.write (Ljava/lang/String;)V
      // ee: return
   }

   public Object t(Object param1) throws InvocationTargetException, IllegalAccessException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 07: aload 1
      // 08: invokevirtual com/finalshell/core/Ph2.e (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 3
      // 0c: astore 2
      // 0d: aload 0
      // 0e: aload 2
      // 0f: ifnull 3f
      // 12: getfield com/finalshell/core/Nc2.W Z
      // 15: ifeq 3e
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 3
      // 20: aload 2
      // 21: ifnull 3f
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: invokestatic com/finalshell/core/B8_2.O (Ljava/lang/Object;)Z
      // 2e: ifne 3e
      // 31: goto 38
      // 34: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aconst_null
      // 39: areturn
      // 3a: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 3
      // 3f: areturn
   }

   public Object d(Object param1) throws InvocationTargetException, IllegalAccessException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 03: aload 0
      // 04: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 07: aload 1
      // 08: invokevirtual com/finalshell/core/Ph2.e (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 3
      // 0c: astore 2
      // 0d: aload 0
      // 0e: getfield com/finalshell/core/Nc2.t Ljava/lang/String;
      // 11: aload 2
      // 12: ifnull 91
      // 15: ifnull 90
      // 18: goto 1f
      // 1b: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 3
      // 20: aload 2
      // 21: ifnull 91
      // 24: goto 2b
      // 27: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: ifnull 90
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 0
      // 36: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 39: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 3c: ldc java/util/Date
      // 3e: aload 2
      // 3f: ifnull 6e
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48: athrow
      // 49: if_acmpeq 71
      // 4c: goto 53
      // 4f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: aload 0
      // 54: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 57: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 5a: aload 2
      // 5b: ifnull 91
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: ldc java/sql/Date
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: if_acmpne 90
      // 71: new java/text/SimpleDateFormat
      // 74: dup
      // 75: aload 0
      // 76: getfield com/finalshell/core/Nc2.t Ljava/lang/String;
      // 79: getstatic com/finalshell/core/Ok2.Y Ljava/util/Locale;
      // 7c: invokespecial java/text/SimpleDateFormat.<init> (Ljava/lang/String;Ljava/util/Locale;)V
      // 7f: astore 4
      // 81: aload 4
      // 83: getstatic com/finalshell/core/Ok2.X Ljava/util/TimeZone;
      // 86: invokevirtual java/text/SimpleDateFormat.setTimeZone (Ljava/util/TimeZone;)V
      // 89: aload 4
      // 8b: aload 3
      // 8c: invokevirtual java/text/SimpleDateFormat.format (Ljava/lang/Object;)Ljava/lang/String;
      // 8f: areturn
      // 90: aload 3
      // 91: areturn
   }

   public int G(Nc2 var1) {
      return this.j.M(var1.j);
   }

   public void L(NL3 param1, Object param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Nv4.o ()Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: getfield com/finalshell/core/Nc2.b Lcom/finalshell/core/HR;
      // 008: aload 3
      // 009: ifnull 22e
      // 00c: ifnonnull 22a
      // 00f: goto 016
      // 012: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 2
      // 017: aload 3
      // 018: ifnull 12b
      // 01b: goto 022
      // 01e: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: ifnonnull 123
      // 025: goto 02c
      // 028: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 030: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 033: astore 4
      // 035: aload 4
      // 037: getstatic java/lang/Byte.TYPE Ljava/lang/Class;
      // 03a: aload 3
      // 03b: ifnull 05d
      // 03e: if_acmpne 051
      // 041: goto 048
      // 044: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: ldc_w java/lang/Byte
      // 04b: astore 4
      // 04d: aload 3
      // 04e: ifnonnull 130
      // 051: aload 4
      // 053: getstatic java/lang/Short.TYPE Ljava/lang/Class;
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 3
      // 05e: ifnull 080
      // 061: if_acmpne 074
      // 064: goto 06b
      // 067: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: ldc_w java/lang/Short
      // 06e: astore 4
      // 070: aload 3
      // 071: ifnonnull 130
      // 074: aload 4
      // 076: getstatic java/lang/Integer.TYPE Ljava/lang/Class;
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 3
      // 081: ifnull 0a3
      // 084: if_acmpne 097
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: ldc_w java/lang/Integer
      // 091: astore 4
      // 093: aload 3
      // 094: ifnonnull 130
      // 097: aload 4
      // 099: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 09c: goto 0a3
      // 09f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a2: athrow
      // 0a3: aload 3
      // 0a4: ifnull 0c6
      // 0a7: if_acmpne 0ba
      // 0aa: goto 0b1
      // 0ad: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: ldc_w java/lang/Long
      // 0b4: astore 4
      // 0b6: aload 3
      // 0b7: ifnonnull 130
      // 0ba: aload 4
      // 0bc: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 3
      // 0c7: ifnull 0e9
      // 0ca: if_acmpne 0dd
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: ldc_w java/lang/Float
      // 0d7: astore 4
      // 0d9: aload 3
      // 0da: ifnonnull 130
      // 0dd: aload 4
      // 0df: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: aload 3
      // 0ea: ifnull 117
      // 0ed: if_acmpne 100
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: ldc_w java/lang/Double
      // 0fa: astore 4
      // 0fc: aload 3
      // 0fd: ifnonnull 130
      // 100: aload 4
      // 102: aload 3
      // 103: ifnull 11d
      // 106: goto 10d
      // 109: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10c: athrow
      // 10d: getstatic java/lang/Boolean.TYPE Ljava/lang/Class;
      // 110: goto 117
      // 113: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: if_acmpne 130
      // 11a: ldc_w java/lang/Boolean
      // 11d: astore 4
      // 11f: aload 3
      // 120: ifnonnull 130
      // 123: aload 2
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 12e: astore 4
      // 130: aconst_null
      // 131: astore 5
      // 133: aload 0
      // 134: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 137: invokevirtual com/finalshell/core/Ph2.Z ()Lcom/finalshell/core/E6;
      // 13a: astore 6
      // 13c: aload 6
      // 13e: aload 3
      // 13f: ifnull 14e
      // 142: ifnull 182
      // 145: goto 14c
      // 148: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: aload 6
      // 14e: invokeinterface com/finalshell/core/E6.u$Class ()Ljava/lang/Class; 1
      // 153: aload 3
      // 154: ifnull 175
      // 157: ldc_w java/lang/Void
      // 15a: if_acmpeq 182
      // 15d: goto 164
      // 160: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: aload 6
      // 166: invokeinterface com/finalshell/core/E6.u$Class ()Ljava/lang/Class; 1
      // 16b: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 16e: goto 175
      // 171: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: checkcast com/finalshell/core/Ak2
      // 178: astore 5
      // 17a: aload 0
      // 17b: bipush 1
      // 17c: putfield com/finalshell/core/Nc2.Q Z
      // 17f: goto 21b
      // 182: aload 0
      // 183: getfield com/finalshell/core/Nc2.t Ljava/lang/String;
      // 186: ifnull 1fc
      // 189: aload 4
      // 18b: getstatic java/lang/Double.TYPE Ljava/lang/Class;
      // 18e: aload 3
      // 18f: ifnull 1af
      // 192: goto 199
      // 195: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 198: athrow
      // 199: if_acmpeq 1bd
      // 19c: goto 1a3
      // 19f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: aload 4
      // 1a5: ldc_w java/lang/Double
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ae: athrow
      // 1af: aload 3
      // 1b0: ifnull 1d2
      // 1b3: if_acmpne 1cd
      // 1b6: goto 1bd
      // 1b9: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: new com/finalshell/core/ZO
      // 1c0: dup
      // 1c1: aload 0
      // 1c2: getfield com/finalshell/core/Nc2.t Ljava/lang/String;
      // 1c5: invokespecial com/finalshell/core/ZO.<init> (Ljava/lang/String;)V
      // 1c8: astore 5
      // 1ca: goto 1fc
      // 1cd: aload 4
      // 1cf: getstatic java/lang/Float.TYPE Ljava/lang/Class;
      // 1d2: aload 3
      // 1d3: ifnull 1ec
      // 1d6: if_acmpeq 1ef
      // 1d9: goto 1e0
      // 1dc: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: aload 4
      // 1e2: ldc_w java/lang/Float
      // 1e5: goto 1ec
      // 1e8: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: if_acmpne 1fc
      // 1ef: new com/finalshell/core/Ns4
      // 1f2: dup
      // 1f3: aload 0
      // 1f4: getfield com/finalshell/core/Nc2.t Ljava/lang/String;
      // 1f7: invokespecial com/finalshell/core/Ns4.<init> (Ljava/lang/String;)V
      // 1fa: astore 5
      // 1fc: aload 5
      // 1fe: aload 3
      // 1ff: ifnull 219
      // 202: ifnonnull 21b
      // 205: goto 20c
      // 208: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: aload 1
      // 20d: aload 4
      // 20f: invokevirtual com/finalshell/core/NL3.E (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 212: goto 219
      // 215: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 218: athrow
      // 219: astore 5
      // 21b: aload 0
      // 21c: new com/finalshell/core/HR
      // 21f: dup
      // 220: aload 5
      // 222: aload 4
      // 224: invokespecial com/finalshell/core/HR.<init> (Lcom/finalshell/core/Ak2;Ljava/lang/Class;)V
      // 227: putfield com/finalshell/core/Nc2.b Lcom/finalshell/core/HR;
      // 22a: aload 0
      // 22b: getfield com/finalshell/core/Nc2.b Lcom/finalshell/core/HR;
      // 22e: astore 4
      // 230: aload 0
      // 231: aload 3
      // 232: ifnull 258
      // 235: getfield com/finalshell/core/Nc2.y Z
      // 238: ifeq 257
      // 23b: goto 242
      // 23e: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 241: athrow
      // 242: aload 0
      // 243: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 246: getfield com/finalshell/core/Ph2.c I
      // 249: getstatic com/finalshell/ui/model/EP.DisableCircularReferenceDetect Lcom/finalshell/ui/model/EP;
      // 24c: getfield com/finalshell/ui/model/EP.mask I
      // 24f: ior
      // 250: goto 25e
      // 253: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: aload 0
      // 258: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 25b: getfield com/finalshell/core/Ph2.c I
      // 25e: aload 0
      // 25f: getfield com/finalshell/core/Nc2.V I
      // 262: ior
      // 263: istore 5
      // 265: aload 2
      // 266: ifnonnull 3c2
      // 269: aload 1
      // 26a: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 26d: astore 6
      // 26f: aload 0
      // 270: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 273: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 276: aload 3
      // 277: ifnull 2b5
      // 27a: ldc java/lang/Object
      // 27c: if_acmpne 2b0
      // 27f: goto 286
      // 282: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: aload 6
      // 288: aload 3
      // 289: ifnull 2ac
      // 28c: goto 293
      // 28f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 292: athrow
      // 293: getstatic com/finalshell/ui/model/EP.WRITE_MAP_NULL_FEATURES I
      // 296: invokevirtual com/finalshell/io/YM3.y (I)Z
      // 299: ifeq 2b0
      // 29c: goto 2a3
      // 29f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a2: athrow
      // 2a3: aload 6
      // 2a5: goto 2ac
      // 2a8: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ab: athrow
      // 2ac: invokevirtual com/finalshell/io/YM3.Y ()V
      // 2af: return
      // 2b0: aload 4
      // 2b2: getfield com/finalshell/core/HR.A Ljava/lang/Class;
      // 2b5: astore 7
      // 2b7: ldc_w java/lang/Number
      // 2ba: aload 7
      // 2bc: aload 3
      // 2bd: ifnull 2e5
      // 2c0: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 2c3: ifeq 2e1
      // 2c6: goto 2cd
      // 2c9: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cc: athrow
      // 2cd: aload 6
      // 2cf: aload 0
      // 2d0: getfield com/finalshell/core/Nc2.V I
      // 2d3: getstatic com/finalshell/ui/model/EP.WriteNullNumberAsZero Lcom/finalshell/ui/model/EP;
      // 2d6: getfield com/finalshell/ui/model/EP.mask I
      // 2d9: invokevirtual com/finalshell/io/YM3.s (II)V
      // 2dc: return
      // 2dd: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e0: athrow
      // 2e1: ldc java/lang/String
      // 2e3: aload 7
      // 2e5: aload 3
      // 2e6: ifnull 30c
      // 2e9: if_acmpne 307
      // 2ec: goto 2f3
      // 2ef: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f2: athrow
      // 2f3: aload 6
      // 2f5: aload 0
      // 2f6: getfield com/finalshell/core/Nc2.V I
      // 2f9: getstatic com/finalshell/ui/model/EP.WriteNullStringAsEmpty Lcom/finalshell/ui/model/EP;
      // 2fc: getfield com/finalshell/ui/model/EP.mask I
      // 2ff: invokevirtual com/finalshell/io/YM3.s (II)V
      // 302: return
      // 303: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 306: athrow
      // 307: ldc_w java/lang/Boolean
      // 30a: aload 7
      // 30c: aload 3
      // 30d: ifnull 333
      // 310: if_acmpne 32e
      // 313: goto 31a
      // 316: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 319: athrow
      // 31a: aload 6
      // 31c: aload 0
      // 31d: getfield com/finalshell/core/Nc2.V I
      // 320: getstatic com/finalshell/ui/model/EP.WriteNullBooleanAsFalse Lcom/finalshell/ui/model/EP;
      // 323: getfield com/finalshell/ui/model/EP.mask I
      // 326: invokevirtual com/finalshell/io/YM3.s (II)V
      // 329: return
      // 32a: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32d: athrow
      // 32e: ldc_w java/util/Collection
      // 331: aload 7
      // 333: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 336: aload 3
      // 337: ifnull 350
      // 33a: ifne 353
      // 33d: goto 344
      // 340: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 343: athrow
      // 344: aload 7
      // 346: invokevirtual java/lang/Class.isArray ()Z
      // 349: goto 350
      // 34c: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34f: athrow
      // 350: ifeq 367
      // 353: aload 6
      // 355: aload 0
      // 356: getfield com/finalshell/core/Nc2.V I
      // 359: getstatic com/finalshell/ui/model/EP.WriteNullListAsEmpty Lcom/finalshell/ui/model/EP;
      // 35c: getfield com/finalshell/ui/model/EP.mask I
      // 35f: invokevirtual com/finalshell/io/YM3.s (II)V
      // 362: return
      // 363: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 366: athrow
      // 367: aload 4
      // 369: getfield com/finalshell/core/HR.C Lcom/finalshell/core/Ak2;
      // 36c: astore 8
      // 36e: aload 3
      // 36f: ifnull 3c1
      // 372: aload 6
      // 374: getstatic com/finalshell/ui/model/EP.WRITE_MAP_NULL_FEATURES I
      // 377: invokevirtual com/finalshell/io/YM3.y (I)Z
      // 37a: ifeq 3a8
      // 37d: goto 384
      // 380: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 383: athrow
      // 384: aload 8
      // 386: aload 3
      // 387: ifnull 3aa
      // 38a: goto 391
      // 38d: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 390: athrow
      // 391: instanceof com/finalshell/core/Nj4
      // 394: ifeq 3a8
      // 397: goto 39e
      // 39a: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39d: athrow
      // 39e: aload 6
      // 3a0: invokevirtual com/finalshell/io/YM3.Y ()V
      // 3a3: return
      // 3a4: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a7: athrow
      // 3a8: aload 8
      // 3aa: aload 1
      // 3ab: aconst_null
      // 3ac: aload 0
      // 3ad: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 3b0: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 3b3: aload 0
      // 3b4: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 3b7: getfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 3ba: iload 5
      // 3bc: invokeinterface com/finalshell/core/Ak2.u (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 3c1: return
      // 3c2: aload 0
      // 3c3: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 3c6: aload 3
      // 3c7: ifnull 429
      // 3ca: getfield com/finalshell/core/Ph2.X Z
      // 3cd: ifeq 428
      // 3d0: goto 3d7
      // 3d3: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d6: athrow
      // 3d7: aload 0
      // 3d8: getfield com/finalshell/core/Nc2.q Z
      // 3db: aload 3
      // 3dc: ifnull 412
      // 3df: goto 3e6
      // 3e2: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e5: athrow
      // 3e6: ifeq 403
      // 3e9: goto 3f0
      // 3ec: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ef: athrow
      // 3f0: aload 1
      // 3f1: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 3f4: aload 2
      // 3f5: checkcast java/lang/Enum
      // 3f8: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 3fb: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 3fe: return
      // 3ff: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 402: athrow
      // 403: aload 0
      // 404: aload 3
      // 405: ifnull 429
      // 408: getfield com/finalshell/core/Nc2.s Z
      // 40b: goto 412
      // 40e: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 411: athrow
      // 412: ifeq 428
      // 415: aload 1
      // 416: getfield com/finalshell/core/NL3.w Lcom/finalshell/io/YM3;
      // 419: aload 2
      // 41a: checkcast java/lang/Enum
      // 41d: invokevirtual java/lang/Enum.toString ()Ljava/lang/String;
      // 420: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 423: return
      // 424: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 427: athrow
      // 428: aload 2
      // 429: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 42c: astore 6
      // 42e: aload 6
      // 430: aload 4
      // 432: getfield com/finalshell/core/HR.A Ljava/lang/Class;
      // 435: if_acmpeq 446
      // 438: aload 0
      // 439: getfield com/finalshell/core/Nc2.Q Z
      // 43c: ifeq 451
      // 43f: goto 446
      // 442: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 445: athrow
      // 446: aload 4
      // 448: getfield com/finalshell/core/HR.C Lcom/finalshell/core/Ak2;
      // 44b: astore 7
      // 44d: aload 3
      // 44e: ifnonnull 459
      // 451: aload 1
      // 452: aload 6
      // 454: invokevirtual com/finalshell/core/NL3.E (Ljava/lang/Class;)Lcom/finalshell/core/Ak2;
      // 457: astore 7
      // 459: aload 0
      // 45a: aload 3
      // 45b: ifnull 4e6
      // 45e: getfield com/finalshell/core/Nc2.t Ljava/lang/String;
      // 461: ifnull 4e5
      // 464: goto 46b
      // 467: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46a: athrow
      // 46b: aload 7
      // 46d: instanceof com/finalshell/core/ZO
      // 470: aload 3
      // 471: ifnull 4ec
      // 474: goto 47b
      // 477: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47a: athrow
      // 47b: ifne 4e5
      // 47e: goto 485
      // 481: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 484: athrow
      // 485: aload 7
      // 487: instanceof com/finalshell/core/Ns4
      // 48a: aload 3
      // 48b: ifnull 4ec
      // 48e: goto 495
      // 491: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 494: athrow
      // 495: ifne 4e5
      // 498: goto 49f
      // 49b: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49e: athrow
      // 49f: aload 7
      // 4a1: aload 3
      // 4a2: ifnull 4c2
      // 4a5: goto 4ac
      // 4a8: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ab: athrow
      // 4ac: instanceof com/finalshell/core/FW
      // 4af: ifeq 4d4
      // 4b2: goto 4b9
      // 4b5: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b8: athrow
      // 4b9: aload 7
      // 4bb: goto 4c2
      // 4be: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c1: athrow
      // 4c2: checkcast com/finalshell/core/FW
      // 4c5: aload 1
      // 4c6: aload 2
      // 4c7: aload 0
      // 4c8: getfield com/finalshell/core/Nc2.D Lcom/finalshell/core/DL3;
      // 4cb: invokeinterface com/finalshell/core/FW.q (Lcom/finalshell/core/NL3;Ljava/lang/Object;Lcom/finalshell/core/DL3;)V 4
      // 4d0: aload 3
      // 4d1: ifnonnull 4e4
      // 4d4: aload 1
      // 4d5: aload 2
      // 4d6: aload 0
      // 4d7: getfield com/finalshell/core/Nc2.t Ljava/lang/String;
      // 4da: invokevirtual com/finalshell/core/NL3.l (Ljava/lang/Object;Ljava/lang/String;)V
      // 4dd: goto 4e4
      // 4e0: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e3: athrow
      // 4e4: return
      // 4e5: aload 0
      // 4e6: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 4e9: getfield com/finalshell/core/Ph2.D Z
      // 4ec: aload 3
      // 4ed: ifnull 572
      // 4f0: ifeq 567
      // 4f3: goto 4fa
      // 4f6: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f9: athrow
      // 4fa: aload 7
      // 4fc: instanceof com/finalshell/core/Nj4
      // 4ff: aload 3
      // 500: ifnull 539
      // 503: goto 50a
      // 506: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 509: athrow
      // 50a: ifeq 534
      // 50d: goto 514
      // 510: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 513: athrow
      // 514: aload 7
      // 516: checkcast com/finalshell/core/Nj4
      // 519: astore 8
      // 51b: aload 8
      // 51d: aload 1
      // 51e: aload 2
      // 51f: aload 0
      // 520: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 523: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 526: aload 0
      // 527: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 52a: getfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 52d: iload 5
      // 52f: bipush 1
      // 530: invokevirtual com/finalshell/core/Nj4.z (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V
      // 533: return
      // 534: aload 7
      // 536: instanceof com/finalshell/core/Np4
      // 539: aload 3
      // 53a: ifnull 572
      // 53d: ifeq 567
      // 540: goto 547
      // 543: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 546: athrow
      // 547: aload 7
      // 549: checkcast com/finalshell/core/Np4
      // 54c: astore 8
      // 54e: aload 8
      // 550: aload 1
      // 551: aload 2
      // 552: aload 0
      // 553: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 556: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 559: aload 0
      // 55a: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 55d: getfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 560: iload 5
      // 562: bipush 1
      // 563: invokevirtual com/finalshell/core/Np4.N (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V
      // 566: return
      // 567: aload 0
      // 568: getfield com/finalshell/core/Nc2.V I
      // 56b: getstatic com/finalshell/ui/model/EP.WriteClassName Lcom/finalshell/ui/model/EP;
      // 56e: getfield com/finalshell/ui/model/EP.mask I
      // 571: iand
      // 572: aload 3
      // 573: ifnull 5dc
      // 576: ifeq 5cd
      // 579: goto 580
      // 57c: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57f: athrow
      // 580: aload 6
      // 582: aload 0
      // 583: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 586: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 589: if_acmpeq 5cd
      // 58c: goto 593
      // 58f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 592: athrow
      // 593: aload 7
      // 595: instanceof com/finalshell/core/Nj4
      // 598: aload 3
      // 599: ifnull 5dc
      // 59c: goto 5a3
      // 59f: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a2: athrow
      // 5a3: ifeq 5cd
      // 5a6: goto 5ad
      // 5a9: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ac: athrow
      // 5ad: aload 7
      // 5af: checkcast com/finalshell/core/Nj4
      // 5b2: aload 1
      // 5b3: aload 2
      // 5b4: aload 0
      // 5b5: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 5b8: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 5bb: aload 0
      // 5bc: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 5bf: getfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 5c2: iload 5
      // 5c4: bipush 0
      // 5c5: invokevirtual com/finalshell/core/Nj4.z (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V
      // 5c8: return
      // 5c9: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5cc: athrow
      // 5cd: aload 0
      // 5ce: aload 3
      // 5cf: ifnull 5e0
      // 5d2: getfield com/finalshell/core/Nc2.B Z
      // 5d5: goto 5dc
      // 5d8: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5db: athrow
      // 5dc: ifeq 66a
      // 5df: aload 0
      // 5e0: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 5e3: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 5e6: aload 3
      // 5e7: ifnull 61e
      // 5ea: getstatic java/lang/Long.TYPE Ljava/lang/Class;
      // 5ed: if_acmpeq 616
      // 5f0: goto 5f7
      // 5f3: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f6: athrow
      // 5f7: aload 0
      // 5f8: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 5fb: getfield com/finalshell/core/Ph2.O Ljava/lang/Class;
      // 5fe: aload 3
      // 5ff: ifnull 61e
      // 602: goto 609
      // 605: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 608: athrow
      // 609: ldc_w java/lang/Long
      // 60c: if_acmpne 66a
      // 60f: goto 616
      // 612: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 615: athrow
      // 616: aload 2
      // 617: goto 61e
      // 61a: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61d: athrow
      // 61e: checkcast java/lang/Long
      // 621: invokevirtual java/lang/Long.longValue ()J
      // 624: lstore 8
      // 626: aload 3
      // 627: ifnull 669
      // 62a: lload 8
      // 62c: sipush 28023
      // 62f: ldc2_w 1000827825623660474
      // 632: invokestatic com/finalshell/core/Nc2.b (IJ)J
      // 635: lcmp
      // 636: ifgt 656
      // 639: goto 640
      // 63c: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63f: athrow
      // 640: lload 8
      // 642: sipush 24786
      // 645: ldc2_w 4359680559918709278
      // 648: invokestatic com/finalshell/core/Nc2.b (IJ)J
      // 64b: lcmp
      // 64c: ifge 66a
      // 64f: goto 656
      // 652: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 655: athrow
      // 656: aload 1
      // 657: invokevirtual com/finalshell/core/NL3.S ()Lcom/finalshell/io/YM3;
      // 65a: lload 8
      // 65c: invokestatic java/lang/Long.toString (J)Ljava/lang/String;
      // 65f: invokevirtual com/finalshell/io/YM3.y (Ljava/lang/String;)V
      // 662: goto 669
      // 665: invokestatic com/finalshell/core/Nc2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 668: athrow
      // 669: return
      // 66a: aload 7
      // 66c: aload 1
      // 66d: aload 2
      // 66e: aload 0
      // 66f: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 672: getfield com/finalshell/core/Ph2.I Ljava/lang/String;
      // 675: aload 0
      // 676: getfield com/finalshell/core/Nc2.j Lcom/finalshell/core/Ph2;
      // 679: getfield com/finalshell/core/Ph2.a Ljava/lang/reflect/Type;
      // 67c: iload 5
      // 67e: invokeinterface com/finalshell/core/Ak2.u (Lcom/finalshell/core/NL3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 683: return
   }

   @Override
   public int compareTo(Object var1) {
      return this.G((Nc2)var1);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 27561) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 0;
               break;
            case 1:
               var10000 = 42;
               break;
            case 2:
               var10000 = 225;
               break;
            case 3:
               var10000 = 88;
               break;
            case 4:
               var10000 = 160;
               break;
            case 5:
               var10000 = 241;
               break;
            case 6:
               var10000 = 245;
               break;
            case 7:
               var10000 = 80;
               break;
            case 8:
               var10000 = 251;
               break;
            case 9:
               var10000 = 145;
               break;
            case 10:
               var10000 = 168;
               break;
            case 11:
               var10000 = 23;
               break;
            case 12:
               var10000 = 150;
               break;
            case 13:
               var10000 = 187;
               break;
            case 14:
               var10000 = 244;
               break;
            case 15:
               var10000 = 11;
               break;
            case 16:
               var10000 = 84;
               break;
            case 17:
               var10000 = 87;
               break;
            case 18:
               var10000 = 106;
               break;
            case 19:
               var10000 = 246;
               break;
            case 20:
               var10000 = 55;
               break;
            case 21:
               var10000 = 248;
               break;
            case 22:
               var10000 = 70;
               break;
            case 23:
               var10000 = 172;
               break;
            case 24:
               var10000 = 223;
               break;
            case 25:
               var10000 = 17;
               break;
            case 26:
               var10000 = 151;
               break;
            case 27:
               var10000 = 21;
               break;
            case 28:
               var10000 = 240;
               break;
            case 29:
               var10000 = 156;
               break;
            case 30:
               var10000 = 12;
               break;
            case 31:
               var10000 = 169;
               break;
            case 32:
               var10000 = 10;
               break;
            case 33:
               var10000 = 62;
               break;
            case 34:
               var10000 = 16;
               break;
            case 35:
               var10000 = 122;
               break;
            case 36:
               var10000 = 132;
               break;
            case 37:
               var10000 = 146;
               break;
            case 38:
               var10000 = 230;
               break;
            case 39:
               var10000 = 222;
               break;
            case 40:
               var10000 = 161;
               break;
            case 41:
               var10000 = 60;
               break;
            case 42:
               var10000 = 50;
               break;
            case 43:
               var10000 = 144;
               break;
            case 44:
               var10000 = 24;
               break;
            case 45:
               var10000 = 255;
               break;
            case 46:
               var10000 = 47;
               break;
            case 47:
               var10000 = 176;
               break;
            case 48:
               var10000 = 126;
               break;
            case 49:
               var10000 = 180;
               break;
            case 50:
               var10000 = 123;
               break;
            case 51:
               var10000 = 191;
               break;
            case 52:
               var10000 = 75;
               break;
            case 53:
               var10000 = 52;
               break;
            case 54:
               var10000 = 98;
               break;
            case 55:
               var10000 = 217;
               break;
            case 56:
               var10000 = 233;
               break;
            case 57:
               var10000 = 138;
               break;
            case 58:
               var10000 = 91;
               break;
            case 59:
               var10000 = 6;
               break;
            case 60:
               var10000 = 111;
               break;
            case 61:
               var10000 = 179;
               break;
            case 62:
               var10000 = 35;
               break;
            case 63:
               var10000 = 92;
               break;
            case 64:
               var10000 = 231;
               break;
            case 65:
               var10000 = 250;
               break;
            case 66:
               var10000 = 22;
               break;
            case 67:
               var10000 = 178;
               break;
            case 68:
               var10000 = 213;
               break;
            case 69:
               var10000 = 119;
               break;
            case 70:
               var10000 = 5;
               break;
            case 71:
               var10000 = 74;
               break;
            case 72:
               var10000 = 19;
               break;
            case 73:
               var10000 = 149;
               break;
            case 74:
               var10000 = 157;
               break;
            case 75:
               var10000 = 45;
               break;
            case 76:
               var10000 = 33;
               break;
            case 77:
               var10000 = 128;
               break;
            case 78:
               var10000 = 148;
               break;
            case 79:
               var10000 = 97;
               break;
            case 80:
               var10000 = 36;
               break;
            case 81:
               var10000 = 124;
               break;
            case 82:
               var10000 = 142;
               break;
            case 83:
               var10000 = 164;
               break;
            case 84:
               var10000 = 117;
               break;
            case 85:
               var10000 = 200;
               break;
            case 86:
               var10000 = 209;
               break;
            case 87:
               var10000 = 139;
               break;
            case 88:
               var10000 = 197;
               break;
            case 89:
               var10000 = 147;
               break;
            case 90:
               var10000 = 203;
               break;
            case 91:
               var10000 = 43;
               break;
            case 92:
               var10000 = 253;
               break;
            case 93:
               var10000 = 175;
               break;
            case 94:
               var10000 = 99;
               break;
            case 95:
               var10000 = 212;
               break;
            case 96:
               var10000 = 214;
               break;
            case 97:
               var10000 = 89;
               break;
            case 98:
               var10000 = 206;
               break;
            case 99:
               var10000 = 185;
               break;
            case 100:
               var10000 = 152;
               break;
            case 101:
               var10000 = 254;
               break;
            case 102:
               var10000 = 205;
               break;
            case 103:
               var10000 = 137;
               break;
            case 104:
               var10000 = 184;
               break;
            case 105:
               var10000 = 40;
               break;
            case 106:
               var10000 = 249;
               break;
            case 107:
               var10000 = 37;
               break;
            case 108:
               var10000 = 154;
               break;
            case 109:
               var10000 = 29;
               break;
            case 110:
               var10000 = 57;
               break;
            case 111:
               var10000 = 198;
               break;
            case 112:
               var10000 = 133;
               break;
            case 113:
               var10000 = 104;
               break;
            case 114:
               var10000 = 105;
               break;
            case 115:
               var10000 = 20;
               break;
            case 116:
               var10000 = 61;
               break;
            case 117:
               var10000 = 25;
               break;
            case 118:
               var10000 = 15;
               break;
            case 119:
               var10000 = 85;
               break;
            case 120:
               var10000 = 26;
               break;
            case 121:
               var10000 = 192;
               break;
            case 122:
               var10000 = 3;
               break;
            case 123:
               var10000 = 51;
               break;
            case 124:
               var10000 = 63;
               break;
            case 125:
               var10000 = 66;
               break;
            case 126:
               var10000 = 229;
               break;
            case 127:
               var10000 = 158;
               break;
            case 128:
               var10000 = 167;
               break;
            case 129:
               var10000 = 72;
               break;
            case 130:
               var10000 = 34;
               break;
            case 131:
               var10000 = 202;
               break;
            case 132:
               var10000 = 243;
               break;
            case 133:
               var10000 = 67;
               break;
            case 134:
               var10000 = 78;
               break;
            case 135:
               var10000 = 199;
               break;
            case 136:
               var10000 = 234;
               break;
            case 137:
               var10000 = 76;
               break;
            case 138:
               var10000 = 96;
               break;
            case 139:
               var10000 = 69;
               break;
            case 140:
               var10000 = 41;
               break;
            case 141:
               var10000 = 116;
               break;
            case 142:
               var10000 = 8;
               break;
            case 143:
               var10000 = 27;
               break;
            case 144:
               var10000 = 58;
               break;
            case 145:
               var10000 = 39;
               break;
            case 146:
               var10000 = 83;
               break;
            case 147:
               var10000 = 239;
               break;
            case 148:
               var10000 = 159;
               break;
            case 149:
               var10000 = 155;
               break;
            case 150:
               var10000 = 18;
               break;
            case 151:
               var10000 = 215;
               break;
            case 152:
               var10000 = 1;
               break;
            case 153:
               var10000 = 143;
               break;
            case 154:
               var10000 = 210;
               break;
            case 155:
               var10000 = 177;
               break;
            case 156:
               var10000 = 221;
               break;
            case 157:
               var10000 = 195;
               break;
            case 158:
               var10000 = 232;
               break;
            case 159:
               var10000 = 181;
               break;
            case 160:
               var10000 = 120;
               break;
            case 161:
               var10000 = 2;
               break;
            case 162:
               var10000 = 186;
               break;
            case 163:
               var10000 = 109;
               break;
            case 164:
               var10000 = 71;
               break;
            case 165:
               var10000 = 226;
               break;
            case 166:
               var10000 = 208;
               break;
            case 167:
               var10000 = 114;
               break;
            case 168:
               var10000 = 79;
               break;
            case 169:
               var10000 = 237;
               break;
            case 170:
               var10000 = 130;
               break;
            case 171:
               var10000 = 38;
               break;
            case 172:
               var10000 = 115;
               break;
            case 173:
               var10000 = 46;
               break;
            case 174:
               var10000 = 190;
               break;
            case 175:
               var10000 = 113;
               break;
            case 176:
               var10000 = 53;
               break;
            case 177:
               var10000 = 228;
               break;
            case 178:
               var10000 = 131;
               break;
            case 179:
               var10000 = 211;
               break;
            case 180:
               var10000 = 242;
               break;
            case 181:
               var10000 = 100;
               break;
            case 182:
               var10000 = 59;
               break;
            case 183:
               var10000 = 182;
               break;
            case 184:
               var10000 = 9;
               break;
            case 185:
               var10000 = 219;
               break;
            case 186:
               var10000 = 107;
               break;
            case 187:
               var10000 = 247;
               break;
            case 188:
               var10000 = 136;
               break;
            case 189:
               var10000 = 94;
               break;
            case 190:
               var10000 = 86;
               break;
            case 191:
               var10000 = 44;
               break;
            case 192:
               var10000 = 77;
               break;
            case 193:
               var10000 = 224;
               break;
            case 194:
               var10000 = 48;
               break;
            case 195:
               var10000 = 227;
               break;
            case 196:
               var10000 = 183;
               break;
            case 197:
               var10000 = 235;
               break;
            case 198:
               var10000 = 194;
               break;
            case 199:
               var10000 = 153;
               break;
            case 200:
               var10000 = 82;
               break;
            case 201:
               var10000 = 252;
               break;
            case 202:
               var10000 = 102;
               break;
            case 203:
               var10000 = 68;
               break;
            case 204:
               var10000 = 54;
               break;
            case 205:
               var10000 = 173;
               break;
            case 206:
               var10000 = 204;
               break;
            case 207:
               var10000 = 238;
               break;
            case 208:
               var10000 = 103;
               break;
            case 209:
               var10000 = 93;
               break;
            case 210:
               var10000 = 65;
               break;
            case 211:
               var10000 = 90;
               break;
            case 212:
               var10000 = 4;
               break;
            case 213:
               var10000 = 125;
               break;
            case 214:
               var10000 = 141;
               break;
            case 215:
               var10000 = 188;
               break;
            case 216:
               var10000 = 101;
               break;
            case 217:
               var10000 = 216;
               break;
            case 218:
               var10000 = 81;
               break;
            case 219:
               var10000 = 108;
               break;
            case 220:
               var10000 = 207;
               break;
            case 221:
               var10000 = 64;
               break;
            case 222:
               var10000 = 189;
               break;
            case 223:
               var10000 = 171;
               break;
            case 224:
               var10000 = 135;
               break;
            case 225:
               var10000 = 196;
               break;
            case 226:
               var10000 = 174;
               break;
            case 227:
               var10000 = 13;
               break;
            case 228:
               var10000 = 49;
               break;
            case 229:
               var10000 = 121;
               break;
            case 230:
               var10000 = 118;
               break;
            case 231:
               var10000 = 201;
               break;
            case 232:
               var10000 = 56;
               break;
            case 233:
               var10000 = 7;
               break;
            case 234:
               var10000 = 112;
               break;
            case 235:
               var10000 = 127;
               break;
            case 236:
               var10000 = 163;
               break;
            case 237:
               var10000 = 129;
               break;
            case 238:
               var10000 = 220;
               break;
            case 239:
               var10000 = 73;
               break;
            case 240:
               var10000 = 165;
               break;
            case 241:
               var10000 = 134;
               break;
            case 242:
               var10000 = 170;
               break;
            case 243:
               var10000 = 14;
               break;
            case 244:
               var10000 = 162;
               break;
            case 245:
               var10000 = 236;
               break;
            case 246:
               var10000 = 193;
               break;
            case 247:
               var10000 = 28;
               break;
            case 248:
               var10000 = 31;
               break;
            case 249:
               var10000 = 110;
               break;
            case 250:
               var10000 = 32;
               break;
            case 251:
               var10000 = 30;
               break;
            case 252:
               var10000 = 95;
               break;
            case 253:
               var10000 = 218;
               break;
            case 254:
               var10000 = 140;
               break;
            default:
               var10000 = 166;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25173;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 6861) & 32767;
      if (h[var3] == null) {
         h[var3] = g[var3] ^ var1;
      }

      return h[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[2];
      int var19 = 0;
      String var18 = "ïQ\u0002H\u009b";
      int var20 = "ïQ\u0002H\u009b".length();
      char var17 = 2;
      int var16 = -1;

      while (true) {
         char[] var10002;
         label57: {
            char[] var10003 = var18.substring(++var16, var16 + var17).toCharArray();
            int var10004 = var10003.length;
            int var22 = 0;
            byte var33 = 50;
            var10002 = var10003;
            int var24 = var10004;
            byte var38;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var38 = 50;
               var10006 = var22;
            } else {
               var33 = 50;
               var24 = var10004;
               if (var10004 <= var22) {
                  break label57;
               }

               var10005 = var10003;
               var38 = 50;
               var10006 = var22;
            }

            while (true) {
               char var52 = var10005[var10006];
               byte var53;
               switch (var22 % 7) {
                  case 0:
                     var53 = 118;
                     break;
                  case 1:
                     var53 = 18;
                     break;
                  case 2:
                     var53 = 93;
                     break;
                  case 3:
                     var53 = 2;
                     break;
                  case 4:
                     var53 = 100;
                     break;
                  case 5:
                     var53 = 22;
                     break;
                  default:
                     var53 = 64;
               }

               var10005[var10006] = (char)(var52 ^ var38 ^ var53);
               var22++;
               if (var33 == 0) {
                  var10006 = var33;
                  var10005 = var10002;
                  var38 = var33;
               } else {
                  if (var24 <= var22) {
                     break;
                  }

                  var10005 = var10002;
                  var38 = var33;
                  var10006 = var22;
               }
            }
         }

         String var35 = new String(var10002).intern();
         int var26 = -1;
         var21[var19++] = var35;
         if ((var16 += var17) >= var20) {
            a = var21;
            d = new String[2];
            long var8 = 6813104601188412856L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = ";\u0084´døF\b¹\u0086þ:\u0097©\u0012\u0088J";
            int var13 = ";\u0084´døF\b¹\u0086þ:\u0097©\u0012\u0088J".length();
            byte var10 = 0;

            do {
               var26 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var26, var10).getBytes("ISO-8859-1");
               var26 = var11++;
               long var42 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var8;
               byte var36 = -1;
               var14[var26] = var42;
            } while (var10 < var13);

            e = var14;
            f = new Integer[2];
            long var0 = 9040241693657112137L;
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "p\u0089;\u0089~{\u0096\f¾\u0015Ñ²¶:äV";
            int var5 = "p\u0089;\u0089~{\u0096\f¾\u0015Ñ²¶:äV".length();
            byte var2 = 0;

            do {
               int var29 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
               var29 = var3++;
               long var43 = (
                     ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L
                  )
                  ^ var0;
               byte var37 = -1;
               var6[var29] = var43;
            } while (var2 < var5);

            g = var6;
            h = new Long[2];
            return;
         }

         var17 = var18.charAt(var16);
      }
   }
}





