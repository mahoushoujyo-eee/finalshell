package com.finalshell.ui.dialog;

import com.finalshell.core.DB3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.L62;
import com.finalshell.task.Up4;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.awt.Font;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import net.miginfocom.swing.MigLayout;

public class DownloadProgressDialog extends JDialog {
   public Window N;
   public FileBrowserAddressBar r;
   public String c;
   public JTextArea Z;
   public JScrollPane B;
   public String V;
   public final int O;
   public DB3 k;
   public long F;
   public long I;
   public static String[] a;
   public static String[] b;
   public static long[] d;
   public static Integer[] e;

   public DownloadProgressDialog(Window var1, FileBrowserAddressBar var2, String var3, String var4) {
   super(var1);
   long var10;
      short var10000 = -27698;
      short var10001 = 12137;
      this.O = a(31200, 3408528587104196419L);
      long var8 = 207607350854790523L;
      Object var7 = null;
      Ref.s(207607350854790523L, var7, var8);
      var10 = 626577552749177783L;
      Ref.s(626577552749177783L, var1, var10);
      long var12 = 289989163719125330L;
      Ref.s(289989163719125330L, var2, var12);
      long var14 = 535292418027248668L;
      Ref.s(535292418027248668L, var3, var14);
      long var16 = 543246570144301620L;
      Ref.s(543246570144301620L, var4, var16);
      String var5 = a((int)this, (int)this);
      this.setTitle(var5);
      JPanel var6 = (JPanel)this.getContentPane();
      var6.setOpaque(false);
      var6.setLayout(new MigLayout(a(-27699, 9690), a(-27705, 32099), a(-27707, -31796)));
      JTextArea var10006 = new JTextArea();
      long var18 = 494102270673182678L;
      JTextArea var17 = var10006;
      Ref.s(494102270673182678L, var17, var18);
      Object var19 = 494102270673182678L;
      ((JTextArea)Ref.g(494102270673182678L, var19)).setOpaque(false);
      Object var21 = 494102270673182678L;
      ((JTextArea)Ref.g(494102270673182678L, var21)).setEditable(false);
      Object var23 = 494102270673182678L;
      ((JTextArea)Ref.g(494102270673182678L, var23)).setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      Object var25 = 494102270673182678L;
      Registry.packArgs(Ref.g(494102270673182678L, var25));
      long var27 = 322267315291882359L;
      Ref.h2(322267315291882359L, var27);
      JScrollPane var10013;
      Object var29 = 494102270673182678L;
      // [VF-super] super((JTextArea)Ref.g(494102270673182678L, var29));
      long var32 = 437909406483393958L;
      JScrollPane var31 = var10013;
      Ref.s(437909406483393958L, var31, var32);
      Object var33 = 437909406483393958L;
      ((JScrollPane)Ref.g(437909406483393958L, var33)).setAutoscrolls(true);
      Object var35 = 437909406483393958L;
      this.add((JScrollPane)Ref.g(437909406483393958L, var35), a(-27706, -6260));
      this.setSize(a(6389, 3770974039905465943L), a(24506, 4506230193725845786L));
      this.setLocationRelativeTo(var1);
      this.setVisible(true);
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10016 = Registry.packArgs(new L62(this));
      long var38 = 434592463220957006L;
      Object[] var37 = var10016;
      Ref.h(434592463220957006L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }
   }

   public void t() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Address.i ()Z
      // 003: aload 0
      // 004: ldc2_w 289989163719125330
      // 007: astore 15
      // 009: ldc2_w 289989163719125330
      // 00c: aload 15
      // 00e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 011: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 014: ldc2_w 584980468782481561
      // 017: astore 18
      // 019: astore 17
      // 01b: ldc2_w 584980468782481561
      // 01e: aload 17
      // 020: aload 18
      // 022: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 025: checkcast com/finalshell/connection/Connection12
      // 028: goto 02f
      // 02b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: astore 2
      // 030: istore 1
      // 031: aload 2
      // 032: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 035: ldc2_w 135220879492188512
      // 038: astore 20
      // 03a: astore 19
      // 03c: ldc2_w 135220879492188512
      // 03f: aload 19
      // 041: aload 20
      // 043: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 046: pop
      // 047: goto 04e
      // 04a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: aload 0
      // 04f: aload 2
      // 050: aload 0
      // 051: ldc2_w 535292418027248668
      // 054: astore 21
      // 056: ldc2_w 535292418027248668
      // 059: aload 21
      // 05b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 061: ldc2_w 529833862401435412
      // 064: astore 24
      // 066: astore 23
      // 068: ldc2_w 529833862401435412
      // 06b: aload 23
      // 06d: aload 24
      // 06f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 072: goto 079
      // 075: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 078: athrow
      // 079: ldc2_w 207607350854790523
      // 07c: astore 26
      // 07e: astore 25
      // 080: ldc2_w 207607350854790523
      // 083: aload 25
      // 085: aload 26
      // 087: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 08a: new java/io/BufferedReader
      // 08d: dup
      // 08e: new java/io/InputStreamReader
      // 091: dup
      // 092: aload 0
      // 093: ldc2_w 207607350854790523
      // 096: astore 27
      // 098: ldc2_w 207607350854790523
      // 09b: aload 27
      // 09d: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0a0: checkcast com/finalshell/core/DB3
      // 0a3: invokevirtual com/finalshell/core/DB3.s ()Ljava/io/InputStream;
      // 0a6: sipush -27709
      // 0a9: sipush 3842
      // 0ac: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (II)Ljava/lang/String;
      // 0af: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0b2: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0b5: astore 3
      // 0b6: aload 0
      // 0b7: ldc2_w 207607350854790523
      // 0ba: astore 29
      // 0bc: ldc2_w 207607350854790523
      // 0bf: aload 29
      // 0c1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0c4: checkcast com/finalshell/core/DB3
      // 0c7: invokevirtual com/finalshell/core/DB3.I ()V
      // 0ca: aload 0
      // 0cb: invokestatic java/lang/System.currentTimeMillis ()J
      // 0ce: dup2_x1
      // 0cf: pop2
      // 0d0: ldc2_w 525973064303548535
      // 0d3: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0d6: swap
      // 0d7: dup2_x2
      // 0d8: pop2
      // 0d9: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 0dc: ldc2_w 388376917454860932
      // 0df: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e2: aconst_null
      // 0e3: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e6: new com/finalshell/task/OL3
      // 0e9: dup
      // 0ea: aload 0
      // 0eb: invokespecial com/finalshell/task/OL3.<init> (Lcom/finalshell/ui/dialog/DownloadDialog;)V
      // 0ee: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f1: ldc2_w 434592463220957006
      // 0f4: astore 32
      // 0f6: astore 31
      // 0f8: ldc2_w 434592463220957006
      // 0fb: aload 31
      // 0fd: aload 32
      // 0ff: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 102: pop
      // 103: goto 10a
      // 106: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 109: athrow
      // 10a: bipush 0
      // 10b: istore 5
      // 10d: aload 3
      // 10e: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 111: dup
      // 112: astore 4
      // 114: ifnull 172
      // 117: iinc 5 1
      // 11a: aload 0
      // 11b: new java/lang/StringBuilder
      // 11e: dup
      // 11f: invokespecial java/lang/StringBuilder.<init> ()V
      // 122: sipush -27711
      // 125: sipush 18657
      // 128: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (II)Ljava/lang/String;
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: iload 5
      // 130: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 133: sipush -27708
      // 136: sipush -22802
      // 139: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (II)Ljava/lang/String;
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13f: aload 4
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 147: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 14a: ldc2_w 228243458517053156
      // 14d: astore 34
      // 14f: astore 33
      // 151: ldc2_w 228243458517053156
      // 154: aload 33
      // 156: aload 34
      // 158: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15b: pop
      // 15c: goto 163
      // 15f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 162: athrow
      // 163: iload 1
      // 164: ifeq 190
      // 167: iload 1
      // 168: ifne 10d
      // 16b: goto 172
      // 16e: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: aload 0
      // 173: invokestatic java/lang/System.currentTimeMillis ()J
      // 176: aload 0
      // 177: ldc2_w 525973064303548535
      // 17a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 17d: swap
      // 17e: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 181: lsub
      // 182: dup2_x1
      // 183: pop2
      // 184: ldc2_w 552752555331892304
      // 187: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 18a: swap
      // 18b: dup2_x2
      // 18c: pop2
      // 18d: invokevirtual java/lang/reflect/Field.setLong (Ljava/lang/Object;J)V
      // 190: aload 2
      // 191: aload 0
      // 192: ldc2_w 543246570144301620
      // 195: astore 35
      // 197: ldc2_w 543246570144301620
      // 19a: aload 35
      // 19c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 19f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a2: ldc2_w 303344491018408266
      // 1a5: astore 38
      // 1a7: astore 37
      // 1a9: ldc2_w 303344491018408266
      // 1ac: aload 37
      // 1ae: aload 38
      // 1b0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b3: checkcast com/finalshell/ui/model/Ck4
      // 1b6: goto 1bd
      // 1b9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1bc: athrow
      // 1bd: astore 6
      // 1bf: aload 0
      // 1c0: new java/lang/StringBuilder
      // 1c3: dup
      // 1c4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c7: sipush -27712
      // 1ca: sipush -28022
      // 1cd: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (II)Ljava/lang/String;
      // 1d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d3: aload 6
      // 1d5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d8: ldc2_w 556117124296734693
      // 1db: astore 40
      // 1dd: astore 39
      // 1df: ldc2_w 556117124296734693
      // 1e2: aload 39
      // 1e4: aload 40
      // 1e6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e9: checkcast java/lang/Long
      // 1ec: invokevirtual java/lang/Long.longValue ()J
      // 1ef: goto 1f6
      // 1f2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f5: athrow
      // 1f6: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 1f9: ldc2_w 408529162510360196
      // 1fc: astore 41
      // 1fe: ldc2_w 408529162510360196
      // 201: aload 41
      // 203: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 206: checkcast java/lang/String
      // 209: goto 210
      // 20c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20f: athrow
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: sipush -27710
      // 216: sipush -3784
      // 219: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (II)Ljava/lang/String;
      // 21c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21f: aload 0
      // 220: ldc2_w 552752555331892304
      // 223: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 226: swap
      // 227: invokevirtual java/lang/reflect/Field.getLong (Ljava/lang/Object;)J
      // 22a: l2f
      // 22b: ldc_w 1000.0
      // 22e: fdiv
      // 22f: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 232: sipush -27700
      // 235: sipush 12069
      // 238: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (II)Ljava/lang/String;
      // 23b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 241: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 244: ldc2_w 228243458517053156
      // 247: astore 44
      // 249: astore 43
      // 24b: ldc2_w 228243458517053156
      // 24e: aload 43
      // 250: aload 44
      // 252: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 255: pop
      // 256: goto 25d
      // 259: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25c: athrow
      // 25d: aload 3
      // 25e: invokevirtual java/io/BufferedReader.close ()V
      // 261: bipush 0
      // 262: istore 7
      // 264: aload 0
      // 265: ldc2_w 207607350854790523
      // 268: astore 45
      // 26a: ldc2_w 207607350854790523
      // 26d: aload 45
      // 26f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 272: checkcast com/finalshell/core/DB3
      // 275: iload 1
      // 276: ifeq 4c0
      // 279: invokevirtual com/finalshell/core/DB3.B ()Z
      // 27c: ifeq 4af
      // 27f: goto 286
      // 282: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: aload 0
      // 287: ldc2_w 207607350854790523
      // 28a: astore 47
      // 28c: ldc2_w 207607350854790523
      // 28f: aload 47
      // 291: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 294: checkcast com/finalshell/core/DB3
      // 297: invokevirtual com/finalshell/core/DB3.o ()I
      // 29a: istore 7
      // 29c: aload 0
      // 29d: ldc2_w 543246570144301620
      // 2a0: astore 49
      // 2a2: ldc2_w 543246570144301620
      // 2a5: aload 49
      // 2a7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2aa: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2ad: ldc2_w 405430188584561323
      // 2b0: astore 51
      // 2b2: ldc2_w 405430188584561323
      // 2b5: aload 51
      // 2b7: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2ba: checkcast java/lang/String
      // 2bd: goto 2c4
      // 2c0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c3: athrow
      // 2c4: astore 8
      // 2c6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2c9: ldc2_w 270389152141252877
      // 2cc: astore 53
      // 2ce: ldc2_w 270389152141252877
      // 2d1: aload 53
      // 2d3: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d6: goto 2dd
      // 2d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dc: athrow
      // 2dd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2e0: ldc2_w 306266403902896148
      // 2e3: astore 56
      // 2e5: astore 55
      // 2e7: ldc2_w 306266403902896148
      // 2ea: aload 55
      // 2ec: aload 56
      // 2ee: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2f1: goto 2f8
      // 2f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2f7: athrow
      // 2f8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2fb: ldc2_w 248904686894997647
      // 2fe: astore 58
      // 300: astore 57
      // 302: ldc2_w 248904686894997647
      // 305: aload 57
      // 307: aload 58
      // 309: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 30c: checkcast java/lang/String
      // 30f: goto 316
      // 312: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 315: athrow
      // 316: astore 9
      // 318: aload 0
      // 319: ldc2_w 543246570144301620
      // 31c: astore 59
      // 31e: ldc2_w 543246570144301620
      // 321: aload 59
      // 323: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 326: checkcast java/lang/String
      // 329: astore 10
      // 32b: aload 10
      // 32d: aload 8
      // 32f: invokevirtual java/lang/String.length ()I
      // 332: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 335: astore 11
      // 337: getstatic java/io/File.separator Ljava/lang/String;
      // 33a: iload 1
      // 33b: ifeq 375
      // 33e: ldc_w "\\"
      // 341: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 344: ifeq 361
      // 347: goto 34e
      // 34a: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34d: athrow
      // 34e: aload 11
      // 350: ldc_w "/"
      // 353: sipush -27697
      // 356: sipush -30112
      // 359: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (II)Ljava/lang/String;
      // 35c: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 35f: astore 11
      // 361: new java/lang/StringBuilder
      // 364: dup
      // 365: invokespecial java/lang/StringBuilder.<init> ()V
      // 368: aload 9
      // 36a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36d: aload 11
      // 36f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 372: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 375: astore 12
      // 377: new com/finalshell/core/YI
      // 37a: dup
      // 37b: aload 2
      // 37c: aload 0
      // 37d: ldc2_w 289989163719125330
      // 380: astore 61
      // 382: ldc2_w 289989163719125330
      // 385: aload 61
      // 387: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 38a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 38d: ldc2_w 157614116591371207
      // 390: astore 64
      // 392: astore 63
      // 394: ldc2_w 157614116591371207
      // 397: aload 63
      // 399: aload 64
      // 39b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 39e: checkcast com/finalshell/core/Lv4_2
      // 3a1: goto 3a8
      // 3a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a7: athrow
      // 3a8: aload 8
      // 3aa: aload 9
      // 3ac: aload 0
      // 3ad: ldc2_w 543246570144301620
      // 3b0: astore 65
      // 3b2: ldc2_w 543246570144301620
      // 3b5: aload 65
      // 3b7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3ba: checkcast java/lang/String
      // 3bd: aload 12
      // 3bf: bipush 1
      // 3c0: invokespecial com/finalshell/core/YI.<init> (Lcom/finalshell/connection/Connection12;Lcom/finalshell/core/Lv4_2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
      // 3c3: astore 13
      // 3c5: aload 13
      // 3c7: aload 6
      // 3c9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3cc: ldc2_w 556117124296734693
      // 3cf: astore 68
      // 3d1: astore 67
      // 3d3: ldc2_w 556117124296734693
      // 3d6: aload 67
      // 3d8: aload 68
      // 3da: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3dd: checkcast java/lang/Long
      // 3e0: invokevirtual java/lang/Long.longValue ()J
      // 3e3: goto 3ea
      // 3e6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3e9: athrow
      // 3ea: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 3ed: ldc2_w 119264357941005086
      // 3f0: astore 70
      // 3f2: astore 69
      // 3f4: ldc2_w 119264357941005086
      // 3f7: aload 69
      // 3f9: aload 70
      // 3fb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3fe: pop
      // 3ff: goto 406
      // 402: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 405: athrow
      // 406: ldc2_w 388376917454860932
      // 409: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 40c: aconst_null
      // 40d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 410: new com/finalshell/task/Gq2
      // 413: dup
      // 414: aload 0
      // 415: invokespecial com/finalshell/task/Gq2.<init> (Lcom/finalshell/ui/dialog/DownloadDialog;)V
      // 418: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 41b: ldc2_w 434592463220957006
      // 41e: astore 72
      // 420: astore 71
      // 422: ldc2_w 434592463220957006
      // 425: aload 71
      // 427: aload 72
      // 429: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 42c: pop
      // 42d: goto 434
      // 430: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 433: athrow
      // 434: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 437: ldc2_w 270389152141252877
      // 43a: astore 73
      // 43c: ldc2_w 270389152141252877
      // 43f: aload 73
      // 441: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 444: goto 44b
      // 447: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44a: athrow
      // 44b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 44e: ldc2_w 377280722715900564
      // 451: astore 76
      // 453: astore 75
      // 455: ldc2_w 377280722715900564
      // 458: aload 75
      // 45a: aload 76
      // 45c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 45f: goto 466
      // 462: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 465: athrow
      // 466: aload 13
      // 468: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 46b: ldc2_w 118191003152152827
      // 46e: astore 78
      // 470: astore 77
      // 472: ldc2_w 118191003152152827
      // 475: aload 77
      // 477: aload 78
      // 479: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 47c: pop
      // 47d: goto 484
      // 480: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 483: athrow
      // 484: aload 13
      // 486: new com/finalshell/core/Mn2
      // 489: dup
      // 48a: aload 0
      // 48b: aload 2
      // 48c: aload 12
      // 48e: aload 9
      // 490: invokespecial com/finalshell/core/Mn2.<init> (Lcom/finalshell/ui/dialog/DownloadDialog;Lcom/finalshell/connection/Connection12;Ljava/lang/String;Ljava/lang/String;)V
      // 493: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 496: ldc2_w 541437196102236947
      // 499: astore 80
      // 49b: astore 79
      // 49d: ldc2_w 541437196102236947
      // 4a0: aload 79
      // 4a2: aload 80
      // 4a4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4a7: pop
      // 4a8: goto 4af
      // 4ab: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ae: athrow
      // 4af: aload 0
      // 4b0: ldc2_w 207607350854790523
      // 4b3: astore 81
      // 4b5: ldc2_w 207607350854790523
      // 4b8: aload 81
      // 4ba: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4bd: checkcast com/finalshell/core/DB3
      // 4c0: iload 1
      // 4c1: ifeq 4e6
      // 4c4: ifnull 5ad
      // 4c7: goto 4ce
      // 4ca: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4cd: athrow
      // 4ce: aload 0
      // 4cf: ldc2_w 207607350854790523
      // 4d2: astore 83
      // 4d4: ldc2_w 207607350854790523
      // 4d7: aload 83
      // 4d9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4dc: checkcast com/finalshell/core/DB3
      // 4df: goto 4e6
      // 4e2: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e5: athrow
      // 4e6: invokevirtual com/finalshell/core/DB3.r ()V
      // 4e9: goto 5ad
      // 4ec: astore 3
      // 4ed: aload 0
      // 4ee: aload 3
      // 4ef: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 4f2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4f5: ldc2_w 228243458517053156
      // 4f8: astore 86
      // 4fa: astore 85
      // 4fc: ldc2_w 228243458517053156
      // 4ff: aload 85
      // 501: aload 86
      // 503: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 506: pop
      // 507: goto 50e
      // 50a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 50d: athrow
      // 50e: aload 0
      // 50f: sipush -27704
      // 512: sipush 3879
      // 515: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (II)Ljava/lang/String;
      // 518: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 51b: ldc2_w 228243458517053156
      // 51e: astore 88
      // 520: astore 87
      // 522: ldc2_w 228243458517053156
      // 525: aload 87
      // 527: aload 88
      // 529: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 52c: pop
      // 52d: goto 534
      // 530: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 533: athrow
      // 534: aload 3
      // 535: invokevirtual java/lang/Exception.printStackTrace ()V
      // 538: aload 0
      // 539: ldc2_w 207607350854790523
      // 53c: astore 89
      // 53e: ldc2_w 207607350854790523
      // 541: aload 89
      // 543: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 546: checkcast com/finalshell/core/DB3
      // 549: iload 1
      // 54a: ifeq 568
      // 54d: ifnull 5ad
      // 550: aload 0
      // 551: ldc2_w 207607350854790523
      // 554: astore 91
      // 556: ldc2_w 207607350854790523
      // 559: aload 91
      // 55b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 55e: checkcast com/finalshell/core/DB3
      // 561: goto 568
      // 564: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 567: athrow
      // 568: invokevirtual com/finalshell/core/DB3.r ()V
      // 56b: goto 5ad
      // 56e: astore 14
      // 570: aload 0
      // 571: ldc2_w 207607350854790523
      // 574: astore 93
      // 576: ldc2_w 207607350854790523
      // 579: aload 93
      // 57b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 57e: checkcast com/finalshell/core/DB3
      // 581: iload 1
      // 582: ifeq 5a7
      // 585: ifnull 5aa
      // 588: goto 58f
      // 58b: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58e: athrow
      // 58f: aload 0
      // 590: ldc2_w 207607350854790523
      // 593: astore 95
      // 595: ldc2_w 207607350854790523
      // 598: aload 95
      // 59a: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 59d: checkcast com/finalshell/core/DB3
      // 5a0: goto 5a7
      // 5a3: invokestatic com/finalshell/ui/dialog/DownloadDialog.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a6: athrow
      // 5a7: invokevirtual com/finalshell/core/DB3.r ()V
      // 5aa: aload 14
      // 5ac: athrow
      // 5ad: return
   }

   public void A(String var1) {
      SwingUtilities.invokeLater(new Up4(this, var1));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void x(JTextArea var1) {
      BadLocationException var10;
      int var10000 = (FileBrowserAddressBar.i()) ? 1 : 0;
      int var3 = var1.getLineCount() - a(22626, 1160360568477464259L);
      boolean var2 = (var10000) != 0;

      label30: {
         label29: {
            try {
               var10000 = var3;
               if (!var2) {
                  break label29;
               }

               if (var3 <= 0) {
                  return;
               }
            } catch (BadLocationException var7) {
               throw a(var7);
            }

            try {
               var10000 = var1.getLineEndOffset(var3 - 1);
            } catch (BadLocationException var6) {
               var10 = var6;
               boolean var10001 = false;
               break label30;
            }
         }

         try {
            int var8 = var10000;
            var1.replaceRange("", 0, var8);
            return;
         } catch (BadLocationException var5) {
            var10 = var5;
            boolean var11 = false;
         }
      }

      BadLocationException var4 = var10;
      var4.printStackTrace();
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -27708) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 233;
               break;
            case 1:
               var10000 = 156;
               break;
            case 2:
               var10000 = 173;
               break;
            case 3:
               var10000 = 0;
               break;
            case 4:
               var10000 = 182;
               break;
            case 5:
               var10000 = 27;
               break;
            case 6:
               var10000 = 234;
               break;
            case 7:
               var10000 = 86;
               break;
            case 8:
               var10000 = 158;
               break;
            case 9:
               var10000 = 40;
               break;
            case 10:
               var10000 = 65;
               break;
            case 11:
               var10000 = 228;
               break;
            case 12:
               var10000 = 111;
               break;
            case 13:
               var10000 = 166;
               break;
            case 14:
               var10000 = 205;
               break;
            case 15:
               var10000 = 131;
               break;
            case 16:
               var10000 = 188;
               break;
            case 17:
               var10000 = 227;
               break;
            case 18:
               var10000 = 135;
               break;
            case 19:
               var10000 = 96;
               break;
            case 20:
               var10000 = 252;
               break;
            case 21:
               var10000 = 6;
               break;
            case 22:
               var10000 = 219;
               break;
            case 23:
               var10000 = 221;
               break;
            case 24:
               var10000 = 19;
               break;
            case 25:
               var10000 = 74;
               break;
            case 26:
               var10000 = 45;
               break;
            case 27:
               var10000 = 142;
               break;
            case 28:
               var10000 = 149;
               break;
            case 29:
               var10000 = 137;
               break;
            case 30:
               var10000 = 143;
               break;
            case 31:
               var10000 = 108;
               break;
            case 32:
               var10000 = 215;
               break;
            case 33:
               var10000 = 87;
               break;
            case 34:
               var10000 = 162;
               break;
            case 35:
               var10000 = 190;
               break;
            case 36:
               var10000 = 88;
               break;
            case 37:
               var10000 = 62;
               break;
            case 38:
               var10000 = 69;
               break;
            case 39:
               var10000 = 117;
               break;
            case 40:
               var10000 = 151;
               break;
            case 41:
               var10000 = 73;
               break;
            case 42:
               var10000 = 5;
               break;
            case 43:
               var10000 = 59;
               break;
            case 44:
               var10000 = 22;
               break;
            case 45:
               var10000 = 159;
               break;
            case 46:
               var10000 = 85;
               break;
            case 47:
               var10000 = 8;
               break;
            case 48:
               var10000 = 175;
               break;
            case 49:
               var10000 = 23;
               break;
            case 50:
               var10000 = 192;
               break;
            case 51:
               var10000 = 47;
               break;
            case 52:
               var10000 = 28;
               break;
            case 53:
               var10000 = 64;
               break;
            case 54:
               var10000 = 242;
               break;
            case 55:
               var10000 = 54;
               break;
            case 56:
               var10000 = 161;
               break;
            case 57:
               var10000 = 110;
               break;
            case 58:
               var10000 = 112;
               break;
            case 59:
               var10000 = 241;
               break;
            case 60:
               var10000 = 70;
               break;
            case 61:
               var10000 = 194;
               break;
            case 62:
               var10000 = 199;
               break;
            case 63:
               var10000 = 253;
               break;
            case 64:
               var10000 = 169;
               break;
            case 65:
               var10000 = 172;
               break;
            case 66:
               var10000 = 103;
               break;
            case 67:
               var10000 = 24;
               break;
            case 68:
               var10000 = 15;
               break;
            case 69:
               var10000 = 207;
               break;
            case 70:
               var10000 = 213;
               break;
            case 71:
               var10000 = 18;
               break;
            case 72:
               var10000 = 68;
               break;
            case 73:
               var10000 = 186;
               break;
            case 74:
               var10000 = 187;
               break;
            case 75:
               var10000 = 176;
               break;
            case 76:
               var10000 = 107;
               break;
            case 77:
               var10000 = 3;
               break;
            case 78:
               var10000 = 78;
               break;
            case 79:
               var10000 = 121;
               break;
            case 80:
               var10000 = 148;
               break;
            case 81:
               var10000 = 180;
               break;
            case 82:
               var10000 = 232;
               break;
            case 83:
               var10000 = 150;
               break;
            case 84:
               var10000 = 222;
               break;
            case 85:
               var10000 = 203;
               break;
            case 86:
               var10000 = 76;
               break;
            case 87:
               var10000 = 250;
               break;
            case 88:
               var10000 = 123;
               break;
            case 89:
               var10000 = 1;
               break;
            case 90:
               var10000 = 240;
               break;
            case 91:
               var10000 = 100;
               break;
            case 92:
               var10000 = 238;
               break;
            case 93:
               var10000 = 160;
               break;
            case 94:
               var10000 = 89;
               break;
            case 95:
               var10000 = 115;
               break;
            case 96:
               var10000 = 56;
               break;
            case 97:
               var10000 = 183;
               break;
            case 98:
               var10000 = 247;
               break;
            case 99:
               var10000 = 237;
               break;
            case 100:
               var10000 = 66;
               break;
            case 101:
               var10000 = 155;
               break;
            case 102:
               var10000 = 14;
               break;
            case 103:
               var10000 = 196;
               break;
            case 104:
               var10000 = 113;
               break;
            case 105:
               var10000 = 220;
               break;
            case 106:
               var10000 = 134;
               break;
            case 107:
               var10000 = 52;
               break;
            case 108:
               var10000 = 16;
               break;
            case 109:
               var10000 = 67;
               break;
            case 110:
               var10000 = 201;
               break;
            case 111:
               var10000 = 212;
               break;
            case 112:
               var10000 = 243;
               break;
            case 113:
               var10000 = 202;
               break;
            case 114:
               var10000 = 198;
               break;
            case 115:
               var10000 = 147;
               break;
            case 116:
               var10000 = 217;
               break;
            case 117:
               var10000 = 7;
               break;
            case 118:
               var10000 = 139;
               break;
            case 119:
               var10000 = 235;
               break;
            case 120:
               var10000 = 48;
               break;
            case 121:
               var10000 = 133;
               break;
            case 122:
               var10000 = 251;
               break;
            case 123:
               var10000 = 226;
               break;
            case 124:
               var10000 = 57;
               break;
            case 125:
               var10000 = 17;
               break;
            case 126:
               var10000 = 63;
               break;
            case 127:
               var10000 = 71;
               break;
            case 128:
               var10000 = 248;
               break;
            case 129:
               var10000 = 154;
               break;
            case 130:
               var10000 = 126;
               break;
            case 131:
               var10000 = 99;
               break;
            case 132:
               var10000 = 223;
               break;
            case 133:
               var10000 = 51;
               break;
            case 134:
               var10000 = 102;
               break;
            case 135:
               var10000 = 93;
               break;
            case 136:
               var10000 = 214;
               break;
            case 137:
               var10000 = 37;
               break;
            case 138:
               var10000 = 184;
               break;
            case 139:
               var10000 = 118;
               break;
            case 140:
               var10000 = 49;
               break;
            case 141:
               var10000 = 114;
               break;
            case 142:
               var10000 = 136;
               break;
            case 143:
               var10000 = 97;
               break;
            case 144:
               var10000 = 75;
               break;
            case 145:
               var10000 = 34;
               break;
            case 146:
               var10000 = 116;
               break;
            case 147:
               var10000 = 55;
               break;
            case 148:
               var10000 = 165;
               break;
            case 149:
               var10000 = 122;
               break;
            case 150:
               var10000 = 255;
               break;
            case 151:
               var10000 = 195;
               break;
            case 152:
               var10000 = 53;
               break;
            case 153:
               var10000 = 43;
               break;
            case 154:
               var10000 = 20;
               break;
            case 155:
               var10000 = 231;
               break;
            case 156:
               var10000 = 46;
               break;
            case 157:
               var10000 = 82;
               break;
            case 158:
               var10000 = 152;
               break;
            case 159:
               var10000 = 130;
               break;
            case 160:
               var10000 = 132;
               break;
            case 161:
               var10000 = 246;
               break;
            case 162:
               var10000 = 129;
               break;
            case 163:
               var10000 = 80;
               break;
            case 164:
               var10000 = 9;
               break;
            case 165:
               var10000 = 179;
               break;
            case 166:
               var10000 = 109;
               break;
            case 167:
               var10000 = 50;
               break;
            case 168:
               var10000 = 106;
               break;
            case 169:
               var10000 = 98;
               break;
            case 170:
               var10000 = 225;
               break;
            case 171:
               var10000 = 254;
               break;
            case 172:
               var10000 = 197;
               break;
            case 173:
               var10000 = 77;
               break;
            case 174:
               var10000 = 105;
               break;
            case 175:
               var10000 = 60;
               break;
            case 176:
               var10000 = 11;
               break;
            case 177:
               var10000 = 2;
               break;
            case 178:
               var10000 = 249;
               break;
            case 179:
               var10000 = 13;
               break;
            case 180:
               var10000 = 90;
               break;
            case 181:
               var10000 = 33;
               break;
            case 182:
               var10000 = 92;
               break;
            case 183:
               var10000 = 35;
               break;
            case 184:
               var10000 = 124;
               break;
            case 185:
               var10000 = 101;
               break;
            case 186:
               var10000 = 181;
               break;
            case 187:
               var10000 = 189;
               break;
            case 188:
               var10000 = 164;
               break;
            case 189:
               var10000 = 25;
               break;
            case 190:
               var10000 = 236;
               break;
            case 191:
               var10000 = 42;
               break;
            case 192:
               var10000 = 224;
               break;
            case 193:
               var10000 = 216;
               break;
            case 194:
               var10000 = 38;
               break;
            case 195:
               var10000 = 208;
               break;
            case 196:
               var10000 = 61;
               break;
            case 197:
               var10000 = 119;
               break;
            case 198:
               var10000 = 83;
               break;
            case 199:
               var10000 = 58;
               break;
            case 200:
               var10000 = 95;
               break;
            case 201:
               var10000 = 21;
               break;
            case 202:
               var10000 = 84;
               break;
            case 203:
               var10000 = 104;
               break;
            case 204:
               var10000 = 81;
               break;
            case 205:
               var10000 = 174;
               break;
            case 206:
               var10000 = 245;
               break;
            case 207:
               var10000 = 229;
               break;
            case 208:
               var10000 = 4;
               break;
            case 209:
               var10000 = 163;
               break;
            case 210:
               var10000 = 157;
               break;
            case 211:
               var10000 = 79;
               break;
            case 212:
               var10000 = 144;
               break;
            case 213:
               var10000 = 30;
               break;
            case 214:
               var10000 = 153;
               break;
            case 215:
               var10000 = 185;
               break;
            case 216:
               var10000 = 210;
               break;
            case 217:
               var10000 = 120;
               break;
            case 218:
               var10000 = 230;
               break;
            case 219:
               var10000 = 12;
               break;
            case 220:
               var10000 = 36;
               break;
            case 221:
               var10000 = 193;
               break;
            case 222:
               var10000 = 141;
               break;
            case 223:
               var10000 = 91;
               break;
            case 224:
               var10000 = 218;
               break;
            case 225:
               var10000 = 191;
               break;
            case 226:
               var10000 = 206;
               break;
            case 227:
               var10000 = 170;
               break;
            case 228:
               var10000 = 39;
               break;
            case 229:
               var10000 = 244;
               break;
            case 230:
               var10000 = 125;
               break;
            case 231:
               var10000 = 167;
               break;
            case 232:
               var10000 = 168;
               break;
            case 233:
               var10000 = 204;
               break;
            case 234:
               var10000 = 41;
               break;
            case 235:
               var10000 = 127;
               break;
            case 236:
               var10000 = 138;
               break;
            case 237:
               var10000 = 44;
               break;
            case 238:
               var10000 = 128;
               break;
            case 239:
               var10000 = 146;
               break;
            case 240:
               var10000 = 200;
               break;
            case 241:
               var10000 = 26;
               break;
            case 242:
               var10000 = 178;
               break;
            case 243:
               var10000 = 177;
               break;
            case 244:
               var10000 = 209;
               break;
            case 245:
               var10000 = 239;
               break;
            case 246:
               var10000 = 145;
               break;
            case 247:
               var10000 = 32;
               break;
            case 248:
               var10000 = 29;
               break;
            case 249:
               var10000 = 72;
               break;
            case 250:
               var10000 = 140;
               break;
            case 251:
               var10000 = 31;
               break;
            case 252:
               var10000 = 211;
               break;
            case 253:
               var10000 = 94;
               break;
            case 254:
               var10000 = 10;
               break;
            default:
               var10000 = 171;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28323;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var10;
      char[] var33;
      String[] var13 = new String[13];
      int var11 = 0;
      var10 = "\u0090NÖ\bnë\rr]Ì\u00933\u001aRKwûù'õ0CãÈ¥\u00054\u00ad:ÛÉ\u0013þ7\u000b\u001b\u0084ÃI\bÃõ¸±ë´E<\b収缾孯批G妘屖1\u0003厁翂*\u0004\u0081聗攢\u009d\u0005¼ðîOü\u0002n秘\u000eñ\u0017É\u0086Çè·ñBøî\u008e[B\u0006戛卉²严辑e";
      int var12 = "\u0090NÖ\bnë\rr]Ì\u00933\u001aRKwûù'õ0CãÈ¥\u00054\u00ad:ÛÉ\u0013þ7\u000b\u001b\u0084ÃI\bÃõ¸±ë´E<\b収缾孯批G妘屖1\u0003厁翂*\u0004\u0081聗攢\u009d\u0005¼ðîOü\u0002n秘\u000eñ\u0017É\u0086Çè·ñBøî\u008e[B\u0006戛卉²严辑e"
         .length();
      char var9 = 3;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 29;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 57;
                        break;
                     case 1:
                        var65 = 99;
                        break;
                     case 2:
                        var65 = 89;
                        break;
                     case 3:
                        var65 = 112;
                        break;
                     case 4:
                        var65 = 2;
                        break;
                     case 5:
                        var65 = 50;
                        break;
                     default:
                        var65 = 107;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[13];
                     long var0 = 2071777907572934267L;
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "f\\JÊc\u007f\u0012Ð±4$\u000bS«ñ¼";
                     int var5 = "f\\JÊc\u007f\u0012Ð±4$\u000bS«ñ¼".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    d = var6;
                                    e = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ö\u0099f\u000e½\u001b3P«õ÷6ÏH7½";
                                 var5 = "ö\u0099f\u000e½\u001b3P«õ÷6ÏH7½".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "éY\u0005变翈始赉\u0003";
                  var12 = "éY\u0005变翈始赉\u0003".length();
                  var9 = 2;
                  var17 = -1;
            }

            var10000 = 104;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





