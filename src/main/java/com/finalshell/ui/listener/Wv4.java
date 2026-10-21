package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.GA;
import com.finalshell.core.O__2;
import com.finalshell.core.WP_2;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.Oj2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.PlainDocument;
import javax.swing.text.Segment;
import javax.swing.text.Utilities;
import javax.swing.text.View;

public class Wv4 extends BasicLabelUI implements ComponentListener {
   public static Rectangle o;
   public static Rectangle E;
   public static Rectangle J;
   public static Insets X;
   public static int i;
   public FontMetrics d;
   public boolean V = O__2.U;
   public Color k = O__2.v;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] e;

   public static ComponentUI createUI(JComponent var0) {
      return new Wv4();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      FN.Y(var1);
   }

   @Override
   public void uninstallDefaults(JLabel var1) {
      super.uninstallDefaults(var1);
      this.f(var1);
   }

   @Override
   public void installListeners(JLabel var1) {
      super.installListeners(var1);
      var1.addComponentListener(this);
   }

   @Override
   public void uninstallListeners(JLabel var1) {
      super.uninstallListeners(var1);
      var1.removeComponentListener(this);
   }

   public boolean Z() {
      return this.V;
   }

   public void B(boolean var1) {
      this.V = var1;
   }

   public Color F() {
      return this.k;
   }

   public void l(Color var1) {
      this.k = var1;
   }

   public void f(JLabel var1) {
      var1.putClientProperty(a(-6671, 27918), null);
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      label16: {
         boolean var10000 = Oj2.V();
         super.propertyChange(var1);
         boolean var2 = var10000;
         String var3 = var1.getPropertyName();
         var10000 = var3.equals(a(-6667, -25414));
         if (!var2) {
            if (var10000) {
               break label16;
            }

            var10000 = a(-6668, -26008).equals(var3);
         }

         if (!var10000) {
            return;
         }
      }

      this.f((JLabel)var1.getSource());
   }

   public void e(JLabel var1, FontMetrics var2, int var3, int var4) {
      boolean var5 = Oj2.V();
      if (!var5) {
         if (var2 == null) {
            var2 = var1.getFontMetrics(var1.getFont());
         }

         this.d = var2;
      }

      String var6 = var1.getText();
      Icon var7 = var1.getIcon();
      Insets var8 = var1.getInsets(X);
      J.x = var8.left;
      J.y = var8.top;
      J.width = var3 - (var8.left + var8.right);
      J.height = var4 - (var8.top + var8.bottom);
      o.x = o.y = o.width = o.height = 0;
      E.x = E.y = E.width = E.height = 0;
      this.layoutCL(var1, var2, var6, var7, J, o, E);
      if (Ky4.F$arrString() != null) {
         Oj2.T(!var5);
      }
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      boolean var3;
      Map var4;
      JLabel var5;
      String var6;
      Icon var11;
      label52: {
         boolean var10000 = Oj2.g();
         var4 = FN.B(var1);
         var3 = var10000;
         var5 = (JLabel)var2;
         var6 = var5.getText();
         JLabel var10 = var5;
         if (var3) {
            if (var5.isEnabled()) {
               var11 = var5.getIcon();
               break label52;
            }

            var10 = var5;
         }

         var11 = var10.getDisabledIcon();
      }

      Icon var7 = var11;
      if (var7 != null || var6 != null) {
         FontMetrics var8;
         label45: {
            var8 = var1.getFontMetrics();
            this.e(var5, var8, var2.getWidth(), var2.getHeight());
            var11 = var7;
            if (var3) {
               if (var7 == null) {
                  break label45;
               }

               var11 = var7;
            }

            var11.paintIcon(var2, var1, o.x, o.y);
         }

         label55: {
            var11 = var6;
            if (var3) {
               if (var6 == null) {
                  break label55;
               }

               var11 = (Icon)var2.getClientProperty(a(-6665, -28866));
            }

            label33: {
               View var9 = (View)var11;
               View var14 = var9;
               if (var3) {
                  if (var9 == null) {
                     break label33;
                  }

                  var14 = var9;
               }

               var14.paint(var1, E);
               if (var3) {
                  break label55;
               }
            }

            this.b(var1, var5, var8);
         }

         FN.O(var1, var4);
      }
   }

   public void b(Graphics var1, JLabel var2, FontMetrics var3) {
      int var10000 = (Oj2.g()) ? 1 : 0;
      List var5 = this.a(var2);
      boolean var4 = (var10000) != 0;
      int var6 = this.D(var2);
      int var7 = var5.size() * var3.getHeight();

      while (true) {
         if (var7 > var6) {
            var7 -= var3.getHeight();
            if (!var4) {
               break;
            }

            if (var4) {
               continue;
            }
         }

         E.height = Math.min(var7, var6);
         E.y = this.G(var2, var3, E);
         break;
      }

      int var8 = E.x;
      int var9 = E.y;
      Iterator var10 = var5.iterator();

      while (var10.hasNext()) {
         Object var13 = E;
         if (var4) {
            if (!E.contains(var8, var9 + d(var3))) {
               break;
            }

            var13 = var10.next();
         }

         String var11;
         var11 = ((String)var13).trim();
         var10000 = (var10.hasNext()) ? 1 : 0;
         label49:
         if (var4) {
            if (var10000 != 0) {
               var10000 = (E.contains(var8, var9 + var3.getHeight() + d(var3))) ? 1 : 0;
               if (!var4) {
                  break label49;
               }

               if (var10000 == 0) {
                  var11 = this.F(var11);
               }
            }

            var10000 = this.e(var2, var3, var11);
         }

         label42: {
            int var12;
            label41: {
               var12 = var10000;
               if (var4) {
                  if (!var2.isEnabled()) {
                     break label41;
                  }

                  this.paintEnabledText(var2, var1, var11, var12, var9);
               }

               if (var4) {
                  break label42;
               }
            }

            this.paintDisabledText(var2, var1, var11, var12, var9);
         }

         var9 += var3.getHeight();
         if (!var4) {
            break;
         }
      }
   }

   @Override
   public void paintEnabledText(JLabel var1, Graphics var2, String var3, int var4, int var5) {
      boolean var6 = Oj2.V();
      int var10000 = (this.V) ? 1 : 0;
      if (!var6) {
         if (this.V) {
            var2.setColor(var1.getForeground());
            this.z(var2, var3, var4, var5);
            if (!var6) {
               return;
            }
         }

         var10000 = var1.getDisplayedMnemonicIndex();
      }

      int var7 = var10000;
      var2.setColor(var1.getForeground());
      FN.W(var2, var3, var7, var4, var5);
   }

   @Override
   public void paintDisabledText(JLabel var1, Graphics var2, String var3, int var4, int var5) {
      boolean var6 = Oj2.g();
      int var10000 = (this.V) ? 1 : 0;
      if (var6) {
         if (this.V) {
            var2.setColor(var1.getBackground().darker());
            this.z(var2, var3, var4, var5);
            if (var6) {
               return;
            }
         }

         var10000 = var1.getDisplayedMnemonicIndex();
      }

      int var7 = var10000;
      var2.setColor(var1.getForeground());
      FN.W(var2, var3, var7, var4, var5);
   }

   public void z(Graphics var1, String var2, int var3, int var4) {
      var1.translate(var3, var4);
      GA.v((Graphics2D)var1, var2, this.k);
      var1.translate(-var3, -var4);
   }

   public int D(JLabel var1) {
      var1.getInsets(X);
      return var1.getHeight() - X.top - X.bottom;
   }

   public String F(String var1) {
      boolean var2 = Oj2.V();
      String var10000 = var1;
      if (!var2) {
         if (var1.length() < 3) {
            return a(-6672, -5641);
         }

         var10000 = var1.substring(0, var1.length() - 3) + a(-6666, -19479);
      }

      return var10000;
   }

   public int G(JLabel var1, FontMetrics var2, Rectangle var3) {
      int var10000 = (Oj2.g()) ? 1 : 0;
      int var5 = this.D(var1);
      int var6 = var3.height;
      boolean var4 = (var10000) != 0;
      int var7 = var1.getVerticalAlignment();
      var10000 = var7;
      if (var4) {
         switch (var7) {
            case 1:
               return d(var2) + X.top;
            case 3:
               return d(var2) + var5 - X.top + X.bottom - var6;
            default:
               var10000 = X.top + (var5 - var6) / 2 + d(var2);
         }
      }

      int var8 = var10000;
      return Math.max(var8, d(var2) + X.top);
   }

   public static int d(FontMetrics var0) {
      return var0.getAscent() + var0.getLeading();
   }

   public int e(JLabel var1, FontMetrics var2, String var3) {
      boolean var4;
      int var8;
      label67: {
         int var10000 = (Oj2.V()) ? 1 : 0;
         byte var5 = (byte)((var1.getComponentOrientation().isLeftToRight()) ? 1 : 0);
         var4 = (var10000) != 0;
         int var6 = var1.getHorizontalAlignment();
         var10000 = var6;
         int var10001 = 4;
         if (!var4) {
            label48:
            if (var6 != 4) {
               var8 = var6;
               var10001 = a(8025, 6594664785071933849L);
               if (!var4) {
                  if (var6 == var10001) {
                     if (var4) {
                        return var5;
                     }

                     if (var5 != 0) {
                        break label48;
                     }
                  }

                  var8 = var6;
                  if (var4) {
                     break label67;
                  }

                  var10001 = a(2913, 80014396581092768L);
               }

               if (var8 == var10001) {
                  var8 = var5;
                  if (var4) {
                     break label67;
                  }

                  if (var5 == 0) {
                     break label48;
                  }
               }

               var8 = var6;
               break label67;
            }

            var10000 = J.width;
            var10001 = var2.stringWidth(var3);
         }

         return var10000 - var10001;
      }

      if (!var4) {
         if (var8 == 0) {
            return J.width / 2 - var2.stringWidth(var3) / 2;
         }

         var8 = J.x;
      }

      return var8;
   }

   public static boolean P(String var0) {
      boolean var1 = Oj2.g();
      String var10000 = var0;
      if (var1) {
         if (var0 == null) {
            return 0 != 0;
         }

         var10000 = var0;
      }

      int var3 = var10000.length();
      if (!var1) {
         return var3 != 0;
      } else {
         if (var3 >= a(27710, 2919881871166012155L)) {
            char var4 = var0.charAt(0);
            if (!var1) {
               return var4 != 0;
            }

            if (var4 == a(29046, 2144811263449458613L)) {
               char var5 = var0.charAt(5);
               if (!var1) {
                  return var5 != 0;
               }

               if (var5 == a(30262, 2927974294376145138L)) {
                  String var2 = var0.substring(1, 5);
                  return var2.equalsIgnoreCase(a(-6658, -27949));
               }
            }
         }

         return 0 != 0;
      }
   }

   @Override
   public Dimension getPreferredSize(JComponent var1) {
      boolean var10000 = Oj2.g();
      Dimension var3 = super.getPreferredSize(var1);
      boolean var2 = var10000;
      JLabel var4 = (JLabel)var1;
      Object var7 = var4;
      if (var2) {
         if (P(var4.getText())) {
            return var3;
         }

         var7 = var1.getParent();
      }

      label32: {
         if (var2) {
            if (var7 == null) {
               break label32;
            }

            var7 = var1.getParent();
         }

         Insets var5 = var7.getInsets();
         Dimension var6 = var1.getParent().getSize();
         if (!var2) {
            return var6;
         }

         if (var6.width > 0) {
            var3.width = var6.width - var5.left - var5.right;
         }
      }

      this.e(var4, null, var3.width, var3.height);
      var3.height = Math.max(var3.height, this.E(var4));
      return var3;
   }

   public int E(JLabel var1) {
      int var2 = this.a(var1).size();
      Insets var3 = var1.getInsets(X);
      return var2 * this.d.getHeight() + var3.top + var3.bottom;
   }

   public List a(JLabel var1) {
      boolean var10000 = Oj2.g();
      List var3 = (List)var1.getClientProperty(a(-6659, 6127));
      boolean var2 = var10000;
      List var4 = var3;
      if (var2) {
         if (var3 == null) {
            var3 = this.v(var1);
            var1.putClientProperty(a(-6659, 6127), var3);
         }

         var4 = var3;
      }

      return var4;
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.f((JLabel)var1.getSource());
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   public List v(JLabel var1) {
      boolean var10000 = Oj2.V();
      ArrayList var3 = new ArrayList(i);
      boolean var2 = var10000;
      String var4 = var1.getText();

      try {
         if (var4 == null) {
            return null;
         }
      } catch (BadLocationException var10) {
         throw a(var10);
      }

      PlainDocument var5 = new PlainDocument();

      try {
         var5.insertString(0, var4, null);
      } catch (BadLocationException var9) {
         return null;
      }

      Element var6 = var5.getDefaultRootElement();
      int var7 = 0;
      int var8 = var6.getElementCount();

      while (var7 < var8) {
         this.S(var3, var6.getElement(var7));
         var7++;
         if (var2) {
            break;
         }
      }

      return var3;
   }

   public void S(List param1, Element param2) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/panel/Oj2.V ()Z
      // 03: aload 2
      // 04: invokeinterface javax/swing/text/Element.getEndOffset ()I 1
      // 09: istore 4
      // 0b: aload 2
      // 0c: invokeinterface javax/swing/text/Element.getDocument ()Ljavax/swing/text/Document; 1
      // 11: astore 5
      // 13: istore 3
      // 14: aload 2
      // 15: invokeinterface javax/swing/text/Element.getStartOffset ()I 1
      // 1a: istore 6
      // 1c: iload 6
      // 1e: iload 4
      // 20: if_icmpge a3
      // 23: aload 0
      // 24: aload 5
      // 26: iload 6
      // 28: iload 4
      // 2a: invokevirtual com/finalshell/ui/listener/Wv4.z (Ljavax/swing/text/Document;II)I
      // 2d: istore 7
      // 2f: aload 1
      // 30: aload 5
      // 32: iload 6
      // 34: iload 7
      // 36: iload 6
      // 38: isub
      // 39: invokeinterface javax/swing/text/Document.getText (II)Ljava/lang/String; 3
      // 3e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 43: pop
      // 44: goto 7d
      // 47: astore 8
      // 49: new java/lang/Error
      // 4c: dup
      // 4d: new java/lang/StringBuilder
      // 50: dup
      // 51: invokespecial java/lang/StringBuilder.<init> ()V
      // 54: sipush -6657
      // 57: sipush 20128
      // 5a: invokestatic com/finalshell/ui/listener/Wv4.a (II)Ljava/lang/String;
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60: iload 6
      // 62: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 65: sipush -6669
      // 68: sipush 7061
      // 6b: invokestatic com/finalshell/ui/listener/Wv4.a (II)Ljava/lang/String;
      // 6e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71: iload 7
      // 73: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 76: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 7c: athrow
      // 7d: iload 7
      // 7f: iload 3
      // 80: ifne 98
      // 83: iload 6
      // 85: if_icmpne 9b
      // 88: goto 8f
      // 8b: invokestatic com/finalshell/ui/listener/Wv4.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 8e: athrow
      // 8f: iload 4
      // 91: goto 98
      // 94: invokestatic com/finalshell/ui/listener/Wv4.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 97: athrow
      // 98: goto 9d
      // 9b: iload 7
      // 9d: istore 6
      // 9f: iload 3
      // a0: ifeq 1c
      // a3: return
   }

   public int z(Document var1, int var2, int var3) {
      Segment var4 = WP_2.x();

      try {
         var1.getText(var2, var3 - var2, var4);
      } catch (BadLocationException var7) {
         throw new Error(a(-6670, 28258));
      }

      int var5 = E.width;
      int var6 = var2 + Utilities.getBreakLocation(var4, this.d, 0, var5, null, var2);
      WP_2.D(var4);
      return var6;
   }

   static {
      __vfClinit__();
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -6665) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 225;
               break;
            case 1:
               var10000 = 146;
               break;
            case 2:
               var10000 = 83;
               break;
            case 3:
               var10000 = 226;
               break;
            case 4:
               var10000 = 8;
               break;
            case 5:
               var10000 = 238;
               break;
            case 6:
               var10000 = 101;
               break;
            case 7:
               var10000 = 117;
               break;
            case 8:
               var10000 = 247;
               break;
            case 9:
               var10000 = 88;
               break;
            case 10:
               var10000 = 158;
               break;
            case 11:
               var10000 = 69;
               break;
            case 12:
               var10000 = 191;
               break;
            case 13:
               var10000 = 218;
               break;
            case 14:
               var10000 = 200;
               break;
            case 15:
               var10000 = 78;
               break;
            case 16:
               var10000 = 167;
               break;
            case 17:
               var10000 = 209;
               break;
            case 18:
               var10000 = 154;
               break;
            case 19:
               var10000 = 242;
               break;
            case 20:
               var10000 = 10;
               break;
            case 21:
               var10000 = 185;
               break;
            case 22:
               var10000 = 70;
               break;
            case 23:
               var10000 = 31;
               break;
            case 24:
               var10000 = 233;
               break;
            case 25:
               var10000 = 5;
               break;
            case 26:
               var10000 = 82;
               break;
            case 27:
               var10000 = 98;
               break;
            case 28:
               var10000 = 120;
               break;
            case 29:
               var10000 = 230;
               break;
            case 30:
               var10000 = 151;
               break;
            case 31:
               var10000 = 159;
               break;
            case 32:
               var10000 = 59;
               break;
            case 33:
               var10000 = 116;
               break;
            case 34:
               var10000 = 254;
               break;
            case 35:
               var10000 = 241;
               break;
            case 36:
               var10000 = 244;
               break;
            case 37:
               var10000 = 135;
               break;
            case 38:
               var10000 = 229;
               break;
            case 39:
               var10000 = 168;
               break;
            case 40:
               var10000 = 104;
               break;
            case 41:
               var10000 = 77;
               break;
            case 42:
               var10000 = 207;
               break;
            case 43:
               var10000 = 47;
               break;
            case 44:
               var10000 = 195;
               break;
            case 45:
               var10000 = 64;
               break;
            case 46:
               var10000 = 166;
               break;
            case 47:
               var10000 = 107;
               break;
            case 48:
               var10000 = 234;
               break;
            case 49:
               var10000 = 27;
               break;
            case 50:
               var10000 = 114;
               break;
            case 51:
               var10000 = 76;
               break;
            case 52:
               var10000 = 220;
               break;
            case 53:
               var10000 = 6;
               break;
            case 54:
               var10000 = 176;
               break;
            case 55:
               var10000 = 152;
               break;
            case 56:
               var10000 = 253;
               break;
            case 57:
               var10000 = 192;
               break;
            case 58:
               var10000 = 173;
               break;
            case 59:
               var10000 = 213;
               break;
            case 60:
               var10000 = 156;
               break;
            case 61:
               var10000 = 162;
               break;
            case 62:
               var10000 = 29;
               break;
            case 63:
               var10000 = 15;
               break;
            case 64:
               var10000 = 126;
               break;
            case 65:
               var10000 = 21;
               break;
            case 66:
               var10000 = 174;
               break;
            case 67:
               var10000 = 148;
               break;
            case 68:
               var10000 = 7;
               break;
            case 69:
               var10000 = 153;
               break;
            case 70:
               var10000 = 93;
               break;
            case 71:
               var10000 = 14;
               break;
            case 72:
               var10000 = 45;
               break;
            case 73:
               var10000 = 127;
               break;
            case 74:
               var10000 = 199;
               break;
            case 75:
               var10000 = 186;
               break;
            case 76:
               var10000 = 211;
               break;
            case 77:
               var10000 = 42;
               break;
            case 78:
               var10000 = 193;
               break;
            case 79:
               var10000 = 60;
               break;
            case 80:
               var10000 = 255;
               break;
            case 81:
               var10000 = 224;
               break;
            case 82:
               var10000 = 73;
               break;
            case 83:
               var10000 = 133;
               break;
            case 84:
               var10000 = 129;
               break;
            case 85:
               var10000 = 179;
               break;
            case 86:
               var10000 = 249;
               break;
            case 87:
               var10000 = 54;
               break;
            case 88:
               var10000 = 189;
               break;
            case 89:
               var10000 = 63;
               break;
            case 90:
               var10000 = 43;
               break;
            case 91:
               var10000 = 67;
               break;
            case 92:
               var10000 = 119;
               break;
            case 93:
               var10000 = 175;
               break;
            case 94:
               var10000 = 140;
               break;
            case 95:
               var10000 = 246;
               break;
            case 96:
               var10000 = 205;
               break;
            case 97:
               var10000 = 177;
               break;
            case 98:
               var10000 = 222;
               break;
            case 99:
               var10000 = 52;
               break;
            case 100:
               var10000 = 223;
               break;
            case 101:
               var10000 = 215;
               break;
            case 102:
               var10000 = 136;
               break;
            case 103:
               var10000 = 37;
               break;
            case 104:
               var10000 = 188;
               break;
            case 105:
               var10000 = 11;
               break;
            case 106:
               var10000 = 61;
               break;
            case 107:
               var10000 = 172;
               break;
            case 108:
               var10000 = 171;
               break;
            case 109:
               var10000 = 170;
               break;
            case 110:
               var10000 = 51;
               break;
            case 111:
               var10000 = 228;
               break;
            case 112:
               var10000 = 194;
               break;
            case 113:
               var10000 = 30;
               break;
            case 114:
               var10000 = 155;
               break;
            case 115:
               var10000 = 62;
               break;
            case 116:
               var10000 = 102;
               break;
            case 117:
               var10000 = 132;
               break;
            case 118:
               var10000 = 125;
               break;
            case 119:
               var10000 = 245;
               break;
            case 120:
               var10000 = 46;
               break;
            case 121:
               var10000 = 97;
               break;
            case 122:
               var10000 = 72;
               break;
            case 123:
               var10000 = 217;
               break;
            case 124:
               var10000 = 181;
               break;
            case 125:
               var10000 = 75;
               break;
            case 126:
               var10000 = 36;
               break;
            case 127:
               var10000 = 57;
               break;
            case 128:
               var10000 = 231;
               break;
            case 129:
               var10000 = 32;
               break;
            case 130:
               var10000 = 87;
               break;
            case 131:
               var10000 = 210;
               break;
            case 132:
               var10000 = 28;
               break;
            case 133:
               var10000 = 202;
               break;
            case 134:
               var10000 = 128;
               break;
            case 135:
               var10000 = 147;
               break;
            case 136:
               var10000 = 203;
               break;
            case 137:
               var10000 = 187;
               break;
            case 138:
               var10000 = 80;
               break;
            case 139:
               var10000 = 95;
               break;
            case 140:
               var10000 = 84;
               break;
            case 141:
               var10000 = 113;
               break;
            case 142:
               var10000 = 58;
               break;
            case 143:
               var10000 = 123;
               break;
            case 144:
               var10000 = 53;
               break;
            case 145:
               var10000 = 68;
               break;
            case 146:
               var10000 = 106;
               break;
            case 147:
               var10000 = 109;
               break;
            case 148:
               var10000 = 142;
               break;
            case 149:
               var10000 = 86;
               break;
            case 150:
               var10000 = 112;
               break;
            case 151:
               var10000 = 165;
               break;
            case 152:
               var10000 = 17;
               break;
            case 153:
               var10000 = 235;
               break;
            case 154:
               var10000 = 79;
               break;
            case 155:
               var10000 = 150;
               break;
            case 156:
               var10000 = 232;
               break;
            case 157:
               var10000 = 149;
               break;
            case 158:
               var10000 = 50;
               break;
            case 159:
               var10000 = 103;
               break;
            case 160:
               var10000 = 161;
               break;
            case 161:
               var10000 = 221;
               break;
            case 162:
               var10000 = 204;
               break;
            case 163:
               var10000 = 157;
               break;
            case 164:
               var10000 = 16;
               break;
            case 165:
               var10000 = 248;
               break;
            case 166:
               var10000 = 94;
               break;
            case 167:
               var10000 = 216;
               break;
            case 168:
               var10000 = 198;
               break;
            case 169:
               var10000 = 145;
               break;
            case 170:
               var10000 = 180;
               break;
            case 171:
               var10000 = 201;
               break;
            case 172:
               var10000 = 65;
               break;
            case 173:
               var10000 = 20;
               break;
            case 174:
               var10000 = 25;
               break;
            case 175:
               var10000 = 137;
               break;
            case 176:
               var10000 = 90;
               break;
            case 177:
               var10000 = 0;
               break;
            case 178:
               var10000 = 1;
               break;
            case 179:
               var10000 = 243;
               break;
            case 180:
               var10000 = 39;
               break;
            case 181:
               var10000 = 26;
               break;
            case 182:
               var10000 = 48;
               break;
            case 183:
               var10000 = 143;
               break;
            case 184:
               var10000 = 23;
               break;
            case 185:
               var10000 = 41;
               break;
            case 186:
               var10000 = 183;
               break;
            case 187:
               var10000 = 250;
               break;
            case 188:
               var10000 = 212;
               break;
            case 189:
               var10000 = 40;
               break;
            case 190:
               var10000 = 163;
               break;
            case 191:
               var10000 = 71;
               break;
            case 192:
               var10000 = 214;
               break;
            case 193:
               var10000 = 237;
               break;
            case 194:
               var10000 = 38;
               break;
            case 195:
               var10000 = 85;
               break;
            case 196:
               var10000 = 35;
               break;
            case 197:
               var10000 = 178;
               break;
            case 198:
               var10000 = 138;
               break;
            case 199:
               var10000 = 12;
               break;
            case 200:
               var10000 = 89;
               break;
            case 201:
               var10000 = 2;
               break;
            case 202:
               var10000 = 236;
               break;
            case 203:
               var10000 = 131;
               break;
            case 204:
               var10000 = 252;
               break;
            case 205:
               var10000 = 24;
               break;
            case 206:
               var10000 = 9;
               break;
            case 207:
               var10000 = 124;
               break;
            case 208:
               var10000 = 219;
               break;
            case 209:
               var10000 = 141;
               break;
            case 210:
               var10000 = 105;
               break;
            case 211:
               var10000 = 121;
               break;
            case 212:
               var10000 = 111;
               break;
            case 213:
               var10000 = 33;
               break;
            case 214:
               var10000 = 251;
               break;
            case 215:
               var10000 = 22;
               break;
            case 216:
               var10000 = 34;
               break;
            case 217:
               var10000 = 139;
               break;
            case 218:
               var10000 = 122;
               break;
            case 219:
               var10000 = 74;
               break;
            case 220:
               var10000 = 13;
               break;
            case 221:
               var10000 = 4;
               break;
            case 222:
               var10000 = 130;
               break;
            case 223:
               var10000 = 206;
               break;
            case 224:
               var10000 = 96;
               break;
            case 225:
               var10000 = 144;
               break;
            case 226:
               var10000 = 208;
               break;
            case 227:
               var10000 = 99;
               break;
            case 228:
               var10000 = 169;
               break;
            case 229:
               var10000 = 3;
               break;
            case 230:
               var10000 = 190;
               break;
            case 231:
               var10000 = 66;
               break;
            case 232:
               var10000 = 44;
               break;
            case 233:
               var10000 = 55;
               break;
            case 234:
               var10000 = 108;
               break;
            case 235:
               var10000 = 92;
               break;
            case 236:
               var10000 = 19;
               break;
            case 237:
               var10000 = 49;
               break;
            case 238:
               var10000 = 100;
               break;
            case 239:
               var10000 = 182;
               break;
            case 240:
               var10000 = 227;
               break;
            case 241:
               var10000 = 196;
               break;
            case 242:
               var10000 = 18;
               break;
            case 243:
               var10000 = 239;
               break;
            case 244:
               var10000 = 118;
               break;
            case 245:
               var10000 = 240;
               break;
            case 246:
               var10000 = 134;
               break;
            case 247:
               var10000 = 115;
               break;
            case 248:
               var10000 = 81;
               break;
            case 249:
               var10000 = 110;
               break;
            case 250:
               var10000 = 160;
               break;
            case 251:
               var10000 = 91;
               break;
            case 252:
               var10000 = 56;
               break;
            case 253:
               var10000 = 164;
               break;
            case 254:
               var10000 = 184;
               break;
            default:
               var10000 = 197;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5824;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      String[] var13 = new String[11];
      int var11 = 0;
      String var10 = "m.B[\u0003p2,\u0004\u009fì\u0096(\u0004\u0013ÄAf\u0003\u0097q\f\u0013ÃùÚ]Þ\u008bñTo\u0084s\u008f\"g£ÿÒuµ\u000b\u0081\u000b\u000b%\u000e|lv®\u008f`\u0003^@é\u0018\u0092êð?\u009bÇYÝzµÑ©v£)g\u0083f\u009fV\u009e5i\u0002";
      int var12 = "m.B[\u0003p2,\u0004\u009fì\u0096(\u0004\u0013ÄAf\u0003\u0097q\f\u0013ÃùÚ]Þ\u008bñTo\u0084s\u008f\"g£ÿÒuµ\u000b\u0081\u000b\u000b%\u000e|lv®\u008f`\u0003^@é\u0018\u0092êð?\u009bÇYÝzµÑ©v£)g\u0083f\u009fV\u009e5i\u0002"
         .length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 14;
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
                        var65 = 34;
                        break;
                     case 1:
                        var65 = 46;
                        break;
                     case 2:
                        var65 = 108;
                        break;
                     case 3:
                        var65 = 2;
                        break;
                     case 4:
                        var65 = 16;
                        break;
                     case 5:
                        var65 = 76;
                        break;
                     default:
                        var65 = 122;
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
                     b = new String[11];
                     long var0 = 6726019194712551635L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "ô9,1Ã±yAxkè£ níyyü÷>>\u0087µºÿ\u009aÊR©e\u0097Z";
                     int var5 = "ô9,1Ã±yAxkè£ níyyü÷>>\u0087µºÿ\u009aÊR©e\u0097Z".length();
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
                                    c = var6;
                                    e = new Integer[6];
                                    o = new Rectangle();
                                    E = new Rectangle();
                                    J = new Rectangle();
                                    X = new Insets(0, 0, 0, 0);
                                    i = a(21423, 4057009024230180205L);
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "](\u009bñÚ\u008f\u0010\u001f!\u0080m\u0005!¿\n.";
                                 var5 = "](\u009bñÚ\u008f\u0010\u001f!\u0080m\u0005!¿\n.".length();
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

                  var10 = "8k¸£\u000bº»<c¸äê5.· ";
                  var12 = "8k¸£\u000bº»<c¸äê5.· ".length();
                  var9 = 4;
                  var17 = -1;
            }

            var10000 = 28;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





