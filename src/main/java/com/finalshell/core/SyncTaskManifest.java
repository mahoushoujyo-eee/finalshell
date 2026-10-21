package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.O0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SyncTaskManifest {
   public HashMap E;
   public String R;
   public String h;
   public String U;
   public HashMap z;
   public String g;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public SyncTaskManifest() {
      HashMap var10001 = new HashMap();
      long var2 = 391607802633599413L;
      HashMap var1 = var10001;
      Ref.s(391607802633599413L, var1, var2);
      Registry.packArgs(a(10897, 2363943096906769898L));
      long var3 = 502006739469260406L;
      Object var10003 = Ref.h2(502006739469260406L, var3);
      long var6 = 398347637158760993L;
      Object var5 = var10003;
      Ref.s(398347637158760993L, var5, var6);
      HashMap var10004 = new HashMap();
      long var8 = 401974538554105581L;
      HashMap var7 = var10004;
      Ref.s(401974538554105581L, var7, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 603168400635788610L;
      Object[] var9 = var10005;
      Ref.h(603168400635788610L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public void c(String var1, long var2) {
      Object var4 = 401974538554105581L;
      ((HashMap)Ref.g(401974538554105581L, var4)).put(var1, var2);
   }

   public void M(String var1) {
      Object var2 = 401974538554105581L;
      ((HashMap)Ref.g(401974538554105581L, var2)).get(var1);
   }

   public HashMap u() {
      Object var1 = 401974538554105581L;
      return (HashMap)Ref.g(401974538554105581L, var1);
   }

   public void J(HashMap var1) {
      long var3 = 401974538554105581L;
      Ref.s(401974538554105581L, var1, var3);
   }

   public void D(Kb4 var1) {
      Object var2 = 391607802633599413L;
      HashMap var10001 = (HashMap)Ref.g(391607802633599413L, var2);
      String var10003 = (String)(Registry.emptyArgs());
      long var5 = 409296122673684019L;
      Object var4 = var10003;
      var10003 = Ref.h(409296122673684019L, var4, var5);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var1.put(var10003, var1);
   }

   public boolean t(String var1) {
      Object var2 = 391607802633599413L;
      return ((HashMap)Ref.g(391607802633599413L, var2)).containsKey(var1);
   }

   public Kb4 P(String var1) {
      Object var2 = 391607802633599413L;
      return (Kb4)((HashMap)Ref.g(391607802633599413L, var2)).get(var1);
   }

   public void r() throws Exception {
      Object var3 = 127784458436744135L;
      Registry.packArgs(Ref.g(127784458436744135L, var3));
      long var5 = 340002508208074194L;
      Object var10002 = Ref.h2(340002508208074194L, var5);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      String var1 = (String)var10002;
      O0 var2 = O0.y(var1);
      Object[] var10003 = Registry.packArgs(var2);
      long var8 = 501363902111223139L;
      Object[] var7 = var10003;
      Ref.h(501363902111223139L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public ArrayList m$ArrayList() {
      boolean var14;
      boolean var10000 = Ln4_2.R();
      ArrayList var2 = new ArrayList();
      boolean var1 = var10000;
      Object var6 = 391607802633599413L;

      for (String var4 : ((HashMap)Ref.g(391607802633599413L, var6)).keySet()) {
         Object var8 = 391607802633599413L;
         Kb4 var5 = (Kb4)((HashMap)Ref.g(391607802633599413L, var8)).get(var4);
         Object var10003 = Registry.emptyArgs();
         long var11 = 457396111797172179L;
         Object var10 = var10003;
         var10003 = Ref.h(457396111797172179L, var10, var11);

         try {
            var14 = (Boolean)var10003;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         if (!var1 && !var14) {
            var2.add(var5);
         }

         if (var1) {
            break;
         }
      }

      return var2;
   }

   public void E() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ln4_2.i ()Z
      // 003: new java/lang/StringBuffer
      // 006: dup
      // 007: invokespecial java/lang/StringBuffer.<init> ()V
      // 00a: astore 2
      // 00b: istore 1
      // 00c: aload 2
      // 00d: new java/lang/StringBuilder
      // 010: dup
      // 011: invokespecial java/lang/StringBuilder.<init> ()V
      // 014: ldc2_w 322398614556294006
      // 017: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01a: aconst_null
      // 01b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 01e: checkcast java/lang/String
      // 021: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 024: ldc "#"
      // 026: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 029: aload 0
      // 02a: ldc2_w 398347637158760993
      // 02d: astore 10
      // 02f: ldc2_w 398347637158760993
      // 032: aload 10
      // 034: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 037: checkcast java/lang/String
      // 03a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03d: ldc "#"
      // 03f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 042: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 045: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 048: pop
      // 049: invokestatic java/net/NetworkInterface.getNetworkInterfaces ()Ljava/util/Enumeration;
      // 04c: astore 4
      // 04e: new java/util/HashSet
      // 051: dup
      // 052: invokespecial java/util/HashSet.<init> ()V
      // 055: astore 6
      // 057: aload 4
      // 059: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 05e: ifeq 16e
      // 061: aload 4
      // 063: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 068: checkcast java/net/NetworkInterface
      // 06b: astore 5
      // 06d: iload 1
      // 06e: ifeq 1a5
      // 071: aload 5
      // 073: iload 1
      // 074: ifeq 08d
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/Lp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: invokevirtual java/net/NetworkInterface.isLoopback ()Z
      // 081: ifne 057
      // 084: goto 08b
      // 087: invokestatic com/finalshell/core/Lp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: aload 5
      // 08d: invokevirtual java/net/NetworkInterface.getHardwareAddress ()[B
      // 090: astore 7
      // 092: aload 7
      // 094: iload 1
      // 095: ifeq 0a4
      // 098: ifnull 16a
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/Lp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: aload 7
      // 0a4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a7: ldc2_w 569067797285016864
      // 0aa: astore 12
      // 0ac: ldc2_w 569067797285016864
      // 0af: aload 12
      // 0b1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b4: checkcast java/lang/Boolean
      // 0b7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ba: goto 0c1
      // 0bd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: ifne 16a
      // 0c4: new java/lang/StringBuilder
      // 0c7: dup
      // 0c8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cb: astore 8
      // 0cd: bipush 0
      // 0ce: istore 9
      // 0d0: iload 9
      // 0d2: aload 7
      // 0d4: arraylength
      // 0d5: if_icmpge 123
      // 0d8: aload 8
      // 0da: iload 1
      // 0db: ifeq 125
      // 0de: sipush -12214
      // 0e1: sipush 1691
      // 0e4: invokestatic com/finalshell/core/Lp2.a (II)Ljava/lang/String;
      // 0e7: bipush 2
      // 0e8: anewarray 4
      // 0eb: dup
      // 0ec: bipush 0
      // 0ed: aload 7
      // 0ef: iload 9
      // 0f1: baload
      // 0f2: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 0f5: aastore
      // 0f6: dup
      // 0f7: bipush 1
      // 0f8: iload 9
      // 0fa: aload 7
      // 0fc: arraylength
      // 0fd: bipush 1
      // 0fe: isub
      // 0ff: if_icmpge 112
      // 102: goto 109
      // 105: invokestatic com/finalshell/core/Lp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: ldc "-"
      // 10b: goto 114
      // 10e: invokestatic com/finalshell/core/Lp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: ldc ""
      // 114: aastore
      // 115: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: pop
      // 11c: iinc 9 1
      // 11f: iload 1
      // 120: ifne 0d0
      // 123: aload 8
      // 125: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 128: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 12b: astore 9
      // 12d: aload 6
      // 12f: aload 9
      // 131: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 134: iload 1
      // 135: ifeq 150
      // 138: ifne 16a
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/Lp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: aload 6
      // 144: aload 9
      // 146: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 149: goto 150
      // 14c: invokestatic com/finalshell/core/Lp2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: pop
      // 151: aload 2
      // 152: new java/lang/StringBuilder
      // 155: dup
      // 156: invokespecial java/lang/StringBuilder.<init> ()V
      // 159: aload 9
      // 15b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15e: ldc "#"
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 166: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 169: pop
      // 16a: iload 1
      // 16b: ifne 057
      // 16e: goto 178
      // 171: astore 4
      // 173: aload 4
      // 175: invokevirtual java/net/SocketException.printStackTrace ()V
      // 178: aload 0
      // 179: aload 2
      // 17a: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 17d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 180: ldc2_w 417955638237048558
      // 183: astore 14
      // 185: ldc2_w 417955638237048558
      // 188: aload 14
      // 18a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 18d: goto 194
      // 190: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 193: athrow
      // 194: ldc2_w 398210395952652425
      // 197: astore 17
      // 199: astore 16
      // 19b: ldc2_w 398210395952652425
      // 19e: aload 16
      // 1a0: aload 17
      // 1a2: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1a5: return
   }

   public void q(O0 var1) {
      long var14;
      long var30;
      boolean var53;
      O0 var54;
      Object[] var58;
      boolean var2;
      label153: {
         label152: {
            var2 = Ln4_2.R();
            if (!var2) {
               if (!var1.containsKey(a(-12219, -5872))) {
                  break label152;
               }

               String var10001 = var1.C$String(a(-12224, 21617));
               long var10 = 398347637158760993L;
               String var9 = var10001;
               Ref.s(398347637158760993L, var9, var10);
            }

            if (!var2) {
               break label153;
            }
         }

         Registry.packArgs(a(26333, 1958984523079952807L));
         long var11 = 502006739469260406L;
         Object var10002 = Ref.h2(502006739469260406L, var11);
         var14 = 398347637158760993L;
         Object var13 = var10002;
         Ref.s(398347637158760993L, var13, var14);
      }

      Object[] var48 = Registry.emptyArgs();
      long var16 = 603168400635788610L;
      Object[] var15 = var48;
      Ref.h(603168400635788610L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      O0 var49 = var1;
      String var50 = a(-12211, -28814);
      if (!var2) {
         if (var1.containsKey(var50)) {
            var50 = var1.C$String(a(-12216, 2132));
            long var18 = 521775360485855115L;
            String var17 = var50;
            Ref.s(521775360485855115L, var17, var18);
         }

         var49 = var1;
         var50 = a(-12220, 28970);
      }

      O0 var3 = var49.D(var50);
      Iterator var4 = var3.keySet().iterator();

      String var60;
      label157: {
         while (true) {
            if (var4.hasNext()) {
               String var5 = (String)var4.next();
               O0 var6 = var3.D(var5);
               Kb4 var7 = new Kb4();
               Object[] var52 = Registry.packArgs(var5);
               long var20 = 614144689610002785L;
               Object[] var19 = var52;
               Ref.h(614144689610002785L, var19, var20);

               try {
                  ;
               } catch (InvocationTargetException var37) {
                  throw var37.getTargetException();
               }

               var53 = var6.containsKey(a(-12210, 11989));
               if (var2) {
                  break;
               }

               if (!var2) {
                  if (var53) {
                     String var8 = var6.C$String(a(-12221, 20227)).trim();
                     Object[] var10003 = Registry.packArgs(var8);
                     long var22 = 118510466676659100L;
                     Object[] var21 = var10003;
                     Ref.h(118510466676659100L, var21, var22);

                     try {
                        ;
                     } catch (InvocationTargetException var43) {
                        throw var43.getTargetException();
                     }
                  }

                  var53 = var6.containsKey(a(-12213, 977));
               }

               if (!var2) {
                  if (var53) {
                     Object[] var55 = Registry.packArgs(var6.G(a(-12209, 30802)));
                     long var24 = 429807754394971521L;
                     Object[] var23 = var55;
                     Ref.h(429807754394971521L, var23, var24);

                     try {
                        ;
                     } catch (InvocationTargetException var42) {
                        throw var42.getTargetException();
                     }
                  }

                  var53 = var6.containsKey(a(-12217, 26833));
               }

               if (!var2) {
                  if (var53) {
                     Object[] var56 = Registry.packArgs(var6.C$String(a(-12206, 24059)));
                     long var26 = 523703751157895585L;
                     Object[] var25 = var56;
                     Ref.h(523703751157895585L, var25, var26);

                     try {
                        ;
                     } catch (InvocationTargetException var41) {
                        throw var41.getTargetException();
                     }
                  }

                  var53 = var6.containsKey(a(-12212, 30898));
               }

               if (!var2) {
                  if (var53) {
                     Object[] var57 = Registry.e(var6.h(a(-12208, -793)));
                     long var28 = 126253094796720256L;
                     Object[] var27 = var57;
                     Ref.h(126253094796720256L, var27, var28);

                     try {
                        ;
                     } catch (InvocationTargetException var40) {
                        throw var40.getTargetException();
                     }
                  }

                  var53 = var6.containsKey(a(-12218, -29074));
               }

               if (var53) {
                  var58 = Registry.packArgs(var6.C$String(a(-12222, 1463)));
                  var30 = 286234852922908329L;
                  Object[] var29 = var58;
                  Ref.h(286234852922908329L, var29, var30);

                  try {
                     ;
                  } catch (InvocationTargetException var39) {
                     throw var39.getTargetException();
                  }
               }

               Object[] var59 = Registry.packArgs(var7);
               long var32 = 357073955998294620L;
               Object[] var31 = var59;
               Ref.h(357073955998294620L, var31, var32);

               try {
                  ;
               } catch (InvocationTargetException var38) {
                  throw var38.getTargetException();
               }

               if (!var2) {
                  continue;
               }
            }

            Object var33 = 401974538554105581L;
            ((HashMap)Ref.g(401974538554105581L, var33)).clear();
            var54 = var1;
            var60 = a(-12215, -12981);
            if (var2) {
               break label157;
            }

            var53 = var1.containsKey(var60);
            break;
         }

         if (!var53) {
            return;
         }

         var54 = var1;
         var60 = a(-12223, 22305);
      }

      O0 var45 = var54.D(var60);

      for (String var47 : var45.keySet()) {
         Object var35 = 401974538554105581L;
         ((HashMap)Ref.g(401974538554105581L, var35)).put(var47, var45.h(var47));
         if (var2) {
            break;
         }
      }
   }

   public void O() {
      Boolean var53;
      Long var58;
      O0 var2 = new O0();
      Ln4_2.R();
      String var10002 = a(-12224, 21617);
      Object var8 = 398347637158760993L;
      var10002.C(this, (String)Ref.g(398347637158760993L, var8));
      String var10003 = a(-12206, 24059);
      Object var10 = 398210395952652425L;
      var10003.C(this, (String)Ref.g(398210395952652425L, var10));
      String var10004 = a(-12216, 2132);
      Object var12 = 521775360485855115L;
      var10004.C(this, (String)Ref.g(521775360485855115L, var12));
      O0 var3 = new O0();
      O0 var1 = var2;
      var2.C(a(-12207, -18746), var3);
      Object var14 = 391607802633599413L;
      Iterator var4 = ((HashMap)Ref.g(391607802633599413L, var14)).keySet().iterator();

      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            Object var16 = 391607802633599413L;
            Kb4 var6 = (Kb4)((HashMap)Ref.g(391607802633599413L, var16)).get(var5);
            O0 var7 = new O0();

            try {
               StringBuilder var10006 = new StringBuilder();
               String var10008 = (String)(Registry.emptyArgs());
               long var19 = 409296122673684019L;
               Object var18 = var10008;
               var10008 = Ref.h(409296122673684019L, var18, var19);

               try {
                  var10008 = (String)var10008;
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }

               var10006.C(var6.append((String)var10008).append("").toString(), var7);
               String var10007 = a(-12221, 20227);
               String var10009 = (String)(Registry.emptyArgs());
               long var21 = 118781644472573462L;
               Object var20 = var10009;
               var10009 = Ref.h(118781644472573462L, var20, var21);

               try {
                  var10009 = (String)var10009;
               } catch (InvocationTargetException var40) {
                  throw var40.getTargetException();
               }

               var10007.C(var6, var10009);
               String var48 = a(-12209, 30802);
               Object var10010 = Registry.emptyArgs();
               long var23 = 457396111797172179L;
               Object var22 = var10010;
               var10010 = Ref.h(457396111797172179L, var22, var23);

               try {
                  var53 = (Boolean)var10010;
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }

               var48.C(var6, var53);
               String var51 = a(-12206, 24059);
               String var10011 = (String)(Registry.emptyArgs());
               long var25 = 321444386962616854L;
               Object var24 = var10011;
               var10011 = Ref.h(321444386962616854L, var24, var25);

               try {
                  var10011 = (String)var10011;
               } catch (InvocationTargetException var38) {
                  throw var38.getTargetException();
               }

               var51.C(var6, var10011);
               String var54 = a(-12208, -793);
               Object var10012 = Registry.emptyArgs();
               long var27 = 561034201633722257L;
               Object var26 = var10012;
               var10012 = Ref.h(561034201633722257L, var26, var27);

               try {
                  var58 = (Long)var10012;
               } catch (InvocationTargetException var37) {
                  throw var37.getTargetException();
               }

               var54.C(var6, var58);
               if (var1 == null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            } catch (Exception var42) {
               throw a(var42);
            }
         }

         String var10005 = a(-12223, 22305);
         O0 var43 = (O0)(Registry.emptyArgs());
         long var29 = 370915375706743462L;
         Object var28 = var43;
         var43 = Ref.h(370915375706743462L, var28, var29);

         try {
            var43 = (O0)var43;
         } catch (InvocationTargetException var36) {
            throw var36.getTargetException();
         }

         var10005.C(this, var43);

         try {
            var2.toString();
            Object var30 = 127784458436744135L;
            Registry.packArgs(this, Ref.g(127784458436744135L, var30));
            long var32 = 373871880855596298L;
            Ref.h2(373871880855596298L, var32);

            try {
               ;
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }
         } catch (Exception var35) {
            var35.printStackTrace();
         }
         break;
      }
   }

   public void d(O0 var1) {
      boolean var10000 = Ln4_2.i();
      Iterator var3 = var1.keySet().iterator();
      boolean var2 = var10000;

      while (var3.hasNext()) {
         String var4;
         long var5;
         int var16;
         label33: {
            byte var7;
            label41: {
               var4 = (String)var3.next();
               var5 = var1.h(var4);
               var7 = 0;
               Object var10 = 401974538554105581L;
               Object var10001 = (HashMap)Ref.g(401974538554105581L, var10);
               Object var10002 = var4;
               if (var2) {
                  if (!var10001.containsKey(var4)) {
                     var7 = 1;
                     if (var2) {
                        break label41;
                     }
                  }

                  var10001 = this;
                  Object var12 = 401974538554105581L;
                  var10002 = (HashMap)Ref.g(401974538554105581L, var12);
               }

               long var8 = (Long)var10001.get(var10002);
               long var17;
               var16 = (var17 = var5 - var8) == 0L ? 0 : (var17 < 0L ? -1 : 1);
               if (!var2) {
                  break label33;
               }

               if (var16 > 0) {
                  var7 = 1;
               }
            }

            var16 = var7;
         }

         if (var16 != 0) {
            Object var14 = 401974538554105581L;
            ((HashMap)Ref.g(401974538554105581L, var14)).put(var4, var5);
         }

         if (!var2) {
            break;
         }
      }
   }

   public O0 M() {
      Ln4_2.i();
      O0 var2 = new O0();
      Object var5 = 401974538554105581L;
      Iterator var3 = ((HashMap)Ref.g(401974538554105581L, var5)).keySet().iterator();
      SyncTaskManifest var1 = this;

      O0 var10001;
      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();
            var10001 = var2;
            if (var1 == null) {
               break;
            }

            Object var7 = 401974538554105581L;
            var4.C(this, ((HashMap)Ref.g(401974538554105581L, var7)).get(var4));
            if (var1 == null) {
               continue;
            }
         }

         var10001 = var2;
         break;
      }

      return var10001;
   }

   public String C() {
      Object var1 = 127784458436744135L;
      return (String)Ref.g(127784458436744135L, var1);
   }

   public void A(String var1) {
      long var3 = 127784458436744135L;
      Ref.s(127784458436744135L, var1, var3);
   }

   public HashMap y() {
      Object var1 = 391607802633599413L;
      return (HashMap)Ref.g(391607802633599413L, var1);
   }

   public void s(HashMap var1) {
      long var3 = 391607802633599413L;
      Ref.s(391607802633599413L, var1, var3);
   }

   public String P() {
      Object var1 = 398210395952652425L;
      return (String)Ref.g(398210395952652425L, var1);
   }

   public String R() {
      Object var1 = 398347637158760993L;
      return (String)Ref.g(398347637158760993L, var1);
   }

   public String g() {
      Object var1 = 521775360485855115L;
      return (String)Ref.g(521775360485855115L, var1);
   }

   public String m$String() {
      String var1 = "";

      try {
         Object var3 = 521775360485855115L;
         Registry.packArgs(Ref.g(521775360485855115L, var3));
         long var5 = 556691693894836467L;
         Object var10002 = Ref.h2(556691693894836467L, var5);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var1 = (String)var10002;
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      return var1;
   }

   public void I(String var1) {
      long var3 = 521775360485855115L;
      Ref.s(521775360485855115L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -12224) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 182;
               break;
            case 1:
               var10000 = 237;
               break;
            case 2:
               var10000 = 5;
               break;
            case 3:
               var10000 = 224;
               break;
            case 4:
               var10000 = 71;
               break;
            case 5:
               var10000 = 117;
               break;
            case 6:
               var10000 = 92;
               break;
            case 7:
               var10000 = 103;
               break;
            case 8:
               var10000 = 218;
               break;
            case 9:
               var10000 = 171;
               break;
            case 10:
               var10000 = 185;
               break;
            case 11:
               var10000 = 191;
               break;
            case 12:
               var10000 = 6;
               break;
            case 13:
               var10000 = 98;
               break;
            case 14:
               var10000 = 135;
               break;
            case 15:
               var10000 = 70;
               break;
            case 16:
               var10000 = 72;
               break;
            case 17:
               var10000 = 42;
               break;
            case 18:
               var10000 = 26;
               break;
            case 19:
               var10000 = 43;
               break;
            case 20:
               var10000 = 99;
               break;
            case 21:
               var10000 = 4;
               break;
            case 22:
               var10000 = 114;
               break;
            case 23:
               var10000 = 100;
               break;
            case 24:
               var10000 = 143;
               break;
            case 25:
               var10000 = 213;
               break;
            case 26:
               var10000 = 54;
               break;
            case 27:
               var10000 = 17;
               break;
            case 28:
               var10000 = 60;
               break;
            case 29:
               var10000 = 20;
               break;
            case 30:
               var10000 = 101;
               break;
            case 31:
               var10000 = 198;
               break;
            case 32:
               var10000 = 136;
               break;
            case 33:
               var10000 = 226;
               break;
            case 34:
               var10000 = 46;
               break;
            case 35:
               var10000 = 132;
               break;
            case 36:
               var10000 = 230;
               break;
            case 37:
               var10000 = 34;
               break;
            case 38:
               var10000 = 201;
               break;
            case 39:
               var10000 = 158;
               break;
            case 40:
               var10000 = 106;
               break;
            case 41:
               var10000 = 128;
               break;
            case 42:
               var10000 = 155;
               break;
            case 43:
               var10000 = 110;
               break;
            case 44:
               var10000 = 22;
               break;
            case 45:
               var10000 = 221;
               break;
            case 46:
               var10000 = 122;
               break;
            case 47:
               var10000 = 179;
               break;
            case 48:
               var10000 = 212;
               break;
            case 49:
               var10000 = 146;
               break;
            case 50:
               var10000 = 82;
               break;
            case 51:
               var10000 = 27;
               break;
            case 52:
               var10000 = 129;
               break;
            case 53:
               var10000 = 200;
               break;
            case 54:
               var10000 = 220;
               break;
            case 55:
               var10000 = 112;
               break;
            case 56:
               var10000 = 108;
               break;
            case 57:
               var10000 = 141;
               break;
            case 58:
               var10000 = 210;
               break;
            case 59:
               var10000 = 74;
               break;
            case 60:
               var10000 = 163;
               break;
            case 61:
               var10000 = 164;
               break;
            case 62:
               var10000 = 208;
               break;
            case 63:
               var10000 = 69;
               break;
            case 64:
               var10000 = 215;
               break;
            case 65:
               var10000 = 107;
               break;
            case 66:
               var10000 = 41;
               break;
            case 67:
               var10000 = 124;
               break;
            case 68:
               var10000 = 168;
               break;
            case 69:
               var10000 = 96;
               break;
            case 70:
               var10000 = 246;
               break;
            case 71:
               var10000 = 252;
               break;
            case 72:
               var10000 = 255;
               break;
            case 73:
               var10000 = 52;
               break;
            case 74:
               var10000 = 150;
               break;
            case 75:
               var10000 = 75;
               break;
            case 76:
               var10000 = 29;
               break;
            case 77:
               var10000 = 231;
               break;
            case 78:
               var10000 = 65;
               break;
            case 79:
               var10000 = 242;
               break;
            case 80:
               var10000 = 160;
               break;
            case 81:
               var10000 = 239;
               break;
            case 82:
               var10000 = 36;
               break;
            case 83:
               var10000 = 170;
               break;
            case 84:
               var10000 = 109;
               break;
            case 85:
               var10000 = 53;
               break;
            case 86:
               var10000 = 187;
               break;
            case 87:
               var10000 = 49;
               break;
            case 88:
               var10000 = 97;
               break;
            case 89:
               var10000 = 159;
               break;
            case 90:
               var10000 = 133;
               break;
            case 91:
               var10000 = 149;
               break;
            case 92:
               var10000 = 238;
               break;
            case 93:
               var10000 = 222;
               break;
            case 94:
               var10000 = 80;
               break;
            case 95:
               var10000 = 88;
               break;
            case 96:
               var10000 = 14;
               break;
            case 97:
               var10000 = 205;
               break;
            case 98:
               var10000 = 56;
               break;
            case 99:
               var10000 = 189;
               break;
            case 100:
               var10000 = 64;
               break;
            case 101:
               var10000 = 83;
               break;
            case 102:
               var10000 = 59;
               break;
            case 103:
               var10000 = 50;
               break;
            case 104:
               var10000 = 12;
               break;
            case 105:
               var10000 = 38;
               break;
            case 106:
               var10000 = 137;
               break;
            case 107:
               var10000 = 45;
               break;
            case 108:
               var10000 = 51;
               break;
            case 109:
               var10000 = 11;
               break;
            case 110:
               var10000 = 19;
               break;
            case 111:
               var10000 = 247;
               break;
            case 112:
               var10000 = 131;
               break;
            case 113:
               var10000 = 23;
               break;
            case 114:
               var10000 = 121;
               break;
            case 115:
               var10000 = 207;
               break;
            case 116:
               var10000 = 165;
               break;
            case 117:
               var10000 = 39;
               break;
            case 118:
               var10000 = 138;
               break;
            case 119:
               var10000 = 63;
               break;
            case 120:
               var10000 = 0;
               break;
            case 121:
               var10000 = 181;
               break;
            case 122:
               var10000 = 7;
               break;
            case 123:
               var10000 = 253;
               break;
            case 124:
               var10000 = 125;
               break;
            case 125:
               var10000 = 197;
               break;
            case 126:
               var10000 = 184;
               break;
            case 127:
               var10000 = 173;
               break;
            case 128:
               var10000 = 178;
               break;
            case 129:
               var10000 = 192;
               break;
            case 130:
               var10000 = 24;
               break;
            case 131:
               var10000 = 89;
               break;
            case 132:
               var10000 = 77;
               break;
            case 133:
               var10000 = 25;
               break;
            case 134:
               var10000 = 37;
               break;
            case 135:
               var10000 = 111;
               break;
            case 136:
               var10000 = 145;
               break;
            case 137:
               var10000 = 130;
               break;
            case 138:
               var10000 = 8;
               break;
            case 139:
               var10000 = 2;
               break;
            case 140:
               var10000 = 44;
               break;
            case 141:
               var10000 = 174;
               break;
            case 142:
               var10000 = 176;
               break;
            case 143:
               var10000 = 228;
               break;
            case 144:
               var10000 = 236;
               break;
            case 145:
               var10000 = 140;
               break;
            case 146:
               var10000 = 249;
               break;
            case 147:
               var10000 = 81;
               break;
            case 148:
               var10000 = 10;
               break;
            case 149:
               var10000 = 3;
               break;
            case 150:
               var10000 = 105;
               break;
            case 151:
               var10000 = 62;
               break;
            case 152:
               var10000 = 48;
               break;
            case 153:
               var10000 = 248;
               break;
            case 154:
               var10000 = 115;
               break;
            case 155:
               var10000 = 209;
               break;
            case 156:
               var10000 = 116;
               break;
            case 157:
               var10000 = 87;
               break;
            case 158:
               var10000 = 58;
               break;
            case 159:
               var10000 = 127;
               break;
            case 160:
               var10000 = 91;
               break;
            case 161:
               var10000 = 28;
               break;
            case 162:
               var10000 = 232;
               break;
            case 163:
               var10000 = 180;
               break;
            case 164:
               var10000 = 118;
               break;
            case 165:
               var10000 = 157;
               break;
            case 166:
               var10000 = 104;
               break;
            case 167:
               var10000 = 113;
               break;
            case 168:
               var10000 = 142;
               break;
            case 169:
               var10000 = 166;
               break;
            case 170:
               var10000 = 161;
               break;
            case 171:
               var10000 = 250;
               break;
            case 172:
               var10000 = 94;
               break;
            case 173:
               var10000 = 214;
               break;
            case 174:
               var10000 = 223;
               break;
            case 175:
               var10000 = 66;
               break;
            case 176:
               var10000 = 95;
               break;
            case 177:
               var10000 = 123;
               break;
            case 178:
               var10000 = 47;
               break;
            case 179:
               var10000 = 126;
               break;
            case 180:
               var10000 = 211;
               break;
            case 181:
               var10000 = 68;
               break;
            case 182:
               var10000 = 235;
               break;
            case 183:
               var10000 = 13;
               break;
            case 184:
               var10000 = 33;
               break;
            case 185:
               var10000 = 186;
               break;
            case 186:
               var10000 = 202;
               break;
            case 187:
               var10000 = 195;
               break;
            case 188:
               var10000 = 188;
               break;
            case 189:
               var10000 = 40;
               break;
            case 190:
               var10000 = 206;
               break;
            case 191:
               var10000 = 147;
               break;
            case 192:
               var10000 = 15;
               break;
            case 193:
               var10000 = 219;
               break;
            case 194:
               var10000 = 85;
               break;
            case 195:
               var10000 = 153;
               break;
            case 196:
               var10000 = 55;
               break;
            case 197:
               var10000 = 243;
               break;
            case 198:
               var10000 = 240;
               break;
            case 199:
               var10000 = 229;
               break;
            case 200:
               var10000 = 199;
               break;
            case 201:
               var10000 = 233;
               break;
            case 202:
               var10000 = 16;
               break;
            case 203:
               var10000 = 35;
               break;
            case 204:
               var10000 = 148;
               break;
            case 205:
               var10000 = 30;
               break;
            case 206:
               var10000 = 244;
               break;
            case 207:
               var10000 = 1;
               break;
            case 208:
               var10000 = 225;
               break;
            case 209:
               var10000 = 154;
               break;
            case 210:
               var10000 = 167;
               break;
            case 211:
               var10000 = 139;
               break;
            case 212:
               var10000 = 120;
               break;
            case 213:
               var10000 = 144;
               break;
            case 214:
               var10000 = 177;
               break;
            case 215:
               var10000 = 79;
               break;
            case 216:
               var10000 = 151;
               break;
            case 217:
               var10000 = 234;
               break;
            case 218:
               var10000 = 57;
               break;
            case 219:
               var10000 = 241;
               break;
            case 220:
               var10000 = 152;
               break;
            case 221:
               var10000 = 190;
               break;
            case 222:
               var10000 = 86;
               break;
            case 223:
               var10000 = 76;
               break;
            case 224:
               var10000 = 204;
               break;
            case 225:
               var10000 = 32;
               break;
            case 226:
               var10000 = 90;
               break;
            case 227:
               var10000 = 73;
               break;
            case 228:
               var10000 = 67;
               break;
            case 229:
               var10000 = 84;
               break;
            case 230:
               var10000 = 93;
               break;
            case 231:
               var10000 = 193;
               break;
            case 232:
               var10000 = 61;
               break;
            case 233:
               var10000 = 251;
               break;
            case 234:
               var10000 = 196;
               break;
            case 235:
               var10000 = 78;
               break;
            case 236:
               var10000 = 194;
               break;
            case 237:
               var10000 = 102;
               break;
            case 238:
               var10000 = 18;
               break;
            case 239:
               var10000 = 21;
               break;
            case 240:
               var10000 = 216;
               break;
            case 241:
               var10000 = 134;
               break;
            case 242:
               var10000 = 254;
               break;
            case 243:
               var10000 = 169;
               break;
            case 244:
               var10000 = 203;
               break;
            case 245:
               var10000 = 162;
               break;
            case 246:
               var10000 = 183;
               break;
            case 247:
               var10000 = 172;
               break;
            case 248:
               var10000 = 227;
               break;
            case 249:
               var10000 = 119;
               break;
            case 250:
               var10000 = 175;
               break;
            case 251:
               var10000 = 9;
               break;
            case 252:
               var10000 = 245;
               break;
            case 253:
               var10000 = 156;
               break;
            case 254:
               var10000 = 217;
               break;
            default:
               var10000 = 31;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20346;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      int var58;
      String[] var13 = new String[19];
      int var11 = 0;
      String var10 = "ëº\u0093\nTB\tÃs\"47%\t4?\u0007\u001e\u0001oÊþ_|\tæBÉ\u0015¶Ö=N+\u0005\u0080\u009b\u0005.\u0003\u0006r[ 62Å\u0007\u0082³ü\u009c\u008c\u00952\u0007\u0007ÔºÀ$¤j\b0¢Ø\u0016@cÝÐ\t8ð]DØ+ôõ\u0080\u0006\u0006Ù )tÖ\u0006\u00105ct\u0004²\u000b[KÒHÖòA¹Qsw\bx\u0013Ñ a¥ù\b\tC¨}H }ï;q\u0006¢¯5'ÎØ\u000bBóñ_²\u0010ÍåÀøE";
      int var12 = "ëº\u0093\nTB\tÃs\"47%\t4?\u0007\u001e\u0001oÊþ_|\tæBÉ\u0015¶Ö=N+\u0005\u0080\u009b\u0005.\u0003\u0006r[ 62Å\u0007\u0082³ü\u009c\u008c\u00952\u0007\u0007ÔºÀ$¤j\b0¢Ø\u0016@cÝÐ\t8ð]DØ+ôõ\u0080\u0006\u0006Ù )tÖ\u0006\u00105ct\u0004²\u000b[KÒHÖòA¹Qsw\bx\u0013Ñ a¥ù\b\tC¨}H }ï;q\u0006¢¯5'ÎØ\u000bBóñ_²\u0010ÍåÀøE"
         .length();
      char var9 = 6;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 44;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  switch (var14 % 7) {
                     case 0:
                        var58 = 120;
                        break;
                     case 1:
                        var58 = 39;
                        break;
                     case 2:
                        var58 = 117;
                        break;
                     case 3:
                        var58 = 49;
                        break;
                     case 4:
                        var58 = 54;
                        break;
                     case 5:
                        var58 = 92;
                        break;
                     default:
                        var58 = 81;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[19];
                     long var0 = 6310812272046531851L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "®íÈ¸-)L¤\u009cñÎ¤\u0097ß\u0000ñ";
                     int var5 = "®íÈ¸-)L¤\u009cñÎ¤\u0097ß\u0000ñ".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "L\f\u0017WÊ\u0007+Ã´©n\u0002¨";
                  var12 = "L\f\u0017WÊ\u0007+Ã´©n\u0002¨".length();
                  var9 = 5;
                  var16 = -1;
            }

            var10000 = 75;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





