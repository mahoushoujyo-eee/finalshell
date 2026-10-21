package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Fz4;
import com.finalshell.task.Qv2;
import com.finalshell.ui.frame.UpdateFrame;
import java.awt.Component;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import org.apache.commons.io.FileUtils;
import org.apache.hc.client5.http.classic.HttpClient;

public class Yy4_2 implements C22 {
   public static String a;
   public static String t;
   public static String s;
   public static String O;
   public static String j;
   public static String J;
   public static int W;
   public static String B;
   public static String V;
   public boolean w;
   public boolean R;
   public static String P;
   public UpdateManifest K;
   public Pz4 D;
   public long c;
   public long T;
   public boolean n;
   public String h;
   public String N;
   public boolean p;
   public boolean I;
   public boolean F;
   public boolean g;
   public TL3 x;
   public static String Y;
   public Component S;
   public static String[] b;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;
   public static long[] i;
   public static Long[] k;

   public Yy4_2() {
      Registry.lookupField(273116114349001357L).setBoolean(this, false);
      Registry.lookupField(358927079428588472L).setBoolean(this, false);
      Pz4 var10001 = new Pz4();
      long var3 = 250351272737754274L;
      Pz4 var2 = var10001;
      Ref.s(250351272737754274L, var2, var3);
      Registry.lookupField(368493757138273669L).setBoolean(this, false);
      Registry.lookupField(497435290032382373L).setBoolean(this, false);
      Registry.lookupField(629897802163840414L).setBoolean(this, false);
      Registry.lookupField(249008812215255527L).setBoolean(this, false);
      TL3 var10002 = new TL3();
      long var5 = 451656023154478446L;
      TL3 var4 = var10002;
      Ref.s(451656023154478446L, var4, var5);
      Object var6 = 451656023154478446L;
      Ref.g(451656023154478446L, var6);
      HttpClient var10004 = (HttpClient)(Registry.emptyArgs());
      long var9 = 281153446161300471L;
      Object var8 = var10004;
      var10004 = Ref.h(281153446161300471L, var8, var9);

      try {
         var10004 = (HttpClient)var10004;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      HttpClient var1 = var10004;
      Object var10 = 451656023154478446L;
      Ref.g(451656023154478446L, var10);
      Object[] var10006 = Registry.packArgs(var1);
      long var13 = 151476884239499892L;
      Object[] var12 = var10006;
      Ref.h(151476884239499892L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }

   public static void J$void() {
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 409773188541543546L;
      Object[] var5 = var10002;
      Ref.h(409773188541543546L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      File var1 = new File((String)Registry.lookupField(592839404584749312L).get(null));

      try {
         Process var0 = Runtime.getRuntime().exec(new String[]{a(19623, -4189), a(19584, 17917), var1.getName()}, null, var1.getParentFile());
         Registry.packArgs(var0, false);
         long var7 = 248153879763504193L;
         Ref.h2(248153879763504193L, var7);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }
      } catch (IOException var10) {
         var10.printStackTrace();
      }

      System.exit(0);
   }

   public static void P$void() {
      String var0 = System.getProperty(a(19585, -3555));
      if (new File(a(19633, -24746)).exists()) {
      }

      File var2 = new File(
         (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(189066699988033637L).get(null)
      );
      var2.delete();
      Registry.packArgs(new File((String)Registry.lookupField(189066699988033637L).get(null)), var2);
      long var4 = 178971664395933635L;
      Ref.h2(178971664395933635L, var4);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      try {
         ProcessBuilder var3 = new ProcessBuilder(a(19627, 1290), a(19622, -28210), "\"" + var2.getName() + a(19619, -32488) + var0 + "\"");
         var3.directory(var2.getParentFile());
         Process var1 = var3.start();
         Registry.packArgs(var1, false);
         long var6 = 248153879763504193L;
         Ref.h2(248153879763504193L, var6);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }
      } catch (Exception var16) {
         var16.printStackTrace();
      }

      Registry.packArgs(false);
      long var8 = 305534704297365543L;
      Ref.h2(305534704297365543L, var8);
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10003 = Registry.emptyArgs();
      long var13 = 292622089215767678L;
      Object[] var12 = var10003;
      Ref.h(292622089215767678L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }

   public static void o() {
      File var0 = new File((String)Registry.lookupField(592839404584749312L).get(null));

      try {
         Process var1 = Runtime.getRuntime().exec(new String[]{a(19627, 1290), a(19622, -28210), var0.getName()}, null, var0.getParentFile());
         Registry.packArgs(var1, false);
         long var2 = 248153879763504193L;
         Ref.h2(248153879763504193L, var2);

         try {
            ;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public void l$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/frame/UpdateFrame.q ()[Ljava/lang/String;
      // 003: aload 0
      // 004: aconst_null
      // 005: ldc2_w 235043738031087667
      // 008: astore 8
      // 00a: astore 7
      // 00c: ldc2_w 235043738031087667
      // 00f: aload 7
      // 011: aload 8
      // 013: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 016: aload 0
      // 017: bipush 1
      // 018: ldc2_w 368493757138273669
      // 01b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01e: dup_x2
      // 01f: pop
      // 020: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 023: aload 0
      // 024: bipush 1
      // 025: ldc2_w 273116114349001357
      // 028: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02b: dup_x2
      // 02c: pop
      // 02d: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 030: aload 0
      // 031: bipush 0
      // 032: ldc2_w 237884626268918847
      // 035: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 038: dup_x2
      // 039: pop
      // 03a: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 03d: ldc2_w 529321737223656579
      // 040: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 043: aconst_null
      // 044: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 047: checkcast com/finalshell/ui/frame/UpdateFrame
      // 04a: astore 2
      // 04b: astore 1
      // 04c: aload 2
      // 04d: aload 1
      // 04e: ifnonnull 05c
      // 051: ifnull 078
      // 054: goto 05b
      // 057: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: aload 2
      // 05c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 05f: ldc2_w 611344775103445562
      // 062: astore 10
      // 064: astore 9
      // 066: ldc2_w 611344775103445562
      // 069: aload 9
      // 06b: aload 10
      // 06d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 070: pop
      // 071: goto 078
      // 074: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 077: athrow
      // 078: bipush 0
      // 079: istore 3
      // 07a: iload 3
      // 07b: bipush 3
      // 07c: if_icmpge 23a
      // 07f: new java/lang/StringBuilder
      // 082: dup
      // 083: invokespecial java/lang/StringBuilder.<init> ()V
      // 086: ldc2_w 471631468261961298
      // 089: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 08c: aconst_null
      // 08d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 090: checkcast java/lang/String
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: sipush 19638
      // 099: sipush -5689
      // 09c: invokestatic com/finalshell/core/Yy4_2.a (II)Ljava/lang/String;
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: bipush 5
      // 0a3: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 0a6: ldc2_w 502006739469260406
      // 0a9: astore 11
      // 0ab: ldc2_w 502006739469260406
      // 0ae: aload 11
      // 0b0: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b3: checkcast java/lang/String
      // 0b6: goto 0bd
      // 0b9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c3: astore 4
      // 0c5: aload 0
      // 0c6: ldc2_w 451656023154478446
      // 0c9: astore 13
      // 0cb: ldc2_w 451656023154478446
      // 0ce: aload 13
      // 0d0: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0d3: aload 4
      // 0d5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d8: ldc2_w 487242814459485704
      // 0db: astore 16
      // 0dd: astore 15
      // 0df: ldc2_w 487242814459485704
      // 0e2: aload 15
      // 0e4: aload 16
      // 0e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e9: checkcast [B
      // 0ec: goto 0f3
      // 0ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: astore 5
      // 0f5: new java/lang/String
      // 0f8: dup
      // 0f9: aload 5
      // 0fb: sipush 19613
      // 0fe: sipush -8874
      // 101: invokestatic com/finalshell/core/Yy4_2.a (II)Ljava/lang/String;
      // 104: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 107: astore 6
      // 109: aload 0
      // 10a: new com/finalshell/core/Kz2
      // 10d: dup
      // 10e: aload 6
      // 110: invokespecial com/finalshell/core/Kz2.<init> (Ljava/lang/String;)V
      // 113: ldc2_w 463455096420304627
      // 116: astore 18
      // 118: astore 17
      // 11a: ldc2_w 463455096420304627
      // 11d: aload 17
      // 11f: aload 18
      // 121: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 124: aload 0
      // 125: bipush 1
      // 126: ldc2_w 237884626268918847
      // 129: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 131: aload 0
      // 132: ldc2_w 558584643801613540
      // 135: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 138: aconst_null
      // 139: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 13c: aload 1
      // 13d: ifnonnull 181
      // 140: aload 0
      // 141: ldc2_w 463455096420304627
      // 144: astore 19
      // 146: ldc2_w 463455096420304627
      // 149: aload 19
      // 14b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 14e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 151: ldc2_w 239921854059042654
      // 154: astore 22
      // 156: astore 21
      // 158: ldc2_w 239921854059042654
      // 15b: aload 21
      // 15d: aload 22
      // 15f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 162: checkcast java/lang/Integer
      // 165: invokevirtual java/lang/Integer.intValue ()I
      // 168: goto 16f
      // 16b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 16e: athrow
      // 16f: if_icmpge 184
      // 172: goto 179
      // 175: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: bipush 1
      // 17a: goto 181
      // 17d: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: goto 185
      // 184: bipush 0
      // 185: ldc2_w 368493757138273669
      // 188: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 190: aload 2
      // 191: aload 1
      // 192: ifnonnull 1a0
      // 195: ifnull 1bc
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19e: athrow
      // 19f: aload 2
      // 1a0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1a3: ldc2_w 611344775103445562
      // 1a6: astore 24
      // 1a8: astore 23
      // 1aa: ldc2_w 611344775103445562
      // 1ad: aload 23
      // 1af: aload 24
      // 1b1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b4: pop
      // 1b5: goto 1bc
      // 1b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1bb: athrow
      // 1bc: goto 23a
      // 1bf: astore 4
      // 1c1: aload 1
      // 1c2: ifnonnull 22e
      // 1c5: aload 2
      // 1c6: ifnull 1f4
      // 1c9: goto 1d0
      // 1cc: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: aload 2
      // 1d1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d4: ldc2_w 611344775103445562
      // 1d7: astore 26
      // 1d9: astore 25
      // 1db: ldc2_w 611344775103445562
      // 1de: aload 25
      // 1e0: aload 26
      // 1e2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e5: pop
      // 1e6: goto 1ed
      // 1e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: goto 1f4
      // 1f0: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f3: athrow
      // 1f4: aload 0
      // 1f5: new java/lang/StringBuilder
      // 1f8: dup
      // 1f9: invokespecial java/lang/StringBuilder.<init> ()V
      // 1fc: sipush 19630
      // 1ff: sipush 8543
      // 202: invokestatic com/finalshell/core/Yy4_2.a (II)Ljava/lang/String;
      // 205: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 208: iload 3
      // 209: bipush 1
      // 20a: iadd
      // 20b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 20e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 211: ldc2_w 235043738031087667
      // 214: astore 28
      // 216: astore 27
      // 218: ldc2_w 235043738031087667
      // 21b: aload 27
      // 21d: aload 28
      // 21f: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 222: sipush 27175
      // 225: ldc2_w 2888609350803632969
      // 228: invokestatic com/finalshell/core/Yy4_2.b (IJ)J
      // 22b: invokestatic java/lang/Thread.sleep (J)V
      // 22e: goto 233
      // 231: astore 5
      // 233: iinc 3 1
      // 236: aload 1
      // 237: ifnull 07a
      // 23a: aload 0
      // 23b: bipush 0
      // 23c: ldc2_w 273116114349001357
      // 23f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 242: dup_x2
      // 243: pop
      // 244: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 247: aload 2
      // 248: aload 1
      // 249: ifnonnull 257
      // 24c: ifnull 273
      // 24f: goto 256
      // 252: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 255: athrow
      // 256: aload 2
      // 257: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 25a: ldc2_w 611344775103445562
      // 25d: astore 30
      // 25f: astore 29
      // 261: ldc2_w 611344775103445562
      // 264: aload 29
      // 266: aload 30
      // 268: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 26b: pop
      // 26c: goto 273
      // 26f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 272: athrow
      // 273: return
   }

   public static void F() {
      String[] var10000 = UpdateFrame.q();
      File[] var1 = new File((String)Registry.lookupField(168719389020873220L).get(null)).listFiles();
      String[] var0 = var10000;
      File[] var6 = var1;
      if (var0 == null) {
         if (var1 == null) {
            return;
         }

         var6 = var1;
      }

      File[] var2 = var6;
      int var3 = var2.length;
      int var4 = 0;

      while (var4 < var3) {
         File var5 = var2[var4];
         var5.delete();
         var4++;
         if (var0 != null) {
            break;
         }
      }
   }

   public void g() {
      String[] var10000 = UpdateFrame.q();
      Registry.lookupField(629897802163840414L).setBoolean(this, true);
      String[] var1 = var10000;
      String var2 = (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(602197175769593572L).get(null);

      label35: {
         label34: {
            try {
               if (var1 != null) {
                  break label35;
               }

               if (!Registry.lookupField(249008812215255527L).getBoolean(this)) {
                  break label34;
               }
            } catch (IOException var10) {
               throw a(var10);
            }

            var2 = (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(483358680769607062L).get(null);
         }

         try {
            Desktop.getDesktop().open(new File(var2));
         } catch (IOException var9) {
            var9.printStackTrace();
         }
      }

      Registry.emptyArgs();
      long var4 = 270389152141252877L;
      Ref.h2(270389152141252877L, var4);
      Object[] var10002 = Registry.emptyArgs();
      long var7 = 292622089215767678L;
      Object[] var6 = var10002;
      Ref.h(292622089215767678L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public void W() {
      String[] var10000 = UpdateFrame.q();
      Registry.lookupField(629897802163840414L).setBoolean(this, true);
      String[] var1 = var10000;
      String var2 = (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(602197175769593572L).get(null);

      label24: {
         try {
            if (var1 != null) {
               return;
            }

            if (!Registry.lookupField(249008812215255527L).getBoolean(this)) {
               break label24;
            }
         } catch (IOException var5) {
            throw a(var5);
         }

         var2 = (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(483358680769607062L).get(null);
      }

      try {
         Desktop.getDesktop().open(new File(var2));
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void u(CH var1, Component var2) {
      Integer var36;
      String[] var10000 = UpdateFrame.q();
      Registry.lookupField(629897802163840414L).setBoolean(this, true);
      String var4 = "";
      String[] var3 = var10000;

      label83: {
         label82: {
            label81: {
               try {
                  if (var3 != null) {
                     break label82;
                  }

                  Registry.lookupField(558584643801613540L).getInt(null);
                  Object var13 = 463455096420304627L;
                  Object var10002 = Ref.g(463455096420304627L, var13);
                  Object var10003 = Registry.emptyArgs();
                  long var16 = 235790799710687710L;
                  Object var15 = var10003;
                  var10003 = Ref.h(235790799710687710L, var15, var16);

                  try {
                     var36 = (Integer)var10003;
                  } catch (InvocationTargetException var27) {
                     throw var27.getTargetException();
                  }

                  if (!(var10002 < var36)) {
                     break label81;
                  }
               } catch (Exception var30) {
                  throw a(var30);
               }

               var4 = a(19603, -18698);
               Registry.lookupField(249008812215255527L).setBoolean(this, true);
               if (var3 == null) {
                  break label83;
               }
            }

            var4 = a(19610, -14411);
         }

         Registry.lookupField(249008812215255527L).setBoolean(this, false);
      }

      File var5 = new File((String)Registry.lookupField(179276309776747034L).get(null) + File.separator + var4);

      try {
         Registry.packArgs(a(19624, -27021) + var4, var5.getAbsolutePath(), null);
         long var17 = 386792640062048056L;
         Ref.h2(386792640062048056L, var17);

         try {
            ;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }
      } catch (Exception var26) {
         var26.printStackTrace();
      }

      label91: {
         if (var5.exists()) {
            JPanel var6 = new JPanel();
            JLabel var7 = new JLabel(a(19605, -28427));
            JPasswordField var8 = new JPasswordField(a(19667, 7825282499362317532L));
            var6.add(var7);
            var6.add(var8);
            var10000 = new String[]{a(19595, -20152), a(19590, 10052)};
            Registry.lookupField(388376917454860932L).get(null);
            Object[] var10001 = Registry.packArgs(new Qv2(this, var8));
            long var20 = 434592463220957006L;
            Object[] var19 = var10001;
            Ref.h(434592463220957006L, var19, var20);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            int var10 = JOptionPane.showConfirmDialog(null, var6, a(19593, -7145), 0, -1);
            if (var10 == 0) {
               char[] var11 = var8.getPassword();
               String var12 = new String(var11);
               Registry.packArgs(var5.getAbsolutePath(), var12, var1);
               long var21 = 314429671666219547L;
               Ref.h2(314429671666219547L, var21);

               try {
                  ;
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }
            }

            try {
               if (var3 == null) {
                  break label91;
               }
            } catch (Exception var29) {
               boolean var33 = false;
               throw a(var29);
            }
         }

         try {
            var1.d(a(19591, -11046) + var4 + a(19615, -28422));
         } catch (Exception var28) {
            boolean var34 = false;
            throw a(var28);
         }
      }

      Registry.lookupField(629897802163840414L).setBoolean(this, false);
   }

   public void a(CH var1, Component var2) {
      boolean var116;
      boolean var121;
      Boolean var124;
      Boolean var127;
      long var36;
      long var61;
      long var66;
      long var76;
      long var78;
      UpdateFrame.q();
      long var18 = 623770632946822479L;
      Ref.s(623770632946822479L, var2, var18);
      Registry.lookupField(629897802163840414L).setBoolean(this, true);
      Registry.lookupField(145901127553578867L).setLong(this, 0L);
      Registry.lookupField(616884405499733058L).setLong(this, 0L);
      long var20 = 146032522486876938L;
      String var19 = "";
      Ref.s(146032522486876938L, var19, var20);
      long var22 = 235043738031087667L;
      Object var21 = null;
      Ref.s(235043738031087667L, var21, var22);
      Object[] var10004 = Registry.emptyArgs();
      long var24 = 373868045552747003L;
      Object[] var23 = var10004;
      Ref.h(373868045552747003L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var102) {
         throw var102.getTargetException();
      }

      label353: {
         if (this == null) {
            if (Registry.lookupField(237884626268918847L).getBoolean(this)) {
               int var10005 = Registry.lookupField(558584643801613540L).getInt(null);
               if (this == null) {
                  Object var25 = 463455096420304627L;
                  Object var10007 = Ref.g(463455096420304627L, var25);
                  Object var10008 = Registry.emptyArgs();
                  long var28 = 239921854059042654L;
                  Object var27 = var10008;
                  var10008 = Ref.h(239921854059042654L, var27, var28);

                  try {
                     var121 = (Integer)var10008;
                  } catch (InvocationTargetException var101) {
                     throw var101.getTargetException();
                  }

                  if (var10007 < var121) {
                     boolean var112 = true;
                  } else {
                     boolean var113 = false;
                  }
               }

               boolean var4;
               File var6;
               label359: {
                  Registry.lookupField(368493757138273669L).setBoolean(this, var10005 != 0);
                  var4 = false;
                  boolean var5 = true;
                  var6 = null;
                  boolean var110 = Registry.lookupField(368493757138273669L).getBoolean(this);
                  if (this == null) {
                     if (!var110) {
                        break label359;
                     }

                     var4 = true;
                     Registry.lookupField(358927079428588472L).setBoolean(this, true);
                     Registry.lookupField(558584643801613540L).getInt(null);
                  }

                  Object var29 = 463455096420304627L;
                  Object var10006 = Ref.g(463455096420304627L, var29);
                  Object var114 = Registry.emptyArgs();
                  long var32 = 235790799710687710L;
                  Object var31 = var114;
                  var114 = Ref.h(235790799710687710L, var31, var32);

                  try {
                     var116 = (Integer)var114;
                  } catch (InvocationTargetException var100) {
                     throw var100.getTargetException();
                  }

                  if (var10006 < var116) {
                     var6 = new File(
                        (String)Registry.lookupField(168719389020873220L).get(null)
                           + File.separator
                           + (String)Registry.lookupField(483358680769607062L).get(null)
                     );
                     Object var122 = Registry.packArgs(a(19594, 1532), var6);
                     long var34 = 213493724324434820L;
                     Object var33 = var122;
                     var122 = Ref.h(213493724324434820L, var33, var34);

                     try {
                        var124 = (Boolean)var122;
                     } catch (InvocationTargetException var99) {
                        throw var99.getTargetException();
                     }

                     Registry.lookupField(497435290032382373L).setBoolean(this, var124);
                     Registry.lookupField(249008812215255527L).setBoolean(this, true);
                  } else {
                     var6 = new File(
                        (String)Registry.lookupField(168719389020873220L).get(null)
                           + File.separator
                           + (String)Registry.lookupField(602197175769593572L).get(null)
                     );
                     Object var125 = Registry.packArgs(a(19621, 16862), var6);
                     var36 = 213493724324434820L;
                     Object var35 = var125;
                     var125 = Ref.h(213493724324434820L, var35, var36);

                     try {
                        var127 = (Boolean)var125;
                     } catch (InvocationTargetException var98) {
                        throw var98.getTargetException();
                     }

                     Registry.lookupField(497435290032382373L).setBoolean(this, var127);
                     Registry.lookupField(249008812215255527L).setBoolean(this, false);
                  }
               }

               label342: {
                  Yy4_2 var118;
                  label341: {
                     label340: {
                        boolean var117 = var4;
                        if (this == null) {
                           if (!var4) {
                              break label340;
                           }

                           var118 = this;
                           if (this != null) {
                              break label341;
                           }

                           var117 = Registry.lookupField(497435290032382373L).getBoolean(this);
                        }

                        if (var117) {
                           Registry.lookupField(368493757138273669L).setBoolean(this, false);
                           int var7 = JOptionPane.showConfirmDialog(null, a(19596, 28468), a(19628, 20666), 0);
                           if (this != null) {
                              break label342;
                           }

                           label333:
                           if (var7 == 0) {
                              Object var119 = Registry.lookupField(249008812215255527L).getBoolean(this);
                              if (this == null) {
                                 if (var119 == null) {
                                    Registry.emptyArgs();
                                    long var37 = 253808553645062345L;
                                    Object var128 = Ref.h2(253808553645062345L, var37);

                                    try {
                                       var128 = (Boolean)var128;
                                    } catch (InvocationTargetException var97) {
                                       throw var97.getTargetException();
                                    }

                                    label366: {
                                       if (this == null) {
                                          if (var128 == null) {
                                             Registry.packArgs(true);
                                             long var39 = 305534704297365543L;
                                             Ref.h2(305534704297365543L, var39);
                                             Registry.emptyArgs();
                                             long var41 = 480340055273137148L;
                                             Ref.h2(480340055273137148L, var41);

                                             try {
                                                ;
                                             } catch (InvocationTargetException var96) {
                                                throw var96.getTargetException();
                                             }

                                             if (this == null) {
                                                break label366;
                                             }
                                          }

                                          var128 = Registry.emptyArgs();
                                          long var43 = 454647487873911743L;
                                          Object var10009 = Ref.h2(454647487873911743L, var43);

                                          try {
                                          } catch (InvocationTargetException var95) {
                                             throw var95.getTargetException();
                                          }
                                       }

                                       if (this == null) {
                                          if (var128 == null) {
                                             Object[] var133 = Registry.emptyArgs();
                                             long var46 = 296340191854217930L;
                                             Object[] var45 = var133;
                                             Ref.h(296340191854217930L, var45, var46);

                                             try {
                                                ;
                                             } catch (InvocationTargetException var94) {
                                                throw var94.getTargetException();
                                             }

                                             if (this == null) {
                                                break label366;
                                             }
                                          }

                                          var128 = Registry.emptyArgs();
                                          long var47 = 561847341732101275L;
                                          Object var134 = Ref.h2(561847341732101275L, var47);

                                          try {
                                          } catch (InvocationTargetException var93) {
                                             throw var93.getTargetException();
                                          }
                                       }

                                       if (var128 == null) {
                                          Object[] var135 = Registry.emptyArgs();
                                          long var50 = 537578433846072104L;
                                          Object[] var49 = var135;
                                          Ref.h(537578433846072104L, var49, var50);

                                          try {
                                             ;
                                          } catch (InvocationTargetException var92) {
                                             throw var92.getTargetException();
                                          }
                                       }
                                    }

                                    Registry.emptyArgs();
                                    long var51 = 270389152141252877L;
                                    Ref.h2(270389152141252877L, var51);
                                    Object[] var10010 = Registry.emptyArgs();
                                    long var54 = 292622089215767678L;
                                    Object[] var53 = var10010;
                                    Ref.h(292622089215767678L, var53, var54);

                                    try {
                                       ;
                                    } catch (InvocationTargetException var91) {
                                       throw var91.getTargetException();
                                    }

                                    if (this == null) {
                                       break label333;
                                    }
                                 }

                                 var119 = Registry.emptyArgs();
                                 long var55 = 253808553645062345L;
                                 Object var130 = Ref.h2(253808553645062345L, var55);

                                 try {
                                 } catch (InvocationTargetException var90) {
                                    throw var90.getTargetException();
                                 }
                              }

                              if (this == null) {
                                 if (var119 == null) {
                                    Registry.packArgs(true);
                                    long var57 = 305534704297365543L;
                                    Ref.h2(305534704297365543L, var57);
                                    Registry.emptyArgs();
                                    long var59 = 480340055273137148L;
                                    Ref.h2(480340055273137148L, var59);

                                    try {
                                       ;
                                    } catch (InvocationTargetException var89) {
                                       throw var89.getTargetException();
                                    }

                                    if (this == null) {
                                       break label333;
                                    }
                                 }

                                 var119 = Registry.emptyArgs();
                                 var61 = 454647487873911743L;
                                 Object var131 = Ref.h2(454647487873911743L, var61);

                                 try {
                                 } catch (InvocationTargetException var88) {
                                    throw var88.getTargetException();
                                 }
                              }

                              if (this == null) {
                                 if (var119 == null) {
                                    Registry.emptyArgs();
                                    long var63 = 270389152141252877L;
                                    Ref.h2(270389152141252877L, var63);
                                    Object[] var136 = Registry.emptyArgs();
                                    var66 = 578864097947885485L;
                                    Object[] var65 = var136;
                                    Ref.h(578864097947885485L, var65, var66);

                                    try {
                                       ;
                                    } catch (InvocationTargetException var87) {
                                       throw var87.getTargetException();
                                    }

                                    String var138 = (String)(Registry.emptyArgs());
                                    long var68 = 628347691861317165L;
                                    Object var67 = var138;
                                    var138 = Ref.h(628347691861317165L, var67, var68);

                                    try {
                                       var138 = (String)var138;
                                    } catch (InvocationTargetException var86) {
                                       throw var86.getTargetException();
                                    }

                                    label375: {
                                       String var8 = var138;
                                       String var141 = var8;
                                       if (this == null) {
                                          if (var8 == null) {
                                             break label375;
                                          }

                                          var141 = a(19620, 24364);
                                       }

                                       String var9 = var141;
                                       String var10 = a(19589, -2921) + var6.getAbsolutePath() + " " + var9;
                                       Registry.packArgs(var10, var8, var1);
                                       long var69 = 408357096272986083L;
                                       Ref.h2(408357096272986083L, var69);
                                       long var11 = var6.length();
                                       long var13 = 0L;
                                       File var15 = new File(var9);
                                       int var10011 = (var15.exists()) ? 1 : 0;
                                       if (this == null) {
                                          if (var10011 != 0) {
                                             var13 = var15.length();
                                          }

                                          long var147;
                                          var10011 = (var147 = var11 - var13) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                                       }

                                       if (this == null) {
                                          var10011 = var10011 == 0 ? 1 : 0;
                                       }

                                       int var16 = var10011;
                                       var10011 = var16;
                                       if (this == null) {
                                          if (var16 == 0) {
                                             break label375;
                                          }

                                          var10011 = 0;
                                       }

                                       System.exit(var10011);
                                    }

                                    if (this == null) {
                                       break label333;
                                    }
                                 }

                                 var119 = Registry.emptyArgs();
                                 long var71 = 561847341732101275L;
                                 Object var132 = Ref.h2(561847341732101275L, var71);

                                 try {
                                 } catch (InvocationTargetException var85) {
                                    throw var85.getTargetException();
                                 }
                              }

                              if (var119 == null) {
                                 Registry.emptyArgs();
                                 long var73 = 270389152141252877L;
                                 Ref.h2(270389152141252877L, var73);
                                 Object[] var137 = Registry.emptyArgs();
                                 var76 = 578864097947885485L;
                                 Object[] var75 = var137;
                                 Ref.h(578864097947885485L, var75, var76);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var84) {
                                    throw var84.getTargetException();
                                 }

                                 String var142 = (String)(Registry.emptyArgs());
                                 var78 = 628347691861317165L;
                                 Object var77 = var142;
                                 var142 = Ref.h(628347691861317165L, var77, var78);

                                 try {
                                    var142 = (String)var142;
                                 } catch (InvocationTargetException var83) {
                                    throw var83.getTargetException();
                                 }

                                 String var103 = var142;
                                 if (this != null) {
                                    break label342;
                                 }

                                 if (var103 != null) {
                                    String var104 = a(19588, 16223);
                                    String var105 = a(19639, 29474) + var6.getAbsolutePath() + " " + var104;
                                    Registry.packArgs(var105, var103, var1);
                                    long var79 = 408357096272986083L;
                                    Ref.h2(408357096272986083L, var79);
                                    long var106 = var6.length();
                                    long var107 = 0L;
                                    File var108 = new File(var104);
                                    int var146 = (var108.exists()) ? 1 : 0;
                                    if (this == null) {
                                       if (var146 != 0) {
                                          var107 = var108.length();
                                       }

                                       long var148;
                                       var146 = (var148 = var106 - var107) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                                    }

                                    if (this == null) {
                                       var146 = !var146;
                                    }

                                    int var109 = var146;
                                    if (this != null) {
                                       break label342;
                                    }

                                    if (var109 != 0) {
                                       System.exit(0);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var118 = this;
                  }

                  Registry.lookupField(358927079428588472L).setBoolean(var118, false);
               }

               if (this == null) {
                  break label353;
               }
            }

            Registry.lookupField(358927079428588472L).setBoolean(this, false);
         }

         String var111 = a(19586, -21211);
         long var82 = 235043738031087667L;
         String var81 = var111;
         Ref.s(235043738031087667L, var81, var82);
      }

      Registry.lookupField(273116114349001357L).setBoolean(this, false);
      Registry.lookupField(629897802163840414L).setBoolean(this, false);
      Registry.lookupField(368493757138273669L).setBoolean(this, true);
   }

   public String M() {
      String var1 = null;
      JPanel var2 = new JPanel();
      JLabel var3 = new JLabel(a(19631, 22442));
      JPasswordField var4 = new JPasswordField(a(11355, 1596935362728723543L));
      var2.add(var3);
      var2.add(var4);
      String[] var5 = new String[]{a(19635, -12145), a(19587, -13321)};
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Fz4(this, var4));
      long var9 = 434592463220957006L;
      Object[] var8 = var10001;
      Ref.h(434592463220957006L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Object var10 = 623770632946822479L;
      int var6 = JOptionPane.showOptionDialog((Component)Ref.g(623770632946822479L, var10), var2, a(19614, 14226), 1, -1, null, var5, var5[0]);
      if (var6 == 0) {
         char[] var7 = var4.getPassword();
         var1 = new String(var7);
      }

      return var1;
   }

   public void a(String var1, String var2) {
      Registry.packArgs(new File(var1), new File(var2));
      long var3 = 178971664395933635L;
      Ref.h2(178971664395933635L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void u() {
      if (Registry.lookupField(249008812215255527L).getBoolean(this)) {
      }
   }

   public boolean u(String param1, File param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/frame/UpdateFrame.q ()[Ljava/lang/String;
      // 003: bipush 0
      // 004: istore 4
      // 006: astore 3
      // 007: bipush 0
      // 008: istore 5
      // 00a: iload 5
      // 00c: bipush 2
      // 00d: if_icmpge 26a
      // 010: aload 0
      // 011: ldc2_w 463455096420304627
      // 014: astore 11
      // 016: ldc2_w 463455096420304627
      // 019: aload 11
      // 01b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01e: aload 1
      // 01f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 022: ldc2_w 483244618943785500
      // 025: astore 14
      // 027: astore 13
      // 029: ldc2_w 483244618943785500
      // 02c: aload 13
      // 02e: aload 14
      // 030: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 033: checkcast com/finalshell/core/ME
      // 036: goto 03d
      // 039: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: astore 6
      // 03f: new java/lang/StringBuilder
      // 042: dup
      // 043: invokespecial java/lang/StringBuilder.<init> ()V
      // 046: aload 6
      // 048: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04b: ldc2_w 425906082983815806
      // 04e: astore 16
      // 050: astore 15
      // 052: ldc2_w 425906082983815806
      // 055: aload 15
      // 057: aload 16
      // 059: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05c: checkcast java/lang/String
      // 05f: goto 066
      // 062: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 065: athrow
      // 066: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 069: sipush 19637
      // 06c: sipush -20709
      // 06f: invokestatic com/finalshell/core/Yy4_2.a (II)Ljava/lang/String;
      // 072: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 075: bipush 5
      // 076: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 079: ldc2_w 502006739469260406
      // 07c: astore 17
      // 07e: ldc2_w 502006739469260406
      // 081: aload 17
      // 083: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 086: checkcast java/lang/String
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 093: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 096: astore 7
      // 098: aload 7
      // 09a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 09d: ldc2_w 632120221038695871
      // 0a0: astore 19
      // 0a2: ldc2_w 632120221038695871
      // 0a5: aload 19
      // 0a7: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0aa: checkcast java/lang/Long
      // 0ad: invokevirtual java/lang/Long.longValue ()J
      // 0b0: goto 0b7
      // 0b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: lstore 8
      // 0b9: aload 0
      // 0ba: lload 8
      // 0bc: dup2_x1
      // 0bd: pop2
      // 0be: ldc2_w 145901127553578867
      // 0c1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0c4: swap
      // 0c5: dup2_x2
      // 0c6: pop2
      // 0c7: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 0ca: aload 0
      // 0cb: aload 1
      // 0cc: aload 3
      // 0cd: ifnonnull 1fe
      // 0d0: ldc2_w 146032522486876938
      // 0d3: astore 22
      // 0d5: astore 21
      // 0d7: ldc2_w 146032522486876938
      // 0da: aload 21
      // 0dc: aload 22
      // 0de: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0e1: aload 7
      // 0e3: aload 2
      // 0e4: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0e7: aload 0
      // 0e8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0eb: ldc2_w 386792640062048056
      // 0ee: astore 23
      // 0f0: ldc2_w 386792640062048056
      // 0f3: aload 23
      // 0f5: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f8: pop
      // 0f9: goto 100
      // 0fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: aload 2
      // 101: invokevirtual java/io/File.exists ()Z
      // 104: aload 3
      // 105: ifnonnull 276
      // 108: goto 10f
      // 10b: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: ifeq 1cf
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: aload 2
      // 11a: aload 3
      // 11b: ifnonnull 13c
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: invokevirtual java/io/File.length ()J
      // 128: lconst_0
      // 129: lcmp
      // 12a: ifle 1cf
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: aload 2
      // 135: goto 13c
      // 138: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 13f: ldc2_w 277130667802971275
      // 142: astore 25
      // 144: ldc2_w 277130667802971275
      // 147: aload 25
      // 149: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 14c: checkcast java/lang/String
      // 14f: goto 156
      // 152: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 155: athrow
      // 156: astore 10
      // 158: aload 3
      // 159: ifnonnull 1cb
      // 15c: aload 6
      // 15e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 161: ldc2_w 246128016006211485
      // 164: astore 28
      // 166: astore 27
      // 168: ldc2_w 246128016006211485
      // 16b: aload 27
      // 16d: aload 28
      // 16f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 172: checkcast java/lang/String
      // 175: goto 17c
      // 178: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: aload 10
      // 17e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 181: ifeq 192
      // 184: goto 18b
      // 187: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: bipush 1
      // 18c: istore 4
      // 18e: aload 3
      // 18f: ifnull 26a
      // 192: aload 0
      // 193: new java/lang/StringBuilder
      // 196: dup
      // 197: invokespecial java/lang/StringBuilder.<init> ()V
      // 19a: sipush 19598
      // 19d: sipush 15822
      // 1a0: invokestatic com/finalshell/core/Yy4_2.a (II)Ljava/lang/String;
      // 1a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a6: aload 1
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: ldc_w " "
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: iload 5
      // 1b2: bipush 1
      // 1b3: iadd
      // 1b4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1b7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ba: ldc2_w 235043738031087667
      // 1bd: astore 30
      // 1bf: astore 29
      // 1c1: ldc2_w 235043738031087667
      // 1c4: aload 29
      // 1c6: aload 30
      // 1c8: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1cb: aload 3
      // 1cc: ifnull 20f
      // 1cf: aload 0
      // 1d0: new java/lang/StringBuilder
      // 1d3: dup
      // 1d4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d7: sipush 19632
      // 1da: sipush -13402
      // 1dd: invokestatic com/finalshell/core/Yy4_2.a (II)Ljava/lang/String;
      // 1e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e3: aload 1
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: ldc_w " "
      // 1ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ed: iload 5
      // 1ef: bipush 1
      // 1f0: iadd
      // 1f1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1f4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f7: goto 1fe
      // 1fa: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fd: athrow
      // 1fe: ldc2_w 235043738031087667
      // 201: astore 32
      // 203: astore 31
      // 205: ldc2_w 235043738031087667
      // 208: aload 31
      // 20a: aload 32
      // 20c: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 20f: goto 263
      // 212: astore 6
      // 214: aload 0
      // 215: new java/lang/StringBuilder
      // 218: dup
      // 219: invokespecial java/lang/StringBuilder.<init> ()V
      // 21c: sipush 19599
      // 21f: sipush 32251
      // 222: invokestatic com/finalshell/core/Yy4_2.a (II)Ljava/lang/String;
      // 225: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 228: aload 1
      // 229: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22c: ldc_w " "
      // 22f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 232: iload 5
      // 234: bipush 1
      // 235: iadd
      // 236: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 239: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23c: ldc2_w 235043738031087667
      // 23f: astore 34
      // 241: astore 33
      // 243: ldc2_w 235043738031087667
      // 246: aload 33
      // 248: aload 34
      // 24a: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 24d: sipush 28770
      // 250: ldc2_w 8094274108836915469
      // 253: invokestatic com/finalshell/core/Yy4_2.b (IJ)J
      // 256: invokestatic java/lang/Thread.sleep (J)V
      // 259: goto 263
      // 25c: astore 7
      // 25e: aload 7
      // 260: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 263: iinc 5 1
      // 266: aload 3
      // 267: ifnull 00a
      // 26a: goto 274
      // 26d: astore 5
      // 26f: aload 5
      // 271: invokevirtual java/lang/Exception.printStackTrace ()V
      // 274: iload 4
      // 276: ireturn
   }

   public static boolean p() {
      boolean var0 = false;
      return new File((String)Registry.lookupField(276665903910477068L).get(null)).exists();
   }

   public static boolean x(boolean param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/frame/UpdateFrame.q ()[Ljava/lang/String;
      // 03: new java/io/File
      // 06: dup
      // 07: ldc2_w 276665903910477068
      // 0a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d: aconst_null
      // 0e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 11: checkcast java/lang/String
      // 14: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 17: astore 2
      // 18: astore 1
      // 19: iload 0
      // 1a: aload 1
      // 1b: ifnonnull 5d
      // 1e: ifeq 52
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 2
      // 29: invokevirtual java/io/File.exists ()Z
      // 2c: aload 1
      // 2d: ifnonnull 5f
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: ifne 5e
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 2
      // 42: invokevirtual java/io/File.createNewFile ()Z
      // 45: pop
      // 46: goto 5e
      // 49: astore 3
      // 4a: aload 3
      // 4b: invokevirtual java/io/IOException.printStackTrace ()V
      // 4e: aload 1
      // 4f: ifnull 5e
      // 52: aload 2
      // 53: invokevirtual java/io/File.delete ()Z
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Yy4_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: pop
      // 5e: iload 0
      // 5f: ireturn
   }

   public static void L() {
   }

   public boolean l$boolean() {
      return Registry.lookupField(358927079428588472L).getBoolean(this);
   }

   public void X(boolean var1) {
      Registry.lookupField(358927079428588472L).setBoolean(this, var1);
   }

   public boolean J$boolean() {
      return Registry.lookupField(368493757138273669L).getBoolean(this);
   }

   public void p(boolean var1) {
      Registry.lookupField(368493757138273669L).setBoolean(this, var1);
   }

   public boolean X() {
      return Registry.lookupField(273116114349001357L).getBoolean(this);
   }

   public void k(boolean var1) {
      Registry.lookupField(273116114349001357L).setBoolean(this, var1);
   }

   public UpdateManifest P$Kz_2() {
      Object var1 = 463455096420304627L;
      return (UpdateManifest)Ref.g(463455096420304627L, var1);
   }

   public void V(UpdateManifest var1) {
      long var3 = 463455096420304627L;
      Ref.s(463455096420304627L, var1, var3);
   }

   @Override
   public void t(long var1) {
      Registry.lookupField(616884405499733058L).setLong(this, var1);
   }

   public String E() {
      Object var1 = 146032522486876938L;
      return (String)Ref.g(146032522486876938L, var1);
   }

   public void h(String var1) {
      long var3 = 146032522486876938L;
      Ref.s(146032522486876938L, var1, var3);
   }

   public long P$long() {
      return Registry.lookupField(145901127553578867L).getLong(this);
   }

   public void h(long var1) {
      Registry.lookupField(145901127553578867L).setLong(this, var1);
   }

   public long G() {
      return Registry.lookupField(616884405499733058L).getLong(this);
   }

   public void U(long var1) {
      Registry.lookupField(616884405499733058L).setLong(this, var1);
   }

   public String b() {
      Object var1 = 235043738031087667L;
      return (String)Ref.g(235043738031087667L, var1);
   }

   public void s(String var1) {
      long var3 = 235043738031087667L;
      Ref.s(235043738031087667L, var1, var3);
   }

   public boolean h() {
      return Registry.lookupField(629897802163840414L).getBoolean(this);
   }

   public void P(boolean var1) {
      Registry.lookupField(629897802163840414L).setBoolean(this, var1);
   }

   public boolean n() {
      return Registry.lookupField(497435290032382373L).getBoolean(this);
   }

   public void m(boolean var1) {
      Registry.lookupField(497435290032382373L).setBoolean(this, var1);
   }

   public boolean r() {
      return Registry.lookupField(237884626268918847L).getBoolean(this);
   }

   public void u(boolean var1) {
      Registry.lookupField(237884626268918847L).setBoolean(this, var1);
   }

   public static void P(File var0, File var1) {
      try {
         FileUtils.copyFile(var0, var1);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public static boolean K(FileChannel var0, FileChannel var1) {
      try {
         var1.transferFrom(var0, 0L, var0.size());
         var0.close();
         var1.close();
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   public static boolean p(File var0) {
      String[] var1 = UpdateFrame.q();
      boolean var10000 = var0.exists();
      if (var1 == null) {
         if (!var10000) {
            var10000 = var0.mkdirs();
            if (var1 != null) {
               return var10000;
            }

            if (!var10000) {
               return false;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   public TL3 N() {
      Object var1 = 451656023154478446L;
      return (TL3)Ref.g(451656023154478446L, var1);
   }

   public void B(TL3 var1) {
      long var3 = 451656023154478446L;
      Ref.s(451656023154478446L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 19587) & 65535;
      if (d[var2] == null) {
         char[] var3 = b[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 70;
               break;
            case 1:
               var10000 = 148;
               break;
            case 2:
               var10000 = 81;
               break;
            case 3:
               var10000 = 21;
               break;
            case 4:
               var10000 = 89;
               break;
            case 5:
               var10000 = 154;
               break;
            case 6:
               var10000 = 166;
               break;
            case 7:
               var10000 = 41;
               break;
            case 8:
               var10000 = 139;
               break;
            case 9:
               var10000 = 156;
               break;
            case 10:
               var10000 = 228;
               break;
            case 11:
               var10000 = 162;
               break;
            case 12:
               var10000 = 77;
               break;
            case 13:
               var10000 = 54;
               break;
            case 14:
               var10000 = 179;
               break;
            case 15:
               var10000 = 240;
               break;
            case 16:
               var10000 = 180;
               break;
            case 17:
               var10000 = 211;
               break;
            case 18:
               var10000 = 109;
               break;
            case 19:
               var10000 = 242;
               break;
            case 20:
               var10000 = 74;
               break;
            case 21:
               var10000 = 208;
               break;
            case 22:
               var10000 = 251;
               break;
            case 23:
               var10000 = 31;
               break;
            case 24:
               var10000 = 73;
               break;
            case 25:
               var10000 = 0;
               break;
            case 26:
               var10000 = 150;
               break;
            case 27:
               var10000 = 198;
               break;
            case 28:
               var10000 = 186;
               break;
            case 29:
               var10000 = 79;
               break;
            case 30:
               var10000 = 71;
               break;
            case 31:
               var10000 = 220;
               break;
            case 32:
               var10000 = 15;
               break;
            case 33:
               var10000 = 203;
               break;
            case 34:
               var10000 = 96;
               break;
            case 35:
               var10000 = 193;
               break;
            case 36:
               var10000 = 231;
               break;
            case 37:
               var10000 = 19;
               break;
            case 38:
               var10000 = 112;
               break;
            case 39:
               var10000 = 28;
               break;
            case 40:
               var10000 = 205;
               break;
            case 41:
               var10000 = 183;
               break;
            case 42:
               var10000 = 236;
               break;
            case 43:
               var10000 = 185;
               break;
            case 44:
               var10000 = 181;
               break;
            case 45:
               var10000 = 113;
               break;
            case 46:
               var10000 = 241;
               break;
            case 47:
               var10000 = 149;
               break;
            case 48:
               var10000 = 50;
               break;
            case 49:
               var10000 = 27;
               break;
            case 50:
               var10000 = 114;
               break;
            case 51:
               var10000 = 65;
               break;
            case 52:
               var10000 = 14;
               break;
            case 53:
               var10000 = 3;
               break;
            case 54:
               var10000 = 104;
               break;
            case 55:
               var10000 = 153;
               break;
            case 56:
               var10000 = 12;
               break;
            case 57:
               var10000 = 51;
               break;
            case 58:
               var10000 = 10;
               break;
            case 59:
               var10000 = 209;
               break;
            case 60:
               var10000 = 58;
               break;
            case 61:
               var10000 = 217;
               break;
            case 62:
               var10000 = 253;
               break;
            case 63:
               var10000 = 26;
               break;
            case 64:
               var10000 = 233;
               break;
            case 65:
               var10000 = 49;
               break;
            case 66:
               var10000 = 105;
               break;
            case 67:
               var10000 = 177;
               break;
            case 68:
               var10000 = 244;
               break;
            case 69:
               var10000 = 141;
               break;
            case 70:
               var10000 = 219;
               break;
            case 71:
               var10000 = 196;
               break;
            case 72:
               var10000 = 238;
               break;
            case 73:
               var10000 = 161;
               break;
            case 74:
               var10000 = 36;
               break;
            case 75:
               var10000 = 255;
               break;
            case 76:
               var10000 = 17;
               break;
            case 77:
               var10000 = 237;
               break;
            case 78:
               var10000 = 239;
               break;
            case 79:
               var10000 = 151;
               break;
            case 80:
               var10000 = 18;
               break;
            case 81:
               var10000 = 134;
               break;
            case 82:
               var10000 = 252;
               break;
            case 83:
               var10000 = 94;
               break;
            case 84:
               var10000 = 48;
               break;
            case 85:
               var10000 = 63;
               break;
            case 86:
               var10000 = 125;
               break;
            case 87:
               var10000 = 129;
               break;
            case 88:
               var10000 = 32;
               break;
            case 89:
               var10000 = 88;
               break;
            case 90:
               var10000 = 160;
               break;
            case 91:
               var10000 = 227;
               break;
            case 92:
               var10000 = 246;
               break;
            case 93:
               var10000 = 86;
               break;
            case 94:
               var10000 = 5;
               break;
            case 95:
               var10000 = 13;
               break;
            case 96:
               var10000 = 229;
               break;
            case 97:
               var10000 = 59;
               break;
            case 98:
               var10000 = 24;
               break;
            case 99:
               var10000 = 99;
               break;
            case 100:
               var10000 = 69;
               break;
            case 101:
               var10000 = 46;
               break;
            case 102:
               var10000 = 248;
               break;
            case 103:
               var10000 = 101;
               break;
            case 104:
               var10000 = 127;
               break;
            case 105:
               var10000 = 194;
               break;
            case 106:
               var10000 = 53;
               break;
            case 107:
               var10000 = 87;
               break;
            case 108:
               var10000 = 192;
               break;
            case 109:
               var10000 = 201;
               break;
            case 110:
               var10000 = 37;
               break;
            case 111:
               var10000 = 78;
               break;
            case 112:
               var10000 = 207;
               break;
            case 113:
               var10000 = 152;
               break;
            case 114:
               var10000 = 119;
               break;
            case 115:
               var10000 = 22;
               break;
            case 116:
               var10000 = 169;
               break;
            case 117:
               var10000 = 143;
               break;
            case 118:
               var10000 = 178;
               break;
            case 119:
               var10000 = 82;
               break;
            case 120:
               var10000 = 75;
               break;
            case 121:
               var10000 = 7;
               break;
            case 122:
               var10000 = 222;
               break;
            case 123:
               var10000 = 11;
               break;
            case 124:
               var10000 = 131;
               break;
            case 125:
               var10000 = 175;
               break;
            case 126:
               var10000 = 176;
               break;
            case 127:
               var10000 = 204;
               break;
            case 128:
               var10000 = 97;
               break;
            case 129:
               var10000 = 174;
               break;
            case 130:
               var10000 = 80;
               break;
            case 131:
               var10000 = 108;
               break;
            case 132:
               var10000 = 103;
               break;
            case 133:
               var10000 = 68;
               break;
            case 134:
               var10000 = 35;
               break;
            case 135:
               var10000 = 144;
               break;
            case 136:
               var10000 = 218;
               break;
            case 137:
               var10000 = 199;
               break;
            case 138:
               var10000 = 171;
               break;
            case 139:
               var10000 = 243;
               break;
            case 140:
               var10000 = 132;
               break;
            case 141:
               var10000 = 216;
               break;
            case 142:
               var10000 = 44;
               break;
            case 143:
               var10000 = 20;
               break;
            case 144:
               var10000 = 210;
               break;
            case 145:
               var10000 = 85;
               break;
            case 146:
               var10000 = 223;
               break;
            case 147:
               var10000 = 215;
               break;
            case 148:
               var10000 = 164;
               break;
            case 149:
               var10000 = 57;
               break;
            case 150:
               var10000 = 122;
               break;
            case 151:
               var10000 = 195;
               break;
            case 152:
               var10000 = 214;
               break;
            case 153:
               var10000 = 133;
               break;
            case 154:
               var10000 = 8;
               break;
            case 155:
               var10000 = 23;
               break;
            case 156:
               var10000 = 221;
               break;
            case 157:
               var10000 = 163;
               break;
            case 158:
               var10000 = 38;
               break;
            case 159:
               var10000 = 137;
               break;
            case 160:
               var10000 = 64;
               break;
            case 161:
               var10000 = 250;
               break;
            case 162:
               var10000 = 142;
               break;
            case 163:
               var10000 = 182;
               break;
            case 164:
               var10000 = 138;
               break;
            case 165:
               var10000 = 6;
               break;
            case 166:
               var10000 = 247;
               break;
            case 167:
               var10000 = 60;
               break;
            case 168:
               var10000 = 124;
               break;
            case 169:
               var10000 = 157;
               break;
            case 170:
               var10000 = 155;
               break;
            case 171:
               var10000 = 30;
               break;
            case 172:
               var10000 = 254;
               break;
            case 173:
               var10000 = 52;
               break;
            case 174:
               var10000 = 173;
               break;
            case 175:
               var10000 = 61;
               break;
            case 176:
               var10000 = 130;
               break;
            case 177:
               var10000 = 140;
               break;
            case 178:
               var10000 = 92;
               break;
            case 179:
               var10000 = 165;
               break;
            case 180:
               var10000 = 91;
               break;
            case 181:
               var10000 = 45;
               break;
            case 182:
               var10000 = 170;
               break;
            case 183:
               var10000 = 200;
               break;
            case 184:
               var10000 = 146;
               break;
            case 185:
               var10000 = 123;
               break;
            case 186:
               var10000 = 107;
               break;
            case 187:
               var10000 = 191;
               break;
            case 188:
               var10000 = 72;
               break;
            case 189:
               var10000 = 90;
               break;
            case 190:
               var10000 = 147;
               break;
            case 191:
               var10000 = 83;
               break;
            case 192:
               var10000 = 102;
               break;
            case 193:
               var10000 = 188;
               break;
            case 194:
               var10000 = 135;
               break;
            case 195:
               var10000 = 84;
               break;
            case 196:
               var10000 = 206;
               break;
            case 197:
               var10000 = 66;
               break;
            case 198:
               var10000 = 33;
               break;
            case 199:
               var10000 = 126;
               break;
            case 200:
               var10000 = 158;
               break;
            case 201:
               var10000 = 116;
               break;
            case 202:
               var10000 = 184;
               break;
            case 203:
               var10000 = 245;
               break;
            case 204:
               var10000 = 249;
               break;
            case 205:
               var10000 = 235;
               break;
            case 206:
               var10000 = 9;
               break;
            case 207:
               var10000 = 212;
               break;
            case 208:
               var10000 = 98;
               break;
            case 209:
               var10000 = 118;
               break;
            case 210:
               var10000 = 16;
               break;
            case 211:
               var10000 = 2;
               break;
            case 212:
               var10000 = 197;
               break;
            case 213:
               var10000 = 202;
               break;
            case 214:
               var10000 = 226;
               break;
            case 215:
               var10000 = 67;
               break;
            case 216:
               var10000 = 189;
               break;
            case 217:
               var10000 = 55;
               break;
            case 218:
               var10000 = 121;
               break;
            case 219:
               var10000 = 190;
               break;
            case 220:
               var10000 = 62;
               break;
            case 221:
               var10000 = 100;
               break;
            case 222:
               var10000 = 29;
               break;
            case 223:
               var10000 = 159;
               break;
            case 224:
               var10000 = 1;
               break;
            case 225:
               var10000 = 106;
               break;
            case 226:
               var10000 = 224;
               break;
            case 227:
               var10000 = 234;
               break;
            case 228:
               var10000 = 172;
               break;
            case 229:
               var10000 = 47;
               break;
            case 230:
               var10000 = 167;
               break;
            case 231:
               var10000 = 187;
               break;
            case 232:
               var10000 = 117;
               break;
            case 233:
               var10000 = 25;
               break;
            case 234:
               var10000 = 232;
               break;
            case 235:
               var10000 = 39;
               break;
            case 236:
               var10000 = 76;
               break;
            case 237:
               var10000 = 111;
               break;
            case 238:
               var10000 = 225;
               break;
            case 239:
               var10000 = 110;
               break;
            case 240:
               var10000 = 128;
               break;
            case 241:
               var10000 = 213;
               break;
            case 242:
               var10000 = 230;
               break;
            case 243:
               var10000 = 56;
               break;
            case 244:
               var10000 = 43;
               break;
            case 245:
               var10000 = 168;
               break;
            case 246:
               var10000 = 120;
               break;
            case 247:
               var10000 = 136;
               break;
            case 248:
               var10000 = 42;
               break;
            case 249:
               var10000 = 115;
               break;
            case 250:
               var10000 = 34;
               break;
            case 251:
               var10000 = 93;
               break;
            case 252:
               var10000 = 4;
               break;
            case 253:
               var10000 = 95;
               break;
            case 254:
               var10000 = 40;
               break;
            default:
               var10000 = 145;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10254;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 22895) & 32767;
      if (k[var3] == null) {
         k[var3] = i[var3] ^ var1;
      }

      return k[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      long var36;
      char[] var61;
      boolean var66;
      boolean var76;
      boolean var78;
      boolean var88;
      boolean var90;
      boolean var96;
      String[] var21 = new String[57];
      int var19 = 0;
      String var18 = "匐浪\u0006棹杔曩斱姯贯\bË\u0088=¬ÉW\u0018.\u0002öò\u0006产迋寭袼膖杜\u0002厣洈\u0007Sß7\u0006<\u0018\u008c*0ZE0\u0013ÌbD+:\u0014\n=-Ç zßc¯B\bÇ\u0090e!\u000bÖ'uÚY\u001d\u008f\u0089×4¥\u009b¶c \u0004砾孳¯D\u0007u{cj\u0099A±\u000e\u0099\u007fPû\u000b\f®\u009að\u0097¦\t¥d\u000e¦üêh\u001b©I\u0013,=\u0098¥\u0003B\u0005亝载夒越ü\u0006Ñ75闅譓8\u0007Í(Í;Õh¦\u0012临辟曢敃嬳扄ô稏午凚锫竄帠辊表昉斂¦\u001b\u00adr\u008b¹7\u0093ÌT\u009cÕÿ»¿ã~\f£rCY\u0016úÿ~ØB\u0002\u0005÷÷\u009cdi\u000e¸6)1c\u0082FvÍ\u0091¤0\u0084ð\u0003`!µ\u0016Ê\u0085gGªL\u007f¯êª1Tf\u001eE³Ä\u0085Þ¯ö!\u000b\u0095k÷ ë¦{.¸\u009b\"\u0006迼冷籿縲嬤磹\u0005LASð\u0017\u0016röp)H\u0081#\u0016a\u009d@²HÂ\u0080(|öÉÕ\u001aý\u001fv{ð\u0098X·!Ð!EH©I¡ Dx{8xyÞ\u0012ú\u0014ÀÜ\u0086\u0095ÑË\u0017\u0091\u0007r\u008dØ·\u0090\r´\u0080%}ôÁÛÈ\\<\"Ñx\u0095Å\u0015\u009eq\u0093Cän\u00176Dç;\u00917\\£`SQÒk}\u0003妇贙\u0017\u0002是斀\u0005\u0010\u0088E\u0014³\u0015Ë¢´Qc&î\u001eB¯Ó¸_«)QW\u001f:êH\b\u0098~\u009e÷Co«D\u000eú\u0012aµj\u0012gdéÓ w\rá\u0014×·Ä\u0001Þ\u0084ñ¶;\u0089\u000b5&\u008a«\u0086z\u000fD>\u000b\u0089Þ+,#\u0001N\"Ì\u001b\u008a\u0003\u0088â\u0080\u0002->\u0006\u001dkæ É¦8±8vÌU\u0014\u008bù\u0006á\u0087\u009f\u009bÜv4ÔqÜª±W3µ{¿niÂ\u001c\u0007\u0014\u009fÞÄ8D(&6c4*){Ò)þ\u000fùä`\u0081\u000e 7\u0003\u007fj~\u0005\u0084$î\u0093\u0091\u0015Å\u0096ø¿\u0089ñºÅñ\u0099\u008d^á¥y^\u0000º«±\u000b\"Úù°g\u00162SJÛ\u000eGÿ\u0083Ø8á\u0082a\u0091CX²e\u0001Ú\f^Î`\u0019v\u0017y¿\u0006轊兛粩纯対硊\u0007梀杷曆旕夊趣Õ\u0016»\u0000I÷oZÇmýòÓ_:\u007fÎ\u009fµ\u0000ð\u001e.1\u0002淄情\u0002砭宆\u001a\u009e{í\u0098û·UÐ¯E\u0099©s¡çD\u0090{%uÃÍ$XÅ.\u0016{¥¢±¡:¶\u0094dý\u008f¿Ö\u0016\u0013\u001b*\u0097Þ\u001aë\u0093\u0005佘嬪妦跡j\u0007å\u0019áÞæ\u0003×\u0003êÕB\u0003\u0019ð<";
      int var20 = "匐浪\u0006棹杔曩斱姯贯\bË\u0088=¬ÉW\u0018.\u0002öò\u0006产迋寭袼膖杜\u0002厣洈\u0007Sß7\u0006<\u0018\u008c*0ZE0\u0013ÌbD+:\u0014\n=-Ç zßc¯B\bÇ\u0090e!\u000bÖ'uÚY\u001d\u008f\u0089×4¥\u009b¶c \u0004砾孳¯D\u0007u{cj\u0099A±\u000e\u0099\u007fPû\u000b\f®\u009að\u0097¦\t¥d\u000e¦üêh\u001b©I\u0013,=\u0098¥\u0003B\u0005亝载夒越ü\u0006Ñ75闅譓8\u0007Í(Í;Õh¦\u0012临辟曢敃嬳扄ô稏午凚锫竄帠辊表昉斂¦\u001b\u00adr\u008b¹7\u0093ÌT\u009cÕÿ»¿ã~\f£rCY\u0016úÿ~ØB\u0002\u0005÷÷\u009cdi\u000e¸6)1c\u0082FvÍ\u0091¤0\u0084ð\u0003`!µ\u0016Ê\u0085gGªL\u007f¯êª1Tf\u001eE³Ä\u0085Þ¯ö!\u000b\u0095k÷ ë¦{.¸\u009b\"\u0006迼冷籿縲嬤磹\u0005LASð\u0017\u0016röp)H\u0081#\u0016a\u009d@²HÂ\u0080(|öÉÕ\u001aý\u001fv{ð\u0098X·!Ð!EH©I¡ Dx{8xyÞ\u0012ú\u0014ÀÜ\u0086\u0095ÑË\u0017\u0091\u0007r\u008dØ·\u0090\r´\u0080%}ôÁÛÈ\\<\"Ñx\u0095Å\u0015\u009eq\u0093Cän\u00176Dç;\u00917\\£`SQÒk}\u0003妇贙\u0017\u0002是斀\u0005\u0010\u0088E\u0014³\u0015Ë¢´Qc&î\u001eB¯Ó¸_«)QW\u001f:êH\b\u0098~\u009e÷Co«D\u000eú\u0012aµj\u0012gdéÓ w\rá\u0014×·Ä\u0001Þ\u0084ñ¶;\u0089\u000b5&\u008a«\u0086z\u000fD>\u000b\u0089Þ+,#\u0001N\"Ì\u001b\u008a\u0003\u0088â\u0080\u0002->\u0006\u001dkæ É¦8±8vÌU\u0014\u008bù\u0006á\u0087\u009f\u009bÜv4ÔqÜª±W3µ{¿niÂ\u001c\u0007\u0014\u009fÞÄ8D(&6c4*){Ò)þ\u000fùä`\u0081\u000e 7\u0003\u007fj~\u0005\u0084$î\u0093\u0091\u0015Å\u0096ø¿\u0089ñºÅñ\u0099\u008d^á¥y^\u0000º«±\u000b\"Úù°g\u00162SJÛ\u000eGÿ\u0083Ø8á\u0082a\u0091CX²e\u0001Ú\f^Î`\u0019v\u0017y¿\u0006轊兛粩纯対硊\u0007梀杷曆旕夊趣Õ\u0016»\u0000I÷oZÇmýòÓ_:\u007fÎ\u009fµ\u0000ð\u001e.1\u0002淄情\u0002砭宆\u001a\u009e{í\u0098û·UÐ¯E\u0099©s¡çD\u0090{%uÃÍ$XÅ.\u0016{¥¢±¡:¶\u0094dý\u008f¿Ö\u0016\u0013\u001b*\u0097Þ\u001aë\u0093\u0005佘嬪妦跡j\u0007å\u0019áÞæ\u0003×\u0003êÕB\u0003\u0019ð<"
         .length();
      char var17 = 2;
      int var45 = -1;

      label145:
      while (true) {
         byte var10000 = 68;
         String var10001 = var18.substring(++var45, var45 + var17);
         byte var10002 = -1;

         while (true) {
            label140: {
               char[] var67 = var10001.toCharArray();
               int var10004 = var67.length;
               int var22 = 0;
               byte var70 = var10000;
               var61 = var67;
               int var51 = var10004;
               byte var81;
               char[] var91;
               int var10006;
               if (var10004 <= 1) {
                  var91 = var67;
                  var81 = var10000;
                  var10006 = var22;
               } else {
                  var70 = var10000;
                  var51 = var10004;
                  if (var10004 <= var22) {
                     break label140;
                  }

                  var91 = var67;
                  var81 = var10000;
                  var10006 = var22;
               }

               while (true) {
                  char var102 = var91[var10006];
                  byte var103;
                  switch (var22 % 7) {
                     case 0:
                        var103 = 48;
                        break;
                     case 1:
                        var103 = 32;
                        break;
                     case 2:
                        var103 = 48;
                        break;
                     case 3:
                        var103 = 26;
                        break;
                     case 4:
                        var103 = 67;
                        break;
                     case 5:
                        var103 = 21;
                        break;
                     default:
                        var103 = 7;
                  }

                  var91[var10006] = (char)(var102 ^ var81 ^ var103);
                  var22++;
                  if (var70 == 0) {
                     var10006 = var70;
                     var91 = var61;
                     var81 = var70;
                  } else {
                     if (var51 <= var22) {
                        break;
                     }

                     var91 = var61;
                     var81 = var70;
                     var10006 = var22;
                  }
               }
            }

            String var72 = new String(var61).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var72;
                  if ((var45 += var17) >= var20) {
                     b = var21;
                     d = new String[57];
                     long var8 = 3809558603992763744L;
                     long[] var14 = new long[3];
                     int var11 = 0;
                     String var12 = "\u0010¦Î÷\u00admÙk\u0096`z$×\u0097é¶a¨ÿm®±\t=";
                     int var13 = "\u0010¦Î÷\u00admÙk\u0096`z$×\u0097é¶a¨ÿm®±\t=".length();
                     byte var10 = 0;

                     do {
                        byte var53 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var53, var10).getBytes("ISO-8859-1");
                        int var54 = var11++;
                        long var85 = (
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
                        byte var73 = -1;
                        var14[var54] = var85;
                     } while (var10 < var13);

                     e = var14;
                     f = new Integer[3];
                     long var0 = 7666071156933988036L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u001a7øsh6¦=Bu=ÿªn¶5";
                     int var5 = "\u001a7øsh6¦=Bu=ÿªn¶5".length();
                     byte var2 = 0;

                     do {
                        byte var55 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var55, var2).getBytes("ISO-8859-1");
                        int var56 = var3++;
                        long var86 = (
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
                        byte var74 = -1;
                        var6[var56] = var86;
                     } while (var2 < var5);

                     i = var6;
                     k = new Long[2];
                     Registry.lookupField(276665903910477068L).set(null, a(19606, -5634));
                     Registry.lookupField(592839404584749312L).set(null, a(19618, 19220));
                     Registry.lookupField(189066699988033637L).set(null, a(19612, -1239));
                     Registry.lookupField(520127779687009672L).set(null, a(19617, 28795));
                     Registry.lookupField(558584643801613540L).setInt(null, a(32034, 3648035473590867244L));
                     Registry.lookupField(561783694857562366L).set(null, a(19626, -4540));
                     Registry.lookupField(621025023751330046L).set(null, a(19616, 12826) + (String)Registry.lookupField(561783694857562366L).get(null));
                     Registry.packArgs(a(19636, -2252));
                     long var24 = 517287540690064504L;
                     Registry.lookupField(489098145942470052L).set(null, Ref.h2(517287540690064504L, var24));
                     String var23 = "";
                     Registry.emptyArgs();
                     long var26 = 575988896201400508L;
                     Object var65 = Ref.h2(575988896201400508L, var26);

                     try {
                        var66 = (Boolean)var65;
                     } catch (InvocationTargetException var43) {
                        throw var43.getTargetException();
                     }

                     if (var66) {
                        var23 = a(19604, 25445);
                     } else {
                        Registry.emptyArgs();
                        long var28 = 514837793111916085L;
                        var72 = (String)Ref.h2(514837793111916085L, var28);

                        try {
                           var76 = (Boolean)var72;
                        } catch (InvocationTargetException var42) {
                           throw var42.getTargetException();
                        }

                        if (var76) {
                           var23 = a(19600, -16970);
                        } else {
                           Registry.emptyArgs();
                           long var30 = 334992549161506172L;
                           Object var87 = Ref.h2(334992549161506172L, var30);

                           try {
                              var88 = (Boolean)var87;
                           } catch (InvocationTargetException var41) {
                              throw var41.getTargetException();
                           }

                           if (var88) {
                              var23 = a(19597, -25008);
                           }
                        }
                     }

                     Registry.emptyArgs();
                     long var32 = 253808553645062345L;
                     var72 = (String)Ref.h2(253808553645062345L, var32);

                     try {
                        var78 = (Boolean)var72;
                     } catch (InvocationTargetException var40) {
                        throw var40.getTargetException();
                     }

                     if (var78) {
                        Registry.lookupField(471631468261961298L)
                           .set(null, (String)Registry.lookupField(489098145942470052L).get(null) + a(19609, 17913) + var23 + a(19643, 23119));
                        Registry.lookupField(483358680769607062L).set(null, a(19629, -7811));
                        Registry.lookupField(602197175769593572L).set(null, a(19634, 24180));
                     } else {
                        Registry.emptyArgs();
                        long var34 = 454647487873911743L;
                        Object var89 = Ref.h2(454647487873911743L, var34);

                        try {
                           var90 = (Boolean)var89;
                        } catch (InvocationTargetException var39) {
                           throw var39.getTargetException();
                        }

                        if (var90) {
                           Registry.lookupField(471631468261961298L)
                              .set(null, (String)Registry.lookupField(489098145942470052L).get(null) + a(19625, 4906) + var23 + a(19602, 25881));
                           Registry.lookupField(483358680769607062L).set(null, a(19611, -24314));
                           Registry.lookupField(602197175769593572L).set(null, a(19601, 13475));
                        } else {
                           Registry.emptyArgs();
                           var36 = 561847341732101275L;
                           Object var95 = Ref.h2(561847341732101275L, var36);

                           try {
                              var96 = (Boolean)var95;
                           } catch (InvocationTargetException var38) {
                              throw var38.getTargetException();
                           }

                           if (var96) {
                              Registry.lookupField(471631468261961298L)
                                 .set(null, (String)Registry.lookupField(489098145942470052L).get(null) + a(19608, 18605) + var23 + a(19602, 25881));
                              Registry.lookupField(483358680769607062L).set(null, a(19607, 7019));
                              Registry.lookupField(602197175769593572L).set(null, a(19592, 452));
                           }
                        }
                     }

                     return;
                  }

                  var17 = var18.charAt(var45);
                  break;
               default:
                  var21[var19++] = var72;
                  if ((var45 += var17) < var20) {
                     var17 = var18.charAt(var45);
                     continue label145;
                  }

                  var18 = "É¦\u0007©7\u001d?½¶»¨\u009bÞR\u0093\u0081`²¾\u0087í!ÏÌazÅÕÁ\u0013\u001dï\u0080X\u0011£\u0007zøo°Ó\u009bïFñ\u0085)P\u0016ó\u001bÆeëgf[\u0014\u00065\u0015/®ûü@\u0093.e\nrêÃB2\u0002ä\u0089ø\u0005\u0007X\u0018\u000bc";
                  var20 = "É¦\u0007©7\u001d?½¶»¨\u009bÞR\u0093\u0081`²¾\u0087í!ÏÌazÅÕÁ\u0013\u001dï\u0080X\u0011£\u0007zøo°Ó\u009bïFñ\u0085)P\u0016ó\u001bÆeëgf[\u0014\u00065\u0015/®ûü@\u0093.e\nrêÃB2\u0002ä\u0089ø\u0005\u0007X\u0018\u000bc"
                     .length();
                  var17 = 'P';
                  var45 = -1;
            }

            var10000 = 121;
            var10001 = var18.substring(++var45, var45 + var17);
            var10002 = 0;
         }
      }
   }
}





