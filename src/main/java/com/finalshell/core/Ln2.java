package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.OW;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Ln2 {
   public static String a;
   public static String P;
   public SyncTaskManifest Y;
   public boolean l;
   public Fc2 L;
   public long B;
   public boolean r;
   public static int g;
   public boolean f;
   public boolean i;
   public boolean F;
   public static String[] b;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;
   public static long h;

   public Ln2() {
      Registry.lookupField(332321940581820142L).setBoolean(this, false);
      Registry.lookupField(271573489181596787L).setBoolean(this, false);
      Registry.lookupField(318034124640435565L).setBoolean(this, false);
      Registry.lookupField(397428683957266165L).setBoolean(this, false);
      Registry.lookupField(257898823081515939L).setBoolean(this, false);
      Registry.emptyArgs();
      long var2 = 270389152141252877L;
      Ref.h2(270389152141252877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 375944019649708240L;
      Object[] var4 = var10002;
      Ref.h(375944019649708240L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var7 = 243112970360128676L;
      Object[] var6 = var10003;
      Ref.h(243112970360128676L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10004 = Registry.packArgs(new OW(this), a(7133, 1499044533883268447L));
      long var9 = 201859364639460244L;
      Object[] var8 = var10004;
      Ref.h(201859364639460244L, var8, var9);
   }

   public void i() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.Yn2(this), a(24929, 3120902970514020322L));
      long var2 = 201859364639460244L;
      Object[] var1 = var10001;
      Ref.h(201859364639460244L, var1, var2);
   }

   public void Q(int param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: sipush 28558
      // 003: invokestatic com/finalshell/core/Ln4_2.R ()Z
      // 006: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 009: ldc2_w 270389152141252877
      // 00c: astore 7
      // 00e: ldc2_w 270389152141252877
      // 011: aload 7
      // 013: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 016: goto 01d
      // 019: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01c: athrow
      // 01d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 020: ldc2_w 375944019649708240
      // 023: astore 10
      // 025: astore 9
      // 027: ldc2_w 375944019649708240
      // 02a: aload 9
      // 02c: aload 10
      // 02e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 031: checkcast com/finalshell/core/U5
      // 034: goto 03b
      // 037: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: astore 3
      // 03c: istore 2
      // 03d: ldc2_w 8324956139767699727
      // 040: invokestatic com/finalshell/core/Ln2.a (IJ)I
      // 043: istore 4
      // 045: invokestatic java/lang/System.currentTimeMillis ()J
      // 048: aload 0
      // 049: ldc2_w 570446480797539532
      // 04c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 04f: swap
      // 050: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 053: lsub
      // 054: iload 1
      // 055: i2l
      // 056: lcmp
      // 057: iload 2
      // 058: ifne 096
      // 05b: ifle 15f
      // 05e: goto 065
      // 061: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: invokestatic java/lang/System.currentTimeMillis ()J
      // 068: aload 3
      // 069: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 06c: ldc2_w 473505208758842074
      // 06f: astore 12
      // 071: astore 11
      // 073: ldc2_w 473505208758842074
      // 076: aload 11
      // 078: aload 12
      // 07a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07d: checkcast java/lang/Long
      // 080: invokevirtual java/lang/Long.longValue ()J
      // 083: goto 08a
      // 086: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 089: athrow
      // 08a: lsub
      // 08b: iload 4
      // 08d: i2l
      // 08e: lcmp
      // 08f: goto 096
      // 092: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: iload 2
      // 097: ifne 0f2
      // 09a: ifle 15f
      // 09d: goto 0a4
      // 0a0: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 3
      // 0a5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0a8: ldc2_w 473505208758842074
      // 0ab: astore 14
      // 0ad: astore 13
      // 0af: ldc2_w 473505208758842074
      // 0b2: aload 13
      // 0b4: aload 14
      // 0b6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b9: checkcast java/lang/Long
      // 0bc: invokevirtual java/lang/Long.longValue ()J
      // 0bf: goto 0c6
      // 0c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 3
      // 0c7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ca: ldc2_w 583445113644364036
      // 0cd: astore 16
      // 0cf: astore 15
      // 0d1: ldc2_w 583445113644364036
      // 0d4: aload 15
      // 0d6: aload 16
      // 0d8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0db: checkcast java/lang/Long
      // 0de: invokevirtual java/lang/Long.longValue ()J
      // 0e1: goto 0e8
      // 0e4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: lsub
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: goto 0f2
      // 0ee: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: ifle 15f
      // 0f5: aload 0
      // 0f6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f9: ldc2_w 387012053033668218
      // 0fc: astore 18
      // 0fe: astore 17
      // 100: ldc2_w 387012053033668218
      // 103: aload 17
      // 105: aload 18
      // 107: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10a: pop
      // 10b: goto 112
      // 10e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 111: athrow
      // 112: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 115: ldc2_w 270389152141252877
      // 118: astore 19
      // 11a: ldc2_w 270389152141252877
      // 11d: aload 19
      // 11f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 122: goto 129
      // 125: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 128: athrow
      // 129: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 12c: ldc2_w 578864097947885485
      // 12f: astore 22
      // 131: astore 21
      // 133: ldc2_w 578864097947885485
      // 136: aload 21
      // 138: aload 22
      // 13a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 13d: pop
      // 13e: goto 145
      // 141: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 144: athrow
      // 145: goto 15f
      // 148: astore 5
      // 14a: aload 5
      // 14c: invokevirtual java/lang/Exception.printStackTrace ()V
      // 14f: getstatic com/finalshell/core/Ln2.h J
      // 152: invokestatic java/lang/Thread.sleep (J)V
      // 155: goto 15f
      // 158: astore 6
      // 15a: aload 6
      // 15c: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 15f: return
   }

   public void Z() {
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10002 = Registry.emptyArgs();
      long var9 = 375944019649708240L;
      Object[] var8 = var10002;
      Ref.h(375944019649708240L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      Ln4_2.R();
      new StringBuilder().append((String)Registry.lookupField(217567344693643410L).get(null)).append(File.separator).append(a(-17565, 14646));
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Object var10005 = Ref.h2(270389152141252877L, var10);
      Object[] var10006 = Registry.emptyArgs();
      long var13 = 306266403902896148L;
      Object[] var12 = var10006;
      var10006 = Ref.h(306266403902896148L, var12, var13);
      String var10007 = (String)(Registry.emptyArgs());
      long var15 = 204000105621842013L;
      Object var14 = var10007;
      var10007 = Ref.h(204000105621842013L, var14, var15);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      String var3 = ((java.lang.StringBuilder)var10006).append((String)var10007).append(a(-17573, -32005)).toString();
      SyncTaskManifest var4 = new SyncTaskManifest();
      Object var1 = var10005;

      label71: {
         try {
            var10006 = Registry.packArgs(var3);
            long var17 = 423382126089954494L;
            Object[] var16 = var10006;
            Ref.h(423382126089954494L, var16, var17);

            try {
               ;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            if (var1 == null) {
               return;
            }

            if (!new File(var3).exists()) {
               break label71;
            }
         } catch (Exception var30) {
            throw a(var30);
         }

         try {
            var10007 = Registry.emptyArgs();
            long var19 = 604823751569932499L;
            Object var18 = var10007;
            Ref.h(604823751569932499L, var18, var19);

            try {
               ;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }
         } catch (Exception var26) {
            var26.printStackTrace();
         }
      }

      var10007 = Registry.emptyArgs();
      long var21 = 465331157863382722L;
      Object var20 = var10007;
      Ref.h(465331157863382722L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      long var23 = 358782464092968093L;
      Ref.s(358782464092968093L, var4, var23);
   }

   public void j() {
      Ln4_2.i();
      Object[] var10002 = Registry.emptyArgs();
      long var3 = 243112970360128676L;
      Object[] var2 = var10002;
      Ref.h(243112970360128676L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Ln2 var10001 = this;
      if (this == null) {
         if (Registry.lookupField(257898823081515939L).getBoolean(this)) {
            return;
         }

         var10001 = this;
      }

      Registry.lookupField(257898823081515939L).setBoolean(var10001, true);
      Registry.lookupField(388376917454860932L).get(null);
      var10002 = Registry.packArgs(new com.finalshell.task.OO3(this));
      long var5 = 434592463220957006L;
      Object[] var4 = var10002;
      Ref.h(434592463220957006L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void H() throws Exception {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 387012053033668218L;
      Object[] var1 = var10001;
      Ref.h(387012053033668218L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 578864097947885485L;
      Object[] var5 = var10003;
      Ref.h(578864097947885485L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void O() throws Exception {
      Object[] var10001 = Registry.packArgs(false);
      long var2 = 472288963033761188L;
      Object[] var1 = var10001;
      Ref.h(472288963033761188L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void F(boolean var1) throws Exception {
      Object var4 = 358782464092968093L;
      SyncTaskManifest var2 = (SyncTaskManifest)Ref.g(358782464092968093L, var4);
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 375944019649708240L;
      Object[] var8 = var10003;
      Ref.h(375944019649708240L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(var2, var1);
      long var11 = 454189016043226603L;
      Object[] var10 = var10004;
      Ref.h(454189016043226603L, var10, var11);
      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10006 = Registry.emptyArgs();
      long var15 = 578864097947885485L;
      Object[] var14 = var10006;
      Ref.h(578864097947885485L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public boolean v() {
      Registry.emptyArgs();
      long var5 = 270389152141252877L;
      Ref.h2(270389152141252877L, var5);
      U5 var10002 = (U5)(Registry.emptyArgs());
      long var8 = 375944019649708240L;
      Object var7 = var10002;
      var10002 = Ref.h(375944019649708240L, var7, var8);

      try {
         var10002 = (U5)var10002;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      U5 var2 = var10002;
      Ln4_2.i();
      Registry.emptyArgs();
      long var9 = 270389152141252877L;
      Object var10004 = Ref.h2(270389152141252877L, var9);
      U62 var10005 = (U62)(Registry.emptyArgs());
      long var12 = 306266403902896148L;
      Object var11 = var10005;
      var10005 = Ref.h(306266403902896148L, var11, var12);

      try {
         var10005 = (U62)var10005;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      U62 var3 = var10005;
      Object var1 = var10004;
      var10005 = Registry.emptyArgs();
      long var14 = 204000105621842013L;
      Object var13 = var10005;
      Registry.packArgs(Ref.h(204000105621842013L, var13, var14));
      long var15 = 330094358428833085L;
      Object var10006 = Ref.h2(330094358428833085L, var15);

      try {
         var10006 = (Boolean)var10006;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      label177: {
         label181: {
            if (var1 == null) {
               if (var10006 == null) {
                  break label181;
               }

               var10006 = var3;
               Object[] var10007 = Registry.emptyArgs();
               long var18 = 191807067392725406L;
               Object[] var17 = var10007;
               Registry.packArgs(Ref.h(191807067392725406L, var17, var18));
               long var19 = 330094358428833085L;
               Object var10008 = Ref.h2(330094358428833085L, var19);

               try {
               } catch (InvocationTargetException var48) {
                  throw var48.getTargetException();
               }
            }

            if (var1 == null) {
               if (var10006 == null) {
                  break label181;
               }

               var10006 = var2;
               Object[] var59 = Registry.emptyArgs();
               long var22 = 318293696412897294L;
               Object[] var21 = var59;
               Registry.packArgs(Ref.h(318293696412897294L, var21, var22));
               long var23 = 330094358428833085L;
               Object var64 = Ref.h2(330094358428833085L, var23);

               try {
               } catch (InvocationTargetException var47) {
                  throw var47.getTargetException();
               }
            }

            if (var1 == null) {
               if (var10006 == null) {
                  break label181;
               }

               var10006 = Registry.emptyArgs();
               long var25 = 270389152141252877L;
               Ref.h2(270389152141252877L, var25);
               Object[] var65 = Registry.emptyArgs();
               long var28 = 163462326892114024L;
               Object[] var27 = var65;
               Ref.h(163462326892114024L, var27, var28);
               Object[] var10009 = Registry.emptyArgs();
               long var30 = 633712494917113170L;
               Object[] var29 = var10009;
               var10009 = Ref.h(633712494917113170L, var29, var30);

               try {
               } catch (InvocationTargetException var46) {
                  throw var46.getTargetException();
               }
            }

            if (var1 == null) {
               if (var10006 == null) {
                  break label181;
               }

               var10006 = var2;
               Object[] var60 = Registry.emptyArgs();
               long var32 = 605218686263352748L;
               Object[] var31 = var60;
               var60 = Ref.h(605218686263352748L, var31, var32);

               try {
               } catch (InvocationTargetException var45) {
                  throw var45.getTargetException();
               }
            }

            if (var1 == null) {
               if (var10006 == null) {
                  break label181;
               }

               var10006 = Registry.lookupField(271573489181596787L).getBoolean(this);
            }

            if (var1 == null) {
               break label177;
            }

            if (var10006 == null) {
               var10006 = true;
               break label177;
            }
         }

         var10006 = false;
      }

      Object var4 = var10006;
      Object var33 = 538673647573365483L;
      if ((Fc2)Ref.g(538673647573365483L, var33) != null) {
         Object var62;
         label144: {
            label187: {
               var62 = var4;
               if (var1 == null) {
                  if (var4 == null) {
                     break label187;
                  }

                  var62 = this;
                  Object var35 = 538673647573365483L;
                  Ref.g(538673647573365483L, var35);
                  Object[] var67 = Registry.emptyArgs();
                  long var38 = 326351988475965557L;
                  Object[] var37 = var67;
                  var67 = Ref.h(326351988475965557L, var37, var38);

                  try {
                  } catch (InvocationTargetException var44) {
                     throw var44.getTargetException();
                  }
               }

               if (var1 == null) {
                  break label144;
               }

               if (var62 == null) {
                  var62 = true;
                  break label144;
               }
            }

            var62 = false;
         }

         label133: {
            label189: {
               var4 = var62;
               var62 = var4;
               if (var1 == null) {
                  if (var4 == null) {
                     break label189;
                  }

                  var62 = this;
                  Object var39 = 538673647573365483L;
                  Ref.g(538673647573365483L, var39);
                  Object[] var69 = Registry.emptyArgs();
                  long var42 = 412439471829603520L;
                  Object[] var41 = var69;
                  var69 = Ref.h(412439471829603520L, var41, var42);

                  try {
                  } catch (InvocationTargetException var43) {
                     throw var43.getTargetException();
                  }
               }

               if (var1 == null) {
                  break label133;
               }

               if (var62 == null) {
                  var62 = true;
                  break label133;
               }
            }

            var62 = false;
         }

         var4 = var62;
      }

      return (boolean)var4;
   }

   public void G() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 375944019649708240L;
      Object[] var3 = var10002;
      Ref.h(375944019649708240L, var3, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 273680392108095805L;
      Object[] var5 = var10003;
      Ref.h(273680392108095805L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 578864097947885485L;
      Object[] var9 = var10005;
      Ref.h(578864097947885485L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public boolean b() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: Invalid argument: OBJECT
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.getZeroConstant(ConstExprent.java:599)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:391)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:256)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:146)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:140)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SecondaryFunctionsHelper.identifySecondaryFunctions(SecondaryFunctionsHelper.java:47)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:302)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/Ln4_2.i ()Z
      // 03: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 06: ldc2_w 270389152141252877
      // 09: astore 3
      // 0a: ldc2_w 270389152141252877
      // 0d: aload 3
      // 0e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 11: goto 18
      // 14: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17: athrow
      // 18: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b: ldc2_w 375944019649708240
      // 1e: astore 6
      // 20: astore 5
      // 22: ldc2_w 375944019649708240
      // 25: aload 5
      // 27: aload 6
      // 29: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2c: checkcast com/finalshell/core/U5
      // 2f: goto 36
      // 32: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 35: athrow
      // 36: astore 2
      // 37: istore 1
      // 38: aload 2
      // 39: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3c: ldc2_w 583445113644364036
      // 3f: astore 8
      // 41: astore 7
      // 43: ldc2_w 583445113644364036
      // 46: aload 7
      // 48: aload 8
      // 4a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4d: checkcast java/lang/Long
      // 50: invokevirtual java/lang/Long.longValue ()J
      // 53: goto 5a
      // 56: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 2
      // 5b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5e: ldc2_w 473505208758842074
      // 61: astore 10
      // 63: astore 9
      // 65: ldc2_w 473505208758842074
      // 68: aload 9
      // 6a: aload 10
      // 6c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6f: checkcast java/lang/Long
      // 72: invokevirtual java/lang/Long.longValue ()J
      // 75: goto 7c
      // 78: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: lcmp
      // 7d: iload 1
      // 7e: ifeq 85
      // 81: iflt 88
      // 84: bipush 1
      // 85: goto 89
      // 88: bipush 0
      // 89: ireturn
   }

   public void C(byte[] var1, boolean var2, boolean var3, boolean var4) throws Exception {
      Object var5 = 358782464092968093L;
      Object[] var10002 = Registry.packArgs(Ref.g(358782464092968093L, var5), var1, false, var2, var3, var4);
      long var8 = 558039505858998532L;
      Object[] var7 = var10002;
      Ref.h(558039505858998532L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void S() throws Exception {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 375944019649708240L;
      Object[] var5 = var10002;
      Ref.h(375944019649708240L, var5, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var8 = 318293696412897294L;
      Object[] var7 = var10003;
      Ref.h(318293696412897294L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Registry.emptyArgs();
      long var9 = 195582273090724263L;
      Object var10004 = Ref.h2(195582273090724263L, var9);

      try {
         var10004 = (byte[])var10004;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      byte[] var2 = (byte[])var10004;
      Object var11 = 358782464092968093L;
      Object[] var10006 = Registry.packArgs(Ref.g(358782464092968093L, var11), var2, true, false, false, false);
      long var14 = 558039505858998532L;
      Object[] var13 = var10006;
      Ref.h(558039505858998532L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }
   }

   public void A(SyncTaskManifest param1, byte[] param2, boolean param3, boolean param4, boolean param5, boolean param6) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 003: ldc2_w 270389152141252877
      // 006: astore 38
      // 008: ldc2_w 270389152141252877
      // 00b: aload 38
      // 00d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 010: goto 017
      // 013: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 016: athrow
      // 017: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01a: ldc2_w 375944019649708240
      // 01d: astore 41
      // 01f: astore 40
      // 021: ldc2_w 375944019649708240
      // 024: aload 40
      // 026: aload 41
      // 028: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02b: checkcast com/finalshell/core/U5
      // 02e: goto 035
      // 031: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 034: athrow
      // 035: astore 8
      // 037: aload 8
      // 039: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03c: ldc2_w 473505208758842074
      // 03f: astore 43
      // 041: astore 42
      // 043: ldc2_w 473505208758842074
      // 046: aload 42
      // 048: aload 43
      // 04a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04d: checkcast java/lang/Long
      // 050: invokevirtual java/lang/Long.longValue ()J
      // 053: goto 05a
      // 056: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 059: athrow
      // 05a: lstore 9
      // 05c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05f: ldc2_w 270389152141252877
      // 062: astore 44
      // 064: ldc2_w 270389152141252877
      // 067: aload 44
      // 069: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 06c: goto 073
      // 06f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 072: athrow
      // 073: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 076: ldc2_w 606040881383812332
      // 079: astore 47
      // 07b: astore 46
      // 07d: ldc2_w 606040881383812332
      // 080: aload 46
      // 082: aload 47
      // 084: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 087: goto 08e
      // 08a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 091: ldc2_w 140823137094225943
      // 094: astore 49
      // 096: astore 48
      // 098: ldc2_w 140823137094225943
      // 09b: aload 48
      // 09d: aload 49
      // 09f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a2: checkcast com/finalshell/ui/panel/LogPanel
      // 0a5: goto 0ac
      // 0a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: astore 11
      // 0ae: invokestatic com/finalshell/core/Ln4_2.i ()Z
      // 0b1: bipush 0
      // 0b2: istore 12
      // 0b4: ldc_w ""
      // 0b7: astore 13
      // 0b9: istore 7
      // 0bb: aload 11
      // 0bd: sipush -17597
      // 0c0: sipush 30196
      // 0c3: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 0c6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0c9: ldc2_w 539001526584876911
      // 0cc: astore 51
      // 0ce: astore 50
      // 0d0: ldc2_w 539001526584876911
      // 0d3: aload 50
      // 0d5: aload 51
      // 0d7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0da: pop
      // 0db: goto 0e2
      // 0de: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: aconst_null
      // 0e3: astore 14
      // 0e5: iload 3
      // 0e6: ifeq 10d
      // 0e9: aload 0
      // 0ea: aload 1
      // 0eb: iload 4
      // 0ed: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 0f0: ldc2_w 454189016043226603
      // 0f3: astore 53
      // 0f5: astore 52
      // 0f7: ldc2_w 454189016043226603
      // 0fa: aload 52
      // 0fc: aload 53
      // 0fe: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 101: checkcast java/util/ArrayList
      // 104: goto 10b
      // 107: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: astore 14
      // 10d: aload 2
      // 10e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 111: ldc2_w 123747197988873662
      // 114: astore 54
      // 116: ldc2_w 123747197988873662
      // 119: aload 54
      // 11b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 11e: checkcast java/lang/String
      // 121: goto 128
      // 124: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 127: athrow
      // 128: astore 15
      // 12a: invokestatic java/lang/System.currentTimeMillis ()J
      // 12d: lstore 16
      // 12f: new java/lang/StringBuilder
      // 132: dup
      // 133: invokespecial java/lang/StringBuilder.<init> ()V
      // 136: sipush -17571
      // 139: sipush -30213
      // 13c: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 142: aload 1
      // 143: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 146: ldc2_w 227628799573594622
      // 149: astore 57
      // 14b: astore 56
      // 14d: ldc2_w 227628799573594622
      // 150: aload 56
      // 152: aload 57
      // 154: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 157: checkcast java/lang/String
      // 15a: goto 161
      // 15d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 160: athrow
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: ldc_w "_"
      // 167: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16a: aload 15
      // 16c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16f: ldc_w "_"
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 175: lload 16
      // 177: ldc2_w 173797753744067359
      // 17a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 17d: aconst_null
      // 17e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 181: invokestatic com/finalshell/reflect/Registry.packArgs (JLjava/lang/Object;)[Ljava/lang/Object;
      // 184: ldc2_w 155165504518005311
      // 187: astore 58
      // 189: ldc2_w 155165504518005311
      // 18c: aload 58
      // 18e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 191: checkcast java/lang/String
      // 194: goto 19b
      // 197: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19a: athrow
      // 19b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19e: sipush -17594
      // 1a1: sipush 14849
      // 1a4: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ad: astore 18
      // 1af: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b2: ldc2_w 196983177435741094
      // 1b5: astore 60
      // 1b7: ldc2_w 196983177435741094
      // 1ba: aload 60
      // 1bc: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1bf: checkcast com/finalshell/ui/model/O0
      // 1c2: goto 1c9
      // 1c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1c8: athrow
      // 1c9: astore 19
      // 1cb: aload 0
      // 1cc: ldc2_w 358782464092968093
      // 1cf: astore 62
      // 1d1: ldc2_w 358782464092968093
      // 1d4: aload 62
      // 1d6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1d9: aload 0
      // 1da: ldc2_w 358782464092968093
      // 1dd: astore 64
      // 1df: ldc2_w 358782464092968093
      // 1e2: aload 64
      // 1e4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1e7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ea: ldc2_w 227628799573594622
      // 1ed: astore 67
      // 1ef: astore 66
      // 1f1: ldc2_w 227628799573594622
      // 1f4: aload 66
      // 1f6: aload 67
      // 1f8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fb: goto 202
      // 1fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 201: athrow
      // 202: lload 16
      // 204: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;J)[Ljava/lang/Object;
      // 207: ldc2_w 163024906170336643
      // 20a: astore 69
      // 20c: astore 68
      // 20e: ldc2_w 163024906170336643
      // 211: aload 68
      // 213: aload 69
      // 215: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 218: pop
      // 219: goto 220
      // 21c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21f: athrow
      // 220: aload 19
      // 222: sipush -17580
      // 225: sipush -26128
      // 228: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 22b: aload 0
      // 22c: ldc2_w 358782464092968093
      // 22f: astore 70
      // 231: ldc2_w 358782464092968093
      // 234: aload 70
      // 236: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 239: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 23c: ldc2_w 370915375706743462
      // 23f: astore 73
      // 241: astore 72
      // 243: ldc2_w 370915375706743462
      // 246: aload 72
      // 248: aload 73
      // 24a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 24d: checkcast com/finalshell/ui/model/O0
      // 250: goto 257
      // 253: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 256: athrow
      // 257: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 25a: pop
      // 25b: aload 0
      // 25c: ldc2_w 358782464092968093
      // 25f: astore 74
      // 261: ldc2_w 358782464092968093
      // 264: aload 74
      // 266: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 269: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 26c: ldc2_w 277950555453622718
      // 26f: astore 77
      // 271: astore 76
      // 273: ldc2_w 277950555453622718
      // 276: aload 76
      // 278: aload 77
      // 27a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 27d: checkcast java/util/HashMap
      // 280: goto 287
      // 283: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 286: athrow
      // 287: invokevirtual java/util/HashMap.clone ()Ljava/lang/Object;
      // 28a: checkcast java/util/HashMap
      // 28d: astore 20
      // 28f: aload 19
      // 291: invokevirtual com/finalshell/ui/model/O0.V ()Ljava/lang/String;
      // 294: sipush -17556
      // 297: sipush -4450
      // 29a: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 29d: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 2a0: astore 21
      // 2a2: aload 21
      // 2a4: ldc2_w 586616405392613137
      // 2a7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2aa: aconst_null
      // 2ab: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2ae: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 2b1: ldc2_w 528539778715331893
      // 2b4: astore 78
      // 2b6: ldc2_w 528539778715331893
      // 2b9: aload 78
      // 2bb: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2be: checkcast [B
      // 2c1: goto 2c8
      // 2c4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c7: athrow
      // 2c8: astore 22
      // 2ca: aload 22
      // 2cc: aload 2
      // 2cd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 2d0: ldc2_w 298505728463504020
      // 2d3: astore 80
      // 2d5: ldc2_w 298505728463504020
      // 2d8: aload 80
      // 2da: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2dd: checkcast [B
      // 2e0: goto 2e7
      // 2e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2e6: athrow
      // 2e7: astore 22
      // 2e9: new com/finalshell/ui/model/O0
      // 2ec: dup
      // 2ed: invokespecial com/finalshell/ui/model/O0.<init> ()V
      // 2f0: astore 23
      // 2f2: aload 23
      // 2f4: sipush -17592
      // 2f7: sipush -11795
      // 2fa: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 2fd: ldc2_w 558584643801613540
      // 300: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 303: aconst_null
      // 304: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 307: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 30a: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 30d: pop
      // 30e: aload 23
      // 310: sipush -17599
      // 313: sipush 14317
      // 316: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 319: sipush -17596
      // 31c: sipush -411
      // 31f: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 322: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 325: pop
      // 326: aload 23
      // 328: sipush -17590
      // 32b: sipush 28347
      // 32e: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 331: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 334: ldc2_w 270389152141252877
      // 337: astore 82
      // 339: ldc2_w 270389152141252877
      // 33c: aload 82
      // 33e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 341: goto 348
      // 344: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 347: athrow
      // 348: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 34b: ldc2_w 306266403902896148
      // 34e: astore 85
      // 350: astore 84
      // 352: ldc2_w 306266403902896148
      // 355: aload 84
      // 357: aload 85
      // 359: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 35c: goto 363
      // 35f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 362: athrow
      // 363: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 366: ldc2_w 204000105621842013
      // 369: astore 87
      // 36b: astore 86
      // 36d: ldc2_w 204000105621842013
      // 370: aload 86
      // 372: aload 87
      // 374: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 377: checkcast java/lang/String
      // 37a: goto 381
      // 37d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 380: athrow
      // 381: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 384: pop
      // 385: aload 23
      // 387: sipush -17593
      // 38a: sipush 18294
      // 38d: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 390: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 393: ldc2_w 270389152141252877
      // 396: astore 88
      // 398: ldc2_w 270389152141252877
      // 39b: aload 88
      // 39d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 3a0: goto 3a7
      // 3a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a6: athrow
      // 3a7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3aa: ldc2_w 306266403902896148
      // 3ad: astore 91
      // 3af: astore 90
      // 3b1: ldc2_w 306266403902896148
      // 3b4: aload 90
      // 3b6: aload 91
      // 3b8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3bb: goto 3c2
      // 3be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3c1: athrow
      // 3c2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3c5: ldc2_w 191807067392725406
      // 3c8: astore 93
      // 3ca: astore 92
      // 3cc: ldc2_w 191807067392725406
      // 3cf: aload 92
      // 3d1: aload 93
      // 3d3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3d6: checkcast java/lang/String
      // 3d9: goto 3e0
      // 3dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3df: athrow
      // 3e0: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 3e3: pop
      // 3e4: aload 23
      // 3e6: sipush -17572
      // 3e9: sipush 17879
      // 3ec: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 3ef: aload 18
      // 3f1: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 3f4: pop
      // 3f5: aload 23
      // 3f7: sipush -17567
      // 3fa: sipush 10395
      // 3fd: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 400: aload 22
      // 402: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 405: pop
      // 406: aload 23
      // 408: ldc2_w 279993414668031362
      // 40b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 40e: aconst_null
      // 40f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 412: ldc2_w 620693334424877816
      // 415: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 418: aconst_null
      // 419: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 41c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 41f: ldc2_w 339907473838616993
      // 422: astore 94
      // 424: ldc2_w 339907473838616993
      // 427: aload 94
      // 429: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 42c: checkcast com/finalshell/ui/model/O0
      // 42f: goto 436
      // 432: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 435: athrow
      // 436: astore 24
      // 438: aload 24
      // 43a: sipush -17585
      // 43d: sipush 20687
      // 440: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 443: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 446: istore 25
      // 448: aload 24
      // 44a: sipush -17555
      // 44d: sipush 21916
      // 450: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 453: invokevirtual com/finalshell/ui/model/O0.C$String (Ljava/lang/String;)Ljava/lang/String;
      // 456: astore 13
      // 458: aload 0
      // 459: ldc2_w 538673647573365483
      // 45c: astore 96
      // 45e: ldc2_w 538673647573365483
      // 461: aload 96
      // 463: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 466: aload 24
      // 468: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 46b: ldc2_w 436317056666314842
      // 46e: astore 99
      // 470: astore 98
      // 472: ldc2_w 436317056666314842
      // 475: aload 98
      // 477: aload 99
      // 479: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 47c: pop
      // 47d: goto 484
      // 480: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 483: athrow
      // 484: iload 25
      // 486: iload 7
      // 488: ifeq 4a0
      // 48b: getstatic com/finalshell/core/Qc2.S I
      // 48e: if_icmpne 8c7
      // 491: goto 498
      // 494: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 497: athrow
      // 498: bipush 1
      // 499: goto 4a0
      // 49c: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49f: athrow
      // 4a0: istore 12
      // 4a2: aload 11
      // 4a4: sipush -17569
      // 4a7: sipush 15951
      // 4aa: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 4ad: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4b0: ldc2_w 539001526584876911
      // 4b3: astore 101
      // 4b5: astore 100
      // 4b7: ldc2_w 539001526584876911
      // 4ba: aload 100
      // 4bc: aload 101
      // 4be: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c1: pop
      // 4c2: goto 4c9
      // 4c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4c8: athrow
      // 4c9: aload 8
      // 4cb: lload 9
      // 4cd: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 4d0: ldc2_w 289332011777911315
      // 4d3: astore 103
      // 4d5: astore 102
      // 4d7: ldc2_w 289332011777911315
      // 4da: aload 102
      // 4dc: aload 103
      // 4de: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4e1: pop
      // 4e2: goto 4e9
      // 4e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4e8: athrow
      // 4e9: aload 18
      // 4eb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4ee: ldc2_w 417955638237048558
      // 4f1: astore 104
      // 4f3: ldc2_w 417955638237048558
      // 4f6: aload 104
      // 4f8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4fb: checkcast java/lang/String
      // 4fe: goto 505
      // 501: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 504: athrow
      // 505: astore 26
      // 507: iload 3
      // 508: ifne 52f
      // 50b: aload 0
      // 50c: aload 1
      // 50d: iload 4
      // 50f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 512: ldc2_w 454189016043226603
      // 515: astore 107
      // 517: astore 106
      // 519: ldc2_w 454189016043226603
      // 51c: aload 106
      // 51e: aload 107
      // 520: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 523: checkcast java/util/ArrayList
      // 526: goto 52d
      // 529: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 52c: athrow
      // 52d: astore 14
      // 52f: aload 14
      // 531: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 534: astore 27
      // 536: aload 27
      // 538: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 53d: ifeq 8c2
      // 540: aload 27
      // 542: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 547: checkcast com/finalshell/core/Kb4
      // 54a: astore 28
      // 54c: bipush 0
      // 54d: istore 29
      // 54f: new com/finalshell/ui/model/O0
      // 552: dup
      // 553: invokespecial com/finalshell/ui/model/O0.<init> ()V
      // 556: astore 30
      // 558: aload 30
      // 55a: sipush -17581
      // 55d: sipush -18975
      // 560: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 563: ldc2_w 558584643801613540
      // 566: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 569: aconst_null
      // 56a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 56d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 570: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 573: pop
      // 574: aload 30
      // 576: sipush -17576
      // 579: sipush 14032
      // 57c: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 57f: sipush -17574
      // 582: sipush -25863
      // 585: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 588: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 58b: pop
      // 58c: aload 30
      // 58e: sipush -17579
      // 591: sipush 5921
      // 594: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 597: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 59a: ldc2_w 270389152141252877
      // 59d: astore 108
      // 59f: ldc2_w 270389152141252877
      // 5a2: aload 108
      // 5a4: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 5a7: goto 5ae
      // 5aa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5ad: athrow
      // 5ae: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5b1: ldc2_w 306266403902896148
      // 5b4: astore 111
      // 5b6: astore 110
      // 5b8: ldc2_w 306266403902896148
      // 5bb: aload 110
      // 5bd: aload 111
      // 5bf: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5c2: goto 5c9
      // 5c5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5c8: athrow
      // 5c9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5cc: ldc2_w 204000105621842013
      // 5cf: astore 113
      // 5d1: astore 112
      // 5d3: ldc2_w 204000105621842013
      // 5d6: aload 112
      // 5d8: aload 113
      // 5da: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5dd: checkcast java/lang/String
      // 5e0: goto 5e7
      // 5e3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5e6: athrow
      // 5e7: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 5ea: pop
      // 5eb: aload 30
      // 5ed: sipush -17568
      // 5f0: sipush 12955
      // 5f3: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 5f6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5f9: ldc2_w 270389152141252877
      // 5fc: astore 114
      // 5fe: ldc2_w 270389152141252877
      // 601: aload 114
      // 603: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 606: goto 60d
      // 609: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 60c: athrow
      // 60d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 610: ldc2_w 306266403902896148
      // 613: astore 117
      // 615: astore 116
      // 617: ldc2_w 306266403902896148
      // 61a: aload 116
      // 61c: aload 117
      // 61e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 621: goto 628
      // 624: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 627: athrow
      // 628: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 62b: ldc2_w 191807067392725406
      // 62e: astore 119
      // 630: astore 118
      // 632: ldc2_w 191807067392725406
      // 635: aload 118
      // 637: aload 119
      // 639: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 63c: checkcast java/lang/String
      // 63f: goto 646
      // 642: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 645: athrow
      // 646: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 649: pop
      // 64a: aload 30
      // 64c: sipush -17566
      // 64f: sipush -18192
      // 652: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 655: aload 28
      // 657: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 65a: ldc2_w 118781644472573462
      // 65d: astore 121
      // 65f: astore 120
      // 661: ldc2_w 118781644472573462
      // 664: aload 120
      // 666: aload 121
      // 668: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 66b: checkcast java/lang/String
      // 66e: goto 675
      // 671: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 674: athrow
      // 675: invokevirtual com/finalshell/ui/model/O0.C (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
      // 678: pop
      // 679: iload 7
      // 67b: ifeq 91a
      // 67e: iload 6
      // 680: iload 7
      // 682: ifeq 738
      // 685: goto 68c
      // 688: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68b: athrow
      // 68c: ifeq 70c
      // 68f: goto 696
      // 692: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 695: athrow
      // 696: aload 28
      // 698: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 69b: ldc2_w 409296122673684019
      // 69e: astore 123
      // 6a0: astore 122
      // 6a2: ldc2_w 409296122673684019
      // 6a5: aload 122
      // 6a7: aload 123
      // 6a9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6ac: checkcast java/lang/String
      // 6af: goto 6b6
      // 6b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6b5: athrow
      // 6b6: aload 26
      // 6b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6bb: ifne 8bd
      // 6be: goto 6c5
      // 6c1: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c4: athrow
      // 6c5: aload 30
      // 6c7: ldc2_w 279993414668031362
      // 6ca: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 6cd: aconst_null
      // 6ce: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6d1: ldc2_w 620693334424877816
      // 6d4: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 6d7: aconst_null
      // 6d8: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6db: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 6de: ldc2_w 339907473838616993
      // 6e1: astore 124
      // 6e3: ldc2_w 339907473838616993
      // 6e6: aload 124
      // 6e8: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 6eb: checkcast com/finalshell/ui/model/O0
      // 6ee: goto 6f5
      // 6f1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6f4: athrow
      // 6f5: astore 31
      // 6f7: aload 31
      // 6f9: sipush -17584
      // 6fc: sipush 23371
      // 6ff: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 702: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 705: istore 32
      // 707: iload 7
      // 709: ifne 8bd
      // 70c: aload 20
      // 70e: aload 28
      // 710: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 713: ldc2_w 321444386962616854
      // 716: astore 127
      // 718: astore 126
      // 71a: ldc2_w 321444386962616854
      // 71d: aload 126
      // 71f: aload 127
      // 721: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 724: checkcast java/lang/String
      // 727: goto 72e
      // 72a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 72d: athrow
      // 72e: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 731: goto 738
      // 734: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 737: athrow
      // 738: iload 7
      // 73a: ifeq 82c
      // 73d: ifeq 82a
      // 740: goto 747
      // 743: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 746: athrow
      // 747: aload 28
      // 749: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 74c: ldc2_w 561034201633722257
      // 74f: astore 129
      // 751: astore 128
      // 753: ldc2_w 561034201633722257
      // 756: aload 128
      // 758: aload 129
      // 75a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 75d: checkcast java/lang/Long
      // 760: invokevirtual java/lang/Long.longValue ()J
      // 763: goto 76a
      // 766: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 769: athrow
      // 76a: lstore 31
      // 76c: aload 20
      // 76e: aload 28
      // 770: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 773: ldc2_w 321444386962616854
      // 776: astore 131
      // 778: astore 130
      // 77a: ldc2_w 321444386962616854
      // 77d: aload 130
      // 77f: aload 131
      // 781: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 784: checkcast java/lang/String
      // 787: goto 78e
      // 78a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 78d: athrow
      // 78e: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 791: checkcast java/lang/Long
      // 794: invokevirtual java/lang/Long.longValue ()J
      // 797: lstore 33
      // 799: aload 28
      // 79b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 79e: ldc2_w 409296122673684019
      // 7a1: astore 133
      // 7a3: astore 132
      // 7a5: ldc2_w 409296122673684019
      // 7a8: aload 132
      // 7aa: aload 133
      // 7ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 7af: checkcast java/lang/String
      // 7b2: goto 7b9
      // 7b5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7b8: athrow
      // 7b9: aload 26
      // 7bb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7be: iload 7
      // 7c0: ifeq 82c
      // 7c3: ifne 82a
      // 7c6: goto 7cd
      // 7c9: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7cc: athrow
      // 7cd: lload 33
      // 7cf: lload 31
      // 7d1: lcmp
      // 7d2: iload 7
      // 7d4: ifeq 82c
      // 7d7: goto 7de
      // 7da: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7dd: athrow
      // 7de: iflt 82a
      // 7e1: goto 7e8
      // 7e4: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e7: athrow
      // 7e8: aload 30
      // 7ea: ldc2_w 279993414668031362
      // 7ed: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 7f0: aconst_null
      // 7f1: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 7f4: ldc2_w 620693334424877816
      // 7f7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 7fa: aconst_null
      // 7fb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 7fe: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 801: ldc2_w 339907473838616993
      // 804: astore 134
      // 806: ldc2_w 339907473838616993
      // 809: aload 134
      // 80b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 80e: checkcast com/finalshell/ui/model/O0
      // 811: goto 818
      // 814: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 817: athrow
      // 818: astore 35
      // 81a: aload 35
      // 81c: sipush -17584
      // 81f: sipush 23371
      // 822: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 825: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 828: istore 36
      // 82a: iload 5
      // 82c: iload 7
      // 82e: ifeq 867
      // 831: ifeq 8bd
      // 834: goto 83b
      // 837: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83a: athrow
      // 83b: aload 15
      // 83d: aload 28
      // 83f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 842: ldc2_w 251108130869296981
      // 845: astore 137
      // 847: astore 136
      // 849: ldc2_w 251108130869296981
      // 84c: aload 136
      // 84e: aload 137
      // 850: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 853: checkcast java/lang/String
      // 856: goto 85d
      // 859: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 85c: athrow
      // 85d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 860: goto 867
      // 863: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 866: athrow
      // 867: iload 7
      // 869: ifeq 878
      // 86c: ifne 8bd
      // 86f: goto 876
      // 872: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 875: athrow
      // 876: iload 29
      // 878: ifne 8bd
      // 87b: aload 30
      // 87d: ldc2_w 279993414668031362
      // 880: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 883: aconst_null
      // 884: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 887: ldc2_w 620693334424877816
      // 88a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 88d: aconst_null
      // 88e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 891: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 894: ldc2_w 339907473838616993
      // 897: astore 138
      // 899: ldc2_w 339907473838616993
      // 89c: aload 138
      // 89e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 8a1: checkcast com/finalshell/ui/model/O0
      // 8a4: goto 8ab
      // 8a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8aa: athrow
      // 8ab: astore 31
      // 8ad: aload 31
      // 8af: sipush -17584
      // 8b2: sipush 23371
      // 8b5: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 8b8: invokevirtual com/finalshell/ui/model/O0.b (Ljava/lang/String;)I
      // 8bb: istore 32
      // 8bd: iload 7
      // 8bf: ifne 536
      // 8c2: iload 7
      // 8c4: ifne 8d5
      // 8c7: new java/lang/Exception
      // 8ca: dup
      // 8cb: aload 13
      // 8cd: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 8d0: athrow
      // 8d1: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d4: athrow
      // 8d5: aload 0
      // 8d6: invokestatic java/lang/System.currentTimeMillis ()J
      // 8d9: dup2_x1
      // 8da: pop2
      // 8db: ldc2_w 570446480797539532
      // 8de: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 8e1: swap
      // 8e2: dup2_x2
      // 8e3: pop2
      // 8e4: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 8e7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 8ea: ldc2_w 270389152141252877
      // 8ed: astore 140
      // 8ef: ldc2_w 270389152141252877
      // 8f2: aload 140
      // 8f4: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 8f7: goto 8fe
      // 8fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 8fd: athrow
      // 8fe: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 901: ldc2_w 578864097947885485
      // 904: astore 143
      // 906: astore 142
      // 908: ldc2_w 578864097947885485
      // 90b: aload 142
      // 90d: aload 143
      // 90f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 912: pop
      // 913: goto 91a
      // 916: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 919: athrow
      // 91a: goto 9a5
      // 91d: astore 14
      // 91f: aload 11
      // 921: new java/lang/StringBuilder
      // 924: dup
      // 925: invokespecial java/lang/StringBuilder.<init> ()V
      // 928: sipush -17578
      // 92b: sipush 27314
      // 92e: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 931: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 934: aload 14
      // 936: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 939: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 93c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 93f: ldc2_w 539001526584876911
      // 942: astore 145
      // 944: astore 144
      // 946: ldc2_w 539001526584876911
      // 949: aload 144
      // 94b: aload 145
      // 94d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 950: pop
      // 951: goto 958
      // 954: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 957: athrow
      // 958: aload 14
      // 95a: athrow
      // 95b: astore 37
      // 95d: aload 0
      // 95e: invokestatic java/lang/System.currentTimeMillis ()J
      // 961: dup2_x1
      // 962: pop2
      // 963: ldc2_w 570446480797539532
      // 966: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 969: swap
      // 96a: dup2_x2
      // 96b: pop2
      // 96c: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 96f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 972: ldc2_w 270389152141252877
      // 975: astore 146
      // 977: ldc2_w 270389152141252877
      // 97a: aload 146
      // 97c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 97f: goto 986
      // 982: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 985: athrow
      // 986: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 989: ldc2_w 578864097947885485
      // 98c: astore 149
      // 98e: astore 148
      // 990: ldc2_w 578864097947885485
      // 993: aload 148
      // 995: aload 149
      // 997: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 99a: pop
      // 99b: goto 9a2
      // 99e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9a1: athrow
      // 9a2: aload 37
      // 9a4: athrow
      // 9a5: invokestatic com/finalshell/ui/panel/Ky4.F$arrString ()[Ljava/lang/String;
      // 9a8: ifnull 9c3
      // 9ab: iload 7
      // 9ad: ifeq 9bf
      // 9b0: goto 9b7
      // 9b3: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b6: athrow
      // 9b7: bipush 0
      // 9b8: goto 9c0
      // 9bb: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9be: athrow
      // 9bf: bipush 1
      // 9c0: invokestatic com/finalshell/core/Ln4_2.O (Z)V
      // 9c3: return
   }

   public ArrayList s(SyncTaskManifest var1) throws Exception {
      Object var10001 = Registry.packArgs(var1, false);
      long var3 = 454189016043226603L;
      Object var2 = var10001;
      var10001 = Ref.h(454189016043226603L, var2, var3);

      try {
         return (ArrayList)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public ArrayList N(SyncTaskManifest param1, boolean param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Ln4_2.i ()Z
      // 003: aload 0
      // 004: bipush 1
      // 005: ldc2_w 318034124640435565
      // 008: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 00b: dup_x2
      // 00c: pop
      // 00d: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 010: istore 3
      // 011: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 014: ldc2_w 270389152141252877
      // 017: astore 17
      // 019: ldc2_w 270389152141252877
      // 01c: aload 17
      // 01e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 021: goto 028
      // 024: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 027: athrow
      // 028: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02b: ldc2_w 606040881383812332
      // 02e: astore 20
      // 030: astore 19
      // 032: ldc2_w 606040881383812332
      // 035: aload 19
      // 037: aload 20
      // 039: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 03c: goto 043
      // 03f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 042: athrow
      // 043: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 046: ldc2_w 159697299249466811
      // 049: astore 22
      // 04b: astore 21
      // 04d: ldc2_w 159697299249466811
      // 050: aload 21
      // 052: aload 22
      // 054: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 057: goto 05e
      // 05a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 061: ldc2_w 410840802679710653
      // 064: astore 24
      // 066: astore 23
      // 068: ldc2_w 410840802679710653
      // 06b: aload 23
      // 06d: aload 24
      // 06f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 072: pop
      // 073: goto 07a
      // 076: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 079: athrow
      // 07a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07d: ldc2_w 270389152141252877
      // 080: astore 25
      // 082: ldc2_w 270389152141252877
      // 085: aload 25
      // 087: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 08a: goto 091
      // 08d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 090: athrow
      // 091: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 094: ldc2_w 578864097947885485
      // 097: astore 28
      // 099: astore 27
      // 09b: ldc2_w 578864097947885485
      // 09e: aload 27
      // 0a0: aload 28
      // 0a2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a5: pop
      // 0a6: goto 0ad
      // 0a9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0b0: ldc2_w 270389152141252877
      // 0b3: astore 29
      // 0b5: ldc2_w 270389152141252877
      // 0b8: aload 29
      // 0ba: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0bd: goto 0c4
      // 0c0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c7: ldc2_w 375944019649708240
      // 0ca: astore 32
      // 0cc: astore 31
      // 0ce: ldc2_w 375944019649708240
      // 0d1: aload 31
      // 0d3: aload 32
      // 0d5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d8: checkcast com/finalshell/core/U5
      // 0db: goto 0e2
      // 0de: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: astore 4
      // 0e4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e7: ldc2_w 270389152141252877
      // 0ea: astore 33
      // 0ec: ldc2_w 270389152141252877
      // 0ef: aload 33
      // 0f1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f4: goto 0fb
      // 0f7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0fe: ldc2_w 606040881383812332
      // 101: astore 36
      // 103: astore 35
      // 105: ldc2_w 606040881383812332
      // 108: aload 35
      // 10a: aload 36
      // 10c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10f: goto 116
      // 112: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 115: athrow
      // 116: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 119: ldc2_w 140823137094225943
      // 11c: astore 38
      // 11e: astore 37
      // 120: ldc2_w 140823137094225943
      // 123: aload 37
      // 125: aload 38
      // 127: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 12a: checkcast com/finalshell/ui/panel/LogPanel
      // 12d: goto 134
      // 130: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 133: athrow
      // 134: astore 5
      // 136: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 139: ldc2_w 270389152141252877
      // 13c: astore 39
      // 13e: ldc2_w 270389152141252877
      // 141: aload 39
      // 143: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 146: goto 14d
      // 149: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: new com/finalshell/core/Ty4
      // 150: dup
      // 151: ldc2_w 372606448848052772
      // 154: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 157: aconst_null
      // 158: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 15b: invokespecial com/finalshell/core/Ty4.<init> (I)V
      // 15e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 161: ldc2_w 473928376202613579
      // 164: astore 42
      // 166: astore 41
      // 168: ldc2_w 473928376202613579
      // 16b: aload 41
      // 16d: aload 42
      // 16f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 172: pop
      // 173: goto 17a
      // 176: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 179: athrow
      // 17a: aload 5
      // 17c: sipush -17582
      // 17f: sipush -21143
      // 182: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 185: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 188: ldc2_w 539001526584876911
      // 18b: astore 44
      // 18d: astore 43
      // 18f: ldc2_w 539001526584876911
      // 192: aload 43
      // 194: aload 44
      // 196: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 199: pop
      // 19a: goto 1a1
      // 19d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a0: athrow
      // 1a1: aconst_null
      // 1a2: astore 6
      // 1a4: aload 0
      // 1a5: ldc2_w 538673647573365483
      // 1a8: astore 45
      // 1aa: ldc2_w 538673647573365483
      // 1ad: aload 45
      // 1af: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1b2: checkcast com/finalshell/core/Fc2
      // 1b5: iload 3
      // 1b6: ifeq 1f4
      // 1b9: ifnonnull 1e3
      // 1bc: goto 1c3
      // 1bf: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: new com/finalshell/core/Fc2
      // 1c7: dup
      // 1c8: invokespecial com/finalshell/core/Fc2.<init> ()V
      // 1cb: ldc2_w 538673647573365483
      // 1ce: astore 48
      // 1d0: astore 47
      // 1d2: ldc2_w 538673647573365483
      // 1d5: aload 47
      // 1d7: aload 48
      // 1d9: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1dc: goto 1e3
      // 1df: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e2: athrow
      // 1e3: aload 0
      // 1e4: ldc2_w 538673647573365483
      // 1e7: astore 49
      // 1e9: ldc2_w 538673647573365483
      // 1ec: aload 49
      // 1ee: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1f1: checkcast com/finalshell/core/Fc2
      // 1f4: aload 1
      // 1f5: iload 2
      // 1f6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 1f9: ldc2_w 583105421433644988
      // 1fc: astore 52
      // 1fe: astore 51
      // 200: ldc2_w 583105421433644988
      // 203: aload 51
      // 205: aload 52
      // 207: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 20a: checkcast java/util/ArrayList
      // 20d: goto 214
      // 210: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 213: athrow
      // 214: astore 6
      // 216: new com/finalshell/ui/model/K32
      // 219: dup
      // 21a: aload 0
      // 21b: invokespecial com/finalshell/ui/model/K32.<init> (Lcom/finalshell/core/Ln2;)V
      // 21e: astore 7
      // 220: aconst_null
      // 221: astore 8
      // 223: aload 4
      // 225: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 228: ldc2_w 318293696412897294
      // 22b: astore 54
      // 22d: astore 53
      // 22f: ldc2_w 318293696412897294
      // 232: aload 53
      // 234: aload 54
      // 236: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 239: checkcast java/lang/String
      // 23c: goto 243
      // 23f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 242: athrow
      // 243: iload 3
      // 244: ifeq 31c
      // 247: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 24a: ldc2_w 330094358428833085
      // 24d: astore 55
      // 24f: ldc2_w 330094358428833085
      // 252: aload 55
      // 254: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 257: checkcast java/lang/Boolean
      // 25a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 25d: goto 264
      // 260: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 263: athrow
      // 264: ifeq 2e8
      // 267: goto 26e
      // 26a: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26d: athrow
      // 26e: iload 2
      // 26f: ifne 5ec
      // 272: goto 279
      // 275: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 278: athrow
      // 279: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 27c: ldc2_w 270389152141252877
      // 27f: astore 57
      // 281: ldc2_w 270389152141252877
      // 284: aload 57
      // 286: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 289: goto 290
      // 28c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28f: athrow
      // 290: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 293: ldc2_w 368630710474718808
      // 296: astore 60
      // 298: astore 59
      // 29a: ldc2_w 368630710474718808
      // 29d: aload 59
      // 29f: aload 60
      // 2a1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2a4: pop
      // 2a5: goto 2ac
      // 2a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ab: athrow
      // 2ac: aload 5
      // 2ae: sipush -17598
      // 2b1: sipush -13503
      // 2b4: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 2b7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2ba: ldc2_w 539001526584876911
      // 2bd: astore 62
      // 2bf: astore 61
      // 2c1: ldc2_w 539001526584876911
      // 2c4: aload 61
      // 2c6: aload 62
      // 2c8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2cb: pop
      // 2cc: goto 2d3
      // 2cf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d2: athrow
      // 2d3: new java/lang/Exception
      // 2d6: dup
      // 2d7: sipush -17564
      // 2da: sipush 31378
      // 2dd: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 2e0: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 2e3: athrow
      // 2e4: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e7: athrow
      // 2e8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2eb: ldc2_w 195582273090724263
      // 2ee: astore 63
      // 2f0: ldc2_w 195582273090724263
      // 2f3: aload 63
      // 2f5: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2f8: checkcast [B
      // 2fb: goto 302
      // 2fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 301: athrow
      // 302: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 305: ldc2_w 123747197988873662
      // 308: astore 65
      // 30a: ldc2_w 123747197988873662
      // 30d: aload 65
      // 30f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 312: checkcast java/lang/String
      // 315: goto 31c
      // 318: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 31b: athrow
      // 31c: astore 9
      // 31e: new java/util/HashMap
      // 321: dup
      // 322: invokespecial java/util/HashMap.<init> ()V
      // 325: astore 10
      // 327: aload 6
      // 329: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 32c: astore 11
      // 32e: aload 11
      // 330: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 335: ifeq 4c4
      // 338: aload 11
      // 33a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 33f: checkcast com/finalshell/core/Kb4
      // 342: astore 12
      // 344: aload 12
      // 346: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 349: ldc2_w 118781644472573462
      // 34c: astore 68
      // 34e: astore 67
      // 350: ldc2_w 118781644472573462
      // 353: aload 67
      // 355: aload 68
      // 357: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 35a: checkcast java/lang/String
      // 35d: goto 364
      // 360: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 363: athrow
      // 364: astore 13
      // 366: aload 12
      // 368: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 36b: ldc2_w 251108130869296981
      // 36e: astore 70
      // 370: astore 69
      // 372: ldc2_w 251108130869296981
      // 375: aload 69
      // 377: aload 70
      // 379: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 37c: checkcast java/lang/String
      // 37f: goto 386
      // 382: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 385: athrow
      // 386: aload 9
      // 388: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 38b: iload 3
      // 38c: ifeq 4d7
      // 38f: iload 3
      // 390: ifeq 3a5
      // 393: goto 39a
      // 396: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 399: athrow
      // 39a: ifne 424
      // 39d: goto 3a4
      // 3a0: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: iload 2
      // 3a5: ifne 431
      // 3a8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3ab: ldc2_w 270389152141252877
      // 3ae: astore 71
      // 3b0: ldc2_w 270389152141252877
      // 3b3: aload 71
      // 3b5: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b8: goto 3bf
      // 3bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3be: athrow
      // 3bf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3c2: ldc2_w 368630710474718808
      // 3c5: astore 74
      // 3c7: astore 73
      // 3c9: ldc2_w 368630710474718808
      // 3cc: aload 73
      // 3ce: aload 74
      // 3d0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3d3: pop
      // 3d4: goto 3db
      // 3d7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3da: athrow
      // 3db: aload 0
      // 3dc: bipush 1
      // 3dd: ldc2_w 271573489181596787
      // 3e0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3e3: dup_x2
      // 3e4: pop
      // 3e5: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 3e8: aload 5
      // 3ea: sipush -17595
      // 3ed: sipush -21889
      // 3f0: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 3f3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3f6: ldc2_w 539001526584876911
      // 3f9: astore 76
      // 3fb: astore 75
      // 3fd: ldc2_w 539001526584876911
      // 400: aload 75
      // 402: aload 76
      // 404: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 407: pop
      // 408: goto 40f
      // 40b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 40e: athrow
      // 40f: new java/lang/Exception
      // 412: dup
      // 413: sipush -17591
      // 416: sipush -14725
      // 419: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 41c: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 41f: athrow
      // 420: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 423: athrow
      // 424: aload 0
      // 425: bipush 0
      // 426: ldc2_w 271573489181596787
      // 429: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 42c: dup_x2
      // 42d: pop
      // 42e: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 431: aload 13
      // 433: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 436: ldc2_w 535022744639665739
      // 439: astore 77
      // 43b: ldc2_w 535022744639665739
      // 43e: aload 77
      // 440: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 443: checkcast java/lang/String
      // 446: goto 44d
      // 449: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44c: athrow
      // 44d: astore 14
      // 44f: aload 10
      // 451: aload 14
      // 453: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 456: checkcast java/util/ArrayList
      // 459: astore 15
      // 45b: aload 15
      // 45d: iload 3
      // 45e: ifeq 47d
      // 461: ifnonnull 47e
      // 464: goto 46b
      // 467: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46a: athrow
      // 46b: new java/util/ArrayList
      // 46e: dup
      // 46f: invokespecial java/util/ArrayList.<init> ()V
      // 472: astore 15
      // 474: aload 10
      // 476: aload 14
      // 478: aload 15
      // 47a: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 47d: pop
      // 47e: aload 12
      // 480: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 483: ldc2_w 251108130869296981
      // 486: astore 80
      // 488: astore 79
      // 48a: ldc2_w 251108130869296981
      // 48d: aload 79
      // 48f: aload 80
      // 491: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 494: checkcast java/lang/String
      // 497: goto 49e
      // 49a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 49d: athrow
      // 49e: aload 9
      // 4a0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a3: iload 3
      // 4a4: ifeq 4bf
      // 4a7: ifeq 4c0
      // 4aa: goto 4b1
      // 4ad: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b0: athrow
      // 4b1: aload 15
      // 4b3: aload 12
      // 4b5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4b8: goto 4bf
      // 4bb: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4be: athrow
      // 4bf: pop
      // 4c0: iload 3
      // 4c1: ifne 32e
      // 4c4: aload 10
      // 4c6: invokevirtual java/util/HashMap.keySet ()Ljava/util/Set;
      // 4c9: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 4ce: astore 11
      // 4d0: aload 11
      // 4d2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4d7: ifeq 5ec
      // 4da: aload 11
      // 4dc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4e1: checkcast java/lang/String
      // 4e4: astore 12
      // 4e6: aload 10
      // 4e8: aload 12
      // 4ea: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4ed: checkcast java/util/ArrayList
      // 4f0: astore 13
      // 4f2: aload 13
      // 4f4: aload 7
      // 4f6: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 4f9: aload 13
      // 4fb: iload 3
      // 4fc: ifeq 7a3
      // 4ff: iload 3
      // 500: ifeq 524
      // 503: goto 50a
      // 506: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 509: athrow
      // 50a: invokevirtual java/util/ArrayList.size ()I
      // 50d: ifle 5e1
      // 510: goto 517
      // 513: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 516: athrow
      // 517: aload 13
      // 519: bipush 0
      // 51a: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 51d: goto 524
      // 520: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 523: athrow
      // 524: checkcast com/finalshell/core/Kb4
      // 527: astore 14
      // 529: aload 1
      // 52a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 52d: ldc2_w 227628799573594622
      // 530: astore 82
      // 532: astore 81
      // 534: ldc2_w 227628799573594622
      // 537: aload 81
      // 539: aload 82
      // 53b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 53e: checkcast java/lang/String
      // 541: goto 548
      // 544: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 547: athrow
      // 548: aload 14
      // 54a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 54d: ldc2_w 321444386962616854
      // 550: astore 84
      // 552: astore 83
      // 554: ldc2_w 321444386962616854
      // 557: aload 83
      // 559: aload 84
      // 55b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 55e: checkcast java/lang/String
      // 561: goto 568
      // 564: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 567: athrow
      // 568: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 56b: iload 3
      // 56c: ifeq 5a3
      // 56f: ifne 5e1
      // 572: goto 579
      // 575: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 578: athrow
      // 579: aload 14
      // 57b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 57e: ldc2_w 457396111797172179
      // 581: astore 86
      // 583: astore 85
      // 585: ldc2_w 457396111797172179
      // 588: aload 85
      // 58a: aload 86
      // 58c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 58f: checkcast java/lang/Boolean
      // 592: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 595: goto 59c
      // 598: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 59b: athrow
      // 59c: goto 5a3
      // 59f: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a2: athrow
      // 5a3: ifne 5e1
      // 5a6: aload 0
      // 5a7: ldc2_w 538673647573365483
      // 5aa: astore 87
      // 5ac: ldc2_w 538673647573365483
      // 5af: aload 87
      // 5b1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 5b4: aload 1
      // 5b5: aload 14
      // 5b7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 5ba: ldc2_w 397520895335995821
      // 5bd: astore 90
      // 5bf: astore 89
      // 5c1: ldc2_w 397520895335995821
      // 5c4: aload 89
      // 5c6: aload 90
      // 5c8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5cb: pop
      // 5cc: goto 5d3
      // 5cf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5d2: athrow
      // 5d3: goto 5e1
      // 5d6: astore 15
      // 5d8: aload 15
      // 5da: invokevirtual java/lang/Exception.printStackTrace ()V
      // 5dd: iload 3
      // 5de: ifne 5ec
      // 5e1: iload 3
      // 5e2: ifne 4d0
      // 5e5: goto 5ec
      // 5e8: invokestatic com/finalshell/core/Ln2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5eb: athrow
      // 5ec: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5ef: ldc2_w 270389152141252877
      // 5f2: astore 91
      // 5f4: ldc2_w 270389152141252877
      // 5f7: aload 91
      // 5f9: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 5fc: goto 603
      // 5ff: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 602: athrow
      // 603: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 606: ldc2_w 606040881383812332
      // 609: astore 94
      // 60b: astore 93
      // 60d: ldc2_w 606040881383812332
      // 610: aload 93
      // 612: aload 94
      // 614: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 617: goto 61e
      // 61a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 61d: athrow
      // 61e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 621: ldc2_w 159697299249466811
      // 624: astore 96
      // 626: astore 95
      // 628: ldc2_w 159697299249466811
      // 62b: aload 95
      // 62d: aload 96
      // 62f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 632: goto 639
      // 635: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 638: athrow
      // 639: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 63c: ldc2_w 314896245163665511
      // 63f: astore 98
      // 641: astore 97
      // 643: ldc2_w 314896245163665511
      // 646: aload 97
      // 648: aload 98
      // 64a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 64d: pop
      // 64e: goto 655
      // 651: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 654: athrow
      // 655: aload 5
      // 657: sipush -17583
      // 65a: sipush -5088
      // 65d: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 660: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 663: ldc2_w 539001526584876911
      // 666: astore 100
      // 668: astore 99
      // 66a: ldc2_w 539001526584876911
      // 66d: aload 99
      // 66f: aload 100
      // 671: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 674: pop
      // 675: goto 67c
      // 678: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 67b: athrow
      // 67c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 67f: ldc2_w 270389152141252877
      // 682: astore 101
      // 684: ldc2_w 270389152141252877
      // 687: aload 101
      // 689: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 68c: goto 693
      // 68f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 692: athrow
      // 693: new com/finalshell/core/Ty4
      // 696: dup
      // 697: ldc2_w 213416441008748074
      // 69a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 69d: aconst_null
      // 69e: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 6a1: invokespecial com/finalshell/core/Ty4.<init> (I)V
      // 6a4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 6a7: ldc2_w 473928376202613579
      // 6aa: astore 104
      // 6ac: astore 103
      // 6ae: ldc2_w 473928376202613579
      // 6b1: aload 103
      // 6b3: aload 104
      // 6b5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6b8: pop
      // 6b9: goto 6c0
      // 6bc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6bf: athrow
      // 6c0: goto 7a1
      // 6c3: astore 7
      // 6c5: aload 7
      // 6c7: athrow
      // 6c8: astore 16
      // 6ca: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6cd: ldc2_w 270389152141252877
      // 6d0: astore 105
      // 6d2: ldc2_w 270389152141252877
      // 6d5: aload 105
      // 6d7: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 6da: goto 6e1
      // 6dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6e0: athrow
      // 6e1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6e4: ldc2_w 606040881383812332
      // 6e7: astore 108
      // 6e9: astore 107
      // 6eb: ldc2_w 606040881383812332
      // 6ee: aload 107
      // 6f0: aload 108
      // 6f2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6f5: goto 6fc
      // 6f8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6fb: athrow
      // 6fc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 6ff: ldc2_w 159697299249466811
      // 702: astore 110
      // 704: astore 109
      // 706: ldc2_w 159697299249466811
      // 709: aload 109
      // 70b: aload 110
      // 70d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 710: goto 717
      // 713: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 716: athrow
      // 717: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 71a: ldc2_w 314896245163665511
      // 71d: astore 112
      // 71f: astore 111
      // 721: ldc2_w 314896245163665511
      // 724: aload 111
      // 726: aload 112
      // 728: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 72b: pop
      // 72c: goto 733
      // 72f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 732: athrow
      // 733: aload 5
      // 735: sipush -17562
      // 738: sipush -4574
      // 73b: invokestatic com/finalshell/core/Ln2.a (II)Ljava/lang/String;
      // 73e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 741: ldc2_w 539001526584876911
      // 744: astore 114
      // 746: astore 113
      // 748: ldc2_w 539001526584876911
      // 74b: aload 113
      // 74d: aload 114
      // 74f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 752: pop
      // 753: goto 75a
      // 756: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 759: athrow
      // 75a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 75d: ldc2_w 270389152141252877
      // 760: astore 115
      // 762: ldc2_w 270389152141252877
      // 765: aload 115
      // 767: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 76a: goto 771
      // 76d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 770: athrow
      // 771: new com/finalshell/core/Ty4
      // 774: dup
      // 775: ldc2_w 213416441008748074
      // 778: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 77b: aconst_null
      // 77c: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 77f: invokespecial com/finalshell/core/Ty4.<init> (I)V
      // 782: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 785: ldc2_w 473928376202613579
      // 788: astore 118
      // 78a: astore 117
      // 78c: ldc2_w 473928376202613579
      // 78f: aload 117
      // 791: aload 118
      // 793: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 796: pop
      // 797: goto 79e
      // 79a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 79d: athrow
      // 79e: aload 16
      // 7a0: athrow
      // 7a1: aload 6
      // 7a3: areturn
   }

   public static O0 g$O0() {
      long var36;
      O0 var0 = new O0();
      Registry.emptyArgs();
      long var4 = 270389152141252877L;
      Ref.h2(270389152141252877L, var4);
      Object[] var10002 = Registry.emptyArgs();
      long var7 = 306266403902896148L;
      Object[] var6 = var10002;
      Ref.h(306266403902896148L, var6, var7);
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var9 = 518875030097846779L;
      Object var8 = var10003;
      var10003 = Ref.h(518875030097846779L, var8, var9);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      ArrayList var1 = var10003;
      Registry.packArgs(var1);
      long var10 = 182635210648070543L;
      Object var10004 = Ref.h2(182635210648070543L, var10);

      try {
         var10004 = (Oc2)var10004;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      Oc2 var2 = (Oc2)var10004;
      var0.C(a(-17587, -8730), Registry.lookupField(480608041771242681L).getInt(null));
      var0.C(a(-17600, 19950), var2);
      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10006 = Registry.emptyArgs();
      long var15 = 410905379772103887L;
      Object[] var14 = var10006;
      Ref.h(410905379772103887L, var14, var15);
      O0 var10007 = (O0)(Registry.emptyArgs());
      long var17 = 134991188926814107L;
      Object var16 = var10007;
      var10007 = Ref.h(134991188926814107L, var16, var17);

      try {
         var10007 = (O0)var10007;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      O0 var3 = var10007;
      var0.C(a(-17570, -1334), var3);
      String var10008 = a(-17563, -8829);
      Object[] var10009 = Registry.emptyArgs();
      long var18 = 268108346955739333L;
      Object var10010 = Ref.h2(268108346955739333L, var18);

      try {
         var10010 = (Oc2)var10010;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      var10008.C(var10009, var10010);
      String var57 = a(-17588, 20985);
      var10010 = Registry.emptyArgs();
      long var20 = 532350992480855315L;
      Object var10011 = Ref.h2(532350992480855315L, var20);

      try {
         var10011 = (Oc2)var10011;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      var57.C((String)var10010, var10011);
      a(-17561, 22304);
      Registry.emptyArgs();
      long var22 = 270389152141252877L;
      Ref.h2(270389152141252877L, var22);
      O0 var10013 = Registry.emptyArgs();
      long var25 = 306266403902896148L;
      Object var24 = var10013;
      var10013 = (O0)Ref.h(306266403902896148L, var24, var25);
      Object[] var10014 = Registry.emptyArgs();
      long var27 = 401275417195122293L;
      Object[] var26 = var10014;
      var10014 = Registry.packArgs(Ref.h(401275417195122293L, var26, var27));
      long var28 = 251261304717244274L;
      Object var10015 = Ref.h2(251261304717244274L, var28);

      try {
         var10015 = (Oc2)var10015;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      var10013.C(var10014, var10015);
      a(-17589, 19593);
      Registry.emptyArgs();
      long var30 = 270389152141252877L;
      Ref.h2(270389152141252877L, var30);
      O0 var10017 = Registry.emptyArgs();
      long var33 = 306266403902896148L;
      Object var32 = var10017;
      var10017 = (O0)Ref.h(306266403902896148L, var32, var33);
      Object[] var10018 = Registry.emptyArgs();
      long var35 = 626356373183057367L;
      Object[] var34 = var10018;
      var10018 = Registry.packArgs(Ref.h(626356373183057367L, var34, var35));
      var36 = 341686017445594106L;
      Object var10019 = Ref.h2(341686017445594106L, var36);

      try {
         var10019 = (Oc2)var10019;
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      var10017.C(var10018, var10019);
      a(-17575, -24492);
      Registry.emptyArgs();
      long var38 = 270389152141252877L;
      Object var10020 = Ref.h2(270389152141252877L, var38);
      Object[] var10021 = Registry.emptyArgs();
      long var41 = 445913128761932285L;
      Object[] var40 = var10021;
      var10021 = Ref.h(445913128761932285L, var40, var41);
      O0 var10022 = (O0)(Registry.emptyArgs());
      long var43 = 473402910517899072L;
      Object var42 = var10022;
      var10022 = Ref.h(473402910517899072L, var42, var43);

      try {
         var10022 = (O0)var10022;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      ((O0)var10020).C(var10021, var10022);
      return var0;
   }

   public SyncTaskManifest g$Lp_2() {
      Object var1 = 358782464092968093L;
      return (SyncTaskManifest)Ref.g(358782464092968093L, var1);
   }

   public void W(SyncTaskManifest var1) {
      long var3 = 358782464092968093L;
      Ref.s(358782464092968093L, var1, var3);
   }

   public Fc2 E$Fc_2() {
      Object var1 = 538673647573365483L;
      return (Fc2)Ref.g(538673647573365483L, var1);
   }

   public void J(Fc2 var1) {
      long var3 = 538673647573365483L;
      Ref.s(538673647573365483L, var1, var3);
   }

   public boolean E$boolean() {
      return Registry.lookupField(271573489181596787L).getBoolean(this);
   }

   public void s(boolean var1) {
      Registry.lookupField(271573489181596787L).setBoolean(this, var1);
   }

   public boolean Q() {
      return Registry.lookupField(318034124640435565L).getBoolean(this);
   }

   public void i(boolean var1) {
      Registry.lookupField(318034124640435565L).setBoolean(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -17595) & 65535;
      if (c[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 63;
               break;
            case 1:
               var10000 = 4;
               break;
            case 2:
               var10000 = 37;
               break;
            case 3:
               var10000 = 163;
               break;
            case 4:
               var10000 = 15;
               break;
            case 5:
               var10000 = 17;
               break;
            case 6:
               var10000 = 23;
               break;
            case 7:
               var10000 = 36;
               break;
            case 8:
               var10000 = 144;
               break;
            case 9:
               var10000 = 200;
               break;
            case 10:
               var10000 = 167;
               break;
            case 11:
               var10000 = 104;
               break;
            case 12:
               var10000 = 160;
               break;
            case 13:
               var10000 = 162;
               break;
            case 14:
               var10000 = 118;
               break;
            case 15:
               var10000 = 113;
               break;
            case 16:
               var10000 = 235;
               break;
            case 17:
               var10000 = 154;
               break;
            case 18:
               var10000 = 129;
               break;
            case 19:
               var10000 = 126;
               break;
            case 20:
               var10000 = 77;
               break;
            case 21:
               var10000 = 201;
               break;
            case 22:
               var10000 = 224;
               break;
            case 23:
               var10000 = 203;
               break;
            case 24:
               var10000 = 60;
               break;
            case 25:
               var10000 = 185;
               break;
            case 26:
               var10000 = 223;
               break;
            case 27:
               var10000 = 38;
               break;
            case 28:
               var10000 = 32;
               break;
            case 29:
               var10000 = 6;
               break;
            case 30:
               var10000 = 109;
               break;
            case 31:
               var10000 = 3;
               break;
            case 32:
               var10000 = 170;
               break;
            case 33:
               var10000 = 48;
               break;
            case 34:
               var10000 = 66;
               break;
            case 35:
               var10000 = 88;
               break;
            case 36:
               var10000 = 178;
               break;
            case 37:
               var10000 = 75;
               break;
            case 38:
               var10000 = 216;
               break;
            case 39:
               var10000 = 98;
               break;
            case 40:
               var10000 = 231;
               break;
            case 41:
               var10000 = 195;
               break;
            case 42:
               var10000 = 190;
               break;
            case 43:
               var10000 = 9;
               break;
            case 44:
               var10000 = 28;
               break;
            case 45:
               var10000 = 40;
               break;
            case 46:
               var10000 = 2;
               break;
            case 47:
               var10000 = 125;
               break;
            case 48:
               var10000 = 186;
               break;
            case 49:
               var10000 = 43;
               break;
            case 50:
               var10000 = 74;
               break;
            case 51:
               var10000 = 69;
               break;
            case 52:
               var10000 = 210;
               break;
            case 53:
               var10000 = 169;
               break;
            case 54:
               var10000 = 61;
               break;
            case 55:
               var10000 = 230;
               break;
            case 56:
               var10000 = 21;
               break;
            case 57:
               var10000 = 206;
               break;
            case 58:
               var10000 = 217;
               break;
            case 59:
               var10000 = 229;
               break;
            case 60:
               var10000 = 25;
               break;
            case 61:
               var10000 = 46;
               break;
            case 62:
               var10000 = 164;
               break;
            case 63:
               var10000 = 240;
               break;
            case 64:
               var10000 = 130;
               break;
            case 65:
               var10000 = 124;
               break;
            case 66:
               var10000 = 150;
               break;
            case 67:
               var10000 = 249;
               break;
            case 68:
               var10000 = 149;
               break;
            case 69:
               var10000 = 243;
               break;
            case 70:
               var10000 = 212;
               break;
            case 71:
               var10000 = 135;
               break;
            case 72:
               var10000 = 140;
               break;
            case 73:
               var10000 = 133;
               break;
            case 74:
               var10000 = 132;
               break;
            case 75:
               var10000 = 92;
               break;
            case 76:
               var10000 = 70;
               break;
            case 77:
               var10000 = 246;
               break;
            case 78:
               var10000 = 161;
               break;
            case 79:
               var10000 = 26;
               break;
            case 80:
               var10000 = 49;
               break;
            case 81:
               var10000 = 174;
               break;
            case 82:
               var10000 = 202;
               break;
            case 83:
               var10000 = 208;
               break;
            case 84:
               var10000 = 65;
               break;
            case 85:
               var10000 = 137;
               break;
            case 86:
               var10000 = 107;
               break;
            case 87:
               var10000 = 218;
               break;
            case 88:
               var10000 = 62;
               break;
            case 89:
               var10000 = 84;
               break;
            case 90:
               var10000 = 22;
               break;
            case 91:
               var10000 = 179;
               break;
            case 92:
               var10000 = 139;
               break;
            case 93:
               var10000 = 58;
               break;
            case 94:
               var10000 = 168;
               break;
            case 95:
               var10000 = 184;
               break;
            case 96:
               var10000 = 234;
               break;
            case 97:
               var10000 = 8;
               break;
            case 98:
               var10000 = 34;
               break;
            case 99:
               var10000 = 123;
               break;
            case 100:
               var10000 = 134;
               break;
            case 101:
               var10000 = 93;
               break;
            case 102:
               var10000 = 209;
               break;
            case 103:
               var10000 = 171;
               break;
            case 104:
               var10000 = 27;
               break;
            case 105:
               var10000 = 115;
               break;
            case 106:
               var10000 = 29;
               break;
            case 107:
               var10000 = 244;
               break;
            case 108:
               var10000 = 173;
               break;
            case 109:
               var10000 = 211;
               break;
            case 110:
               var10000 = 112;
               break;
            case 111:
               var10000 = 95;
               break;
            case 112:
               var10000 = 196;
               break;
            case 113:
               var10000 = 76;
               break;
            case 114:
               var10000 = 250;
               break;
            case 115:
               var10000 = 16;
               break;
            case 116:
               var10000 = 225;
               break;
            case 117:
               var10000 = 103;
               break;
            case 118:
               var10000 = 151;
               break;
            case 119:
               var10000 = 53;
               break;
            case 120:
               var10000 = 245;
               break;
            case 121:
               var10000 = 198;
               break;
            case 122:
               var10000 = 128;
               break;
            case 123:
               var10000 = 155;
               break;
            case 124:
               var10000 = 41;
               break;
            case 125:
               var10000 = 117;
               break;
            case 126:
               var10000 = 215;
               break;
            case 127:
               var10000 = 24;
               break;
            case 128:
               var10000 = 180;
               break;
            case 129:
               var10000 = 148;
               break;
            case 130:
               var10000 = 197;
               break;
            case 131:
               var10000 = 226;
               break;
            case 132:
               var10000 = 101;
               break;
            case 133:
               var10000 = 193;
               break;
            case 134:
               var10000 = 248;
               break;
            case 135:
               var10000 = 50;
               break;
            case 136:
               var10000 = 13;
               break;
            case 137:
               var10000 = 205;
               break;
            case 138:
               var10000 = 253;
               break;
            case 139:
               var10000 = 110;
               break;
            case 140:
               var10000 = 89;
               break;
            case 141:
               var10000 = 222;
               break;
            case 142:
               var10000 = 10;
               break;
            case 143:
               var10000 = 157;
               break;
            case 144:
               var10000 = 42;
               break;
            case 145:
               var10000 = 97;
               break;
            case 146:
               var10000 = 237;
               break;
            case 147:
               var10000 = 102;
               break;
            case 148:
               var10000 = 189;
               break;
            case 149:
               var10000 = 181;
               break;
            case 150:
               var10000 = 188;
               break;
            case 151:
               var10000 = 91;
               break;
            case 152:
               var10000 = 127;
               break;
            case 153:
               var10000 = 78;
               break;
            case 154:
               var10000 = 47;
               break;
            case 155:
               var10000 = 99;
               break;
            case 156:
               var10000 = 81;
               break;
            case 157:
               var10000 = 51;
               break;
            case 158:
               var10000 = 54;
               break;
            case 159:
               var10000 = 143;
               break;
            case 160:
               var10000 = 114;
               break;
            case 161:
               var10000 = 79;
               break;
            case 162:
               var10000 = 221;
               break;
            case 163:
               var10000 = 116;
               break;
            case 164:
               var10000 = 159;
               break;
            case 165:
               var10000 = 255;
               break;
            case 166:
               var10000 = 213;
               break;
            case 167:
               var10000 = 120;
               break;
            case 168:
               var10000 = 254;
               break;
            case 169:
               var10000 = 7;
               break;
            case 170:
               var10000 = 87;
               break;
            case 171:
               var10000 = 5;
               break;
            case 172:
               var10000 = 207;
               break;
            case 173:
               var10000 = 121;
               break;
            case 174:
               var10000 = 30;
               break;
            case 175:
               var10000 = 111;
               break;
            case 176:
               var10000 = 55;
               break;
            case 177:
               var10000 = 239;
               break;
            case 178:
               var10000 = 82;
               break;
            case 179:
               var10000 = 85;
               break;
            case 180:
               var10000 = 94;
               break;
            case 181:
               var10000 = 238;
               break;
            case 182:
               var10000 = 136;
               break;
            case 183:
               var10000 = 175;
               break;
            case 184:
               var10000 = 156;
               break;
            case 185:
               var10000 = 153;
               break;
            case 186:
               var10000 = 105;
               break;
            case 187:
               var10000 = 242;
               break;
            case 188:
               var10000 = 108;
               break;
            case 189:
               var10000 = 251;
               break;
            case 190:
               var10000 = 56;
               break;
            case 191:
               var10000 = 227;
               break;
            case 192:
               var10000 = 228;
               break;
            case 193:
               var10000 = 11;
               break;
            case 194:
               var10000 = 182;
               break;
            case 195:
               var10000 = 172;
               break;
            case 196:
               var10000 = 83;
               break;
            case 197:
               var10000 = 72;
               break;
            case 198:
               var10000 = 142;
               break;
            case 199:
               var10000 = 18;
               break;
            case 200:
               var10000 = 90;
               break;
            case 201:
               var10000 = 19;
               break;
            case 202:
               var10000 = 131;
               break;
            case 203:
               var10000 = 39;
               break;
            case 204:
               var10000 = 191;
               break;
            case 205:
               var10000 = 247;
               break;
            case 206:
               var10000 = 204;
               break;
            case 207:
               var10000 = 241;
               break;
            case 208:
               var10000 = 80;
               break;
            case 209:
               var10000 = 14;
               break;
            case 210:
               var10000 = 73;
               break;
            case 211:
               var10000 = 64;
               break;
            case 212:
               var10000 = 71;
               break;
            case 213:
               var10000 = 1;
               break;
            case 214:
               var10000 = 232;
               break;
            case 215:
               var10000 = 86;
               break;
            case 216:
               var10000 = 12;
               break;
            case 217:
               var10000 = 35;
               break;
            case 218:
               var10000 = 165;
               break;
            case 219:
               var10000 = 68;
               break;
            case 220:
               var10000 = 96;
               break;
            case 221:
               var10000 = 219;
               break;
            case 222:
               var10000 = 31;
               break;
            case 223:
               var10000 = 177;
               break;
            case 224:
               var10000 = 194;
               break;
            case 225:
               var10000 = 158;
               break;
            case 226:
               var10000 = 119;
               break;
            case 227:
               var10000 = 138;
               break;
            case 228:
               var10000 = 214;
               break;
            case 229:
               var10000 = 57;
               break;
            case 230:
               var10000 = 141;
               break;
            case 231:
               var10000 = 52;
               break;
            case 232:
               var10000 = 0;
               break;
            case 233:
               var10000 = 59;
               break;
            case 234:
               var10000 = 176;
               break;
            case 235:
               var10000 = 233;
               break;
            case 236:
               var10000 = 147;
               break;
            case 237:
               var10000 = 67;
               break;
            case 238:
               var10000 = 192;
               break;
            case 239:
               var10000 = 33;
               break;
            case 240:
               var10000 = 145;
               break;
            case 241:
               var10000 = 100;
               break;
            case 242:
               var10000 = 122;
               break;
            case 243:
               var10000 = 187;
               break;
            case 244:
               var10000 = 199;
               break;
            case 245:
               var10000 = 106;
               break;
            case 246:
               var10000 = 146;
               break;
            case 247:
               var10000 = 183;
               break;
            case 248:
               var10000 = 152;
               break;
            case 249:
               var10000 = 252;
               break;
            case 250:
               var10000 = 44;
               break;
            case 251:
               var10000 = 166;
               break;
            case 252:
               var10000 = 236;
               break;
            case 253:
               var10000 = 20;
               break;
            case 254:
               var10000 = 45;
               break;
            default:
               var10000 = 220;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30336;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var36;
      String[] var15 = new String[42];
      int var13 = 0;
      String var12 = "哊毁寠碝閃謗\u0010Õdÿðç\u0092$å¼=ÏÃúoµ9\bÛ\u0088\u0084BbPmÀ\u0004\"\u00924z\u0007\fS\u0011è\u001bÙ\u0080\u000e\u0099ç÷)I\u001f\u0086\u0014G\u009f$ÅÇ¢\b价佃鄊罏\u0013\u000em&\u0006迅凐咧毛嬧磙\u0015\u009dq2v\"ÛHF´×b\u0081Eè\u00139Zð\u0086\u00060\f¸\u0012#\u000eB\n_{.ï \u009e\u0004§7ml\u000b-x¢\f\u0001\u0098ß²{&G\u0006咯欎孌硤锖謨\u0007¾\u009cïh7¦â\u000f¢\u0094ØDéªaè\b\u0090ú°èN\u0001\b\u0096@\u009e\nìv\u0099Ê\bòã\u0012~}ø«\u001b\t>ß¼°M\f²g\u0019\u000eB´ÉÎ]Ø´«OS£jVô\u0007丛佤醗羫妿趙\n\u0004咅殥縜杏\u0004Ðñ\u0083´\u00073é^Æ\u0001s$\u0007弣天咚殟h~\u0002\bä~\u009bÌ&\u0080;À\t²>b\u008bj¼Ru\u0097\u0007乁佇釜翏拷劯\u0006\u000b0q\u0095¯ì_ê¡=ì;\t6\u009e°\u0012\u001b\u0088<\u0017\u0083\u0007gÐ|\u0098¶×5\u0005à2vc%\u0010\u009d\"Å\u0085µvÙX\u0003\u008a85\u0004±jâ\u000bÛ2â´D!T8\r}7\u0006迖儅哅歡孫碎\u0007\u0094¼q¾]¯V\u0004哳歋绒枒\t:¥søHØ\u0016«\u001b\bk\u001e\u0092\u0090 \n5\u008b\u0003ÌÔÜ\t\fÖµ\u0096\u0090\u001f\r\u0001|";
      int var14 = "哊毁寠碝閃謗\u0010Õdÿðç\u0092$å¼=ÏÃúoµ9\bÛ\u0088\u0084BbPmÀ\u0004\"\u00924z\u0007\fS\u0011è\u001bÙ\u0080\u000e\u0099ç÷)I\u001f\u0086\u0014G\u009f$ÅÇ¢\b价佃鄊罏\u0013\u000em&\u0006迅凐咧毛嬧磙\u0015\u009dq2v\"ÛHF´×b\u0081Eè\u00139Zð\u0086\u00060\f¸\u0012#\u000eB\n_{.ï \u009e\u0004§7ml\u000b-x¢\f\u0001\u0098ß²{&G\u0006咯欎孌硤锖謨\u0007¾\u009cïh7¦â\u000f¢\u0094ØDéªaè\b\u0090ú°èN\u0001\b\u0096@\u009e\nìv\u0099Ê\bòã\u0012~}ø«\u001b\t>ß¼°M\f²g\u0019\u000eB´ÉÎ]Ø´«OS£jVô\u0007丛佤醗羫妿趙\n\u0004咅殥縜杏\u0004Ðñ\u0083´\u00073é^Æ\u0001s$\u0007弣天咚殟h~\u0002\bä~\u009bÌ&\u0080;À\t²>b\u008bj¼Ru\u0097\u0007乁佇釜翏拷劯\u0006\u000b0q\u0095¯ì_ê¡=ì;\t6\u009e°\u0012\u001b\u0088<\u0017\u0083\u0007gÐ|\u0098¶×5\u0005à2vc%\u0010\u009d\"Å\u0085µvÙX\u0003\u008a85\u0004±jâ\u000bÛ2â´D!T8\r}7\u0006迖儅哅歡孫碎\u0007\u0094¼q¾]¯V\u0004哳歋绒枒\t:¥søHØ\u0016«\u001b\bk\u001e\u0092\u0090 \n5\u008b\u0003ÌÔÜ\t\fÖµ\u0096\u0090\u001f\r\u0001|"
         .length();
      char var11 = 6;
      int var19 = -1;

      label70:
      while (true) {
         byte var10000 = 26;
         String var10001 = var12.substring(++var19, var19 + var11);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var16 = 0;
               byte var46 = var10000;
               var36 = var43;
               int var26 = var10004;
               byte var53;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               } else {
                  var46 = var10000;
                  var26 = var10004;
                  if (var10004 <= var16) {
                     break label65;
                  }

                  var59 = var43;
                  var53 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var68 = var59[var10006];
                  byte var69;
                  switch (var16 % 7) {
                     case 0:
                        var69 = 118;
                        break;
                     case 1:
                        var69 = 107;
                        break;
                     case 2:
                        var69 = 101;
                        break;
                     case 3:
                        var69 = 89;
                        break;
                     case 4:
                        var69 = 109;
                        break;
                     case 5:
                        var69 = 24;
                        break;
                     default:
                        var69 = 62;
                  }

                  var59[var10006] = (char)(var68 ^ var53 ^ var69);
                  var16++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var59 = var36;
                     var53 = var46;
                  } else {
                     if (var26 <= var16) {
                        break;
                     }

                     var59 = var36;
                     var53 = var46;
                     var10006 = var16;
                  }
               }
            }

            String var48 = new String(var36).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var48;
                  if ((var19 += var11) >= var14) {
                     b = var15;
                     c = new String[42];
                     long var2 = 7788966879425885790L;
                     long[] var8 = new long[4];
                     int var5 = 0;
                     String var6 = "LÉ\u0000)\u0095~$\u0082ÀÓÊ\u0099\u0086ùè\u0081";
                     int var7 = "LÉ\u0000)\u0095~$\u0082ÀÓÊ\u0099\u0086ùè\u0081".length();
                     byte var4 = 0;

                     label44:
                     while (true) {
                        byte var28 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var28, var4).getBytes("ISO-8859-1");
                        long[] var21 = var8;
                        int var29 = var5++;
                        long var40 = ((long)var9[0] & 255L) << 56
                           | ((long)var9[1] & 255L) << 48
                           | ((long)var9[2] & 255L) << 40
                           | ((long)var9[3] & 255L) << 32
                           | ((long)var9[4] & 255L) << 24
                           | ((long)var9[5] & 255L) << 16
                           | ((long)var9[6] & 255L) << 8
                           | (long)var9[7] & 255L;
                        byte var49 = -1;

                        while (true) {
                           long var58 = var40 ^ var2;
                           switch (var49) {
                              case 0:
                                 var21[var29] = var58;
                                 if (var4 >= var7) {
                                    d = var8;
                                    e = new Integer[4];
                                    long var0 = 5656713090707203524L;
                                    long var42 = 5656713090707194580L ^ var0;
                                    byte var31 = -1;
                                    h = var42;
                                    Registry.lookupField(241952205888459709L).set(null, a(-17586, -2397));
                                    Registry.lookupField(586616405392613137L).set(null, a(-17577, -16801));
                                    Registry.lookupField(480608041771242681L).setInt(null, a(9275, 3528308020734350011L));
                                    return;
                                 }
                                 break;
                              default:
                                 var21[var29] = var58;
                                 if (var4 < var7) {
                                    continue label44;
                                 }

                                 var6 = "I\u0081\u0000³_ì\u0018é+1O¹\u0088\u0085aØ";
                                 var7 = "I\u0081\u0000³_ì\u0018é+1O¹\u0088\u0085aØ".length();
                                 var4 = 0;
                           }

                           byte var30 = var4;
                           var4 += 8;
                           var9 = var6.substring(var30, var4).getBytes("ISO-8859-1");
                           var21 = var8;
                           var29 = var5++;
                           var40 = ((long)var9[0] & 255L) << 56
                              | ((long)var9[1] & 255L) << 48
                              | ((long)var9[2] & 255L) << 40
                              | ((long)var9[3] & 255L) << 32
                              | ((long)var9[4] & 255L) << 24
                              | ((long)var9[5] & 255L) << 16
                              | ((long)var9[6] & 255L) << 8
                              | (long)var9[7] & 255L;
                           var49 = 0;
                        }
                     }
                  }

                  var11 = var12.charAt(var19);
                  break;
               default:
                  var15[var13++] = var48;
                  if ((var19 += var11) < var14) {
                     var11 = var12.charAt(var19);
                     continue label70;
                  }

                  var12 = "W\u001b\u008f\u00901&à\u0005Ø\u0014p\u001c ";
                  var14 = "W\u001b\u008f\u00901&à\u0005Ø\u0014p\u001c ".length();
                  var11 = 7;
                  var19 = -1;
            }

            var10000 = 58;
            var10001 = var12.substring(++var19, var19 + var11);
            var10002 = 0;
         }
      }
   }
}





