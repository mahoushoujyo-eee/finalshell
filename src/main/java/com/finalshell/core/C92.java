package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public final class C92 {
   public static String[] a;
   public static String[] b;

   public static Document i() throws GG_2 {
      Object var0 = null;

      try {
         return DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
      } catch (ParserConfigurationException var2) {
         throw new GG_2(var2);
      }
   }

   public static Document g(File var0) throws GG_2 {
      InputStream var1 = o(var0);
      return L(var1);
   }

   public static Document L(InputStream param0) throws GG_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.K ()I
      // 03: aconst_null
      // 04: astore 2
      // 05: istore 1
      // 06: invokestatic javax/xml/parsers/DocumentBuilderFactory.newInstance ()Ljavax/xml/parsers/DocumentBuilderFactory;
      // 09: invokevirtual javax/xml/parsers/DocumentBuilderFactory.newDocumentBuilder ()Ljavax/xml/parsers/DocumentBuilder;
      // 0c: astore 3
      // 0d: aload 3
      // 0e: aload 0
      // 0f: invokevirtual javax/xml/parsers/DocumentBuilder.parse (Ljava/io/InputStream;)Lorg/w3c/dom/Document;
      // 12: astore 2
      // 13: aload 0
      // 14: iload 1
      // 15: ifeq 23
      // 18: ifnull 7a
      // 1b: goto 22
      // 1e: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual java/io/InputStream.close ()V
      // 26: goto 7a
      // 29: astore 3
      // 2a: goto 7a
      // 2d: astore 3
      // 2e: new com/finalshell/core/GG_2
      // 31: dup
      // 32: aload 3
      // 33: invokespecial com/finalshell/core/GG_2.<init> (Ljava/lang/Throwable;)V
      // 36: athrow
      // 37: astore 3
      // 38: new com/finalshell/core/GG_2
      // 3b: dup
      // 3c: sipush 8347
      // 3f: sipush -6024
      // 42: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 45: aload 3
      // 46: invokespecial com/finalshell/core/GG_2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 49: athrow
      // 4a: astore 3
      // 4b: new com/finalshell/core/GG_2
      // 4e: dup
      // 4f: sipush 8332
      // 52: sipush 11937
      // 55: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 58: aload 3
      // 59: invokespecial com/finalshell/core/GG_2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 5c: athrow
      // 5d: astore 4
      // 5f: aload 0
      // 60: iload 1
      // 61: ifeq 6f
      // 64: ifnull 77
      // 67: goto 6e
      // 6a: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d: athrow
      // 6e: aload 0
      // 6f: invokevirtual java/io/InputStream.close ()V
      // 72: goto 77
      // 75: astore 5
      // 77: aload 4
      // 79: athrow
      // 7a: aload 2
      // 7b: areturn
   }

   public static Element P(String var0) throws GG_2 {
      Document var1 = i();
      Element var2 = var1.createElement(var0);
      var1.appendChild(var2);
      return var2;
   }

   public static Element Q$Element(InputStream var0) throws GG_2 {
      return L(var0).getDocumentElement();
   }

   public static Element M(File var0) throws GG_2 {
      return g(var0).getDocumentElement();
   }

   public static Element A(String param0) throws GG_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.e ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1e
      // 09: ifnull 25
      // 0c: goto 13
      // 0f: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: invokevirtual java/lang/String.length ()I
      // 21: bipush 1
      // 22: if_icmpge 3a
      // 25: new com/finalshell/core/GG_2
      // 28: dup
      // 29: sipush 8324
      // 2c: sipush 18662
      // 2f: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 32: invokespecial com/finalshell/core/GG_2.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aconst_null
      // 3b: astore 2
      // 3c: aload 0
      // 3d: sipush 8325
      // 40: sipush -23994
      // 43: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 46: invokevirtual java/lang/String.getBytes (Ljava/lang/String;)[B
      // 49: astore 2
      // 4a: goto 60
      // 4d: astore 3
      // 4e: new com/finalshell/core/GG_2
      // 51: dup
      // 52: sipush 8327
      // 55: sipush 838
      // 58: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 5b: aload 3
      // 5c: invokespecial com/finalshell/core/GG_2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 5f: athrow
      // 60: new java/io/ByteArrayInputStream
      // 63: dup
      // 64: aload 2
      // 65: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 68: astore 3
      // 69: aload 3
      // 6a: invokestatic com/finalshell/core/C92.L (Ljava/io/InputStream;)Lorg/w3c/dom/Document;
      // 6d: invokeinterface org/w3c/dom/Document.getDocumentElement ()Lorg/w3c/dom/Element; 1
      // 72: areturn
   }

   public static List c$List(Element param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.e ()I
      // 03: aload 0
      // 04: aload 1
      // 05: invokeinterface org/w3c/dom/Element.getElementsByTagName (Ljava/lang/String;)Lorg/w3c/dom/NodeList; 2
      // 0a: astore 3
      // 0b: istore 2
      // 0c: new java/util/ArrayList
      // 0f: dup
      // 10: invokespecial java/util/ArrayList.<init> ()V
      // 13: astore 4
      // 15: bipush 0
      // 16: istore 5
      // 18: iload 5
      // 1a: aload 3
      // 1b: invokeinterface org/w3c/dom/NodeList.getLength ()I 1
      // 20: if_icmpge 5b
      // 23: aload 3
      // 24: iload 5
      // 26: invokeinterface org/w3c/dom/NodeList.item (I)Lorg/w3c/dom/Node; 2
      // 2b: astore 6
      // 2d: iload 2
      // 2e: ifne 57
      // 31: aload 6
      // 33: instanceof org/w3c/dom/Element
      // 36: ifeq 54
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 4
      // 42: aload 6
      // 44: checkcast org/w3c/dom/Element
      // 47: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4c: pop
      // 4d: goto 54
      // 50: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: iinc 5 1
      // 57: iload 2
      // 58: ifeq 18
      // 5b: aload 4
      // 5d: areturn
   }

   public static Element c$Element(Element param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.K ()I
      // 03: aload 0
      // 04: aload 1
      // 05: invokestatic com/finalshell/core/C92.c$List (Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/util/List;
      // 08: astore 3
      // 09: istore 2
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifeq 2b
      // 0f: invokeinterface java/util/List.isEmpty ()Z 1
      // 14: ifeq 24
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aconst_null
      // 1f: areturn
      // 20: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 3
      // 25: bipush 0
      // 26: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2b: checkcast org/w3c/dom/Element
      // 2e: areturn
   }

   public static List k$List(Element param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.e ()I
      // 03: aload 0
      // 04: aload 1
      // 05: invokeinterface org/w3c/dom/Element.getElementsByTagName (Ljava/lang/String;)Lorg/w3c/dom/NodeList; 2
      // 0a: astore 3
      // 0b: istore 2
      // 0c: new java/util/ArrayList
      // 0f: dup
      // 10: invokespecial java/util/ArrayList.<init> ()V
      // 13: astore 4
      // 15: bipush 0
      // 16: istore 5
      // 18: iload 5
      // 1a: aload 3
      // 1b: invokeinterface org/w3c/dom/NodeList.getLength ()I 1
      // 20: if_icmpge 6d
      // 23: aload 3
      // 24: iload 5
      // 26: invokeinterface org/w3c/dom/NodeList.item (I)Lorg/w3c/dom/Node; 2
      // 2b: astore 6
      // 2d: iload 2
      // 2e: ifne 69
      // 31: aload 6
      // 33: instanceof org/w3c/dom/Element
      // 36: ifeq 66
      // 39: goto 40
      // 3c: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 6
      // 42: invokeinterface org/w3c/dom/Node.getParentNode ()Lorg/w3c/dom/Node; 1
      // 47: aload 0
      // 48: if_acmpne 66
      // 4b: goto 52
      // 4e: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: aload 4
      // 54: aload 6
      // 56: checkcast org/w3c/dom/Element
      // 59: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5e: pop
      // 5f: goto 66
      // 62: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: iinc 5 1
      // 69: iload 2
      // 6a: ifeq 18
      // 6d: aload 4
      // 6f: areturn
   }

   public static Element k$Element(Element param0, String param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.e ()I
      // 03: aload 0
      // 04: aload 1
      // 05: invokestatic com/finalshell/core/C92.k$List (Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/util/List;
      // 08: astore 3
      // 09: istore 2
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 2b
      // 0f: invokeinterface java/util/List.isEmpty ()Z 1
      // 14: ifeq 24
      // 17: goto 1e
      // 1a: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aconst_null
      // 1f: areturn
      // 20: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 3
      // 25: bipush 0
      // 26: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2b: checkcast org/w3c/dom/Element
      // 2e: areturn
   }

   public static String x(Element var0, String var1) {
      int var10000 = D5.K();
      Object var3 = null;
      Element var4 = c$Element(var0, var1);
      int var2 = var10000;

      try {
         if (var2 == 0) {
            return var4.getTextContent();
         }

         if (var4 == null) {
            return (String)var3;
         }
      } catch (GG_2 var5) {
         throw a(var5);
      }

      return var4.getTextContent();
   }

   public static Element U(Element var0, String var1) {
      Element var2 = var0.getOwnerDocument().createElement(var1);
      var0.appendChild(var2);
      return var2;
   }

   public static Element c(Element var0, String var1, String var2) {
      Element var3 = U(var0, var1);
      var3.setTextContent(var2);
      return var3;
   }

   public static void a(Element var0, Element var1) {
      Node var2 = var0.getOwnerDocument().importNode(var1, true);
      var0.appendChild(var2);
   }

   public static Element e(Element var0, String var1, String var2) {
      String var7;
      int var10000 = D5.e();
      Element var4 = U(var0, var1);
      int var3 = var10000;

      label21: {
         label20: {
            try {
               var7 = var2;
               if (var3 != 0) {
                  break label20;
               }

               if (var2 != null) {
                  break label21;
               }
            } catch (GG_2 var6) {
               throw a(var6);
            }

            var7 = "";
         }

         var2 = var7;
      }

      CDATASection var5 = var4.getOwnerDocument().createCDATASection(var2);
      var4.appendChild(var5);
      return var4;
   }

   public static String q(Node var0) throws GG_2 {
      Object var1 = null;

      try {
         Transformer var2 = TransformerFactory.newInstance().newTransformer();
         Properties var3 = var2.getOutputProperties();
         var3.setProperty(a(8328, 5993), a(8333, 5846));
         var2.setOutputProperties(var3);
         StringWriter var4 = new StringWriter();
         var2.transform(new DOMSource(var0), new StreamResult(var4));
         var1 = var4.toString();
         return var1.replaceAll(a(8348, 23672), " ");
      } catch (TransformerException var5) {
         throw new GG_2(a(8336, -28721), var5);
      }
   }

   public static String x(Node var0) throws GG_2 {
      int var10000 = D5.e();
      String var2 = null;
      int var1 = var10000;

      try {
         Transformer var3 = TransformerFactory.newInstance().newTransformer();
         Properties var4 = var3.getOutputProperties();
         var4.setProperty(a(8351, -5323), a(8331, 11872));
         var4.setProperty(a(8322, -26452), a(8320, 21596));
         var3.setOutputProperties(var4);
         StringWriter var5 = new StringWriter();
         var3.transform(new DOMSource(var0), new StreamResult(var5));
         var2 = var5.toString();
         var2 = var2.replaceAll(a(8349, 4449), " ");
      } catch (TransformerException var7) {
         throw new GG_2(a(8321, 11031), var7);
      }

      try {
         if (Ky4.F$arrString() != null) {
            D5.i(++var1);
         }

         return var2;
      } catch (TransformerException var6) {
         throw a(var6);
      }
   }

   public static String d(File var0) throws GG_2 {
      Element var1 = M(var0);
      return x(var1);
   }

   public static String Q$String(InputStream var0) throws GG_2 {
      Element var1 = Q$Element(var0);
      return x(var1);
   }

   public static void y(Node param0, File param1) throws GG_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.K ()I
      // 03: aconst_null
      // 04: astore 3
      // 05: istore 2
      // 06: invokestatic javax/xml/transform/TransformerFactory.newInstance ()Ljavax/xml/transform/TransformerFactory;
      // 09: invokevirtual javax/xml/transform/TransformerFactory.newTransformer ()Ljavax/xml/transform/Transformer;
      // 0c: astore 4
      // 0e: aload 4
      // 10: invokevirtual javax/xml/transform/Transformer.getOutputProperties ()Ljava/util/Properties;
      // 13: astore 5
      // 15: aload 5
      // 17: sipush 8329
      // 1a: sipush -29258
      // 1d: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 20: sipush 8341
      // 23: sipush 997
      // 26: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 29: invokevirtual java/util/Properties.setProperty (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
      // 2c: pop
      // 2d: aload 5
      // 2f: sipush 8326
      // 32: sipush 8437
      // 35: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 38: sipush 8331
      // 3b: sipush 11872
      // 3e: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 41: invokevirtual java/util/Properties.setProperty (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
      // 44: pop
      // 45: aload 4
      // 47: aload 5
      // 49: invokevirtual javax/xml/transform/Transformer.setOutputProperties (Ljava/util/Properties;)V
      // 4c: new javax/xml/transform/dom/DOMSource
      // 4f: dup
      // 50: aload 0
      // 51: invokespecial javax/xml/transform/dom/DOMSource.<init> (Lorg/w3c/dom/Node;)V
      // 54: astore 6
      // 56: aload 1
      // 57: invokestatic com/finalshell/core/C92.f (Ljava/io/File;)Ljava/io/OutputStream;
      // 5a: astore 3
      // 5b: new javax/xml/transform/stream/StreamResult
      // 5e: dup
      // 5f: aload 3
      // 60: invokespecial javax/xml/transform/stream/StreamResult.<init> (Ljava/io/OutputStream;)V
      // 63: astore 7
      // 65: aload 4
      // 67: aload 6
      // 69: aload 7
      // 6b: invokevirtual javax/xml/transform/Transformer.transform (Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
      // 6e: aload 3
      // 6f: iload 2
      // 70: ifeq 77
      // 73: ifnull b4
      // 76: aload 3
      // 77: invokevirtual java/io/OutputStream.close ()V
      // 7a: goto b4
      // 7d: astore 4
      // 7f: goto b4
      // 82: astore 4
      // 84: new com/finalshell/core/GG_2
      // 87: dup
      // 88: sipush 8321
      // 8b: sipush 11031
      // 8e: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 91: aload 4
      // 93: invokespecial com/finalshell/core/GG_2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 96: athrow
      // 97: astore 8
      // 99: aload 3
      // 9a: iload 2
      // 9b: ifeq a9
      // 9e: ifnull b1
      // a1: goto a8
      // a4: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a7: athrow
      // a8: aload 3
      // a9: invokevirtual java/io/OutputStream.close ()V
      // ac: goto b1
      // af: astore 9
      // b1: aload 8
      // b3: athrow
      // b4: return
   }

   public static void O(Node var0, File var1) throws GG_2 {
      k(var0, o(var1));
   }

   public static void k(Node param0, InputStream param1) throws GG_2 {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/core/D5.e ()I
      // 03: istore 2
      // 04: new javax/xml/transform/stream/StreamSource
      // 07: dup
      // 08: aload 1
      // 09: invokespecial javax/xml/transform/stream/StreamSource.<init> (Ljava/io/InputStream;)V
      // 0c: astore 3
      // 0d: sipush 8334
      // 10: sipush -11022
      // 13: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 16: invokestatic javax/xml/validation/SchemaFactory.newInstance (Ljava/lang/String;)Ljavax/xml/validation/SchemaFactory;
      // 19: aload 3
      // 1a: invokevirtual javax/xml/validation/SchemaFactory.newSchema (Ljavax/xml/transform/Source;)Ljavax/xml/validation/Schema;
      // 1d: astore 4
      // 1f: aload 4
      // 21: invokevirtual javax/xml/validation/Schema.newValidator ()Ljavax/xml/validation/Validator;
      // 24: astore 5
      // 26: aload 5
      // 28: new javax/xml/transform/dom/DOMSource
      // 2b: dup
      // 2c: aload 0
      // 2d: invokespecial javax/xml/transform/dom/DOMSource.<init> (Lorg/w3c/dom/Node;)V
      // 30: invokevirtual javax/xml/validation/Validator.validate (Ljavax/xml/transform/Source;)V
      // 33: aload 1
      // 34: iload 2
      // 35: ifne 3c
      // 38: ifnull 89
      // 3b: aload 1
      // 3c: invokevirtual java/io/InputStream.close ()V
      // 3f: goto 89
      // 42: astore 3
      // 43: goto 89
      // 46: astore 3
      // 47: new com/finalshell/core/GG_2
      // 4a: dup
      // 4b: sipush 8337
      // 4e: sipush 9179
      // 51: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 54: aload 3
      // 55: invokespecial com/finalshell/core/GG_2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 58: athrow
      // 59: astore 3
      // 5a: new com/finalshell/core/GG_2
      // 5d: dup
      // 5e: sipush 8344
      // 61: sipush 8492
      // 64: invokestatic com/finalshell/core/C92.a (II)Ljava/lang/String;
      // 67: aload 3
      // 68: invokespecial com/finalshell/core/GG_2.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 6b: athrow
      // 6c: astore 6
      // 6e: aload 1
      // 6f: iload 2
      // 70: ifne 7e
      // 73: ifnull 86
      // 76: goto 7d
      // 79: invokestatic com/finalshell/core/C92.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7c: athrow
      // 7d: aload 1
      // 7e: invokevirtual java/io/InputStream.close ()V
      // 81: goto 86
      // 84: astore 7
      // 86: aload 6
      // 88: athrow
      // 89: return
   }

   public static String o(String var0, File var1) throws GG_2 {
      StreamSource var7;
      int var10000 = D5.e();
      String var3 = null;
      int var2 = var10000;

      try {
         StreamSource var4 = new StreamSource(var1);
         Transformer var5 = TransformerFactory.newInstance().newTransformer(var4);
         Properties var6 = var5.getOutputProperties();
         var6.setProperty(a(8338, -8996), a(8331, 11872));
         var5.setOutputProperties(var6);
         var7 = new StreamSource(new StringReader(var0));
         StreamResult var8 = new StreamResult(new StringWriter());
         var5.transform(var7, var8);
         var3 = var8.getWriter().toString();
      } catch (TransformerException var10) {
         throw new GG_2(a(8321, 11031), var10);
      }

      try {
         if (var2 != 0) {
            Ky4.K(new String[3]);
         }

         return var3;
      } catch (TransformerException var9) {
         throw a(var9);
      }
   }

   public static void W(Element var0, String var1, String var2) {
      var0.setAttributeNS(a(8323, 3651), a(8340, 13661), var1);
      var0.setAttributeNS(a(8350, 6680), a(8345, -20930), a(8335, 16273));
      var0.setAttributeNS(a(8346, 25570), a(8339, -21529), var2);
   }

   public static String J(String var0) throws GG_2 {
      Element var1 = P(a(8343, -23877));
      var1.setTextContent(var0);
      return q(var1.getFirstChild());
   }

   public static InputStream o(File var0) throws GG_2 {
      Object var1 = null;

      try {
         return new FileInputStream(var0);
      } catch (FileNotFoundException var3) {
         throw new GG_2(a(8330, 8579), var3);
      }
   }

   public static OutputStream f(File var0) throws GG_2 {
      Object var1 = null;

      try {
         return new FileOutputStream(var0);
      } catch (FileNotFoundException var3) {
         throw new GG_2(a(8342, -1485), var3);
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 8332) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 193;
               break;
            case 1:
               var10000 = 92;
               break;
            case 2:
               var10000 = 133;
               break;
            case 3:
               var10000 = 32;
               break;
            case 4:
               var10000 = 143;
               break;
            case 5:
               var10000 = 125;
               break;
            case 6:
               var10000 = 113;
               break;
            case 7:
               var10000 = 91;
               break;
            case 8:
               var10000 = 104;
               break;
            case 9:
               var10000 = 59;
               break;
            case 10:
               var10000 = 67;
               break;
            case 11:
               var10000 = 150;
               break;
            case 12:
               var10000 = 121;
               break;
            case 13:
               var10000 = 22;
               break;
            case 14:
               var10000 = 189;
               break;
            case 15:
               var10000 = 207;
               break;
            case 16:
               var10000 = 93;
               break;
            case 17:
               var10000 = 140;
               break;
            case 18:
               var10000 = 80;
               break;
            case 19:
               var10000 = 147;
               break;
            case 20:
               var10000 = 162;
               break;
            case 21:
               var10000 = 243;
               break;
            case 22:
               var10000 = 25;
               break;
            case 23:
               var10000 = 79;
               break;
            case 24:
               var10000 = 255;
               break;
            case 25:
               var10000 = 221;
               break;
            case 26:
               var10000 = 61;
               break;
            case 27:
               var10000 = 34;
               break;
            case 28:
               var10000 = 230;
               break;
            case 29:
               var10000 = 56;
               break;
            case 30:
               var10000 = 205;
               break;
            case 31:
               var10000 = 197;
               break;
            case 32:
               var10000 = 196;
               break;
            case 33:
               var10000 = 141;
               break;
            case 34:
               var10000 = 229;
               break;
            case 35:
               var10000 = 241;
               break;
            case 36:
               var10000 = 28;
               break;
            case 37:
               var10000 = 16;
               break;
            case 38:
               var10000 = 90;
               break;
            case 39:
               var10000 = 202;
               break;
            case 40:
               var10000 = 2;
               break;
            case 41:
               var10000 = 142;
               break;
            case 42:
               var10000 = 225;
               break;
            case 43:
               var10000 = 210;
               break;
            case 44:
               var10000 = 45;
               break;
            case 45:
               var10000 = 57;
               break;
            case 46:
               var10000 = 195;
               break;
            case 47:
               var10000 = 112;
               break;
            case 48:
               var10000 = 95;
               break;
            case 49:
               var10000 = 6;
               break;
            case 50:
               var10000 = 97;
               break;
            case 51:
               var10000 = 129;
               break;
            case 52:
               var10000 = 103;
               break;
            case 53:
               var10000 = 204;
               break;
            case 54:
               var10000 = 199;
               break;
            case 55:
               var10000 = 216;
               break;
            case 56:
               var10000 = 27;
               break;
            case 57:
               var10000 = 214;
               break;
            case 58:
               var10000 = 175;
               break;
            case 59:
               var10000 = 46;
               break;
            case 60:
               var10000 = 37;
               break;
            case 61:
               var10000 = 166;
               break;
            case 62:
               var10000 = 236;
               break;
            case 63:
               var10000 = 94;
               break;
            case 64:
               var10000 = 128;
               break;
            case 65:
               var10000 = 23;
               break;
            case 66:
               var10000 = 251;
               break;
            case 67:
               var10000 = 47;
               break;
            case 68:
               var10000 = 102;
               break;
            case 69:
               var10000 = 58;
               break;
            case 70:
               var10000 = 187;
               break;
            case 71:
               var10000 = 171;
               break;
            case 72:
               var10000 = 62;
               break;
            case 73:
               var10000 = 163;
               break;
            case 74:
               var10000 = 109;
               break;
            case 75:
               var10000 = 10;
               break;
            case 76:
               var10000 = 161;
               break;
            case 77:
               var10000 = 198;
               break;
            case 78:
               var10000 = 39;
               break;
            case 79:
               var10000 = 244;
               break;
            case 80:
               var10000 = 191;
               break;
            case 81:
               var10000 = 250;
               break;
            case 82:
               var10000 = 254;
               break;
            case 83:
               var10000 = 249;
               break;
            case 84:
               var10000 = 118;
               break;
            case 85:
               var10000 = 222;
               break;
            case 86:
               var10000 = 110;
               break;
            case 87:
               var10000 = 70;
               break;
            case 88:
               var10000 = 172;
               break;
            case 89:
               var10000 = 156;
               break;
            case 90:
               var10000 = 228;
               break;
            case 91:
               var10000 = 164;
               break;
            case 92:
               var10000 = 203;
               break;
            case 93:
               var10000 = 153;
               break;
            case 94:
               var10000 = 9;
               break;
            case 95:
               var10000 = 138;
               break;
            case 96:
               var10000 = 176;
               break;
            case 97:
               var10000 = 170;
               break;
            case 98:
               var10000 = 148;
               break;
            case 99:
               var10000 = 66;
               break;
            case 100:
               var10000 = 152;
               break;
            case 101:
               var10000 = 98;
               break;
            case 102:
               var10000 = 29;
               break;
            case 103:
               var10000 = 145;
               break;
            case 104:
               var10000 = 146;
               break;
            case 105:
               var10000 = 160;
               break;
            case 106:
               var10000 = 213;
               break;
            case 107:
               var10000 = 242;
               break;
            case 108:
               var10000 = 123;
               break;
            case 109:
               var10000 = 169;
               break;
            case 110:
               var10000 = 227;
               break;
            case 111:
               var10000 = 0;
               break;
            case 112:
               var10000 = 107;
               break;
            case 113:
               var10000 = 74;
               break;
            case 114:
               var10000 = 155;
               break;
            case 115:
               var10000 = 201;
               break;
            case 116:
               var10000 = 173;
               break;
            case 117:
               var10000 = 38;
               break;
            case 118:
               var10000 = 87;
               break;
            case 119:
               var10000 = 211;
               break;
            case 120:
               var10000 = 238;
               break;
            case 121:
               var10000 = 233;
               break;
            case 122:
               var10000 = 33;
               break;
            case 123:
               var10000 = 115;
               break;
            case 124:
               var10000 = 177;
               break;
            case 125:
               var10000 = 247;
               break;
            case 126:
               var10000 = 181;
               break;
            case 127:
               var10000 = 55;
               break;
            case 128:
               var10000 = 179;
               break;
            case 129:
               var10000 = 209;
               break;
            case 130:
               var10000 = 35;
               break;
            case 131:
               var10000 = 119;
               break;
            case 132:
               var10000 = 135;
               break;
            case 133:
               var10000 = 190;
               break;
            case 134:
               var10000 = 1;
               break;
            case 135:
               var10000 = 52;
               break;
            case 136:
               var10000 = 73;
               break;
            case 137:
               var10000 = 50;
               break;
            case 138:
               var10000 = 53;
               break;
            case 139:
               var10000 = 106;
               break;
            case 140:
               var10000 = 60;
               break;
            case 141:
               var10000 = 96;
               break;
            case 142:
               var10000 = 219;
               break;
            case 143:
               var10000 = 174;
               break;
            case 144:
               var10000 = 131;
               break;
            case 145:
               var10000 = 17;
               break;
            case 146:
               var10000 = 188;
               break;
            case 147:
               var10000 = 19;
               break;
            case 148:
               var10000 = 86;
               break;
            case 149:
               var10000 = 8;
               break;
            case 150:
               var10000 = 81;
               break;
            case 151:
               var10000 = 252;
               break;
            case 152:
               var10000 = 232;
               break;
            case 153:
               var10000 = 224;
               break;
            case 154:
               var10000 = 89;
               break;
            case 155:
               var10000 = 40;
               break;
            case 156:
               var10000 = 159;
               break;
            case 157:
               var10000 = 44;
               break;
            case 158:
               var10000 = 75;
               break;
            case 159:
               var10000 = 186;
               break;
            case 160:
               var10000 = 13;
               break;
            case 161:
               var10000 = 183;
               break;
            case 162:
               var10000 = 12;
               break;
            case 163:
               var10000 = 30;
               break;
            case 164:
               var10000 = 246;
               break;
            case 165:
               var10000 = 49;
               break;
            case 166:
               var10000 = 65;
               break;
            case 167:
               var10000 = 130;
               break;
            case 168:
               var10000 = 111;
               break;
            case 169:
               var10000 = 26;
               break;
            case 170:
               var10000 = 83;
               break;
            case 171:
               var10000 = 194;
               break;
            case 172:
               var10000 = 18;
               break;
            case 173:
               var10000 = 88;
               break;
            case 174:
               var10000 = 215;
               break;
            case 175:
               var10000 = 76;
               break;
            case 176:
               var10000 = 127;
               break;
            case 177:
               var10000 = 132;
               break;
            case 178:
               var10000 = 184;
               break;
            case 179:
               var10000 = 82;
               break;
            case 180:
               var10000 = 15;
               break;
            case 181:
               var10000 = 36;
               break;
            case 182:
               var10000 = 124;
               break;
            case 183:
               var10000 = 11;
               break;
            case 184:
               var10000 = 245;
               break;
            case 185:
               var10000 = 248;
               break;
            case 186:
               var10000 = 217;
               break;
            case 187:
               var10000 = 122;
               break;
            case 188:
               var10000 = 42;
               break;
            case 189:
               var10000 = 208;
               break;
            case 190:
               var10000 = 185;
               break;
            case 191:
               var10000 = 154;
               break;
            case 192:
               var10000 = 105;
               break;
            case 193:
               var10000 = 235;
               break;
            case 194:
               var10000 = 168;
               break;
            case 195:
               var10000 = 68;
               break;
            case 196:
               var10000 = 108;
               break;
            case 197:
               var10000 = 78;
               break;
            case 198:
               var10000 = 120;
               break;
            case 199:
               var10000 = 21;
               break;
            case 200:
               var10000 = 5;
               break;
            case 201:
               var10000 = 149;
               break;
            case 202:
               var10000 = 137;
               break;
            case 203:
               var10000 = 180;
               break;
            case 204:
               var10000 = 234;
               break;
            case 205:
               var10000 = 54;
               break;
            case 206:
               var10000 = 192;
               break;
            case 207:
               var10000 = 85;
               break;
            case 208:
               var10000 = 63;
               break;
            case 209:
               var10000 = 41;
               break;
            case 210:
               var10000 = 51;
               break;
            case 211:
               var10000 = 226;
               break;
            case 212:
               var10000 = 7;
               break;
            case 213:
               var10000 = 114;
               break;
            case 214:
               var10000 = 4;
               break;
            case 215:
               var10000 = 167;
               break;
            case 216:
               var10000 = 239;
               break;
            case 217:
               var10000 = 136;
               break;
            case 218:
               var10000 = 117;
               break;
            case 219:
               var10000 = 220;
               break;
            case 220:
               var10000 = 99;
               break;
            case 221:
               var10000 = 126;
               break;
            case 222:
               var10000 = 72;
               break;
            case 223:
               var10000 = 71;
               break;
            case 224:
               var10000 = 43;
               break;
            case 225:
               var10000 = 31;
               break;
            case 226:
               var10000 = 134;
               break;
            case 227:
               var10000 = 69;
               break;
            case 228:
               var10000 = 144;
               break;
            case 229:
               var10000 = 77;
               break;
            case 230:
               var10000 = 139;
               break;
            case 231:
               var10000 = 20;
               break;
            case 232:
               var10000 = 116;
               break;
            case 233:
               var10000 = 231;
               break;
            case 234:
               var10000 = 165;
               break;
            case 235:
               var10000 = 14;
               break;
            case 236:
               var10000 = 48;
               break;
            case 237:
               var10000 = 158;
               break;
            case 238:
               var10000 = 206;
               break;
            case 239:
               var10000 = 101;
               break;
            case 240:
               var10000 = 200;
               break;
            case 241:
               var10000 = 84;
               break;
            case 242:
               var10000 = 3;
               break;
            case 243:
               var10000 = 182;
               break;
            case 244:
               var10000 = 100;
               break;
            case 245:
               var10000 = 240;
               break;
            case 246:
               var10000 = 178;
               break;
            case 247:
               var10000 = 64;
               break;
            case 248:
               var10000 = 223;
               break;
            case 249:
               var10000 = 253;
               break;
            case 250:
               var10000 = 212;
               break;
            case 251:
               var10000 = 218;
               break;
            case 252:
               var10000 = 237;
               break;
            case 253:
               var10000 = 24;
               break;
            case 254:
               var10000 = 151;
               break;
            default:
               var10000 = 157;
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
      String[] var5 = new String[32];
      int var3 = 0;
      String var2 = "ô\u0002@z\u0018h\u009f~ú\u0087\u0012È¸\u0096\u0003S_\u008a h:Ù\u0019xÛ\u009c\u0018D(ëh\f{e\u009c\u008cT«ÙðâmÖþFÁ¯·õ;Â)ô\nJ\u001f\n\u001bÒ\u0000\u008d+Ò\b+w\u0081\u001d\u0010d8ß\u0082\"#Î7EøÏ\u0090ùßC\u0095å\u0095U\u000f\u0013¡Ï[\u0014åa\u0092L¸¢3\u0091ár\u0005F¬gØª\u0096¥Ä7\u0006~É¾LÁ!\u0012\u009b¸\u00ad-±\u008e1.\u0083§  \u0001Iz\u009cfø\u0003¸\u0086÷\u0011½\u001eiù?\u001c!|wÊÜ¹¿p\u0090ÐÐ\u0005°Mj\u008ex\u0006÷\u008d\u001b£f`\u0014\u0010\u0016Üø\u009c3øt\u001e \u0091´\u0016µ\u0099î4Ý!\u0097\u0005=tÛ©N\u0013p\tÐ\u001b\fSÛæ/ÜCÀ.Ë¾\u008a©Öø\bÇ\u0088\u0097\t\u001ac\u0004\u0091\u001djÓ\u0099$p|\u009dìd¶ï»\u008c\u0001uÓ\u008e½ëäøDl\u0003þøØLI\u0006»\n\f¶þ¬\u0006\u009a?(\u0010zx\u001dÛ\u0095¯ì¶eEÏ\u007fÒ\u008c7à\u0090øá?ûÝ,>]´ å\u009c»À%\u0006Öw?üâ\u008b\u000e\u0000~ÞõË\u0099å@µ@û0\u0085\u0089\t`UÒÐK*Í\u0095Í)Î\u0001\r~â7Ï\u0085.\u009b¦\u001e¥µPE*o\u007f¾j\u000e>K\u0094õ\u008cÙ\u001e;\u000e\u001b¯îÒ4ç?¼Jø\u000f;î¹ç%ßi\u001b\u001e\u0095»¨e\u0087<\u0005|ÑQ@;\u0003¿Ô)\u0012ò~\u0080õ\u0014\u0095\u0085M\u0015Ëò-[ø1ª\u000f>\u0003\u009aÆ\u008d\u0013èmÃ\u0097nÂ\u0097Ô¦\u009ar\b\bÒz©1²ë\u0012«6«üa¼9mÈMQ\u0002W-\u00adt#\u0014";
      int var4 = "ô\u0002@z\u0018h\u009f~ú\u0087\u0012È¸\u0096\u0003S_\u008a h:Ù\u0019xÛ\u009c\u0018D(ëh\f{e\u009c\u008cT«ÙðâmÖþFÁ¯·õ;Â)ô\nJ\u001f\n\u001bÒ\u0000\u008d+Ò\b+w\u0081\u001d\u0010d8ß\u0082\"#Î7EøÏ\u0090ùßC\u0095å\u0095U\u000f\u0013¡Ï[\u0014åa\u0092L¸¢3\u0091ár\u0005F¬gØª\u0096¥Ä7\u0006~É¾LÁ!\u0012\u009b¸\u00ad-±\u008e1.\u0083§  \u0001Iz\u009cfø\u0003¸\u0086÷\u0011½\u001eiù?\u001c!|wÊÜ¹¿p\u0090ÐÐ\u0005°Mj\u008ex\u0006÷\u008d\u001b£f`\u0014\u0010\u0016Üø\u009c3øt\u001e \u0091´\u0016µ\u0099î4Ý!\u0097\u0005=tÛ©N\u0013p\tÐ\u001b\fSÛæ/ÜCÀ.Ë¾\u008a©Öø\bÇ\u0088\u0097\t\u001ac\u0004\u0091\u001djÓ\u0099$p|\u009dìd¶ï»\u008c\u0001uÓ\u008e½ëäøDl\u0003þøØLI\u0006»\n\f¶þ¬\u0006\u009a?(\u0010zx\u001dÛ\u0095¯ì¶eEÏ\u007fÒ\u008c7à\u0090øá?ûÝ,>]´ å\u009c»À%\u0006Öw?üâ\u008b\u000e\u0000~ÞõË\u0099å@µ@û0\u0085\u0089\t`UÒÐK*Í\u0095Í)Î\u0001\r~â7Ï\u0085.\u009b¦\u001e¥µPE*o\u007f¾j\u000e>K\u0094õ\u008cÙ\u001e;\u000e\u001b¯îÒ4ç?¼Jø\u000f;î¹ç%ßi\u001b\u001e\u0095»¨e\u0087<\u0005|ÑQ@;\u0003¿Ô)\u0012ò~\u0080õ\u0014\u0095\u0085M\u0015Ëò-[ø1ª\u000f>\u0003\u009aÆ\u008d\u0013èmÃ\u0097nÂ\u0097Ô¦\u009ar\b\bÒz©1²ë\u0012«6«üa¼9mÈMQ\u0002W-\u00adt#\u0014"
         .length();
      char var1 = 14;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 20;
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
                        var46 = 11;
                        break;
                     case 1:
                        var46 = 91;
                        break;
                     case 2:
                        var46 = 50;
                        break;
                     case 3:
                        var46 = 41;
                        break;
                     case 4:
                        var46 = 83;
                        break;
                     case 5:
                        var46 = 26;
                        break;
                     default:
                        var46 = 61;
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
                     b = new String[32];
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

                  var2 = "p\"°´l-9ð0Î¯Ai\u0017ð4\u0003ææÏ\u00120¯M\u0096\u008dõ\u0095\u009a@®Àä\u0087.Å\u001bx\r";
                  var4 = "p\"°´l-9ð0Î¯Ai\u0017ð4\u0003ææÏ\u00120¯M\u0096\u008dõ\u0095\u009a@®Àä\u0087.Å\u001bx\r".length();
                  var1 = 20;
                  var8 = -1;
            }

            var10000 = 107;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}





