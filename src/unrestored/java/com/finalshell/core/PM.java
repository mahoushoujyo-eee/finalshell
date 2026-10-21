package com.finalshell.core;

import com.finalshell.ui.model.Su2;
import com.finalshell.ui.model.U0;
import com.finalshell.ui.model.Zo2;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public final class PM {
   public static boolean p;
   public static Pb2 t;
   public static Pi4 I;
   public static FX J;
   public static XStream C;
   public static String[] a;
   public static String[] b;

   public static XStream L() {
      try {
         if (C == null) {
            Y();
         }
      } catch (RuntimeException var0) {
         throw a((Throwable)var0);
      }

      return C;
   }

   public static void Y() {
      try {
         try {
            C = new XStream(new DomDriver());
            if (p) {
               C.alias(a(-21671, 32145), Point.class);
               C.useAttributeFor(Point.class, "x");
               C.useAttributeFor(Point.class, "y");
               C.alias(a(-21677, 25839), Dimension.class);
               C.useAttributeFor(Dimension.class, a(-21674, -4150));
               C.useAttributeFor(Dimension.class, a(-21670, 17266));
               C.alias(a(-21667, 31610), Rectangle.class);
               C.useAttributeFor(Rectangle.class, "x");
               C.useAttributeFor(Rectangle.class, "y");
               C.useAttributeFor(Rectangle.class, a(-21675, 13002));
               C.useAttributeFor(Rectangle.class, a(-21668, 24634));
               C.alias(a(-21673, 24490), Font.class);
               C.alias(a(-21679, 1173), Color.class);
               C.registerConverter(t);
               C.alias(a(-21672, -11175), Insets.class);
               C.registerConverter(I);
            }
         } catch (Throwable var1) {
            throw a(var1);
         }

         C.processAnnotations(Zo2.class);
         C.processAnnotations(com.finalshell.ui.model.F2.class);
         C.processAnnotations(com.finalshell.ui.model.HE.class);
         C.processAnnotations(com.finalshell.ui.model.Nu2.class);
         C.processAnnotations(U0.class);
         C.processAnnotations(com.finalshell.ui.model.F5.class);
         C.processAnnotations(com.finalshell.ui.model.C0.class);
         C.processAnnotations(com.finalshell.ui.model.LO3.class);
         C.processAnnotations(com.finalshell.ui.model.C9.class);
         C.processAnnotations(Su2.class);
      } catch (Throwable var2) {
         NE3.g(PM.class, var2);
      }
   }

   public static void m(java.lang.Class var0) {
      L().processAnnotations(var0);
   }

   public static void k(java.lang.Class[] var0) {
      L().processAnnotations(var0);
   }

   public static void u(String var0, java.lang.Class var1) {
      L().alias(var0, var1);
   }

   public static void a(java.lang.Class var0, String var1) {
      L().useAttributeFor(var0, var1);
   }

   public static void R(java.lang.Class var0, String var1) {
      L().addImplicitArray(var0, var1);
   }

   public static void F(java.lang.Class var0, String var1, String var2) {
      L().addImplicitArray(var0, var1, var2);
   }

   public static void o(Converter var0) {
      L().registerConverter(var0);
   }

   public static void n(SingleValueConverter var0) {
      L().registerConverter(var0);
   }

   public static void Z(java.lang.Class var0) {
      Kp2.W(var0, a(-21669, -13686), new Object[]{L()});
   }

   public static void h(Object var0, String var1) {
      b(var0, new File(var1));
   }

   public static void b(Object var0, File var1) {
      try {
         FileOutputStream var2 = new FileOutputStream(var1);
         OutputStreamWriter var3 = new OutputStreamWriter(var2, a(-21676, 15064));
         t(var0, var3);
         var3.close();
         var2.close();
      } catch (IOException var4) {
         NE3.g(PM.class, var4);
      }
   }

   public static String l(Object var0) {
      return L().toXML(var0);
   }

   public static void t(Object var0, Writer var1) {
      L().toXML(var0, var1);
   }

   public static void d(Object var0, OutputStream var1) {
      L().toXML(var0, var1);
   }

   public static void d(Object var0, HierarchicalStreamWriter var1) {
      L().marshal(var0, var1);
   }

   public static Object U(Reader var0) {
      return L().fromXML(var0);
   }

   public static Object j(InputStream var0) {
      return L().fromXML(var0);
   }

   public static Object s(URL var0) {
      return L().fromXML(var0);
   }

   public static Object a(File var0) {
      return L().fromXML(var0);
   }

   public static Object N(String var0) {
      return L().fromXML(var0);
   }

   public static Object I(Object param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: instanceof java/net/URL
      // 08: aload 1
      // 09: ifnonnull 26
      // 0c: ifeq 22
      // 0f: goto 16
      // 12: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: checkcast java/net/URL
      // 1a: invokestatic com/finalshell/core/PM.s (Ljava/net/URL;)Ljava/lang/Object;
      // 1d: areturn
      // 1e: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: instanceof java/lang/String
      // 26: aload 1
      // 27: ifnonnull 4b
      // 2a: ifeq 47
      // 2d: goto 34
      // 30: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: new java/io/File
      // 37: dup
      // 38: aload 0
      // 39: checkcast java/lang/String
      // 3c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 3f: invokestatic com/finalshell/core/PM.a (Ljava/io/File;)Ljava/lang/Object;
      // 42: areturn
      // 43: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 0
      // 48: instanceof java/io/File
      // 4b: aload 1
      // 4c: ifnonnull 69
      // 4f: ifeq 65
      // 52: goto 59
      // 55: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 0
      // 5a: checkcast java/io/File
      // 5d: invokestatic com/finalshell/core/PM.a (Ljava/io/File;)Ljava/lang/Object;
      // 60: areturn
      // 61: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: aload 0
      // 66: instanceof java/io/Reader
      // 69: aload 1
      // 6a: ifnonnull 92
      // 6d: ifeq 83
      // 70: goto 77
      // 73: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 0
      // 78: checkcast java/io/Reader
      // 7b: invokestatic com/finalshell/core/PM.U (Ljava/io/Reader;)Ljava/lang/Object;
      // 7e: areturn
      // 7f: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 0
      // 84: aload 1
      // 85: ifnonnull a3
      // 88: instanceof java/io/InputStream
      // 8b: goto 92
      // 8e: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: ifeq a4
      // 95: aload 0
      // 96: checkcast java/io/InputStream
      // 99: invokestatic com/finalshell/core/PM.j (Ljava/io/InputStream;)Ljava/lang/Object;
      // 9c: goto a3
      // 9f: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a2: athrow
      // a3: areturn
      // a4: aconst_null
      // a5: areturn
   }

   public static Object z(com.finalshell.ui.model.F2 var0) {
      String var1 = FV_2.D();

      label210: {
         try {
            if (var1 != null) {
               return Pd4.T;
            }

            switch (Pd4.T[var0.G().ordinal()]) {
               case 1:
                  break;
               case 2:
                  return a(new File(var0.b()));
               case 3:
                  break label210;
               default:
                  return null;
            }
         } catch (MalformedURLException var29) {
            throw a((Throwable)var29);
         }

         try {
            return s(new URL(var0.b()));
         } catch (MalformedURLException var22) {
            NE3.g(PM.class, var22);
            return null;
         }
      }

      InputStream var2 = null;

      Object var4;
      try {
         var2 = java.lang.Class.forName(var0.D()).getResourceAsStream(var0.b());

         label234: {
            try {
               if (var1 != null) {
                  return var2;
               }

               if (var2 == null) {
                  break label234;
               }
            } catch (MalformedURLException var25) {
               throw a((Throwable)var25);
            }

            return j(var2);
         }

         String var3 = var0.b();
         var4 = var0.D();
         throw new RuntimeException(a(-21680, -721) + var3 + a(-21678, -17038) + var4 + "\"");
      } catch (ClassNotFoundException var26) {
         NE3.g(PM.class, var26);
         return null;
      } catch (Throwable var27) {
         NE3.g(PM.class, var27);
         var4 = null;
      } finally {
         try {
            label174: {
               InputStream var33;
               label173: {
                  try {
                     var33 = var2;
                     if (var1 != null) {
                        break label173;
                     }

                     if (var2 == null) {
                        break label174;
                     }
                  } catch (MalformedURLException var23) {
                     throw a((Throwable)var23);
                  }

                  var33 = var2;
               }

               var33.close();
            }
         } catch (Throwable var24) {
            NE3.g(PM.class, var24);
         }
      }

      return var4;
   }

   public static String v(Object var0) {
      return d(P(var0));
   }

   public static String d(com.finalshell.ui.model.F2 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/ui/model/F2.G ()Lcom/finalshell/ui/model/Zo2;
      // 08: getstatic com/finalshell/ui/model/Zo2.url Lcom/finalshell/ui/model/Zo2;
      // 0b: invokevirtual com/finalshell/ui/model/Zo2.equals (Ljava/lang/Object;)Z
      // 0e: aload 1
      // 0f: ifnonnull 42
      // 12: ifeq 38
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: new java/net/URL
      // 1f: dup
      // 20: aload 0
      // 21: invokevirtual com/finalshell/ui/model/F2.b ()Ljava/lang/String;
      // 24: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 27: invokestatic com/finalshell/core/Cz2.B (Ljava/net/URL;)Ljava/lang/String;
      // 2a: areturn
      // 2b: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: astore 2
      // 30: ldc com/finalshell/core/PM
      // 32: aload 2
      // 33: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 36: aconst_null
      // 37: areturn
      // 38: aload 0
      // 39: invokevirtual com/finalshell/ui/model/F2.G ()Lcom/finalshell/ui/model/Zo2;
      // 3c: getstatic com/finalshell/ui/model/Zo2.filePath Lcom/finalshell/ui/model/Zo2;
      // 3f: invokevirtual com/finalshell/ui/model/Zo2.equals (Ljava/lang/Object;)Z
      // 42: aload 1
      // 43: ifnonnull 78
      // 46: ifeq 63
      // 49: goto 50
      // 4c: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: new java/io/File
      // 53: dup
      // 54: aload 0
      // 55: invokevirtual com/finalshell/ui/model/F2.b ()Ljava/lang/String;
      // 58: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5b: invokestatic com/finalshell/core/Cz2.g (Ljava/io/File;)Ljava/lang/String;
      // 5e: areturn
      // 5f: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: aload 1
      // 65: ifnonnull 7c
      // 68: invokevirtual com/finalshell/ui/model/F2.G ()Lcom/finalshell/ui/model/Zo2;
      // 6b: getstatic com/finalshell/ui/model/Zo2.nearClass Lcom/finalshell/ui/model/Zo2;
      // 6e: invokevirtual com/finalshell/ui/model/Zo2.equals (Ljava/lang/Object;)Z
      // 71: goto 78
      // 74: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: ifeq 93
      // 7b: aload 0
      // 7c: invokevirtual com/finalshell/ui/model/F2.D ()Ljava/lang/String;
      // 7f: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 82: aload 0
      // 83: invokevirtual com/finalshell/ui/model/F2.b ()Ljava/lang/String;
      // 86: invokestatic com/finalshell/core/Cz2.R (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;
      // 89: areturn
      // 8a: astore 2
      // 8b: ldc com/finalshell/core/PM
      // 8d: aload 2
      // 8e: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 91: aconst_null
      // 92: areturn
      // 93: aconst_null
      // 94: areturn
   }

   public static ImageIcon O(Object var0) {
      return j(P(var0));
   }

   public static ImageIcon j(com.finalshell.ui.model.F2 param0) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/FV_2.D ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: invokevirtual com/finalshell/ui/model/F2.G ()Lcom/finalshell/ui/model/Zo2;
      // 08: getstatic com/finalshell/ui/model/Zo2.url Lcom/finalshell/ui/model/Zo2;
      // 0b: invokevirtual com/finalshell/ui/model/Zo2.equals (Ljava/lang/Object;)Z
      // 0e: aload 1
      // 0f: ifnonnull 46
      // 12: ifeq 3c
      // 15: goto 1c
      // 18: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: new javax/swing/ImageIcon
      // 1f: dup
      // 20: new java/net/URL
      // 23: dup
      // 24: aload 0
      // 25: invokevirtual com/finalshell/ui/model/F2.b ()Ljava/lang/String;
      // 28: invokespecial java/net/URL.<init> (Ljava/lang/String;)V
      // 2b: invokespecial javax/swing/ImageIcon.<init> (Ljava/net/URL;)V
      // 2e: areturn
      // 2f: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: astore 2
      // 34: ldc com/finalshell/core/PM
      // 36: aload 2
      // 37: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 3a: aconst_null
      // 3b: areturn
      // 3c: aload 0
      // 3d: invokevirtual com/finalshell/ui/model/F2.G ()Lcom/finalshell/ui/model/Zo2;
      // 40: getstatic com/finalshell/ui/model/Zo2.filePath Lcom/finalshell/ui/model/Zo2;
      // 43: invokevirtual com/finalshell/ui/model/Zo2.equals (Ljava/lang/Object;)Z
      // 46: aload 1
      // 47: ifnonnull 81
      // 4a: ifeq 77
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: new javax/swing/ImageIcon
      // 57: dup
      // 58: new java/io/File
      // 5b: dup
      // 5c: aload 0
      // 5d: invokevirtual com/finalshell/ui/model/F2.b ()Ljava/lang/String;
      // 60: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 63: invokevirtual java/io/File.getCanonicalPath ()Ljava/lang/String;
      // 66: invokespecial javax/swing/ImageIcon.<init> (Ljava/lang/String;)V
      // 69: areturn
      // 6a: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: astore 2
      // 6f: ldc com/finalshell/core/PM
      // 71: aload 2
      // 72: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // 75: aconst_null
      // 76: areturn
      // 77: aload 0
      // 78: invokevirtual com/finalshell/ui/model/F2.G ()Lcom/finalshell/ui/model/Zo2;
      // 7b: getstatic com/finalshell/ui/model/Zo2.nearClass Lcom/finalshell/ui/model/Zo2;
      // 7e: invokevirtual com/finalshell/ui/model/Zo2.equals (Ljava/lang/Object;)Z
      // 81: ifeq a7
      // 84: new javax/swing/ImageIcon
      // 87: dup
      // 88: aload 0
      // 89: invokevirtual com/finalshell/ui/model/F2.D ()Ljava/lang/String;
      // 8c: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 8f: aload 0
      // 90: invokevirtual com/finalshell/ui/model/F2.b ()Ljava/lang/String;
      // 93: invokevirtual java/lang/Class.getResource (Ljava/lang/String;)Ljava/net/URL;
      // 96: invokespecial javax/swing/ImageIcon.<init> (Ljava/net/URL;)V
      // 99: areturn
      // 9a: invokestatic com/finalshell/core/PM.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d: athrow
      // 9e: astore 2
      // 9f: ldc com/finalshell/core/PM
      // a1: aload 2
      // a2: invokestatic com/finalshell/core/NE3.g (Ljava/lang/Object;Ljava/lang/Throwable;)V
      // a5: aconst_null
      // a6: areturn
      // a7: aconst_null
      // a8: areturn
   }

   public static List a(Object var0) {
      return l(R(var0));
   }

   public static List l(com.finalshell.ui.model.HE var0) {
      String var10000 = FV_2.D();
      ArrayList var2 = new ArrayList();
      String var1 = var10000;

      for (com.finalshell.ui.model.F2 var4 : var0.i()) {
         ImageIcon var5 = j(var4);

         try {
            if (var5 != null) {
               var2.add(var5);
            }
         } catch (RuntimeException var6) {
            throw a((Throwable)var6);
         }

         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   public static com.finalshell.ui.model.Nu2 d(Object var0) {
      return (com.finalshell.ui.model.Nu2)I(var0);
   }

   public static com.finalshell.ui.model.HE R(Object var0) {
      return (com.finalshell.ui.model.HE)I(var0);
   }

   public static com.finalshell.ui.model.F2 P(Object var0) {
      return (com.finalshell.ui.model.F2)I(var0);
   }

   static {
      __vfClinit__();
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -21680) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 112;
               break;
            case 1:
               var10000 = 249;
               break;
            case 2:
               var10000 = 38;
               break;
            case 3:
               var10000 = 4;
               break;
            case 4:
               var10000 = 203;
               break;
            case 5:
               var10000 = 118;
               break;
            case 6:
               var10000 = 204;
               break;
            case 7:
               var10000 = 176;
               break;
            case 8:
               var10000 = 189;
               break;
            case 9:
               var10000 = 131;
               break;
            case 10:
               var10000 = 175;
               break;
            case 11:
               var10000 = 253;
               break;
            case 12:
               var10000 = 241;
               break;
            case 13:
               var10000 = 64;
               break;
            case 14:
               var10000 = 61;
               break;
            case 15:
               var10000 = 92;
               break;
            case 16:
               var10000 = 111;
               break;
            case 17:
               var10000 = 101;
               break;
            case 18:
               var10000 = 63;
               break;
            case 19:
               var10000 = 254;
               break;
            case 20:
               var10000 = 193;
               break;
            case 21:
               var10000 = 239;
               break;
            case 22:
               var10000 = 121;
               break;
            case 23:
               var10000 = 88;
               break;
            case 24:
               var10000 = 70;
               break;
            case 25:
               var10000 = 195;
               break;
            case 26:
               var10000 = 65;
               break;
            case 27:
               var10000 = 220;
               break;
            case 28:
               var10000 = 188;
               break;
            case 29:
               var10000 = 164;
               break;
            case 30:
               var10000 = 166;
               break;
            case 31:
               var10000 = 40;
               break;
            case 32:
               var10000 = 93;
               break;
            case 33:
               var10000 = 226;
               break;
            case 34:
               var10000 = 23;
               break;
            case 35:
               var10000 = 207;
               break;
            case 36:
               var10000 = 199;
               break;
            case 37:
               var10000 = 224;
               break;
            case 38:
               var10000 = 69;
               break;
            case 39:
               var10000 = 60;
               break;
            case 40:
               var10000 = 245;
               break;
            case 41:
               var10000 = 240;
               break;
            case 42:
               var10000 = 39;
               break;
            case 43:
               var10000 = 106;
               break;
            case 44:
               var10000 = 100;
               break;
            case 45:
               var10000 = 212;
               break;
            case 46:
               var10000 = 161;
               break;
            case 47:
               var10000 = 120;
               break;
            case 48:
               var10000 = 33;
               break;
            case 49:
               var10000 = 59;
               break;
            case 50:
               var10000 = 21;
               break;
            case 51:
               var10000 = 91;
               break;
            case 52:
               var10000 = 114;
               break;
            case 53:
               var10000 = 158;
               break;
            case 54:
               var10000 = 5;
               break;
            case 55:
               var10000 = 113;
               break;
            case 56:
               var10000 = 110;
               break;
            case 57:
               var10000 = 246;
               break;
            case 58:
               var10000 = 14;
               break;
            case 59:
               var10000 = 45;
               break;
            case 60:
               var10000 = 159;
               break;
            case 61:
               var10000 = 218;
               break;
            case 62:
               var10000 = 104;
               break;
            case 63:
               var10000 = 9;
               break;
            case 64:
               var10000 = 232;
               break;
            case 65:
               var10000 = 50;
               break;
            case 66:
               var10000 = 2;
               break;
            case 67:
               var10000 = 51;
               break;
            case 68:
               var10000 = 132;
               break;
            case 69:
               var10000 = 156;
               break;
            case 70:
               var10000 = 66;
               break;
            case 71:
               var10000 = 122;
               break;
            case 72:
               var10000 = 76;
               break;
            case 73:
               var10000 = 234;
               break;
            case 74:
               var10000 = 37;
               break;
            case 75:
               var10000 = 187;
               break;
            case 76:
               var10000 = 236;
               break;
            case 77:
               var10000 = 10;
               break;
            case 78:
               var10000 = 94;
               break;
            case 79:
               var10000 = 184;
               break;
            case 80:
               var10000 = 250;
               break;
            case 81:
               var10000 = 67;
               break;
            case 82:
               var10000 = 136;
               break;
            case 83:
               var10000 = 194;
               break;
            case 84:
               var10000 = 86;
               break;
            case 85:
               var10000 = 49;
               break;
            case 86:
               var10000 = 139;
               break;
            case 87:
               var10000 = 128;
               break;
            case 88:
               var10000 = 30;
               break;
            case 89:
               var10000 = 251;
               break;
            case 90:
               var10000 = 85;
               break;
            case 91:
               var10000 = 116;
               break;
            case 92:
               var10000 = 141;
               break;
            case 93:
               var10000 = 74;
               break;
            case 94:
               var10000 = 7;
               break;
            case 95:
               var10000 = 6;
               break;
            case 96:
               var10000 = 117;
               break;
            case 97:
               var10000 = 172;
               break;
            case 98:
               var10000 = 143;
               break;
            case 99:
               var10000 = 47;
               break;
            case 100:
               var10000 = 15;
               break;
            case 101:
               var10000 = 231;
               break;
            case 102:
               var10000 = 34;
               break;
            case 103:
               var10000 = 124;
               break;
            case 104:
               var10000 = 150;
               break;
            case 105:
               var10000 = 227;
               break;
            case 106:
               var10000 = 222;
               break;
            case 107:
               var10000 = 205;
               break;
            case 108:
               var10000 = 149;
               break;
            case 109:
               var10000 = 26;
               break;
            case 110:
               var10000 = 238;
               break;
            case 111:
               var10000 = 129;
               break;
            case 112:
               var10000 = 126;
               break;
            case 113:
               var10000 = 11;
               break;
            case 114:
               var10000 = 197;
               break;
            case 115:
               var10000 = 186;
               break;
            case 116:
               var10000 = 137;
               break;
            case 117:
               var10000 = 248;
               break;
            case 118:
               var10000 = 134;
               break;
            case 119:
               var10000 = 97;
               break;
            case 120:
               var10000 = 147;
               break;
            case 121:
               var10000 = 123;
               break;
            case 122:
               var10000 = 211;
               break;
            case 123:
               var10000 = 127;
               break;
            case 124:
               var10000 = 167;
               break;
            case 125:
               var10000 = 170;
               break;
            case 126:
               var10000 = 46;
               break;
            case 127:
               var10000 = 41;
               break;
            case 128:
               var10000 = 81;
               break;
            case 129:
               var10000 = 138;
               break;
            case 130:
               var10000 = 201;
               break;
            case 131:
               var10000 = 0;
               break;
            case 132:
               var10000 = 154;
               break;
            case 133:
               var10000 = 130;
               break;
            case 134:
               var10000 = 208;
               break;
            case 135:
               var10000 = 230;
               break;
            case 136:
               var10000 = 119;
               break;
            case 137:
               var10000 = 36;
               break;
            case 138:
               var10000 = 54;
               break;
            case 139:
               var10000 = 214;
               break;
            case 140:
               var10000 = 103;
               break;
            case 141:
               var10000 = 190;
               break;
            case 142:
               var10000 = 192;
               break;
            case 143:
               var10000 = 17;
               break;
            case 144:
               var10000 = 72;
               break;
            case 145:
               var10000 = 148;
               break;
            case 146:
               var10000 = 243;
               break;
            case 147:
               var10000 = 180;
               break;
            case 148:
               var10000 = 96;
               break;
            case 149:
               var10000 = 247;
               break;
            case 150:
               var10000 = 182;
               break;
            case 151:
               var10000 = 233;
               break;
            case 152:
               var10000 = 219;
               break;
            case 153:
               var10000 = 179;
               break;
            case 154:
               var10000 = 155;
               break;
            case 155:
               var10000 = 160;
               break;
            case 156:
               var10000 = 165;
               break;
            case 157:
               var10000 = 108;
               break;
            case 158:
               var10000 = 244;
               break;
            case 159:
               var10000 = 1;
               break;
            case 160:
               var10000 = 52;
               break;
            case 161:
               var10000 = 109;
               break;
            case 162:
               var10000 = 135;
               break;
            case 163:
               var10000 = 202;
               break;
            case 164:
               var10000 = 62;
               break;
            case 165:
               var10000 = 48;
               break;
            case 166:
               var10000 = 168;
               break;
            case 167:
               var10000 = 77;
               break;
            case 168:
               var10000 = 105;
               break;
            case 169:
               var10000 = 152;
               break;
            case 170:
               var10000 = 200;
               break;
            case 171:
               var10000 = 99;
               break;
            case 172:
               var10000 = 25;
               break;
            case 173:
               var10000 = 221;
               break;
            case 174:
               var10000 = 125;
               break;
            case 175:
               var10000 = 213;
               break;
            case 176:
               var10000 = 18;
               break;
            case 177:
               var10000 = 142;
               break;
            case 178:
               var10000 = 163;
               break;
            case 179:
               var10000 = 196;
               break;
            case 180:
               var10000 = 24;
               break;
            case 181:
               var10000 = 146;
               break;
            case 182:
               var10000 = 89;
               break;
            case 183:
               var10000 = 83;
               break;
            case 184:
               var10000 = 27;
               break;
            case 185:
               var10000 = 252;
               break;
            case 186:
               var10000 = 178;
               break;
            case 187:
               var10000 = 78;
               break;
            case 188:
               var10000 = 95;
               break;
            case 189:
               var10000 = 151;
               break;
            case 190:
               var10000 = 140;
               break;
            case 191:
               var10000 = 20;
               break;
            case 192:
               var10000 = 209;
               break;
            case 193:
               var10000 = 174;
               break;
            case 194:
               var10000 = 57;
               break;
            case 195:
               var10000 = 55;
               break;
            case 196:
               var10000 = 31;
               break;
            case 197:
               var10000 = 56;
               break;
            case 198:
               var10000 = 3;
               break;
            case 199:
               var10000 = 82;
               break;
            case 200:
               var10000 = 28;
               break;
            case 201:
               var10000 = 162;
               break;
            case 202:
               var10000 = 217;
               break;
            case 203:
               var10000 = 71;
               break;
            case 204:
               var10000 = 19;
               break;
            case 205:
               var10000 = 255;
               break;
            case 206:
               var10000 = 145;
               break;
            case 207:
               var10000 = 12;
               break;
            case 208:
               var10000 = 115;
               break;
            case 209:
               var10000 = 87;
               break;
            case 210:
               var10000 = 185;
               break;
            case 211:
               var10000 = 58;
               break;
            case 212:
               var10000 = 181;
               break;
            case 213:
               var10000 = 13;
               break;
            case 214:
               var10000 = 42;
               break;
            case 215:
               var10000 = 237;
               break;
            case 216:
               var10000 = 75;
               break;
            case 217:
               var10000 = 223;
               break;
            case 218:
               var10000 = 216;
               break;
            case 219:
               var10000 = 90;
               break;
            case 220:
               var10000 = 144;
               break;
            case 221:
               var10000 = 191;
               break;
            case 222:
               var10000 = 210;
               break;
            case 223:
               var10000 = 107;
               break;
            case 224:
               var10000 = 29;
               break;
            case 225:
               var10000 = 229;
               break;
            case 226:
               var10000 = 84;
               break;
            case 227:
               var10000 = 153;
               break;
            case 228:
               var10000 = 242;
               break;
            case 229:
               var10000 = 157;
               break;
            case 230:
               var10000 = 228;
               break;
            case 231:
               var10000 = 102;
               break;
            case 232:
               var10000 = 16;
               break;
            case 233:
               var10000 = 22;
               break;
            case 234:
               var10000 = 173;
               break;
            case 235:
               var10000 = 171;
               break;
            case 236:
               var10000 = 79;
               break;
            case 237:
               var10000 = 98;
               break;
            case 238:
               var10000 = 8;
               break;
            case 239:
               var10000 = 73;
               break;
            case 240:
               var10000 = 169;
               break;
            case 241:
               var10000 = 32;
               break;
            case 242:
               var10000 = 133;
               break;
            case 243:
               var10000 = 215;
               break;
            case 244:
               var10000 = 177;
               break;
            case 245:
               var10000 = 235;
               break;
            case 246:
               var10000 = 206;
               break;
            case 247:
               var10000 = 44;
               break;
            case 248:
               var10000 = 68;
               break;
            case 249:
               var10000 = 225;
               break;
            case 250:
               var10000 = 80;
               break;
            case 251:
               var10000 = 183;
               break;
            case 252:
               var10000 = 43;
               break;
            case 253:
               var10000 = 35;
               break;
            case 254:
               var10000 = 53;
               break;
            default:
               var10000 = 198;
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
      char[] var20;
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "ið\u0092\u0011A&i\u0085ÃKF\u001aÚnÊØ\u0011ÊÔµW\u008cnqè\u0005o \u008b7Ð\u000e4\u0015¯-\u0005QM\u0089D~ÔÃèÇ\tæ*\\ª\u0017 ¨\u009a\u009a\u0005À×\u0080Ç\u0094\u0005¡3è\u0098¯\u0005\u0080\u0011ÌÜ+\u0004#1¥\u001e\u0006{§]üðj\u0005_\u0000ù\"=\u0006þVòª@å\u000ecU\\.RVë\u009f}Òá_[\u0005";
      int var4 = "ið\u0092\u0011A&i\u0085ÃKF\u001aÚnÊØ\u0011ÊÔµW\u008cnqè\u0005o \u008b7Ð\u000e4\u0015¯-\u0005QM\u0089D~ÔÃèÇ\tæ*\\ª\u0017 ¨\u009a\u009a\u0005À×\u0080Ç\u0094\u0005¡3è\u0098¯\u0005\u0080\u0011ÌÜ+\u0004#1¥\u001e\u0006{§]üðj\u0005_\u0000ù\"=\u0006þVòª@å\u000ecU\\.RVë\u009f}Òá_[\u0005"
         .length();
      char var1 = 25;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 75;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 83;
                        break;
                     case 1:
                        var46 = 39;
                        break;
                     case 2:
                        var46 = 105;
                        break;
                     case 3:
                        var46 = 8;
                        break;
                     case 4:
                        var46 = 61;
                        break;
                     case 5:
                        var46 = 108;
                        break;
                     default:
                        var46 = 5;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[14];
                     p = true;
                     t = new Pb2();
                     I = new Pi4();
                     J = new FX();
                     C = null;
                     return;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\f\u008füÁÑØ\t\u009cÞ\u0099ø?\u0094\u001dñ¸";
                  var4 = "\f\u008füÁÑØ\t\u009cÞ\u0099ø?\u0094\u001dñ¸".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 89;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





