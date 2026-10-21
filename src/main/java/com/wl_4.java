package com;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class wl_4 implements com.ak_2, X4 {
   public static final wl_4 y;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   @Override
   public final void u(nL_3 param1, Object param2, Object param3, Type param4, int param5) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield com/nL_3.w Lcom/yM_3;
      // 004: astore 7
      // 006: invokestatic com/nv_4.o ()Ljava/lang/String;
      // 009: aload 2
      // 00a: checkcast [Ljava/lang/Object;
      // 00d: astore 8
      // 00f: astore 6
      // 011: aload 6
      // 013: ifnull 030
      // 016: aload 2
      // 017: ifnonnull 031
      // 01a: goto 021
      // 01d: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 020: athrow
      // 021: aload 7
      // 023: getstatic com/EP.WriteNullListAsEmpty Lcom/EP;
      // 026: invokevirtual com/yM_3.x (Lcom/EP;)V
      // 029: goto 030
      // 02c: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 02f: athrow
      // 030: return
      // 031: aload 8
      // 033: arraylength
      // 034: istore 9
      // 036: iload 9
      // 038: bipush 1
      // 039: isub
      // 03a: istore 10
      // 03c: aload 6
      // 03e: ifnull 064
      // 041: iload 10
      // 043: bipush -1
      // 044: if_icmpne 065
      // 047: goto 04e
      // 04a: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 04d: athrow
      // 04e: aload 7
      // 050: sipush 4489
      // 053: sipush 20677
      // 056: invokestatic com/wl_4.a (II)Ljava/lang/String;
      // 059: invokevirtual com/yM_3.q (Ljava/lang/CharSequence;)Lcom/yM_3;
      // 05c: pop
      // 05d: goto 064
      // 060: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 063: athrow
      // 064: return
      // 065: aload 1
      // 066: getfield com/nL_3.W Lcom/uh_2;
      // 069: astore 11
      // 06b: aload 1
      // 06c: aload 11
      // 06e: aload 2
      // 06f: aload 3
      // 070: bipush 0
      // 071: invokevirtual com/nL_3.N (Lcom/uh_2;Ljava/lang/Object;Ljava/lang/Object;I)V
      // 074: aconst_null
      // 075: astore 12
      // 077: aconst_null
      // 078: astore 13
      // 07a: aload 7
      // 07c: sipush 3761
      // 07f: ldc2_w 2120680946671319079
      // 082: invokestatic com/wl_4.a (IJ)I
      // 085: invokevirtual com/yM_3.T (C)Lcom/yM_3;
      // 088: pop
      // 089: aload 7
      // 08b: getstatic com/EP.PrettyFormat Lcom/EP;
      // 08e: invokevirtual com/yM_3.I (Lcom/EP;)Z
      // 091: aload 6
      // 093: ifnull 110
      // 096: ifeq 10f
      // 099: goto 0a0
      // 09c: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 09f: athrow
      // 0a0: aload 1
      // 0a1: invokevirtual com/nL_3.C ()V
      // 0a4: aload 1
      // 0a5: invokevirtual com/nL_3.i ()V
      // 0a8: bipush 0
      // 0a9: istore 14
      // 0ab: iload 14
      // 0ad: iload 9
      // 0af: if_icmpge 0f2
      // 0b2: aload 6
      // 0b4: ifnull 10e
      // 0b7: iload 14
      // 0b9: ifeq 0dc
      // 0bc: goto 0c3
      // 0bf: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0c2: athrow
      // 0c3: aload 7
      // 0c5: sipush 430
      // 0c8: ldc2_w 3975594783649003319
      // 0cb: invokestatic com/wl_4.a (IJ)I
      // 0ce: invokevirtual com/yM_3.write (I)V
      // 0d1: aload 1
      // 0d2: invokevirtual com/nL_3.i ()V
      // 0d5: goto 0dc
      // 0d8: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: aload 8
      // 0df: iload 14
      // 0e1: aaload
      // 0e2: iload 14
      // 0e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e7: invokevirtual com/nL_3.c (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0ea: iinc 14 1
      // 0ed: aload 6
      // 0ef: ifnonnull 0ab
      // 0f2: aload 1
      // 0f3: invokevirtual com/nL_3.r ()V
      // 0f6: aload 1
      // 0f7: invokevirtual com/nL_3.i ()V
      // 0fa: aload 7
      // 0fc: sipush 25642
      // 0ff: ldc2_w 6650910833040036539
      // 102: invokestatic com/wl_4.a (IJ)I
      // 105: invokevirtual com/yM_3.write (I)V
      // 108: aload 1
      // 109: aload 11
      // 10b: putfield com/nL_3.W Lcom/uh_2;
      // 10e: return
      // 10f: bipush 0
      // 110: istore 14
      // 112: iload 14
      // 114: iload 10
      // 116: if_icmpge 1ff
      // 119: aload 8
      // 11b: iload 14
      // 11d: aaload
      // 11e: astore 15
      // 120: aload 6
      // 122: ifnull 153
      // 125: aload 15
      // 127: aload 6
      // 129: ifnull 204
      // 12c: goto 133
      // 12f: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 132: athrow
      // 133: ifnonnull 158
      // 136: goto 13d
      // 139: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 13c: athrow
      // 13d: aload 7
      // 13f: sipush 4490
      // 142: sipush -27175
      // 145: invokestatic com/wl_4.a (II)Ljava/lang/String;
      // 148: invokevirtual com/yM_3.q (Ljava/lang/CharSequence;)Lcom/yM_3;
      // 14b: pop
      // 14c: goto 153
      // 14f: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 152: athrow
      // 153: aload 6
      // 155: ifnonnull 1f7
      // 158: aload 1
      // 159: aload 6
      // 15b: ifnull 18f
      // 15e: goto 165
      // 161: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 164: athrow
      // 165: aload 15
      // 167: invokevirtual com/nL_3.S (Ljava/lang/Object;)Z
      // 16a: ifeq 186
      // 16d: goto 174
      // 170: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 173: athrow
      // 174: aload 1
      // 175: aload 15
      // 177: invokevirtual com/nL_3.G (Ljava/lang/Object;)V
      // 17a: aload 6
      // 17c: ifnonnull 1e8
      // 17f: goto 186
      // 182: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 185: athrow
      // 186: aload 15
      // 188: goto 18f
      // 18b: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 18e: athrow
      // 18f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 192: astore 16
      // 194: aload 16
      // 196: aload 6
      // 198: ifnull 1cd
      // 19b: aload 12
      // 19d: if_acmpne 1c4
      // 1a0: goto 1a7
      // 1a3: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1a6: athrow
      // 1a7: aload 13
      // 1a9: aload 1
      // 1aa: aload 15
      // 1ac: iload 14
      // 1ae: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b1: aconst_null
      // 1b2: bipush 0
      // 1b3: invokeinterface com/ak_2.u (Lcom/nL_3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 1b8: aload 6
      // 1ba: ifnonnull 1e8
      // 1bd: goto 1c4
      // 1c0: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1c3: athrow
      // 1c4: aload 16
      // 1c6: goto 1cd
      // 1c9: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 1cc: athrow
      // 1cd: astore 12
      // 1cf: aload 1
      // 1d0: aload 16
      // 1d2: invokevirtual com/nL_3.E (Ljava/lang/Class;)Lcom/ak_2;
      // 1d5: astore 13
      // 1d7: aload 13
      // 1d9: aload 1
      // 1da: aload 15
      // 1dc: iload 14
      // 1de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e1: aconst_null
      // 1e2: bipush 0
      // 1e3: invokeinterface com/ak_2.u (Lcom/nL_3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V 6
      // 1e8: aload 7
      // 1ea: sipush 11657
      // 1ed: ldc2_w 6704058024916638491
      // 1f0: invokestatic com/wl_4.a (IJ)I
      // 1f3: invokevirtual com/yM_3.T (C)Lcom/yM_3;
      // 1f6: pop
      // 1f7: iinc 14 1
      // 1fa: aload 6
      // 1fc: ifnonnull 112
      // 1ff: aload 8
      // 201: iload 10
      // 203: aaload
      // 204: astore 14
      // 206: aload 6
      // 208: ifnull 22d
      // 20b: aload 14
      // 20d: ifnonnull 232
      // 210: goto 217
      // 213: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 216: athrow
      // 217: aload 7
      // 219: sipush 4491
      // 21c: sipush -22562
      // 21f: invokestatic com/wl_4.a (II)Ljava/lang/String;
      // 222: invokevirtual com/yM_3.q (Ljava/lang/CharSequence;)Lcom/yM_3;
      // 225: pop
      // 226: goto 22d
      // 229: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 22c: athrow
      // 22d: aload 6
      // 22f: ifnonnull 281
      // 232: aload 1
      // 233: aload 14
      // 235: aload 6
      // 237: ifnull 26a
      // 23a: goto 241
      // 23d: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 240: athrow
      // 241: invokevirtual com/nL_3.S (Ljava/lang/Object;)Z
      // 244: ifeq 260
      // 247: goto 24e
      // 24a: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 24d: athrow
      // 24e: aload 1
      // 24f: aload 14
      // 251: invokevirtual com/nL_3.G (Ljava/lang/Object;)V
      // 254: aload 6
      // 256: ifnonnull 272
      // 259: goto 260
      // 25c: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 25f: athrow
      // 260: aload 1
      // 261: aload 14
      // 263: goto 26a
      // 266: invokestatic com/wl_4.a (Ljava/io/IOException;)Ljava/io/IOException;
      // 269: athrow
      // 26a: iload 10
      // 26c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 26f: invokevirtual com/nL_3.c (Ljava/lang/Object;Ljava/lang/Object;)V
      // 272: aload 7
      // 274: sipush 13840
      // 277: ldc2_w 8512289372703309957
      // 27a: invokestatic com/wl_4.a (IJ)I
      // 27d: invokevirtual com/yM_3.T (C)Lcom/yM_3;
      // 280: pop
      // 281: aload 1
      // 282: aload 11
      // 284: putfield com/nL_3.W Lcom/uh_2;
      // 287: goto 295
      // 28a: astore 17
      // 28c: aload 1
      // 28d: aload 11
      // 28f: putfield com/nL_3.W Lcom/uh_2;
      // 292: aload 17
      // 294: athrow
      // 295: return
   }

   @Override
   public Object z(com.yn_4 var1, Type var2, Object var3) {
      P7 var5 = var1.N;
      String var10000 = nv_4.o();
      int var6 = var5.P();
      String var4 = var10000;
      int var20 = var6;
      int var10001 = a(23430, 6030332132320455957L);
      if (var4 != null) {
         if (var6 == var10001) {
            var5.S(a(26139, 8642702717917237388L));
            return null;
         }

         var20 = var6;
         var10001 = 4;
      }

      Class var7;
      Object var8;
      label139: {
         label134: {
            label154: {
               label141: {
                  if (var4 != null) {
                     if (var20 == var10001) {
                        break label134;
                     }

                     var20 = var6;
                     if (var4 == null) {
                        break label141;
                     }

                     var10001 = a(14976, 7136130673852861464L);
                  }

                  if (var20 == var10001) {
                     break label134;
                  }

                  var21 = var2;
                  if (var4 == null) {
                     break label154;
                  }

                  var20 = var2 instanceof GenericArrayType;
               }

               if (var20 != 0) {
                  label119: {
                     GenericArrayType var9 = (GenericArrayType)var2;
                     var8 = var9.getGenericComponentType();
                     var10000 = (String)var8;
                     if (var4 != null) {
                        if (var8 instanceof TypeVariable) {
                           label114: {
                              TypeVariable var10 = (TypeVariable)var8;
                              Type var11 = var1.A().F;
                              Type var23 = var11;
                              if (var4 != null) {
                                 if (var11 instanceof ParameterizedType) {
                                    label109: {
                                       label108: {
                                          label146: {
                                             Object var14;
                                             label147: {
                                                label148: {
                                                   ParameterizedType var12 = (ParameterizedType)var11;
                                                   Type var13 = var12.getRawType();
                                                   var14 = null;
                                                   Type var24 = var13;
                                                   if (var4 != null) {
                                                      if (!(var13 instanceof Class)) {
                                                         break label148;
                                                      }

                                                      var24 = var13;
                                                   }

                                                   TypeVariable[] var15 = ((Class)var24).getTypeParameters();
                                                   int var16 = 0;

                                                   while (var16 < var15.length) {
                                                      label96: {
                                                         var10000 = var15[var16];
                                                         if (var4 != null) {
                                                            var26 = var10000.getName().equals(var10.getName());
                                                            if (var4 == null) {
                                                               break label147;
                                                            }

                                                            if (!var26) {
                                                               break label96;
                                                            }

                                                            var10000 = var12.getActualTypeArguments()[var16];
                                                         }

                                                         var14 = var10000;
                                                      }

                                                      var16++;
                                                      if (var4 == null) {
                                                         break;
                                                      }
                                                   }
                                                }

                                                var10000 = (String)var14;
                                                if (var4 == null) {
                                                   break label146;
                                                }

                                                var26 = var14 instanceof Class;
                                             }

                                             if (!var26) {
                                                break label108;
                                             }

                                             var10000 = (String)var14;
                                          }

                                          var7 = (Class)var10000;
                                          if (var4 != null) {
                                             break label109;
                                          }
                                       }

                                       var7 = Object.class;
                                    }

                                    if (var4 != null) {
                                       break label114;
                                    }
                                 }

                                 var23 = var10.getBounds()[0];
                              }

                              var7 = com.B8.x(var23);
                           }

                           if (var4 != null) {
                              break label119;
                           }
                        }

                        var10000 = (String)var8;
                     }

                     var7 = com.B8.x(var10000);
                  }

                  if (var4 != null) {
                     break label139;
                  }
               }

               var21 = var2;
            }

            Class var18 = (Class)var21;
            var8 = var7 = var18.getComponentType();
            break label139;
         }

         byte[] var17 = var5.e();
         var5.S(a(11372, 5792281832017386232L));
         byte[] var28 = var17;
         if (var4 != null) {
            if (var17.length == 0 && var2 != byte[].class) {
               return null;
            }

            var28 = var17;
         }

         return var28;
      }

      com.Oc_2 var19 = new com.Oc_2();
      var1.t((Type)var8, var19, var3);
      return this.x(var1, var7, var19);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private Object x(com.yn_4 var1, Class var2, com.Oc_2 var3) {
      String var4 = nv_4.o();
      com.Oc_2 var10000 = var3;
      if (var4 != null) {
         if (var3 == null) {
            return null;
         }

         var10000 = var3;
      }

      int var5 = var10000.size();
      Object var6 = Array.newInstance(var2, var5);
      int var7 = 0;

      while (true) {
         if (var7 < var5) {
            Object var8 = var3.get(var7);
            var16 = var8;
            if (var4 == null) {
               break;
            }

            label132: {
               Object var15;
               label133: {
                  if (var4 != null) {
                     if (var8 == var3) {
                        Array.set(var6, var7, var6);
                        if (var4 != null) {
                           break label132;
                        }
                     }
                  } else {
                     Array.set(var8, var7, var6);
                     if (var4 != null) {
                        break label132;
                     }
                  }

                  boolean var10;
                  com.Oc_2 var11;
                  label119:
                  while (true) {
                     label81: {
                        label80: {
                           label135: {
                              boolean var17 = var2.isArray();
                              if (var4 != null) {
                                 if (!var17) {
                                    break label81;
                                 }

                                 var18 = var2;
                                 if (var4 == null) {
                                    break label135;
                                 }

                                 var17 = var2.isInstance(var8);
                              }

                              if (var17) {
                                 var15 = var8;
                                 if (var4 != null) {
                                    break label80;
                                 }
                              }

                              var18 = this.x(var1, var2, (com.Oc_2)var8);
                           }

                           var15 = var18;
                        }

                        Array.set(var6, var7, var15);
                        if (var4 != null) {
                           break label132;
                        }
                     }

                     var15 = null;
                     boolean var19 = var8 instanceof com.Oc_2;
                     if (var4 != null) {
                        if (!var19) {
                           break label133;
                        }

                        var19 = false;
                     }

                     var10 = var19;
                     var11 = (com.Oc_2)var8;
                     int var12 = var11.size();
                     int var13 = 0;
                     if (var13 >= var12) {
                        break;
                     }

                     while (true) {
                        Object var14 = var11.get(var13);
                        if (var4 != null) {
                           if (var4 == null) {
                              if (var14 == var3) {
                                 Array.set(var6, var7, var6);
                                 if (var4 != null) {
                                    break label132;
                                 }
                              }
                              break;
                           }

                           if (var14 == var3) {
                              var11.set(var7, var6);
                              var10 = true;
                           }

                           if (var4 == null || ++var13 >= var12) {
                              break label119;
                           }
                        } else if (var4 == null || var13 >= var12) {
                           break label119;
                        }
                     }
                  }

                  if (var10) {
                     var15 = var11.toArray();
                  }
               }

               Object var20 = var15;
               if (var4 != null) {
                  if (var15 == null) {
                     var15 = com.B8.B(var8, var2, var1.L());
                  }

                  var20 = var6;
               }

               Array.set(var20, var7, var15);
            }

            var7++;
            if (var4 != null) {
               continue;
            }
         }

         var3.L(var6);
         var3.w(var2);
         var16 = var6;
         break;
      }

      return var16;
   }

   @Override
   public int j() {
      return a(9690, 6892262657220170570L);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[3];
      int var11 = 0;
      String var10 = "o{£\u008b!\u0005\f\u0095ÏVÝ\u0002Á\u0014";
      int var12 = "o{£\u008b!\u0005\f\u0095ÏVÝ\u0002Á\u0014".length();
      char var9 = 5;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label56: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var27 = 46;
            var10002 = var10003;
            int var17 = var10004;
            byte var32;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var32 = 46;
               var10006 = var14;
            } else {
               var27 = 46;
               var17 = var10004;
               if (var10004 <= var14) {
                  break label56;
               }

               var10005 = var10003;
               var32 = 46;
               var10006 = var14;
            }

            while (true) {
               char var46 = var10005[var10006];
               byte var47;
               switch (var14 % 7) {
                  case 0:
                     var47 = 91;
                     break;
                  case 1:
                     var47 = 29;
                     break;
                  case 2:
                     var47 = 1;
                     break;
                  case 3:
                     var47 = 27;
                     break;
                  case 4:
                     var47 = 34;
                     break;
                  case 5:
                     var47 = 26;
                     break;
                  default:
                     var47 = 9;
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
            long var0 = 1686357750603785917L;
            long[] var6 = new long[10];
            int var3 = 0;
            String var4 = "V¥\u0004þ6»uù\u001dPÙ\u0094¤Ñ4[Ì1\u0097¾\u00884}\u008aà\u0017Ö}Pb\u008b ø\u0011&\u0015¬¯|U¶ù:Î\u001d§feÕ(\u001aÒL¿^ÁÑ\u009c\u008dì85¶!";
            int var5 = "V¥\u0004þ6»uù\u001dPÙ\u0094¤Ñ4[Ì1\u0097¾\u00884}\u008aà\u0017Ö}Pb\u008b ø\u0011&\u0015¬¯|U¶ù:Î\u001d§feÕ(\u001aÒL¿^ÁÑ\u009c\u008dì85¶!"
               .length();
            byte var2 = 0;

            label40:
            while (true) {
               var19 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var19, var2).getBytes("ISO-8859-1");
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
                           d = new Integer[10];
                           y = new wl_4();
                           return;
                        }
                        break;
                     default:
                        var10000[var19] = var37;
                        if (var2 < var5) {
                           continue label40;
                        }

                        var4 = "%YWÿ}3ê¿¶wÎ1â¼Q¦";
                        var5 = "%YWÿ}3ê¿¶wÎ1â¼Q¦".length();
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

   private static IOException a(IOException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 4491) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 185;
               break;
            case 1:
               var10000 = 162;
               break;
            case 2:
               var10000 = 70;
               break;
            case 3:
               var10000 = 207;
               break;
            case 4:
               var10000 = 136;
               break;
            case 5:
               var10000 = 191;
               break;
            case 6:
               var10000 = 19;
               break;
            case 7:
               var10000 = 172;
               break;
            case 8:
               var10000 = 50;
               break;
            case 9:
               var10000 = 240;
               break;
            case 10:
               var10000 = 49;
               break;
            case 11:
               var10000 = 231;
               break;
            case 12:
               var10000 = 89;
               break;
            case 13:
               var10000 = 222;
               break;
            case 14:
               var10000 = 176;
               break;
            case 15:
               var10000 = 181;
               break;
            case 16:
               var10000 = 83;
               break;
            case 17:
               var10000 = 152;
               break;
            case 18:
               var10000 = 73;
               break;
            case 19:
               var10000 = 121;
               break;
            case 20:
               var10000 = 161;
               break;
            case 21:
               var10000 = 165;
               break;
            case 22:
               var10000 = 180;
               break;
            case 23:
               var10000 = 157;
               break;
            case 24:
               var10000 = 169;
               break;
            case 25:
               var10000 = 11;
               break;
            case 26:
               var10000 = 106;
               break;
            case 27:
               var10000 = 245;
               break;
            case 28:
               var10000 = 120;
               break;
            case 29:
               var10000 = 33;
               break;
            case 30:
               var10000 = 21;
               break;
            case 31:
               var10000 = 205;
               break;
            case 32:
               var10000 = 202;
               break;
            case 33:
               var10000 = 206;
               break;
            case 34:
               var10000 = 230;
               break;
            case 35:
               var10000 = 93;
               break;
            case 36:
               var10000 = 235;
               break;
            case 37:
               var10000 = 78;
               break;
            case 38:
               var10000 = 20;
               break;
            case 39:
               var10000 = 224;
               break;
            case 40:
               var10000 = 82;
               break;
            case 41:
               var10000 = 148;
               break;
            case 42:
               var10000 = 110;
               break;
            case 43:
               var10000 = 76;
               break;
            case 44:
               var10000 = 237;
               break;
            case 45:
               var10000 = 107;
               break;
            case 46:
               var10000 = 129;
               break;
            case 47:
               var10000 = 61;
               break;
            case 48:
               var10000 = 197;
               break;
            case 49:
               var10000 = 0;
               break;
            case 50:
               var10000 = 100;
               break;
            case 51:
               var10000 = 3;
               break;
            case 52:
               var10000 = 209;
               break;
            case 53:
               var10000 = 37;
               break;
            case 54:
               var10000 = 138;
               break;
            case 55:
               var10000 = 187;
               break;
            case 56:
               var10000 = 15;
               break;
            case 57:
               var10000 = 8;
               break;
            case 58:
               var10000 = 220;
               break;
            case 59:
               var10000 = 79;
               break;
            case 60:
               var10000 = 59;
               break;
            case 61:
               var10000 = 81;
               break;
            case 62:
               var10000 = 97;
               break;
            case 63:
               var10000 = 196;
               break;
            case 64:
               var10000 = 95;
               break;
            case 65:
               var10000 = 12;
               break;
            case 66:
               var10000 = 166;
               break;
            case 67:
               var10000 = 80;
               break;
            case 68:
               var10000 = 198;
               break;
            case 69:
               var10000 = 94;
               break;
            case 70:
               var10000 = 71;
               break;
            case 71:
               var10000 = 201;
               break;
            case 72:
               var10000 = 75;
               break;
            case 73:
               var10000 = 199;
               break;
            case 74:
               var10000 = 144;
               break;
            case 75:
               var10000 = 111;
               break;
            case 76:
               var10000 = 108;
               break;
            case 77:
               var10000 = 18;
               break;
            case 78:
               var10000 = 195;
               break;
            case 79:
               var10000 = 39;
               break;
            case 80:
               var10000 = 204;
               break;
            case 81:
               var10000 = 40;
               break;
            case 82:
               var10000 = 178;
               break;
            case 83:
               var10000 = 250;
               break;
            case 84:
               var10000 = 25;
               break;
            case 85:
               var10000 = 46;
               break;
            case 86:
               var10000 = 213;
               break;
            case 87:
               var10000 = 242;
               break;
            case 88:
               var10000 = 6;
               break;
            case 89:
               var10000 = 200;
               break;
            case 90:
               var10000 = 60;
               break;
            case 91:
               var10000 = 208;
               break;
            case 92:
               var10000 = 48;
               break;
            case 93:
               var10000 = 42;
               break;
            case 94:
               var10000 = 38;
               break;
            case 95:
               var10000 = 53;
               break;
            case 96:
               var10000 = 164;
               break;
            case 97:
               var10000 = 133;
               break;
            case 98:
               var10000 = 118;
               break;
            case 99:
               var10000 = 125;
               break;
            case 100:
               var10000 = 88;
               break;
            case 101:
               var10000 = 139;
               break;
            case 102:
               var10000 = 239;
               break;
            case 103:
               var10000 = 249;
               break;
            case 104:
               var10000 = 168;
               break;
            case 105:
               var10000 = 114;
               break;
            case 106:
               var10000 = 186;
               break;
            case 107:
               var10000 = 134;
               break;
            case 108:
               var10000 = 225;
               break;
            case 109:
               var10000 = 66;
               break;
            case 110:
               var10000 = 116;
               break;
            case 111:
               var10000 = 72;
               break;
            case 112:
               var10000 = 84;
               break;
            case 113:
               var10000 = 103;
               break;
            case 114:
               var10000 = 28;
               break;
            case 115:
               var10000 = 229;
               break;
            case 116:
               var10000 = 36;
               break;
            case 117:
               var10000 = 109;
               break;
            case 118:
               var10000 = 124;
               break;
            case 119:
               var10000 = 233;
               break;
            case 120:
               var10000 = 113;
               break;
            case 121:
               var10000 = 194;
               break;
            case 122:
               var10000 = 182;
               break;
            case 123:
               var10000 = 203;
               break;
            case 124:
               var10000 = 123;
               break;
            case 125:
               var10000 = 55;
               break;
            case 126:
               var10000 = 47;
               break;
            case 127:
               var10000 = 24;
               break;
            case 128:
               var10000 = 234;
               break;
            case 129:
               var10000 = 155;
               break;
            case 130:
               var10000 = 27;
               break;
            case 131:
               var10000 = 7;
               break;
            case 132:
               var10000 = 96;
               break;
            case 133:
               var10000 = 140;
               break;
            case 134:
               var10000 = 13;
               break;
            case 135:
               var10000 = 217;
               break;
            case 136:
               var10000 = 29;
               break;
            case 137:
               var10000 = 173;
               break;
            case 138:
               var10000 = 145;
               break;
            case 139:
               var10000 = 32;
               break;
            case 140:
               var10000 = 255;
               break;
            case 141:
               var10000 = 154;
               break;
            case 142:
               var10000 = 223;
               break;
            case 143:
               var10000 = 16;
               break;
            case 144:
               var10000 = 67;
               break;
            case 145:
               var10000 = 216;
               break;
            case 146:
               var10000 = 10;
               break;
            case 147:
               var10000 = 251;
               break;
            case 148:
               var10000 = 142;
               break;
            case 149:
               var10000 = 170;
               break;
            case 150:
               var10000 = 189;
               break;
            case 151:
               var10000 = 211;
               break;
            case 152:
               var10000 = 127;
               break;
            case 153:
               var10000 = 99;
               break;
            case 154:
               var10000 = 35;
               break;
            case 155:
               var10000 = 167;
               break;
            case 156:
               var10000 = 248;
               break;
            case 157:
               var10000 = 69;
               break;
            case 158:
               var10000 = 143;
               break;
            case 159:
               var10000 = 128;
               break;
            case 160:
               var10000 = 150;
               break;
            case 161:
               var10000 = 218;
               break;
            case 162:
               var10000 = 247;
               break;
            case 163:
               var10000 = 141;
               break;
            case 164:
               var10000 = 4;
               break;
            case 165:
               var10000 = 63;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 91;
               break;
            case 168:
               var10000 = 119;
               break;
            case 169:
               var10000 = 65;
               break;
            case 170:
               var10000 = 62;
               break;
            case 171:
               var10000 = 175;
               break;
            case 172:
               var10000 = 54;
               break;
            case 173:
               var10000 = 43;
               break;
            case 174:
               var10000 = 174;
               break;
            case 175:
               var10000 = 232;
               break;
            case 176:
               var10000 = 112;
               break;
            case 177:
               var10000 = 190;
               break;
            case 178:
               var10000 = 77;
               break;
            case 179:
               var10000 = 87;
               break;
            case 180:
               var10000 = 214;
               break;
            case 181:
               var10000 = 193;
               break;
            case 182:
               var10000 = 246;
               break;
            case 183:
               var10000 = 252;
               break;
            case 184:
               var10000 = 85;
               break;
            case 185:
               var10000 = 130;
               break;
            case 186:
               var10000 = 117;
               break;
            case 187:
               var10000 = 115;
               break;
            case 188:
               var10000 = 104;
               break;
            case 189:
               var10000 = 236;
               break;
            case 190:
               var10000 = 227;
               break;
            case 191:
               var10000 = 228;
               break;
            case 192:
               var10000 = 126;
               break;
            case 193:
               var10000 = 52;
               break;
            case 194:
               var10000 = 244;
               break;
            case 195:
               var10000 = 90;
               break;
            case 196:
               var10000 = 98;
               break;
            case 197:
               var10000 = 51;
               break;
            case 198:
               var10000 = 1;
               break;
            case 199:
               var10000 = 30;
               break;
            case 200:
               var10000 = 122;
               break;
            case 201:
               var10000 = 183;
               break;
            case 202:
               var10000 = 219;
               break;
            case 203:
               var10000 = 158;
               break;
            case 204:
               var10000 = 68;
               break;
            case 205:
               var10000 = 179;
               break;
            case 206:
               var10000 = 151;
               break;
            case 207:
               var10000 = 177;
               break;
            case 208:
               var10000 = 17;
               break;
            case 209:
               var10000 = 153;
               break;
            case 210:
               var10000 = 188;
               break;
            case 211:
               var10000 = 9;
               break;
            case 212:
               var10000 = 23;
               break;
            case 213:
               var10000 = 34;
               break;
            case 214:
               var10000 = 58;
               break;
            case 215:
               var10000 = 184;
               break;
            case 216:
               var10000 = 101;
               break;
            case 217:
               var10000 = 192;
               break;
            case 218:
               var10000 = 45;
               break;
            case 219:
               var10000 = 160;
               break;
            case 220:
               var10000 = 226;
               break;
            case 221:
               var10000 = 221;
               break;
            case 222:
               var10000 = 56;
               break;
            case 223:
               var10000 = 212;
               break;
            case 224:
               var10000 = 243;
               break;
            case 225:
               var10000 = 137;
               break;
            case 226:
               var10000 = 74;
               break;
            case 227:
               var10000 = 22;
               break;
            case 228:
               var10000 = 64;
               break;
            case 229:
               var10000 = 149;
               break;
            case 230:
               var10000 = 102;
               break;
            case 231:
               var10000 = 254;
               break;
            case 232:
               var10000 = 41;
               break;
            case 233:
               var10000 = 5;
               break;
            case 234:
               var10000 = 44;
               break;
            case 235:
               var10000 = 210;
               break;
            case 236:
               var10000 = 163;
               break;
            case 237:
               var10000 = 146;
               break;
            case 238:
               var10000 = 156;
               break;
            case 239:
               var10000 = 147;
               break;
            case 240:
               var10000 = 171;
               break;
            case 241:
               var10000 = 86;
               break;
            case 242:
               var10000 = 26;
               break;
            case 243:
               var10000 = 238;
               break;
            case 244:
               var10000 = 253;
               break;
            case 245:
               var10000 = 57;
               break;
            case 246:
               var10000 = 92;
               break;
            case 247:
               var10000 = 105;
               break;
            case 248:
               var10000 = 14;
               break;
            case 249:
               var10000 = 132;
               break;
            case 250:
               var10000 = 215;
               break;
            case 251:
               var10000 = 159;
               break;
            case 252:
               var10000 = 241;
               break;
            case 253:
               var10000 = 31;
               break;
            case 254:
               var10000 = 2;
               break;
            default:
               var10000 = 131;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30352;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





