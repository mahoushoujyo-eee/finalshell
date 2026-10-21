package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Tn4;
import com.finalshell.ui.dialog.UpdateDialog;
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

public class Fl4 implements C22 {
   public static String Z;
   public static String f;
   public static String F;
   public static String H;
   public static String M;
   public static String R;
   public static int u;
   public boolean J;
   public boolean d;
   public static String l;
   public Y7 N;
   public Pz4 E;
   public long S;
   public long c;
   public boolean v;
   public String K;
   public String h;
   public boolean n;
   public boolean O;
   public boolean T;
   public boolean Y;
   public UpdateDialog Q;
   public U52 b;
   public static String q;
   public Component i;
   public static String[] a;
   public static String[] e;
   public static long[] g;
   public static Integer[] j;
   public static long[] k;
   public static Long[] m;

   public Fl4() {
      Registry.lookupField(354569316750752448L).setBoolean(this, false);
      Registry.lookupField(554597711152469315L).setBoolean(this, false);
      Pz4 var10001 = new Pz4();
      long var2 = 439043916966814983L;
      Pz4 var1 = var10001;
      Ref.s(439043916966814983L, var1, var2);
      Registry.lookupField(627804769415997620L).setBoolean(this, false);
      Registry.lookupField(350076904658429385L).setBoolean(this, false);
      Registry.lookupField(230901963858610268L).setBoolean(this, false);
      Registry.lookupField(602001947594778012L).setBoolean(this, false);
   }

   public static void E() {
      String[] var0 = UpdateDialog.y();

      label59: {
         label60: {
            try {
               Registry.emptyArgs();
               long var4 = 270389152141252877L;
               Object var10001 = Ref.h2(270389152141252877L, var4);

               try {
                  var10001 = (YT3_2)var10001;
               } catch (InvocationTargetException var16) {
                  throw var16.getTargetException();
               }

               if (var0 != null) {
                  break label60;
               }

               if (var10001 == null) {
                  break label59;
               }
            } catch (IOException var17) {
               throw a(var17);
            }

            Registry.emptyArgs();
            long var6 = 270389152141252877L;
            Ref.h2(270389152141252877L, var6);

            try {
               ;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }
         }

         Object[] var10002 = Registry.emptyArgs();
         long var9 = 409773188541543546L;
         Object[] var8 = var10002;
         Ref.h(409773188541543546L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }
      }

      File var2 = new File((String)Registry.lookupField(215163092700559090L).get(null));

      try {
         Process var1 = Runtime.getRuntime().exec(new String[]{a(11103, -27867), a(11077, -27240), var2.getName()}, null, var2.getParentFile());
         Registry.packArgs(var1, false);
         long var10 = 248153879763504193L;
         Ref.h2(248153879763504193L, var10);

         try {
            ;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }
      } catch (IOException var13) {
         var13.printStackTrace();
      }

      System.exit(0);
   }

   public static void i() {
      String var0 = System.getProperty(a(11126, 14949));
      if (new File(a(11082, 28704)).exists()) {
      }

      File var2 = new File(
         (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(381041478094158656L).get(null)
      );
      var2.delete();
      Registry.packArgs(new File((String)Registry.lookupField(381041478094158656L).get(null)), var2);
      long var4 = 491542259234798132L;
      Ref.h2(491542259234798132L, var4);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      try {
         ProcessBuilder var3 = new ProcessBuilder(a(11081, -7954), a(11083, -26764), "\"" + var2.getName() + a(11128, 1933) + var0 + "\"");
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
      long var8 = 515744380023053865L;
      Ref.h2(515744380023053865L, var8);
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

   public static void v() {
      File var0 = new File((String)Registry.lookupField(215163092700559090L).get(null));

      try {
         Process var1 = Runtime.getRuntime().exec(new String[]{a(11103, -27867), a(11077, -27240), var0.getName()}, null, var0.getParentFile());
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

   public void e() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aconst_null
      // 002: ldc2_w 324199404516516190
      // 005: astore 7
      // 007: astore 6
      // 009: ldc2_w 324199404516516190
      // 00c: aload 6
      // 00e: aload 7
      // 010: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 013: invokestatic com/finalshell/ui/dialog/UpdateDialog.y ()[Ljava/lang/String;
      // 016: aload 0
      // 017: bipush 1
      // 018: ldc2_w 627804769415997620
      // 01b: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 01e: dup_x2
      // 01f: pop
      // 020: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 023: astore 1
      // 024: aload 0
      // 025: bipush 1
      // 026: ldc2_w 354569316750752448
      // 029: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02c: dup_x2
      // 02d: pop
      // 02e: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 031: aload 0
      // 032: bipush 0
      // 033: ldc2_w 361925458116439130
      // 036: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 039: dup_x2
      // 03a: pop
      // 03b: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 03e: aload 0
      // 03f: ldc2_w 599733929125356652
      // 042: astore 8
      // 044: ldc2_w 599733929125356652
      // 047: aload 8
      // 049: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 04c: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 04f: aload 1
      // 050: ifnonnull 075
      // 053: ifnull 091
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aload 0
      // 05e: ldc2_w 599733929125356652
      // 061: astore 10
      // 063: ldc2_w 599733929125356652
      // 066: aload 10
      // 068: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 06b: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 06e: goto 075
      // 071: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 078: ldc2_w 448870905616495851
      // 07b: astore 13
      // 07d: astore 12
      // 07f: ldc2_w 448870905616495851
      // 082: aload 12
      // 084: aload 13
      // 086: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 089: pop
      // 08a: goto 091
      // 08d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 090: athrow
      // 091: bipush 0
      // 092: istore 2
      // 093: iload 2
      // 094: bipush 3
      // 095: if_icmpge 2b1
      // 098: new java/lang/StringBuilder
      // 09b: dup
      // 09c: invokespecial java/lang/StringBuilder.<init> ()V
      // 09f: ldc2_w 516121382692238713
      // 0a2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0a5: aconst_null
      // 0a6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a9: checkcast java/lang/String
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: sipush 11118
      // 0b2: sipush -10881
      // 0b5: invokestatic com/finalshell/core/Fl4.a (II)Ljava/lang/String;
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: bipush 5
      // 0bc: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 0bf: ldc2_w 502006739469260406
      // 0c2: astore 14
      // 0c4: ldc2_w 502006739469260406
      // 0c7: aload 14
      // 0c9: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0cc: checkcast java/lang/String
      // 0cf: goto 0d6
      // 0d2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0dc: astore 3
      // 0dd: aload 0
      // 0de: ldc2_w 361045042490530589
      // 0e1: astore 16
      // 0e3: ldc2_w 361045042490530589
      // 0e6: aload 16
      // 0e8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0eb: aload 3
      // 0ec: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ef: ldc2_w 545849810467011370
      // 0f2: astore 19
      // 0f4: astore 18
      // 0f6: ldc2_w 545849810467011370
      // 0f9: aload 18
      // 0fb: aload 19
      // 0fd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 100: checkcast [B
      // 103: goto 10a
      // 106: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 109: athrow
      // 10a: astore 4
      // 10c: aload 1
      // 10d: ifnonnull 2be
      // 110: aload 4
      // 112: ifnonnull 120
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: aload 1
      // 11d: ifnull 2aa
      // 120: new java/lang/String
      // 123: dup
      // 124: aload 4
      // 126: sipush 11102
      // 129: sipush -10484
      // 12c: invokestatic com/finalshell/core/Fl4.a (II)Ljava/lang/String;
      // 12f: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 132: astore 5
      // 134: aload 0
      // 135: new com/finalshell/core/Y7
      // 138: dup
      // 139: aload 5
      // 13b: invokespecial com/finalshell/core/Y7.<init> (Ljava/lang/String;)V
      // 13e: ldc2_w 264767333402389216
      // 141: astore 21
      // 143: astore 20
      // 145: ldc2_w 264767333402389216
      // 148: aload 20
      // 14a: aload 21
      // 14c: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 14f: aload 0
      // 150: bipush 1
      // 151: ldc2_w 361925458116439130
      // 154: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 157: dup_x2
      // 158: pop
      // 159: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 15c: aload 0
      // 15d: ldc2_w 154178284205051149
      // 160: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 163: aconst_null
      // 164: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 167: aload 1
      // 168: ifnonnull 1ac
      // 16b: aload 0
      // 16c: ldc2_w 264767333402389216
      // 16f: astore 22
      // 171: ldc2_w 264767333402389216
      // 174: aload 22
      // 176: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 179: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 17c: ldc2_w 281745090680724750
      // 17f: astore 25
      // 181: astore 24
      // 183: ldc2_w 281745090680724750
      // 186: aload 24
      // 188: aload 25
      // 18a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18d: checkcast java/lang/Integer
      // 190: invokevirtual java/lang/Integer.intValue ()I
      // 193: goto 19a
      // 196: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 199: athrow
      // 19a: if_icmpge 1af
      // 19d: goto 1a4
      // 1a0: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: bipush 1
      // 1a5: goto 1ac
      // 1a8: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ab: athrow
      // 1ac: goto 1b0
      // 1af: bipush 0
      // 1b0: ldc2_w 627804769415997620
      // 1b3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1b6: dup_x2
      // 1b7: pop
      // 1b8: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 1bb: aload 0
      // 1bc: ldc2_w 599733929125356652
      // 1bf: astore 26
      // 1c1: ldc2_w 599733929125356652
      // 1c4: aload 26
      // 1c6: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1c9: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 1cc: aload 1
      // 1cd: ifnonnull 1f2
      // 1d0: ifnull 20e
      // 1d3: goto 1da
      // 1d6: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d9: athrow
      // 1da: aload 0
      // 1db: ldc2_w 599733929125356652
      // 1de: astore 28
      // 1e0: ldc2_w 599733929125356652
      // 1e3: aload 28
      // 1e5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1e8: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 1eb: goto 1f2
      // 1ee: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f1: athrow
      // 1f2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1f5: ldc2_w 448870905616495851
      // 1f8: astore 31
      // 1fa: astore 30
      // 1fc: ldc2_w 448870905616495851
      // 1ff: aload 30
      // 201: aload 31
      // 203: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 206: pop
      // 207: goto 20e
      // 20a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20d: athrow
      // 20e: goto 2b1
      // 211: astore 3
      // 212: aload 0
      // 213: aload 1
      // 214: ifnonnull 267
      // 217: ldc2_w 599733929125356652
      // 21a: astore 32
      // 21c: ldc2_w 599733929125356652
      // 21f: aload 32
      // 221: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 224: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 227: ifnull 262
      // 22a: goto 231
      // 22d: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: aload 0
      // 232: ldc2_w 599733929125356652
      // 235: astore 34
      // 237: ldc2_w 599733929125356652
      // 23a: aload 34
      // 23c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 23f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 242: ldc2_w 448870905616495851
      // 245: astore 37
      // 247: astore 36
      // 249: ldc2_w 448870905616495851
      // 24c: aload 36
      // 24e: aload 37
      // 250: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 253: pop
      // 254: goto 25b
      // 257: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25a: athrow
      // 25b: goto 262
      // 25e: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 261: athrow
      // 262: aload 3
      // 263: invokevirtual java/lang/Exception.printStackTrace ()V
      // 266: aload 0
      // 267: new java/lang/StringBuilder
      // 26a: dup
      // 26b: invokespecial java/lang/StringBuilder.<init> ()V
      // 26e: sipush 11096
      // 271: sipush -2450
      // 274: invokestatic com/finalshell/core/Fl4.a (II)Ljava/lang/String;
      // 277: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27a: iload 2
      // 27b: bipush 1
      // 27c: iadd
      // 27d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 280: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 283: ldc2_w 324199404516516190
      // 286: astore 39
      // 288: astore 38
      // 28a: ldc2_w 324199404516516190
      // 28d: aload 38
      // 28f: aload 39
      // 291: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 294: sipush 8796
      // 297: ldc2_w 6144777666533136723
      // 29a: invokestatic com/finalshell/core/Fl4.b (IJ)J
      // 29d: invokestatic java/lang/Thread.sleep (J)V
      // 2a0: goto 2aa
      // 2a3: astore 4
      // 2a5: aload 4
      // 2a7: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 2aa: iinc 2 1
      // 2ad: aload 1
      // 2ae: ifnull 093
      // 2b1: aload 0
      // 2b2: bipush 0
      // 2b3: ldc2_w 354569316750752448
      // 2b6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2b9: dup_x2
      // 2ba: pop
      // 2bb: invokevirtual java/lang/reflect/Field.setBoolean (Ljava/lang/Object;Z)V
      // 2be: aload 0
      // 2bf: ldc2_w 599733929125356652
      // 2c2: astore 40
      // 2c4: ldc2_w 599733929125356652
      // 2c7: aload 40
      // 2c9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2cc: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 2cf: aload 1
      // 2d0: ifnonnull 2f5
      // 2d3: ifnull 311
      // 2d6: goto 2dd
      // 2d9: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2dc: athrow
      // 2dd: aload 0
      // 2de: ldc2_w 599733929125356652
      // 2e1: astore 42
      // 2e3: ldc2_w 599733929125356652
      // 2e6: aload 42
      // 2e8: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2eb: checkcast com/finalshell/ui/dialog/UpdateDialog
      // 2ee: goto 2f5
      // 2f1: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f4: athrow
      // 2f5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2f8: ldc2_w 448870905616495851
      // 2fb: astore 45
      // 2fd: astore 44
      // 2ff: ldc2_w 448870905616495851
      // 302: aload 44
      // 304: aload 45
      // 306: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 309: pop
      // 30a: goto 311
      // 30d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 310: athrow
      // 311: return
   }

   public static void o$void() {
      String[] var10000 = UpdateDialog.y();
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

   public void m() {
      String[] var10000 = UpdateDialog.y();
      Registry.lookupField(230901963858610268L).setBoolean(this, true);
      String var2 = (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(636503015406168114L).get(null);
      String[] var1 = var10000;

      label35: {
         label34: {
            try {
               if (var1 != null) {
                  break label35;
               }

               if (!Registry.lookupField(602001947594778012L).getBoolean(this)) {
                  break label34;
               }
            } catch (IOException var10) {
               throw a(var10);
            }

            var2 = (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(488797196485545516L).get(null);
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

   public void C$void() {
      Registry.lookupField(230901963858610268L).setBoolean(this, true);
      String[] var10000 = UpdateDialog.y();
      String var2 = (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(636503015406168114L).get(null);
      String[] var1 = var10000;

      label24: {
         try {
            if (var1 != null) {
               return;
            }

            if (!Registry.lookupField(602001947594778012L).getBoolean(this)) {
               break label24;
            }
         } catch (IOException var5) {
            throw a(var5);
         }

         var2 = (String)Registry.lookupField(168719389020873220L).get(null) + File.separator + (String)Registry.lookupField(488797196485545516L).get(null);
      }

      try {
         Desktop.getDesktop().open(new File(var2));
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void L(CH var1, Component var2) {
      Registry.lookupField(230901963858610268L).setBoolean(this, true);
      String[] var10000 = UpdateDialog.y();
      String var4 = "";
      String[] var3 = var10000;

      label83: {
         label82: {
            label81: {
               try {
                  if (var3 != null) {
                     break label82;
                  }

                  Registry.lookupField(154178284205051149L).getInt(null);
                  Object var13 = 264767333402389216L;
                  Object var10002 = Ref.g(264767333402389216L, var13);
                  Object[] var10003 = Registry.emptyArgs();
                  long var16 = 372364150653756350L;
                  Object[] var15 = var10003;
                  var10003 = Ref.h(372364150653756350L, var15, var16);

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

               var4 = a(11097, -27036);
               Registry.lookupField(602001947594778012L).setBoolean(this, true);
               if (var3 == null) {
                  break label83;
               }
            }

            var4 = a(11074, -15810);
         }

         Registry.lookupField(602001947594778012L).setBoolean(this, false);
      }

      File var5 = new File((String)Registry.lookupField(179276309776747034L).get(null) + File.separator + var4);

      try {
         Registry.packArgs(a(11079, -29979) + var4, var5.getAbsolutePath(), null);
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
            JLabel var7 = new JLabel(a(11113, 30196));
            JPasswordField var8 = new JPasswordField(a(26355, 7097134622435055260L));
            var6.add(var7);
            var6.add(var8);
            var10000 = new String[]{a(11122, 592), a(11084, -23454)};
            Registry.lookupField(388376917454860932L).get(null);
            Object[] var10001 = Registry.packArgs(new Tn4(this, var8));
            long var20 = 434592463220957006L;
            Object[] var19 = var10001;
            Ref.h(434592463220957006L, var19, var20);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            int var10 = JOptionPane.showConfirmDialog(null, var6, a(11108, 23143), 2, -1);
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
            var1.d(a(11111, 2630) + var4 + a(11135, -30772));
         } catch (Exception var28) {
            boolean var34 = false;
            throw a(var28);
         }
      }

      Registry.lookupField(230901963858610268L).setBoolean(this, false);
   }

   public void t(CH var1, Component var2) {
      long var18 = 564217424946084486L;
      Ref.s(564217424946084486L, var2, var18);
      Registry.lookupField(230901963858610268L).setBoolean(this, true);
      Registry.lookupField(231431924199448741L).setLong(this, 0L);
      String[] var10001 = UpdateDialog.y();
      Registry.lookupField(168979346047647150L).setLong(this, 0L);
      String[] var3 = var10001;
      long var20 = 455268764935355489L;
      String var19 = "";
      Ref.s(455268764935355489L, var19, var20);
      long var22 = 324199404516516190L;
      Object var21 = null;
      Ref.s(324199404516516190L, var21, var22);
      Object[] var10004 = Registry.emptyArgs();
      long var24 = 119751058421524022L;
      Object[] var23 = var10004;
      Ref.h(119751058421524022L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var104) {
         throw var104.getTargetException();
      }

      label353: {
         if (var3 == null) {
            if (Registry.lookupField(361925458116439130L).getBoolean(this)) {
               int var10005 = Registry.lookupField(154178284205051149L).getInt(null);
               if (var3 == null) {
                  Object var25 = 264767333402389216L;
                  Object var10007 = Ref.g(264767333402389216L, var25);
                  Object[] var10008 = Registry.emptyArgs();
                  long var28 = 281745090680724750L;
                  Object[] var27 = var10008;
                  var10008 = Ref.h(281745090680724750L, var27, var28);

                  try {
                     var122 = (Integer)var10008;
                  } catch (InvocationTargetException var103) {
                     throw var103.getTargetException();
                  }

                  if (var10007 < var122) {
                     boolean var114 = true;
                  } else {
                     boolean var115 = false;
                  }
               }

               boolean var4;
               File var6;
               label359: {
                  Registry.lookupField(627804769415997620L).setBoolean(this, (boolean)var10005);
                  var4 = false;
                  boolean var5 = true;
                  var6 = null;
                  boolean var112 = Registry.lookupField(627804769415997620L).getBoolean(this);
                  if (var3 == null) {
                     if (!var112) {
                        break label359;
                     }

                     var4 = true;
                     Registry.lookupField(554597711152469315L).setBoolean(this, true);
                     Registry.lookupField(154178284205051149L).getInt(null);
                  }

                  Object var29 = 264767333402389216L;
                  Object var10006 = Ref.g(264767333402389216L, var29);
                  Object[] var116 = Registry.emptyArgs();
                  long var32 = 372364150653756350L;
                  Object[] var31 = var116;
                  var116 = Ref.h(372364150653756350L, var31, var32);

                  try {
                     var118 = (Integer)var116;
                  } catch (InvocationTargetException var102) {
                     throw var102.getTargetException();
                  }

                  if (var10006 < var118) {
                     var6 = new File(
                        (String)Registry.lookupField(168719389020873220L).get(null)
                           + File.separator
                           + (String)Registry.lookupField(488797196485545516L).get(null)
                     );
                     Object[] var123 = Registry.packArgs(a(11114, -6847), var6);
                     long var34 = 286276370098049965L;
                     Object[] var33 = var123;
                     var123 = Ref.h(286276370098049965L, var33, var34);

                     try {
                        var125 = (Boolean)var123;
                     } catch (InvocationTargetException var101) {
                        throw var101.getTargetException();
                     }

                     Registry.lookupField(350076904658429385L).setBoolean(this, var125);
                     Registry.lookupField(602001947594778012L).setBoolean(this, true);
                  } else {
                     var6 = new File(
                        (String)Registry.lookupField(168719389020873220L).get(null)
                           + File.separator
                           + (String)Registry.lookupField(636503015406168114L).get(null)
                     );
                     Object[] var126 = Registry.packArgs(a(11123, -22940), var6);
                     long var36 = 286276370098049965L;
                     Object[] var35 = var126;
                     var126 = Ref.h(286276370098049965L, var35, var36);

                     try {
                        var128 = (Boolean)var126;
                     } catch (InvocationTargetException var100) {
                        throw var100.getTargetException();
                     }

                     Registry.lookupField(350076904658429385L).setBoolean(this, var128);
                     Registry.lookupField(602001947594778012L).setBoolean(this, false);
                  }
               }

               label342: {
                  Fl4 var120;
                  label341: {
                     label340: {
                        boolean var119 = var4;
                        if (var3 == null) {
                           if (!var4) {
                              break label340;
                           }

                           var120 = this;
                           if (var3 != null) {
                              break label341;
                           }

                           var119 = Registry.lookupField(350076904658429385L).getBoolean(this);
                        }

                        if (var119) {
                           Registry.lookupField(627804769415997620L).setBoolean(this, false);
                           Object var37 = 599733929125356652L;
                           int var7 = JOptionPane.showConfirmDialog((UpdateDialog)Ref.g(599733929125356652L, var37), a(11109, 415), a(11132, 7994), 0);
                           if (var3 != null) {
                              break label342;
                           }

                           label333:
                           if (var7 == 0) {
                              Object[] var129 = Registry.lookupField(602001947594778012L).getBoolean(this);
                              if (var3 == null) {
                                 if (var129 == null) {
                                    Registry.emptyArgs();
                                    long var39 = 253808553645062345L;
                                    Object var10009 = Ref.h2(253808553645062345L, var39);

                                    try {
                                       var10009 = (Boolean)var10009;
                                    } catch (InvocationTargetException var99) {
                                       throw var99.getTargetException();
                                    }

                                    label366: {
                                       if (var3 == null) {
                                          if (var10009 == null) {
                                             Registry.packArgs(true);
                                             long var41 = 515744380023053865L;
                                             Ref.h2(515744380023053865L, var41);
                                             Registry.emptyArgs();
                                             long var43 = 248287587210411357L;
                                             Ref.h2(248287587210411357L, var43);

                                             try {
                                                ;
                                             } catch (InvocationTargetException var98) {
                                                throw var98.getTargetException();
                                             }

                                             if (var3 == null) {
                                                break label366;
                                             }
                                          }

                                          var10009 = Registry.emptyArgs();
                                          long var45 = 454647487873911743L;
                                          Object var10010 = Ref.h2(454647487873911743L, var45);

                                          try {
                                          } catch (InvocationTargetException var97) {
                                             throw var97.getTargetException();
                                          }
                                       }

                                       if (var3 == null) {
                                          if (var10009 == null) {
                                             Object[] var134 = Registry.emptyArgs();
                                             long var48 = 128365951011908028L;
                                             Object[] var47 = var134;
                                             Ref.h(128365951011908028L, var47, var48);

                                             try {
                                                ;
                                             } catch (InvocationTargetException var96) {
                                                throw var96.getTargetException();
                                             }

                                             if (var3 == null) {
                                                break label366;
                                             }
                                          }

                                          var10009 = Registry.emptyArgs();
                                          long var49 = 561847341732101275L;
                                          Object var135 = Ref.h2(561847341732101275L, var49);

                                          try {
                                          } catch (InvocationTargetException var95) {
                                             throw var95.getTargetException();
                                          }
                                       }

                                       if (var10009 == null) {
                                          Object[] var136 = Registry.emptyArgs();
                                          long var52 = 359037471246162130L;
                                          Object[] var51 = var136;
                                          Ref.h(359037471246162130L, var51, var52);

                                          try {
                                             ;
                                          } catch (InvocationTargetException var94) {
                                             throw var94.getTargetException();
                                          }
                                       }
                                    }

                                    Registry.emptyArgs();
                                    long var53 = 270389152141252877L;
                                    Ref.h2(270389152141252877L, var53);
                                    Object[] var10011 = Registry.emptyArgs();
                                    long var56 = 292622089215767678L;
                                    Object[] var55 = var10011;
                                    Ref.h(292622089215767678L, var55, var56);

                                    try {
                                       ;
                                    } catch (InvocationTargetException var93) {
                                       throw var93.getTargetException();
                                    }

                                    if (var3 == null) {
                                       break label333;
                                    }
                                 }

                                 var129 = Registry.emptyArgs();
                                 long var57 = 253808553645062345L;
                                 Object var131 = Ref.h2(253808553645062345L, var57);

                                 try {
                                 } catch (InvocationTargetException var92) {
                                    throw var92.getTargetException();
                                 }
                              }

                              if (var3 == null) {
                                 if (var129 == null) {
                                    Registry.packArgs(true);
                                    long var59 = 515744380023053865L;
                                    Ref.h2(515744380023053865L, var59);
                                    Registry.emptyArgs();
                                    long var61 = 248287587210411357L;
                                    Ref.h2(248287587210411357L, var61);

                                    try {
                                       ;
                                    } catch (InvocationTargetException var91) {
                                       throw var91.getTargetException();
                                    }

                                    if (var3 == null) {
                                       break label333;
                                    }
                                 }

                                 var129 = Registry.emptyArgs();
                                 long var63 = 454647487873911743L;
                                 Object var132 = Ref.h2(454647487873911743L, var63);

                                 try {
                                 } catch (InvocationTargetException var90) {
                                    throw var90.getTargetException();
                                 }
                              }

                              if (var3 == null) {
                                 if (var129 == null) {
                                    Registry.emptyArgs();
                                    long var65 = 270389152141252877L;
                                    Ref.h2(270389152141252877L, var65);
                                    Object[] var137 = Registry.emptyArgs();
                                    long var68 = 578864097947885485L;
                                    Object[] var67 = var137;
                                    Ref.h(578864097947885485L, var67, var68);

                                    try {
                                       ;
                                    } catch (InvocationTargetException var89) {
                                       throw var89.getTargetException();
                                    }

                                    String var139 = (String)(Registry.emptyArgs());
                                    long var70 = 237955022755953409L;
                                    Object[] var69 = var139;
                                    var139 = Ref.h(237955022755953409L, var69, var70);

                                    try {
                                       var139 = (String)var139;
                                    } catch (InvocationTargetException var88) {
                                       throw var88.getTargetException();
                                    }

                                    label375: {
                                       String var8 = var139;
                                       String var142 = var8;
                                       if (var3 == null) {
                                          if (var8 == null) {
                                             break label375;
                                          }

                                          var142 = a(11075, -16805);
                                       }

                                       String var9 = var142;
                                       String var10 = a(11078, 29752) + var6.getAbsolutePath() + " " + var9;
                                       Registry.packArgs(var10, var8, var1);
                                       long var71 = 408357096272986083L;
                                       Ref.h2(408357096272986083L, var71);
                                       long var11 = var6.length();
                                       long var13 = 0L;
                                       File var15 = new File(var9);
                                       int var10012 = (var15.exists()) ? 1 : 0;
                                       if (var3 == null) {
                                          if (var10012 != 0) {
                                             var13 = var15.length();
                                          }

                                          long var148;
                                          var10012 = (var148 = var11 - var13) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                                       }

                                       if (var3 == null) {
                                          var10012 = var10012 == 0 ? 1 : 0;
                                       }

                                       int var16 = var10012;
                                       var10012 = var16;
                                       if (var3 == null) {
                                          if (var16 == 0) {
                                             break label375;
                                          }

                                          var10012 = 0;
                                       }

                                       System.exit(var10012);
                                    }

                                    if (var3 == null) {
                                       break label333;
                                    }
                                 }

                                 var129 = Registry.emptyArgs();
                                 long var73 = 561847341732101275L;
                                 Object var133 = Ref.h2(561847341732101275L, var73);

                                 try {
                                 } catch (InvocationTargetException var87) {
                                    throw var87.getTargetException();
                                 }
                              }

                              if (var129 == null) {
                                 Registry.emptyArgs();
                                 long var75 = 270389152141252877L;
                                 Ref.h2(270389152141252877L, var75);
                                 Object[] var138 = Registry.emptyArgs();
                                 long var78 = 578864097947885485L;
                                 Object[] var77 = var138;
                                 Ref.h(578864097947885485L, var77, var78);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var86) {
                                    throw var86.getTargetException();
                                 }

                                 String var143 = (String)(Registry.emptyArgs());
                                 long var80 = 237955022755953409L;
                                 Object[] var79 = var143;
                                 var143 = Ref.h(237955022755953409L, var79, var80);

                                 try {
                                    var143 = (String)var143;
                                 } catch (InvocationTargetException var85) {
                                    throw var85.getTargetException();
                                 }

                                 String var105 = var143;
                                 if (var3 != null) {
                                    break label342;
                                 }

                                 if (var105 != null) {
                                    String var106 = a(11119, 2195);
                                    String var107 = a(11106, 18744) + var6.getAbsolutePath() + " " + var106;
                                    Registry.packArgs(var107, var105, var1);
                                    long var81 = 408357096272986083L;
                                    Ref.h2(408357096272986083L, var81);
                                    long var108 = var6.length();
                                    long var109 = 0L;
                                    File var110 = new File(var106);
                                    int var147 = (var110.exists()) ? 1 : 0;
                                    if (var3 == null) {
                                       if (var147) {
                                          var109 = var110.length();
                                       }

                                       long var149;
                                       var147 = (var149 = var108 - var109) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                                    }

                                    if (var3 == null) {
                                       var147 = !var147;
                                    }

                                    int var111 = var147;
                                    if (var3 != null) {
                                       break label342;
                                    }

                                    if (var111) {
                                       System.exit(0);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var120 = this;
                  }

                  Registry.lookupField(554597711152469315L).setBoolean(var120, false);
               }

               if (var3 == null) {
                  break label353;
               }
            }

            Registry.lookupField(554597711152469315L).setBoolean(this, false);
         }

         String var113 = a(11120, -11932);
         long var84 = 324199404516516190L;
         String var83 = var113;
         Ref.s(324199404516516190L, var83, var84);
      }

      Registry.lookupField(354569316750752448L).setBoolean(this, false);
      Registry.lookupField(230901963858610268L).setBoolean(this, false);
      Registry.lookupField(627804769415997620L).setBoolean(this, true);
   }

   public String C$String() {
      String var1 = null;
      JPanel var2 = new JPanel();
      JLabel var3 = new JLabel(a(11130, 20078));
      JPasswordField var4 = new JPasswordField(a(22620, 8553306932841261106L));
      var2.add(var3);
      var2.add(var4);
      String[] var5 = new String[]{a(11121, -18354), a(11112, 17478)};
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.Zl2(this, var4));
      long var9 = 434592463220957006L;
      Object[] var8 = var10001;
      Ref.h(434592463220957006L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Object var10 = 564217424946084486L;
      int var6 = JOptionPane.showOptionDialog((Component)Ref.g(564217424946084486L, var10), var2, a(11073, 11614), 1, -1, null, var5, var5[0]);
      if (var6 == 0) {
         char[] var7 = var4.getPassword();
         var1 = new String(var7);
      }

      return var1;
   }

   public void b(String var1, String var2) {
      Registry.packArgs(new File(var1), new File(var2));
      long var3 = 491542259234798132L;
      Ref.h2(491542259234798132L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void z() {
      if (Registry.lookupField(602001947594778012L).getBoolean(this)) {
      }
   }

   public boolean J(String param1, File param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/dialog/UpdateDialog.y ()[Ljava/lang/String;
      // 003: bipush 0
      // 004: istore 4
      // 006: astore 3
      // 007: bipush 0
      // 008: istore 5
      // 00a: iload 5
      // 00c: bipush 2
      // 00d: if_icmpge 26a
      // 010: aload 0
      // 011: ldc2_w 264767333402389216
      // 014: astore 11
      // 016: ldc2_w 264767333402389216
      // 019: aload 11
      // 01b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01e: aload 1
      // 01f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 022: ldc2_w 356701278797114407
      // 025: astore 14
      // 027: astore 13
      // 029: ldc2_w 356701278797114407
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
      // 069: sipush 11116
      // 06c: sipush 24153
      // 06f: invokestatic com/finalshell/core/Fl4.a (II)Ljava/lang/String;
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
      // 0be: ldc2_w 231431924199448741
      // 0c1: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0c4: swap
      // 0c5: dup2_x2
      // 0c6: pop2
      // 0c7: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 0ca: aload 0
      // 0cb: aload 1
      // 0cc: aload 3
      // 0cd: ifnonnull 1fe
      // 0d0: ldc2_w 455268764935355489
      // 0d3: astore 22
      // 0d5: astore 21
      // 0d7: ldc2_w 455268764935355489
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
      // 10b: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: ifeq 1cf
      // 112: goto 119
      // 115: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: aload 2
      // 11a: aload 3
      // 11b: ifnonnull 13c
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: invokevirtual java/io/File.length ()J
      // 128: lconst_0
      // 129: lcmp
      // 12a: ifle 1cf
      // 12d: goto 134
      // 130: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: aload 2
      // 135: goto 13c
      // 138: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 187: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: bipush 1
      // 18c: istore 4
      // 18e: aload 3
      // 18f: ifnull 26a
      // 192: aload 0
      // 193: new java/lang/StringBuilder
      // 196: dup
      // 197: invokespecial java/lang/StringBuilder.<init> ()V
      // 19a: sipush 11134
      // 19d: sipush -2968
      // 1a0: invokestatic com/finalshell/core/Fl4.a (II)Ljava/lang/String;
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
      // 1ba: ldc2_w 324199404516516190
      // 1bd: astore 30
      // 1bf: astore 29
      // 1c1: ldc2_w 324199404516516190
      // 1c4: aload 29
      // 1c6: aload 30
      // 1c8: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1cb: aload 3
      // 1cc: ifnull 20f
      // 1cf: aload 0
      // 1d0: new java/lang/StringBuilder
      // 1d3: dup
      // 1d4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d7: sipush 11087
      // 1da: sipush -15915
      // 1dd: invokestatic com/finalshell/core/Fl4.a (II)Ljava/lang/String;
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
      // 1fa: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fd: athrow
      // 1fe: ldc2_w 324199404516516190
      // 201: astore 32
      // 203: astore 31
      // 205: ldc2_w 324199404516516190
      // 208: aload 31
      // 20a: aload 32
      // 20c: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 20f: goto 263
      // 212: astore 6
      // 214: aload 0
      // 215: new java/lang/StringBuilder
      // 218: dup
      // 219: invokespecial java/lang/StringBuilder.<init> ()V
      // 21c: sipush 11099
      // 21f: sipush -21336
      // 222: invokestatic com/finalshell/core/Fl4.a (II)Ljava/lang/String;
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
      // 23c: ldc2_w 324199404516516190
      // 23f: astore 34
      // 241: astore 33
      // 243: ldc2_w 324199404516516190
      // 246: aload 33
      // 248: aload 34
      // 24a: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 24d: sipush 6417
      // 250: ldc2_w 2387517913693430303
      // 253: invokestatic com/finalshell/core/Fl4.b (IJ)J
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

   public static boolean o$boolean() {
      boolean var0 = false;
      return new File((String)Registry.lookupField(632211698624051087L).get(null)).exists();
   }

   public static boolean H(boolean param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/dialog/UpdateDialog.y ()[Ljava/lang/String;
      // 03: new java/io/File
      // 06: dup
      // 07: ldc2_w 632211698624051087
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
      // 24: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 2
      // 29: invokevirtual java/io/File.exists ()Z
      // 2c: aload 1
      // 2d: ifnonnull 5f
      // 30: goto 37
      // 33: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: ifne 5e
      // 3a: goto 41
      // 3d: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
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
      // 59: invokestatic com/finalshell/core/Fl4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: pop
      // 5e: iload 0
      // 5f: ireturn
   }

   public static void K() {
   }

   public boolean h() {
      return Registry.lookupField(554597711152469315L).getBoolean(this);
   }

   public void b(boolean var1) {
      Registry.lookupField(554597711152469315L).setBoolean(this, var1);
   }

   public boolean N() {
      return Registry.lookupField(627804769415997620L).getBoolean(this);
   }

   public void F(boolean var1) {
      Registry.lookupField(627804769415997620L).setBoolean(this, var1);
   }

   public boolean O() {
      return Registry.lookupField(354569316750752448L).getBoolean(this);
   }

   public void p(boolean var1) {
      Registry.lookupField(354569316750752448L).setBoolean(this, var1);
   }

   public Y7 B() {
      Object var1 = 264767333402389216L;
      return (Y7)Ref.g(264767333402389216L, var1);
   }

   public void A(Y7 var1) {
      long var3 = 264767333402389216L;
      Ref.s(264767333402389216L, var1, var3);
   }

   @Override
   public void t(long var1) {
      Registry.lookupField(168979346047647150L).setLong(this, var1);
   }

   public String x() {
      Object var1 = 455268764935355489L;
      return (String)Ref.g(455268764935355489L, var1);
   }

   public void M(String var1) {
      long var3 = 455268764935355489L;
      Ref.s(455268764935355489L, var1, var3);
   }

   public long R() {
      return Registry.lookupField(231431924199448741L).getLong(this);
   }

   public void e(long var1) {
      Registry.lookupField(231431924199448741L).setLong(this, var1);
   }

   public long L() {
      return Registry.lookupField(168979346047647150L).getLong(this);
   }

   public void Z(long var1) {
      Registry.lookupField(168979346047647150L).setLong(this, var1);
   }

   public String b() {
      Object var1 = 324199404516516190L;
      return (String)Ref.g(324199404516516190L, var1);
   }

   public void w(String var1) {
      long var3 = 324199404516516190L;
      Ref.s(324199404516516190L, var1, var3);
   }

   public boolean P() {
      return Registry.lookupField(230901963858610268L).getBoolean(this);
   }

   public void n(boolean var1) {
      Registry.lookupField(230901963858610268L).setBoolean(this, var1);
   }

   public boolean A() {
      return Registry.lookupField(350076904658429385L).getBoolean(this);
   }

   public void E(boolean var1) {
      Registry.lookupField(350076904658429385L).setBoolean(this, var1);
   }

   public boolean g() {
      return Registry.lookupField(361925458116439130L).getBoolean(this);
   }

   public void U(boolean var1) {
      Registry.lookupField(361925458116439130L).setBoolean(this, var1);
   }

   public static void O(File var0, File var1) {
      try {
         FileUtils.copyFile(var0, var1);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   public static boolean u(FileChannel var0, FileChannel var1) {
      try {
         var1.transferFrom(var0, 0L, var0.size());
         var0.close();
         var1.close();
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   public static boolean E(File var0) {
      String[] var1 = UpdateDialog.y();
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

   public UpdateDialog t() {
      Object var1 = 599733929125356652L;
      return (UpdateDialog)Ref.g(599733929125356652L, var1);
   }

   public void G(UpdateDialog var1) {
      long var3 = 599733929125356652L;
      Ref.s(599733929125356652L, var1, var3);
   }

   public U52 d() {
      Object var1 = 361045042490530589L;
      return (U52)Ref.g(361045042490530589L, var1);
   }

   public void w(U52 var1) {
      long var3 = 361045042490530589L;
      Ref.s(361045042490530589L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 11115) & 65535;
      if (e[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 107;
               break;
            case 1:
               var10000 = 187;
               break;
            case 2:
               var10000 = 6;
               break;
            case 3:
               var10000 = 154;
               break;
            case 4:
               var10000 = 186;
               break;
            case 5:
               var10000 = 5;
               break;
            case 6:
               var10000 = 206;
               break;
            case 7:
               var10000 = 149;
               break;
            case 8:
               var10000 = 165;
               break;
            case 9:
               var10000 = 170;
               break;
            case 10:
               var10000 = 151;
               break;
            case 11:
               var10000 = 139;
               break;
            case 12:
               var10000 = 76;
               break;
            case 13:
               var10000 = 254;
               break;
            case 14:
               var10000 = 43;
               break;
            case 15:
               var10000 = 231;
               break;
            case 16:
               var10000 = 239;
               break;
            case 17:
               var10000 = 60;
               break;
            case 18:
               var10000 = 220;
               break;
            case 19:
               var10000 = 183;
               break;
            case 20:
               var10000 = 156;
               break;
            case 21:
               var10000 = 141;
               break;
            case 22:
               var10000 = 142;
               break;
            case 23:
               var10000 = 87;
               break;
            case 24:
               var10000 = 248;
               break;
            case 25:
               var10000 = 24;
               break;
            case 26:
               var10000 = 26;
               break;
            case 27:
               var10000 = 86;
               break;
            case 28:
               var10000 = 50;
               break;
            case 29:
               var10000 = 129;
               break;
            case 30:
               var10000 = 202;
               break;
            case 31:
               var10000 = 192;
               break;
            case 32:
               var10000 = 230;
               break;
            case 33:
               var10000 = 62;
               break;
            case 34:
               var10000 = 8;
               break;
            case 35:
               var10000 = 72;
               break;
            case 36:
               var10000 = 12;
               break;
            case 37:
               var10000 = 246;
               break;
            case 38:
               var10000 = 54;
               break;
            case 39:
               var10000 = 75;
               break;
            case 40:
               var10000 = 109;
               break;
            case 41:
               var10000 = 144;
               break;
            case 42:
               var10000 = 225;
               break;
            case 43:
               var10000 = 150;
               break;
            case 44:
               var10000 = 126;
               break;
            case 45:
               var10000 = 82;
               break;
            case 46:
               var10000 = 81;
               break;
            case 47:
               var10000 = 238;
               break;
            case 48:
               var10000 = 242;
               break;
            case 49:
               var10000 = 193;
               break;
            case 50:
               var10000 = 137;
               break;
            case 51:
               var10000 = 124;
               break;
            case 52:
               var10000 = 167;
               break;
            case 53:
               var10000 = 30;
               break;
            case 54:
               var10000 = 226;
               break;
            case 55:
               var10000 = 52;
               break;
            case 56:
               var10000 = 235;
               break;
            case 57:
               var10000 = 74;
               break;
            case 58:
               var10000 = 84;
               break;
            case 59:
               var10000 = 245;
               break;
            case 60:
               var10000 = 175;
               break;
            case 61:
               var10000 = 194;
               break;
            case 62:
               var10000 = 13;
               break;
            case 63:
               var10000 = 121;
               break;
            case 64:
               var10000 = 247;
               break;
            case 65:
               var10000 = 148;
               break;
            case 66:
               var10000 = 143;
               break;
            case 67:
               var10000 = 214;
               break;
            case 68:
               var10000 = 155;
               break;
            case 69:
               var10000 = 160;
               break;
            case 70:
               var10000 = 224;
               break;
            case 71:
               var10000 = 95;
               break;
            case 72:
               var10000 = 16;
               break;
            case 73:
               var10000 = 135;
               break;
            case 74:
               var10000 = 114;
               break;
            case 75:
               var10000 = 211;
               break;
            case 76:
               var10000 = 233;
               break;
            case 77:
               var10000 = 131;
               break;
            case 78:
               var10000 = 232;
               break;
            case 79:
               var10000 = 93;
               break;
            case 80:
               var10000 = 116;
               break;
            case 81:
               var10000 = 15;
               break;
            case 82:
               var10000 = 197;
               break;
            case 83:
               var10000 = 159;
               break;
            case 84:
               var10000 = 227;
               break;
            case 85:
               var10000 = 29;
               break;
            case 86:
               var10000 = 55;
               break;
            case 87:
               var10000 = 205;
               break;
            case 88:
               var10000 = 119;
               break;
            case 89:
               var10000 = 229;
               break;
            case 90:
               var10000 = 96;
               break;
            case 91:
               var10000 = 185;
               break;
            case 92:
               var10000 = 44;
               break;
            case 93:
               var10000 = 125;
               break;
            case 94:
               var10000 = 223;
               break;
            case 95:
               var10000 = 190;
               break;
            case 96:
               var10000 = 41;
               break;
            case 97:
               var10000 = 236;
               break;
            case 98:
               var10000 = 207;
               break;
            case 99:
               var10000 = 64;
               break;
            case 100:
               var10000 = 2;
               break;
            case 101:
               var10000 = 201;
               break;
            case 102:
               var10000 = 189;
               break;
            case 103:
               var10000 = 113;
               break;
            case 104:
               var10000 = 90;
               break;
            case 105:
               var10000 = 228;
               break;
            case 106:
               var10000 = 112;
               break;
            case 107:
               var10000 = 10;
               break;
            case 108:
               var10000 = 83;
               break;
            case 109:
               var10000 = 118;
               break;
            case 110:
               var10000 = 37;
               break;
            case 111:
               var10000 = 0;
               break;
            case 112:
               var10000 = 184;
               break;
            case 113:
               var10000 = 147;
               break;
            case 114:
               var10000 = 216;
               break;
            case 115:
               var10000 = 98;
               break;
            case 116:
               var10000 = 34;
               break;
            case 117:
               var10000 = 33;
               break;
            case 118:
               var10000 = 222;
               break;
            case 119:
               var10000 = 46;
               break;
            case 120:
               var10000 = 39;
               break;
            case 121:
               var10000 = 218;
               break;
            case 122:
               var10000 = 67;
               break;
            case 123:
               var10000 = 57;
               break;
            case 124:
               var10000 = 49;
               break;
            case 125:
               var10000 = 161;
               break;
            case 126:
               var10000 = 251;
               break;
            case 127:
               var10000 = 73;
               break;
            case 128:
               var10000 = 145;
               break;
            case 129:
               var10000 = 212;
               break;
            case 130:
               var10000 = 123;
               break;
            case 131:
               var10000 = 38;
               break;
            case 132:
               var10000 = 166;
               break;
            case 133:
               var10000 = 115;
               break;
            case 134:
               var10000 = 89;
               break;
            case 135:
               var10000 = 219;
               break;
            case 136:
               var10000 = 70;
               break;
            case 137:
               var10000 = 200;
               break;
            case 138:
               var10000 = 180;
               break;
            case 139:
               var10000 = 79;
               break;
            case 140:
               var10000 = 28;
               break;
            case 141:
               var10000 = 19;
               break;
            case 142:
               var10000 = 199;
               break;
            case 143:
               var10000 = 66;
               break;
            case 144:
               var10000 = 130;
               break;
            case 145:
               var10000 = 146;
               break;
            case 146:
               var10000 = 153;
               break;
            case 147:
               var10000 = 249;
               break;
            case 148:
               var10000 = 209;
               break;
            case 149:
               var10000 = 77;
               break;
            case 150:
               var10000 = 22;
               break;
            case 151:
               var10000 = 181;
               break;
            case 152:
               var10000 = 18;
               break;
            case 153:
               var10000 = 100;
               break;
            case 154:
               var10000 = 127;
               break;
            case 155:
               var10000 = 27;
               break;
            case 156:
               var10000 = 106;
               break;
            case 157:
               var10000 = 241;
               break;
            case 158:
               var10000 = 68;
               break;
            case 159:
               var10000 = 213;
               break;
            case 160:
               var10000 = 250;
               break;
            case 161:
               var10000 = 53;
               break;
            case 162:
               var10000 = 196;
               break;
            case 163:
               var10000 = 48;
               break;
            case 164:
               var10000 = 252;
               break;
            case 165:
               var10000 = 253;
               break;
            case 166:
               var10000 = 168;
               break;
            case 167:
               var10000 = 195;
               break;
            case 168:
               var10000 = 208;
               break;
            case 169:
               var10000 = 140;
               break;
            case 170:
               var10000 = 78;
               break;
            case 171:
               var10000 = 240;
               break;
            case 172:
               var10000 = 134;
               break;
            case 173:
               var10000 = 182;
               break;
            case 174:
               var10000 = 88;
               break;
            case 175:
               var10000 = 255;
               break;
            case 176:
               var10000 = 31;
               break;
            case 177:
               var10000 = 244;
               break;
            case 178:
               var10000 = 36;
               break;
            case 179:
               var10000 = 117;
               break;
            case 180:
               var10000 = 158;
               break;
            case 181:
               var10000 = 104;
               break;
            case 182:
               var10000 = 136;
               break;
            case 183:
               var10000 = 163;
               break;
            case 184:
               var10000 = 56;
               break;
            case 185:
               var10000 = 63;
               break;
            case 186:
               var10000 = 169;
               break;
            case 187:
               var10000 = 133;
               break;
            case 188:
               var10000 = 1;
               break;
            case 189:
               var10000 = 14;
               break;
            case 190:
               var10000 = 7;
               break;
            case 191:
               var10000 = 103;
               break;
            case 192:
               var10000 = 164;
               break;
            case 193:
               var10000 = 11;
               break;
            case 194:
               var10000 = 4;
               break;
            case 195:
               var10000 = 105;
               break;
            case 196:
               var10000 = 9;
               break;
            case 197:
               var10000 = 191;
               break;
            case 198:
               var10000 = 20;
               break;
            case 199:
               var10000 = 177;
               break;
            case 200:
               var10000 = 178;
               break;
            case 201:
               var10000 = 138;
               break;
            case 202:
               var10000 = 65;
               break;
            case 203:
               var10000 = 59;
               break;
            case 204:
               var10000 = 99;
               break;
            case 205:
               var10000 = 172;
               break;
            case 206:
               var10000 = 3;
               break;
            case 207:
               var10000 = 35;
               break;
            case 208:
               var10000 = 108;
               break;
            case 209:
               var10000 = 171;
               break;
            case 210:
               var10000 = 25;
               break;
            case 211:
               var10000 = 61;
               break;
            case 212:
               var10000 = 188;
               break;
            case 213:
               var10000 = 40;
               break;
            case 214:
               var10000 = 47;
               break;
            case 215:
               var10000 = 174;
               break;
            case 216:
               var10000 = 51;
               break;
            case 217:
               var10000 = 21;
               break;
            case 218:
               var10000 = 203;
               break;
            case 219:
               var10000 = 120;
               break;
            case 220:
               var10000 = 215;
               break;
            case 221:
               var10000 = 210;
               break;
            case 222:
               var10000 = 221;
               break;
            case 223:
               var10000 = 45;
               break;
            case 224:
               var10000 = 94;
               break;
            case 225:
               var10000 = 198;
               break;
            case 226:
               var10000 = 80;
               break;
            case 227:
               var10000 = 58;
               break;
            case 228:
               var10000 = 110;
               break;
            case 229:
               var10000 = 217;
               break;
            case 230:
               var10000 = 42;
               break;
            case 231:
               var10000 = 157;
               break;
            case 232:
               var10000 = 102;
               break;
            case 233:
               var10000 = 32;
               break;
            case 234:
               var10000 = 69;
               break;
            case 235:
               var10000 = 91;
               break;
            case 236:
               var10000 = 97;
               break;
            case 237:
               var10000 = 176;
               break;
            case 238:
               var10000 = 162;
               break;
            case 239:
               var10000 = 132;
               break;
            case 240:
               var10000 = 17;
               break;
            case 241:
               var10000 = 173;
               break;
            case 242:
               var10000 = 152;
               break;
            case 243:
               var10000 = 85;
               break;
            case 244:
               var10000 = 71;
               break;
            case 245:
               var10000 = 179;
               break;
            case 246:
               var10000 = 243;
               break;
            case 247:
               var10000 = 111;
               break;
            case 248:
               var10000 = 23;
               break;
            case 249:
               var10000 = 128;
               break;
            case 250:
               var10000 = 101;
               break;
            case 251:
               var10000 = 204;
               break;
            case 252:
               var10000 = 122;
               break;
            case 253:
               var10000 = 237;
               break;
            case 254:
               var10000 = 92;
               break;
            default:
               var10000 = 234;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28783;
      if (j[var3] == null) {
         j[var3] = (int)(g[var3] ^ var1);
      }

      return j[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 15118) & 32767;
      if (m[var3] == null) {
         m[var3] = k[var3] ^ var1;
      }

      return m[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[55];
      int var19 = 0;
      String var18 = ">{\u001f\u00078w«\t<ÿp\u0006輷兔籧纬宛磸\u0002单洙*Î\u000bûøx\u0007z©\u001dæ0-k¼\u0099'ÐÝ\u008a=\nÎû)\u0000ªuÒ|ÀÐ\rà×CHX7ôX\\\u0088\u0003\u0019\u0016]\u0016Ñae9VQ\u0095\u0098\u0082-Þ\u0018Iâ4\u0019\u008b2\u008b\u008a47\u0003@\u001ev\u000bhã)S\u008c\nâ/¾Ú\u0000\u0007ßçÇã\u009ev\u00ad\u0015\u0000f!C\u000e¼?øt_ß:y\\þU\u0099\u001571´\u0016\u0017=½²M ö¶îèS øõ\u0002ûMnS\u00002@\u0006仺辤嬧袳腳杯\u000eªÃ\nm»Û(É5\u0007Y^éH\u0012乻辇晪斢实抪4穆卥冒镬穱帚轉袻晄料í\u000e\u008aÀSî×|@\u0000\u0018¥Yó\u0088N\u000eZu\u0014»x\u0001P\u0092:l¸<Ìý\u0006辗冕米纔嬙磿\u0015¤ºµØ\u009cÏm\u0096>\u0092\u0096\u0083PkÛ²5Å±\u008c=\brã¢¦x\u0097¹Ï\u0003姐趕\u009c\u0006Ù8U闆诣\u008a\u0005²\u0018U{ì\u0002浦悰\u0006Ã\u0090\\=\"Ç\u0004砾宐ÎÚ\u0002硟嬩\u0006桙査暜斦姽负Pc\u0091©7Ä\u0086®À+ïc7ï(»a\u009eÖGC=·zå¯yTZýMa\\)fËjó¸\u001e\u0011$ó\u0007D.ü®ÀÚ%\r\u0086aðW:ÿ_Üþ\nB'JU\u009bíYÓÓ»\u000b'\u0094Ý\u0090\u001e¾¥H\b\u0016+ç:.W\u0091º\u0016D\u0086×Å\u0000Î_kÛSõ×,\u001b\u0098&\u001eÕ9cq¿\u0015ÌH5îï\u0003\n.ëÈ\u0004èwÔ¸\u008b\u0004¦ì\u000fç\u0002&S\u0016N\reFå\u0016K\u0085î¾<krù\u0013ÓKlN·\u008c²\u0003g\u008b\u001c\u0007\u0017\u009c÷O.4¬\u0005俠孝姐跭\u0018\u001a\u0013\u0012=W]\u009cô!®\u001a[þù>\"\u0082IA¢àFë¡ý\u0097&\u0014\u0091Åm\u00adWÃµÊ\u0086g^T^Ó0\u0098h.ºÈ\u0002匱涹8W\u0082Ëy^p\u009fá±\u0083\u0093oË·èlf\u00986E\u0099>\u0003ù\u009f\u008a º\u009fSÍ\u001fzm\rÚH\u0015E-Ý\"iÞrÎ´¯ÉG\tÖÞd\u0019\u000f\u001fFÁ\u0097-\bÓ^Èû'ñY¬Ê\u0088\u001c\u001c\u0092\b\u0097\n·I¶\u009dõ?U}\u009e·\u0002曁斠\u0017\u009c¼²\u0018|×q\u0095½òæ\u008f^ê\u001a\u0098\u0005Ôµ\u001eÿø\u0000\"gÈf£pxê\u0097ÙÔå\u0018\u0005Q|åk\u0003\u0010Ý\u001dõø\u0088\u008b\u0081¦\në´f@Ç\u0087\u0007ß°Ç\t\u009e+\u00ad\u0002°÷\u00058¸¼-V\u0005乲輜妎资Ó\u000e\u00115}³U\u0000õ²\u008eh.³\u0007õ\u001b\u0092_\rþ[©4\u0087¶ÎXd\u0099m.èÈ\f\u0092DYÍ#ù¡\u000eÿ\u0007梡月暃旘夞跐\"\u0003 Lä";
      int var20 = ">{\u001f\u00078w«\t<ÿp\u0006輷兔籧纬宛磸\u0002单洙*Î\u000bûøx\u0007z©\u001dæ0-k¼\u0099'ÐÝ\u008a=\nÎû)\u0000ªuÒ|ÀÐ\rà×CHX7ôX\\\u0088\u0003\u0019\u0016]\u0016Ñae9VQ\u0095\u0098\u0082-Þ\u0018Iâ4\u0019\u008b2\u008b\u008a47\u0003@\u001ev\u000bhã)S\u008c\nâ/¾Ú\u0000\u0007ßçÇã\u009ev\u00ad\u0015\u0000f!C\u000e¼?øt_ß:y\\þU\u0099\u001571´\u0016\u0017=½²M ö¶îèS øõ\u0002ûMnS\u00002@\u0006仺辤嬧袳腳杯\u000eªÃ\nm»Û(É5\u0007Y^éH\u0012乻辇晪斢实抪4穆卥冒镬穱帚轉袻晄料í\u000e\u008aÀSî×|@\u0000\u0018¥Yó\u0088N\u000eZu\u0014»x\u0001P\u0092:l¸<Ìý\u0006辗冕米纔嬙磿\u0015¤ºµØ\u009cÏm\u0096>\u0092\u0096\u0083PkÛ²5Å±\u008c=\brã¢¦x\u0097¹Ï\u0003姐趕\u009c\u0006Ù8U闆诣\u008a\u0005²\u0018U{ì\u0002浦悰\u0006Ã\u0090\\=\"Ç\u0004砾宐ÎÚ\u0002硟嬩\u0006桙査暜斦姽负Pc\u0091©7Ä\u0086®À+ïc7ï(»a\u009eÖGC=·zå¯yTZýMa\\)fËjó¸\u001e\u0011$ó\u0007D.ü®ÀÚ%\r\u0086aðW:ÿ_Üþ\nB'JU\u009bíYÓÓ»\u000b'\u0094Ý\u0090\u001e¾¥H\b\u0016+ç:.W\u0091º\u0016D\u0086×Å\u0000Î_kÛSõ×,\u001b\u0098&\u001eÕ9cq¿\u0015ÌH5îï\u0003\n.ëÈ\u0004èwÔ¸\u008b\u0004¦ì\u000fç\u0002&S\u0016N\reFå\u0016K\u0085î¾<krù\u0013ÓKlN·\u008c²\u0003g\u008b\u001c\u0007\u0017\u009c÷O.4¬\u0005俠孝姐跭\u0018\u001a\u0013\u0012=W]\u009cô!®\u001a[þù>\"\u0082IA¢àFë¡ý\u0097&\u0014\u0091Åm\u00adWÃµÊ\u0086g^T^Ó0\u0098h.ºÈ\u0002匱涹8W\u0082Ëy^p\u009fá±\u0083\u0093oË·èlf\u00986E\u0099>\u0003ù\u009f\u008a º\u009fSÍ\u001fzm\rÚH\u0015E-Ý\"iÞrÎ´¯ÉG\tÖÞd\u0019\u000f\u001fFÁ\u0097-\bÓ^Èû'ñY¬Ê\u0088\u001c\u001c\u0092\b\u0097\n·I¶\u009dõ?U}\u009e·\u0002曁斠\u0017\u009c¼²\u0018|×q\u0095½òæ\u008f^ê\u001a\u0098\u0005Ôµ\u001eÿø\u0000\"gÈf£pxê\u0097ÙÔå\u0018\u0005Q|åk\u0003\u0010Ý\u001dõø\u0088\u008b\u0081¦\në´f@Ç\u0087\u0007ß°Ç\t\u009e+\u00ad\u0002°÷\u00058¸¼-V\u0005乲輜妎资Ó\u000e\u00115}³U\u0000õ²\u008eh.³\u0007õ\u001b\u0092_\rþ[©4\u0087¶ÎXd\u0099m.èÈ\f\u0092DYÍ#ù¡\u000eÿ\u0007梡月暃旘夞跐\"\u0003 Lä"
         .length();
      char var17 = 3;
      int var45 = -1;

      label145:
      while (true) {
         byte var10000 = 1;
         String var10001 = var18.substring(++var45, var45 + var17);
         byte var10002 = -1;

         while (true) {
      Object[] var61;
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
                        var103 = 15;
                        break;
                     case 1:
                        var103 = 27;
                        break;
                     case 2:
                        var103 = 91;
                        break;
                     case 3:
                        var103 = 114;
                        break;
                     case 4:
                        var103 = 127;
                        break;
                     case 5:
                        var103 = 39;
                        break;
                     default:
                        var103 = 24;
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
                     a = var21;
                     e = new String[55];
                     long var8 = 1798261322252192186L;
                     long[] var14 = new long[3];
                     int var11 = 0;
                     String var12 = "Ï\u0018\u001dá#t\u009f,@\u00148b\u0094É!\u0082\nS¸\u009bp±f\u0019";
                     int var13 = "Ï\u0018\u001dá#t\u009f,@\u00148b\u0094É!\u0082\nS¸\u009bp±f\u0019".length();
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

                     g = var14;
                     j = new Integer[3];
                     long var0 = 4011907690471214868L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "\u0016\u008f\u0002-N¥ìÿbë\u008arïGÝÿ";
                     int var5 = "\u0016\u008f\u0002-N¥ìÿbë\u008arïGÝÿ".length();
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

                     k = var6;
                     m = new Long[2];
                     Registry.lookupField(632211698624051087L).set(null, a(11107, 18128));
                     Registry.lookupField(215163092700559090L).set(null, a(11131, -5867));
                     Registry.lookupField(381041478094158656L).set(null, a(11124, 16559));
                     Registry.lookupField(495201091602495346L).set(null, a(11085, -29746));
                     Registry.lookupField(154178284205051149L).setInt(null, a(7913, 2790922011958570628L));
                     Registry.packArgs(a(11127, 22708));
                     long var24 = 517287540690064504L;
                     Registry.lookupField(610947816351067913L).set(null, Ref.h2(517287540690064504L, var24));
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
                        var23 = a(11076, -19911);
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
                           var23 = a(11115, 18746);
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
                              var23 = a(11080, 397);
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
                        Registry.lookupField(516121382692238713L)
                           .set(null, (String)Registry.lookupField(610947816351067913L).get(null) + a(11072, 27734) + var23 + a(11133, 27027));
                        Registry.lookupField(488797196485545516L).set(null, a(11117, 16358));
                        Registry.lookupField(636503015406168114L).set(null, a(11086, -7428));
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
                           Registry.lookupField(516121382692238713L)
                              .set(null, (String)Registry.lookupField(610947816351067913L).get(null) + a(11129, 9171) + var23 + a(11101, 23812));
                           Registry.lookupField(488797196485545516L).set(null, a(11125, 26526));
                           Registry.lookupField(636503015406168114L).set(null, a(11110, -21314));
                        } else {
                           Registry.emptyArgs();
                           long var36 = 561847341732101275L;
                           Object var95 = Ref.h2(561847341732101275L, var36);

                           try {
                              var96 = (Boolean)var95;
                           } catch (InvocationTargetException var38) {
                              throw var38.getTargetException();
                           }

                           if (var96) {
                              Registry.lookupField(516121382692238713L)
                                 .set(null, (String)Registry.lookupField(610947816351067913L).get(null) + a(11105, 13388) + var23 + a(11101, 23812));
                              Registry.lookupField(488797196485545516L).set(null, a(11104, 26263));
                              Registry.lookupField(636503015406168114L).set(null, a(11098, 1593));
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

                  var18 = "0\u0012òw+\u0005¼7FL\\";
                  var20 = "0\u0012òw+\u0005¼7FL\\".length();
                  var17 = 5;
                  var45 = -1;
            }

            var10000 = 124;
            var10001 = var18.substring(++var45, var45 + var17);
            var10002 = 0;
         }
      }
   }
}





