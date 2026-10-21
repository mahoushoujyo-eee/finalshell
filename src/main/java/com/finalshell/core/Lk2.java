package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.GB;
import com.finalshell.task.JC;
import com.finalshell.task.Jg2;
import com.finalshell.task.Kv4;
import com.finalshell.task.PasswordError;
import com.finalshell.task.PasswordError2;
import com.finalshell.task.VU;
import com.finalshell.ui.listener.Bp4;
import com.finalshell.ui.model.AY;
import com.finalshell.ui.model.TY3;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QU;
import com.finalshell.ui.panel.RouteTracePanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Collator;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class Lk2 {
   public static Hashtable X;
   public static Icon F;
   public static Icon z;
   static String x;
   static char[] J;
   static int S;
   static Random w;
   static int[] y;
   public static byte[][] O;
   static char[] U;
   public static Icon T;
   public static Icon N;
   public static Icon h;
   public static Icon H;
   static HashMap L;
   static HashMap P;
   static HashMap Z;
   public static String G;
   static DecimalFormat u;
   static DecimalFormat q;
   static String b;
   static BufferedImage I;
   static Graphics2D g;
   static Hashtable W;
   static HashSet V;
   static HashMap A;
   static HashSet r;
   public static String k;
   public static String K;
   public static String p;
   public static String s;
   public static String n;
   static JFileChooser c;
   static BufferedImage d;
   static float E;
   static String[] t;
   static String[] e;
   static Object Y;
   public static String[] m;
   public static String[] f;
   public static String[] i;
   public static long[] a;
   public static Integer[] j;
   public static long[] l;
   public static Long[] o;

   void N() {
   }

   public static JTextArea M$JTextArea() {
      JTextArea var0 = new JTextArea();
      var0.setBorder(BorderFactory.createEtchedBorder());
      var0.setEditable(false);
      Object[] var10001 = Registry.packArgs(b(-17903, 31226));
      long var1 = 517287540690064504L;
      Object var10002 = Ref.h2(517287540690064504L, var1);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001.setText((String)var10002);
      var0.setLineWrap(true);
      var0.setWrapStyleWord(true);
      return var0;
   }

   public static JEditorPane X() {
      JEditorPane var0 = new JEditorPane();
      var0.setEditable(false);
      var0.setBackground(new Color(a(19880, 7703114259159810549L), a(28803, 8192003067794078883L), a(28803, 8192003067794078883L)));
      var0.setFont((Font)Registry.lookupField(395970988011231853L).get(null));
      var0.setContentType(b(-17906, 7370));
      var0.setBorder(BorderFactory.createEtchedBorder());
      var0.addHyperlinkListener(new Bp4());
      com.finalshell.task.Cz2 var1 = new com.finalshell.task.Cz2(var0);
      var1.start();
      return var0;
   }

   public static void W(JComponent var0) {
      var0.putClientProperty(1, true);
   }

   public static boolean i(JComponent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: bipush 1
      // 05: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08: invokevirtual javax/swing/JComponent.getClientProperty (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b: astore 2
      // 0c: astore 1
      // 0d: aload 2
      // 0e: aload 1
      // 0f: ifnull 1d
      // 12: ifnull 39
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 2
      // 1d: checkcast java/lang/Boolean
      // 20: astore 3
      // 21: aload 3
      // 22: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 25: aload 1
      // 26: ifnull 3a
      // 29: ifeq 39
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: bipush 1
      // 34: ireturn
      // 35: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
   }

   public static Graphics E(JComponent var0, Graphics var1) {
      Registry.packArgs(var0);
      long var3 = 576735365376020526L;
      Object var10001 = Ref.h2(576735365376020526L, var3);

      try {
         var6 = (Boolean)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      if (var6) {
         AD var2 = new AD((Graphics2D)var1);
         var1 = var2;
      }

      return (Graphics)var1;
   }

   public static String E$String(String var0) {
      char[] var2 = var0.toCharArray();
      Ky4[] var10000 = YT3_2.c();
      char[] var3 = new char[var2.length];
      int var4 = 0;
      Ky4[] var1 = var10000;

      while (var4 < var2.length) {
         long var5 = (long)((int[])Registry.lookupField(502159663893205874L).get(null))[var4];
         var3[var4] = (char)((int)((long)var2[var4] + var5));
         var4++;
         if (var1 == null) {
            break;
         }
      }

      return new String(var3);
   }

   public static String a$String(String var0) {
      Ky4[] var10000 = YT3_2.c();
      char[] var2 = var0.toCharArray();
      int var3 = 0;
      Ky4[] var1 = var10000;

      while (var3 < var0.length()) {
         long var4 = (long)((int[])Registry.lookupField(502159663893205874L).get(null))[var3];
         var2[var3] = (char)((int)((long)var2[var3] - var4));
         var3++;
         if (var1 == null) {
            break;
         }
      }

      return new String(var2);
   }

   public static void C(JComponent var0) {
      Ky4[] var10000 = YT3_2.c();
      var0.setLayout(null);
      Ky4[] var1 = var10000;

      Object var10001;
      label236: {
         label240: {
            try {
               Registry.packArgs(var0);
               long var7 = 635059626651176862L;
               Ref.h2(635059626651176862L, var7);

               try {
                  ;
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               var10001 = var0;
               if (var1 == null) {
                  break label236;
               }

               if (!(var0 instanceof AbstractButton)) {
                  break label240;
               }
            } catch (RuntimeException var20) {
               throw a(var20);
            }

            AbstractButton var2 = (AbstractButton)var0;
            ActionListener[] var3 = var2.getActionListeners();
            int var4 = var3.length;
            int var5 = 0;

            while (var5 < var4) {
               ActionListener var6 = var3[var5];

               try {
                  var10001 = var2;
                  if (var1 == null) {
                     break label236;
                  }

                  var2.removeActionListener(var6);
                  var5++;
                  if (var1 == null) {
                     break;
                  }
               } catch (RuntimeException var19) {
                  throw a(var19);
               }
            }
         }

         var10001 = var0;
      }

      AncestorListener[] var21 = var10001.getAncestorListeners();
      int var31 = var21.length;
      int var41 = 0;

      while (true) {
         if (var41 < var31) {
            AncestorListener var51 = var21[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeAncestorListener(var51);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var18) {
               throw a(var18);
            }
         }

         var10001 = var0;
         break;
      }

      ComponentListener[] var22 = var10001.getComponentListeners();
      var31 = var22.length;
      var41 = 0;

      while (true) {
         if (var41 < var31) {
            ComponentListener var52 = var22[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeComponentListener(var52);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var17) {
               throw a(var17);
            }
         }

         var10001 = var0;
         break;
      }

      ContainerListener[] var23 = var10001.getContainerListeners();
      var31 = var23.length;
      var41 = 0;

      while (true) {
         if (var41 < var31) {
            ContainerListener var53 = var23[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeContainerListener(var53);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var16) {
               throw a(var16);
            }
         }

         var10001 = var0;
         break;
      }

      FocusListener[] var24 = var10001.getFocusListeners();
      var31 = var24.length;
      var41 = 0;

      while (true) {
         if (var41 < var31) {
            FocusListener var54 = var24[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeFocusListener(var54);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var15) {
               throw a(var15);
            }
         }

         var10001 = var0;
         break;
      }

      InputMethodListener[] var25 = var10001.getInputMethodListeners();
      var31 = var25.length;
      var41 = 0;

      while (true) {
         if (var41 < var31) {
            InputMethodListener var55 = var25[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeInputMethodListener(var55);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var14) {
               throw a(var14);
            }
         }

         var10001 = var0;
         break;
      }

      KeyListener[] var26 = var10001.getKeyListeners();
      var31 = var26.length;
      var41 = 0;

      while (true) {
         if (var41 < var31) {
            KeyListener var56 = var26[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeKeyListener(var56);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var13) {
               throw a(var13);
            }
         }

         var10001 = var0;
         break;
      }

      MouseListener[] var27 = var10001.getMouseListeners();
      var31 = var27.length;
      var41 = 0;

      while (true) {
         if (var41 < var31) {
            MouseListener var57 = var27[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeMouseListener(var57);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var12) {
               throw a(var12);
            }
         }

         var10001 = var0;
         break;
      }

      MouseMotionListener[] var28 = var10001.getMouseMotionListeners();
      var31 = var28.length;
      var41 = 0;

      while (true) {
         if (var41 < var31) {
            MouseMotionListener var58 = var28[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeMouseMotionListener(var58);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var11) {
               throw a(var11);
            }
         }

         var10001 = var0;
         break;
      }

      MouseWheelListener[] var29 = var10001.getMouseWheelListeners();
      var31 = var29.length;
      var41 = 0;

      while (true) {
         if (var41 < var31) {
            MouseWheelListener var59 = var29[var41];

            try {
               var10001 = var0;
               if (var1 == null) {
                  break;
               }

               var0.removeMouseWheelListener(var59);
               var41++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var10) {
               throw a(var10);
            }
         }

         var10001 = var0;
         break;
      }

      for (PropertyChangeListener var60 : var10001.getPropertyChangeListeners()) {
         var0.removePropertyChangeListener(var60);
         if (var1 == null) {
            break;
         }
      }
   }

   public static void a(JComponent param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokevirtual javax/swing/JComponent.getComponents ()[Ljava/awt/Component;
      // 07: astore 2
      // 08: aload 2
      // 09: astore 3
      // 0a: aload 3
      // 0b: arraylength
      // 0c: istore 4
      // 0e: bipush 0
      // 0f: istore 5
      // 11: astore 1
      // 12: iload 5
      // 14: iload 4
      // 16: if_icmpge 65
      // 19: aload 3
      // 1a: iload 5
      // 1c: aaload
      // 1d: astore 6
      // 1f: aload 1
      // 20: ifnull 69
      // 23: aload 1
      // 24: ifnull 61
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 6
      // 30: instanceof javax/swing/JComponent
      // 33: ifeq 5e
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 6
      // 3f: checkcast javax/swing/JComponent
      // 42: astore 7
      // 44: aload 7
      // 46: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 49: ldc2_w 635059626651176862
      // 4c: astore 8
      // 4e: ldc2_w 635059626651176862
      // 51: aload 8
      // 53: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 56: pop
      // 57: goto 5e
      // 5a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: iinc 5 1
      // 61: aload 1
      // 62: ifnonnull 12
      // 65: aload 0
      // 66: invokevirtual javax/swing/JComponent.removeAll ()V
      // 69: return
   }

   public static String x(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: ldc_w ""
      // 06: astore 2
      // 07: astore 1
      // 08: aload 1
      // 09: ifnull 2e
      // 0c: aconst_null
      // 0d: aload 0
      // 0e: if_acmpne 20
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: ldc_w ""
      // 1b: areturn
      // 1c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: sipush -17902
      // 24: sipush 26437
      // 27: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 2a: invokestatic java/net/URLDecoder.decode (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 2d: astore 2
      // 2e: goto 36
      // 31: astore 3
      // 32: aload 3
      // 33: invokevirtual java/io/UnsupportedEncodingException.printStackTrace ()V
      // 36: aload 2
      // 37: areturn
   }

   public static ArrayList b$ArrayList(String param0) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: ldc com/finalshell/core/Lk2
      // 005: invokevirtual java/lang/Class.getProtectionDomain ()Ljava/security/ProtectionDomain;
      // 008: invokevirtual java/security/ProtectionDomain.getCodeSource ()Ljava/security/CodeSource;
      // 00b: invokevirtual java/security/CodeSource.getLocation ()Ljava/net/URL;
      // 00e: invokevirtual java/net/URL.getPath ()Ljava/lang/String;
      // 011: astore 2
      // 012: aload 2
      // 013: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 016: ldc2_w 138042963439302856
      // 019: astore 11
      // 01b: ldc2_w 138042963439302856
      // 01e: aload 11
      // 020: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 023: checkcast java/lang/String
      // 026: goto 02d
      // 029: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: astore 2
      // 02e: astore 1
      // 02f: new java/io/File
      // 032: dup
      // 033: aload 2
      // 034: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 037: astore 3
      // 038: new java/util/ArrayList
      // 03b: dup
      // 03c: invokespecial java/util/ArrayList.<init> ()V
      // 03f: astore 4
      // 041: aload 3
      // 042: invokevirtual java/io/File.isFile ()Z
      // 045: ifeq 111
      // 048: aload 0
      // 049: astore 5
      // 04b: aload 5
      // 04d: aload 1
      // 04e: ifnull 06d
      // 051: ldc_w "/"
      // 054: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 057: ifeq 06f
      // 05a: goto 061
      // 05d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 0
      // 062: bipush 1
      // 063: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 066: goto 06d
      // 069: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: astore 5
      // 06f: new java/util/jar/JarFile
      // 072: dup
      // 073: aload 3
      // 074: invokespecial java/util/jar/JarFile.<init> (Ljava/io/File;)V
      // 077: astore 6
      // 079: aload 6
      // 07b: invokevirtual java/util/jar/JarFile.entries ()Ljava/util/Enumeration;
      // 07e: astore 7
      // 080: aload 7
      // 082: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 087: ifeq 108
      // 08a: aload 7
      // 08c: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 091: checkcast java/util/jar/JarEntry
      // 094: astore 8
      // 096: aload 1
      // 097: ifnull 10d
      // 09a: aload 8
      // 09c: aload 1
      // 09d: ifnull 0bd
      // 0a0: goto 0a7
      // 0a3: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: invokevirtual java/util/jar/JarEntry.isDirectory ()Z
      // 0aa: ifne 104
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: aload 8
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: invokevirtual java/util/jar/JarEntry.getName ()Ljava/lang/String;
      // 0c0: astore 9
      // 0c2: aload 9
      // 0c4: aload 1
      // 0c5: ifnull 0fa
      // 0c8: aload 5
      // 0ca: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0cd: ifeq 104
      // 0d0: goto 0d7
      // 0d3: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 9
      // 0d9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0dc: ldc2_w 422950346059317716
      // 0df: astore 13
      // 0e1: ldc2_w 422950346059317716
      // 0e4: aload 13
      // 0e6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0e9: checkcast java/lang/String
      // 0ec: goto 0f3
      // 0ef: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: astore 10
      // 0fc: aload 4
      // 0fe: aload 10
      // 100: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 103: pop
      // 104: aload 1
      // 105: ifnonnull 080
      // 108: aload 6
      // 10a: invokevirtual java/util/jar/JarFile.close ()V
      // 10d: aload 1
      // 10e: ifnonnull 1ae
      // 111: ldc com/finalshell/core/Lk2
      // 113: aload 0
      // 114: invokevirtual java/lang/Class.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 117: astore 5
      // 119: new java/io/BufferedReader
      // 11c: dup
      // 11d: new java/io/InputStreamReader
      // 120: dup
      // 121: aload 5
      // 123: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 126: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 129: astore 6
      // 12b: aload 6
      // 12d: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 130: dup
      // 131: astore 7
      // 133: ifnull 14d
      // 136: aload 4
      // 138: aload 7
      // 13a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 13d: pop
      // 13e: aload 1
      // 13f: ifnull 157
      // 142: aload 1
      // 143: ifnonnull 12b
      // 146: goto 14d
      // 149: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 6
      // 14f: invokevirtual java/io/BufferedReader.close ()V
      // 152: aload 6
      // 154: invokevirtual java/io/BufferedReader.close ()V
      // 157: goto 170
      // 15a: astore 7
      // 15c: aload 6
      // 15e: invokevirtual java/io/BufferedReader.close ()V
      // 161: goto 16d
      // 164: astore 8
      // 166: aload 7
      // 168: aload 8
      // 16a: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 16d: aload 7
      // 16f: athrow
      // 170: aload 5
      // 172: aload 1
      // 173: ifnull 182
      // 176: ifnull 1ae
      // 179: goto 180
      // 17c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17f: athrow
      // 180: aload 5
      // 182: invokevirtual java/io/InputStream.close ()V
      // 185: goto 1ae
      // 188: astore 6
      // 18a: aload 5
      // 18c: aload 1
      // 18d: ifnull 19c
      // 190: ifnull 1ab
      // 193: goto 19a
      // 196: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 5
      // 19c: invokevirtual java/io/InputStream.close ()V
      // 19f: goto 1ab
      // 1a2: astore 7
      // 1a4: aload 6
      // 1a6: aload 7
      // 1a8: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 1ab: aload 6
      // 1ad: athrow
      // 1ae: aload 4
      // 1b0: areturn
   }

   public static String K(String var0) {
      String var1 = "";

      try {
         Registry.packArgs(var0);
         long var3 = 556691693894836467L;
         Object var10001 = Ref.h2(556691693894836467L, var3);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var1 = (String)var10001;
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return var1;
   }

   public static String V(String var0) {
      String var1 = "";

      try {
         Registry.packArgs(var0);
         long var3 = 466665856241452304L;
         Object var10001 = Ref.h2(466665856241452304L, var3);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var1 = (String)var10001;
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return var1;
   }

   public static String B$String(String var0) {
      String var1 = "";

      try {
         Registry.packArgs(var0);
         long var3 = 508297973485259396L;
         Object var10001 = Ref.h2(508297973485259396L, var3);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var1 = (String)var10001;
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return var1;
   }

   public static String X$String(String var0) {
      String var1 = "";

      try {
         Registry.packArgs(var0);
         long var3 = 217092314768883824L;
         Object var10001 = Ref.h2(217092314768883824L, var3);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var1 = (String)var10001;
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return var1;
   }

   public static ArrayList i(File[] var0) {
      ArrayList var2 = new ArrayList();
      File[] var3 = var0;
      Ky4[] var10000 = YT3_2.c();
      int var4 = var0.length;
      Ky4[] var1 = var10000;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            File var6 = var3[var5];

            try {
               var2.add(var6);
               var5++;
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var7) {
               throw a(var7);
            }
         }

         Collections.sort(var2, new com.finalshell.ui.model.A());
         break;
      }

      return var2;
   }

   public static byte[] i(byte[] var0, byte[] var1) {
      byte[] var2 = null;

      try {
         Cipher var3 = Cipher.getInstance(b(-17856, 9263), b(-17846, 12284));
         SecretKeySpec var4 = new SecretKeySpec(var1, b(-17845, 402));
         var3.init(1, var4);
         var2 = var3.doFinal(var0);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      return var2;
   }

   public static byte[] Y(byte[] var0, byte[] var1) throws Exception {
      Object var2 = null;
      Cipher var3 = Cipher.getInstance(b(-17879, 20205), b(-17824, -1635));
      SecretKeySpec var4 = new SecretKeySpec(var1, b(-17892, -3980));
      var3.init(2, var4);
      return var3.doFinal(var0);
   }

   public static boolean B(byte[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aconst_null
      // 05: aload 0
      // 06: if_acmpne 0f
      // 09: bipush 0
      // 0a: ireturn
      // 0b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e: athrow
      // 0f: ldc2_w 464865238302897070
      // 12: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 15: aconst_null
      // 16: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 19: checkcast [[B
      // 1c: astore 2
      // 1d: aload 2
      // 1e: arraylength
      // 1f: istore 3
      // 20: bipush 0
      // 21: istore 4
      // 23: iload 4
      // 25: iload 3
      // 26: if_icmpge 90
      // 29: aload 2
      // 2a: iload 4
      // 2c: aaload
      // 2d: astore 5
      // 2f: aload 1
      // 30: ifnull 8c
      // 33: aload 5
      // 35: bipush 0
      // 36: baload
      // 37: aload 1
      // 38: ifnull 91
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: bipush 0
      // 44: baload
      // 45: if_icmpne 89
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 5
      // 51: bipush 1
      // 52: baload
      // 53: aload 0
      // 54: bipush 1
      // 55: baload
      // 56: aload 1
      // 57: ifnull 84
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: if_icmpne 89
      // 64: goto 6b
      // 67: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: aload 5
      // 6d: bipush 2
      // 6e: baload
      // 6f: aload 1
      // 70: ifnull 88
      // 73: goto 7a
      // 76: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 0
      // 7b: bipush 2
      // 7c: baload
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: if_icmpne 89
      // 87: bipush 1
      // 88: ireturn
      // 89: iinc 4 1
      // 8c: aload 1
      // 8d: ifnonnull 23
      // 90: bipush 0
      // 91: ireturn
   }

   public static void s(byte[] var0, String var1, String var2) throws IOException, FileNotFoundException {
      ZipOutputStream var3 = new ZipOutputStream(new FileOutputStream(var2));
      ZipEntry var4 = new ZipEntry(var1);
      var3.putNextEntry(var4);
      ByteArrayInputStream var5 = new ByteArrayInputStream(var0);
      IOUtils.copy(var5, var3);
      IOUtils.closeQuietly(var5);
      IOUtils.closeQuietly(var3);
   }

   public static byte[] j(byte[] var0, String var1) throws IOException, FileNotFoundException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      ZipOutputStream var3 = new ZipOutputStream(var2);
      ZipEntry var4 = new ZipEntry(var1);
      var3.putNextEntry(var4);
      ByteArrayInputStream var5 = new ByteArrayInputStream(var0);
      IOUtils.copy(var5, var3);
      IOUtils.closeQuietly(var5);
      IOUtils.closeQuietly(var3);
      byte[] var6 = var2.toByteArray();
      var2.close();
      return var6;
   }

   public static void Q(String param0, String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: new java/io/File
      // 07: dup
      // 08: aload 0
      // 09: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0c: invokevirtual java/io/File.isFile ()Z
      // 0f: aload 2
      // 10: ifnull 36
      // 13: ifeq 90
      // 16: goto 1d
      // 19: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 2
      // 1f: ifnull 54
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: getstatic java/io/File.separator Ljava/lang/String;
      // 2c: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 2f: goto 36
      // 32: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: ifne 55
      // 39: new java/lang/StringBuilder
      // 3c: dup
      // 3d: invokespecial java/lang/StringBuilder.<init> ()V
      // 40: aload 1
      // 41: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44: getstatic java/io/File.separator Ljava/lang/String;
      // 47: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: astore 1
      // 55: new java/io/FileInputStream
      // 58: dup
      // 59: aload 0
      // 5a: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 5d: astore 3
      // 5e: new java/util/zip/ZipInputStream
      // 61: dup
      // 62: aload 3
      // 63: invokespecial java/util/zip/ZipInputStream.<init> (Ljava/io/InputStream;)V
      // 66: astore 4
      // 68: aload 1
      // 69: aload 4
      // 6b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 6e: ldc2_w 625530649714054811
      // 71: astore 5
      // 73: ldc2_w 625530649714054811
      // 76: aload 5
      // 78: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 7b: pop
      // 7c: goto 83
      // 7f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 4
      // 85: invokevirtual java/util/zip/ZipInputStream.close ()V
      // 88: aload 3
      // 89: invokevirtual java/io/FileInputStream.close ()V
      // 8c: aload 2
      // 8d: ifnonnull a5
      // 90: new java/io/IOException
      // 93: dup
      // 94: sipush -17875
      // 97: sipush -29456
      // 9a: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 9d: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // a0: athrow
      // a1: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a4: athrow
      // a5: return
   }

   public static void D(String param0, ZipInputStream param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 1
      // 04: invokevirtual java/util/zip/ZipInputStream.getNextEntry ()Ljava/util/zip/ZipEntry;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: ifnull dd
      // 0d: aload 3
      // 0e: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 11: astore 4
      // 13: new java/io/File
      // 16: dup
      // 17: new java/lang/StringBuilder
      // 1a: dup
      // 1b: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e: aload 0
      // 1f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22: aload 4
      // 24: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2d: astore 5
      // 2f: aload 5
      // 31: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 34: astore 6
      // 36: aload 6
      // 38: invokevirtual java/io/File.exists ()Z
      // 3b: aload 2
      // 3c: ifnull 5e
      // 3f: ifne 56
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 6
      // 4b: invokevirtual java/io/File.mkdirs ()Z
      // 4e: pop
      // 4f: goto 56
      // 52: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 4
      // 58: ldc_w "/"
      // 5b: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 5e: aload 2
      // 5f: ifnull 78
      // 62: ifeq 7d
      // 65: goto 6c
      // 68: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: aload 5
      // 6e: invokevirtual java/io/File.mkdirs ()Z
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: pop
      // 79: aload 2
      // 7a: ifnonnull d0
      // 7d: new java/io/FileOutputStream
      // 80: dup
      // 81: aload 5
      // 83: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 86: astore 7
      // 88: sipush 2297
      // 8b: new java/io/BufferedOutputStream
      // 8e: dup
      // 8f: aload 7
      // 91: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;)V
      // 94: astore 8
      // 96: ldc2_w 6008328928285836416
      // 99: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 9c: newarray 8
      // 9e: astore 10
      // a0: aload 1
      // a1: aload 10
      // a3: invokevirtual java/util/zip/ZipInputStream.read ([B)I
      // a6: dup
      // a7: istore 9
      // a9: bipush -1
      // aa: if_icmpeq c6
      // ad: aload 8
      // af: aload 10
      // b1: bipush 0
      // b2: iload 9
      // b4: invokevirtual java/io/BufferedOutputStream.write ([BII)V
      // b7: aload 2
      // b8: ifnull cb
      // bb: aload 2
      // bc: ifnonnull a0
      // bf: goto c6
      // c2: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c5: athrow
      // c6: aload 8
      // c8: invokevirtual java/io/BufferedOutputStream.close ()V
      // cb: aload 7
      // cd: invokevirtual java/io/FileOutputStream.close ()V
      // d0: aload 1
      // d1: invokevirtual java/util/zip/ZipInputStream.closeEntry ()V
      // d4: aload 1
      // d5: invokevirtual java/util/zip/ZipInputStream.getNextEntry ()Ljava/util/zip/ZipEntry;
      // d8: astore 3
      // d9: aload 2
      // da: ifnonnull 09
      // dd: return
   }

   public static String o(long var0, String var2) {
      SimpleDateFormat var3 = new SimpleDateFormat(var2);
      var3.setTimeZone(TimeZone.getTimeZone(b(-17884, 13970)));
      return var3.format(new Date(var0));
   }

   public static Date A$Date(String var0, String var1) throws ParseException {
      SimpleDateFormat var2 = new SimpleDateFormat(var1);
      var2.setTimeZone(TimeZone.getTimeZone(b(-17810, -19925)));
      return var2.parse(var0);
   }

   public static InputStream F(String var0) throws IOException {
      return Lk2.class.getResourceAsStream(var0);
   }

   public static byte[] J$arrbyte(String var0) throws IOException {
      Object var2 = null;
      Registry.packArgs(var0);
      long var7 = 158861131972796464L;
      Object var10001 = Ref.h2(158861131972796464L, var7);

      try {
         var10001 = (InputStream)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      InputStream var3 = (InputStream)var10001;
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      var10001 = YT3_2.c();
      int var5 = 0;
      byte[] var6 = new byte[a(11967, 3081740741108720257L)];
      Ky4[] var1 = (Ky4[])var10001;

      while (true) {
         if ((var5 = var3.read(var6)) > 0) {
            try {
               var10001 = var4;
               if (var1 == null) {
                  break;
               }

               var4.write(var6, 0, var5);
               if (var1 != null) {
                  continue;
               }
            } catch (IOException var10) {
               throw a(var10);
            }
         }

         var10001 = var4;
         break;
      }

      return var10001.toByteArray();
   }

   public static String[] R(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: new java/util/ArrayList
      // 05: dup
      // 06: invokespecial java/util/ArrayList.<init> ()V
      // 09: astore 3
      // 0a: aload 3
      // 0b: new java/lang/StringBuffer
      // 0e: dup
      // 0f: invokespecial java/lang/StringBuffer.<init> ()V
      // 12: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 15: pop
      // 16: bipush 0
      // 17: istore 4
      // 19: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 1c: bipush 0
      // 1d: istore 5
      // 1f: astore 1
      // 20: iload 5
      // 22: aload 0
      // 23: invokevirtual java/lang/String.length ()I
      // 26: if_icmpge 94
      // 29: aload 3
      // 2a: iload 4
      // 2c: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 2f: checkcast java/lang/StringBuffer
      // 32: astore 6
      // 34: aload 0
      // 35: iload 5
      // 37: invokevirtual java/lang/String.charAt (I)C
      // 3a: istore 7
      // 3c: aload 1
      // 3d: ifnull 6a
      // 40: iload 7
      // 42: aload 1
      // 43: ifnull 98
      // 46: goto 4d
      // 49: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: sipush 343
      // 50: ldc2_w 8870369628830551360
      // 53: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 56: if_icmpne 7e
      // 59: goto 60
      // 5c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: iinc 4 1
      // 63: goto 6a
      // 66: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: new java/lang/StringBuffer
      // 6d: dup
      // 6e: invokespecial java/lang/StringBuffer.<init> ()V
      // 71: astore 8
      // 73: aload 3
      // 74: aload 8
      // 76: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 79: pop
      // 7a: aload 1
      // 7b: ifnonnull 8d
      // 7e: aload 6
      // 80: iload 7
      // 82: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 85: pop
      // 86: goto 8d
      // 89: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: iinc 5 1
      // 90: aload 1
      // 91: ifnonnull 20
      // 94: aload 3
      // 95: invokevirtual java/util/ArrayList.size ()I
      // 98: anewarray 112
      // 9b: astore 2
      // 9c: bipush 0
      // 9d: istore 5
      // 9f: iload 5
      // a1: aload 2
      // a2: arraylength
      // a3: if_icmpge c8
      // a6: aload 2
      // a7: aload 1
      // a8: ifnull c9
      // ab: iload 5
      // ad: aload 3
      // ae: iload 5
      // b0: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // b3: checkcast java/lang/StringBuffer
      // b6: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // b9: aastore
      // ba: iinc 5 1
      // bd: aload 1
      // be: ifnonnull 9f
      // c1: goto c8
      // c4: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7: athrow
      // c8: aload 2
      // c9: areturn
   }

   public static String d(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: new java/lang/StringBuffer
      // 06: dup
      // 07: invokespecial java/lang/StringBuffer.<init> ()V
      // 0a: astore 2
      // 0b: astore 1
      // 0c: bipush 0
      // 0d: istore 3
      // 0e: iload 3
      // 0f: aload 0
      // 10: invokevirtual java/lang/String.length ()I
      // 13: if_icmpge 94
      // 16: aload 0
      // 17: aload 1
      // 18: ifnull 98
      // 1b: iload 3
      // 1c: invokevirtual java/lang/String.charAt (I)C
      // 1f: istore 4
      // 21: bipush 0
      // 22: istore 5
      // 24: iload 5
      // 26: ldc2_w 569080910441913458
      // 29: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 2c: aconst_null
      // 2d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 30: checkcast [C
      // 33: arraylength
      // 34: if_icmpge 86
      // 37: ldc2_w 569080910441913458
      // 3a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3d: aconst_null
      // 3e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 41: checkcast [C
      // 44: iload 5
      // 46: caload
      // 47: istore 6
      // 49: aload 1
      // 4a: ifnull 82
      // 4d: iload 4
      // 4f: iload 6
      // 51: aload 1
      // 52: ifnull 13
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: if_icmpne 78
      // 5f: aload 2
      // 60: sipush 23318
      // 63: ldc2_w 2379467392432576318
      // 66: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 69: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 6c: pop
      // 6d: aload 1
      // 6e: ifnonnull 86
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: iinc 5 1
      // 7b: goto 82
      // 7e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 1
      // 83: ifnonnull 24
      // 86: aload 2
      // 87: iload 4
      // 89: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 8c: pop
      // 8d: iinc 3 1
      // 90: aload 1
      // 91: ifnonnull 0e
      // 94: aload 2
      // 95: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 98: areturn
   }

   public static String s$String(String var0) {
      Ky4[] var10000 = YT3_2.c();
      StringBuffer var2 = new StringBuffer();
      Ky4[] var1 = var10000;
      ZX_2 var3 = new ZX_2(var0);
      int var4 = 0;

      while (true) {
         if (var4 < var0.length()) {
      JTextArea var12;
            var12 = var0;
            if (var1 == null) {
               break;
            }

            char var5 = var0.charAt(var4);
            boolean var6 = true;

            boolean var14;
            label46: {
               label45: {
                  try {
                     Object[] var10001 = Registry.packArgs(var4);
                     long var8 = 482035299313315641L;
                     Object[] var7 = var10001;
                     Object var13 = Ref.h(482035299313315641L, var7, var8);

                     try {
                        var14 = (Boolean)var13;
                     } catch (InvocationTargetException var10) {
                        throw var10.getTargetException();
                     }

                     if (var1 == null) {
                        break label46;
                     }

                     if (!var14) {
                        break label45;
                     }
                  } catch (RuntimeException var11) {
                     throw a(var11);
                  }

                  var6 = false;
               }

               var14 = var6;
            }

            try {
               if (var14) {
                  var2.append(var5);
               }
            } catch (RuntimeException var9) {
               throw a(var9);
            }

            var4++;
            if (var1 != null) {
               continue;
            }
         }

         var12 = var2.toString();
         break;
      }

      return var12;
   }

   public static void D$void() {
      Registry.emptyArgs();
      long var1 = 270389152141252877L;
      Ref.h2(270389152141252877L, var1);
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 306266403902896148L;
      Object[] var3 = var10002;
      Ref.h(306266403902896148L, var3, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 629017702607628679L;
      Object[] var5 = var10003;
      var10003 = Ref.h(629017702607628679L, var5, var6);

      try {
         var12 = (Boolean)var10003;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      boolean var0 = var12;
      Registry.packArgs(var0);
      long var7 = 175448534908616132L;
      Ref.h2(175448534908616132L, var7);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public static boolean k(String var0, String var1, CH var2) {
      String[] var3 = new String[]{b(-17825, -29177), b(-17836, 19794), b(-17873, 25755) + var0};
      AtomicBoolean var5 = new AtomicBoolean(true);

      try {
         Process var4 = Runtime.getRuntime().exec(var3);
         BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getErrorStream()));
         BufferedReader var7 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
         BufferedWriter var8 = new BufferedWriter(new OutputStreamWriter(var4.getOutputStream()));
         Thread var9 = new Thread(new PasswordError(var8, var1, var6, var5, var4, var2));
         Thread var10 = new Thread(new GB(var7, var2));
         var9.start();
         var10.start();
         var9.join(b(406, 5928124308423463538L));
         var10.join(b(11730, 8303972991935905332L));
         var4.destroy();
      } catch (Exception var11) {
         var11.printStackTrace();
      }

      return var5.get();
   }

   public static void q(String var0, String var1, CH var2) {
      String[] var3 = new String[]{b(-17899, -11306), b(-17876, 10543), b(-17904, -20834) + var0};

      try {
         Process var4 = Runtime.getRuntime().exec(var3);
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getErrorStream()));
         BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
         BufferedWriter var7 = new BufferedWriter(new OutputStreamWriter(var4.getOutputStream()));
         Thread var8 = new Thread(new PasswordError2(var7, var1, var5, var4, var2));
         Thread var9 = new Thread(new VU(var6, var2));
         var8.start();
         var9.start();
         var8.join();
         var9.join();
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   public static JScrollPane A(JComponent var0) {
      com.finalshell.ui.panel.LH var1 = new com.finalshell.ui.panel.LH(var0);
      var1.setBorder(BorderFactory.createLineBorder(new Color(a(6146, 5002041592900047894L), a(25353, 7693457680700845916L), a(25353, 7693457680700845916L))));
      var1.setOpaque(false);
      var1.getViewport().setOpaque(false);
      return var1;
   }

   public static void F(String var0, String var1) throws IOException, FileNotFoundException {
      ZipOutputStream var2 = new ZipOutputStream(new FileOutputStream(var1));
      Registry.packArgs(var0, var0, var2);
      long var3 = 310026214131597503L;
      Ref.h2(310026214131597503L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      IOUtils.closeQuietly(var2);
   }

   public static void l(String param0, String param1, ZipOutputStream param2) throws IOException, FileNotFoundException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: new java/io/File
      // 06: dup
      // 07: aload 1
      // 08: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0b: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 0e: astore 4
      // 10: aload 4
      // 12: arraylength
      // 13: istore 5
      // 15: bipush 0
      // 16: istore 6
      // 18: astore 3
      // 19: iload 6
      // 1b: iload 5
      // 1d: if_icmpge e3
      // 20: aload 4
      // 22: iload 6
      // 24: aaload
      // 25: astore 7
      // 27: aload 3
      // 28: ifnull 77
      // 2b: aload 7
      // 2d: invokevirtual java/io/File.isDirectory ()Z
      // 30: ifeq 7b
      // 33: goto 3a
      // 36: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: new java/lang/StringBuilder
      // 3e: dup
      // 3f: invokespecial java/lang/StringBuilder.<init> ()V
      // 42: aload 1
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: getstatic java/io/File.separator Ljava/lang/String;
      // 49: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c: aload 7
      // 4e: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: aload 2
      // 58: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 5b: ldc2_w 310026214131597503
      // 5e: astore 11
      // 60: ldc2_w 310026214131597503
      // 63: aload 11
      // 65: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 68: pop
      // 69: goto 70
      // 6c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6f: athrow
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 3
      // 78: ifnonnull dc
      // 7b: new java/util/zip/ZipEntry
      // 7e: dup
      // 7f: new java/lang/StringBuilder
      // 82: dup
      // 83: invokespecial java/lang/StringBuilder.<init> ()V
      // 86: aload 1
      // 87: aload 0
      // 88: ldc_w ""
      // 8b: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 8e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91: aload 7
      // 93: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 96: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 99: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9c: invokespecial java/util/zip/ZipEntry.<init> (Ljava/lang/String;)V
      // 9f: astore 8
      // a1: aload 2
      // a2: aload 8
      // a4: invokevirtual java/util/zip/ZipOutputStream.putNextEntry (Ljava/util/zip/ZipEntry;)V
      // a7: new java/lang/StringBuilder
      // aa: dup
      // ab: invokespecial java/lang/StringBuilder.<init> ()V
      // ae: aload 1
      // af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b2: getstatic java/io/File.separator Ljava/lang/String;
      // b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b8: aload 7
      // ba: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c3: astore 9
      // c5: new java/io/FileInputStream
      // c8: dup
      // c9: aload 9
      // cb: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // ce: astore 10
      // d0: aload 10
      // d2: aload 2
      // d3: invokestatic org/apache/commons/compress/utils/IOUtils.copy (Ljava/io/InputStream;Ljava/io/OutputStream;)J
      // d6: pop2
      // d7: aload 10
      // d9: invokestatic org/apache/commons/compress/utils/IOUtils.closeQuietly (Ljava/io/Closeable;)V
      // dc: iinc 6 1
      // df: aload 3
      // e0: ifnonnull 19
      // e3: return
   }

   public static void A$void(String var0, String var1) {
      File var3 = new File(var0);
      Ky4[] var10000 = YT3_2.c();
      ArrayList var4 = new ArrayList();
      Ky4[] var2 = var10000;
      Registry.packArgs(var3, var4);
      long var14 = 317615245425501752L;
      Ref.h2(317615245425501752L, var14);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      try {
         FileOutputStream var5 = new FileOutputStream(var1);
         ZipOutputStream var6 = new ZipOutputStream(var5);

         for (String var8 : var4) {
            System.out.println(b(-17797, 15033) + var8);
            String var9 = var8.substring(var3.getAbsolutePath().length() + 1, var8.length());
            ZipEntry var10 = new ZipEntry(var9);
            var6.putNextEntry(var10);
            FileInputStream var11 = new FileInputStream(var8);
            if (var2 == null) {
               return;
            }

            byte[] var12 = new byte[a(11967, 3081740741108720257L)];

            while (true) {
               int var13;
               if ((var13 = var11.read(var12)) > 0) {
                  try {
                     var6.write(var12, 0, var13);
                     if (var2 == null) {
                        break;
                     }

                     if (var2 != null) {
                        continue;
                     }
                  } catch (IOException var17) {
                     throw a(var17);
                  }
               }

               var6.closeEntry();
               var11.close();
               break;
            }

            if (var2 == null) {
               break;
            }
         }

         var6.close();
         var5.close();
      } catch (IOException var18) {
         var18.printStackTrace();
      }
   }

   public static void o(File param0, ArrayList param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: aload 2
      // 0b: ifnull 19
      // 0e: ifnull 99
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 3
      // 19: aload 2
      // 1a: ifnull 30
      // 1d: arraylength
      // 1e: ifle 99
      // 21: goto 28
      // 24: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 3
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: astore 4
      // 32: aload 4
      // 34: arraylength
      // 35: istore 5
      // 37: bipush 0
      // 38: istore 6
      // 3a: iload 6
      // 3c: iload 5
      // 3e: if_icmpge 99
      // 41: aload 4
      // 43: iload 6
      // 45: aaload
      // 46: astore 7
      // 48: aload 7
      // 4a: aload 2
      // 4b: ifnull 79
      // 4e: invokevirtual java/io/File.isFile ()Z
      // 51: ifeq 70
      // 54: goto 5b
      // 57: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 1
      // 5c: aload 7
      // 5e: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 61: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 64: pop
      // 65: aload 2
      // 66: ifnonnull 92
      // 69: goto 70
      // 6c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 7
      // 72: goto 79
      // 75: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: aload 1
      // 7a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 7d: ldc2_w 317615245425501752
      // 80: astore 8
      // 82: ldc2_w 317615245425501752
      // 85: aload 8
      // 87: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 8a: pop
      // 8b: goto 92
      // 8e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 91: athrow
      // 92: iinc 6 1
      // 95: aload 2
      // 96: ifnonnull 3a
      // 99: return
   }

   public static Font o(String var0, boolean var1) {
      Registry.packArgs(var0, 0, a(4273, 3299899696215547110L), var1);
      long var2 = 519848640695097965L;
      Object var10001 = Ref.h2(519848640695097965L, var2);

      try {
         return (Font)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public static Font T(String var0, int var1, int var2) {
      Registry.packArgs(var0, var1, var2, false);
      long var3 = 519848640695097965L;
      Object var10001 = Ref.h2(519848640695097965L, var3);

      try {
         return (Font)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static Font O(String var0, int var1, int var2, boolean var3) {
      Ky4[] var10000 = YT3_2.c();
      Font var5 = null;
      Ky4[] var4 = var10000;

      label158: {
         label147: {
            try {
               var10000 = (Ky4[])var3;
               if (var4 == null) {
                  break label147;
               }

               if (var3 != false) {
                  break label158;
               }
            } catch (FontFormatException var21) {
               throw a(var21);
            }

            var10000 = Registry.emptyArgs();
            long var9 = 253808553645062345L;
            Object var10001 = Ref.h2(253808553645062345L, var9);

            try {
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }
         }

         if (var10000 != false) {
            File var22 = null;
            byte var7 = 0;

            label129: {
               label149: {
                  label150: {
                     label126: {
                        label125: {
                           try {
                              var26 = var0.equals(b(-17815, -20845));
                              if (var4 == null) {
                                 break label125;
                              }

                              if (var26) {
                                 break label126;
                              }
                           } catch (FontFormatException var20) {
      JTextArea var27;
                              throw a(var20);
                           }

                           try {
                              var27 = var0;
                              if (var4 == null) {
                                 break label150;
                              }

                              var26 = var0.equals(b(-17912, -24828));
                           } catch (FontFormatException var19) {
                              throw a(var19);
                           }
                        }

                        try {
                           if (!var26) {
                              break label149;
                           }

                           var27 = System.getenv(b(-17818, -17593)) + b(-17816, 22395);
                           break label150;
                        } catch (FontFormatException var18) {
                           throw a(var18);
                        }
                     }

                     String var8 = System.getenv(b(-17869, 1103)) + b(-17804, 7092);
                     var22 = new File(var8);

                     label108: {
                        try {
                           var28 = var22.exists();
                           if (var4 == null) {
                              break label108;
                           }

                           if (var28 == 0) {
                              break label149;
                           }
                        } catch (FontFormatException var17) {
                           throw a(var17);
                        }

                        var28 = 1;
                     }

                     var7 = var28;
                     break label149;
                  }

                  String var23 = var27;
                  if (var1 == 1) {
                     var23 = System.getenv(b(-17818, -17593)) + b(-17914, 11284);
                  }

                  var22 = new File(var23);

                  try {
                     var29 = var22.exists();
                     if (var4 == null) {
                        break label129;
                     }

                     if (var29 == 0) {
                        break label149;
                     }
                  } catch (FontFormatException var16) {
                     throw a(var16);
                  }

                  var7 = 1;
               }

               var29 = var7;
            }

            label159: {
               label89: {
                  label88: {
                     try {
                        if (var4 == null) {
                           break label88;
                        }

                        if (var29 == 0) {
                           break label159;
                        }
                     } catch (FontFormatException var15) {
                        throw a(var15);
                     }

                     try {
                        var29 = 0;
                     } catch (IOException | FontFormatException var14) {
                        var30 = var14;
                        boolean var31 = false;
                        break label89;
                     }
                  }

                  try {
                     var5 = Font.createFont(var29, new FileInputStream(var22)).deriveFont(var1, (float)var2);
                     return var5;
                  } catch (IOException | FontFormatException var13) {
                     var30 = var13;
                     boolean var32 = false;
                  }
               }

               FontFormatException var24 = var30;
               var24.printStackTrace();
               return var5;
            }

            var5 = new Font(var0, var1, var2);
         } else {
            var5 = new Font(var0, var1, var2);
         }

         return var5;
      }

      InputStream var6 = Lk2.class.getResourceAsStream(b(-17799, -31551) + var0);

      try {
         var5 = Font.createFont(0, var6);
         var5 = var5.deriveFont(var1, (float)var2);
      } catch (IOException | FontFormatException var11) {
         var11.printStackTrace();
      }

      return var5;
   }

   public static JScrollPane D(JComponent var0) {
      com.finalshell.ui.panel.GC var1 = new com.finalshell.ui.panel.GC(var0);
      var1.getVerticalScrollBar().setUnitIncrement(a(4582, 1566704523461713382L));
      var1.setHorizontalScrollBarPolicy(a(2107, 4549938954423092275L));
      var1.setVerticalScrollBarPolicy(a(24012, 2509098911796007353L));
      var1.setOpaque(false);
      var1.getViewport().setOpaque(false);
      return var1;
   }

   public static JScrollPane r(JComponent var0) {
      com.finalshell.ui.panel.D22 var1 = new com.finalshell.ui.panel.D22(var0);
      var1.setVerticalScrollBarPolicy(a(3500, 5427085118219665823L));
      var1.setOpaque(false);
      var1.getViewport().setOpaque(false);
      return var1;
   }

   public static JLabel m$JLabel(String var0) {
      JLabel var1 = new JLabel(var0);
      var1.setForeground(new Color(a(14326, 1442039994777697258L), a(24263, 914619763030823652L), a(24263, 914619763030823652L)));
      return var1;
   }

   public static Dv2 l(String var0) {
      Registry.packArgs(var0, true);
      long var1 = 176987068897787958L;
      Object var10001 = Ref.h2(176987068897787958L, var1);

      try {
         return (Dv2)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static Dv2 h(String var0, boolean var1) {
      Dv2 var2 = new Dv2();
      var2.setOpaque(false);
      var2.setBackground(new Color(0, 0, 0, 0));
      var2.I(0, 0, 0, 0);
      var2.P(var0);
      var2.j().v(true);
      Registry.packArgs("\uf1da");
      long var4 = 360256375153447639L;
      Object var10001 = Ref.h2(360256375153447639L, var4);

      try {
         var10001 = (com.finalshell.ui.panel.T2)var10001;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      com.finalshell.ui.panel.T2 var3 = (com.finalshell.ui.panel.T2)var10001;
      var3.setOpaque(false);
      var3.setForeground((Color)Registry.lookupField(430697627377283751L).get(null));
      var3.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
      var3.setForeground((Color)Registry.lookupField(430697627377283751L).get(null));
      var2.setForeground((Color)Registry.lookupField(430697627377283751L).get(null));
      Registry.packArgs(var2, var1);
      long var6 = 370149877875067536L;
      Ref.h2(370149877875067536L, var6);
      return var2;
   }

   public static JScrollPane N(Component var0) {
      QU var1 = new QU(var0, a(24012, 2509098911796007353L), a(27896, 9184537070558585055L));
      var1.setOpaque(false);
      var1.setViewportView(var0);
      var1.getViewport().setOpaque(false);
      return var1;
   }

   public static void L(JTree var0, boolean var1) {
      TreeNode var2 = (TreeNode)var0.getModel().getRoot();
      Registry.packArgs(var0, new TreePath(var2), var1);
      long var3 = 277081561739129478L;
      Ref.h2(277081561739129478L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public static void I(JTree var0, TreePath var1, boolean var2) {
      Ky4[] var10000 = YT3_2.c();
      TreeNode var4 = (TreeNode)var1.getLastPathComponent();
      Ky4[] var3 = var10000;

      label58: {
         label57: {
            label63: {
               try {
                  var14 = var4.getChildCount();
                  if (var3 == null) {
                     break label57;
                  }

                  if (var14 < 0) {
                     break label63;
                  }
               } catch (RuntimeException var13) {
                  throw a(var13);
               }

               Enumeration var5 = var4.children();

               while (var5.hasMoreElements()) {
                  TreeNode var6 = (TreeNode)var5.nextElement();
                  TreePath var7 = var1.pathByAddingChild(var6);

                  try {
                     Registry.packArgs(var0, var7, (boolean)var2);
                     long var8 = 277081561739129478L;
                     Ref.h2(277081561739129478L, var8);

                     try {
                        ;
                     } catch (InvocationTargetException var10) {
                        throw var10.getTargetException();
                     }

                     if (var3 == null) {
                        break label58;
                     }

                     if (var3 == null) {
                        break;
                     }
                  } catch (RuntimeException var12) {
                     throw a(var12);
                  }
               }
            }

            var14 = var2;
         }

         try {
            if (var14 != 0) {
               var0.expandPath(var1);
               if (var3 != null) {
                  return;
               }
            }
         } catch (RuntimeException var11) {
            throw a(var11);
         }
      }

      var0.collapsePath(var1);
   }

   public static boolean I(KeyEvent var0) {
      return var0.isAltDown();
   }

   public static String u() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w ""
      // 03: astore 1
      // 04: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 07: new java/lang/StringBuilder
      // 0a: dup
      // 0b: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e: astore 2
      // 0f: astore 0
      // 10: invokestatic java/net/NetworkInterface.getNetworkInterfaces ()Ljava/util/Enumeration;
      // 13: astore 3
      // 14: aload 3
      // 15: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 1a: ifeq 84
      // 1d: aload 3
      // 1e: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 23: checkcast java/net/NetworkInterface
      // 26: invokevirtual java/net/NetworkInterface.getHardwareAddress ()[B
      // 29: astore 4
      // 2b: aload 0
      // 2c: ifnull 8c
      // 2f: aload 4
      // 31: aload 0
      // 32: ifnull 53
      // 35: goto 3c
      // 38: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: ifnonnull 51
      // 3f: goto 46
      // 42: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: ifnonnull 14
      // 4a: goto 51
      // 4d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 4
      // 53: astore 5
      // 55: aload 5
      // 57: arraylength
      // 58: istore 6
      // 5a: bipush 0
      // 5b: istore 7
      // 5d: iload 7
      // 5f: iload 6
      // 61: if_icmpge 80
      // 64: aload 5
      // 66: iload 7
      // 68: baload
      // 69: istore 8
      // 6b: aload 2
      // 6c: iload 8
      // 6e: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: pop
      // 75: iinc 7 1
      // 78: aload 0
      // 79: ifnull 14
      // 7c: aload 0
      // 7d: ifnonnull 5d
      // 80: aload 0
      // 81: ifnonnull 14
      // 84: goto 8c
      // 87: astore 3
      // 88: aload 3
      // 89: invokevirtual java/lang/Exception.printStackTrace ()V
      // 8c: aload 2
      // 8d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 90: astore 3
      // 91: aload 3
      // 92: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 95: ldc2_w 323011382913130419
      // 98: astore 9
      // 9a: ldc2_w 323011382913130419
      // 9d: aload 9
      // 9f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // a2: checkcast java/lang/String
      // a5: goto ac
      // a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // ab: athrow
      // ac: astore 1
      // ad: aload 1
      // ae: areturn
   }

   public static void n() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Jg2(), a(19447, 5949228850590451620L));
      long var1 = 266288712085965362L;
      Object[] var0 = var10001;
      Ref.h(266288712085965362L, var0, var1);
   }

   public static String k(String var0) {
      byte[] var1 = null;

      try {
         var1 = var0.getBytes(b(-17871, 6541));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      Registry.packArgs(var1);
      long var3 = 181927678435110934L;
      Object var10001 = Ref.h2(181927678435110934L, var3);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public static String Q(String var0) {
      byte[] var1 = null;

      try {
         var1 = (var0 + (String)Registry.lookupField(607044583428230202L).get(null)).getBytes(b(-17871, 6541));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      Registry.packArgs(var1);
      long var3 = 181927678435110934L;
      Object var10001 = Ref.h2(181927678435110934L, var3);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public static String Q(byte[] var0) {
      Ky4[] var10000 = YT3_2.c();
      String var2 = null;
      Ky4[] var1 = var10000;

      try {
         MessageDigest var3 = MessageDigest.getInstance(b(-17896, -24721));
         var3.update(var0);
         byte[] var4 = var3.digest();
         char[] var5 = new char[a(16342, 4108232943243752354L)];
         int var6 = 0;
         int var7 = 0;

         while (var7 < a(4582, 1566704523461713382L)) {
            byte var8 = var4[var7];
            var5[var6++] = ((char[])Registry.lookupField(351020545250157143L).get(null))[var8 >>> 4 & a(20356, 5386978590795957157L)];
            var5[var6++] = ((char[])Registry.lookupField(351020545250157143L).get(null))[var8 & a(20191, 4029404329481437936L)];
            var7++;
            if (var1 == null) {
               break;
            }
         }

         var2 = new String(var5);
      } catch (Exception var9) {
         var9.printStackTrace();
      }

      return var2;
   }

   public static String q(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: sipush -17896
      // 07: sipush -24721
      // 0a: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 0d: invokestatic java/security/MessageDigest.getInstance (Ljava/lang/String;)Ljava/security/MessageDigest;
      // 10: astore 2
      // 11: aload 2
      // 12: aload 0
      // 13: invokevirtual java/lang/String.getBytes ()[B
      // 16: invokevirtual java/security/MessageDigest.digest ([B)[B
      // 19: astore 3
      // 1a: new java/lang/StringBuffer
      // 1d: dup
      // 1e: invokespecial java/lang/StringBuffer.<init> ()V
      // 21: astore 4
      // 23: bipush 0
      // 24: istore 5
      // 26: iload 5
      // 28: aload 3
      // 29: arraylength
      // 2a: if_icmpge 83
      // 2d: aload 3
      // 2e: iload 5
      // 30: baload
      // 31: sipush 11201
      // 34: ldc2_w 5180688738096965555
      // 37: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 3a: iand
      // 3b: istore 6
      // 3d: aload 1
      // 3e: ifnull 89
      // 41: aload 1
      // 42: ifnull 7f
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: iload 6
      // 4e: sipush 4582
      // 51: ldc2_w 1566704523461713382
      // 54: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 57: if_icmpge 71
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 4
      // 63: ldc_w "0"
      // 66: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 69: pop
      // 6a: goto 71
      // 6d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: aload 4
      // 73: iload 6
      // 75: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 78: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 7b: pop
      // 7c: iinc 5 1
      // 7f: aload 1
      // 80: ifnonnull 26
      // 83: aload 4
      // 85: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 88: astore 0
      // 89: goto 9a
      // 8c: astore 3
      // 8d: aload 3
      // 8e: invokevirtual java/lang/Exception.printStackTrace ()V
      // 91: new java/lang/RuntimeException
      // 94: dup
      // 95: aload 3
      // 96: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
      // 99: athrow
      // 9a: aload 0
      // 9b: areturn
   }

   public static String Z(String var0) {
      Registry.packArgs(var0);
      long var1 = 449848118550381289L;
      Object var10001 = Ref.h2(449848118550381289L, var1);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      return var10001.substring(a(22081, 7904724917460113939L), a(32650, 4379114587436528592L));
   }

   static void R() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: bipush 1
      // 004: bipush 1
      // 005: invokestatic com/finalshell/reflect/Registry.packArgs (II)[Ljava/lang/Object;
      // 008: ldc2_w 401056956354921780
      // 00b: astore 5
      // 00d: ldc2_w 401056956354921780
      // 010: aload 5
      // 012: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 015: goto 01c
      // 018: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: ldc2_w 513687511533565349
      // 01f: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 022: aconst_null
      // 023: dup2_x1
      // 024: pop2
      // 025: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 028: astore 0
      // 029: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 02c: ldc2_w 561847341732101275
      // 02f: astore 7
      // 031: ldc2_w 561847341732101275
      // 034: aload 7
      // 036: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 039: checkcast java/lang/Boolean
      // 03c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03f: goto 046
      // 042: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 045: athrow
      // 046: ifeq 0b7
      // 049: sipush -17870
      // 04c: sipush 32699
      // 04f: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 052: astore 1
      // 053: sipush -17917
      // 056: new javax/swing/ImageIcon
      // 059: dup
      // 05a: ldc_w com/finalshell/core/JT
      // 05d: new java/lang/StringBuilder
      // 060: dup
      // 061: invokespecial java/lang/StringBuilder.<init> ()V
      // 064: ldc_w "/"
      // 067: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06a: aload 1
      // 06b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 071: invokevirtual java/lang/Class.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 074: invokespecial javax/swing/ImageIcon.<init> (Ljava/net/URL;)V
      // 077: ldc2_w 420095333054729915
      // 07a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 07d: aconst_null
      // 07e: dup2_x1
      // 07f: pop2
      // 080: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 083: sipush 7232
      // 086: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 089: astore 1
      // 08a: new javax/swing/ImageIcon
      // 08d: dup
      // 08e: ldc_w com/finalshell/core/JT
      // 091: new java/lang/StringBuilder
      // 094: dup
      // 095: invokespecial java/lang/StringBuilder.<init> ()V
      // 098: ldc_w "/"
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: aload 1
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a5: invokevirtual java/lang/Class.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 0a8: invokespecial javax/swing/ImageIcon.<init> (Ljava/net/URL;)V
      // 0ab: ldc2_w 404273350304987593
      // 0ae: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0b1: aconst_null
      // 0b2: dup2_x1
      // 0b3: pop2
      // 0b4: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0b7: new java/io/File
      // 0ba: dup
      // 0bb: ldc2_w 179276309776747034
      // 0be: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0c1: aconst_null
      // 0c2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c5: checkcast java/lang/String
      // 0c8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0cb: astore 1
      // 0cc: aload 1
      // 0cd: invokevirtual java/io/File.exists ()Z
      // 0d0: aload 0
      // 0d1: ifnull 0e9
      // 0d4: ifne 0ea
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: aload 1
      // 0df: invokevirtual java/io/File.mkdirs ()Z
      // 0e2: goto 0e9
      // 0e5: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: pop
      // 0ea: invokestatic javax/swing/filechooser/FileSystemView.getFileSystemView ()Ljavax/swing/filechooser/FileSystemView;
      // 0ed: astore 2
      // 0ee: aload 2
      // 0ef: invokevirtual javax/swing/filechooser/FileSystemView.getHomeDirectory ()Ljava/io/File;
      // 0f2: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0f5: ldc2_w 149082991182987426
      // 0f8: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0fb: aconst_null
      // 0fc: dup2_x1
      // 0fd: pop2
      // 0fe: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 101: invokestatic java/lang/System.getenv ()Ljava/util/Map;
      // 104: astore 3
      // 105: aload 0
      // 106: ifnull 21c
      // 109: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10c: ldc2_w 253808553645062345
      // 10f: astore 9
      // 111: ldc2_w 253808553645062345
      // 114: aload 9
      // 116: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 119: checkcast java/lang/Boolean
      // 11c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11f: goto 126
      // 122: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 125: athrow
      // 126: ifne 169
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 3
      // 131: sipush -17800
      // 134: sipush 11060
      // 137: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 13a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 13f: checkcast java/lang/String
      // 142: astore 4
      // 144: aload 4
      // 146: aload 0
      // 147: ifnull 19f
      // 14a: ifnull 169
      // 14d: goto 154
      // 150: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 153: athrow
      // 154: aload 4
      // 156: ldc2_w 149082991182987426
      // 159: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 15c: aconst_null
      // 15d: dup2_x1
      // 15e: pop2
      // 15f: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 162: goto 169
      // 165: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: ldc2_w 420095333054729915
      // 16c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 16f: aconst_null
      // 170: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 173: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 176: ldc2_w 303906516901845999
      // 179: astore 11
      // 17b: ldc2_w 303906516901845999
      // 17e: aload 11
      // 180: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 183: goto 18a
      // 186: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 189: athrow
      // 18a: ldc2_w 435733055424662411
      // 18d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 190: aconst_null
      // 191: dup2_x1
      // 192: pop2
      // 193: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 196: sipush -17821
      // 199: sipush -5617
      // 19c: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 19f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a2: ldc2_w 185446499515053043
      // 1a5: astore 13
      // 1a7: ldc2_w 185446499515053043
      // 1aa: aload 13
      // 1ac: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1af: goto 1b6
      // 1b2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b5: athrow
      // 1b6: ldc2_w 177860219788792196
      // 1b9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1bc: aconst_null
      // 1bd: dup2_x1
      // 1be: pop2
      // 1bf: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 1c2: ldc2_w 420095333054729915
      // 1c5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1c8: aconst_null
      // 1c9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1cc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1cf: ldc2_w 608167142299993511
      // 1d2: astore 15
      // 1d4: ldc2_w 608167142299993511
      // 1d7: aload 15
      // 1d9: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1dc: goto 1e3
      // 1df: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e2: athrow
      // 1e3: ldc2_w 471099731952994576
      // 1e6: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1e9: aconst_null
      // 1ea: dup2_x1
      // 1eb: pop2
      // 1ec: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 1ef: ldc2_w 471099731952994576
      // 1f2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1f5: aconst_null
      // 1f6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1fc: ldc2_w 303906516901845999
      // 1ff: astore 17
      // 201: ldc2_w 303906516901845999
      // 204: aload 17
      // 206: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 209: goto 210
      // 20c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20f: athrow
      // 210: ldc2_w 213758190924332323
      // 213: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 216: aconst_null
      // 217: dup2_x1
      // 218: pop2
      // 219: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 21c: return
   }

   public static float Z$float() {
      return Registry.lookupField(602610102128352195L).getFloat(null);
   }

   public static void c(float var0) {
      Registry.lookupField(602610102128352195L).setFloat(null, var0);
   }

   public static BufferedImage E(BufferedImage param0, int param1, int param2, int param3, double param4, double param6) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aconst_null
      // 04: astore 9
      // 06: astore 8
      // 08: aload 0
      // 09: aload 8
      // 0b: ifnull 29
      // 0e: ifnull 43
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: new java/awt/image/BufferedImage
      // 1b: dup
      // 1c: iload 2
      // 1d: iload 3
      // 1e: iload 1
      // 1f: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: astore 9
      // 2b: aload 9
      // 2d: invokevirtual java/awt/image/BufferedImage.createGraphics ()Ljava/awt/Graphics2D;
      // 30: astore 10
      // 32: dload 4
      // 34: dload 6
      // 36: invokestatic java/awt/geom/AffineTransform.getScaleInstance (DD)Ljava/awt/geom/AffineTransform;
      // 39: astore 11
      // 3b: aload 10
      // 3d: aload 0
      // 3e: aload 11
      // 40: invokevirtual java/awt/Graphics2D.drawRenderedImage (Ljava/awt/image/RenderedImage;Ljava/awt/geom/AffineTransform;)V
      // 43: aload 9
      // 45: areturn
   }

   public static String G(String var0, String var1) {
      String var2 = null;
      int var3 = var0.indexOf(var1);
      if (var3 > -1) {
         var2 = var0.substring(var3 + var1.length(), var0.indexOf(" ", var3));
      }

      return var2;
   }

   public static boolean P(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 14
      // 09: ifnull 2e
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/String.length ()I
      // 17: aload 1
      // 18: ifnull 41
      // 1b: sipush 11201
      // 1e: ldc2_w 5180688738096965555
      // 21: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 24: if_icmple 34
      // 27: goto 2e
      // 2a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: ireturn
      // 30: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 0
      // 35: sipush -17861
      // 38: sipush 29534
      // 3b: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 3e: invokevirtual java/lang/String.matches (Ljava/lang/String;)Z
      // 41: ireturn
   }

   public static void N(File var0, String var1, String var2, CH var3) throws IOException {
      ArrayList var4 = new ArrayList();
      var4.add(var0);
      Registry.packArgs(var4, var1, var2, var3);
      long var5 = 362139831186535017L;
      Ref.h2(362139831186535017L, var5);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public static void E(List param0, String param1, String param2, CH param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/io/File
      // 003: dup
      // 004: aload 2
      // 005: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 008: astore 5
      // 00a: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 00d: new org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream
      // 010: dup
      // 011: new java/io/FileOutputStream
      // 014: dup
      // 015: aload 5
      // 017: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 01a: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;)V
      // 01d: invokespecial org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream.<init> (Ljava/io/OutputStream;)V
      // 020: astore 6
      // 022: new org/apache/commons/compress/archivers/tar/TarArchiveOutputStream
      // 025: dup
      // 026: aload 6
      // 028: sipush -17871
      // 02b: sipush 6541
      // 02e: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 031: invokespecial org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.<init> (Ljava/io/OutputStream;Ljava/lang/String;)V
      // 034: astore 7
      // 036: aload 2
      // 037: invokevirtual java/lang/String.length ()I
      // 03a: bipush 1
      // 03b: isub
      // 03c: istore 8
      // 03e: aload 0
      // 03f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 044: astore 9
      // 046: astore 4
      // 048: aload 9
      // 04a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04f: ifeq 0d2
      // 052: aload 9
      // 054: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 059: checkcast java/io/File
      // 05c: astore 10
      // 05e: aload 4
      // 060: ifnull 115
      // 063: aload 10
      // 065: aload 4
      // 067: ifnull 087
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: invokevirtual java/io/File.isDirectory ()Z
      // 074: ifeq 0a8
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: aload 10
      // 080: goto 087
      // 083: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 086: athrow
      // 087: aload 7
      // 089: aload 1
      // 08a: aload 3
      // 08b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 08e: ldc2_w 178174333468076279
      // 091: astore 11
      // 093: ldc2_w 178174333468076279
      // 096: aload 11
      // 098: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 09b: pop
      // 09c: goto 0a3
      // 09f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 4
      // 0a5: ifnonnull 0cd
      // 0a8: aload 7
      // 0aa: aload 10
      // 0ac: aload 1
      // 0ad: aload 3
      // 0ae: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b1: ldc2_w 606153109341102551
      // 0b4: astore 13
      // 0b6: ldc2_w 606153109341102551
      // 0b9: aload 13
      // 0bb: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0be: pop
      // 0bf: goto 0c6
      // 0c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: goto 0cd
      // 0c9: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: aload 4
      // 0cf: ifnonnull 048
      // 0d2: aload 7
      // 0d4: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.close ()V
      // 0d7: aload 3
      // 0d8: new java/lang/StringBuilder
      // 0db: dup
      // 0dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0df: sipush -17801
      // 0e2: sipush 20587
      // 0e5: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: aload 5
      // 0ed: invokevirtual java/io/File.length ()J
      // 0f0: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 0f3: ldc2_w 408529162510360196
      // 0f6: astore 15
      // 0f8: ldc2_w 408529162510360196
      // 0fb: aload 15
      // 0fd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 100: checkcast java/lang/String
      // 103: goto 10a
      // 106: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 109: athrow
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 110: invokeinterface com/finalshell/core/CH.d (Ljava/lang/String;)V 2
      // 115: return
   }

   public static void i(File param0, TarArchiveOutputStream param1, String param2, CH param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 007: aload 2
      // 008: ldc_w "/"
      // 00b: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 00e: astore 5
      // 010: astore 4
      // 012: aload 5
      // 014: ldc_w "\\"
      // 017: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 01a: aload 4
      // 01c: ifnull 050
      // 01f: ifeq 03c
      // 022: goto 029
      // 025: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: aload 5
      // 02b: sipush -17910
      // 02e: sipush 9313
      // 031: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 034: ldc_w "/"
      // 037: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 03a: astore 5
      // 03c: aload 5
      // 03e: ldc_w "/"
      // 041: aload 4
      // 043: ifnull 075
      // 046: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: ifne 06a
      // 053: new java/lang/StringBuilder
      // 056: dup
      // 057: invokespecial java/lang/StringBuilder.<init> ()V
      // 05a: aload 5
      // 05c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05f: ldc_w "/"
      // 062: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 065: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 068: astore 5
      // 06a: aload 5
      // 06c: sipush -17820
      // 06f: sipush -19938
      // 072: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 075: ldc_w "/"
      // 078: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 07b: astore 5
      // 07d: new org/apache/commons/compress/archivers/tar/TarArchiveEntry
      // 080: dup
      // 081: aload 5
      // 083: invokespecial org/apache/commons/compress/archivers/tar/TarArchiveEntry.<init> (Ljava/lang/String;)V
      // 086: astore 6
      // 088: aload 6
      // 08a: aload 0
      // 08b: invokevirtual java/io/File.lastModified ()J
      // 08e: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveEntry.setModTime (J)V
      // 091: aload 1
      // 092: aload 6
      // 094: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.putArchiveEntry (Lorg/apache/commons/compress/archivers/ArchiveEntry;)V
      // 097: aload 1
      // 098: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.closeArchiveEntry ()V
      // 09b: aload 3
      // 09c: new java/lang/StringBuilder
      // 09f: dup
      // 0a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a3: sipush -17834
      // 0a6: sipush 17468
      // 0a9: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: aload 5
      // 0b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b7: invokeinterface com/finalshell/core/CH.d (Ljava/lang/String;)V 2
      // 0bc: aload 0
      // 0bd: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 0c0: astore 7
      // 0c2: aload 7
      // 0c4: astore 8
      // 0c6: aload 8
      // 0c8: arraylength
      // 0c9: istore 9
      // 0cb: bipush 0
      // 0cc: istore 10
      // 0ce: iload 10
      // 0d0: iload 9
      // 0d2: if_icmpge 145
      // 0d5: aload 8
      // 0d7: iload 10
      // 0d9: aaload
      // 0da: astore 11
      // 0dc: aload 11
      // 0de: aload 4
      // 0e0: ifnull 0f9
      // 0e3: invokevirtual java/io/File.isDirectory ()Z
      // 0e6: ifeq 119
      // 0e9: goto 0f0
      // 0ec: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: aload 11
      // 0f2: goto 0f9
      // 0f5: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: aload 2
      // 0fb: aload 3
      // 0fc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ff: ldc2_w 178174333468076279
      // 102: astore 12
      // 104: ldc2_w 178174333468076279
      // 107: aload 12
      // 109: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 10c: pop
      // 10d: goto 114
      // 110: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 113: athrow
      // 114: aload 4
      // 116: ifnonnull 13d
      // 119: aload 1
      // 11a: aload 11
      // 11c: aload 2
      // 11d: aload 3
      // 11e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 121: ldc2_w 606153109341102551
      // 124: astore 14
      // 126: ldc2_w 606153109341102551
      // 129: aload 14
      // 12b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 12e: pop
      // 12f: goto 136
      // 132: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 135: athrow
      // 136: goto 13d
      // 139: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: iinc 10 1
      // 140: aload 4
      // 142: ifnonnull 0ce
      // 145: return
   }

   public static void P(TarArchiveOutputStream var0, File var1, String var2, CH var3) throws IOException {
      Ky4[] var10000 = YT3_2.c();
      String var5 = var1.getAbsolutePath().replace(var2, "/");
      Ky4[] var4 = var10000;

      String var10001;
      label39: {
         label38: {
            try {
               var14 = var5;
               var10001 = "\\";
               if (var4 == null) {
                  break label39;
               }

               if (!var5.contains("\\")) {
                  break label38;
               }
            } catch (IOException var11) {
               throw a(var11);
            }

            var5 = var5.replaceAll(b(-17877, 25268), "/");
         }

         var14 = var5;
         var10001 = b(-17820, -19938);
      }

      var5 = var14.replaceAll(var10001, "/");
      TarArchiveEntry var6 = new TarArchiveEntry(var5);
      var6.setSize(var1.length());
      var6.setModTime(var1.lastModified());
      var0.setLongFileMode(2);
      var0.putArchiveEntry(var6);
      var3.d(b(-17911, -13800) + var5);
      BufferedInputStream var7 = new BufferedInputStream(new FileInputStream(var1));
      byte[] var8 = new byte[a(18270, 8354231394418395967L)];
      int var9 = -1;

      while (true) {
         if ((var9 = var7.read(var8)) != -1) {
            try {
               var0.write(var8, 0, var9);
               if (var4 == null) {
                  break;
               }

               if (var4 != null) {
                  continue;
               }
            } catch (IOException var10) {
               throw a(var10);
            }
         }

         var7.close();
         var0.closeArchiveEntry();
         break;
      }
   }

   public static void O(String var0, String var1, boolean var2) throws IOException {
      File var3 = new File(var0);
      TarArchiveInputStream var4 = new TarArchiveInputStream(new GzipCompressorInputStream(new FileInputStream(var3)), b(-17891, 4558));
      Registry.packArgs(var4, var0, var1, var2);
      long var5 = 615154216996037591L;
      Ref.h2(615154216996037591L, var5);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public static void U(TarArchiveInputStream param0, String param1, String param2, boolean param3) throws IOException {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/io/File
      // 003: dup
      // 004: aload 1
      // 005: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 008: astore 5
      // 00a: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 00d: aconst_null
      // 00e: astore 6
      // 010: astore 4
      // 012: aload 0
      // 013: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveInputStream.getNextTarEntry ()Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;
      // 016: dup
      // 017: astore 6
      // 019: ifnull 154
      // 01c: aload 6
      // 01e: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveEntry.getName ()Ljava/lang/String;
      // 021: astore 7
      // 023: aload 6
      // 025: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveEntry.isDirectory ()Z
      // 028: aload 4
      // 02a: ifnull 15d
      // 02d: ifeq 0a8
      // 030: goto 037
      // 033: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: new java/lang/StringBuilder
      // 03a: dup
      // 03b: invokespecial java/lang/StringBuilder.<init> ()V
      // 03e: aload 2
      // 03f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 042: getstatic java/io/File.separator Ljava/lang/String;
      // 045: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 048: aload 7
      // 04a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 050: astore 8
      // 052: new java/io/File
      // 055: dup
      // 056: aload 8
      // 058: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 05b: astore 9
      // 05d: aload 9
      // 05f: invokevirtual java/io/File.exists ()Z
      // 062: aload 4
      // 064: ifnull 07f
      // 067: ifne 07e
      // 06a: goto 071
      // 06d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 9
      // 073: invokevirtual java/io/File.mkdirs ()Z
      // 076: pop
      // 077: goto 07e
      // 07a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: iload 3
      // 07f: aload 4
      // 081: ifnull 0a2
      // 084: ifeq 0a3
      // 087: goto 08e
      // 08a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: aload 9
      // 090: aload 6
      // 092: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveEntry.getLastModifiedDate ()Ljava/util/Date;
      // 095: invokevirtual java/util/Date.getTime ()J
      // 098: invokevirtual java/io/File.setLastModified (J)Z
      // 09b: goto 0a2
      // 09e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: pop
      // 0a3: aload 4
      // 0a5: ifnonnull 14f
      // 0a8: new java/io/File
      // 0ab: dup
      // 0ac: aload 2
      // 0ad: aload 7
      // 0af: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0b2: astore 8
      // 0b4: aload 8
      // 0b6: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0b9: invokevirtual java/io/File.exists ()Z
      // 0bc: aload 4
      // 0be: ifnull 0da
      // 0c1: ifne 0db
      // 0c4: goto 0cb
      // 0c7: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: aload 8
      // 0cd: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0d0: invokevirtual java/io/File.mkdirs ()Z
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: pop
      // 0db: new java/io/BufferedOutputStream
      // 0de: dup
      // 0df: new java/io/FileOutputStream
      // 0e2: dup
      // 0e3: aload 8
      // 0e5: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 0e8: invokespecial java/io/BufferedOutputStream.<init> (Ljava/io/OutputStream;)V
      // 0eb: astore 9
      // 0ed: sipush 18292
      // 0f0: bipush -1
      // 0f1: istore 10
      // 0f3: ldc2_w 5100282277448452896
      // 0f6: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 0f9: newarray 8
      // 0fb: astore 11
      // 0fd: aload 0
      // 0fe: aload 11
      // 100: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveInputStream.read ([B)I
      // 103: dup
      // 104: istore 10
      // 106: bipush -1
      // 107: if_icmpeq 125
      // 10a: aload 9
      // 10c: aload 11
      // 10e: bipush 0
      // 10f: iload 10
      // 111: invokevirtual java/io/BufferedOutputStream.write ([BII)V
      // 114: aload 4
      // 116: ifnull 12a
      // 119: aload 4
      // 11b: ifnonnull 0fd
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 9
      // 127: invokevirtual java/io/BufferedOutputStream.close ()V
      // 12a: iload 3
      // 12b: aload 4
      // 12d: ifnull 14e
      // 130: ifeq 14f
      // 133: goto 13a
      // 136: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: aload 8
      // 13c: aload 6
      // 13e: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveEntry.getLastModifiedDate ()Ljava/util/Date;
      // 141: invokevirtual java/util/Date.getTime ()J
      // 144: invokevirtual java/io/File.setLastModified (J)Z
      // 147: goto 14e
      // 14a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: pop
      // 14f: aload 4
      // 151: ifnonnull 012
      // 154: aload 0
      // 155: invokevirtual org/apache/commons/compress/archivers/tar/TarArchiveInputStream.close ()V
      // 158: aload 5
      // 15a: invokevirtual java/io/File.delete ()Z
      // 15d: pop
      // 15e: return
   }

   public static Border D$Border() {
      Registry.packArgs(3, 5);
      long var0 = 188631797336214587L;
      Object var10001 = Ref.h2(188631797336214587L, var0);

      try {
         return (Border)var10001;
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public static Border a(int var0, int var1) {
      return BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.red), BorderFactory.createEmptyBorder(var0, var1, var0, var1));
   }

   public static String s(File var0) {
      Ky4[] var10000 = YT3_2.c();
      String var2 = "";
      Ky4[] var1 = var10000;

      try {
         FileInputStream var3 = new FileInputStream(var0);
         MessageDigest var4 = MessageDigest.getInstance(b(-17849, -599));
         byte[] var5 = new byte[a(11967, 3081740741108720257L)];
         int var6 = -1;

         while ((var6 = var3.read(var5, 0, a(11967, 3081740741108720257L))) != -1) {
            try {
               var4.update(var5, 0, var6);
               if (var1 == null) {
                  return var2;
               }

               if (var1 == null) {
                  break;
               }
            } catch (FileNotFoundException var8) {
               throw a(var8);
            }
         }

         BigInteger var7 = new BigInteger(1, var4.digest());
         var2 = var7.toString(a(4582, 1566704523461713382L));
      } catch (FileNotFoundException var9) {
         var9.printStackTrace();
      } catch (NoSuchAlgorithmException var10) {
         var10.printStackTrace();
      } catch (IOException var11) {
         var11.printStackTrace();
      }

      return var2;
   }

   public static void V(Window var0) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.Fe2(var0));
      long var2 = 434592463220957006L;
      Object[] var1 = var10001;
      Ref.h(434592463220957006L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static void F(Window var0) {
      SwingUtilities.invokeLater(new Kv4(var0));
   }

   public static int h(String var0, Font var1) {
      ((BufferedImage)Registry.lookupField(513687511533565349L).get(null)).getGraphics().setFont(var1);
      return ((BufferedImage)Registry.lookupField(513687511533565349L).get(null)).getGraphics().getFontMetrics().stringWidth(var0);
   }

   public static Icon T(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: bipush 1
      // 004: istore 2
      // 005: bipush 0
      // 006: istore 3
      // 007: bipush 0
      // 008: istore 4
      // 00a: astore 1
      // 00b: aconst_null
      // 00c: astore 5
      // 00e: aload 0
      // 00f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 012: ldc_w com/finalshell/ui/model/Tf4
      // 015: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 018: aload 1
      // 019: ifnull 09a
      // 01c: ifeq 099
      // 01f: goto 026
      // 022: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 0
      // 027: checkcast com/finalshell/ui/model/Tf4
      // 02a: astore 6
      // 02c: aload 6
      // 02e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 031: ldc2_w 125751153336179464
      // 034: astore 8
      // 036: astore 7
      // 038: ldc2_w 125751153336179464
      // 03b: aload 7
      // 03d: aload 8
      // 03f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 042: checkcast java/lang/Boolean
      // 045: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 048: goto 04f
      // 04b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: istore 4
      // 051: aload 6
      // 053: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 056: ldc2_w 490764181082108623
      // 059: astore 10
      // 05b: astore 9
      // 05d: ldc2_w 490764181082108623
      // 060: aload 9
      // 062: aload 10
      // 064: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 067: checkcast java/lang/Boolean
      // 06a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06d: goto 074
      // 070: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 073: athrow
      // 074: istore 2
      // 075: aload 6
      // 077: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 07a: ldc2_w 429314168584613002
      // 07d: astore 12
      // 07f: astore 11
      // 081: ldc2_w 429314168584613002
      // 084: aload 11
      // 086: aload 12
      // 088: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 08b: checkcast java/lang/Boolean
      // 08e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 091: goto 098
      // 094: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 097: athrow
      // 098: istore 3
      // 099: iload 3
      // 09a: aload 1
      // 09b: ifnull 0da
      // 09e: ifeq 0d8
      // 0a1: goto 0a8
      // 0a4: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: iload 4
      // 0aa: ifne 0c6
      // 0ad: goto 0b4
      // 0b0: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: ldc2_w 420095333054729915
      // 0b7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ba: aconst_null
      // 0bb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0be: checkcast javax/swing/Icon
      // 0c1: astore 5
      // 0c3: goto 0fe
      // 0c6: ldc2_w 471099731952994576
      // 0c9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0cc: aconst_null
      // 0cd: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0d0: checkcast javax/swing/Icon
      // 0d3: astore 5
      // 0d5: goto 0fe
      // 0d8: iload 4
      // 0da: ifne 0ef
      // 0dd: ldc2_w 435733055424662411
      // 0e0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e3: aconst_null
      // 0e4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e7: checkcast javax/swing/Icon
      // 0ea: astore 5
      // 0ec: goto 0fe
      // 0ef: ldc2_w 213758190924332323
      // 0f2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0f5: aconst_null
      // 0f6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f9: checkcast javax/swing/Icon
      // 0fc: astore 5
      // 0fe: aload 5
      // 100: areturn
   }

   public static String i$String() {
      Ky4[] var10000 = YT3_2.c();
      Map var1 = System.getenv();
      Ky4[] var0 = var10000;
      String var2 = null;
      Registry.emptyArgs();
      long var5 = 253808553645062345L;
      Object var10001 = Ref.h2(253808553645062345L, var5);

      try {
         var10 = (Boolean)var10001;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      if (var10) {
         var2 = (String)var1.get(b(-17851, -30026));
      } else {
         String var3 = (String)var1.get(b(-17857, 27469));
         String var4 = (String)var1.get(b(-17808, 13950));
         var2 = var3;

         try {
            if (var0 == null) {
               return var4;
            }

            if (var4 == null) {
               return var2;
            }
         } catch (RuntimeException var8) {
            throw a(var8);
         }

         var2 = var4;
      }

      return var2;
   }

   public static void f(Process var0) {
      try {
         BufferedReader var1 = new BufferedReader(new InputStreamReader(var0.getErrorStream()));
         BufferedReader var2 = new BufferedReader(new InputStreamReader(var0.getInputStream()));
         Thread var3 = new Thread(new com.finalshell.task.LV3(var1));
         Thread var4 = new Thread(new com.finalshell.task.YG3(var2));
         var3.start();
         var4.start();
         var3.join();
         var4.join();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public static String R(String var0, String var1) {
      Object var2 = null;
      Registry.emptyArgs();
      long var4 = 454647487873911743L;
      Object var10001 = Ref.h2(454647487873911743L, var4);

      try {
         var8 = (Boolean)var10001;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      if (var8) {
         try {
            Process var3 = Runtime.getRuntime().exec(new String[]{b(-17886, 23292), var1, var0});
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

      return (String)var2;
   }

   public static void u(String var0) {
      Ky4[] var10000 = YT3_2.c();
      Toolkit var2 = Toolkit.getDefaultToolkit();
      Clipboard var3 = var2.getSystemClipboard();
      Ky4[] var1 = var10000;
      StringSelection var4 = new StringSelection(var0);
      var3.setContents(var4, null);
      Clipboard var5 = Toolkit.getDefaultToolkit().getSystemSelection();

      label20: {
         try {
            var7 = var5;
            if (var1 == null) {
               break label20;
            }

            if (var5 == null) {
               return;
            }
         } catch (RuntimeException var6) {
            throw a(var6);
         }

         var7 = var5;
      }

      var7.setContents(var4, null);
   }

   public static SSLContext B() throws Exception {
      TrustManagerFactory var0 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      Ox2 var1 = new Ox2();
      TrustManager[] var2 = new TrustManager[]{var1};
      SSLContext var3 = SSLContext.getInstance(b(-17806, -8197));
      var3.init(null, var2, null);
      return var3;
   }

   public static SSLContext M$SSLContext() throws Exception {
      TrustManagerFactory var0 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      Ox2 var1 = new Ox2();
      TrustManager[] var2 = new TrustManager[]{var1};
      SSLContext var3 = SSLContext.getInstance(b(-17819, -11378));
      var3.init(null, var2, null);
      return var3;
   }

   static void i$void() {
      String var0 = (String)Registry.lookupField(205985593854165162L).get(null);
      var0 = (String)Registry.lookupField(544011674795306049L).get(null);
      String var1 = b(-17802, -2526);
      Registry.packArgs(var0, var1);
      long var3 = 405719060143778520L;
      Ref.h2(405719060143778520L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public static String A$String(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 2
      // 002: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 005: bipush 0
      // 006: istore 3
      // 007: astore 1
      // 008: iload 3
      // 009: bipush 5
      // 00a: if_icmpge 1c8
      // 00d: aconst_null
      // 00e: astore 4
      // 010: aconst_null
      // 011: astore 5
      // 013: aconst_null
      // 014: astore 6
      // 016: new java/net/URL
      // 019: dup
      // 01a: new java/lang/StringBuilder
      // 01d: dup
      // 01e: invokespecial java/lang/StringBuilder.<init> ()V
      // 021: sipush -17863
      // 024: sipush 25437
      // 027: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 02a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02d: aload 0
      // 02e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 031: sipush -17883
      // 034: sipush -20368
      // 037: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 03a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 040: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 043: astore 7
      // 045: aload 7
      // 047: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 04a: checkcast java/net/HttpURLConnection
      // 04d: astore 8
      // 04f: aload 8
      // 051: sipush 30738
      // 054: ldc2_w 2639703206606156835
      // 057: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 05a: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 05d: aload 8
      // 05f: sipush 28492
      // 062: ldc2_w 8897538828648719181
      // 065: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 068: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 06b: aload 8
      // 06d: bipush 0
      // 06e: invokevirtual java/net/HttpURLConnection.setUseCaches (Z)V
      // 071: aload 8
      // 073: sipush -17812
      // 076: sipush 28967
      // 079: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 07c: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 07f: aload 8
      // 081: invokevirtual java/net/HttpURLConnection.connect ()V
      // 084: aload 8
      // 086: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 089: astore 4
      // 08b: new java/io/InputStreamReader
      // 08e: dup
      // 08f: aload 4
      // 091: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 094: astore 9
      // 096: new java/io/BufferedReader
      // 099: dup
      // 09a: aload 9
      // 09c: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 09f: astore 10
      // 0a1: ldc_w ""
      // 0a4: astore 11
      // 0a6: new java/lang/StringBuffer
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuffer.<init> ()V
      // 0ad: astore 12
      // 0af: aload 10
      // 0b1: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0b4: dup
      // 0b5: astore 11
      // 0b7: ifnull 0f6
      // 0ba: aload 11
      // 0bc: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0bf: aload 1
      // 0c0: ifnull 0fb
      // 0c3: ldc_w ""
      // 0c6: aload 1
      // 0c7: ifnull 0b5
      // 0ca: goto 0d1
      // 0cd: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d4: ifne 0af
      // 0d7: aload 12
      // 0d9: new java/lang/StringBuilder
      // 0dc: dup
      // 0dd: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e0: aload 11
      // 0e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e5: ldc_w "\n"
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ee: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0f1: pop
      // 0f2: aload 1
      // 0f3: ifnonnull 0af
      // 0f6: aload 12
      // 0f8: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 0fb: astore 2
      // 0fc: aload 4
      // 0fe: aload 1
      // 0ff: ifnull 10e
      // 102: ifnull 11b
      // 105: goto 10c
      // 108: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: aload 4
      // 10e: invokevirtual java/io/InputStream.close ()V
      // 111: goto 11b
      // 114: astore 13
      // 116: aload 13
      // 118: invokevirtual java/io/IOException.printStackTrace ()V
      // 11b: aload 5
      // 11d: aload 1
      // 11e: ifnull 12d
      // 121: ifnull 1c8
      // 124: goto 12b
      // 127: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: aload 5
      // 12d: invokevirtual java/io/OutputStream.close ()V
      // 130: goto 1c8
      // 133: astore 13
      // 135: aload 13
      // 137: invokevirtual java/io/IOException.printStackTrace ()V
      // 13a: goto 1c8
      // 13d: astore 6
      // 13f: aload 6
      // 141: invokevirtual java/lang/Exception.printStackTrace ()V
      // 144: aload 4
      // 146: aload 1
      // 147: ifnull 14f
      // 14a: ifnull 15c
      // 14d: aload 4
      // 14f: invokevirtual java/io/InputStream.close ()V
      // 152: goto 15c
      // 155: astore 6
      // 157: aload 6
      // 159: invokevirtual java/io/IOException.printStackTrace ()V
      // 15c: aload 5
      // 15e: aload 1
      // 15f: ifnull 16e
      // 162: ifnull 1c1
      // 165: goto 16c
      // 168: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 5
      // 16e: invokevirtual java/io/OutputStream.close ()V
      // 171: goto 1c1
      // 174: astore 6
      // 176: aload 6
      // 178: invokevirtual java/io/IOException.printStackTrace ()V
      // 17b: goto 1c1
      // 17e: astore 14
      // 180: aload 4
      // 182: aload 1
      // 183: ifnull 192
      // 186: ifnull 19f
      // 189: goto 190
      // 18c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: aload 4
      // 192: invokevirtual java/io/InputStream.close ()V
      // 195: goto 19f
      // 198: astore 15
      // 19a: aload 15
      // 19c: invokevirtual java/io/IOException.printStackTrace ()V
      // 19f: aload 5
      // 1a1: aload 1
      // 1a2: ifnull 1b1
      // 1a5: ifnull 1be
      // 1a8: goto 1af
      // 1ab: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: aload 5
      // 1b1: invokevirtual java/io/OutputStream.close ()V
      // 1b4: goto 1be
      // 1b7: astore 15
      // 1b9: aload 15
      // 1bb: invokevirtual java/io/IOException.printStackTrace ()V
      // 1be: aload 14
      // 1c0: athrow
      // 1c1: iinc 3 1
      // 1c4: aload 1
      // 1c5: ifnonnull 008
      // 1c8: aload 2
      // 1c9: areturn
   }

   public static String v(String param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aconst_null
      // 004: astore 3
      // 005: aconst_null
      // 006: astore 4
      // 008: astore 2
      // 009: bipush 0
      // 00a: istore 5
      // 00c: bipush 0
      // 00d: istore 6
      // 00f: iload 6
      // 011: bipush 5
      // 012: if_icmpge 1af
      // 015: new java/net/Socket
      // 018: dup
      // 019: aload 0
      // 01a: sipush 27950
      // 01d: ldc2_w 3329842492115132733
      // 020: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 023: invokespecial java/net/Socket.<init> (Ljava/lang/String;I)V
      // 026: astore 3
      // 027: aload 3
      // 028: sipush 9572
      // 02b: ldc2_w 1689713349289470236
      // 02e: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 031: invokevirtual java/net/Socket.setSoTimeout (I)V
      // 034: new java/lang/StringBuffer
      // 037: dup
      // 038: invokespecial java/lang/StringBuffer.<init> ()V
      // 03b: astore 7
      // 03d: new java/io/InputStreamReader
      // 040: dup
      // 041: aload 3
      // 042: invokevirtual java/net/Socket.getInputStream ()Ljava/io/InputStream;
      // 045: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 048: astore 8
      // 04a: new java/io/BufferedReader
      // 04d: dup
      // 04e: aload 8
      // 050: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 053: astore 9
      // 055: new java/io/OutputStreamWriter
      // 058: dup
      // 059: aload 3
      // 05a: invokevirtual java/net/Socket.getOutputStream ()Ljava/io/OutputStream;
      // 05d: invokespecial java/io/OutputStreamWriter.<init> (Ljava/io/OutputStream;)V
      // 060: astore 10
      // 062: aload 10
      // 064: new java/lang/StringBuilder
      // 067: dup
      // 068: invokespecial java/lang/StringBuilder.<init> ()V
      // 06b: aload 1
      // 06c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06f: sipush -17908
      // 072: sipush 31080
      // 075: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07e: invokevirtual java/io/OutputStreamWriter.write (Ljava/lang/String;)V
      // 081: aload 10
      // 083: invokevirtual java/io/OutputStreamWriter.flush ()V
      // 086: ldc_w ""
      // 089: astore 11
      // 08b: aload 9
      // 08d: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 090: dup
      // 091: astore 11
      // 093: ifnull 139
      // 096: aload 11
      // 098: aload 2
      // 099: ifnull 13e
      // 09c: ldc_w "#"
      // 09f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0a2: aload 2
      // 0a3: ifnull 124
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: ifne 116
      // 0b0: goto 0b7
      // 0b3: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 11
      // 0b9: ldc_w "%"
      // 0bc: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0bf: aload 2
      // 0c0: ifnull 124
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: ifne 116
      // 0cd: goto 0d4
      // 0d0: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 11
      // 0d6: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0d9: ldc_w ""
      // 0dc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0df: aload 2
      // 0e0: ifnull 124
      // 0e3: goto 0ea
      // 0e6: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: ifne 116
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: aload 7
      // 0f6: new java/lang/StringBuilder
      // 0f9: dup
      // 0fa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fd: aload 11
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: ldc_w "\n"
      // 105: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 108: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10b: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 10e: pop
      // 10f: goto 116
      // 112: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: aload 11
      // 118: sipush -17831
      // 11b: sipush 12389
      // 11e: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 121: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 124: aload 2
      // 125: ifnull 133
      // 128: ifeq 08b
      // 12b: goto 132
      // 12e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: bipush 1
      // 133: istore 5
      // 135: aload 2
      // 136: ifnonnull 08b
      // 139: aload 7
      // 13b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 13e: aload 2
      // 13f: ifnull 1b1
      // 142: astore 4
      // 144: aload 3
      // 145: ifnull 1af
      // 148: aload 3
      // 149: invokevirtual java/net/Socket.close ()V
      // 14c: goto 1af
      // 14f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 152: athrow
      // 153: astore 12
      // 155: goto 1af
      // 158: astore 7
      // 15a: sipush 12170
      // 15d: ldc2_w 494611179886738541
      // 160: invokestatic com/finalshell/core/Lk2.b (IJ)J
      // 163: invokestatic java/lang/Thread.sleep (J)V
      // 166: goto 170
      // 169: astore 8
      // 16b: aload 8
      // 16d: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 170: aload 3
      // 171: aload 2
      // 172: ifnull 180
      // 175: ifnull 1a8
      // 178: goto 17f
      // 17b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: aload 3
      // 180: invokevirtual java/net/Socket.close ()V
      // 183: goto 1a8
      // 186: astore 8
      // 188: goto 1a8
      // 18b: astore 13
      // 18d: aload 3
      // 18e: aload 2
      // 18f: ifnull 19d
      // 192: ifnull 1a5
      // 195: goto 19c
      // 198: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 3
      // 19d: invokevirtual java/net/Socket.close ()V
      // 1a0: goto 1a5
      // 1a3: astore 14
      // 1a5: aload 13
      // 1a7: athrow
      // 1a8: iinc 6 1
      // 1ab: aload 2
      // 1ac: ifnonnull 00f
      // 1af: aload 4
      // 1b1: areturn
   }

   public static void x(L9 param0, RouteTracePanel param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 007: ldc2_w 564648154927582737
      // 00a: astore 6
      // 00c: astore 5
      // 00e: ldc2_w 564648154927582737
      // 011: aload 5
      // 013: aload 6
      // 015: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 018: checkcast java/lang/String
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: astore 3
      // 023: astore 2
      // 024: aload 3
      // 025: aload 2
      // 026: ifnull 04e
      // 029: ifnull 122
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: ldc2_w 214628155357142695
      // 036: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 039: aconst_null
      // 03a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 03d: checkcast java/util/HashMap
      // 040: aload 3
      // 041: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 044: checkcast java/lang/String
      // 047: goto 04e
      // 04a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: astore 4
      // 050: aload 0
      // 051: aload 2
      // 052: ifnull 104
      // 055: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 058: ldc2_w 129926512000439480
      // 05b: astore 8
      // 05d: astore 7
      // 05f: ldc2_w 129926512000439480
      // 062: aload 7
      // 064: aload 8
      // 066: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 069: checkcast java/lang/String
      // 06c: goto 073
      // 06f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 072: athrow
      // 073: ifnonnull 0fc
      // 076: goto 07d
      // 079: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: aload 4
      // 07f: ifnonnull 0fc
      // 082: goto 089
      // 085: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 088: athrow
      // 089: ldc2_w 219500707619661044
      // 08c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 08f: aconst_null
      // 090: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 093: checkcast java/util/HashSet
      // 096: aload 3
      // 097: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 09a: aload 2
      // 09b: ifnull 0c7
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: ifne 0fc
      // 0a8: goto 0af
      // 0ab: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: ldc2_w 219500707619661044
      // 0b2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0b5: aconst_null
      // 0b6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b9: checkcast java/util/HashSet
      // 0bc: aload 3
      // 0bd: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0c0: goto 0c7
      // 0c3: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: pop
      // 0c8: ldc2_w 388376917454860932
      // 0cb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ce: aconst_null
      // 0cf: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0d2: new com/finalshell/task/AP
      // 0d5: dup
      // 0d6: aload 3
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: invokespecial com/finalshell/task/AP.<init> (Ljava/lang/String;Lcom/finalshell/core/L9;Lcom/finalshell/ui/panel/RouteTracePanel;)V
      // 0dc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0df: ldc2_w 434592463220957006
      // 0e2: astore 10
      // 0e4: astore 9
      // 0e6: ldc2_w 434592463220957006
      // 0e9: aload 9
      // 0eb: aload 10
      // 0ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f0: pop
      // 0f1: goto 0f8
      // 0f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: aload 2
      // 0f9: ifnonnull 122
      // 0fc: aload 0
      // 0fd: goto 104
      // 100: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 4
      // 106: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 109: ldc2_w 578949176184911929
      // 10c: astore 12
      // 10e: astore 11
      // 110: ldc2_w 578949176184911929
      // 113: aload 11
      // 115: aload 12
      // 117: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11a: pop
      // 11b: goto 122
      // 11e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 121: athrow
      // 122: return
   }

   public static Zh2_2 o(Y62_2 param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aconst_null
      // 04: astore 3
      // 05: astore 2
      // 06: aload 1
      // 07: aload 2
      // 08: ifnull 2d
      // 0b: ifnull e9
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: ldc2_w 447779733764178905
      // 18: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1b: aconst_null
      // 1c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f: checkcast java/util/Hashtable
      // 22: aload 1
      // 23: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 26: goto 2d
      // 29: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: checkcast com/finalshell/core/Zh2_2
      // 30: astore 3
      // 31: aload 0
      // 32: aload 1
      // 33: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 36: ldc2_w 240955186704653030
      // 39: astore 5
      // 3b: astore 4
      // 3d: ldc2_w 240955186704653030
      // 40: aload 4
      // 42: aload 5
      // 44: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 47: checkcast java/lang/Boolean
      // 4a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4d: goto 54
      // 50: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 53: athrow
      // 54: aload 2
      // 55: ifnull 76
      // 58: ifeq 65
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: goto e9
      // 65: ldc2_w 317469799130091897
      // 68: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 6b: aconst_null
      // 6c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6f: checkcast java/util/HashSet
      // 72: aload 1
      // 73: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 76: aload 2
      // 77: ifnull 9c
      // 7a: ifne cb
      // 7d: goto 84
      // 80: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: ldc2_w 317469799130091897
      // 87: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 8a: aconst_null
      // 8b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 8e: checkcast java/util/HashSet
      // 91: aload 1
      // 92: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 95: goto 9c
      // 98: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: pop
      // 9d: ldc2_w 388376917454860932
      // a0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // a3: aconst_null
      // a4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // a7: new com/finalshell/task/Zz2
      // aa: dup
      // ab: aload 1
      // ac: invokespecial com/finalshell/task/Zz2.<init> (Ljava/lang/String;)V
      // af: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // b2: ldc2_w 434592463220957006
      // b5: astore 7
      // b7: astore 6
      // b9: ldc2_w 434592463220957006
      // bc: aload 6
      // be: aload 7
      // c0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // c3: pop
      // c4: goto cb
      // c7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // ca: athrow
      // cb: aload 0
      // cc: aload 1
      // cd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // d0: ldc2_w 569884196137995953
      // d3: astore 9
      // d5: astore 8
      // d7: ldc2_w 569884196137995953
      // da: aload 8
      // dc: aload 9
      // de: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // e1: pop
      // e2: goto e9
      // e5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // e8: athrow
      // e9: aload 3
      // ea: areturn
   }

   public static void E(L9 param0, RouteTracePanel param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 007: ldc2_w 564648154927582737
      // 00a: astore 6
      // 00c: astore 5
      // 00e: ldc2_w 564648154927582737
      // 011: aload 5
      // 013: aload 6
      // 015: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 018: checkcast java/lang/String
      // 01b: goto 022
      // 01e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 021: athrow
      // 022: astore 3
      // 023: astore 2
      // 024: aload 3
      // 025: aload 2
      // 026: ifnull 04b
      // 029: ifnull 14f
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: ldc2_w 447779733764178905
      // 036: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 039: aconst_null
      // 03a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 03d: checkcast java/util/Hashtable
      // 040: aload 3
      // 041: invokevirtual java/util/Hashtable.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: checkcast com/finalshell/core/Zh2_2
      // 04e: astore 4
      // 050: aload 2
      // 051: ifnull 086
      // 054: aload 4
      // 056: ifnull 08a
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 0
      // 061: aload 4
      // 063: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 066: ldc2_w 432746213469381812
      // 069: astore 8
      // 06b: astore 7
      // 06d: ldc2_w 432746213469381812
      // 070: aload 7
      // 072: aload 8
      // 074: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 077: pop
      // 078: goto 07f
      // 07b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: goto 086
      // 082: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: aload 2
      // 087: ifnonnull 14f
      // 08a: aload 0
      // 08b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 08e: ldc2_w 433352816722078133
      // 091: astore 10
      // 093: astore 9
      // 095: ldc2_w 433352816722078133
      // 098: aload 9
      // 09a: aload 10
      // 09c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09f: checkcast java/lang/Boolean
      // 0a2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a5: goto 0ac
      // 0a8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: ifne 14f
      // 0af: goto 0b6
      // 0b2: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: aload 4
      // 0b8: ifnonnull 14f
      // 0bb: goto 0c2
      // 0be: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: ldc2_w 317469799130091897
      // 0c5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0c8: aconst_null
      // 0c9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0cc: checkcast java/util/HashSet
      // 0cf: aload 3
      // 0d0: invokevirtual java/util/HashSet.contains (Ljava/lang/Object;)Z
      // 0d3: aload 2
      // 0d4: ifnull 100
      // 0d7: goto 0de
      // 0da: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: ifne 14f
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: ldc2_w 317469799130091897
      // 0eb: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0ee: aconst_null
      // 0ef: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f2: checkcast java/util/HashSet
      // 0f5: aload 3
      // 0f6: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: pop
      // 101: aload 0
      // 102: bipush 1
      // 103: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 106: ldc2_w 409440255259990283
      // 109: astore 12
      // 10b: astore 11
      // 10d: ldc2_w 409440255259990283
      // 110: aload 11
      // 112: aload 12
      // 114: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 117: pop
      // 118: goto 11f
      // 11b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: ldc2_w 388376917454860932
      // 122: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 125: aconst_null
      // 126: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 129: new com/finalshell/task/Fk2
      // 12c: dup
      // 12d: aload 0
      // 12e: aload 1
      // 12f: aload 3
      // 130: invokespecial com/finalshell/task/Fk2.<init> (Lcom/finalshell/core/L9;Lcom/finalshell/ui/panel/RouteTracePanel;Ljava/lang/String;)V
      // 133: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 136: ldc2_w 434592463220957006
      // 139: astore 14
      // 13b: astore 13
      // 13d: ldc2_w 434592463220957006
      // 140: aload 13
      // 142: aload 14
      // 144: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 147: pop
      // 148: goto 14f
      // 14b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: return
   }

   public static Zh2_2 J$zh_2(String var0) {
      return O2.w(var0);
   }

   public static String S(String var0) {
      Charset var2 = Charset.forName(b(-17813, 5668));
      Pattern var3 = Pattern.compile(b(-17920, -27203));
      Matcher var4 = var3.matcher(var0);
      int var5 = 0;
      Ky4[] var10000 = YT3_2.c();
      int var6 = 0;
      StringBuffer var7 = new StringBuffer();
      Ky4[] var1 = var10000;

      int var10001;
      while (true) {
         if (var4.find(var5)) {
            Matcher var16 = var4;
            if (var1 != null) {
               var6 = var4.start();

               label38: {
                  try {
                     var17 = var6;
                     var10001 = var5;
                     if (var1 == null) {
                        break;
                     }

                     if (var6 <= var5) {
                        break label38;
                     }
                  } catch (RuntimeException var12) {
                     throw a(var12);
                  }

                  String var8 = var0.substring(var5, var6);
                  var7.append(var8);
               }

               var16 = var4;
            }

            String var14 = var16.group(1);
            int var9 = Integer.valueOf(var14, a(21550, 287018971744770128L));
            byte[] var10 = new byte[]{
               (byte)(var9 >> a(4685, 938966366543863398L) & a(4638, 5669694484475371008L)), (byte)(var9 & a(11201, 5180688738096965555L)), 0, 0
            };
            ByteBuffer var11 = ByteBuffer.wrap(var10);
            var7.append(String.valueOf(var2.decode(var11)).trim());
            var5 = var4.end();
            if (var1 != null) {
               continue;
            }
         }

         if (var1 == null) {
            return var0;
         }

         var6 = var0.length();
         var17 = var6;
         var10001 = var5;
         break;
      }

      if (var17 > var10001) {
         String var15 = var0.substring(var5, var6);
         var7.append(var15);
      }

      return var7.toString();
   }

   public static long h$long(String param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 2
      // 02: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 05: aconst_null
      // 06: astore 4
      // 08: astore 1
      // 09: aconst_null
      // 0a: astore 5
      // 0c: new java/net/URL
      // 0f: dup
      // 10: aload 0
      // 11: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 14: astore 3
      // 15: aload 3
      // 16: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 19: checkcast java/net/HttpURLConnection
      // 1c: astore 5
      // 1e: aload 5
      // 20: sipush 18624
      // 23: ldc2_w 1926404937933325483
      // 26: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 29: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 2c: aload 5
      // 2e: sipush 18624
      // 31: ldc2_w 1926404937933325483
      // 34: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 37: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 3a: aload 5
      // 3c: bipush 0
      // 3d: invokevirtual java/net/HttpURLConnection.setUseCaches (Z)V
      // 40: aload 5
      // 42: sipush -17812
      // 45: sipush 28967
      // 48: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 4b: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 4e: aload 5
      // 50: invokevirtual java/net/HttpURLConnection.getContentLength ()I
      // 53: i2l
      // 54: lstore 6
      // 56: aload 5
      // 58: aload 1
      // 59: ifnull 75
      // 5c: invokevirtual java/net/HttpURLConnection.connect ()V
      // 5f: aload 4
      // 61: ifnull 73
      // 64: aload 4
      // 66: invokevirtual java/io/FileOutputStream.close ()V
      // 69: goto 73
      // 6c: astore 8
      // 6e: aload 8
      // 70: invokevirtual java/io/IOException.printStackTrace ()V
      // 73: aload 5
      // 75: aload 1
      // 76: ifnull 85
      // 79: ifnull ce
      // 7c: goto 83
      // 7f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 5
      // 85: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 88: goto ce
      // 8b: astore 8
      // 8d: aload 8
      // 8f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 92: aload 8
      // 94: athrow
      // 95: astore 9
      // 97: aload 4
      // 99: aload 1
      // 9a: ifnull a9
      // 9d: ifnull b6
      // a0: goto a7
      // a3: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: aload 4
      // a9: invokevirtual java/io/FileOutputStream.close ()V
      // ac: goto b6
      // af: astore 10
      // b1: aload 10
      // b3: invokevirtual java/io/IOException.printStackTrace ()V
      // b6: aload 5
      // b8: aload 1
      // b9: ifnull c8
      // bc: ifnull cb
      // bf: goto c6
      // c2: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c5: athrow
      // c6: aload 5
      // c8: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // cb: aload 9
      // cd: athrow
      // ce: lload 6
      // d0: lreturn
   }

   public static void e(String param0, String param1, C22 param2) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 4
      // 003: aconst_null
      // 004: astore 6
      // 006: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 009: aconst_null
      // 00a: astore 7
      // 00c: astore 3
      // 00d: new java/net/URL
      // 010: dup
      // 011: aload 0
      // 012: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 015: astore 5
      // 017: aload 5
      // 019: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 01c: checkcast java/net/HttpURLConnection
      // 01f: astore 7
      // 021: aload 7
      // 023: sipush 19430
      // 026: ldc2_w 8705145600031131615
      // 029: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 02c: invokevirtual java/net/HttpURLConnection.setConnectTimeout (I)V
      // 02f: aload 7
      // 031: sipush 18624
      // 034: ldc2_w 1926404937933325483
      // 037: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 03a: invokevirtual java/net/HttpURLConnection.setReadTimeout (I)V
      // 03d: aload 7
      // 03f: bipush 0
      // 040: invokevirtual java/net/HttpURLConnection.setUseCaches (Z)V
      // 043: aload 7
      // 045: sipush -17909
      // 048: sipush 10296
      // 04b: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 04e: invokevirtual java/net/HttpURLConnection.setRequestMethod (Ljava/lang/String;)V
      // 051: aload 7
      // 053: invokevirtual java/net/HttpURLConnection.connect ()V
      // 056: aload 7
      // 058: invokevirtual java/net/HttpURLConnection.getInputStream ()Ljava/io/InputStream;
      // 05b: astore 8
      // 05d: new java/io/DataInputStream
      // 060: dup
      // 061: aload 8
      // 063: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 066: astore 9
      // 068: aload 7
      // 06a: invokevirtual java/net/HttpURLConnection.getResponseCode ()I
      // 06d: istore 10
      // 06f: new java/io/File
      // 072: dup
      // 073: new java/lang/StringBuilder
      // 076: dup
      // 077: invokespecial java/lang/StringBuilder.<init> ()V
      // 07a: aload 1
      // 07b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07e: sipush -17855
      // 081: sipush -28266
      // 084: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 090: astore 11
      // 092: aload 11
      // 094: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 097: astore 12
      // 099: aload 12
      // 09b: invokevirtual java/io/File.exists ()Z
      // 09e: aload 3
      // 09f: ifnull 0b8
      // 0a2: ifne 0b9
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 12
      // 0ae: invokevirtual java/io/File.mkdirs ()Z
      // 0b1: goto 0b8
      // 0b4: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: pop
      // 0b9: new java/io/FileOutputStream
      // 0bc: dup
      // 0bd: aload 11
      // 0bf: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 0c2: astore 6
      // 0c4: sipush 18248
      // 0c7: ldc2_w 3131140827700005668
      // 0ca: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 0cd: newarray 8
      // 0cf: astore 13
      // 0d1: bipush 0
      // 0d2: istore 14
      // 0d4: lconst_0
      // 0d5: lstore 15
      // 0d7: aload 9
      // 0d9: aload 13
      // 0db: invokevirtual java/io/DataInputStream.read ([B)I
      // 0de: dup
      // 0df: istore 14
      // 0e1: ifle 133
      // 0e4: aload 6
      // 0e6: aload 13
      // 0e8: bipush 0
      // 0e9: iload 14
      // 0eb: invokevirtual java/io/FileOutputStream.write ([BII)V
      // 0ee: lload 15
      // 0f0: iload 14
      // 0f2: i2l
      // 0f3: ladd
      // 0f4: lstore 15
      // 0f6: aload 3
      // 0f7: ifnull 138
      // 0fa: aload 2
      // 0fb: aload 3
      // 0fc: ifnull 111
      // 0ff: goto 106
      // 102: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: ifnull 0d7
      // 109: goto 110
      // 10c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: aload 2
      // 111: lload 15
      // 113: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 116: ldc2_w 342255623469621245
      // 119: astore 21
      // 11b: astore 20
      // 11d: ldc2_w 342255623469621245
      // 120: aload 20
      // 122: aload 21
      // 124: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 127: pop
      // 128: goto 12f
      // 12b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: aload 3
      // 130: ifnonnull 0d7
      // 133: aload 6
      // 135: invokevirtual java/io/FileOutputStream.close ()V
      // 138: new java/io/File
      // 13b: dup
      // 13c: aload 1
      // 13d: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 140: astore 17
      // 142: aload 17
      // 144: invokevirtual java/io/File.exists ()Z
      // 147: aload 3
      // 148: ifnull 169
      // 14b: ifeq 162
      // 14e: goto 155
      // 151: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 154: athrow
      // 155: aload 17
      // 157: invokevirtual java/io/File.delete ()Z
      // 15a: pop
      // 15b: goto 162
      // 15e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: aload 11
      // 164: aload 17
      // 166: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 169: pop
      // 16a: aload 6
      // 16c: aload 3
      // 16d: ifnull 175
      // 170: ifnull 182
      // 173: aload 6
      // 175: invokevirtual java/io/FileOutputStream.close ()V
      // 178: goto 182
      // 17b: astore 8
      // 17d: aload 8
      // 17f: invokevirtual java/io/IOException.printStackTrace ()V
      // 182: aload 7
      // 184: aload 3
      // 185: ifnull 194
      // 188: ifnull 1dd
      // 18b: goto 192
      // 18e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: aload 7
      // 194: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 197: goto 1dd
      // 19a: astore 8
      // 19c: aload 8
      // 19e: invokevirtual java/lang/Exception.printStackTrace ()V
      // 1a1: aload 8
      // 1a3: athrow
      // 1a4: astore 18
      // 1a6: aload 6
      // 1a8: aload 3
      // 1a9: ifnull 1b8
      // 1ac: ifnull 1c5
      // 1af: goto 1b6
      // 1b2: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b5: athrow
      // 1b6: aload 6
      // 1b8: invokevirtual java/io/FileOutputStream.close ()V
      // 1bb: goto 1c5
      // 1be: astore 19
      // 1c0: aload 19
      // 1c2: invokevirtual java/io/IOException.printStackTrace ()V
      // 1c5: aload 7
      // 1c7: aload 3
      // 1c8: ifnull 1d7
      // 1cb: ifnull 1da
      // 1ce: goto 1d5
      // 1d1: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d4: athrow
      // 1d5: aload 7
      // 1d7: invokevirtual java/net/HttpURLConnection.disconnect ()V
      // 1da: aload 18
      // 1dc: athrow
      // 1dd: return
   }

   public static String G(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 1
      // 004: aload 0
      // 005: aload 1
      // 006: ifnull 016
      // 009: ifnonnull 017
      // 00c: goto 013
      // 00f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 012: athrow
      // 013: ldc_w ""
      // 016: areturn
      // 017: aconst_null
      // 018: astore 2
      // 019: aload 0
      // 01a: sipush -17853
      // 01d: sipush 16889
      // 020: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 023: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 026: astore 3
      // 027: aload 3
      // 028: arraylength
      // 029: bipush 4
      // 02a: if_icmpne 17b
      // 02d: new java/util/Hashtable
      // 030: dup
      // 031: invokespecial java/util/Hashtable.<init> ()V
      // 034: astore 4
      // 036: aload 4
      // 038: sipush -17860
      // 03b: sipush 17392
      // 03e: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 041: sipush -17894
      // 044: sipush -27267
      // 047: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 04a: invokevirtual java/util/Hashtable.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 04d: pop
      // 04e: new javax/naming/directory/InitialDirContext
      // 051: dup
      // 052: aload 4
      // 054: invokespecial javax/naming/directory/InitialDirContext.<init> (Ljava/util/Hashtable;)V
      // 057: astore 5
      // 059: new java/lang/StringBuilder
      // 05c: dup
      // 05d: invokespecial java/lang/StringBuilder.<init> ()V
      // 060: aload 3
      // 061: bipush 3
      // 062: aaload
      // 063: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 066: ldc_w "."
      // 069: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06c: aload 3
      // 06d: bipush 2
      // 06e: aaload
      // 06f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 072: ldc_w "."
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078: aload 3
      // 079: bipush 1
      // 07a: aaload
      // 07b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07e: ldc_w "."
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: aload 3
      // 085: bipush 0
      // 086: aaload
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: sipush -17859
      // 08d: sipush -5210
      // 090: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 099: astore 6
      // 09b: aload 5
      // 09d: aload 6
      // 09f: bipush 1
      // 0a0: anewarray 112
      // 0a3: dup
      // 0a4: bipush 0
      // 0a5: sipush -17796
      // 0a8: sipush -3662
      // 0ab: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 0ae: aastore
      // 0af: invokeinterface javax/naming/directory/DirContext.getAttributes (Ljava/lang/String;[Ljava/lang/String;)Ljavax/naming/directory/Attributes; 3
      // 0b4: astore 7
      // 0b6: aload 7
      // 0b8: invokeinterface javax/naming/directory/Attributes.getAll ()Ljavax/naming/NamingEnumeration; 1
      // 0bd: astore 8
      // 0bf: aload 8
      // 0c1: invokeinterface javax/naming/NamingEnumeration.hasMoreElements ()Z 1
      // 0c6: ifeq 166
      // 0c9: aload 8
      // 0cb: invokeinterface javax/naming/NamingEnumeration.next ()Ljava/lang/Object; 1
      // 0d0: checkcast javax/naming/directory/Attribute
      // 0d3: astore 9
      // 0d5: aload 9
      // 0d7: invokeinterface javax/naming/directory/Attribute.getID ()Ljava/lang/String; 1
      // 0dc: astore 10
      // 0de: aload 1
      // 0df: ifnull 16d
      // 0e2: aload 9
      // 0e4: invokeinterface javax/naming/directory/Attribute.getAll ()Ljavax/naming/NamingEnumeration; 1
      // 0e9: astore 11
      // 0eb: aload 11
      // 0ed: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 0f2: ifeq 162
      // 0f5: aload 11
      // 0f7: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 0fc: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0ff: astore 12
      // 101: sipush -17907
      // 104: sipush 26753
      // 107: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 10a: aload 10
      // 10c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10f: aload 1
      // 110: ifnull 0c6
      // 113: aload 1
      // 114: ifnull 12d
      // 117: ifeq 15e
      // 11a: goto 121
      // 11d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: aload 12
      // 123: invokevirtual java/lang/String.length ()I
      // 126: goto 12d
      // 129: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: istore 13
      // 12f: aload 12
      // 131: aload 1
      // 132: ifnull 15d
      // 135: iload 13
      // 137: bipush 1
      // 138: isub
      // 139: invokevirtual java/lang/String.charAt (I)C
      // 13c: sipush 5122
      // 13f: ldc2_w 7270141278574663720
      // 142: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 145: if_icmpne 15b
      // 148: goto 14f
      // 14b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 12
      // 151: bipush 0
      // 152: iload 13
      // 154: bipush 1
      // 155: isub
      // 156: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 159: astore 12
      // 15b: aload 12
      // 15d: astore 2
      // 15e: aload 1
      // 15f: ifnonnull 0eb
      // 162: aload 1
      // 163: ifnonnull 0bf
      // 166: aload 5
      // 168: invokeinterface javax/naming/directory/DirContext.close ()V 1
      // 16d: goto 17b
      // 170: astore 4
      // 172: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 175: ldc_w ""
      // 178: invokevirtual java/io/PrintStream.print (Ljava/lang/String;)V
      // 17b: aconst_null
      // 17c: aload 2
      // 17d: if_acmpne 180
      // 180: aload 2
      // 181: areturn
   }

   public static void Z(boolean var0) {
      try {
         Registry.emptyArgs();
         long var8 = 253808553645062345L;
         Object var10001 = Ref.h2(253808553645062345L, var8);

         try {
            var15 = (Boolean)var10001;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (!var15) {
            return;
         }
      } catch (RuntimeException var14) {
         throw a(var14);
      }

      String var1 = b(-17888, 26300);
      String var2 = new File(".").getAbsolutePath();
      String var3 = var2.substring(0, var2.length() - 1);
      ArrayList var4 = new ArrayList();
      var4.add(b(-17919, 13862));
      String var5 = "\"" + var3 + b(-17807, -7296);
      String var6 = b(-17897, 21658);
      String var7 = var6 + "\\" + var1;
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10002 = Registry.packArgs(new JC(var6, var1, var0, var5));
      long var11 = 434592463220957006L;
      Object[] var10 = var10002;
      Ref.h(434592463220957006L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   public static boolean C(File param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 0
      // 07: invokevirtual java/io/File.isDirectory ()Z
      // 0a: aload 1
      // 0b: ifnull 65
      // 0e: ifeq 64
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 1c: sipush -17893
      // 1f: sipush 13231
      // 22: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 25: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 28: aload 1
      // 29: ifnull 65
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: ifeq 64
      // 36: goto 3d
      // 39: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 0
      // 3e: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 41: sipush -17864
      // 44: sipush -16683
      // 47: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 4a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4d: aload 1
      // 4e: ifnull 65
      // 51: goto 58
      // 54: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: ifne 64
      // 5b: goto 62
      // 5e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: bipush 1
      // 63: istore 2
      // 64: iload 2
      // 65: ireturn
   }

   public static File E(Object var0) {
      Ky4[] var10000 = YT3_2.c();
      File var2 = null;
      Ky4[] var1 = var10000;

      label64: {
         label59: {
            label50: {
               try {
                  var13 = var0.getClass().equals(Tf4.class);
                  if (var1 == null) {
                     break label50;
                  }

                  if (var13) {
                     break label59;
                  }
               } catch (RuntimeException var11) {
                  throw a(var11);
               }

               try {
                  var10000 = var0.getClass();
                  if (var1 == null) {
                     break label64;
                  }

                  var13 = var10000.equals(com.finalshell.ui.model.Ck4.class);
               } catch (RuntimeException var10) {
                  throw a(var10);
               }
            }

            if (!var13) {
               return var2;
            }

            var10000 = (Ky4[])var0;
            break label64;
         }

         Tf4 var3 = (Tf4)var0;
         File var10001;
         Object[] var10003 = Registry.emptyArgs();
         long var5 = 498856411508641826L;
         Object[] var4 = var10003;
         var10003 = Ref.h(498856411508641826L, var4, var5);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         var3 = new String(var10003);
         var2 = var10001;
         return var2;
      }

      com.finalshell.ui.model.Ck4 var12 = (com.finalshell.ui.model.Ck4)var10000;
      File var15;
      Object[] var18 = Registry.emptyArgs();
      long var7 = 605430732347023634L;
      Object[] var6 = var18;
      var18 = Ref.h(605430732347023634L, var6, var7);

      try {
         var18 = (String)var18;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var12 = new String(var18);
      return var15;
   }

   public static void j(Component param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokestatic javax/swing/SwingUtilities.getWindowAncestor (Ljava/awt/Component;)Ljava/awt/Window;
      // 004: checkcast javax/swing/JFrame
      // 007: astore 2
      // 008: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 00b: new com/finalshell/ui/dialog/EditDialog2
      // 00e: dup
      // 00f: ldc2_w 117752090945034800
      // 012: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 015: aconst_null
      // 016: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 019: aload 2
      // 01a: sipush -17848
      // 01d: sipush -23945
      // 020: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 023: new com/finalshell/core/T__2
      // 026: dup
      // 027: invokespecial com/finalshell/core/T__2.<init> ()V
      // 02a: bipush 1
      // 02b: invokespecial com/finalshell/ui/dialog/EditDialog2.<init> (ILjava/awt/Window;Ljava/lang/String;Lcom/finalshell/core/Zv2_2;Z)V
      // 02e: astore 3
      // 02f: astore 1
      // 030: aload 3
      // 031: sipush -17823
      // 034: sipush -31654
      // 037: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 03a: invokevirtual com/finalshell/ui/dialog/EditDialog2.setTitle (Ljava/lang/String;)V
      // 03d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 040: ldc2_w 454647487873911743
      // 043: astore 7
      // 045: ldc2_w 454647487873911743
      // 048: aload 7
      // 04a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 04d: checkcast java/lang/Boolean
      // 050: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 053: goto 05a
      // 056: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 1
      // 05b: ifnull 0d9
      // 05e: ifeq 097
      // 061: goto 068
      // 064: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067: athrow
      // 068: aload 3
      // 069: sipush -17882
      // 06c: sipush 2853
      // 06f: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 072: bipush 1
      // 073: bipush 1
      // 074: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 077: ldc2_w 206082969888821725
      // 07a: astore 10
      // 07c: astore 9
      // 07e: ldc2_w 206082969888821725
      // 081: aload 9
      // 083: aload 10
      // 085: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 088: pop
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: goto 097
      // 093: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: aload 3
      // 098: sipush 32708
      // 09b: ldc2_w 3886589360452711366
      // 09e: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 0a1: sipush 24158
      // 0a4: ldc2_w 1821162073166942757
      // 0a7: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 0aa: invokevirtual com/finalshell/ui/dialog/EditDialog2.setSize (II)V
      // 0ad: aload 3
      // 0ae: aload 2
      // 0af: invokevirtual com/finalshell/ui/dialog/EditDialog2.setLocationRelativeTo (Ljava/awt/Component;)V
      // 0b2: aload 3
      // 0b3: bipush 1
      // 0b4: invokevirtual com/finalshell/ui/dialog/EditDialog2.setVisible (Z)V
      // 0b7: aload 3
      // 0b8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0bb: ldc2_w 418327897845479655
      // 0be: astore 12
      // 0c0: astore 11
      // 0c2: ldc2_w 418327897845479655
      // 0c5: aload 11
      // 0c7: aload 12
      // 0c9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0cc: checkcast java/lang/Integer
      // 0cf: invokevirtual java/lang/Integer.intValue ()I
      // 0d2: goto 0d9
      // 0d5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: istore 4
      // 0db: iload 4
      // 0dd: ldc2_w 564170828581134815
      // 0e0: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e3: aconst_null
      // 0e4: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0e7: if_icmpne 1b4
      // 0ea: aload 3
      // 0eb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ee: ldc2_w 191095475795927576
      // 0f1: astore 14
      // 0f3: astore 13
      // 0f5: ldc2_w 191095475795927576
      // 0f8: aload 13
      // 0fa: aload 14
      // 0fc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ff: checkcast java/lang/String
      // 102: goto 109
      // 105: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 108: athrow
      // 109: astore 5
      // 10b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 10e: ldc2_w 270389152141252877
      // 111: astore 15
      // 113: ldc2_w 270389152141252877
      // 116: aload 15
      // 118: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 11b: goto 122
      // 11e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 121: athrow
      // 122: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 125: ldc2_w 306266403902896148
      // 128: astore 18
      // 12a: astore 17
      // 12c: ldc2_w 306266403902896148
      // 12f: aload 17
      // 131: aload 18
      // 133: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 136: checkcast com/finalshell/core/U62
      // 139: goto 140
      // 13c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13f: athrow
      // 140: astore 6
      // 142: aload 6
      // 144: aload 5
      // 146: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 149: ldc2_w 364081405822520378
      // 14c: astore 20
      // 14e: astore 19
      // 150: ldc2_w 364081405822520378
      // 153: aload 19
      // 155: aload 20
      // 157: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15a: pop
      // 15b: goto 162
      // 15e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 161: athrow
      // 162: aload 6
      // 164: bipush 1
      // 165: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 168: ldc2_w 355959850244158035
      // 16b: astore 22
      // 16d: astore 21
      // 16f: ldc2_w 355959850244158035
      // 172: aload 21
      // 174: aload 22
      // 176: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 179: pop
      // 17a: goto 181
      // 17d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 180: athrow
      // 181: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 184: ldc2_w 270389152141252877
      // 187: astore 23
      // 189: ldc2_w 270389152141252877
      // 18c: aload 23
      // 18e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 191: goto 198
      // 194: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 197: athrow
      // 198: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 19b: ldc2_w 578864097947885485
      // 19e: astore 26
      // 1a0: astore 25
      // 1a2: ldc2_w 578864097947885485
      // 1a5: aload 25
      // 1a7: aload 26
      // 1a9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ac: pop
      // 1ad: goto 1b4
      // 1b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: return
   }

   public static boolean X(Font param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 230576532026544138
      // 03: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 06: aconst_null
      // 07: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a: checkcast java/awt/Graphics2D
      // 0d: aload 0
      // 0e: invokevirtual java/awt/Graphics2D.setFont (Ljava/awt/Font;)V
      // 11: ldc2_w 230576532026544138
      // 14: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 17: aconst_null
      // 18: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1b: checkcast java/awt/Graphics2D
      // 1e: aload 0
      // 1f: invokevirtual java/awt/Graphics2D.getFontMetrics (Ljava/awt/Font;)Ljava/awt/FontMetrics;
      // 22: astore 2
      // 23: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 26: aload 2
      // 27: sipush 15917
      // 2a: ldc2_w 7663443875672519194
      // 2d: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 30: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 33: istore 3
      // 34: aload 2
      // 35: sipush 20564
      // 38: ldc2_w 5262955734616218729
      // 3b: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 3e: invokevirtual java/awt/FontMetrics.charWidth (C)I
      // 41: istore 4
      // 43: astore 1
      // 44: iload 3
      // 45: aload 1
      // 46: ifnull 5d
      // 49: iload 4
      // 4b: if_icmpne 60
      // 4e: goto 55
      // 51: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: goto 61
      // 60: bipush 0
      // 61: ireturn
   }

   public static BufferedImage X(float var0, int var1, int var2) {
      Registry.packArgs((int)((float)var1 * var0), (int)((float)var2 * var0));
      long var3 = 401056956354921780L;
      Object var10001 = Ref.h2(401056956354921780L, var3);

      try {
         return (BufferedImage)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public static BufferedImage u(int var0, int var1) {
      return new BufferedImage(var0, var1, 2);
   }

   public static BufferedImage W(int var0, int var1) {
      return new BufferedImage(var0, var1, 1);
   }

   public static JTextField I() {
      JTextField var0 = new JTextField();
      Registry.packArgs(var0);
      long var1 = 322267315291882359L;
      Ref.h2(322267315291882359L, var1);
      return var0;
   }

   public static JPasswordField S() {
      JPasswordField var0 = new JPasswordField();
      Registry.packArgs(var0);
      long var1 = 322267315291882359L;
      Ref.h2(322267315291882359L, var1);
      return var0;
   }

   public static JTextArea Z$JTextArea() {
      JTextArea var0 = new JTextArea();
      Registry.packArgs(var0);
      long var1 = 322267315291882359L;
      Ref.h2(322267315291882359L, var1);
      return var0;
   }

   public static Color j(Color var0, Color var1, float var2) {
      Registry.packArgs(var0.getRed(), var1.getRed(), var2);
      long var4 = 407188222438066909L;
      Object var10003 = Ref.h2(407188222438066909L, var4);

      try {
         var10003 = (Integer)var10003;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(var0.getGreen(), var1.getGreen(), var2);
      long var6 = 407188222438066909L;
      Object var10005 = Ref.h2(407188222438066909L, var6);

      try {
         var14 = (Integer)var10005;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(var0.getBlue(), var1.getBlue(), var2);
      long var8 = 407188222438066909L;
      Object var10007 = Ref.h2(407188222438066909L, var8);

      try {
         var15 = (Integer)var10007;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

new Color(var14, (int)var10006, var15);
      return (Color)var10003;
   }

   public static int X(int var0, int var1, float var2) {
      float var3 = (float)var0 * var2 + (float)var1 * (1.0F - var2);
      return (int)var3;
   }

   public static Color j(Color var0) {
      Registry.packArgs(var0.getRed());
      long var2 = 334413625078969604L;
      Object var10003 = Ref.h2(334413625078969604L, var2);

      try {
         var10003 = (Integer)var10003;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(var0.getGreen());
      long var4 = 334413625078969604L;
      Object var10005 = Ref.h2(334413625078969604L, var4);

      try {
         var12 = (Integer)var10005;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(var0.getBlue());
      long var6 = 334413625078969604L;
      Object var10007 = Ref.h2(334413625078969604L, var6);

      try {
         var13 = (Integer)var10007;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

new Color(var12, (int)var10006, var13);
      return (Color)var10003;
   }

   public static int w(int var0) {
      return (int)(255.0F - 0.01F * (float)(a(11201, 5180688738096965555L) - var0));
   }

   public static void X$void(String var0) {
      try {
         Desktop.getDesktop().browse(new URI(var0));
      } catch (IOException var2) {
         var2.printStackTrace();
      } catch (URISyntaxException var3) {
         var3.printStackTrace();
      }
   }

   public static ZB_2 t(Im4 param0, int param1, int param2, String param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aconst_null
      // 004: astore 5
      // 006: astore 4
      // 008: iload 2
      // 009: bipush 1
      // 00a: isub
      // 00b: istore 6
      // 00d: aload 0
      // 00e: iload 6
      // 010: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 013: astore 7
      // 015: bipush -1
      // 016: istore 8
      // 018: bipush 0
      // 019: istore 9
      // 01b: iload 9
      // 01d: aload 0
      // 01e: invokevirtual com/finalshell/core/Im4.O ()I
      // 021: if_icmpge 0cb
      // 024: aload 0
      // 025: invokevirtual com/finalshell/core/Im4.O ()I
      // 028: bipush 1
      // 029: isub
      // 02a: iload 9
      // 02c: isub
      // 02d: istore 10
      // 02f: aload 0
      // 030: iload 10
      // 032: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 035: astore 11
      // 037: aload 11
      // 039: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 03c: iload 1
      // 03d: iload 2
      // 03e: aload 3
      // 03f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;
      // 042: ldc2_w 153292186016684283
      // 045: astore 12
      // 047: ldc2_w 153292186016684283
      // 04a: aload 12
      // 04c: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 04f: checkcast com/finalshell/core/ZB_2
      // 052: goto 059
      // 055: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 058: athrow
      // 059: astore 5
      // 05b: aload 4
      // 05d: ifnull 0c6
      // 060: aload 5
      // 062: aload 4
      // 064: ifnull 0cd
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: ifnull 0bc
      // 071: goto 078
      // 074: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: iload 10
      // 07a: istore 8
      // 07c: aload 5
      // 07e: aload 5
      // 080: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 083: ldc2_w 533907123292002924
      // 086: astore 15
      // 088: astore 14
      // 08a: ldc2_w 533907123292002924
      // 08d: aload 14
      // 08f: aload 15
      // 091: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 094: goto 09b
      // 097: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 09e: ldc2_w 172641086950307768
      // 0a1: astore 17
      // 0a3: astore 16
      // 0a5: ldc2_w 172641086950307768
      // 0a8: aload 16
      // 0aa: aload 17
      // 0ac: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0af: pop
      // 0b0: goto 0b7
      // 0b3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 4
      // 0b9: ifnonnull 0cb
      // 0bc: iinc 9 1
      // 0bf: goto 0c6
      // 0c2: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 4
      // 0c8: ifnonnull 01b
      // 0cb: aload 5
      // 0cd: aload 4
      // 0cf: ifnull 160
      // 0d2: ifnull 15e
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: iload 8
      // 0de: bipush 1
      // 0df: iadd
      // 0e0: istore 9
      // 0e2: iload 9
      // 0e4: aload 0
      // 0e5: invokevirtual com/finalshell/core/Im4.O ()I
      // 0e8: if_icmpge 15e
      // 0eb: iload 9
      // 0ed: istore 10
      // 0ef: aload 0
      // 0f0: iload 10
      // 0f2: invokevirtual com/finalshell/core/Im4.D (I)Lcom/finalshell/core/DC3;
      // 0f5: astore 11
      // 0f7: aload 5
      // 0f9: new java/lang/StringBuilder
      // 0fc: dup
      // 0fd: invokespecial java/lang/StringBuilder.<init> ()V
      // 100: aload 5
      // 102: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 105: ldc2_w 533907123292002924
      // 108: astore 19
      // 10a: astore 18
      // 10c: ldc2_w 533907123292002924
      // 10f: aload 18
      // 111: aload 19
      // 113: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 116: checkcast java/lang/String
      // 119: goto 120
      // 11c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11f: athrow
      // 120: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 123: aload 11
      // 125: invokevirtual com/finalshell/core/DC3.V$String ()Ljava/lang/String;
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 131: ldc2_w 172641086950307768
      // 134: astore 21
      // 136: astore 20
      // 138: ldc2_w 172641086950307768
      // 13b: aload 20
      // 13d: aload 21
      // 13f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 142: pop
      // 143: goto 14a
      // 146: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 149: athrow
      // 14a: iinc 9 1
      // 14d: aload 4
      // 14f: ifnull 163
      // 152: aload 4
      // 154: ifnonnull 0e2
      // 157: goto 15e
      // 15a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aload 5
      // 160: ifnull 163
      // 163: aload 5
      // 165: areturn
   }

   static ZB_2 F(String var0, int var1, int var2, String var3) {
      Ky4[] var10000 = YT3_2.c();
      boolean var5 = false;
      Ky4[] var4 = var10000;
      ZB_2 var6 = null;
      Object var7 = null;

      label60: {
         try {
            var28 = var3;
            if (var4 == null) {
               break label60;
            }

            if (var3 == null) {
               return var6;
            }
         } catch (RuntimeException var25) {
            throw a(var25);
         }

         var28 = var3;
      }

      int var8 = var28.length();
      int var9 = var0.indexOf(var3);
      if (var9 > -1) {
         var7 = var0.substring(var8);
         Registry.packArgs(var7);
         long var10 = 224692825278678287L;
         String var10001 = (String)Ref.h2(224692825278678287L, var10);

         try {
            var10001 = var10001;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }

         var7 = var10001.trim();
         var6 = new ZB_2();
         Object[] var10002 = Registry.packArgs(var3.length());
         long var13 = 333291316458074509L;
         Object[] var12 = var10002;
         Ref.h(333291316458074509L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         Object[] var10003 = Registry.packArgs(var2);
         long var15 = 510641522467822805L;
         Object[] var14 = var10003;
         Ref.h(510641522467822805L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         Object[] var10004 = Registry.packArgs(var7);
         long var17 = 172641086950307768L;
         Object[] var16 = var10004;
         Ref.h(172641086950307768L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         Object[] var10005 = Registry.packArgs(var3);
         long var19 = 636624376127209790L;
         Object[] var18 = var10005;
         Ref.h(636624376127209790L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }
      }

      return var6;
   }

   static ZB_2 D(String param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: bipush 0
      // 004: istore 4
      // 006: astore 3
      // 007: aconst_null
      // 008: astore 5
      // 00a: aconst_null
      // 00b: astore 6
      // 00d: aload 0
      // 00e: ldc_w "@"
      // 011: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 014: aload 0
      // 015: sipush -17916
      // 018: sipush -22028
      // 01b: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 01e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 021: iand
      // 022: aload 3
      // 023: ifnull 06e
      // 026: ifne 05a
      // 029: goto 030
      // 02c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: aload 0
      // 031: ldc_w "@"
      // 034: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 037: aload 0
      // 038: sipush -17900
      // 03b: sipush 23281
      // 03e: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 041: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 044: iand
      // 045: aload 3
      // 046: ifnull 06e
      // 049: goto 050
      // 04c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: ifeq 15a
      // 053: goto 05a
      // 056: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 0
      // 05b: sipush -17828
      // 05e: sipush -1910
      // 061: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 064: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: istore 7
      // 070: iload 7
      // 072: aload 3
      // 073: ifnull 091
      // 076: ifge 08f
      // 079: goto 080
      // 07c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: aload 0
      // 081: sipush -17827
      // 084: sipush -28824
      // 087: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 08a: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 08d: istore 7
      // 08f: iload 7
      // 091: ifle 15a
      // 094: aload 0
      // 095: iload 7
      // 097: bipush 2
      // 098: iadd
      // 099: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 09c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 09f: astore 6
      // 0a1: aload 6
      // 0a3: ldc_w "\ue000"
      // 0a6: ldc_w ""
      // 0a9: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0ac: astore 6
      // 0ae: aload 6
      // 0b0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b3: ldc2_w 224692825278678287
      // 0b6: astore 8
      // 0b8: ldc2_w 224692825278678287
      // 0bb: aload 8
      // 0bd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c0: checkcast java/lang/String
      // 0c3: goto 0ca
      // 0c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: astore 6
      // 0cc: new com/finalshell/core/ZB_2
      // 0cf: dup
      // 0d0: invokespecial com/finalshell/core/ZB_2.<init> ()V
      // 0d3: astore 5
      // 0d5: aload 5
      // 0d7: iload 1
      // 0d8: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 0db: ldc2_w 333291316458074509
      // 0de: astore 11
      // 0e0: astore 10
      // 0e2: ldc2_w 333291316458074509
      // 0e5: aload 10
      // 0e7: aload 11
      // 0e9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ec: pop
      // 0ed: goto 0f4
      // 0f0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: aload 5
      // 0f6: iload 2
      // 0f7: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 0fa: ldc2_w 510641522467822805
      // 0fd: astore 13
      // 0ff: astore 12
      // 101: ldc2_w 510641522467822805
      // 104: aload 12
      // 106: aload 13
      // 108: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 10b: pop
      // 10c: goto 113
      // 10f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 5
      // 115: aload 6
      // 117: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 11a: ldc2_w 172641086950307768
      // 11d: astore 15
      // 11f: astore 14
      // 121: ldc2_w 172641086950307768
      // 124: aload 14
      // 126: aload 15
      // 128: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 12b: pop
      // 12c: goto 133
      // 12f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 132: athrow
      // 133: aload 5
      // 135: aload 0
      // 136: bipush 0
      // 137: iload 7
      // 139: bipush 2
      // 13a: isub
      // 13b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 13e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 141: ldc2_w 636624376127209790
      // 144: astore 17
      // 146: astore 16
      // 148: ldc2_w 636624376127209790
      // 14b: aload 16
      // 14d: aload 17
      // 14f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 152: pop
      // 153: goto 15a
      // 156: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 159: athrow
      // 15a: aload 5
      // 15c: areturn
   }

   public static String P(int var0) {
      Ky4[] var10000 = YT3_2.c();
      Random var2 = new Random();
      Ky4[] var1 = var10000;
      StringBuffer var3 = new StringBuffer();
      int var4 = 0;

      while (true) {
         if (var4 < var0) {
            int var5 = var2.nextInt(((String)Registry.lookupField(217319576446899637L).get(null)).length());

            try {
               var7 = var3.append(((String)Registry.lookupField(217319576446899637L).get(null)).charAt(var5));
               if (var1 == null) {
                  break;
               }

               var4++;
               if (var1 != null) {
                  continue;
               }
            } catch (RuntimeException var6) {
               throw a(var6);
            }
         }

         var7 = var3;
         break;
      }

      return var7.toString();
   }

   public static void q(Process param0, boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: aload 0
      // 05: astore 3
      // 06: new com/finalshell/task/LN
      // 09: dup
      // 0a: aload 3
      // 0b: invokespecial com/finalshell/task/LN.<init> (Ljava/lang/Process;)V
      // 0e: astore 4
      // 10: aload 4
      // 12: invokevirtual java/lang/Thread.start ()V
      // 15: new com/finalshell/task/GA
      // 18: dup
      // 19: aload 3
      // 1a: invokespecial com/finalshell/task/GA.<init> (Ljava/lang/Process;)V
      // 1d: astore 5
      // 1f: aload 5
      // 21: invokevirtual java/lang/Thread.start ()V
      // 24: iload 1
      // 25: aload 2
      // 26: ifnull 48
      // 29: ifeq 49
      // 2c: goto 33
      // 2f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 4
      // 35: invokevirtual java/lang/Thread.join ()V
      // 38: aload 5
      // 3a: invokevirtual java/lang/Thread.join ()V
      // 3d: aload 0
      // 3e: invokevirtual java/lang/Process.waitFor ()I
      // 41: goto 48
      // 44: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: pop
      // 49: goto 51
      // 4c: astore 3
      // 4d: aload 3
      // 4e: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 51: return
   }

   public static void R(File param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aconst_null
      // 004: astore 3
      // 005: astore 2
      // 006: invokestatic java/lang/System.getenv ()Ljava/util/Map;
      // 009: astore 4
      // 00b: aload 4
      // 00d: sipush -17837
      // 010: sipush -23571
      // 013: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 016: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 01b: checkcast java/lang/String
      // 01e: astore 5
      // 020: aload 4
      // 022: sipush -17872
      // 025: sipush -16627
      // 028: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 02b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 030: checkcast java/lang/String
      // 033: astore 6
      // 035: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 038: ldc2_w 454647487873911743
      // 03b: astore 10
      // 03d: ldc2_w 454647487873911743
      // 040: aload 10
      // 042: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 045: checkcast java/lang/Boolean
      // 048: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04b: goto 052
      // 04e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 2
      // 053: ifnull 0e6
      // 056: ifeq 0c9
      // 059: goto 060
      // 05c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: new java/io/File
      // 063: dup
      // 064: aload 1
      // 065: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 068: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 06b: ldc2_w 401544505347980134
      // 06e: astore 12
      // 070: ldc2_w 401544505347980134
      // 073: aload 12
      // 075: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 078: checkcast java/lang/Boolean
      // 07b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07e: goto 085
      // 081: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 2
      // 086: ifnull 0e6
      // 089: goto 090
      // 08c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: ifeq 0c9
      // 093: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 096: bipush 4
      // 097: anewarray 112
      // 09a: dup
      // 09b: bipush 0
      // 09c: sipush -17844
      // 09f: sipush 17849
      // 0a2: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 0a5: aastore
      // 0a6: dup
      // 0a7: bipush 1
      // 0a8: sipush -17814
      // 0ab: sipush 27008
      // 0ae: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 0b1: aastore
      // 0b2: dup
      // 0b3: bipush 2
      // 0b4: aload 1
      // 0b5: aastore
      // 0b6: dup
      // 0b7: bipush 3
      // 0b8: aload 0
      // 0b9: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 0bc: aastore
      // 0bd: aconst_null
      // 0be: aload 0
      // 0bf: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0c2: invokevirtual java/lang/Runtime.exec ([Ljava/lang/String;[Ljava/lang/String;Ljava/io/File;)Ljava/lang/Process;
      // 0c5: astore 3
      // 0c6: goto 1b9
      // 0c9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0cc: ldc2_w 454647487873911743
      // 0cf: astore 14
      // 0d1: ldc2_w 454647487873911743
      // 0d4: aload 14
      // 0d6: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d9: checkcast java/lang/Boolean
      // 0dc: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0df: goto 0e6
      // 0e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e5: athrow
      // 0e6: aload 2
      // 0e7: ifnull 111
      // 0ea: ifne 114
      // 0ed: goto 0f4
      // 0f0: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f7: ldc2_w 561847341732101275
      // 0fa: astore 16
      // 0fc: ldc2_w 561847341732101275
      // 0ff: aload 16
      // 101: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 104: checkcast java/lang/Boolean
      // 107: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10a: goto 111
      // 10d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 110: athrow
      // 111: ifeq 19e
      // 114: aload 5
      // 116: ifnull 180
      // 119: goto 120
      // 11c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 123: bipush 5
      // 124: anewarray 112
      // 127: dup
      // 128: bipush 0
      // 129: sipush -17822
      // 12c: sipush 9450
      // 12f: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 132: aastore
      // 133: dup
      // 134: bipush 1
      // 135: ldc_w "-"
      // 138: aastore
      // 139: dup
      // 13a: bipush 2
      // 13b: aload 5
      // 13d: aastore
      // 13e: dup
      // 13f: bipush 3
      // 140: sipush -17876
      // 143: sipush 10543
      // 146: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 149: aastore
      // 14a: dup
      // 14b: bipush 4
      // 14c: new java/lang/StringBuilder
      // 14f: dup
      // 150: invokespecial java/lang/StringBuilder.<init> ()V
      // 153: aload 1
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: sipush -17918
      // 15a: sipush 16508
      // 15d: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: aload 0
      // 164: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 167: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16a: ldc_w "\""
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 173: aastore
      // 174: aconst_null
      // 175: aload 0
      // 176: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 179: invokevirtual java/lang/Runtime.exec ([Ljava/lang/String;[Ljava/lang/String;Ljava/io/File;)Ljava/lang/Process;
      // 17c: astore 3
      // 17d: goto 1b9
      // 180: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 183: bipush 2
      // 184: anewarray 112
      // 187: dup
      // 188: bipush 0
      // 189: aload 1
      // 18a: aastore
      // 18b: dup
      // 18c: bipush 1
      // 18d: aload 0
      // 18e: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 191: aastore
      // 192: aconst_null
      // 193: aload 0
      // 194: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 197: invokevirtual java/lang/Runtime.exec ([Ljava/lang/String;[Ljava/lang/String;Ljava/io/File;)Ljava/lang/Process;
      // 19a: astore 3
      // 19b: goto 1b9
      // 19e: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 1a1: bipush 2
      // 1a2: anewarray 112
      // 1a5: dup
      // 1a6: bipush 0
      // 1a7: aload 1
      // 1a8: aastore
      // 1a9: dup
      // 1aa: bipush 1
      // 1ab: aload 0
      // 1ac: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 1af: aastore
      // 1b0: aconst_null
      // 1b1: aload 0
      // 1b2: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 1b5: invokevirtual java/lang/Runtime.exec ([Ljava/lang/String;[Ljava/lang/String;Ljava/io/File;)Ljava/lang/Process;
      // 1b8: astore 3
      // 1b9: aload 3
      // 1ba: astore 7
      // 1bc: new com/finalshell/task/Y6
      // 1bf: dup
      // 1c0: aload 7
      // 1c2: invokespecial com/finalshell/task/Y6.<init> (Ljava/lang/Process;)V
      // 1c5: astore 8
      // 1c7: aload 8
      // 1c9: invokevirtual java/lang/Thread.start ()V
      // 1cc: new com/finalshell/task/Kc4
      // 1cf: dup
      // 1d0: aload 7
      // 1d2: invokespecial com/finalshell/task/Kc4.<init> (Ljava/lang/Process;)V
      // 1d5: astore 9
      // 1d7: aload 9
      // 1d9: invokevirtual java/lang/Thread.start ()V
      // 1dc: aload 8
      // 1de: invokevirtual java/lang/Thread.join ()V
      // 1e1: aload 9
      // 1e3: invokevirtual java/lang/Thread.join ()V
      // 1e6: goto 1fa
      // 1e9: astore 4
      // 1eb: aload 4
      // 1ed: invokevirtual java/io/IOException.printStackTrace ()V
      // 1f0: goto 1fa
      // 1f3: astore 4
      // 1f5: aload 4
      // 1f7: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 1fa: return
   }

   public static boolean X(File var0) {
      Ky4[] var1 = YT3_2.c();

      try {
         label107: {
            Object[] var17;
            label108: {
               try {
                  Registry.emptyArgs();
                  long var3 = 253808553645062345L;
                  Object var10001 = Ref.h2(253808553645062345L, var3);

                  try {
                     var17 = (Boolean)var10001;
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }

                  if (var1 == null) {
                     break label108;
                  }

                  if (var17 != false) {
                     break label107;
                  }
               } catch (Exception var15) {
                  throw a(var15);
               }

               var17 = Registry.emptyArgs();
               long var5 = 561847341732101275L;
               Object var10002 = Ref.h2(561847341732101275L, var5);

               try {
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }
            }

            label110: {
               label111: {
                  try {
                     if (var1 == null) {
                        break label111;
                     }

                     if (var17 != false) {
                        break label110;
                     }
                  } catch (Exception var14) {
                     throw a(var14);
                  }

                  var17 = Registry.emptyArgs();
                  long var7 = 454647487873911743L;
                  Object var18 = Ref.h2(454647487873911743L, var7);

                  try {
                  } catch (InvocationTargetException var9) {
                     throw var9.getTargetException();
                  }
               }

               label112: {
                  label81: {
                     try {
                        if (var1 == null) {
                           break label81;
                        }

                        if (var17 != false) {
                           break label112;
                        }
                     } catch (Exception var13) {
                        throw a(var13);
                     }

                     var17 = Desktop.isDesktopSupported();
                  }

                  label114: {
                     try {
                        if (var1 == null) {
                           return (boolean)var17;
                        }

                        if (var17 != false) {
                           break label114;
                        }
                     } catch (Exception var12) {
                        throw a(var12);
                     }

                     return false;
                  }

                  Desktop.getDesktop().edit(var0);
                  return true;
               }

               Runtime.getRuntime().exec(new String[]{b(-17794, 23253), b(-17805, 7007), var0.getAbsolutePath()});
               return true;
            }

            Desktop.getDesktop().open(var0);
            return true;
         }

         Runtime.getRuntime().exec(new String[]{b(-17915, 25241), b(-17832, 31687), "\"" + var0.getAbsolutePath() + "\""});
         return true;
      } catch (Exception var16) {
         var16.printStackTrace(System.err);
         return false;
      }
   }

   public static String b$String(String var0) {
      return var0.replaceAll(b(-17847, 3823), "/");
   }

   public static ArrayList J(Pattern var0, String var1) {
      Matcher var3 = var0.matcher(var1);
      Ky4[] var10000 = YT3_2.c();
      ArrayList var4 = new ArrayList();
      Ky4[] var2 = var10000;

      while (true) {
         if (var3.find()) {
            try {
               var6 = var4;
               if (var2 == null) {
                  break;
               }

               var4.add(var3.group(0));
               if (var2 != null) {
                  continue;
               }
            } catch (RuntimeException var5) {
               throw a(var5);
            }
         }

         var6 = var4;
         break;
      }

      return var6;
   }

   public static String k(float var0) {
      Ky4[] var10000 = YT3_2.c();
      String var2 = ((DecimalFormat)Registry.lookupField(254165158142342477L).get(null)).format((double)var0);
      Ky4[] var1 = var10000;

      try {
         if (var1 == null) {
            return var2;
         }

         if (!var2.endsWith(b(-17793, 24167))) {
            return var2;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return "" + (int)var0;
   }

   public static String Q(float var0) {
      Ky4[] var10000 = YT3_2.c();
      String var2 = ((DecimalFormat)Registry.lookupField(539497916290495263L).get(null)).format((double)var0);
      Ky4[] var1 = var10000;

      try {
         if (var1 == null) {
            return var2;
         }

         if (!var2.endsWith(b(-17842, -26858))) {
            return var2;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return "" + (int)var0;
   }

   public static String[] B$arrString(String var0) {
      return var0.split("\n");
   }

   public static String[] v$arrString(String var0) {
      var0 = var0.trim();
      return var0.split(b(-17795, 9638));
   }

   public static ArrayList a$ArrayList(String var0) {
      ArrayList var1 = new ArrayList();
      Registry.packArgs(var1, new File(var0));
      long var2 = 149219782305368676L;
      Ref.h2(149219782305368676L, var2);

      try {
         return var1;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public static void c(ArrayList param0, File param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 1
      // 04: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 07: astore 3
      // 08: astore 2
      // 09: aload 3
      // 0a: aload 2
      // 0b: ifnull 19
      // 0e: ifnull 74
      // 11: goto 18
      // 14: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 3
      // 19: astore 4
      // 1b: aload 4
      // 1d: arraylength
      // 1e: istore 5
      // 20: bipush 0
      // 21: istore 6
      // 23: iload 6
      // 25: iload 5
      // 27: if_icmpge 74
      // 2a: aload 4
      // 2c: iload 6
      // 2e: aaload
      // 2f: astore 7
      // 31: aload 0
      // 32: aload 7
      // 34: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 37: pop
      // 38: aload 2
      // 39: ifnull 70
      // 3c: aload 7
      // 3e: invokevirtual java/io/File.isDirectory ()Z
      // 41: ifeq 6d
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 7
      // 4e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 51: ldc2_w 149219782305368676
      // 54: astore 8
      // 56: ldc2_w 149219782305368676
      // 59: aload 8
      // 5b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 5e: pop
      // 5f: goto 66
      // 62: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 65: athrow
      // 66: goto 6d
      // 69: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: iinc 6 1
      // 70: aload 2
      // 71: ifnonnull 23
      // 74: return
   }

   public static void z(String var0) {
      try {
         Desktop.getDesktop().open(new File(var0));
      } catch (Exception var2) {
      }
   }

   public static void A$void(String var0) {
      try {
         Registry.packArgs(Runtime.getRuntime().exec(new String[]{b(-17833, 27687), b(-17913, -4188) + var0}, null), false);
         long var2 = 248153879763504193L;
         Ref.h2(248153879763504193L, var2);

         try {
            ;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public static void n(com.finalshell.ui.model.Ck4 var0) {
      Lv4_2 var1 = new Lv4_2();
      int var2 = 0;
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 272998330038223631L;
      Object[] var4 = var10002;
      var10002 = Ref.h(272998330038223631L, var4, var5);

      try {
         var10002 = (File)var10002;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var10002 = Registry.packArgs(var10002.getAbsolutePath());
      long var7 = 574053907803002361L;
      Object[] var6 = var10002;
      Ref.h(574053907803002361L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      try {
         Object[] var10003 = Registry.emptyArgs();
         long var9 = 540969864624467425L;
         Object[] var8 = var10003;
         Ref.h(540969864624467425L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         Object[] var10004 = Registry.emptyArgs();
         long var11 = 402271797068414482L;
         Object[] var10 = var10004;
         var10004 = Ref.h(402271797068414482L, var10, var11);

         try {
            var25 = (Integer)var10004;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         var2 = var25;
         Object[] var10005 = Registry.packArgs(var2);
         long var13 = 268719418863796583L;
         Object[] var12 = var10005;
         Ref.h(268719418863796583L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }
      } catch (Exception var17) {
         var17.printStackTrace();
      }
   }

   public static void B(String[] var0) {
      String var1 = b(-17817, -16213);
      var1 = b(-17878, 8632);
      var1 = b(-17850, 18807);
      Registry.packArgs(var1);
      long var3 = 471718499053863095L;
      Ref.h2(471718499053863095L, var3);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public static String I(String var0, String var1) {
      Registry.packArgs(var0, var1, false, null);
      long var2 = 143610495443029601L;
      Object var10001 = Ref.h2(143610495443029601L, var2);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public static String x(String param0, String param1, boolean param2, String param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: ldc_w ""
      // 006: astore 5
      // 008: astore 4
      // 00a: aload 1
      // 00b: aload 4
      // 00d: ifnull 0f7
      // 010: ldc_w "/"
      // 013: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 016: ifne 0ef
      // 019: goto 020
      // 01c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aload 1
      // 021: ldc_w "~"
      // 024: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 027: aload 4
      // 029: ifnull 0ad
      // 02c: goto 033
      // 02f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: ifeq 093
      // 036: goto 03d
      // 039: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 3
      // 03e: aload 4
      // 040: ifnull 11d
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: ifnull 0f9
      // 04d: goto 054
      // 050: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 1
      // 055: bipush 1
      // 056: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 059: astore 1
      // 05a: aload 1
      // 05b: aload 4
      // 05d: ifnull 08c
      // 060: ldc_w "/"
      // 063: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 066: ifeq 074
      // 069: goto 070
      // 06c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: ldc_w ""
      // 073: astore 1
      // 074: new java/lang/StringBuilder
      // 077: dup
      // 078: invokespecial java/lang/StringBuilder.<init> ()V
      // 07b: aload 3
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: ldc_w "/"
      // 082: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 085: aload 1
      // 086: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 089: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08c: astore 5
      // 08e: aload 4
      // 090: ifnonnull 0f9
      // 093: aload 0
      // 094: aload 4
      // 096: ifnull 0e8
      // 099: goto 0a0
      // 09c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: ldc_w "/"
      // 0a3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a6: goto 0ad
      // 0a9: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: ifeq 0c9
      // 0b0: new java/lang/StringBuilder
      // 0b3: dup
      // 0b4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b7: aload 0
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: aload 1
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c2: astore 5
      // 0c4: aload 4
      // 0c6: ifnonnull 0f9
      // 0c9: new java/lang/StringBuilder
      // 0cc: dup
      // 0cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d0: aload 0
      // 0d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d4: ldc_w "/"
      // 0d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0da: aload 1
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e1: goto 0e8
      // 0e4: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: astore 5
      // 0ea: aload 4
      // 0ec: ifnonnull 0f9
      // 0ef: aload 1
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: astore 5
      // 0f9: aload 5
      // 0fb: iload 2
      // 0fc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 0ff: ldc2_w 444563393544393356
      // 102: astore 6
      // 104: ldc2_w 444563393544393356
      // 107: aload 6
      // 109: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 10c: checkcast java/lang/String
      // 10f: goto 116
      // 112: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 115: athrow
      // 116: astore 5
      // 118: aload 5
      // 11a: astore 0
      // 11b: aload 5
      // 11d: areturn
   }

   public static String O(String var0) {
      Registry.packArgs(var0, false);
      long var1 = 444563393544393356L;
      Object var10001 = Ref.h2(444563393544393356L, var1);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static String t(String param0, boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 2
      // 004: aload 0
      // 005: aload 2
      // 006: ifnull 02f
      // 009: ldc_w "."
      // 00c: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 00f: ifeq 02e
      // 012: goto 019
      // 015: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: new java/lang/StringBuilder
      // 01c: dup
      // 01d: invokespecial java/lang/StringBuilder.<init> ()V
      // 020: aload 0
      // 021: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 024: ldc_w "/"
      // 027: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 02d: astore 0
      // 02e: aload 0
      // 02f: astore 3
      // 030: sipush -17843
      // 033: sipush 23761
      // 036: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 039: astore 4
      // 03b: aload 3
      // 03c: aload 4
      // 03e: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 041: istore 5
      // 043: iload 5
      // 045: ifge 04c
      // 048: aload 2
      // 049: ifnonnull 07e
      // 04c: aload 3
      // 04d: bipush 0
      // 04e: iload 5
      // 050: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 053: astore 6
      // 055: new java/lang/StringBuilder
      // 058: dup
      // 059: invokespecial java/lang/StringBuilder.<init> ()V
      // 05c: aload 6
      // 05e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 061: ldc_w "/"
      // 064: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 067: aload 3
      // 068: iload 5
      // 06a: aload 4
      // 06c: invokevirtual java/lang/String.length ()I
      // 06f: iadd
      // 070: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 073: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 076: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 079: astore 3
      // 07a: aload 2
      // 07b: ifnonnull 03b
      // 07e: sipush -17829
      // 081: sipush -24547
      // 084: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 087: astore 5
      // 089: aload 3
      // 08a: aload 5
      // 08c: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 08f: istore 6
      // 091: iload 6
      // 093: ifge 0a5
      // 096: aload 2
      // 097: ifnull 147
      // 09a: aload 2
      // 09b: ifnonnull 147
      // 09e: goto 0a5
      // 0a1: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 3
      // 0a6: bipush 0
      // 0a7: iload 6
      // 0a9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ac: astore 7
      // 0ae: aload 7
      // 0b0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b3: ldc2_w 405430188584561323
      // 0b6: astore 9
      // 0b8: ldc2_w 405430188584561323
      // 0bb: aload 9
      // 0bd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c0: checkcast java/lang/String
      // 0c3: goto 0ca
      // 0c6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: astore 8
      // 0cc: aload 8
      // 0ce: aload 2
      // 0cf: ifnull 137
      // 0d2: ifnull 12d
      // 0d5: goto 0dc
      // 0d8: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: new java/lang/StringBuilder
      // 0df: dup
      // 0e0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e3: aload 8
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: ldc_w "/"
      // 0eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ee: aload 3
      // 0ef: iload 6
      // 0f1: aload 5
      // 0f3: invokevirtual java/lang/String.length ()I
      // 0f6: iadd
      // 0f7: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 100: astore 3
      // 101: aload 3
      // 102: aload 2
      // 103: ifnull 128
      // 106: sipush -17858
      // 109: sipush -19907
      // 10c: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 10f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 112: ifeq 13c
      // 115: goto 11c
      // 118: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11b: athrow
      // 11c: aload 3
      // 11d: bipush 1
      // 11e: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 121: goto 128
      // 124: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: astore 3
      // 129: aload 2
      // 12a: ifnonnull 13c
      // 12d: ldc_w "/"
      // 130: goto 137
      // 133: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: astore 3
      // 138: aload 2
      // 139: ifnonnull 147
      // 13c: aload 2
      // 13d: ifnonnull 089
      // 140: goto 147
      // 143: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: aload 3
      // 148: ldc_w "/"
      // 14b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14e: aload 2
      // 14f: ifnull 185
      // 152: ifne 184
      // 155: goto 15c
      // 158: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: aload 3
      // 15d: ldc_w "/"
      // 160: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 163: aload 2
      // 164: ifnull 185
      // 167: goto 16e
      // 16a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16d: athrow
      // 16e: ifeq 184
      // 171: goto 178
      // 174: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: aload 3
      // 179: bipush 0
      // 17a: aload 3
      // 17b: invokevirtual java/lang/String.length ()I
      // 17e: bipush 1
      // 17f: isub
      // 180: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 183: astore 3
      // 184: iload 1
      // 185: aload 2
      // 186: ifnull 1ac
      // 189: ifeq 1e0
      // 18c: goto 193
      // 18f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: aload 0
      // 194: aload 2
      // 195: ifnull 1e1
      // 198: goto 19f
      // 19b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: ldc_w "/"
      // 1a2: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1a5: goto 1ac
      // 1a8: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: ifeq 1e0
      // 1af: aload 3
      // 1b0: aload 2
      // 1b1: ifnull 1e1
      // 1b4: goto 1bb
      // 1b7: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ba: athrow
      // 1bb: ldc_w "/"
      // 1be: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1c1: ifne 1e0
      // 1c4: goto 1cb
      // 1c7: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: new java/lang/StringBuilder
      // 1ce: dup
      // 1cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d2: aload 3
      // 1d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d6: ldc_w "/"
      // 1d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1df: astore 3
      // 1e0: aload 3
      // 1e1: areturn
   }

   void U() {
   }

   public static String L(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: ldc_w ""
      // 08: aload 1
      // 09: ifnull 23
      // 0c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f: ifeq 1f
      // 12: goto 19
      // 15: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: areturn
      // 1b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: ldc_w "\ue000"
      // 23: ldc_w ""
      // 26: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 29: astore 0
      // 2a: aload 0
      // 2b: invokevirtual java/lang/String.toCharArray ()[C
      // 2e: astore 2
      // 2f: bipush 0
      // 30: istore 3
      // 31: iload 3
      // 32: aload 2
      // 33: arraylength
      // 34: if_icmpge d4
      // 37: aload 2
      // 38: aload 1
      // 39: ifnull d5
      // 3c: iload 3
      // 3d: caload
      // 3e: sipush 30083
      // 41: ldc2_w 4925239278879816090
      // 44: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 47: aload 1
      // 48: ifnull 86
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: if_icmpne 73
      // 55: goto 5c
      // 58: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: aload 2
      // 5d: iload 3
      // 5e: sipush 21455
      // 61: ldc2_w 4831533471164735408
      // 64: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 67: castore
      // 68: aload 1
      // 69: ifnonnull cd
      // 6c: goto 73
      // 6f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: aload 2
      // 74: iload 3
      // 75: caload
      // 76: sipush 31616
      // 79: ldc2_w 8549093290596743139
      // 7c: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 7f: goto 86
      // 82: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 1
      // 87: ifnull b2
      // 8a: if_icmple cd
      // 8d: goto 94
      // 90: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: aload 2
      // 95: iload 3
      // 96: aload 1
      // 97: ifnull be
      // 9a: goto a1
      // 9d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: caload
      // a2: sipush 18736
      // a5: ldc2_w 135730428845163837
      // a8: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // ab: goto b2
      // ae: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: if_icmpge cd
      // b5: aload 2
      // b6: iload 3
      // b7: goto be
      // ba: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd: athrow
      // be: aload 2
      // bf: iload 3
      // c0: caload
      // c1: sipush 12327
      // c4: ldc2_w 2916753766092504187
      // c7: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // ca: isub
      // cb: i2c
      // cc: castore
      // cd: iinc 3 1
      // d0: aload 1
      // d1: ifnonnull 31
      // d4: aload 2
      // d5: invokestatic java/lang/String.valueOf ([C)Ljava/lang/String;
      // d8: areturn
   }

   public static JButton q(ImageIcon var0) {
      JButton var1 = new JButton();
      var1.setIcon(var0);
      return var1;
   }

   public static JButton H(String var0) {
      JButton var1 = new JButton(var0);
      var1.setFocusPainted(false);
      var1.setFocusable(false);
      return var1;
   }

   public static C U(String var0) {
      C var1 = new C(var0);
      var1.setMargin(new Insets(0, 0, 0, 0));
      var1.setFocusPainted(false);
      var1.setFocusable(false);
      return var1;
   }

   public static GP M$gP(String var0) {
      GP var1 = new GP(var0);
      var1.setMargin(new Insets(0, 0, 0, 0));
      var1.setFocusPainted(false);
      var1.setFocusable(false);
      return var1;
   }

   public static com.finalshell.ui.panel.T2 s$t_2(String var0) {
      return new com.finalshell.ui.panel.T2(var0);
   }

   public static boolean K(List param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 0
      // 04: istore 3
      // 05: astore 2
      // 06: aload 0
      // 07: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c: astore 4
      // 0e: aload 4
      // 10: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15: ifeq 72
      // 18: aload 4
      // 1a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1f: checkcast com/finalshell/ui/model/Tf4
      // 22: astore 5
      // 24: aload 5
      // 26: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 29: ldc2_w 498856411508641826
      // 2c: astore 7
      // 2e: astore 6
      // 30: ldc2_w 498856411508641826
      // 33: aload 6
      // 35: aload 7
      // 37: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3a: checkcast java/lang/String
      // 3d: goto 44
      // 40: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 1
      // 45: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 48: aload 2
      // 49: ifnull 73
      // 4c: aload 2
      // 4d: ifnull 62
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: ifeq 67
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: bipush 1
      // 62: istore 3
      // 63: aload 2
      // 64: ifnonnull 72
      // 67: aload 2
      // 68: ifnonnull 0e
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: iload 3
      // 73: ireturn
   }

   public static boolean E(List param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 0
      // 04: istore 3
      // 05: astore 2
      // 06: aload 0
      // 07: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c: astore 4
      // 0e: aload 4
      // 10: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15: ifeq 72
      // 18: aload 4
      // 1a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1f: checkcast com/finalshell/ui/model/Ck4
      // 22: astore 5
      // 24: aload 5
      // 26: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 29: ldc2_w 605430732347023634
      // 2c: astore 7
      // 2e: astore 6
      // 30: ldc2_w 605430732347023634
      // 33: aload 6
      // 35: aload 7
      // 37: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3a: checkcast java/lang/String
      // 3d: goto 44
      // 40: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 1
      // 45: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 48: aload 2
      // 49: ifnull 73
      // 4c: aload 2
      // 4d: ifnull 62
      // 50: goto 57
      // 53: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: ifeq 67
      // 5a: goto 61
      // 5d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: bipush 1
      // 62: istore 3
      // 63: aload 2
      // 64: ifnonnull 72
      // 67: aload 2
      // 68: ifnonnull 0e
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: iload 3
      // 73: ireturn
   }

   public static ArrayList V(DefaultMutableTreeNode var0) {
      ArrayList var1 = new ArrayList();
      Registry.packArgs(var0, var1);
      long var2 = 567970097274668926L;
      Ref.h2(567970097274668926L, var2);

      try {
         return var1;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   static void O(DefaultMutableTreeNode var0, ArrayList var1) {
      Ky4[] var10000 = YT3_2.c();
      int var3 = 0;
      Ky4[] var2 = var10000;

      while (var3 < var0.getChildCount()) {
         DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)var0.getChildAt(var3);
         var1.add(var4);
         Registry.packArgs(var4, var1);
         long var5 = 567970097274668926L;
         Ref.h2(567970097274668926L, var5);

         try {
            ;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var3++;
         if (var2 == null) {
            break;
         }
      }
   }

   public static void z(DefaultMutableTreeNode param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 2
      // 00b: astore 1
      // 00c: new java/util/ArrayList
      // 00f: dup
      // 010: invokespecial java/util/ArrayList.<init> ()V
      // 013: astore 3
      // 014: bipush 0
      // 015: istore 4
      // 017: iload 4
      // 019: aload 0
      // 01a: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildCount ()I
      // 01d: if_icmpge 10e
      // 020: aload 0
      // 021: iload 4
      // 023: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildAt (I)Ljavax/swing/tree/TreeNode;
      // 026: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 029: astore 5
      // 02b: aload 5
      // 02d: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 030: astore 6
      // 032: aconst_null
      // 033: astore 7
      // 035: iload 4
      // 037: istore 8
      // 039: aload 6
      // 03b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 03e: ldc_w com/finalshell/ui/model/Ck4
      // 041: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 044: aload 1
      // 045: ifnull 112
      // 048: aload 1
      // 049: ifnull 0bd
      // 04c: goto 053
      // 04f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: ifeq 0a7
      // 056: goto 05d
      // 059: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: aload 6
      // 05f: checkcast com/finalshell/ui/model/Ck4
      // 062: astore 9
      // 064: aload 9
      // 066: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 069: ldc2_w 272998330038223631
      // 06c: astore 11
      // 06e: astore 10
      // 070: ldc2_w 272998330038223631
      // 073: aload 10
      // 075: aload 11
      // 077: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07a: goto 081
      // 07d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 080: athrow
      // 081: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 084: ldc2_w 356145384774107640
      // 087: astore 12
      // 089: ldc2_w 356145384774107640
      // 08c: aload 12
      // 08e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 091: checkcast java/lang/String
      // 094: goto 09b
      // 097: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: astore 7
      // 09d: aload 3
      // 09e: aload 5
      // 0a0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0a3: pop
      // 0a4: goto 107
      // 0a7: aload 6
      // 0a9: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0ac: aload 1
      // 0ad: ifnull 0c2
      // 0b0: ldc_w com/finalshell/ui/model/Tf4
      // 0b3: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0b6: goto 0bd
      // 0b9: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: ifeq 107
      // 0c0: aload 6
      // 0c2: checkcast com/finalshell/ui/model/Tf4
      // 0c5: astore 9
      // 0c7: aload 9
      // 0c9: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0cc: ldc2_w 543633160597441792
      // 0cf: astore 15
      // 0d1: astore 14
      // 0d3: ldc2_w 543633160597441792
      // 0d6: aload 14
      // 0d8: aload 15
      // 0da: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0dd: goto 0e4
      // 0e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0e7: ldc2_w 356145384774107640
      // 0ea: astore 16
      // 0ec: ldc2_w 356145384774107640
      // 0ef: aload 16
      // 0f1: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f4: checkcast java/lang/String
      // 0f7: goto 0fe
      // 0fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: astore 7
      // 100: aload 2
      // 101: aload 5
      // 103: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 106: pop
      // 107: iinc 4 1
      // 10a: aload 1
      // 10b: ifnonnull 017
      // 10e: aload 0
      // 10f: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildCount ()I
      // 112: ifle 130
      // 115: aload 0
      // 116: bipush 0
      // 117: invokevirtual javax/swing/tree/DefaultMutableTreeNode.remove (I)V
      // 11a: aload 1
      // 11b: ifnull 162
      // 11e: goto 125
      // 121: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 1
      // 126: ifnonnull 10e
      // 129: goto 130
      // 12c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 2
      // 131: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 134: ldc2_w 392846413726513979
      // 137: astore 18
      // 139: ldc2_w 392846413726513979
      // 13c: aload 18
      // 13e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 141: pop
      // 142: goto 149
      // 145: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 148: athrow
      // 149: aload 3
      // 14a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 14d: ldc2_w 124766871027874162
      // 150: astore 20
      // 152: ldc2_w 124766871027874162
      // 155: aload 20
      // 157: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 15a: pop
      // 15b: goto 162
      // 15e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 161: athrow
      // 162: aload 2
      // 163: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 166: astore 4
      // 168: aload 4
      // 16a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16f: ifeq 193
      // 172: aload 4
      // 174: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 179: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 17c: astore 5
      // 17e: aload 0
      // 17f: aload 5
      // 181: invokevirtual javax/swing/tree/DefaultMutableTreeNode.add (Ljavax/swing/tree/MutableTreeNode;)V
      // 184: aload 1
      // 185: ifnull 199
      // 188: aload 1
      // 189: ifnonnull 168
      // 18c: goto 193
      // 18f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: aload 3
      // 194: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 197: astore 4
      // 199: aload 4
      // 19b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a0: ifeq 1b9
      // 1a3: aload 4
      // 1a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1aa: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 1ad: astore 5
      // 1af: aload 0
      // 1b0: aload 5
      // 1b2: invokevirtual javax/swing/tree/DefaultMutableTreeNode.add (Ljavax/swing/tree/MutableTreeNode;)V
      // 1b5: aload 1
      // 1b6: ifnonnull 199
      // 1b9: return
   }

   public static void b(ArrayList var0) {
      Collator var1 = Collator.getInstance(Locale.CHINA);
      Collections.sort(var0, new com.finalshell.ui.model.Cp4(var1));
   }

   public static void n(ArrayList var0) {
      Collator var1 = Collator.getInstance(Locale.CHINA);
      Collections.sort(var0, new AY(var1));
   }

   public static void r(List var0) {
      Collator var1 = Collator.getInstance(Locale.CHINA);
      Collections.sort(var0, new com.finalshell.ui.model.Q(var1));
   }

   public static void l(List var0) {
      Collator var1 = Collator.getInstance(Locale.CHINA);
      Collections.sort(var0, new TY3(var1));
   }

   public static int b(List param0, Tf4 param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 0
      // 04: istore 3
      // 05: new java/util/ArrayList
      // 08: dup
      // 09: invokespecial java/util/ArrayList.<init> ()V
      // 0c: astore 4
      // 0e: astore 2
      // 0f: aload 4
      // 11: aload 0
      // 12: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 17: pop
      // 18: aload 4
      // 1a: aload 1
      // 1b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 20: pop
      // 21: aload 4
      // 23: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 26: ldc2_w 340646047318521232
      // 29: astore 7
      // 2b: ldc2_w 340646047318521232
      // 2e: aload 7
      // 30: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 33: pop
      // 34: goto 3b
      // 37: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: istore 5
      // 3e: iload 5
      // 40: aload 4
      // 42: invokeinterface java/util/List.size ()I 1
      // 47: if_icmpge c8
      // 4a: aload 4
      // 4c: iload 5
      // 4e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 53: checkcast com/finalshell/ui/model/Tf4
      // 56: astore 6
      // 58: aload 2
      // 59: ifnull c4
      // 5c: aload 6
      // 5e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 61: ldc2_w 179612178163941306
      // 64: astore 10
      // 66: astore 9
      // 68: ldc2_w 179612178163941306
      // 6b: aload 9
      // 6d: aload 10
      // 6f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 72: checkcast java/lang/String
      // 75: goto 7c
      // 78: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 1
      // 7d: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 80: ldc2_w 179612178163941306
      // 83: astore 12
      // 85: astore 11
      // 87: ldc2_w 179612178163941306
      // 8a: aload 11
      // 8c: aload 12
      // 8e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 91: checkcast java/lang/String
      // 94: goto 9b
      // 97: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 9a: athrow
      // 9b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 9e: aload 2
      // 9f: ifnull c9
      // a2: goto a9
      // a5: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8: athrow
      // a9: ifeq ba
      // ac: goto b3
      // af: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b2: athrow
      // b3: iload 5
      // b5: istore 3
      // b6: aload 2
      // b7: ifnonnull c8
      // ba: iinc 5 1
      // bd: goto c4
      // c0: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c3: athrow
      // c4: aload 2
      // c5: ifnonnull 3e
      // c8: iload 3
      // c9: ireturn
   }

   public static String j(String var0) {
      YT3_2.c();
      Object var2 = null;
      String var10001 = Registry.packArgs(var0);
      long var5 = 159824902428932603L;
      Object var10002 = Ref.h2(159824902428932603L, var5);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      String var3 = (String)var10002;
      Object[] var1 = var10001;
      int var4 = var0.lastIndexOf(var3);
      if (var4 > -1) {
         var2 = var0.substring(var4 + 1);
      }

      try {
         var10001 = var0;
         if (var1 != null) {
            var10001 = Registry.packArgs(var0);
            long var7 = 330094358428833085L;
            var10002 = Ref.h2(330094358428833085L, var7);

            try {
               var16 = (Boolean)var10002;
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            if (!var16) {
            }
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      return var10001;
   }

   public static String h$String(String var0) {
      YT3_2.c();
      Object[] var10001 = Registry.packArgs(var0);
      long var5 = 159824902428932603L;
      Object var10002 = Ref.h2(159824902428932603L, var5);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      String var2 = (String)var10002;
      Object[] var1 = var10001;

      label61: {
         label60: {
            try {
               var10001 = var0;
               if (var1 == null) {
                  break label61;
               }

               if (!var0.endsWith(var2)) {
                  break label60;
               }
            } catch (RuntimeException var10) {
               throw a(var10);
            }

            var0 = var0.substring(0, var0.length() - 2);
         }

         var10001 = var0;
      }

      String var3 = var10001;
      int var4 = var0.lastIndexOf(var2);

      label50: {
         label49: {
            try {
               var12 = var4;
               if (var1 == null) {
                  break label50;
               }

               if (var4 <= -1) {
                  break label49;
               }
            } catch (RuntimeException var9) {
               throw a(var9);
            }

            var3 = var0.substring(var4);
         }

         try {
            if (var1 == null) {
               return var3;
            }

            var12 = var3.startsWith(var2);
         } catch (RuntimeException var8) {
            throw a(var8);
         }
      }

      if (var12 != 0) {
         var3 = var3.substring(1);
      }

      return var3;
   }

   public static String J$String(String var0) {
      int var1 = var0.lastIndexOf(".");
      String var2 = "";
      if (var1 > 0) {
         var2 = var0.substring(0, var1);
      }

      return var2;
   }

   public static String N(String var0) {
      int var1 = var0.lastIndexOf(".");
      String var2 = var0;
      if (var1 > -1) {
         var2 = var0.substring(var1 + 1);
      }

      return var2;
   }

   public static boolean v$boolean(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: bipush 0
      // 04: istore 2
      // 05: astore 1
      // 06: aload 0
      // 07: aload 1
      // 08: ifnull 16
      // 0b: ifnull 4e
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: sipush -17798
      // 19: sipush -21375
      // 1c: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 1f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 22: aload 1
      // 23: ifnull 4d
      // 26: ifne 4c
      // 29: goto 30
      // 2c: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 0
      // 31: ldc_w "/"
      // 34: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 37: aload 1
      // 38: ifnull 4f
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: ifeq 4e
      // 45: goto 4c
      // 48: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: istore 2
      // 4e: iload 2
      // 4f: ireturn
   }

   public static String M$String(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aconst_null
      // 04: astore 2
      // 05: astore 1
      // 06: aload 0
      // 07: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a: ldc2_w 159824902428932603
      // 0d: astore 5
      // 0f: ldc2_w 159824902428932603
      // 12: aload 5
      // 14: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 17: checkcast java/lang/String
      // 1a: goto 21
      // 1d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20: athrow
      // 21: astore 3
      // 22: aload 0
      // 23: aload 3
      // 24: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27: aload 1
      // 28: ifnull 60
      // 2b: ifne 5b
      // 2e: goto 35
      // 31: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 0
      // 36: aload 3
      // 37: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 3a: aload 1
      // 3b: ifnull 60
      // 3e: goto 45
      // 41: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: ifeq 5b
      // 48: goto 4f
      // 4b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 0
      // 50: bipush 0
      // 51: aload 0
      // 52: invokevirtual java/lang/String.length ()I
      // 55: bipush 1
      // 56: isub
      // 57: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 5a: astore 0
      // 5b: aload 0
      // 5c: aload 3
      // 5d: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 60: istore 4
      // 62: iload 4
      // 64: aload 1
      // 65: ifnull 73
      // 68: ifge 75
      // 6b: goto 72
      // 6e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: bipush 0
      // 73: istore 4
      // 75: aload 0
      // 76: bipush 0
      // 77: iload 4
      // 79: bipush 1
      // 7a: iadd
      // 7b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 7e: astore 2
      // 7f: aload 2
      // 80: aload 3
      // 81: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 84: aload 1
      // 85: ifnull a5
      // 88: ifne 9e
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: aload 2
      // 93: bipush 0
      // 94: aload 2
      // 95: invokevirtual java/lang/String.length ()I
      // 98: bipush 1
      // 99: isub
      // 9a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 9d: astore 2
      // 9e: aload 2
      // 9f: ldc_w ":"
      // a2: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // a5: aload 1
      // a6: ifnull da
      // a9: ifeq c8
      // ac: goto b3
      // af: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b2: athrow
      // b3: new java/lang/StringBuilder
      // b6: dup
      // b7: invokespecial java/lang/StringBuilder.<init> ()V
      // ba: aload 2
      // bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // be: ldc_w "\\"
      // c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c7: astore 2
      // c8: aload 2
      // c9: aload 1
      // ca: ifnull ed
      // cd: ldc_w ""
      // d0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // d3: goto da
      // d6: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d9: athrow
      // da: ifne ec
      // dd: aload 2
      // de: aload 0
      // df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // e2: ifeq ec
      // e5: goto ec
      // e8: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // eb: athrow
      // ec: aload 2
      // ed: areturn
   }

   public static String B(String var0, String var1) {
      Registry.packArgs(var0);
      long var4 = 159824902428932603L;
      Object var10001 = Ref.h2(159824902428932603L, var4);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      String var2 = (String)var10001;
      new StringBuilder();
      Object[] var10002 = Registry.packArgs(var0);
      long var6 = 405430188584561323L;
      Object var10003 = Ref.h2(405430188584561323L, var6);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      String var3 = var10002.append((String)var10003).append(var2).append(var1).toString();
      return var3.replaceAll(b(-17820, -19938), "/");
   }

   public static String y(String var0) {
      Registry.packArgs(var0);
      long var2 = 405430188584561323L;
      Object var10001 = Ref.h2(405430188584561323L, var2);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      String var1 = (String)var10001;
      return var1.replaceAll(b(-17820, -19938), "/");
   }

   public static String e(String var0) {
      String var1 = "/";
      int var2 = var0.lastIndexOf("\\");
      if (var2 > 0) {
         var1 = "\\";
      }

      return var1;
   }

   public static String H(long param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: lload 0
      // 05: lconst_0
      // 06: lcmp
      // 07: aload 2
      // 08: ifnull 2a
      // 0b: ifgt 1d
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: ldc_w "0"
      // 18: areturn
      // 19: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: lload 0
      // 1e: l2d
      // 1f: invokestatic java/lang/Math.log10 (D)D
      // 22: ldc2_w 1024.0
      // 25: invokestatic java/lang/Math.log10 (D)D
      // 28: ddiv
      // 29: d2i
      // 2a: istore 3
      // 2b: new java/lang/StringBuilder
      // 2e: dup
      // 2f: invokespecial java/lang/StringBuilder.<init> ()V
      // 32: new java/text/DecimalFormat
      // 35: dup
      // 36: sipush -17838
      // 39: sipush 31106
      // 3c: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 3f: invokespecial java/text/DecimalFormat.<init> (Ljava/lang/String;)V
      // 42: lload 0
      // 43: l2d
      // 44: ldc2_w 1024.0
      // 47: iload 3
      // 48: i2d
      // 49: invokestatic java/lang/Math.pow (DD)D
      // 4c: ddiv
      // 4d: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: ldc_w " "
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: ldc2_w 445997449004455055
      // 5c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 5f: aconst_null
      // 60: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 63: checkcast [Ljava/lang/String;
      // 66: iload 3
      // 67: aaload
      // 68: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6e: areturn
   }

   public static String h(long param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 2
      // 04: lload 0
      // 05: lconst_0
      // 06: lcmp
      // 07: aload 2
      // 08: ifnull 2a
      // 0b: ifgt 1d
      // 0e: goto 15
      // 11: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: ldc_w "0"
      // 18: areturn
      // 19: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: lload 0
      // 1e: l2d
      // 1f: invokestatic java/lang/Math.log10 (D)D
      // 22: ldc2_w 1024.0
      // 25: invokestatic java/lang/Math.log10 (D)D
      // 28: ddiv
      // 29: d2i
      // 2a: istore 3
      // 2b: iload 3
      // 2c: aload 2
      // 2d: ifnull 4b
      // 30: sipush 13541
      // 33: ldc2_w 1022239208828369118
      // 36: invokestatic com/finalshell/core/Lk2.a (IJ)I
      // 39: if_icmpne 4c
      // 3c: goto 43
      // 3f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: bipush 5
      // 44: goto 4b
      // 47: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: istore 3
      // 4c: new java/lang/StringBuilder
      // 4f: dup
      // 50: invokespecial java/lang/StringBuilder.<init> ()V
      // 53: new java/text/DecimalFormat
      // 56: dup
      // 57: sipush -17874
      // 5a: sipush -148
      // 5d: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 60: invokespecial java/text/DecimalFormat.<init> (Ljava/lang/String;)V
      // 63: lload 0
      // 64: l2d
      // 65: ldc2_w 1024.0
      // 68: iload 3
      // 69: i2d
      // 6a: invokestatic java/lang/Math.pow (DD)D
      // 6d: ddiv
      // 6e: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74: ldc_w " "
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: ldc2_w 547487369936868484
      // 7d: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 80: aconst_null
      // 81: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 84: checkcast [Ljava/lang/String;
      // 87: iload 3
      // 88: aaload
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8f: astore 4
      // 91: aload 4
      // 93: sipush -17885
      // 96: sipush -29750
      // 99: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 9c: ldc_w ""
      // 9f: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // a2: sipush -17835
      // a5: sipush -31906
      // a8: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // ab: ldc_w "K"
      // ae: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // b1: ldc_w ","
      // b4: ldc_w ""
      // b7: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // ba: astore 4
      // bc: aload 4
      // be: areturn
   }

   public static BufferedImage j(BufferedImage var0) {
      Graphics2D var1 = (Graphics2D)var0.getGraphics();
      int var2 = a(11201, 5180688738096965555L);
      Color var3 = new Color(var2, var2, var2, a(22720, 1896695650380715181L));
      var1.setColor(var3);
      var1.fillRect(0, 0, var0.getWidth(), var0.getHeight());
      BufferedImage var4 = new BufferedImage(var0.getWidth(), var0.getHeight(), 2);
      var4.getGraphics().dispose();
      Graphics2D var5 = var0.createGraphics();
      var5.drawImage((BufferedImage)Registry.lookupField(403549328824014817L).get(null), 0, 0, null);
      var5.dispose();
      return var0;
   }

   public static BufferedImage t(BufferedImage var0, float var1) {
      HX3 var2 = new HX3();
      var2.t(var1);
      return var2.filter(var0, var0);
   }

   static Icon I(Icon var0) {
      BufferedImage var1 = new BufferedImage(var0.getIconWidth(), var0.getIconHeight(), 2);
      var0.paintIcon(null, var1.getGraphics(), 0, 0);
      var1.getGraphics().dispose();
      BufferedImage var3 = new BufferedImage(var0.getIconWidth(), var0.getIconHeight(), 2);
      Graphics2D var4 = var3.createGraphics();
      var4.drawImage(var1, 0, 0, null);
      var4.dispose();
      Hw4 var5 = new Hw4();
      BufferedImage var6 = var5.filter(var3, var3);
      return new DZ3_2(var6, var0);
   }

   public static Icon h(Icon var0) {
      return new T2(var0);
   }

   public static Icon E$Icon(String var0) {
      return new ImageIcon(Lk2.class.getResource(b(-17830, -32367) + var0));
   }

   public static Icon D(Bo4 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aconst_null
      // 004: astore 2
      // 005: astore 1
      // 006: aload 0
      // 007: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 00a: ldc2_w 501218482801209672
      // 00d: astore 4
      // 00f: astore 3
      // 010: ldc2_w 501218482801209672
      // 013: aload 3
      // 014: aload 4
      // 016: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: goto 026
      // 022: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 025: athrow
      // 026: ldc2_w 542137494819116319
      // 029: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 02c: aconst_null
      // 02d: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 030: aload 1
      // 031: ifnull 0ec
      // 034: if_icmpne 0c0
      // 037: goto 03e
      // 03a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: aload 0
      // 03f: aload 1
      // 040: ifnull 087
      // 043: goto 04a
      // 046: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 049: athrow
      // 04a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 04d: ldc2_w 463286156757271879
      // 050: astore 6
      // 052: astore 5
      // 054: ldc2_w 463286156757271879
      // 057: aload 5
      // 059: aload 6
      // 05b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 05e: checkcast java/lang/Boolean
      // 061: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 064: goto 06b
      // 067: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: ifeq 086
      // 06e: goto 075
      // 071: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: ldc2_w 471099731952994576
      // 078: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 07b: aconst_null
      // 07c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07f: checkcast javax/swing/Icon
      // 082: astore 2
      // 083: goto 17c
      // 086: aload 0
      // 087: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 08a: ldc2_w 223441152106059427
      // 08d: astore 8
      // 08f: astore 7
      // 091: ldc2_w 223441152106059427
      // 094: aload 7
      // 096: aload 8
      // 098: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09b: goto 0a2
      // 09e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0a5: ldc2_w 456706881655309399
      // 0a8: astore 9
      // 0aa: ldc2_w 456706881655309399
      // 0ad: aload 9
      // 0af: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0b2: checkcast javax/swing/Icon
      // 0b5: goto 0bc
      // 0b8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: astore 2
      // 0bd: goto 17c
      // 0c0: aload 0
      // 0c1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c4: ldc2_w 501218482801209672
      // 0c7: astore 12
      // 0c9: astore 11
      // 0cb: ldc2_w 501218482801209672
      // 0ce: aload 11
      // 0d0: aload 12
      // 0d2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d5: checkcast java/lang/Integer
      // 0d8: invokevirtual java/lang/Integer.intValue ()I
      // 0db: goto 0e2
      // 0de: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: ldc2_w 565021139729850169
      // 0e5: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e8: aconst_null
      // 0e9: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0ec: aload 1
      // 0ed: ifnull 142
      // 0f0: if_icmpne 10b
      // 0f3: goto 0fa
      // 0f6: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: ldc2_w 420095333054729915
      // 0fd: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 100: aconst_null
      // 101: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 104: checkcast javax/swing/Icon
      // 107: astore 2
      // 108: goto 17c
      // 10b: aload 0
      // 10c: aload 1
      // 10d: ifnull 146
      // 110: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 113: ldc2_w 501218482801209672
      // 116: astore 14
      // 118: astore 13
      // 11a: ldc2_w 501218482801209672
      // 11d: aload 13
      // 11f: aload 14
      // 121: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 124: checkcast java/lang/Integer
      // 127: invokevirtual java/lang/Integer.intValue ()I
      // 12a: goto 131
      // 12d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 130: athrow
      // 131: ldc2_w 280278024323397611
      // 134: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 137: aconst_null
      // 138: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 13b: goto 142
      // 13e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: if_icmpne 17c
      // 145: aload 0
      // 146: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 149: ldc2_w 223441152106059427
      // 14c: astore 16
      // 14e: astore 15
      // 150: ldc2_w 223441152106059427
      // 153: aload 15
      // 155: aload 16
      // 157: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15a: goto 161
      // 15d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 160: athrow
      // 161: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 164: ldc2_w 136304645930691856
      // 167: astore 17
      // 169: ldc2_w 136304645930691856
      // 16c: aload 17
      // 16e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 171: checkcast javax/swing/Icon
      // 174: goto 17b
      // 177: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: astore 2
      // 17c: aload 2
      // 17d: areturn
   }

   public static synchronized Icon m$Icon(String var0) {
      Ky4[] var10000 = YT3_2.c();
      int var2 = var0.lastIndexOf(".");
      Ky4[] var1 = var10000;
      String var3 = "";
      if (var2 >= 0) {
         var3 = var0.substring(var2 + 1);
      }

      Registry.packArgs(var0);
      long var6 = 136304645930691856L;
      Object var10001 = Ref.h2(136304645930691856L, var6);

      try {
         var10001 = (Icon)var10001;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Icon var4 = (Icon)var10001;
      Icon var5 = (Icon)((HashMap)Registry.lookupField(586975543040322668L).get(null)).get(var3);

      try {
         if (var1 == null) {
            return var5;
         }

         if (var5 != null) {
            return var5;
         }
      } catch (RuntimeException var12) {
         throw a(var12);
      }

      Registry.packArgs(var4);
      long var8 = 608167142299993511L;
      Object var10002 = Ref.h2(608167142299993511L, var8);

      try {
         var10002 = (Icon)var10002;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var5 = (Icon)var10002;
      ((HashMap)Registry.lookupField(586975543040322668L).get(null)).put(var3, var5);
      return var5;
   }

   public static synchronized Icon s$Icon(String param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: astore 1
      // 004: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 007: ldc2_w 561847341732101275
      // 00a: astore 8
      // 00c: ldc2_w 561847341732101275
      // 00f: aload 8
      // 011: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 014: checkcast java/lang/Boolean
      // 017: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01a: goto 021
      // 01d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 1
      // 022: ifnull 048
      // 025: ifeq 041
      // 028: goto 02f
      // 02b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02e: athrow
      // 02f: ldc2_w 404273350304987593
      // 032: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 035: aconst_null
      // 036: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 039: checkcast javax/swing/Icon
      // 03c: areturn
      // 03d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: aload 0
      // 042: ldc_w "."
      // 045: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 048: istore 2
      // 049: ldc_w ""
      // 04c: astore 3
      // 04d: iload 2
      // 04e: iflt 059
      // 051: aload 0
      // 052: iload 2
      // 053: bipush 1
      // 054: iadd
      // 055: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 058: astore 3
      // 059: ldc2_w 337247587831146767
      // 05c: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 05f: aconst_null
      // 060: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 063: checkcast java/util/HashMap
      // 066: aload 3
      // 067: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 06a: checkcast javax/swing/Icon
      // 06d: astore 4
      // 06f: aload 0
      // 070: aload 1
      // 071: ifnull 09a
      // 074: sipush -17887
      // 077: sipush -21554
      // 07a: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 07d: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 080: ifeq 09b
      // 083: goto 08a
      // 086: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: sipush -17826
      // 08d: sipush 11849
      // 090: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 093: goto 09a
      // 096: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: astore 3
      // 09b: aload 4
      // 09d: aload 1
      // 09e: ifnull 17a
      // 0a1: ifnonnull 178
      // 0a4: goto 0ab
      // 0a7: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: new java/io/File
      // 0ae: dup
      // 0af: new java/lang/StringBuilder
      // 0b2: dup
      // 0b3: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b6: ldc2_w 179276309776747034
      // 0b9: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0bc: aconst_null
      // 0bd: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c0: checkcast java/lang/String
      // 0c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c6: sipush -17881
      // 0c9: sipush -3403
      // 0cc: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 0cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d2: aload 3
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d9: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0dc: astore 5
      // 0de: aload 5
      // 0e0: invokevirtual java/io/File.createNewFile ()Z
      // 0e3: pop
      // 0e4: goto 128
      // 0e7: astore 6
      // 0e9: new java/io/File
      // 0ec: dup
      // 0ed: new java/lang/StringBuilder
      // 0f0: dup
      // 0f1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f4: ldc2_w 179276309776747034
      // 0f7: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0fa: aconst_null
      // 0fb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0fe: checkcast java/lang/String
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: sipush -17890
      // 107: sipush -28099
      // 10a: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 10d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 110: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 113: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 116: astore 5
      // 118: aload 5
      // 11a: invokevirtual java/io/File.createNewFile ()Z
      // 11d: pop
      // 11e: goto 128
      // 121: astore 7
      // 123: aload 7
      // 125: invokevirtual java/io/IOException.printStackTrace ()V
      // 128: aload 5
      // 12a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 12d: ldc2_w 479640066053387692
      // 130: astore 10
      // 132: ldc2_w 479640066053387692
      // 135: aload 10
      // 137: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 13a: checkcast javax/swing/Icon
      // 13d: goto 144
      // 140: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 143: athrow
      // 144: astore 4
      // 146: ldc2_w 337247587831146767
      // 149: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 14c: aconst_null
      // 14d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 150: checkcast java/util/HashMap
      // 153: aload 3
      // 154: aload 4
      // 156: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 159: pop
      // 15a: invokestatic javax/swing/filechooser/FileSystemView.getFileSystemView ()Ljavax/swing/filechooser/FileSystemView;
      // 15d: aload 5
      // 15f: invokevirtual javax/swing/filechooser/FileSystemView.getSystemTypeDescription (Ljava/io/File;)Ljava/lang/String;
      // 162: astore 6
      // 164: ldc2_w 595623174429439661
      // 167: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 16a: aconst_null
      // 16b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 16e: checkcast java/util/HashMap
      // 171: aload 3
      // 172: aload 6
      // 174: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 177: pop
      // 178: aload 4
      // 17a: areturn
   }

   public static String m$String(String var0) {
      YT3_2.c();
      Object[] var10001 = Registry.packArgs(var0);
      long var5 = 136304645930691856L;
      Ref.h2(136304645930691856L, var5);
      int var2 = var0.lastIndexOf(".");
      String var3 = "";
      Object[] var1 = var10001;
      if (var2 >= 0) {
         var3 = var0.substring(var2 + 1);
      }

      String var4 = (String)((HashMap)Registry.lookupField(595623174429439661L).get(null)).get(var3);

      try {
         if (var1 == null) {
            return var4;
         }

         if (var4 != null) {
            return var4;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      return "";
   }

   public static boolean p(byte[] param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: ifnull 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 1
      // 14: ireturn
      // 15: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: arraylength
      // 1b: aload 1
      // 1c: ifnull 2a
      // 1f: ifne 2d
      // 22: goto 29
      // 25: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 2e
      // 2d: bipush 0
      // 2e: ireturn
   }

   public static boolean Y(String var0) {
      try {
         if (var0 == null) {
            return true;
         }
      } catch (RuntimeException var2) {
         throw a(var2);
      }

      String var1 = var0.trim();
      return var1.equals("");
   }

   public static Icon R(Tf4 var0) {
      Ky4[] var10000 = YT3_2.c();
      Icon var2 = null;
      Ky4[] var1 = var10000;

      Tf4 var19;
      label67: {
         label62: {
            try {
               Object[] var10001 = Registry.emptyArgs();
               long var5 = 490764181082108623L;
               Object[] var4 = var10001;
               var19 = (Tf4)Ref.h(490764181082108623L, var4, var5);

               try {
                  var19 = (Boolean)var19;
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               if (var1 == null) {
                  break label67;
               }

               if (var19 != false) {
                  break label62;
               }
            } catch (RuntimeException var16) {
               throw a(var16);
            }

            var19 = var0;
            Object[] var10002 = Registry.emptyArgs();
            long var11 = 125751153336179464L;
            Object[] var10 = var10002;
            var10002 = Ref.h(125751153336179464L, var10, var11);

            try {
               break label67;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }
         }

         Object[] var21 = Registry.emptyArgs();
         long var7 = 543633160597441792L;
         Object[] var6 = var21;
         var21 = Ref.h(543633160597441792L, var6, var7);

         try {
            var21 = (File)var21;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         File var3 = var21;
         Registry.packArgs(var3);
         long var8 = 479640066053387692L;
         Icon var10003 = (Icon)Ref.h2(479640066053387692L, var8);

         try {
            var10003 = var10003;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         return var10003;
      }

      if (var19 == false) {
         var2 = (Icon)Registry.lookupField(420095333054729915L).get(null);
      } else {
         var2 = (Icon)Registry.lookupField(471099731952994576L).get(null);
      }

      return var2;
   }

   public static Icon e(com.finalshell.ui.model.Ck4 var0) {
      Ky4[] var10000 = YT3_2.c();
      Icon var2 = null;
      Ky4[] var1 = var10000;

      label203: {
         label183: {
            com.finalshell.ui.model.Ck4 var52;
            label174: {
               try {
                  Object[] var10001 = Registry.emptyArgs();
                  long var5 = 376601465768231673L;
                  Object[] var4 = var10001;
                  var52 = (com.finalshell.ui.model.Ck4)Ref.h(376601465768231673L, var4, var5);

                  try {
                     var52 = (Boolean)var52;
                  } catch (InvocationTargetException var45) {
                     throw var45.getTargetException();
                  }

                  if (var1 == null) {
                     break label174;
                  }

                  if (var52 != false) {
                     break label183;
                  }
               } catch (RuntimeException var49) {
                  throw a(var49);
               }

               try {
                  var52 = var0;
                  if (var1 == null) {
                     break label203;
                  }

                  Object[] var10002 = Registry.emptyArgs();
                  long var25 = 278678177125024050L;
                  Object[] var24 = var10002;
                  var10002 = Ref.h(278678177125024050L, var24, var25);

                  try {
                  } catch (InvocationTargetException var36) {
                     throw var36.getTargetException();
                  }
               } catch (RuntimeException var48) {
                  throw a(var48);
               }
            }

            if (var52 == false) {
               Object[] var58 = Registry.emptyArgs();
               long var27 = 396085629172753019L;
               Object[] var26 = var58;
               Registry.packArgs(Ref.h(396085629172753019L, var26, var27));
               long var28 = 136304645930691856L;
               Object var62 = Ref.h2(136304645930691856L, var28);

               try {
                  var62 = (Icon)var62;
               } catch (InvocationTargetException var35) {
                  throw var35.getTargetException();
               }

               var2 = (Icon)var62;
               return var2;
            }
            break label203;
         }

         Object[] var54 = Registry.emptyArgs();
         long var7 = 272998330038223631L;
         Object[] var6 = var54;
         var54 = Ref.h(272998330038223631L, var6, var7);

         try {
            var54 = (File)var54;
         } catch (InvocationTargetException var44) {
            throw var44.getTargetException();
         }

         File var3 = var54;

         label205: {
            Object[] var59;
            label188: {
               try {
                  Registry.emptyArgs();
                  long var8 = 253808553645062345L;
                  var59 = Ref.h2(253808553645062345L, var8);

                  try {
                     var59 = (Boolean)var59;
                  } catch (InvocationTargetException var43) {
                     throw var43.getTargetException();
                  }

                  if (var1 == null) {
                     break label188;
                  }

                  if (var59 != false) {
                     break label205;
                  }
               } catch (RuntimeException var47) {
                  throw a(var47);
               }

               var59 = Registry.emptyArgs();
               long var12 = 454647487873911743L;
               Object var10004 = Ref.h2(454647487873911743L, var12);

               try {
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }
            }

            label206: {
               label191: {
                  try {
                     if (var1 == null) {
                        break label206;
                     }

                     if (var59 != false) {
                        break label191;
                     }
                  } catch (RuntimeException var46) {
                     throw a(var46);
                  }

                  var59 = Registry.emptyArgs();
                  long var16 = 561847341732101275L;
                  Object var66 = Ref.h2(561847341732101275L, var16);

                  try {
                     break label206;
                  } catch (InvocationTargetException var39) {
                     throw var39.getTargetException();
                  }
               }

               Registry.packArgs(var3);
               long var14 = 479640066053387692L;
               Icon var67 = (Icon)Ref.h2(479640066053387692L, var14);

               try {
                  var67 = var67;
               } catch (InvocationTargetException var40) {
                  throw var40.getTargetException();
               }

               return var67;
            }

            if (var59 != false) {
               Object[] var69 = Registry.emptyArgs();
               long var19 = 396085629172753019L;
               Object[] var18 = var69;
               Registry.packArgs(Ref.h(396085629172753019L, var18, var19));
               long var20 = 136304645930691856L;
               Object var10005 = Ref.h2(136304645930691856L, var20);

               try {
                  var10005 = (Icon)var10005;
               } catch (InvocationTargetException var38) {
                  throw var38.getTargetException();
               }

               var2 = (Icon)var10005;
            } else {
               Registry.packArgs(var3);
               long var22 = 479640066053387692L;
               Object var70 = Ref.h2(479640066053387692L, var22);

               try {
                  var70 = (Icon)var70;
               } catch (InvocationTargetException var37) {
                  throw var37.getTargetException();
               }

               var2 = (Icon)var70;
            }

            return var2;
         }

         Registry.packArgs(var3);
         long var10 = 479640066053387692L;
         Icon var64 = (Icon)Ref.h2(479640066053387692L, var10);

         try {
            var64 = var64;
         } catch (InvocationTargetException var42) {
            throw var42.getTargetException();
         }

         return var64;
      }

      Object[] var57 = Registry.emptyArgs();
      long var31 = 396085629172753019L;
      Object[] var30 = var57;
      Registry.packArgs(Ref.h(396085629172753019L, var30, var31));
      long var32 = 456706881655309399L;
      Icon var60 = (Icon)Ref.h2(456706881655309399L, var32);

      try {
         var60 = var60;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      return var60;
   }

   static void M$void() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: ldc2_w 306111151890754713
      // 06: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 09: aconst_null
      // 0a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0d: checkcast java/lang/Object
      // 10: dup
      // 11: astore 1
      // 12: monitorenter
      // 13: astore 0
      // 14: ldc2_w 458986509379024109
      // 17: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 1a: aconst_null
      // 1b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1e: checkcast javax/swing/JFileChooser
      // 21: aload 0
      // 22: ifnull 4a
      // 25: ifnonnull 49
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: new javax/swing/JFileChooser
      // 32: dup
      // 33: invokespecial javax/swing/JFileChooser.<init> ()V
      // 36: ldc2_w 458986509379024109
      // 39: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 3c: aconst_null
      // 3d: dup2_x1
      // 3e: pop2
      // 3f: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 42: goto 49
      // 45: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 1
      // 4a: monitorexit
      // 4b: goto 53
      // 4e: astore 2
      // 4f: aload 1
      // 50: monitorexit
      // 51: aload 2
      // 52: athrow
      // 53: return
   }

   public static Icon A(File param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aconst_null
      // 04: astore 2
      // 05: astore 1
      // 06: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 09: ldc2_w 253808553645062345
      // 0c: astore 3
      // 0d: ldc2_w 253808553645062345
      // 10: aload 3
      // 11: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 14: checkcast java/lang/Boolean
      // 17: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1a: goto 21
      // 1d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 1
      // 22: ifnull 57
      // 25: ifeq 3a
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: invokestatic javax/swing/filechooser/FileSystemView.getFileSystemView ()Ljavax/swing/filechooser/FileSystemView;
      // 32: aload 0
      // 33: invokevirtual javax/swing/filechooser/FileSystemView.getSystemIcon (Ljava/io/File;)Ljavax/swing/Icon;
      // 36: astore 2
      // 37: goto ad
      // 3a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3d: ldc2_w 454647487873911743
      // 40: astore 5
      // 42: ldc2_w 454647487873911743
      // 45: aload 5
      // 47: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 4a: checkcast java/lang/Boolean
      // 4d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 50: goto 57
      // 53: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 56: athrow
      // 57: ifeq a5
      // 5a: aload 0
      // 5b: ifnull ad
      // 5e: goto 65
      // 61: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 68: ldc2_w 211417741315375019
      // 6b: astore 7
      // 6d: ldc2_w 211417741315375019
      // 70: aload 7
      // 72: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 75: pop
      // 76: goto 7d
      // 79: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: ldc2_w 458986509379024109
      // 80: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 83: aconst_null
      // 84: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 87: checkcast javax/swing/JFileChooser
      // 8a: invokevirtual javax/swing/JFileChooser.getUI ()Ljavax/swing/plaf/FileChooserUI;
      // 8d: ldc2_w 458986509379024109
      // 90: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 93: aconst_null
      // 94: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 97: checkcast javax/swing/JFileChooser
      // 9a: invokevirtual javax/swing/plaf/FileChooserUI.getFileView (Ljavax/swing/JFileChooser;)Ljavax/swing/filechooser/FileView;
      // 9d: aload 0
      // 9e: invokevirtual javax/swing/filechooser/FileView.getIcon (Ljava/io/File;)Ljavax/swing/Icon;
      // a1: astore 2
      // a2: goto ad
      // a5: invokestatic javax/swing/filechooser/FileSystemView.getFileSystemView ()Ljavax/swing/filechooser/FileSystemView;
      // a8: aload 0
      // a9: invokevirtual javax/swing/filechooser/FileSystemView.getSystemIcon (Ljava/io/File;)Ljavax/swing/Icon;
      // ac: astore 2
      // ad: aload 2
      // ae: aload 1
      // af: ifnull e8
      // b2: ifnonnull e7
      // b5: goto bc
      // b8: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb: athrow
      // bc: aload 0
      // bd: aload 1
      // be: ifnull d3
      // c1: goto c8
      // c4: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7: athrow
      // c8: ifnull e7
      // cb: goto d2
      // ce: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d1: athrow
      // d2: aload 0
      // d3: invokevirtual java/io/File.isDirectory ()Z
      // d6: ifeq e7
      // d9: ldc2_w 420095333054729915
      // dc: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // df: aconst_null
      // e0: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // e3: checkcast javax/swing/Icon
      // e6: astore 2
      // e7: aload 2
      // e8: areturn
   }

   public static String p(String param0) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aconst_null
      // 04: astore 2
      // 05: astore 1
      // 06: aconst_null
      // 07: astore 3
      // 08: aconst_null
      // 09: astore 4
      // 0b: new java/io/File
      // 0e: dup
      // 0f: aload 0
      // 10: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 13: astore 5
      // 15: new java/io/FileInputStream
      // 18: dup
      // 19: aload 5
      // 1b: invokespecial java/io/FileInputStream.<init> (Ljava/io/File;)V
      // 1e: astore 3
      // 1f: new java/io/DataInputStream
      // 22: dup
      // 23: aload 3
      // 24: invokespecial java/io/DataInputStream.<init> (Ljava/io/InputStream;)V
      // 27: astore 4
      // 29: aload 5
      // 2b: invokevirtual java/io/File.length ()J
      // 2e: l2i
      // 2f: newarray 8
      // 31: astore 6
      // 33: aload 4
      // 35: aload 6
      // 37: invokevirtual java/io/DataInputStream.readFully ([B)V
      // 3a: new java/lang/String
      // 3d: dup
      // 3e: aload 6
      // 40: sipush -17871
      // 43: sipush 6541
      // 46: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 49: invokespecial java/lang/String.<init> ([BLjava/lang/String;)V
      // 4c: astore 2
      // 4d: aload 4
      // 4f: aload 1
      // 50: ifnull 5f
      // 53: ifnull 98
      // 56: goto 5d
      // 59: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 4
      // 5f: invokevirtual java/io/DataInputStream.close ()V
      // 62: goto 98
      // 65: astore 5
      // 67: aload 5
      // 69: invokevirtual java/io/IOException.printStackTrace ()V
      // 6c: goto 98
      // 6f: astore 5
      // 71: aload 5
      // 73: athrow
      // 74: astore 7
      // 76: aload 4
      // 78: aload 1
      // 79: ifnull 88
      // 7c: ifnull 95
      // 7f: goto 86
      // 82: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 4
      // 88: invokevirtual java/io/DataInputStream.close ()V
      // 8b: goto 95
      // 8e: astore 8
      // 90: aload 8
      // 92: invokevirtual java/io/IOException.printStackTrace ()V
      // 95: aload 7
      // 97: athrow
      // 98: aload 2
      // 99: areturn
   }

   public static void q(String param0, String param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 03: aload 0
      // 04: sipush -17871
      // 07: sipush 6541
      // 0a: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 0d: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 10: astore 3
      // 11: astore 2
      // 12: new java/io/File
      // 15: dup
      // 16: aload 1
      // 17: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1a: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 1d: astore 4
      // 1f: aload 4
      // 21: aload 2
      // 22: ifnull 31
      // 25: ifnull 4f
      // 28: goto 2f
      // 2b: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 4
      // 31: invokevirtual java/io/File.exists ()Z
      // 34: aload 2
      // 35: ifnull 4e
      // 38: ifne 4f
      // 3b: goto 42
      // 3e: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 4
      // 44: invokevirtual java/io/File.mkdirs ()Z
      // 47: goto 4e
      // 4a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: pop
      // 4f: aconst_null
      // 50: astore 5
      // 52: new java/io/FileOutputStream
      // 55: dup
      // 56: aload 1
      // 57: invokespecial java/io/FileOutputStream.<init> (Ljava/lang/String;)V
      // 5a: astore 5
      // 5c: aload 5
      // 5e: aload 3
      // 5f: invokevirtual java/io/FileOutputStream.write ([B)V
      // 62: aload 5
      // 64: aload 2
      // 65: ifnull 6d
      // 68: ifnull 92
      // 6b: aload 5
      // 6d: invokevirtual java/io/FileOutputStream.close ()V
      // 70: goto 92
      // 73: astore 6
      // 75: aload 6
      // 77: athrow
      // 78: astore 7
      // 7a: aload 5
      // 7c: aload 2
      // 7d: ifnull 8c
      // 80: ifnull 8f
      // 83: goto 8a
      // 86: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: aload 5
      // 8c: invokevirtual java/io/FileOutputStream.close ()V
      // 8f: aload 7
      // 91: athrow
      // 92: return
   }

   public static void S(String var0, String var1) throws Exception {
      Registry.packArgs(var0, new File(var1));
      long var2 = 606168502965872893L;
      Ref.h2(606168502965872893L, var2);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public static void L(String param0, File param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/YT3_2.c ()[Lcom/finalshell/ui/panel/Ky4;
      // 003: aload 0
      // 004: sipush -17871
      // 007: sipush 6541
      // 00a: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 00d: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 010: astore 3
      // 011: astore 2
      // 012: new java/io/File
      // 015: dup
      // 016: new java/lang/StringBuilder
      // 019: dup
      // 01a: invokespecial java/lang/StringBuilder.<init> ()V
      // 01d: aload 1
      // 01e: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 021: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 024: sipush -17895
      // 027: sipush -32611
      // 02a: invokestatic com/finalshell/core/Lk2.b (II)Ljava/lang/String;
      // 02d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 030: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 033: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 036: astore 4
      // 038: aload 4
      // 03a: aload 2
      // 03b: ifnull 05c
      // 03e: invokevirtual java/io/File.exists ()Z
      // 041: ifeq 058
      // 044: goto 04b
      // 047: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: aload 4
      // 04d: invokevirtual java/io/File.delete ()Z
      // 050: pop
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: aload 1
      // 059: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 05c: astore 5
      // 05e: aload 5
      // 060: aload 2
      // 061: ifnull 070
      // 064: ifnull 08e
      // 067: goto 06e
      // 06a: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: aload 5
      // 070: invokevirtual java/io/File.exists ()Z
      // 073: aload 2
      // 074: ifnull 08d
      // 077: ifne 08e
      // 07a: goto 081
      // 07d: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: aload 5
      // 083: invokevirtual java/io/File.mkdirs ()Z
      // 086: goto 08d
      // 089: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: pop
      // 08e: aconst_null
      // 08f: astore 6
      // 091: new java/io/FileOutputStream
      // 094: dup
      // 095: aload 4
      // 097: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 09a: astore 6
      // 09c: aload 6
      // 09e: aload 3
      // 09f: invokevirtual java/io/FileOutputStream.write ([B)V
      // 0a2: aload 6
      // 0a4: invokevirtual java/io/FileOutputStream.flush ()V
      // 0a7: aload 6
      // 0a9: invokevirtual java/io/FileOutputStream.close ()V
      // 0ac: aload 1
      // 0ad: invokevirtual java/io/File.delete ()Z
      // 0b0: pop
      // 0b1: aload 1
      // 0b2: invokevirtual java/io/File.exists ()Z
      // 0b5: aload 2
      // 0b6: ifnull 0d5
      // 0b9: ifeq 0cf
      // 0bc: goto 0c3
      // 0bf: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: aload 1
      // 0c4: invokevirtual java/io/File.delete ()Z
      // 0c7: pop
      // 0c8: goto 0cf
      // 0cb: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 4
      // 0d1: aload 1
      // 0d2: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // 0d5: pop
      // 0d6: aload 6
      // 0d8: aload 2
      // 0d9: ifnull 0e1
      // 0dc: ifnull 106
      // 0df: aload 6
      // 0e1: invokevirtual java/io/FileOutputStream.close ()V
      // 0e4: goto 106
      // 0e7: astore 7
      // 0e9: aload 7
      // 0eb: athrow
      // 0ec: astore 8
      // 0ee: aload 6
      // 0f0: aload 2
      // 0f1: ifnull 100
      // 0f4: ifnull 103
      // 0f7: goto 0fe
      // 0fa: invokestatic com/finalshell/core/Lk2.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: aload 6
      // 100: invokevirtual java/io/FileOutputStream.close ()V
      // 103: aload 8
      // 105: athrow
      // 106: return
   }

   static {
      __vfClinit__();
   }

   public static void A(String[] var0) {
      m = var0;
   }

   public static String[] V() {
      return m;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -17846) & 65535;
      if (i[var2] == null) {
         char[] var3 = f[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 130;
               break;
            case 1:
               var10000 = 176;
               break;
            case 2:
               var10000 = 195;
               break;
            case 3:
               var10000 = 199;
               break;
            case 4:
               var10000 = 99;
               break;
            case 5:
               var10000 = 20;
               break;
            case 6:
               var10000 = 91;
               break;
            case 7:
               var10000 = 218;
               break;
            case 8:
               var10000 = 9;
               break;
            case 9:
               var10000 = 141;
               break;
            case 10:
               var10000 = 67;
               break;
            case 11:
               var10000 = 107;
               break;
            case 12:
               var10000 = 40;
               break;
            case 13:
               var10000 = 198;
               break;
            case 14:
               var10000 = 177;
               break;
            case 15:
               var10000 = 34;
               break;
            case 16:
               var10000 = 75;
               break;
            case 17:
               var10000 = 238;
               break;
            case 18:
               var10000 = 162;
               break;
            case 19:
               var10000 = 33;
               break;
            case 20:
               var10000 = 58;
               break;
            case 21:
               var10000 = 192;
               break;
            case 22:
               var10000 = 145;
               break;
            case 23:
               var10000 = 30;
               break;
            case 24:
               var10000 = 71;
               break;
            case 25:
               var10000 = 180;
               break;
            case 26:
               var10000 = 237;
               break;
            case 27:
               var10000 = 18;
               break;
            case 28:
               var10000 = 4;
               break;
            case 29:
               var10000 = 37;
               break;
            case 30:
               var10000 = 12;
               break;
            case 31:
               var10000 = 70;
               break;
            case 32:
               var10000 = 185;
               break;
            case 33:
               var10000 = 105;
               break;
            case 34:
               var10000 = 49;
               break;
            case 35:
               var10000 = 219;
               break;
            case 36:
               var10000 = 182;
               break;
            case 37:
               var10000 = 7;
               break;
            case 38:
               var10000 = 202;
               break;
            case 39:
               var10000 = 29;
               break;
            case 40:
               var10000 = 200;
               break;
            case 41:
               var10000 = 175;
               break;
            case 42:
               var10000 = 151;
               break;
            case 43:
               var10000 = 161;
               break;
            case 44:
               var10000 = 57;
               break;
            case 45:
               var10000 = 239;
               break;
            case 46:
               var10000 = 169;
               break;
            case 47:
               var10000 = 115;
               break;
            case 48:
               var10000 = 114;
               break;
            case 49:
               var10000 = 23;
               break;
            case 50:
               var10000 = 222;
               break;
            case 51:
               var10000 = 186;
               break;
            case 52:
               var10000 = 85;
               break;
            case 53:
               var10000 = 45;
               break;
            case 54:
               var10000 = 206;
               break;
            case 55:
               var10000 = 188;
               break;
            case 56:
               var10000 = 224;
               break;
            case 57:
               var10000 = 227;
               break;
            case 58:
               var10000 = 53;
               break;
            case 59:
               var10000 = 240;
               break;
            case 60:
               var10000 = 126;
               break;
            case 61:
               var10000 = 179;
               break;
            case 62:
               var10000 = 32;
               break;
            case 63:
               var10000 = 173;
               break;
            case 64:
               var10000 = 135;
               break;
            case 65:
               var10000 = 127;
               break;
            case 66:
               var10000 = 56;
               break;
            case 67:
               var10000 = 187;
               break;
            case 68:
               var10000 = 8;
               break;
            case 69:
               var10000 = 98;
               break;
            case 70:
               var10000 = 247;
               break;
            case 71:
               var10000 = 197;
               break;
            case 72:
               var10000 = 95;
               break;
            case 73:
               var10000 = 73;
               break;
            case 74:
               var10000 = 108;
               break;
            case 75:
               var10000 = 249;
               break;
            case 76:
               var10000 = 150;
               break;
            case 77:
               var10000 = 16;
               break;
            case 78:
               var10000 = 25;
               break;
            case 79:
               var10000 = 48;
               break;
            case 80:
               var10000 = 59;
               break;
            case 81:
               var10000 = 31;
               break;
            case 82:
               var10000 = 110;
               break;
            case 83:
               var10000 = 10;
               break;
            case 84:
               var10000 = 174;
               break;
            case 85:
               var10000 = 36;
               break;
            case 86:
               var10000 = 156;
               break;
            case 87:
               var10000 = 84;
               break;
            case 88:
               var10000 = 167;
               break;
            case 89:
               var10000 = 121;
               break;
            case 90:
               var10000 = 146;
               break;
            case 91:
               var10000 = 72;
               break;
            case 92:
               var10000 = 158;
               break;
            case 93:
               var10000 = 210;
               break;
            case 94:
               var10000 = 163;
               break;
            case 95:
               var10000 = 225;
               break;
            case 96:
               var10000 = 216;
               break;
            case 97:
               var10000 = 104;
               break;
            case 98:
               var10000 = 178;
               break;
            case 99:
               var10000 = 242;
               break;
            case 100:
               var10000 = 87;
               break;
            case 101:
               var10000 = 245;
               break;
            case 102:
               var10000 = 50;
               break;
            case 103:
               var10000 = 5;
               break;
            case 104:
               var10000 = 246;
               break;
            case 105:
               var10000 = 226;
               break;
            case 106:
               var10000 = 250;
               break;
            case 107:
               var10000 = 54;
               break;
            case 108:
               var10000 = 109;
               break;
            case 109:
               var10000 = 93;
               break;
            case 110:
               var10000 = 112;
               break;
            case 111:
               var10000 = 88;
               break;
            case 112:
               var10000 = 44;
               break;
            case 113:
               var10000 = 81;
               break;
            case 114:
               var10000 = 27;
               break;
            case 115:
               var10000 = 122;
               break;
            case 116:
               var10000 = 203;
               break;
            case 117:
               var10000 = 118;
               break;
            case 118:
               var10000 = 248;
               break;
            case 119:
               var10000 = 154;
               break;
            case 120:
               var10000 = 21;
               break;
            case 121:
               var10000 = 60;
               break;
            case 122:
               var10000 = 233;
               break;
            case 123:
               var10000 = 78;
               break;
            case 124:
               var10000 = 164;
               break;
            case 125:
               var10000 = 74;
               break;
            case 126:
               var10000 = 42;
               break;
            case 127:
               var10000 = 97;
               break;
            case 128:
               var10000 = 68;
               break;
            case 129:
               var10000 = 166;
               break;
            case 130:
               var10000 = 170;
               break;
            case 131:
               var10000 = 212;
               break;
            case 132:
               var10000 = 66;
               break;
            case 133:
               var10000 = 128;
               break;
            case 134:
               var10000 = 38;
               break;
            case 135:
               var10000 = 184;
               break;
            case 136:
               var10000 = 79;
               break;
            case 137:
               var10000 = 159;
               break;
            case 138:
               var10000 = 113;
               break;
            case 139:
               var10000 = 241;
               break;
            case 140:
               var10000 = 160;
               break;
            case 141:
               var10000 = 133;
               break;
            case 142:
               var10000 = 152;
               break;
            case 143:
               var10000 = 41;
               break;
            case 144:
               var10000 = 101;
               break;
            case 145:
               var10000 = 94;
               break;
            case 146:
               var10000 = 15;
               break;
            case 147:
               var10000 = 209;
               break;
            case 148:
               var10000 = 132;
               break;
            case 149:
               var10000 = 235;
               break;
            case 150:
               var10000 = 213;
               break;
            case 151:
               var10000 = 124;
               break;
            case 152:
               var10000 = 76;
               break;
            case 153:
               var10000 = 61;
               break;
            case 154:
               var10000 = 143;
               break;
            case 155:
               var10000 = 63;
               break;
            case 156:
               var10000 = 51;
               break;
            case 157:
               var10000 = 64;
               break;
            case 158:
               var10000 = 228;
               break;
            case 159:
               var10000 = 211;
               break;
            case 160:
               var10000 = 229;
               break;
            case 161:
               var10000 = 62;
               break;
            case 162:
               var10000 = 168;
               break;
            case 163:
               var10000 = 140;
               break;
            case 164:
               var10000 = 157;
               break;
            case 165:
               var10000 = 149;
               break;
            case 166:
               var10000 = 0;
               break;
            case 167:
               var10000 = 232;
               break;
            case 168:
               var10000 = 204;
               break;
            case 169:
               var10000 = 217;
               break;
            case 170:
               var10000 = 90;
               break;
            case 171:
               var10000 = 137;
               break;
            case 172:
               var10000 = 138;
               break;
            case 173:
               var10000 = 82;
               break;
            case 174:
               var10000 = 55;
               break;
            case 175:
               var10000 = 191;
               break;
            case 176:
               var10000 = 172;
               break;
            case 177:
               var10000 = 120;
               break;
            case 178:
               var10000 = 24;
               break;
            case 179:
               var10000 = 189;
               break;
            case 180:
               var10000 = 111;
               break;
            case 181:
               var10000 = 236;
               break;
            case 182:
               var10000 = 11;
               break;
            case 183:
               var10000 = 117;
               break;
            case 184:
               var10000 = 77;
               break;
            case 185:
               var10000 = 253;
               break;
            case 186:
               var10000 = 13;
               break;
            case 187:
               var10000 = 139;
               break;
            case 188:
               var10000 = 142;
               break;
            case 189:
               var10000 = 214;
               break;
            case 190:
               var10000 = 89;
               break;
            case 191:
               var10000 = 231;
               break;
            case 192:
               var10000 = 244;
               break;
            case 193:
               var10000 = 28;
               break;
            case 194:
               var10000 = 207;
               break;
            case 195:
               var10000 = 234;
               break;
            case 196:
               var10000 = 193;
               break;
            case 197:
               var10000 = 134;
               break;
            case 198:
               var10000 = 190;
               break;
            case 199:
               var10000 = 86;
               break;
            case 200:
               var10000 = 52;
               break;
            case 201:
               var10000 = 201;
               break;
            case 202:
               var10000 = 96;
               break;
            case 203:
               var10000 = 230;
               break;
            case 204:
               var10000 = 144;
               break;
            case 205:
               var10000 = 65;
               break;
            case 206:
               var10000 = 254;
               break;
            case 207:
               var10000 = 92;
               break;
            case 208:
               var10000 = 165;
               break;
            case 209:
               var10000 = 46;
               break;
            case 210:
               var10000 = 251;
               break;
            case 211:
               var10000 = 148;
               break;
            case 212:
               var10000 = 19;
               break;
            case 213:
               var10000 = 69;
               break;
            case 214:
               var10000 = 183;
               break;
            case 215:
               var10000 = 255;
               break;
            case 216:
               var10000 = 194;
               break;
            case 217:
               var10000 = 221;
               break;
            case 218:
               var10000 = 243;
               break;
            case 219:
               var10000 = 220;
               break;
            case 220:
               var10000 = 47;
               break;
            case 221:
               var10000 = 35;
               break;
            case 222:
               var10000 = 205;
               break;
            case 223:
               var10000 = 131;
               break;
            case 224:
               var10000 = 22;
               break;
            case 225:
               var10000 = 6;
               break;
            case 226:
               var10000 = 136;
               break;
            case 227:
               var10000 = 223;
               break;
            case 228:
               var10000 = 1;
               break;
            case 229:
               var10000 = 153;
               break;
            case 230:
               var10000 = 103;
               break;
            case 231:
               var10000 = 147;
               break;
            case 232:
               var10000 = 181;
               break;
            case 233:
               var10000 = 80;
               break;
            case 234:
               var10000 = 102;
               break;
            case 235:
               var10000 = 123;
               break;
            case 236:
               var10000 = 14;
               break;
            case 237:
               var10000 = 155;
               break;
            case 238:
               var10000 = 2;
               break;
            case 239:
               var10000 = 116;
               break;
            case 240:
               var10000 = 26;
               break;
            case 241:
               var10000 = 125;
               break;
            case 242:
               var10000 = 106;
               break;
            case 243:
               var10000 = 129;
               break;
            case 244:
               var10000 = 252;
               break;
            case 245:
               var10000 = 196;
               break;
            case 246:
               var10000 = 119;
               break;
            case 247:
               var10000 = 83;
               break;
            case 248:
               var10000 = 171;
               break;
            case 249:
               var10000 = 17;
               break;
            case 250:
               var10000 = 215;
               break;
            case 251:
               var10000 = 100;
               break;
            case 252:
               var10000 = 43;
               break;
            case 253:
               var10000 = 39;
               break;
            case 254:
               var10000 = 208;
               break;
            default:
               var10000 = 3;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19510;
      if (j[var3] == null) {
         j[var3] = (int)(a[var3] ^ var1);
      }

      return j[var3];
   }

   public static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 21478) & 32767;
      if (o[var3] == null) {
         o[var3] = l[var3] ^ var1;
      }

      return o[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[124];
      String[] var10000 = new String[4];
      int var19 = 0;
      A(var10000);
      String var18 = "4ñ\u0003òlD\u0007邻戏乴輱政与姡\u0002Q½\u0002ÕG\u0002Vm\u0004õmyÄ\u0003BÝ\u008d\u0002s\u0012\u0002\u0011 \u0014YC1Ó\u0006ÿ'\u0016UcÊAI\ttô\u0087f*ã\u0003\u0083Ç×\u0002)Í\u0003R,»\u0011\u0087\u009b&\u0006i¦\u0019´÷uÕßvÙB^¿\b<e\u001d¾\\\u0082\t\u0091\b4i\u0001qÛ\nËJ\u0003PÔî\u001bT¬\u001dþzT\u0083ª<µ\u001cË>\u008a\u001fò.¾t¸\fzEF\u001e\u0019\\\r@½\u008f!è\u009c{ì«¾GSF\u0006[IÁÆWr\tR\u009dÉ\u008a\u000e\u009c\"#\u008a\u0002\u009e\u0000\u0002Cµ\u0007\u0017\u001c¦pÿk¢\tW\u0094·[9\u0094\u0088Å\u0091\u000eãIª\\øí8Ò [=\u0090%\u008d$K\u0080g#Úæ½ó¾Q\u0081=W`¨4Æó¨:5&á$¥ÕÞö2\u0011&;\u001cÏ\u0003ü\u0003卧翆\u0016\bC\bñcsóÁÝ\u0002þ¶\u0005Á\u0097\u0093\u0004²\u0002ðÜ\u0006&:]ÍH\u000b\u0010M°1\u008f\u008c-\u007f\t¾¥\u0017\u009d\u0096ê /\u000fw'I«\u00156\u0007Pý e\r\u009aÁ\u0096\u0003!T¸\u0002\u0081u\u0003b1\u0097\u0003V\u0097\u009d\u0002á¢\t5F¹â ü¥÷F\u0002\u0018î\u0007譚罻夔遝缜迃噷\u0006 ¹×jhß&ë\u0095ò0ä\n1&fÈ×j^I'\u008fmäÑ±\u0097T·&H^áG\u0014çf\u00025ÊC\u0011gÆ\u0002P'\u0003l,Ø\u0002\u009e\u0088\r\u0083%\u0016/,ò\u0082\tÏr£\u008bÓ\u0004ojÁ×\u0010,¿\nÁ»\\ÏÞK\u0087ö×wvõ©\u0004\u0083\u001a·*\u0002\u0002(\u0003D\f \u0003^ù\u0017\u0003\u008eé\u0084\u0002CU\t\u0007B½\u0081xÏ ®\u0094\u0014\u0086!4x\u0015=c2\u008eÃg sðÖ\u001c±³\u008bÔ\f\u009f@öAÏö\u0081\u0018\u0004\u009e~Q\u0005匠羢孒戱+\u0011æ\\D\u0012\"\u009eª\u007f\u0004k@Dc\u008bâ\u0005å\u000e\u0005ÝvÎc¿X\u0083Ä\u0002\u008bÑó¥\u0002q·\u0003G¾3\u0012|¾(\u00989P\u0082\u009cM9s>X§ÎöèÊ\u0003卓羨\u0090\t±y\u0094ë\u0096ã$\u0099ù\u0005ÑÜm\u008b÷\u0003åÐ²\u0003ÃÕP\u0002Ä\u0091\u0015FmÍsÍ\u009a\u0017Åª^\r)\b°cÌ\u0097\u0015©+d\u0013<\u001f\u0005e|½ÚUY¹y¢¤3¬xw\u001f)$k.\u009e\u009cC\u0000ÑT\u009eëÕ\u0081NHKaUF¶@\u0002Î#[wv\f<9\u001e-\u0018o\u0005\u0006\u0096\u0012h\u0011\u0095»\u0018«íÙì¿]Þ\u0093\u0092\u009f%LD\u000b¾\u0082\u0011Ï¤Z\u00ad\nÜÜÁ\u0002\u0005À\b\u0089ÊC\u009fû{åQ\"Ð¿X\"äÖ§ÂÖýà)ÖM²Ùû\u001b¦Ð|\u0085!f\u009b\u0012Â;.aÜ5OQ\u0004d¤7Ð\u0003£Q\u0085\u0004uA\bÛ\r\u0016ë\u0006Ò\u0019æ¦Xë\u009c¨d½\u0010=ûq\n\u0083'I\u0083@s\u0017ò\u0084wóÒ\u0003\u001f\u0094ù\u0005\u000eÁ\\\u0096E\u0005 È\u009d\u0093Y\u0010WI\u009dü\u0096Z¾Ô:ÍÝâæ\\`Ã\u0012Ã¾!\u001a°à)YØMÁµ_?\u00adQ°n̈ÂYp3(\u00135ó\u0090zf¨}½üg\u0093\u001d´Ý\u0013t<V¹±a<Øö\u0097¯\u008cÝ\u001fYÛj,$À¥õ\u0015ÔÖ\u008fÕ5\u0084\u0000³°â\u0092\u0084þCZY\u0084!@¨ÔS÷ñ«Ë\u0083ñæâ\u0082¥O*,âÛÈ\\\u0095\rºpõL\u0007\u0015ÐÞDÍ¢Àýo/ò6þ\u0002kXu{Ä\u0001>\u008a\u0087ÀI\"*ãËV\u001cò\u0012,!í¼}_´Ö\u007f®ÈZ<Ö\u008f4®Ûh×\"Ú\u007fÊ)ÁðÏ<\u0005®;]¦*Ë\n\u0098Cã\u001em¯)\u009e92¨Q¢^\u001bæú\u0081. Ê\u0094ràõ\u0012\u0087úø\u001a\u0002Ù\u0016\r>¶QTÞ\u001e\u0018\u001a\u001eëOQ·2Å\u0001³\u0088á\u0088µHxfc'è\u0081ô·¿ÏíÆü-ðWæ\u008c}q\\vÙtÐ;àPÇCKÞÄêÏüYá¼¦ª%äüË3-¿¿P¾\u001aeK°¤Ñ,÷ªìËß=E]\u009b\u001fþ\u0003¨SüýfûÞ\u001diZI\u001fao`·b\u0087\u00998aàSÆ\u000bv|n\u001f\u008e\u0007Õ\u0087Èç\u0084}èÅd.Îô}³\u00154ø\u0010\u0091Ã&\u0081\u008e\u0093X¦ny\u008b\u0003ª\u001cÃk\b\f~3°ÕÒHMô[Zÿ\"\u0091ÚØ)Z·0¡\u000f¨\u0003ÃÂ\u0093îCßUY¬\u008eã7\u00881N-z\u009eR¡fÏ~\u0095O1òBè-¶m»Ì]Â\u0094\u0095Çúx´ÞzÇ;6\u001a>\u0017ó³ðÄª\u00954\u009f\u0087:1-\u0091\føÜ\u0005P.¬\"õ#ìÞØþùZ\u0000~9Ý\u0088ôóù·«\u0083{j±\u001a\b\r@-\u009e§P´Ö÷c>3\u0019÷ÂVN\u0095|ò6fT¤©ÜÖi¹\u009aou\u0087ÇàL]\u0081U\u0011L¢\u0087é\u0085»¶ÛR\u008c\u0097x\u0097#ÌÈ/a»ÈïsU\u0093!\u008fe8jÿ\u008eü\u009e\u0003:\u0019\u0085\u0091\u0019\fr'´\u000eá·2µ\u0016C£\u008efµjÃíwÿ\u0084-EÓwâ\f\u008eùÃ0E\u0007×X\u000e$à\u0086à7w%¯hÍæ\u0010\u008e$¯ð\tiÁ`\u0004\u001dU[p¬ÐÍ,Z\u001bèÔ\u00880\\\u0015\u0081K\t¬CÔ\u0088\tý\u0012²\u008b\u0012P\u0096Ç¾ñx¤_¡K´\u0001g\u001f\u0010ôÆ\u000b\u0088åï(Þ\u001cüR¯¤ÞQ\u0010S÷Û(I³ò®Õ¨_\u008d+êx!¦vÕ2jñªØ\u0003QuqET\u0018UâÖLw\u0086\u0086á\u009f;\u001d\u0016´ÎìGS\u0019Þü0é³qvjI\u0018z2Í\nõK\u008bo|¢ mx§\u000f7\u0014¥ò»\u00adó[íSÚð:\u0093\u0011\u0010¶ò\u008e)ãû\u0003X³ìl\u0010Åì\u0010u)\u0011\u009f\u000f±ßà\u008e±·\u0002\u0080\u0088'¨Òx\u009c5-{\u00960Y\u0083¸×ÖUZm\u0090\u0097:PAQ§\u0080Uæ\u0094\u0017~\u0004bIZfùE\u001f¦Ri8(\u009d)\u009d\u0003%|íÙ\u0002\u0011\u0085\t{8ì>ª\n¶ñ\u0018\u0007¦\u008a]D×¥V\u0002æ?\u0002Ø\u000b\u0014\u008enËvYKÌ\u0080(±e\u001b¼BÊ\u009dPKÐF\u0007zË\u000b\u008aJ4\u0014\b\u008aÌ\bT\u0095)\u008d`\u0002O\u0004\u000b韼褒襜匁盌救丳亽咭泮ä\u0005ó\u009d<À\u007f\u0002·Ô\n'\u0099\u0000o\u0093ß³n\u0094H\u0004\u008eêt®\r/¬\u007fõ¡¥þ|O\u008b\u0005\u0007]\u0003º·\u0093\u0003g\u0089p\tÍY5X~\u0097\u001fW{\u0002_¢DqjbÒ\u009b\u0017Ãâ\u0005+RiÍ\u009f¿@0ôÐIø\u0091\u0011US\u009bËWr\u008a/ÐT\u0080\u0095v\te¢\u001b\u0000Ìhø÷ºõj\u009aF3©ç\u0084f\u008fªJþÊh\r¢É4Äu\u000b\u0004?`\\H\u001e\u0098\u0089\"ÂØ\u0005\u0001ðiÈX´m¢Ù\u009bI`¸\u008e\u0088ÚrÔx{1´q\u0016\u0002`\u0090\u0004\u00147\u0018ô\u001b\u0001ÔQÏàÖÞù\u0014±Øçú>{\u0015/SBt?æ!+p¢*\rÎG|ø\u0011ÿC\u0088ElHìX\u0017D\u0087\u008d.Å1\u0016°\u008cð\u000eÆW\u0006WöE\u0096/+ª\r§\u0006Î\f\nÜÓ\t";
      int var20 = "4ñ\u0003òlD\u0007邻戏乴輱政与姡\u0002Q½\u0002ÕG\u0002Vm\u0004õmyÄ\u0003BÝ\u008d\u0002s\u0012\u0002\u0011 \u0014YC1Ó\u0006ÿ'\u0016UcÊAI\ttô\u0087f*ã\u0003\u0083Ç×\u0002)Í\u0003R,»\u0011\u0087\u009b&\u0006i¦\u0019´÷uÕßvÙB^¿\b<e\u001d¾\\\u0082\t\u0091\b4i\u0001qÛ\nËJ\u0003PÔî\u001bT¬\u001dþzT\u0083ª<µ\u001cË>\u008a\u001fò.¾t¸\fzEF\u001e\u0019\\\r@½\u008f!è\u009c{ì«¾GSF\u0006[IÁÆWr\tR\u009dÉ\u008a\u000e\u009c\"#\u008a\u0002\u009e\u0000\u0002Cµ\u0007\u0017\u001c¦pÿk¢\tW\u0094·[9\u0094\u0088Å\u0091\u000eãIª\\øí8Ò [=\u0090%\u008d$K\u0080g#Úæ½ó¾Q\u0081=W`¨4Æó¨:5&á$¥ÕÞö2\u0011&;\u001cÏ\u0003ü\u0003卧翆\u0016\bC\bñcsóÁÝ\u0002þ¶\u0005Á\u0097\u0093\u0004²\u0002ðÜ\u0006&:]ÍH\u000b\u0010M°1\u008f\u008c-\u007f\t¾¥\u0017\u009d\u0096ê /\u000fw'I«\u00156\u0007Pý e\r\u009aÁ\u0096\u0003!T¸\u0002\u0081u\u0003b1\u0097\u0003V\u0097\u009d\u0002á¢\t5F¹â ü¥÷F\u0002\u0018î\u0007譚罻夔遝缜迃噷\u0006 ¹×jhß&ë\u0095ò0ä\n1&fÈ×j^I'\u008fmäÑ±\u0097T·&H^áG\u0014çf\u00025ÊC\u0011gÆ\u0002P'\u0003l,Ø\u0002\u009e\u0088\r\u0083%\u0016/,ò\u0082\tÏr£\u008bÓ\u0004ojÁ×\u0010,¿\nÁ»\\ÏÞK\u0087ö×wvõ©\u0004\u0083\u001a·*\u0002\u0002(\u0003D\f \u0003^ù\u0017\u0003\u008eé\u0084\u0002CU\t\u0007B½\u0081xÏ ®\u0094\u0014\u0086!4x\u0015=c2\u008eÃg sðÖ\u001c±³\u008bÔ\f\u009f@öAÏö\u0081\u0018\u0004\u009e~Q\u0005匠羢孒戱+\u0011æ\\D\u0012\"\u009eª\u007f\u0004k@Dc\u008bâ\u0005å\u000e\u0005ÝvÎc¿X\u0083Ä\u0002\u008bÑó¥\u0002q·\u0003G¾3\u0012|¾(\u00989P\u0082\u009cM9s>X§ÎöèÊ\u0003卓羨\u0090\t±y\u0094ë\u0096ã$\u0099ù\u0005ÑÜm\u008b÷\u0003åÐ²\u0003ÃÕP\u0002Ä\u0091\u0015FmÍsÍ\u009a\u0017Åª^\r)\b°cÌ\u0097\u0015©+d\u0013<\u001f\u0005e|½ÚUY¹y¢¤3¬xw\u001f)$k.\u009e\u009cC\u0000ÑT\u009eëÕ\u0081NHKaUF¶@\u0002Î#[wv\f<9\u001e-\u0018o\u0005\u0006\u0096\u0012h\u0011\u0095»\u0018«íÙì¿]Þ\u0093\u0092\u009f%LD\u000b¾\u0082\u0011Ï¤Z\u00ad\nÜÜÁ\u0002\u0005À\b\u0089ÊC\u009fû{åQ\"Ð¿X\"äÖ§ÂÖýà)ÖM²Ùû\u001b¦Ð|\u0085!f\u009b\u0012Â;.aÜ5OQ\u0004d¤7Ð\u0003£Q\u0085\u0004uA\bÛ\r\u0016ë\u0006Ò\u0019æ¦Xë\u009c¨d½\u0010=ûq\n\u0083'I\u0083@s\u0017ò\u0084wóÒ\u0003\u001f\u0094ù\u0005\u000eÁ\\\u0096E\u0005 È\u009d\u0093Y\u0010WI\u009dü\u0096Z¾Ô:ÍÝâæ\\`Ã\u0012Ã¾!\u001a°à)YØMÁµ_?\u00adQ°n̈ÂYp3(\u00135ó\u0090zf¨}½üg\u0093\u001d´Ý\u0013t<V¹±a<Øö\u0097¯\u008cÝ\u001fYÛj,$À¥õ\u0015ÔÖ\u008fÕ5\u0084\u0000³°â\u0092\u0084þCZY\u0084!@¨ÔS÷ñ«Ë\u0083ñæâ\u0082¥O*,âÛÈ\\\u0095\rºpõL\u0007\u0015ÐÞDÍ¢Àýo/ò6þ\u0002kXu{Ä\u0001>\u008a\u0087ÀI\"*ãËV\u001cò\u0012,!í¼}_´Ö\u007f®ÈZ<Ö\u008f4®Ûh×\"Ú\u007fÊ)ÁðÏ<\u0005®;]¦*Ë\n\u0098Cã\u001em¯)\u009e92¨Q¢^\u001bæú\u0081. Ê\u0094ràõ\u0012\u0087úø\u001a\u0002Ù\u0016\r>¶QTÞ\u001e\u0018\u001a\u001eëOQ·2Å\u0001³\u0088á\u0088µHxfc'è\u0081ô·¿ÏíÆü-ðWæ\u008c}q\\vÙtÐ;àPÇCKÞÄêÏüYá¼¦ª%äüË3-¿¿P¾\u001aeK°¤Ñ,÷ªìËß=E]\u009b\u001fþ\u0003¨SüýfûÞ\u001diZI\u001fao`·b\u0087\u00998aàSÆ\u000bv|n\u001f\u008e\u0007Õ\u0087Èç\u0084}èÅd.Îô}³\u00154ø\u0010\u0091Ã&\u0081\u008e\u0093X¦ny\u008b\u0003ª\u001cÃk\b\f~3°ÕÒHMô[Zÿ\"\u0091ÚØ)Z·0¡\u000f¨\u0003ÃÂ\u0093îCßUY¬\u008eã7\u00881N-z\u009eR¡fÏ~\u0095O1òBè-¶m»Ì]Â\u0094\u0095Çúx´ÞzÇ;6\u001a>\u0017ó³ðÄª\u00954\u009f\u0087:1-\u0091\føÜ\u0005P.¬\"õ#ìÞØþùZ\u0000~9Ý\u0088ôóù·«\u0083{j±\u001a\b\r@-\u009e§P´Ö÷c>3\u0019÷ÂVN\u0095|ò6fT¤©ÜÖi¹\u009aou\u0087ÇàL]\u0081U\u0011L¢\u0087é\u0085»¶ÛR\u008c\u0097x\u0097#ÌÈ/a»ÈïsU\u0093!\u008fe8jÿ\u008eü\u009e\u0003:\u0019\u0085\u0091\u0019\fr'´\u000eá·2µ\u0016C£\u008efµjÃíwÿ\u0084-EÓwâ\f\u008eùÃ0E\u0007×X\u000e$à\u0086à7w%¯hÍæ\u0010\u008e$¯ð\tiÁ`\u0004\u001dU[p¬ÐÍ,Z\u001bèÔ\u00880\\\u0015\u0081K\t¬CÔ\u0088\tý\u0012²\u008b\u0012P\u0096Ç¾ñx¤_¡K´\u0001g\u001f\u0010ôÆ\u000b\u0088åï(Þ\u001cüR¯¤ÞQ\u0010S÷Û(I³ò®Õ¨_\u008d+êx!¦vÕ2jñªØ\u0003QuqET\u0018UâÖLw\u0086\u0086á\u009f;\u001d\u0016´ÎìGS\u0019Þü0é³qvjI\u0018z2Í\nõK\u008bo|¢ mx§\u000f7\u0014¥ò»\u00adó[íSÚð:\u0093\u0011\u0010¶ò\u008e)ãû\u0003X³ìl\u0010Åì\u0010u)\u0011\u009f\u000f±ßà\u008e±·\u0002\u0080\u0088'¨Òx\u009c5-{\u00960Y\u0083¸×ÖUZm\u0090\u0097:PAQ§\u0080Uæ\u0094\u0017~\u0004bIZfùE\u001f¦Ri8(\u009d)\u009d\u0003%|íÙ\u0002\u0011\u0085\t{8ì>ª\n¶ñ\u0018\u0007¦\u008a]D×¥V\u0002æ?\u0002Ø\u000b\u0014\u008enËvYKÌ\u0080(±e\u001b¼BÊ\u009dPKÐF\u0007zË\u000b\u008aJ4\u0014\b\u008aÌ\bT\u0095)\u008d`\u0002O\u0004\u000b韼褒襜匁盌救丳亽咭泮ä\u0005ó\u009d<À\u007f\u0002·Ô\n'\u0099\u0000o\u0093ß³n\u0094H\u0004\u008eêt®\r/¬\u007fõ¡¥þ|O\u008b\u0005\u0007]\u0003º·\u0093\u0003g\u0089p\tÍY5X~\u0097\u001fW{\u0002_¢DqjbÒ\u009b\u0017Ãâ\u0005+RiÍ\u009f¿@0ôÐIø\u0091\u0011US\u009bËWr\u008a/ÐT\u0080\u0095v\te¢\u001b\u0000Ìhø÷ºõj\u009aF3©ç\u0084f\u008fªJþÊh\r¢É4Äu\u000b\u0004?`\\H\u001e\u0098\u0089\"ÂØ\u0005\u0001ðiÈX´m¢Ù\u009bI`¸\u008e\u0088ÚrÔx{1´q\u0016\u0002`\u0090\u0004\u00147\u0018ô\u001b\u0001ÔQÏàÖÞù\u0014±Øçú>{\u0015/SBt?æ!+p¢*\rÎG|ø\u0011ÿC\u0088ElHìX\u0017D\u0087\u008d.Å1\u0016°\u008cð\u000eÆW\u0006WöE\u0096/+ª\r§\u0006Î\f\nÜÓ\t"
         .length();
      char var17 = 2;
      int var29 = -1;

      label90:
      while (true) {
         byte var30 = 55;
         String var10001 = var18.substring(++var29, var29 + var17);
         byte var10002 = -1;

         while (true) {
            label85: {
               char[] var60 = var10001.toCharArray();
               int var10004 = var60.length;
               int var22 = 0;
               byte var63 = var30;
               var54 = var60;
               int var41 = var10004;
               byte var72;
               char[] var79;
               int var10006;
               if (var10004 <= 1) {
                  var79 = var60;
                  var72 = var30;
                  var10006 = var22;
               } else {
                  var63 = var30;
                  var41 = var10004;
                  if (var10004 <= var22) {
                     break label85;
                  }

                  var79 = var60;
                  var72 = var30;
                  var10006 = var22;
               }

               while (true) {
                  char var88 = var79[var10006];
                  byte var89;
                  switch (var22 % 7) {
                     case 0:
                        var89 = 63;
                        break;
                     case 1:
                        var89 = 52;
                        break;
                     case 2:
                        var89 = 22;
                        break;
                     case 3:
                        var89 = 46;
                        break;
                     case 4:
                        var89 = 79;
                        break;
                     case 5:
                        var89 = 24;
                        break;
                     default:
                        var89 = 112;
                  }

                  var79[var10006] = (char)(var88 ^ var72 ^ var89);
                  var22++;
                  if (var63 == 0) {
                     var10006 = var63;
                     var79 = var54;
                     var72 = var63;
                  } else {
                     if (var41 <= var22) {
                        break;
                     }

                     var79 = var54;
                     var72 = var63;
                     var10006 = var22;
                  }
               }
            }

            String var65 = new String(var54).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var65;
                  if ((var29 += var17) >= var20) {
                     f = var21;
                     i = new String[124];
                     long var8 = 5380351022515941389L;
                     long[] var14 = new long[110];
                     int var11 = 0;
                     String var12 = "L\u0097;þæ¬È8å\u001e£ç\u008ab\u00829»e\u0089)ý\u0081\n)çQ5Tõ¾åó\u001e$lÿfétSM\u0088(\u0012\u009a²1\u0087¡\u0002uäðøsJ4Z\u0006Û\u0001ÀÃþ\u008d£\u009cmôZ\u0096\u008cÒ\u009fÉ²\u0015@ ´\u0094\u001cª8xûZÐËÁéÀ\u0091\u009fl3¦Ê¿wn)*+\u0004ÃÔ\u0017RH\bÕ\u009eQìÉ[lP¬ÆÒ*\u0010\u0080\u0011ÐÂ\u0099àµn1ÙÑò\u000fË\u000f\u0080jõÐÌ3\u0082\u0080\u0097ìÂÂ\u0014:'³§Qg¼'\u009bÅ\u0083F/\u0010\u00938Ü^\u008ad\u0087ùâ!©~jË±>LRD\"?x\u0002ÿó§\u0084\u0091Mcn\u0096a\u008f\u009e\u009a¯\u00894Ñrò\u0081OÜð¯Ú\n\u0005TL\u0005â7\u0082\u0081\u0006]ão1ÿ (\u000bò&»\u009dÚ\u001a.cP\u000f´Ã/igo\u001bZª\u0097Ê¹øpø\u0095?xßs\u008f\u0006R\u0094\u00adä\u0087#=G®\u0014 Ä\u000fq¤Çu\bÄû¶\"iqÙV\u007fH\u009diÁ8Ù7U\u0087\u0013~Ñ\u001b6'\u0091Ãt\u001bÈ'<\u0017Û ÓåL\u0083?Hp~\u0083Ý®ò\u0085JZ0y´\r\u001eà\u0086\u008a0\u008fY\u008b/dÍFkëô{<øÎ·8Ë\u0006ÔJùÏ£\t\u001d úÞ\u009c<\u0012\u0095L$rÑOÑ+aÔ\u0096y\u0097@\u0081®5+»ÝV²¤¸zÙ.°\u001aúIÆgØ¦\u0092ßÛÒy\u009a¡{\u0083`\u000b\n;YÎ`Aw!6\u0093)\u008d³iÆ?ñOº;\u0016-ûÞþ\u0010\u0001Ï\"Ô\u0090E|«øM\u001e«\u0000Û\u0013)\u009aºË\u008fµ\u009dé`Ê^>³0dISæ»\u007f\noÓB\nÐù×\u0096Eþ¿´ò¨\u0097÷j\r\u0017\u0002\u000bÿá4!¡jð\u0013êSqËTÈç¼\u0014xHz-\u0085yé\u0096Î\u0084\u008c;oè\u0000Óa\u0003\u008f^hÊk8\u0013a  À_NÑÚ\u0017A½mB\u00061!£_Ï³\u0006Û\u0011\u0004¢2\u0002º\u001b.\u000eE-ÉÎ¨}SI]èMÈ\\\u0098oJ×ï\u009d§ºu#í\u000bz<@.\u0019\u0019\u000fÌ¤\u0015©¹ÍÏIÌ\u0013M\u0092|R8\u0016\u007fcÜ\u0015ó\\6\u0013Z\u008a\u0099¢\u008e\u0010û\u000fÖ\u009c\u008dÐ\u0081M\u0011ÿñ\u000eÁPä\u0083Â`q?3ÕÞ\u0089Ì\u00990Ù#áó¿\u0011q²ö\u008bµÍ \u0093á_\u0002\u0014\u001fÏê.&I¸îj±\u0018»\u000eÕ¤NÔ\u0007\u001b®lAS22Hì\u0089\u0092.v\u0007!\u0014\u0001\u0095\u0081.ïcY+Lgï1k)ÁEFÀ°\u0000dFý¶¢6ÿNÖm`\u0084a2\u0004ëÓ¶É*\u0085HðÇÒ ©L%\u008b\u001e\u000b\u0014äbxÄÌi³\u001fi¤\u0017\u0081ßä ,çìÖ>TÞqÿ-±\u0096Ùß\u001fT_\u008dêz\u0017À×\u009bj\u0016ó\u0012)¶!\u000bö]m\u0099£: \u001e\u009a\u001dGq\u0017%ÀM(ÁË:0\tæÓ§ÕDï|Î\trmÄwÙf\u0003\u001aÁò\u0096\u0093ijn¾\u008fq\u0004";
                     int var13 = "L\u0097;þæ¬È8å\u001e£ç\u008ab\u00829»e\u0089)ý\u0081\n)çQ5Tõ¾åó\u001e$lÿfétSM\u0088(\u0012\u009a²1\u0087¡\u0002uäðøsJ4Z\u0006Û\u0001ÀÃþ\u008d£\u009cmôZ\u0096\u008cÒ\u009fÉ²\u0015@ ´\u0094\u001cª8xûZÐËÁéÀ\u0091\u009fl3¦Ê¿wn)*+\u0004ÃÔ\u0017RH\bÕ\u009eQìÉ[lP¬ÆÒ*\u0010\u0080\u0011ÐÂ\u0099àµn1ÙÑò\u000fË\u000f\u0080jõÐÌ3\u0082\u0080\u0097ìÂÂ\u0014:'³§Qg¼'\u009bÅ\u0083F/\u0010\u00938Ü^\u008ad\u0087ùâ!©~jË±>LRD\"?x\u0002ÿó§\u0084\u0091Mcn\u0096a\u008f\u009e\u009a¯\u00894Ñrò\u0081OÜð¯Ú\n\u0005TL\u0005â7\u0082\u0081\u0006]ão1ÿ (\u000bò&»\u009dÚ\u001a.cP\u000f´Ã/igo\u001bZª\u0097Ê¹øpø\u0095?xßs\u008f\u0006R\u0094\u00adä\u0087#=G®\u0014 Ä\u000fq¤Çu\bÄû¶\"iqÙV\u007fH\u009diÁ8Ù7U\u0087\u0013~Ñ\u001b6'\u0091Ãt\u001bÈ'<\u0017Û ÓåL\u0083?Hp~\u0083Ý®ò\u0085JZ0y´\r\u001eà\u0086\u008a0\u008fY\u008b/dÍFkëô{<øÎ·8Ë\u0006ÔJùÏ£\t\u001d úÞ\u009c<\u0012\u0095L$rÑOÑ+aÔ\u0096y\u0097@\u0081®5+»ÝV²¤¸zÙ.°\u001aúIÆgØ¦\u0092ßÛÒy\u009a¡{\u0083`\u000b\n;YÎ`Aw!6\u0093)\u008d³iÆ?ñOº;\u0016-ûÞþ\u0010\u0001Ï\"Ô\u0090E|«øM\u001e«\u0000Û\u0013)\u009aºË\u008fµ\u009dé`Ê^>³0dISæ»\u007f\noÓB\nÐù×\u0096Eþ¿´ò¨\u0097÷j\r\u0017\u0002\u000bÿá4!¡jð\u0013êSqËTÈç¼\u0014xHz-\u0085yé\u0096Î\u0084\u008c;oè\u0000Óa\u0003\u008f^hÊk8\u0013a  À_NÑÚ\u0017A½mB\u00061!£_Ï³\u0006Û\u0011\u0004¢2\u0002º\u001b.\u000eE-ÉÎ¨}SI]èMÈ\\\u0098oJ×ï\u009d§ºu#í\u000bz<@.\u0019\u0019\u000fÌ¤\u0015©¹ÍÏIÌ\u0013M\u0092|R8\u0016\u007fcÜ\u0015ó\\6\u0013Z\u008a\u0099¢\u008e\u0010û\u000fÖ\u009c\u008dÐ\u0081M\u0011ÿñ\u000eÁPä\u0083Â`q?3ÕÞ\u0089Ì\u00990Ù#áó¿\u0011q²ö\u008bµÍ \u0093á_\u0002\u0014\u001fÏê.&I¸îj±\u0018»\u000eÕ¤NÔ\u0007\u001b®lAS22Hì\u0089\u0092.v\u0007!\u0014\u0001\u0095\u0081.ïcY+Lgï1k)ÁEFÀ°\u0000dFý¶¢6ÿNÖm`\u0084a2\u0004ëÓ¶É*\u0085HðÇÒ ©L%\u008b\u001e\u000b\u0014äbxÄÌi³\u001fi¤\u0017\u0081ßä ,çìÖ>TÞqÿ-±\u0096Ùß\u001fT_\u008dêz\u0017À×\u009bj\u0016ó\u0012)¶!\u000bö]m\u0099£: \u001e\u009a\u001dGq\u0017%ÀM(ÁË:0\tæÓ§ÕDï|Î\trmÄwÙf\u0003\u001aÁò\u0096\u0093ijn¾\u008fq\u0004"
                        .length();
                     byte var10 = 0;

                     label64:
                     while (true) {
                        byte var43 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var43, var10).getBytes("ISO-8859-1");
                        long[] var32 = var14;
                        int var44 = var11++;
                        long var58 = ((long)var15[0] & 255L) << 56
                           | ((long)var15[1] & 255L) << 48
                           | ((long)var15[2] & 255L) << 40
                           | ((long)var15[3] & 255L) << 32
                           | ((long)var15[4] & 255L) << 24
                           | ((long)var15[5] & 255L) << 16
                           | ((long)var15[6] & 255L) << 8
                           | (long)var15[7] & 255L;
                        byte var66 = -1;

                        while (true) {
                           long var77 = var58 ^ var8;
                           switch (var66) {
                              case 0:
                                 var32[var44] = var77;
                                 if (var10 >= var13) {
                                    a = var14;
                                    j = new Integer[110];
                                    long var0 = 1931256438717069511L;
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "ið\u0090\u000f7,A#\u001c\u0010\u0005@ðÿGBH\u0089ÞÙÌ\u001aíe";
                                    int var5 = "ið\u0090\u000f7,A#\u001c\u0010\u0005@ðÿGBH\u0089ÞÙÌ\u001aíe".length();
                                    byte var2 = 0;

                                    do {
                                       byte var46 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
                                       int var47 = var3++;
                                       var77 = (
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
                                       byte var68 = -1;
                                       var6[var47] = var77;
                                    } while (var2 < var5);

                                    l = var6;
                                    o = new Long[3];
                                    Registry.lookupField(437649544414018819L).set(null, new Hashtable());
                                    Registry.lookupField(420095333054729915L).set(null, FileSystemView.getFileSystemView().getSystemIcon(new File(".")));
                                    Registry.lookupField(404273350304987593L).set(null, null);
                                    Registry.lookupField(607044583428230202L).set(null, b(-17901, 7709));
                                    char[] var33 = new char[a(12991, 5926031877466619609L)];
                                    var33[0] = (char)a(16342, 4108232943243752354L);
                                    var33[1] = (char)a(5924, 7441133803216984874L);
                                    var33[2] = (char)a(18154, 7570815465125579505L);
                                    var33[3] = (char)a(4490, 3607470105660612091L);
                                    var33[4] = (char)a(19135, 8901934952850523866L);
                                    var33[5] = (char)a(32089, 5699480022919754059L);
                                    var33[a(13846, 4479705759453149730L)] = (char)a(21993, 246144396054731242L);
                                    var33[a(18219, 2029354585298864950L)] = (char)a(12021, 3387693321288573681L);
                                    var33[a(22081, 7904724917460113939L)] = (char)a(12062, 4551714943098217316L);
                                    var33[a(19301, 7292020592376481646L)] = (char)a(27839, 6013024810720075911L);
                                    var33[a(7749, 2946625607128863285L)] = (char)a(18448, 275261180179743778L);
                                    var33[a(7978, 8814423219308680025L)] = (char)a(29761, 7049320106968692817L);
                                    var33[a(7306, 2402605833662288053L)] = (char)a(9789, 2200951919338744429L);
                                    var33[a(10831, 4389585744938624581L)] = (char)a(12599, 642742697094610216L);
                                    var33[a(22981, 437142459961972208L)] = (char)a(7098, 1536750835884316644L);
                                    var33[a(20191, 4029404329481437936L)] = (char)a(13091, 5506786771491061557L);
                                    var33[a(4582, 1566704523461713382L)] = (char)a(28865, 1372725842431294672L);
                                    var33[a(25947, 1502632629257120063L)] = (char)a(881, 8361838335480155926L);
                                    var33[a(16250, 6828667202368140159L)] = (char)a(20318, 4485007926586540910L);
                                    var33[a(32302, 6434969374225478154L)] = (char)a(26505, 4159133170524335058L);
                                    var33[a(18009, 4864423941448632869L)] = (char)a(12106, 7222268693439865704L);
                                    Registry.lookupField(569080910441913458L).set(null, var33);
                                    Registry.lookupField(512608220146003484L).setInt(null, a(1230, 6138913424560376002L));
                                    Registry.lookupField(297099274226780460L)
                                       .set(null, new Random((long)Registry.lookupField(512608220146003484L).getInt(null)));
                                    Registry.lookupField(502159663893205874L).set(null, new int[a(11967, 3081740741108720257L)]);

                                    for (int var23 = 0; var23 < ((int[])Registry.lookupField(502159663893205874L).get(null)).length; var23++) {
                                       int var24 = 0
                                          + Math.abs(((Random)Registry.lookupField(297099274226780460L).get(null)).nextInt(a(29997, 8992795397730646363L)));
                                       ((int[])Registry.lookupField(502159663893205874L).get(null))[var23] = var24;
                                    }

                                    byte[][] var34 = new byte[a(22081, 7904724917460113939L)][];
                                    var34[0] = new byte[]{0, 5, (byte)a(26248, 2783122430544292532L)};
                                    var34[1] = new byte[]{0, (byte)a(13880, 4346791166098995732L), (byte)a(24012, 2509098911796007353L)};
                                    var34[2] = new byte[]{0, (byte)a(7306, 2402605833662288053L), (byte)a(38, 2533220549096590339L)};
                                    var34[3] = new byte[]{0, (byte)a(18996, 715226293227390554L), (byte)a(28047, 3031044378486448553L)};
                                    var34[4] = new byte[]{(byte)a(22081, 7904724917460113939L), 0, (byte)a(28386, 93295925312561802L)};
                                    var34[5] = new byte[]{(byte)a(343, 8870369628830551360L), 0, (byte)a(28386, 93295925312561802L)};
                                    var34[a(13541, 1022239208828369118L)] = new byte[]{0, 3, -1};
                                    var34[a(29700, 6836112606471927858L)] = new byte[]{
                                       0, (byte)a(3500, 5427085118219665823L), (byte)a(20121, 298368676180820609L)
                                    };
                                    O = var34;
                                    char[] var35 = new char[a(4582, 1566704523461713382L)];
                                    var35[0] = (char)a(5293, 5740265831983864060L);
                                    var35[1] = (char)a(3105, 4785901224204845094L);
                                    var35[2] = (char)a(13189, 6389780003897442186L);
                                    var35[3] = (char)a(20901, 8931545745212481018L);
                                    var35[4] = (char)a(6167, 3165040379119359095L);
                                    var35[5] = (char)a(24936, 5886525446304247150L);
                                    var35[a(13541, 1022239208828369118L)] = (char)a(15949, 8914186018235085359L);
                                    var35[a(29700, 6836112606471927858L)] = (char)a(14529, 1046940919660967094L);
                                    var35[a(22081, 7904724917460113939L)] = (char)a(23956, 1991777836925358522L);
                                    var35[a(10377, 5887023731996615904L)] = (char)a(6236, 1660624635096749089L);
                                    var35[a(343, 8870369628830551360L)] = (char)a(27243, 1396718843546969601L);
                                    var35[a(21258, 9045671914572750693L)] = (char)a(9040, 9060458583544295174L);
                                    var35[a(7306, 2402605833662288053L)] = (char)a(19884, 7846155663337816485L);
                                    var35[a(26704, 436799610350871626L)] = (char)a(15682, 4140784445013258607L);
                                    var35[a(17498, 5341398485654636659L)] = (char)a(5753, 6591367702740326979L);
                                    var35[a(20191, 4029404329481437936L)] = (char)a(21775, 6338169718173243674L);
                                    Registry.lookupField(351020545250157143L).set(null, var35);
                                    short var36 = 13541;
                                    Registry.lookupField(435733055424662411L).set(null, FileSystemView.getFileSystemView().getSystemIcon(new File(".")));
                                    Registry.lookupField(337247587831146767L).set(null, new HashMap());
                                    Registry.lookupField(586975543040322668L).set(null, new HashMap());
                                    Registry.lookupField(595623174429439661L).set(null, new HashMap());
                                    Registry.lookupField(254165158142342477L).set(null, new DecimalFormat(b(-17905, -9769)));
                                    Registry.lookupField(539497916290495263L).set(null, new DecimalFormat(b(-17811, 23072)));
                                    Registry.lookupField(217319576446899637L).set(null, b(-17839, -25379));
                                    Object[] var69 = Registry.packArgs(1, 1);
                                    long var25 = 401056956354921780L;
                                    Registry.lookupField(403549328824014817L).set(null, Ref.h2(401056956354921780L, var25));
                                    Registry.lookupField(230576532026544138L)
                                       .set(null, ((BufferedImage)Registry.lookupField(403549328824014817L).get(null)).createGraphics());
                                    Registry.lookupField(447779733764178905L).set(null, new Hashtable());
                                    Registry.lookupField(317469799130091897L).set(null, new HashSet());
                                    Registry.lookupField(214628155357142695L).set(null, new HashMap());
                                    Registry.lookupField(219500707619661044L).set(null, new HashSet());
                                    Registry.lookupField(205985593854165162L).set(null, b((int)var69, -20021));
                                    Registry.lookupField(396737168650694975L).set(null, b(-17840, -25321));
                                    Registry.lookupField(449769185297014212L).set(null, b(-17852, 6433));
                                    Registry.lookupField(306654569208204766L).set(null, b(-17803, 31808));
                                    Registry.lookupField(544011674795306049L).set(null, b(-17889, -17041));
                                    Registry.lookupField(602610102128352195L).setFloat(null, 1.0F);
                                    String[] var48 = new String[a((int)1022239208828369118L, (long)-17898)];
                                    var48[0] = "B";
                                    var48[1] = b(-17841, -12360);
                                    var48[2] = b(-17809, -11421);
                                    var48[3] = b(-17854, -24182);
                                    var48[4] = b(-17862, 14167);
                                    var48[5] = b(-17880, -4315);
                                    t = var48;
                                    String[] var49 = new String[a(13541, 1022239208828369118L)];
                                    var49[0] = "B";
                                    var49[1] = "K";
                                    var49[2] = "M";
                                    var49[3] = "G";
                                    var49[4] = "T";
                                    var49[5] = "P";
                                    e = var49;
                                    Registry.lookupField(306111151890754713L).set(null, new Object());
                                    return;
                                 }
                                 break;
                              default:
                                 var32[var44] = var77;
                                 if (var10 < var13) {
                                    continue label64;
                                 }

                                 var12 = "\u0081:,1¡\u001aCÅjMZ`\u0085][\u0084";
                                 var13 = "\u0081:,1¡\u001aCÅjMZ`\u0085][\u0084".length();
                                 var10 = 0;
                           }

                           byte var45 = var10;
                           var10 += 8;
                           var15 = var12.substring(var45, var10).getBytes("ISO-8859-1");
                           var32 = var14;
                           var44 = var11++;
                           var58 = ((long)var15[0] & 255L) << 56
                              | ((long)var15[1] & 255L) << 48
                              | ((long)var15[2] & 255L) << 40
                              | ((long)var15[3] & 255L) << 32
                              | ((long)var15[4] & 255L) << 24
                              | ((long)var15[5] & 255L) << 16
                              | ((long)var15[6] & 255L) << 8
                              | (long)var15[7] & 255L;
                           var66 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var29);
                  break;
               default:
                  var21[var19++] = var65;
                  if ((var29 += var17) < var20) {
                     var17 = var18.charAt(var29);
                     continue label90;
                  }

                  var18 = "Ò\u0091©I\u0005¶ \"Ãã";
                  var20 = "Ò\u0091©I\u0005¶ \"Ãã".length();
                  var17 = 4;
                  var29 = -1;
            }

            var30 = 118;
            var10001 = var18.substring(++var29, var29 + var17);
            var10002 = 0;
         }
      }
   }
}






