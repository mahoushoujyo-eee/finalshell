package com.finalshell.ui.panel;

import com.finalshell.core.Jy2;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

public class CutPanel extends JPopupMenu implements MouseListener, ActionListener {
   public static long serialVersionUID;
   public static CutPanel V;
   public JMenuItem o;
   public JMenuItem U;
   public JMenuItem K;
   public JMenuItem b;
   public JMenuItem P;
   public static String[] a;
   public static String[] c;
   public static long[] d;
   public static Integer[] e;

   public static void T(JTextComponent var0) {
      JTextComponent var2;
      label24: {
         int var1 = Jy2.G();
         boolean var10000 = var0 instanceof JTextField;
         if (var1 != 0) {
            if (!var10000) {
               return;
            }

            var2 = var0;
            if (var1 == 0) {
               break label24;
            }

            var10000 = var0 instanceof JPasswordField;
         }

         if (var10000) {
            return;
         }

         var2 = var0;
      }

      var2.addMouseListener(j());
   }

   public static void X(JTextComponent var0) {
      JTextComponent var2;
      label24: {
         int var1 = Jy2.G();
         boolean var10000 = var0 instanceof JTextField;
         if (var1 != 0) {
            if (!var10000) {
               return;
            }

            var2 = var0;
            if (var1 == 0) {
               break label24;
            }

            var10000 = var0 instanceof JPasswordField;
         }

         if (var10000) {
            return;
         }

         var2 = var0;
      }

      var2.removeMouseListener(j());
   }

   public CutPanel() {
      this.add(this.o = new JMenuItem(a(-3995, -22168)));
      this.add(this.U = new JMenuItem(a(-3998, -25151)));
      this.add(this.K = new JMenuItem(a(-4000, 25320)));
      this.add(this.b = new JMenuItem(a(-3999, 27960)));
      this.addSeparator();
      this.add(this.P = new JMenuItem(a(-3996, 24340)));
      this.o.setMnemonic((char)a(15773, 2118457290168183857L));
      this.U.setMnemonic((char)a(17720, 7221675473609544854L));
      int var10000 = Jy2.G();
      this.K.setMnemonic((char)a(18983, 7383434219860614026L));
      int var1 = var10000;
      this.b.setMnemonic((char)a(24044, 2639102508753439815L));
      this.P.setMnemonic((char)a(4296, 7348651717493227879L));
      this.o.addActionListener(this);
      this.U.addActionListener(this);
      this.K.addActionListener(this);
      this.b.addActionListener(this);
      this.P.addActionListener(this);
      if (var1 == 0) {
         Ky4.K(new String[1]);
      }
   }

   public static CutPanel j() {
      int var0 = Jy2.C();
      CutPanel var10000 = V;
      if (var0 == 0) {
         if (V == null) {
            V = new CutPanel();
         }

         var10000 = V;
      }

      return var10000;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var2;
      Object var4;
      label33: {
         var2 = Jy2.G();
         boolean var10000 = var1.isPopupTrigger();
         if (var2 != 0) {
            if (!var10000) {
               return;
            }

            var4 = var1.getSource();
            if (var2 == 0) {
               break label33;
            }

            var10000 = var4 instanceof JTextField;
         }

         if (!var10000) {
            return;
         }

         var4 = var1.getSource();
      }

      JTextField var3 = (JTextField)var4;
      boolean var5 = Boolean.TRUE.equals(var3.getClientProperty(a(-3997, 11342)));
      if (var2 != 0) {
         if (var5) {
            return;
         }

         var3.requestFocusInWindow();
      }

      this.show(var3, var1.getX(), var1.getY());
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void show(Component var1, int var2, int var3) {
      boolean var12;
      int var4;
      JTextComponent var5;
      int var11;
      label102: {
         label105: {
            var5 = (JTextComponent)var1;
            var11 = Jy2.G();
            String var6 = var5.getSelectedText();
            var4 = var11;
            String var10 = var6;
            if (var4 != 0) {
               if (var6 == null) {
                  break label105;
               }

               var10 = var6;
            }

            var11 = (var10.equals("")) ? 1 : 0;
            if (var4 == 0) {
               break label102;
            }

            if (!var11) {
               var11 = 1;
               break label102;
            }
         }

         var11 = 0;
      }

      boolean var7;
      label91: {
         label106: {
            var7 = (var11) != 0;
            var12 = var5.isEnabled();
            if (var4 != 0) {
               if (!var12) {
                  break label106;
               }

               var12 = var5.isEditable();
            }

            if (var4 == 0) {
               break label91;
            }

            if (var12) {
               var12 = true;
               break label91;
            }
         }

         var12 = false;
      }

      boolean var8;
      boolean var10001;
      label80: {
         label107: {
            var8 = var12;
            var10001 = var7;
            if (var4 != 0) {
               if (!var7) {
                  break label107;
               }

               var10001 = var8;
            }

            if (var4 == 0) {
               break label80;
            }

            if (var10001) {
               var10001 = true;
               break label80;
            }
         }

         var10001 = false;
      }

      label69: {
         label108: {
            this.o.setEnabled(var10001);
            var10001 = var7;
            if (var4 != 0) {
               if (!var7) {
                  break label108;
               }

               var10001 = var5.isEnabled();
            }

            if (var4 == 0) {
               break label69;
            }

            if (var10001) {
               var10001 = true;
               break label69;
            }
         }

         var10001 = false;
      }

      label58: {
         label109: {
            this.U.setEnabled(var10001);
            var10001 = var7;
            if (var4 != 0) {
               if (!var7) {
                  break label109;
               }

               var10001 = var8;
            }

            if (var4 == 0) {
               break label58;
            }

            if (var10001) {
               var10001 = true;
               break label58;
            }
         }

         var10001 = false;
      }

      this.b.setEnabled(var10001);
      this.K.setEnabled(var8);
      this.P.setEnabled(var5.isEnabled());
      super.show(var1, var2, var3);
      if (Ky4.F$arrString() != null) {
         Jy2.W(++var4);
      }
   }

   @Override
   public void actionPerformed(ActionEvent param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/core/Jy2.G ()I
      // 003: aload 0
      // 004: invokevirtual com/finalshell/ui/panel/CutPanel.getInvoker ()Ljava/awt/Component;
      // 007: checkcast javax/swing/text/JTextComponent
      // 00a: astore 3
      // 00b: istore 2
      // 00c: aload 3
      // 00d: invokevirtual javax/swing/text/JTextComponent.getSelectedText ()Ljava/lang/String;
      // 010: astore 4
      // 012: aload 1
      // 013: invokevirtual java/awt/event/ActionEvent.getSource ()Ljava/lang/Object;
      // 016: aload 0
      // 017: getfield com/finalshell/ui/panel/CutPanel.o Ljavax/swing/JMenuItem;
      // 01a: iload 2
      // 01b: ifeq 046
      // 01e: if_acmpne 037
      // 021: goto 028
      // 024: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 027: athrow
      // 028: aload 3
      // 029: invokevirtual javax/swing/text/JTextComponent.cut ()V
      // 02c: iload 2
      // 02d: ifne 14f
      // 030: goto 037
      // 033: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 036: athrow
      // 037: aload 1
      // 038: invokevirtual java/awt/event/ActionEvent.getSource ()Ljava/lang/Object;
      // 03b: aload 0
      // 03c: getfield com/finalshell/ui/panel/CutPanel.U Ljavax/swing/JMenuItem;
      // 03f: goto 046
      // 042: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 045: athrow
      // 046: iload 2
      // 047: ifeq 072
      // 04a: if_acmpne 063
      // 04d: goto 054
      // 050: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 053: athrow
      // 054: aload 3
      // 055: invokevirtual javax/swing/text/JTextComponent.copy ()V
      // 058: iload 2
      // 059: ifne 14f
      // 05c: goto 063
      // 05f: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 062: athrow
      // 063: aload 1
      // 064: invokevirtual java/awt/event/ActionEvent.getSource ()Ljava/lang/Object;
      // 067: aload 0
      // 068: getfield com/finalshell/ui/panel/CutPanel.K Ljavax/swing/JMenuItem;
      // 06b: goto 072
      // 06e: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 071: athrow
      // 072: iload 2
      // 073: ifeq 09e
      // 076: if_acmpne 08f
      // 079: goto 080
      // 07c: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 07f: athrow
      // 080: aload 3
      // 081: invokevirtual javax/swing/text/JTextComponent.paste ()V
      // 084: iload 2
      // 085: ifne 14f
      // 088: goto 08f
      // 08b: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 08e: athrow
      // 08f: aload 1
      // 090: invokevirtual java/awt/event/ActionEvent.getSource ()Ljava/lang/Object;
      // 093: aload 0
      // 094: getfield com/finalshell/ui/panel/CutPanel.P Ljavax/swing/JMenuItem;
      // 097: goto 09e
      // 09a: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 09d: athrow
      // 09e: iload 2
      // 09f: ifeq 0ca
      // 0a2: if_acmpne 0bb
      // 0a5: goto 0ac
      // 0a8: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0ab: athrow
      // 0ac: aload 3
      // 0ad: invokevirtual javax/swing/text/JTextComponent.selectAll ()V
      // 0b0: iload 2
      // 0b1: ifne 14f
      // 0b4: goto 0bb
      // 0b7: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: invokevirtual java/awt/event/ActionEvent.getSource ()Ljava/lang/Object;
      // 0bf: aload 0
      // 0c0: getfield com/finalshell/ui/panel/CutPanel.b Ljavax/swing/JMenuItem;
      // 0c3: goto 0ca
      // 0c6: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 0c9: athrow
      // 0ca: if_acmpne 14f
      // 0cd: aload 3
      // 0ce: invokevirtual javax/swing/text/JTextComponent.getDocument ()Ljavax/swing/text/Document;
      // 0d1: astore 5
      // 0d3: aload 3
      // 0d4: invokevirtual javax/swing/text/JTextComponent.getSelectionStart ()I
      // 0d7: istore 6
      // 0d9: aload 3
      // 0da: invokevirtual javax/swing/text/JTextComponent.getSelectionEnd ()I
      // 0dd: istore 7
      // 0df: aload 5
      // 0e1: iload 6
      // 0e3: invokeinterface javax/swing/text/Document.createPosition (I)Ljavax/swing/text/Position; 2
      // 0e8: astore 8
      // 0ea: aload 5
      // 0ec: iload 7
      // 0ee: invokeinterface javax/swing/text/Document.createPosition (I)Ljavax/swing/text/Position; 2
      // 0f3: astore 9
      // 0f5: aload 8
      // 0f7: iload 2
      // 0f8: ifeq 107
      // 0fb: ifnull 14a
      // 0fe: goto 105
      // 101: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 104: athrow
      // 105: aload 9
      // 107: iload 2
      // 108: ifeq 117
      // 10b: ifnull 14a
      // 10e: goto 115
      // 111: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 114: athrow
      // 115: aload 8
      // 117: invokeinterface javax/swing/text/Position.getOffset ()I 1
      // 11c: aload 9
      // 11e: invokeinterface javax/swing/text/Position.getOffset ()I 1
      // 123: if_icmpeq 14a
      // 126: aload 5
      // 128: aload 8
      // 12a: invokeinterface javax/swing/text/Position.getOffset ()I 1
      // 12f: aload 9
      // 131: invokeinterface javax/swing/text/Position.getOffset ()I 1
      // 136: aload 8
      // 138: invokeinterface javax/swing/text/Position.getOffset ()I 1
      // 13d: isub
      // 13e: invokeinterface javax/swing/text/Document.remove (II)V 3
      // 143: goto 14a
      // 146: invokestatic com/finalshell/ui/panel/CutPanel.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 149: athrow
      // 14a: goto 14f
      // 14d: astore 8
      // 14f: return
   }

   static {
      __vfClinit__();
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -4000) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 219;
               break;
            case 1:
               var10000 = 103;
               break;
            case 2:
               var10000 = 35;
               break;
            case 3:
               var10000 = 244;
               break;
            case 4:
               var10000 = 78;
               break;
            case 5:
               var10000 = 110;
               break;
            case 6:
               var10000 = 58;
               break;
            case 7:
               var10000 = 13;
               break;
            case 8:
               var10000 = 80;
               break;
            case 9:
               var10000 = 86;
               break;
            case 10:
               var10000 = 77;
               break;
            case 11:
               var10000 = 247;
               break;
            case 12:
               var10000 = 182;
               break;
            case 13:
               var10000 = 191;
               break;
            case 14:
               var10000 = 170;
               break;
            case 15:
               var10000 = 213;
               break;
            case 16:
               var10000 = 179;
               break;
            case 17:
               var10000 = 69;
               break;
            case 18:
               var10000 = 239;
               break;
            case 19:
               var10000 = 188;
               break;
            case 20:
               var10000 = 125;
               break;
            case 21:
               var10000 = 173;
               break;
            case 22:
               var10000 = 207;
               break;
            case 23:
               var10000 = 227;
               break;
            case 24:
               var10000 = 235;
               break;
            case 25:
               var10000 = 192;
               break;
            case 26:
               var10000 = 30;
               break;
            case 27:
               var10000 = 39;
               break;
            case 28:
               var10000 = 217;
               break;
            case 29:
               var10000 = 232;
               break;
            case 30:
               var10000 = 49;
               break;
            case 31:
               var10000 = 64;
               break;
            case 32:
               var10000 = 156;
               break;
            case 33:
               var10000 = 132;
               break;
            case 34:
               var10000 = 150;
               break;
            case 35:
               var10000 = 18;
               break;
            case 36:
               var10000 = 238;
               break;
            case 37:
               var10000 = 143;
               break;
            case 38:
               var10000 = 122;
               break;
            case 39:
               var10000 = 231;
               break;
            case 40:
               var10000 = 108;
               break;
            case 41:
               var10000 = 128;
               break;
            case 42:
               var10000 = 7;
               break;
            case 43:
               var10000 = 52;
               break;
            case 44:
               var10000 = 178;
               break;
            case 45:
               var10000 = 162;
               break;
            case 46:
               var10000 = 102;
               break;
            case 47:
               var10000 = 127;
               break;
            case 48:
               var10000 = 24;
               break;
            case 49:
               var10000 = 72;
               break;
            case 50:
               var10000 = 176;
               break;
            case 51:
               var10000 = 91;
               break;
            case 52:
               var10000 = 161;
               break;
            case 53:
               var10000 = 85;
               break;
            case 54:
               var10000 = 92;
               break;
            case 55:
               var10000 = 134;
               break;
            case 56:
               var10000 = 44;
               break;
            case 57:
               var10000 = 105;
               break;
            case 58:
               var10000 = 224;
               break;
            case 59:
               var10000 = 37;
               break;
            case 60:
               var10000 = 202;
               break;
            case 61:
               var10000 = 126;
               break;
            case 62:
               var10000 = 149;
               break;
            case 63:
               var10000 = 46;
               break;
            case 64:
               var10000 = 113;
               break;
            case 65:
               var10000 = 172;
               break;
            case 66:
               var10000 = 252;
               break;
            case 67:
               var10000 = 138;
               break;
            case 68:
               var10000 = 38;
               break;
            case 69:
               var10000 = 209;
               break;
            case 70:
               var10000 = 97;
               break;
            case 71:
               var10000 = 76;
               break;
            case 72:
               var10000 = 96;
               break;
            case 73:
               var10000 = 101;
               break;
            case 74:
               var10000 = 16;
               break;
            case 75:
               var10000 = 117;
               break;
            case 76:
               var10000 = 57;
               break;
            case 77:
               var10000 = 237;
               break;
            case 78:
               var10000 = 137;
               break;
            case 79:
               var10000 = 81;
               break;
            case 80:
               var10000 = 250;
               break;
            case 81:
               var10000 = 240;
               break;
            case 82:
               var10000 = 181;
               break;
            case 83:
               var10000 = 99;
               break;
            case 84:
               var10000 = 22;
               break;
            case 85:
               var10000 = 123;
               break;
            case 86:
               var10000 = 163;
               break;
            case 87:
               var10000 = 139;
               break;
            case 88:
               var10000 = 1;
               break;
            case 89:
               var10000 = 12;
               break;
            case 90:
               var10000 = 148;
               break;
            case 91:
               var10000 = 68;
               break;
            case 92:
               var10000 = 83;
               break;
            case 93:
               var10000 = 0;
               break;
            case 94:
               var10000 = 159;
               break;
            case 95:
               var10000 = 26;
               break;
            case 96:
               var10000 = 168;
               break;
            case 97:
               var10000 = 62;
               break;
            case 98:
               var10000 = 40;
               break;
            case 99:
               var10000 = 5;
               break;
            case 100:
               var10000 = 230;
               break;
            case 101:
               var10000 = 15;
               break;
            case 102:
               var10000 = 177;
               break;
            case 103:
               var10000 = 241;
               break;
            case 104:
               var10000 = 73;
               break;
            case 105:
               var10000 = 115;
               break;
            case 106:
               var10000 = 34;
               break;
            case 107:
               var10000 = 2;
               break;
            case 108:
               var10000 = 31;
               break;
            case 109:
               var10000 = 98;
               break;
            case 110:
               var10000 = 195;
               break;
            case 111:
               var10000 = 59;
               break;
            case 112:
               var10000 = 8;
               break;
            case 113:
               var10000 = 114;
               break;
            case 114:
               var10000 = 197;
               break;
            case 115:
               var10000 = 249;
               break;
            case 116:
               var10000 = 216;
               break;
            case 117:
               var10000 = 186;
               break;
            case 118:
               var10000 = 255;
               break;
            case 119:
               var10000 = 74;
               break;
            case 120:
               var10000 = 118;
               break;
            case 121:
               var10000 = 187;
               break;
            case 122:
               var10000 = 131;
               break;
            case 123:
               var10000 = 3;
               break;
            case 124:
               var10000 = 144;
               break;
            case 125:
               var10000 = 71;
               break;
            case 126:
               var10000 = 84;
               break;
            case 127:
               var10000 = 229;
               break;
            case 128:
               var10000 = 220;
               break;
            case 129:
               var10000 = 153;
               break;
            case 130:
               var10000 = 19;
               break;
            case 131:
               var10000 = 95;
               break;
            case 132:
               var10000 = 215;
               break;
            case 133:
               var10000 = 23;
               break;
            case 134:
               var10000 = 9;
               break;
            case 135:
               var10000 = 171;
               break;
            case 136:
               var10000 = 4;
               break;
            case 137:
               var10000 = 79;
               break;
            case 138:
               var10000 = 45;
               break;
            case 139:
               var10000 = 27;
               break;
            case 140:
               var10000 = 194;
               break;
            case 141:
               var10000 = 120;
               break;
            case 142:
               var10000 = 107;
               break;
            case 143:
               var10000 = 48;
               break;
            case 144:
               var10000 = 189;
               break;
            case 145:
               var10000 = 109;
               break;
            case 146:
               var10000 = 20;
               break;
            case 147:
               var10000 = 151;
               break;
            case 148:
               var10000 = 94;
               break;
            case 149:
               var10000 = 147;
               break;
            case 150:
               var10000 = 136;
               break;
            case 151:
               var10000 = 87;
               break;
            case 152:
               var10000 = 206;
               break;
            case 153:
               var10000 = 130;
               break;
            case 154:
               var10000 = 253;
               break;
            case 155:
               var10000 = 226;
               break;
            case 156:
               var10000 = 41;
               break;
            case 157:
               var10000 = 175;
               break;
            case 158:
               var10000 = 236;
               break;
            case 159:
               var10000 = 185;
               break;
            case 160:
               var10000 = 129;
               break;
            case 161:
               var10000 = 248;
               break;
            case 162:
               var10000 = 135;
               break;
            case 163:
               var10000 = 243;
               break;
            case 164:
               var10000 = 201;
               break;
            case 165:
               var10000 = 25;
               break;
            case 166:
               var10000 = 242;
               break;
            case 167:
               var10000 = 210;
               break;
            case 168:
               var10000 = 14;
               break;
            case 169:
               var10000 = 33;
               break;
            case 170:
               var10000 = 89;
               break;
            case 171:
               var10000 = 196;
               break;
            case 172:
               var10000 = 82;
               break;
            case 173:
               var10000 = 183;
               break;
            case 174:
               var10000 = 141;
               break;
            case 175:
               var10000 = 158;
               break;
            case 176:
               var10000 = 60;
               break;
            case 177:
               var10000 = 61;
               break;
            case 178:
               var10000 = 100;
               break;
            case 179:
               var10000 = 198;
               break;
            case 180:
               var10000 = 124;
               break;
            case 181:
               var10000 = 152;
               break;
            case 182:
               var10000 = 251;
               break;
            case 183:
               var10000 = 233;
               break;
            case 184:
               var10000 = 246;
               break;
            case 185:
               var10000 = 21;
               break;
            case 186:
               var10000 = 169;
               break;
            case 187:
               var10000 = 222;
               break;
            case 188:
               var10000 = 43;
               break;
            case 189:
               var10000 = 10;
               break;
            case 190:
               var10000 = 11;
               break;
            case 191:
               var10000 = 193;
               break;
            case 192:
               var10000 = 63;
               break;
            case 193:
               var10000 = 212;
               break;
            case 194:
               var10000 = 200;
               break;
            case 195:
               var10000 = 106;
               break;
            case 196:
               var10000 = 211;
               break;
            case 197:
               var10000 = 199;
               break;
            case 198:
               var10000 = 93;
               break;
            case 199:
               var10000 = 228;
               break;
            case 200:
               var10000 = 50;
               break;
            case 201:
               var10000 = 142;
               break;
            case 202:
               var10000 = 119;
               break;
            case 203:
               var10000 = 214;
               break;
            case 204:
               var10000 = 225;
               break;
            case 205:
               var10000 = 75;
               break;
            case 206:
               var10000 = 54;
               break;
            case 207:
               var10000 = 223;
               break;
            case 208:
               var10000 = 51;
               break;
            case 209:
               var10000 = 203;
               break;
            case 210:
               var10000 = 67;
               break;
            case 211:
               var10000 = 112;
               break;
            case 212:
               var10000 = 36;
               break;
            case 213:
               var10000 = 180;
               break;
            case 214:
               var10000 = 42;
               break;
            case 215:
               var10000 = 133;
               break;
            case 216:
               var10000 = 157;
               break;
            case 217:
               var10000 = 221;
               break;
            case 218:
               var10000 = 90;
               break;
            case 219:
               var10000 = 55;
               break;
            case 220:
               var10000 = 204;
               break;
            case 221:
               var10000 = 154;
               break;
            case 222:
               var10000 = 218;
               break;
            case 223:
               var10000 = 111;
               break;
            case 224:
               var10000 = 234;
               break;
            case 225:
               var10000 = 121;
               break;
            case 226:
               var10000 = 116;
               break;
            case 227:
               var10000 = 165;
               break;
            case 228:
               var10000 = 104;
               break;
            case 229:
               var10000 = 146;
               break;
            case 230:
               var10000 = 140;
               break;
            case 231:
               var10000 = 145;
               break;
            case 232:
               var10000 = 66;
               break;
            case 233:
               var10000 = 65;
               break;
            case 234:
               var10000 = 29;
               break;
            case 235:
               var10000 = 174;
               break;
            case 236:
               var10000 = 190;
               break;
            case 237:
               var10000 = 155;
               break;
            case 238:
               var10000 = 53;
               break;
            case 239:
               var10000 = 254;
               break;
            case 240:
               var10000 = 47;
               break;
            case 241:
               var10000 = 88;
               break;
            case 242:
               var10000 = 167;
               break;
            case 243:
               var10000 = 160;
               break;
            case 244:
               var10000 = 32;
               break;
            case 245:
               var10000 = 166;
               break;
            case 246:
               var10000 = 6;
               break;
            case 247:
               var10000 = 17;
               break;
            case 248:
               var10000 = 70;
               break;
            case 249:
               var10000 = 208;
               break;
            case 250:
               var10000 = 245;
               break;
            case 251:
               var10000 = 28;
               break;
            case 252:
               var10000 = 205;
               break;
            case 253:
               var10000 = 56;
               break;
            case 254:
               var10000 = 184;
               break;
            default:
               var10000 = 164;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4527;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var38;
      String[] var17 = new String[6];
      int var15 = 0;
      String var14 = "粠超\u0002剸阈\u0002奌刜\u0010;G\u0017åKÖ4µ¿S(²Ø[OH";
      int var16 = "粠超\u0002剸阈\u0002奌刜\u0010;G\u0017åKÖ4µ¿S(²Ø[OH".length();
      char var13 = 2;
      int var21 = -1;

      label70:
      while (true) {
         byte var10000 = 34;
         String var10001 = var14.substring(++var21, var21 + var13);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var45 = var10001.toCharArray();
               int var10004 = var45.length;
               int var18 = 0;
               byte var48 = var10000;
               var38 = var45;
               int var28 = var10004;
               byte var55;
               char[] var61;
               int var10006;
               if (var10004 <= 1) {
                  var61 = var45;
                  var55 = var10000;
                  var10006 = var18;
               } else {
                  var48 = var10000;
                  var28 = var10004;
                  if (var10004 <= var18) {
                     break label65;
                  }

                  var61 = var45;
                  var55 = var10000;
                  var10006 = var18;
               }

               while (true) {
                  char var70 = var61[var10006];
                  byte var71;
                  switch (var18 % 7) {
                     case 0:
                        var71 = 61;
                        break;
                     case 1:
                        var71 = 50;
                        break;
                     case 2:
                        var71 = 14;
                        break;
                     case 3:
                        var71 = 8;
                        break;
                     case 4:
                        var71 = 113;
                        break;
                     case 5:
                        var71 = 44;
                        break;
                     default:
                        var71 = 94;
                  }

                  var61[var10006] = (char)(var70 ^ var55 ^ var71);
                  var18++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var61 = var38;
                     var55 = var48;
                  } else {
                     if (var28 <= var18) {
                        break;
                     }

                     var61 = var38;
                     var55 = var48;
                     var10006 = var18;
                  }
               }
            }

            String var50 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var17[var15++] = var50;
                  if ((var21 += var13) >= var16) {
                     a = var17;
                     c = new String[6];
                     long var4 = 3407586523925465768L;
                     long[] var10 = new long[5];
                     int var7 = 0;
                     String var8 = "«ï<\u001côÃË\u008e\u001c\u0013\u0017»lY\u009e}k\u0081`Yb½\u0011r";
                     int var9 = "«ï<\u001côÃË\u008e\u001c\u0013\u0017»lY\u009e}k\u0081`Yb½\u0011r".length();
                     byte var6 = 0;

                     label44:
                     while (true) {
                        byte var30 = var6;
                        var6 += 8;
                        byte[] var11 = var8.substring(var30, var6).getBytes("ISO-8859-1");
                        long[] var23 = var10;
                        int var31 = var7++;
                        long var42 = ((long)var11[0] & 255L) << 56
                           | ((long)var11[1] & 255L) << 48
                           | ((long)var11[2] & 255L) << 40
                           | ((long)var11[3] & 255L) << 32
                           | ((long)var11[4] & 255L) << 24
                           | ((long)var11[5] & 255L) << 16
                           | ((long)var11[6] & 255L) << 8
                           | (long)var11[7] & 255L;
                        byte var51 = -1;

                        while (true) {
                           long var60 = var42 ^ var4;
                           switch (var51) {
                              case 0:
                                 var23[var31] = var60;
                                 if (var6 >= var9) {
                                    d = var10;
                                    e = new Integer[5];
                                    long var2 = 1890958937393795570L;
                                    long var44 = 1990040959123623740L ^ var2;
                                    byte var33 = -1;
                                    long var0 = var44;
                                    serialVersionUID = var0;
                                    V = null;
                                    return;
                                 }
                                 break;
                              default:
                                 var23[var31] = var60;
                                 if (var6 < var9) {
                                    continue label44;
                                 }

                                 var8 = "jN/ÇÇ³æÍy\u008eÍ\u0099cë\u0006«";
                                 var9 = "jN/ÇÇ³æÍy\u008eÍ\u0099cë\u0006«".length();
                                 var6 = 0;
                           }

                           byte var32 = var6;
                           var6 += 8;
                           var11 = var8.substring(var32, var6).getBytes("ISO-8859-1");
                           var23 = var10;
                           var31 = var7++;
                           var42 = ((long)var11[0] & 255L) << 56
                              | ((long)var11[1] & 255L) << 48
                              | ((long)var11[2] & 255L) << 40
                              | ((long)var11[3] & 255L) << 32
                              | ((long)var11[4] & 255L) << 24
                              | ((long)var11[5] & 255L) << 16
                              | ((long)var11[6] & 255L) << 8
                              | (long)var11[7] & 255L;
                           var51 = 0;
                        }
                     }
                  }

                  var13 = var14.charAt(var21);
                  break;
               default:
                  var17[var15++] = var50;
                  if ((var21 += var13) < var16) {
                     var13 = var14.charAt(var21);
                     continue label70;
                  }

                  var14 = "儜透\u0002勾剛";
                  var16 = "儜透\u0002勾剛".length();
                  var13 = 2;
                  var21 = -1;
            }

            var10000 = 82;
            var10001 = var14.substring(++var21, var21 + var13);
            var10002 = 0;
         }
      }
   }
}





