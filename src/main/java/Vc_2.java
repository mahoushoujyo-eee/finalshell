import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class Vc_2 extends JFrame {
   FT D;
   protected tq_4 J;
   JScrollPane e;
   protected JTextField N;
   boolean q;
   String M;
   dx_4 S;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   Vc_2() {
      com.c.c(551927859663233540L).setBoolean(this, true);
      com.c.c(122851861963895150L).set(this, a(27547, 25492));
      com.c.c(345343603487298676L).set(this, null);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(226602340888316261L);
      Object[] var10002 = var10001;
      Vc_2 var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      this.setDefaultCloseOperation(3);
      JPanel var1 = (JPanel)this.getContentPane();
      var1.setLayout(new MigLayout());
      com.c.c(630523330860819866L).set(this, new JTextField(""));
      Object[] var5 = com.c.a(com.c.c(630523330860819866L).get(this));
      var10000 = com.c.d(322267315291882359L);
      var10002 = var5;
      var10001 = null;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var1.add((JTextField)com.c.c(630523330860819866L).get(this), a(27544, 26554));
      ((JTextField)com.c.c(630523330860819866L).get(this)).getDocument().addDocumentListener(new gv_2(this));
      com.c.c(533021200004208971L).set(this, new FT());
      com.c.c(509555507897691401L).set(this, new tq_4((FT)com.c.c(533021200004208971L).get(this)));
      com.c.c(286579467808392218L).set(this, new JScrollPane((tq_4)com.c.c(509555507897691401L).get(this)));
      ((JScrollPane)com.c.c(286579467808392218L).get(this)).setOpaque(false);
      ((JScrollPane)com.c.c(286579467808392218L).get(this)).getViewport().setOpaque(false);
      var1.add((JScrollPane)com.c.c(286579467808392218L).get(this), a(27545, -23867));
      this.setSize(a(19943, 1727223295693643173L), a(12326, 6209234032750633061L));
      this.setLocationRelativeTo(null);
      this.setVisible(true);
      var10001 = com.c.f();
      var10003 = com.c.d(193516965737299518L);
      var10002 = var10001;
      Vc_2 var12 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var12, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   void o() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic yB_3.Y ()[I
      // 03: aload 0
      // 04: new dx_4
      // 07: dup
      // 08: invokespecial dx_4.<init> ()V
      // 0b: ldc2_w 345343603487298676
      // 0e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 11: dup_x2
      // 12: pop
      // 13: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 16: astore 1
      // 17: new java/io/BufferedReader
      // 1a: dup
      // 1b: new java/io/FileReader
      // 1e: dup
      // 1f: new java/io/File
      // 22: dup
      // 23: sipush 27548
      // 26: sipush 1999
      // 29: invokestatic Vc_2.a (II)Ljava/lang/String;
      // 2c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 2f: invokespecial java/io/FileReader.<init> (Ljava/io/File;)V
      // 32: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 35: astore 2
      // 36: ldc ""
      // 38: astore 3
      // 39: bipush 0
      // 3a: istore 4
      // 3c: aload 2
      // 3d: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 40: dup
      // 41: astore 3
      // 42: ifnull b4
      // 45: aload 1
      // 46: ifnonnull d5
      // 49: aload 3
      // 4a: ldc "/"
      // 4c: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 4f: aload 1
      // 50: ifnonnull 71
      // 53: goto 5a
      // 56: invokestatic Vc_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: ifeq 74
      // 5d: goto 64
      // 60: invokestatic Vc_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: aload 3
      // 65: ldc ":"
      // 67: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 6a: goto 71
      // 6d: invokestatic Vc_2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: ifeq 74
      // 74: iinc 4 1
      // 77: new L1
      // 7a: dup
      // 7b: ldc ""
      // 7d: aload 3
      // 7e: bipush 0
      // 7f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 82: invokespecial L1.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 85: astore 5
      // 87: aload 0
      // 88: ldc2_w 345343603487298676
      // 8b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 8e: swap
      // 8f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 92: invokestatic com/c.f ()[Ljava/lang/Object;
      // 95: ldc2_w 596400151700218172
      // 98: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 9b: dup_x2
      // 9c: pop
      // 9d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // a0: checkcast java/util/ArrayList
      // a3: goto aa
      // a6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // a9: athrow
      // aa: aload 5
      // ac: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // af: pop
      // b0: aload 1
      // b1: ifnull 3c
      // b4: getstatic java/lang/System.out Ljava/io/PrintStream;
      // b7: new java/lang/StringBuilder
      // ba: dup
      // bb: invokespecial java/lang/StringBuilder.<init> ()V
      // be: sipush 27546
      // c1: sipush -10852
      // c4: invokestatic Vc_2.a (II)Ljava/lang/String;
      // c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ca: iload 4
      // cc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // cf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d2: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // d5: goto dd
      // d8: astore 2
      // d9: aload 2
      // da: invokevirtual java/lang/Exception.printStackTrace ()V
      // dd: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void j() {
      int[] var10000 = yB_3.Y();
      Method var10001 = (Method)com.c.c(533021200004208971L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(447348905967678196L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      var10001 = (Method)com.c.c(345343603487298676L).get(this);
      var10002 = com.c.f();
      var10004 = com.c.d(596400151700218172L);
      var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var55 = (ArrayList)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      ArrayList var2 = var55;
      String var3 = ((JTextField)com.c.c(630523330860819866L).get(this)).getText().trim();
      ArrayList var4 = new ArrayList();
      Pattern var5 = Pattern.compile((String)com.c.c(122851861963895150L).get(this));
      Matcher var6 = var5.matcher(var3);
      int[] var1 = var10000;

      String var7;
      while (true) {
         if (var6.find()) {
            var7 = var6.group();
            var4.add(var7);
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         var7 = var3;
         break;
      }

      int var8 = var3.indexOf(" ");
      if (var8 > -1) {
         var7 = var3.substring(0, var8);
      }

      HashSet var9 = new HashSet();
      Iterator var10 = var2.iterator();

      while (true) {
         if (var10.hasNext()) {
            L1 var11 = (L1)var10.next();
            var10000 = (int[])var11;
            if (var1 != null) {
               break;
            }

            var10003 = com.c.f();
            Method var10005 = com.c.d(542058094445767607L);
            Object[] var94 = var10003;
            L1 var85 = var11;
            Method var73 = var10005;

            try {
               var10002 = (Object[])var73.invoke(var85, var94);
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            var10002 = com.c.a(var10002, var4);
            var10004 = com.c.d(252701697396259824L);
            var10003 = var10002;
            Vc_2 var76 = this;
            var10001 = var10004;

            try {
               var57 = (Integer)var10001.invoke(var76, var10003);
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            Object[] var58 = com.c.a(var57);
            Method var87 = com.c.d(610207701387135922L);
            var10002 = var58;
            L1 var59 = var11;
            Method var38 = var87;

            try {
               var38.invoke(var59, var10002);
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            if (var1 == null) {
               continue;
            }
         }

         var10000 = (int[])var2.clone();
         break;
      }

      ArrayList var26 = (ArrayList)var10000;
      Object[] var60 = com.c.a(var26);
      Method var88 = com.c.d(293131147599002580L);
      var10002 = var60;
      Vc_2 var61 = this;
      Method var39 = var88;

      try {
         var39.invoke(var61, var10002);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      ArrayList var29 = new ArrayList();

      for (L1 var13 : var2) {
         Object[] var62 = com.c.f();
         Method var89 = com.c.d(542058094445767607L);
         var10002 = var62;
         L1 var63 = var13;
         Method var40 = var89;

         try {
            var41 = (String)var40.invoke(var63, var10002);
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         label247: {
            String var14 = var41;
            boolean var42 = var9.contains(var14);
            if (var1 == null) {
               if (var42) {
                  break label247;
               }

               var42 = var14.startsWith(var3);
            }

            if (var1 == null && var42) {
               var29.add(var13);
               var9.add(var14);
            }
         }

         if (var1 != null) {
            break;
         }
      }

      ArrayList var32 = new ArrayList();
      Iterator var34 = var26.iterator();

      label248: {
         while (true) {
            if (var34.hasNext()) {
               L1 var35 = (L1)var34.next();
               Object[] var64 = com.c.f();
               Method var90 = com.c.d(542058094445767607L);
               var10002 = var64;
               L1 var65 = var35;
               Method var43 = var90;

               try {
                  var44 = (String)var43.invoke(var65, var10002);
               } catch (InvocationTargetException var17) {
                  throw var17.getTargetException();
               }

               var45 = var44.startsWith(var7);
               if (var1 != null) {
                  break;
               }

               if (var45) {
                  var32.add(0, var35);
               }

               if (var1 == null) {
                  continue;
               }
            }

            var34 = var32.iterator();
            var45 = var34.hasNext();
            break;
         }

         while (var45) {
            L1 var36 = (L1)var34.next();
            var26.remove(var36);
            var26.add(0, var36);
            if (var1 != null) {
               break label248;
            }

            if (var1 != null) {
               break;
            }

            var45 = var34.hasNext();
         }

         var2 = var26;
      }

      int var46 = var3.equals("");
      if (var1 == null) {
         var46 = var46 == 0 ? 1 : 0;
      }

      int var25 = var46;
      byte var47 = com.c.c(551927859663233540L).getBoolean(this);
      if (var1 == null) {
         label168:
         if (var47 != 0) {
            ArrayList var27 = new ArrayList();
            int var30 = 0;

            while (var30 < var2.size()) {
               var27.add((L1)var2.get(var2.size() - 1 - var30));
               var30++;
               if (var1 != null) {
                  break label168;
               }

               if (var1 != null) {
                  break;
               }
            }

            var2 = var27;
         }

         var47 = 0;
      }

      int var28 = var47;

      while (true) {
         if (var28 < var2.size()) {
            L1 var31 = (L1)var2.get(var2.size() - var28 - 1);
            byte var33 = 1;
            if (var1 != null) {
               break;
            }

            var48 = var25;
            label157:
            if (var1 == null) {
               if (var25 != 0) {
                  Object[] var66 = com.c.f();
                  Method var91 = com.c.d(608348398594129275L);
                  var10002 = var66;
                  L1 var67 = var31;
                  Method var49 = var91;

                  try {
                     var48 = (Integer)var49.invoke(var67, var10002);
                  } catch (InvocationTargetException var16) {
                     throw var16.getTargetException();
                  }

                  if (var1 != null) {
                     break label157;
                  }

                  if (var48 == 0) {
                     var33 = 0;
                  }
               }

               var48 = var33;
            }

            if (var48 != 0) {
               var10000 = (int[])com.c.c(533021200004208971L).get(this);
               Object[] var68 = com.c.a(var31);
               Method var92 = com.c.d(333124989248955376L);
               var10002 = var68;
               var10001 = var10000;
               Method var51 = var92;

               try {
                  var51.invoke(var10001, var10002);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }
            }

            var28++;
            if (var1 == null) {
               continue;
            }
         }

         ((FT)com.c.c(533021200004208971L).get(this)).fireTableDataChanged();
         break;
      }
   }

   int T(String var1, ArrayList var2) {
      ArrayList var4 = new ArrayList();
      Pattern var5 = Pattern.compile((String)com.c.c(122851861963895150L).get(this));
      int[] var10000 = yB_3.Y();
      Matcher var6 = var5.matcher(var1);
      int[] var3 = var10000;

      while (true) {
         if (var6.find()) {
            String var7 = var6.group();
            var17 = var4.add(var7);
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         var17 = 0;
         break;
      }

      int var15 = var17;
      HashSet var8 = new HashSet();
      HashSet var9 = new HashSet();
      Iterator var10 = var2.iterator();

      while (true) {
         if (var10.hasNext()) {
            String var11 = (String)var10.next();
            boolean var12 = false;
            var18 = var8.contains(var11);
            if (var3 != null) {
               break;
            }

            if (var18 == 0) {
               Iterator var13 = var4.iterator();

               while (true) {
                  label52:
                  if (var13.hasNext()) {
                     String var14 = (String)var13.next();
                     boolean var19 = var14.contains(var11);
                     if (var3 != null) {
                        break;
                     }

                     label77: {
                        if (var3 == null) {
                           if (!var19) {
                              break label77;
                           }

                           var12 = true;
                           var19 = var9.contains(var14);
                        }

                        if (var3 == null) {
                           if (var19) {
                              break label77;
                           }

                           var15++;
                           var9.add(var14);
                        }

                        if (var3 == null) {
                           break label52;
                        }
                     }

                     if (var3 == null) {
                        continue;
                     }
                  }

                  var8.add(var11);
                  break;
               }
            }

            if (var3 == null) {
               continue;
            }
         }

         var18 = var15;
         break;
      }

      return var18;
   }

   void R(ArrayList var1) {
      Collections.sort(var1, new Ld_2(this));
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[5];
      int var11 = 0;
      String var10 = "º\u0019*\u0080®ëxåÂxÍh\u0082ê\u0012Ñl\u0085\u0019Ô\u001e\u0000ê\u008c\u009fà\t\nä;©ô\u0085G\u000e,9ÈZº ¬¹\rúeÊËb\u009e\u000e_ïTiî\u001fF.oP\u0080'øpDjPÜ\u009ey\u0086K\u001b\u0001½ \u009er\u001f\u0004攻重£<";
      int var12 = "º\u0019*\u0080®ëxåÂxÍh\u0082ê\u0012Ñl\u0085\u0019Ô\u001e\u0000ê\u008c\u009fà\t\nä;©ô\u0085G\u000e,9ÈZº ¬¹\rúeÊËb\u009e\u000e_ïTiî\u001fF.oP\u0080'øpDjPÜ\u009ey\u0086K\u001b\u0001½ \u009er\u001f\u0004攻重£<"
         .length();
      char var9 = '#';
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 85;
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
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 18;
                        break;
                     case 1:
                        var58 = 18;
                        break;
                     case 2:
                        var58 = 61;
                        break;
                     case 3:
                        var58 = 46;
                        break;
                     case 4:
                        var58 = 51;
                        break;
                     case 5:
                        var58 = 27;
                        break;
                     default:
                        var58 = 107;
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
                     b = new String[5];
                     long var0 = 5172041645175118159L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "Æah~1n¸º¼$d¢ë©Æ²";
                     int var5 = "Æah~1n¸º¼$d¢ë©Æ²".length();
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

                  var10 = "N8d\u00059n\u0019¬~üÍ\u008f\u0006ó\fó4R^Æ ÒÐ\u0083~\u001a@";
                  var12 = "N8d\u00059n\u0019¬~üÍ\u008f\u0006ó\fó4R^Æ ÒÐ\u0083~\u001a@".length();
                  var9 = 14;
                  var16 = -1;
            }

            var10000 = 94;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 27544) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 68;
               break;
            case 1:
               var10000 = 36;
               break;
            case 2:
               var10000 = 59;
               break;
            case 3:
               var10000 = 212;
               break;
            case 4:
               var10000 = 253;
               break;
            case 5:
               var10000 = 51;
               break;
            case 6:
               var10000 = 7;
               break;
            case 7:
               var10000 = 96;
               break;
            case 8:
               var10000 = 222;
               break;
            case 9:
               var10000 = 168;
               break;
            case 10:
               var10000 = 234;
               break;
            case 11:
               var10000 = 2;
               break;
            case 12:
               var10000 = 190;
               break;
            case 13:
               var10000 = 11;
               break;
            case 14:
               var10000 = 228;
               break;
            case 15:
               var10000 = 223;
               break;
            case 16:
               var10000 = 109;
               break;
            case 17:
               var10000 = 138;
               break;
            case 18:
               var10000 = 77;
               break;
            case 19:
               var10000 = 172;
               break;
            case 20:
               var10000 = 93;
               break;
            case 21:
               var10000 = 25;
               break;
            case 22:
               var10000 = 94;
               break;
            case 23:
               var10000 = 250;
               break;
            case 24:
               var10000 = 91;
               break;
            case 25:
               var10000 = 160;
               break;
            case 26:
               var10000 = 179;
               break;
            case 27:
               var10000 = 6;
               break;
            case 28:
               var10000 = 147;
               break;
            case 29:
               var10000 = 39;
               break;
            case 30:
               var10000 = 224;
               break;
            case 31:
               var10000 = 141;
               break;
            case 32:
               var10000 = 191;
               break;
            case 33:
               var10000 = 137;
               break;
            case 34:
               var10000 = 169;
               break;
            case 35:
               var10000 = 75;
               break;
            case 36:
               var10000 = 112;
               break;
            case 37:
               var10000 = 40;
               break;
            case 38:
               var10000 = 202;
               break;
            case 39:
               var10000 = 152;
               break;
            case 40:
               var10000 = 192;
               break;
            case 41:
               var10000 = 197;
               break;
            case 42:
               var10000 = 176;
               break;
            case 43:
               var10000 = 182;
               break;
            case 44:
               var10000 = 65;
               break;
            case 45:
               var10000 = 175;
               break;
            case 46:
               var10000 = 200;
               break;
            case 47:
               var10000 = 85;
               break;
            case 48:
               var10000 = 9;
               break;
            case 49:
               var10000 = 164;
               break;
            case 50:
               var10000 = 155;
               break;
            case 51:
               var10000 = 125;
               break;
            case 52:
               var10000 = 206;
               break;
            case 53:
               var10000 = 43;
               break;
            case 54:
               var10000 = 38;
               break;
            case 55:
               var10000 = 127;
               break;
            case 56:
               var10000 = 66;
               break;
            case 57:
               var10000 = 237;
               break;
            case 58:
               var10000 = 34;
               break;
            case 59:
               var10000 = 208;
               break;
            case 60:
               var10000 = 27;
               break;
            case 61:
               var10000 = 230;
               break;
            case 62:
               var10000 = 252;
               break;
            case 63:
               var10000 = 251;
               break;
            case 64:
               var10000 = 117;
               break;
            case 65:
               var10000 = 132;
               break;
            case 66:
               var10000 = 123;
               break;
            case 67:
               var10000 = 146;
               break;
            case 68:
               var10000 = 56;
               break;
            case 69:
               var10000 = 220;
               break;
            case 70:
               var10000 = 5;
               break;
            case 71:
               var10000 = 185;
               break;
            case 72:
               var10000 = 128;
               break;
            case 73:
               var10000 = 8;
               break;
            case 74:
               var10000 = 70;
               break;
            case 75:
               var10000 = 120;
               break;
            case 76:
               var10000 = 143;
               break;
            case 77:
               var10000 = 41;
               break;
            case 78:
               var10000 = 73;
               break;
            case 79:
               var10000 = 63;
               break;
            case 80:
               var10000 = 72;
               break;
            case 81:
               var10000 = 148;
               break;
            case 82:
               var10000 = 140;
               break;
            case 83:
               var10000 = 159;
               break;
            case 84:
               var10000 = 103;
               break;
            case 85:
               var10000 = 204;
               break;
            case 86:
               var10000 = 22;
               break;
            case 87:
               var10000 = 142;
               break;
            case 88:
               var10000 = 209;
               break;
            case 89:
               var10000 = 79;
               break;
            case 90:
               var10000 = 44;
               break;
            case 91:
               var10000 = 183;
               break;
            case 92:
               var10000 = 135;
               break;
            case 93:
               var10000 = 122;
               break;
            case 94:
               var10000 = 111;
               break;
            case 95:
               var10000 = 244;
               break;
            case 96:
               var10000 = 57;
               break;
            case 97:
               var10000 = 129;
               break;
            case 98:
               var10000 = 194;
               break;
            case 99:
               var10000 = 119;
               break;
            case 100:
               var10000 = 76;
               break;
            case 101:
               var10000 = 219;
               break;
            case 102:
               var10000 = 23;
               break;
            case 103:
               var10000 = 214;
               break;
            case 104:
               var10000 = 100;
               break;
            case 105:
               var10000 = 180;
               break;
            case 106:
               var10000 = 28;
               break;
            case 107:
               var10000 = 235;
               break;
            case 108:
               var10000 = 154;
               break;
            case 109:
               var10000 = 153;
               break;
            case 110:
               var10000 = 198;
               break;
            case 111:
               var10000 = 126;
               break;
            case 112:
               var10000 = 81;
               break;
            case 113:
               var10000 = 130;
               break;
            case 114:
               var10000 = 1;
               break;
            case 115:
               var10000 = 20;
               break;
            case 116:
               var10000 = 124;
               break;
            case 117:
               var10000 = 211;
               break;
            case 118:
               var10000 = 231;
               break;
            case 119:
               var10000 = 115;
               break;
            case 120:
               var10000 = 177;
               break;
            case 121:
               var10000 = 207;
               break;
            case 122:
               var10000 = 158;
               break;
            case 123:
               var10000 = 187;
               break;
            case 124:
               var10000 = 144;
               break;
            case 125:
               var10000 = 21;
               break;
            case 126:
               var10000 = 188;
               break;
            case 127:
               var10000 = 95;
               break;
            case 128:
               var10000 = 92;
               break;
            case 129:
               var10000 = 181;
               break;
            case 130:
               var10000 = 55;
               break;
            case 131:
               var10000 = 62;
               break;
            case 132:
               var10000 = 101;
               break;
            case 133:
               var10000 = 203;
               break;
            case 134:
               var10000 = 19;
               break;
            case 135:
               var10000 = 196;
               break;
            case 136:
               var10000 = 98;
               break;
            case 137:
               var10000 = 248;
               break;
            case 138:
               var10000 = 232;
               break;
            case 139:
               var10000 = 35;
               break;
            case 140:
               var10000 = 226;
               break;
            case 141:
               var10000 = 249;
               break;
            case 142:
               var10000 = 90;
               break;
            case 143:
               var10000 = 108;
               break;
            case 144:
               var10000 = 83;
               break;
            case 145:
               var10000 = 110;
               break;
            case 146:
               var10000 = 215;
               break;
            case 147:
               var10000 = 10;
               break;
            case 148:
               var10000 = 107;
               break;
            case 149:
               var10000 = 71;
               break;
            case 150:
               var10000 = 42;
               break;
            case 151:
               var10000 = 136;
               break;
            case 152:
               var10000 = 118;
               break;
            case 153:
               var10000 = 195;
               break;
            case 154:
               var10000 = 170;
               break;
            case 155:
               var10000 = 74;
               break;
            case 156:
               var10000 = 145;
               break;
            case 157:
               var10000 = 88;
               break;
            case 158:
               var10000 = 240;
               break;
            case 159:
               var10000 = 247;
               break;
            case 160:
               var10000 = 116;
               break;
            case 161:
               var10000 = 102;
               break;
            case 162:
               var10000 = 227;
               break;
            case 163:
               var10000 = 105;
               break;
            case 164:
               var10000 = 53;
               break;
            case 165:
               var10000 = 233;
               break;
            case 166:
               var10000 = 162;
               break;
            case 167:
               var10000 = 254;
               break;
            case 168:
               var10000 = 58;
               break;
            case 169:
               var10000 = 241;
               break;
            case 170:
               var10000 = 80;
               break;
            case 171:
               var10000 = 50;
               break;
            case 172:
               var10000 = 64;
               break;
            case 173:
               var10000 = 171;
               break;
            case 174:
               var10000 = 161;
               break;
            case 175:
               var10000 = 60;
               break;
            case 176:
               var10000 = 242;
               break;
            case 177:
               var10000 = 99;
               break;
            case 178:
               var10000 = 67;
               break;
            case 179:
               var10000 = 213;
               break;
            case 180:
               var10000 = 157;
               break;
            case 181:
               var10000 = 24;
               break;
            case 182:
               var10000 = 221;
               break;
            case 183:
               var10000 = 78;
               break;
            case 184:
               var10000 = 47;
               break;
            case 185:
               var10000 = 151;
               break;
            case 186:
               var10000 = 3;
               break;
            case 187:
               var10000 = 166;
               break;
            case 188:
               var10000 = 89;
               break;
            case 189:
               var10000 = 133;
               break;
            case 190:
               var10000 = 16;
               break;
            case 191:
               var10000 = 246;
               break;
            case 192:
               var10000 = 193;
               break;
            case 193:
               var10000 = 236;
               break;
            case 194:
               var10000 = 150;
               break;
            case 195:
               var10000 = 33;
               break;
            case 196:
               var10000 = 45;
               break;
            case 197:
               var10000 = 210;
               break;
            case 198:
               var10000 = 255;
               break;
            case 199:
               var10000 = 4;
               break;
            case 200:
               var10000 = 12;
               break;
            case 201:
               var10000 = 139;
               break;
            case 202:
               var10000 = 131;
               break;
            case 203:
               var10000 = 149;
               break;
            case 204:
               var10000 = 54;
               break;
            case 205:
               var10000 = 30;
               break;
            case 206:
               var10000 = 199;
               break;
            case 207:
               var10000 = 46;
               break;
            case 208:
               var10000 = 201;
               break;
            case 209:
               var10000 = 189;
               break;
            case 210:
               var10000 = 156;
               break;
            case 211:
               var10000 = 121;
               break;
            case 212:
               var10000 = 82;
               break;
            case 213:
               var10000 = 52;
               break;
            case 214:
               var10000 = 245;
               break;
            case 215:
               var10000 = 174;
               break;
            case 216:
               var10000 = 216;
               break;
            case 217:
               var10000 = 186;
               break;
            case 218:
               var10000 = 113;
               break;
            case 219:
               var10000 = 225;
               break;
            case 220:
               var10000 = 17;
               break;
            case 221:
               var10000 = 173;
               break;
            case 222:
               var10000 = 49;
               break;
            case 223:
               var10000 = 178;
               break;
            case 224:
               var10000 = 184;
               break;
            case 225:
               var10000 = 114;
               break;
            case 226:
               var10000 = 106;
               break;
            case 227:
               var10000 = 0;
               break;
            case 228:
               var10000 = 31;
               break;
            case 229:
               var10000 = 29;
               break;
            case 230:
               var10000 = 167;
               break;
            case 231:
               var10000 = 26;
               break;
            case 232:
               var10000 = 32;
               break;
            case 233:
               var10000 = 97;
               break;
            case 234:
               var10000 = 134;
               break;
            case 235:
               var10000 = 14;
               break;
            case 236:
               var10000 = 217;
               break;
            case 237:
               var10000 = 243;
               break;
            case 238:
               var10000 = 86;
               break;
            case 239:
               var10000 = 238;
               break;
            case 240:
               var10000 = 15;
               break;
            case 241:
               var10000 = 37;
               break;
            case 242:
               var10000 = 104;
               break;
            case 243:
               var10000 = 205;
               break;
            case 244:
               var10000 = 61;
               break;
            case 245:
               var10000 = 13;
               break;
            case 246:
               var10000 = 84;
               break;
            case 247:
               var10000 = 239;
               break;
            case 248:
               var10000 = 229;
               break;
            case 249:
               var10000 = 163;
               break;
            case 250:
               var10000 = 165;
               break;
            case 251:
               var10000 = 18;
               break;
            case 252:
               var10000 = 69;
               break;
            case 253:
               var10000 = 48;
               break;
            case 254:
               var10000 = 87;
               break;
            default:
               var10000 = 218;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4163;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





